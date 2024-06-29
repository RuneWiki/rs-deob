import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public abstract class class130 extends class17 {

    @OriginalMember(owner = "client!u", name = "A", descriptor = "Z")
    public volatile boolean field3127 = true;

    @OriginalMember(owner = "client!u", name = "z", descriptor = "I")
    public int field3126;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Lu;")
    public class130 field3124;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "Lje;")
    public class67 field3125;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "([III)V")
    public final void method1056(int[] arg0, int arg1, int arg2) {
        if (this.field3127) {
            this.method304(arg0, arg1, arg2);
        } else {
            this.method302(arg2);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "()I")
    public abstract int method306();

    @OriginalMember(owner = "client!u", name = "b", descriptor = "()I")
    public int method546() {
        return 255;
    }

    @OriginalMember(owner = "client!u", name = "d", descriptor = "(I)V")
    public abstract void method302(int arg0);

    @OriginalMember(owner = "client!u", name = "c", descriptor = "()Lu;")
    public abstract class130 method300();

    @OriginalMember(owner = "client!u", name = "b", descriptor = "([III)V")
    public abstract void method304(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!u", name = "d", descriptor = "()Lu;")
    public abstract class130 method307();
}
