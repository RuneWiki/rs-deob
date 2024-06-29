import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kt")
public class class160 {

    @OriginalMember(owner = "client!kt", name = "d", descriptor = "I")
    public int field2196 = 0;

    @OriginalMember(owner = "client!kt", name = "j", descriptor = "I")
    public int field2202 = 0;

    @OriginalMember(owner = "client!kt", name = "f", descriptor = "Z")
    private boolean field2198 = false;

    @OriginalMember(owner = "client!kt", name = "b", descriptor = "Lhm;")
    public static class223 field2194 = new class223(0, 1);

    @OriginalMember(owner = "client!kt", name = "u", descriptor = "[Ljava/lang/String;")
    public static String[] field2213 = new String[100];

    @OriginalMember(owner = "client!kt", name = "r", descriptor = "Lhg;")
    public static class693 field2210 = new class693(3, 4);

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "I")
    public int field2193;

    @OriginalMember(owner = "client!kt", name = "c", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!kt", name = "e", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!kt", name = "g", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!kt", name = "h", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!kt", name = "i", descriptor = "I")
    public int field2201;

    @OriginalMember(owner = "client!kt", name = "k", descriptor = "I")
    public static int field2203;

    @OriginalMember(owner = "client!kt", name = "l", descriptor = "I")
    public int field2204;

    @OriginalMember(owner = "client!kt", name = "m", descriptor = "I")
    public int field2205;

    @OriginalMember(owner = "client!kt", name = "n", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!kt", name = "o", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!kt", name = "p", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!kt", name = "t", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!kt", name = "v", descriptor = "I")
    private int field2214;

    @OriginalMember(owner = "client!kt", name = "w", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!kt", name = "q", descriptor = "J")
    public long field2209;

    @OriginalMember(owner = "client!kt", name = "x", descriptor = "Ljl;")
    public static class274 field2216;

    @OriginalMember(owner = "client!kt", name = "s", descriptor = "[Ljia;")
    public static class619[] field2211;

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(ILsl;)V", line = 10)
    public final void method1121(int arg0, class461 arg1) {
        field2207++;
        while (true) {
            int var3 = arg1.method2600((byte) -123);
            if (var3 == 0) {
                if (arg0 < 42) {
                    method1124(null, 70);
                    return;
                } else {
                    return;
                }
            }
            this.method1125(1, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Z)V", line = 54)
    public final void method1122(boolean arg0) {
        field2200++;
        this.field2212 = class16.field322[this.field2214 << 3];
        long var2 = (long) this.field2201;
        long var4 = (long) this.field2193;
        long var6 = (long) this.field2199;
        this.field2197 = (int) Math.sqrt((double) (var6 * var6 + var2 * var2 + var4 * var4));
        if (this.field2208 == 0) {
            this.field2208 = 1;
        }
        if (this.field2204 == 0) {
            this.field2209 = 2147483647L;
        } else if (this.field2204 == 1) {
            this.field2209 = (this.field2197 * 8 / this.field2208);
            this.field2209 *= this.field2209;
        } else if (this.field2204 == 2) {
            this.field2209 = (this.field2197 * 8 / this.field2208);
        }
        if (arg0 && this.field2198) {
            this.field2197 *= -1;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(B)V", line = 98)
    public static void method1123(byte arg0) {
        field2194 = null;
        field2210 = null;
        field2216 = null;
        field2213 = null;
        if (arg0 <= -66) {
            field2211 = null;
        }
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 112)
    public static final int method1124(String arg0, int arg1) {
        field2195++;
        return arg1 < 108 ? 60 : class243.method1520(arg0, 36, true, 10);
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(IILsl;)V", line = 123)
    private final void method1125(int arg0, int arg1, class461 arg2) {
        if (arg1 == 1) {
            this.field2214 = arg2.method2566(-2);
        } else if (arg1 == 2) {
            arg2.method2600((byte) -127);
        } else if (arg1 == 3) {
            this.field2201 = arg2.method2622(-539564808);
            this.field2193 = arg2.method2622(-539564808);
            this.field2199 = arg2.method2622(-539564808);
        } else if (arg1 == 4) {
            this.field2204 = arg2.method2600((byte) -128);
            this.field2208 = arg2.method2622(-539564808);
        } else if (arg1 == 6) {
            this.field2205 = arg2.method2600((byte) -126);
        } else if (arg1 == 8) {
            this.field2196 = 1;
        } else if (arg1 == 9) {
            this.field2202 = 1;
        } else if (arg1 == 10) {
            this.field2198 = true;
        }
        if (arg0 != 1) {
            this.method1125(-66, 114, null);
        }
        field2203++;
    }

    @OriginalMember(owner = "client!kt", name = "a", descriptor = "(I)V", line = 192)
    public static final void method1126(int arg0) {
        field2215++;
        if (class64.field900 == null) {
            return;
        }
        try {
            String var1 = class64.field900.getParameter("cookiehost");
            int var2 = (int) (class446.method2525(500) / 86400000L) - 11745;
            String var3 = "usrdob=" + var2 + "; version=1; path=/; domain=" + var1;
            if (arg0 < 111) {
                method1124(null, -110);
            }
            class568.method3264("document.cookie=\"" + var3 + "\"", (byte) 23, class64.field900);
        } catch (Throwable var4) {
        }
    }
}
