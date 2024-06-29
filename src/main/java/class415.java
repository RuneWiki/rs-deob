import jaggl.OpenGL;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class415 extends class386 {

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "I")
    private int field6356;

    @OriginalMember(owner = "client!ci", name = "x", descriptor = "Lsba;")
    public static class200 field6359 = new class200(16);

    @OriginalMember(owner = "client!ci", name = "A", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field6362 = new Rectangle[100];

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "I")
    public static int field6357;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!ci", name = "y", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!ci", name = "z", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!ci", name = "B", descriptor = "I")
    public static int field6363;

    @OriginalMember(owner = "client!ci", name = "C", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public final void method667(int arg0) {
        if (arg0 != 13035) {
            method2645(true);
        }
        ++field6358;
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ler;II[BI)V")
    public class415(class92 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field6356 = arg2;
        super.field6003.method856(false, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field5990, 0, super.field5988, this.field6356, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2509(true, -102);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method2641(boolean arg0, int arg1, int arg2) {
        ++field6364;
        if (arg0 && arg2 >= 0) {
            return arg1 < 113 ? null : class498.method3041(arg2, (byte) -80, 10, arg0);
        } else {
            return Integer.toString(arg2);
        }
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(B)V")
    public static final void method2642(byte arg0) {
        int var1 = -9 / ((arg0 - 34) / 49);
        ++field6357;
        int var2 = (int) ((double) class275.field4426 * 34.46D);
        int var3 = var2 << 2;
        if (class627.field8857.method289()) {
            var3 += 512;
        }
        class627.field8857.method284(200, var3);
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(ZB)V")
    public final void method2643(boolean arg0, byte arg1) {
        ++field6360;
        if (arg1 > -75) {
            this.method2643(true, (byte) -51);
        }
        super.field6003.method856(false, this);
        OpenGL.glTexParameteri(super.field5990, 10242, arg0 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "(II)V")
    public static final void method2644(int arg0, int arg1) {
        ++field6361;
        class413 var2 = class674.method3852(arg0, arg1, 126);
        var2.method2634(arg0 + 1065768927);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(Z)V")
    public static void method2645(boolean arg0) {
        if (arg0) {
            field6359 = null;
            field6362 = null;
        }
    }
}
