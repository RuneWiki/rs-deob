import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fh")
public class class187 {

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "Lwa;")
    public static class75 field3118 = class66.method560("scape main", false);

    @OriginalMember(owner = "client!fh", name = "c", descriptor = "[I")
    public static int[] field3120 = new int[5];

    @OriginalMember(owner = "client!fh", name = "g", descriptor = "[I")
    public static int[] field3124 = new int[25];

    @OriginalMember(owner = "client!fh", name = "i", descriptor = "Lwa;")
    public static class75 field3126 = class66.method560(" zuerst von Ihrer Freunde)2Liste(Q", false);

    @OriginalMember(owner = "client!fh", name = "f", descriptor = "Lwa;")
    public static class75 field3123 = class66.method560("(Y<)4col>", false);

    @OriginalMember(owner = "client!fh", name = "k", descriptor = "I")
    public static int field3128 = 1;

    @OriginalMember(owner = "client!fh", name = "b", descriptor = "I")
    public static int field3119;

    @OriginalMember(owner = "client!fh", name = "d", descriptor = "I")
    public static int field3121;

    @OriginalMember(owner = "client!fh", name = "h", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!fh", name = "j", descriptor = "I")
    public static int field3127;

    @OriginalMember(owner = "client!fh", name = "e", descriptor = "Z")
    public static boolean field3122;

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(IIIIILre;I)V", line = 32)
    public static final void method1414(int arg0, int arg1, int arg2, int arg3, int arg4, class262 arg5, int arg6) {
        int var7 = arg1 * arg1 + (arg0 * arg0);
        field3127++;
        int var8 = 101 / ((arg6 - 4) / 36);
        if (var7 > 360000) {
            return;
        }
        int var9 = Math.min(arg5.field4531 / 2, arg5.field4517 / 2);
        if ((var9 * var9) >= var7) {
            class263.method1880(arg2, 1926111120, arg5, arg4, arg0, class69.field1188[arg3], arg1);
            return;
        }
        var9 -= 10;
        int var10 = class290.field4981 + class249.field4191 & 0x7FF;
        int var11 = class21.field288[var10];
        int var12 = var11 * 256 / (class14.field191 + 256);
        int var13 = class21.field286[var10];
        int var14 = var13 * 256 / (class14.field191 + 256);
        int var15 = arg0 * var14 - (arg1 * var12) >> 16;
        int var16 = arg0 * var12 + (arg1 * var14) >> 16;
        double var17 = Math.atan2((double) var16, (double) var15);
        int var19 = (int) (Math.sin(var17) * (double) var9);
        int var20 = (int) ((double) var9 * Math.cos(var17));
        ((class277) class168.field2836[arg3]).method1967(240, 240, (arg5.field4531 / 2 + var19 + arg4) * 16, (arg5.field4517 / 2 + arg2 - var20) * 16, (int) (var17 * 10430.378D), 4096);
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(Z)V", line = 79)
    public static void method1415(boolean arg0) {
        field3118 = null;
        field3123 = null;
        field3120 = null;
        field3126 = null;
        if (!arg0) {
            method1414(114, -90, 111, 106, 115, (class262) null, 114);
        }
        field3124 = null;
    }

    @OriginalMember(owner = "client!fh", name = "a", descriptor = "(I)V", line = 98)
    public static final void method1416(int arg0) {
        field3121++;
        if (arg0 != 2) {
            method1414(-71, 39, -127, -72, -10, (class262) null, 101);
        }
        for (class93 var1 = (class93) class73.field1224.method1001((byte) 33); var1 != null; var1 = (class93) class73.field1224.method1009(-123)) {
            int var2 = var1.field1518;
            if (class51.method375(var2, -115)) {
                boolean var3 = true;
                class262[] var4 = class249.field4198[var2];
                for (int var5 = 0; var5 < var4.length; var5++) {
                    if (var4[var5] != null) {
                        var3 = var4[var5].field4540;
                        break;
                    }
                }
                if (!var3) {
                    int var6 = (int) var1.field3488;
                    class262 var7 = class51.method374(1, var6);
                    if (var7 != null) {
                        class291.method2027(var7, 14580);
                    }
                }
            }
        }
    }
}
