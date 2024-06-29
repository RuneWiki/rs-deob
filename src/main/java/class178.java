import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class178 extends class175 {

    @OriginalMember(owner = "client!m", name = "L", descriptor = "I")
    public static int field2970 = 0;

    @OriginalMember(owner = "client!m", name = "K", descriptor = "Lij;")
    public static class50 field2969 = class78.method578(124, "<img=0>");

    @OriginalMember(owner = "client!m", name = "T", descriptor = "Lij;")
    public static class50 field2978 = class78.method578(125, "");

    @OriginalMember(owner = "client!m", name = "P", descriptor = "I")
    public static int field2974 = 0;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "Lij;")
    public static class50 field2979 = class78.method578(125, "Fps:");

    @OriginalMember(owner = "client!m", name = "V", descriptor = "Z")
    public static boolean field2980 = false;

    @OriginalMember(owner = "client!m", name = "M", descriptor = "Lij;")
    public static class50 field2971 = class78.method578(121, "l");

    @OriginalMember(owner = "client!m", name = "W", descriptor = "[I")
    public static int[] field2981 = new int[50];

    @OriginalMember(owner = "client!m", name = "N", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!m", name = "O", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!m", name = "Q", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!m", name = "R", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "[Loe;")
    public static class207[] field2977;

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(Z)V")
    public static final void method1217(boolean arg0) {
        ++field2976;
        if (~class14.field331 != 0 && class172.field2880 != -1) {
            int var1 = ((-class191.field3176 + class148.field2546) * class87.field1684 >> 16) + class191.field3176;
            class87.field1684 += var1;
            if (class87.field1684 < 65535) {
                class27.field589 = false;
                class213.field3520 = false;
            } else {
                if (!class27.field589) {
                    class213.field3520 = true;
                } else {
                    class213.field3520 = false;
                }
                class87.field1684 = 65535;
                class27.field589 = true;
            }
            float[] var2 = new float[3];
            float var3 = (float) class87.field1684 / 65535.0F;
            int var4 = class241.field4144 * 2;
            for (int var5 = 0; var5 < 3; ++var5) {
                int var21 = class123.field2166[class14.field331][var4][var5] * 3;
                int var22 = (class123.field2166[class14.field331][var4 - -2][var5] + class123.field2166[class14.field331][var4 + 2][var5] + -class123.field2166[class14.field331][var4 + 3][var5]) * 3;
                int var23 = class123.field2166[class14.field331][var4 + 1][var5] * 3;
                int var24 = -var21 + var23;
                int var25 = -(var23 * 2) + var21 - -var22;
                int var26 = class123.field2166[class14.field331][var4][var5];
                int var27 = class123.field2166[class14.field331][var4 + 2][var5] + -var26 + var23 + -var22;
                var2[var5] = (((float) var27 * var3 + (float) var25) * var3 + (float) var24) * var3 + (float) var26;
            }
            if (class61.field1124 == 0 && class254.field4394 == 0) {
                class61.field1124 = ((int) var2[0] >> 10) * 8 + -48;
                class254.field4394 = ((int) var2[2] >> 10) * 8 + -48;
            }
            class1.field15 = (int) var2[2] + -(class254.field4394 * 128);
            class32.field644 = (int) var2[0] - class61.field1124 * 128;
            class129.field2268 = (int) var2[1] * -1;
            int var6 = class228.field3835 * 2;
            float[] var7 = new float[3];
            for (int var8 = 0; ~var8 > -4; ++var8) {
                int var14 = class123.field2166[class172.field2880][var6 + 1][var8] * 3;
                int var15 = (-class123.field2166[class172.field2880][var6 - -3][var8] - (-class123.field2166[class172.field2880][var6 + 2][var8] - class123.field2166[class172.field2880][var6 - -2][var8])) * 3;
                int var16 = class123.field2166[class172.field2880][var6][var8] * 3;
                int var17 = class123.field2166[class172.field2880][var6][var8];
                int var18 = var14 - var16;
                int var19 = class123.field2166[class172.field2880][var6 + 2][var8] - (var17 - -var15) + var14;
                int var20 = -(var14 * 2) + var16 - -var15;
                var7[var8] = (((float) var19 * var3 + (float) var20) * var3 + (float) var18) * var3 + (float) var17;
            }
            if (arg0) {
                field2977 = null;
            }
            float var9 = (var7[1] - var2[1]) * -1.0F;
            float var10 = var7[0] - var2[0];
            float var11 = var7[2] + -var2[2];
            double var12 = Math.sqrt((double) (var10 * var10 + var11 * var11));
            class137.field2387 = (float) Math.atan2((double) var9, var12);
            class250.field4336 = -((float) Math.atan2((double) var10, (double) var11));
            class221.field3723 = (int) ((double) class137.field2387 * 325.949D) & 2047;
            class68.field1286 = (int) ((double) class250.field4336 * 325.949D) & 2047;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(JZ)Lij;")
    public static final class50 method1218(long arg0, boolean arg1) {
        if (!arg1) {
            method1218(-32L, true);
        }
        ++field2975;
        return class140.method984(10, true, arg0, false);
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(I)V")
    public static void method1219(int arg0) {
        field2979 = null;
        field2977 = null;
        if (arg0 != -10260) {
            field2978 = null;
        }
        field2981 = null;
        field2971 = null;
        field2969 = null;
        field2978 = null;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class178() {
        super(0, true);
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(I)V")
    public static final void method1220(int arg0) {
        ++field2972;
        class221.field3722.method763(0);
        class42.field779.method763(0);
        class104.field1893.method763(0);
        class122.field2140.method763(arg0 ^ arg0);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        int[] var3 = super.field2941.method1427(-21281, arg0);
        ++field2973;
        if (super.field2941.field3565) {
            class105.method794(var3, 0, class211.field3514, class29.field616[arg0]);
        }
        return arg1 != -27746 ? null : var3;
    }
}
