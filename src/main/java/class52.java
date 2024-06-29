import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class52 {

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    private int field780;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Lwp;")
    public static class453 field779 = new class453(71, 8);

    @OriginalMember(owner = "client!fb", name = "j", descriptor = "[Lon;")
    public static class651[] field784 = new class651[8];

    @OriginalMember(owner = "client!fb", name = "i", descriptor = "[[B")
    public static byte[][] field783 = new byte[1000][];

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "F")
    public static float field777;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "I")
    public static int field782;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)V", line = 7)
    public final void method331(int arg0, int arg1) {
        field781++;
        OpenGL.glNewList(this.field780 + arg0, 4864);
        if (arg1 != 0) {
            method334(119);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V", line = 18)
    public final void method332(byte arg0) {
        OpenGL.glEndList();
        field776++;
        if (arg0 < 31) {
            this.method331(53, 2);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IC)V", line = 29)
    public final void method333(int arg0, char arg1) {
        field778++;
        OpenGL.glCallList(this.field780 + arg1);
        if (arg0 != -29240) {
            field783 = null;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)I", line = 41)
    public static final int method334(int arg0) {
        int var1 = -1;
        for (int var2 = 0; var2 < class257.field3128 - 1; var2++) {
            if (arg0 < class678.field9517[var2] + class204.field2596[var2]) {
                var1 = var2;
                break;
            }
        }
        if (var1 == -1) {
            var1 = class257.field3128 - 1;
        }
        return var1;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IILqj;B[I[I)Lhj;", line = 64)
    public static final class268 method335(int arg0, int arg1, class548 arg2, byte arg3, int[] arg4, int[] arg5) {
        if (arg3 != 96) {
            method336(58);
        }
        field782++;
        byte[] var6 = new byte[arg0 * arg1];
        for (int var7 = 0; var7 < arg1; var7++) {
            int var8 = arg0 * var7 + arg5[var7];
            for (int var9 = 0; var9 < arg4[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class268(arg2, arg0, arg1, var6);
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(I)V", line = 96)
    public static final void method336(int arg0) {
        class436.field5441 = arg0;
        for (int var1 = 0; var1 < class429.field5383; var1++) {
            for (int var2 = 0; var2 < class37.field508; var2++) {
                if (class270.field3423[arg0][var1][var2] == null) {
                    class270.field3423[arg0][var1][var2] = new class75(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "<init>", descriptor = "(Lqj;I)V", line = 124)
    public class52(class548 arg0, int arg1) {
        this.field780 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(I)V", line = 139)
    public static void method337(int arg0) {
        field783 = null;
        field779 = null;
        field784 = null;
        if (arg0 != 1) {
            field775 = -7;
        }
    }
}
