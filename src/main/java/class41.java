import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class41 {

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field570 = -50;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "I")
    public static int field575 = 0;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public int field574;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Llm;")
    public static class347 field571;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "Lcm;")
    public class379 field569;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "[I")
    public int[] field572;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
    public static final void method294(int arg0, int arg1) {
        class124.field1731 = arg0;
        int var2 = 17 % ((arg1 + 40) / 49);
        field576++;
        class189 var3 = class284.field4133;
        synchronized (class284.field4133) {
            class284.field4133.method1141(256);
        }
        class189 var4 = class33.field469;
        synchronized (class33.field469) {
            class33.field469.method1141(256);
        }
        class189 var5 = class398.field5926;
        synchronized (class398.field5926) {
            class398.field5926.method1141(256);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZIIBZ)Llm;")
    public static final class347 method295(boolean arg0, int arg1, int arg2, byte arg3, boolean arg4) {
        field565++;
        if (arg3 != 50) {
            return null;
        }
        class241 var5 = null;
        if (class43.field595 != null) {
            var5 = new class241(arg1, class43.field595, class9.field161[arg1], 1000000);
        }
        class87.field1229[arg1] = class164.field2211.method636(var5, arg1, -32478, class55.field744);
        if (arg0) {
            class87.field1229[arg1].method2154(0);
        }
        return new class347(class87.field1229[arg1], arg4, arg2);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V")
    public static void method296(int arg0) {
        field571 = null;
        if (arg0 >= -11) {
            method295(false, -92, -98, (byte) -120, false);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "([BIII[I[[B[I[[B)I")
    public static final int method297(byte[] arg0, int arg1, int arg2, int arg3, int[] arg4, byte[][] arg5, int[] arg6, byte[][] arg7) {
        field566++;
        int var8 = arg6[arg3];
        int var9 = arg4[arg3] + var8;
        int var10 = arg6[arg2];
        int var11 = arg4[arg2] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg0[arg3] & arg1;
        if (var14 > (arg0[arg2] & 0xFF)) {
            var14 = arg0[arg2] & 0xFF;
        }
        byte[] var15 = arg7[arg3];
        byte[] var16 = arg5[arg2];
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var15[var17++] + var16[var18++];
            if (var14 > var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLnj;Ljava/lang/String;)I")
    public static final int method298(byte arg0, class228 arg1, String arg2) {
        field567++;
        int var3 = arg1.field3029;
        int var4 = 0 % ((arg0 - 69) / 55);
        byte[] var5 = class448.method2817((byte) -122, arg2);
        arg1.method1341(var5.length, 84);
        arg1.field3029 += class243.field3242.method1946(arg1.field3040, var5, 0, false, arg1.field3029, var5.length);
        return arg1.field3029 - var3;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IILjava/lang/String;JLjava/lang/String;IZI)V")
    public static final void method299(int arg0, int arg1, String arg2, long arg3, String arg4, int arg5, boolean arg6, int arg7) {
        field573++;
        if (class2.field26 || class212.field2844 >= 500) {
            return;
        }
        int var9 = arg1 == -1 ? class71.field995 : arg1;
        class212 var10 = new class212(arg2, arg4, var9, arg5, arg3, arg7, arg0);
        class321.field4726.method330(var10, -2130841184);
        if (arg6) {
            method297((byte[]) null, 10, 117, -25, (int[]) null, (byte[][]) null, (int[]) null, (byte[][]) null);
        }
        class212.field2844++;
    }
}
