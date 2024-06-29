import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class299 extends class456 {

    @OriginalMember(owner = "client!ss", name = "H", descriptor = "I")
    private int field4463 = 4;

    @OriginalMember(owner = "client!ss", name = "P", descriptor = "I")
    private int field4471 = 4;

    @OriginalMember(owner = "client!ss", name = "K", descriptor = "I")
    public static int field4466 = 0;

    @OriginalMember(owner = "client!ss", name = "O", descriptor = "I")
    public static int field4470 = 0;

    @OriginalMember(owner = "client!ss", name = "J", descriptor = "Lo;")
    public static class332 field4465 = new class332(" more options", " weitere Optionen", " autres options", " mais opções");

    @OriginalMember(owner = "client!ss", name = "Q", descriptor = "[Ljava/lang/String;")
    public static String[] field4472 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ss", name = "I", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!ss", name = "L", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!ss", name = "M", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!ss", name = "N", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lak;IIII)V")
    public static final void method1866(class32 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class165.method1128(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class412.field5957) {
            class165.method1128(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class165.method1128(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class315.field4743) {
            class165.method1128(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class315.field4743) {
            class165.method1128(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class412.field5957 && arg4 <= class315.field4743) {
            class165.method1128(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class165.method1128(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class412.field5957 && arg4 > 0) {
            class165.method1128(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)[[I")
    public final int[][] method212(int arg0, int arg1) {
        ++field4469;
        if (arg0 != 0) {
            method1867(-28);
        }
        int[][] var3 = super.field6468.method1090(-2, arg1);
        if (super.field6468.field2227) {
            int var4 = class156.field2169 / this.field4463;
            int var5 = class487.field6842 / this.field4471;
            int[][] var6;
            if (~var5 >= -1) {
                var6 = this.method2709(false, 0, 0);
            } else {
                int var7 = arg1 % var5;
                var6 = this.method2709(false, class487.field6842 * var7 / var5, 0);
            }
            int[] var8 = var6[0];
            int[] var9 = var6[1];
            int[] var10 = var6[2];
            int[] var11 = var3[0];
            int[] var12 = var3[1];
            int[] var13 = var3[2];
            for (int var14 = 0; class156.field2169 > var14; ++var14) {
                int var15;
                if (~var4 >= -1) {
                    var15 = 0;
                } else {
                    int var16 = var14 % var4;
                    var15 = class156.field2169 * var16 / var4;
                }
                var11[var14] = var8[var15];
                var12[var14] = var9[var15];
                var13[var14] = var10[var15];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "(I)V")
    public static final void method1867(int arg0) {
        class378.method2320(class473.field6632, (byte) 119);
        if (arg0 < -26) {
            ++class382.field5653;
            ++field4467;
            class230.field3390.method2619((byte) -119, 0);
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "()V")
    public class299() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        ++field4464;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (super.field6466.field6153) {
            int var4 = class156.field2169 / this.field4463;
            int var5 = class487.field6842 / this.field4471;
            int[] var7;
            if (var5 > 0) {
                int var6 = arg1 % var5;
                var7 = this.method2707(class487.field6842 * var6 / var5, -31797, 0);
            } else {
                var7 = this.method2707(0, arg0 ^ 31796, 0);
            }
            for (int var8 = 0; ~var8 > ~class156.field2169; ++var8) {
                if (var4 > 0) {
                    int var9 = var8 % var4;
                    var3[var8] = var7[class156.field2169 * var9 / var4];
                } else {
                    var3[var8] = var7[0];
                }
            }
        }
        if (arg0 != -1) {
            method1868((class87) null, 4, -14, -54, (boolean[]) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(Lfq;III[Z)V")
    public static final void method1868(class87 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class55.field765 != class479.field6745) {
            int var5 = class483.field6781[arg1].method204(arg2, arg3);
            for (int var6 = 0; var6 <= arg1; ++var6) {
                if (arg4 == null || arg4[var6]) {
                    class48 var7 = class483.field6781[var6];
                    if (var7 != null) {
                        var7.method200(arg0, arg2, var5 - var7.method204(arg2, arg3), arg3, 0, false);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "i", descriptor = "(I)V")
    public static void method1869(int arg0) {
        if (arg0 != 0) {
            method1868((class87) null, 69, 101, -82, (boolean[]) null);
        }
        field4472 = null;
        field4465 = null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IBLre;)V")
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (arg1 == 55) {
            ++field4468;
            if (arg0 != 0) {
                if (arg0 == 1) {
                    this.field4471 = arg2.method2628(arg1 + 49097);
                }
            } else {
                this.field4463 = arg2.method2628(49152);
            }
        }
    }
}
