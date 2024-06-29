import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class329 extends class440 {

    @OriginalMember(owner = "client!nm", name = "w", descriptor = "I")
    private int field5074 = -1;

    @OriginalMember(owner = "client!nm", name = "B", descriptor = "I")
    private int field5079 = -1;

    @OriginalMember(owner = "client!nm", name = "z", descriptor = "I")
    public int field5077;

    @OriginalMember(owner = "client!nm", name = "A", descriptor = "Lvp;")
    public static class123 field5078 = new class123(37, -1);

    @OriginalMember(owner = "client!nm", name = "v", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!nm", name = "x", descriptor = "I")
    public static int field5075;

    @OriginalMember(owner = "client!nm", name = "y", descriptor = "I")
    public static int field5076;

    @OriginalMember(owner = "client!nm", name = "C", descriptor = "I")
    public static int field5080;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Z)V", line = 3)
    public final void method329(boolean arg0) {
        if (!arg0) {
            this.field5079 = -59;
        }
        ++field5075;
        OpenGL.glFramebufferTexture2DEXT(this.field5074, this.field5079, 3553, 0, 0);
        this.field5074 = -1;
        this.field5079 = -1;
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lqg;IIZ[[BI)V", line = 18)
    public class329(class321 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field5077 = arg2;
        super.field6421.method2042(this, 0);
        for (int var7 = 0; var7 < 6; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field6412, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2673(77, true);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Z", line = 39)
    public static final boolean method2144(int arg0, int arg1, int arg2) {
        ++field5080;
        if (arg1 != -6385) {
            return true;
        } else {
            if (~arg2 == -12) {
                arg2 = 10;
            }
            class510 var3 = class246.field3567.method609(arg1 ^ -6285, arg0);
            if (arg2 >= 5 && ~arg2 >= -9) {
                arg2 = 4;
            }
            return var3.method3025(arg2, -117);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V", line = 61)
    public static void method2145(byte arg0) {
        field5078 = null;
        if (arg0 < 61) {
            method2145((byte) -65);
        }
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lqg;II)V", line = 109)
    public class329(class321 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field5077 = arg2;
        super.field6421.method2042(this, 0);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(34069 - -var4, 0, super.field6412, arg2, arg2, 0, class347.method2251(82, super.field6412), 5121, (byte[]) null, 0);
        }
        this.method2673(-85, true);
    }

    @OriginalMember(owner = "client!nm", name = "<init>", descriptor = "(Lqg;IIZ[[I)V", line = 126)
    public class329(class321 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field5077 = arg2;
        super.field6421.method2042(this, 0);
        if (arg3) {
            for (int var6 = 0; var6 < 6; ++var6) {
                class51.method369((byte) 61, 32993, arg2, var6 + 34069, super.field6421.field4860, arg2, arg4[var6], super.field6412);
            }
        } else {
            for (int var7 = 0; ~var7 > -7; ++var7) {
                OpenGL.glTexImage2Di(var7 + 34069, 0, super.field6412, arg2, arg2, 0, 32993, super.field6421.field4860, arg4[var7], 0);
            }
        }
        this.method2673(88, true);
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIIII)V", line = 76)
    public static final void method2146(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field5073;
        if (~(arg1 - arg2) <= ~class322.field4945 && ~class145.field2134 <= ~(arg1 + arg2) && ~(-arg2 + arg3) <= ~class229.field3347 && ~(arg2 + arg3) >= ~class156.field2366) {
            class50.method362(arg3, 0, arg2, arg4, arg1);
        } else {
            class522.method3085(arg3, arg2, arg1, (byte) 105, arg4);
        }
        if (arg0 != 0) {
            method2144(84, 127, 107);
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IBIII)V", line = 93)
    public final void method2147(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 < 59) {
            this.field5079 = 56;
        }
        ++field5076;
        OpenGL.glFramebufferTexture2DEXT(arg3, arg0, arg2, super.field6422, arg4);
        this.field5074 = arg3;
        this.field5079 = arg0;
    }
}
