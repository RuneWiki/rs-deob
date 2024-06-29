import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class156 extends InputStream {

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "[B")
    public static byte[] field2250 = new byte[520];

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "Z")
    public static boolean field2254 = false;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "Z")
    public static boolean field2253 = false;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static int field2256 = -2;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2257 = "Loading textures - ";

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field2251;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(ILqi;)V")
    public static final void method1038(int arg0, class216 arg1) {
        field2252++;
        int var2 = arg1.method1378((byte) -110);
        class173.field2481 = new class16[var2];
        for (int var3 = arg0; var3 < var2; var3++) {
            class173.field2481[var3] = new class16();
            class173.field2481[var3].field191 = arg1.method1378((byte) -112);
            class173.field2481[var3].field199 = arg1.method1372(false);
        }
        class33.field387 = arg1.method1378((byte) -106);
        class167.field2402 = arg1.method1378((byte) -114);
        class5.field71 = arg1.method1378((byte) -124);
        class280.field4257 = new class176[class167.field2402 + 1 - class33.field387];
        for (int var4 = 0; var4 < class5.field71; var4++) {
            int var5 = arg1.method1378((byte) -128);
            class176 var6 = class280.field4257[var5] = new class176();
            var6.field273 = arg1.method1407(arg0 + 108);
            var6.field274 = arg1.method1358(93);
            var6.field2503 = class33.field387 + var5;
            var6.field2494 = arg1.method1372(false);
            var6.field2495 = arg1.method1372(false);
        }
        class144.field2068 = arg1.method1358(69);
        class94.field1265 = true;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IB)I")
    public static final int method1039(int arg0, byte arg1) {
        field2249++;
        int var2 = arg0 & 0x3F;
        int var3 = arg0 >> 6 & 0x3;
        int var4 = -14 % ((-arg1 - 70) / 42);
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(I)V")
    public static void method1040(int arg0) {
        if (arg0 != -22) {
            field2256 = -3;
        }
        field2250 = null;
        field2257 = null;
    }

    @OriginalMember(owner = "client!sd", name = "read", descriptor = "()I")
    public final int read() {
        field2255++;
        class247.method1595(30000L, (byte) -83);
        return -1;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(Llh;ILlh;)V")
    public static final void method1041(class55 arg0, int arg1, class55 arg2) {
        if (arg2.field642 != null) {
            arg2.method336(22047);
        }
        field2251++;
        if (arg1 != 21324) {
            field2257 = null;
        }
        arg2.field647 = arg0.field647;
        arg2.field642 = arg0;
        arg2.field642.field647 = arg2;
        arg2.field647.field642 = arg2;
    }
}
