import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class235 extends class69 {

    @OriginalMember(owner = "client!hl", name = "x", descriptor = "I")
    private int field3679 = 0;

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "Lqf;")
    private class311 field3665 = new class311(16);

    @OriginalMember(owner = "client!hl", name = "Q", descriptor = "I")
    private int field3698 = 0;

    @OriginalMember(owner = "client!hl", name = "O", descriptor = "Lma;")
    private class5 field3696 = new class5();

    @OriginalMember(owner = "client!hl", name = "U", descriptor = "J")
    private long field3702 = 0L;

    @OriginalMember(owner = "client!hl", name = "K", descriptor = "Lga;")
    private class180 field3692;

    @OriginalMember(owner = "client!hl", name = "s", descriptor = "I")
    private int field3674;

    @OriginalMember(owner = "client!hl", name = "R", descriptor = "Z")
    private boolean field3699;

    @OriginalMember(owner = "client!hl", name = "P", descriptor = "Lma;")
    private class5 field3697;

    @OriginalMember(owner = "client!hl", name = "l", descriptor = "Lga;")
    private class180 field3667;

    @OriginalMember(owner = "client!hl", name = "u", descriptor = "I")
    private int field3676;

    @OriginalMember(owner = "client!hl", name = "o", descriptor = "I")
    private int field3670;

    @OriginalMember(owner = "client!hl", name = "p", descriptor = "Lgi;")
    private class310 field3671;

    @OriginalMember(owner = "client!hl", name = "T", descriptor = "Z")
    private boolean field3701;

    @OriginalMember(owner = "client!hl", name = "D", descriptor = "Lwb;")
    private class142 field3685;

    @OriginalMember(owner = "client!hl", name = "M", descriptor = "Lwg;")
    private class192 field3694;

    @OriginalMember(owner = "client!hl", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3691 = null;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "I")
    public static int field3664;

    @OriginalMember(owner = "client!hl", name = "m", descriptor = "I")
    public static int field3668;

    @OriginalMember(owner = "client!hl", name = "n", descriptor = "I")
    public static int field3669;

    @OriginalMember(owner = "client!hl", name = "q", descriptor = "I")
    public static int field3672;

    @OriginalMember(owner = "client!hl", name = "r", descriptor = "I")
    public static int field3673;

    @OriginalMember(owner = "client!hl", name = "v", descriptor = "I")
    public static int field3677;

    @OriginalMember(owner = "client!hl", name = "w", descriptor = "I")
    public static int field3678;

    @OriginalMember(owner = "client!hl", name = "y", descriptor = "I")
    public static int field3680;

    @OriginalMember(owner = "client!hl", name = "A", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!hl", name = "B", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!hl", name = "C", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!hl", name = "E", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!hl", name = "F", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!hl", name = "G", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!hl", name = "H", descriptor = "I")
    public static int field3689;

    @OriginalMember(owner = "client!hl", name = "I", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!hl", name = "L", descriptor = "I")
    public static int field3693;

    @OriginalMember(owner = "client!hl", name = "N", descriptor = "Luc;")
    private class14 field3695;

    @OriginalMember(owner = "client!hl", name = "S", descriptor = "Z")
    private boolean field3700;

    @OriginalMember(owner = "client!hl", name = "z", descriptor = "[B")
    private byte[] field3681;

    @OriginalMember(owner = "client!hl", name = "k", descriptor = "[Lqh;")
    public static class32[] field3666;

    @OriginalMember(owner = "client!hl", name = "t", descriptor = "[[I")
    public static int[][] field3675;

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(I)V", line = 4)
    public final void method1684(int arg0) {
        field3684++;
        if (this.field3697 != null) {
            if (this.method543(false) == null) {
                return;
            }
            if (this.field3699) {
                boolean var6 = true;
                for (class287 var7 = this.field3697.method22((byte) 121); var7 != null; var7 = this.field3697.method26((byte) -121)) {
                    int var8 = (int) var7.field4430;
                    if (this.field3681[var8] == 0) {
                        this.method1693(1, var8, (byte) 105);
                    }
                    if (this.field3681[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method2028(13329);
                    }
                }
                while (this.field3695.field219.length > this.field3698) {
                    if (this.field3695.field219[this.field3698] == 0) {
                        this.field3698++;
                    } else {
                        if (this.field3685.field2266 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3681[this.field3698] == 0) {
                            this.method1693(1, this.field3698, (byte) 100);
                        }
                        if (this.field3681[this.field3698] == 0) {
                            class287 var9 = new class287();
                            var9.field4430 = (long) this.field3698;
                            var6 = false;
                            this.field3697.method19(var9, -1058);
                        }
                        this.field3698++;
                    }
                }
                if (var6) {
                    this.field3699 = false;
                    this.field3698 = 0;
                }
            } else if (this.field3700) {
                boolean var2 = true;
                for (class287 var3 = this.field3697.method22((byte) 126); var3 != null; var3 = this.field3697.method26((byte) -124)) {
                    int var4 = (int) var3.field4430;
                    if (this.field3681[var4] != 1) {
                        this.method1693(2, var4, (byte) 121);
                    }
                    if (this.field3681[var4] == 1) {
                        var3.method2028(13329);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3698 < this.field3695.field219.length) {
                    if (this.field3695.field219[this.field3698] == 0) {
                        this.field3698++;
                    } else {
                        if (this.field3671.method2150(-104)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3681[this.field3698] != 1) {
                            this.method1693(2, this.field3698, (byte) 89);
                        }
                        if (this.field3681[this.field3698] != 1) {
                            var2 = false;
                            class287 var5 = new class287();
                            var5.field4430 = (long) this.field3698;
                            this.field3697.method19(var5, -1058);
                        }
                        this.field3698++;
                    }
                }
                if (var2) {
                    this.field3698 = 0;
                    this.field3700 = false;
                }
            } else {
                this.field3697 = null;
            }
        }
        int var10 = -80 / ((51 - arg0) / 51);
        if (!this.field3701 || this.field3702 > class219.method1609(-898)) {
            return;
        }
        for (class192 var11 = (class192) this.field3665.method2174(256); var11 != null; var11 = (class192) this.field3665.method2164((byte) 105)) {
            if (!var11.field3055) {
                if (var11.field3063) {
                    if (!var11.field3056) {
                        throw new RuntimeException();
                    }
                    var11.method2028(13329);
                } else {
                    var11.field3063 = true;
                }
            }
        }
        this.field3702 = class219.method1609(-898) + 1000L;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(II)I", line = 186)
    public final int method546(int arg0, int arg1) {
        if (arg1 < 50) {
            this.method1690((byte) 49);
        }
        class192 var3 = (class192) this.field3665.method2168((long) arg0, (byte) -77);
        field3672++;
        return var3 == null ? 0 : var3.method598((byte) -98);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(Z)V", line = 203)
    public static void method1685(boolean arg0) {
        if (!arg0) {
            method1689(59, (class253) null, (class253) null);
        }
        field3666 = null;
        field3675 = (int[][]) null;
        field3691 = null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lql;IBI)V", line = 219)
    public static final void method1686(class337 arg0, int arg1, byte arg2, int arg3) {
        if (arg0.field4653 == arg3 && arg3 != -1) {
            class281 var4 = class295.method2064(0, arg3);
            int var5 = var4.field4321;
            if (var5 == 1) {
                arg0.field4739 = arg1;
                arg0.field4648 = 0;
                arg0.field4711 = 0;
                arg0.field4719 = 1;
                arg0.field4655 = 0;
                class91.method658(var4, true, class146.field2310 == arg0, arg0.field4698, arg0.field4648, arg0.field4731);
            }
            if (var5 == 2) {
                arg0.field4711 = 0;
            }
        } else if (arg3 == -1 || arg0.field4653 == -1 || class295.method2064(0, arg3).field4338 >= class295.method2064(0, arg0.field4653).field4338) {
            arg0.field4719 = 1;
            arg0.field4655 = 0;
            arg0.field4711 = 0;
            arg0.field4739 = arg1;
            arg0.field4648 = 0;
            arg0.field4653 = arg3;
            arg0.field4695 = arg0.field4710;
            if (arg0.field4653 != -1) {
                class91.method658(class295.method2064(0, arg0.field4653), true, class146.field2310 == arg0, arg0.field4698, arg0.field4648, arg0.field4731);
            }
        }
        field3680++;
        if (arg2 != -67) {
            method1689(-83, (class253) null, (class253) null);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)Luc;", line = 271)
    public final class14 method543(boolean arg0) {
        field3687++;
        if (this.field3695 != null) {
            return this.field3695;
        }
        if (this.field3694 == null) {
            if (this.field3671.method2139(-90)) {
                return null;
            }
            this.field3694 = this.field3671.method2153(this.field3674, 255, true, -21, (byte) 0);
        }
        if (this.field3694.field3055) {
            return null;
        }
        if (arg0) {
            this.method1690((byte) -47);
        }
        byte[] var2 = this.field3694.method603(true);
        if (this.field3694 instanceof class82) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3695 = new class14(var2, this.field3676);
                if (this.field3695.field224 != this.field3670) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field3695 = null;
                if (this.field3671.method2139(105)) {
                    this.field3694 = null;
                } else {
                    this.field3694 = this.field3671.method2153(this.field3674, 255, true, -21, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3695 = new class14(var2, this.field3676);
            } catch (RuntimeException var6) {
                this.field3671.method2152((byte) -123);
                this.field3695 = null;
                if (this.field3671.method2139(-64)) {
                    this.field3694 = null;
                } else {
                    this.field3694 = this.field3671.method2153(this.field3674, 255, true, -21, (byte) 0);
                }
                return null;
            }
            if (this.field3667 != null) {
                this.field3685.method1057(this.field3674, var2, this.field3667, (byte) -127);
            }
        }
        if (this.field3692 != null) {
            this.field3681 = new byte[this.field3695.field237];
            this.field3679 = 0;
        }
        this.field3694 = null;
        return this.field3695;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(II)V", line = 370)
    public final void method541(int arg0, int arg1) {
        if (arg0 >= -20) {
            return;
        }
        field3689++;
        if (this.field3692 == null) {
            return;
        }
        for (class287 var3 = this.field3696.method22((byte) 120); var3 != null; var3 = this.field3696.method26((byte) -121)) {
            if ((long) arg1 == var3.field4430) {
                return;
            }
        }
        class287 var4 = new class287();
        var4.field4430 = (long) arg1;
        this.field3696.method19(var4, -1058);
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(I)I", line = 401)
    public final int method1687(int arg0) {
        int var2 = 71 % ((arg0 + 36) / 46);
        field3664++;
        if (this.method543(false) == null) {
            return this.field3694 == null ? 0 : this.field3694.method598((byte) -67);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(Z)V", line = 419)
    public final void method1688(boolean arg0) {
        field3678++;
        if (this.field3697 == null || this.method543(arg0) == null) {
            return;
        }
        for (class287 var2 = this.field3696.method22((byte) 119); var2 != null; var2 = this.field3696.method26((byte) -116)) {
            int var3 = (int) var2.field4430;
            if (var3 < 0 || var3 >= this.field3695.field237 || this.field3695.field219[var3] == 0) {
                var2.method2028(13329);
            } else {
                if (this.field3681[var3] == 0) {
                    this.method1693(1, var3, (byte) 89);
                }
                if (this.field3681[var3] == -1) {
                    this.method1693(2, var3, (byte) 120);
                }
                if (this.field3681[var3] == 1) {
                    var2.method2028(13329);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILug;Lug;)V", line = 469)
    public static final void method1689(int arg0, class253 arg1, class253 arg2) {
        if (arg0 != -1) {
            method1686((class337) null, -11, (byte) 107, -4);
        }
        class255.field4030 = arg1;
        field3688++;
        class174.field2859 = arg2;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)V", line = 484)
    public final void method1690(byte arg0) {
        field3673++;
        if (this.field3692 == null) {
            return;
        }
        this.field3700 = true;
        int var2 = 6 / ((52 - arg0) / 62);
        if (this.field3697 == null) {
            this.field3697 = new class5();
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(ILga;Lga;Lgi;Lwb;IIZ)V", line = 825)
    public class235(int arg0, class180 arg1, class180 arg2, class310 arg3, class142 arg4, int arg5, int arg6, boolean arg7) {
        this.field3692 = arg1;
        this.field3674 = arg0;
        if (this.field3692 == null) {
            this.field3699 = false;
        } else {
            this.field3699 = true;
            this.field3697 = new class5();
        }
        this.field3667 = arg2;
        this.field3676 = arg5;
        this.field3670 = arg6;
        this.field3671 = arg3;
        this.field3701 = arg7;
        this.field3685 = arg4;
        if (this.field3667 != null) {
            this.field3694 = this.field3685.method1055(this.field3674, this.field3667, -3);
        }
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(II)[B", line = 516)
    public final byte[] method542(int arg0, int arg1) {
        field3686++;
        class192 var3 = this.method1693(arg0, arg1, (byte) 124);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method603(true);
            var3.method2028(13329);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hl", name = "d", descriptor = "(I)I", line = 532)
    public final int method1691(int arg0) {
        if (arg0 >= -7) {
            this.method1693(15, 40, (byte) -47);
        }
        field3677++;
        return this.field3695 == null ? 0 : this.field3695.field231;
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)I", line = 552)
    public final int method1692(byte arg0) {
        if (arg0 != -9) {
            this.field3696 = (class5) null;
        }
        field3693++;
        return this.field3679;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IIB)Lwg;", line = 565)
    private final class192 method1693(int arg0, int arg1, byte arg2) {
        class192 var4 = (class192) this.field3665.method2168((long) arg1, (byte) -110);
        field3682++;
        if (var4 != null && arg0 == 0 && !var4.field3056 && var4.field3055) {
            var4.method2028(13329);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field3692 == null || this.field3681[arg1] == -1) {
                    if (this.field3671.method2139(81)) {
                        return null;
                    }
                    var4 = this.field3671.method2153(arg1, this.field3674, true, -21, (byte) 2);
                } else {
                    var4 = this.field3685.method1055(arg1, this.field3692, -3);
                }
            } else if (arg0 == 1) {
                if (this.field3692 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3685.method1061((byte) -9, arg1, this.field3692);
            } else if (arg0 == 2) {
                if (this.field3692 == null) {
                    throw new RuntimeException();
                }
                if (this.field3681[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3671.method2150(-125)) {
                    return null;
                }
                var4 = this.field3671.method2153(arg1, this.field3674, false, -21, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field3665.method2161(var4, (long) arg1, -1);
        }
        if (var4.field3055) {
            return null;
        }
        byte[] var5 = var4.method603(true);
        if (arg2 <= 88) {
            this.method542(58, 58);
        }
        if (!var4 instanceof class82) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class23.field351.reset();
                class23.field351.update(var5, 0, var5.length - 2);
                int var10 = (int) class23.field351.getValue();
                if (this.field3695.field218[arg1] != var10) {
                    throw new RuntimeException();
                }
                this.field3671.field4838 = 0;
                this.field3671.field4839 = 0;
            } catch (RuntimeException var14) {
                this.field3671.method2152((byte) -121);
                var4.method2028(13329);
                if (var4.field3056 && !this.field3671.method2139(-109)) {
                    class163 var12 = this.field3671.method2153(arg1, this.field3674, true, -21, (byte) 2);
                    this.field3665.method2161(var12, (long) arg1, -1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3695.field230[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field3695.field230[arg1];
            if (this.field3692 != null) {
                this.field3685.method1057(arg1, var5, this.field3692, (byte) -127);
                if (this.field3681[arg1] != 1) {
                    this.field3679++;
                    this.field3681[arg1] = 1;
                }
            }
            if (!var4.field3056) {
                var4.method2028(13329);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class23.field351.reset();
            class23.field351.update(var5, 0, var5.length - 2);
            int var6 = (int) class23.field351.getValue();
            if (this.field3695.field218[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3695.field230[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field3681[arg1] != 1) {
                if (this.field3681[arg1] == 0) {
                }
                this.field3679++;
                this.field3681[arg1] = 1;
            }
            if (!var4.field3056) {
                var4.method2028(13329);
            }
            return var4;
        } catch (Exception var13) {
            this.field3681[arg1] = -1;
            var4.method2028(13329);
            if (var4.field3056 && !this.field3671.method2139(-125)) {
                class163 var9 = this.field3671.method2153(arg1, this.field3674, true, -21, (byte) 2);
                this.field3665.method2161(var9, (long) arg1, -1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hl", name = "e", descriptor = "(I)I", line = 781)
    public final int method1694(int arg0) {
        field3669++;
        if (arg0 != 0) {
            this.field3692 = (class180) null;
        }
        if (this.field3695 == null) {
            return 0;
        } else if (this.field3699) {
            class287 var2 = this.field3697.method22((byte) 118);
            return var2 == null ? 0 : (int) var2.field4430;
        } else {
            return this.field3695.field231;
        }
    }
}
