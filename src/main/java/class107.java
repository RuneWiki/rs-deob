import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ai")
public class class107 extends class61 {

    @OriginalMember(owner = "client!ai", name = "q", descriptor = "Llc;")
    public class143 field1895;

    @OriginalMember(owner = "client!ai", name = "l", descriptor = "Llc;")
    private static class143 field1890 = class66.method374(" more options", -1);

    @OriginalMember(owner = "client!ai", name = "o", descriptor = "I")
    public static int field1893 = 0;

    @OriginalMember(owner = "client!ai", name = "p", descriptor = "Llc;")
    public static class143 field1894 = field1890;

    @OriginalMember(owner = "client!ai", name = "k", descriptor = "I")
    public static int field1889 = 0;

    @OriginalMember(owner = "client!ai", name = "m", descriptor = "Llc;")
    public static class143 field1891 = class66.method374("http:)4)4", -1);

    @OriginalMember(owner = "client!ai", name = "t", descriptor = "Llc;")
    public static class143 field1898 = class66.method374("D-Bmarrage de la librairie 3D", -1);

    @OriginalMember(owner = "client!ai", name = "r", descriptor = "Llc;")
    public static class143 field1896 = class66.method374("Abandonner", -1);

    @OriginalMember(owner = "client!ai", name = "s", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!ai", name = "n", descriptor = "[S")
    public static short[] field1892;

    @OriginalMember(owner = "client!ai", name = "j", descriptor = "[[S")
    public static short[][] field1888;

    @OriginalMember(owner = "client!ai", name = "c", descriptor = "(I)V")
    public static void method648(int arg0) {
        field1888 = null;
        field1890 = null;
        field1891 = null;
        field1896 = null;
        field1892 = null;
        field1894 = null;
        if (arg0 == 0) {
            field1898 = null;
        }
    }

    @OriginalMember(owner = "client!ai", name = "a", descriptor = "(IIILvh;Z)V")
    public static final void method649(int arg0, int arg1, int arg2, class43 arg3, boolean arg4) {
        if (class155.field2794 >= 3) {
            class260.method1723(arg0, arg1, 0, arg3.field779, arg3.field826);
        } else {
            ((class160) class99.field1787).method1054(arg0, arg1, arg3.field735, arg3.field831, class99.field1787.field4201 / 2, class99.field1787.field4208 / 2, class184.field3339, 256, arg3.field779, arg3.field826);
        }
        field1897++;
        class136.field2384[arg2] = arg4;
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "()V")
    public class107() {
    }

    @OriginalMember(owner = "client!ai", name = "<init>", descriptor = "(Llc;I)V")
    public class107(class143 arg0, int arg1) {
        this.field1895 = arg0;
    }
}
