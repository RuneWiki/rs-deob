import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ki")
public class class648 {

    @OriginalMember(owner = "client!ki", name = "l", descriptor = "I")
    private int field9176 = -1;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "I")
    private int field9165 = 0;

    @OriginalMember(owner = "client!ki", name = "m", descriptor = "Lmfa;")
    private class562 field9177 = new class562();

    @OriginalMember(owner = "client!ki", name = "p", descriptor = "Z")
    public boolean field9180 = false;

    @OriginalMember(owner = "client!ki", name = "h", descriptor = "I")
    private int field9172;

    @OriginalMember(owner = "client!ki", name = "f", descriptor = "I")
    private int field9170;

    @OriginalMember(owner = "client!ki", name = "k", descriptor = "[Lrk;")
    private class30[] field9175;

    @OriginalMember(owner = "client!ki", name = "g", descriptor = "[[[I")
    private int[][][] field9171;

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "I")
    public static int field9166;

    @OriginalMember(owner = "client!ki", name = "c", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!ki", name = "d", descriptor = "I")
    public static int field9168;

    @OriginalMember(owner = "client!ki", name = "e", descriptor = "I")
    public static int field9169;

    @OriginalMember(owner = "client!ki", name = "i", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!ki", name = "j", descriptor = "I")
    public static int field9174;

    @OriginalMember(owner = "client!ki", name = "n", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!ki", name = "o", descriptor = "I")
    public static int field9179;

    @OriginalMember(owner = "client!ki", name = "q", descriptor = "Lwm;")
    public static class515 field9181;

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(II)[[I", line = 6)
    public final int[][] method3639(int arg0, int arg1) {
        field9173++;
        if (arg0 < 8) {
            this.method3639(56, -62);
        }
        if (this.field9172 == this.field9170) {
            this.field9180 = this.field9175[arg1] == null;
            this.field9175[arg1] = class628.field8911;
            return this.field9171[arg1];
        } else if (this.field9172 == 1) {
            this.field9180 = this.field9176 != arg1;
            this.field9176 = arg1;
            return this.field9171[0];
        } else {
            class30 var3 = this.field9175[arg1];
            if (var3 == null) {
                this.field9180 = true;
                if (this.field9172 <= this.field9165) {
                    class30 var4 = (class30) this.field9177.method3175((byte) 110);
                    var3 = new class30(arg1, var4.field347);
                    this.field9175[var4.field349] = null;
                    var4.method1519((byte) 121);
                } else {
                    var3 = new class30(arg1, this.field9165);
                    this.field9165++;
                }
                this.field9175[arg1] = var3;
            } else {
                this.field9180 = false;
            }
            this.field9177.method3169(-121, var3);
            return this.field9171[var3.field347];
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I)V", line = 74)
    public static final void method3640(int arg0) {
        if (arg0 != -890) {
            field9178 = -102;
        }
        field9166++;
        if (class57.field592 != null) {
            return;
        }
        class57.field592 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var9 = var8;
                    var10 = var18;
                } else if (var14 == 1) {
                    var10 = var8;
                    var9 = var17;
                    var11 = var16;
                } else if (var14 == 2) {
                    var11 = var18;
                    var10 = var8;
                    var9 = var16;
                } else if (var14 == 3) {
                    var10 = var17;
                    var11 = var8;
                    var9 = var16;
                } else if (var14 == 4) {
                    var11 = var8;
                    var10 = var16;
                    var9 = var18;
                } else if (var14 == 5) {
                    var10 = var16;
                    var11 = var17;
                    var9 = var8;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + var24 + (var22 << 16) - 16777216;
                class57.field592[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(III)Z", line = 195)
    public static final boolean method3641(int arg0, int arg1, int arg2) {
        if (arg2 != -27413) {
            field9178 = -70;
        }
        field9167++;
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(B)[[[I", line = 210)
    public final int[][][] method3642(byte arg0) {
        field9174++;
        if (this.field9172 != this.field9170) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 42 / ((arg0 + 29) / 52);
        for (int var3 = 0; var3 < this.field9172; var3++) {
            this.field9175[var3] = class628.field8911;
        }
        return this.field9171;
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(B)V", line = 231)
    public static void method3643(byte arg0) {
        if (arg0 != 111) {
            method3643((byte) 43);
        }
        field9181 = null;
    }

    @OriginalMember(owner = "client!ki", name = "<init>", descriptor = "(III)V", line = 338)
    public class648(int arg0, int arg1, int arg2) {
        this.field9172 = arg0;
        this.field9170 = arg1;
        this.field9175 = new class30[this.field9170];
        this.field9171 = new int[this.field9172][3][arg2];
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(ZI)I", line = 255)
    public static final int method3644(boolean arg0, int arg1) {
        field9169++;
        if (class289.field3719 == null) {
            return 0;
        } else if (!arg0 && class431.field5697 != null) {
            return class289.field3719.length * 2;
        } else if (arg1 == -19558) {
            int var2 = 0;
            for (int var3 = 0; var3 < class289.field3719.length; var3++) {
                int var4 = class289.field3719[var3];
                if (class359.field4705.method1711(var4, arg1 ^ 0xFFFFB39B)) {
                    var2++;
                }
                if (class455.field6328.method1711(var4, 1)) {
                    var2++;
                }
            }
            return var2;
        } else {
            return -58;
        }
    }

    @OriginalMember(owner = "client!ki", name = "b", descriptor = "(I)V", line = 292)
    public final void method3645(int arg0) {
        field9179++;
        if (arg0 > -105) {
            return;
        }
        for (int var2 = 0; var2 < this.field9172; var2++) {
            this.field9171[var2][0] = null;
            this.field9171[var2][1] = null;
            this.field9171[var2][2] = null;
            this.field9171[var2] = null;
        }
        this.field9171 = null;
        this.field9175 = null;
        this.field9177.method3170((byte) -57);
        this.field9177 = null;
    }

    @OriginalMember(owner = "client!ki", name = "a", descriptor = "(I[J[I)V", line = 318)
    public static final void method3646(int arg0, long[] arg1, int[] arg2) {
        if (arg0 == -6) {
            class406.method2208(0, arg1.length - 1, arg1, arg2, -1);
            field9168++;
        }
    }
}
