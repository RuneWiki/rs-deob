import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class62 implements class149 {

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "Ldv;")
    private class657 field769 = new class657(256);

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "Lfp;")
    private class323 field766;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "Lfp;")
    private class323 field771;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "I")
    private int field767;

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "[Lis;")
    private class502[] field772;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "I")
    public static int field759 = -2;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "Lgda;")
    public static class53 field773 = new class53(10, 16);

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "[Ljc;")
    public static class439[] field762;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)I", line = 6)
    public final int method528(byte arg0) {
        field768++;
        if (arg0 > -110) {
            this.field771 = null;
        }
        return this.field767;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V", line = 19)
    public static void method529(int arg0) {
        field773 = null;
        field762 = null;
        if (arg0 != 3198) {
            method529(16);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIZFII)[I", line = 32)
    public final int[] method530(int arg0, int arg1, boolean arg2, float arg3, int arg4, int arg5) {
        field761++;
        return arg1 > -89 ? null : this.method533(-6605, arg5).method3359(arg4, this, (double) arg3, arg0, (byte) 68, this.field766, this.field772[arg5].field7205);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)Z", line = 45)
    public final boolean method531(int arg0, int arg1) {
        int var3 = 94 % ((arg1 + 33) / 63);
        field760++;
        class597 var4 = this.method533(-6605, arg0);
        return var4 != null && var4.method3361(this.field766, this, (byte) 87);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(BI)Lis;", line = 62)
    public final class502 method532(byte arg0, int arg1) {
        if (arg0 <= 126) {
            this.method534(false, -90, 61, -70, -0.060712732F, -27);
        }
        field763++;
        return this.field772[arg1];
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)Loea;", line = 77)
    private final class597 method533(int arg0, int arg1) {
        field764++;
        class583 var3 = this.field769.method3612(arg0 + 6619, (long) arg1);
        if (var3 != null) {
            return (class597) var3;
        } else if (arg0 == -6605) {
            byte[] var4 = this.field771.method2108(arg1, arg0 + 6605);
            if (var4 == null) {
                return null;
            } else {
                class597 var5 = new class597(new class675(var4));
                this.field769.method3611(var5, (byte) 36, (long) arg1);
                return var5;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZIIIFI)[I", line = 103)
    public final int[] method534(boolean arg0, int arg1, int arg2, int arg3, float arg4, int arg5) {
        field765++;
        if (arg2 != 20377) {
            this.method533(-57, 70);
        }
        return this.method533(-6605, arg5).method3360(this.field772[arg5].field7205, this.field766, 255, arg3, arg0, arg1, (double) arg4, this);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIFZ)[F", line = 114)
    public final float[] method535(int arg0, int arg1, int arg2, int arg3, float arg4, boolean arg5) {
        field770++;
        if (arg1 != -23173) {
            this.field767 = -34;
        }
        return this.method533(arg1 ^ 0x4348, arg3).method3363(this.field772[arg3].field7205, arg0, this, this.field766, 10028, arg2);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lfp;Lfp;Lfp;)V", line = 133)
    public class62(class323 arg0, class323 arg1, class323 arg2) {
        this.field766 = arg2;
        this.field771 = arg1;
        class675 var4 = new class675(arg0.method2100(0, (byte) 112, 0));
        this.field767 = var4.method3757((byte) -65);
        this.field772 = new class502[this.field767];
        for (int var5 = 0; var5 < this.field767; var5++) {
            if (var4.method3750((byte) 35) == 1) {
                this.field772[var5] = new class502();
            }
        }
        for (int var6 = 0; var6 < this.field767; var6++) {
            if (this.field772[var6] != null) {
                this.field772[var6].field7194 = var4.method3750((byte) 35) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field767; var7++) {
            if (this.field772[var7] != null) {
                this.field772[var7].field7208 = var4.method3750((byte) 35) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field767; var8++) {
            if (this.field772[var8] != null) {
                this.field772[var8].field7201 = var4.method3750((byte) 35) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field767; var9++) {
            if (this.field772[var9] != null) {
                this.field772[var9].field7196 = var4.method3719(1854307120);
            }
        }
        for (int var10 = 0; var10 < this.field767; var10++) {
            if (this.field772[var10] != null) {
                this.field772[var10].field7192 = var4.method3719(1854307120);
            }
        }
        for (int var11 = 0; var11 < this.field767; var11++) {
            if (this.field772[var11] != null) {
                this.field772[var11].field7204 = var4.method3719(1854307120);
            }
        }
        for (int var12 = 0; var12 < this.field767; var12++) {
            if (this.field772[var12] != null) {
                this.field772[var12].field7195 = var4.method3719(1854307120);
            }
        }
        for (int var13 = 0; var13 < this.field767; var13++) {
            if (this.field772[var13] != null) {
                this.field772[var13].field7191 = (short) var4.method3757((byte) -65);
            }
        }
        for (int var14 = 0; var14 < this.field767; var14++) {
            if (this.field772[var14] != null) {
                this.field772[var14].field7207 = var4.method3719(1854307120);
            }
        }
        for (int var15 = 0; var15 < this.field767; var15++) {
            if (this.field772[var15] != null) {
                this.field772[var15].field7193 = var4.method3719(1854307120);
            }
        }
        for (int var16 = 0; var16 < this.field767; var16++) {
            if (this.field772[var16] != null) {
                this.field772[var16].field7188 = var4.method3750((byte) 35) == 1;
            }
        }
        for (int var17 = 0; var17 < this.field767; var17++) {
            if (this.field772[var17] != null) {
                this.field772[var17].field7205 = var4.method3750((byte) 35) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field767; var18++) {
            if (this.field772[var18] != null) {
                this.field772[var18].field7200 = var4.method3719(1854307120);
            }
        }
        for (int var19 = 0; var19 < this.field767; var19++) {
            if (this.field772[var19] != null) {
                this.field772[var19].field7198 = var4.method3750((byte) 35) == 1;
            }
        }
        for (int var20 = 0; var20 < this.field767; var20++) {
            if (this.field772[var20] != null) {
                this.field772[var20].field7197 = var4.method3750((byte) 35) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field767; var21++) {
            if (this.field772[var21] != null) {
                this.field772[var21].field7190 = var4.method3750((byte) 35) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field767; var22++) {
            if (this.field772[var22] != null) {
                this.field772[var22].field7189 = var4.method3750((byte) 35);
            }
        }
        for (int var23 = 0; var23 < this.field767; var23++) {
            if (this.field772[var23] != null) {
                this.field772[var23].field7199 = var4.method3703(117);
            }
        }
        for (int var24 = 0; var24 < this.field767; var24++) {
            if (this.field772[var24] != null) {
                this.field772[var24].field7203 = var4.method3750((byte) 35);
            }
        }
    }
}
