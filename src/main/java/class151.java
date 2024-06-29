import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class151 implements class79 {

    @OriginalMember(owner = "client!fm", name = "k", descriptor = "Loe;")
    private class98 field2035 = new class98(256);

    @OriginalMember(owner = "client!fm", name = "j", descriptor = "Ldn;")
    private class201 field2034;

    @OriginalMember(owner = "client!fm", name = "h", descriptor = "Ldn;")
    private class201 field2032;

    @OriginalMember(owner = "client!fm", name = "i", descriptor = "[Ldv;")
    private class499[] field2033;

    @OriginalMember(owner = "client!fm", name = "e", descriptor = "Loi;")
    public static class169 field2029 = new class169("Loading interface scripts - ", "Lade Interface-Skripte - ", "Chargement des interfaces - ", "Carregando interfaces - ");

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!fm", name = "d", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!fm", name = "f", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!fm", name = "g", descriptor = "I")
    public static int field2031;

    @OriginalMember(owner = "client!fm", name = "l", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!fm", name = "m", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(FIIBZI)[I", line = 4)
    public final int[] method458(float arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5) {
        field2031++;
        if (arg3 != 0) {
            this.method1043(101, -54);
        }
        return this.method1043(-53, arg5).method3008(arg4, arg1, this.field2034, this, (double) arg0, -98, this.field2033[arg5].field7330, arg2);
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(II)Ldv;", line = 16)
    public final class499 method460(int arg0, int arg1) {
        field2027++;
        if (arg0 != -26282) {
            this.field2035 = null;
        }
        return this.field2033[arg1];
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lsc;IIII)V", line = 32)
    public static final void method1041(class265 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 == 1 && arg3 > 0) {
            class492.method2941(arg0, arg2, arg3 - 1, arg4);
        } else if (arg1 == 4 && arg3 <= class166.field2155) {
            class492.method2941(arg0, arg2, arg3 + 1, arg4);
        } else if (arg1 == 8 && arg4 > 0) {
            class492.method2941(arg0, arg2, arg3, arg4 - 1);
        } else if (arg1 == 2 && arg4 <= class13.field230) {
            class492.method2941(arg0, arg2, arg3, arg4 + 1);
        } else if (arg1 == 16 && arg3 > 0 && arg4 <= class13.field230) {
            class492.method2941(arg0, arg2, arg3 - 1, arg4 + 1);
        } else if (arg1 == 32 && arg3 <= class166.field2155 && arg4 <= class13.field230) {
            class492.method2941(arg0, arg2, arg3 + 1, arg4 + 1);
        } else if (arg1 == 128 && arg3 > 0 && arg4 > 0) {
            class492.method2941(arg0, arg2, arg3 - 1, arg4 - 1);
        } else if (arg1 == 64 && arg3 <= class166.field2155 && arg4 > 0) {
            class492.method2941(arg0, arg2, arg3 + 1, arg4 - 1);
        } else {
            throw new RuntimeException("Unsupported wall shape " + arg1 + " in world2.setclosestlights_wall");
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZ)Z", line = 83)
    public final boolean method461(int arg0, boolean arg1) {
        if (arg1) {
            field2029 = null;
        }
        field2026++;
        class505 var3 = this.method1043(-93, arg0);
        return var3 != null && var3.method3005(this, this.field2034, (byte) 32);
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)Ltv;", line = 98)
    public static final class292 method1042(int arg0, int arg1) {
        field2028++;
        class292 var2 = (class292) class78.field994.method78((long) arg0, (byte) -128);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class458.field6409.method1313((byte) -111, arg1, arg0);
        class292 var4 = new class292();
        if (var3 != null) {
            var4.method1760(new class88(var3), -1);
        }
        var4.method1762(2940);
        class78.field994.method88((long) arg0, arg1 ^ 0x78, var4);
        return var4;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IZFIII)[I", line = 123)
    public final int[] method457(int arg0, boolean arg1, float arg2, int arg3, int arg4, int arg5) {
        if (arg3 != 12071) {
            this.field2033 = null;
        }
        field2030++;
        return this.method1043(-28, arg4).method3006(this.field2033[arg4].field7330, (byte) 77, this, this.field2034, (double) arg2, arg0, arg5);
    }

    @OriginalMember(owner = "client!fm", name = "c", descriptor = "(II)Law;", line = 138)
    private final class505 method1043(int arg0, int arg1) {
        field2037++;
        class85 var3 = this.field2035.method672((long) arg1, (byte) -75);
        if (var3 != null) {
            return (class505) var3;
        }
        if (arg0 > -22) {
            this.field2034 = null;
        }
        byte[] var4 = this.field2032.method1320(arg1, 1);
        if (var4 == null) {
            return null;
        } else {
            class505 var5 = new class505(new class88(var4));
            this.field2035.method668(var5, (long) arg1, -1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IBII)Lgf;", line = 164)
    public static final class395 method1044(int arg0, byte arg1, int arg2, int arg3) {
        field2036++;
        class510 var4 = class470.field6877[arg2][arg3][arg0];
        if (arg1 != -15) {
            method1041(null, 31, -105, -7, -31);
        }
        if (var4 == null) {
            return null;
        }
        class395 var5 = null;
        int var6 = -1;
        for (class319 var7 = var4.field7494; var7 != null; var7 = var7.field4102) {
            class448 var8 = var7.field4107;
            if (var8 instanceof class395) {
                class395 var9 = (class395) var8;
                int var10 = var9.method2342(10804) * 64 + 60 - 64;
                int var11 = var9.field6239 - var10 >> 7;
                int var12 = var9.field6241 - var10 >> 7;
                int var13 = var9.field6239 + var10 >> 7;
                int var14 = var9.field6241 + var10 >> 7;
                if (arg3 >= var11 && arg0 >= var12 && var13 >= arg3 && var14 >= arg0) {
                    int var15 = (var13 + 1 - arg3) * (var14 + 1 - arg0);
                    if (var6 < var15) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(I)V", line = 223)
    public static void method1045(int arg0) {
        field2029 = null;
        if (arg0 != 9924) {
            field2029 = null;
        }
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Ldn;Ldn;Ldn;)V", line = 251)
    public class151(class201 arg0, class201 arg1, class201 arg2) {
        this.field2034 = arg2;
        this.field2032 = arg1;
        class88 var4 = new class88(arg0.method1313((byte) -120, 0, 0));
        int var5 = var4.method568((byte) 110);
        this.field2033 = new class499[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method617(2) == 1) {
                this.field2033[var6] = new class499();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2033[var7] != null) {
                this.field2033[var7].field7335 = var4.method617(2) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2033[var8] != null) {
                this.field2033[var8].field7349 = var4.method617(2) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2033[var9] != null) {
                this.field2033[var9].field7331 = var4.method617(2) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2033[var10] != null) {
                this.field2033[var10].field7348 = var4.method617(2) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2033[var11] != null) {
                this.field2033[var11].field7346 = var4.method575(-65);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2033[var12] != null) {
                this.field2033[var12].field7334 = var4.method575(-128);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2033[var13] != null) {
                this.field2033[var13].field7352 = var4.method575(-87);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2033[var14] != null) {
                this.field2033[var14].field7333 = var4.method575(-43);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2033[var15] != null) {
                this.field2033[var15].field7344 = (short) var4.method568((byte) 110);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field2033[var16] != null) {
                this.field2033[var16].field7329 = var4.method575(-33);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field2033[var17] != null) {
                this.field2033[var17].field7340 = var4.method575(-115);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field2033[var18] != null) {
                this.field2033[var18].field7337 = var4.method617(2) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field2033[var19] != null) {
                this.field2033[var19].field7330 = var4.method617(2) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field2033[var20] != null) {
                this.field2033[var20].field7339 = var4.method575(-16);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field2033[var21] != null) {
                this.field2033[var21].field7345 = var4.method617(2) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field2033[var22] != null) {
                this.field2033[var22].field7350 = var4.method617(2) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field2033[var23] != null) {
                this.field2033[var23].field7347 = var4.method617(2) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field2033[var24] != null) {
                this.field2033[var24].field7341 = var4.method617(2);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field2033[var25] != null) {
                this.field2033[var25].field7351 = var4.method578(127);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ZFBIII)[F", line = 241)
    public final float[] method459(boolean arg0, float arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 < 58) {
            this.field2035 = null;
        }
        field2025++;
        return this.method1043(-58, arg5).method3004(this, arg4, this.field2034, arg3, -5, this.field2033[arg5].field7330);
    }
}
