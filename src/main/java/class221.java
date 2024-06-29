import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class221 extends class492 {

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    private int field3166 = -1;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    private int field3169 = -1;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public int field3173;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field3175 = 0;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "Lku;")
    public static class254 field3167 = new class254();

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "Lpi;")
    public static class342 field3177 = new class342("glow2:", "leuchten2:", "brillant2:", "brilho2:");

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "F")
    public static float field3172;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field3165;

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field3168;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public static int field3170;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "I")
    public static int field3171;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field3176;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "Lbu;")
    public static class17 field3174;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IIIIIIIIII)V", line = 4)
    public static final void method1468(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3170;
        if (~arg7 <= -129 && arg4 >= 128 && arg7 <= (class33.field662 + -2) * 128 && arg4 <= (class121.field1966 + -2) * 128) {
            int var10 = -arg2 + class343.method2188(arg1, arg7, (byte) -102, arg4);
            class513.field7546.method876(arg9, 0, arg8);
            class4.field109.method302(class513.field7546);
            class4.field109.method279(arg7, var10, arg4, class72.field1246);
            class513.field7546.method876(-arg9, 0, 0);
            class4.field109.method302(class513.field7546);
        } else {
            class72.field1246[0] = class72.field1246[1] = -1;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V", line = 24)
    public final void method1055(byte arg0) {
        OpenGL.glFramebufferTexture2DEXT(this.field3169, this.field3166, 3553, 0, 0);
        ++field3168;
        this.field3169 = -1;
        this.field3166 = -1;
        if (arg0 > -52) {
            method1469((byte) -36);
        }
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lvj;IIZ[[BI)V", line = 37)
    public class221(class303 arg0, int arg1, int arg2, boolean arg3, byte[][] arg4, int arg5) {
        super(arg0, 34067, arg1, arg2 * 6 * arg2, arg3);
        this.field3173 = arg2;
        super.field7283.method1990(this, 11864);
        for (int var7 = 0; ~var7 > -7; ++var7) {
            OpenGL.glTexImage2Dub(var7 + 34069, 0, super.field7280, arg2, arg2, 0, arg5, 5121, arg4[var7], 0);
        }
        this.method2929((byte) -58, true);
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lvj;II)V", line = 57)
    public class221(class303 arg0, int arg1, int arg2) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, false);
        this.field3173 = arg2;
        super.field7283.method1990(this, 11864);
        for (int var4 = 0; ~var4 > -7; ++var4) {
            OpenGL.glTexImage2Dub(var4 + 34069, 0, super.field7280, arg2, arg2, 0, class430.method2574(super.field7280, (byte) 73), 5121, (byte[]) null, 0);
        }
        this.method2929((byte) -109, true);
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(B)V", line = 77)
    public static void method1469(byte arg0) {
        if (arg0 == -104) {
            field3174 = null;
            field3177 = null;
            field3167 = null;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Lmq;IBI)V", line = 89)
    public static final void method1470(class350 arg0, int arg1, byte arg2, int arg3) {
        if (arg0.field5327 != 0) {
            if (arg0.field5327 != 1) {
                if (arg0.field5327 != 2) {
                    if (arg0.field5327 != 3) {
                        if (arg0.field5327 == 4) {
                            arg0.field5225 = (arg0.field5355 * arg1 >> 14) + (arg1 - arg0.field5329) / 2;
                        } else {
                            arg0.field5225 = -arg0.field5329 + arg1 + -(arg0.field5355 * arg1 >> 14);
                        }
                    } else {
                        arg0.field5225 = arg0.field5355 * arg1 >> 14;
                    }
                } else {
                    arg0.field5225 = -arg0.field5329 + arg1 + -arg0.field5355;
                }
            } else {
                arg0.field5225 = (-arg0.field5329 + arg1) / 2 - -arg0.field5355;
            }
        } else {
            arg0.field5225 = arg0.field5355;
        }
        ++field3165;
        if (arg0.field5246 == 0) {
            arg0.field5234 = arg0.field5293;
        } else if (~arg0.field5246 == -2) {
            arg0.field5234 = (-arg0.field5269 + arg3) / 2 + arg0.field5293;
        } else if (arg0.field5246 == 2) {
            arg0.field5234 = -arg0.field5293 + arg3 - arg0.field5269;
        } else if (arg0.field5246 == 3) {
            arg0.field5234 = arg0.field5293 * arg3 >> 14;
        } else if (arg0.field5246 == 4) {
            arg0.field5234 = (arg0.field5293 * arg3 >> 14) + (-arg0.field5269 + arg3) / 2;
        } else {
            arg0.field5234 = -(arg0.field5293 * arg3 >> 14) + -arg0.field5269 + arg3;
        }
        if (class210.field3027 && (~client.method1349(arg0).field3585 != -1 || arg0.field5215 == 0)) {
            if (~arg0.field5234 <= -1) {
                if (arg3 < arg0.field5234 - -arg0.field5269) {
                    arg0.field5234 = -arg0.field5269 + arg3;
                }
            } else {
                arg0.field5234 = 0;
            }
            if (arg0.field5225 >= 0) {
                if (~(arg0.field5329 + arg0.field5225) < ~arg1) {
                    arg0.field5225 = -arg0.field5329 + arg1;
                }
            } else {
                arg0.field5225 = 0;
            }
        }
        if (arg2 != 119) {
            method1469((byte) 12);
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZIII)V", line = 162)
    public final void method1471(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        OpenGL.glFramebufferTexture2DEXT(arg3, arg2, arg0, super.field7277, arg4);
        ++field3171;
        if (!arg1) {
            this.method1055((byte) 70);
        }
        this.field3166 = arg2;
        this.field3169 = arg3;
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(Lvj;IIZ[[I)V", line = 192)
    public class221(class303 arg0, int arg1, int arg2, boolean arg3, int[][] arg4) {
        super(arg0, 34067, arg1, arg2 * arg2 * 6, arg3);
        this.field3173 = arg2;
        super.field7283.method1990(this, 11864);
        if (!arg3) {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, super.field7280, arg2, arg2, 0, 32993, super.field7283.field4539, arg4[var6], 0);
            }
        } else {
            for (int var7 = 0; var7 < 6; ++var7) {
                class99.method740(var7 + 34069, super.field7283.field4539, -21467, arg2, arg2, arg4[var7], super.field7280, 32993);
            }
        }
        this.method2929((byte) -67, true);
    }
}
