import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class244 extends class260 {

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    private int field4303 = 4;

    @OriginalMember(owner = "client!fe", name = "ab", descriptor = "I")
    private int field4309 = 4;

    @OriginalMember(owner = "client!fe", name = "bb", descriptor = "[Loh;")
    public static class263[] field4310 = new class263[100];

    @OriginalMember(owner = "client!fe", name = "R", descriptor = "I")
    public static volatile int field4300 = 0;

    @OriginalMember(owner = "client!fe", name = "db", descriptor = "Loh;")
    public static class263 field4312 = class253.method1681(-122, ":trade:");

    @OriginalMember(owner = "client!fe", name = "L", descriptor = "I")
    public static int field4296;

    @OriginalMember(owner = "client!fe", name = "M", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!fe", name = "O", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!fe", name = "Q", descriptor = "I")
    public static int field4299;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field4304;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field4305;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field4306;

    @OriginalMember(owner = "client!fe", name = "Y", descriptor = "I")
    public static int field4307;

    @OriginalMember(owner = "client!fe", name = "Z", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!fe", name = "cb", descriptor = "[Z")
    public static boolean[] field4311;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(III)V")
    public static final void method1653(int arg0, int arg1, int arg2) {
        if (arg0 == 37) {
            ++field4306;
            class48.field1038[arg1] = arg2;
            class180 var3 = (class180) client.field2765.method31(-32665, (long) arg1);
            if (var3 != null) {
                var3.field3283 = class25.method182(true) + 500L;
            } else {
                class180 var4 = new class180(class25.method182(true) - -500L);
                client.field2765.method33(var4, (long) arg1, -112);
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class244() {
        super(1, false);
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(B)V")
    public static void method1654(byte arg0) {
        field4310 = null;
        field4312 = null;
        field4311 = null;
        if (arg0 != -103) {
            method1653(-79, -29, 85);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[[I")
    public final int[][] method174(int arg0, int arg1) {
        int[][] var3 = super.field4509.method1667(arg0, arg1 + -5);
        if (super.field4509.field4346) {
            int var4 = class60.field1235 / this.field4309;
            int var5 = class49.field1052 / this.field4303;
            int[][] var7;
            if (~var4 < -1) {
                int var6 = arg0 % var4;
                var7 = this.method1712((byte) -1, 0, class60.field1235 * var6 / var4);
            } else {
                var7 = this.method1712((byte) 11, 0, 0);
            }
            int[] var8 = var7[1];
            int[] var9 = var7[2];
            int[] var10 = var3[0];
            int[] var11 = var3[1];
            int[] var12 = var3[2];
            int[] var13 = var7[0];
            for (int var14 = 0; ~var14 > ~class49.field1052; ++var14) {
                int var15;
                if (~var5 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var5;
                    var15 = class49.field1052 * var16 / var5;
                }
                var10[var14] = var13[var15];
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
            }
        }
        ++field4299;
        return arg1 != 5 ? null : var3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lue;I)V")
    public static final void method1655(class86 arg0, int arg1) {
        ++field4304;
        class230.field4029 = class64.method390(-70, arg0, class57.field1203);
        class190.field3418 = new int[256];
        for (int var2 = 0; var2 < 3; ++var2) {
            int var4 = (16711680 & class30.field752[var2 - -1]) >> 16;
            float var5 = (float) ((65280 & class30.field752[var2]) >> 8);
            float var6 = (float) (class30.field752[var2] >> 16 & 255);
            int var7 = (class30.field752[var2 + 1] & 65280) >> 8;
            float var8 = ((float) var7 + -var5) / 64.0F;
            float var9 = ((float) var4 + -var6) / 64.0F;
            int var10 = class30.field752[var2 + 1] & 255;
            float var11 = (float) (class30.field752[var2] & 255);
            float var12 = ((float) var10 - var11) / 64.0F;
            for (int var13 = 0; var13 < 64; ++var13) {
                class190.field3418[var2 * 64 - -var13] = class160.method1052((int) var11, class160.method1052((int) var6 << 16, (int) var5 << 8));
                var11 += var12;
                var6 += var9;
                var5 += var8;
            }
        }
        for (int var3 = 192; var3 < 255; ++var3) {
            class190.field3418[var3] = class30.field752[3];
        }
        class148.field2694 = new int[32768];
        class4.field73 = new int[32768];
        class111.method731((class88) null, (byte) -36);
        class159.field2886 = new int[32768];
        class72.field1480 = new int[32768];
        class5.field87 = new class140(128, 254);
        if (arg1 > -109) {
            method1655((class86) null, 91);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILpc;I)V")
    public static final void method1656(int arg0, int arg1, class21 arg2, int arg3) {
        ++field4302;
        if (class268.field4724 == null && !class2.field53) {
            if (arg2 != null && class236.method1583(arg3 + 31367, arg2) != null) {
                class268.field4724 = arg2;
                class253.field4404 = class236.method1583(2994, arg2);
                if (arg3 != -28373) {
                    method1660(false);
                }
                class207.field3754 = arg0;
                class94.field1847 = 0;
                class111.field2084 = false;
                class49.field1058 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILoh;II)V")
    public static final void method1657(int arg0, int arg1, class263 arg2, int arg3, int arg4) {
        ++field4298;
        if (arg0 != 107) {
            field4300 = 32;
        }
        class21 var5 = class64.method394(arg4, -1943367162, arg1);
        if (var5 != null) {
            if (var5.field492 != null) {
                class116 var6 = new class116();
                var6.field2166 = var5;
                var6.field2173 = var5.field492;
                var6.field2167 = arg3;
                var6.field2174 = arg2;
                class182.method1211(var6, 113);
            }
            boolean var7 = true;
            if (var5.field516 > 0) {
                var7 = class4.method25(true, var5);
            }
            if (var7) {
                if (class106.method713(client.method1005(var5), arg3 + -1, -11267)) {
                    if (~arg3 == -2) {
                        ++class13.field347;
                        class154.field2792.method1516(-95, 236);
                        class154.field2792.method1286(arg0 ^ -11697, arg4);
                        class154.field2792.method1276(arg1, -51);
                    }
                    if (arg3 == 2) {
                        ++class198.field3588;
                        class154.field2792.method1516(-40, 77);
                        class154.field2792.method1286(-11740, arg4);
                        class154.field2792.method1276(arg1, -72);
                    }
                    if (~arg3 == -4) {
                        ++class245.field4321;
                        class154.field2792.method1516(109, 117);
                        class154.field2792.method1286(-11740, arg4);
                        class154.field2792.method1276(arg1, -88);
                    }
                    if (arg3 == 4) {
                        class154.field2792.method1516(98, 78);
                        ++class8.field158;
                        class154.field2792.method1286(-11740, arg4);
                        class154.field2792.method1276(arg1, -39);
                    }
                    if (~arg3 == -6) {
                        class154.field2792.method1516(arg0 + -162, 107);
                        ++class241.field4236;
                        class154.field2792.method1286(-11740, arg4);
                        class154.field2792.method1276(arg1, arg0 + -150);
                    }
                    if (~arg3 == -7) {
                        class154.field2792.method1516(115, 184);
                        class154.field2792.method1286(-11740, arg4);
                        class154.field2792.method1276(arg1, -62);
                        ++class189.field3399;
                    }
                    if (arg3 == 7) {
                        ++class267.field4665;
                        class154.field2792.method1516(107, 47);
                        class154.field2792.method1286(-11740, arg4);
                        class154.field2792.method1276(arg1, arg0 + -149);
                    }
                    if (~arg3 == -9) {
                        class154.field2792.method1516(-51, 37);
                        ++class230.field4025;
                        class154.field2792.method1286(arg0 ^ -11697, arg4);
                        class154.field2792.method1276(arg1, -41);
                    }
                    if (~arg3 == -10) {
                        ++class233.field4076;
                        class154.field2792.method1516(71, 247);
                        class154.field2792.method1286(-11740, arg4);
                        class154.field2792.method1276(arg1, arg0 ^ -64);
                    }
                    if (~arg3 == -11) {
                        ++class127.field2343;
                        class154.field2792.method1516(-122, 168);
                        class154.field2792.method1286(-11740, arg4);
                        class154.field2792.method1276(arg1, arg0 + -139);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lue;Lue;BLue;)V")
    public static final void method1658(class86 arg0, class86 arg1, byte arg2, class86 arg3) {
        class90.field1778 = arg1;
        if (arg2 < 114) {
            method1654((byte) 107);
        }
        ++field4308;
        class238.field4156 = arg0;
        class59.field1225 = arg3;
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IILsi;)V")
    public final void method86(int arg0, int arg1, class194 arg2) {
        ++field4297;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                this.field4309 = arg2.method1301(-8317);
            }
        } else {
            this.field4303 = arg2.method1301(arg1 ^ -13882);
        }
        if (arg1 != 5701) {
            field4312 = null;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(II)[I")
    public final int[] method17(int arg0, int arg1) {
        if (arg1 != 255) {
            this.field4309 = 20;
        }
        ++field4307;
        int[] var3 = super.field4511.method304(arg0, false);
        if (super.field4511.field1029) {
            int var4 = class49.field1052 / this.field4303;
            int var5 = class60.field1235 / this.field4309;
            int[] var6;
            if (~var5 >= -1) {
                var6 = this.method1711(0, 0, false);
            } else {
                int var7 = arg0 % var5;
                var6 = this.method1711(class60.field1235 * var7 / var5, 0, false);
            }
            for (int var8 = 0; ~var8 > ~class49.field1052; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var6[class49.field1052 * var9 / var4];
                } else {
                    var3[var8] = var6[0];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "(II)V")
    public static final void method1659(int arg0, int arg1) {
        ++field4305;
        if (class271.field4786 != arg0) {
            if (~class271.field4786 == -1) {
                class137.method893((byte) -57);
            }
            boolean var2 = arg0 == 5 || arg0 == 10 || arg0 == 28;
            if (arg0 == 40) {
                class261.method1720(arg1 + -26474);
            }
            if (~arg0 != -41 && class43.field937 != null) {
                class43.field937.method809((byte) 124);
                class43.field937 = null;
            }
            if (arg0 == 25 || ~arg0 == -29) {
                class117.field2183 = 0;
                class122.field2270 = 0;
                class50.field1065 = 0;
                class86.field1702 = 1;
                class86.field1722 = 1;
                class5.method28(true, (byte) -99);
            }
            if (~arg0 == -26 || arg0 == 10) {
                class120.method776(-3);
            }
            if (~arg0 == -6) {
                class22.method163(-82, class204.field3664);
            } else {
                class84.method565(-68);
            }
            if (arg1 != 26473) {
                field4300 = -112;
            }
            boolean var3 = class271.field4786 == 5 || class271.field4786 == 10 || ~class271.field4786 == -29;
            if (var2 != var3) {
                if (var2) {
                    class186.field3358 = class49.field1051;
                    if (~class95.field1866 == -1) {
                        class183.method1215(-29235, 2);
                    } else {
                        class200.method1392(class142.field2609, 110, 0, class49.field1051, 2, false, 255);
                    }
                    class33.field806.method1047(false, 112);
                } else {
                    class183.method1215(-29235, 2);
                    class33.field806.method1047(true, 90);
                }
            }
            class271.field4786 = arg0;
        }
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(Z)V")
    public static final void method1660(boolean arg0) {
        if (arg0) {
            field4300 = -92;
        }
        class49.field1056.method825(0);
        ++field4296;
    }
}
