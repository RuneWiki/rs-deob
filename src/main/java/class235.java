import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class235 extends class666 {

    @OriginalMember(owner = "client!fc", name = "D", descriptor = "I")
    private int field2987 = 20;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    private int field2993 = 1365;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    private int field2996 = 0;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    private int field2994 = 0;

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    public static int field2991 = 4;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "Z")
    public static boolean field2992 = false;

    @OriginalMember(owner = "client!fc", name = "E", descriptor = "I")
    public static int field2988;

    @OriginalMember(owner = "client!fc", name = "G", descriptor = "I")
    public static int field2989;

    @OriginalMember(owner = "client!fc", name = "H", descriptor = "I")
    public static int field2990;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field2995;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public static int field2997;

    @OriginalMember(owner = "client!fc", name = "P", descriptor = "I")
    public static int field2998;

    @OriginalMember(owner = "client!fc", name = "Q", descriptor = "I")
    public static int field2999;

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class235() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(Lnq;[[BB)V")
    public static final void method1362(class420 arg0, byte[][] arg1, byte arg2) {
        ++field2999;
        for (int var3 = 0; ~arg0.field6373 < ~var3; ++var3) {
            class73.method470((byte) 84);
            for (int var4 = 0; var4 < class399.field5338 >> 3; ++var4) {
                for (int var5 = 0; var5 < class349.field4567 >> 3; ++var5) {
                    int var6 = class4.field30[var3][var4][var5];
                    if (~var6 != 0) {
                        int var7 = (58477231 & var6) >> 24;
                        if (!arg0.field6377 || var7 == 0) {
                            int var8 = (6 & var6) >> 1;
                            int var9 = var6 >> 14 & 1023;
                            int var10 = 2047 & var6 >> 3;
                            int var11 = (var9 / 8 << 8) + var10 / 8;
                            for (int var12 = 0; var12 < class287.field3696.length; ++var12) {
                                if (class287.field3696[var12] == var11 && arg1[var12] != null) {
                                    arg0.method2272((var10 & 7) * 8, 77, var7, (7 & var9) * 8, var8, class453.field6284, arg1[var12], class475.field6919, var4 * 8, var5 * 8, var3);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg2 != 0) {
            field2992 = false;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IZ)I")
    public static final int method1363(int arg0, boolean arg1) {
        ++field2988;
        return !arg1 ? -102 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(I[BBI)[B")
    public static final byte[] method1364(int arg0, byte[] arg1, byte arg2, int arg3) {
        ++field2989;
        byte[] var4;
        if (arg3 <= 0) {
            var4 = arg1;
        } else {
            var4 = new byte[arg0];
            for (int var5 = 0; arg0 > var5; ++var5) {
                var4[var5] = arg1[arg3 + var5];
            }
        }
        class469 var6 = new class469();
        var6.method2661(arg2 ^ -33);
        var6.method2657((long) (arg0 * 8), var4, (byte) 124);
        if (arg2 != 14) {
            field2997 = 37;
        }
        byte[] var7 = new byte[64];
        var6.method2656(0, var7, arg2 + -4430);
        return var7;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ILiaa;Z)V")
    public final void method121(int arg0, class452 arg1, boolean arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        this.field2994 = arg1.method2574(-1758460248);
                    }
                } else {
                    this.field2996 = arg1.method2574(-1758460248);
                }
            } else {
                this.field2987 = arg1.method2574(-1758460248);
            }
        } else {
            this.field2993 = arg1.method2574(-1758460248);
        }
        if (!arg2) {
            method1364(-80, (byte[]) null, (byte) -115, -123);
        }
        ++field2990;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(II)[I")
    public final int[] method122(int arg0, int arg1) {
        ++field2995;
        int[] var3 = super.field9466.method1811(arg1, 24);
        if (super.field9466.field4172) {
            for (int var4 = 0; ~var4 > ~class501.field7222; ++var4) {
                int var5 = (class579.field8246[var4] << 12) / this.field2993 + this.field2996;
                int var6 = (class476.field6935[arg1] << 12) / this.field2993 - -this.field2994;
                int var7 = var5;
                int var8 = var6;
                int var9 = var5;
                int var10 = var6;
                int var11 = var5 * var5 >> 12;
                int var12 = var6 * var6 >> 12;
                int var13 = 0;
                while (var11 + var12 < 16384 && ~this.field2987 < ~var13) {
                    var10 = (var9 * var10 >> 12) * 2 + var8;
                    var9 = var11 - var12 + var7;
                    ++var13;
                    var11 = var9 * var9 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var3[var4] = ~var13 > ~(this.field2987 - 1) ? (var13 << 12) / this.field2987 : 0;
            }
        }
        return arg0 >= -21 ? null : var3;
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(IIII)I")
    public static final int method1365(int arg0, int arg1, int arg2, int arg3) {
        ++field2998;
        if (arg1 != -154640633) {
            field2991 = -4;
        }
        if (~arg0 == ~arg3) {
            return arg3;
        } else {
            int var4 = -arg2 + 128;
            int var5 = (127 & arg0) * arg2 + (127 & arg3) * var4 >> 7;
            int var6 = (arg0 & 896) * arg2 + (896 & arg3) * var4 >> 7;
            int var7 = (64512 & arg0) * arg2 + (arg3 & 64512) * var4 >> 7;
            return 896 & var6 | var7 & 64512 | var5 & 127;
        }
    }
}
