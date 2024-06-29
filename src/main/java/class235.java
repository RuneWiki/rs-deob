import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class235 {

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public int field3751 = -1;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field3745 = 20;

    @OriginalMember(owner = "client!tc", name = "l", descriptor = "I")
    public static int field3755 = 0;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "[Lh;")
    public static class107[] field3753 = new class107[29];

    @OriginalMember(owner = "client!tc", name = "q", descriptor = "Ltb;")
    public static class220 field3760 = null;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public int field3746;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public int field3748;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public int field3749;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public int field3752;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "I")
    public int field3754;

    @OriginalMember(owner = "client!tc", name = "m", descriptor = "I")
    public static int field3756;

    @OriginalMember(owner = "client!tc", name = "n", descriptor = "I")
    public int field3757;

    @OriginalMember(owner = "client!tc", name = "o", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!tc", name = "p", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!tc", name = "r", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLkh;)Lja;", line = 10)
    public static final class289 method1651(byte arg0, class166 arg1) {
        field3750++;
        if (arg0 > -60) {
            return (class289) null;
        } else {
            class289 var2 = new class289();
            var2.field4504 = arg1.method1151(-76);
            var2.field4501 = class173.method1248(var2.field4504, 127);
            return var2;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(ZI)V", line = 31)
    public static final void method1652(boolean arg0, int arg1) {
        field3759++;
        class92.field1463 = arg0;
        if (class92.field1463) {
            int var2 = class10.field132.method1180(128);
            boolean var3 = class280.method1917((byte) -71, class10.field132.method1153(15673));
            class10.field132.method752(false);
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 13; var5++) {
                    for (int var6 = 0; var6 < 13; var6++) {
                        int var7 = class10.field132.method759(false, 1);
                        if (var7 == 1) {
                            class315.field4897[var4][var5][var6] = class10.field132.method759(false, 26);
                        } else {
                            class315.field4897[var4][var5][var6] = -1;
                        }
                    }
                }
            }
            class10.field132.method758((byte) -124);
            int var8 = (class186.field2778 - class10.field132.field2532) / 16;
            class150.field2269 = new int[var8][4];
            for (int var9 = 0; var9 < var8; var9++) {
                for (int var10 = 0; var10 < 4; var10++) {
                    class150.field2269[var9][var10] = class10.field132.method1129(255);
                }
            }
            int var11 = class10.field132.method1180(128);
            int var12 = class10.field132.method1180(128);
            int var13 = class10.field132.method1128((byte) -32);
            int var14 = class10.field132.method1172(false);
            class331.field5158 = new int[var8];
            class128.field2027 = new byte[var8][];
            class199.field2973 = new int[var8];
            class241.field3865 = new int[var8];
            class29.field430 = new byte[var8][];
            class153.field2308 = new int[var8];
            class270.field4197 = (byte[][]) null;
            class170.field2566 = new byte[var8][];
            class300.field4689 = new int[var8];
            class303.field4723 = new byte[var8][];
            int var15 = 0;
            class206.field3171 = null;
            for (int var16 = 0; var16 < 4; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    for (int var18 = 0; var18 < 13; var18++) {
                        int var19 = class315.field4897[var16][var17][var18];
                        if (var19 != -1) {
                            int var20 = (var19 & 0xFFDE71) >> 14;
                            int var21 = var19 >> 3 & 0x7FF;
                            int var22 = (var20 / 8 << 8) + var21 / 8;
                            for (int var23 = 0; var23 < var15; var23++) {
                                if (class331.field5158[var23] == var22) {
                                    var22 = -1;
                                    break;
                                }
                            }
                            if (var22 != -1) {
                                class331.field5158[var15] = var22;
                                int var24 = (var22 & 0xFF32) >> 8;
                                int var25 = var22 & 0xFF;
                                class199.field2973[var15] = class225.field3575.method970("m" + var24 + "_" + var25, (byte) -10);
                                class241.field3865[var15] = class225.field3575.method970("l" + var24 + "_" + var25, (byte) -10);
                                class153.field2308[var15] = class225.field3575.method970("um" + var24 + "_" + var25, (byte) -10);
                                class300.field4689[var15] = class225.field3575.method970("ul" + var24 + "_" + var25, (byte) -10);
                                var15++;
                            }
                        }
                    }
                }
            }
            class205.method1457(var11, 103, var13, false, var3, var2, var14, var12);
        } else {
            int var26 = class10.field132.method1148(-2123880488);
            boolean var27 = class280.method1917((byte) -71, class10.field132.method1120(61));
            int var28 = class10.field132.method1151(-53);
            int var29 = (class186.field2778 - class10.field132.field2532) / 16;
            class150.field2269 = new int[var29][4];
            for (int var30 = 0; var30 < var29; var30++) {
                for (int var31 = 0; var31 < 4; var31++) {
                    class150.field2269[var30][var31] = class10.field132.method1119(95);
                }
            }
            int var32 = class10.field132.method1180(128);
            int var33 = class10.field132.method1120(117);
            int var34 = class10.field132.method1148(-2123880488);
            class128.field2027 = new byte[var29][];
            class206.field3171 = null;
            class29.field430 = new byte[var29][];
            class303.field4723 = new byte[var29][];
            class153.field2308 = new int[var29];
            class270.field4197 = (byte[][]) null;
            class331.field5158 = new int[var29];
            class199.field2973 = new int[var29];
            boolean var35 = false;
            class300.field4689 = new int[var29];
            class170.field2566 = new byte[var29][];
            if (((var26 / 8) == 48 || var26 / 8 == 49) && (var28 / 8) == 48) {
                var35 = true;
            }
            class241.field3865 = new int[var29];
            int var36 = 0;
            if (var26 / 8 == 48 && var28 / 8 == 148) {
                var35 = true;
            }
            for (int var37 = (var26 - 6) / 8; var37 <= (var26 + 6) / 8; var37++) {
                for (int var38 = (var28 - 6) / 8; var38 <= ((var28 + 6) / 8); var38++) {
                    int var39 = (var37 << 8) + var38;
                    if (var35 && var38 == 49 || var38 == 149 || var38 == 147 || var37 == 50 || !(var37 != 49 || var38 != 47)) {
                        class331.field5158[var36] = var39;
                        class199.field2973[var36] = -1;
                        class241.field3865[var36] = -1;
                        class153.field2308[var36] = -1;
                        class300.field4689[var36] = -1;
                    } else {
                        class331.field5158[var36] = var39;
                        class199.field2973[var36] = class225.field3575.method970("m" + var37 + "_" + var38, (byte) -10);
                        class241.field3865[var36] = class225.field3575.method970("l" + var37 + "_" + var38, (byte) -10);
                        class153.field2308[var36] = class225.field3575.method970("um" + var37 + "_" + var38, (byte) -10);
                        class300.field4689[var36] = class225.field3575.method970("ul" + var37 + "_" + var38, (byte) -10);
                    }
                    var36++;
                }
            }
            class205.method1457(var28, 103, var34, false, var27, var32, var33, var26);
        }
        if (arg1 > -119) {
            method1652(true, 42);
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V", line = 282)
    public static final void method1653(int arg0) {
        field3756++;
        int var1 = 0;
        if (arg0 >= -84) {
            return;
        }
        while (class234.field3740 > var1) {
            class332 var2 = class181.method1297((byte) -125, var1);
            if (var2 != null && var2.field5161 == 0) {
                class225.field3589[var1] = 0;
                class285.field4461[var1] = 0;
            }
            var1++;
        }
        class292.field4538 = new class170(16);
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(Z)V", line = 317)
    public static void method1654(boolean arg0) {
        field3760 = null;
        if (!arg0) {
            field3753 = null;
        }
    }
}
