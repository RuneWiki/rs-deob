import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class384 extends class227 {

    @OriginalMember(owner = "client!nd", name = "H", descriptor = "[I")
    private int[] field5582 = new int[3];

    @OriginalMember(owner = "client!nd", name = "M", descriptor = "I")
    private int field5587 = 4096;

    @OriginalMember(owner = "client!nd", name = "N", descriptor = "I")
    private int field5588 = 409;

    @OriginalMember(owner = "client!nd", name = "G", descriptor = "I")
    private int field5581 = 4096;

    @OriginalMember(owner = "client!nd", name = "K", descriptor = "I")
    private int field5585 = 4096;

    @OriginalMember(owner = "client!nd", name = "L", descriptor = "I")
    public static int field5586;

    @OriginalMember(owner = "client!nd", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field5591;

    @OriginalMember(owner = "client!nd", name = "I", descriptor = "I")
    public static int field5583;

    @OriginalMember(owner = "client!nd", name = "J", descriptor = "I")
    public static int field5584;

    @OriginalMember(owner = "client!nd", name = "O", descriptor = "I")
    public static int field5589;

    @OriginalMember(owner = "client!nd", name = "R", descriptor = "I")
    public static int field5592;

    @OriginalMember(owner = "client!nd", name = "P", descriptor = "Lsv;")
    public static class472 field5590;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIZILur;[BI)Lal;")
    public static final class67 method2336(int arg0, int arg1, int arg2, boolean arg3, int arg4, class377 arg5, byte[] arg6, int arg7) {
        int var8 = 59 / ((-31 - arg7) / 40);
        ++field5584;
        if (!arg5.field5397 && (!class119.method713(arg2, -126) || !class119.method713(arg0, 88))) {
            return arg5.field5374 ? new class67(arg5, 34037, arg1, arg2, arg0, arg3, arg6, arg4) : new class67(arg5, arg1, arg2, arg0, class111.method682(25, arg2), class111.method682(-125, arg0), arg6, arg4);
        } else {
            return new class67(arg5, 3553, arg1, arg2, arg0, arg3, arg6, arg4);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lug;II)V")
    public final void method61(class396 arg0, int arg1, int arg2) {
        if (arg1 != 487215116) {
            this.field5588 = -81;
        }
        ++field5589;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 == 4) {
                            int var5 = arg0.method2396((byte) 71);
                            this.field5582[1] = class95.method534(65280, var5) >> 4;
                            this.field5582[0] = class95.method534(var5 << 4, 267386880);
                            this.field5582[2] = class95.method534(var5, 255) >> 12;
                        }
                    } else {
                        this.field5587 = arg0.method2386(-23648);
                    }
                } else {
                    this.field5581 = arg0.method2386(arg1 + -487238764);
                }
            } else {
                this.field5585 = arg0.method2386(-23648);
            }
        } else {
            this.field5588 = arg0.method2386(-23648);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lqr;B)Z")
    public static final boolean method2337(class48 arg0, byte arg1) {
        ++field5592;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field499) {
            return false;
        } else if (!arg0.method271(class416.field5985, (byte) -83)) {
            return false;
        } else if (class419.field6085.method295((long) arg0.field504, -103) != null) {
            return false;
        } else if (class435.field6351.method295((long) arg0.field512, -125) != null) {
            return false;
        } else {
            return arg1 > -127 ? true : true;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method2338(byte arg0) {
        field5591 = null;
        field5590 = null;
        if (arg0 != 5) {
            field5591 = null;
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method112(int arg0, boolean arg1) {
        ++field5583;
        int[][] var3 = super.field3059.method28((byte) 111, arg0);
        if (super.field3059.field57) {
            int[][] var4 = this.method1460(arg0, 0, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class446.field6486 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field5582[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field5588 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field5582[1] + var14;
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var15 > this.field5588) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = var16 - this.field5582[2];
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (~var17 < ~this.field5588) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field5587 * var12 >> 12;
                            var9[var11] = this.field5581 * var14 >> 12;
                            var10[var11] = this.field5585 * var16 >> 12;
                        }
                    }
                }
            }
        }
        if (!arg1) {
            method2336(-71, 33, -35, true, -113, (class377) null, (byte[]) null, 33);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    public class384() {
        super(1, false);
    }

    static {
        new class305("You do not have permission to kick this user.", "Du darfst diesen Benutzer nicht rauswerfen.", "Vous n'êtes pas autorisé à expulser cet utilisateur.", "Você não tem permissão para expulsar este usuário.");
        field5586 = 0;
        field5591 = new String[100];
    }
}
