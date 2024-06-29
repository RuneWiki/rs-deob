import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public abstract class class348 extends class180 {

    @OriginalMember(owner = "client!gh", name = "o", descriptor = "Z")
    public volatile boolean field4760 = true;

    @OriginalMember(owner = "client!gh", name = "q", descriptor = "I")
    public int field4762;

    @OriginalMember(owner = "client!gh", name = "p", descriptor = "Lat;")
    public class176 field4761;

    @OriginalMember(owner = "client!gh", name = "r", descriptor = "Lgh;")
    public class348 field4763;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([III)V")
    public abstract void method267(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "()I")
    public int method1653() {
        return 255;
    }

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "()Lgh;")
    public abstract class348 method270();

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "([III)V")
    public final void method2084(int[] arg0, int arg1, int arg2) {
        if (this.field4760) {
            this.method267(arg0, arg1, arg2);
        } else {
            this.method294(arg2);
        }
    }

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "()Lgh;")
    public abstract class348 method278();

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "(I)V")
    public abstract void method294(int arg0);

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "()I")
    public abstract int method286();
}
