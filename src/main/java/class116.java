import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public abstract class class116 extends class439 {

    @OriginalMember(owner = "client!ei", name = "q", descriptor = "Z")
    public volatile boolean field1842 = true;

    @OriginalMember(owner = "client!ei", name = "o", descriptor = "I")
    public int field1840;

    @OriginalMember(owner = "client!ei", name = "p", descriptor = "Lei;")
    public class116 field1841;

    @OriginalMember(owner = "client!ei", name = "n", descriptor = "Lwo;")
    public class521 field1839;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()I")
    public abstract int method223();

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "()Lei;")
    public abstract class116 method228();

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "([III)V")
    public final void method853(int[] arg0, int arg1, int arg2) {
        if (this.field1842) {
            this.method231(arg0, arg1, arg2);
        } else {
            this.method224(arg2);
        }
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "()I")
    public int method854() {
        return 255;
    }

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "(I)V")
    public abstract void method224(int arg0);

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "([III)V")
    public abstract void method231(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "()Lei;")
    public abstract class116 method222();
}
