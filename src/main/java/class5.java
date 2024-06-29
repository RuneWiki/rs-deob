import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ps")
public class class5 {

    @OriginalMember(owner = "client!ps", name = "d", descriptor = "Lvh;")
    public static class125 field45 = new class125(60, 8);

    @OriginalMember(owner = "client!ps", name = "e", descriptor = "Lsi;")
    public static class684 field46 = new class684(8);

    @OriginalMember(owner = "client!ps", name = "c", descriptor = "F")
    public static float field44;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!ps", name = "b", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!ps", name = "f", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(BZIIII)V")
    public static final void method22(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        field43++;
        if (class541.field7946 == null) {
            class637.field9048.method792(arg4, (byte) -88, arg3, arg2, -16777216, arg5);
        } else if (class103.field1708.field3155 >= 0 && class103.field1708.field3155 < (class430.field6136 * 512) && class103.field1708.field3154 >= 0 && class580.field8504 * 512 > class103.field1708.field3154) {
            client.field1377++;
            if (class103.field1708 != null && class103.field1708.field3155 - ((class103.field1708.method1108(92) - 1) * 256) >> 9 == class400.field5777 && class103.field1708.field3154 - (class103.field1708.method1108(112) - 1) * 256 >> 9 == class202.field3126) {
                class202.field3126 = -1;
                class400.field5777 = -1;
                class74.method600(18);
            }
            class464.method2687(2);
            if (!arg1) {
                class374.method2233((byte) -93);
            }
            class101.method841((byte) -99);
            class301.method1851(arg2, arg3, arg4, arg5, -5282, true);
            int var6 = class327.field4551;
            int var7 = class134.field2164;
            int var8 = class344.field4829;
            if (arg0 <= -33) {
                int var9 = class419.field5956;
                if (class40.field544 == 1) {
                    int var12 = (int) class636.field9031;
                    if (class487.field6964 >> 8 > var12) {
                        var12 = class487.field6964 >> 8;
                    }
                    if (class73.field1162[4] && (class528.field7759[4] + 128) > var12) {
                        var12 = class528.field7759[4] + 128;
                    }
                    int var13 = (int) class473.field6790 + class137.field2215 & 0x3FFF;
                    class211.method1446((byte) 69, var13, var6, class603.method3433(class103.field1708.field3154, class416.field5926, class103.field1708.field3155, -43) - 200, (var12 >> 3) * 3 + 600 << 2, var12, class392.field5704, class606.field8728);
                } else if (class40.field544 == 4) {
                    int var10 = (int) class636.field9031;
                    if (var10 < (class487.field6964 >> 8)) {
                        var10 = class487.field6964 >> 8;
                    }
                    if (class73.field1162[4] && class528.field7759[4] + 128 > var10) {
                        var10 = class528.field7759[4] + 128;
                    }
                    int var11 = (int) class473.field6790 & 0x3FFF;
                    class211.method1446((byte) 114, var11, var6, class603.method3433(class108.field1761, class416.field5926, class386.field5659, -127) - 200, (var10 >> 3) * 3 + 600 << 2, var10, class392.field5704, class606.field8728);
                } else if (class40.field544 == 5) {
                    class57.method491(var6, true);
                }
                int var14 = class551.field8078;
                int var15 = class277.field3933;
                int var16 = class322.field4478;
                int var17 = class666.field9366;
                int var18 = class432.field6220;
                for (int var19 = 0; var19 < 5; var19++) {
                    if (class73.field1162[var19]) {
                        int var22 = (int) ((double) (-class196.field3071[var19]) + Math.random() * (double) (class196.field3071[var19] * 2 + 1) + Math.sin((double) class325.field4528[var19] / 100.0D * (double) class557.field8147[var19]) * (double) class528.field7759[var19]);
                        if (var19 == 4) {
                            class666.field9366 += var22;
                            if (class666.field9366 < 1024) {
                                class666.field9366 = 1024;
                            } else if (class666.field9366 > 3072) {
                                class666.field9366 = 3072;
                            }
                        }
                        if (var19 == 1) {
                            class277.field3933 += var22 << 2;
                        }
                        if (var19 == 2) {
                            class322.field4478 += var22 << 2;
                        }
                        if (var19 == 3) {
                            class432.field6220 = class432.field6220 + var22 & 0x3FFF;
                        }
                        if (var19 == 0) {
                            class551.field8078 += var22 << 2;
                        }
                    }
                }
                if (class551.field8078 < 0) {
                    class551.field8078 = 0;
                }
                if (class322.field4478 < 0) {
                    class322.field4478 = 0;
                }
                if (class551.field8078 > (class33.field474 << 9) - 1) {
                    class551.field8078 = (class33.field474 << 9) - 1;
                }
                if ((class687.field9758 << 9) - 1 < class322.field4478) {
                    class322.field4478 = (class687.field9758 << 9) - 1;
                }
                class51.method409((byte) -111);
                class126.method1000(-6648);
                class637.field9048.method771(var7, var8, var7 + var9, var8 - -var6);
                class637.field9048.method138();
                int var20 = class296.field4188;
                if (class347.field4911 == null) {
                    class637.field9048.method118(var20);
                } else {
                    class347.field4911.method1478(class666.field9366, class432.field6220, var9, class637.field9048, var6, class423.field6051 << 3, var8, var7, var20, false);
                }
                class655.method3701((byte) 38);
                class410.field5865.method153(class551.field8078, class277.field3933, class322.field4478, -class666.field9366 & 0x3FFF, -class432.field6220 & 0x3FFF, -class694.field9854 & 0x3FFF);
                class637.field9048.method755(class410.field5865);
                class637.field9048.method819(var9 / 2 + var7, var8 - -(var6 / 2), class677.field9644 << 1, class677.field9644 << 1);
                class196.method1384(class677.field9644 << 1, 81, class677.field9644 << 1, var9 / 2 + var7, var6 / 2 + var8);
                class252.method1610(100, -class666.field9366 & 0x3FFF, -class432.field6220 & 0x3FFF, class277.field3933, -class694.field9854 & 0x3FFF, class322.field4478, class551.field8078);
                byte var21 = class525.field7713.method3473(class76.field1182, -19799) == 2 ? (byte) client.field1377 : 1;
                class538.method3160(class148.field2508, class551.field8078, class277.field3933, class322.field4478, class468.field6756, class224.field3362, class213.field3240, class80.field1208, class677.field9636, class301.field4225, class103.field1708.field3158 + 1, var21, class103.field1708.field3155 >> 9, class103.field1708.field3154 >> 9, !class525.field7713.field5996, true);
                class655.method3701((byte) 38);
                if (class515.field7636 == 10) {
                    class555.method3249(3, var7, 256, 256, var9, var8, var6);
                    class538.method3153(256, var9, var8, var6, 256, -16777216, var7);
                    class140.method1091(256, var8, 256, var7, var6, var9, -124);
                    class152.method1153((byte) 99, var8, var6, var7, var9);
                }
                class226.method1490();
                class666.field9366 = var17;
                class322.field4478 = var16;
                class277.field3933 = var15;
                class551.field8078 = var14;
                class432.field6220 = var18;
                if (class265.field3799 && class511.field7607.method1521((byte) -6) == 0) {
                    class265.field3799 = false;
                }
                if (class265.field3799) {
                    class637.field9048.method792(var6, (byte) -88, var9, var8, -16777216, var7);
                    class194.method1361(class637.field9048, (byte) -12, false, class399.field5763, class335.field4670, class343.field4761.method2059(class238.field3511, true));
                }
            }
        } else {
            class637.field9048.method792(arg4, (byte) -88, arg3, arg2, -16777216, arg5);
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(I)V")
    public static final void method23(int arg0) {
        if (arg0 != 11683) {
            field46 = null;
        }
        field47++;
        if (class685.field9735 <= 0) {
            class476.field6818 = "";
            return;
        }
        int var1 = 0;
        for (int var2 = 0; var2 < class679.field9668.length; var2++) {
            if (class679.field9668[var2].indexOf("--> ") != -1) {
                int var10000 = ~class685.field9735;
                var1++;
                if (var10000 == ~var1) {
                    class476.field6818 = class679.field9668[var2].substring(class679.field9668[var2].indexOf(">") + 2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ps", name = "a", descriptor = "(Z)V")
    public static void method24(boolean arg0) {
        if (arg0) {
            method24(true);
        }
        field46 = null;
        field45 = null;
    }
}
