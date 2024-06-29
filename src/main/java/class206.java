import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public abstract class class206 extends class134 {

    @OriginalMember(owner = "client!gg", name = "p", descriptor = "Z")
    public volatile boolean field3306 = true;

    @OriginalMember(owner = "client!gg", name = "n", descriptor = "I")
    public int field3304;

    @OriginalMember(owner = "client!gg", name = "o", descriptor = "Lhk;")
    public class133 field3305;

    @OriginalMember(owner = "client!gg", name = "m", descriptor = "Lgg;")
    public class206 field3303;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "()I")
    public int method1264() {
        return 255;
    }

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "()Lgg;")
    public abstract class206 method587();

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "(I)V")
    public abstract void method593(int arg0);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([III)V")
    public final void method1468(int[] arg0, int arg1, int arg2) {
        if (this.field3306) {
            this.method594(arg0, arg1, arg2);
        } else {
            this.method593(arg2);
        }
    }

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "()Lgg;")
    public abstract class206 method596();

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "([III)V")
    public abstract void method594(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "()I")
    public abstract int method589();
}
