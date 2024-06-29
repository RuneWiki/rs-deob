import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class220 extends class256 {

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "I")
    private int field3520 = 0;

    @OriginalMember(owner = "client!kd", name = "x", descriptor = "Lfd;")
    private class130 field3524 = new class130(16);

    @OriginalMember(owner = "client!kd", name = "L", descriptor = "I")
    private int field3538 = 0;

    @OriginalMember(owner = "client!kd", name = "I", descriptor = "Lwa;")
    private class281 field3535 = new class281();

    @OriginalMember(owner = "client!kd", name = "N", descriptor = "J")
    private long field3540 = 0L;

    @OriginalMember(owner = "client!kd", name = "h", descriptor = "I")
    private int field3508;

    @OriginalMember(owner = "client!kd", name = "k", descriptor = "Lnh;")
    private class55 field3511;

    @OriginalMember(owner = "client!kd", name = "M", descriptor = "Z")
    private boolean field3539;

    @OriginalMember(owner = "client!kd", name = "K", descriptor = "Lwa;")
    private class281 field3537;

    @OriginalMember(owner = "client!kd", name = "G", descriptor = "Lqa;")
    private class159 field3533;

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "I")
    private int field3516;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "Lmd;")
    private class242 field3512;

    @OriginalMember(owner = "client!kd", name = "O", descriptor = "Z")
    private boolean field3541;

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    private int field3513;

    @OriginalMember(owner = "client!kd", name = "w", descriptor = "Lnh;")
    private class55 field3523;

    @OriginalMember(owner = "client!kd", name = "F", descriptor = "Llj;")
    private class27 field3532;

    @OriginalMember(owner = "client!kd", name = "y", descriptor = "Z")
    public static boolean field3525 = false;

    @OriginalMember(owner = "client!kd", name = "g", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!kd", name = "i", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!kd", name = "j", descriptor = "I")
    public static int field3510;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field3517;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field3518;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field3519;

    @OriginalMember(owner = "client!kd", name = "u", descriptor = "I")
    public static int field3521;

    @OriginalMember(owner = "client!kd", name = "z", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!kd", name = "A", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!kd", name = "B", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!kd", name = "C", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!kd", name = "J", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!kd", name = "v", descriptor = "Lfa;")
    public static class273 field3522;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "Lh;")
    public static class294 field3515;

    @OriginalMember(owner = "client!kd", name = "D", descriptor = "Lrh;")
    private class47 field3530;

    @OriginalMember(owner = "client!kd", name = "H", descriptor = "Z")
    private boolean field3534;

    @OriginalMember(owner = "client!kd", name = "E", descriptor = "[B")
    private byte[] field3531;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(I)I")
    public final int method1537(int arg0) {
        field3529++;
        if (arg0 >= -43) {
            return -18;
        } else if (this.field3530 == null) {
            return 0;
        } else {
            return this.field3530.field650;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(IB)[B")
    public final byte[] method1538(int arg0, byte arg1) {
        field3521++;
        class27 var3 = this.method1548(14386, 0, arg0);
        if (var3 == null) {
            return null;
        } else if (arg1 == 93) {
            byte[] var4 = var3.method164(25976);
            var3.method900(86);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(II)V")
    public final void method1539(int arg0, int arg1) {
        field3507++;
        if (this.field3511 == null || arg1 != -9605) {
            return;
        }
        for (class134 var3 = this.field3535.method1959(205); var3 != null; var3 = this.field3535.method1956(90)) {
            if (((long) arg0) == var3.field2102) {
                return;
            }
        }
        class134 var4 = new class134();
        var4.field2102 = (long) arg0;
        this.field3535.method1952(var4, 76);
    }

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "(B)I")
    public final int method1540(byte arg0) {
        field3514++;
        return arg0 <= 85 ? 35 : this.field3520;
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(I)I")
    public final int method1541(int arg0) {
        field3510++;
        if (this.field3530 == null) {
            return 0;
        } else if (!this.field3539) {
            return this.field3530.field650;
        } else if (arg0 > -47) {
            return 32;
        } else {
            class134 var2 = this.field3537.method1959(205);
            return var2 == null ? 0 : (int) var2.field2102;
        }
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(I)I")
    public final int method1542(int arg0) {
        field3536++;
        if (this.method1549(-1) == null) {
            return this.field3532 == null ? 0 : this.field3532.method163(8);
        } else if (arg0 <= 20) {
            return 46;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(IB)I")
    public static final int method1543(int arg0, byte arg1) {
        field3528++;
        if (arg1 >= -115) {
            method1543(21, (byte) -112);
        }
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)I")
    public final int method1544(int arg0, int arg1) {
        if (arg0 < 9) {
            this.method1545((byte) -81);
        }
        field3509++;
        class27 var3 = (class27) this.field3524.method872((byte) -113, (long) arg1);
        return var3 == null ? 0 : var3.method163(8);
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V")
    public final void method1545(byte arg0) {
        field3517++;
        if (arg0 > -122) {
            field3522 = null;
        }
        if (this.field3511 != null) {
            this.field3534 = true;
            if (this.field3537 == null) {
                this.field3537 = new class281();
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "(B)V")
    public static void method1546(byte arg0) {
        field3515 = null;
        field3522 = null;
        int var1 = 84 % ((arg0 - 24) / 54);
    }

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "(B)V")
    public final void method1547(byte arg0) {
        field3526++;
        if (this.field3537 == null || this.method1549(-1) == null) {
            return;
        }
        if (arg0 > -19) {
            this.method1540((byte) -85);
        }
        for (class134 var2 = this.field3535.method1959(205); var2 != null; var2 = this.field3535.method1956(71)) {
            int var3 = (int) var2.field2102;
            if (var3 < 0 || this.field3530.field645 <= var3 || this.field3530.field651[var3] == 0) {
                var2.method900(75);
            } else {
                if (this.field3531[var3] == 0) {
                    this.method1548(14386, 1, var3);
                }
                if (this.field3531[var3] == -1) {
                    this.method1548(14386, 2, var3);
                }
                if (this.field3531[var3] == 1) {
                    var2.method900(117);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)Llj;")
    private final class27 method1548(int arg0, int arg1, int arg2) {
        field3527++;
        class27 var4 = (class27) this.field3524.method872((byte) -118, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field337 && var4.field338) {
            var4.method900(23);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field3511 == null || this.field3531[arg2] == -1) {
                    if (this.field3512.method1693((byte) -72)) {
                        return null;
                    }
                    var4 = this.field3512.method1692(arg2, true, this.field3508, (byte) 2, 17819);
                } else {
                    var4 = this.field3533.method1058(this.field3511, arg2, 124);
                }
            } else if (arg1 == 1) {
                if (this.field3511 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3533.method1060(arg2, (byte) -128, this.field3511);
            } else if (arg1 == 2) {
                if (this.field3511 == null) {
                    throw new RuntimeException();
                }
                if (this.field3531[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3512.method1700(-1)) {
                    return null;
                }
                var4 = this.field3512.method1692(arg2, false, this.field3508, (byte) 2, 17819);
            } else {
                throw new RuntimeException();
            }
            this.field3524.method857(false, var4, (long) arg2);
        }
        if (var4.field338) {
            return null;
        }
        byte[] var5 = var4.method164(25976);
        if (arg0 != 14386) {
            method1546((byte) -16);
        }
        if (!var4 instanceof class89) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class250.field3979.reset();
                class250.field3979.update(var5, 0, var5.length - 2);
                int var9 = (int) class250.field3979.getValue();
                if (this.field3530.field635[arg2] != var9) {
                    throw new RuntimeException();
                }
                this.field3512.field3858 = 0;
                this.field3512.field3856 = 0;
            } catch (RuntimeException var12) {
                this.field3512.method1703((byte) 94);
                var4.method900(125);
                if (var4.field337 && !this.field3512.method1693((byte) -72)) {
                    class311 var10 = this.field3512.method1692(arg2, true, this.field3508, (byte) 2, 17819);
                    this.field3524.method857(false, var10, (long) arg2);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3530.field652[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field3530.field652[arg2];
            if (this.field3511 != null) {
                this.field3533.method1052(arg2, var5, this.field3511, 2);
                if (this.field3531[arg2] != 1) {
                    this.field3520++;
                    this.field3531[arg2] = 1;
                }
            }
            if (!var4.field337) {
                var4.method900(arg0 - 14368);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class250.field3979.reset();
            class250.field3979.update(var5, 0, var5.length - 2);
            int var6 = (int) class250.field3979.getValue();
            if (this.field3530.field635[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3530.field652[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field3531[arg2] != 1) {
                this.field3520++;
                this.field3531[arg2] = 1;
            }
            if (!var4.field337) {
                var4.method900(111);
            }
            return var4;
        } catch (Exception var11) {
            this.field3531[arg2] = -1;
            var4.method900(arg0 ^ 0x3825);
            if (var4.field337 && !this.field3512.method1693((byte) -72)) {
                class311 var8 = this.field3512.method1692(arg2, true, this.field3508, (byte) 2, arg0 ^ 0x7DA9);
                this.field3524.method857(false, var8, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)Lrh;")
    public final class47 method1549(int arg0) {
        if (arg0 != -1) {
            this.method1542(-120);
        }
        field3519++;
        if (this.field3530 != null) {
            return this.field3530;
        }
        if (this.field3532 == null) {
            if (this.field3512.method1693((byte) -72)) {
                return null;
            }
            this.field3532 = this.field3512.method1692(this.field3508, true, 255, (byte) 0, 17819);
        }
        if (this.field3532.field338) {
            return null;
        }
        byte[] var2 = this.field3532.method164(25976);
        if (this.field3532 instanceof class89) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3530 = new class47(var2, this.field3516);
                if (this.field3530.field649 != this.field3513) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3530 = null;
                if (this.field3512.method1693((byte) -72)) {
                    this.field3532 = null;
                } else {
                    this.field3532 = this.field3512.method1692(this.field3508, true, 255, (byte) 0, 17819);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3530 = new class47(var2, this.field3516);
            } catch (RuntimeException var4) {
                this.field3512.method1703((byte) -93);
                this.field3530 = null;
                if (this.field3512.method1693((byte) -72)) {
                    this.field3532 = null;
                } else {
                    this.field3532 = this.field3512.method1692(this.field3508, true, 255, (byte) 0, 17819);
                }
                return null;
            }
            if (this.field3523 != null) {
                this.field3533.method1052(this.field3508, var2, this.field3523, 2);
            }
        }
        if (this.field3511 != null) {
            this.field3531 = new byte[this.field3530.field645];
            this.field3520 = 0;
        }
        this.field3532 = null;
        return this.field3530;
    }

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "(I)V")
    public final void method1550(int arg0) {
        field3518++;
        if (arg0 >= -1) {
            this.field3530 = null;
        }
        if (this.field3537 != null) {
            if (this.method1549(-1) == null) {
                return;
            }
            if (this.field3539) {
                boolean var2 = true;
                for (class134 var3 = this.field3537.method1959(205); var3 != null; var3 = this.field3537.method1956(78)) {
                    int var5 = (int) var3.field2102;
                    if (this.field3531[var5] == 0) {
                        this.method1548(14386, 1, var5);
                    }
                    if (this.field3531[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method900(127);
                    }
                }
                while (this.field3538 < this.field3530.field651.length) {
                    if (this.field3530.field651[this.field3538] == 0) {
                        this.field3538++;
                    } else {
                        if (this.field3533.field2517 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3531[this.field3538] == 0) {
                            this.method1548(14386, 1, this.field3538);
                        }
                        if (this.field3531[this.field3538] == 0) {
                            var2 = false;
                            class134 var4 = new class134();
                            var4.field2102 = (long) this.field3538;
                            this.field3537.method1952(var4, 76);
                        }
                        this.field3538++;
                    }
                }
                if (var2) {
                    this.field3538 = 0;
                    this.field3539 = false;
                }
            } else if (this.field3534) {
                boolean var6 = true;
                for (class134 var7 = this.field3537.method1959(205); var7 != null; var7 = this.field3537.method1956(104)) {
                    int var9 = (int) var7.field2102;
                    if (this.field3531[var9] != 1) {
                        this.method1548(14386, 2, var9);
                    }
                    if (this.field3531[var9] == 1) {
                        var7.method900(99);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3530.field651.length > this.field3538) {
                    if (this.field3530.field651[this.field3538] == 0) {
                        this.field3538++;
                    } else {
                        if (this.field3512.method1700(-1)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3531[this.field3538] != 1) {
                            this.method1548(14386, 2, this.field3538);
                        }
                        if (this.field3531[this.field3538] != 1) {
                            var6 = false;
                            class134 var8 = new class134();
                            var8.field2102 = (long) this.field3538;
                            this.field3537.method1952(var8, 76);
                        }
                        this.field3538++;
                    }
                }
                if (var6) {
                    this.field3534 = false;
                    this.field3538 = 0;
                }
            } else {
                this.field3537 = null;
            }
        }
        if (!this.field3541 || class267.method1841((byte) 111) < this.field3540) {
            return;
        }
        for (class27 var10 = (class27) this.field3524.method871(-36); var10 != null; var10 = (class27) this.field3524.method869(-14210)) {
            if (!var10.field338) {
                if (var10.field340) {
                    if (!var10.field337) {
                        throw new RuntimeException();
                    }
                    var10.method900(48);
                } else {
                    var10.field340 = true;
                }
            }
        }
        this.field3540 = class267.method1841((byte) 98) + 1000L;
    }

    @OriginalMember(owner = "client!kd", name = "<init>", descriptor = "(ILnh;Lnh;Lmd;Lqa;IIZ)V")
    public class220(int arg0, class55 arg1, class55 arg2, class242 arg3, class159 arg4, int arg5, int arg6, boolean arg7) {
        this.field3508 = arg0;
        this.field3511 = arg1;
        if (this.field3511 == null) {
            this.field3539 = false;
        } else {
            this.field3539 = true;
            this.field3537 = new class281();
        }
        this.field3533 = arg4;
        this.field3516 = arg5;
        this.field3512 = arg3;
        this.field3541 = arg7;
        this.field3513 = arg6;
        this.field3523 = arg2;
        if (this.field3523 != null) {
            this.field3532 = this.field3533.method1058(this.field3523, this.field3508, 123);
        }
    }
}
