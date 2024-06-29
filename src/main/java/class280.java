import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class280 extends class133 {

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "Ljava/lang/Object;")
    private Object field4788;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "Lwm;")
    public static class152 field4790 = class157.method1048(" steht bereits auf Ihrer Ignorieren)2Liste(Q", 106);

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "I")
    public static int field4792 = 0;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "[I")
    public static int[] field4793 = new int[25];

    @OriginalMember(owner = "client!ud", name = "M", descriptor = "I")
    public static int field4781;

    @OriginalMember(owner = "client!ud", name = "N", descriptor = "I")
    public static int field4782;

    @OriginalMember(owner = "client!ud", name = "P", descriptor = "I")
    public static int field4784;

    @OriginalMember(owner = "client!ud", name = "Q", descriptor = "I")
    public static int field4785;

    @OriginalMember(owner = "client!ud", name = "R", descriptor = "I")
    public static int field4786;

    @OriginalMember(owner = "client!ud", name = "S", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public static int field4789;

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!ud", name = "O", descriptor = "Lah;")
    public static class205 field4783;

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V", line = 7)
    public static final void method1904(int arg0) {
        class194.field3087.method1619(11300);
        field4789++;
        if (arg0 > -62) {
            method1908((byte) 60);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Z)V", line = 18)
    public static final void method1905(boolean arg0) {
        field4781++;
        if (class299.field5181 == -1 || class104.field1489 == -1) {
            return;
        }
        int var1 = ((class294.field5033 - class6.field98) * class196.field3135 >> 16) + class6.field98;
        float[] var2 = new float[3];
        class196.field3135 += var1;
        if (class196.field3135 >= 65535) {
            if (class17.field233) {
                class46.field737 = false;
            } else {
                class46.field737 = true;
            }
            class17.field233 = true;
            class196.field3135 = 65535;
        } else {
            class46.field737 = false;
            class17.field233 = false;
        }
        float var3 = (float) class196.field3135 / 65535.0F;
        int var4 = class112.field1580 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class38.field627[class299.field5181][var4 + 1][var5] * 3;
            int var7 = (class38.field627[class299.field5181][var4 + 2][var5] + class38.field627[class299.field5181][var4 + 2][var5] - class38.field627[class299.field5181][var4 + 3][var5]) * 3;
            int var8 = class38.field627[class299.field5181][var4][var5];
            int var9 = class38.field627[class299.field5181][var4][var5] * 3;
            int var10 = class38.field627[class299.field5181][var4 + 2][var5] - var8 - (-var6 + var7);
            int var11 = var6 - var9;
            int var12 = var9 + var7 - (var6 * 2);
            var2[var5] = (((float) var10 * var3 + (float) var12) * var3 + (float) var11) * var3 + (float) var8;
        }
        class27.field470 = (int) var2[1] * -1;
        class224.field3639 = (int) var2[0] - (class272.field4670 * 128);
        if (!arg0) {
            method1906(99, -128, -57, false, 27, -51, 84, (class270) null, 38);
        }
        class80.field1129 = (int) var2[2] - class199.field3226 * 128;
        int var13 = class41.field659 * 2;
        float[] var14 = new float[3];
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class38.field627[class104.field1489][var13][var15] * 3;
            int var17 = class38.field627[class104.field1489][var13 + 1][var15] * 3;
            int var18 = (class38.field627[class104.field1489][var13 + 2][var15] - (class38.field627[class104.field1489][var13 + 3][var15] - class38.field627[class104.field1489][var13 + 2][var15])) * 3;
            int var19 = var17 - var16;
            int var20 = var16 + var18 - var17 * 2;
            int var21 = class38.field627[class104.field1489][var13][var15];
            int var22 = class38.field627[class104.field1489][var13 + 2][var15] + var17 - var18 - var21;
            var14[var15] = (((float) var22 * var3 + (float) var20) * var3 + (float) var19) * var3 + (float) var21;
        }
        float var23 = (var14[1] - var2[1]) * -1.0F;
        float var24 = var14[0] - var2[0];
        float var25 = var14[2] - var2[2];
        double var26 = Math.sqrt((double) (var24 * var24 + var25 * var25));
        class323.field5646 = (float) Math.atan2((double) var23, var26);
        class324.field5657 = -((float) Math.atan2((double) var24, (double) var25));
        class223.field3634 = (int) ((double) class323.field5646 * 325.949D) & 0x7FF;
        class94.field1346 = (int) ((double) class324.field5657 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!ud", name = "e", descriptor = "(I)Z", line = 126)
    public final boolean method848(int arg0) {
        field4787++;
        if (arg0 != 13063) {
            field4793 = (int[]) null;
        }
        return false;
    }

    @OriginalMember(owner = "client!ud", name = "f", descriptor = "(I)Ljava/lang/Object;", line = 137)
    public final Object method853(int arg0) {
        field4786++;
        if (arg0 <= 2) {
            method1906(-17, -128, 37, true, -27, 83, -79, (class270) null, 60);
        }
        return this.field4788;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIZIIILr;I)V", line = 158)
    public static final void method1906(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, class270 arg7, int arg8) {
        int var9 = arg0 & 0x3;
        field4785++;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var10 = arg7.field4562;
            var11 = arg7.field4618;
        } else {
            var10 = arg7.field4618;
            var11 = arg7.field4562;
        }
        int var12;
        int var13;
        if ((arg8 + var10) > 104) {
            var12 = arg8 + 1;
            var13 = arg8;
        } else {
            var12 = (var10 + 1 >> 1) + arg8;
            var13 = arg8 + (var10 >> 1);
        }
        int var14;
        int var15;
        if ((arg5 + var11) <= 104) {
            var14 = (var11 + 1 >> 1) + arg5;
            var15 = (var11 >> 1) + arg5;
        } else {
            var15 = arg5;
            var14 = arg5 + 1;
        }
        int var16 = (arg8 << 7) + (var10 << 6);
        int[][] var17 = class65.field984[arg1];
        int var18 = (arg5 << 7) + (var11 << 6);
        int var19 = var17[var13][var14] + var17[var12][var14] + var17[var12][var15] + var17[var13][var15] >> 2;
        int var20 = 0;
        if (arg1 != 0) {
            int[][] var21 = class65.field984[0];
            var20 = var19 - (var21[var13][var15] + var21[var12][var14] - (-var21[var12][var15] - var21[var13][var14]) >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg1 < 3) {
            var22 = class65.field984[arg1 + 1];
        }
        class189 var23 = arg7.method1850(var19, arg0, var22, var16, var18, arg3, (class300) null, var17, arg2, true, -128);
        class102.method680(var23.field2992, var16 - arg4, var20, var18 - arg6);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IB)I", line = 238)
    public static final int method1907(int arg0, byte arg1) {
        field4791++;
        if (!(arg0 < 97 || arg0 > 122) || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        }
        if (arg1 != -114) {
            field4782 = 57;
        }
        if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 262)
    public class280(Object arg0) {
        this.field4788 = arg0;
    }

    @OriginalMember(owner = "client!ud", name = "c", descriptor = "(B)V", line = 278)
    public static void method1908(byte arg0) {
        if (arg0 != 48) {
            field4783 = (class205) null;
        }
        field4783 = null;
        field4790 = null;
        field4793 = null;
    }
}
