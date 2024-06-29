import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vr")
public class class309 extends class367 implements class43 {

    @OriginalMember(owner = "client!vr", name = "z", descriptor = "I")
    private int field4908;

    @OriginalMember(owner = "client!vr", name = "o", descriptor = "[I")
    public static int[] field4897 = new int[14];

    @OriginalMember(owner = "client!vr", name = "s", descriptor = "[B")
    public static byte[] field4901 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!vr", name = "w", descriptor = "J")
    public static long field4905 = 0L;

    @OriginalMember(owner = "client!vr", name = "y", descriptor = "Led;")
    public static class422 field4907 = class489.method2855((byte) 109);

    @OriginalMember(owner = "client!vr", name = "C", descriptor = "Lvv;")
    public static class313 field4911 = new class313(91, 4);

    @OriginalMember(owner = "client!vr", name = "p", descriptor = "I")
    public static int field4898;

    @OriginalMember(owner = "client!vr", name = "q", descriptor = "I")
    public static int field4899;

    @OriginalMember(owner = "client!vr", name = "r", descriptor = "I")
    public static int field4900;

    @OriginalMember(owner = "client!vr", name = "t", descriptor = "I")
    public static int field4902;

    @OriginalMember(owner = "client!vr", name = "u", descriptor = "I")
    public static int field4903;

    @OriginalMember(owner = "client!vr", name = "v", descriptor = "I")
    public static int field4904;

    @OriginalMember(owner = "client!vr", name = "x", descriptor = "I")
    public static int field4906;

    @OriginalMember(owner = "client!vr", name = "A", descriptor = "I")
    public static int field4909;

    @OriginalMember(owner = "client!vr", name = "B", descriptor = "I")
    public static int field4910;

    @OriginalMember(owner = "client!vr", name = "E", descriptor = "I")
    public static int field4913;

    @OriginalMember(owner = "client!vr", name = "D", descriptor = "[I")
    public static int[] field4912;

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(ZII)Z")
    public static final boolean method1963(boolean arg0, int arg1, int arg2) {
        ++field4900;
        if (arg0) {
            method1966(-3);
        }
        return ~(arg2 & 1024) != -1;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILoa;)V")
    public static final void method1964(int arg0, class33 arg1) {
        arg1.field521 = false;
        if (arg0 != -1) {
            method1965(59, (class219) null);
        }
        if (arg1.field519 != null) {
            arg1.field519.field7024 = 0;
        }
        ++field4909;
        for (class33 var2 = arg1.method256(); var2 != null; var2 = arg1.method254()) {
            method1964(-1, var2);
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(ILft;)V")
    public static final void method1965(int arg0, class219 arg1) {
        arg1.field3793 = null;
        ++field4899;
        if (arg0 > class422.field6375) {
            class244.field4187.method567(arg1, 255);
            ++class422.field6375;
        }
    }

    @OriginalMember(owner = "client!vr", name = "<init>", descriptor = "(Lih;I[BIZ)V")
    public class309(class214 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field4908 = arg1;
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(II[BI)V")
    public final void method314(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method2332(arg3, (byte) 28, arg2);
        ++field4902;
        this.field4908 = arg0;
        if (arg1 < 58) {
            this.method315((byte) 63);
        }
    }

    @OriginalMember(owner = "client!vr", name = "b", descriptor = "(B)I")
    public final int method316(byte arg0) {
        if (arg0 >= -106) {
            this.method316((byte) 81);
        }
        ++field4904;
        return this.field4908;
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(B)V")
    public final void method513(byte arg0) {
        ++field4906;
        if (arg0 < 89) {
            field4913 = -59;
        }
        super.field5710.method1469(this, (byte) -128);
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(B)I")
    public final int method315(byte arg0) {
        if (arg0 != -21) {
            method1967(77);
        }
        ++field4910;
        return super.field5709;
    }

    @OriginalMember(owner = "client!vr", name = "c", descriptor = "(I)V")
    public static void method1966(int arg0) {
        field4901 = null;
        field4911 = null;
        field4907 = null;
        field4912 = null;
        if (arg0 != 34963) {
            method1964(-86, (class33) null);
        }
        field4897 = null;
    }

    @OriginalMember(owner = "client!vr", name = "d", descriptor = "(I)V")
    public static final void method1967(int arg0) {
        ++field4898;
        class162.field2584.method264(arg0 + 26687);
        if (arg0 == -7188) {
            for (int var1 = 0; var1 < 32; ++var1) {
                class320.field5025[var1] = 0L;
            }
            for (int var2 = 0; var2 < 32; ++var2) {
                class335.field5259[var2] = 0L;
            }
            class374.field5808 = 0;
        }
    }

    @OriginalMember(owner = "client!vr", name = "a", descriptor = "(I)J")
    public final long method313(int arg0) {
        ++field4903;
        if (arg0 != -4241) {
            method1966(-76);
        }
        return 0L;
    }
}
