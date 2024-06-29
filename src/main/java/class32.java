import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class32 extends class259 {

    @OriginalMember(owner = "client!ec", name = "X", descriptor = "Lsg;")
    public static class30 field814 = class167.method1221((byte) 33, "<img=0>");

    @OriginalMember(owner = "client!ec", name = "ab", descriptor = "I")
    public static int field817 = 0;

    @OriginalMember(owner = "client!ec", name = "Z", descriptor = "Lsg;")
    public static class30 field816 = class167.method1221((byte) 33, ")4a=");

    @OriginalMember(owner = "client!ec", name = "Y", descriptor = "I")
    public static int field815 = 0;

    @OriginalMember(owner = "client!ec", name = "U", descriptor = "I")
    public static int field811 = -1;

    @OriginalMember(owner = "client!ec", name = "S", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!ec", name = "V", descriptor = "I")
    public static int field812;

    @OriginalMember(owner = "client!ec", name = "W", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!ec", name = "bb", descriptor = "I")
    public static int field818;

    @OriginalMember(owner = "client!ec", name = "cb", descriptor = "I")
    public static int field819;

    @OriginalMember(owner = "client!ec", name = "db", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!ec", name = "T", descriptor = "[I")
    public static int[] field810;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(Z)V")
    public static void method323(boolean arg0) {
        if (arg0) {
            field815 = -47;
        }
        field814 = null;
        field810 = null;
        field816 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ZIIIBI)V")
    public static final void method324(boolean arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        ++field809;
        ++class116.field2290;
        if (!arg0) {
            class170.method1252(true, (byte) 88);
            class33.method329(true, (byte) 113);
            class170.method1252(false, (byte) 88);
        }
        class33.method329(false, (byte) 97);
        if (!arg0) {
            client.method1491((byte) 44);
        }
        class80.method698((byte) -86);
        if (class215.field3931 == 1) {
            int var6 = 2047 & class236.field4222 + class110.field2202;
            int var7 = class91.field1851;
            if (~var7 > ~(class228.field4069 / 256)) {
                var7 = class228.field4069 / 256;
            }
            if (class125.field2446[4] && var7 < class272.field4768[4] + 128) {
                var7 = class272.field4768[4] + 128;
            }
            class263.method1818(class277.field4839, var7 * 3 + 600, class31.method303(class247.field4394.field1360, class247.field4394.field1336, class159.field2998, -4) + -50, arg2, -43, var7, class98.field1984, var6);
        }
        int var8 = class207.field3725;
        int var9 = class150.field2849;
        int var10 = class64.field1419;
        int var11 = class123.field2422;
        int var12 = class276.field4820;
        for (int var13 = 0; ~var13 > -6; ++var13) {
            if (class125.field2446[var13]) {
                int var20 = (int) ((double) (-class203.field3632[var13]) + Math.random() * (double) (class203.field3632[var13] * 2 + 1) + Math.sin((double) class246.field4387[var13] / 100.0D * (double) class236.field4227[var13]) * (double) class272.field4768[var13]);
                if (~var13 == -3) {
                    class150.field2849 += var20;
                }
                if (var13 == 1) {
                    class64.field1419 += var20;
                }
                if (var13 == 3) {
                    class123.field2422 = class123.field2422 + var20 & 2047;
                }
                if (var13 == 0) {
                    class207.field3725 += var20;
                }
                if (var13 == 4) {
                    class276.field4820 += var20;
                    if (class276.field4820 < 128) {
                        class276.field4820 = 128;
                    }
                    if (class276.field4820 > 383) {
                        class276.field4820 = 383;
                    }
                }
            }
        }
        class136.method1025(28446);
        class188.method1355(arg3, arg5, arg3 - -arg1, arg5 - -arg2);
        class213.method1528();
        if (!class94.field1890 && ~arg3 >= ~class5.field77 && arg1 + arg3 > class5.field77 && arg5 <= class219.field3960 && arg2 + arg5 > class219.field3960) {
            int var14 = class204.field3663;
            class46.field1061 = 0;
            int var15 = class64.field1426;
            class71.field1593 = (-arg3 + class5.field77) * (-var14 + var15) / arg1 + var14;
            int var16 = class180.field3337;
            int var17 = class21.field380;
            class127.field2470 = (var17 - var16) * (-arg5 + class219.field3960) / arg2 - -var16;
            class8.field116 = true;
        } else {
            class46.field1061 = 0;
            class8.field116 = false;
        }
        class67.method603((byte) -59);
        byte var18 = ~class201.method1428(-30754) != -3 ? 1 : (byte) class116.field2290;
        class188.method1361(arg3, arg5, arg1, arg2, 0);
        class225.method1610(class207.field3725, class64.field1419, class150.field2849, class276.field4820, class123.field2422, class81.field1747, class60.field1290, class50.field1160, class235.field4193, class116.field2282, class276.field4813, class159.field2998 + 1, var18, class247.field4394.field1360 >> 7, class247.field4394.field1336 >> 7);
        class67.method603((byte) -59);
        class189.method1376();
        class133.method1003(arg1, 256, arg2, arg5, 256, (byte) 58, arg3);
        class78.method689(arg1, arg2, arg3, 256, (byte) -77, 256, arg5);
        ((class99) class213.field3850).method804(class195.field3517, -112);
        class205.method1447(arg2, arg3, arg5, (byte) 86, arg1);
        int var19 = 124 % ((arg4 - -46) / 59);
        class123.field2422 = var11;
        class150.field2849 = var9;
        class276.field4820 = var12;
        class64.field1419 = var10;
        class207.field3725 = var8;
        if (class253.field4465 && ~class262.field4618.method355(true) == -1) {
            class253.field4465 = false;
        }
        if (class253.field4465) {
            class188.method1361(arg3, arg5, arg1, arg2, 0);
            class63.method566(false, class242.field4335, -114);
        }
        if (!arg0 && !class253.field4465 && !class94.field1890 && arg3 <= class5.field77 && class5.field77 < arg1 + arg3 && class219.field3960 >= arg5 && class219.field3960 < arg2 + arg5) {
            class71.method663(arg3, arg5, -118, class5.field77, class219.field3960, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZ)[I")
    public final int[] method17(int arg0, boolean arg1) {
        ++field812;
        if (arg1) {
            field814 = null;
        }
        int[] var3 = super.field4581.method1841(18, arg0);
        if (super.field4581.field4729) {
            int var4 = class154.field2910[arg0];
            for (int var5 = 0; var5 < class223.field3999; ++var5) {
                var3[var5] = this.method325(var4, class29.field558[var5], (byte) -115) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIB)I")
    private final int method325(int arg0, int arg1, byte arg2) {
        ++field818;
        int var4 = 61 / ((20 - arg2) / 61);
        int var5 = arg0 * 57 + arg1;
        int var6 = var5 << 1 ^ var5;
        return -(((var6 * var6 * 15731 + 789221) * var6 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "()V")
    public class32() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V")
    public static final void method326(byte arg0) {
        class109.field2197 = 0;
        ++field820;
        class168.field3158 = 0;
        class81.method705(arg0 ^ 20);
        class40.method416((byte) -35);
        class21.method200(false);
        for (int var1 = 0; class109.field2197 > var1; ++var1) {
            int var3 = class268.field4731[var1];
            if (~class133.field2617 != ~class125.field2443[var3].field1391) {
                if (class125.field2443[var3].field4805.method1698(true)) {
                    class143.method1062(false, class125.field2443[var3]);
                }
                class125.field2443[var3].field4805 = null;
                class125.field2443[var3] = null;
            }
        }
        if (~class163.field3041 != ~class59.field1289.field146) {
            throw new RuntimeException("gnp1 pos:" + class59.field1289.field146 + " psize:" + class163.field3041);
        } else {
            if (arg0 != -94) {
                method326((byte) 119);
            }
            for (int var2 = 0; ~class221.field3985 < ~var2; ++var2) {
                if (class125.field2443[class4.field55[var2]] == null) {
                    throw new RuntimeException("gnp2 pos:" + var2 + " size:" + class221.field3985);
                }
            }
        }
    }
}
