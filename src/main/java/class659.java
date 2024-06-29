import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class659 extends class50 implements class612 {

    @OriginalMember(owner = "client!ac", name = "G", descriptor = "I")
    private int field9290;

    @OriginalMember(owner = "client!ac", name = "F", descriptor = "I")
    private int field9289;

    @OriginalMember(owner = "client!ac", name = "B", descriptor = "Ljn;")
    public static class117 field9285 = new class117(64);

    @OriginalMember(owner = "client!ac", name = "x", descriptor = "I")
    public static int field9281;

    @OriginalMember(owner = "client!ac", name = "y", descriptor = "I")
    public static int field9282;

    @OriginalMember(owner = "client!ac", name = "z", descriptor = "I")
    public static int field9283;

    @OriginalMember(owner = "client!ac", name = "A", descriptor = "I")
    public static int field9284;

    @OriginalMember(owner = "client!ac", name = "C", descriptor = "I")
    public static int field9286;

    @OriginalMember(owner = "client!ac", name = "E", descriptor = "I")
    public static int field9288;

    @OriginalMember(owner = "client!ac", name = "H", descriptor = "I")
    public static int field9291;

    @OriginalMember(owner = "client!ac", name = "I", descriptor = "I")
    public static int field9292;

    @OriginalMember(owner = "client!ac", name = "J", descriptor = "I")
    public static int field9293;

    @OriginalMember(owner = "client!ac", name = "D", descriptor = "Lsda;")
    public static class491 field9287;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([BIIIIIIILjb;)V", line = 3)
    public final void method421(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class666 arg8) {
        if (arg1 == 0) {
            arg1 = arg5;
        }
        ++field9286;
        super.field663.method2924(13528, this);
        OpenGL.glPixelStorei(3317, 1);
        if (~arg1 != ~arg5) {
            OpenGL.glPixelStorei(3314, arg1);
        }
        OpenGL.glTexSubImage2Dub(super.field651, 0, arg7, arg4, arg5, arg3, class21.method211(arg8, 49), 5121, arg0, arg2);
        if (arg1 != arg5) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
        if (arg6 >= -55) {
            this.method417(-29);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IIIII[III)V", line = 29)
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        if (~arg0 == -1) {
            arg0 = arg3;
        }
        ++field9291;
        super.field663.method2924(13528, this);
        if (arg0 != arg3) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Di(super.field651, 0, arg4, arg1, arg3, arg6, 32993, super.field663.field9528, arg5, arg7);
        if (arg0 != arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
        if (arg2 != 23208) {
            field9287 = null;
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(I)Z", line = 53)
    public final boolean method419(int arg0) {
        ++field9284;
        int var2 = 12 / ((arg0 - 19) / 40);
        return false;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(I)I", line = 63)
    public final int method412(int arg0) {
        if (arg0 != -17847) {
            return -125;
        } else {
            ++field9282;
            return this.field9290;
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lad;Ljb;II[BII)V", line = 74)
    public class659(class669 arg0, class666 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class689.field9771, arg2 * arg3, false);
        this.field9290 = arg2;
        this.field9289 = arg3;
        super.field663.method2924(13528, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field651, 0, this.method397((byte) 114), arg2, arg3, 0, class21.method211(super.field654, 49), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ac", name = "i", descriptor = "(I)V", line = 93)
    public static final void method3710(int arg0) {
        ++field9281;
        class387.field5673.method3896(arg0 + -7);
        class289.field4051.method3896(3);
        for (class673 var1 = (class673) class150.field2533.method3905(-123); var1 != null; var1 = (class673) class150.field2533.method3899(0)) {
            int var18 = var1.field9544;
            if (~var18 > -1001) {
                var1.method2549((byte) -119);
                if (~var18 != -17 && ~var18 != -58 && var18 != 11 && var18 != 19 && ~var18 != -60 && var18 != 6 && ~var18 != -11) {
                    class387.field5673.method3904(var1, 0);
                } else {
                    class289.field4051.method3904(var1, 0);
                }
            }
        }
        class387.field5673.method3891(-24608, class150.field2533);
        if (arg0 != 10) {
            field9287 = null;
        }
        class289.field4051.method3891(-24608, class150.field2533);
        if (~class400.field5784 < -2) {
            if (class577.field8449 && class236.field3494.method668(arg0 ^ -50, 81) && ~class400.field5784 < -3) {
                class354.field4954 = (class673) class150.field2533.field9799.field6258.field6258;
            } else {
                class354.field4954 = (class673) class150.field2533.field9799.field6258;
            }
        } else {
            class354.field4954 = null;
        }
        int var2 = -1;
        class634 var3 = (class634) class31.field459.method3905(arg0 + -115);
        if (var3 != null) {
            var2 = var3.method332((byte) 32);
        }
        if (!class324.field4519) {
            if (~var2 == -1 && (class248.field3608 == 1 && ~class400.field5784 < -3 || class116.method932((byte) 103))) {
                var2 = 2;
            }
            if (~var2 == -3 && class400.field5784 > 0 && var3 != null) {
                if (class512.field7616 == null && class221.field3307 == 0) {
                    class391.method2380(var3.method333(25632), (byte) -96, var3.method334(true));
                } else {
                    class564.field8256 = 2;
                }
            }
            if (var2 == 0 && class400.field5784 > 0) {
                class576.method3339(arg0 ^ 8);
            }
            if (class512.field7616 == null && class221.field3307 == 0) {
                class564.field8256 = 0;
                class225.field3367 = null;
                return;
            }
        } else {
            if (~var2 == 0) {
                int var4 = class313.field4336.method310(false);
                int var5 = class313.field4336.method321(124);
                if (~var4 > ~(class150.field2534 - 10) || var4 > class69.field1093 + class150.field2534 - -10 || class485.field6918 + -10 > var5 || class273.field3904 + 10 + class485.field6918 < var5) {
                    class586.method3380((byte) -122);
                }
            }
            if (var2 != 0) {
                return;
            }
            int var6 = class150.field2534;
            int var7 = class485.field6918;
            int var8 = class69.field1093;
            int var9 = var3.method333(arg0 ^ 25642);
            int var10 = var3.method334(true);
            int var11 = -1;
            for (int var12 = 0; ~var12 > ~class400.field5784; ++var12) {
                if (!client.field1383) {
                    int var16 = (class400.field5784 + -1 - var12) * 16 + 31 + var7;
                    if (var9 > var6 && var9 < var6 + var8 && var10 > var16 + -13 && var16 + 3 > var10) {
                        var11 = var12;
                    }
                } else {
                    int var17 = (class400.field5784 - var12 + -1) * 16 + var7 + 33;
                    if (var9 > var6 && var6 + var8 > var9 && ~(var17 - 13) > ~var10 && ~(var17 + 4) < ~var10) {
                        var11 = var12;
                    }
                }
            }
            if (~var11 != 0) {
                int var13 = 0;
                class366 var14 = new class366(class150.field2533);
                for (class673 var15 = (class673) var14.method2196(arg0 + -11); var15 != null; var15 = (class673) var14.method2199((byte) 71)) {
                    if (var11 == var13) {
                        class583.method3372(false, var9, var10, var15);
                    }
                    ++var13;
                }
            }
            class586.method3380((byte) -106);
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IZZ)V", line = 259)
    public final void method414(int arg0, boolean arg1, boolean arg2) {
        if (arg0 >= 96) {
            ++field9293;
        }
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(B)V", line = 271)
    public static void method3711(byte arg0) {
        if (arg0 != -25) {
            field9287 = null;
        }
        field9285 = null;
        field9287 = null;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lad;Ljb;II[FII)V", line = 283)
    public class659(class669 arg0, class666 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class689.field9775, arg2 * arg3, false);
        this.field9290 = arg2;
        this.field9289 = arg3;
        super.field663.method2924(13528, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field651, 0, this.method397((byte) 100), arg2, arg3, 0, class21.method211(super.field654, 49), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lad;Ljb;Lqda;II)V", line = 298)
    public class659(class669 arg0, class666 arg1, class689 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field9290 = arg3;
        this.field9289 = arg4;
        super.field663.method2924(13528, this);
        OpenGL.glTexImage2Dub(super.field651, 0, this.method397((byte) -65), arg3, arg4, 0, class21.method211(super.field654, 49), class548.method3213(super.field646, (byte) -96), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IF)F", line = 310)
    public final float method416(int arg0, float arg1) {
        if (arg0 != -14098) {
            return 0.7483104F;
        } else {
            ++field9292;
            return arg1;
        }
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(FZ)F", line = 322)
    public final float method418(float arg0, boolean arg1) {
        if (arg1) {
            return -0.65919816F;
        } else {
            ++field9288;
            return arg0;
        }
    }

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(I)I", line = 333)
    public final int method417(int arg0) {
        ++field9283;
        return arg0 != 7782 ? 55 : this.field9289;
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Lad;II[III)V", line = 346)
    public class659(class669 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class297.field4191, class689.field9771, arg1 * arg2, false);
        this.field9290 = arg1;
        this.field9289 = arg2;
        super.field663.method2924(13528, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field651, 0, 6408, this.field9290, this.field9289, 0, 32993, super.field663.field9528, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }
}
