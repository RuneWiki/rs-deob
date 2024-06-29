import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class346 extends class337 {

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "I")
    private int field4240;

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "I")
    public int field4243;

    @OriginalMember(owner = "client!dq", name = "l", descriptor = "I")
    public int field4230;

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "I")
    private int field4244;

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
    private int field4245;

    @OriginalMember(owner = "client!dq", name = "n", descriptor = "I")
    public int field4232;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "I")
    public int field4239;

    @OriginalMember(owner = "client!dq", name = "s", descriptor = "I")
    private int field4237;

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
    private int field4246;

    @OriginalMember(owner = "client!dq", name = "q", descriptor = "Z")
    public static boolean field4235 = false;

    @OriginalMember(owner = "client!dq", name = "p", descriptor = "[J")
    public static long[] field4234 = new long[32];

    @OriginalMember(owner = "client!dq", name = "o", descriptor = "[Ljba;")
    public static class11[] field4233 = new class11[14];

    @OriginalMember(owner = "client!dq", name = "m", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!dq", name = "r", descriptor = "I")
    public static int field4236;

    @OriginalMember(owner = "client!dq", name = "t", descriptor = "I")
    public static int field4238;

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "I")
    public static int field4241;

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!dq", name = "D", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!dq", name = "E", descriptor = "I")
    public static int field4249;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ZII)I", line = 7)
    public static final int method2002(boolean arg0, int arg1, int arg2) {
        field4241++;
        int var3 = arg1 >>> 24;
        int var4 = 255 - var3;
        int var5 = ((arg1 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg1 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        return arg0 ? ((-16711936 & (arg2 & 0xFF00FF) * var4 | (arg2 & 0xFF00) * var4 & 0xFF0000) >>> 8) + var5 : -88;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIII)Z", line = 24)
    public final boolean method2003(int arg0, int arg1, int arg2, int arg3) {
        field4248++;
        if (arg0 == 2) {
            return this.field4244 == arg1 && arg3 >= this.field4245 && arg3 <= this.field4246 && this.field4237 <= arg2 && this.field4240 >= arg2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(III)Z", line = 41)
    public final boolean method2004(int arg0, int arg1, int arg2) {
        if (arg1 >= -61) {
            return false;
        } else {
            field4247++;
            return arg2 >= this.field4245 && this.field4246 >= arg2 && arg0 >= this.field4237 && arg0 <= this.field4240;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V", line = 56)
    public static final void method2005(int arg0) {
        if (arg0 != 1) {
            field4234 = null;
        }
        field4231++;
        class749.field10224 = true;
    }

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "(I)V", line = 81)
    public static void method2006(int arg0) {
        field4233 = null;
        field4234 = null;
        if (arg0 != 65280) {
            method2009((byte) -120);
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZI)Z", line = 92)
    public final boolean method2007(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            this.field4243 = 2;
        }
        field4242++;
        return arg2 >= this.field4232 && this.field4239 >= arg2 && arg0 >= this.field4243 && arg0 <= this.field4230;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II[II)V", line = 107)
    public final void method2008(int arg0, int arg1, int[] arg2, int arg3) {
        arg2[1] = this.field4232 + arg1 - this.field4245;
        if (arg0 != 255) {
            this.field4245 = 77;
        }
        field4249++;
        arg2[0] = 0;
        arg2[2] = this.field4243 + arg3 - this.field4237;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)I", line = 128)
    public static final int method2009(byte arg0) {
        field4238++;
        if (arg0 != -70) {
            field4235 = true;
        }
        return class604.field7673++;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I[IIB)V", line = 139)
    public final void method2010(int arg0, int[] arg1, int arg2, byte arg3) {
        arg1[0] = this.field4244;
        arg1[2] = this.field4237 + arg0 - this.field4243;
        arg1[1] = this.field4245 + arg2 - this.field4232;
        if (arg3 > -94) {
            field4235 = true;
        }
        field4236++;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(IIIIIIIII)V", line = 151)
    public class346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field4240 = arg4;
        this.field4243 = arg6;
        this.field4230 = arg8;
        this.field4244 = arg0;
        this.field4245 = arg1;
        this.field4232 = arg5;
        this.field4239 = arg7;
        this.field4237 = arg2;
        this.field4246 = arg3;
    }
}
