import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class359 {

    @OriginalMember(owner = "client!hv", name = "c", descriptor = "Lwj;")
    public static class270 field5231 = new class270(10, -1);

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field5234 = 2;

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "Lmn;")
    public static class247 field5235 = new class247(512);

    @OriginalMember(owner = "client!hv", name = "h", descriptor = "Z")
    public static boolean field5236 = false;

    @OriginalMember(owner = "client!hv", name = "i", descriptor = "Lwj;")
    public static class270 field5237 = new class270(55, 6);

    @OriginalMember(owner = "client!hv", name = "k", descriptor = "[I")
    public static int[] field5239 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!hv", name = "j", descriptor = "Lqp;")
    public static class466 field5238 = new class466("Checking for updates - ", "Suche nach Updates - ", "Vérification des mises à jour - ", "Verificando atualizações - ");

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!hv", name = "b", descriptor = "I")
    public static int field5230;

    @OriginalMember(owner = "client!hv", name = "d", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(II)I", line = 3)
    public static final int method2149(int arg0, int arg1) {
        if (arg1 != 4) {
            method2151((byte) 108, 52, -20, 96, -48);
        }
        field5230++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljava/lang/String;IILef;)Lkm;", line = 38)
    public static final class236 method2150(String arg0, int arg1, int arg2, class338 arg3) {
        field5233++;
        int var4 = OpenGL.glGenProgramARB();
        OpenGL.glBindProgramARB(arg2, var4);
        OpenGL.glProgramStringARB(arg2, 34933, arg0);
        OpenGL.glGetIntegerv(34379, class445.field6558, 0);
        if (class445.field6558[0] != -1) {
            OpenGL.glBindProgramARB(arg2, 0);
            return null;
        }
        OpenGL.glBindProgramARB(arg2, 0);
        if (arg1 != 22908) {
            method2152(123);
        }
        return new class236(arg3, arg2, var4);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(BIIII)I", line = 66)
    public static final int method2151(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field5232++;
        int var5 = 9 % ((arg0 + 21) / 46);
        int var6 = arg3 & 0xF;
        int var7 = var6 >= 8 ? arg1 : arg4;
        int var8 = var6 >= 4 ? (var6 == 12 || var6 == 14 ? arg4 : arg2) : arg1;
        return ((var6 & 0x1) == 0 ? var7 : -var7) + ((var6 & 0x2) == 0 ? var8 : -var8);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(I)V", line = 83)
    public static void method2152(int arg0) {
        field5238 = null;
        int var1 = 42 / ((17 - arg0) / 36);
        field5235 = null;
        field5239 = null;
        field5231 = null;
        field5237 = null;
    }
}
