import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!xa")
public class class464 extends class404 implements class241 {

    @OriginalMember(owner = "client!xa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!xa", name = "V", descriptor = "(III)V", line = 3)
    public final void method355(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!xa", name = "finalize", descriptor = "()V", line = 13)
    protected final void finalize() {
        class313.method1863(this, -100);
    }

    @OriginalMember(owner = "client!xa", name = "W", descriptor = "(IIIIII)V", line = 16)
    public final void method354(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(FFFFFFLea;II)V", line = 20)
    public final void method372(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class113 arg6, int arg7, int arg8) {
        this.method2802(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!xa", name = "a", descriptor = "(IILea;II)V", line = 27)
    public final void method351(int arg0, int arg1, class113 arg2, int arg3, int arg4) {
        this.method2803(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lh;Lba;[I[BIIII)V", line = 34)
    public class464(class373 arg0, class498 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7) {
        this.method2804(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
    }

    @OriginalMember(owner = "client!xa", name = "ka", descriptor = "(IIII)V")
    public final native void method379(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!xa", name = "ya", descriptor = "()V")
    public final native void method373();

    @OriginalMember(owner = "client!xa", name = "UA", descriptor = "()I")
    public final native int method375();

    @OriginalMember(owner = "client!xa", name = "D", descriptor = "(IIIIIII)V")
    public final native void method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "ja", descriptor = "()I")
    public final native int method370();

    @OriginalMember(owner = "client!xa", name = "M", descriptor = "(IIIIIII)V")
    public final native void method356(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!xa", name = "JA", descriptor = "()I")
    public final native int method369();

    @OriginalMember(owner = "client!xa", name = "WA", descriptor = "(FFFFFFLea;II)V")
    private final native void method2802(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class113 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "FA", descriptor = "(IILea;II)V")
    private final native void method2803(int arg0, int arg1, class113 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "YA", descriptor = "(IIIII)V")
    public final native void method353(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!xa", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method371(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!xa", name = "qa", descriptor = "()I")
    public final native int method378();

    @OriginalMember(owner = "client!xa", name = "DA", descriptor = "(Lh;Lba;[I[BIIII)V")
    private final native void method2804(class373 arg0, class498 arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7);
}
