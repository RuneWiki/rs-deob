import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class226 implements class373 {

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "Lbn;")
    private class348 field3245 = new class348(256);

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "Lns;")
    private class438 field3242;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "Lns;")
    private class438 field3243;

    @OriginalMember(owner = "client!pn", name = "j", descriptor = "[Lij;")
    private class263[] field3251;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "Lui;")
    public static class375 field3247 = new class375("Loading core fonts - ", "Lade Schriftarten - ", "Chargement des polices - ", "Carregando fontes principais - ");

    @OriginalMember(owner = "client!pn", name = "n", descriptor = "Lbr;")
    public static class380 field3255 = new class380();

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field3244;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public static int field3248;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!pn", name = "k", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!pn", name = "l", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!pn", name = "m", descriptor = "I")
    public static int field3254;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static final void method1550(int arg0) {
        if (arg0 != -1127) {
            method1550(-33);
        }
        field3248++;
        if (class327.field5012) {
            return;
        }
        class314.field4804 = true;
        class327.field5012 = true;
        if (class96.field1399.field5229) {
            class482.field7022 = ((int) class482.field7022 - 65 & 0xFFFFFF80);
        } else {
            class186.field2619 += (-24.0F - class186.field2619) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZIIIFI)[I")
    public final int[] method1551(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5) {
        field3250++;
        if (arg5 != 19881) {
            this.field3243 = null;
        }
        return this.method1555(arg5 ^ 0xFFFFF269, arg1).method342((double) arg4, arg5 ^ 0x4DFB, this, arg3, this.field3242, this.field3251[arg1].field3669, arg2);
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(FIZIZI)[I")
    public final int[] method1552(float arg0, int arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        field3246++;
        return arg2 ? this.method1555(-16448, arg1).method341(true, arg3, arg5, this, this.field3251[arg1].field3669, (double) arg0, arg4, this.field3242) : null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(JI)V")
    public static final void method1553(long arg0, int arg1) {
        field3252++;
        int var3 = class274.field3815;
        if (arg1 != 0) {
            field3255 = null;
        }
        int var4 = class209.field2963;
        if (class165.field2409 != var3) {
            int var5 = var3 - class165.field2409;
            int var6 = (int) ((long) var5 * arg0 / 320L);
            if (var5 <= 0) {
                if (var6 == 0) {
                    var6 = -1;
                } else if (var6 < var5) {
                    var6 = var5;
                }
            } else if (var6 == 0) {
                var6 = 1;
            } else if (var5 < var6) {
                var6 = var5;
            }
            class165.field2409 += var6;
        }
        if (class205.field2896 != var4) {
            int var7 = var4 - class205.field2896;
            int var8 = (int) ((long) var7 * arg0 / 320L);
            if (var7 <= 0) {
                if (var8 == 0) {
                    var8 = -1;
                } else if (var8 < var7) {
                    var8 = var7;
                }
            } else if (var8 == 0) {
                var8 = 1;
            } else if (var8 > var7) {
                var8 = var7;
            }
            class205.field2896 += var8;
        }
        if (!class96.field1399.field5229) {
            class99.field1428 += (float) arg0 * class128.field1809 / 40.0F * 8.0F;
            class482.field7022 += (float) arg0 * class186.field2619 / 40.0F * 8.0F;
        }
        class225.method1525(3);
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
    public static void method1554(int arg0) {
        field3255 = null;
        if (arg0 > -103) {
            method1553(-34L, 20);
        }
        field3247 = null;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(II)Lnn;")
    private final class45 method1555(int arg0, int arg1) {
        field3244++;
        class86 var3 = this.field3245.method2211((long) arg1, arg0 ^ 0x4040);
        if (var3 != null) {
            return (class45) var3;
        }
        if (arg0 != -16448) {
            field3247 = null;
        }
        byte[] var4 = this.field3243.method2638(true, arg1);
        if (var4 == null) {
            return null;
        } else {
            class45 var5 = new class45(new class91(var4));
            this.field3245.method2216(var5, (long) arg1, -25431);
            return var5;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ZI)Z")
    public final boolean method1556(boolean arg0, int arg1) {
        field3254++;
        if (arg0) {
            class45 var3 = this.method1555(-16448, arg1);
            return var3 != null && var3.method344(this, (byte) 55, this.field3242);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIZFI)[F")
    public final float[] method1557(int arg0, int arg1, int arg2, boolean arg3, float arg4, int arg5) {
        if (arg2 > -34) {
            this.field3251 = null;
        }
        field3249++;
        return this.method1555(-16448, arg1).method343(6, this.field3242, this, arg0, arg5, this.field3251[arg1].field3669);
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(Lns;Lns;Lns;)V")
    public class226(class438 arg0, class438 arg1, class438 arg2) {
        this.field3242 = arg2;
        this.field3243 = arg1;
        class91 var4 = new class91(arg0.method2650(0, -110, 0));
        int var5 = var4.method631(10494);
        this.field3251 = new class263[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method618((byte) 100) == 1) {
                this.field3251[var6] = new class263();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field3251[var7] != null) {
                this.field3251[var7].field3665 = var4.method618((byte) 100) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field3251[var8] != null) {
                this.field3251[var8].field3672 = var4.method618((byte) 100) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field3251[var9] != null) {
                this.field3251[var9].field3654 = var4.method618((byte) 100) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field3251[var10] != null) {
                this.field3251[var10].field3663 = var4.method618((byte) 100) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field3251[var11] != null) {
                this.field3251[var11].field3661 = var4.method619((byte) -23);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field3251[var12] != null) {
                this.field3251[var12].field3660 = var4.method619((byte) -23);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field3251[var13] != null) {
                this.field3251[var13].field3671 = var4.method619((byte) -23);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field3251[var14] != null) {
                this.field3251[var14].field3656 = var4.method619((byte) -23);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field3251[var15] != null) {
                this.field3251[var15].field3668 = (short) var4.method631(10494);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field3251[var16] != null) {
                this.field3251[var16].field3664 = var4.method619((byte) -23);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field3251[var17] != null) {
                this.field3251[var17].field3655 = var4.method619((byte) -23);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field3251[var18] != null) {
                this.field3251[var18].field3653 = var4.method618((byte) 100) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field3251[var19] != null) {
                this.field3251[var19].field3669 = var4.method618((byte) 100) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field3251[var20] != null) {
                this.field3251[var20].field3673 = var4.method619((byte) -23);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field3251[var21] != null) {
                this.field3251[var21].field3667 = var4.method618((byte) 100) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field3251[var22] != null) {
                this.field3251[var22].field3674 = var4.method618((byte) 100) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field3251[var23] != null) {
                this.field3251[var23].field3670 = var4.method618((byte) 100) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field3251[var24] != null) {
                this.field3251[var24].field3666 = var4.method618((byte) 100);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field3251[var25] != null) {
                this.field3251[var25].field3659 = var4.method626((byte) 100);
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IB)Lij;")
    public final class263 method1558(int arg0, byte arg1) {
        if (arg1 <= 101) {
            return null;
        } else {
            field3253++;
            return this.field3251[arg0];
        }
    }
}
