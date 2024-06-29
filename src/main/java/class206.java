import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class206 implements class11 {

    @OriginalMember(owner = "client!hp", name = "l", descriptor = "Llg;")
    private class274 field3239 = new class274(256);

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "Llt;")
    private class458 field3233;

    @OriginalMember(owner = "client!hp", name = "n", descriptor = "Llt;")
    private class458 field3241;

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "[Lsh;")
    private class48[] field3230;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "Lbg;")
    public static class310 field3229 = new class310(33, 3);

    @OriginalMember(owner = "client!hp", name = "j", descriptor = "Lke;")
    public static class407 field3237 = new class407(32);

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public static int field3228;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field3231;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "I")
    public static int field3232;

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field3234;

    @OriginalMember(owner = "client!hp", name = "h", descriptor = "I")
    public static int field3235;

    @OriginalMember(owner = "client!hp", name = "i", descriptor = "I")
    public static int field3236;

    @OriginalMember(owner = "client!hp", name = "k", descriptor = "I")
    public static int field3238;

    @OriginalMember(owner = "client!hp", name = "m", descriptor = "I")
    public static int field3240;

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IB)Z", line = 6)
    public final boolean method61(int arg0, byte arg1) {
        if (arg1 > -62) {
            return false;
        } else {
            field3228++;
            class411 var3 = this.method1264(0, arg0);
            return var3 != null && var3.method2427(this, 16807, this.field3241);
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IFZIII)[I", line = 24)
    public final int[] method58(int arg0, float arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg5 == 19907) {
            field3240++;
            return this.method1264(0, arg3).method2424(this.field3241, this.field3230[arg3].field729, (double) arg1, arg0, this, 255, arg4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(B)V", line = 35)
    public static void method1263(byte arg0) {
        field3229 = null;
        if (arg0 == -99) {
            field3237 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(II)Lqs;", line = 54)
    private final class411 method1264(int arg0, int arg1) {
        field3236++;
        class251 var3 = this.field3239.method1666(arg0 - 128, (long) arg1);
        if (var3 != null) {
            return (class411) var3;
        }
        byte[] var4 = this.field3233.method2734(arg1, (byte) 78);
        if (var4 == null) {
            return null;
        }
        if (arg0 != 0) {
            this.field3230 = null;
        }
        class411 var5 = new class411(new class40(var4));
        this.field3239.method1668((byte) -128, (long) arg1, var5);
        return var5;
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(Llt;III)Lpm;", line = 78)
    public static final class396 method1265(class458 arg0, int arg1, int arg2, int arg3) {
        field3232++;
        if (arg3 <= 29) {
            method1263((byte) 25);
        }
        byte[] var4 = arg0.method2715(arg2, arg1, false);
        return var4 == null ? null : new class396(var4);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(IZIFII)[I", line = 95)
    public final int[] method60(int arg0, boolean arg1, int arg2, float arg3, int arg4, int arg5) {
        if (arg4 < 100) {
            return null;
        } else {
            field3235++;
            return this.method1264(0, arg2).method2429(arg0, this, arg1, arg5, this.field3230[arg2].field729, (byte) 94, this.field3241, (double) arg3);
        }
    }

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "(B)Loa;", line = 111)
    public static final class471 method1266(byte arg0) {
        field3231++;
        class244.field3672 = 0;
        return arg0 > -82 ? null : class273.method1661((byte) -100);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(FZIIII)[F", line = 125)
    public final float[] method57(float arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 != 2285) {
            this.field3239 = null;
        }
        field3238++;
        return this.method1264(0, arg5).method2425(arg4 - 2285, this.field3230[arg5].field729, arg3, this.field3241, this, arg2);
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(II)Lsh;", line = 137)
    public final class48 method59(int arg0, int arg1) {
        field3234++;
        if (arg1 != 21645) {
            this.field3239 = null;
        }
        return this.field3230[arg0];
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(Llt;Llt;Llt;)V", line = 152)
    public class206(class458 arg0, class458 arg1, class458 arg2) {
        this.field3233 = arg1;
        this.field3241 = arg2;
        class40 var4 = new class40(arg0.method2715(0, 0, false));
        int var5 = var4.method254((byte) -93);
        this.field3230 = new class48[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method257((byte) 127) == 1) {
                this.field3230[var6] = new class48();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3230[var7] != null) {
                this.field3230[var7].field733 = var4.method257((byte) 58) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3230[var8] != null) {
                this.field3230[var8].field739 = var4.method257((byte) 33) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3230[var9] != null) {
                this.field3230[var9].field735 = var4.method257((byte) 116) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3230[var10] != null) {
                this.field3230[var10].field734 = var4.method257((byte) 117) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3230[var11] != null) {
                this.field3230[var11].field723 = var4.method262(-2);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3230[var12] != null) {
                this.field3230[var12].field727 = var4.method262(-2);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3230[var13] != null) {
                this.field3230[var13].field728 = var4.method262(-2);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3230[var14] != null) {
                this.field3230[var14].field732 = var4.method262(-2);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3230[var15] != null) {
                this.field3230[var15].field737 = (short) var4.method254((byte) -63);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field3230[var16] != null) {
                this.field3230[var16].field740 = var4.method262(-2);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field3230[var17] != null) {
                this.field3230[var17].field744 = var4.method262(-2);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field3230[var18] != null) {
                this.field3230[var18].field725 = var4.method257((byte) 68) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field3230[var19] != null) {
                this.field3230[var19].field729 = var4.method257((byte) 71) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field3230[var20] != null) {
                this.field3230[var20].field730 = var4.method262(-2);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field3230[var21] != null) {
                this.field3230[var21].field724 = var4.method257((byte) 64) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field3230[var22] != null) {
                this.field3230[var22].field745 = var4.method257((byte) 96) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field3230[var23] != null) {
                this.field3230[var23].field726 = var4.method257((byte) 116) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field3230[var24] != null) {
                this.field3230[var24].field738 = var4.method257((byte) 127);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field3230[var25] != null) {
                this.field3230[var25].field742 = var4.method255((byte) 96);
            }
        }
    }
}
