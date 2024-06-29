import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public abstract class class185 extends class183 {

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "Z")
    public volatile boolean field3206 = true;

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public int field3205;

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "Lrd;")
    public class185 field3207;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "Lic;")
    public class91 field3204;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "()Lrd;")
    public abstract class185 method105();

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "([III)V")
    public abstract void method100(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "()I")
    public abstract int method110();

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "([III)V")
    public final void method1156(int[] arg0, int arg1, int arg2) {
        if (this.field3206) {
            this.method100(arg0, arg1, arg2);
        } else {
            this.method99(arg2);
        }
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(I)V")
    public abstract void method99(int arg0);

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "()I")
    public int method739() {
        return 255;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "()Lrd;")
    public abstract class185 method107();
}
