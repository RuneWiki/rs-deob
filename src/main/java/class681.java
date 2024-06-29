import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class681 extends class710 {

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    private int field9381;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
    public static int field9384 = 0;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "Z")
    public static volatile boolean field9383 = true;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field9382;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field9385;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field9386;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "I")
    public static int field9387;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public static int field9388;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public static int field9389;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Z")
    public static final boolean method3742(int arg0, int arg1, int arg2) {
        if (arg2 != 12382) {
            return true;
        } else {
            ++field9382;
            return (arg0 & 52) != 0;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)V")
    public final void method1502(byte arg0) {
        if (arg0 >= 33) {
            ++field9385;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIIFZIIZ)[I")
    public static final int[] method3743(int arg0, int arg1, int arg2, float arg3, boolean arg4, int arg5, int arg6, boolean arg7) {
        ++field9389;
        if (!arg7) {
            return null;
        } else {
            int[] var8 = new int[arg1];
            class240 var9 = new class240();
            var9.field3229 = (int) (arg3 * 4096.0F);
            var9.field3232 = arg6;
            var9.field3237 = arg5;
            var9.field3224 = arg0;
            var9.field3236 = arg2;
            var9.field3231 = arg4;
            var9.method618((byte) 63);
            class44.method418(1, arg1, -1);
            var9.method1515(var8, (byte) 47, 0);
            return var8;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(BZ)V")
    public final void method3744(byte arg0, boolean arg1) {
        if (arg0 > -77) {
            this.field9381 = 99;
        }
        ++field9388;
        super.field9933.method3388(this, false);
        OpenGL.glTexParameteri(super.field9928, 10242, !arg1 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!ak", name = "<init>", descriptor = "(Lji;II[BI)V")
    public class681(class622 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field9381 = arg2;
        super.field9933.method3388(this, false);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field9928, 0, super.field9923, this.field9381, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3905(true, true);
    }
}
