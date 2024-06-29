import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qn")
public class class58 extends class386 {

    @OriginalMember(owner = "client!qn", name = "z", descriptor = "I")
    private int field757 = -1;

    @OriginalMember(owner = "client!qn", name = "B", descriptor = "I")
    private int field759 = -1;

    @OriginalMember(owner = "client!qn", name = "A", descriptor = "I")
    public int field758;

    @OriginalMember(owner = "client!qn", name = "u", descriptor = "I")
    public static int field752;

    @OriginalMember(owner = "client!qn", name = "v", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!qn", name = "w", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!qn", name = "x", descriptor = "I")
    public static int field755;

    @OriginalMember(owner = "client!qn", name = "y", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(I)V", line = 6)
    public final void method667(int arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field759, this.field757, 3553, 0, 0);
        if (arg0 != 13035) {
            method670(-94);
        }
        ++field756;
        this.field759 = -1;
        this.field757 = -1;
    }

    @OriginalMember(owner = "client!qn", name = "b", descriptor = "(Z)V", line = 19)
    public static final void method668(boolean arg0) {
        class373.field5831 = 0;
        ++field754;
        class160.field2734 = 0;
        class343.method2337(0);
        class483.method2971(1);
        method670(1);
        boolean var1 = arg0;
        for (int var2 = 0; ~var2 > ~class160.field2734; ++var2) {
            int var4 = class53.field711[var2];
            class348 var5 = (class348) class592.field8395.method1558((long) var4, (byte) -93);
            class589 var6 = var5.field5577;
            if (class453.field6808 && class576.method3376(var4, -6347)) {
                class700.method3951(0);
            }
            if (class562.field8084 != var6.field4223) {
                if (var6.field8354.method3981(0)) {
                    class301.method2080(-117, var6);
                }
                var6.method3442((byte) -28, (class705) null);
                var5.method707((byte) -123);
                var1 = true;
            }
        }
        if (var1) {
            class289.field4581 = class592.field8395.method1555(0);
            class592.field8395.method1563(class613.field8707, 1);
        }
        if (class344.field5550 != class558.field8066.field57) {
            throw new RuntimeException("gnp1 pos:" + class558.field8066.field57 + " psize:" + class344.field5550);
        } else {
            for (int var3 = 0; var3 < class283.field4523; ++var3) {
                if (class592.field8395.method1558((long) class102.field1690[var3], (byte) -93) == null) {
                    throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class283.field4523);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ler;IIZ[[BI)V", line = 86)
    public class58(class92 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field758 = arg2;
        super.field6003.method856(false, this);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field5988, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2509(true, -82);
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ler;IIZ[[I)V", line = 105)
    public class58(class92 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field758 = arg2;
        super.field6003.method856(false, this);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field5988, arg2, arg2, 0, 32993, super.field6003.field1388, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                class126.method1109(arg4[var7], 32993, arg2, super.field5988, arg2, -12421, var7 + 34069, super.field6003.field1388);
            }
        }
        this.method2509(true, -111);
    }

    @OriginalMember(owner = "client!qn", name = "a", descriptor = "(IBIII)V", line = 140)
    public final void method669(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg2, arg3, arg4, super.field5993, arg0);
        if (arg1 < 84) {
            method668(true);
        }
        ++field755;
        this.field759 = arg2;
        this.field757 = arg3;
    }

    @OriginalMember(owner = "client!qn", name = "e", descriptor = "(I)V", line = 156)
    private static final void method670(int arg0) {
        if (arg0 == 1) {
            for (int var1 = 0; var1 < class373.field5831; ++var1) {
                int var2 = class326.field5075[var1];
                class589 var3 = ((class348) class592.field8395.method1558((long) var2, (byte) -93)).field5577;
                int var4 = class558.field8066.method70(arg0 ^ -9060);
                if ((64 & var4) != 0) {
                    var4 += class558.field8066.method70(-9059) << 8;
                }
                if ((var4 & 512) != 0) {
                    int var5 = class558.field8066.method78(true);
                    var3.field4248 = class558.field8066.method77((byte) -106);
                    var3.field4236 = class558.field8066.method75(8);
                    var3.field4250 = 32767 & var5;
                    var3.field4179 = (var5 & 32768) != 0;
                    var3.field4205 = class562.field8084 + var3.field4250 + var3.field4248;
                }
                if ((var4 & 2) != 0) {
                    if (var3.field8354.method3981(0)) {
                        class301.method2080(arg0 ^ -113, var3);
                    }
                    var3.method3442((byte) -62, class538.field7860.method3224(class558.field8066.method67(12021), arg0 + 49));
                    var3.method1846(var3.field8354.field9949, -123);
                    var3.field4168 = var3.field8354.field9927 << 3;
                    if (var3.field8354.method3981(0)) {
                        class24.method410(var3.field4265[0], (class698) null, var3, var3.field4264[0], 0, var3.field9695, (byte) 78, (class304) null);
                    }
                }
                if ((8 & var4) != 0) {
                    var3.field4206 = class558.field8066.method39((byte) 124);
                    if (~var3.field4206 == -65536) {
                        var3.field4206 = -1;
                    }
                }
                if ((var4 & 4) != 0) {
                    var3.field4182 = class558.field8066.method42((byte) -53);
                    var3.field4246 = 100;
                }
                if ((2048 & var4) != 0) {
                    var3.field4162 = class558.field8066.method31(100);
                    var3.field4218 = class558.field8066.method81(true);
                    var3.field4251 = class558.field8066.method48((byte) -118);
                    var3.field4241 = (byte) class558.field8066.method70(-9059);
                    var3.field4198 = class562.field8084 - -class558.field8066.method68(arg0 + 12512);
                    var3.field4172 = class562.field8084 - -class558.field8066.method39((byte) 126);
                }
                if (~(var4 & 4096) != -1) {
                    int var6 = class558.field8066.method88((byte) 90);
                    int var7 = class558.field8066.method33((byte) 99);
                    var3.method1857(var7, class562.field8084, var6, (byte) 83);
                }
                if ((var4 & 128) != 0) {
                    int var8 = class558.field8066.method67(12021);
                    if (var8 == 65535) {
                        var8 = -1;
                    }
                    int var9 = class558.field8066.method30(117);
                    int var10 = class558.field8066.method75(121);
                    var3.method1855(var10, var8, false, arg0 + -2, var9);
                }
                if ((8192 & var4) != 0) {
                    int var11 = class558.field8066.method78(true);
                    if (~var11 == -65536) {
                        var11 = -1;
                    }
                    int var12 = class558.field8066.method41(122);
                    int var13 = class558.field8066.method75(-105);
                    var3.method1855(var13, var11, true, -1, var12);
                }
                if (~(16384 & var4) != -1) {
                    int var14 = class558.field8066.method77((byte) -91);
                    int[] var15 = new int[var14];
                    int[] var16 = new int[var14];
                    for (int var17 = 0; var17 < var14; ++var17) {
                        int var18 = class558.field8066.method67(12021);
                        if ((var18 & 49152) == 49152) {
                            int var19 = class558.field8066.method67(12021);
                            var15[var17] = class81.method769(var19, var18 << 16);
                        } else {
                            var15[var17] = var18;
                        }
                        var16[var17] = class558.field8066.method67(12021);
                    }
                    var3.method1849(var16, var15, (byte) 22);
                }
                if ((var4 & 1024) != 0) {
                    var3.field4226 = class558.field8066.method48((byte) -118);
                    var3.field4216 = class558.field8066.method81(true);
                    var3.field4229 = class558.field8066.method31(-96);
                    var3.field4202 = class558.field8066.method48((byte) -118);
                    var3.field4203 = class558.field8066.method78(true) + class562.field8084;
                    var3.field4151 = class558.field8066.method39((byte) 126) + class562.field8084;
                    var3.field4177 = class558.field8066.method70(arg0 ^ -9060);
                    var3.field4229 += var3.field4264[0];
                    var3.field4259 = 0;
                    var3.field4202 += var3.field4265[0];
                    var3.field4267 = 1;
                    var3.field4216 += var3.field4265[0];
                    var3.field4226 += var3.field4264[0];
                }
                if (~(var4 & 256) != -1) {
                    int var20 = class558.field8066.method77((byte) -111);
                    int[] var21 = new int[var20];
                    int[] var22 = new int[var20];
                    int[] var23 = new int[var20];
                    for (int var24 = 0; ~var20 < ~var24; ++var24) {
                        int var25 = class558.field8066.method78(true);
                        if (var25 == 65535) {
                            var25 = -1;
                        }
                        var21[var24] = var25;
                        var22[var24] = class558.field8066.method33((byte) 99);
                        var23[var24] = class558.field8066.method67(12021);
                    }
                    class225.method1651(var23, var3, var21, 5816, var22);
                }
                if (~(32 & var4) != -1) {
                    int[] var26 = new int[4];
                    for (int var27 = 0; var27 < 4; ++var27) {
                        var26[var27] = class558.field8066.method39((byte) 126);
                        if (var26[var27] == 65535) {
                            var26[var27] = -1;
                        }
                    }
                    int var28 = class558.field8066.method75(5);
                    class411.method2621(var28, false, var3, var26);
                }
                if (~(var4 & 16) != -1) {
                    int var29 = class558.field8066.method88((byte) 90);
                    int var30 = class558.field8066.method33((byte) 99);
                    var3.method1857(var30, class562.field8084, var29, (byte) 83);
                    var3.field4190 = class562.field8084 + 300;
                    var3.field4186 = class558.field8066.method33((byte) 99);
                }
                if (~(var4 & 1) != -1) {
                    var3.field8358 = class558.field8066.method68(arg0 + 12512);
                    var3.field8377 = class558.field8066.method39((byte) 127);
                }
            }
            ++field752;
        }
    }

    @OriginalMember(owner = "client!qn", name = "<init>", descriptor = "(Ler;II)V", line = 406)
    public class58(class92 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field758 = arg2;
        super.field6003.method856(false, this);
        for (int var4 = 0; var4 < 6; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field5988, arg2, arg2, 0, class329.method2212(super.field5988, -51), 5121, (byte[]) null, 0);
        }
        this.method2509(true, -60);
    }
}
