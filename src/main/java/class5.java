import jaggl.OpenGL;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class5 extends class45 {

    @OriginalMember(owner = "client!dc", name = "I", descriptor = "I")
    private int field114 = 2000;

    @OriginalMember(owner = "client!dc", name = "H", descriptor = "I")
    private int field113 = 0;

    @OriginalMember(owner = "client!dc", name = "J", descriptor = "I")
    private int field115 = 0;

    @OriginalMember(owner = "client!dc", name = "R", descriptor = "I")
    private int field123 = 16;

    @OriginalMember(owner = "client!dc", name = "U", descriptor = "I")
    private int field126 = 4096;

    @OriginalMember(owner = "client!dc", name = "S", descriptor = "Liv;")
    public static class64 field124 = new class64(5, 8);

    @OriginalMember(owner = "client!dc", name = "T", descriptor = "[[Z")
    public static boolean[][] field125 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!dc", name = "V", descriptor = "I")
    public static int field127 = 0;

    @OriginalMember(owner = "client!dc", name = "O", descriptor = "B")
    public static byte field120;

    @OriginalMember(owner = "client!dc", name = "K", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!dc", name = "L", descriptor = "I")
    public static int field117;

    @OriginalMember(owner = "client!dc", name = "M", descriptor = "I")
    public static int field118;

    @OriginalMember(owner = "client!dc", name = "N", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!dc", name = "P", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!dc", name = "Q", descriptor = "Lbu;")
    public static class17 field122;

    @OriginalMember(owner = "client!dc", name = "W", descriptor = "Lf;")
    public static class529 field128;

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V", line = 343)
    public class5() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(II)[I", line = 9)
    public final int[] method35(int arg0, int arg1) {
        ++field119;
        if (arg0 != 0) {
            method36(3);
        }
        int[] var3 = super.field854.method863((byte) 12, arg1);
        if (super.field854.field1928) {
            int var4 = this.field126 >> 1;
            int[][] var5 = super.field854.method862((byte) -122);
            Random var6 = new Random((long) this.field113);
            for (int var7 = 0; ~this.field114 < ~var7; ++var7) {
                int var8 = ~this.field126 >= -1 ? this.field115 : this.field115 - (-class455.method2714(var6, this.field126, -13848) + var4);
                int var9 = 255 & var8 >> 4;
                int var10 = class455.method2714(var6, class259.field3768, -13848);
                int var11 = class455.method2714(var6, class457.field6849, -13848);
                int var12 = (class57.field1002[var9] * this.field123 >> 12) + var10;
                int var13 = (class68.field1167[var9] * this.field123 >> 12) + var11;
                int var14 = -var11 + var13;
                int var15 = -var10 + var12;
                if (~var15 != -1 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (~var14 > -1) {
                        var14 = -var14;
                    }
                    boolean var16 = ~var15 > ~var14;
                    if (var16) {
                        int var17 = var10;
                        int var18 = var12;
                        var10 = var11;
                        var12 = var13;
                        var11 = var17;
                        var13 = var18;
                    }
                    if (var12 < var10) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = var12 - var10;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = 1024 - (class455.method2714(var6, 4096, -13848) >> 2);
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    for (int var28 = var10; var28 < var12; ++var28) {
                        int var29 = (var28 - var10) * var25 + (var26 - -1024);
                        int var30 = var28 & class290.field4128;
                        int var31 = class506.field7463 & var21;
                        if (var16) {
                            var5[var31][var30] = var29;
                        } else {
                            var5[var30][var31] = var29;
                        }
                        var24 += var23;
                        if (var24 > 0) {
                            var24 -= var22;
                            var21 += var27;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "(I)V", line = 147)
    public static void method36(int arg0) {
        field125 = null;
        field128 = null;
        field122 = null;
        if (arg0 != 1) {
            field125 = null;
        }
        field124 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lcu;II)V", line = 160)
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg1 == -26471) {
            if (~arg2 != -1) {
                if (arg2 != 1) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (~arg2 == -5) {
                                this.field126 = arg0.method1069((byte) -9);
                            }
                        } else {
                            this.field115 = arg0.method1069((byte) -58);
                        }
                    } else {
                        this.field123 = arg0.method1063((byte) -16);
                    }
                } else {
                    this.field114 = arg0.method1069((byte) -9);
                }
            } else {
                this.field113 = arg0.method1063((byte) 110);
            }
            ++field116;
        }
    }

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "(I)V", line = 232)
    public final void method38(int arg0) {
        if (arg0 == 4095) {
            ++field118;
            class416.method2523(4096);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lgj;Z)Z", line = 244)
    public static final boolean method39(class447 arg0, boolean arg1) {
        ++field121;
        if (arg0 == null) {
            return false;
        } else if (!arg0.field6668) {
            return false;
        } else if (!arg0.method2668(119, class509.field7487)) {
            return false;
        } else {
            if (!arg1) {
                method40((class108[]) null, true, (class303) null);
            }
            if (class429.field6390.method171((byte) -94, (long) arg0.field6696) != null) {
                return false;
            } else {
                return class457.field6841.method171((byte) -104, (long) arg0.field6670) == null;
            }
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "([Lhq;ZLvj;)Lwf;", line = 273)
    public static final class88 method40(class108[] arg0, boolean arg1, class303 arg2) {
        ++field117;
        for (int var3 = 0; arg0.length > var3; ++var3) {
            if (arg0[var3] == null || arg0[var3].field1787 <= 0L) {
                return null;
            }
        }
        if (arg1) {
            field122 = null;
        }
        long var4 = OpenGL.glCreateProgramObjectARB();
        for (int var6 = 0; arg0.length > var6; ++var6) {
            OpenGL.glAttachObjectARB(var4, arg0[var6].field1787);
        }
        OpenGL.glLinkProgramARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35714, class528.field7790, 0);
        if (~class528.field7790[0] == -1) {
            if (class528.field7790[0] == 0) {
                System.out.println("Shader linking failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class528.field7790, 1);
            if (~class528.field7790[1] < -2) {
                byte[] var7 = new byte[class528.field7790[1]];
                OpenGL.glGetInfoLogARB(var4, class528.field7790[1], class528.field7790, 0, var7, 0);
                System.out.println(new String(var7));
            }
            if (class528.field7790[0] == 0) {
                for (int var8 = 0; var8 < arg0.length; ++var8) {
                    OpenGL.glDetachObjectARB(var4, arg0[var8].field1787);
                }
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return new class88(arg2, var4, arg0);
    }
}
