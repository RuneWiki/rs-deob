import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tw")
public class class216 {

    @OriginalMember(owner = "client!tw", name = "g", descriptor = "Lml;")
    public static class408 field2545 = new class408();

    @OriginalMember(owner = "client!tw", name = "k", descriptor = "Lpe;")
    public static class636 field2549 = new class636(2);

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "B")
    public byte field2539;

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!tw", name = "c", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!tw", name = "d", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!tw", name = "e", descriptor = "I")
    public int field2543;

    @OriginalMember(owner = "client!tw", name = "h", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!tw", name = "i", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!tw", name = "j", descriptor = "Lpga;")
    public static class561 field2548;

    @OriginalMember(owner = "client!tw", name = "f", descriptor = "Ljava/lang/String;")
    public String field2544;

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(I)V")
    public static void method1346(int arg0) {
        field2548 = null;
        field2549 = null;
        if (arg0 != 0) {
            method1350(-126, true, null);
        }
        field2545 = null;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1347(int arg0, int arg1, int arg2, int arg3) {
        field2547++;
        if (!class775.field10694 || !class722.field10132) {
            return false;
        } else if (class107.field1353 < 100) {
            return false;
        } else {
            int var4 = class552.field7680[arg0][arg3][arg2];
            if (-class157.field1956 == var4) {
                return false;
            } else if (class157.field1956 == var4) {
                return true;
            } else if (class704.field9910 == class621.field8523) {
                return false;
            } else {
                int var5 = 33 % ((-arg1 - 9) / 48);
                int var6 = arg3 << class714.field10017;
                int var7 = arg2 << class714.field10017;
                if (class774.method4301(class621.field8523[arg0].method1728(arg2, (byte) -36, arg3), var6 + 1, var7 + 1, 127, class327.field4047 + var7 - 1, var7 + -1 + class327.field4047, class621.field8523[arg0].method1728(arg2 + 1, (byte) -52, arg3), var6 + 1, var6 - -class327.field4047 + -1, class621.field8523[arg0].method1728(arg2 + 1, (byte) -57, arg3 + 1)) && class774.method4301(class621.field8523[arg0].method1728(arg2, (byte) -31, arg3), var6 + 1, var7 + 1, 127, var7 + 1, class327.field4047 + var7 + -1, class621.field8523[arg0].method1728(arg2 + 1, (byte) -30, arg3 + 1), class327.field4047 + var6 - 1, var6 - 1 + class327.field4047, class621.field8523[arg0].method1728(arg2, (byte) -113, arg3 + 1))) {
                    class727.field10185++;
                    class552.field7680[arg0][arg3][arg2] = class157.field1956;
                    return true;
                } else {
                    class552.field7680[arg0][arg3][arg2] = -class157.field1956;
                    return false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!tw", name = "b", descriptor = "(I)V")
    public static final void method1348(int arg0) {
        class645.field8791 = 0;
        class105.field1339 = 0;
        field2541++;
        if (arg0 != 17706) {
            method1350(82, true, null);
        }
        for (int var1 = 0; var1 < class223.field2612; var1++) {
            int var2 = class331.field4092 * var1;
            for (int var3 = 0; var3 < class331.field4092; var3++) {
                int var4 = var2 + var3;
                class340.field4250[var4].method2949(class603.field8149 * var3, class372.field4683 * var1, class603.field8149, class372.field4683, 0, 0, true, true);
            }
        }
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(ZII)V")
    public static final void method1349(boolean arg0, int arg1, int arg2) {
        field2546++;
        if (arg0) {
            return;
        }
        if (class642.field8759 != arg2) {
            class648.field8837 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class648.field8837[var3] = (var3 << 12) / arg2;
            }
            class642.field8759 = arg2;
            class790.field10871 = arg2 * 32;
            class446.field5990 = arg2 - 1;
        }
        if (class784.field10832 == arg1) {
            return;
        }
        if (class642.field8759 == arg1) {
            class349.field4354 = class648.field8837;
        } else {
            class349.field4354 = new int[arg1];
            for (int var4 = 0; var4 < arg1; var4++) {
                class349.field4354[var4] = (var4 << 12) / arg1;
            }
        }
        class75.field1037 = arg1 - 1;
        class784.field10832 = arg1;
    }

    @OriginalMember(owner = "client!tw", name = "a", descriptor = "(IZLjava/lang/String;)V")
    public static final void method1350(int arg0, boolean arg1, String arg2) {
        String var3 = arg2.toLowerCase();
        field2540++;
        short[] var4 = new short[16];
        if (arg0 >= -92) {
            method1349(true, -105, 0);
        }
        int var5 = 0;
        int var6 = arg1 ? 32768 : 0;
        int var7 = var6 + (arg1 ? class578.field7881.field1596 : class578.field7881.field1598);
        for (int var8 = var6; var8 < var7; var8++) {
            class671 var11 = class578.field7881.method972(var8, 1);
            if (var11.field9211 && var11.method3763(8211).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class689.field9390 = -1;
                    class734.field10262 = null;
                    return;
                }
                if (var5 >= var4.length) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class689.field9390 = var5;
        class267.field3159 = 0;
        class734.field10262 = var4;
        String[] var9 = new String[class689.field9390];
        for (int var10 = 0; var10 < class689.field9390; var10++) {
            var9[var10] = class578.field7881.method972(var4[var10], 1).method3763(8211);
        }
        class774.method4299(class734.field10262, (byte) 124, var9);
    }
}
