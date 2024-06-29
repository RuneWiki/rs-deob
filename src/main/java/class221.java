import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class221 extends class39 {

    @OriginalMember(owner = "client!h", name = "m", descriptor = "Lsf;")
    public static class108 field3925 = class140.method973(255, "brillant2:");

    @OriginalMember(owner = "client!h", name = "q", descriptor = "Lsf;")
    public static class108 field3929 = class140.method973(255, "Titelbild geladen)3");

    @OriginalMember(owner = "client!h", name = "x", descriptor = "Lsf;")
    public static class108 field3936 = class140.method973(255, "Versteckt");

    @OriginalMember(owner = "client!h", name = "r", descriptor = "J")
    public static volatile long field3930 = 0L;

    @OriginalMember(owner = "client!h", name = "y", descriptor = "Z")
    public static boolean field3937 = true;

    @OriginalMember(owner = "client!h", name = "w", descriptor = "Lsf;")
    public static class108 field3935 = class140.method973(255, "huffman");

    @OriginalMember(owner = "client!h", name = "z", descriptor = "Lsf;")
    public static class108 field3938 = class140.method973(255, "rect_debug=");

    @OriginalMember(owner = "client!h", name = "o", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!h", name = "v", descriptor = "I")
    public static int field3934;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "Lh;")
    public class221 field3926;

    @OriginalMember(owner = "client!h", name = "u", descriptor = "Lh;")
    public class221 field3933;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "Lof;")
    public static class242 field3928;

    @OriginalMember(owner = "client!h", name = "t", descriptor = "Lik;")
    public static class262 field3932;

    @OriginalMember(owner = "client!h", name = "d", descriptor = "(I)Lhm;", line = 17)
    public static final class20 method1514(int arg0) {
        if (arg0 != 1) {
            method1515(-55);
        }
        field3931++;
        try {
            return (class20) Class.forName("q").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class321();
        }
    }

    @OriginalMember(owner = "client!h", name = "e", descriptor = "(I)V", line = 32)
    public static void method1515(int arg0) {
        if (arg0 > -118) {
            return;
        }
        field3936 = null;
        field3932 = null;
        field3938 = null;
        field3925 = null;
        field3935 = null;
        field3928 = null;
        field3929 = null;
    }

    @OriginalMember(owner = "client!h", name = "f", descriptor = "(I)V", line = 55)
    public final void method1516(int arg0) {
        field3927++;
        if (this.field3933 == null) {
            return;
        }
        this.field3933.field3926 = this.field3926;
        this.field3926.field3933 = this.field3933;
        this.field3933 = null;
        if (arg0 != 255) {
            method1514(81);
        }
        this.field3926 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V", line = 79)
    public static final void method1517(int arg0, int arg1) {
        class29.field431[2] = (float) class162.method1118(255, arg0) / 255.0F;
        field3934++;
        class29.field431[0] = (float) class162.method1118(arg0 >> 16, 255) / 255.0F;
        class29.field431[1] = (float) class162.method1118(arg0 >> 8, 255) / 255.0F;
        if (arg1 > -56) {
            method1515(3);
        }
        class116.method830(3, (byte) -21);
        class116.method830(4, (byte) -81);
    }
}
