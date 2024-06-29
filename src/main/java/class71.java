import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eg")
public class class71 extends class312 implements class164 {

    @OriginalMember(owner = "client!eg", name = "u", descriptor = "Lgp;")
    public class36 field1008;

    @OriginalMember(owner = "client!eg", name = "o", descriptor = "Z")
    private boolean field1002;

    @OriginalMember(owner = "client!eg", name = "G", descriptor = "Lah;")
    public static class263 field1020 = new class263(5000);

    @OriginalMember(owner = "client!eg", name = "J", descriptor = "Lqu;")
    public static class65 field1023 = new class65(14, 0, 4, 1);

    @OriginalMember(owner = "client!eg", name = "M", descriptor = "I")
    public static int field1026 = -1;

    @OriginalMember(owner = "client!eg", name = "N", descriptor = "Lob;")
    public static class521 field1027 = new class521(57, 4);

    @OriginalMember(owner = "client!eg", name = "O", descriptor = "I")
    public static int field1028 = -1;

    @OriginalMember(owner = "client!eg", name = "m", descriptor = "I")
    public static int field1000;

    @OriginalMember(owner = "client!eg", name = "n", descriptor = "I")
    public static int field1001;

    @OriginalMember(owner = "client!eg", name = "p", descriptor = "I")
    public static int field1003;

    @OriginalMember(owner = "client!eg", name = "q", descriptor = "I")
    public static int field1004;

    @OriginalMember(owner = "client!eg", name = "r", descriptor = "I")
    public static int field1005;

    @OriginalMember(owner = "client!eg", name = "s", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!eg", name = "t", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!eg", name = "v", descriptor = "I")
    public static int field1009;

    @OriginalMember(owner = "client!eg", name = "w", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!eg", name = "x", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!eg", name = "y", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!eg", name = "z", descriptor = "I")
    public static int field1013;

    @OriginalMember(owner = "client!eg", name = "A", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!eg", name = "B", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!eg", name = "C", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!eg", name = "D", descriptor = "I")
    public static int field1017;

    @OriginalMember(owner = "client!eg", name = "E", descriptor = "I")
    public static int field1018;

    @OriginalMember(owner = "client!eg", name = "F", descriptor = "I")
    public static int field1019;

    @OriginalMember(owner = "client!eg", name = "I", descriptor = "I")
    public static int field1022;

    @OriginalMember(owner = "client!eg", name = "K", descriptor = "I")
    public static int field1024;

    @OriginalMember(owner = "client!eg", name = "l", descriptor = "I")
    public static int field999;

    @OriginalMember(owner = "client!eg", name = "L", descriptor = "Lph;")
    public static class458 field1025;

    @OriginalMember(owner = "client!eg", name = "H", descriptor = "[I")
    public static int[] field1021;

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lya;I)Lag;", line = 5)
    public final class484 method29(class38 arg0, int arg1) {
        ++field999;
        class475 var3 = this.field1008.method249(super.field4693, super.field4695, 2048, true, arg0, (byte) -107, false);
        if (var3 == null) {
            return null;
        } else {
            class125 var4 = arg0.method296();
            if (arg1 <= 22) {
                field1020 = null;
            }
            var4.method206(super.field4693, super.field4697, super.field4695);
            class484 var5 = null;
            if (this.field1002) {
                var5 = class133.method971(1, 0);
            }
            if (this.field1008.field406 != null) {
                class341 var6 = this.field1008.field406.method2221();
                arg0.method311(var3, var6, var4, var5 == null ? null : var5.field6964[0], 0);
            } else {
                var3.method439(var4, var5 == null ? null : var5.field6964[0], 0);
            }
            int var7 = super.field4693 >> 7;
            int var8 = super.field4695 >> 7;
            this.field1008.method243(arg0, var7, var8, var3, true, var7, -23689, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!eg", name = "d", descriptor = "(I)Z", line = 47)
    public final boolean method614(int arg0) {
        ++field1007;
        if (arg0 != -1086) {
            this.method27((byte) -35, (class38) null, 56, 116);
        }
        return this.field1008.method240(arg0 + 14313);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lya;ZI)Lt;", line = 59)
    public final class475 method615(class38 arg0, boolean arg1, int arg2) {
        ++field1017;
        if (arg1) {
            field1023 = null;
        }
        return this.field1008.method249(0, 0, arg2, false, arg0, (byte) -98, false);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(IILya;ILor;IZ)V", line = 70)
    public final void method23(int arg0, int arg1, class38 arg2, int arg3, class455 arg4, int arg5, boolean arg6) {
        ++field1018;
        if (arg0 == 3) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(I)V", line = 86)
    public final void method616(int arg0) {
        ++field1010;
        if (arg0 != 23504) {
            method626(126);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Lya;Z)V", line = 97)
    public final void method25(class38 arg0, boolean arg1) {
        if (arg1) {
            method622(true, (String) null, (class188) null, -55);
        }
        ++field1003;
        class475 var3 = this.field1008.method249(super.field4693, super.field4695, 262144, true, arg0, (byte) -67, true);
        if (var3 != null) {
            int var4 = super.field4693 >> 7;
            int var5 = super.field4695 >> 7;
            this.field1008.method243(arg0, var4, var5, var3, false, var4, -23689, var5);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(BLya;II)Z", line = 119)
    public final boolean method27(byte arg0, class38 arg1, int arg2, int arg3) {
        if (arg0 > -119) {
            return false;
        } else {
            ++field1011;
            class475 var5 = this.field1008.method249(super.field4693, super.field4695, 131072, false, arg1, (byte) -68, false);
            if (var5 == null) {
                return false;
            } else {
                class125 var6 = arg1.method296();
                var6.method206(super.field4693, super.field4697, super.field4695);
                return var5.method440(arg3, arg2, var6, false);
            }
        }
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(B)V", line = 138)
    public static final void method617(byte arg0) {
        ++field1009;
        class477.field6878 = new class295(class524.field7674.method1635(class224.field3673, (byte) 126), "", class287.field4348, 1001, -1, 0L, 0, 0, true, false);
        int var1 = 51 % ((44 - arg0) / 43);
    }

    @OriginalMember(owner = "client!eg", name = "h", descriptor = "(I)V", line = 148)
    public static void method618(int arg0) {
        field1020 = null;
        field1021 = null;
        field1025 = null;
        field1023 = null;
        field1027 = null;
        if (arg0 != 1) {
            method620((byte) -22);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLya;)V", line = 162)
    public final void method619(boolean arg0, class38 arg1) {
        ++field1012;
        if (!arg0) {
            field1021 = null;
        }
        this.field1008.method245(arg1, 80);
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(B)V", line = 177)
    public static final void method620(byte arg0) {
        ++field1001;
        if (class532.field7841 != null) {
            class532.field7841.method1072(50);
        }
        if (class98.field1401 != null) {
            class98.field1401.method1072(50);
        }
        if (arg0 <= 32) {
            method625(-6, -50);
        }
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(I)I", line = 196)
    public final int method621(int arg0) {
        ++field1013;
        if (arg0 != 3021) {
            field1021 = null;
        }
        return this.field1008.field416;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ZLjava/lang/String;Lkd;I)Lsn;", line = 211)
    public static final class447 method622(boolean arg0, String arg1, class188 arg2, int arg3) {
        ++field1005;
        long var4 = OpenGL.glCreateShaderObjectARB(arg3);
        OpenGL.glShaderSourceARB(var4, arg1);
        OpenGL.glCompileShaderARB(var4);
        OpenGL.glGetObjectParameterivARB(var4, 35713, class64.field781, 0);
        if (~class64.field781[0] == -1) {
            if (class64.field781[0] == 0) {
                System.out.println("Shader compile failed:");
            }
            OpenGL.glGetObjectParameterivARB(var4, 35716, class64.field781, 1);
            if (~class64.field781[1] < -2) {
                byte[] var6 = new byte[class64.field781[1]];
                OpenGL.glGetInfoLogARB(var4, class64.field781[1], class64.field781, 0, var6, 0);
                System.out.println(new String(var6));
            }
            if (~class64.field781[0] == -1) {
                OpenGL.glDeleteObjectARB(var4);
                return null;
            }
        }
        return !arg0 ? null : new class447(arg2, var4, arg3);
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(ILya;)V", line = 255)
    public final void method623(int arg0, class38 arg1) {
        this.field1008.method251(arg1, 1);
        if (arg0 < 125) {
            this.method29((class38) null, -99);
        }
        ++field1016;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(Z)V", line = 267)
    public final void method21(boolean arg0) {
        ++field1022;
        if (arg0) {
            this.method614(118);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!eg", name = "f", descriptor = "(I)Z", line = 278)
    public final boolean method17(int arg0) {
        if (arg0 != 13651334) {
            field1021 = null;
        }
        ++field1004;
        return false;
    }

    @OriginalMember(owner = "client!eg", name = "<init>", descriptor = "(Lya;Ljt;IIIIIZIII)V", line = 289)
    public class71(class38 arg0, class69 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, class121.method906(arg9, 114, arg8));
        this.field1008 = new class36(arg0, arg1, arg8, arg9, arg2, arg3, super.field4693, super.field4695, arg7, arg10);
        this.field1002 = ~arg1.field922 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(B)I", line = 298)
    public final int method624(byte arg0) {
        ++field1000;
        if (arg0 >= -119) {
            field1025 = null;
        }
        return this.field1008.field405;
    }

    @OriginalMember(owner = "client!eg", name = "a", descriptor = "(II)I", line = 314)
    public static final int method625(int arg0, int arg1) {
        if (arg0 != 1809521479) {
            return -96;
        } else {
            ++field1006;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!eg", name = "i", descriptor = "(I)[Ltr;", line = 327)
    public static final class195[] method626(int arg0) {
        if (arg0 != 0) {
            method622(true, (String) null, (class188) null, 25);
        }
        ++field1019;
        return new class195[] { class135.field2058, class1.field5, class383.field5770, class421.field6273, class231.field3745, class32.field366, class378.field5704, class285.field4327, class475.field6848, class156.field2336, class379.field5715, class74.field1064, class456.field6642, class263.field4049, class320.field4813 };
    }

    @OriginalMember(owner = "client!eg", name = "c", descriptor = "(I)I", line = 345)
    public final int method627(int arg0) {
        if (arg0 != 23326) {
            field1020 = null;
        }
        ++field1015;
        return this.field1008.field427;
    }

    @OriginalMember(owner = "client!eg", name = "b", descriptor = "(II)V", line = 359)
    public static final void method628(int arg0, int arg1) {
        ++field1014;
        if (arg0 == -22474) {
            class211 var2 = class452.method2749(4, 126, arg1);
            var2.method1460(true);
        }
    }
}
