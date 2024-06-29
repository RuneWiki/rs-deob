import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class171 extends class110 {

    @OriginalMember(owner = "client!oh", name = "L", descriptor = "I")
    private int field2571;

    @OriginalMember(owner = "client!oh", name = "I", descriptor = "Lpj;")
    public static class59 field2568 = null;

    @OriginalMember(owner = "client!oh", name = "J", descriptor = "Ljava/lang/String;")
    public static String field2569 = null;

    @OriginalMember(owner = "client!oh", name = "G", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!oh", name = "H", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!oh", name = "K", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!oh", name = "M", descriptor = "I")
    public static int field2572;

    @OriginalMember(owner = "client!oh", name = "N", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!oh", name = "P", descriptor = "I")
    public static int field2575;

    @OriginalMember(owner = "client!oh", name = "O", descriptor = "Lek;")
    public static class213 field2574;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "(I)V", line = 7)
    public static final void method1193(int arg0) {
        field2570++;
        if (class41.field500 == -1 || class69.field915 == -1) {
            return;
        }
        int var1 = ((class140.field2119 - class81.field1138) * class10.field105 >> 16) + class81.field1138;
        float[] var2 = new float[3];
        class10.field105 += var1;
        if (class10.field105 >= 65535) {
            class10.field105 = 65535;
            if (class61.field816) {
                class67.field882 = false;
            } else {
                class67.field882 = true;
            }
            class61.field816 = true;
        } else {
            class67.field882 = false;
            class61.field816 = false;
        }
        int var3 = class245.field3653 * 2;
        float var4 = (float) class10.field105 / 65535.0F;
        for (int var5 = 0; var5 < 3; var5++) {
            int var6 = class8.field66[class41.field500][var3][var5] * 3;
            int var7 = class8.field66[class41.field500][var3 + 1][var5] * 3;
            int var8 = (class8.field66[class41.field500][var3 + 2][var5] + class8.field66[class41.field500][var3 + 2][var5] - class8.field66[class41.field500][var3 + 3][var5]) * 3;
            int var9 = class8.field66[class41.field500][var3][var5];
            int var10 = var7 - var6;
            int var11 = var7 + class8.field66[class41.field500][var3 + 2][var5] - var8 - var9;
            int var12 = var6 + var8 - (var7 * 2);
            var2[var5] = (((float) var11 * var4 + (float) var12) * var4 + (float) var10) * var4 + (float) var9;
        }
        class302.field4612 = (int) var2[arg0] - (class217.field3309 * 128);
        class287.field4338 = (int) var2[1] * -1;
        int var13 = class101.field1600 * 2;
        float[] var14 = new float[3];
        class203.field3052 = (int) var2[2] - (class189.field2807 * 128);
        for (int var15 = 0; var15 < 3; var15++) {
            int var16 = class8.field66[class69.field915][var13 + 1][var15] * 3;
            int var17 = class8.field66[class69.field915][var13][var15] * 3;
            int var18 = (class8.field66[class69.field915][var13 + 2][var15] + class8.field66[class69.field915][var13 + 2][var15] - class8.field66[class69.field915][var13 + 3][var15]) * 3;
            int var19 = class8.field66[class69.field915][var13][var15];
            int var20 = var16 - var17;
            int var21 = var18 + var17 - (var16 * 2);
            int var22 = class8.field66[class69.field915][var13 + 2][var15] + var16 - var19 - var18;
            var14[var15] = (((float) var22 * var4 + (float) var21) * var4 + (float) var20) * var4 + (float) var19;
        }
        float var23 = var14[0] - var2[0];
        float var24 = (var14[1] - var2[1]) * -1.0F;
        float var25 = var14[2] - var2[2];
        double var26 = Math.sqrt((double) (var23 * var23 + var25 * var25));
        class216.field3261 = (float) Math.atan2((double) var24, var26);
        class19.field230 = -((float) Math.atan2((double) var23, (double) var25));
        class160.field2392 = (int) ((double) class216.field3261 * 325.949D) & 0x7FF;
        class84.field1249 = (int) ((double) class19.field230 * 325.949D) & 0x7FF;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(I)V", line = 111)
    private class171(int arg0) {
        super(0, true);
        this.field2571 = 4096;
        this.field2571 = arg0;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(II)[I", line = 127)
    public final int[] method46(int arg0, int arg1) {
        field2575++;
        int[] var3 = this.field1695.method440((byte) -60, arg1);
        if (arg0 == 1) {
            if (this.field1695.field875) {
                class85.method592(var3, 0, class124.field1936, this.field2571);
            }
            return var3;
        } else {
            return (int[]) null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "(I)V", line = 151)
    public static void method1194(int arg0) {
        field2568 = null;
        field2574 = null;
        field2569 = null;
        if (arg0 != 2) {
            method1194(36);
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V", line = 162)
    public class171() {
        this(4096);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILre;I)V", line = 173)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            this.field2571 = (arg1.method1787(false) << 12) / 255;
        }
        if (arg2 >= -37) {
            method1193(-28);
        }
        field2567++;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ZZIIZ)Llm;", line = 197)
    public static final class210 method1195(boolean arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        if (arg2 < 95) {
            field2572 = -107;
        }
        field2566++;
        class283 var5 = null;
        if (class296.field4540 != null) {
            var5 = new class283(arg3, class296.field4540, class162.field2447[arg3], 1000000);
        }
        class76.field982[arg3] = class120.field1884.method951((byte) 63, var5, arg3, class147.field2212);
        if (arg4) {
            class76.field982[arg3].method1750(1700);
        }
        return new class210(class76.field982[arg3], arg1, arg0);
    }
}
