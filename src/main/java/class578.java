import jaggl.OpenGL;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class578 extends class445 implements class75 {

    @OriginalMember(owner = "client!ve", name = "v", descriptor = "I")
    private int field8388;

    @OriginalMember(owner = "client!ve", name = "A", descriptor = "I")
    private int field8393;

    @OriginalMember(owner = "client!ve", name = "w", descriptor = "I")
    public static int field8389;

    @OriginalMember(owner = "client!ve", name = "x", descriptor = "I")
    public static int field8390;

    @OriginalMember(owner = "client!ve", name = "y", descriptor = "I")
    public static int field8391;

    @OriginalMember(owner = "client!ve", name = "z", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!ve", name = "B", descriptor = "I")
    public static int field8394;

    @OriginalMember(owner = "client!ve", name = "C", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Ljava/lang/String;ILew;I)Lae;")
    public static final class254 method3322(String arg0, int arg1, class226 arg2, int arg3) {
        ++field8395;
        if (~arg1 == -1) {
            return arg2.method1413(arg0, -30);
        } else {
            if (arg3 != -25640) {
                method3322((String) null, -30, (class226) null, -44);
            }
            if (~arg1 == -2) {
                try {
                    class101.method725(new Object[] { (new URL(class551.field8116.getCodeBase(), arg0)).toString() }, arg3 + 28225, "openjs", class551.field8116);
                    class254 var4 = new class254();
                    var4.field3311 = 1;
                    return var4;
                } catch (Throwable var10) {
                    class254 var5 = new class254();
                    var5.field3311 = 2;
                    return var5;
                }
            } else if (arg1 == 2) {
                try {
                    class551.field8116.getAppletContext().showDocument(new URL(class551.field8116.getCodeBase(), arg0), "_blank");
                    class254 var6 = new class254();
                    var6.field3311 = 1;
                    return var6;
                } catch (Exception var11) {
                    class254 var7 = new class254();
                    var7.field3311 = 2;
                    return var7;
                }
            } else if (~arg1 == -4) {
                try {
                    class101.method727("loggedout", -118, class551.field8116);
                } catch (Throwable var13) {
                }
                try {
                    class551.field8116.getAppletContext().showDocument(new URL(class551.field8116.getCodeBase(), arg0), "_top");
                    class254 var8 = new class254();
                    var8.field3311 = 1;
                    return var8;
                } catch (Exception var12) {
                    class254 var9 = new class254();
                    var9.field3311 = 2;
                    return var9;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IF)F")
    public final float method433(int arg0, float arg1) {
        if (arg0 != -27156) {
            this.field8393 = -122;
        }
        ++field8391;
        return arg1;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(II[IIIIII)V")
    public final void method430(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        super.field6476.method3011(-127, this);
        if (arg0 == 0) {
            arg0 = arg6;
        }
        ++field8399;
        if (arg7 < 30) {
            this.method432(true, false, (byte) 89);
        }
        if (~arg0 != ~arg6) {
            OpenGL.glPixelStorei(3314, arg0);
        }
        OpenGL.glTexSubImage2Di(super.field6467, 0, arg1, arg5, arg6, arg4, 32993, super.field6476.field9954, arg2, arg3);
        if (arg0 != arg6) {
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ZZB)V")
    public final void method432(boolean arg0, boolean arg1, byte arg2) {
        ++field8398;
        if (arg2 < 79) {
            this.method436((byte) -39);
        }
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(I)I")
    public final int method435(int arg0) {
        ++field8397;
        if (arg0 != 2367) {
            this.method430(101, -68, (int[]) null, -62, -100, 48, 29, 46);
        }
        return this.field8388;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lkd;Lwu;II[FII)V")
    public class578(class700 arg0, class149 arg1, int arg2, int arg3, float[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class106.field1577, arg2 * arg3, false);
        this.field8388 = arg3;
        this.field8393 = arg2;
        super.field6476.method3011(-127, this);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Df(super.field6467, 0, this.method2630(9536), arg2, arg3, 0, class362.method2224(super.field6458, 6406), 5126, arg4, arg5 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lkd;Lwu;II[BII)V")
    public class578(class700 arg0, class149 arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6) {
        super(arg0, 34037, arg1, class106.field1573, arg2 * arg3, false);
        this.field8388 = arg3;
        this.field8393 = arg2;
        super.field6476.method3011(-128, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg6);
        OpenGL.glTexImage2Dub(super.field6467, 0, this.method2630(9536), arg2, arg3, 0, class362.method2224(super.field6458, 6406), 5121, arg4, arg5);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(IIIIII[BLwu;I)V")
    public final void method434(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, class149 arg7, int arg8) {
        super.field6476.method3011(-128, this);
        if (arg3 == 0) {
            arg3 = arg1;
        }
        ++field8389;
        OpenGL.glPixelStorei(3317, 1);
        if (arg8 != -11100) {
            this.method433(109, -0.29306984F);
        }
        if (arg1 != arg3) {
            OpenGL.glPixelStorei(3314, arg3);
        }
        OpenGL.glTexSubImage2Dub(super.field6467, 0, arg5, arg2, arg1, arg0, class362.method2224(arg7, 6406), 5121, arg6, arg4);
        if (arg1 != arg3) {
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(FI)F")
    public final float method429(float arg0, int arg1) {
        ++field8392;
        return arg1 > -35 ? -0.37359115F : arg0;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lkd;II[III)V")
    public class578(class700 arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5) {
        super(arg0, 34037, class564.field8245, class106.field1573, arg1 * arg2, false);
        this.field8393 = arg1;
        this.field8388 = arg2;
        super.field6476.method3011(-127, this);
        OpenGL.glPixelStorei(3314, arg5);
        OpenGL.glTexImage2Di(super.field6467, 0, 6408, this.field8393, this.field8388, 0, 32993, super.field6476.field9954, arg3, arg4 * 4);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "(Lkd;Lwu;Lbk;II)V")
    public class578(class700 arg0, class149 arg1, class106 arg2, int arg3, int arg4) {
        super(arg0, 34037, arg1, arg2, arg3 * arg4, false);
        this.field8393 = arg3;
        this.field8388 = arg4;
        super.field6476.method3011(-128, this);
        OpenGL.glTexImage2Dub(super.field6467, 0, this.method2630(9536), arg3, arg4, 0, class362.method2224(super.field6458, 6406), class115.method854(super.field6473, (byte) -118), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(B)Z")
    public final boolean method436(byte arg0) {
        ++field8396;
        if (arg0 != 13) {
            this.field8393 = -42;
        }
        return false;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(Z)I")
    public final int method431(boolean arg0) {
        ++field8390;
        if (arg0) {
            this.field8393 = 97;
        }
        return this.field8393;
    }
}
