import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class496 extends class180 implements class55 {

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "Leo;")
    public class193 field7310;

    @OriginalMember(owner = "client!dd", name = "r", descriptor = "Z")
    private boolean field7298;

    @OriginalMember(owner = "client!dd", name = "z", descriptor = "I")
    public static int field7306 = 1337;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "[B")
    public static byte[] field7312 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!dd", name = "n", descriptor = "I")
    public static int field7294;

    @OriginalMember(owner = "client!dd", name = "o", descriptor = "I")
    public static int field7295;

    @OriginalMember(owner = "client!dd", name = "p", descriptor = "I")
    public static int field7296;

    @OriginalMember(owner = "client!dd", name = "s", descriptor = "I")
    public static int field7299;

    @OriginalMember(owner = "client!dd", name = "t", descriptor = "I")
    public static int field7300;

    @OriginalMember(owner = "client!dd", name = "u", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!dd", name = "v", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!dd", name = "w", descriptor = "I")
    public static int field7303;

    @OriginalMember(owner = "client!dd", name = "x", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!dd", name = "y", descriptor = "I")
    public static int field7305;

    @OriginalMember(owner = "client!dd", name = "A", descriptor = "I")
    public static int field7307;

    @OriginalMember(owner = "client!dd", name = "B", descriptor = "I")
    public static int field7308;

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "I")
    public static int field7309;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "I")
    public static int field7311;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field7314;

    @OriginalMember(owner = "client!dd", name = "q", descriptor = "Lwo;")
    public static class522 field7297;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILvh;)I", line = 3)
    public static final int method2929(int arg0, class240 arg1) {
        if (arg0 > -4) {
            field7312 = null;
        }
        ++field7301;
        int var2 = 0;
        if (arg1.method1412(class405.field5627, 1)) {
            ++var2;
        }
        if (arg1.method1412(class278.field3755, 1)) {
            ++var2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(I)V", line = 23)
    public final void method361(int arg0) {
        ++field7311;
        int var2 = 64 / ((arg0 - -36) / 36);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)Z", line = 32)
    public final boolean method399(boolean arg0) {
        if (arg0) {
            this.method354((byte) -44);
        }
        ++field7313;
        return false;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILco;ILqa;ZZ)V", line = 47)
    public final void method394(int arg0, int arg1, class76 arg2, int arg3, class162 arg4, boolean arg5, boolean arg6) {
        ++field7294;
        if (arg6) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(I)Z", line = 58)
    public final boolean method360(int arg0) {
        ++field7302;
        if (arg0 < 34) {
            this.field7298 = true;
        }
        return this.field7310.method1180(true);
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IILqa;)Lc;", line = 73)
    public final class121 method358(int arg0, int arg1, class162 arg2) {
        ++field7304;
        if (arg0 != 4586) {
            this.field7310 = null;
        }
        return this.field7310.method1175(72, false, 0, arg1, 0, arg2, false);
    }

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "(I)V", line = 84)
    public static void method2930(int arg0) {
        field7312 = null;
        field7297 = null;
        if (arg0 < 15) {
            method2930(-45);
        }
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(ILqa;)V", line = 95)
    public final void method400(int arg0, class162 arg1) {
        ++field7303;
        int var3 = -41 % ((arg0 - -29) / 33);
        class121 var4 = this.field7310.method1175(124, true, super.field2545, 262144, super.field2543, arg1, true);
        if (var4 != null) {
            int var5 = super.field2545 >> 7;
            int var6 = super.field2543 >> 7;
            this.field7310.method1173(22869, var5, arg1, var4, false, var5, var6, var6);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ILqa;)V", line = 115)
    public final void method356(int arg0, class162 arg1) {
        if (arg0 <= 100) {
            this.field7310 = null;
        }
        ++field7308;
        this.field7310.method1177(arg1, -29962);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lqa;Lpk;IIIIIZII)V", line = 128)
    public class496(class162 arg0, class132 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9) {
        super(arg4, arg5, arg6, arg1.field1823, arg1.field1884);
        this.field7310 = new class193(arg0, arg1, 22, arg8, arg2, arg3, arg4, arg6, arg7, arg9);
        this.field7298 = arg1.field1850 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)I", line = 140)
    public final int method355(int arg0) {
        ++field7296;
        return arg0 != 13599 ? -25 : this.field7310.field2759;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lqa;I)Lip;", line = 152)
    public final class498 method402(class162 arg0, int arg1) {
        ++field7300;
        class121 var3 = this.field7310.method1175(arg1 ^ 16630, true, super.field2545, 2048, super.field2543, arg0, false);
        if (var3 == null) {
            return null;
        } else {
            if (arg1 != 16562) {
                field7297 = null;
            }
            class415 var4 = arg0.method539();
            var4.method340(super.field2545, super.field2544, super.field2543);
            class498 var5 = null;
            if (this.field7298) {
                var5 = class227.method1338(arg1 + -16562, 1);
            }
            if (this.field7310.field2779 == null) {
                var3.method781(var4, var5 != null ? var5.field7332[0] : null, 0);
            } else {
                class148 var6 = this.field7310.field2779.method1260();
                arg0.method512(var3, var6, var4, var5 != null ? var5.field7332[0] : null, 0);
            }
            int var7 = super.field2545 >> 7;
            int var8 = super.field2543 >> 7;
            this.field7310.method1173(22869, var7, arg0, var3, true, var7, var8, var8);
            return var5;
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(B)I", line = 199)
    public final int method359(byte arg0) {
        ++field7295;
        if (arg0 != -8) {
            field7306 = 58;
        }
        return this.field7310.field2764;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)I", line = 210)
    public final int method354(byte arg0) {
        ++field7307;
        int var2 = 62 / ((arg0 - 61) / 53);
        return this.field7310.field2780;
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V", line = 220)
    public final void method398(int arg0) {
        if (arg0 < 74) {
            this.field7310 = null;
        }
        ++field7314;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(ILqa;)V", line = 234)
    public final void method357(int arg0, class162 arg1) {
        if (arg0 >= 41) {
            this.field7310.method1176(262144, arg1);
            ++field7299;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(BJ)V", line = 253)
    public static final void method2931(byte arg0, long arg1) {
        ++field7309;
        if (arg1 > 0L) {
            if (arg0 < 121) {
                method2930(109);
            }
            if (~(arg1 % 10L) == -1L) {
                class41.method259(32580, arg1 + -1L);
                class41.method259(32580, 1L);
            } else {
                class41.method259(32580, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lqa;III)Z", line = 275)
    public final boolean method403(class162 arg0, int arg1, int arg2, int arg3) {
        ++field7305;
        if (arg2 != 24130) {
            this.method360(-100);
        }
        class121 var5 = this.field7310.method1175(117, false, super.field2545, 131072, super.field2543, arg0, false);
        if (var5 == null) {
            return false;
        } else {
            class415 var6 = arg0.method539();
            var6.method340(super.field2545, super.field2544, super.field2543);
            return var5.method777(arg1, arg3, var6, false);
        }
    }
}
