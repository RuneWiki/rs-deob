import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public abstract class class238 extends class249 {

    @OriginalMember(owner = "client!ck", name = "o", descriptor = "Z")
    public volatile boolean field4085 = true;

    @OriginalMember(owner = "client!ck", name = "p", descriptor = "I")
    public int field4086;

    @OriginalMember(owner = "client!ck", name = "q", descriptor = "Lbe;")
    public class16 field4087;

    @OriginalMember(owner = "client!ck", name = "r", descriptor = "Lck;")
    public class238 field4088;

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "([III)V")
    public abstract void method255(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "()I")
    public abstract int method224();

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)V")
    public abstract void method235(int arg0);

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "()Lck;")
    public abstract class238 method225();

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "([III)V")
    public final void method1615(int[] arg0, int arg1, int arg2) {
        if (this.field4085) {
            this.method255(arg0, arg1, arg2);
        } else {
            this.method235(arg2);
        }
    }

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "()Lck;")
    public abstract class238 method237();

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "()I")
    public int method501() {
        return 255;
    }
}
