import java.awt.FontMetrics;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class201 {

    @OriginalMember(owner = "client!se", name = "e", descriptor = "[Li;")
    public static class88[] field3838 = new class88[500];

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[I")
    public static int[] field3836 = new int[5];

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Li;")
    public static class88 field3837 = null;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3842;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "Ljava/awt/Frame;")
    public static Frame field3834;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static void method1379(byte arg0) {
        field3842 = null;
        field3836 = null;
        field3834 = null;
        field3838 = null;
        if (arg0 <= 39) {
            field3837 = null;
        }
        field3837 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static final void method1380(int arg0) {
        class216.field4054 = null;
        class220.field4168 = null;
        class105.field1914 = null;
        class7.field105 = null;
        class117.field2128 = null;
        class97.field1788 = null;
        class208.field3953 = null;
        class90.field1707 = null;
        class48.field895 = null;
        class54.field1009 = null;
        class228.field4278 = 0;
        if (arg0 > -44) {
            return;
        }
        class232.field4361.method1618(-3);
        field3839++;
        class159.field3051.method1618(-3);
        class236.field4399 = null;
        class118.field2149 = null;
        class231.field4327 = null;
        class227.field4252 = null;
        class166.field3201 = null;
        class167.field3207 = null;
        class12.field175 = null;
        class245.field4502 = null;
        class196.field3764 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(II)I")
    public static final int method1381(int arg0, int arg1) {
        field3841++;
        if (arg1 != 255) {
            field3834 = null;
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(I)V")
    public static final void method1382(int arg0) {
        if (arg0 <= 15) {
            field3842 = null;
        }
        field3835++;
        if (class105.field1912 > 0) {
            class115.method787((byte) -127);
        } else {
            class131.method883(40, 65536);
            class89.field1666 = class33.field556;
            class33.field556 = null;
        }
    }
}
