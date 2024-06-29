import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class128 extends class110 {

    @OriginalMember(owner = "client!ce", name = "J", descriptor = "I")
    private int field2235;

    @OriginalMember(owner = "client!ce", name = "K", descriptor = "Lnf;")
    private static class252 field2236;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "()V", line = 3)
    public final void method757() {
        field2236.method1815(this.field2235, this.field1971);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "()V", line = 6)
    public final void method759() {
        field2236.method1811(-125, this.field2235);
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)V", line = 10)
    public final void method762(int arg0) throws Exception {
        if (arg0 > 32768) {
            throw new IllegalArgumentException();
        }
        field2236.method1810(arg0, this.field2235, 23998);
    }

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "()V", line = 16)
    public static void method896() {
        field2236 = null;
    }

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "()I", line = 19)
    public final int method761() {
        return field2236.method1813(this.field2235, (byte) 60);
    }

    @OriginalMember(owner = "client!ce", name = "<init>", descriptor = "(Lsm;I)V", line = 22)
    public class128(class120 arg0, int arg1) {
        field2236 = arg0.method815(3672);
        this.field2235 = arg1;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 27)
    public final void method755(Component arg0) throws Exception {
        field2236.method1814(15276, class307.field5236, class219.field3799, arg0);
    }

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "()V", line = 30)
    public final void method766() {
        field2236.method1812(this.field2235, (byte) 44);
    }
}
