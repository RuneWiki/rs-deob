import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class196 extends class559 implements class523 {

    @OriginalMember(owner = "client!lq", name = "kb", descriptor = "Z")
    private boolean field3380 = false;

    @OriginalMember(owner = "client!lq", name = "cb", descriptor = "Lpw;")
    public class101 field3372;

    @OriginalMember(owner = "client!lq", name = "lb", descriptor = "Z")
    private boolean field3381;

    @OriginalMember(owner = "client!lq", name = "nb", descriptor = "Lew;")
    public static class685 field3383 = new class685("", 10);

    @OriginalMember(owner = "client!lq", name = "O", descriptor = "I")
    public static int field3359;

    @OriginalMember(owner = "client!lq", name = "P", descriptor = "I")
    public static int field3360;

    @OriginalMember(owner = "client!lq", name = "R", descriptor = "I")
    public static int field3361;

    @OriginalMember(owner = "client!lq", name = "S", descriptor = "I")
    public static int field3362;

    @OriginalMember(owner = "client!lq", name = "T", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!lq", name = "U", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!lq", name = "V", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!lq", name = "W", descriptor = "I")
    public static int field3366;

    @OriginalMember(owner = "client!lq", name = "X", descriptor = "I")
    public static int field3367;

    @OriginalMember(owner = "client!lq", name = "Y", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!lq", name = "Z", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!lq", name = "ab", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!lq", name = "bb", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!lq", name = "db", descriptor = "I")
    public static int field3373;

    @OriginalMember(owner = "client!lq", name = "eb", descriptor = "I")
    public static int field3374;

    @OriginalMember(owner = "client!lq", name = "gb", descriptor = "I")
    public static int field3376;

    @OriginalMember(owner = "client!lq", name = "hb", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!lq", name = "ib", descriptor = "I")
    public static int field3378;

    @OriginalMember(owner = "client!lq", name = "jb", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!lq", name = "ob", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!lq", name = "pb", descriptor = "I")
    public static int field3385;

    @OriginalMember(owner = "client!lq", name = "fb", descriptor = "Lkn;")
    private class516 field3375;

    @OriginalMember(owner = "client!lq", name = "mb", descriptor = "Ljava/awt/Frame;")
    public static Frame field3382;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(Lha;I)V")
    public final void method97(class544 arg0, int arg1) {
        ++field3379;
        class282 var3 = this.field3372.method829(true, true, arg1, arg0, 262144);
        if (var3 != null) {
            class73 var4 = arg0.method343();
            var4.method675(super.field9477, super.field9474, super.field9475);
            this.field3372.method825(super.field7930, arg0, super.field7934, -82, var4, var3, false, super.field7931, super.field7927);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(B)Z")
    public final boolean method88(byte arg0) {
        ++field3378;
        return arg0 < 44 ? true : this.field3372.method827((byte) -74);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(BLha;)V")
    public final void method96(byte arg0, class544 arg1) {
        this.field3372.method836(-117, arg1);
        ++field3370;
        if (arg0 != 89) {
            this.method103(-25, (class544) null);
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(I)I")
    public final int method87(int arg0) {
        if (arg0 != 2836) {
            this.method89(-58);
        }
        ++field3368;
        return this.field3372.field1500;
    }

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (arg0 != -17773) {
            this.method85((byte) 71);
        }
        ++field3367;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lha;I)Lkn;")
    public final class516 method93(class544 arg0, int arg1) {
        ++field3385;
        return arg1 != 1 ? null : this.field3375;
    }

    @OriginalMember(owner = "client!lq", name = "h", descriptor = "(I)V")
    public final void method102(int arg0) {
        ++field3359;
        if (arg0 != 0) {
            this.method103(-48, (class544) null);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lha;Z)V")
    public final void method91(class544 arg0, boolean arg1) {
        ++field3362;
        if (!arg1) {
            this.method85((byte) -122);
        }
        this.field3372.method830(0, arg0);
    }

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(B)I")
    public final int method100(byte arg0) {
        int var2 = -103 % ((arg0 - 21) / 56);
        ++field3365;
        return this.field3372.method833(-40);
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "(I)Z")
    public final boolean method92(int arg0) {
        if (arg0 != 2) {
            this.method85((byte) -74);
        }
        ++field3360;
        return false;
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(B)I")
    public final int method85(byte arg0) {
        ++field3369;
        if (arg0 != -72) {
            this.method102(62);
        }
        return this.field3372.field1520;
    }

    @OriginalMember(owner = "client!lq", name = "j", descriptor = "(I)I")
    public final int method89(int arg0) {
        int var2 = -84 % ((arg0 - 17) / 61);
        ++field3363;
        return this.field3372.method828(true);
    }

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "(B)V")
    public static void method1472(byte arg0) {
        if (arg0 != 13) {
            method1473((byte) -62);
        }
        field3383 = null;
        field3382 = null;
    }

    @OriginalMember(owner = "client!lq", name = "g", descriptor = "(B)V")
    public static final void method1473(byte arg0) {
        class717.method3960(class146.field2298, (byte) 112);
        ++field3373;
        ++class717.field10056;
        if (class730.field10246 && class476.field6916) {
            int var1 = 0;
            int var2 = 0;
            if (class250.field3989) {
                var1 = class499.method3028(0);
                var2 = class545.method3197(112);
            }
            int var3 = class651.field9244.method2915(-8463) + var1;
            int var4 = class651.field9244.method2921((byte) 76) + var2;
            int var5 = var3 - class189.field3190;
            int var6 = var4 - class752.field10476;
            if (var5 < class138.field2167) {
                var5 = class138.field2167;
            }
            if (~class757.field10540 < ~var6) {
                var6 = class757.field10540;
            }
            if (arg0 >= -89) {
                method1473((byte) -95);
            }
            if (class138.field2167 - -class23.field236.field5230 < class146.field2298.field5230 + var5) {
                var5 = class138.field2167 + class23.field236.field5230 + -class146.field2298.field5230;
            }
            if (~(class757.field10540 + class23.field236.field5280) > ~(var6 - -class146.field2298.field5280)) {
                var6 = class757.field10540 + class23.field236.field5280 + -class146.field2298.field5280;
            }
            int var7 = class23.field236.field5284 + var5 + -class138.field2167;
            int var8 = -class757.field10540 + var6 + class23.field236.field5299;
            if (!class651.field9244.method3664((byte) -98)) {
                if (class233.field3749) {
                    class531.method3143((byte) -65);
                    if (class146.field2298.field5302 != null) {
                        class700 var9 = new class700();
                        var9.field9896 = var7;
                        var9.field9891 = class146.field2298.field5302;
                        var9.field9894 = class127.field1985;
                        var9.field9903 = var8;
                        var9.field9902 = class146.field2298;
                        class464.method2838(var9);
                    }
                    if (class127.field1985 != null && client.method2751(class146.field2298) != null) {
                        class426.method2662(class127.field1985, 12, class146.field2298);
                    }
                } else if ((class70.field1083 == 1 || class563.method3258(false)) && ~class608.field8588 < -3) {
                    class98.method803(class376.field5665 + class189.field3190, class752.field10476 + class394.field5882, 0);
                } else if (class248.method1707(0)) {
                    class98.method803(class376.field5665 + class189.field3190, class752.field10476 + class394.field5882, 0);
                }
                class146.field2298 = null;
            } else {
                if (class146.field2298.field5309 < class717.field10056) {
                    int var10 = -class376.field5665 + var5;
                    int var11 = var6 - class394.field5882;
                    if (~class146.field2298.field5348 > ~var10 || var10 < -class146.field2298.field5348 || ~class146.field2298.field5348 > ~var11 || var11 < -class146.field2298.field5348) {
                        class233.field3749 = true;
                    }
                }
                if (class146.field2298.field5268 != null && class233.field3749) {
                    class700 var12 = new class700();
                    var12.field9891 = class146.field2298.field5268;
                    var12.field9902 = class146.field2298;
                    var12.field9896 = var7;
                    var12.field9903 = var8;
                    class464.method2838(var12);
                }
            }
        } else {
            if (~class717.field10056 < -2) {
                class146.field2298 = null;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(ZILha;Lov;IIZ)V")
    public final void method104(boolean arg0, int arg1, class544 arg2, class668 arg3, int arg4, int arg5, boolean arg6) {
        ++field3374;
        if (arg0) {
            this.method86(69);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1474(byte[] arg0, int arg1) {
        if (arg1 != 0) {
            return null;
        } else {
            ++field3384;
            class301 var2 = new class301(arg0);
            int var3 = var2.method1987(arg1 ^ -63);
            int var4 = var2.method1934(-2);
            if (~var4 <= -1 && (class304.field4623 == 0 || ~var4 >= ~class304.field4623)) {
                if (var3 == 0) {
                    byte[] var8 = new byte[var4];
                    var2.method1936(0, arg1 ^ 10046, var4, var8);
                    return var8;
                } else {
                    int var5 = var2.method1934(-2);
                    if (var5 < 0 || class304.field4623 != 0 && ~var5 < ~class304.field4623) {
                        throw new RuntimeException();
                    } else {
                        byte[] var6 = new byte[var5];
                        if (~var3 != -2) {
                            class398 var7 = class640.field8988;
                            synchronized (class640.field8988) {
                                class640.field8988.method2464((byte) 125, var6, var2);
                            }
                        } else {
                            class198.method1488(var6, var5, arg0, var4, 9);
                        }
                        return var6;
                    }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "i", descriptor = "(I)Z")
    public final boolean method86(int arg0) {
        if (arg0 != 0) {
            this.field3372 = null;
        }
        ++field3364;
        return this.field3380;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IILha;I)Z")
    public final boolean method94(int arg0, int arg1, class544 arg2, int arg3) {
        ++field3376;
        int var5 = -124 / ((arg3 - -80) / 44);
        class282 var6 = this.field3372.method829(false, false, -1, arg2, 131072);
        if (var6 == null) {
            return false;
        } else {
            class73 var7 = arg2.method343();
            var7.method675(super.field9477, super.field9474, super.field9475);
            return !class141.field2211 ? var6.method1010(arg0, arg1, var7, false, 0) : var6.method1023(arg0, arg1, var7, false, 0, class106.field1553);
        }
    }

    @OriginalMember(owner = "client!lq", name = "k", descriptor = "(I)Z")
    public final boolean method95(int arg0) {
        ++field3377;
        return arg0 != 0;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)I")
    public final int method98(int arg0) {
        ++field3361;
        return arg0 != -12194 ? -67 : this.field3372.field1521;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "(Lha;Ljl;IIIIIZIIIIIII)V")
    public class196(class544 arg0, class595 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14) {
        super(arg2, arg3, arg4, arg5, arg6, arg8, arg9, arg10, arg11, arg1.field8352 == 1, class142.method1106((byte) 74, arg12, arg13));
        this.field3372 = new class101(arg0, arg1, arg12, arg13, super.field9470, arg3, this, arg7, arg14);
        this.field3381 = ~arg1.field8426 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Ljava/awt/Canvas;ILla;ILd;)Lha;")
    public static final class544 method1475(Canvas arg0, int arg1, class422 arg2, int arg3, class267 arg4) {
        ++field3366;
        if (arg1 != 5111) {
            method1475((Canvas) null, 75, (class422) null, 87, (class267) null);
        }
        if (!class241.method1678(true)) {
            throw new RuntimeException("");
        } else if (!class541.method3169("jaggl", 118)) {
            throw new RuntimeException("");
        } else {
            OpenGL var5 = new OpenGL();
            long var6 = var5.init(arg0, 8, 8, 8, 24, 0, arg3);
            if (var6 == 0L) {
                throw new RuntimeException("");
            } else {
                class642 var8 = new class642(var5, arg0, var6, arg4, arg2, arg3);
                var8.method353(-98);
                return var8;
            }
        }
    }

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "(ILha;)Lgh;")
    public final class48 method103(int arg0, class544 arg1) {
        ++field3371;
        class282 var3 = this.field3372.method829(false, true, -1, arg1, 2048);
        if (var3 == null) {
            return null;
        } else {
            if (arg0 != 0) {
                this.field3375 = null;
            }
            class73 var4 = arg1.method343();
            var4.method675(super.field9477, super.field9474, super.field9475);
            class48 var5 = class331.method2130(1, (byte) 92, this.field3381);
            this.field3372.method825(super.field7930, arg1, super.field7934, 106, var4, var3, true, super.field7931, super.field7927);
            if (class141.field2211) {
                var3.method1026(var4, var5.field795[0], class106.field1553, 0);
            } else {
                var3.method1007(var4, var5.field795[0], 0);
            }
            if (this.field3372.field1498 != null) {
                class315 var6 = this.field3372.field1498.method3556();
                if (class141.field2211) {
                    arg1.method380(var6, class106.field1553);
                } else {
                    arg1.method420(var6);
                }
            }
            this.field3380 = var3.method1048() || this.field3372.field1498 != null;
            if (this.field3375 == null) {
                this.field3375 = class100.method819(8, var3, super.field9474, super.field9475, super.field9477);
            } else {
                class736.method4109(var3, -8631, super.field9475, this.field3375, super.field9477, super.field9474);
            }
            return var5;
        }
    }
}
