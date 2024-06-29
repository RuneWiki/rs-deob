import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class173 extends class88 implements class665 {

    @OriginalMember(owner = "client!tba", name = "C", descriptor = "I")
    private int field2295;

    @OriginalMember(owner = "client!tba", name = "A", descriptor = "I")
    private int field2293;

    @OriginalMember(owner = "client!tba", name = "y", descriptor = "I")
    private int field2291;

    @OriginalMember(owner = "client!tba", name = "w", descriptor = "Ljb;")
    public static class519 field2289 = new class519(109, 8);

    @OriginalMember(owner = "client!tba", name = "B", descriptor = "Ljb;")
    public static class519 field2294 = new class519(73, 12);

    @OriginalMember(owner = "client!tba", name = "D", descriptor = "Lmw;")
    public static class517 field2296 = new class517(58, -1);

    @OriginalMember(owner = "client!tba", name = "x", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!tba", name = "z", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(ILmq;)I", line = 9)
    public static final int method1195(int arg0, class534 arg1) {
        ++field2292;
        if (arg0 != -21575) {
            method1195(96, (class534) null);
        }
        if (class790.field10851 != arg1) {
            if (class264.field3887 == arg1) {
                return 34167;
            } else if (class417.field6010 == arg1) {
                return 34168;
            } else if (class64.field840 == arg1) {
                return 34166;
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            return 5890;
        }
    }

    @OriginalMember(owner = "client!tba", name = "<init>", descriptor = "(Lsha;Lg;III[B)V", line = 36)
    public class173(class757 arg0, class166 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class415.field5986, arg2 * arg4 * arg3, false);
        this.field2295 = arg3;
        this.field2293 = arg4;
        this.field2291 = arg2;
        super.field1258.method3882(0, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field1243, 0, this.method711(-98), this.field2291, this.field2295, this.field2293, 0, class350.method2238((byte) 79, super.field1249), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!tba", name = "a", descriptor = "(Z)V", line = 51)
    public static void method1196(boolean arg0) {
        if (arg0) {
            method1196(true);
        }
        field2294 = null;
        field2296 = null;
        field2289 = null;
    }
}
