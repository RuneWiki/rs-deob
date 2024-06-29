import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class207 extends class234 {

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    private int field3707 = -32768;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "[I")
    public static int[] field3708 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 198, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 214, 215, 216, 217, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 67, 68, 69, 70, 71, 72, 75, 79, 80, 81, 82, 87, 88, 89, 90, 77, 96, 98, 99, 100, 101, 102, 250, 251, 109, 110, 111, 112, 117, 252, 167, 126, 127, 128, 129, 130, 131, 132, 135, 139, 140, 141, 142, 147, 148, 149, 150, 137, 156, 158, 159, 160, 161, 162, 253, 254, 170, 171, 172, 173, 178, 255, 179 };

    @OriginalMember(owner = "client!tg", name = "y", descriptor = "[I")
    public static int[] field3714 = new int[32];

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3710 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!tg", name = "C", descriptor = "Ldj;")
    public static class44 field3718 = class89.method650(255, "Passwort: ");

    @OriginalMember(owner = "client!tg", name = "z", descriptor = "Ldj;")
    private static class44 field3715 = class89.method650(255, "glow2:");

    @OriginalMember(owner = "client!tg", name = "A", descriptor = "Ldj;")
    public static class44 field3716 = field3715;

    @OriginalMember(owner = "client!tg", name = "D", descriptor = "Ldj;")
    public static class44 field3719 = field3715;

    @OriginalMember(owner = "client!tg", name = "F", descriptor = "Ldj;")
    public static class44 field3721 = null;

    @OriginalMember(owner = "client!tg", name = "B", descriptor = "[I")
    public static int[] field3717 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!tg", name = "E", descriptor = "I")
    public static int field3720 = 0;

    @OriginalMember(owner = "client!tg", name = "l", descriptor = "I")
    public static int field3701;

    @OriginalMember(owner = "client!tg", name = "m", descriptor = "I")
    public static int field3702;

    @OriginalMember(owner = "client!tg", name = "n", descriptor = "I")
    public static int field3703;

    @OriginalMember(owner = "client!tg", name = "o", descriptor = "I")
    public int field3704;

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field3705;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "I")
    public static int field3706;

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public static int field3709;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "I")
    public static int field3711;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "I")
    public int field3712;

    @OriginalMember(owner = "client!tg", name = "x", descriptor = "I")
    public static int field3713;

    @OriginalMember(owner = "client!tg", name = "G", descriptor = "Lod;")
    public static class155 field3722;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Z)V")
    public static final void method1349(boolean arg0) {
        field3702++;
        class186.field3211.method1179((byte) -111);
        if (!arg0) {
            method1349(true);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ldj;I)V")
    public static final void method1350(class44 arg0, int arg1) {
        field3709++;
        if (class30.field543 >= 2) {
            if (arg0.method330(class131.field2341, true)) {
                for (int var2 = 0; var2 < 10; var2++) {
                    System.gc();
                }
                Runtime var3 = Runtime.getRuntime();
                int var4 = (int) ((var3.totalMemory() - var3.freeMemory()) / 1024L);
                class226.method1484(class70.method555(new class44[] { class60.field1116, class199.method1287(var4, arg1 ^ 0x5B3C), class45.field862 }, -3), arg1 ^ 0xFFFFA4C3, 0, null);
            }
            if (arg0.method330(class121.field2150, true)) {
                class169.method1079(arg1 ^ 0x6C55);
            }
            if (arg0.method330(class128.field2280, true)) {
                class47.field878 = true;
            }
            if (arg0.method330(class78.field1501, true)) {
                class47.field878 = false;
            }
            arg0.method330(class87.field1668, true);
            arg0.method330(class35.field627, true);
            if (arg0.method330(class200.field3532, true)) {
                for (int var5 = 0; var5 < 4; var5++) {
                    for (int var6 = 1; var6 < 103; var6++) {
                        for (int var7 = 1; var7 < 103; var7++) {
                            class73.field1390[var5].field3908[var6][var7] = 0;
                        }
                    }
                }
            }
            if (arg0.method323(true, class152.field2641) && class239.field4422 != 0) {
                class174.method1103(true, arg0.method332(6, (byte) 127).method331((byte) -83));
            }
            if (arg0.method330(class165.field2829, true) && class239.field4422 == 2) {
                throw new RuntimeException();
            }
            if (arg0.method323(true, class57.field1064)) {
                class103.field1888 = arg0.method332(12, (byte) 111).method339(-11196).method331((byte) -83);
                class226.method1484(class70.method555(new class44[] { class83.field1628, class199.method1287(class103.field1888, arg1 ^ 0x5B3C) }, -3), 0, 0, null);
            }
            if (arg0.method330(class109.field1999, true)) {
                class153.field2669 = true;
            }
        }
        class200.field3542.method1170(95, (byte) -126);
        class200.field3542.method488(arg1 + 23479, arg0.method340(3) + -1);
        if (arg1 == -23357) {
            class200.field3542.method492(7527, arg0.method332(2, (byte) 61));
            class84.field1631++;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method42(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field3713++;
        class127 var11 = class192.method1227(-31700, this.field3712).method1383(this.field3704, 0, (byte) 40, null);
        if (var11 != null) {
            var11.method42(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field3707 = var11.method67();
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(BI)I")
    public static final int method1351(byte arg0, int arg1) {
        field3711++;
        if (arg0 != -113) {
            field3710 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "()I")
    public final int method67() {
        field3701++;
        return this.field3707;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ILve;Lve;II)Lgb;")
    public static final class69 method1352(int arg0, class225 arg1, class225 arg2, int arg3, int arg4) {
        field3703++;
        if (class171.method1086((byte) 125, arg4, arg3, arg1)) {
            if (arg0 != 21) {
                field3718 = null;
            }
            return class5.method37(arg2.method1466(arg4, arg3, (byte) -125), -18328);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(I)V")
    public static void method1353(int arg0) {
        field3715 = null;
        field3718 = null;
        field3710 = null;
        field3721 = null;
        field3717 = null;
        field3719 = null;
        field3708 = null;
        field3716 = null;
        field3714 = null;
        if (arg0 != -27680) {
            field3717 = null;
        }
        field3722 = null;
    }
}
