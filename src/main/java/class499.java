import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class499 implements class498 {

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "Lgga;")
    private class270 field6691 = new class270(256);

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "Lbi;")
    private class449 field6688;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "Lbi;")
    private class449 field6686;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    private int field6682;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "[Lpp;")
    private class364[] field6687;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field6681;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field6683;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field6684;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field6685;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field6689;

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "I")
    public static int field6690;

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "I")
    public static int field6692;

    @OriginalMember(owner = "client!tp", name = "m", descriptor = "I")
    public static int field6693;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(BIZIFI)[I")
    public final int[] method2761(byte arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5) {
        int var7 = -75 / ((-arg0 - 14) / 55);
        field6693++;
        return this.method2766(6582, arg3).method1254(this, this.field6687[arg3].field4940, (double) arg4, arg5, arg1, this.field6686, 0, arg2);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(II)Z")
    public final boolean method2759(int arg0, int arg1) {
        field6684++;
        if (arg0 != 32700) {
            this.method2759(-61, -30);
        }
        class194 var3 = this.method2766(6582, arg1);
        return var3 != null && var3.method1252(63, this.field6686, this);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)I")
    public final int method2763(int arg0) {
        if (arg0 == 547) {
            field6683++;
            return this.field6682;
        } else {
            return 124;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(FIZIII)[I")
    public final int[] method2762(float arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field6685++;
        if (arg4 != 7814) {
            this.field6686 = null;
        }
        return this.method2766(6582, arg3).method1255(this.field6686, (double) arg0, this.field6687[arg3].field4940, arg4 ^ 0xFFFFE119, this, arg1, arg5);
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(II)Lpp;")
    public final class364 method2760(int arg0, int arg1) {
        field6690++;
        if (arg1 != 21351) {
            this.field6688 = null;
        }
        return this.field6687[arg0];
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIIFZB)[F")
    public final float[] method2764(int arg0, int arg1, int arg2, float arg3, boolean arg4, byte arg5) {
        field6692++;
        if (arg5 >= -112) {
            this.field6686 = null;
        }
        return this.method2766(6582, arg1).method1256(this.field6687[arg1].field4940, -636657534, arg2, arg0, this, this.field6686);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ILgj;Loa;BI)V")
    public static final void method2765(int arg0, class593 arg1, class651 arg2, byte arg3, int arg4) {
        field6689++;
        class187.field2784.method3255((byte) -123);
        if (class649.field8744) {
            return;
        }
        for (class20 var5 = (class20) arg1.method3257(-86); var5 != null; var5 = (class20) arg1.method3263((byte) -78)) {
            class634 var7 = class567.field7498.method1487(var5.field317, (byte) 115);
            if (class332.method1973(var7, (byte) 60)) {
                boolean var8 = class710.method3910(arg2, arg4, var7, (byte) 65, arg0, var5);
                if (var8) {
                    class599.method3298(arg2, (byte) -120, var5, var7);
                }
            }
        }
        int var6 = -99 % ((arg3 - 56) / 42);
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lbi;Lbi;Lbi;)V")
    public class499(class449 arg0, class449 arg1, class449 arg2) {
        this.field6688 = arg1;
        this.field6686 = arg2;
        class335 var4 = new class335(arg0.method2537(false, 0, 0));
        this.field6682 = var4.method2001((byte) -83);
        this.field6687 = new class364[this.field6682];
        for (int var5 = 0; var5 < this.field6682; var5++) {
            if (var4.method2034(255) == 1) {
                this.field6687[var5] = new class364();
            }
        }
        for (int var6 = 0; var6 < this.field6682; var6++) {
            if (this.field6687[var6] != null) {
                this.field6687[var6].field4930 = var4.method2034(255) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field6682; var7++) {
            if (this.field6687[var7] != null) {
                this.field6687[var7].field4924 = var4.method2034(255) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field6682; var8++) {
            if (this.field6687[var8] != null) {
                this.field6687[var8].field4933 = var4.method2034(255) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field6682; var9++) {
            if (this.field6687[var9] != null) {
                this.field6687[var9].field4917 = var4.method2034(255) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field6682; var10++) {
            if (this.field6687[var10] != null) {
                this.field6687[var10].field4926 = var4.method2040(-75);
            }
        }
        for (int var11 = 0; var11 < this.field6682; var11++) {
            if (this.field6687[var11] != null) {
                this.field6687[var11].field4929 = var4.method2040(-58);
            }
        }
        for (int var12 = 0; var12 < this.field6682; var12++) {
            if (this.field6687[var12] != null) {
                this.field6687[var12].field4937 = var4.method2040(-51);
            }
        }
        for (int var13 = 0; var13 < this.field6682; var13++) {
            if (this.field6687[var13] != null) {
                this.field6687[var13].field4928 = var4.method2040(-49);
            }
        }
        for (int var14 = 0; var14 < this.field6682; var14++) {
            if (this.field6687[var14] != null) {
                this.field6687[var14].field4920 = (short) var4.method2001((byte) -83);
            }
        }
        for (int var15 = 0; var15 < this.field6682; var15++) {
            if (this.field6687[var15] != null) {
                this.field6687[var15].field4919 = var4.method2040(-55);
            }
        }
        for (int var16 = 0; var16 < this.field6682; var16++) {
            if (this.field6687[var16] != null) {
                this.field6687[var16].field4932 = var4.method2040(-64);
            }
        }
        for (int var17 = 0; var17 < this.field6682; var17++) {
            if (this.field6687[var17] != null) {
                this.field6687[var17].field4941 = var4.method2034(255) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field6682; var18++) {
            if (this.field6687[var18] != null) {
                this.field6687[var18].field4940 = var4.method2034(255) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field6682; var19++) {
            if (this.field6687[var19] != null) {
                this.field6687[var19].field4942 = var4.method2040(-46);
            }
        }
        for (int var20 = 0; var20 < this.field6682; var20++) {
            if (this.field6687[var20] != null) {
                this.field6687[var20].field4936 = var4.method2034(255) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field6682; var21++) {
            if (this.field6687[var21] != null) {
                this.field6687[var21].field4938 = var4.method2034(255) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field6682; var22++) {
            if (this.field6687[var22] != null) {
                this.field6687[var22].field4939 = var4.method2034(255) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field6682; var23++) {
            if (this.field6687[var23] != null) {
                this.field6687[var23].field4935 = var4.method2034(255);
            }
        }
        for (int var24 = 0; var24 < this.field6682; var24++) {
            if (this.field6687[var24] != null) {
                this.field6687[var24].field4918 = var4.method2045(-98);
            }
        }
        for (int var25 = 0; var25 < this.field6682; var25++) {
            if (this.field6687[var25] != null) {
                this.field6687[var25].field4931 = var4.method2034(255) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(II)Ldga;")
    private final class194 method2766(int arg0, int arg1) {
        field6681++;
        class11 var3 = this.field6691.method1642(-1717, (long) arg1);
        if (var3 != null) {
            return (class194) var3;
        }
        byte[] var4 = this.field6688.method2531(arg1, 0);
        if (arg0 != 6582) {
            this.method2763(-101);
        }
        if (var4 == null) {
            return null;
        } else {
            class194 var5 = new class194(new class335(var4));
            this.field6691.method1643(var5, 13642, (long) arg1);
            return var5;
        }
    }
}
