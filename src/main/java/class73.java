import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kca")
public abstract class class73 extends class417 {

    @OriginalMember(owner = "client!kca", name = "i", descriptor = "Z")
    public volatile boolean field996 = true;

    @OriginalMember(owner = "client!kca", name = "j", descriptor = "I")
    public int field997;

    @OriginalMember(owner = "client!kca", name = "k", descriptor = "Lnk;")
    public class612 field998;

    @OriginalMember(owner = "client!kca", name = "l", descriptor = "Lkca;")
    public class73 field999;

    @OriginalMember(owner = "client!kca", name = "c", descriptor = "()I", line = 7)
    public int method586() {
        return 255;
    }

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "([III)V", line = 13)
    public final void method587(int[] arg0, int arg1, int arg2) {
        if (this.field996) {
            this.method262(arg0, arg1, arg2);
        } else {
            this.method263(arg2);
        }
    }

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "()Lkca;")
    public abstract class73 method256();

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "(I)V")
    public abstract void method263(int arg0);

    @OriginalMember(owner = "client!kca", name = "b", descriptor = "()Lkca;")
    public abstract class73 method257();

    @OriginalMember(owner = "client!kca", name = "a", descriptor = "([III)V")
    public abstract void method262(int[] arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!kca", name = "d", descriptor = "()I")
    public abstract int method265();
}
