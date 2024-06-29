import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class7 {

    @OriginalMember(owner = "client!il", name = "g", descriptor = "B")
    private byte field103;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "I")
    public int field97;

    @OriginalMember(owner = "client!il", name = "e", descriptor = "I")
    public int field101;

    @OriginalMember(owner = "client!il", name = "f", descriptor = "I")
    public int field102;

    @OriginalMember(owner = "client!il", name = "l", descriptor = "I")
    public int field108;

    @OriginalMember(owner = "client!il", name = "b", descriptor = "I")
    public int field98;

    @OriginalMember(owner = "client!il", name = "d", descriptor = "I")
    public static int field100 = 0;

    @OriginalMember(owner = "client!il", name = "k", descriptor = "I")
    public static int field107 = 765;

    @OriginalMember(owner = "client!il", name = "h", descriptor = "I")
    public static int field104;

    @OriginalMember(owner = "client!il", name = "i", descriptor = "I")
    public static int field105;

    @OriginalMember(owner = "client!il", name = "j", descriptor = "I")
    public static int field106;

    @OriginalMember(owner = "client!il", name = "c", descriptor = "I")
    public static int field99;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(III)Lkg;", line = 12)
    public static final class177 method52(int arg0, int arg1, int arg2) {
        class165 var3 = class36.field545[arg0][arg1][arg2];
        return var3 == null ? null : var3.field2482;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(I)I", line = 19)
    public final int method53(int arg0) {
        field99++;
        return arg0 == 11314 ? this.field103 & 0x7 : -112;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Z)I", line = 34)
    public final int method54(boolean arg0) {
        field104++;
        if (!arg0) {
            method52(-128, 13, 81);
        }
        return (this.field103 & 0x8) == 8 ? 1 : 0;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(Lqa;ILoa;IZIZ)V", line = 54)
    public static final void method55(class162 arg0, int arg1, class488 arg2, int arg3, boolean arg4, int arg5, boolean arg6) {
        if (arg4) {
            class257.field3697.method3129((class112.field1780 - class257.field3697.method134()) / 2, (class477.field7003 - class257.field3697.method131()) / 2);
            class112.field1783.method3129((class112.field1780 - class112.field1783.method134()) / 2, 18);
        }
        field106++;
        arg2.method2913(arg5, class477.field7003 / 2 - 26, -1, class112.field1780 / 2, (class371.field5565 == class321.field4649 ? class310.field4425 : class108.field1682).method1273(arg6, class370.field5530), (byte) 108);
        int var7 = class477.field7003 / 2 - 18;
        arg0.method516(class112.field1780 / 2 - 152, var7, 304, 34, arg1, 0);
        arg0.method516(class112.field1780 / 2 - 151, var7 + 1, 302, 32, 0, 0);
        arg0.method471(class112.field1780 / 2 - 150, var7 - -2, class37.field575 * 3, 30, arg3, 0);
        arg0.method471(class37.field575 * 3 + (class112.field1780 / 2 - 150), var7 + 2, 300 - class37.field575 * 3, 30, 0, 0);
        arg2.method2913(arg5, class477.field7003 / 2 + 4, -1, class112.field1780 / 2, class31.field499, (byte) -94);
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 74)
    public class7() {
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Lti;)V", line = 76)
    public class7(class303 arg0) {
        this.field103 = arg0.method1899((byte) 46);
        this.field97 = arg0.method1868(0);
        this.field101 = arg0.method1870(-1945262512);
        this.field102 = arg0.method1870(-1945262512);
        this.field108 = arg0.method1870(-1945262512);
        this.field98 = arg0.method1870(-1945262512);
    }
}
