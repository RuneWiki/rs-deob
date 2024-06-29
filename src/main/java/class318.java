import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vw")
public class class318 implements class159 {

    @OriginalMember(owner = "client!vw", name = "m", descriptor = "Lo;")
    private class31 field4732 = new class31(256);

    @OriginalMember(owner = "client!vw", name = "h", descriptor = "Lcb;")
    private class544 field4727;

    @OriginalMember(owner = "client!vw", name = "i", descriptor = "Lcb;")
    private class544 field4728;

    @OriginalMember(owner = "client!vw", name = "d", descriptor = "I")
    private int field4723;

    @OriginalMember(owner = "client!vw", name = "r", descriptor = "[Ltca;")
    private class181[] field4737;

    @OriginalMember(owner = "client!vw", name = "g", descriptor = "I")
    public static int field4726 = 0;

    @OriginalMember(owner = "client!vw", name = "n", descriptor = "F")
    public static float field4733 = 0.0F;

    @OriginalMember(owner = "client!vw", name = "k", descriptor = "[Lpt;")
    public static class554[] field4730 = new class554[6];

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "I")
    public static int field4721;

    @OriginalMember(owner = "client!vw", name = "c", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!vw", name = "e", descriptor = "I")
    public static int field4724;

    @OriginalMember(owner = "client!vw", name = "f", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!vw", name = "j", descriptor = "I")
    public static int field4729;

    @OriginalMember(owner = "client!vw", name = "l", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!vw", name = "o", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!vw", name = "p", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!vw", name = "q", descriptor = "I")
    public static int field4736;

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(I)V")
    public static void method2077(int arg0) {
        field4730 = null;
        if (arg0 != 0) {
            field4730 = null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IB)Z")
    public final boolean method1262(int arg0, byte arg1) {
        if (arg1 < 44) {
            return false;
        } else {
            field4736++;
            class610 var3 = this.method2078(arg0, 0);
            return var3 != null && var3.method3520(this.field4728, this, 24460);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIIZFI)[I")
    public final int[] method1261(int arg0, int arg1, int arg2, boolean arg3, float arg4, int arg5) {
        if (arg2 == -13756) {
            field4722++;
            return this.method2078(arg0, 0).method3516(arg1, this, this.field4728, arg3, (double) arg4, -59, this.field4737[arg0].field2735, arg5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IIIFZI)[I")
    public final int[] method1259(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5) {
        field4735++;
        return arg2 == 30767 ? this.method2078(arg0, 0).method3519(arg5, arg1, 108, (double) arg3, this, this.field4737[arg0].field2735, this.field4728) : null;
    }

    @OriginalMember(owner = "client!vw", name = "b", descriptor = "(IB)Ltca;")
    public final class181 method1263(int arg0, byte arg1) {
        if (arg1 <= 109) {
            return null;
        } else {
            field4720++;
            return this.field4737[arg0];
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(II)Lnw;")
    private final class610 method2078(int arg0, int arg1) {
        field4725++;
        class219 var3 = this.field4732.method220((long) arg0, arg1);
        if (var3 != null) {
            return (class610) var3;
        }
        byte[] var4 = this.field4727.method3149(arg0, -107);
        if (var4 == null) {
            return null;
        } else {
            class610 var5 = new class610(new class120(var4));
            this.field4732.method221(var5, false, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(IFIZBI)[F")
    public final float[] method1260(int arg0, float arg1, int arg2, boolean arg3, byte arg4, int arg5) {
        field4729++;
        int var7 = -5 % ((arg4 - 49) / 45);
        return this.method2078(arg0, 0).method3517(arg2, this, this.field4737[arg0].field2735, -29919, arg5, this.field4728);
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(B)I")
    public static final int method2079(byte arg0) {
        field4731++;
        if (class422.field5962) {
            return 6;
        } else if (class50.field723 == null) {
            return 0;
        } else {
            int var1 = class50.field723.field4640;
            if (class637.method3628((byte) 2, var1)) {
                return 1;
            } else if (class134.method950(var1, -64)) {
                return 2;
            } else {
                if (arg0 >= -32) {
                    field4730 = null;
                }
                if (class574.method3331(var1, 1)) {
                    return 3;
                } else if (class93.method664((byte) 54, var1)) {
                    return 4;
                } else {
                    return 5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "([I[IIII)V")
    public static final void method2080(int[] arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field4721++;
        if (arg4 < arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg4;
            int var7 = arg1[var5];
            arg1[var5] = arg1[arg2];
            arg1[arg2] = var7;
            int var8 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var8;
            int var9 = ~var7 == Integer.MIN_VALUE ? 0 : 1;
            for (int var10 = arg4; var10 < arg2; var10++) {
                if (arg1[var10] < (var10 & var9) + var7) {
                    int var11 = arg1[var10];
                    arg1[var10] = arg1[var6];
                    arg1[var6] = var11;
                    int var12 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var12;
                }
            }
            arg1[arg2] = arg1[var6];
            arg1[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var8;
            method2080(arg0, arg1, var6 - 1, 0, arg4);
            method2080(arg0, arg1, arg2, arg3, var6 + 1);
        }
        if (arg3 != 0) {
            method2081(null, 20);
        }
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(I)I")
    public final int method1264(int arg0) {
        if (arg0 != 14699) {
            this.method1261(-101, 65, -34, false, 2.1855276F, 10);
        }
        field4734++;
        return this.field4723;
    }

    @OriginalMember(owner = "client!vw", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;")
    public static final String method2081(String arg0, int arg1) {
        field4724++;
        String var2 = null;
        int var3 = arg0.indexOf("--> ");
        if (var3 >= 0) {
            var2 = arg0.substring(0, var3 + 4);
            arg0 = arg0.substring(var3 + 4);
        }
        if (arg0.startsWith("directlogin ")) {
            int var4 = arg0.indexOf(" ", "directlogin ".length());
            if (var4 >= 0) {
                int var5 = arg0.length();
                arg0 = arg0.substring(0, var4) + " ";
                for (int var6 = var4 + 1; var6 < var5; var6++) {
                    arg0 = arg0 + "*";
                }
            }
        }
        if (arg1 >= -35) {
            field4726 = -75;
        }
        return var2 == null ? arg0 : var2 + arg0;
    }

    @OriginalMember(owner = "client!vw", name = "<init>", descriptor = "(Lcb;Lcb;Lcb;)V")
    public class318(class544 arg0, class544 arg1, class544 arg2) {
        this.field4727 = arg1;
        this.field4728 = arg2;
        class120 var4 = new class120(arg0.method3150(0, 31, 0));
        this.field4723 = var4.method898((byte) -91);
        this.field4737 = new class181[this.field4723];
        for (int var5 = 0; var5 < this.field4723; var5++) {
            if (var4.method842(2384) == 1) {
                this.field4737[var5] = new class181();
            }
        }
        for (int var6 = 0; var6 < this.field4723; var6++) {
            if (this.field4737[var6] != null) {
                this.field4737[var6].field2744 = var4.method842(2384) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field4723; var7++) {
            if (this.field4737[var7] != null) {
                this.field4737[var7].field2742 = var4.method842(2384) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field4723; var8++) {
            if (this.field4737[var8] != null) {
                this.field4737[var8].field2738 = var4.method842(2384) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field4723; var9++) {
            if (this.field4737[var9] != null) {
                this.field4737[var9].field2739 = var4.method877(-252);
            }
        }
        for (int var10 = 0; var10 < this.field4723; var10++) {
            if (this.field4737[var10] != null) {
                this.field4737[var10].field2748 = var4.method877(-252);
            }
        }
        for (int var11 = 0; var11 < this.field4723; var11++) {
            if (this.field4737[var11] != null) {
                this.field4737[var11].field2745 = var4.method877(-252);
            }
        }
        for (int var12 = 0; var12 < this.field4723; var12++) {
            if (this.field4737[var12] != null) {
                this.field4737[var12].field2737 = var4.method877(-252);
            }
        }
        for (int var13 = 0; var13 < this.field4723; var13++) {
            if (this.field4737[var13] != null) {
                this.field4737[var13].field2747 = (short) var4.method898((byte) -127);
            }
        }
        for (int var14 = 0; var14 < this.field4723; var14++) {
            if (this.field4737[var14] != null) {
                this.field4737[var14].field2740 = var4.method877(-252);
            }
        }
        for (int var15 = 0; var15 < this.field4723; var15++) {
            if (this.field4737[var15] != null) {
                this.field4737[var15].field2736 = var4.method877(-252);
            }
        }
        for (int var16 = 0; var16 < this.field4723; var16++) {
            if (this.field4737[var16] != null) {
                this.field4737[var16].field2734 = var4.method842(2384) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field4723; var17++) {
            if (this.field4737[var17] != null) {
                this.field4737[var17].field2735 = var4.method842(2384) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field4723; var18++) {
            if (this.field4737[var18] != null) {
                this.field4737[var18].field2758 = var4.method877(-252);
            }
        }
        for (int var19 = 0; var19 < this.field4723; var19++) {
            if (this.field4737[var19] != null) {
                this.field4737[var19].field2752 = var4.method842(2384) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field4723; var20++) {
            if (this.field4737[var20] != null) {
                this.field4737[var20].field2755 = var4.method842(2384) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field4723; var21++) {
            if (this.field4737[var21] != null) {
                this.field4737[var21].field2750 = var4.method842(2384) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field4723; var22++) {
            if (this.field4737[var22] != null) {
                this.field4737[var22].field2746 = var4.method842(2384);
            }
        }
        for (int var23 = 0; var23 < this.field4723; var23++) {
            if (this.field4737[var23] != null) {
                this.field4737[var23].field2749 = var4.method871(23995);
            }
        }
        for (int var24 = 0; var24 < this.field4723; var24++) {
            if (this.field4737[var24] != null) {
                this.field4737[var24].field2751 = var4.method842(2384);
            }
        }
    }
}
