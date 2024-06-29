import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class251 {

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "[I")
    private int[] field4521;

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Lcf;")
    private static class93 field4514 = class147.method1066("purple:", -48);

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "Lcf;")
    public static class93 field4515 = field4514;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "Lcf;")
    public static class93 field4522 = field4514;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "[I")
    public static int[] field4519 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "I")
    public static int field4520 = 0;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "I")
    public static int field4517 = 0;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lcf;")
    public static class93 field4511 = class147.method1066(")0", -48);

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field4512;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field4513;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field4516;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public static int field4518;

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "I")
    public static int field4523;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public static int field4524;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public static int field4525;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "[I")
    public static int[] field4526;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "[Lwc;")
    public static class229[] field4509;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ZI)I")
    public final int method1700(boolean arg0, int arg1) {
        if (!arg0) {
            field4526 = null;
        }
        field4523++;
        int var3 = (this.field4521.length >> 1) - 1;
        int var4 = var3 & arg1;
        while (true) {
            int var5 = this.field4521[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4521[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var4 + 1 & var3;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static final void method1701(byte arg0) {
        field4510++;
        if (arg0 != -98) {
            method1706(87);
        }
        for (class35 var1 = (class35) class11.field152.method1151(124); var1 != null; var1 = (class35) class11.field152.method1159(arg0 ^ 0xFFFFFFB5)) {
            class185 var2 = var1.field545;
            if (class138.field2405 != var2.field3418 || var2.field3417) {
                var1.method1544((byte) -123);
            } else if (var2.field3419 <= class275.field4921) {
                var2.method1348(class203.field3670, (byte) 69);
                if (var2.field3417) {
                    var1.method1544((byte) -113);
                } else {
                    class280.method1901(var2.field3418, var2.field3425, var2.field3402, var2.field3428, 60, var2, 0, -1L, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V")
    public static void method1702(int arg0) {
        field4526 = null;
        field4515 = null;
        field4509 = null;
        field4522 = null;
        if (arg0 != 25288) {
            field4514 = null;
        }
        field4514 = null;
        field4519 = null;
        field4511 = null;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lcf;B)V")
    public static final void method1703(class93 arg0, byte arg1) {
        int var2 = class178.method1293(-1, arg0);
        field4525++;
        if (var2 != -1) {
            class193.method1386(660316969, class234.field4165.field2277[var2], class234.field4165.field2265[var2]);
            if (arg1 != -86) {
                method1702(-44);
            }
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(ILhg;)V")
    public static final void method1704(int arg0, class177 arg1) {
        field4516++;
        if (class95.field1714 || arg0 != 5802) {
            return;
        }
        class75.method515();
        class68.field1241 = class283.method1942((byte) -106, arg1, class280.field5021);
        int var2 = class169.field2968;
        int var3 = var2 * 956 / 503;
        class68.field1241.method563((class150.field2629 - var3) / 2, 0, var3, var2);
        class56.field930 = class118.method874(125, class161.field2844, arg1);
        class56.field930.method1235(class150.field2629 / 2 - (class56.field930.field3541 / 2), 18);
        class95.field1714 = true;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(ZI)V")
    public static final void method1705(boolean arg0, int arg1) {
        if (!arg0) {
            field4512++;
            class212 var2 = class123.method905(-1205364448, 8, arg1);
            var2.method1502(255);
        }
    }

    @OriginalMember(owner = "client!ad", name = "<init>", descriptor = "([I)V")
    public class251(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4521 = new int[var2 + var2];
        for (int var3 = 0; var3 < (var2 + var2); var3++) {
            this.field4521[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = var2 - 1 & arg0[var4]; this.field4521[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 - 1) {
            }
            this.field4521[var5 + var5] = arg0[var4];
            this.field4521[var5 + var5 + 1] = var4++;
        }
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(I)V")
    public static final void method1706(int arg0) {
        class31.field491.method300(0);
        if (arg0 != 2) {
            field4520 = -77;
        }
        field4513++;
    }
}
