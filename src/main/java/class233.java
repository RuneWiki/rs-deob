import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class233 extends class35 {

    @OriginalMember(owner = "client!ma", name = "m", descriptor = "Lsh;")
    public static class472 field3408 = new class472(97, 7);

    @OriginalMember(owner = "client!ma", name = "v", descriptor = "Lfa;")
    public static class371 field3417 = new class371(16);

    @OriginalMember(owner = "client!ma", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field3419 = new String[100];

    @OriginalMember(owner = "client!ma", name = "w", descriptor = "F")
    public float field3418;

    @OriginalMember(owner = "client!ma", name = "l", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!ma", name = "n", descriptor = "I")
    public int field3409;

    @OriginalMember(owner = "client!ma", name = "o", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!ma", name = "p", descriptor = "I")
    public static int field3411;

    @OriginalMember(owner = "client!ma", name = "q", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!ma", name = "r", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!ma", name = "s", descriptor = "I")
    public int field3414;

    @OriginalMember(owner = "client!ma", name = "t", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!ma", name = "u", descriptor = "I")
    public int field3416;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(B)V")
    public static void method1524(byte arg0) {
        field3408 = null;
        int var1 = 74 % ((50 - arg0) / 60);
        field3419 = null;
        field3417 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)I")
    public static final int method1525(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 != 1391593162) {
            method1525(86, 123, -88, -57);
        }
        field3415++;
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        return (arg2 >> 1) + (((arg3 >> 2 & 0x3F) << 10) + (arg1 >> 5 << 7));
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ILjava/lang/String;)I")
    public static final int method1526(int arg0, String arg1) {
        field3412++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class157.field2190; var2++) {
            if (arg1.equalsIgnoreCase(class42.field570[var2])) {
                return var2;
            }
        }
        if (arg0 != 217) {
            method1525(-63, -109, -50, -75);
        }
        return -1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(BLsk;)V")
    public static final void method1527(byte arg0, class309 arg1) {
        field3410++;
        boolean var2 = false;
        if (class452.field6418 == arg1.field4628 || arg1.field4612 == -1 || arg1.field4601 != 0) {
            var2 = true;
        } else {
            class356 var3 = class170.field2423.method1586(arg1.field4612, (byte) 36);
            if (var3.field5396 || arg1.field4636 + 1 > var3.field5421[arg1.field4600]) {
                var2 = true;
            }
        }
        if (arg0 > -48) {
            return;
        }
        if (var2) {
            int var4 = arg1.field4628 - arg1.field4616;
            int var5 = class452.field6418 - arg1.field4616;
            int var6 = arg1.field4627 * 128 + arg1.method1705((byte) 65) * 64;
            int var7 = arg1.field4607 * 128 + arg1.method1705((byte) 65) * 64;
            int var8 = arg1.field4652 * 128 + (arg1.method1705((byte) 65) * 64);
            int var9 = arg1.field4631 * 128 + (arg1.method1705((byte) 65) * 64);
            arg1.field4538 = ((var4 - var5) * var7 + var5 * var9) / var4;
            arg1.field4543 = ((var4 - var5) * var6 + var5 * var8) / var4;
        }
        arg1.field4677 = 0;
        if (arg1.field4613 == 0) {
            arg1.method1926(8192, 95);
        }
        if (arg1.field4613 == 1) {
            arg1.method1926(12288, 115);
        }
        if (arg1.field4613 == 2) {
            arg1.method1926(0, 118);
        }
        if (arg1.field4613 == 3) {
            arg1.method1926(4096, 117);
        }
    }
}
