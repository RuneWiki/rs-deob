import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class19 {

    @OriginalMember(owner = "client!ub", name = "d", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "[F")
    public static float[] field188 = new float[16384];

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "[F")
    public static float[] field189 = new float[16384];

    @OriginalMember(owner = "client!ub", name = "f", descriptor = "Lkca;")
    public static class73 field192;

    @OriginalMember(owner = "client!ub", name = "h", descriptor = "Ljava/util/Random;")
    public static Random field194;

    @OriginalMember(owner = "client!ub", name = "i", descriptor = "Ljava/lang/String;")
    public static String field195;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "I")
    public static int field187;

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "I")
    public static int field191;

    @OriginalMember(owner = "client!ub", name = "g", descriptor = "I")
    public static int field193;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field189[var2] = (float) Math.sin((double) var2 * var0);
            field188[var2] = (float) Math.cos((double) var2 * var0);
        }
        field192 = new class73(30, 7);
        field194 = new Random();
        field195 = null;
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(BI)V", line = 3)
    public final void method121(byte arg0, int arg1) {
        if (arg0 == -18) {
            OpenGL.glNewList(this.field190 + arg1, 4864);
            field191++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(CB)V", line = 15)
    public final void method122(char arg0, byte arg1) {
        if (arg1 > 12) {
            OpenGL.glCallList(this.field190 + arg0);
            field187++;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(I)V", line = 29)
    public static void method123(int arg0) {
        field195 = null;
        field194 = null;
        if (arg0 > -87) {
            field195 = null;
        }
        field188 = null;
        field189 = null;
        field192 = null;
    }

    @OriginalMember(owner = "client!ub", name = "b", descriptor = "(I)V", line = 56)
    public final void method124(int arg0) {
        if (arg0 != 7) {
            field189 = null;
        }
        OpenGL.glEndList();
        field193++;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "(Lad;I)V", line = 88)
    public class19(class362 arg0, int arg1) {
        this.field190 = OpenGL.glGenLists(arg1);
    }
}
