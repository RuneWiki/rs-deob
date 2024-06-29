import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class345 implements class288 {

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "Lte;")
    private class357 field5149 = new class357(256);

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "Lir;")
    private class185 field5146;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "Lir;")
    private class185 field5144;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "[Lra;")
    private class3[] field5138;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "I")
    public static int field5136 = -1;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field5134;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field5135;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "I")
    public static int field5137;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field5140;

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public static int field5141;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZIIFI)[I")
    public final int[] method1961(int arg0, boolean arg1, int arg2, int arg3, float arg4, int arg5) {
        field5145++;
        if (arg3 != 22881) {
            this.field5149 = null;
        }
        return this.method2285(arg2, true).method259(this.field5138[arg2].field39, this, (double) arg4, arg1, -51, arg0, this.field5146, arg5);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILir;)V")
    public static final void method2284(int arg0, class185 arg1) {
        if (arg0 == 0) {
            class453.field6587 = arg1;
            field5143++;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZI)Z")
    public final boolean method1960(boolean arg0, int arg1) {
        if (arg0) {
            this.method1962(-7, 101);
        }
        field5137++;
        class33 var3 = this.method2285(arg1, true);
        return var3 != null && var3.method254(this.field5146, 117, this);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZFII)[F")
    public final float[] method1959(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        int var7 = 68 % ((5 - arg0) / 37);
        field5148++;
        return this.method2285(arg4, true).method256(this.field5138[arg4].field39, arg5, this.field5146, arg1, this, 0);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)Lra;")
    public final class3 method1962(int arg0, int arg1) {
        if (arg1 != -11999) {
            this.method1961(-55, true, 121, -64, -1.4051808F, -48);
        }
        field5134++;
        return this.field5138[arg0];
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)Ljs;")
    private final class33 method2285(int arg0, boolean arg1) {
        field5140++;
        class443 var3 = this.field5149.method2348(112, (long) arg0);
        if (var3 != null) {
            return (class33) var3;
        }
        byte[] var4 = this.field5144.method1234(arg0, (byte) 76);
        if (var4 == null) {
            return null;
        }
        if (!arg1) {
            field5141 = 23;
        }
        class33 var5 = new class33(new class341(var4));
        this.field5149.method2350(var5, (long) arg0, -94);
        return var5;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIZIF)[I")
    public final int[] method1958(int arg0, int arg1, int arg2, boolean arg3, int arg4, float arg5) {
        field5147++;
        if (arg0 != 22410) {
            field5139 = -114;
        }
        return this.method2285(arg4, true).method258(arg2, (double) arg5, this.field5138[arg4].field39, this, (byte) -112, this.field5146, arg1);
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)V")
    public static final void method2286(int arg0, int arg1) {
        class396.field5784 = arg1;
        class169.field2281 = -1;
        class280.field4118 = 3;
        if (arg0 != -29128) {
            method2284(67, (class185) null);
        }
        field5135++;
        class184.field2463 = 100;
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(Lir;Lir;Lir;)V")
    public class345(class185 arg0, class185 arg1, class185 arg2) {
        this.field5146 = arg2;
        this.field5144 = arg1;
        class341 var4 = new class341(arg0.method1235(0, false, 0));
        int var5 = var4.method2239(-1076227960);
        this.field5138 = new class3[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2233((byte) 104) == 1) {
                this.field5138[var6] = new class3();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field5138[var7] != null) {
                this.field5138[var7].field26 = var4.method2233((byte) 104) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field5138[var8] != null) {
                this.field5138[var8].field48 = var4.method2233((byte) 104) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field5138[var9] != null) {
                this.field5138[var9].field34 = var4.method2233((byte) 104) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field5138[var10] != null) {
                this.field5138[var10].field31 = var4.method2233((byte) 104) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field5138[var11] != null) {
                this.field5138[var11].field40 = var4.method2211(255);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field5138[var12] != null) {
                this.field5138[var12].field33 = var4.method2211(255);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field5138[var13] != null) {
                this.field5138[var13].field45 = var4.method2211(255);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field5138[var14] != null) {
                this.field5138[var14].field47 = var4.method2211(255);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field5138[var15] != null) {
                this.field5138[var15].field37 = (short) var4.method2239(-1076227960);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field5138[var16] != null) {
                this.field5138[var16].field30 = var4.method2211(255);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field5138[var17] != null) {
                this.field5138[var17].field42 = var4.method2211(255);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field5138[var18] != null) {
                this.field5138[var18].field38 = var4.method2233((byte) 104) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field5138[var19] != null) {
                this.field5138[var19].field39 = var4.method2233((byte) 104) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field5138[var20] != null) {
                this.field5138[var20].field43 = var4.method2211(255);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field5138[var21] != null) {
                this.field5138[var21].field35 = var4.method2233((byte) 104) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field5138[var22] != null) {
                this.field5138[var22].field44 = var4.method2233((byte) 104) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field5138[var23] != null) {
                this.field5138[var23].field27 = var4.method2233((byte) 104) == 1;
            }
        }
    }
}
