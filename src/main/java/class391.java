import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class391 extends class424 implements class89 {

    @OriginalMember(owner = "client!aa", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "()I")
    public final native int method1154();

    @OriginalMember(owner = "client!aa", name = "QA", descriptor = "()I")
    public final native int method1159();

    @OriginalMember(owner = "client!aa", name = "E", descriptor = "(Lda;La;IIII)V")
    private final native void method2331(class682 arg0, class405 arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "va", descriptor = "(IILfa;II)V")
    private final native void method2332(int arg0, int arg1, class185 arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(FFFFFFLfa;II)V")
    public final void method1156(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class185 arg6, int arg7, int arg8) {
        this.method2334(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
    }

    @OriginalMember(owner = "client!aa", name = "ba", descriptor = "(IIIIIII)V")
    public final native void method1161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "H", descriptor = "(Z)V")
    public final native void method80(boolean arg0);

    @OriginalMember(owner = "client!aa", name = "EA", descriptor = "(IIII)V")
    public final native void method1155(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!aa", name = "t", descriptor = "(III)V")
    public final native void method66(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!aa", name = "AA", descriptor = "()I")
    public final native int method1160();

    @OriginalMember(owner = "client!aa", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class146.method989((byte) 89, this);
        }
    }

    @OriginalMember(owner = "client!aa", name = "GA", descriptor = "(IIIIII)V")
    public final native void method68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!aa", name = "I", descriptor = "(IIIII)V")
    public final native void method67(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "()I")
    public final native int method1157();

    @OriginalMember(owner = "client!aa", name = "sa", descriptor = "(FFFFFFIII)V")
    public final native void method1158(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, int arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IILfa;II)V")
    public final void method63(int arg0, int arg1, class185 arg2, int arg3, int arg4) {
        this.method2332(arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;[IIIII)V")
    public class391(class682 arg0, class405 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6) {
        this.method2333(arg0, arg1, arg2, arg3, arg4, arg5, arg6);
    }

    @OriginalMember(owner = "client!aa", name = "KA", descriptor = "(IIIIIII)V")
    public final native void method65(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "WA", descriptor = "(Lda;La;[IIIII)V")
    private final native void method2333(class682 arg0, class405 arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!aa", name = "JA", descriptor = "(FFFFFFLfa;II)V")
    private final native void method2334(float arg0, float arg1, float arg2, float arg3, float arg4, float arg5, class185 arg6, int arg7, int arg8);

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "(Lda;La;IIII)V")
    public class391(class682 arg0, class405 arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method2331(arg0, arg1, arg2, arg3, arg4, arg5);
    }
}
