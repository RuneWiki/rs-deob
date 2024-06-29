import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class207 {

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Log;")
    public static class456 field2974 = new class456("RC", 1);

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lgf;")
    public static class180 field2980 = new class180("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!ne", name = "o", descriptor = "[I")
    public static int[] field2984 = new int[1000];

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Z")
    public static boolean field2981 = false;

    @OriginalMember(owner = "client!ne", name = "q", descriptor = "I")
    public static int field2986 = 0;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2972;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "I")
    public int field2973;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public int field2975;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "I")
    public static int field2983;

    @OriginalMember(owner = "client!ne", name = "p", descriptor = "Lm;")
    public static class126 field2985;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "[Lch;")
    public static class322[] field2982;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)Lpo;", line = 7)
    public static final class389 method1385(int arg0) {
        field2972++;
        try {
            return arg0 == 3 ? (class389) Class.forName("sb").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V", line = 29)
    public static final void method1386(byte arg0) {
        field2976++;
        if (arg0 < 118) {
            method1387(121, 34, -66);
        }
        class295.field4215 = 0;
        class244.field3519 = 0;
        class342.field5221 = 0;
        class22.field376 = 0;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)I", line = 40)
    public static final int method1387(int arg0, int arg1, int arg2) {
        field2978++;
        if (arg2 == 4 || arg2 == 5) {
            return class246.field3566[arg1 & 0x3];
        } else if (arg0 == 17420) {
            return 256;
        } else {
            return -44;
        }
    }

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "(I)V", line = 56)
    public static void method1388(int arg0) {
        field2984 = null;
        field2974 = null;
        if (arg0 != 1) {
            field2980 = null;
        }
        field2985 = null;
        field2980 = null;
        field2982 = null;
    }
}
