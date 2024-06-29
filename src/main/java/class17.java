import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class17 extends class3 {

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lfh;IZ)V", line = 5)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field34 = arg0.method2224(-127) == 1;
        }
        if (!arg2) {
            field218++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "e", descriptor = "(B)V", line = 18)
    public static final void method113(byte arg0) {
        if (arg0 == 21) {
            class143.field2297.method651(0);
            field214++;
        }
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "()V", line = 30)
    public class17() {
        super(3, false);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IZ)Ldb;", line = 34)
    public static final class146 method114(int arg0, boolean arg1) {
        field215++;
        class146 var2 = (class146) class346.field5540.method652((long) arg0, arg1);
        if (var2 != null) {
            return var2;
        }
        class146 var3 = class300.method2113(class8.field107, class44.field642, (byte) 112, arg0, arg1);
        if (var3 != null) {
            class346.field5540.method642(var3, (long) arg0, -93);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(II)[[I", line = 52)
    public final int[][] method22(int arg0, int arg1) {
        if (arg0 != -21194) {
            this.method25((byte) 76, 82);
        }
        field217++;
        int[][] var3 = this.field20.method2435(arg1, false);
        if (this.field20.field5556) {
            int[] var4 = this.method24(arg1, 1, 2);
            int[][] var5 = this.method16(arg1, 0, (byte) -35);
            int[][] var6 = this.method16(arg1, 1, (byte) -107);
            int[] var7 = var3[0];
            int[] var8 = var3[1];
            int[] var9 = var3[2];
            int[] var10 = var5[0];
            int[] var11 = var5[1];
            int[] var12 = var5[2];
            int[] var13 = var6[0];
            int[] var14 = var6[1];
            int[] var15 = var6[2];
            for (int var16 = 0; var16 < class326.field5342; var16++) {
                int var17 = var4[var16];
                if (var17 == 4096) {
                    var7[var16] = var10[var16];
                    var8[var16] = var11[var16];
                    var9[var16] = var12[var16];
                } else if (var17 == 0) {
                    var7[var16] = var13[var16];
                    var8[var16] = var14[var16];
                    var9[var16] = var15[var16];
                } else {
                    int var18 = 4096 - var17;
                    var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                    var8[var16] = var11[var16] * var17 + var14[var16] * var18 >> 12;
                    var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(III)Ltd;", line = 134)
    public static final class211 method115(int arg0, int arg1, int arg2) {
        if (arg2 != 4086) {
            return (class211) null;
        }
        field213++;
        class211 var3 = (class211) class162.field2579.method29((long) arg1 | (long) arg0 << 32, arg2 ^ 0xF91);
        if (var3 == null) {
            var3 = new class211(arg0, arg1);
            class162.field2579.method37(false, var3, var3.field2549);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(BI)[I", line = 155)
    public final int[] method25(byte arg0, int arg1) {
        field216++;
        if (arg0 < 57) {
            return (int[]) null;
        }
        int[] var3 = this.field21.method1258(arg1, 0);
        if (this.field21.field2808) {
            int[] var4 = this.method24(arg1, 1, 0);
            int[] var5 = this.method24(arg1, 1, 1);
            int[] var6 = this.method24(arg1, 1, 2);
            for (int var7 = 0; var7 < class326.field5342; var7++) {
                int var8 = var6[var7];
                if (var8 == 4096) {
                    var3[var7] = var4[var7];
                } else if (var8 == 0) {
                    var3[var7] = var5[var7];
                } else {
                    var3[var7] = (4096 - var8) * var5[var7] + var4[var7] * var8 >> 12;
                }
            }
        }
        return var3;
    }
}
