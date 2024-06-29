import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public abstract class class280 {

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public int field4633;

    @OriginalMember(owner = "client!il", name = "g", descriptor = "I")
    public int field4634;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public int field4635;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "Lck;")
    public static class119 field4636 = class298.method1987((byte) 97, "::");

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field4631 = 0;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public static int field4628;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field4630;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public static int field4632;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "Ltk;")
    public static class230 field4637;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "[Lud;")
    public static class158[] field4629;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(ILck;)I", line = 13)
    public static final int method1860(int arg0, class119 arg1) {
        field4628++;
        if (arg0 > -90) {
            method1861(-2);
        }
        return arg1.method776((byte) -62) + 1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)V", line = 28)
    public static final void method1861(int arg0) {
        field4632++;
        if (class150.field2381 == -1 || class72.field1124 == -1) {
            return;
        }
        int var1 = ((class297.field4978 - field4631) * class152.field2428 >> 16) + field4631;
        class152.field2428 += var1;
        int var2 = class94.field1460 * 2;
        float[] var3 = new float[3];
        if (class152.field2428 >= 65535) {
            class152.field2428 = 65535;
            if (class8.field161) {
                class49.field751 = false;
            } else {
                class49.field751 = true;
            }
            class8.field161 = true;
        } else {
            class8.field161 = false;
            class49.field751 = false;
        }
        if (arg0 > -9) {
            field4629 = (class158[]) null;
        }
        float var4 = (float) class152.field2428 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class59.field962[class150.field2381][var2 + 1][var5] * 3;
            int var7 = class59.field962[class150.field2381][var2][var5] * 3;
            int var8 = (class59.field962[class150.field2381][var2 + 2][var5] + class59.field962[class150.field2381][var2 + 2][var5] - class59.field962[class150.field2381][var2 - -3][var5]) * 3;
            int var9 = class59.field962[class150.field2381][var2][var5];
            int var10 = var6 - var7;
            int var11 = var7 + var8 - (var6 * 2);
            int var12 = var6 + class59.field962[class150.field2381][var2 + 2][var5] - var9 - var8;
            var3[var5] = (((float) var12 * var4 + (float) var11) * var4 + (float) var10) * var4 + (float) var9;
        }
        if (class30.field421 == 0 && class189.field2995 == 0) {
            class30.field421 = (((int) var3[0] >> 10) - 6) * 8;
            class189.field2995 = ((int) var3[2] >> 10) * 8 - 48;
        }
        class62.field987 = (int) var3[0] - (class30.field421 * 128);
        int var13 = class58.field934 * 2;
        float[] var14 = new float[3];
        class70.field1097 = (int) var3[2] - class189.field2995 * 128;
        class281.field4638 = (int) var3[1] * -1;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = (class59.field962[class72.field1124][var13 + 2][var15] + class59.field962[class72.field1124][var13 + 2][var15] - class59.field962[class72.field1124][var13 + 3][var15]) * 3;
            int var17 = class59.field962[class72.field1124][var13][var15] * 3;
            int var18 = class59.field962[class72.field1124][var13 + 1][var15] * 3;
            int var19 = var18 - var17;
            int var20 = class59.field962[class72.field1124][var13][var15];
            int var21 = var18 + class59.field962[class72.field1124][var13 + 2][var15] - var16 - var20;
            int var22 = var17 + var16 - (var18 * 2);
            var14[var15] = (((float) var21 * var4 + (float) var22) * var4 + (float) var19) * var4 + (float) var20;
        }
        float var23 = var14[0] - var3[0];
        float var24 = var14[2] - var3[2];
        float var25 = (var14[1] - var3[1]) * -1.0F;
        double var26 = Math.sqrt((double) (var23 * var23 + var24 * var24));
        class98.field1496 = (float) Math.atan2((double) var25, var26);
        class296.field4929 = -((float) Math.atan2((double) var23, (double) var24));
        class140.field2251 = (int) ((double) class296.field4929 * 325.949D) & 0x7FF;
        class86.field1290 = (int) ((double) class98.field1496 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)V", line = 158)
    public static void method1862(byte arg0) {
        field4637 = null;
        field4636 = null;
        if (arg0 != 57) {
            method1862((byte) 54);
        }
        field4629 = null;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(III)V", line = 172)
    public class280(int arg0, int arg1, int arg2) {
        this.field4633 = arg0;
        this.field4634 = arg2;
        this.field4635 = arg1;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)V")
    public abstract void method530(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(III)V")
    public abstract void method528(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IBI)V")
    public abstract void method532(int arg0, byte arg1, int arg2);
}
