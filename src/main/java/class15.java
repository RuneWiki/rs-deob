import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class15 extends class529 implements class276 {

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() {
        class475.method2732(false, this);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILea;II)V", line = 15)
    public final void method157(int arg0, int arg1, class381 arg2, int arg3, int arg4) {
        this.method153(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(FFFFFFLea;II)V", line = 22)
    public final void method162(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        this.method150(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!n", name = "V", descriptor = "(III)V", line = 28)
    public final void method164(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lh;Lba;[IIIII)V", line = 37)
    public class15(class469 arg0, class262 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method156(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lh;Lba;IIII)V", line = 40)
    public class15(class469 arg0, class262 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method165(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!n", name = "JA", descriptor = "()I")
    public final native int method149();

    @OriginalMember(owner = "client!n", name = "EA", descriptor = "(FFFFFFLea;II)V")
    private final native void method150(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!n", name = "ja", descriptor = "()I")
    public final native int method151();

    @OriginalMember(owner = "client!n", name = "ka", descriptor = "(IIII)V")
    public final native void method152(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!n", name = "na", descriptor = "(IILea;II)V")
    private final native void method153(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!n", name = "UA", descriptor = "()I")
    public final native int method154();

    @OriginalMember(owner = "client!n", name = "M", descriptor = "(IIIIIII)V")
    public final native void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!n", name = "w", descriptor = "(Lh;Lba;[IIIII)V")
    private final native void method156(class469 arg0, class262 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!n", name = "YA", descriptor = "(IIIII)V")
    public final native void method158(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!n", name = "D", descriptor = "(IIIIIII)V")
    public final native void method159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!n", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method160(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!n", name = "qa", descriptor = "()I")
    public final native int method161();

    @OriginalMember(owner = "client!n", name = "W", descriptor = "(IIIIII)V")
    public final native void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "ya", descriptor = "()V")
    public final native void method109();

    @OriginalMember(owner = "client!n", name = "ia", descriptor = "(Lh;Lba;IIII)V")
    private final native void method165(class469 arg0, class262 arg1, int arg2, int arg3, int arg4, int arg5);
}
