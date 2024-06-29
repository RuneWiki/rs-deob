import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class184 {

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[I")
    public static int[] field2771 = new int[1000];

    @OriginalMember(owner = "client!aj", name = "k", descriptor = "I")
    public static int field2776;

    @OriginalMember(owner = "client!aj", name = "j", descriptor = "Lwl;")
    public static class452 field2775;

    @OriginalMember(owner = "client!aj", name = "l", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field2769;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "I")
    public static int field2773;

    @OriginalMember(owner = "client!aj", name = "i", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "[Lkr;")
    public static class234[] field2767;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(Lfh;IB)Ljava/lang/String;")
    public static final String method1121(class170 arg0, int arg1, byte arg2) {
        field2766++;
        if (!client.method2796(arg0).method1904(arg1, 36) && arg0.field2547 == null) {
            return null;
        } else if (arg2 >= 0) {
            return null;
        } else if (arg0.field2575 == null || arg0.field2575.length <= arg1 || arg0.field2575[arg1] == null || arg0.field2575[arg1].trim().length() == 0) {
            return class120.field1586 ? "Hidden-" + arg1 : null;
        } else {
            return arg0.field2575[arg1];
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B[S[Ljava/lang/String;)V")
    public static final void method1122(byte arg0, short[] arg1, String[] arg2) {
        if (arg0 == 53) {
            field2773++;
            class148.method923(0, (byte) -53, arg1, arg2.length - 1, arg2);
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B)V")
    public static final void method1123(byte arg0) {
        if (arg0 > 31) {
            class251.field3762.method1482((byte) -98);
            field2770++;
            class446.field6580.method1482((byte) -112);
        }
    }

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "(B)V")
    public static final void method1124(byte arg0) {
        field2774++;
        if (arg0 <= 24) {
            return;
        }
        int var1 = class113.method684(1);
        if (var1 == 0) {
            class75.field1016 = null;
            class380.method2289(-128, 0);
        } else if (var1 == 1) {
            class137.method864(16384, (byte) 0);
            class380.method2289(-86, 512);
            if (class341.field5085 != null) {
                class286.method1771(17895);
            }
        } else {
            class137.method864(16384, (byte) (class267.field4078 - 4 & 0xFF));
            class380.method2289(-53, 2);
        }
        class160.field2211 = class143.field1911;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(B[B)Lmb;")
    public static final class201 method1125(byte arg0, byte[] arg1) {
        field2768++;
        class201 var2 = new class201();
        class385 var3 = new class385(arg1);
        var3.field5666 = var3.field5685.length - 2;
        int var4 = var3.method2323(-121);
        int var5 = var3.field5685.length - var4 - 2 - 12;
        var3.field5666 = var5;
        int var6 = var3.method2354(255);
        var2.field3022 = var3.method2323(-43);
        var2.field3029 = var3.method2323(-26);
        var2.field3018 = var3.method2323(-63);
        var2.field3020 = var3.method2323(-45);
        int var7 = var3.method2343(255);
        if (var7 > 0) {
            var2.field3026 = new class382[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2323(-57);
                class382 var10 = new class382(class196.method1174(52, var9));
                var2.field3026[var8] = var10;
                while ((var9--) > 0) {
                    int var11 = var3.method2354(255);
                    int var12 = var3.method2354(255);
                    var10.method2301(40, new class350(var12), (long) var11);
                }
            }
        }
        if (arg0 >= -120) {
            field2776 = 55;
        }
        var3.field5666 = 0;
        var2.field3025 = var3.method2320(-5485);
        var2.field3023 = new int[var6];
        var2.field3033 = new int[var6];
        var2.field3024 = new String[var6];
        int var13 = 0;
        while (var5 > var3.field5666) {
            int var14 = var3.method2323(-19);
            if (var14 == 3) {
                var2.field3024[var13] = var3.method2332(67).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field3023[var13] = var3.method2343(255);
            } else {
                var2.field3023[var13] = var3.method2354(255);
            }
            var2.field3033[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(II)Ljn;")
    public static final class357 method1126(int arg0, int arg1) {
        field2769++;
        class357 var2 = (class357) class280.field4291.method927((long) arg0, -114);
        if (arg1 != 8723) {
            return null;
        } else if (var2 == null) {
            byte[] var3;
            if (arg0 < 32768) {
                var3 = class26.field329.method823(0, -20334, arg0);
            } else {
                var3 = class380.field5549.method823(0, -20334, arg0 & 0x7FFF);
            }
            class357 var4 = new class357();
            if (var3 != null) {
                var4.method2146(new class385(var3), 111);
            }
            if (arg0 >= 32768) {
                var4.method2139(103);
            }
            class280.field4291.method929((long) arg0, var4, false);
            return var4;
        } else {
            return var2;
        }
    }

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "(B)V")
    public static void method1127(byte arg0) {
        if (arg0 <= 122) {
            field2776 = -114;
        }
        field2775 = null;
        field2767 = null;
        field2771 = null;
    }

    static {
        new class151("Sending request to leave channel...", "Chatraum wird verlassen...", "Envoi de la demande de sortie du canal...", "Enviando solicitação para deixar o canal...");
        field2776 = 0;
        field2775 = new class452(58, -1);
        field2777 = 0;
    }
}
