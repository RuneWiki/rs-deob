import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class191 extends class405 {

    @OriginalMember(owner = "client!je", name = "p", descriptor = "J")
    public static long field2786 = -1L;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "[I")
    public static int[] field2787 = new int[1];

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    public static int field2788;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    public static int field2789;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field2791;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "I")
    public static int field2794;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "Lmt;")
    private class517 field2792;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Ljava/lang/String;II)Ljava/lang/String;", line = 3)
    public final String method1269(String arg0, int arg1, int arg2) {
        field2793++;
        if (arg1 > -51) {
            this.field2792 = null;
        }
        if (this.field2792 == null) {
            return arg0;
        } else {
            class498 var4 = (class498) this.field2792.method3059(127, (long) arg2);
            return var4 == null ? arg0 : var4.field7389;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V", line = 24)
    public static final void method1270(int arg0) {
        field2794++;
        try {
            if (arg0 != 0) {
                method1275(-18, -61, -62);
            }
            if (class274.field4095 == 1) {
                int var1 = class111.field1697.method3102((byte) -77);
                if (var1 > 0 && class111.field1697.method3119(8)) {
                    int var2 = var1 - class148.field2242;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class111.field1697.method3105(var2, 16);
                } else {
                    class111.field1697.method3120(arg0 - 30086);
                    class111.field1697.method3127(arg0 + 114);
                    class336.field5186 = null;
                    class288.field4310 = null;
                    if (class525.field7766 == null) {
                        class274.field4095 = 0;
                    } else {
                        class274.field4095 = 2;
                    }
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class111.field1697.method3120(-30086);
            class336.field5186 = null;
            class274.field4095 = 0;
            class525.field7766 = null;
            class288.field4310 = null;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILgk;I)V", line = 69)
    private final void method1271(int arg0, class468 arg1, int arg2) {
        field2791++;
        if (arg0 != -2 || arg2 != 249) {
            return;
        }
        int var4 = arg1.method2765(64);
        if (this.field2792 == null) {
            int var5 = class143.method1039(arg0 ^ 0xFFFFFFF6, var4);
            this.field2792 = new class517(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method2765(101) == 1;
            int var8 = arg1.method2759(arg0 + 1919914866);
            class115 var9;
            if (var7) {
                var9 = new class498(arg1.method2770(-20459));
            } else {
                var9 = new class221(arg1.method2722(false));
            }
            this.field2792.method3055(0, (long) var8, var9);
        }
    }

    @OriginalMember(owner = "client!je", name = "e", descriptor = "(I)V", line = 118)
    public static void method1272(int arg0) {
        if (arg0 != -25623) {
            field2786 = 21L;
        }
        field2787 = null;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lgk;I)V", line = 129)
    public final void method1273(class468 arg0, int arg1) {
        field2790++;
        while (true) {
            int var3 = arg0.method2765(70);
            if (var3 == 0) {
                if (arg1 == -545) {
                    return;
                } else {
                    method1275(-13, -118, -69);
                    return;
                }
            }
            this.method1271(arg1 + 543, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(BII)I", line = 151)
    public final int method1274(byte arg0, int arg1, int arg2) {
        field2788++;
        if (this.field2792 == null) {
            return arg2;
        }
        class221 var4 = (class221) this.field2792.method3059(87, (long) arg1);
        if (var4 == null) {
            return arg2;
        } else if (arg0 == 46) {
            return var4.field3155;
        } else {
            return 5;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)Z", line = 177)
    public static final boolean method1275(int arg0, int arg1, int arg2) {
        if (arg1 == -545) {
            field2789++;
            return (arg0 & 0x18) != 0 | (arg0 & 0x220) == 544;
        } else {
            return false;
        }
    }
}
