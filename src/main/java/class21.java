import java.awt.Container;
import java.awt.Insets;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class21 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "[I")
    private int[] field412;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "[I")
    private int[] field410;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Leb;")
    public static class230 field411 = class68.method589(0, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!pc", name = "q", descriptor = "Ljava/util/Random;")
    public static Random field425 = new Random();

    @OriginalMember(owner = "client!pc", name = "t", descriptor = "I")
    public static int field428 = 0;

    @OriginalMember(owner = "client!pc", name = "r", descriptor = "Lwd;")
    public static class22 field426 = class139.method1069((byte) 68);

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field409;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field418;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "I")
    public static int field420;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "I")
    private int field421;

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "I")
    private int field422;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client!pc", name = "s", descriptor = "I")
    public static int field427;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BD)V")
    public static final void method232(byte arg0, double arg1) {
        if (class131.field2346 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class52.field894[var3] = var4 <= 255 ? var4 : 255;
            }
            class131.field2346 = arg1;
        }
        if (arg0 != 33) {
            method235(-68);
        }
        field415++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method233(int arg0) {
        field411 = null;
        field425 = null;
        field426 = null;
        if (arg0 != 256) {
            field411 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(B)V")
    private final void method234(byte arg0) {
        field417++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var62 ^ var7 >>> 2;
            int var64 = var5 + var63;
            int var65 = var6 + var61;
            int var66 = var7 + var65;
            int var67 = var66 ^ var65 << 8;
            int var68 = var4 + var67;
            int var69 = var64 + var65;
            var6 = var69 ^ var64 >>> 16;
            int var70 = var3 + var6;
            int var71 = var64 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var2 + var5;
            int var73 = var68 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            var8 = var3 + var63;
            int var76 = var72 + var74;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        if (arg0 >= -118) {
            this.field412 = null;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field410[var11 + 5] + var4;
            int var38 = this.field410[var11 + 2] + var7;
            int var39 = this.field410[var11 + 1] + var8;
            int var40 = this.field410[var11 + 7] + var2;
            int var41 = this.field410[var11 + 6] + var3;
            int var42 = this.field410[var11] + var9;
            int var43 = var42 ^ var39 << 11;
            int var44 = var38 + var39;
            int var45 = this.field410[var11 + 4] + var5;
            int var46 = var44 ^ var38 >>> 2;
            int var47 = var45 + var46;
            int var48 = this.field410[var11 + 3] + var6;
            int var49 = var43 + var48;
            int var50 = var38 + var49;
            int var51 = var50 ^ var49 << 8;
            int var52 = var37 + var51;
            int var53 = var47 + var49;
            var6 = var53 ^ var47 >>> 16;
            int var54 = var47 + var52;
            var5 = var54 ^ var52 << 10;
            int var55 = var5 + var40;
            int var56 = var6 + var41;
            int var57 = var52 + var56;
            var4 = var57 ^ var56 >>> 4;
            int var58 = var4 + var43;
            int var59 = var55 + var56;
            var3 = var59 ^ var55 << 8;
            int var60 = var55 + var58;
            var8 = var3 + var46;
            var2 = var60 ^ var58 >>> 9;
            var9 = var8 + var58;
            var7 = var2 + var51;
            this.field412[var11] = var9;
            this.field412[var11 + 1] = var8;
            this.field412[var11 + 2] = var7;
            this.field412[var11 + 3] = var6;
            this.field412[var11 + 4] = var5;
            this.field412[var11 + 5] = var4;
            this.field412[var11 + 6] = var3;
            this.field412[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field412[var12 + 6] + var3;
            int var14 = this.field412[var12 + 4] + var5;
            int var15 = this.field412[var12 + 2] + var7;
            int var16 = this.field412[var12 + 5] + var4;
            int var17 = this.field412[var12] + var9;
            int var18 = this.field412[var12 + 7] + var2;
            int var19 = this.field412[var12 + 3] + var6;
            int var20 = this.field412[var12 + 1] + var8;
            int var21 = var17 ^ var20 << 11;
            int var22 = var15 + var20;
            int var23 = var19 + var21;
            int var24 = var22 ^ var15 >>> 2;
            int var25 = var15 + var23;
            int var26 = var14 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var23 + var26;
            var6 = var28 ^ var26 >>> 16;
            int var29 = var6 + var13;
            int var30 = var16 + var27;
            int var31 = var26 + var30;
            var5 = var31 ^ var30 << 10;
            int var32 = var5 + var18;
            int var33 = var29 + var30;
            var4 = var33 ^ var29 >>> 4;
            int var34 = var29 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            var8 = var3 + var24;
            int var36 = var32 + var35;
            var2 = var36 ^ var35 >>> 9;
            var9 = var8 + var35;
            var7 = var2 + var27;
            this.field412[var12] = var9;
            this.field412[var12 + 1] = var8;
            this.field412[var12 + 2] = var7;
            this.field412[var12 + 3] = var6;
            this.field412[var12 + 4] = var5;
            this.field412[var12 + 5] = var4;
            this.field412[var12 + 6] = var3;
            this.field412[var12 + 7] = var2;
        }
        this.method241(255);
        this.field424 = 256;
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)I")
    public static final int method235(int arg0) {
        field413++;
        if (arg0 >= -14) {
            method238(77, true, 127);
        }
        return 6;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(I)V")
    public static final void method236(int arg0) {
        if (arg0 != -453) {
            field411 = null;
        }
        Container var1;
        if (class108.field1952 != null) {
            var1 = class108.field1952;
        } else if (class267.field4736 == null) {
            var1 = class184.field3228.field2320;
        } else {
            var1 = class267.field4736;
        }
        class141.field2536 = var1.getSize().width;
        field420++;
        class169.field2983 = var1.getSize().height;
        if (class267.field4736 == var1) {
            Insets var2 = class267.field4736.getInsets();
            class141.field2536 -= var2.right + var2.left;
            class169.field2983 -= var2.top + var2.bottom;
        }
        if (class55.method444((byte) 123) < 2) {
            class180.field3155 = 765;
            class135.field2434 = 503;
            class259.field4588 = 0;
            class267.field4745 = (class141.field2536 - 765) / 2;
        } else {
            class180.field3155 = class141.field2536;
            class259.field4588 = 0;
            class267.field4745 = 0;
            class135.field2434 = class169.field2983;
        }
        class14.field307.setSize(class180.field3155, class135.field2434);
        if (class267.field4736 == var1) {
            Insets var3 = class267.field4736.getInsets();
            class14.field307.setLocation(class267.field4745 + var3.left, class259.field4588 + var3.top);
        } else {
            class14.field307.setLocation(class267.field4745, class259.field4588);
        }
        if (class263.field4679 != -1) {
            class175.method1279(true, (byte) 101);
        }
        class173.method1269(2007);
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(B)I")
    public final int method237(byte arg0) {
        if (this.field424-- == 0) {
            this.method241(255);
            this.field424 = 255;
        }
        if (arg0 < 11) {
            return -95;
        } else {
            field414++;
            return this.field410[this.field424];
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZI)I")
    public static final int method238(int arg0, boolean arg1, int arg2) {
        field418++;
        int var3 = arg0 >>> 31;
        return arg1 ? (arg0 + var3) / arg2 - var3 : -37;
    }

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "(B)V")
    public static final void method239(byte arg0) {
        field416++;
        if (!class158.field2817) {
            return;
        }
        if (arg0 >= -124) {
            method232((byte) -66, -0.6329871164592596D);
        }
        class158.field2817 = false;
        class260.field4625 = null;
        class213.field3688 = null;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(B)V")
    public static final void method240(byte arg0) {
        field423++;
        int var1 = -67 / ((arg0 - 36) / 61);
        if (class202.field3572 == -1 || class33.field616 == -1) {
            return;
        }
        int var2 = ((class215.field3722 - class123.field2164) * class8.field139 >> 16) + class123.field2164;
        class8.field139 += var2;
        float[] var3 = new float[3];
        int var4 = class272.field4801 * 2;
        if (class8.field139 < 65535) {
            class131.field2348 = false;
            class23.field447 = false;
        } else {
            class8.field139 = 65535;
            if (class23.field447) {
                class131.field2348 = false;
            } else {
                class131.field2348 = true;
            }
            class23.field447 = true;
        }
        float var5 = (float) class8.field139 / 65535.0F;
        for (int var6 = 0; var6 < 3; var6++) {
            int var22 = class84.field1490[class202.field3572][var4][var6] * 3;
            int var23 = class84.field1490[class202.field3572][var4 + 1][var6] * 3;
            int var24 = class84.field1490[class202.field3572][var4][var6];
            int var25 = (class84.field1490[class202.field3572][var4 + 2][var6] + class84.field1490[class202.field3572][var4 + 2][var6] - class84.field1490[class202.field3572][var4 + 3][var6]) * 3;
            int var26 = var23 - var22;
            int var27 = class84.field1490[class202.field3572][var4 + 2][var6] + var23 - var24 - var25;
            int var28 = var22 + var25 - (var23 * 2);
            var3[var6] = (((float) var27 * var5 + (float) var28) * var5 + (float) var26) * var5 + (float) var24;
        }
        class77.field1403 = (int) var3[2] - (class155.field2759 * 128);
        class176.field3099 = (int) var3[0] - class272.field4795 * 128;
        float[] var7 = new float[3];
        class263.field4681 = (int) var3[1] * -1;
        int var8 = class266.field4731 * 2;
        for (int var9 = 0; var9 < 3; var9++) {
            int var15 = class84.field1490[class33.field616][var8 + 1][var9] * 3;
            int var16 = class84.field1490[class33.field616][var8][var9] * 3;
            int var17 = class84.field1490[class33.field616][var8][var9];
            int var18 = var15 - var16;
            int var19 = (-class84.field1490[class33.field616][var8 + 3][var9] - (-class84.field1490[class33.field616][var8 + 2][var9] - class84.field1490[class33.field616][var8 + 2][var9])) * 3;
            int var20 = class84.field1490[class33.field616][var8 + 2][var9] + var15 - var19 - var17;
            int var21 = var19 + var16 - (var15 * 2);
            var7[var9] = (((float) var20 * var5 + (float) var21) * var5 + (float) var18) * var5 + (float) var17;
        }
        float var10 = var7[0] - var3[0];
        float var11 = var7[2] - var3[2];
        float var12 = (var7[1] - var3[1]) * -1.0F;
        double var13 = Math.sqrt((double) (var10 * var10 + var11 * var11));
        class252.field4514 = (float) Math.atan2((double) var12, var13);
        class46.field813 = -((float) Math.atan2((double) var10, (double) var11));
        class111.field2004 = (int) ((double) class252.field4514 * 325.949D) & 0x7FF;
        class248.field4397 = (int) ((double) class46.field813 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "(I)V")
    private final void method241(int arg0) {
        field409++;
        this.field421 += ++this.field422;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field412[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field419 ^= this.field419 << 13;
                } else {
                    this.field419 ^= this.field419 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field419 ^= this.field419 << 2;
            } else {
                this.field419 ^= this.field419 >>> 16;
            }
            this.field419 += this.field412[var2 + 128 & 0xFF];
            int var4;
            this.field412[var2] = var4 = this.field421 + this.field419 + this.field412[class189.method1350(255, var3 >> 2)];
            this.field410[var2] = this.field421 = this.field412[class189.method1350(var4 >> 8 >> 2, 255)] + var3;
        }
        if (arg0 != 255) {
            field428 = 20;
        }
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V")
    private class21() {
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "([I)V")
    public class21(int[] arg0) {
        this.field412 = new int[256];
        this.field410 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field410[var2] = arg0[var2];
        }
        this.method234((byte) -121);
    }
}
