import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class15 extends class529 implements class276 {

    @OriginalMember(owner = "client!n", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!n", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() {
        class379.method2355(4650, this);
    }

    @OriginalMember(owner = "client!n", name = "V", descriptor = "(III)V", line = 9)
    public final void method94(int arg0, int arg1, int arg2) {
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IILea;II)V", line = 23)
    public final void method103(int arg0, int arg1, class381 arg2, int arg3, int arg4) {
        this.method95(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(FFFFFFLea;II)V", line = 31)
    public final void method107(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8) {
        this.method98(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lh;Lba;[IIIII)V", line = 37)
    public class15(class469 arg0, class262 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method101(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(Lh;Lba;IIII)V", line = 40)
    public class15(class469 arg0, class262 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method108(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!n", name = "na", descriptor = "(IILea;II)V")
    private final native void method95(int arg0, int arg1, class381 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!n", name = "UA", descriptor = "()I")
    public final native int method96();

    @OriginalMember(owner = "client!n", name = "W", descriptor = "(IIIIII)V")
    public final native void method97(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "ya", descriptor = "()V")
    public final native void method59();

    @OriginalMember(owner = "client!n", name = "EA", descriptor = "(FFFFFFLea;II)V")
    private final native void method98(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class381 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!n", name = "ka", descriptor = "(IIII)V")
    public final native void method99(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!n", name = "ja", descriptor = "()I")
    public final native int method100();

    @OriginalMember(owner = "client!n", name = "w", descriptor = "(Lh;Lba;[IIIII)V")
    private final native void method101(class469 arg0, class262 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!n", name = "YA", descriptor = "(IIIII)V")
    public final native void method102(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!n", name = "JA", descriptor = "()I")
    public final native int method104();

    @OriginalMember(owner = "client!n", name = "M", descriptor = "(IIIIIII)V")
    public final native void method105(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!n", name = "aa", descriptor = "(FFFFFFIII)V")
    public final native void method106(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!n", name = "ia", descriptor = "(Lh;Lba;IIII)V")
    private final native void method108(class469 arg0, class262 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!n", name = "qa", descriptor = "()I")
    public final native int method109();

    @OriginalMember(owner = "client!n", name = "D", descriptor = "(IIIIIII)V")
    public final native void method110(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);
}
