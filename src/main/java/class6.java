import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ae")
public class class6 extends class121 {

    @OriginalMember(owner = "client!ae", name = "ob", descriptor = "I")
    private int field192 = 0;

    @OriginalMember(owner = "client!ae", name = "fb", descriptor = "Lhe;")
    public static class54 field183 = method58("Hidden)2use", false);

    @OriginalMember(owner = "client!ae", name = "ib", descriptor = "Lhe;")
    public static class54 field186 = method58("(U0a )2 in: ", false);

    @OriginalMember(owner = "client!ae", name = "ub", descriptor = "Lhe;")
    private static class54 field198 = method58("Prepared sound engine", false);

    @OriginalMember(owner = "client!ae", name = "rb", descriptor = "Lhe;")
    public static class54 field195 = method58("::", false);

    @OriginalMember(owner = "client!ae", name = "cb", descriptor = "Lhe;")
    public static class54 field180 = method58("mn", false);

    @OriginalMember(owner = "client!ae", name = "db", descriptor = "[Z")
    public static boolean[] field181 = new boolean[5];

    @OriginalMember(owner = "client!ae", name = "jb", descriptor = "[I")
    public static int[] field187 = new int[256];

    @OriginalMember(owner = "client!ae", name = "ab", descriptor = "Lhe;")
    public static class54 field178 = field198;

    @OriginalMember(owner = "client!ae", name = "zb", descriptor = "Lhe;")
    private static class54 field203 = method58("To play on this world move to a free area first", false);

    @OriginalMember(owner = "client!ae", name = "gb", descriptor = "I")
    public static int field184 = 0;

    @OriginalMember(owner = "client!ae", name = "X", descriptor = "Lhe;")
    public static class54 field175 = method58("Verbinde mit Server)3)3)3", false);

    @OriginalMember(owner = "client!ae", name = "pb", descriptor = "[I")
    public static int[] field193 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!ae", name = "yb", descriptor = "Lhe;")
    public static class54 field202 = field203;

    @OriginalMember(owner = "client!ae", name = "Y", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ae", name = "Z", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ae", name = "eb", descriptor = "I")
    public int field182;

    @OriginalMember(owner = "client!ae", name = "kb", descriptor = "I")
    public static int field188;

    @OriginalMember(owner = "client!ae", name = "lb", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!ae", name = "mb", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!ae", name = "nb", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ae", name = "qb", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!ae", name = "sb", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!ae", name = "tb", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!ae", name = "vb", descriptor = "I")
    public static int field199;

    @OriginalMember(owner = "client!ae", name = "wb", descriptor = "I")
    public int field200;

    @OriginalMember(owner = "client!ae", name = "xb", descriptor = "I")
    public int field201;

    @OriginalMember(owner = "client!ae", name = "Ab", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!ae", name = "Bb", descriptor = "I")
    public static int field205;

    @OriginalMember(owner = "client!ae", name = "hb", descriptor = "Lqb;")
    public static class113 field185;

    @OriginalMember(owner = "client!ae", name = "bb", descriptor = "Lnc;")
    public static class93 field179;

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IZILef;Lef;)Lpc;")
    public static final class107 method53(int arg0, boolean arg1, int arg2, class35 arg3, class35 arg4) {
        boolean var5 = true;
        int[] var6 = arg4.method270(59, arg0);
        if (arg2 >= -23) {
            field175 = null;
        }
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg4.method259(var6[var7], (byte) -78, arg0);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[1] & 0xFF | (var8[0] & 0xFF) << 8;
                byte[] var10;
                if (arg1) {
                    var10 = arg3.method259(var9, (byte) -121, 0);
                } else {
                    var10 = arg3.method259(0, (byte) -103, var9);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        field188++;
        if (!var5) {
            return null;
        }
        try {
            return new class107(arg4, arg3, arg0, arg1);
        } catch (Exception var11) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Lnc;Z)Lnc;")
    public static final class93 method54(class93 arg0, boolean arg1) {
        field189++;
        int var2 = class99.method790(arg1, class105.method810(arg0, -22389));
        if (var2 == 0) {
            return null;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            arg0 = class121.method938(arg1, arg0.field2284);
            if (arg0 == null) {
                return null;
            }
        }
        if (!arg1) {
            field186 = null;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(ILm;I)V")
    public final void method55(int arg0, class83 arg1, int arg2) {
        while (true) {
            int var4 = arg1.method638(arg2 + 13998);
            if (var4 == 0) {
                if (arg2 != -13998) {
                    return;
                }
                field199++;
                return;
            }
            this.method60(-120, var4, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!ae", name = "c", descriptor = "(Z)V")
    public static void method56(boolean arg0) {
        field183 = null;
        field175 = null;
        field180 = null;
        field195 = null;
        field202 = null;
        field186 = null;
        if (arg0) {
            return;
        }
        field185 = null;
        field178 = null;
        field193 = null;
        field203 = null;
        field181 = null;
        field179 = null;
        field198 = null;
        field187 = null;
    }

    @OriginalMember(owner = "client!ae", name = "b", descriptor = "(B)V")
    public static final void method57(byte arg0) {
        while (true) {
            if (class40.field1044.method452((byte) 24, class128.field2890) >= 27) {
                int var1 = class40.field1044.method456(-1432215741, 15);
                if (var1 != 32767) {
                    boolean var2 = false;
                    if (class111.field2679[var1] == null) {
                        class111.field2679[var1] = new class120();
                        var2 = true;
                    }
                    class120 var3 = class111.field2679[var1];
                    class58.field1480[class158.field3598++] = var1;
                    var3.field960 = class4.field138;
                    int var4 = class40.field1044.method456(-1432215741, 5);
                    if (var4 > 15) {
                        var4 -= 32;
                    }
                    var3.field2788 = class139.method1078(-91, class40.field1044.method456(-1432215741, 14));
                    int var5 = class40.field1044.method456(-1432215741, 1);
                    if (var5 == 1) {
                        class89.field2193[class21.field579++] = var1;
                    }
                    int var6 = class40.field1044.method456(-1432215741, 1);
                    int var7 = class66.field1603[class40.field1044.method456(arg0 ^ 0x555DE08C, 3)];
                    if (var2) {
                        var3.field921 = var3.field923 = var7;
                    }
                    int var8 = class40.field1044.method456(-1432215741, 5);
                    var3.field973 = var3.field2788.field282;
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    var3.field950 = var3.field2788.field261;
                    var3.field941 = var3.field2788.field298;
                    var3.field967 = var3.field2788.field254;
                    var3.field976 = var3.field2788.field262;
                    if (var3.field941 == 0) {
                        var3.field923 = 0;
                    }
                    var3.field954 = var3.field2788.field268;
                    var3.field955 = var3.field2788.field257;
                    var3.field969 = var3.field2788.field286;
                    var3.field948 = var3.field2788.field252;
                    var3.method288(class108.field2639.field952[0] + var8, var6 == 1, 128, class108.field2639.field951[0] + var4);
                    continue;
                }
            }
            field205++;
            if (arg0 != -49) {
                field180 = null;
            }
            class40.field1044.method464((byte) -68);
            return;
        }
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(Ljava/lang/String;Z)Lhe;")
    public static final class54 method58(String arg0, boolean arg1) {
        field191++;
        byte[] var2 = arg0.getBytes();
        int var3 = var2.length;
        class54 var4 = new class54();
        int var5 = 0;
        if (arg1) {
            return null;
        }
        var4.field1323 = new byte[var3];
        while (var3 > var5) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var5 >= var3) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field1323[var4.field1325++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field1323[var4.field1325++] = (byte) var6;
            }
        }
        var4.method410(0);
        return var4.method407(true);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BI)V")
    private final void method59(byte arg0, int arg1) {
        field204++;
        double var3 = (double) (arg1 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var9 = var5;
        if (var7 < var5) {
            var9 = var7;
        }
        double var11 = var5;
        double var13 = 0.0D;
        if (var5 < var7) {
            var11 = var7;
        }
        if (var3 < var9) {
            var9 = var3;
        }
        if (var11 < var3) {
            var11 = var3;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        this.field194 = (int) (var17 * 256.0D);
        if (var9 != var11) {
            if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9);
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (-var9 + var11) + 2.0D;
            } else if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9) + 4.0D;
            }
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
        }
        if (var17 > 0.5D) {
            this.field200 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field200 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field194 < 0) {
            this.field194 = 0;
        } else if (this.field194 > 255) {
            this.field194 = 255;
        }
        double var19 = var13 / 6.0D;
        if (this.field200 < 1) {
            this.field200 = 1;
        }
        this.field201 = (int) ((double) this.field200 * var19);
        this.field182 = (int) (var15 * 256.0D);
        if (this.field182 < 0) {
            this.field182 = 0;
        } else if (this.field182 > 255) {
            this.field182 = 255;
        }
        int var21 = -105 / ((arg0 - 57) / 42);
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(IILm;I)V")
    private final void method60(int arg0, int arg1, class83 arg2, int arg3) {
        if (arg0 > -112) {
            this.method59((byte) -44, -45);
        }
        if (arg1 == 1) {
            this.field192 = arg2.method670(false);
        }
        field196++;
    }

    @OriginalMember(owner = "client!ae", name = "a", descriptor = "(BIIIII)V")
    public static final void method61(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class13.field368[0].method161(arg3, arg4);
        class13.field368[1].method161(arg3, arg4 + arg5 - 16);
        class90.method710(arg3, arg4 + 16, 16, arg5 - 32, class82.field2011);
        int var6 = (arg5 - 32) * arg5 / arg2;
        if (var6 < 8) {
            var6 = 8;
        }
        field190++;
        int var7 = (arg5 - var6 - 32) * arg1 / (arg2 - arg5);
        class90.method710(arg3, arg4 + var7 + 16, 16, var6, class31.field777);
        if (arg0 > -110) {
            return;
        }
        class90.method716(arg3, var7 + arg4 + 16, var6, class130.field2933);
        class90.method716(arg3 + 1, arg4 - (-var7 + -16), var6, class130.field2933);
        class90.method727(arg3, arg4 + var7 + 16, 16, class130.field2933);
        class90.method727(arg3, arg4 + var7 + 17, 16, class130.field2933);
        class90.method716(arg3 + 15, 16 - -var7 + arg4, var6, class14.field413);
        class90.method716(arg3 + 14, arg4 - -var7 + 17, var6 - 1, class14.field413);
        class90.method727(arg3, arg4 + var7 + var6 + 15, 16, class14.field413);
        class90.method727(arg3 + 1, arg4 + var7 + var6 + 14, 15, class14.field413);
    }

    @OriginalMember(owner = "client!ae", name = "d", descriptor = "(I)V")
    public final void method62(int arg0) {
        this.method59((byte) 126, this.field192);
        if (arg0 != 23864) {
            this.method60(-4, 56, null, 56);
        }
        field176++;
    }
}
