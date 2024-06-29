import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class97 implements class17 {

    @OriginalMember(owner = "client!qca", name = "m", descriptor = "Lak;")
    private class293 field1476 = new class293(256);

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "Lan;")
    private class21 field1470;

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "Lan;")
    private class21 field1469;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "I")
    private int field1464;

    @OriginalMember(owner = "client!qca", name = "n", descriptor = "[Lsr;")
    private class211[] field1477;

    @OriginalMember(owner = "client!qca", name = "j", descriptor = "I")
    public static int field1473 = 0;

    @OriginalMember(owner = "client!qca", name = "i", descriptor = "I")
    public static int field1472 = -1;

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "I")
    public static int field1466;

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!qca", name = "h", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!qca", name = "k", descriptor = "I")
    public static int field1474;

    @OriginalMember(owner = "client!qca", name = "l", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!qca", name = "o", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!qca", name = "p", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)I")
    public final int method189(int arg0) {
        field1478++;
        if (arg0 != 5399) {
            this.field1470 = null;
        }
        return this.field1464;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(II)Z")
    public final boolean method188(int arg0, int arg1) {
        field1475++;
        class563 var3 = this.method690((byte) 16, arg0);
        if (arg1 >= -102) {
            this.method690((byte) 63, 72);
        }
        return var3 != null && var3.method3212(this.field1470, this, 0);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZIIIIF)[I")
    public final int[] method186(boolean arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        if (arg2 != 10350) {
            field1472 = 9;
        }
        field1474++;
        return this.method690((byte) 16, arg1).method3215(this, arg3, arg0, this.field1470, arg4, (double) arg5, this.field1477[arg1].field2964, 0);
    }

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "(BI)Lpb;")
    private final class563 method690(byte arg0, int arg1) {
        field1467++;
        class132 var3 = this.field1476.method1880((byte) 123, (long) arg1);
        if (var3 != null) {
            return (class563) var3;
        }
        byte[] var4 = this.field1469.method242(arg1, (byte) -111);
        if (var4 == null) {
            return null;
        }
        if (arg0 != 16) {
            this.method187(125, 67, (byte) 60, -117, true, -0.36092532F);
        }
        class563 var5 = new class563(new class11(var4));
        this.field1476.method1882((long) arg1, var5, arg0 ^ 0xFFFFF43C);
        return var5;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(BI)Lsr;")
    public final class211 method190(byte arg0, int arg1) {
        field1479++;
        if (arg0 != -89) {
            method691(50, 0, -19);
        }
        return this.field1477[arg1];
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)Z")
    public static final boolean method691(int arg0, int arg1, int arg2) {
        if (arg2 != -2) {
            method692(null, (byte) 127);
        }
        field1465++;
        return false;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZFIIIB)[I")
    public final int[] method185(boolean arg0, float arg1, int arg2, int arg3, int arg4, byte arg5) {
        field1466++;
        if (arg5 != 49) {
            this.field1477 = null;
        }
        return this.method690((byte) 16, arg3).method3211(this, this.field1477[arg3].field2964, arg2, arg4, (double) arg1, this.field1470, (byte) -98);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(IIBIZF)[F")
    public final float[] method187(int arg0, int arg1, byte arg2, int arg3, boolean arg4, float arg5) {
        field1468++;
        int var7 = 49 / ((arg2 + 38) / 32);
        return this.method690((byte) 16, arg0).method3210(-675, this.field1470, arg1, this, this.field1477[arg0].field2964, arg3);
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(Ldj;B)[Laf;")
    public static final class368[] method692(class288 arg0, byte arg1) {
        field1471++;
        if (!arg0.method1836(arg1 ^ 0x79)) {
            return new class368[0];
        }
        class382 var2 = arg0.method1841(118);
        while (var2.field5134 == 0) {
            class21.method220(arg1 - 105, 10L);
        }
        if (arg1 != 105) {
            return null;
        } else if (var2.field5134 == 2) {
            return new class368[0];
        } else {
            int[] var3 = (int[]) var2.field5132;
            class368[] var4 = new class368[var3.length >> 2];
            for (int var5 = 0; var5 < var4.length; var5++) {
                class368 var6 = new class368();
                var4[var5] = var6;
                var6.field5008 = var3[var5 << 2];
                var6.field5009 = var3[(var5 << 2) + 1];
                var6.field5004 = var3[(var5 << 2) + 2];
                var6.field5003 = var3[(var5 << 2) + 3];
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!qca", name = "<init>", descriptor = "(Lan;Lan;Lan;)V")
    public class97(class21 arg0, class21 arg1, class21 arg2) {
        this.field1470 = arg2;
        this.field1469 = arg1;
        class11 var4 = new class11(arg0.method240(0, 0, (byte) -124));
        this.field1464 = var4.method93((byte) 102);
        this.field1477 = new class211[this.field1464];
        for (int var5 = 0; var5 < this.field1464; var5++) {
            if (var4.method110((byte) 83) == 1) {
                this.field1477[var5] = new class211();
            }
        }
        for (int var6 = 0; var6 < this.field1464; var6++) {
            if (this.field1477[var6] != null) {
                this.field1477[var6].field2969 = var4.method110((byte) 123) == 0;
            }
        }
        for (int var7 = 0; var7 < this.field1464; var7++) {
            if (this.field1477[var7] != null) {
                this.field1477[var7].field2977 = var4.method110((byte) 109) == 1;
            }
        }
        for (int var8 = 0; var8 < this.field1464; var8++) {
            if (this.field1477[var8] != null) {
                this.field1477[var8].field2965 = var4.method110((byte) 103) == 1;
            }
        }
        for (int var9 = 0; var9 < this.field1464; var9++) {
            if (this.field1477[var9] != null) {
                this.field1477[var9].field2983 = var4.method110((byte) 126) == 1;
            }
        }
        for (int var10 = 0; var10 < this.field1464; var10++) {
            if (this.field1477[var10] != null) {
                this.field1477[var10].field2975 = var4.method67(65280);
            }
        }
        for (int var11 = 0; var11 < this.field1464; var11++) {
            if (this.field1477[var11] != null) {
                this.field1477[var11].field2973 = var4.method67(65280);
            }
        }
        for (int var12 = 0; var12 < this.field1464; var12++) {
            if (this.field1477[var12] != null) {
                this.field1477[var12].field2984 = var4.method67(65280);
            }
        }
        for (int var13 = 0; var13 < this.field1464; var13++) {
            if (this.field1477[var13] != null) {
                this.field1477[var13].field2972 = var4.method67(65280);
            }
        }
        for (int var14 = 0; var14 < this.field1464; var14++) {
            if (this.field1477[var14] != null) {
                this.field1477[var14].field2967 = (short) var4.method93((byte) 92);
            }
        }
        for (int var15 = 0; var15 < this.field1464; var15++) {
            if (this.field1477[var15] != null) {
                this.field1477[var15].field2968 = var4.method67(65280);
            }
        }
        for (int var16 = 0; var16 < this.field1464; var16++) {
            if (this.field1477[var16] != null) {
                this.field1477[var16].field2986 = var4.method67(65280);
            }
        }
        for (int var17 = 0; var17 < this.field1464; var17++) {
            if (this.field1477[var17] != null) {
                this.field1477[var17].field2982 = var4.method110((byte) 24) == 1;
            }
        }
        for (int var18 = 0; var18 < this.field1464; var18++) {
            if (this.field1477[var18] != null) {
                this.field1477[var18].field2964 = var4.method110((byte) 39) == 1;
            }
        }
        for (int var19 = 0; var19 < this.field1464; var19++) {
            if (this.field1477[var19] != null) {
                this.field1477[var19].field2980 = var4.method67(65280);
            }
        }
        for (int var20 = 0; var20 < this.field1464; var20++) {
            if (this.field1477[var20] != null) {
                this.field1477[var20].field2985 = var4.method110((byte) 23) == 1;
            }
        }
        for (int var21 = 0; var21 < this.field1464; var21++) {
            if (this.field1477[var21] != null) {
                this.field1477[var21].field2974 = var4.method110((byte) 100) == 1;
            }
        }
        for (int var22 = 0; var22 < this.field1464; var22++) {
            if (this.field1477[var22] != null) {
                this.field1477[var22].field2987 = var4.method110((byte) 103) == 1;
            }
        }
        for (int var23 = 0; var23 < this.field1464; var23++) {
            if (this.field1477[var23] != null) {
                this.field1477[var23].field2978 = var4.method110((byte) 104);
            }
        }
        for (int var24 = 0; var24 < this.field1464; var24++) {
            if (this.field1477[var24] != null) {
                this.field1477[var24].field2966 = var4.method119(-69);
            }
        }
        for (int var25 = 0; var25 < this.field1464; var25++) {
            if (this.field1477[var25] != null) {
                this.field1477[var25].field2970 = var4.method110((byte) 117) == 1;
            }
        }
    }
}
