import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class61 implements class462 {

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "Lks;")
    private class375 field692 = new class375(256);

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Lkea;")
    private class203 field695;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lkea;")
    private class203 field691;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    private int field686;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "[Lpw;")
    private class614[] field698;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "Lkca;")
    public static class73 field700 = new class73(31, 7);

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field701 = -1;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field687;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field688;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field689;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field690;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field693;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field694;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field697;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "I")
    public static int field699;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "Leh;")
    public static class305 field702;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V")
    public static void method431(byte arg0) {
        if (arg0 >= -16) {
            method437((byte) -35, null);
        }
        field702 = null;
        field700 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IFIIIZ)[I")
    public final int[] method432(int arg0, float arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field689++;
        if (arg4 != -18170) {
            this.method440((byte) 92, -120, false, -103, 1.6931353F, -101);
        }
        return this.method435((byte) 76, arg2).method1075((double) arg1, this, this.field691, arg5, arg3, arg0, -1, this.field698[arg2].field8945);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IZIIIF)[I")
    public final int[] method433(int arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5) {
        if (arg0 <= 21) {
            this.method434((byte) -72);
        }
        field696++;
        return this.method435((byte) 107, arg3).method1076(arg4, this, true, (double) arg5, this.field698[arg3].field8945, arg2, this.field691);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I")
    public final int method434(byte arg0) {
        field693++;
        return arg0 == 67 ? this.field686 : 62;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI)Ljf;")
    private final class184 method435(byte arg0, int arg1) {
        field690++;
        class36 var3 = this.field692.method2415((long) arg1, false);
        if (var3 != null) {
            return (class184) var3;
        }
        if (arg0 <= 17) {
            method431((byte) 48);
        }
        byte[] var4 = this.field695.method1308((byte) -127, arg1);
        if (var4 == null) {
            return null;
        } else {
            class184 var5 = new class184(new class194(var4));
            this.field692.method2411((long) arg1, var5, false);
            return var5;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Z")
    public final boolean method436(int arg0, int arg1) {
        if (arg1 == -5686) {
            field697++;
            class184 var3 = this.method435((byte) 28, arg0);
            return var3 != null && var3.method1078(this, (byte) 106, this.field691);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BLjava/lang/String;)[B")
    public static final byte[] method437(byte arg0, String arg1) {
        field688++;
        int var2 = arg1.length();
        if (var2 == 0) {
            return new byte[0];
        }
        int var3 = var2 + 3 & 0xFFFFFFFC;
        int var4 = var3 / 4 * 3;
        if (var3 - 2 >= var2 || class381.method2446(arg0 ^ 0xFFFFFF84, arg1.charAt(var3 - 2)) == -1) {
            var4 -= 2;
        } else if (var3 - 1 >= var2 || class381.method2446(-1, arg1.charAt(var3 - 1)) == -1) {
            var4--;
        }
        if (arg0 == 123) {
            byte[] var5 = new byte[var4];
            class100.method621(0, (byte) 47, arg1, var5);
            return var5;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(II)Lpw;")
    public final class614 method438(int arg0, int arg1) {
        field699++;
        return arg0 < 31 ? null : this.field698[arg1];
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "([FII)[F")
    public static final float[] method439(float[] arg0, int arg1, int arg2) {
        field694++;
        float[] var3 = new float[arg1];
        class210.method1328(arg0, 0, var3, arg2, arg1);
        return var3;
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "(Lkea;Lkea;Lkea;)V")
    public class61(class203 arg0, class203 arg1, class203 arg2) {
        this.field695 = arg1;
        this.field691 = arg2;
        class194 var4 = new class194(arg0.method1286(0, 0, (byte) -49));
        this.field686 = var4.method1220(-86);
        this.field698 = new class614[this.field686];
        for (int var5 = 0; var5 < this.field686; var5++) {
            if (var4.method1177(255) == 1) {
                this.field698[var5] = new class614();
            }
        }
        for (int var6 = 0; var6 < this.field686; var6++) {
            if (this.field698[var6] != null) {
                this.field698[var6].field8928 = var4.method1177(255) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field686; var7++) {
            if (this.field698[var7] != null) {
                this.field698[var7].field8938 = var4.method1177(255) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field686; var8++) {
            if (this.field698[var8] != null) {
                this.field698[var8].field8944 = var4.method1177(255) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field686; var9++) {
            if (this.field698[var9] != null) {
                this.field698[var9].field8948 = var4.method1177(255) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field686; var10++) {
            if (this.field698[var10] != null) {
                this.field698[var10].field8939 = var4.method1213((byte) 87);
            }
        }
        for (int var11 = 0; var11 < this.field686; var11++) {
            if (this.field698[var11] != null) {
                this.field698[var11].field8926 = var4.method1213((byte) 55);
            }
        }
        for (int var12 = 0; var12 < this.field686; var12++) {
            if (this.field698[var12] != null) {
                this.field698[var12].field8935 = var4.method1213((byte) 86);
            }
        }
        for (int var13 = 0; var13 < this.field686; var13++) {
            if (this.field698[var13] != null) {
                this.field698[var13].field8925 = var4.method1213((byte) 96);
            }
        }
        for (int var14 = 0; var14 < this.field686; var14++) {
            if (this.field698[var14] != null) {
                this.field698[var14].field8934 = (short) var4.method1220(121);
            }
        }
        for (int var15 = 0; var15 < this.field686; var15++) {
            if (this.field698[var15] != null) {
                this.field698[var15].field8927 = var4.method1213((byte) 105);
            }
        }
        for (int var16 = 0; var16 < this.field686; var16++) {
            if (this.field698[var16] != null) {
                this.field698[var16].field8933 = var4.method1213((byte) 41);
            }
        }
        for (int var17 = 0; var17 < this.field686; var17++) {
            if (this.field698[var17] != null) {
                this.field698[var17].field8946 = var4.method1177(255) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field686; var18++) {
            if (this.field698[var18] != null) {
                this.field698[var18].field8945 = var4.method1177(255) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field686; var19++) {
            if (this.field698[var19] != null) {
                this.field698[var19].field8940 = var4.method1213((byte) 127);
            }
        }
        for (int var20 = 0; var20 < this.field686; var20++) {
            if (this.field698[var20] != null) {
                this.field698[var20].field8932 = var4.method1177(255) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field686; var21++) {
            if (this.field698[var21] != null) {
                this.field698[var21].field8947 = var4.method1177(255) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field686; var22++) {
            if (this.field698[var22] != null) {
                this.field698[var22].field8937 = var4.method1177(255) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field686; var23++) {
            if (this.field698[var23] != null) {
                this.field698[var23].field8930 = var4.method1177(255);
            }
        }
        for (int var24 = 0; var24 < this.field686; var24++) {
            if (this.field698[var24] != null) {
                this.field698[var24].field8929 = var4.method1178(-230315992);
            }
        }
        for (int var25 = 0; var25 < this.field686; var25++) {
            if (this.field698[var25] != null) {
                this.field698[var25].field8943 = var4.method1177(255) == 1;
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIZIFI)[F")
    public final float[] method440(byte arg0, int arg1, boolean arg2, int arg3, float arg4, int arg5) {
        field687++;
        if (arg0 >= -38) {
            this.method433(2, false, -121, 84, -113, -0.9081013F);
        }
        return this.method435((byte) 107, arg5).method1074(-1, arg1, arg3, this.field698[arg5].field8945, this, this.field691);
    }
}
