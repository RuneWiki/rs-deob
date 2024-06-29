import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uq")
public class class458 {

    @OriginalMember(owner = "client!uq", name = "c", descriptor = "I")
    private int field6579;

    @OriginalMember(owner = "client!uq", name = "h", descriptor = "Leda;")
    public static class116 field6584 = new class116(4, 6);

    @OriginalMember(owner = "client!uq", name = "b", descriptor = "I")
    public static int field6578;

    @OriginalMember(owner = "client!uq", name = "d", descriptor = "I")
    public static int field6580;

    @OriginalMember(owner = "client!uq", name = "e", descriptor = "I")
    public static int field6581;

    @OriginalMember(owner = "client!uq", name = "f", descriptor = "I")
    public static int field6582;

    @OriginalMember(owner = "client!uq", name = "g", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "Ljava/lang/String;")
    public static String field6577;

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IB)V", line = 3)
    public final void method2656(int arg0, byte arg1) {
        OpenGL.glNewList(this.field6579 + arg0, 4864);
        if (arg1 == 76) {
            field6578++;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I)V", line = 17)
    public final void method2657(int arg0) {
        if (arg0 == 0) {
            field6582++;
            OpenGL.glEndList();
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(IC)V", line = 32)
    public final void method2658(int arg0, char arg1) {
        OpenGL.glCallList(this.field6579 + arg1);
        field6581++;
        if (arg0 != 0) {
            method2659(true);
        }
    }

    @OriginalMember(owner = "client!uq", name = "<init>", descriptor = "(Lkfa;I)V", line = 45)
    public class458(class382 arg0, int arg1) {
        this.field6579 = OpenGL.glGenLists(arg1);
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(Z)V", line = 59)
    public static void method2659(boolean arg0) {
        field6577 = null;
        field6584 = null;
        if (!arg0) {
            method2661(-76, null, null, 72);
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(III)Z", line = 70)
    public static final boolean method2660(int arg0, int arg1, int arg2) {
        field6580++;
        if (arg2 == -30199) {
            return (arg1 & 0x580) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!uq", name = "a", descriptor = "(I[ILd;I)V", line = 81)
    public static final void method2661(int arg0, int[] arg1, class88 arg2, int arg3) {
        if (arg2.field2438 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field2438.length; var5++) {
                if (arg2.field2438[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field2371 != -1) {
                class606 var6 = class480.field6871.method1417(-3585, arg2.field2371);
                int var7 = var6.field8710;
                if (var7 == 1) {
                    arg2.field2378 = arg0;
                    arg2.field2444 = 0;
                    arg2.field2423 = 0;
                    arg2.field2428 = 1;
                    arg2.field2358 = 0;
                    if (!arg2.field2389) {
                        class150.method1144(arg2.field2444, (byte) 47, arg2, var6);
                    }
                }
                if (var7 == 2) {
                    arg2.field2358 = 0;
                }
            }
        }
        field6583++;
        if (arg3 != -1) {
            field6584 = null;
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg2.field2438 == null || arg2.field2438[var9] == -1 || class480.field6871.method1417(arg3 ^ 0xE00, arg1[var9]).field8716 >= class480.field6871.method1417(-3585, arg2.field2438[var9]).field8716) {
                arg2.field2438 = arg1;
                arg2.field2462 = arg2.field2452;
                arg2.field2378 = arg0;
            }
        }
        if (var8) {
            arg2.field2438 = arg1;
            arg2.field2378 = arg0;
            arg2.field2462 = arg2.field2452;
        }
    }
}
