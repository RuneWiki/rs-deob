import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class297 extends class664 implements class595 {

    @OriginalMember(owner = "client!nba", name = "S", descriptor = "I")
    private int field3991;

    @OriginalMember(owner = "client!nba", name = "E", descriptor = "I")
    private int field3977;

    @OriginalMember(owner = "client!nba", name = "B", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!nba", name = "C", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!nba", name = "D", descriptor = "I")
    public static int field3976;

    @OriginalMember(owner = "client!nba", name = "F", descriptor = "I")
    public static int field3978;

    @OriginalMember(owner = "client!nba", name = "G", descriptor = "I")
    public static int field3979;

    @OriginalMember(owner = "client!nba", name = "H", descriptor = "I")
    public static int field3980;

    @OriginalMember(owner = "client!nba", name = "I", descriptor = "I")
    public static int field3981;

    @OriginalMember(owner = "client!nba", name = "J", descriptor = "I")
    public static int field3982;

    @OriginalMember(owner = "client!nba", name = "K", descriptor = "I")
    public static int field3983;

    @OriginalMember(owner = "client!nba", name = "L", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!nba", name = "M", descriptor = "I")
    public static int field3985;

    @OriginalMember(owner = "client!nba", name = "N", descriptor = "I")
    public static int field3986;

    @OriginalMember(owner = "client!nba", name = "O", descriptor = "I")
    public static int field3987;

    @OriginalMember(owner = "client!nba", name = "P", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!nba", name = "Q", descriptor = "I")
    public static int field3989;

    @OriginalMember(owner = "client!nba", name = "R", descriptor = "I")
    public static int field3990;

    @OriginalMember(owner = "client!nba", name = "A", descriptor = "Lnfa;")
    public static class92 field3973;

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lmc;Lnl;IIZ[BII)V", line = 3)
    public class297(class381 arg0, class50 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class680.field9664, arg2 * arg3, arg4);
        this.field3991 = arg3;
        this.field3977 = arg2;
        super.field9406.method1884(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        if (arg4 && ~arg7 == -1 && ~arg6 == -1) {
            this.method3684((byte) 42, arg5, arg2, arg3, super.field9404);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Dub(super.field9404, 0, this.method3678(-17641), arg2, arg3, 0, class54.method313(-107, super.field9405), 5121, arg5, arg6);
            OpenGL.glPixelStorei(3314, 0);
        }
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lnl;IB[BIIIII)V", line = 24)
    public final void method173(class50 arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field3989;
        if (arg2 != -99) {
            this.method169(true, (byte) -26, false);
        }
        super.field9406.method1884(this, -2);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glPixelStorei(3314, arg7);
        OpenGL.glTexSubImage2Dub(super.field9404, 0, arg4, arg5, arg6, arg1, class54.method313(-109, arg0), 5121, arg3, arg8);
        OpenGL.glPixelStorei(3314, 0);
        OpenGL.glPixelStorei(3317, 4);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 42)
    public static final boolean method1772(String arg0, int arg1) {
        ++field3982;
        if (arg0 == null) {
            return false;
        } else {
            for (int var2 = 0; ~class110.field1323 < ~var2; ++var2) {
                if (arg0.equalsIgnoreCase(class320.field4711[var2])) {
                    return true;
                }
            }
            if (arg0.equalsIgnoreCase(class596.field8164.field7191)) {
                return true;
            } else {
                if (arg1 <= 5) {
                    field3975 = 93;
                }
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIII[IIII)V", line = 70)
    public final void method171(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7) {
        ++field3984;
        super.field9406.method1884(this, arg1 ^ -27729);
        if (arg1 != 27729) {
            method1775(22, -78, (byte) 54);
        }
        OpenGL.glPixelStorei(3314, arg2);
        OpenGL.glTexSubImage2Di(super.field9404, 0, arg6, arg3, arg7, arg5, 32993, super.field9406.field5546, arg4, arg0);
        OpenGL.glPixelStorei(3314, 0);
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lmc;IIZ[III)V", line = 84)
    public class297(class381 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, 3553, class420.field5862, class680.field9664, arg1 * arg2, arg3);
        this.field3991 = arg2;
        this.field3977 = arg1;
        super.field9406.method1884(this, -2);
        if (arg3 && ~arg6 == -1 && arg5 == 0) {
            this.method3685(arg4, arg1, arg2, super.field9404, -7441);
        } else {
            OpenGL.glPixelStorei(3314, arg6);
            OpenGL.glTexImage2Di(super.field9404, 0, 6408, this.field3977, this.field3991, 0, 32993, super.field9406.field5546, arg4, arg5 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(II)V", line = 104)
    public static final void method1773(int arg0, int arg1) {
        int var2 = 47 / ((47 - arg1) / 43);
        class37.method220(-119);
        ++field3974;
        int var3 = class48.field654.method2610(arg0, (byte) -101).field2277;
        if (~var3 != -1) {
            int var4 = class327.field4771.field4959[arg0];
            if (var3 == 6) {
                class242.field3158 = var4;
            }
            if (~var3 == -6) {
                class291.field3890 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "(I)V", line = 127)
    public static void method1774(int arg0) {
        field3973 = null;
        int var1 = 79 / ((arg0 - 32) / 47);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIB)Z", line = 138)
    public static final boolean method1775(int arg0, int arg1, byte arg2) {
        ++field3986;
        int var3 = -83 / ((-20 - arg2) / 63);
        return ~(arg1 & 2048) != -1;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)I", line = 148)
    public static final int method1776(int arg0, int arg1, int arg2) {
        ++field3988;
        if (~arg1 != -5 && arg1 != 5) {
            if (arg2 != 5834) {
                method1772((String) null, 20);
            }
            return 256;
        } else {
            return class95.field1178[3 & arg0];
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IF)F", line = 164)
    public final float method168(int arg0, float arg1) {
        if (arg0 != 31688) {
            this.method173((class50) null, 63, (byte) 76, (byte[]) null, -125, -100, -100, 21, 9);
        }
        ++field3987;
        return arg1 / (float) this.field3977;
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lmc;Lnl;IIZ[FII)V", line = 176)
    public class297(class381 arg0, class50 arg1, int arg2, int arg3, boolean arg4, float[] arg5, int arg6, int arg7) {
        super(arg0, 3553, arg1, class680.field9668, arg2 * arg3, arg4);
        this.field3977 = arg2;
        this.field3991 = arg3;
        super.field9406.method1884(this, -2);
        if (!arg4 && arg7 == 0 && arg6 == 0) {
            this.method3679(arg2, arg5, super.field9404, (byte) -114, arg3);
        } else {
            OpenGL.glPixelStorei(3314, arg7);
            OpenGL.glTexImage2Df(super.field9404, 0, this.method3678(-17641), arg2, arg3, 0, class54.method313(-103, super.field9405), 5126, arg5, arg6 * 4);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ZBZ)V", line = 195)
    public final void method169(boolean arg0, byte arg1, boolean arg2) {
        if (arg1 != -68) {
            method1776(52, 28, 88);
        }
        ++field3981;
        super.field9406.method1884(this, arg1 ^ 66);
        OpenGL.glTexParameteri(super.field9404, 10242, !arg2 ? 33071 : 10497);
        OpenGL.glTexParameteri(super.field9404, 10243, !arg0 ? 33071 : 10497);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(FI)F", line = 208)
    public final float method170(float arg0, int arg1) {
        ++field3990;
        return arg1 != -17968 ? 1.1932476F : arg0 / (float) this.field3991;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "([FIIIIIILnl;Z)V", line = 222)
    public final void method1777(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class50 arg7, boolean arg8) {
        super.field9406.method1884(this, -2);
        if (arg8) {
            ++field3976;
            OpenGL.glPixelStorei(3314, arg5);
            OpenGL.glTexSubImage2Df(super.field9404, 0, arg1, arg4, arg2, arg6, class54.method313(-89, arg7), 5121, arg0, arg3);
            OpenGL.glPixelStorei(3314, 0);
        }
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(I)I", line = 241)
    public final int method166(int arg0) {
        ++field3980;
        if (arg0 != 8281) {
            method1775(-75, 26, (byte) -109);
        }
        return this.field3991;
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(Lmc;Lnl;Leea;II)V", line = 255)
    public class297(class381 arg0, class50 arg1, class680 arg2, int arg3, int arg4) {
        super(arg0, 3553, arg1, arg2, arg3 * arg4, false);
        this.field3991 = arg4;
        this.field3977 = arg3;
        super.field9406.method1884(this, -2);
        OpenGL.glTexImage2Dub(super.field9404, 0, this.method3678(-17641), arg3, arg4, 0, class54.method313(-108, super.field9405), class202.method1272((byte) 110, super.field9395), (byte[]) null, 0);
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(III)Z", line = 268)
    public static final boolean method1778(int arg0, int arg1, int arg2) {
        if (arg2 > -85) {
            method1778(72, -10, -116);
        }
        ++field3983;
        return ~(arg0 & 32) != -1;
    }

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "(I)I", line = 279)
    public final int method164(int arg0) {
        if (arg0 != 1994) {
            field3973 = null;
        }
        ++field3985;
        return this.field3977;
    }

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "(I)Z", line = 290)
    public final boolean method167(int arg0) {
        if (arg0 != 30117) {
            return false;
        } else {
            ++field3978;
            return true;
        }
    }
}
