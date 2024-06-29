import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class729 extends class104 implements class65 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V", line = 4)
    public final void method721(int arg0, int arg1, int arg2) {
        this.method5305(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V", line = 14)
    public class729() {
        this.method5314();
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Lqa;)V", line = 18)
    public final void method733(class104 arg0) {
        this.method5313(this.nativeid, ((class729) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V", line = 23)
    public final void method719(int arg0) {
        this.method5309(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V", line = 26)
    public final void method735() {
        this.method5311(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Lqa;", line = 31)
    public final class104 method737() {
        class729 var1 = new class729();
        var1.method733(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V", line = 37)
    public final void method743(int[] arg0) {
        this.method5316(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V", line = 41)
    public final void method724(int arg0) {
        this.method5318(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V", line = 44)
    public final void method718(int arg0, int arg1, int arg2, int[] arg3) {
        this.method5306(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V", line = 49)
    public final void method739(int arg0, int arg1, int arg2) {
        this.method5304(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V", line = 52)
    public final void method722(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method5315(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V", line = 55)
    public final void method736(int arg0) {
        this.method5308(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V", line = 58)
    public final void method742(int arg0) {
        this.method5310(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V", line = 62)
    public final void method732(int arg0, int arg1, int arg2, int[] arg3) {
        this.method5319(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V", line = 65)
    public final void method729(int arg0) {
        this.method5307(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V", line = 69)
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class579.method4297(this, 127);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V", line = 80)
    public final void method740(int arg0, int arg1, int arg2, int[] arg3) {
        this.method5320(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V", line = 84)
    public final void method741(int arg0) {
        this.method5317(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V", line = 88)
    public final void method690(boolean arg0) {
        this.method5312(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method5304(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method5305(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method5306(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method5307(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method5308(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method5309(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method5310(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method5311(long arg0);

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method5312(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method5313(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method5314();

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method5315(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method5316(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method5317(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method5318(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method5319(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method5320(long arg0, int arg1, int arg2, int arg3, int[] arg4);
}
