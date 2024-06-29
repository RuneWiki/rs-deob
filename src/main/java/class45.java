import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class45 extends class411 {

    @OriginalMember(owner = "client!gv", name = "D", descriptor = "I")
    private int field673 = -1;

    @OriginalMember(owner = "client!gv", name = "C", descriptor = "I")
    private int field672 = -1;

    @OriginalMember(owner = "client!gv", name = "z", descriptor = "I")
    public int field670;

    @OriginalMember(owner = "client!gv", name = "w", descriptor = "I")
    public static int field667;

    @OriginalMember(owner = "client!gv", name = "x", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!gv", name = "y", descriptor = "I")
    public static int field669;

    @OriginalMember(owner = "client!gv", name = "A", descriptor = "I")
    public static int field671;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;IILjava/lang/String;)V")
    public static final void method368(int arg0, String arg1, String arg2, String arg3, int arg4, String arg5, int arg6, int arg7, String arg8) {
        ++field669;
        class421 var9 = class613.field8483[99];
        for (int var10 = 99; ~var10 < -1; --var10) {
            class613.field8483[var10] = class613.field8483[var10 + -1];
        }
        if (var9 == null) {
            var9 = new class421(arg0, arg7, arg1, arg5, arg8, arg3, arg6, arg2);
        } else {
            var9.method2499(arg3, arg6, arg8, arg1, true, arg5, arg7, arg2, arg0);
        }
        class676.field9191 = class215.field2727;
        ++class125.field1502;
        class613.field8483[arg4] = var9;
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Leq;IIZ[[I)V")
    public class45(class357 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field670 = arg2;
        super.field5807.method2120(-1, this);
        if (!arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field5809, arg2, arg2, 0, 32993, super.field5807.field5033, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class588.method3270((byte) 86, super.field5809, 32993, arg4[var7], super.field5807.field5033, var7 + 34069, arg2, arg2);
            }
        }
        this.method2433(true, -102);
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Leq;IIZ[[BI)V")
    public class45(class357 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field670 = arg2;
        super.field5807.method2120(-1, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field5809, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2433(true, -90);
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(Leq;II)V")
    public class45(class357 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field670 = arg2;
        super.field5807.method2120(-1, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field5809, arg2, arg2, 0, class606.method3328(super.field5809, false), 5121, (byte[]) null, 0);
        }
        this.method2433(true, -117);
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
    public final void method369(boolean arg0) {
        ++field667;
        OpenGL.glFramebufferTexture2DEXT(this.field673, this.field672, 3553, 0, 0);
        this.field673 = -1;
        if (arg0) {
            this.field672 = -1;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(BIIII)V")
    public final void method370(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field668;
        OpenGL.glFramebufferTexture2DEXT(arg3, arg2, arg1, super.field5803, arg4);
        this.field672 = arg2;
        if (arg0 != 70) {
            this.field673 = -107;
        }
        this.field673 = arg3;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IIIIBI)V")
    public static final void method371(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        if (arg4 == 44) {
            ++field671;
            int var6 = arg2 - arg0;
            int var7 = -arg3 + arg1;
            if (~var7 == -1) {
                if (var6 != 0) {
                    class216.method1309(arg0, arg5, arg2, -126, arg3);
                }
            } else if (~var6 == -1) {
                class616.method3382(arg3, arg4 + -144, arg0, arg1, arg5);
            } else {
                if (var7 < 0) {
                    var7 = -var7;
                }
                if (~var6 > -1) {
                    var6 = -var6;
                }
                boolean var8 = ~var6 < ~var7;
                if (var8) {
                    int var9 = arg3;
                    int var10 = arg1;
                    arg3 = arg0;
                    arg0 = var9;
                    arg1 = arg2;
                    arg2 = var10;
                }
                if (~arg1 > ~arg3) {
                    int var11 = arg3;
                    int var12 = arg0;
                    arg3 = arg1;
                    arg0 = arg2;
                    arg1 = var11;
                    arg2 = var12;
                }
                int var13 = arg0;
                int var14 = -arg3 + arg1;
                int var15 = -arg0 + arg2;
                int var16 = -(var14 >> 1);
                if (~var15 > -1) {
                    var15 = -var15;
                }
                int var17 = ~arg0 <= ~arg2 ? -1 : 1;
                if (!var8) {
                    for (int var18 = arg3; arg1 >= var18; ++var18) {
                        class15.field220[var13][var18] = arg5;
                        var16 += var15;
                        if (~var16 < -1) {
                            var16 -= var14;
                            var13 += var17;
                        }
                    }
                } else {
                    for (int var19 = arg3; arg1 >= var19; ++var19) {
                        var16 += var15;
                        class15.field220[var19][var13] = arg5;
                        if (~var16 < -1) {
                            var13 += var17;
                            var16 -= var14;
                        }
                    }
                }
            }
        }
    }
}
