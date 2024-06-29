import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class172 {

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Lsf;")
    private class398 field2647;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field2639 = 1;

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "I")
    public static int field2643 = 0;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2645 = new String[100];

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field2638;

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "I")
    public static int field2641;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "I")
    public static int field2642;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field2646;

    @OriginalMember(owner = "client!hj", name = "l", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!hj", name = "k", descriptor = "Lnr;")
    private class97 field2648;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static final void method1059(int arg0) {
        field2649++;
        if (class284.field4337 == -1 || class391.field5769 == -1) {
            return;
        }
        int var1 = ((class134.field1775 - class205.field3074) * class262.field4012 >> 16) + class205.field3074;
        class262.field4012 += var1;
        if (class262.field4012 >= 65535) {
            class262.field4012 = 65535;
            if (class298.field4509) {
                class344.field5146 = false;
            } else {
                class344.field5146 = true;
            }
            class298.field4509 = true;
        } else {
            class298.field4509 = false;
            class344.field5146 = false;
        }
        float var2 = (float) class262.field4012 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class411.field6120 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class402.field6005[class284.field4337][var4][var5] * 3;
            int var22 = class402.field6005[class284.field4337][var4 + 1][var5] * 3;
            int var23 = (class402.field6005[class284.field4337][var4 + 2][var5] + class402.field6005[class284.field4337][var4 + 2][var5] - class402.field6005[class284.field4337][var4 + 3][var5]) * 3;
            int var24 = class402.field6005[class284.field4337][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - (var22 * 2);
            int var27 = class402.field6005[class284.field4337][var4 + 2][var5] - var24 - (-var22 + var23);
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class185.field2790 = (int) var3[0] - (class17.field250 * 128);
        class127.field1626 = (int) var3[1] * -1;
        class196.field2967 = (int) var3[2] - (class112.field1487 * 128);
        float[] var6 = new float[3];
        int var7 = class77.field1030 * 2;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class402.field6005[class391.field5769][var7][var8] * 3;
            int var15 = class402.field6005[class391.field5769][var7 + 1][var8] * 3;
            int var16 = (class402.field6005[class391.field5769][var7 + 2][var8] - (class402.field6005[class391.field5769][var7 + 3][var8] - class402.field6005[class391.field5769][var7 + 2][var8])) * 3;
            int var17 = class402.field6005[class391.field5769][var7][var8];
            int var18 = var15 - var14;
            int var19 = var14 + var16 - (var15 * 2);
            int var20 = class402.field6005[class391.field5769][var7 + 2][var8] - var17 - (-var15 - -var16);
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[arg0]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class350.field5204 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class201.field3037 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class363.field5344 = ((class402.field6005[class284.field4337][var4 + 2][3] - class402.field6005[class284.field4337][var4][3]) * class262.field4012 >> 16) + class402.field6005[class284.field4337][var4][3];
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(Lsf;I)V")
    public final void method1060(class398 arg0, int arg1) {
        if (arg1 != 3) {
            field2639 = 79;
        }
        field2642++;
        this.field2647 = arg0;
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(I)Lnr;")
    public final class97 method1061(int arg0) {
        field2638++;
        if (arg0 != 1) {
            this.field2648 = null;
        }
        class97 var2 = this.field2648;
        if (this.field2647.field5946 == var2) {
            this.field2648 = null;
            return null;
        } else {
            this.field2648 = var2.field1331;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "(I)V")
    public static void method1062(int arg0) {
        field2645 = null;
        if (arg0 != 65535) {
            field2643 = -81;
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(B)V")
    public static final void method1063(byte arg0) {
        field2640++;
        class143.field1909.method1482((byte) -106);
        if (arg0 >= -7) {
            method1059(70);
        }
    }

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "(I)Lnr;")
    public final class97 method1064(int arg0) {
        if (arg0 != 1) {
            this.method1064(86);
        }
        field2644++;
        class97 var2 = this.field2647.field5946.field1331;
        if (this.field2647.field5946 == var2) {
            this.field2648 = null;
            return null;
        } else {
            this.field2648 = var2.field1331;
            return var2;
        }
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "()V")
    public class172() {
    }

    @OriginalMember(owner = "client!hj", name = "<init>", descriptor = "(Lsf;)V")
    public class172(class398 arg0) {
        this.field2647 = arg0;
    }
}
