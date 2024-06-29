import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 extends class264 {

    @OriginalMember(owner = "client!i", name = "J", descriptor = "I")
    private int field927 = 0;

    @OriginalMember(owner = "client!i", name = "U", descriptor = "I")
    private int field938 = 4096;

    @OriginalMember(owner = "client!i", name = "O", descriptor = "Z")
    public static boolean field932 = false;

    @OriginalMember(owner = "client!i", name = "K", descriptor = "Lcf;")
    public static class93 field928 = class147.method1066("", -48);

    @OriginalMember(owner = "client!i", name = "N", descriptor = "Lcf;")
    public static class93 field931 = class147.method1066("Fermer", -48);

    @OriginalMember(owner = "client!i", name = "V", descriptor = "I")
    public static volatile int field939 = 0;

    @OriginalMember(owner = "client!i", name = "L", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!i", name = "P", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!i", name = "Q", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!i", name = "R", descriptor = "I")
    public static int field935;

    @OriginalMember(owner = "client!i", name = "S", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!i", name = "T", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!i", name = "M", descriptor = "Lwh;")
    public static class193 field930;

    @OriginalMember(owner = "client!i", name = "<init>", descriptor = "()V")
    public class56() {
        super(1, false);
    }

    @OriginalMember(owner = "client!i", name = "f", descriptor = "(I)V")
    public static void method315(int arg0) {
        field930 = null;
        field928 = null;
        field931 = null;
        if (arg0 != 1) {
            field928 = null;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IIIZ[Ltg;Z)V")
    public static final void method316(int arg0, int arg1, int arg2, boolean arg3, class181[] arg4, boolean arg5) {
        if (arg3) {
            field930 = null;
        }
        for (int var6 = 0; ~var6 > ~arg4.length; ++var6) {
            class181 var7 = arg4[var6];
            if (var7 != null && ~var7.field3321 == ~arg1) {
                class166.method1204(var7, arg2, -1, arg5, arg0);
                class161.method1163(124, arg2, arg0, var7);
                if (var7.field3282 > var7.field3334 - var7.field3252) {
                    var7.field3282 = -var7.field3252 + var7.field3334;
                }
                if (~var7.field3282 > -1) {
                    var7.field3282 = 0;
                }
                if (-var7.field3270 + var7.field3184 < var7.field3310) {
                    var7.field3310 = -var7.field3270 + var7.field3184;
                }
                if (var7.field3310 < 0) {
                    var7.field3310 = 0;
                }
                if (~var7.field3289 == -1) {
                    class32.method192(var7, arg5, -1);
                }
            }
        }
        ++field934;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IILee;)V")
    public final void method20(int arg0, int arg1, class280 arg2) {
        ++field935;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 == 2) {
                    super.field4698 = arg2.method1907(16832) == 1;
                }
            } else {
                this.field938 = arg2.method1891(-126);
            }
        } else {
            this.field927 = arg2.method1891(-115);
        }
        if (arg0 < 11) {
            method315(-111);
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method17(int arg0, boolean arg1) {
        ++field929;
        if (arg1) {
            this.field938 = -117;
        }
        int[][] var3 = super.field4705.method1089(arg0, 91);
        if (super.field4705.field2670) {
            int[][] var4 = this.method1773(-128, 0, arg0);
            int[] var5 = var4[2];
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var3[0];
            for (int var11 = 0; var11 < class176.field3060; ++var11) {
                int var12 = var6[var11];
                int var13 = var7[var11];
                int var14 = var5[var11];
                if (~var12 <= ~this.field927) {
                    if (~var12 >= ~this.field938) {
                        var10[var11] = var12;
                    } else {
                        var10[var11] = this.field938;
                    }
                } else {
                    var10[var11] = this.field927;
                }
                if (var13 >= this.field927) {
                    if (var13 <= this.field938) {
                        var8[var11] = var13;
                    } else {
                        var8[var11] = this.field938;
                    }
                } else {
                    var8[var11] = this.field927;
                }
                if (var14 >= this.field927) {
                    if (var14 > this.field938) {
                        var9[var11] = this.field938;
                    } else {
                        var9[var11] = var14;
                    }
                } else {
                    var9[var11] = this.field927;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field933;
        if (arg1 > -83) {
            this.method20(47, 112, (class280) null);
        }
        int[] var3 = super.field4716.method532((byte) 126, arg0);
        if (super.field4716.field1424) {
            int[] var4 = this.method1767(0, arg0, 21654);
            for (int var5 = 0; ~class176.field3060 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (~var6 > ~this.field927) {
                    var3[var5] = this.field927;
                } else if (~this.field938 <= ~var6) {
                    var3[var5] = var6;
                } else {
                    var3[var5] = this.field938;
                }
            }
        }
        return var3;
    }
}
