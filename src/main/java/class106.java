import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public abstract class class106 {

    @OriginalMember(owner = "client!g", name = "i", descriptor = "Lvj;")
    public class303 field1770;

    @OriginalMember(owner = "client!g", name = "h", descriptor = "[I")
    public static int[] field1769 = new int[1];

    @OriginalMember(owner = "client!g", name = "g", descriptor = "I")
    public static int field1768 = 0;

    @OriginalMember(owner = "client!g", name = "c", descriptor = "I")
    public static int field1764 = -1;

    @OriginalMember(owner = "client!g", name = "f", descriptor = "Lrn;")
    public static class174 field1767 = new class174(64, 7);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!g", name = "b", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!g", name = "d", descriptor = "I")
    public static int field1765;

    @OriginalMember(owner = "client!g", name = "e", descriptor = "I")
    public static int field1766;

    @OriginalMember(owner = "client!g", name = "j", descriptor = "I")
    public static int field1771;

    @OriginalMember(owner = "client!g", name = "k", descriptor = "I")
    public static int field1772;

    @OriginalMember(owner = "client!g", name = "l", descriptor = "Lsg;")
    public static class272 field1773;

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(I)V")
    public abstract void method342(int arg0);

    @OriginalMember(owner = "client!g", name = "b", descriptor = "(I)Z")
    public abstract boolean method348(int arg0);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(Z)V")
    public static final void method797(boolean arg0) {
        field1763++;
        if (class412.field6156 == -1 || class190.field2834 == -1) {
            return;
        }
        int var1 = ((class175.field2681 - class321.field4911) * class443.field6620 >> 16) + class321.field4911;
        class443.field6620 += var1;
        if (class443.field6620 < 65535) {
            class250.field3577 = false;
            class492.field7276 = false;
        } else {
            class443.field6620 = 65535;
            if (class492.field7276) {
                class250.field3577 = false;
            } else {
                class250.field3577 = true;
            }
            class492.field7276 = true;
        }
        float var2 = (float) class443.field6620 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class365.field5522 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class481.field7159[class412.field6156][var4][var5] * 3;
            int var22 = class481.field7159[class412.field6156][var4 + 1][var5] * 3;
            int var23 = (class481.field7159[class412.field6156][var4 + 2][var5] + class481.field7159[class412.field6156][var4 + 2][var5] - class481.field7159[class412.field6156][var4 + 3][var5]) * 3;
            int var24 = class481.field7159[class412.field6156][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class481.field7159[class412.field6156][var4 + 2][var5] + var22 - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class40.field732 = (int) var3[0] - (class200.field2931 * 128);
        class405.field6075 = (int) var3[2] - class403.field6059 * 128;
        class222.field3184 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class81.field1425 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class481.field7159[class190.field2834][var7][var8] * 3;
            int var15 = class481.field7159[class190.field2834][var7 + 1][var8] * 3;
            int var16 = (class481.field7159[class190.field2834][var7 + 2][var8] + class481.field7159[class190.field2834][var7 + 2][var8] - class481.field7159[class190.field2834][var7 + 3][var8]) * 3;
            int var17 = class481.field7159[class190.field2834][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 - (var15 * 2 - var16);
            int var20 = class481.field7159[class190.field2834][var7 + 2][var8] + var15 - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        if (arg0) {
            return;
        }
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class122.field1982 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class291.field4148 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class291.field4137 = class481.field7159[class412.field6156][var4][3] + ((class481.field7159[class412.field6156][var4 + 2][3] - class481.field7159[class412.field6156][var4][3]) * class443.field6620 >> 16);
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IILih;)V")
    public abstract void method346(int arg0, int arg1, class492 arg2);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(II)V")
    public static final void method798(int arg0, int arg1) {
        class64.field1101 = arg0;
        field1762++;
        if (arg1 != 16383) {
            field1768 = 25;
        }
        class55 var2 = class345.field5180;
        synchronized (class345.field5180) {
            class345.field5180.method488(-3);
        }
        class55 var3 = class175.field2676;
        synchronized (class175.field2676) {
            class175.field2676.method488(-3);
        }
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(IBI)V")
    public abstract void method347(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZI)V")
    public abstract void method343(boolean arg0, int arg1);

    @OriginalMember(owner = "client!g", name = "c", descriptor = "(I)V")
    public static final void method799(int arg0) {
        class429.field6390.method159(0);
        field1765++;
        class457.field6841.method159(0);
        if (arg0 > -118) {
            method798(83, -54);
        }
    }

    @OriginalMember(owner = "client!g", name = "d", descriptor = "(I)V")
    public static void method800(int arg0) {
        if (arg0 < -3) {
            field1769 = null;
            field1767 = null;
            field1773 = null;
        }
    }

    @OriginalMember(owner = "client!g", name = "e", descriptor = "(I)V")
    public static final void method801(int arg0) {
        class315.field4741.method2824(arg0 - 31450);
        field1771++;
        class289.field4118 = arg0;
        class488.field7226 = null;
    }

    @OriginalMember(owner = "client!g", name = "<init>", descriptor = "(Lvj;)V")
    public class106(class303 arg0) {
        this.field1770 = arg0;
    }

    @OriginalMember(owner = "client!g", name = "a", descriptor = "(ZB)V")
    public abstract void method344(boolean arg0, byte arg1);
}
