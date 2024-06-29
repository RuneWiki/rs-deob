import jaggl.OpenGL;
import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class19 extends class657 {

    @OriginalMember(owner = "client!bu", name = "I", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!bu", name = "w", descriptor = "Lwba;")
    public static class46 field213 = new class46();

    @OriginalMember(owner = "client!bu", name = "B", descriptor = "Ldg;")
    public static class376 field218 = new class376(32, -1);

    @OriginalMember(owner = "client!bu", name = "F", descriptor = "Lnea;")
    public static class664 field221 = new class664(15, -2);

    @OriginalMember(owner = "client!bu", name = "x", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!bu", name = "y", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!bu", name = "z", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!bu", name = "A", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!bu", name = "C", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!bu", name = "D", descriptor = "I")
    public static int field220;

    @OriginalMember(owner = "client!bu", name = "G", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!bu", name = "H", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "(I)V", line = 3)
    public static final void method220(int arg0) {
        ++field220;
        int var1 = class7.field65;
        int[] var2 = class629.field8801;
        if (arg0 > -121) {
            method223((class135) null, -74);
        }
        for (int var3 = 0; ~var3 > ~var1; ++var3) {
            class491 var4 = class141.field2087[var2[var3]];
            if (var4 != null) {
                class377.method2268(var4, true, var4.method2553((byte) 97));
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(ZLjava/awt/Component;)Lrt;", line = 31)
    public static final class205 method221(boolean arg0, Component arg1) {
        if (!arg0) {
            field221 = null;
        }
        ++field217;
        return new class245(arg1);
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(ZI)V", line = 43)
    public final void method222(boolean arg0, int arg1) {
        super.field9210.method1505(-2, this);
        ++field215;
        OpenGL.glTexParameteri(super.field9226, 10242, !arg0 ? 33071 : 10497);
        int var3 = -24 % ((-45 - arg1) / 63);
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "(Lok;II[BI)V", line = 60)
    public class19(class228 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field224 = arg2;
        super.field9210.method1505(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field9226, 0, super.field9208, this.field224, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3617((byte) 41, true);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Ld;I)V", line = 73)
    public static final void method223(class135 arg0, int arg1) {
        ++field214;
        class307.field4539.method474(arg0, 6);
        arg0.field1980 = arg0.field1978.field9761;
        arg0.field1978.field9761 = arg1;
        class451.field6497 += arg0.field1980;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIZIIII)V", line = 85)
    public static final void method224(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6) {
        class108.method851(arg3, -14417);
        ++field216;
        int var7 = 0;
        int var8 = -arg1 + arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg3;
        int var10 = -arg3;
        int var11 = var8;
        int var12 = -var8;
        if (!arg2) {
            method224(56, -36, true, 10, 41, -56, 61);
        }
        int var13 = -1;
        if (~arg6 <= ~class520.field7329 && class239.field3747 >= arg6) {
            int[] var14 = class651.field9125[arg6];
            int var15 = class537.method3051(-10168, -arg3 + arg5, class248.field3859, class15.field153);
            int var16 = class537.method3051(-10168, arg3 + arg5, class248.field3859, class15.field153);
            int var17 = class537.method3051(-10168, -var8 + arg5, class248.field3859, class15.field153);
            int var18 = class537.method3051(-10168, arg5 - -var8, class248.field3859, class15.field153);
            class58.method623(arg4, var17, 23309, var14, var15);
            class58.method623(arg0, var18, 23309, var14, var17);
            class58.method623(arg4, var16, 23309, var14, var18);
        }
        int var19 = -1;
        while (~var9 < ~var7) {
            var19 += 2;
            var13 += 2;
            var10 += var13;
            var12 += var19;
            if (var12 >= 0 && var11 >= 1) {
                --var11;
                var12 -= var11 << 1;
                class443.field6454[var11] = var7;
            }
            ++var7;
            if (var10 >= 0) {
                --var9;
                var10 -= var9 << 1;
                int var20 = arg6 - var9;
                int var21 = arg6 + var9;
                if (~var21 <= ~class520.field7329 && class239.field3747 >= var20) {
                    if (~var9 <= ~var8) {
                        int var22 = class537.method3051(-10168, arg5 - -var7, class248.field3859, class15.field153);
                        int var23 = class537.method3051(-10168, -var7 + arg5, class248.field3859, class15.field153);
                        if (class239.field3747 >= var21) {
                            class58.method623(arg4, var22, 23309, class651.field9125[var21], var23);
                        }
                        if (class520.field7329 <= var20) {
                            class58.method623(arg4, var22, 23309, class651.field9125[var20], var23);
                        }
                    } else {
                        int var24 = class443.field6454[var9];
                        int var25 = class537.method3051(-10168, arg5 + var7, class248.field3859, class15.field153);
                        int var26 = class537.method3051(-10168, -var7 + arg5, class248.field3859, class15.field153);
                        int var27 = class537.method3051(-10168, arg5 - -var24, class248.field3859, class15.field153);
                        int var28 = class537.method3051(-10168, -var24 + arg5, class248.field3859, class15.field153);
                        if (~class239.field3747 <= ~var21) {
                            int[] var29 = class651.field9125[var21];
                            class58.method623(arg4, var28, 23309, var29, var26);
                            class58.method623(arg0, var27, 23309, var29, var28);
                            class58.method623(arg4, var25, 23309, var29, var27);
                        }
                        if (class520.field7329 <= var20) {
                            int[] var30 = class651.field9125[var20];
                            class58.method623(arg4, var28, 23309, var30, var26);
                            class58.method623(arg0, var27, 23309, var30, var28);
                            class58.method623(arg4, var25, 23309, var30, var27);
                        }
                    }
                }
            }
            int var31 = arg6 - var7;
            int var32 = arg6 + var7;
            if (~class520.field7329 >= ~var32 && var31 <= class239.field3747) {
                int var33 = arg5 + var9;
                int var34 = -var9 + arg5;
                if (~var33 <= ~class15.field153 && var34 <= class248.field3859) {
                    int var35 = class537.method3051(-10168, var33, class248.field3859, class15.field153);
                    int var36 = class537.method3051(-10168, var34, class248.field3859, class15.field153);
                    if (var8 > var7) {
                        int var37 = ~var11 > ~var7 ? class443.field6454[var7] : var11;
                        int var38 = class537.method3051(-10168, arg5 + var37, class248.field3859, class15.field153);
                        int var39 = class537.method3051(-10168, arg5 - var37, class248.field3859, class15.field153);
                        if (~var32 >= ~class239.field3747) {
                            int[] var40 = class651.field9125[var32];
                            class58.method623(arg4, var39, 23309, var40, var36);
                            class58.method623(arg0, var38, 23309, var40, var39);
                            class58.method623(arg4, var35, 23309, var40, var38);
                        }
                        if (~class520.field7329 >= ~var31) {
                            int[] var41 = class651.field9125[var31];
                            class58.method623(arg4, var39, 23309, var41, var36);
                            class58.method623(arg0, var38, 23309, var41, var39);
                            class58.method623(arg4, var35, 23309, var41, var38);
                        }
                    } else {
                        if (class239.field3747 >= var32) {
                            class58.method623(arg4, var35, 23309, class651.field9125[var32], var36);
                        }
                        if (~var31 <= ~class520.field7329) {
                            class58.method623(arg4, var35, 23309, class651.field9125[var31], var36);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "f", descriptor = "(I)V", line = 274)
    public static final void method225(int arg0) {
        class699.field9885 = true;
        if (arg0 != 26770) {
            method223((class135) null, -29);
        }
        ++field222;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(I)V", line = 292)
    public final void method226(int arg0) {
        ++field219;
        if (arg0 != -1) {
            field221 = null;
        }
    }

    @OriginalMember(owner = "client!bu", name = "g", descriptor = "(I)V", line = 302)
    public static void method227(int arg0) {
        field213 = null;
        field221 = null;
        field218 = null;
        if (arg0 <= 121) {
            method221(true, (Component) null);
        }
    }
}
