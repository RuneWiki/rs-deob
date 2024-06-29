import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class152 implements class127 {

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "Lgf;")
    private class400 field2340 = new class400(256);

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "Ldk;")
    private class421 field2342;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Ldk;")
    private class421 field2338;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "[Lmj;")
    private class249[] field2335;

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Lad;")
    public static class12 field2343 = null;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field2334;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field2337;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field2339;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "I")
    public static int field2341;

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "I")
    public static int field2344;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V")
    public static void method1096(int arg0) {
        field2343 = null;
        if (arg0 != -13171) {
            field2343 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Z")
    public final boolean method918(int arg0, int arg1) {
        field2344++;
        if (arg1 <= 72) {
            field2343 = null;
        }
        class240 var3 = this.method1097((byte) 117, arg0);
        return var3 != null && var3.method1460(this, this.field2338, (byte) -66);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZFIIZ)[I")
    public final int[] method917(int arg0, boolean arg1, float arg2, int arg3, int arg4, boolean arg5) {
        if (!arg1) {
            this.method915(-42, 39, -1.7363868F, (byte) 119, false, -108);
        }
        field2339++;
        return this.method1097((byte) 114, arg3).method1463(this.field2338, this.field2335[arg3].field3380, -128, arg4, arg0, this, (double) arg2);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZI)Lmj;")
    public final class249 method914(boolean arg0, int arg1) {
        field2341++;
        if (arg0) {
            method1096(83);
        }
        return this.field2335[arg1];
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZIZIIF)[F")
    public final float[] method916(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, float arg5) {
        if (arg0) {
            return null;
        } else {
            field2336++;
            return this.method1097((byte) -78, arg4).method1464(this.field2335[arg4].field3380, arg1, arg3, this, 73, this.field2338);
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Ldk;Ldk;Ldk;)V")
    public class152(class421 arg0, class421 arg1, class421 arg2) {
        this.field2342 = arg1;
        this.field2338 = arg2;
        class319 var4 = new class319(arg0.method2512(0, (byte) -93, 0));
        int var5 = var4.method1844(-104);
        this.field2335 = new class249[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1869(-121) == 1) {
                this.field2335[var6] = new class249();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2335[var7] != null) {
                this.field2335[var7].field3391 = var4.method1869(-111) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2335[var8] != null) {
                this.field2335[var8].field3381 = var4.method1869(-127) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2335[var9] != null) {
                this.field2335[var9].field3386 = var4.method1869(-91) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2335[var10] != null) {
                this.field2335[var10].field3384 = var4.method1869(-85) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2335[var11] != null) {
                this.field2335[var11].field3387 = var4.method1894(-2018);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2335[var12] != null) {
                this.field2335[var12].field3393 = var4.method1894(-2018);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2335[var13] != null) {
                this.field2335[var13].field3382 = var4.method1894(-2018);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2335[var14] != null) {
                this.field2335[var14].field3383 = var4.method1894(-2018);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2335[var15] != null) {
                this.field2335[var15].field3377 = (short) var4.method1844(-101);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field2335[var16] != null) {
                this.field2335[var16].field3395 = var4.method1894(-2018);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field2335[var17] != null) {
                this.field2335[var17].field3376 = var4.method1894(-2018);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field2335[var18] != null) {
                this.field2335[var18].field3385 = var4.method1869(-121) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field2335[var19] != null) {
                this.field2335[var19].field3380 = var4.method1869(-98) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field2335[var20] != null) {
                this.field2335[var20].field3388 = var4.method1894(-2018);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field2335[var21] != null) {
                this.field2335[var21].field3375 = var4.method1869(-76) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field2335[var22] != null) {
                this.field2335[var22].field3392 = var4.method1869(-124) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field2335[var23] != null) {
                this.field2335[var23].field3374 = var4.method1869(-86) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field2335[var24] != null) {
                this.field2335[var24].field3378 = var4.method1869(-84);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field2335[var25] != null) {
                this.field2335[var25].field3379 = var4.method1863(-1);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIFBZI)[I")
    public final int[] method915(int arg0, int arg1, float arg2, byte arg3, boolean arg4, int arg5) {
        field2337++;
        if (arg3 != 43) {
            this.field2335 = null;
        }
        return this.method1097((byte) 106, arg1).method1465(arg4, this, arg5, (double) arg2, this.field2338, -1, this.field2335[arg1].field3380, arg0);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BI)Lpr;")
    private final class240 method1097(byte arg0, int arg1) {
        field2334++;
        class287 var3 = this.field2340.method2371((long) arg1, -63);
        int var4 = -77 / ((arg0 - 72) / 32);
        if (var3 != null) {
            return (class240) var3;
        }
        byte[] var5 = this.field2342.method2496(arg1, -119);
        if (var5 == null) {
            return null;
        } else {
            class240 var6 = new class240(new class319(var5));
            this.field2340.method2370(28281, (long) arg1, var6);
            return var6;
        }
    }

    static {
        new class157(null, "die kürzlich gesprochen oder gehandelt haben.", null, null);
    }
}
