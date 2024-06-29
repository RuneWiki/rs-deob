import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class177 {

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "I")
    public static int field2888 = 0;

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "Lqfa;")
    public static class85 field2886 = new class85(27, 8);

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "Lqfa;")
    public static class85 field2891 = new class85(15, 3);

    @OriginalMember(owner = "client!ru", name = "i", descriptor = "Ljava/lang/String;")
    public static String field2892 = null;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "Lru;")
    public class177 field2887;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "Lru;")
    public class177 field2889;

    @OriginalMember(owner = "client!ru", name = "g", descriptor = "[Loe;")
    public static class185[] field2890;

    @OriginalMember(owner = "client!ru", name = "j", descriptor = "[[S")
    public static short[][] field2893;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "(I)V")
    public final void method1318(int arg0) {
        field2885++;
        if (this.field2887 == null) {
            return;
        }
        this.field2887.field2889 = this.field2889;
        this.field2889.field2887 = this.field2887;
        if (arg0 == 8) {
            this.field2887 = null;
            this.field2889 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "(B)V")
    public static final void method1319(byte arg0) {
        field2884++;
        if (class612.field8902) {
            return;
        }
        if (arg0 != 125) {
            field2893 = null;
        }
        class659.method3750(0, class509.field7213);
        if (class400.field5812 != null) {
            class659.method3750(0, class400.field5812);
        }
        class612.field8902 = true;
    }

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "(I)V")
    public static void method1320(int arg0) {
        field2890 = null;
        field2886 = null;
        if (arg0 >= -120) {
            field2888 = -98;
        }
        field2891 = null;
        field2893 = null;
        field2892 = null;
    }
}
