import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class222 {

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "I")
    private int field2873;

    @OriginalMember(owner = "client!ik", name = "j", descriptor = "Ljb;")
    public static class519 field2882 = new class519(39, 4);

    @OriginalMember(owner = "client!ik", name = "k", descriptor = "Lvba;")
    public static class45 field2883 = new class45();

    @OriginalMember(owner = "client!ik", name = "l", descriptor = "Lgm;")
    public static class134 field2884 = new class134("LIVE", "", "", 0);

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!ik", name = "d", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!ik", name = "h", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!ik", name = "i", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "Lrc;")
    public static class564 field2875;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(CI)V")
    public final void method1413(char arg0, int arg1) {
        field2879++;
        OpenGL.glCallList(this.field2873 + arg0);
        if (arg1 != 0) {
            method1414(false, 72);
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "(Llf;I)V")
    public class222(class250 arg0, int arg1) {
        this.field2873 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ZI)I")
    public static final int method1414(boolean arg0, int arg1) {
        field2876++;
        return arg0 ? arg1 & 0xFF : -85;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V")
    public static void method1415(byte arg0) {
        field2884 = null;
        field2882 = null;
        field2883 = null;
        if (arg0 >= -109) {
            method1417(16, -123);
        }
        field2875 = null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(II)V")
    public final void method1416(int arg0, int arg1) {
        OpenGL.glNewList(this.field2873 + arg0, 4864);
        if (arg1 != -28867) {
            method1415((byte) 82);
        }
        field2874++;
    }

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(II)Laka;")
    public static final class86 method1417(int arg0, int arg1) {
        field2878++;
        if (arg1 != 4975) {
            method1419(40, null, false, false);
        }
        class86[] var2 = class375.method2355(-126);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class86 var4 = var2[var3];
            if (var4.field1217 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(I)V")
    public final void method1418(int arg0) {
        if (arg0 == 4864) {
            OpenGL.glEndList();
            field2880++;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILha;ZZ)Lma;")
    public static final class14 method1419(int arg0, class66 arg1, boolean arg2, boolean arg3) {
        field2881++;
        if (arg0 == -1) {
            return null;
        }
        if (class436.field6312 != null) {
            for (int var4 = 0; var4 < class436.field6312.length; var4++) {
                if (class436.field6312[var4] == arg0) {
                    return class743.field10052[var4];
                }
            }
        }
        class14 var5 = (class14) class737.field10007.method3109((byte) 121, (long) arg0);
        if (var5 != null) {
            if (arg3 && var5.field141 == null) {
                class651 var6 = class588.method3309(arg2, arg0, class220.field2857);
                if (var6 == null) {
                    return null;
                }
                var5.field141 = var6;
            }
            return var5;
        }
        class162[] var7 = class162.method1124(class574.field7828, arg0);
        if (var7 == null) {
            return null;
        }
        class651 var8 = class588.method3309(arg2, arg0, class220.field2857);
        if (var8 == null) {
            return null;
        }
        class14 var9;
        if (arg3) {
            var9 = new class14(arg1.method502(var8, var7, true), var8);
        } else {
            var9 = new class14(arg1.method502(var8, var7, true));
        }
        class737.field10007.method3108((long) arg0, 16337, var9);
        return var9;
    }
}
