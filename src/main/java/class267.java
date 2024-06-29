import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class267 extends class34 {

    @OriginalMember(owner = "client!mo", name = "M", descriptor = "I")
    private int field3594 = 4096;

    @OriginalMember(owner = "client!mo", name = "P", descriptor = "I")
    private int field3597 = 0;

    @OriginalMember(owner = "client!mo", name = "F", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!mo", name = "I", descriptor = "Z")
    public static boolean field3590;

    @OriginalMember(owner = "client!mo", name = "C", descriptor = "I")
    public static int field3585;

    @OriginalMember(owner = "client!mo", name = "D", descriptor = "I")
    public static int field3586;

    @OriginalMember(owner = "client!mo", name = "E", descriptor = "I")
    public static int field3587;

    @OriginalMember(owner = "client!mo", name = "H", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!mo", name = "J", descriptor = "I")
    public static int field3591;

    @OriginalMember(owner = "client!mo", name = "K", descriptor = "I")
    public static int field3592;

    @OriginalMember(owner = "client!mo", name = "L", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!mo", name = "N", descriptor = "I")
    public static int field3595;

    @OriginalMember(owner = "client!mo", name = "O", descriptor = "I")
    public static int field3596;

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(BI)[[I")
    public final int[][] method66(byte arg0, int arg1) {
        if (arg0 != -11) {
            return null;
        } else {
            ++field3586;
            int[][] var3 = super.field536.method337(arg1, (byte) 75);
            if (super.field536.field726) {
                int[][] var4 = this.method254(0, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; var11 < class383.field5502; ++var11) {
                    int var12 = var5[var11];
                    int var13 = var6[var11];
                    int var14 = var7[var11];
                    if (~this.field3597 >= ~var12) {
                        if (var12 <= this.field3594) {
                            var8[var11] = var12;
                        } else {
                            var8[var11] = this.field3594;
                        }
                    } else {
                        var8[var11] = this.field3597;
                    }
                    if (~var13 <= ~this.field3597) {
                        if (~var13 < ~this.field3594) {
                            var9[var11] = this.field3594;
                        } else {
                            var9[var11] = var13;
                        }
                    } else {
                        var9[var11] = this.field3597;
                    }
                    if (~this.field3597 < ~var14) {
                        var10[var11] = this.field3597;
                    } else if (~this.field3594 <= ~var14) {
                        var10[var11] = var14;
                    } else {
                        var10[var11] = this.field3594;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1573(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class449[] var7 = class413.field5884;
        for (int var8 = 0; var8 < var7.length; ++var8) {
            class449 var9 = var7[var8];
            if (var9 != null && var9.field6572 == 2) {
                class234.method1429((byte) -84, arg3, var9.field6573, arg4, arg0 >> 1, var9.field6574, var9.field6571, arg5 >> 1, var9.field6578 * 2);
                if (class385.field5520[0] > -1 && class28.field417 % 20 < 10) {
                    class443.field6382[var9.field6577].method2142(class385.field5520[0] + arg2 - 12, class385.field5520[1] + arg1 - 28);
                }
            }
        }
        ++field3593;
        if (arg6 > -30) {
            field3596 = -94;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field3587;
        int var3 = 31 % (-arg1 / 50);
        int[] var4 = super.field537.method1780(arg0, (byte) 120);
        if (super.field537.field4191) {
            int[] var5 = this.method252(false, arg0, 0);
            for (int var6 = 0; class383.field5502 > var6; ++var6) {
                int var7 = var5[var6];
                if (var7 >= this.field3597) {
                    if (var7 > this.field3594) {
                        var4[var6] = this.field3594;
                    } else {
                        var4[var6] = var7;
                    }
                } else {
                    var4[var6] = this.field3597;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(Z)V")
    public static final void method1574(boolean arg0) {
        if (arg0) {
            field3595 = -127;
        }
        ++field3589;
        if (class100.field1592 != null) {
            if (class100.field1592.field6699 == 1) {
                class100.field1592 = null;
                return;
            }
            if (class100.field1592.field6699 == 2) {
                class494.method2921((byte) -17, class266.field3575, 2, class467.field6761);
                class100.field1592 = null;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!mo", name = "<init>", descriptor = "()V")
    public class267() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(Lsv;II)V")
    public final void method69(class319 arg0, int arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -3) {
                    super.field533 = arg0.method1869(-65) == 1;
                }
            } else {
                this.field3594 = arg0.method1844(-109);
            }
        } else {
            this.field3597 = arg0.method1844(-109);
        }
        ++field3585;
        if (arg1 <= 16) {
            method1573(40, 105, 118, 27, -64, -121, -41);
        }
    }

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "(III)Z")
    public static final boolean method1575(int arg0, int arg1, int arg2) {
        ++field3592;
        if (arg2 != -418764735) {
            method1573(97, 10, 8, -94, -27, 85, -9);
        }
        return (class502.method2981(arg1, arg0, arg2 + 418764757) | class373.method2234(arg0, arg1, -27219) | class124.method900(arg1, 52, arg0)) & class411.method2413(arg0, (byte) -19, arg1);
    }

    static {
        new class157("The channel you tried to join does not exist.", "Der von dir gewünschte Chatraum existiert nicht.", "Le canal que vous essayez de rejoindre n'existe pas.", "O canal que você tentou acessar não existe.");
        field3588 = 1;
        field3590 = false;
    }
}
