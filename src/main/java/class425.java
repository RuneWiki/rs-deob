import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ga")
public class class425 extends class232 {

    @OriginalMember(owner = "client!ga", name = "Q", descriptor = "I")
    private int field6687 = 2048;

    @OriginalMember(owner = "client!ga", name = "I", descriptor = "I")
    private int field6688 = 4096;

    @OriginalMember(owner = "client!ga", name = "L", descriptor = "I")
    private int field6694 = 12288;

    @OriginalMember(owner = "client!ga", name = "R", descriptor = "I")
    private int field6697 = 8192;

    @OriginalMember(owner = "client!ga", name = "K", descriptor = "I")
    private int field6695 = 0;

    @OriginalMember(owner = "client!ga", name = "H", descriptor = "I")
    private int field6699 = 2048;

    @OriginalMember(owner = "client!ga", name = "N", descriptor = "I")
    private int field6698 = 0;

    @OriginalMember(owner = "client!ga", name = "J", descriptor = "[Ljava/lang/String;")
    private static final String[] field6700 = new String[] { method3374(method3373("eN\u0012 d")), method3374(method3373("lZP\b")), method3374(method3373("eN\u0012!d")), method3374(method3373("y\u0001\u0012J1")), method3374(method3373("eN\u0012%d")), method3374(method3373("eN\u0012'd")), method3374(method3373("eN\u0012(d")), method3374(method3373("eN\u0012\"d")) };

    @OriginalMember(owner = "client!ga", name = "P", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!ga", name = "M", descriptor = "I")
    public static int field6691;

    @OriginalMember(owner = "client!ga", name = "S", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!ga", name = "T", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!ga", name = "G", descriptor = "I")
    public static int field6696;

    @OriginalMember(owner = "client!ga", name = "O", descriptor = "[Lhk;")
    public static class107[] field6689;

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IB)[I")
    public final int[] method66(int arg0, byte arg1) {
        try {
            if (arg1 != 123) {
                this.method3370(-15, 13, 7);
            }
            ++field6691;
            int[] var3 = super.field3601.method3467(arg0, (byte) -61);
            if (super.field3601.field6907) {
                int var4 = class100.field1467[arg0] + -2048;
                for (int var5 = 0; var5 < class449.field6969; ++var5) {
                    int var6 = class788.field11518[var5] + -2048;
                    int var7 = this.field6699 + var6;
                    int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                    int var9 = var8 <= 2048 ? var8 : var8 + -4096;
                    int var10 = this.field6695 + var4;
                    int var11 = var10 >= -2048 ? var10 : var10 - -4096;
                    int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                    int var13 = this.field6698 + var6;
                    int var14 = ~var13 <= 2047 ? var13 : var13 - -4096;
                    int var15 = var14 <= 2048 ? var14 : var14 + -4096;
                    int var16 = this.field6687 + var4;
                    int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                    int var18 = ~var17 < -2049 ? var17 + -4096 : var17;
                    var3[var5] = !this.method3372(var12, false, var9) && !this.method3370(var18, class251.method2133(arg1, -101), var15) ? 0 : 4096;
                }
            }
            return var3;
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field6700[6] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!ga", name = "c", descriptor = "(III)Z")
    private final boolean method3370(int arg0, int arg1, int arg2) {
        try {
            ++field6696;
            int var4 = (arg0 + arg2) * this.field6694 >> 12;
            int var5 = class266.field4305[(var4 * 255 & 1047572) >> 12];
            int var6 = 10 / ((arg1 - 28) / 58);
            int var7 = (var5 << 12) / this.field6694;
            int var8 = (var7 << 12) / this.field6697;
            int var9 = this.field6688 * var8 >> 12;
            return var9 > arg0 - arg2 && ~(-arg2 + arg0) < ~(-var9);
        } catch (RuntimeException var11) {
            throw class590.method4333(var11, field6700[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ga", name = "d", descriptor = "(I)V")
    public static void method3371(int arg0) {
        try {
            if (arg0 != 255) {
                field6689 = null;
            }
            field6689 = null;
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field6700[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ga", name = "<init>", descriptor = "()V")
    public class425() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(IZI)Z")
    private final boolean method3372(int arg0, boolean arg1, int arg2) {
        try {
            ++field6693;
            int var4 = (-arg2 + arg0) * this.field6694 >> 12;
            int var5 = class266.field4305[(1044827 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field6694;
            int var7 = (var6 << 12) / this.field6697;
            if (arg1) {
                this.field6697 = -100;
            }
            int var8 = this.field6688 * var7 >> 12;
            return ~var8 < ~(arg0 + arg2) && arg0 + arg2 > -var8;
        } catch (RuntimeException var10) {
            throw class590.method4333(var10, field6700[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(ILwq;I)V")
    public final void method63(int arg0, class176 arg1, int arg2) {
        try {
            ++field6692;
            if (arg0 > 96) {
                if (~arg2 != -1) {
                    if (~arg2 != -2) {
                        if (arg2 != 2) {
                            if (~arg2 != -4) {
                                if (~arg2 != -5) {
                                    if (~arg2 != -6) {
                                        if (~arg2 == -7) {
                                            this.field6697 = arg1.method1687((byte) -62);
                                        }
                                    } else {
                                        this.field6688 = arg1.method1687((byte) -90);
                                    }
                                } else {
                                    this.field6694 = arg1.method1687((byte) -85);
                                }
                            } else {
                                this.field6687 = arg1.method1687((byte) -126);
                            }
                        } else {
                            this.field6698 = arg1.method1687((byte) -81);
                        }
                    } else {
                        this.field6695 = arg1.method1687((byte) -88);
                    }
                } else {
                    this.field6699 = arg1.method1687((byte) -116);
                }
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field6700[2] + arg0 + ',' + (arg1 != null ? field6700[3] : field6700[1]) + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!ga", name = "a", descriptor = "(B)V")
    public final void method67(byte arg0) {
        try {
            int var2 = -47 / ((arg0 - 73) / 34);
            class204.method1843((byte) 92);
            ++field6690;
        } catch (RuntimeException var4) {
            throw class590.method4333(var4, field6700[5] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3373(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 76);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!ga", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3374(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 2;
                    break;
                case 1:
                    var10005 = 47;
                    break;
                case 2:
                    var10005 = 60;
                    break;
                case 3:
                    var10005 = 100;
                    break;
                default:
                    var10005 = 76;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
