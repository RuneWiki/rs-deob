import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class120 extends class184 {

    @OriginalMember(owner = "client!wp", name = "D", descriptor = "I")
    private int field1617 = 0;

    @OriginalMember(owner = "client!wp", name = "F", descriptor = "I")
    private int field1619 = 4096;

    @OriginalMember(owner = "client!wp", name = "K", descriptor = "Lat;")
    public static class257 field1623 = new class257(0, 0);

    @OriginalMember(owner = "client!wp", name = "E", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!wp", name = "H", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!wp", name = "I", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!wp", name = "J", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!wp", name = "L", descriptor = "Luf;")
    public static class313 field1624;

    // $FF: synthetic field
    @OriginalMember(owner = "client!wp", name = "M", descriptor = "Ljava/lang/Class;")
    public static Class field1625;

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "()V")
    public class120() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(B)V")
    public static void method865(byte arg0) {
        field1623 = null;
        field1624 = null;
        int var1 = -8 / ((-46 - arg0) / 40);
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(II)[I")
    public final int[] method6(int arg0, int arg1) {
        if (arg1 != 578) {
            this.field1617 = 30;
        }
        ++field1620;
        int[] var3 = super.field2409.method248(arg0, 16776960);
        if (super.field2409.field436) {
            int[] var4 = this.method1159(114, arg0, 0);
            for (int var5 = 0; ~class245.field3167 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~this.field1617 >= ~var6) {
                    if (~this.field1619 > ~var6) {
                        var3[var5] = this.field1619;
                    } else {
                        var3[var5] = var6;
                    }
                } else {
                    var3[var5] = this.field1617;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(BILfh;)V")
    public final void method7(byte arg0, int arg1, class463 arg2) {
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    super.field2406 = ~arg2.method2737(false) == -2;
                }
            } else {
                this.field1619 = arg2.method2758((byte) 120);
            }
        } else {
            this.field1617 = arg2.method2758((byte) 94);
        }
        int var5 = -91 / ((-13 - arg0) / 51);
        ++field1621;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIII)Z")
    public static final boolean method866(int arg0, int arg1, int arg2, int arg3) {
        ++field1622;
        if (arg1 >= -68) {
            method865((byte) -41);
        }
        class41 var4 = (class41) class20.method173(arg2, arg3, arg0);
        boolean var5 = true;
        if (var4 != null) {
            var5 &= class92.method714(var4, -125);
        }
        class41 var6 = (class41) class212.method1314(arg2, arg3, arg0, field1625 != null ? field1625 : (field1625 = method867("fw")));
        if (var6 != null) {
            var5 &= class92.method714(var6, -124);
        }
        class41 var7 = (class41) class238.method1430(arg2, arg3, arg0);
        if (var7 != null) {
            var5 &= class92.method714(var7, -124);
        }
        return var5;
    }

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "(II)[[I")
    public final int[][] method13(int arg0, int arg1) {
        ++field1618;
        int[][] var3 = super.field2416.method3031(-28526, arg0);
        if (arg1 != 1) {
            field1624 = null;
        }
        if (super.field2416.field7271) {
            int[][] var4 = this.method1163(1, arg0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class245.field3167; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 >= this.field1617) {
                    if (var12 > this.field1619) {
                        var8[var11] = this.field1619;
                    } else {
                        var8[var11] = var12;
                    }
                } else {
                    var8[var11] = this.field1617;
                }
                if (var13 >= this.field1617) {
                    if (~this.field1619 > ~var13) {
                        var9[var11] = this.field1619;
                    } else {
                        var9[var11] = var13;
                    }
                } else {
                    var9[var11] = this.field1617;
                }
                if (~this.field1617 < ~var14) {
                    var10[var11] = this.field1617;
                } else if (~this.field1619 <= ~var14) {
                    var10[var11] = var14;
                } else {
                    var10[var11] = this.field1619;
                }
            }
        }
        return var3;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method867(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
