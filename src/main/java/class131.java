import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class131 extends class30 {

    @OriginalMember(owner = "client!nb", name = "T", descriptor = "Lrd;")
    public static class173 field2476 = class133.method843("<col=c0ff00>", -77);

    @OriginalMember(owner = "client!nb", name = "P", descriptor = "I")
    public static int field2472 = 0;

    @OriginalMember(owner = "client!nb", name = "W", descriptor = "[I")
    public static int[] field2478 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "Lrd;")
    public static class173 field2469 = null;

    @OriginalMember(owner = "client!nb", name = "X", descriptor = "Lof;")
    public static class145 field2479 = new class145();

    @OriginalMember(owner = "client!nb", name = "Y", descriptor = "Lrd;")
    private static class173 field2480 = class133.method843("Members object", 25);

    @OriginalMember(owner = "client!nb", name = "Z", descriptor = "[Lrd;")
    public static class173[] field2481 = new class173[100];

    @OriginalMember(owner = "client!nb", name = "ab", descriptor = "Lrd;")
    public static class173 field2482 = field2480;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    public int field2468;

    @OriginalMember(owner = "client!nb", name = "N", descriptor = "I")
    public static int field2470;

    @OriginalMember(owner = "client!nb", name = "O", descriptor = "I")
    public int field2471;

    @OriginalMember(owner = "client!nb", name = "Q", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!nb", name = "R", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!nb", name = "S", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!nb", name = "V", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(ILmb;I)V")
    private final void method837(int arg0, class121 arg1, int arg2) {
        field2470++;
        if (arg2 == 1) {
            this.field2471 = arg1.method755((byte) -78);
            this.field2468 = arg1.method751((byte) 117);
            this.field2477 = arg1.method751((byte) -54);
        }
        int var4 = -90 % ((arg0 + 37) / 39);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lmb;I)V")
    public final void method838(class121 arg0, int arg1) {
        field2473++;
        while (true) {
            int var3 = arg0.method751((byte) 102);
            if (var3 == 0) {
                if (arg1 == -1867) {
                    return;
                } else {
                    method840((byte) -32);
                    return;
                }
            }
            this.method837(-89, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lob;III)V")
    public static final void method839(class141 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class71.field1384) {
            class105 var4 = class208.field4055[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field1954 != null && var4.field1954.field475 instanceof class141) {
                class141 var5 = (class141) var4.field1954.field475;
                class141.method877(arg0, var5, 128, 0, 0, true);
            }
        }
        if (arg3 < class71.field1384) {
            class105 var6 = class208.field4055[arg1][arg2][arg3 + 1];
            if (var6 != null && var6.field1954 != null && var6.field1954.field475 instanceof class141) {
                class141 var7 = (class141) var6.field1954.field475;
                class141.method877(arg0, var7, 0, 0, 128, true);
            }
        }
        if (arg2 < class71.field1384 && arg3 < class55.field1093) {
            class105 var8 = class208.field4055[arg1][arg2 + 1][arg3 + 1];
            if (var8 != null && var8.field1954 != null && var8.field1954.field475 instanceof class141) {
                class141 var9 = (class141) var8.field1954.field475;
                class141.method877(arg0, var9, 128, 0, 128, true);
            }
        }
        if (arg2 >= class71.field1384 || arg3 <= 0) {
            return;
        }
        class105 var10 = class208.field4055[arg1][arg2 + 1][arg3 - 1];
        if (var10 != null && var10.field1954 != null && var10.field1954.field475 instanceof class141) {
            class141 var11 = (class141) var10.field1954.field475;
            class141.method877(arg0, var11, 128, 0, -128, true);
        }
    }

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)V")
    public static void method840(byte arg0) {
        field2478 = null;
        field2480 = null;
        field2469 = null;
        field2479 = null;
        field2482 = null;
        field2481 = null;
        int var1 = -26 % ((52 - arg0) / 47);
        field2476 = null;
    }
}
