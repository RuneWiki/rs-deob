import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class518 {

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    private int field6974;

    @OriginalMember(owner = "client!fo", name = "g", descriptor = "I")
    public static int field6977 = -1;

    @OriginalMember(owner = "client!fo", name = "h", descriptor = "Z")
    public static boolean field6978 = false;

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "I")
    public static int field6972;

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field6973;

    @OriginalMember(owner = "client!fo", name = "e", descriptor = "I")
    public static int field6975;

    @OriginalMember(owner = "client!fo", name = "f", descriptor = "I")
    public static int field6976;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "Lca;")
    public static class308 field6971;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(B)V", line = 3)
    public final void method2851(byte arg0) {
        int var2 = 86 % ((arg0 - 9) / 40);
        field6976++;
        OpenGL.glEndList();
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(II)V", line = 15)
    public final void method2852(int arg0, int arg1) {
        if (arg1 == -30389) {
            OpenGL.glNewList(this.field6974 + arg0, 4864);
            field6972++;
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(CZ)V", line = 29)
    public final void method2853(char arg0, boolean arg1) {
        field6973++;
        OpenGL.glCallList(this.field6974 + arg0);
        if (arg1) {
            method2854(true);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(Z)V", line = 42)
    public static void method2854(boolean arg0) {
        if (!arg0) {
            method2854(true);
        }
        field6971 = null;
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIBI)V", line = 53)
    public static final void method2855(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        field6975++;
        int var6 = arg2 - arg1;
        int var7 = arg3 - arg5;
        if (var7 == 0) {
            if (var6 != 0) {
                class185.method1040(arg5, (byte) -123, arg0, arg1, arg2);
            }
        } else if (var6 == 0) {
            class505.method2816((byte) -83, arg0, arg5, arg3, arg1);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var7 < var6;
            if (var8) {
                int var9 = arg5;
                arg5 = arg1;
                int var10 = arg3;
                arg3 = arg2;
                arg1 = var9;
                arg2 = var10;
            }
            if (arg3 < arg5) {
                int var11 = arg5;
                int var12 = arg1;
                arg5 = arg3;
                arg3 = var11;
                arg1 = arg2;
                arg2 = var12;
            }
            if (arg4 <= -21) {
                int var13 = arg1;
                int var14 = arg3 - arg5;
                int var15 = arg2 - arg1;
                int var16 = -(var14 >> 1);
                int var17 = arg1 < arg2 ? 1 : -1;
                if (var15 < 0) {
                    var15 = -var15;
                }
                if (var8) {
                    for (int var19 = arg5; var19 <= arg3; var19++) {
                        var16 += var15;
                        class300.field4036[var19][var13] = arg0;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                } else {
                    for (int var18 = arg5; var18 <= arg3; var18++) {
                        var16 += var15;
                        class300.field4036[var13][var18] = arg0;
                        if (var16 > 0) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fo", name = "<init>", descriptor = "(Lac;I)V", line = 172)
    public class518(class541 arg0, int arg1) {
        this.field6974 = OpenGL.glGenLists(arg1);
    }
}
