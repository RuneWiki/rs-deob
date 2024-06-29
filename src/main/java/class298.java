import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class298 extends class489 {

    @OriginalMember(owner = "client!av", name = "hb", descriptor = "Leda;")
    public class518 field3899;

    @OriginalMember(owner = "client!av", name = "kb", descriptor = "F")
    public static float field3902;

    @OriginalMember(owner = "client!av", name = "gb", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!av", name = "ib", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!av", name = "lb", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!av", name = "mb", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!av", name = "jb", descriptor = "[I")
    public static int[] field3901;

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(I)V")
    public final void method1830(int arg0) {
        this.field3899 = new class518((class609) super.field6804);
        if (arg0 < 10) {
            method1833((byte) -35, 87);
        }
        ++field3900;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(II)Z")
    public static final boolean method1831(int arg0, int arg1) {
        ++field3903;
        if (arg1 != 0) {
            field3901 = null;
        }
        return arg0 == 0 || arg0 == 1 || ~arg0 == -3;
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method1832(int arg0, String arg1) {
        ++field3898;
        if (class633.field9207 != null) {
            ++class463.field6590;
            class118.method650(true, class203.field2659);
            class272.field3457.method3060(class194.method1241(arg1, -128), -25098);
            if (arg0 >= 95) {
                class272.field3457.method3040(false, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!av", name = "a", descriptor = "(BI)V")
    public static final void method1833(byte arg0, int arg1) {
        if (arg1 < 0 || arg1 > 2) {
            arg1 = 0;
        }
        ++field3904;
        class21.field306 = arg1;
        class453.field6429 = new class309[class375.field5224[class21.field306] + 1];
        class436.field5930 = 0;
        class68.field896 = 0;
        if (arg0 >= -49) {
            field3901 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "b", descriptor = "(I)V")
    public static void method1834(int arg0) {
        if (arg0 == 1) {
            field3901 = null;
        }
    }

    @OriginalMember(owner = "client!av", name = "<init>", descriptor = "(Lhh;)V")
    public class298(class609 arg0) {
        super(arg0);
        this.field3899 = new class518(arg0);
        super.field6854 = new class519(super.field6804);
        super.field6817 = new class519(super.field6804);
        super.field6836 = new class519(super.field6804);
        super.field6813 = new class519(super.field6804);
        super.field6844 = new class519(super.field6804);
        super.field6819 = new class519(super.field6804);
        super.field6820 = new class519(super.field6804);
        super.field6842 = new class519(super.field6804);
        super.field6829 = new class519(super.field6804);
        super.field6831 = new class519(super.field6804);
    }
}
