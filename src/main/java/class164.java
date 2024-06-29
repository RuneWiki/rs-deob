import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class164 extends class122 {

    @OriginalMember(owner = "client!sa", name = "K", descriptor = "Z")
    public boolean field3132 = false;

    @OriginalMember(owner = "client!sa", name = "R", descriptor = "I")
    public int field3139 = 0;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public int field3143 = 0;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "Z")
    public boolean field3154 = false;

    @OriginalMember(owner = "client!sa", name = "Q", descriptor = "I")
    public static int field3138 = 0;

    @OriginalMember(owner = "client!sa", name = "L", descriptor = "I")
    public static int field3133 = 0;

    @OriginalMember(owner = "client!sa", name = "S", descriptor = "[I")
    private static int[] field3140 = class113.field2124;

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "Z")
    public static boolean field3145 = false;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    public static int field3146 = 0;

    @OriginalMember(owner = "client!sa", name = "M", descriptor = "[I")
    public static int[] field3134 = new int[1000];

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "[I")
    private static int[] field3151 = class113.field2120;

    @OriginalMember(owner = "client!sa", name = "N", descriptor = "S")
    public short field3135;

    @OriginalMember(owner = "client!sa", name = "O", descriptor = "S")
    public short field3136;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "S")
    public short field3142;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "S")
    public short field3144;

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "S")
    public short field3147;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "S")
    public short field3148;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "S")
    public short field3150;

    @OriginalMember(owner = "client!sa", name = "P", descriptor = "[I")
    public int[] field3137;

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "[I")
    public int[] field3149;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "[I")
    public int[] field3152;

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "[[I")
    public int[][] field3141;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "[[I")
    public int[][] field3153;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "()V")
    public final void method1080() {
        for (int var1 = 0; var1 < this.field3139; ++var1) {
            this.field3149[var1] = -this.field3149[var1];
            this.field3152[var1] = -this.field3152[var1];
        }
        this.field3154 = false;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIIII)V")
    public abstract void method1081(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7);

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "()V")
    public final void method1082() {
        for (int var1 = 0; var1 < this.field3139; ++var1) {
            int var2 = this.field3152[var1];
            this.field3152[var1] = this.field3149[var1];
            this.field3149[var1] = -var2;
        }
        this.field3154 = false;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "()I")
    public final int method1083() {
        this.method1093();
        return this.field3144;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lud;I)V")
    public abstract void method1084(class185 arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "()V")
    public final void method1085() {
        for (int var1 = 0; var1 < this.field3139; ++var1) {
            int var2 = this.field3149[var1];
            this.field3149[var1] = this.field3152[var1];
            this.field3152[var1] = -var2;
        }
        this.field3154 = false;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)V")
    public final void method1086(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3139; ++var4) {
            this.field3149[var4] += arg0;
            this.field3137[var4] += arg1;
            this.field3152[var4] += arg2;
        }
        this.field3154 = false;
    }

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "(Z)Lsa;")
    public abstract class164 method1087(boolean arg0);

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "(Z)Lsa;")
    public abstract class164 method1088(boolean arg0);

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "(I)V")
    public final void method1089(int arg0) {
        int var2 = field3140[arg0];
        int var3 = field3151[arg0];
        for (int var4 = 0; var4 < this.field3139; ++var4) {
            int var5 = this.field3137[var4] * var3 - this.field3152[var4] * var2 >> 16;
            this.field3152[var4] = this.field3152[var4] * var3 + this.field3137[var4] * var2 >> 16;
            this.field3137[var4] = var5;
        }
        this.field3154 = false;
    }

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "(III)V")
    public final void method1090(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3139; ++var4) {
            this.field3149[var4] = this.field3149[var4] * arg0 / 128;
            this.field3137[var4] = this.field3137[var4] * arg1 / 128;
            this.field3152[var4] = this.field3152[var4] * arg2 / 128;
        }
        this.field3154 = false;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([[IIIIZI)Lsa;")
    public abstract class164 method1091(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lud;ILud;I[I)V")
    public abstract void method1092(class185 arg0, int arg1, class185 arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "()V")
    public final void method1093() {
        if (!this.field3154) {
            this.field3154 = true;
            int var1 = 32767;
            int var2 = 32767;
            int var3 = 32767;
            int var4 = -32768;
            int var5 = -32768;
            int var6 = -32768;
            int var7 = 0;
            int var8 = 0;
            for (int var9 = 0; var9 < this.field3139; ++var9) {
                int var10 = this.field3149[var9];
                int var11 = this.field3137[var9];
                int var12 = this.field3152[var9];
                if (var10 < var1) {
                    var1 = var10;
                }
                if (var10 > var4) {
                    var4 = var10;
                }
                if (var11 < var2) {
                    var2 = var11;
                }
                if (var11 > var5) {
                    var5 = var11;
                }
                if (var12 < var3) {
                    var3 = var12;
                }
                if (var12 > var6) {
                    var6 = var12;
                }
                int var13 = var10 * var10 + var12 * var12;
                if (var13 > var7) {
                    var7 = var13;
                }
                int var14 = var11 * var11 + var10 * var10 + var12 * var12;
                if (var14 > var8) {
                    var8 = var14;
                }
            }
            this.field3135 = (short) var1;
            this.field3136 = (short) var4;
            super.field2341 = (short) var2;
            this.field3147 = (short) var5;
            this.field3148 = (short) var3;
            this.field3150 = (short) var6;
            this.field3144 = (short) ((int) (Math.sqrt((double) var7) + 0.99D));
            this.field3142 = (short) ((int) (Math.sqrt((double) var8) + 0.99D));
        }
    }

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "()V")
    public static void method1094() {
        field3140 = null;
        field3151 = null;
        field3134 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIIIIII)V")
    public abstract void method1095(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
