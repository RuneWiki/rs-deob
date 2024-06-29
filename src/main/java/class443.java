import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class443 extends class214 {

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "Ljn;")
    public static class322 field6431 = new class322();

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "[[I")
    public static int[][] field6437 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "[[F")
    public static float[][] field6438 = new float[][] { { -0.333333F, -0.333333F, -0.333333F }, { 0.333333F, -0.333333F, -0.333333F }, { -0.333333F, 0.333333F, -0.333333F }, { 0.333333F, 0.333333F, -0.333333F }, { -0.333333F, -0.333333F, 0.333333F }, { 0.333333F, -0.333333F, 0.333333F }, { -0.333333F, 0.333333F, 0.333333F }, { 0.333333F, 0.333333F, 0.333333F } };

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "Z")
    public static boolean field6439 = false;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    public static int field6430;

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field6433;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "I")
    public static int field6435;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field6436;

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "()V")
    public class443() {
        super(1, false);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        if (arg0 < 92) {
            method2714(-42);
        }
        ++field6433;
        if (arg2 == 0) {
            super.field3540 = arg1.method1987(-65) == 1;
        }
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)V")
    public static void method2711(int arg0) {
        if (arg0 < -45) {
            field6438 = null;
            field6437 = null;
            field6431 = null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IIB)V")
    private final void method2712(int arg0, int arg1, byte arg2) {
        ++field6434;
        if (arg2 != 33) {
            method2713(-103);
        }
        int var4 = class592.field8328[arg1];
        int var5 = class131.field2138[arg0];
        float var6 = (float) Math.atan2((double) (var4 + -2048), (double) (var5 + -2048));
        if ((double) var6 >= -3.141592653589793D && (double) var6 <= -2.356194490192345D) {
            class665.field9442 = arg0;
            class305.field4640 = arg1;
        } else if ((double) var6 <= -1.5707963267948966D && (double) var6 >= -2.356194490192345D) {
            class665.field9442 = arg1;
            class305.field4640 = arg0;
        } else if ((double) var6 <= -0.7853981633974483D && (double) var6 >= -1.5707963267948966D) {
            class665.field9442 = arg1;
            class305.field4640 = -arg0 + class626.field8787;
        } else if (var6 <= 0.0F && (double) var6 >= -0.7853981633974483D) {
            class305.field4640 = arg1;
            class665.field9442 = -arg0 + class259.field4054;
        } else if (var6 >= 0.0F && (double) var6 <= 0.7853981633974483D) {
            class305.field4640 = -arg1 + class626.field8787;
            class665.field9442 = class259.field4054 - arg0;
        } else if ((double) var6 >= 0.7853981633974483D && (double) var6 <= 1.5707963267948966D) {
            class665.field9442 = -arg1 + class259.field4054;
            class305.field4640 = -arg0 + class626.field8787;
        } else if ((double) var6 >= 1.5707963267948966D && (double) var6 <= 2.356194490192345D) {
            class305.field4640 = arg0;
            class665.field9442 = class259.field4054 - arg1;
        } else if ((double) var6 >= 2.356194490192345D && (double) var6 <= 3.141592653589793D) {
            class305.field4640 = class626.field8787 - arg1;
            class665.field9442 = arg0;
        }
        class305.field4640 &= class245.field3948;
        class665.field9442 &= class580.field8203;
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)Ljava/lang/String;")
    public static final String method2713(int arg0) {
        if (arg0 != -23941) {
            return null;
        } else {
            ++field6435;
            String var1 = "www";
            if (class723.field10141 == class209.field3494) {
                var1 = "www-wtrc";
            } else if (class549.field7833 == class209.field3494) {
                var1 = "www-wtqa";
            } else if (class222.field3608 == class209.field3494) {
                var1 = "www-wtwip";
            }
            String var2 = "";
            if (class429.field6277 != null) {
                var2 = "/p=" + class429.field6277;
            }
            return "http://" + var1 + "." + class519.field7498.field4493 + ".com/l=" + class467.field6804 + "/a=" + class459.field6658 + var2 + "/";
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(II)[[I")
    public final int[][] method62(int arg0, int arg1) {
        ++field6436;
        int[][] var3 = super.field3545.method2996((byte) 124, arg0);
        if (arg1 != -256) {
            return null;
        } else {
            if (super.field3545.field7147) {
                int[] var4 = var3[0];
                int[] var5 = var3[1];
                int[] var6 = var3[2];
                for (int var7 = 0; class626.field8787 > var7; ++var7) {
                    this.method2712(arg0, var7, (byte) 33);
                    int[][] var8 = this.method1539(true, 0, class665.field9442);
                    var4[var7] = var8[0][class305.field4640];
                    var5[var7] = var8[1][class305.field4640];
                    var6[var7] = var8[2][class305.field4640];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "(I)[Lln;")
    public static final class472[] method2714(int arg0) {
        if (arg0 != -19757) {
            method2711(52);
        }
        ++field6432;
        return new class472[] { class183.field3093, class298.field4517, class115.field1787, class138.field2160, class549.field7829, class238.field3843, class707.field9965, class672.field9508, class710.field9994, class64.field1034, class751.field10464, class335.field4916, class607.field8568, class570.field8084 };
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field6430;
        int[] var3 = super.field3544.method3869(arg0, -117);
        if (arg1 != 5) {
            field6431 = null;
        }
        if (super.field3544.field9836) {
            for (int var4 = 0; ~class626.field8787 < ~var4; ++var4) {
                this.method2712(arg0, var4, (byte) 33);
                int[] var5 = this.method1545(class665.field9442, 0, arg1 + -6);
                var3[var4] = var5[class305.field4640];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Lov;ZZ)V")
    public static final void method2715(class668 arg0, boolean arg1, boolean arg2) {
        arg0.field9468 = arg2;
        if (class238.field3835) {
            if (arg1) {
                class222.field3605[class222.field3605.length - 1].method1683(arg0, 14);
            } else {
                int var3 = class76.method691(arg0.field9481);
                int var4 = class718.field10072[2] * arg0.method89(83) / arg0.field9480;
                int var5 = class76.method691(arg0.field9481 - var4);
                int var6 = class76.method691(arg0.field9481 + var4);
                if (var5 == var6) {
                    class222.field3605[var3].method1683(arg0, 71);
                } else if (var6 - var5 == 1) {
                    class222.field3605[class286.field4406 + var5].method1683(arg0, 18);
                } else {
                    class222.field3605[class222.field3605.length - 1].method1683(arg0, 115);
                }
            }
        } else {
            class145.method1118(arg0, class313.field4712);
        }
    }
}
