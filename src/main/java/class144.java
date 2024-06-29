import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pm")
public class class144 extends class277 {

    @OriginalMember(owner = "client!pm", name = "k", descriptor = "Lpq;")
    private class159 field1829;

    @OriginalMember(owner = "client!pm", name = "m", descriptor = "Lrh;")
    public static class59 field1831 = new class59();

    @OriginalMember(owner = "client!pm", name = "s", descriptor = "[F")
    public static float[] field1837 = new float[16384];

    @OriginalMember(owner = "client!pm", name = "t", descriptor = "[F")
    public static float[] field1838 = new float[16384];

    @OriginalMember(owner = "client!pm", name = "f", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!pm", name = "g", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!pm", name = "h", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!pm", name = "i", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!pm", name = "l", descriptor = "I")
    private int field1830;

    @OriginalMember(owner = "client!pm", name = "n", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!pm", name = "o", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!pm", name = "p", descriptor = "I")
    public static int field1834;

    @OriginalMember(owner = "client!pm", name = "q", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!pm", name = "r", descriptor = "I")
    public static int field1836;

    @OriginalMember(owner = "client!pm", name = "u", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!pm", name = "j", descriptor = "Lxa;")
    private class424 field1828;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field1838[var2] = (float) Math.sin((double) var2 * var0);
            field1837[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(B)V", line = 5)
    public final void method191(byte arg0) {
        ++field1836;
        this.field1828 = class506.method2866(this.field1829.method1082((byte) 33, ((class84) super.field3746).field1038), (byte) 122);
        this.method277(true, (byte) -87);
        if (arg0 > -5) {
            this.field1829 = null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(I)Z", line = 20)
    public final boolean method193(int arg0) {
        if (arg0 != -29581) {
            this.method190(-84, -79, -95, false);
        }
        ++field1826;
        return this.field1829.method1086((byte) 116, ((class84) super.field3746).field1038);
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(Lfca;BI)Ljava/lang/String;", line = 32)
    public static final String method983(class188 arg0, byte arg1, int arg2) {
        ++field1834;
        if (!client.method1411(arg0).method1647(arg2, (byte) 23) && arg0.field2410 == null) {
            return null;
        } else if (arg0.field2446 != null && ~arg0.field2446.length < ~arg2 && arg0.field2446[arg2] != null && ~arg0.field2446[arg2].trim().length() != -1) {
            return arg1 != 39 ? null : arg0.field2446[arg2];
        } else {
            return class380.field5455 ? "Hidden-" + arg2 : null;
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IBI)Z", line = 56)
    public static final boolean method984(int arg0, byte arg1, int arg2) {
        if (arg1 != 77) {
            field1838 = null;
        }
        ++field1833;
        return ~(2048 & arg2) != -1;
    }

    @OriginalMember(owner = "client!pm", name = "<init>", descriptor = "(Lpq;Lqu;)V", line = 67)
    public class144(class159 arg0, class84 arg1) {
        super(arg1);
        this.field1829 = arg0;
    }

    @OriginalMember(owner = "client!pm", name = "b", descriptor = "(B)V", line = 79)
    public static void method985(byte arg0) {
        field1837 = null;
        if (arg0 != -78) {
            method986(54, (byte) 38);
        }
        field1838 = null;
        field1831 = null;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IB)Z", line = 91)
    public static final boolean method986(int arg0, byte arg1) {
        if (arg1 >= -95) {
            method985((byte) 12);
        }
        ++field1827;
        return ~(-arg0 & arg0) == ~arg0;
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IIIZ)V", line = 102)
    public final void method190(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg0 >= 124) {
            class9.field103.method1975(arg1 + -2, arg2, super.field3746.field7517 + 4, super.field3746.field7519 + 2, ((class84) super.field3746).field1039, 0);
            ++field1832;
            class9.field103.method1975(arg1 + -1, arg2 - -1, super.field3746.field7517 + 2, super.field3746.field7519, 0, 0);
        }
    }

    @OriginalMember(owner = "client!pm", name = "a", descriptor = "(IZII)V", line = 117)
    public final void method192(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg0 <= -72) {
            if (arg1 || ~class556.field7597 != ~this.field1830) {
                this.field1830 = class556.field7597;
                int var5 = class556.field7597 * super.field3746.field7517 / 100;
                int[] var6 = new int[4];
                class9.field103.method1910(var6);
                class9.field103.method1908(arg2, arg3 - -2, arg2 + var5, super.field3746.field7519 + arg3);
                this.field1828.method2452(arg2, arg3 + 2, super.field3746.field7517, super.field3746.field7519);
                class9.field103.method1908(var6[0], var6[1], var6[2], var6[3]);
            }
            ++field1824;
        }
    }
}
