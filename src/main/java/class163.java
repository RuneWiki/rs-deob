import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class163 {

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "[I")
    private int[] field2749;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "Lcf;")
    public static class561 field2748 = new class561();

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field2751 = -1;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "[[B")
    public static byte[][] field2754 = new byte[250][];

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "F")
    public static float field2753;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field2747;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public static int field2752;

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)V")
    public static final void method1323(boolean arg0) {
        field2752++;
        class265.field4319 = 0;
        int var1 = class558.field8066.method75(-106);
        boolean var2 = class558.field8066.method77((byte) -55) == 1;
        int var3 = class558.field8066.method68(12513);
        int var4 = class558.field8066.method68(12513);
        class144.method1225(1);
        class426.method2699((byte) -34, var1);
        int var5 = (class344.field5550 - class558.field8066.field57) / 16;
        class116.field1809 = new int[var5][4];
        for (int var6 = 0; var6 < var5; var6++) {
            for (int var10 = 0; var10 < 4; var10++) {
                class116.field1809[var6][var10] = class558.field8066.method72(-96);
            }
        }
        class160.field2735 = new byte[var5][];
        class476.field7058 = new int[var5];
        if (arg0) {
            method1323(true);
        }
        class81.field1007 = new int[var5];
        class622.field8789 = null;
        class665.field9423 = new byte[var5][];
        class366.field5747 = null;
        class663.field9225 = new int[var5];
        class307.field4835 = new byte[var5][];
        class137.field2330 = new int[var5];
        class500.field7342 = new byte[var5][];
        class310.field4871 = new int[var5];
        int var7 = 0;
        for (int var8 = (var4 - (class275.field4426 >> 4)) / 8; var8 <= (var4 + (class275.field4426 >> 4)) / 8; var8++) {
            for (int var9 = (var3 - (class417.field6374 >> 4)) / 8; var9 <= ((class417.field6374 >> 4) + var3) / 8; var9++) {
                class476.field7058[var7] = (var8 << 8) + var9;
                class663.field9225[var7] = class247.field3943.method928(false, "m" + var8 + "_" + var9);
                class81.field1007[var7] = class247.field3943.method928(false, "l" + var8 + "_" + var9);
                class137.field2330[var7] = class247.field3943.method928(arg0, "um" + var8 + "_" + var9);
                class310.field4871[var7] = class247.field3943.method928(false, "ul" + var8 + "_" + var9);
                var7++;
            }
        }
        class234.method1696(var2, 9085, var3, 11, var4);
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "([IIILpba;)V")
    public static final void method1324(int[] arg0, int arg1, int arg2, class304 arg3) {
        field2747++;
        if (arg3.field4174 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg3.field4174.length; var5++) {
                if (arg3.field4174[var5] != arg0[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg3.field4215 != -1) {
                class428 var6 = class636.field8942.method2872((byte) 11, arg3.field4215);
                int var7 = var6.field6513;
                if (var7 == 1) {
                    arg3.field4209 = 0;
                    arg3.field4188 = 0;
                    arg3.field4150 = arg1;
                    arg3.field4194 = 1;
                    arg3.field4213 = 0;
                    if (!arg3.field4180) {
                        class216.method1622(arg3.field4209, arg3, (byte) -56, var6);
                    }
                }
                if (var7 == 2) {
                    arg3.field4213 = 0;
                }
            }
        }
        boolean var8 = true;
        for (int var9 = arg2; var9 < arg0.length; var9++) {
            if (arg0[var9] != -1) {
                var8 = false;
            }
            if (arg3.field4174 == null || arg3.field4174[var9] == -1 || class636.field8942.method2872((byte) 11, arg0[var9]).field6527 >= class636.field8942.method2872((byte) 11, arg3.field4174[var9]).field6527) {
                arg3.field4150 = arg1;
                arg3.field4174 = arg0;
                break;
            }
        }
        if (var8) {
            arg3.field4174 = arg0;
            arg3.field4150 = arg1;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "([I)V")
    public class163(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field2749 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field2749[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field2749[var5 + var5 + 1] != -1; var5 = var2 - 1 & var5 + 1) {
            }
            this.field2749[var5 + var5] = arg0[var4];
            this.field2749[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)I")
    public final int method1325(int arg0, int arg1) {
        int var3 = 127 / ((arg1 - 82) / 37);
        field2750++;
        int var4 = (this.field2749.length >> 1) - 1;
        int var5 = arg0 & var4;
        while (true) {
            int var6 = this.field2749[var5 + var5 + 1];
            if (var6 == -1) {
                return -1;
            }
            if (this.field2749[var5 + var5] == arg0) {
                return var6;
            }
            var5 = var4 & var5 + 1;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)V")
    public static void method1326(int arg0) {
        field2754 = null;
        field2748 = null;
        int var1 = -102 / ((arg0 + 51) / 49);
    }
}
