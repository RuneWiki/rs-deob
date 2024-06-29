import jaggl.OpenGL;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class516 extends class107 implements class372 {

    @OriginalMember(owner = "client!mw", name = "G", descriptor = "I")
    private int field7296 = -1;

    @OriginalMember(owner = "client!mw", name = "N", descriptor = "I")
    private int field7302 = -1;

    @OriginalMember(owner = "client!mw", name = "I", descriptor = "I")
    public int field7297;

    @OriginalMember(owner = "client!mw", name = "F", descriptor = "I")
    public int field7295;

    @OriginalMember(owner = "client!mw", name = "A", descriptor = "Lqfa;")
    private class106 field7290;

    @OriginalMember(owner = "client!mw", name = "y", descriptor = "I")
    private int field7288;

    @OriginalMember(owner = "client!mw", name = "D", descriptor = "I")
    private int field7293;

    @OriginalMember(owner = "client!mw", name = "B", descriptor = "I")
    private int field7291;

    @OriginalMember(owner = "client!mw", name = "K", descriptor = "Z")
    public static boolean field7299 = false;

    @OriginalMember(owner = "client!mw", name = "z", descriptor = "I")
    public static int field7289;

    @OriginalMember(owner = "client!mw", name = "C", descriptor = "I")
    public static int field7292;

    @OriginalMember(owner = "client!mw", name = "J", descriptor = "I")
    public static int field7298;

    @OriginalMember(owner = "client!mw", name = "L", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!mw", name = "M", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!mw", name = "O", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!mw", name = "E", descriptor = "[B")
    public static byte[] field7294;

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;B)V")
    public static final void method3109(File arg0, String arg1, byte arg2) {
        field7298++;
        if (arg2 != 20) {
            method3111(null, 2, -123, 97, 75, 96);
        }
        class123.field1921.put(arg1, arg0);
    }

    @OriginalMember(owner = "client!mw", name = "d", descriptor = "(I)V")
    public static void method3110(int arg0) {
        if (arg0 == 13492) {
            field7294 = null;
        }
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(Lje;IIIII)V")
    public static final void method3111(class421 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class562.field7990 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class81.field902) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class48.field615 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class46 var14 = class767.field10562[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class208.field3219[var11].method1904(var13, (byte) 91, var12) + class208.field3219[var11].method1904(var13, (byte) -128, var12 + 1) + class208.field3219[var11].method1904(var13 + 1, (byte) -120, var12) + class208.field3219[var11].method1904(var13 + 1, (byte) -121, var12 + 1)) / 4 - (class208.field3219[arg1].method1904(arg3, (byte) -127, arg2) + class208.field3219[arg1].method1904(arg3, (byte) 107, arg2 + 1) + class208.field3219[arg1].method1904(arg3 + 1, (byte) -1, arg2) + class208.field3219[arg1].method1904(arg3 + 1, (byte) 5, arg2 + 1)) / 4;
                                    class613 var16 = var14.field582;
                                    class613 var17 = var14.field589;
                                    if (var16 != null && var16.method910(true)) {
                                        arg0.method905(var6, var16, 0, (var13 - arg3) * class109.field1611 + (1 - arg5) * class556.field7931, (var12 - arg2) * class109.field1611 + (1 - arg4) * class556.field7931, class228.field3494, var15);
                                    }
                                    if (var17 != null && var17.method910(true)) {
                                        arg0.method905(var6, var17, 0, (var13 - arg3) * class109.field1611 + (1 - arg5) * class556.field7931, (var12 - arg2) * class109.field1611 + (1 - arg4) * class556.field7931, class228.field3494, var15);
                                    }
                                    for (class48 var18 = var14.field586; var18 != null; var18 = var18.field611) {
                                        class672 var19 = var18.field605;
                                        if (var19 != null && var19.method910(true) && (var19.field9368 == var12 || var7 == var12) && (var19.field9364 == var13 || var9 == var13)) {
                                            int var20 = var19.field9371 + 1 - var19.field9368;
                                            int var21 = var19.field9360 + 1 - var19.field9364;
                                            arg0.method905(var6, var19, 0, (var19.field9364 - arg3) * class109.field1611 + (var21 - arg5) * class556.field7931, (var19.field9368 - arg2) * class109.field1611 + (var20 - arg4) * class556.field7931, class228.field3494, var15);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!mw", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method3113(-48);
        field7292++;
        super.finalize();
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(IIB)V")
    public final void method3112(int arg0, int arg1, byte arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg1, 36161, this.field7293);
        if (arg2 != 57) {
            method3110(28);
        }
        field7300++;
        this.field7296 = arg0;
        this.field7302 = arg1;
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lqfa;III)V")
    public class516(class106 arg0, int arg1, int arg2, int arg3) {
        this.field7297 = arg2;
        this.field7295 = arg3;
        this.field7290 = arg0;
        this.field7288 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class458.field6417, 0);
        this.field7293 = class458.field6417[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7293);
        OpenGL.glRenderbufferStorageEXT(36161, this.field7288, this.field7297, this.field7295);
        this.field7291 = this.field7297 * this.field7295 * this.field7290.method814(this.field7288, (byte) -128);
    }

    @OriginalMember(owner = "client!mw", name = "a", descriptor = "(I)V")
    public final void method1319(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field7296, this.field7302, 36161, 0);
        if (arg0 != -17115) {
            this.field7288 = -104;
        }
        field7303++;
        this.field7302 = -1;
        this.field7296 = -1;
    }

    @OriginalMember(owner = "client!mw", name = "e", descriptor = "(I)V")
    public final void method3113(int arg0) {
        if (arg0 > -8) {
            return;
        }
        field7289++;
        if (this.field7293 > 0) {
            this.field7290.method811(this.field7293, (byte) 14, this.field7291);
            this.field7293 = 0;
        }
    }

    @OriginalMember(owner = "client!mw", name = "<init>", descriptor = "(Lqfa;IIII)V")
    public class516(class106 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field7288 = arg1;
        this.field7290 = arg0;
        this.field7295 = arg3;
        this.field7297 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class458.field6417, 0);
        this.field7293 = class458.field6417[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field7293);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field7288, this.field7297, this.field7295);
        this.field7291 = this.field7295 * this.field7297 * this.field7290.method814(this.field7288, (byte) -128);
    }
}
