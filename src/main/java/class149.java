import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class149 implements class126 {

    @OriginalMember(owner = "client!em", name = "m", descriptor = "Luc;")
    private class23 field2216 = new class23(256);

    @OriginalMember(owner = "client!em", name = "j", descriptor = "Lic;")
    private class491 field2213;

    @OriginalMember(owner = "client!em", name = "d", descriptor = "Lic;")
    private class491 field2207;

    @OriginalMember(owner = "client!em", name = "n", descriptor = "[Lqg;")
    private class321[] field2217;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field2204 = 503;

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field2206;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field2210;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!em", name = "o", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "Lf;")
    public static class529 field2205;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IZIFBI)[I")
    public final int[] method837(int arg0, boolean arg1, int arg2, float arg3, byte arg4, int arg5) {
        field2210++;
        if (arg4 >= 0) {
            this.field2216 = null;
        }
        return this.method978(arg5, 255).method1403(this.field2217[arg5].field4588, this.field2207, (double) arg3, arg1, this, arg2, -1, arg0);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static void method977(int arg0) {
        if (arg0 > -102) {
            method980(30, (byte) -102);
        }
        field2205 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(II)Len;")
    private final class208 method978(int arg0, int arg1) {
        field2209++;
        if (arg1 != 255) {
            this.field2213 = null;
        }
        class271 var3 = this.field2216.method145((long) arg0, (byte) -11);
        if (var3 != null) {
            return (class208) var3;
        }
        byte[] var4 = this.field2213.method2944(arg0, 81);
        if (var4 == null) {
            return null;
        } else {
            class208 var5 = new class208(new class209(var4));
            this.field2216.method151(0, var5, (long) arg0);
            return var5;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BI)Lvg;")
    public static final class38 method979(byte arg0, int arg1) {
        field2211++;
        int var2 = arg1 >> 16;
        if (arg0 > -65) {
            method979((byte) -64, -46);
        }
        int var3 = arg1 & 0xFFFF;
        if (class185.field2754[var2] == null || class185.field2754[var2][var3] == null) {
            boolean var4 = class525.method3102(var2, -1);
            if (!var4) {
                return null;
            }
        }
        return class185.field2754[var2][var3];
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(IB)Ljava/lang/String;")
    public static final String method980(int arg0, byte arg1) {
        field2208++;
        if (arg1 > -56) {
            field2205 = null;
        }
        return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(IB)Z")
    public final boolean method839(int arg0, byte arg1) {
        field2206++;
        if (arg1 < 14) {
            field2204 = -118;
        }
        class208 var3 = this.method978(arg0, 255);
        return var3 != null && var3.method1401(this, -3487, this.field2207);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZIIIIF)[I")
    public final int[] method836(boolean arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        if (arg3 < 19) {
            return null;
        } else {
            field2215++;
            return this.method978(arg4, 255).method1406(this.field2217[arg4].field4588, -6282, (double) arg5, arg1, arg2, this, this.field2207);
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(FZIBII)[F")
    public final float[] method835(float arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5) {
        if (arg3 != -79) {
            method977(-36);
        }
        field2212++;
        return this.method978(arg4, 255).method1396(this.field2217[arg4].field4588, arg5, this, this.field2207, arg2, (byte) 119);
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ZI)Lqg;")
    public final class321 method838(boolean arg0, int arg1) {
        field2218++;
        if (!arg0) {
            method980(-75, (byte) -52);
        }
        return this.field2217[arg1];
    }

    @OriginalMember(owner = "client!em", name = "<init>", descriptor = "(Lic;Lic;Lic;)V")
    public class149(class491 arg0, class491 arg1, class491 arg2) {
        this.field2213 = arg1;
        this.field2207 = arg2;
        class209 var4 = new class209(arg0.method2945(0, 0, true));
        int var5 = var4.method1450((byte) 49);
        this.field2217 = new class321[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1428(32122) == 1) {
                this.field2217[var6] = new class321();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2217[var7] != null) {
                this.field2217[var7].field4593 = var4.method1428(32122) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2217[var8] != null) {
                this.field2217[var8].field4596 = var4.method1428(32122) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2217[var9] != null) {
                this.field2217[var9].field4590 = var4.method1428(32122) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2217[var10] != null) {
                this.field2217[var10].field4600 = var4.method1428(32122) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2217[var11] != null) {
                this.field2217[var11].field4594 = var4.method1417(false);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2217[var12] != null) {
                this.field2217[var12].field4604 = var4.method1417(false);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2217[var13] != null) {
                this.field2217[var13].field4585 = var4.method1417(false);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2217[var14] != null) {
                this.field2217[var14].field4601 = var4.method1417(false);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2217[var15] != null) {
                this.field2217[var15].field4602 = (short) var4.method1450((byte) 107);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field2217[var16] != null) {
                this.field2217[var16].field4583 = var4.method1417(false);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field2217[var17] != null) {
                this.field2217[var17].field4581 = var4.method1417(false);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field2217[var18] != null) {
                this.field2217[var18].field4605 = var4.method1428(32122) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field2217[var19] != null) {
                this.field2217[var19].field4588 = var4.method1428(32122) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field2217[var20] != null) {
                this.field2217[var20].field4591 = var4.method1417(false);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field2217[var21] != null) {
                this.field2217[var21].field4586 = var4.method1428(32122) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field2217[var22] != null) {
                this.field2217[var22].field4597 = var4.method1428(32122) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field2217[var23] != null) {
                this.field2217[var23].field4589 = var4.method1428(32122) == 1;
            }
        }
        for (int var24 = 0; var24 < var5; var24++) {
            if (this.field2217[var24] != null) {
                this.field2217[var24].field4592 = var4.method1428(32122);
            }
        }
        for (int var25 = 0; var25 < var5; var25++) {
            if (this.field2217[var25] != null) {
                this.field2217[var25].field4587 = var4.method1452(65280);
            }
        }
    }
}
