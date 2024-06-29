import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class99 extends class664 implements class94 {

    @OriginalMember(owner = "client!gi", name = "D", descriptor = "I")
    private int field1208;

    @OriginalMember(owner = "client!gi", name = "I", descriptor = "I")
    private int field1213;

    @OriginalMember(owner = "client!gi", name = "C", descriptor = "I")
    private int field1207;

    @OriginalMember(owner = "client!gi", name = "B", descriptor = "[I")
    public static int[] field1206 = new int[] { 4, 4, 1, 2, 6, 4, 2, 45, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0 };

    @OriginalMember(owner = "client!gi", name = "E", descriptor = "I")
    public static int field1209 = 0;

    @OriginalMember(owner = "client!gi", name = "G", descriptor = "[I")
    public static int[] field1211 = new int[1000];

    @OriginalMember(owner = "client!gi", name = "H", descriptor = "I")
    public static int field1212;

    @OriginalMember(owner = "client!gi", name = "F", descriptor = "Lcb;")
    public static class318 field1210;

    @OriginalMember(owner = "client!gi", name = "A", descriptor = "[I")
    public static int[] field1205;

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lmc;Lnl;III[B)V")
    public class99(class381 arg0, class50 arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        super(arg0, 32879, arg1, class680.field9664, arg2 * arg4 * arg3, false);
        this.field1208 = arg2;
        this.field1213 = arg4;
        this.field1207 = arg3;
        super.field9406.method1884(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field9404, 0, this.method3678(-17641), this.field1208, this.field1207, this.field1213, 0, class54.method313(-111, super.field9405), 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IIILbg;Lbg;)V")
    public static final void method541(int arg0, int arg1, int arg2, class249 arg3, class249 arg4) {
        class651 var5 = class29.method180(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field9238 = arg3;
            var5.field9234 = arg4;
        }
    }

    @OriginalMember(owner = "client!gi", name = "b", descriptor = "(B)V")
    public static void method542(byte arg0) {
        if (arg0 > -93) {
            method542((byte) 27);
        }
        field1211 = null;
        field1205 = null;
        field1206 = null;
        field1210 = null;
    }
}
