import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ek")
public class class564 extends class335 {

    @OriginalMember(owner = "client!ek", name = "B", descriptor = "I")
    private int field7688 = 0;

    @OriginalMember(owner = "client!ek", name = "H", descriptor = "I")
    private int field7694 = 10;

    @OriginalMember(owner = "client!ek", name = "M", descriptor = "I")
    private int field7699 = 2048;

    @OriginalMember(owner = "client!ek", name = "E", descriptor = "I")
    public static int field7691 = 0;

    @OriginalMember(owner = "client!ek", name = "C", descriptor = "I")
    public static int field7689;

    @OriginalMember(owner = "client!ek", name = "D", descriptor = "I")
    public static int field7690;

    @OriginalMember(owner = "client!ek", name = "F", descriptor = "I")
    public static int field7692;

    @OriginalMember(owner = "client!ek", name = "I", descriptor = "I")
    public static int field7695;

    @OriginalMember(owner = "client!ek", name = "K", descriptor = "I")
    public static int field7697;

    @OriginalMember(owner = "client!ek", name = "N", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!ek", name = "J", descriptor = "Lib;")
    public static class14 field7696;

    @OriginalMember(owner = "client!ek", name = "G", descriptor = "[I")
    private int[] field7693;

    @OriginalMember(owner = "client!ek", name = "L", descriptor = "[I")
    private int[] field7698;

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(BIIIIIIII)V", line = 12)
    public static final void method3129(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int var9 = -122 % ((-66 - arg0) / 51);
        ++field7690;
        if (class60.method341(arg7, 0)) {
            if (class651.field9139[arg7] == null) {
                class86.method473(arg6, arg2, arg1, arg3, -1, arg4, class124.field1729[arg7], arg8, 32092, arg5);
            } else {
                class86.method473(arg6, arg2, arg1, arg3, -1, arg4, class651.field9139[arg7], arg8, 32092, arg5);
            }
        } else if (~arg5 != 0) {
            class325.field4383[arg5] = true;
        } else {
            for (int var10 = 0; var10 < 100; ++var10) {
                class325.field4383[var10] = true;
            }
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(B)V", line = 44)
    public final void method317(byte arg0) {
        ++field7695;
        this.method3132((byte) 72);
        int var2 = 66 / ((arg0 - 58) / 60);
    }

    @OriginalMember(owner = "client!ek", name = "<init>", descriptor = "()V", line = 286)
    public class564() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ek", name = "d", descriptor = "(I)V", line = 57)
    public static void method3130(int arg0) {
        field7696 = null;
        if (arg0 <= 117) {
            method3130(57);
        }
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ILio;I)V", line = 67)
    public final void method2(int arg0, class157 arg1, int arg2) {
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field7688 = arg1.method930(255);
                }
            } else {
                this.field7699 = arg1.method963(-126);
            }
        } else {
            this.field7694 = arg1.method930(255);
        }
        if (arg2 != -66) {
            this.method3(false, 47);
        }
        ++field7692;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "([BB)[B", line = 112)
    public static final byte[] method3131(byte[] arg0, byte arg1) {
        ++field7689;
        if (arg0 == null) {
            return null;
        } else if (arg1 >= -16) {
            return null;
        } else {
            byte[] var2 = new byte[arg0.length];
            class2.method9(arg0, 0, var2, 0, arg0.length);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ek", name = "c", descriptor = "(B)V", line = 133)
    private final void method3132(byte arg0) {
        ++field7700;
        this.field7698 = new int[this.field7694 + 1];
        this.field7693 = new int[this.field7694 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field7694;
        int var4 = this.field7699 * var3 >> 12;
        for (int var5 = 0; ~this.field7694 < ~var5; ++var5) {
            this.field7693[var5] = var2;
            this.field7698[var5] = var2 - -var4;
            var2 += var3;
        }
        if (arg0 != 72) {
            this.field7694 = -33;
        }
        this.field7693[this.field7694] = 4096;
        this.field7698[this.field7694] = this.field7698[0] + 4096;
    }

    @OriginalMember(owner = "client!ek", name = "a", descriptor = "(ZI)[I", line = 164)
    public final int[] method3(boolean arg0, int arg1) {
        ++field7697;
        int[] var3 = super.field4525.method2344(-2, arg1);
        if (super.field4525.field5435) {
            int var4 = class686.field9697[arg1];
            if (~this.field7688 == -1) {
                short var5 = 0;
                for (int var6 = 0; var6 < this.field7694; ++var6) {
                    if (~this.field7693[var6] >= ~var4 && ~this.field7693[var6 + 1] < ~var4) {
                        if (~var4 > ~this.field7698[var6]) {
                            var5 = 4096;
                        }
                        break;
                    }
                }
                class2.method8(var3, 0, class649.field8968, var5);
            } else {
                for (int var7 = 0; var7 < class649.field8968; ++var7) {
                    int var8 = 0;
                    short var9 = 0;
                    int var10 = class376.field4981[var7];
                    int var11 = this.field7688;
                    if (var11 != 1) {
                        if (~var11 != -3) {
                            if (~var11 == -4) {
                                var8 = (-var4 + var10 >> 1) + 2048;
                            }
                        } else {
                            var8 = (var10 - (-var4 + 4096) >> 1) + 2048;
                        }
                    } else {
                        var8 = var10;
                    }
                    for (int var12 = 0; ~var12 > ~this.field7694; ++var12) {
                        if (~this.field7693[var12] >= ~var8 && ~this.field7693[var12 + 1] < ~var8) {
                            if (~this.field7698[var12] < ~var8) {
                                var9 = 4096;
                            }
                            break;
                        }
                    }
                    var3[var7] = var9;
                }
            }
        }
        if (!arg0) {
            method3130(6);
        }
        return var3;
    }
}
