import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class108 extends class75 {

    @OriginalMember(owner = "client!pd", name = "H", descriptor = "I")
    public int field2302 = 0;

    @OriginalMember(owner = "client!pd", name = "G", descriptor = "[B")
    public static byte[] field2301 = new byte[520];

    @OriginalMember(owner = "client!pd", name = "L", descriptor = "I")
    public static int field2306 = 1;

    @OriginalMember(owner = "client!pd", name = "F", descriptor = "[I")
    public static int[] field2300 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!pd", name = "I", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!pd", name = "J", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!pd", name = "K", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!pd", name = "M", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!pd", name = "N", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ltf;II)V")
    private final void method772(class138 arg0, int arg1, int arg2) {
        if (arg1 == 2) {
            this.field2302 = arg0.method1098(true);
        }
        field2303++;
        if (arg2 != 30411) {
            method773(-127);
        }
    }

    @OriginalMember(owner = "client!pd", name = "f", descriptor = "(I)V")
    public static void method773(int arg0) {
        if (arg0 != 5713) {
            field2301 = null;
        }
        field2300 = null;
        field2301 = null;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Ltf;B)V")
    public final void method774(class138 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1055(119);
            if (var3 == 0) {
                if (arg1 > -3) {
                    this.method772(null, 7, 8);
                }
                field2307++;
                return;
            }
            this.method772(arg0, var3, 30411);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(IB)Lv;")
    public static final class146 method775(int arg0, byte arg1) {
        field2308++;
        class146 var2 = (class146) class146.field3347.method140(true, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        class146 var3 = class131.method1014(false, 0, class7.field110, arg0, class78.field1644);
        if (arg1 >= -110) {
            method776((byte) 97, true);
        }
        if (var3 != null) {
            class146.field3347.method141(var3, (long) arg0, (byte) -30);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(BZ)V")
    public static final void method776(byte arg0, boolean arg1) {
        if (class82.field1778.field1341 >> 7 == class130.field2973 && class82.field1778.field1298 >> 7 == class152.field3470) {
            class130.field2973 = 0;
        }
        field2305++;
        int var2 = class150.field3442;
        if (arg1) {
            var2 = 1;
        }
        int var3 = 0;
        if (arg0 < 36) {
            method777(null, -127);
        }
        while (var3 < var2) {
            int var4;
            class13 var5;
            if (arg1) {
                var4 = 33538048;
                var5 = class82.field1778;
            } else {
                var4 = class143.field3285[var3] << 14;
                var5 = class94.field2032[class143.field3285[var3]];
            }
            if (var5 != null && var5.method95(-21094)) {
                int var6 = var5.field1341 >> 7;
                var5.field260 = false;
                if ((class10.field152 && class150.field3442 > 50 || class150.field3442 > 200) && !arg1 && var5.field1289 == var5.field1278) {
                    var5.field260 = true;
                }
                int var7 = var5.field1298 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var5.field269 == null || class143.field3305 < var5.field272 || var5.field275 <= class143.field3305) {
                        label93: {
                            if ((var5.field1341 & 0x7F) == 64 && (var5.field1298 & 0x7F) == 64) {
                                if (class28.field754[var6][var7] == class150.field3444) {
                                    break label93;
                                }
                                class28.field754[var6][var7] = class150.field3444;
                            }
                            var5.field278 = class65.method449(var5.field1298, var5.field1341, class95.field2040, true);
                            class33.field857.method587(class95.field2040, var5.field1341, var5.field1298, var5.field278, 60, var5, var5.field1310, var4, var5.field1309);
                        }
                    } else {
                        var5.field260 = false;
                        var5.field278 = class65.method449(var5.field1298, var5.field1341, class95.field2040, true);
                        class33.field857.method543(class95.field2040, var5.field1341, var5.field1298, var5.field278, 60, var5, var5.field1310, var4, var5.field261, var5.field264, var5.field281, var5.field271);
                    }
                }
            }
            var3++;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(Lsa;I)Lsa;")
    public static final class126 method777(class126 arg0, int arg1) {
        field2304++;
        class126 var2 = class10.method49(arg0, (byte) 110);
        if (var2 == null) {
            var2 = arg0.field2790;
        }
        return arg1 == 151 ? var2 : null;
    }
}
