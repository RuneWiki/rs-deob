import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class260 {

    @OriginalMember(owner = "client!lf", name = "o", descriptor = "Z")
    private boolean field4377 = false;

    @OriginalMember(owner = "client!lf", name = "n", descriptor = "I")
    public int field4376 = 0;

    @OriginalMember(owner = "client!lf", name = "u", descriptor = "I")
    public int field4383 = 0;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "Lta;")
    public static class300 field4363 = new class300(128);

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "I")
    public static volatile int field4367 = -1;

    @OriginalMember(owner = "client!lf", name = "v", descriptor = "F")
    public static float field4384;

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    private int field4366;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "I")
    public int field4369;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!lf", name = "k", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!lf", name = "m", descriptor = "I")
    public int field4375;

    @OriginalMember(owner = "client!lf", name = "p", descriptor = "I")
    public int field4378;

    @OriginalMember(owner = "client!lf", name = "q", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!lf", name = "s", descriptor = "I")
    public int field4381;

    @OriginalMember(owner = "client!lf", name = "t", descriptor = "I")
    public int field4382;

    @OriginalMember(owner = "client!lf", name = "w", descriptor = "I")
    public int field4385;

    @OriginalMember(owner = "client!lf", name = "x", descriptor = "I")
    public int field4386;

    @OriginalMember(owner = "client!lf", name = "r", descriptor = "J")
    public long field4380;

    @OriginalMember(owner = "client!lf", name = "l", descriptor = "Lhn;")
    public static class196 field4374;

    @OriginalMember(owner = "client!lf", name = "y", descriptor = "Lth;")
    public static class57 field4387;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/String;", line = 4)
    public static final String method1983(String arg0, int arg1) {
        field4371++;
        String var2 = class111.method841(37, class134.method1024(arg1 - 25961, arg0));
        if (var2 == null) {
            var2 = "";
        }
        if (arg1 != -2) {
            field4374 = (class196) null;
        }
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IZ)I", line = 41)
    public static final int method1984(int arg0, boolean arg1) {
        field4368++;
        return arg1 ? -92 : arg0 >>> 8;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lqm;I)V", line = 58)
    public final void method1985(class227 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1720((byte) -49);
            if (var3 == 0) {
                if (arg1 != -2834) {
                    return;
                }
                field4373++;
                return;
            }
            this.method1987(arg0, arg1 ^ 0xFFFFC30F, var3);
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 86)
    public final void method1986(byte arg0) {
        this.field4369 = class153.field2445[this.field4366];
        field4370++;
        this.field4378 = (int) Math.sqrt((double) (this.field4386 * this.field4386 + this.field4381 * this.field4381 + this.field4364 * this.field4364));
        if (arg0 != 88) {
            field4363 = (class300) null;
        }
        if (this.field4385 == 0) {
            this.field4385 = 1;
        }
        if (this.field4382 == 0) {
            this.field4380 = 2147483647L;
        } else if (this.field4382 == 1) {
            this.field4380 = (long) (this.field4378 * 8 / this.field4385);
            this.field4380 *= this.field4380;
        } else if (this.field4382 == 2) {
            this.field4380 = (long) (this.field4378 * 8 / this.field4385);
        }
        if (this.field4377) {
            this.field4378 *= -1;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Lqm;II)V", line = 130)
    private final void method1987(class227 arg0, int arg1, int arg2) {
        if (arg1 != 14305) {
            this.method1986((byte) -90);
        }
        field4372++;
        if (arg2 == 1) {
            this.field4366 = arg0.method1765(true);
        } else if (arg2 == 2) {
            arg0.method1720((byte) -35);
        } else if (arg2 == 3) {
            this.field4381 = arg0.method1715((byte) -87);
            this.field4364 = arg0.method1715((byte) 59);
            this.field4386 = arg0.method1715((byte) 83);
        } else if (arg2 == 4) {
            this.field4382 = arg0.method1720((byte) -120);
            this.field4385 = arg0.method1715((byte) -83);
        } else if (arg2 == 6) {
            this.field4365 = arg0.method1720((byte) -127);
        } else if (arg2 == 8) {
            this.field4376 = 1;
        } else if (arg2 == 9) {
            this.field4383 = 1;
        } else if (arg2 == 10) {
            this.field4377 = true;
        }
    }

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "(B)V", line = 195)
    public static void method1988(byte arg0) {
        field4387 = null;
        field4374 = null;
        if (arg0 > -115) {
            method1984(-112, true);
        }
        field4363 = null;
    }
}
