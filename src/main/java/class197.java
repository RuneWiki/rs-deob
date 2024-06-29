import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class197 extends class187 {

    @OriginalMember(owner = "client!nl", name = "w", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!nl", name = "u", descriptor = "I")
    public int field2960;

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "I")
    public static int field2953 = 0;

    @OriginalMember(owner = "client!nl", name = "s", descriptor = "[I")
    public static int[] field2958 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!nl", name = "A", descriptor = "[I")
    public static int[] field2966 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!nl", name = "p", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!nl", name = "q", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!nl", name = "r", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!nl", name = "t", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!nl", name = "v", descriptor = "I")
    public static int field2961;

    @OriginalMember(owner = "client!nl", name = "x", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!nl", name = "y", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!nl", name = "z", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!nl", name = "B", descriptor = "I")
    public static int field2967;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V", line = 11)
    public static final void method1330(int arg0) {
        int var1 = 37 / ((59 - arg0) / 45);
        class220.field3493.method1296(255);
        field2964++;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(ZI)V", line = 23)
    public static final void method1331(boolean arg0, int arg1) {
        field2955++;
        byte[][] var2;
        if (class333.field5166 && arg0) {
            var2 = class305.field4775;
        } else {
            var2 = class151.field2380;
        }
        int var3 = class204.field3079.length;
        for (int var4 = arg1; var4 < var3; var4++) {
            byte[] var5 = var2[var4];
            if (var5 != null) {
                int var6 = (class121.field1865[var4] & 0xFF) * 64 - class294.field4535;
                int var7 = (class121.field1865[var4] >> 8) * 64 - class30.field374;
                class233.method1592(true);
                class323.method2185(arg0, class33.field425, var6, var7, var5, -645014238);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[B)Lbk;", line = 64)
    public static final class180 method1332(int arg0, byte[] arg1) {
        field2956++;
        if (arg1 == null) {
            return null;
        }
        class180 var2;
        if (class333.field5166) {
            var2 = new class244(arg1, class276.field4257, class123.field1919, class68.field1011, class107.field1652, class46.field644);
        } else {
            var2 = new class232(arg1, class276.field4257, class123.field1919, class68.field1011, class107.field1652, class46.field644);
        }
        int var3 = -17 % ((arg0 - 30) / 60);
        class345.method2394((byte) -92);
        return var2;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(B)V", line = 86)
    public static final void method1333(byte arg0) {
        field2967++;
        if (class228.field3654 != null) {
            class228.field3654.method1202(46);
        }
        if (class196.field2944 != null) {
            class196.field2944.method1202(123);
        }
        if (arg0 >= -55) {
            method1330(-88);
        }
        class210.method1406(22050, class269.field4148, 2, (byte) 113);
        class228.field3654 = class215.method1439(class89.field1359, 0, class302.field4665, 22050, 0);
        class228.field3654.method1200(105, class211.field3342);
        class196.field2944 = class215.method1439(class89.field1359, 0, class302.field4665, 2048, 1);
        class196.field2944.method1200(96, class74.field1102);
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V", line = 111)
    public static void method1334(int arg0) {
        field2966 = null;
        if (arg0 == 381758408) {
            field2958 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "(II)V", line = 121)
    public class197(int arg0, int arg1) {
        this.field2962 = arg0;
        this.field2960 = arg1;
    }

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V", line = 135)
    public static final void method1335(int arg0) {
        class76.field1128 = null;
        class282.method1855(class334.field5203, 255, class174.field2644, -1, 0, 0, 0, 0, class253.field3936);
        field2965++;
        if (class76.field1128 != null) {
            class221.method1475(class174.field2644, class265.field4092, 0, -1412584499, (byte) -63, class76.field1128, class334.field5203, class17.field206, class117.field1809.field3284, 0);
            class76.field1128 = null;
        }
        if (arg0 != 64) {
            field2963 = -43;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(IIIIII)V", line = 158)
    public static final void method1336(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2957++;
        int var9 = arg3 + 1;
        class253.method1704(arg2, arg1, arg0, class175.field2675[arg3], 7);
        int var10 = arg4 - 1;
        class253.method1704(arg2, arg1, arg0, class175.field2675[arg4], 7);
        int var6 = 72 / ((arg5 - 64) / 62);
        for (int var7 = var9; var7 <= var10; var7++) {
            int[] var8 = class175.field2675[var7];
            var8[arg2] = var8[arg1] = arg0;
        }
    }
}
