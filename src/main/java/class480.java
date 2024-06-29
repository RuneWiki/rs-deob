import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class480 extends class551 implements class250 {

    @OriginalMember(owner = "client!kh", name = "w", descriptor = "I")
    private int field7280 = -1;

    @OriginalMember(owner = "client!kh", name = "A", descriptor = "I")
    private int field7284 = -1;

    @OriginalMember(owner = "client!kh", name = "B", descriptor = "I")
    public int field7285;

    @OriginalMember(owner = "client!kh", name = "x", descriptor = "I")
    public int field7281;

    @OriginalMember(owner = "client!kh", name = "v", descriptor = "I")
    private int field7279;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "Los;")
    private class468 field7277;

    @OriginalMember(owner = "client!kh", name = "J", descriptor = "I")
    private int field7292;

    @OriginalMember(owner = "client!kh", name = "z", descriptor = "I")
    private int field7283;

    @OriginalMember(owner = "client!kh", name = "y", descriptor = "Lqu;")
    public static class364 field7282 = new class364(33, 7);

    @OriginalMember(owner = "client!kh", name = "G", descriptor = "Z")
    public static boolean field7290 = false;

    @OriginalMember(owner = "client!kh", name = "I", descriptor = "I")
    public static int field7291 = 1337;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "I")
    public static int field7276;

    @OriginalMember(owner = "client!kh", name = "u", descriptor = "I")
    public static int field7278;

    @OriginalMember(owner = "client!kh", name = "C", descriptor = "I")
    public static int field7286;

    @OriginalMember(owner = "client!kh", name = "D", descriptor = "I")
    public static int field7287;

    @OriginalMember(owner = "client!kh", name = "E", descriptor = "I")
    public static int field7288;

    @OriginalMember(owner = "client!kh", name = "F", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "(I)V", line = 7)
    public static void method2909(int arg0) {
        if (arg0 != 13282) {
            field7291 = -83;
        }
        field7282 = null;
    }

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "(I)V", line = 18)
    public static final void method2910(int arg0) {
        field7286++;
        if (arg0 != 17082) {
            field7282 = null;
        }
        if (class395.field5743 == 6) {
            class395.field5743 = 7;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(B)V", line = 34)
    public final void method2911(byte arg0) {
        if (this.field7292 > 0) {
            this.field7277.method2848(this.field7292, this.field7283, -91);
            this.field7292 = 0;
        }
        field7287++;
        if (arg0 <= 60) {
            field7290 = false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Los;III)V", line = 192)
    public class480(class468 arg0, int arg1, int arg2, int arg3) {
        this.field7285 = arg3;
        this.field7281 = arg2;
        this.field7279 = arg1;
        this.field7277 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class622.field9106, 0);
        this.field7292 = class622.field9106[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7292);
        OpenGL.glRenderbufferStorageEXT(36161, this.field7279, this.field7281, this.field7285);
        this.field7283 = this.field7281 * this.field7285 * this.field7277.method2777(true, this.field7279);
    }

    @OriginalMember(owner = "client!kh", name = "<init>", descriptor = "(Los;IIII)V", line = 207)
    public class480(class468 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7285 = arg3;
        this.field7277 = arg0;
        this.field7279 = arg1;
        this.field7281 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class622.field9106, 0);
        this.field7292 = class622.field9106[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7292);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field7279, this.field7281, this.field7285);
        this.field7283 = this.field7285 * this.field7281 * this.field7277.method2777(true, this.field7279);
    }

    @OriginalMember(owner = "client!kh", name = "finalize", descriptor = "()V", line = 55)
    protected final void finalize() throws Throwable {
        field7278++;
        this.method2911((byte) 114);
        super.finalize();
    }

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "(I)V", line = 67)
    public static final void method2912(int arg0) {
        class49.field573.method2024((byte) -82);
        if (arg0 != 1) {
            method2913(-116, -110);
        }
        field7276++;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)V", line = 79)
    public static final void method2913(int arg0, int arg1) {
        class88 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class543 var4 = class562.field8337[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class366.field5271; var5++) {
                    for (int var6 = 0; var6 < class331.field4909; var6++) {
                        var2 = var4.method1329(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class179.field2726;
                            int var8 = var5 << class179.field2726;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class543 var10 = class562.field8337[var9];
                                if (var10 != null) {
                                    int var11 = var4.method1319(var6, var5) - var10.method1319(var6, var5);
                                    int var12 = var4.method1319(var6 + 1, var5) - var10.method1319(var6 + 1, var5);
                                    int var13 = var4.method1319(var6 + 1, var5 + 1) - var10.method1319(var6 + 1, var5 + 1);
                                    int var14 = var4.method1319(var6, var5 + 1) - var10.method1319(var6, var5 + 1);
                                    var10.method1322(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIZ)V", line = 150)
    public final void method2914(int arg0, int arg1, boolean arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.field7292);
        field7289++;
        if (!arg2) {
            this.field7292 = 87;
        }
        this.field7284 = arg0;
        this.field7280 = arg1;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)V", line = 172)
    public final void method1363(byte arg0) {
        field7288++;
        OpenGL.glFramebufferRenderbufferEXT(this.field7284, this.field7280, 36161, 0);
        this.field7280 = -1;
        if (arg0 != -19) {
            this.field7292 = 83;
        }
        this.field7284 = -1;
    }
}
