import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class466 extends class361 implements class233 {

    @OriginalMember(owner = "client!lc", name = "J", descriptor = "I")
    private int field6511 = -1;

    @OriginalMember(owner = "client!lc", name = "F", descriptor = "I")
    private int field6507 = -1;

    @OriginalMember(owner = "client!lc", name = "w", descriptor = "Lih;")
    private class503 field6498;

    @OriginalMember(owner = "client!lc", name = "H", descriptor = "I")
    public int field6509;

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public int field6512;

    @OriginalMember(owner = "client!lc", name = "z", descriptor = "I")
    private int field6501;

    @OriginalMember(owner = "client!lc", name = "G", descriptor = "I")
    private int field6508;

    @OriginalMember(owner = "client!lc", name = "B", descriptor = "I")
    private int field6503;

    @OriginalMember(owner = "client!lc", name = "I", descriptor = "Ldv;")
    public static class477 field6510 = new class477();

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "[[I")
    public static int[][] field6515 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "[I")
    public static int[] field6513 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "[I")
    public static int[] field6516 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!lc", name = "x", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!lc", name = "y", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!lc", name = "A", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!lc", name = "C", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!lc", name = "D", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!lc", name = "E", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)V", line = 5)
    public final void method2700(byte arg0) {
        if (this.field6508 > 0) {
            this.field6498.method2972(this.field6503, this.field6508, 90);
            this.field6508 = 0;
        }
        field6514++;
        if (arg0 >= -15) {
            field6510 = null;
        }
    }

    @OriginalMember(owner = "client!lc", name = "finalize", descriptor = "()V", line = 24)
    protected final void finalize() throws Throwable {
        this.method2700((byte) -41);
        field6502++;
        super.finalize();
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZBLjava/lang/String;)V", line = 33)
    public static final void method2701(boolean arg0, byte arg1, String arg2) {
        field6500++;
        if (arg2 == null) {
            return;
        }
        if (class419.field5909 >= 100) {
            class486.method2802(class324.field4735.method3116(class149.field1979, (byte) 122), (byte) 104);
            return;
        }
        String var3 = class487.method2806(-23881, arg2);
        if (var3 == null) {
            return;
        }
        for (int var4 = 0; var4 < class419.field5909; var4++) {
            String var8 = class487.method2806(-23881, class366.field5229[var4]);
            if (var8 != null && var8.equals(var3)) {
                class486.method2802(arg2 + class247.field3710.method3116(class149.field1979, (byte) 125), (byte) 115);
                return;
            }
            if (class213.field3081[var4] != null) {
                String var9 = class487.method2806(-23881, class213.field3081[var4]);
                if (var9 != null && var9.equals(var3)) {
                    class486.method2802(arg2 + class247.field3710.method3116(class149.field1979, (byte) 108), (byte) 73);
                    return;
                }
            }
        }
        for (int var5 = 0; var5 < class520.field7656; var5++) {
            String var6 = class487.method2806(-23881, class540.field7902[var5]);
            if (var6 != null && var6.equals(var3)) {
                class486.method2802(class464.field6488.method3116(class149.field1979, (byte) 98) + arg2 + class194.field2739.method3116(class149.field1979, (byte) 97), (byte) 22);
                return;
            }
            if (class474.field6600[var5] != null) {
                String var7 = class487.method2806(-23881, class474.field6600[var5]);
                if (var7 != null && var7.equals(var3)) {
                    class486.method2802(class464.field6488.method3116(class149.field1979, (byte) 127) + arg2 + class194.field2739.method3116(class149.field1979, (byte) 111), (byte) 79);
                    return;
                }
            }
        }
        if (class487.method2806(-23881, class246.field3587.field256).equals(var3)) {
            class486.method2802(class196.field2792.method3116(class149.field1979, (byte) 124), (byte) 44);
            return;
        }
        if (arg1 > -63) {
            field6516 = null;
        }
        class441.field6169++;
        class61.method498(class386.field5419, 1);
        class30.field357.method2376((byte) 122, class540.method3175(arg2, 1) + 1);
        class30.field357.method2377((byte) -53, arg2);
        class30.field357.method2376((byte) 122, arg0 ? 1 : 0);
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILnd;[[B)V", line = 132)
    public static final void method2702(int arg0, class388 arg1, byte[][] arg2) {
        field6499++;
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg1.field7796; var4++) {
            class322.method1949(arg0 ^ 0x6);
            for (int var5 = 0; var5 < class43.field494 >> 3; var5++) {
                for (int var6 = 0; var6 < (class500.field7068 >> 3); var6++) {
                    int var7 = class292.field4265[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x37C6AD9) >> 24;
                        if (!arg1.field7784 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = var7 >> 14 & 0x3FF;
                            int var11 = (var7 & 0x3FFE) >> 3;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class332.field4827.length; var13++) {
                                if (class332.field4827[var13] == var12 && arg2[var13] != null) {
                                    class403 var14 = new class403(arg2[var13]);
                                    arg1.method3130(var5 * 8, var6 * 8, var4, 5, var11, var14, var8, class143.field1877, var9, var10);
                                    arg1.method2248(var11, var8, var14, var3[0] == -1 ? var3 : null, var5 * 8, (byte) -118, var9, class385.field5414, var10, var4, var6 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 8) {
            field6510 = null;
        }
        if (var3[0] != -1) {
            class74.field903 = class361.field5163.method1241(arg0 ^ 0x8, var3[1], var3[3], class39.field423, var3[2], var3[0]);
            class52.field630 = var3[4];
        }
    }

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V", line = 216)
    public static final void method2703(int arg0) {
        field6505++;
        int var1 = 0;
        for (int var2 = 0; var2 < class43.field494; var2++) {
            for (int var3 = 0; var3 < class500.field7068; var3++) {
                if (class235.method1441(true, var3, var1, var2, class268.field3910, (byte) 124)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != -513) {
            method2703(101);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(I)V", line = 256)
    public final void method462(int arg0) {
        if (arg0 != -1259451258) {
            this.field6509 = 55;
        }
        OpenGL.glFramebufferRenderbufferEXT(this.field6511, this.field6507, 36161, 0);
        field6504++;
        this.field6511 = -1;
        this.field6507 = -1;
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(III)V", line = 269)
    public final void method2704(int arg0, int arg1, int arg2) {
        field6506++;
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, 36161, this.field6508);
        this.field6511 = arg1;
        if (arg0 == 12150) {
            this.field6507 = arg2;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(B)V", line = 283)
    public static void method2705(byte arg0) {
        field6513 = null;
        field6516 = null;
        field6515 = null;
        if (arg0 > -91) {
            method2701(false, (byte) 98, null);
        }
        field6510 = null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lih;III)V", line = 314)
    public class466(class503 arg0, int arg1, int arg2, int arg3) {
        this.field6498 = arg0;
        this.field6509 = arg3;
        this.field6512 = arg2;
        this.field6501 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class452.field6327, 0);
        this.field6508 = class452.field6327[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6508);
        OpenGL.glRenderbufferStorageEXT(36161, this.field6501, this.field6512, this.field6509);
        this.field6503 = this.field6509 * this.field6512 * this.field6498.method2922(this.field6501, 1319);
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lih;IIII)V", line = 329)
    public class466(class503 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field6498 = arg0;
        this.field6501 = arg1;
        this.field6512 = arg2;
        this.field6509 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class452.field6327, 0);
        this.field6508 = class452.field6327[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field6508);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field6501, this.field6512, this.field6509);
        this.field6503 = this.field6512 * this.field6509 * this.field6498.method2922(this.field6501, 1319);
    }
}
