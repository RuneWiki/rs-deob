import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class21 {

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    private int field297;

    @OriginalMember(owner = "client!cn", name = "g", descriptor = "Ljava/lang/String;")
    public static String field303 = "";

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "I")
    public static int field306 = 2;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field299;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!cn", name = "i", descriptor = "I")
    public static int field305;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(CI)V")
    public final void method118(char arg0, int arg1) {
        field298++;
        if (arg1 != 0) {
            method122(true);
        }
        OpenGL.glCallList(this.field297 + arg0);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILjava/lang/String;IIIII)V")
    public static final void method119(int arg0, int arg1, String arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field305++;
        class263 var8 = new class263();
        var8.field3359 = arg7;
        var8.field3355 = arg4;
        var8.field3353 = class7.field61 + arg5;
        if (arg3 < 48) {
            return;
        }
        var8.field3352 = arg2;
        var8.field3358 = arg6;
        var8.field3361 = arg0;
        var8.field3351 = arg1;
        class374.field5215.method1873(var8, true);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(BI)V")
    public final void method120(byte arg0, int arg1) {
        OpenGL.glNewList(this.field297 + arg1, 4864);
        int var3 = -61 % ((arg0 + 61) / 61);
        field304++;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IIII)I")
    public static final int method121(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg2 & 0x3;
        field299++;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 4095 - arg0;
        } else if (var4 == 2) {
            return 4095 - arg3;
        } else if (arg1 == 8963) {
            return arg0;
        } else {
            return -125;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Z)V")
    public static void method122(boolean arg0) {
        field303 = null;
        if (arg0) {
            field306 = -43;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public final void method123(int arg0) {
        if (arg0 != 4864) {
            this.method120((byte) -80, -53);
        }
        OpenGL.glEndList();
        field300++;
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "(Luq;I)V")
    public class21(class313 arg0, int arg1) {
        this.field297 = OpenGL.glGenLists(arg1);
    }
}
