import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class290 extends class378 implements class556 {

    @OriginalMember(owner = "client!ja", name = "nativeid", descriptor = "J")
    public long nativeid;

    @OriginalMember(owner = "client!ja", name = "AA", descriptor = "(JZ)V")
    private final native void method1936(long arg0, boolean arg1);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)V")
    public final void method1937(int arg0) {
        this.method1949(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IIIIII)V")
    public final void method1938(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1947(this.nativeid, arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ja", name = "e", descriptor = "(I)V")
    public final void method1939(int arg0) {
        this.method1941(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "g", descriptor = "(I)V")
    public final void method1940(int arg0) {
        this.method1964(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.nativeid != 0L) {
            class349.method2206(37, this);
        }
    }

    @OriginalMember(owner = "client!ja", name = "t", descriptor = "(JI)V")
    private final native void method1941(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(I)V")
    public final void method1942(int arg0) {
        this.method1954(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(JIII[I)V")
    private final native void method1943(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(J[I)V")
    private final native void method1944(long arg0, int[] arg1);

    @OriginalMember(owner = "client!ja", name = "la", descriptor = "()V")
    private final native void method1945();

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class290() {
        this.method1945();
    }

    @OriginalMember(owner = "client!ja", name = "VA", descriptor = "(JI)V")
    private final native void method1946(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "P", descriptor = "(JIIIIII)V")
    private final native void method1947(long arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6);

    @OriginalMember(owner = "client!ja", name = "w", descriptor = "(Z)V")
    public final void method156(boolean arg0) {
        this.method1936(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "FA", descriptor = "(JIII)V")
    private final native void method1948(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "m", descriptor = "(JI)V")
    private final native void method1949(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(Leh;)V")
    public final void method1950(class378 arg0) {
        this.method1960(this.nativeid, ((class290) arg0).nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "()Leh;")
    public final class378 method1951() {
        class290 var1 = new class290();
        var1.method1950(this);
        return var1;
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III)V")
    public final void method1952(int arg0, int arg1, int arg2) {
        this.method1967(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "va", descriptor = "(JIII[I)V")
    private final native void method1953(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "za", descriptor = "(JI)V")
    private final native void method1954(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "J", descriptor = "(JI)V")
    private final native void method1955(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "()V")
    public final void method1956() {
        this.method1963(this.nativeid);
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(I)V")
    public final void method1957(int arg0) {
        this.method1955(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "XA", descriptor = "(JIII[I)V")
    private final native void method1958(long arg0, int arg1, int arg2, int arg3, int[] arg4);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III)V")
    public final void method1959(int arg0, int arg1, int arg2) {
        this.method1948(this.nativeid, arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!ja", name = "l", descriptor = "(JJ)V")
    private final native void method1960(long arg0, long arg1);

    @OriginalMember(owner = "client!ja", name = "b", descriptor = "(III[I)V")
    public final void method1961(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1953(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "([I)V")
    public final void method1962(int[] arg0) {
        this.method1944(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "u", descriptor = "(J)V")
    private final native void method1963(long arg0);

    @OriginalMember(owner = "client!ja", name = "NA", descriptor = "(JI)V")
    private final native void method1964(long arg0, int arg1);

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(III[I)V")
    public final void method1965(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1958(this.nativeid, arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!ja", name = "f", descriptor = "(I)V")
    public final void method1966(int arg0) {
        this.method1946(this.nativeid, arg0);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(JIII)V")
    private final native void method1967(long arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(III[I)V")
    public final void method1968(int arg0, int arg1, int arg2, int[] arg3) {
        this.method1943(this.nativeid, arg0, arg1, arg2, arg3);
    }
}
