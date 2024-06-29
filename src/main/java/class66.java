import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class66 extends class404 implements class241 {

    @OriginalMember(owner = "client!k", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "(Lh;Lba;IIII)V")
    private final native void method368(class373 arg0, class498 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class313.method1863(this, 93);
    }

    @OriginalMember(owner = "client!k", name = "W", descriptor = "(IIIIII)V")
    public final native void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IILea;II)V")
    public final void method351(int arg0, int arg1, class113 arg2, int arg3, int arg4) {
        this.method376(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!k", name = "JA", descriptor = "()I")
    public final native int method369();

    @OriginalMember(owner = "client!k", name = "V", descriptor = "(III)V")
    public final native void method355(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!k", name = "ja", descriptor = "()I")
    public final native int method370();

    @OriginalMember(owner = "client!k", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method371(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method372(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class113 arg6, int arg7, int arg8) {
        this.method380(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!k", name = "ya", descriptor = "()V")
    public final native void method373();

    @OriginalMember(owner = "client!k", name = "s", descriptor = "(Lh;Lba;[IIIII)V")
    private final native void method374(class373 arg0, class498 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "UA", descriptor = "()I")
    public final native int method375();

    @OriginalMember(owner = "client!k", name = "r", descriptor = "(IILea;II)V")
    private final native void method376(int arg0, int arg1, class113 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "D", descriptor = "(IIIIIII)V")
    public final native void method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "qa", descriptor = "()I")
    public final native int method378();

    @OriginalMember(owner = "client!k", name = "ka", descriptor = "(IIII)V")
    public final native void method379(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!k", name = "M", descriptor = "(IIIIIII)V")
    public final native void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!k", name = "YA", descriptor = "(IIIII)V")
    public final native void method353(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lh;Lba;[IIIII)V")
    public class66(class373 arg0, class498 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method374(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(Lh;Lba;IIII)V")
    public class66(class373 arg0, class498 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method368(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!k", name = "n", descriptor = "(FFFFFFLea;II)V")
    private final native void method380(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class113 arg6, int arg7, int arg8);
}
