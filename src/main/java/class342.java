import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class342 extends class294 {

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field5113;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field5115;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field5118;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "Lhg;")
    public class342 field5114;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Lhg;")
    public class342 field5116;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(I)V", line = 11)
    public final void method2095(int arg0) {
        field5118++;
        if (arg0 < -7 && this.field5116 != null) {
            this.field5116.field5114 = this.field5114;
            this.field5114.field5116 = this.field5116;
            this.field5114 = null;
            this.field5116 = null;
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(I)V", line = 29)
    public static final void method2096(int arg0) {
        field5113++;
        class345.field5256 = null;
        class27.method236(0, (byte) 124, 0, field5115, 0, arg0, class233.field3411, class279.field4220, -1);
        if (class345.field5256 != null) {
            class381.method2327(class245.field3509.field2527, class233.field3411, -1412584499, field5115, 0, class314.field4727, (byte) -61, class143.field2035, class345.field5256, 0);
            class345.field5256 = null;
        }
    }
}
