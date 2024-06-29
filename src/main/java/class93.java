import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class93 extends class285 {

    @OriginalMember(owner = "client!pc", name = "Y", descriptor = "I")
    private int field1279 = 4096;

    @OriginalMember(owner = "client!pc", name = "Q", descriptor = "I")
    public static int field1271 = 1;

    @OriginalMember(owner = "client!pc", name = "P", descriptor = "Ldb;")
    public static class102 field1270 = new class102(4);

    @OriginalMember(owner = "client!pc", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field1282 = "red:";

    @OriginalMember(owner = "client!pc", name = "O", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!pc", name = "R", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!pc", name = "S", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!pc", name = "T", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!pc", name = "U", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!pc", name = "V", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!pc", name = "W", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!pc", name = "X", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!pc", name = "Z", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!pc", name = "ab", descriptor = "[I")
    public static int[] field1281;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZLjj;I)V", line = 5)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        if (!arg0) {
            method624(-11);
        }
        field1273++;
        if (arg2 == 0) {
            this.field1279 = arg1.method271(21081);
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZIIII)V", line = 18)
    public static final void method620(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field1278++;
        if (!arg0) {
            field1281 = (int[]) null;
        }
        for (int var5 = 0; var5 < class20.field291; var5++) {
            if ((class81.field1146[var5] + class197.field3215[var5]) > arg2 && arg1 + arg2 > class81.field1146[var5] && class323.field5013[var5] + class213.field3481[var5] > arg4 && class213.field3481[var5] < (arg4 + arg3)) {
                class174.field2884[var5] = true;
            }
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILog;BI)V", line = 40)
    public static final void method621(int arg0, class157 arg1, byte arg2, int arg3) {
        field1280++;
        if (arg2 <= 107) {
            field1281 = (int[]) null;
        }
        if (class185.field3070 < 2 && class8.field119 == 0 && !class142.field2216) {
            return;
        }
        String var4 = class110.method760(false);
        if (arg1 == null) {
            int var5 = class282.field4538.method1792(var4, arg3 + 4, arg0 + 15, 16777215, 0, class200.field3244, class117.field1779);
            method620(true, class282.field4538.method1804(var4) + var5, arg3 + 4, 15, arg0);
            return;
        }
        class251 var6 = arg1.method1136(class99.field1416, (byte) 72);
        if (var6 == null) {
            var6 = class282.field4538;
        }
        var6.method1789(var4, arg3, arg0, arg1.field2468, arg1.field2520, arg1.field2436, arg1.field2496, arg1.field2599, arg1.field2551, class200.field3244, class117.field1779, class106.field1576);
        method620(true, class106.field1576[2], class106.field1576[0], class106.field1576[3], class106.field1576[1]);
    }

    @OriginalMember(owner = "client!pc", name = "<init>", descriptor = "()V", line = 73)
    public class93() {
        super(1, true);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Lak;I)V", line = 92)
    public static final void method622(class172 arg0, int arg1) {
        class178.field2962 = arg0;
        int var2 = 123 % ((21 - arg1) / 44);
        field1269++;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ZI)[I", line = 102)
    public final int[] method60(boolean arg0, int arg1) {
        field1272++;
        int[] var3 = this.field4573.method1116(107, arg1);
        if (this.field4573.field2420) {
            int[] var4 = this.method2048(0, (byte) 121, arg1 - 1 & class32.field432);
            int[] var5 = this.method2048(0, (byte) 123, arg1);
            int[] var6 = this.method2048(0, (byte) 121, class32.field432 & arg1 + 1);
            for (int var7 = 0; var7 < class287.field4599; var7++) {
                int var8 = (var6[var7] - var4[var7]) * this.field1279;
                int var9 = (var5[class112.field1717 & var7 + 1] - var5[class112.field1717 & var7 - 1]) * this.field1279;
                int var10 = var8 >> 12;
                int var11 = var9 >> 12;
                int var12 = var11 * var11 >> 12;
                int var13 = var10 * var10 >> 12;
                int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = 4096 - var15;
            }
        }
        if (!arg0) {
            this.field1279 = 104;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(III)I", line = 157)
    public static final int method623(int arg0, int arg1, int arg2) {
        field1275++;
        if (arg0 <= 65) {
            return 78;
        } else {
            int var3 = class11.method64(-9518, arg2 - 1, arg1 + -1) + class11.method64(-9518, arg2 + 1, arg1 - 1) - (-class11.method64(-9518, arg2 - 1, arg1 - -1) - class11.method64(-9518, arg2 + 1, arg1 + 1));
            int var4 = class11.method64(-9518, arg2 - 1, arg1) + (class11.method64(-9518, arg2 + 1, arg1) - (-class11.method64(-9518, arg2, arg1 - 1) - class11.method64(-9518, arg2, arg1 + 1)));
            int var5 = class11.method64(-9518, arg2, arg1);
            return var3 / 16 + var4 / 8 + (var5 / 4);
        }
    }

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "(I)V", line = 182)
    public static void method624(int arg0) {
        field1282 = null;
        if (arg0 == 24750) {
            field1270 = null;
            field1281 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(BLak;)I", line = 195)
    public static final int method625(byte arg0, class172 arg1) {
        field1277++;
        int var2 = 0;
        if (arg1.method1276(class208.field3426, -76)) {
            var2++;
        }
        if (arg1.method1276(class311.field4848, -92)) {
            var2++;
        }
        if (arg1.method1276(class45.field628, -100)) {
            var2++;
        }
        if (arg1.method1276(class102.field1492, -122)) {
            var2++;
        }
        if (arg1.method1276(class229.field3651, 124)) {
            var2++;
        }
        if (arg0 > -89) {
            method620(false, -46, 103, 62, -79);
        }
        if (arg1.method1276(class284.field4554, 109)) {
            var2++;
        }
        if (arg1.method1276(class231.field3670, 102)) {
            var2++;
        }
        if (arg1.method1276(class60.field843, -56)) {
            var2++;
        }
        if (arg1.method1276(class139.field2189, -71)) {
            var2++;
        }
        if (arg1.method1276(class158.field2621, 114)) {
            var2++;
        }
        if (arg1.method1276(class156.field2412, 91)) {
            var2++;
        }
        if (arg1.method1276(class81.field1137, -67)) {
            var2++;
        }
        if (arg1.method1276(class274.field4419, 122)) {
            var2++;
        }
        if (arg1.method1276(class7.field105, 57)) {
            var2++;
        }
        if (arg1.method1276(class53.field756, 66)) {
            var2++;
        }
        return var2;
    }
}
