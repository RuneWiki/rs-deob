import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class160 extends class288 {

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "Z")
    public volatile boolean field2314 = true;

    @OriginalMember(owner = "client!ic", name = "l", descriptor = "I")
    public int field2311;

    @OriginalMember(owner = "client!ic", name = "m", descriptor = "Lic;")
    public class160 field2312;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lrk;")
    public class191 field2313;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()Lic;")
    public abstract class160 method195();

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "()I")
    public abstract int method193();

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()I")
    public int method1063() {
        return 255;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([III)V")
    public abstract void method188(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(I)V")
    public abstract void method190(int arg0);

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "()Lic;")
    public abstract class160 method196();

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "([III)V")
    public final void method1064(int[] arg0, int arg1, int arg2) {
        if (this.field2314) {
            this.method188(arg0, arg1, arg2);
        } else {
            this.method190(arg2);
        }
    }
}
