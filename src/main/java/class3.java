import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public abstract class class3 extends class513 {

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "Z")
    public volatile boolean field7 = true;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "I")
    public int field9;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "Loe;")
    public class276 field8;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lua;")
    public class3 field6;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "()Lua;")
    public abstract class3 method4();

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "()I")
    public abstract int method5();

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public abstract void method6(int arg0);

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "()I")
    public int method7() {
        return 255;
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "()Lua;")
    public abstract class3 method8();

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "([III)V")
    public final void method9(int[] arg0, int arg1, int arg2) {
        if (this.field7) {
            this.method10(arg0, arg1, arg2);
        } else {
            this.method6(arg2);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "([III)V")
    public abstract void method10(int[] arg0, int arg1, int arg2);
}
