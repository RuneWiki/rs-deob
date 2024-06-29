import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class145 extends class787 {

    @OriginalMember(owner = "client!mc", name = "Y", descriptor = "I")
    public int field1963 = -1;

    @OriginalMember(owner = "client!mc", name = "Q", descriptor = "I")
    public int field1955 = -1;

    @OriginalMember(owner = "client!mc", name = "V", descriptor = "I")
    private int field1960 = 0;

    @OriginalMember(owner = "client!mc", name = "X", descriptor = "I")
    public int field1962 = 0;

    @OriginalMember(owner = "client!mc", name = "S", descriptor = "Z")
    private boolean field1957 = false;

    @OriginalMember(owner = "client!mc", name = "Z", descriptor = "Z")
    public static boolean field1964 = false;

    @OriginalMember(owner = "client!mc", name = "J", descriptor = "Lqj;")
    public static class535 field1948 = new class535(8);

    @OriginalMember(owner = "client!mc", name = "K", descriptor = "I")
    public int field1949;

    @OriginalMember(owner = "client!mc", name = "L", descriptor = "I")
    public int field1950;

    @OriginalMember(owner = "client!mc", name = "M", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!mc", name = "N", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!mc", name = "O", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!mc", name = "P", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!mc", name = "R", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!mc", name = "T", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!mc", name = "U", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!mc", name = "W", descriptor = "I")
    public int field1961;

    @OriginalMember(owner = "client!mc", name = "ab", descriptor = "I")
    public static int field1965;

    @OriginalMember(owner = "client!mc", name = "bb", descriptor = "I")
    public static int field1966;

    @OriginalMember(owner = "client!mc", name = "cb", descriptor = "I")
    public static int field1967;

    @OriginalMember(owner = "client!mc", name = "db", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!mc", name = "eb", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!mc", name = "fb", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "(I)Z", line = 8)
    public final boolean method769(int arg0) {
        if (arg0 > -70) {
            this.field1962 = 6;
        }
        ++field1959;
        return false;
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(Lha;B)Lpia;", line = 21)
    public final class104 method114(class66 arg0, byte arg1) {
        ++field1966;
        class511 var3 = class268.method1788(super.field2813, super.field2802 >> class478.field6717, super.field2810 >> class478.field6717);
        class629 var4 = class257.method1754(super.field2813, super.field2802 >> class478.field6717, super.field2810 >> class478.field6717);
        int var5 = 0;
        if (var3 != null && var3.field7126.field7456) {
            var5 = var3.field7126.method774((byte) 115);
        }
        if (var4 != null && ~var4.field8518 < ~(-var5)) {
            var5 = -var4.field8518;
        }
        if (this.field1962 != var5) {
            super.field2815 -= this.field1962;
            this.field1962 = var5;
            super.field2815 += var5;
        }
        class109 var6 = arg0.method475();
        var6.method822();
        if (this.field1962 == 0) {
            boolean var7 = false;
            boolean var8 = false;
            boolean var9 = false;
            class295 var10 = class645.field8694[super.field2809];
            int var11 = this.field1960 << 1;
            int var13 = -var11 / 2;
            int var14 = -var11 / 2;
            int var15 = var10.method1895(super.field2802 + var13, super.field2810 + var14, 99);
            int var16 = var11 / 2;
            int var17 = -var11 / 2;
            int var18 = var10.method1895(super.field2802 + var16, super.field2810 + var17, arg1 ^ 82);
            int var19 = -var11 / 2;
            int var20 = var11 / 2;
            int var21 = var10.method1895(super.field2802 + var19, super.field2810 - -var20, 123);
            int var22 = var11 / 2;
            int var23 = var11 / 2;
            int var24 = var10.method1895(super.field2802 + var22, super.field2810 + var23, 93);
            int var25 = ~var15 > ~var18 ? var15 : var18;
            int var26 = ~var24 < ~var21 ? var21 : var24;
            int var27 = ~var24 >= ~var18 ? var24 : var18;
            if (~var11 != -1) {
                int var28 = 16383 & (int) (2607.5945876176133D * Math.atan2((double) (var25 - var26), (double) var11));
                if (var28 != 0) {
                    var6.method811(var28);
                }
            }
            int var29 = var21 <= var15 ? var21 : var15;
            if (var11 != 0) {
                int var30 = (int) (Math.atan2((double) (var29 - var27), (double) var11) * 2607.5945876176133D) & 16383;
                if (~var30 != -1) {
                    var6.method824(-var30);
                }
            }
            int var31 = var15 + var24;
            if (var18 + var21 < var31) {
                var31 = var18 - -var21;
            }
            int var32 = (var31 >> 1) + -super.field2815;
            if (var32 != 0) {
                var6.method818(0, var32, 0);
            }
        }
        var6.method818(super.field2802, super.field2815 + -10, super.field2810);
        if (arg1 != 115) {
            field1964 = true;
        }
        class104 var33 = class568.method3241(3, (byte) 46, true);
        this.field1957 = false;
        this.field1960 = 0;
        if (~this.field1963 != 0) {
            class497 var34 = class16.field156.method2121(this.field1963, 25928).method2309(arg0, (class201) null, (class317) null, -1, 0, 101, this.field1968, 2048, 0);
            if (var34 != null) {
                if (class408.field5786) {
                    var34.method258(var6, var33.field1479[2], class72.field972, 0);
                } else {
                    var34.method254(var6, var33.field1479[2], 0);
                }
                this.field1957 |= var34.method272();
                this.field1960 = var34.method264();
            }
        }
        if (~this.field1955 != 0) {
            class497 var35 = class16.field156.method2121(this.field1955, arg1 + 25813).method2309(arg0, (class201) null, (class317) null, -1, 0, 104, this.field1961, 2048, 0);
            if (var35 != null) {
                if (!class408.field5786) {
                    var35.method254(var6, var33.field1479[1], 0);
                } else {
                    var35.method258(var6, var33.field1479[1], class72.field972, 0);
                }
                this.field1957 |= var35.method272();
                if (~var35.method264() < ~this.field1960) {
                    this.field1960 = var35.method264();
                }
            }
        }
        class497 var36 = class16.field156.method2121(this.field1950, arg1 + 25813).method2309(arg0, (class201) null, (class317) null, -1, 0, arg1 ^ 14, this.field1949, 2048, 0);
        if (var36 != null) {
            if (!class408.field5786) {
                var36.method254(var6, var33.field1479[0], 0);
            } else {
                var36.method258(var6, var33.field1479[0], class72.field972, 0);
            }
            this.field1957 |= var36.method272();
            if (var36.method264() > this.field1960) {
                this.field1960 = var36.method264();
            }
        }
        return var33;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III[B)I", line = 197)
    public static final int method1013(int arg0, int arg1, int arg2, byte[] arg3) {
        ++field1965;
        int var4 = arg2;
        for (int var5 = arg0; ~var5 > ~arg1; ++var5) {
            var4 = class640.field8633[255 & (arg3[var5] ^ var4)] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(Lha;B)Lln;", line = 218)
    public final class398 method119(class66 arg0, byte arg1) {
        if (arg1 > -35) {
            method1015(105);
        }
        ++field1956;
        return null;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Z)V", line = 230)
    public static final void method1014(boolean arg0) {
        if (class780.field10712 == 9) {
            class170.method1148(5, -11239);
        } else if (class780.field10712 != 5 && class780.field10712 != 6) {
            if (~class780.field10712 == -13) {
                class170.method1148(3, -11239);
            }
        } else {
            class170.method1148(3, -11239);
        }
        ++field1969;
        if (arg0) {
            method1014(false);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 258)
    public static void method1015(int arg0) {
        if (arg0 != 3) {
            method1014(true);
        }
        field1948 = null;
    }

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "(I)Z", line = 268)
    public final boolean method777(int arg0) {
        int var2 = 42 % ((arg0 - -34) / 59);
        ++field1951;
        return this.field1957;
    }

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "(Lha;B)V", line = 279)
    public final void method131(class66 arg0, byte arg1) {
        ++field1954;
        if (arg1 != 53) {
            method1013(34, -91, -115, (byte[]) null);
        }
    }

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "(Z)I", line = 290)
    public final int method767(boolean arg0) {
        ++field1958;
        if (arg0) {
            this.method767(false);
        }
        return this.field1960;
    }

    @OriginalMember(owner = "client!mc", name = "<init>", descriptor = "(IIIII)V", line = 301)
    public class145(int arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Z", line = 319)
    public static final boolean method1016(int arg0, int arg1, int arg2) {
        if (arg2 <= 49) {
            field1948 = null;
        }
        ++field1952;
        return (arg0 & 458752) != 0 | class220.method1410(-107, arg1, arg0) || class429.method2579(arg1, arg0, (byte) 18);
    }

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "(B)I", line = 334)
    public final int method117(byte arg0) {
        ++field1967;
        class369 var2 = class16.field156.method2121(this.field1950, 25928);
        if (arg0 <= 105) {
            this.field1961 = -51;
        }
        int var3 = var2.field5360;
        if (this.field1955 != -1) {
            class369 var4 = class16.field156.method2121(this.field1955, 25928);
            if (~var4.field5360 < ~var3) {
                var3 = var4.field5360;
            }
        }
        if (this.field1963 != -1) {
            class369 var5 = class16.field156.method2121(this.field1963, 25928);
            if (var3 < var5.field5360) {
                var3 = var5.field5360;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "(B)I", line = 377)
    public final int method774(byte arg0) {
        ++field1970;
        if (arg0 != 115) {
            this.method119((class66) null, (byte) 8);
        }
        return -10;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILha;II)Z", line = 391)
    public final boolean method122(int arg0, class66 arg1, int arg2, int arg3) {
        ++field1953;
        class109 var5 = arg1.method475();
        var5.method814(super.field2802, super.field2815 + -10, super.field2810);
        class369 var6 = class16.field156.method2121(this.field1950, 25928);
        if (arg2 != 6238) {
            return false;
        } else {
            class497 var7 = var6.method2309(arg1, (class201) null, (class317) null, -1, 0, 127, this.field1949, 131072, 0);
            if (var7 != null && (class408.field5786 ? var7.method245(arg0, arg3, var5, true, var6.field5360, class72.field972) : var7.method248(arg0, arg3, var5, true, var6.field5360))) {
                return true;
            } else {
                if (this.field1955 != -1) {
                    class369 var8 = class16.field156.method2121(this.field1955, 25928);
                    class497 var9 = var8.method2309(arg1, (class201) null, (class317) null, -1, 0, 93, this.field1961, 131072, 0);
                    if (var9 != null && (class408.field5786 ? var9.method245(arg0, arg3, var5, true, var8.field5360, class72.field972) : var9.method248(arg0, arg3, var5, true, var8.field5360))) {
                        return true;
                    }
                }
                if (~this.field1963 != 0) {
                    class369 var10 = class16.field156.method2121(this.field1963, 25928);
                    class497 var11 = var10.method2309(arg1, (class201) null, (class317) null, -1, 0, 93, this.field1968, 131072, 0);
                    if (var11 != null && (class408.field5786 ? var11.method245(arg0, arg3, var5, true, var10.field5360, class72.field972) : var11.method248(arg0, arg3, var5, true, var10.field5360))) {
                        return true;
                    }
                }
                return false;
            }
        }
    }
}
