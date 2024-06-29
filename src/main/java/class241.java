import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class241 extends class598 {

    @OriginalMember(owner = "client!ko", name = "t", descriptor = "I")
    private int field3525 = 0;

    @OriginalMember(owner = "client!ko", name = "B", descriptor = "Lica;")
    private class205 field3533 = new class205(16);

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "I")
    private int field3542 = 0;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "Lrk;")
    private class419 field3541 = new class419();

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "J")
    private long field3545 = 0L;

    @OriginalMember(owner = "client!ko", name = "o", descriptor = "I")
    private int field3520;

    @OriginalMember(owner = "client!ko", name = "p", descriptor = "Lsaa;")
    private class18 field3521;

    @OriginalMember(owner = "client!ko", name = "H", descriptor = "Z")
    private boolean field3539;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "Lrk;")
    private class419 field3540;

    @OriginalMember(owner = "client!ko", name = "D", descriptor = "I")
    private int field3535;

    @OriginalMember(owner = "client!ko", name = "G", descriptor = "I")
    private int field3538;

    @OriginalMember(owner = "client!ko", name = "A", descriptor = "Ldk;")
    private class506 field3532;

    @OriginalMember(owner = "client!ko", name = "l", descriptor = "Lsaa;")
    private class18 field3517;

    @OriginalMember(owner = "client!ko", name = "r", descriptor = "[B")
    private byte[] field3523;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "Z")
    private boolean field3544;

    @OriginalMember(owner = "client!ko", name = "F", descriptor = "Lfs;")
    private class356 field3537;

    @OriginalMember(owner = "client!ko", name = "h", descriptor = "Lnaa;")
    private class614 field3513;

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "I")
    public static int field3511;

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "I")
    public static int field3512;

    @OriginalMember(owner = "client!ko", name = "i", descriptor = "I")
    public static int field3514;

    @OriginalMember(owner = "client!ko", name = "j", descriptor = "I")
    public static int field3515;

    @OriginalMember(owner = "client!ko", name = "k", descriptor = "I")
    public static int field3516;

    @OriginalMember(owner = "client!ko", name = "q", descriptor = "I")
    public static int field3522;

    @OriginalMember(owner = "client!ko", name = "s", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!ko", name = "u", descriptor = "I")
    public static int field3526;

    @OriginalMember(owner = "client!ko", name = "v", descriptor = "I")
    public static int field3527;

    @OriginalMember(owner = "client!ko", name = "w", descriptor = "I")
    public static int field3528;

    @OriginalMember(owner = "client!ko", name = "x", descriptor = "I")
    public static int field3529;

    @OriginalMember(owner = "client!ko", name = "y", descriptor = "I")
    public static int field3530;

    @OriginalMember(owner = "client!ko", name = "z", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!ko", name = "C", descriptor = "I")
    public static int field3534;

    @OriginalMember(owner = "client!ko", name = "E", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!ko", name = "n", descriptor = "Lvm;")
    private class386 field3519;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "Z")
    private boolean field3543;

    @OriginalMember(owner = "client!ko", name = "m", descriptor = "[B")
    private byte[] field3518;

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(III)Z")
    public static final boolean method1545(int arg0, int arg1, int arg2) {
        if (arg1 == 65536) {
            field3512++;
            return (arg2 & 0x10000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(II)I")
    public static final int method1546(int arg0, int arg1) {
        return class143.field1861 == null ? 0 : class143.field1861[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!ko", name = "d", descriptor = "(I)I")
    public final int method1547(int arg0) {
        field3524++;
        return arg0 == -1 ? this.field3525 : 24;
    }

    @OriginalMember(owner = "client!ko", name = "e", descriptor = "(I)V")
    public final void method1548(int arg0) {
        field3536++;
        if (this.field3521 == null) {
            return;
        }
        if (arg0 > -95) {
            this.field3517 = null;
        }
        this.field3543 = true;
        if (this.field3540 == null) {
            this.field3540 = new class419();
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(I)Lvm;")
    public final class386 method1549(int arg0) {
        if (arg0 > -11) {
            this.method1560(-82);
        }
        field3522++;
        if (this.field3519 != null) {
            return this.field3519;
        }
        if (this.field3513 == null) {
            if (this.field3537.method2198(false)) {
                return null;
            }
            this.field3513 = this.field3537.method2192(this.field3520, (byte) 0, true, 255, (byte) 44);
        }
        if (this.field3513.field9003) {
            return null;
        }
        byte[] var2 = this.field3513.method1999(-8820);
        if (this.field3513 instanceof class406) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3519 = new class386(var2, this.field3535, this.field3523);
                if (this.field3519.field5641 != this.field3538) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3519 = null;
                if (this.field3537.method2198(false)) {
                    this.field3513 = null;
                } else {
                    this.field3513 = this.field3537.method2192(this.field3520, (byte) 0, true, 255, (byte) 44);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3519 = new class386(var2, this.field3535, this.field3523);
            } catch (RuntimeException var4) {
                this.field3537.method2197(true);
                this.field3519 = null;
                if (this.field3537.method2198(false)) {
                    this.field3513 = null;
                } else {
                    this.field3513 = this.field3537.method2192(this.field3520, (byte) 0, true, 255, (byte) 44);
                }
                return null;
            }
            if (this.field3517 != null) {
                this.field3532.method3031(this.field3520, var2, this.field3517, -3);
            }
        }
        if (this.field3521 != null) {
            this.field3525 = 0;
            this.field3518 = new byte[this.field3519.field5643];
        }
        this.field3513 = null;
        return this.field3519;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIII)Z")
    public static final boolean method1550(int arg0, int arg1, int arg2, int arg3) {
        if (class239.method1539(arg0, arg1, arg2)) {
            int var4 = arg1 << class179.field2726;
            int var5 = arg2 << class179.field2726;
            return class313.method1924(var4 + 1, class235.field3455[arg0].method1319(arg1, arg2) + arg3, var5 + 1) && class313.method1924(class177.field2692 + var4 - 1, class235.field3455[arg0].method1319(arg1 + 1, arg2) + arg3, var5 + 1) && class313.method1924(class177.field2692 + var4 - 1, class235.field3455[arg0].method1319(arg1 + 1, arg2 + 1) + arg3, class177.field2692 + var5 - 1) && class313.method1924(var4 + 1, class235.field3455[arg0].method1319(arg1, arg2 + 1) + arg3, class177.field2692 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(II)V")
    public final void method1551(int arg0, int arg1) {
        field3514++;
        if (this.field3521 == null) {
            return;
        }
        for (class496 var3 = this.field3541.method2496((byte) 117); var3 != null; var3 = this.field3541.method2494(22)) {
            if ((long) arg0 == var3.field7465) {
                return;
            }
        }
        class496 var4 = new class496();
        var4.field7465 = arg0;
        this.field3541.method2492(var4, (byte) 113);
        if (arg1 != 0) {
            this.method1552(-67, true, 76);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IZI)Lnaa;")
    private final class614 method1552(int arg0, boolean arg1, int arg2) {
        field3528++;
        class614 var4 = (class614) this.field3533.method1333((long) arg0, arg1);
        if (arg1) {
            return null;
        }
        if (var4 != null && arg2 == 0 && !var4.field9006 && var4.field9003) {
            var4.method2997(1);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field3521 == null || this.field3518[arg0] == -1) {
                    if (this.field3537.method2198(false)) {
                        return null;
                    }
                    var4 = this.field3537.method2192(arg0, (byte) 2, true, this.field3520, (byte) 44);
                } else {
                    var4 = this.field3532.method3033(this.field3521, arg0, -28669);
                }
            } else if (arg2 == 1) {
                if (this.field3521 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3532.method3032(this.field3521, 10, arg0);
            } else if (arg2 == 2) {
                if (this.field3521 == null) {
                    throw new RuntimeException();
                }
                if (this.field3518[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3537.method2187(-21)) {
                    return null;
                }
                var4 = this.field3537.method2192(arg0, (byte) 2, false, this.field3520, (byte) 44);
            } else {
                throw new RuntimeException();
            }
            this.field3533.method1341(var4, (byte) -106, (long) arg0);
        }
        if (var4.field9003) {
            return null;
        }
        byte[] var5 = var4.method1999(-8820);
        if (!(var4 instanceof class406)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class237.field3468.reset();
                class237.field3468.update(var5, 0, var5.length - 2);
                int var6 = (int) class237.field3468.getValue();
                if (this.field3519.field5644[arg0] != var6) {
                    throw new RuntimeException();
                }
                if (this.field3519.field5645 != null && this.field3519.field5645[arg0] != null) {
                    byte[] var7 = this.field3519.field5645[arg0];
                    byte[] var8 = class239.method1533(0, var5.length - 2, var5, -99);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field3537.field5193 = 0;
                this.field3537.field5192 = 0;
            } catch (RuntimeException var17) {
                this.field3537.method2197(true);
                var4.method2997(1);
                if (var4.field9006 && !this.field3537.method2198(false)) {
                    class318 var10 = this.field3537.method2192(arg0, (byte) 2, true, this.field3520, (byte) 44);
                    this.field3533.method1341(var10, (byte) -126, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3519.field5656[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field3519.field5656[arg0];
            if (this.field3521 != null) {
                this.field3532.method3031(arg0, var5, this.field3521, -3);
                if (this.field3518[arg0] != 1) {
                    this.field3525++;
                    this.field3518[arg0] = 1;
                }
            }
            if (!var4.field9006) {
                var4.method2997(1);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class237.field3468.reset();
            class237.field3468.update(var5, 0, var5.length - 2);
            int var11 = (int) class237.field3468.getValue();
            if (this.field3519.field5644[arg0] != var11) {
                throw new RuntimeException();
            }
            if (this.field3519.field5645 != null && this.field3519.field5645[arg0] != null) {
                byte[] var12 = this.field3519.field5645[arg0];
                byte[] var13 = class239.method1533(0, var5.length - 2, var5, -74);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3519.field5656[arg0] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field3518[arg0] != 1) {
                this.field3525++;
                this.field3518[arg0] = 1;
            }
            if (!var4.field9006) {
                var4.method2997(1);
            }
            return var4;
        } catch (Exception var18) {
            this.field3518[arg0] = -1;
            var4.method2997(1);
            if (var4.field9006 && !this.field3537.method2198(false)) {
                class318 var16 = this.field3537.method2192(arg0, (byte) 2, true, this.field3520, (byte) 44);
                this.field3533.method1341(var16, (byte) -106, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(Z)I")
    public final int method1553(boolean arg0) {
        field3531++;
        if (this.field3519 == null) {
            return 0;
        } else if (arg0) {
            return 104;
        } else {
            return this.field3519.field5652;
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(Z)I")
    public final int method1554(boolean arg0) {
        field3526++;
        if (this.field3519 == null) {
            return 0;
        } else if (this.field3539) {
            if (arg0) {
                this.method1558(120);
            }
            class496 var2 = this.field3540.method2496((byte) 45);
            return var2 == null ? 0 : (int) var2.field7465;
        } else {
            return this.field3519.field5652;
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIILvf;Lvf;)V")
    public static final void method1555(int arg0, int arg1, int arg2, class73 arg3, class73 arg4) {
        class415 var5 = class240.method1542(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field5985 = arg3;
            var5.field5989 = arg4;
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(Z)V")
    public final void method1556(boolean arg0) {
        if (!arg0) {
            this.field3520 = -110;
        }
        field3511++;
        if (this.field3540 == null || this.method1549(-41) == null) {
            return;
        }
        for (class496 var2 = this.field3541.method2496((byte) -98); var2 != null; var2 = this.field3541.method2494(74)) {
            int var3 = (int) var2.field7465;
            if (var3 < 0 || this.field3519.field5643 <= var3 || this.field3519.field5648[var3] == 0) {
                var2.method2997(1);
            } else {
                if (this.field3518[var3] == 0) {
                    this.method1552(var3, false, 1);
                }
                if (this.field3518[var3] == -1) {
                    this.method1552(var3, false, 2);
                }
                if (this.field3518[var3] == 1) {
                    var2.method2997(1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)[B")
    public final byte[] method1557(int arg0, int arg1) {
        field3516++;
        class614 var3 = this.method1552(arg1, false, 0);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method1999(-8820);
        if (arg0 < 40) {
            return null;
        } else {
            var3.method2997(1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ko", name = "f", descriptor = "(I)V")
    public final void method1558(int arg0) {
        field3529++;
        if (this.field3540 != null) {
            if (this.method1549(-44) == null) {
                return;
            }
            if (this.field3539) {
                boolean var6 = true;
                for (class496 var7 = this.field3540.method2496((byte) 72); var7 != null; var7 = this.field3540.method2494(123)) {
                    int var9 = (int) var7.field7465;
                    if (this.field3518[var9] == 0) {
                        this.method1552(var9, false, 1);
                    }
                    if (this.field3518[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2997(1);
                    }
                }
                while (this.field3542 < this.field3519.field5648.length) {
                    if (this.field3519.field5648[this.field3542] == 0) {
                        this.field3542++;
                    } else {
                        if (this.field3532.field7544 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3518[this.field3542] == 0) {
                            this.method1552(this.field3542, false, 1);
                        }
                        if (this.field3518[this.field3542] == 0) {
                            class496 var8 = new class496();
                            var8.field7465 = this.field3542;
                            this.field3540.method2492(var8, (byte) -127);
                            var6 = false;
                        }
                        this.field3542++;
                    }
                }
                if (var6) {
                    this.field3542 = 0;
                    this.field3539 = false;
                }
            } else if (this.field3543) {
                boolean var2 = true;
                for (class496 var3 = this.field3540.method2496((byte) 16); var3 != null; var3 = this.field3540.method2494(120)) {
                    int var5 = (int) var3.field7465;
                    if (this.field3518[var5] != 1) {
                        this.method1552(var5, false, 2);
                    }
                    if (this.field3518[var5] == 1) {
                        var3.method2997(1);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3519.field5648.length > this.field3542) {
                    if (this.field3519.field5648[this.field3542] == 0) {
                        this.field3542++;
                    } else {
                        if (this.field3537.method2187(-21)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3518[this.field3542] != 1) {
                            this.method1552(this.field3542, false, 2);
                        }
                        if (this.field3518[this.field3542] != 1) {
                            class496 var4 = new class496();
                            var4.field7465 = this.field3542;
                            var2 = false;
                            this.field3540.method2492(var4, (byte) -117);
                        }
                        this.field3542++;
                    }
                }
                if (var2) {
                    this.field3542 = 0;
                    this.field3543 = false;
                }
            } else {
                this.field3540 = null;
            }
        }
        if (this.field3544 && this.field3545 <= class450.method2719((byte) -21)) {
            for (class614 var10 = (class614) this.field3533.method1331(-1925); var10 != null; var10 = (class614) this.field3533.method1340((byte) -95)) {
                if (!var10.field9003) {
                    if (var10.field9007) {
                        if (!var10.field9006) {
                            throw new RuntimeException();
                        }
                        var10.method2997(arg0 - 32395);
                    } else {
                        var10.field9007 = true;
                    }
                }
            }
            this.field3545 = class450.method2719((byte) -124) + 1000L;
        }
        if (arg0 != 32396) {
            this.method1549(-117);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(II)I")
    public final int method1559(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field3517 = null;
        }
        field3515++;
        class614 var3 = (class614) this.field3533.method1333((long) arg0, false);
        return var3 == null ? 0 : var3.method1997((byte) 102);
    }

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)I")
    public final int method1560(int arg0) {
        field3534++;
        if (arg0 != 100) {
            this.method1560(101);
        }
        if (this.method1549(arg0 ^ 0xFFFFFFFB) == null) {
            return this.field3513 == null ? 0 : this.field3513.method1997((byte) -31);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "(ILsaa;Lsaa;Lfs;Ldk;I[BIZ)V")
    public class241(int arg0, class18 arg1, class18 arg2, class356 arg3, class506 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field3520 = arg0;
        this.field3521 = arg1;
        if (this.field3521 == null) {
            this.field3539 = false;
        } else {
            this.field3539 = true;
            this.field3540 = new class419();
        }
        this.field3535 = arg5;
        this.field3538 = arg7;
        this.field3532 = arg4;
        this.field3517 = arg2;
        this.field3523 = arg6;
        this.field3544 = arg8;
        this.field3537 = arg3;
        if (this.field3517 != null) {
            this.field3513 = this.field3532.method3033(this.field3517, this.field3520, -28669);
        }
    }
}
