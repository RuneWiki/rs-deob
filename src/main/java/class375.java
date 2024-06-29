import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class375 extends class405 implements class189 {

    @OriginalMember(owner = "client!nt", name = "z", descriptor = "I")
    private int field5658 = -1;

    @OriginalMember(owner = "client!nt", name = "D", descriptor = "I")
    private int field5662 = -1;

    @OriginalMember(owner = "client!nt", name = "J", descriptor = "I")
    public int field5668;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
    private int field5651;

    @OriginalMember(owner = "client!nt", name = "A", descriptor = "I")
    public int field5659;

    @OriginalMember(owner = "client!nt", name = "x", descriptor = "Lvd;")
    private class258 field5656;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "I")
    private int field5653;

    @OriginalMember(owner = "client!nt", name = "w", descriptor = "I")
    private int field5655;

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "Luv;")
    public static class2 field5652 = new class2(56, 0);

    @OriginalMember(owner = "client!nt", name = "C", descriptor = "I")
    public static int field5661 = 1403;

    @OriginalMember(owner = "client!nt", name = "E", descriptor = "Lgn;")
    public static class526 field5663 = new class526(7, 6);

    @OriginalMember(owner = "client!nt", name = "G", descriptor = "F")
    public static float field5665;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    public static int field5648;

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    public static int field5649;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!nt", name = "y", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!nt", name = "B", descriptor = "I")
    public static int field5660;

    @OriginalMember(owner = "client!nt", name = "F", descriptor = "I")
    public static int field5664;

    @OriginalMember(owner = "client!nt", name = "H", descriptor = "I")
    public static int field5666;

    @OriginalMember(owner = "client!nt", name = "I", descriptor = "I")
    public static int field5667;

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IIIIIZ)Z")
    public static final boolean method2220(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (arg5) {
            return false;
        }
        field5648++;
        for (int var6 = arg2; var6 <= arg3; var6++) {
            for (int var7 = arg0; var7 <= arg4; var7++) {
                if (class211.field3041[var6][var7] == arg1 && class175.field2590[var6][var7] <= 1) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "([BIIIII)Z")
    public static final boolean method2221(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5664++;
        boolean var6 = true;
        class468 var7 = new class468(arg0);
        int var8 = -1;
        label54: while (true) {
            int var9 = var7.method2723((byte) -125);
            if (var9 == 0) {
                int var20 = 90 % ((arg2 + 10) / 56);
                return var6;
            }
            var8 += var9;
            int var10 = 0;
            boolean var11 = false;
            while (true) {
                while (!var11) {
                    int var13 = var7.method2724(255);
                    if (var13 == 0) {
                        continue label54;
                    }
                    var10 += var13 - 1;
                    int var14 = var10 & 0x3F;
                    int var15 = var10 >> 6 & 0x3F;
                    int var16 = var7.method2765(68) >> 2;
                    int var17 = arg1 + var15;
                    int var18 = arg3 + var14;
                    if (var17 > 0 && var18 > 0 && arg5 - 1 > var17 && arg4 - 1 > var18) {
                        class486 var19 = class119.field1824.method248(var8, 30);
                        if (var16 != 22 || class454.field6661.field991 || var19.field7230 != 0 || var19.field7234 == 1 || var19.field7186) {
                            var11 = true;
                            if (!var19.method2904((byte) 107)) {
                                class389.field5863++;
                                var6 = false;
                            }
                        }
                    }
                }
                int var12 = var7.method2724(255);
                if (var12 == 0) {
                    break;
                }
                var7.method2765(64);
            }
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(IBI)V")
    public final void method2222(int arg0, byte arg1, int arg2) {
        field5649++;
        OpenGL.glFramebufferRenderbufferEXT(arg0, arg2, 36161, this.field5653);
        if (arg1 <= 83) {
            method2221(null, 37, -17, -83, 55, 82);
        }
        this.field5658 = arg0;
        this.field5662 = arg2;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ZIII)I")
    public static final int method2223(boolean arg0, int arg1, int arg2, int arg3) {
        field5667++;
        if (arg0) {
            field5663 = null;
        }
        if (arg3 > arg1) {
            return arg3;
        } else if (arg1 <= arg2) {
            return arg1;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(III)I")
    public static final int method2224(int arg0, int arg1, int arg2) {
        if (arg1 > arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        field5666++;
        while (arg1 != 0) {
            int var4 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var4;
        }
        if (arg2 <= 104) {
            method2220(43, 110, 24, -54, 88, true);
        }
        return arg0;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(I)V")
    public final void method737(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field5658, this.field5662, 36161, 0);
        field5657++;
        this.field5658 = -1;
        if (arg0 != 6407) {
            field5665 = 0.009494289F;
        }
        this.field5662 = -1;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(II)Z")
    public static final boolean method2225(int arg0, int arg1) {
        class209.field3019 = arg1 + 1 & 0xFFFF;
        field5654++;
        if (arg0 != 0) {
            field5661 = 68;
        }
        class333.field5168 = true;
        return true;
    }

    @OriginalMember(owner = "client!nt", name = "b", descriptor = "(Z)V")
    public static void method2226(boolean arg0) {
        field5663 = null;
        field5652 = null;
        if (arg0) {
            method2224(-92, 56, 73);
        }
    }

    @OriginalMember(owner = "client!nt", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field5650++;
        this.method2227((byte) 78);
        super.finalize();
    }

    @OriginalMember(owner = "client!nt", name = "c", descriptor = "(B)V")
    public final void method2227(byte arg0) {
        field5660++;
        if (arg0 > 6 && this.field5653 > 0) {
            this.field5656.method1617(this.field5655, this.field5653, false);
            this.field5653 = 0;
        }
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lvd;III)V")
    public class375(class258 arg0, int arg1, int arg2, int arg3) {
        this.field5668 = arg3;
        this.field5651 = arg1;
        this.field5659 = arg2;
        this.field5656 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class456.field6686, 0);
        this.field5653 = class456.field6686[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field5653);
        OpenGL.glRenderbufferStorageEXT(36161, this.field5651, this.field5659, this.field5668);
        this.field5655 = this.field5668 * this.field5659 * this.field5656.method1569(this.field5651, (byte) -96);
    }

    @OriginalMember(owner = "client!nt", name = "<init>", descriptor = "(Lvd;IIII)V")
    public class375(class258 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field5651 = arg1;
        this.field5668 = arg3;
        this.field5656 = arg0;
        this.field5659 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class456.field6686, 0);
        this.field5653 = class456.field6686[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field5653);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field5651, this.field5659, this.field5668);
        this.field5655 = this.field5659 * this.field5668 * this.field5656.method1569(this.field5651, (byte) 124);
    }
}
