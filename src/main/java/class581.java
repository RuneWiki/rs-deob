import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!po")
public class class581 extends class601 {

    @OriginalMember(owner = "client!po", name = "p", descriptor = "[I")
    public static int[] field7955 = new int[25];

    @OriginalMember(owner = "client!po", name = "r", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field7957 = new Hashtable();

    @OriginalMember(owner = "client!po", name = "o", descriptor = "F")
    public static float field7954;

    @OriginalMember(owner = "client!po", name = "l", descriptor = "I")
    public static int field7951;

    @OriginalMember(owner = "client!po", name = "m", descriptor = "I")
    public static int field7952;

    @OriginalMember(owner = "client!po", name = "n", descriptor = "I")
    public static int field7953;

    @OriginalMember(owner = "client!po", name = "q", descriptor = "I")
    public static int field7956;

    @OriginalMember(owner = "client!po", name = "s", descriptor = "I")
    public static int field7958;

    @OriginalMember(owner = "client!po", name = "t", descriptor = "I")
    public static int field7959;

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IIIIZ)V", line = 7)
    public static final void method3376(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field7958;
        if (arg4 || ~class338.field4749 != ~arg1 || ~class48.field727 != ~arg0 || ~class96.field1331 != ~class622.field8328 && ~class332.field4707.field4774.method1242(0) != -2) {
            class48.field727 = arg0;
            class338.field4749 = arg1;
            class622.field8328 = class96.field1331;
            if (class332.field4707.field4774.method1242(0) == 1) {
                class622.field8328 = 0;
            }
            class647.method3624(arg3, true);
            class743.method4138(true, class272.field3950, class155.field2131.method978(class120.field1576, (byte) -114), class524.field7280, class129.field1802, (byte) -63);
            int var5 = class113.field1509;
            class113.field1509 = (-(class277.field4036 >> 4) + class338.field4749) * 8;
            int var6 = class587.field7995;
            class587.field7995 = (-(class667.field9202 >> 4) + class48.field727) * 8;
            class708.field9869 = class461.method2814(class338.field4749 * 8, class48.field727 * 8);
            class643.field8616 = null;
            int var7 = -var5 + class113.field1509;
            int var8 = class587.field7995 - var6;
            if (arg3 != 11) {
                class262.field3837 = 0;
                boolean var9 = false;
                int var10 = (class277.field4036 + -1) * 512;
                int var11 = class667.field9202 * 512 + -512;
                for (int var12 = 0; var12 < class445.field6185; ++var12) {
                    class234 var13 = class757.field10568[var12];
                    if (var13 != null) {
                        class679 var14 = var13.field3471;
                        var14.field4418 -= var8 * 512;
                        var14.field4410 -= var7 * 512;
                        if (~var14.field4410 <= -1 && var10 >= var14.field4410 && var14.field4418 >= 0 && var11 >= var14.field4418) {
                            boolean var15 = true;
                            for (int var16 = 0; ~var16 > -11; ++var16) {
                                var14.field7197[var16] -= var7;
                                var14.field7198[var16] -= var8;
                                if (~var14.field7197[var16] > -1 || ~var14.field7197[var16] <= ~class277.field4036 || ~var14.field7198[var16] > -1 || ~class667.field9202 >= ~var14.field7198[var16]) {
                                    var15 = false;
                                }
                            }
                            if (var15) {
                                class446.field6192[class262.field3837++] = var14.field7148;
                            } else {
                                var14.method3826((class123) null, 0);
                                var9 = true;
                                var13.method549(6410);
                            }
                        } else {
                            var14.method3826((class123) null, 0);
                            var13.method549(6410);
                            var9 = true;
                        }
                    }
                }
                if (var9) {
                    class445.field6185 = class372.field5245.method816((byte) -36);
                    class372.field5245.method817((byte) -79, class757.field10568);
                }
            } else {
                for (int var17 = 0; var17 < class445.field6185; ++var17) {
                    class234 var31 = class757.field10568[var17];
                    if (var31 != null) {
                        class679 var32 = var31.field3471;
                        for (int var33 = 0; var33 < 10; ++var33) {
                            var32.field7197[var33] -= var7;
                            var32.field7198[var33] -= var8;
                        }
                        var32.field4418 -= var8 * 512;
                        var32.field4410 -= var7 * 512;
                    }
                }
            }
            for (int var18 = arg2; var18 < 2048; ++var18) {
                class96 var29 = class251.field3675[var18];
                if (var29 != null) {
                    for (int var30 = 0; ~var30 > -11; ++var30) {
                        var29.field7197[var30] -= var7;
                        var29.field7198[var30] -= var8;
                    }
                    var29.field4410 -= var7 * 512;
                    var29.field4418 -= var8 * 512;
                }
            }
            class596[] var19 = class653.field8740;
            for (int var20 = 0; var20 < var19.length; ++var20) {
                class596 var28 = var19[var20];
                if (var28 != null) {
                    var28.field8080 -= var8 * 512;
                    var28.field8086 -= var7 * 512;
                }
            }
            for (class6 var21 = (class6) class755.field10409.method3618(-109); var21 != null; var21 = (class6) class755.field10409.method3619(0)) {
                var21.field53 -= var7;
                var21.field41 -= var8;
                if (~class119.field1570 != -5 && (~var21.field53 > -1 || ~var21.field41 > -1 || var21.field53 >= class277.field4036 || ~var21.field41 <= ~class667.field9202)) {
                    var21.method549(6410);
                }
            }
            for (class6 var22 = (class6) class159.field2226.method3618(-114); var22 != null; var22 = (class6) class159.field2226.method3619(arg2)) {
                var22.field53 -= var7;
                var22.field41 -= var8;
                if (~class119.field1570 != -5 && (~var22.field53 > -1 || var22.field41 < 0 || class277.field4036 <= var22.field53 || ~var22.field41 <= ~class667.field9202)) {
                    var22.method549(6410);
                }
            }
            if (class119.field1570 != 4) {
                for (class662 var23 = (class662) class541.field7521.method821((byte) 117); var23 != null; var23 = (class662) class541.field7521.method818(96)) {
                    int var24 = (int) (var23.field1079 & 16383L);
                    int var25 = -class113.field1509 + var24;
                    int var26 = (int) (var23.field1079 >> 14 & 16383L);
                    int var27 = var26 - class587.field7995;
                    if (var25 < 0 || ~var27 > -1 || ~var25 <= ~class277.field4036 || class667.field9202 <= var27) {
                        var23.method549(arg2 ^ 6410);
                    }
                }
            }
            if (~class486.field6806 != -1) {
                class486.field6806 -= var7;
                class171.field2378 -= var8;
            }
            class209.method1244((byte) 16);
            if (~arg3 == -12) {
                if (class720.field10023 != 4) {
                    class720.field10023 = 1;
                    class221.field2987 = -1;
                    class388.field5597 = -1;
                } else {
                    class43.field532 -= var7 * 512;
                    class316.field4388 -= var7 * 512;
                    class357.field5123 -= var8 * 512;
                    class544.field7541 -= var8 * 512;
                }
            } else {
                class395.field5684 -= var7;
                class409.field5827 -= var7;
                class123.field1680 -= var8 * 512;
                class49.field734 -= var8;
                class671.field9282 -= var7 * 512;
                class518.field7232 -= var8;
                if (Math.abs(var7) > class277.field4036 || Math.abs(var8) > class667.field9202) {
                    class124.method777((byte) -86);
                }
            }
            class269.method1824((byte) 86);
            class367.method2313(true);
            class76.field1112.method3615((byte) 97);
            class24.field295.method3615((byte) -45);
            class217.field2831.method1641(-113);
            class387.method2429((byte) 100);
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(I)I", line = 285)
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            this.method45(21);
        }
        ++field7953;
        return 0;
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(I)V", line = 298)
    public static void method3377(int arg0) {
        field7955 = null;
        field7957 = null;
        if (arg0 <= 73) {
            field7954 = -2.4992888F;
        }
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(B)V", line = 309)
    public final void method41(byte arg0) {
        ++field7952;
        int var2 = -48 / ((arg0 - 59) / 33);
        if (super.field8131 != 1 && ~super.field8131 != -1) {
            super.field8131 = this.method45(8976);
        }
    }

    @OriginalMember(owner = "client!po", name = "c", descriptor = "(I)I", line = 321)
    public final int method3378(int arg0) {
        ++field7959;
        if (arg0 != 0) {
            field7957 = null;
        }
        return super.field8131;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(ILqea;)V", line = 334)
    public class581(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!po", name = "b", descriptor = "(II)V", line = 338)
    public final void method43(int arg0, int arg1) {
        int var3 = 17 % ((arg0 - 22) / 34);
        ++field7951;
        super.field8131 = arg1;
    }

    @OriginalMember(owner = "client!po", name = "a", descriptor = "(IB)I", line = 349)
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            method3376(-18, 116, -72, -54, false);
        }
        ++field7956;
        return 1;
    }

    @OriginalMember(owner = "client!po", name = "<init>", descriptor = "(Lqea;)V", line = 366)
    public class581(class339 arg0) {
        super(arg0);
    }
}
