import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ck")
public class class594 extends class126 implements class614 {

    @OriginalMember(owner = "client!ck", name = "Z", descriptor = "Z")
    private boolean field8410 = false;

    @OriginalMember(owner = "client!ck", name = "Y", descriptor = "Lkh;")
    public class15 field8409;

    @OriginalMember(owner = "client!ck", name = "H", descriptor = "Z")
    private boolean field8394;

    @OriginalMember(owner = "client!ck", name = "P", descriptor = "I")
    public static int field8401 = 0;

    @OriginalMember(owner = "client!ck", name = "E", descriptor = "I")
    public static int field8391 = 0;

    @OriginalMember(owner = "client!ck", name = "F", descriptor = "I")
    public static int field8392;

    @OriginalMember(owner = "client!ck", name = "G", descriptor = "I")
    public static int field8393;

    @OriginalMember(owner = "client!ck", name = "I", descriptor = "I")
    public static int field8395;

    @OriginalMember(owner = "client!ck", name = "J", descriptor = "I")
    public static int field8396;

    @OriginalMember(owner = "client!ck", name = "K", descriptor = "I")
    public static int field8397;

    @OriginalMember(owner = "client!ck", name = "L", descriptor = "I")
    public static int field8398;

    @OriginalMember(owner = "client!ck", name = "M", descriptor = "I")
    public static int field8399;

    @OriginalMember(owner = "client!ck", name = "O", descriptor = "I")
    public static int field8400;

    @OriginalMember(owner = "client!ck", name = "Q", descriptor = "I")
    public static int field8402;

    @OriginalMember(owner = "client!ck", name = "R", descriptor = "I")
    public static int field8403;

    @OriginalMember(owner = "client!ck", name = "S", descriptor = "I")
    public static int field8404;

    @OriginalMember(owner = "client!ck", name = "T", descriptor = "I")
    public static int field8405;

    @OriginalMember(owner = "client!ck", name = "U", descriptor = "I")
    public static int field8406;

    @OriginalMember(owner = "client!ck", name = "V", descriptor = "I")
    public static int field8407;

    @OriginalMember(owner = "client!ck", name = "X", descriptor = "I")
    public static int field8408;

    @OriginalMember(owner = "client!ck", name = "ab", descriptor = "I")
    public static int field8411;

    @OriginalMember(owner = "client!ck", name = "bb", descriptor = "I")
    public static int field8412;

    @OriginalMember(owner = "client!ck", name = "cb", descriptor = "I")
    public static int field8413;

    @OriginalMember(owner = "client!ck", name = "db", descriptor = "I")
    public static int field8414;

    @OriginalMember(owner = "client!ck", name = "D", descriptor = "Lnu;")
    private class548 field8390;

    @OriginalMember(owner = "client!ck", name = "c", descriptor = "(I)V", line = 3)
    public final void method1174(int arg0) {
        if (arg0 != -24082) {
            this.method1185(33, -57, (class166) null, -46);
        }
        ++field8408;
    }

    @OriginalMember(owner = "client!ck", name = "<init>", descriptor = "(Lr;Let;IIIIIZIIIII)V", line = 14)
    public class594(class166 arg0, class550 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field8409 = new class15(arg0, arg1, arg10, arg11, super.field3019, arg3, arg4, arg6, arg7, arg12);
        this.field8394 = arg1.field7746 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ILr;)V", line = 24)
    public final void method1177(int arg0, class166 arg1) {
        if (arg0 != 0) {
            this.field8390 = null;
        }
        ++field8414;
        class55 var3 = this.field8409.method87((byte) -97, false, arg1, 262144, true, super.field3029, super.field3024);
        if (var3 != null) {
            int var4 = super.field3024 >> 9;
            int var5 = super.field3029 >> 9;
            class391 var6 = arg1.method130();
            var6.method252(super.field3024, super.field3018, super.field3029);
            this.field8409.method79(var3, var5, var4, var6, false, var4, var5, -1, arg1);
        }
    }

    @OriginalMember(owner = "client!ck", name = "h", descriptor = "(I)Z", line = 48)
    public final boolean method1184(int arg0) {
        int var2 = 115 % ((arg0 - -1) / 59);
        ++field8404;
        return this.field8410;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Z)I", line = 58)
    public final int method1179(boolean arg0) {
        if (!arg0) {
            method3364(-93, 116, -18, 126, -108, (byte) -15);
        }
        ++field8411;
        return this.field8409.field148;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(B)I", line = 69)
    public final int method1171(byte arg0) {
        if (arg0 <= 39) {
            this.method1174(-23);
        }
        ++field8402;
        return this.field8409.method89(-83);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(ZI[BLhp;)Lne;", line = 84)
    public static final class287 method3363(boolean arg0, int arg1, byte[] arg2, class296 arg3) {
        ++field8407;
        long var4 = OpenGL.glCreateShaderObjectARB(arg1);
        if (arg0) {
            return null;
        } else {
            OpenGL.glShaderSourceRawARB(var4, arg2);
            OpenGL.glCompileShaderARB(var4);
            OpenGL.glGetObjectParameterivARB(var4, 35713, class260.field3966, 0);
            if (~class260.field3966[0] == -1) {
                if (class260.field3966[0] == 0) {
                    System.out.println("Shader compile failed:");
                }
                OpenGL.glGetObjectParameterivARB(var4, 35716, class260.field3966, 1);
                if (class260.field3966[1] > 1) {
                    byte[] var6 = new byte[class260.field3966[1]];
                    OpenGL.glGetInfoLogARB(var4, class260.field3966[1], class260.field3966, 0, var6, 0);
                    System.out.println(new String(var6));
                }
                if (~class260.field3966[0] == -1) {
                    OpenGL.glDeleteObjectARB(var4);
                    return null;
                }
            }
            return new class287(arg3, var4, arg1);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lr;I)V", line = 122)
    public final void method1172(class166 arg0, int arg1) {
        if (arg1 > 26) {
            ++field8413;
            this.field8409.method88((byte) -84, arg0);
        }
    }

    @OriginalMember(owner = "client!ck", name = "g", descriptor = "(I)I", line = 133)
    public final int method1182(int arg0) {
        ++field8403;
        return arg0 != -32768 ? -63 : this.field8409.method84(true);
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(I)I", line = 147)
    public final int method1175(int arg0) {
        if (arg0 != 24563) {
            return 63;
        } else {
            ++field8397;
            return this.field8409.field151;
        }
    }

    @OriginalMember(owner = "client!ck", name = "d", descriptor = "(I)Z", line = 161)
    public final boolean method1180(int arg0) {
        if (arg0 <= 100) {
            return true;
        } else {
            ++field8395;
            return this.field8409.method81((byte) -121);
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IIIIIB)V", line = 180)
    public static final void method3364(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        ++field8399;
        if (arg5 == -108) {
            for (int var6 = arg4; arg0 >= var6; ++var6) {
                class58.method623(arg2, arg3, 23309, class651.field9125[var6], arg1);
            }
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Lr;Z)V", line = 199)
    public final void method1176(class166 arg0, boolean arg1) {
        if (!arg1) {
            this.field8409.method91((byte) -108, arg0);
            ++field8400;
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(I)I", line = 212)
    public final int method1186(int arg0) {
        ++field8406;
        if (arg0 != -9960) {
            field8392 = 72;
        }
        return this.field8409.field140;
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(ILr;)Lnu;", line = 224)
    public final class548 method1183(int arg0, class166 arg1) {
        if (arg0 != 6433) {
            return null;
        } else {
            ++field8393;
            return this.field8390;
        }
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 235)
    public static final int method3365(String arg0, int arg1) {
        ++field8396;
        int var2 = arg0.length();
        int var3 = arg1;
        for (int var4 = 0; ~var4 > ~var2; ++var4) {
            var3 = arg0.charAt(var4) + -var3 + (var3 << 5);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ck", name = "i", descriptor = "(I)Z", line = 256)
    public final boolean method1181(int arg0) {
        ++field8405;
        return arg0 != -1 ? false : false;
    }

    @OriginalMember(owner = "client!ck", name = "a", descriptor = "(IILr;I)Z", line = 269)
    public final boolean method1185(int arg0, int arg1, class166 arg2, int arg3) {
        ++field8398;
        class55 var5 = this.field8409.method87((byte) -97, false, arg2, 131072, false, super.field3029, super.field3024);
        if (arg0 != -26798) {
            field8391 = -94;
        }
        if (var5 == null) {
            return false;
        } else {
            class391 var6 = arg2.method130();
            var6.method252(super.field3024 - -super.field1887, super.field3018, super.field1880 + super.field3029);
            return class676.field9574 ? var5.method492(arg3, arg1, var6, false, class341.field5008) : var5.method529(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!ck", name = "b", descriptor = "(Lr;Z)Lkq;", line = 290)
    public final class549 method1173(class166 arg0, boolean arg1) {
        ++field8412;
        class55 var3 = this.field8409.method87((byte) -97, false, arg0, 2048, true, super.field3029, super.field3024);
        if (var3 == null) {
            return null;
        } else {
            class391 var4 = arg0.method130();
            var4.method252(super.field1887 + super.field3024, super.field3018, super.field3029 - -super.field1880);
            class549 var5 = null;
            if (this.field8394) {
                var5 = class26.method321(1, 0);
            }
            int var6 = super.field3024 >> 9;
            int var7 = super.field3029 >> 9;
            this.field8409.method79(var3, var7, var6, var4, arg1, var6, var7, -1, arg0);
            if (class676.field9574) {
                var3.method495(var4, var5 == null ? null : var5.field7711[0], class341.field5008, 0);
            } else {
                var3.method513(var4, var5 == null ? null : var5.field7711[0], 0);
            }
            if (this.field8409.field134 != null) {
                class499 var8 = this.field8409.field134.method339();
                if (!class676.field9574) {
                    arg0.method156(var8);
                } else {
                    arg0.method165(var8, class341.field5008);
                }
            }
            this.field8410 = var3.method545() || this.field8409.field134 != null;
            if (this.field8390 != null) {
                class525.method3017(var3, -50, this.field8390, super.field3018, super.field3029, super.field3024);
            } else {
                this.field8390 = class149.method1060(super.field3029, super.field3024, var3, !arg1, super.field3018);
            }
            return var5;
        }
    }
}
