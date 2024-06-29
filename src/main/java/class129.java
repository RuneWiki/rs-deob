import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class129 {

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lrg;")
    private class176 field2456 = new class176();

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field2448 = 3353893;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lob;")
    private static class141 field2451 = class175.method1195(40, "skill)2");

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lob;")
    public static class141 field2453 = field2451;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field2455 = 0;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field2447;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field2457;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lrg;I)V")
    public final void method812(class176 arg0, int arg1) {
        if (arg0.field3489 != null) {
            arg0.method1200((byte) 122);
        }
        field2445++;
        arg0.field3491 = this.field2456.field3491;
        arg0.field3489 = this.field2456;
        arg0.field3489.field3491 = arg0;
        arg0.field3491.field3489 = arg0;
        int var3 = -93 / ((8 - arg1) / 62);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)V")
    public static final void method813(boolean arg0) {
        field2447++;
        boolean var1 = true;
        class10.method70(-124, arg0);
        class157.field3028 = 0;
        for (int var2 = 0; var2 < class195.field3736.length; var2++) {
            if (class83.field1653[var2] != -1 && class195.field3736[var2] == null) {
                class195.field3736[var2] = class125.field2414.method1065((byte) -117, 0, class83.field1653[var2]);
                if (class195.field3736[var2] == null) {
                    var1 = false;
                    class157.field3028++;
                }
            }
            if (class167.field3226[var2] != -1 && class172.field3412[var2] == null) {
                class172.field3412[var2] = class125.field2414.method1061(class110.field2123[var2], -2, 0, class167.field3226[var2]);
                if (class172.field3412[var2] == null) {
                    var1 = false;
                    class157.field3028++;
                }
            }
        }
        if (!var1) {
            class24.field456 = 1;
            return;
        }
        class78.field1582 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class195.field3736.length; var4++) {
            byte[] var56 = class172.field3412[var4];
            if (var56 != null) {
                int var57 = (class18.field321[var4] & 0xFF) * 64 - class83.field1644;
                int var58 = (class18.field321[var4] >> 8) * 64 - class83.field1649;
                if (class47.field892) {
                    var58 = 10;
                    var57 = 10;
                }
                var3 &= class220.method1420(var56, var57, var58, 63);
            }
        }
        if (!var3) {
            class24.field456 = 2;
            return;
        }
        if (class24.field456 != 0) {
            class53.method357(-31122, true, class220.method1422(new class141[] { class182.field3574, class223.field4213 }, -3));
        }
        class118.method766(-5);
        class15.method95(109);
        class118.method766(-5);
        class166.method1145();
        class118.method766(-5);
        System.gc();
        for (int var5 = 0; var5 < 4; var5++) {
            class47.field888[var5].method544((byte) 126);
        }
        for (int var6 = 0; var6 < 4; var6++) {
            for (int var54 = 0; var54 < 104; var54++) {
                for (int var55 = 0; var55 < 104; var55++) {
                    class164.field3177[var6][var54][var55] = 0;
                }
            }
        }
        class118.method766(-5);
        class8.method57(105);
        int var7 = class195.field3736.length;
        class24.method169(2);
        class10.method70(-122, true);
        if (!class47.field892) {
            for (int var8 = 0; var8 < var7; var8++) {
                int var17 = (class18.field321[var8] >> 8) * 64 - class83.field1649;
                int var18 = (class18.field321[var8] & 0xFF) * 64 - class83.field1644;
                byte[] var19 = class195.field3736[var8];
                if (var19 != null) {
                    class118.method766(-5);
                    class93.method640(var17, class30.field570 * 8 - 48, class47.field888, -116, var19, var18, class177.field3504 * 8 - 48);
                }
            }
            for (int var9 = 0; var9 < var7; var9++) {
                int var14 = (class18.field321[var9] & 0xFF) * 64 - class83.field1644;
                int var15 = (class18.field321[var9] >> 8) * 64 - class83.field1649;
                byte[] var16 = class195.field3736[var9];
                if (var16 == null && class177.field3504 < 800) {
                    class118.method766(-5);
                    class61.method408(var15, (byte) 75, 64, 64, var14);
                }
            }
            class10.method70(-115, true);
            for (int var10 = 0; var10 < var7; var10++) {
                byte[] var11 = class172.field3412[var10];
                if (var11 != null) {
                    int var12 = (class18.field321[var10] >> 8) * 64 - class83.field1649;
                    int var13 = (class18.field321[var10] & 0xFF) * 64 - class83.field1644;
                    class118.method766(-5);
                    class165.method1139(-15497, var11, var12, var13, class47.field888);
                }
            }
        }
        if (class47.field892) {
            for (int var20 = 0; var20 < 4; var20++) {
                class118.method766(-5);
                for (int var34 = 0; var34 < 13; var34++) {
                    for (int var35 = 0; var35 < 13; var35++) {
                        boolean var36 = false;
                        int var37 = class116.field2237[var20][var34][var35];
                        if (var37 != -1) {
                            int var38 = var37 >> 14 & 0x3FF;
                            int var39 = var37 >> 1 & 0x3;
                            int var40 = var37 >> 24 & 0x3;
                            int var41 = var37 >> 3 & 0x7FF;
                            int var42 = (var38 / 8 << 8) + var41 / 8;
                            for (int var43 = 0; var43 < class18.field321.length; var43++) {
                                if (class18.field321[var43] == var42 && class195.field3736[var43] != null) {
                                    class106.method701((var41 & 0x7) * 8, var39, 17606, class195.field3736[var43], var34 * 8, var20, class47.field888, var40, var35 * 8, (var38 & 0x7) * 8);
                                    var36 = true;
                                    break;
                                }
                            }
                        }
                        if (!var36) {
                            class96.method644(var20, var34 * 8, 8, var35 * 8);
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < 13; var21++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class116.field2237[0][var21][var32];
                    if (var33 == -1) {
                        class61.method408(var21 * 8, (byte) 75, 8, 8, var32 * 8);
                    }
                }
            }
            class10.method70(-109, true);
            for (int var22 = 0; var22 < 4; var22++) {
                class118.method766(-5);
                for (int var23 = 0; var23 < 13; var23++) {
                    for (int var24 = 0; var24 < 13; var24++) {
                        int var25 = class116.field2237[var22][var23][var24];
                        if (var25 != -1) {
                            int var26 = var25 >> 24 & 0x3;
                            int var27 = var25 >> 1 & 0x3;
                            int var28 = var25 >> 3 & 0x7FF;
                            int var29 = var25 >> 14 & 0x3FF;
                            int var30 = (var29 / 8 << 8) + var28 / 8;
                            for (int var31 = 0; var31 < class18.field321.length; var31++) {
                                if (class18.field321[var31] == var30 && class172.field3412[var31] != null) {
                                    class116.method753(class47.field888, var24 * 8, (var29 & 0x7) * 8, var27, var23 * 8, var26, (var28 & 0x7) * 8, class172.field3412[var31], var22, 99);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        class10.method70(-121, true);
        class15.method95(122);
        class118.method766(-5);
        class224.method1438(2210, class47.field888);
        class10.method70(-120, true);
        int var44 = class103.field1991;
        if (class66.field1287 < var44) {
            var44 = class66.field1287;
        }
        if (class66.field1287 - 1 > var44) {
            int var45 = class66.field1287 - 1;
        }
        if (class8.field128) {
            class31.method224(class103.field1991);
        } else {
            class31.method224(0);
        }
        for (int var46 = 0; var46 < 104; var46++) {
            for (int var53 = 0; var53 < 104; var53++) {
                class190.method1261(0, var53, var46);
            }
        }
        class118.method766(-5);
        class19.method116(37);
        class15.method95(111);
        if (class209.field3985 != null) {
            class7.field120.method32(43, 12885);
            class86.field1710++;
            class7.field120.method970(1057001181, (byte) -125);
        }
        if (!class47.field892) {
            int var47 = (class30.field570 - 6) / 8;
            int var48 = (class177.field3504 + 6) / 8;
            int var49 = (class30.field570 + 6) / 8;
            int var50 = (class177.field3504 - 6) / 8;
            for (int var51 = var47 - 1; var51 <= var49 + 1; var51++) {
                for (int var52 = var50 - 1; var52 <= var48 + 1; var52++) {
                    if (var47 > var51 || var49 < var51 || var52 < var50 || var48 < var52) {
                        class125.field2414.method1062(16777215, class220.method1422(new class141[] { class117.field2280, class78.method543((byte) 93, var51), class152.field2916, class78.method543((byte) 93, var52) }, -3));
                        class125.field2414.method1062(16777215, class220.method1422(new class141[] { class8.field130, class78.method543((byte) 93, var51), class152.field2916, class78.method543((byte) 93, var52) }, -3));
                    }
                }
            }
        }
        class156.method1086(30, (byte) 92);
        class118.method766(-5);
        class34.method241((byte) 105);
        class7.field120.method32(166, 12885);
        class160.method1116(32);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Lrg;")
    public final class176 method814(int arg0) {
        if (arg0 != 15843) {
            this.method816((byte) 44, null);
        }
        field2454++;
        class176 var2 = this.field2456.field3491;
        return this.field2456 == var2 ? null : var2;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILob;)V")
    public static final void method815(int arg0, int arg1, class141 arg2) {
        field2446++;
        class85.field1691++;
        class7.field120.method32(55, 12885);
        class7.field120.method996((byte) 80, arg2.method926(19790));
        if (arg1 >= -4) {
            method815(-11, -117, null);
        }
        class7.field120.method966((byte) -72, arg0);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLrg;)V")
    public final void method816(byte arg0, class176 arg1) {
        field2457++;
        if (arg1.field3489 != null) {
            arg1.method1200((byte) 122);
        }
        if (arg0 == -26) {
            arg1.field3489 = this.field2456.field3489;
            arg1.field3491 = this.field2456;
            arg1.field3489.field3491 = arg1;
            arg1.field3491.field3489 = arg1;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Log;I)Lac;")
    public static final class4 method817(class146 arg0, int arg1) {
        if (arg1 < 55) {
            field2451 = null;
        }
        field2449++;
        return new class4(arg0.method992((byte) -67), arg0.method992((byte) -67), arg0.method992((byte) -67), arg0.method992((byte) -67), arg0.method1012(-124), arg0.method1012(-124), arg0.method991(255));
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)Lrg;")
    public final class176 method818(byte arg0) {
        field2452++;
        class176 var2 = this.field2456.field3491;
        if (arg0 <= 35) {
            field2448 = -77;
        }
        if (this.field2456 == var2) {
            return null;
        } else {
            var2.method1200((byte) 122);
            return var2;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static void method819(int arg0) {
        field2453 = null;
        field2451 = null;
        if (arg0 >= -11) {
            method815(40, -97, null);
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V")
    public class129() {
        this.field2456.field3491 = this.field2456;
        this.field2456.field3489 = this.field2456;
    }
}
