import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public abstract class class176 extends class187 {

    @OriginalMember(owner = "client!ic", name = "p", descriptor = "Z")
    public volatile boolean field2689 = true;

    @OriginalMember(owner = "client!ic", name = "o", descriptor = "I")
    public int field2688;

    @OriginalMember(owner = "client!ic", name = "q", descriptor = "Lic;")
    public class176 field2690;

    @OriginalMember(owner = "client!ic", name = "n", descriptor = "Lae;")
    public class209 field2687;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "([III)V", line = 4)
    public final void method1190(int[] arg0, int arg1, int arg2) {
        if (this.field2689) {
            this.method217(arg0, arg1, arg2);
        } else {
            this.method211(arg2);
        }
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "()I", line = 23)
    public int method1191() {
        return 255;
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(I)V")
    public abstract void method211(int arg0);

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "()Lic;")
    public abstract class176 method220();

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "()I")
    public abstract int method216();

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "([III)V")
    public abstract void method217(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ic", name = "d", descriptor = "()Lic;")
    public abstract class176 method213();
}
