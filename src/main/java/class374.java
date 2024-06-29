import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class374 extends class354 {

    @OriginalMember(owner = "client!pt", name = "P", descriptor = "Z")
    private boolean field5688 = true;

    @OriginalMember(owner = "client!pt", name = "O", descriptor = "Z")
    private boolean field5687 = true;

    @OriginalMember(owner = "client!pt", name = "T", descriptor = "Lni;")
    public static class367 field5692 = new class367(53, 4);

    @OriginalMember(owner = "client!pt", name = "V", descriptor = "Lni;")
    public static class367 field5694 = new class367(11, 16);

    @OriginalMember(owner = "client!pt", name = "N", descriptor = "F")
    public static float field5686;

    @OriginalMember(owner = "client!pt", name = "K", descriptor = "I")
    public static int field5684;

    @OriginalMember(owner = "client!pt", name = "M", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!pt", name = "Q", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!pt", name = "R", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!pt", name = "S", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!pt", name = "W", descriptor = "Lte;")
    public static class443 field5695;

    @OriginalMember(owner = "client!pt", name = "U", descriptor = "[[I")
    public static int[][] field5693;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(BI)[I", line = 4)
    public final int[] method270(byte arg0, int arg1) {
        ++field5689;
        if (arg0 > -74) {
            field5686 = -0.5680799F;
        }
        int[] var3 = super.field5478.method2522(arg1, 16863);
        if (super.field5478.field6213) {
            int[] var4 = this.method2275((byte) 119, 0, this.field5687 ? -arg1 + class423.field6453 : arg1);
            if (!this.field5688) {
                class192.method1298(var4, 0, var3, 0, class531.field7814);
            } else {
                for (int var5 = 0; ~class531.field7814 < ~var5; ++var5) {
                    var3[var5] = var4[-var5 + class179.field2409];
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "(I)V", line = 43)
    public static void method2357(int arg0) {
        field5693 = null;
        field5692 = null;
        field5694 = null;
        field5695 = null;
        if (arg0 < 74) {
            method2358((byte[][]) null, (byte[][]) null, -45, true, (int[]) null, (byte[]) null, 67, (int[]) null);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IB)[[I", line = 56)
    public final int[][] method354(int arg0, byte arg1) {
        ++field5690;
        int var3 = -119 / ((arg1 - 48) / 60);
        int[][] var4 = super.field5474.method2414((byte) -82, arg0);
        if (super.field5474.field5870) {
            int[][] var5 = this.method2274((byte) 84, this.field5687 ? class423.field6453 - arg0 : arg0, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[1];
            int[] var8 = var5[2];
            int[] var9 = var4[0];
            int[] var10 = var4[1];
            int[] var11 = var4[2];
            if (!this.field5688) {
                for (int var12 = 0; class531.field7814 > var12; ++var12) {
                    var9[var12] = var6[var12];
                    var10[var12] = var7[var12];
                    var11[var12] = var8[var12];
                }
            } else {
                for (int var13 = 0; ~class531.field7814 < ~var13; ++var13) {
                    var9[var13] = var6[class179.field2409 - var13];
                    var10[var13] = var7[-var13 + class179.field2409];
                    var11[var13] = var8[-var13 + class179.field2409];
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Lnj;II)V", line = 122)
    public final void method272(class164 arg0, int arg1, int arg2) {
        ++field5684;
        if (arg2 != 1638) {
            this.method270((byte) -97, 10);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (arg1 == 2) {
                    super.field5466 = ~arg0.method1087(false) == -2;
                }
            } else {
                this.field5687 = ~arg0.method1087(false) == -2;
            }
        } else {
            this.field5688 = ~arg0.method1087(false) == -2;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([[B[[BIZ[I[BI[I)I", line = 166)
    public static final int method2358(byte[][] arg0, byte[][] arg1, int arg2, boolean arg3, int[] arg4, byte[] arg5, int arg6, int[] arg7) {
        ++field5691;
        int var8 = arg7[arg6];
        int var9 = arg4[arg6] + var8;
        int var10 = arg7[arg2];
        int var11 = arg4[arg2] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var9 > var11) {
            var13 = var11;
        }
        int var14 = 255 & arg5[arg6];
        if ((arg5[arg2] & 255) < var14) {
            var14 = arg5[arg2] & 255;
        }
        byte[] var15 = arg1[arg6];
        if (!arg3) {
            method2357(105);
        }
        byte[] var16 = arg0[arg2];
        int var17 = -var8 + var12;
        int var18 = var12 - var10;
        for (int var19 = var12; ~var13 < ~var19; ++var19) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "()V", line = 227)
    public class374() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II)V", line = 231)
    public static final void method2359(int arg0, int arg1) {
        ++field5685;
        if (arg0 == -2) {
            class468.field7005 = arg1;
            class330 var2 = class491.field7249;
            synchronized (class491.field7249) {
                class491.field7249.method2127((byte) -20);
            }
            class330 var3 = class112.field1560;
            synchronized (class112.field1560) {
                class112.field1560.method2127((byte) 120);
            }
        }
    }
}
