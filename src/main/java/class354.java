import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rj")
public class class354 extends class366 {

    @OriginalMember(owner = "client!rj", name = "J", descriptor = "[I")
    public static int[] field5136 = new int[14];

    @OriginalMember(owner = "client!rj", name = "B", descriptor = "I")
    public static int field5129;

    @OriginalMember(owner = "client!rj", name = "C", descriptor = "I")
    public static int field5130;

    @OriginalMember(owner = "client!rj", name = "D", descriptor = "I")
    public static int field5131;

    @OriginalMember(owner = "client!rj", name = "F", descriptor = "I")
    public static int field5133;

    @OriginalMember(owner = "client!rj", name = "H", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!rj", name = "I", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!rj", name = "K", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!rj", name = "E", descriptor = "Ldj;")
    private class191 field5132;

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(IBI)I")
    public final int method2314(int arg0, byte arg1, int arg2) {
        field5129++;
        if (this.field5132 == null) {
            return arg2;
        }
        class24 var4 = (class24) this.field5132.method1373((long) arg0, 127);
        if (var4 == null) {
            return arg2;
        } else {
            if (arg1 != -6) {
                method2317(false, 28);
            }
            return var4.field299;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ILjava/lang/String;B)Ljava/lang/String;")
    public final String method2315(int arg0, String arg1, byte arg2) {
        field5131++;
        if (arg2 > -2) {
            this.method2315(-92, (String) null, (byte) 112);
        }
        if (this.field5132 == null) {
            return arg1;
        } else {
            class309 var4 = (class309) this.field5132.method1373((long) arg0, -105);
            return var4 == null ? arg1 : var4.field4493;
        }
    }

    @OriginalMember(owner = "client!rj", name = "d", descriptor = "(B)V")
    public static void method2316(byte arg0) {
        field5136 = null;
        if (arg0 < 70) {
            field5136 = null;
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZI)V")
    public static final void method2317(boolean arg0, int arg1) {
        field5130++;
        byte var2;
        byte[][] var3;
        if (arg0) {
            var3 = class295.field4271;
            var2 = 1;
        } else {
            var2 = 4;
            var3 = class75.field991;
        }
        for (int var4 = arg1; var4 < var2; var4++) {
            class127.method769(0);
            for (int var5 = 0; var5 < class80.field1034 >> 3; var5++) {
                for (int var6 = 0; var6 < (class381.field5414 >> 3); var6++) {
                    int var7 = class366.field5241[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x313F66C) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = (var7 & 0x6) >> 1;
                            int var10 = (var7 & 0xFFCDE3) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class199.field2844.length; var13++) {
                                if (class199.field2844[var13] == var12 && var3[var13] != null) {
                                    class423.method2652(var8, var6 * 8, (var10 & 0x7) * 8, class85.field1090, var4, var5 * 8, var3[var13], class59.field786, (var11 & 0x7) * 8, (byte) -41, arg0, var9);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(ZLlf;I)V")
    private final void method2318(boolean arg0, class130 arg1, int arg2) {
        field5137++;
        if (arg0) {
            this.method2318(true, (class130) null, -13);
        }
        if (arg2 != 249) {
            return;
        }
        int var4 = arg1.method837(!arg0);
        if (this.field5132 == null) {
            int var5 = class258.method1787(-128, var4);
            this.field5132 = new class191(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg1.method837(!arg0) == 1;
            int var8 = arg1.method839((byte) -92);
            class425 var9;
            if (var7) {
                var9 = new class309(arg1.method843(-87));
            } else {
                var9 = new class24(arg1.method815(true));
            }
            this.field5132.method1376(var9, (long) var8, 88);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Llf;I)V")
    public final void method2319(class130 arg0, int arg1) {
        int var3 = 86 / ((arg1 + 27) / 57);
        while (true) {
            int var4 = arg0.method837(true);
            if (var4 == 0) {
                field5133++;
                return;
            }
            this.method2318(false, arg0, var4);
        }
    }

    @OriginalMember(owner = "client!rj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method2320(String arg0, int arg1, String arg2, String arg3) {
        if (arg1 != -1) {
            field5136 = null;
        }
        field5134++;
        for (int var4 = arg3.indexOf(arg0); var4 != -1; var4 = arg3.indexOf(arg0, var4 + arg2.length())) {
            arg3 = arg3.substring(0, var4) + arg2 + arg3.substring(var4 + arg0.length());
        }
        return arg3;
    }
}
