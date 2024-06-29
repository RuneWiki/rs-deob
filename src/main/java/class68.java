import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class68 extends class182 {

    @OriginalMember(owner = "client!jk", name = "ab", descriptor = "I")
    private int field1150 = 3216;

    @OriginalMember(owner = "client!jk", name = "V", descriptor = "I")
    private int field1145 = 4096;

    @OriginalMember(owner = "client!jk", name = "bb", descriptor = "I")
    private int field1151 = 3216;

    @OriginalMember(owner = "client!jk", name = "cb", descriptor = "[I")
    private int[] field1152 = new int[3];

    @OriginalMember(owner = "client!jk", name = "U", descriptor = "I")
    public static int field1144 = -1;

    @OriginalMember(owner = "client!jk", name = "S", descriptor = "Z")
    public static boolean field1142 = true;

    @OriginalMember(owner = "client!jk", name = "Y", descriptor = "I")
    public static int field1148 = (int) (17.0D * Math.random()) + -8;

    @OriginalMember(owner = "client!jk", name = "Z", descriptor = "[J")
    public static long[] field1149 = new long[500];

    @OriginalMember(owner = "client!jk", name = "T", descriptor = "Ljg;")
    public static class42 field1143 = new class42(64);

    @OriginalMember(owner = "client!jk", name = "eb", descriptor = "I")
    public static int field1154 = 0;

    @OriginalMember(owner = "client!jk", name = "O", descriptor = "I")
    public static int field1138;

    @OriginalMember(owner = "client!jk", name = "Q", descriptor = "I")
    public static int field1140;

    @OriginalMember(owner = "client!jk", name = "R", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!jk", name = "W", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!jk", name = "X", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!jk", name = "db", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!jk", name = "P", descriptor = "[[B")
    public static byte[][] field1139;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "(III)Lr;")
    public static final class23 method465(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1498[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class23 var4 = var3.field2805;
            var3.field2805 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(BIZIII)V")
    public static final void method466(byte arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        ++class147.field2427;
        if (class16.field314 != null && class16.field314.field715 + (-(class16.field314.method294((byte) -105) * 64) - -64) >> 7 == class133.field2194 && ~(class16.field314.field771 - -64 - class16.field314.method294((byte) -128) * 64 >> 7) == ~class163.field2661) {
            class130.field2149 = false;
            class133.field2194 = 0;
        }
        ++field1140;
        class195.method1392(false);
        if (!arg2) {
            class26.method169(127);
        }
        class201.method1416(-6150);
        if (arg0 > -93) {
            method466((byte) 100, -42, false, -92, 68, -37);
        }
        class139.field2271 = arg1;
        class139.field2281 = arg5;
        if (~class169.field2739 == -2) {
            int var6 = (int) class187.field2993;
            if (~var6 > ~(class163.field2644 / 256)) {
                var6 = class163.field2644 / 256;
            }
            if (class71.field1210[4] && class219.field3699[4] + 128 > var6) {
                var6 = class219.field3699[4] + 128;
            }
            int var7 = 2047 & (int) class265.field4432 + class17.field338;
            class16.method91(-50 + class277.method1939(class182.field2898, class16.field314.field715, class16.field314.field771, (byte) -34), var6, arg3, var6 * 3 + 600, (byte) -88, class100.field1592, class127.field2115, var7);
        } else if (class169.field2739 == 4) {
            int var8 = (int) class187.field2993;
            if (~var8 > ~(class163.field2644 / 256)) {
                var8 = class163.field2644 / 256;
            }
            if (class71.field1210[4] && ~var8 > ~(class219.field3699[4] + 128)) {
                var8 = class219.field3699[4] + 128;
            }
            int var9 = 2047 & (int) class265.field4432;
            class16.method91(-50 + class277.method1939(class182.field2898, class138.field2264, class54.field958, (byte) -34), var8, arg3, 600 - -(var8 * 3), (byte) -116, class100.field1592, class127.field2115, var9);
        } else if (~class169.field2739 == -6) {
            class174.method1283(arg3, (byte) -105);
        }
        int var10 = class183.field2926;
        int var11 = class76.field1302;
        int var12 = class107.field1758;
        int var13 = class245.field4102;
        int var14 = class263.field4393;
        for (int var15 = 0; var15 < 5; ++var15) {
            if (class71.field1210[var15]) {
                int var22 = (int) ((double) (-class206.field3314[var15]) + Math.random() * (double) (class206.field3314[var15] * 2 + 1) + Math.sin((double) class254.field4314[var15] / 100.0D * (double) class203.field3254[var15]) * (double) class219.field3699[var15]);
                if (~var15 == -5) {
                    class183.field2926 += var22;
                    if (~class183.field2926 > -129) {
                        class183.field2926 = 128;
                    }
                    if (~class183.field2926 < -384) {
                        class183.field2926 = 383;
                    }
                }
                if (~var15 == -3) {
                    class76.field1302 += var22;
                }
                if (~var15 == -1) {
                    class107.field1758 += var22;
                }
                if (~var15 == -4) {
                    class245.field4102 = class245.field4102 - -var22 & 2047;
                }
                if (var15 == 1) {
                    class263.field4393 += var22;
                }
            }
        }
        class284.method1976((byte) -35);
        class211.method1488(arg5, arg1, arg4 + arg5, arg1 - -arg3);
        class128.method948();
        if (class183.field2927 >= 0) {
            class14 var16 = class151.method1125(class146.field2412, class259.field4356, class183.field2927, class261.field4379, 4);
            var16.method81(class116.field1980, arg5, arg1, arg4, arg3, class183.field2926, class245.field4102, 0);
        } else {
            class211.method1483(arg5, arg1, arg4, arg3, 0);
        }
        if (!class259.field4360 && class289.field4764 >= arg5 && ~class289.field4764 > ~(arg5 - -arg4) && class115.field1959 >= arg1 && ~class115.field1959 > ~(arg1 + arg3)) {
            class218.field3681 = 0;
            class314.field5063 = true;
            int var17 = class116.field1977;
            int var18 = class293.field4825;
            class23.field420 = true;
            int var19 = class311.field5014;
            class120.field2007 = (-arg5 + class289.field4764) * (-var18 + var17) / arg4 + var18;
            int var20 = class40.field605;
            class49.field841 = (-arg1 + class115.field1959) * (-var19 + var20) / arg3 + var19;
        } else {
            class23.field420 = false;
            class314.field5063 = true;
            class218.field3681 = 0;
        }
        class159.method1187(-659813974);
        byte var21 = ~client.method721(false) == -3 ? (byte) class147.field2427 : 1;
        class110.method824(class107.field1758, class263.field4393, class76.field1302, class183.field2926, class245.field4102, class161.field2621, class286.field4737, class28.field480, class149.field2462, class25.field454, class94.field1536, class182.field2898 + 1, var21, class16.field314.field715 >> 7, class16.field314.field771 >> 7);
        class159.method1187(-659813974);
        class27.method176();
        class71.method498(arg3, arg5, 256, arg1, arg4, 256, 14108);
        class64.method437(arg4, 256, arg3, arg1, 256, arg5, (byte) -106);
        ((class185) class128.field2136).method1338(class19.field356, -29018);
        class273.method1923(arg1, arg4, arg3, arg5, (byte) -37);
        class183.field2926 = var10;
        class76.field1302 = var11;
        class107.field1758 = var12;
        class263.field4393 = var14;
        class245.field4102 = var13;
        if (class49.field839 && class277.field4611.method1535(20) == 0) {
            class49.field839 = false;
        }
        if (class49.field839) {
            class211.method1483(arg5, arg1, arg4, arg3, 0);
            class44.method260(false, class5.field127, (byte) 16);
        }
        if (!arg2 && !class49.field839 && !class259.field4360 && ~class289.field4764 <= ~arg5 && ~class289.field4764 > ~(arg4 + arg5) && arg1 <= class115.field1959 && ~class115.field1959 > ~(arg1 + arg3)) {
            class31.method199(class289.field4764, arg1, arg4, arg5, class115.field1959, (byte) 89, arg3);
        }
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V")
    public class68() {
        super(1, true);
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
    private final void method467(byte arg0) {
        ++field1138;
        int var2 = 60 % ((20 - arg0) / 43);
        double var3 = Math.cos((double) ((float) this.field1150 / 4096.0F));
        this.field1152[0] = (int) (4096.0D * var3 * Math.sin((double) ((float) this.field1151 / 4096.0F)));
        this.field1152[1] = (int) (4096.0D * var3 * Math.cos((double) ((float) this.field1151 / 4096.0F)));
        this.field1152[2] = (int) (4096.0D * Math.sin((double) ((float) this.field1150 / 4096.0F)));
        int var5 = this.field1152[0] * this.field1152[0] >> 12;
        int var6 = this.field1152[2] * this.field1152[2] >> 12;
        int var7 = this.field1152[1] * this.field1152[1] >> 12;
        int var8 = (int) (4096.0D * Math.sqrt((double) (var5 - -var7 + var6 >> 12)));
        if (~var8 != -1) {
            this.field1152[1] = (this.field1152[1] << 12) / var8;
            this.field1152[0] = (this.field1152[0] << 12) / var8;
            this.field1152[2] = (this.field1152[2] << 12) / var8;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (!arg0) {
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (arg2 == 2) {
                        this.field1150 = arg1.method1821((byte) 51);
                    }
                } else {
                    this.field1151 = arg1.method1821((byte) 51);
                }
            } else {
                this.field1145 = arg1.method1821((byte) 51);
            }
            ++field1153;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIZIIB)V")
    public static final void method468(int arg0, int arg1, boolean arg2, int arg3, int arg4, byte arg5) {
        if (~arg0 > -2) {
            arg0 = 1;
        }
        if (arg5 > -22) {
            field1144 = -124;
        }
        class294.field4826 = (short) arg0;
        if (~arg1 > -2) {
            arg1 = 1;
        }
        class210.field3545 = (short) arg1;
        ++field1146;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        ++field1147;
        if (arg0) {
            return null;
        } else {
            int[] var3 = super.field2911.method77(arg1, -101);
            if (super.field2911.field287) {
                int var4 = class109.field1802 * this.field1145 >> 12;
                int[] var5 = this.method1323(0, -17707, arg1 - 1 & class107.field1749);
                int[] var6 = this.method1323(0, -17707, arg1);
                int[] var7 = this.method1323(0, -17707, arg1 - -1 & class107.field1749);
                for (int var8 = 0; ~class4.field116 < ~var8; ++var8) {
                    int var9 = (var7[var8] + -var5[var8]) * var4 >> 12;
                    int var10 = var9 >> 4;
                    if (~var10 > -1) {
                        var10 = -var10;
                    }
                    int var11 = (var6[class103.field1644 & var8 + -1] + -var6[class103.field1644 & var8 - -1]) * var4 >> 12;
                    int var12 = var11 >> 4;
                    if (var10 > 255) {
                        var10 = 255;
                    }
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    if (~var12 < -256) {
                        var12 = 255;
                    }
                    int var13 = 255 & class284.field4704[((var10 + 1) * var10 >> 1) + var12];
                    int var14 = var11 * var13 >> 8;
                    int var15 = this.field1152[0] * var14 >> 12;
                    int var16 = var9 * var13 >> 8;
                    int var17 = var13 * 4096 >> 8;
                    int var18 = this.field1152[1] * var16 >> 12;
                    int var19 = this.field1152[2] * var17 >> 12;
                    var3[var8] = var18 + var19 + var15;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "(I)V")
    public final void method469(int arg0) {
        this.method467((byte) -111);
        ++field1141;
        if (arg0 != -1) {
            this.method469(-94);
        }
    }

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "(I)V")
    public static void method470(int arg0) {
        field1149 = null;
        if (arg0 != -9123) {
            field1148 = -51;
        }
        field1143 = null;
        field1139 = null;
    }
}
