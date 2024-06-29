import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public abstract class class259 extends class236 {

    @OriginalMember(owner = "client!vf", name = "M", descriptor = "Z")
    public boolean field4588;

    @OriginalMember(owner = "client!vf", name = "B", descriptor = "[Lvf;")
    public class259[] field4577;

    @OriginalMember(owner = "client!vf", name = "y", descriptor = "I")
    public static int field4574 = -1;

    @OriginalMember(owner = "client!vf", name = "v", descriptor = "I")
    public static int field4571 = 0;

    @OriginalMember(owner = "client!vf", name = "A", descriptor = "Lsg;")
    public static class30 field4576 = class167.method1221((byte) 33, "http:)4)4");

    @OriginalMember(owner = "client!vf", name = "G", descriptor = "Lsg;")
    public static class30 field4582 = class167.method1221((byte) 33, ")3runescape)3com)4l=");

    @OriginalMember(owner = "client!vf", name = "R", descriptor = "Lsg;")
    public static class30 field4593 = class167.method1221((byte) 33, "Stufe: ");

    @OriginalMember(owner = "client!vf", name = "u", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!vf", name = "x", descriptor = "I")
    public static int field4573;

    @OriginalMember(owner = "client!vf", name = "z", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!vf", name = "C", descriptor = "I")
    public int field4578;

    @OriginalMember(owner = "client!vf", name = "D", descriptor = "I")
    public static int field4579;

    @OriginalMember(owner = "client!vf", name = "E", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!vf", name = "H", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!vf", name = "I", descriptor = "I")
    public static int field4584;

    @OriginalMember(owner = "client!vf", name = "J", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!vf", name = "K", descriptor = "I")
    public static int field4586;

    @OriginalMember(owner = "client!vf", name = "L", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!vf", name = "N", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!vf", name = "O", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!vf", name = "P", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!vf", name = "F", descriptor = "Lcj;")
    public class268 field4581;

    @OriginalMember(owner = "client!vf", name = "s", descriptor = "Lkc;")
    public class29 field4568;

    @OriginalMember(owner = "client!vf", name = "Q", descriptor = "Ldl;")
    public static class31 field4592;

    @OriginalMember(owner = "client!vf", name = "t", descriptor = "Ljava/awt/Frame;")
    public static Frame field4569;

    @OriginalMember(owner = "client!vf", name = "w", descriptor = "[[Ldl;")
    public static class31[][] field4572;

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(I)V")
    public void method2(int arg0) {
        if (arg0 != 3) {
            field4592 = null;
        }
        if (this.field4588) {
            this.field4581.method1835(true);
            this.field4581 = null;
        } else {
            this.field4568.method239(-16195);
            this.field4568 = null;
        }
        field4586++;
    }

    @OriginalMember(owner = "client!vf", name = "b", descriptor = "(III)I")
    public static final int method1793(int arg0, int arg1, int arg2) {
        if (arg0 < 11) {
            field4593 = null;
        }
        field4591++;
        class109 var3 = (class109) class208.field3730.method1168(-3, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && var3.field2199.length > arg2) {
            return var3.field2199[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(I)I")
    public int method5(int arg0) {
        field4584++;
        if (arg0 != -1) {
            field4593 = null;
        }
        return -1;
    }

    @OriginalMember(owner = "client!vf", name = "c", descriptor = "(III)V")
    public final void method1794(int arg0, int arg1, int arg2) {
        field4580++;
        int var4 = this.field4578 == 255 ? arg0 : this.field4578;
        if (arg2 >= -94) {
            return;
        }
        if (this.field4588) {
            this.field4581 = new class268(var4, arg0, arg1);
        } else {
            this.field4568 = new class29(var4, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IZ)[I")
    public int[] method17(int arg0, boolean arg1) {
        if (arg1) {
            method1793(-126, -5, 122);
        }
        field4570++;
        throw new IllegalStateException("This operation does not have a monochrome output");
    }

    @OriginalMember(owner = "client!vf", name = "f", descriptor = "(I)V")
    public void method11(int arg0) {
        if (arg0 < 11) {
            field4582 = null;
        }
        field4589++;
    }

    @OriginalMember(owner = "client!vf", name = "d", descriptor = "(III)[[I")
    public final int[][] method1795(int arg0, int arg1, int arg2) {
        if (arg1 != 2) {
            return null;
        }
        field4573++;
        if (this.field4577[arg2].field4588) {
            int[] var4 = this.field4577[arg2].method17(arg0, false);
            return new int[][] { var4, var4, var4 };
        } else {
            return this.field4577[arg2].method3((byte) 81, arg0);
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(B)V")
    public static void method1796(byte arg0) {
        field4576 = null;
        field4593 = null;
        if (arg0 == 94) {
            field4569 = null;
            field4582 = null;
            field4572 = null;
            field4592 = null;
        }
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IB)I")
    public static final int method1797(int arg0, byte arg1) {
        field4575++;
        int var2 = (arg0 & 0x55555555) + ((arg0 & 0xAAAAAAAB) >>> 1);
        int var3 = ((var2 & 0xCCCCCCCD) >>> 2) + (var2 & 0x33333333);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        if (arg1 != -25) {
            method1793(-11, 5, -71);
        }
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!vf", name = "g", descriptor = "(I)I")
    public int method727(int arg0) {
        field4579++;
        if (arg0 != 638) {
            this.method1799(-94, 89, -76);
        }
        return -1;
    }

    @OriginalMember(owner = "client!vf", name = "h", descriptor = "(I)V")
    public static final void method1798(int arg0) {
        field4583++;
        if (class57.field1252 == -1 || class54.field1193 == -1) {
            return;
        }
        int var1 = class39.field931 + ((class100.field2051 - class39.field931) * class183.field3372 >> 16);
        class183.field3372 += var1;
        float[] var2 = new float[3];
        if (class183.field3372 < 65535) {
            class33.field837 = false;
            class204.field3664 = false;
        } else {
            if (class204.field3664) {
                class33.field837 = false;
            } else {
                class33.field837 = true;
            }
            class183.field3372 = 65535;
            class204.field3664 = true;
        }
        int var3 = class117.field2314 * 2;
        float var4 = (float) class183.field3372 / 65535.0F;
        int var5 = -66 / ((17 - arg0) / 52);
        for (int var6 = 0; var6 < 3; var6++) {
            int var22 = class142.field2751[class57.field1252][var3][var6] * 3;
            int var23 = (class142.field2751[class57.field1252][var3 + 2][var6] + class142.field2751[class57.field1252][var3 - -2][var6] - class142.field2751[class57.field1252][var3 + 3][var6]) * 3;
            int var24 = class142.field2751[class57.field1252][var3 + 1][var6] * 3;
            int var25 = class142.field2751[class57.field1252][var3][var6];
            int var26 = var24 - var22;
            int var27 = class142.field2751[class57.field1252][var3 + 2][var6] + var24 - var25 - var23;
            int var28 = var23 + var22 - (var24 * 2);
            var2[var6] = (((float) var27 * var4 + (float) var28) * var4 + (float) var26) * var4 + (float) var25;
        }
        class64.field1419 = (int) var2[1] * -1;
        class207.field3725 = (int) var2[0] - (class22.field421 * 128);
        class150.field2849 = (int) var2[2] - (class196.field3547 * 128);
        float[] var7 = new float[3];
        int var8 = class260.field4599 * 2;
        for (int var9 = 0; var9 < 3; var9++) {
            int var15 = (class142.field2751[class54.field1193][var8 + 2][var9] + class142.field2751[class54.field1193][var8 - -2][var9] - class142.field2751[class54.field1193][var8 + 3][var9]) * 3;
            int var16 = class142.field2751[class54.field1193][var8][var9];
            int var17 = class142.field2751[class54.field1193][var8][var9] * 3;
            int var18 = class142.field2751[class54.field1193][var8 + 1][var9] * 3;
            int var19 = var17 + var15 - (var18 * 2);
            int var20 = class142.field2751[class54.field1193][var8 + 2][var9] + var18 - var16 - var15;
            int var21 = var18 - var17;
            var7[var9] = (((float) var20 * var4 + (float) var19) * var4 + (float) var21) * var4 + (float) var16;
        }
        float var10 = (var7[1] - var2[1]) * -1.0F;
        float var11 = var7[2] - var2[2];
        float var12 = var7[0] - var2[0];
        double var13 = Math.sqrt((double) (var11 * var11 + var12 * var12));
        class61.field1315 = (float) Math.atan2((double) var10, var13);
        class159.field2986 = -((float) Math.atan2((double) var12, (double) var11));
        class123.field2422 = (int) ((double) class159.field2986 * 325.949D) & 0x7FF;
        class276.field4820 = (int) ((double) class61.field1315 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!vf", name = "<init>", descriptor = "(IZ)V")
    public class259(int arg0, boolean arg1) {
        this.field4588 = arg1;
        this.field4577 = new class259[arg0];
    }

    @OriginalMember(owner = "client!vf", name = "e", descriptor = "(III)[I")
    public final int[] method1799(int arg0, int arg1, int arg2) {
        field4585++;
        if (arg2 <= 110) {
            this.method4(-29, -43, (class8) null);
        }
        return this.field4577[arg0].field4588 ? this.field4577[arg0].method17(arg1, false) : this.field4577[arg0].method3((byte) 108, arg1)[0];
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(BI)[[I")
    public int[][] method3(byte arg0, int arg1) {
        field4590++;
        int var3 = 89 / ((arg0 + 48) / 42);
        throw new IllegalStateException("This operation does not have a colour output");
    }

    @OriginalMember(owner = "client!vf", name = "a", descriptor = "(IILaa;)V")
    public void method4(int arg0, int arg1, class8 arg2) {
        field4587++;
        if (arg1 != -1586849108) {
            this.field4588 = true;
        }
    }
}
