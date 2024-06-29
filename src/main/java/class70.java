import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sga")
public class class70 extends class695 {

    @OriginalMember(owner = "client!sga", name = "x", descriptor = "I")
    private int field976 = -1;

    @OriginalMember(owner = "client!sga", name = "B", descriptor = "I")
    private int field980 = -1;

    @OriginalMember(owner = "client!sga", name = "D", descriptor = "I")
    public int field982;

    @OriginalMember(owner = "client!sga", name = "y", descriptor = "I")
    public int field977;

    @OriginalMember(owner = "client!sga", name = "G", descriptor = "I")
    public int field985;

    @OriginalMember(owner = "client!sga", name = "z", descriptor = "[I")
    public static int[] field978 = new int[5];

    @OriginalMember(owner = "client!sga", name = "A", descriptor = "I")
    public static int field979;

    @OriginalMember(owner = "client!sga", name = "C", descriptor = "I")
    public static int field981;

    @OriginalMember(owner = "client!sga", name = "E", descriptor = "I")
    public static int field983;

    @OriginalMember(owner = "client!sga", name = "F", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!sga", name = "H", descriptor = "I")
    public static int field986;

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(BI)Lcv;")
    public static final class570 method631(byte arg0, int arg1) {
        if (arg0 <= 16) {
            method632(-48, (byte[]) null);
        }
        ++field979;
        if (~arg1 == -1) {
            if ((double) class73.field1021 == 3.0D) {
                return class96.field1334;
            }
            if ((double) class73.field1021 == 4.0D) {
                return class362.field4669;
            }
            if ((double) class73.field1021 == 6.0D) {
                return class127.field1809;
            }
            if ((double) class73.field1021 >= 8.0D) {
                return class231.field3034;
            }
        } else if (arg1 != 1) {
            if (~arg1 == -3) {
                if ((double) class73.field1021 == 3.0D) {
                    return class276.field3469;
                }
                if ((double) class73.field1021 == 4.0D) {
                    return class234.field3058;
                }
                if ((double) class73.field1021 == 6.0D) {
                    return class103.field1422;
                }
                if ((double) class73.field1021 >= 8.0D) {
                    return class94.field1319;
                }
            }
        } else {
            if ((double) class73.field1021 == 3.0D) {
                return class127.field1809;
            }
            if ((double) class73.field1021 == 4.0D) {
                return class231.field3034;
            }
            if ((double) class73.field1021 == 6.0D) {
                return class276.field3469;
            }
            if ((double) class73.field1021 >= 8.0D) {
                return class234.field3058;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lbi;IIII[BI)V")
    public class70(class483 arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        super(arg0, 32879, arg1, arg3 * arg4 * arg2, false);
        this.field982 = arg4;
        this.field977 = arg3;
        this.field985 = arg2;
        super.field9655.method2850(66, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage3Dub(super.field9659, 0, super.field9670, this.field985, this.field977, this.field982, 0, arg6, 5121, arg5, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method3898(true, 94);
    }

    @OriginalMember(owner = "client!sga", name = "<init>", descriptor = "(Lbi;IIII)V")
    public class70(class483 arg0, int arg1, int arg2, int arg3, int arg4) {
        super(arg0, 32879, arg1, arg2 * arg3 * arg4, false);
        this.field977 = arg3;
        this.field982 = arg4;
        this.field985 = arg2;
        super.field9655.method2850(68, this);
        OpenGL.glTexImage3Dub(super.field9659, 0, super.field9670, this.field985, this.field977, this.field982, 0, class212.method1362(6410, super.field9670), 5121, (byte[]) null, 0);
        this.method3898(true, 93);
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I[B)[B")
    public static final byte[] method632(int arg0, byte[] arg1) {
        ++field983;
        if (arg1 == null) {
            return null;
        } else {
            int var2 = 11 % ((78 - arg0) / 37);
            byte[] var3 = new byte[arg1.length];
            class135.method999(arg1, 0, var3, 0, arg1.length);
            return var3;
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(I)V")
    public final void method633(int arg0) {
        ++field981;
        OpenGL.glFramebufferTexture3DEXT(this.field980, this.field976, super.field9659, 0, 0, 0);
        if (arg0 > -70) {
            this.method633(-10);
        }
        this.field976 = -1;
        this.field980 = -1;
    }

    @OriginalMember(owner = "client!sga", name = "g", descriptor = "(I)V")
    public static void method634(int arg0) {
        field978 = null;
        if (arg0 != 0) {
            method634(36);
        }
    }

    @OriginalMember(owner = "client!sga", name = "a", descriptor = "(IIIIIIII)V")
    public final void method635(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field984;
        super.field9655.method2850(76, this);
        OpenGL.glCopyTexSubImage3D(super.field9659, arg2, arg0, arg3, arg6, arg7, arg1, arg5, arg4);
        OpenGL.glFlush();
    }
}
