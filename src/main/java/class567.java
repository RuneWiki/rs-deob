import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class567 extends class733 {

    @OriginalMember(owner = "client!vv", name = "E", descriptor = "I")
    public int field8026 = -1;

    @OriginalMember(owner = "client!vv", name = "V", descriptor = "I")
    private int field8037 = 0;

    @OriginalMember(owner = "client!vv", name = "P", descriptor = "I")
    public int field8031 = 0;

    @OriginalMember(owner = "client!vv", name = "M", descriptor = "Z")
    private boolean field8029 = false;

    @OriginalMember(owner = "client!vv", name = "db", descriptor = "I")
    public int field8045 = -1;

    @OriginalMember(owner = "client!vv", name = "fb", descriptor = "Lvj;")
    public static class26 field8047 = new class26(0, 1);

    @OriginalMember(owner = "client!vv", name = "K", descriptor = "I")
    public static int field8027;

    @OriginalMember(owner = "client!vv", name = "L", descriptor = "I")
    public static int field8028;

    @OriginalMember(owner = "client!vv", name = "O", descriptor = "I")
    public static int field8030;

    @OriginalMember(owner = "client!vv", name = "Q", descriptor = "I")
    public int field8032;

    @OriginalMember(owner = "client!vv", name = "R", descriptor = "I")
    public static int field8033;

    @OriginalMember(owner = "client!vv", name = "S", descriptor = "I")
    public static int field8034;

    @OriginalMember(owner = "client!vv", name = "T", descriptor = "I")
    public int field8035;

    @OriginalMember(owner = "client!vv", name = "U", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!vv", name = "W", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!vv", name = "X", descriptor = "I")
    public int field8039;

    @OriginalMember(owner = "client!vv", name = "Y", descriptor = "I")
    public int field8040;

    @OriginalMember(owner = "client!vv", name = "Z", descriptor = "I")
    public static int field8041;

    @OriginalMember(owner = "client!vv", name = "ab", descriptor = "I")
    public static int field8042;

    @OriginalMember(owner = "client!vv", name = "bb", descriptor = "I")
    public static int field8043;

    @OriginalMember(owner = "client!vv", name = "cb", descriptor = "I")
    public static int field8044;

    @OriginalMember(owner = "client!vv", name = "gb", descriptor = "I")
    public static int field8048;

    @OriginalMember(owner = "client!vv", name = "ib", descriptor = "I")
    public static int field8050;

    @OriginalMember(owner = "client!vv", name = "eb", descriptor = "Lla;")
    public static class422 field8046;

    @OriginalMember(owner = "client!vv", name = "hb", descriptor = "[Lit;")
    public static class34[] field8049;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(II)I")
    public static final int method3292(int arg0, int arg1) {
        ++field8038;
        int var7 = arg0 - 1;
        int var2 = var7 | var7 >>> 1;
        int var3 = var2 | var2 >>> 2;
        int var4 = var3 | var3 >>> 4;
        if (arg1 >= -61) {
            field8047 = null;
        }
        int var5 = var4 | var4 >>> 8;
        int var6 = var5 | var5 >>> 16;
        return var6 + 1;
    }

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "(I)Z")
    public final boolean method95(int arg0) {
        ++field8042;
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lha;I)Lkn;")
    public final class516 method93(class544 arg0, int arg1) {
        if (arg1 != 1) {
            this.method95(-65);
        }
        ++field8028;
        return null;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "([[BBLfea;)V")
    public static final void method3293(byte[][] arg0, byte arg1, class460 arg2) {
        ++field8027;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        int var4 = arg0.length;
        int var5 = 58 / ((arg1 - 8) / 60);
        for (int var6 = 0; var4 > var6; ++var6) {
            byte[] var11 = arg0[var6];
            if (var11 != null) {
                class301 var12 = new class301(var11);
                int var13 = class205.field3445[var6] >> 8;
                int var14 = class205.field3445[var6] & 255;
                int var15 = var13 * 64 + -class265.field4123;
                int var16 = var14 * 64 + -class723.field10155;
                class493.method2998((byte) -117);
                arg2.method976(class723.field10155, class247.field3958, -21, var15, var16, class265.field4123, var12);
                arg2.method2811(0, var3, var15, var12, var16, class364.field5573);
                if (!arg2.field1968 && ~(field8048 / 8) == ~var13 && ~(class319.field4745 / 8) == ~var14 && ~var3[0] != 0) {
                    class93.field1395 = class691.field9803.method2539(var3[3], class416.field6122, var3[2], 10647, var3[0], var3[1]);
                    class98.field1450 = var3[4];
                }
            }
        }
        for (int var7 = 0; var4 > var7; ++var7) {
            int var8 = (class205.field3445[var7] >> 8) * 64 + -class265.field4123;
            int var9 = (255 & class205.field3445[var7]) * 64 + -class723.field10155;
            byte[] var10 = arg0[var7];
            if (var10 == null && ~class319.field4745 > -801) {
                class493.method2998((byte) -113);
                arg2.method979(false, var9, 64, var8, 64);
            }
        }
    }

    @OriginalMember(owner = "client!vv", name = "<init>", descriptor = "(IIIII)V")
    public class567(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(Lha;I)V")
    public final void method97(class544 arg0, int arg1) {
        if (arg1 == -1) {
            ++field8036;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method94(int arg0, int arg1, class544 arg2, int arg3) {
        ++field8034;
        class73 var5 = arg2.method343();
        var5.method675(super.field9477, super.field9474 + -10, super.field9475);
        class688 var6 = class556.field7917.method741(126, this.field8040);
        class282 var7 = var6.method3835(131072, (class82) null, (class426) null, this.field8032, 0, arg2, 0, (byte) -101, -1);
        if (var7 != null && (!class141.field2211 ? var7.method1010(arg0, arg1, var5, true, var6.field9756) : var7.method1023(arg0, arg1, var5, true, var6.field9756, class106.field1553))) {
            return true;
        } else {
            if (this.field8045 != -1) {
                class688 var8 = class556.field7917.method741(-44, this.field8045);
                class282 var9 = var8.method3835(131072, (class82) null, (class426) null, this.field8035, 0, arg2, 0, (byte) -101, -1);
                if (var9 != null && (!class141.field2211 ? var9.method1010(arg0, arg1, var5, true, var8.field9756) : var9.method1023(arg0, arg1, var5, true, var8.field9756, class106.field1553))) {
                    return true;
                }
            }
            int var10 = 10 / ((arg3 - -80) / 44);
            if (~this.field8026 != 0) {
                class688 var11 = class556.field7917.method741(-98, this.field8026);
                class282 var12 = var11.method3835(131072, (class82) null, (class426) null, this.field8039, 0, arg2, 0, (byte) -101, -1);
                if (var12 != null && (!class141.field2211 ? var12.method1010(arg0, arg1, var5, true, var11.field9756) : var12.method1023(arg0, arg1, var5, true, var11.field9756, class106.field1553))) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(I)V")
    public static void method3294(int arg0) {
        field8049 = null;
        field8046 = null;
        int var1 = -69 % ((arg0 - 59) / 50);
        field8047 = null;
    }

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "(ILha;)Lgh;")
    public final class48 method103(int arg0, class544 arg1) {
        ++field8030;
        class291 var3 = class210.method1524(super.field9470, super.field9477 >> class662.field9425, super.field9475 >> class662.field9425);
        if (var3 != null && var3.field4482.field7928) {
            int var4 = var3.field4482.method100((byte) -85);
            if (~this.field8031 != ~var4) {
                super.field9474 -= this.field8031;
                super.field9474 += var4;
                this.field8031 = var4;
            }
        }
        class73 var5 = arg1.method343();
        var5.method677();
        if (var3 == null || !var3.field4482.field7928) {
            boolean var6 = false;
            boolean var7 = false;
            boolean var8 = false;
            class339 var9 = class211.field3511[super.field9469];
            int var10 = this.field8037 << 1;
            int var12 = -var10 / 2;
            int var13 = -var10 / 2;
            int var14 = var9.method2162(super.field9475 + var13, 1, super.field9477 + var12);
            int var15 = var10 / 2;
            int var16 = -var10 / 2;
            int var17 = var9.method2162(super.field9475 + var16, 1, super.field9477 + var15);
            int var18 = -var10 / 2;
            int var19 = var10 / 2;
            int var20 = var9.method2162(super.field9475 + var19, 1, super.field9477 + var18);
            int var21 = var10 / 2;
            int var22 = var10 / 2;
            int var23 = var9.method2162(super.field9475 + var22, 1, super.field9477 - -var21);
            int var24 = ~var17 >= ~var14 ? var17 : var14;
            int var25 = ~var23 < ~var20 ? var20 : var23;
            int var26 = ~var17 <= ~var23 ? var23 : var17;
            int var27 = ~var20 < ~var14 ? var14 : var20;
            if (~var10 != -1) {
                int var28 = 16383 & (int) (Math.atan2((double) (-var25 + var24), (double) var10) * 2607.5945876176133D);
                if (~var28 != -1) {
                    var5.method672(var28);
                }
            }
            if (~var10 != -1) {
                int var29 = (int) (Math.atan2((double) (-var26 + var27), (double) var10) * 2607.5945876176133D) & 16383;
                if (var29 != 0) {
                    var5.method667(-var29);
                }
            }
            int var30 = var14 + var23;
            if (~(var17 + var20) > ~var30) {
                var30 = var17 + var20;
            }
            int var31 = (var30 >> 1) + -super.field9474;
            if (var31 != 0) {
                var5.method671(0, var31, 0);
            }
        }
        var5.method671(super.field9477, super.field9474 + -10, super.field9475);
        class48 var32 = class331.method2130(3, (byte) 92, true);
        this.field8029 = false;
        this.field8037 = 0;
        if (~this.field8026 != 0) {
            class282 var33 = class556.field7917.method741(arg0 + 115, this.field8026).method3835(2048, (class82) null, (class426) null, this.field8039, 0, arg1, 0, (byte) -101, -1);
            if (var33 != null) {
                if (!class141.field2211) {
                    var33.method1007(var5, var32.field795[2], 0);
                } else {
                    var33.method1026(var5, var32.field795[2], class106.field1553, 0);
                }
                this.field8029 |= var33.method1048();
                this.field8037 = var33.method1013();
            }
        }
        if (~this.field8045 != arg0) {
            class282 var34 = class556.field7917.method741(122, this.field8045).method3835(2048, (class82) null, (class426) null, this.field8035, 0, arg1, 0, (byte) -101, -1);
            if (var34 != null) {
                if (!class141.field2211) {
                    var34.method1007(var5, var32.field795[1], 0);
                } else {
                    var34.method1026(var5, var32.field795[1], class106.field1553, 0);
                }
                this.field8029 |= var34.method1048();
                if (var34.method1013() > this.field8037) {
                    this.field8037 = var34.method1013();
                }
            }
        }
        class282 var35 = class556.field7917.method741(109, this.field8040).method3835(2048, (class82) null, (class426) null, this.field8032, 0, arg1, 0, (byte) -101, -1);
        if (var35 != null) {
            if (!class141.field2211) {
                var35.method1007(var5, var32.field795[0], 0);
            } else {
                var35.method1026(var5, var32.field795[0], class106.field1553, 0);
            }
            this.field8029 |= var35.method1048();
            if (~var35.method1013() < ~this.field8037) {
                this.field8037 = var35.method1013();
            }
        }
        return var32;
    }

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "(I)I")
    public final int method2830(int arg0) {
        ++field8044;
        int var2 = -38 % ((arg0 - -25) / 41);
        class688 var3 = class556.field7917.method741(-34, this.field8040);
        int var4 = var3.field9756;
        if (~this.field8045 != 0) {
            class688 var5 = class556.field7917.method741(125, this.field8045);
            if (var4 < var5.field9756) {
                var4 = var5.field9756;
            }
        }
        if (~this.field8026 != 0) {
            class688 var6 = class556.field7917.method741(-31, this.field8026);
            if (~var4 > ~var6.field9756) {
                var4 = var6.field9756;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "(B)I")
    public final int method100(byte arg0) {
        int var2 = -85 % ((arg0 - 21) / 56);
        ++field8033;
        return -10;
    }

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "(I)Z")
    public final boolean method86(int arg0) {
        if (arg0 != 0) {
            return false;
        } else {
            ++field8043;
            return this.field8029;
        }
    }

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "(I)I")
    public final int method89(int arg0) {
        ++field8041;
        int var2 = 108 % ((17 - arg0) / 61);
        return this.field8037;
    }

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "(II)I")
    public static final int method3295(int arg0, int arg1) {
        return class233.field3752 != null ? class233.field3752[arg0][arg1] & 65535 : 0;
    }
}
