import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class324 extends class305 {

    @OriginalMember(owner = "client!hc", name = "H", descriptor = "Z")
    private boolean field4913 = true;

    @OriginalMember(owner = "client!hc", name = "G", descriptor = "I")
    private int field4912 = 4096;

    @OriginalMember(owner = "client!hc", name = "E", descriptor = "Ljp;")
    public static class55 field4910 = new class55(97, 3);

    @OriginalMember(owner = "client!hc", name = "K", descriptor = "I")
    public static int field4916 = 0;

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "Z")
    public static boolean field4918 = false;

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "J")
    public static long field4917 = -1L;

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "[B")
    public static byte[] field4919 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field4920 = 0;

    @OriginalMember(owner = "client!hc", name = "D", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!hc", name = "F", descriptor = "I")
    public static int field4911;

    @OriginalMember(owner = "client!hc", name = "I", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!hc", name = "J", descriptor = "I")
    public static int field4915;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field4921;

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V", line = 6)
    public static void method2128(int arg0) {
        field4919 = null;
        field4910 = null;
        if (arg0 <= 52) {
            field4916 = 29;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lfh;B)Lfs;", line = 17)
    public static final class291 method2129(class194 arg0, byte arg1) {
        if (arg1 != 8) {
            method2129((class194) null, (byte) -31);
        }
        ++field4911;
        return new class291(arg0.method1384(true), arg0.method1384(true), arg0.method1384(true), arg0.method1384(true), arg0.method1339(-32768), arg0.method1339(-32768), arg0.method1337((byte) 56));
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IIIIII)V", line = 30)
    public static final void method2130(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (~class232.field3492 >= ~arg2 && arg1 <= class36.field453 && class487.field7124 <= arg5 && arg0 <= class232.field3493) {
            class521.method3097(arg2, arg0, -126, arg5, arg4, arg1);
        } else {
            class8.method38(arg1, -119, arg0, arg2, arg4, arg5);
        }
        ++field4909;
        if (arg3 != 97) {
            field4918 = false;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(ILfh;B)V", line = 48)
    public final void method14(int arg0, class194 arg1, byte arg2) {
        ++field4915;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                this.field4913 = ~arg1.method1337((byte) -123) == -2;
            }
        } else {
            this.field4912 = arg1.method1396(116);
        }
        if (arg2 < 76) {
            field4920 = -76;
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(IB)[[I", line = 86)
    public final int[][] method72(int arg0, byte arg1) {
        ++field4914;
        if (arg1 > -59) {
            return null;
        } else {
            int[][] var3 = super.field4674.method2206(-61, arg0);
            if (super.field4674.field5110) {
                int[] var4 = this.method2021(0, arg0 + -1 & class236.field3551, 0);
                int[] var5 = this.method2021(0, arg0, 0);
                int[] var6 = this.method2021(0, class236.field3551 & arg0 + 1, 0);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; class91.field1471 > var10; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field4912;
                    int var12 = (var5[var10 + 1 & class228.field3447] - var5[class228.field3447 & var10 + -1]) * this.field4912;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var13 * var13 >> 12;
                    int var16 = var14 * var14 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var15 + 4096 + var16) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (~var17 != -1) {
                        var18 = var11 / var17;
                        var19 = 16777216 / var17;
                        var20 = var12 / var17;
                    } else {
                        var19 = 0;
                        var18 = 0;
                        var20 = 0;
                    }
                    if (this.field4913) {
                        var18 = (var18 >> 1) + 2048;
                        var19 = 2048 - -(var19 >> 1);
                        var20 = (var20 >> 1) + 2048;
                    }
                    var7[var10] = var20;
                    var8[var10] = var18;
                    var9[var10] = var19;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V", line = 167)
    public class324() {
        super(1, false);
    }
}
