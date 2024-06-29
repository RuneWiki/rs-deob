import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class387 extends class404 implements class241 {

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "qa", descriptor = "()I")
    public final native int method378();

    @OriginalMember(owner = "client!n", name = "w", descriptor = "(Lh;Lba;[IIIII)V")
    private final native void method2305(class373 arg0, class498 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!n", name = "W", descriptor = "(IIIIII)V")
    public final native void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "ka", descriptor = "(IIII)V")
    public final native void method379(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!n", name = "UA", descriptor = "()I")
    public final native int method375();

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(FFFFFFLea;II)V")
    public final void method372(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class113 arg6, int arg7, int arg8) {
        this.method2306(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!n", name = "EA", descriptor = "(FFFFFFLea;II)V")
    private final native void method2306(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class113 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!n", name = "ja", descriptor = "()I")
    public final native int method370();

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        class313.method1863(this, -50);
    }

    @OriginalMember(owner = "client!n", name = "ia", descriptor = "(Lh;Lba;IIII)V")
    private final native void method2307(class373 arg0, class498 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "na", descriptor = "(IILea;II)V")
    private final native void method2308(int arg0, int arg1, class113 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!n", name = "JA", descriptor = "()I")
    public final native int method369();

    @OriginalMember(owner = "client!n", name = "D", descriptor = "(IIIIIII)V")
    public final native void method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILea;II)V")
    public final void method351(int arg0, int arg1, class113 arg2, int arg3, int arg4) {
        this.method2308(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!n", name = "YA", descriptor = "(IIIII)V")
    public final native void method353(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lh;Lba;[IIIII)V")
    public class387(class373 arg0, class498 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2305(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lh;Lba;IIII)V")
    public class387(class373 arg0, class498 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2307(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!n", name = "V", descriptor = "(III)V")
    public final void method355(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!n", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method371(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!n", name = "M", descriptor = "(IIIIIII)V")
    public final native void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!n", name = "ya", descriptor = "()V")
    public final native void method373();
}
