import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class440 extends class115 {

    @OriginalMember(owner = "client!kn", name = "R", descriptor = "I")
    private int field6448 = 0;

    @OriginalMember(owner = "client!kn", name = "T", descriptor = "I")
    private int field6450 = 1;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
    private int field6443 = 0;

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "[I")
    public static int[] field6444 = new int[13];

    @OriginalMember(owner = "client!kn", name = "Q", descriptor = "Lwf;")
    public static class70 field6447 = new class70(64);

    @OriginalMember(owner = "client!kn", name = "J", descriptor = "I")
    public static int field6440;

    @OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
    public static int field6441;

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "I")
    public static int field6442;

    @OriginalMember(owner = "client!kn", name = "P", descriptor = "I")
    public static int field6446;

    @OriginalMember(owner = "client!kn", name = "S", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!kn", name = "U", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!kn", name = "O", descriptor = "[B")
    public static byte[] field6445;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(II)[I", line = 3)
    public final int[] method57(int arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field6451;
            int[] var3 = super.field1340.method14(96, arg0);
            if (super.field1340.field35) {
                int var4 = class193.field2634[arg0];
                int var5 = var4 + -2048 >> 1;
                for (int var6 = 0; var6 < class218.field2979; ++var6) {
                    int var7 = class43.field530[var6];
                    int var8 = var7 - 2048 >> 1;
                    int var11;
                    if (this.field6443 != 0) {
                        int var9 = var5 * var5 + var8 * var8 >> 12;
                        int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                        var11 = (int) ((double) (this.field6450 * var10) * 3.141592653589793D);
                    } else {
                        var11 = (var7 - var4) * this.field6450;
                    }
                    int var12 = var11 - (var11 & -4096);
                    if (~this.field6448 != -1) {
                        if (this.field6448 == 2) {
                            var12 -= 2048;
                            if (~var12 > -1) {
                                var12 = -var12;
                            }
                            var12 = -var12 + 2048 << 1;
                        }
                    } else {
                        var12 = class157.field2227[var12 >> 4 & 255] + 4096 >> 1;
                    }
                    var3[var6] = var12;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(BLbk;I)V", line = 72)
    public final void method149(byte arg0, class211 arg1, int arg2) {
        if (arg0 >= 83) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (arg2 == 3) {
                        this.field6450 = arg1.method1342((byte) -128);
                    }
                } else {
                    this.field6448 = arg1.method1342((byte) -126);
                }
            } else {
                this.field6443 = arg1.method1342((byte) -127);
            }
            ++field6446;
        }
    }

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "(I)V", line = 116)
    public final void method140(int arg0) {
        ++field6442;
        if (arg0 != 0) {
            method2734((byte) 50);
        }
        class170.method1131(256);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIIII)V", line = 133)
    public static final void method2733(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 >= 120) {
            if (class407.field5914 >= arg2 && ~arg3 <= ~class20.field209) {
                boolean var6;
                if (~arg0 > ~class143.field2029) {
                    var6 = false;
                    arg0 = class143.field2029;
                } else if (arg0 <= class128.field1785) {
                    var6 = true;
                } else {
                    arg0 = class128.field1785;
                    var6 = false;
                }
                boolean var7;
                if (~class143.field2029 < ~arg4) {
                    var7 = false;
                    arg4 = class143.field2029;
                } else if (class128.field1785 < arg4) {
                    var7 = false;
                    arg4 = class128.field1785;
                } else {
                    var7 = true;
                }
                if (class20.field209 <= arg2) {
                    class105.method564(arg5, arg0, 0, class318.field4522[arg2++], arg4);
                } else {
                    arg2 = class20.field209;
                }
                if (~arg3 >= ~class407.field5914) {
                    class105.method564(arg5, arg0, 0, class318.field4522[arg3--], arg4);
                } else {
                    arg3 = class407.field5914;
                }
                if (var6 && var7) {
                    for (int var8 = arg2; ~arg3 <= ~var8; ++var8) {
                        int[] var9 = class318.field4522[var8];
                        var9[arg0] = var9[arg4] = arg5;
                    }
                } else if (var6) {
                    for (int var10 = arg2; var10 <= arg3; ++var10) {
                        class318.field4522[var10][arg0] = arg5;
                    }
                } else if (var7) {
                    for (int var11 = arg2; var11 <= arg3; ++var11) {
                        class318.field4522[var11][arg4] = arg5;
                    }
                }
            }
            ++field6449;
        }
    }

    @OriginalMember(owner = "client!kn", name = "<init>", descriptor = "()V", line = 252)
    public class440() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "(B)V", line = 256)
    public static void method2734(byte arg0) {
        field6447 = null;
        field6445 = null;
        field6444 = null;
        if (arg0 >= -56) {
            field6441 = 63;
        }
    }

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "(II)V", line = 268)
    public static final void method2735(int arg0, int arg1) {
        if (arg1 == -315582175) {
            ++field6440;
            class348 var2 = class385.method2464(2, arg1 + 315583477, arg0);
            var2.method2214((byte) 121);
        }
    }
}
