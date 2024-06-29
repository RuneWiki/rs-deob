import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class313 {

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "I")
    public int field4756 = 0;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Z")
    public static boolean field4754 = false;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "I")
    public static int field4757 = 0;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
    public static int[] field4758 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field4759;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "I")
    public static int field4760;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field4761;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field4762;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "I")
    public static int field4763;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "[[[B")
    public static byte[][][] field4764;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 13)
    public static void method2130(int arg0) {
        field4764 = (byte[][][]) null;
        field4758 = null;
        if (arg0 != 3) {
            field4764 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V", line = 41)
    public static final void method2131(int arg0, int arg1) {
        if (arg1 != -6029) {
            field4754 = false;
        }
        field4761++;
        class135.field2262.method1883(2047773287, arg0);
        class186.field3022.method1883(2047773287, arg0);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILag;)V", line = 57)
    public final void method2132(int arg0, class202 arg1) {
        while (true) {
            int var3 = arg1.method1317((byte) -109);
            if (var3 == 0) {
                field4763++;
                if (arg0 != 0) {
                    method2130(68);
                }
                return;
            }
            this.method2133(24008, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IILag;)V", line = 78)
    private final void method2133(int arg0, int arg1, class202 arg2) {
        field4755++;
        if (arg1 == 5) {
            this.field4756 = arg2.method1315(14289);
        }
        if (arg0 != 24008) {
            field4757 = -41;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(ILbm;Lbm;Lbm;)V", line = 94)
    public static final void method2134(int arg0, class307 arg1, class307 arg2, class307 arg3) {
        class109.field1948 = arg3;
        if (arg0 != 20973) {
            method2130(109);
        }
        class94.field1687 = arg2;
        class15.field276 = arg1;
        field4753++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 107)
    public static final void method2135(byte arg0) {
        field4762++;
        if (class344.field5340 == -1 || class220.field3497 == -1) {
            return;
        }
        float[] var1 = new float[3];
        int var2 = class343.field5333 + ((class290.field4452 - class343.field5333) * class173.field2775 >> 16);
        class173.field2775 += var2;
        int var3 = class156.field2536 * 2;
        if (class173.field2775 >= 65535) {
            if (class30.field564) {
                class317.field4791 = false;
            } else {
                class317.field4791 = true;
            }
            class173.field2775 = 65535;
            class30.field564 = true;
        } else {
            class317.field4791 = false;
            class30.field564 = false;
        }
        float var4 = (float) class173.field2775 / 65535.0F;
        if (arg0 != 99) {
            field4764 = (byte[][][]) ((byte[][][]) null);
        }
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class31.field598[class344.field5340][var3 + 1][var5] * 3;
            int var7 = class31.field598[class344.field5340][var3][var5] * 3;
            int var8 = (class31.field598[class344.field5340][var3 + 2][var5] + class31.field598[class344.field5340][var3 + 2][var5] - class31.field598[class344.field5340][var3 + 3][var5]) * 3;
            int var9 = class31.field598[class344.field5340][var3][var5];
            int var10 = var6 - var7;
            int var11 = class31.field598[class344.field5340][var3 + 2][var5] + var6 - var9 - var8;
            int var12 = var7 + var8 - var6 * 2;
            var1[var5] = (((float) var11 * var4 + (float) var12) * var4 + (float) var10) * var4 + (float) var9;
        }
        class283.field4381 = (int) var1[2] - (class101.field1769 * 128);
        class132.field2232 = (int) var1[1] * -1;
        class38.field742 = (int) var1[0] - class246.field3818 * 128;
        float[] var13 = new float[3];
        int var14 = class343.field5330 * 2;
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = (class31.field598[class220.field3497][var14 + 2][var15] + class31.field598[class220.field3497][var14 + 2][var15] - class31.field598[class220.field3497][var14 + 3][var15]) * 3;
            int var17 = class31.field598[class220.field3497][var14][var15] * 3;
            int var18 = class31.field598[class220.field3497][var14][var15];
            int var19 = class31.field598[class220.field3497][var14 + 1][var15] * 3;
            int var20 = var19 - var17;
            int var21 = var17 + var16 - (var19 * 2);
            int var22 = var19 + class31.field598[class220.field3497][var14 + 2][var15] - var16 - var18;
            var13[var15] = (((float) var22 * var4 + (float) var21) * var4 + (float) var20) * var4 + (float) var18;
        }
        float var23 = var13[0] - var1[0];
        float var24 = (var13[1] - var1[1]) * -1.0F;
        float var25 = var13[2] - var1[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class55.field1096 = (float) Math.atan2((double) var24, var26);
        class336.field5153 = -((float) Math.atan2((double) var23, (double) var25));
        class43.field820 = (int) ((double) class55.field1096 * 325.949D) & 0x7FF;
        class131.field2213 = (int) ((double) class336.field5153 * 325.949D) & 0x7FF;
    }
}
