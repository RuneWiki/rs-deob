import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class151 extends class631 {

    @OriginalMember(owner = "client!su", name = "o", descriptor = "I")
    public int field2072;

    @OriginalMember(owner = "client!su", name = "m", descriptor = "I")
    public static int field2070 = 0;

    @OriginalMember(owner = "client!su", name = "n", descriptor = "I")
    public static int field2071 = 100;

    @OriginalMember(owner = "client!su", name = "p", descriptor = "[F")
    public static float[] field2073 = new float[4];

    @OriginalMember(owner = "client!su", name = "k", descriptor = "Z")
    public static boolean field2068 = false;

    @OriginalMember(owner = "client!su", name = "i", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!su", name = "j", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!su", name = "l", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!su", name = "q", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BII)Z")
    public static final boolean method887(byte arg0, int arg1, int arg2) {
        if (arg0 != 62) {
            method889((char) 65514, (byte) -99, null);
        }
        field2069++;
        boolean var3 = (arg2 & 0x37) == 0 ? class472.method2727(arg2, arg1, arg0 - 16551) : class524.method2971(-59, arg1, arg2);
        return var3 | class547.method3067(arg1, -25879, arg2) | (arg1 & 0x10000) != 0;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(BI)I")
    public static final int method888(byte arg0, int arg1) {
        field2066++;
        if (arg1 == 6407 || arg1 == 34843 || arg1 == 34837) {
            return 6407;
        } else if (arg1 == 6408 || arg1 == 34842 || arg1 == 34836) {
            return 6408;
        } else if (arg1 == 6406 || arg1 == 34844) {
            return 6406;
        } else if (arg1 == 6409 || arg1 == 34846) {
            return 6409;
        } else if (arg1 == 6410 || arg1 == 34847) {
            return 6410;
        } else if (arg1 == 6402) {
            return 6402;
        } else {
            if (arg0 > -77) {
                method888((byte) 62, -47);
            }
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(CBLjava/lang/String;)I")
    public static final int method889(char arg0, byte arg1, String arg2) {
        if (arg1 != 93) {
            method890(-24);
        }
        field2074++;
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0 == arg2.charAt(var5)) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!su", name = "<init>", descriptor = "(I)V")
    public class151(int arg0) {
        this.field2072 = arg0;
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V")
    public static void method890(int arg0) {
        field2073 = null;
        if (arg0 != 0) {
            method887((byte) -93, -11, -98);
        }
    }
}
