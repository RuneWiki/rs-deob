import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class390 extends class460 {

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    private int field5693 = 0;

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "Lke;")
    private class407 field5705 = new class407(16);

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "I")
    private int field5718 = 0;

    @OriginalMember(owner = "client!nf", name = "N", descriptor = "Lft;")
    private class4 field5722 = new class4();

    @OriginalMember(owner = "client!nf", name = "O", descriptor = "J")
    private long field5723 = 0L;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "Lap;")
    private class319 field5697;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    private int field5717;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "Z")
    private boolean field5720;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "Lft;")
    private class4 field5721;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "Lmf;")
    private class276 field5714;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    private int field5711;

    @OriginalMember(owner = "client!nf", name = "Q", descriptor = "Z")
    private boolean field5724;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "Lap;")
    private class319 field5707;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Lno;")
    private class476 field5694;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    private int field5703;

    @OriginalMember(owner = "client!nf", name = "A", descriptor = "Lpp;")
    private class257 field5709;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    public static int field5712 = 0;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "I")
    public static int field5695;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field5696;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    public static int field5699;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "I")
    public static int field5701;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "I")
    public static int field5702;

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "I")
    public static int field5704;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field5706;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "I")
    public static int field5708;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public static int field5710;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "Log;")
    private class441 field5713;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "Z")
    private boolean field5719;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "[B")
    private byte[] field5716;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Z)Log;")
    public final class441 method2317(boolean arg0) {
        field5700++;
        if (this.field5713 != null) {
            return this.field5713;
        }
        if (arg0) {
            this.field5707 = null;
        }
        if (this.field5709 == null) {
            if (this.field5694.method2872((byte) 63)) {
                return null;
            }
            this.field5709 = this.field5694.method2861((byte) -114, true, (byte) 0, 255, this.field5717);
        }
        if (this.field5709.field3923) {
            return null;
        }
        byte[] var2 = this.field5709.method1005(106);
        if (this.field5709 instanceof class196) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5713 = new class441(var2, this.field5703);
                if (this.field5713.field6474 != this.field5711) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field5713 = null;
                if (this.field5694.method2872((byte) 63)) {
                    this.field5709 = null;
                } else {
                    this.field5709 = this.field5694.method2861((byte) -78, true, (byte) 0, 255, this.field5717);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5713 = new class441(var2, this.field5703);
            } catch (RuntimeException var4) {
                this.field5694.method2875(false);
                this.field5713 = null;
                if (this.field5694.method2872((byte) 63)) {
                    this.field5709 = null;
                } else {
                    this.field5709 = this.field5694.method2861((byte) -106, true, (byte) 0, 255, this.field5717);
                }
                return null;
            }
            if (this.field5707 != null) {
                this.field5714.method1676(this.field5717, this.field5707, var2, 2);
            }
        }
        this.field5709 = null;
        if (this.field5697 != null) {
            this.field5693 = 0;
            this.field5716 = new byte[this.field5713.field6465];
        }
        return this.field5713;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(Z)I")
    public final int method2318(boolean arg0) {
        field5715++;
        if (!arg0) {
            this.field5719 = true;
        }
        return this.field5693;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)I")
    public final int method2319(byte arg0, int arg1) {
        field5701++;
        class257 var3 = (class257) this.field5705.method2409(false, (long) arg1);
        if (var3 == null) {
            if (arg0 != -27) {
                this.method2326(-23);
            }
            return 0;
        } else {
            return var3.method1009(-120);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIZ)Lpp;")
    private final class257 method2320(int arg0, int arg1, boolean arg2) {
        field5695++;
        class257 var4 = (class257) this.field5705.method2409(arg2, (long) arg0);
        if (var4 != null && arg1 == 0 && !var4.field3924 && var4.field3923) {
            var4.method1121(false);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field5697 == null || this.field5716[arg0] == -1) {
                    if (this.field5694.method2872((byte) 63)) {
                        return null;
                    }
                    var4 = this.field5694.method2861((byte) -27, true, (byte) 2, this.field5717, arg0);
                } else {
                    var4 = this.field5714.method1680(this.field5697, arg0, 9);
                }
            } else if (arg1 == 1) {
                if (this.field5697 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5714.method1679((byte) 109, this.field5697, arg0);
            } else if (arg1 == 2) {
                if (this.field5697 == null) {
                    throw new RuntimeException();
                }
                if (this.field5716[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5694.method2874(-21)) {
                    return null;
                }
                var4 = this.field5694.method2861((byte) -37, false, (byte) 2, this.field5717, arg0);
            } else {
                throw new RuntimeException();
            }
            this.field5705.method2413((long) arg0, -1, var4);
        }
        if (var4.field3923) {
            return null;
        }
        byte[] var5 = var4.method1005(86);
        if (!var4 instanceof class196) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class169.field2630.reset();
                class169.field2630.update(var5, 0, var5.length - 2);
                int var9 = (int) class169.field2630.getValue();
                if (this.field5713.field6476[arg0] != var9) {
                    throw new RuntimeException();
                }
                this.field5694.field7281 = 0;
                this.field5694.field7284 = 0;
            } catch (RuntimeException var12) {
                this.field5694.method2875(false);
                var4.method1121(false);
                if (var4.field3924 && !this.field5694.method2872((byte) 63)) {
                    class157 var10 = this.field5694.method2861((byte) -47, true, (byte) 2, this.field5717, arg0);
                    this.field5705.method2413((long) arg0, -1, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field5713.field6475[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field5713.field6475[arg0];
            if (this.field5697 != null) {
                this.field5714.method1676(arg0, this.field5697, var5, 2);
                if (this.field5716[arg0] != 1) {
                    this.field5693++;
                    this.field5716[arg0] = 1;
                }
            }
            if (!var4.field3924) {
                var4.method1121(false);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class169.field2630.reset();
            class169.field2630.update(var5, 0, var5.length - 2);
            int var6 = (int) class169.field2630.getValue();
            if (this.field5713.field6476[arg0] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field5713.field6475[arg0] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field5716[arg0] != 1) {
                this.field5693++;
                this.field5716[arg0] = 1;
            }
            if (!var4.field3924) {
                var4.method1121(false);
            }
            return var4;
        } catch (Exception var11) {
            this.field5716[arg0] = -1;
            var4.method1121(arg2);
            if (var4.field3924 && !this.field5694.method2872((byte) 63)) {
                class157 var8 = this.field5694.method2861((byte) -116, true, (byte) 2, this.field5717, arg0);
                this.field5705.method2413((long) arg0, -1, var8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)V")
    public final void method2321(int arg0) {
        field5708++;
        if (this.field5721 != null) {
            if (this.method2317(false) == null) {
                return;
            }
            if (this.field5720) {
                boolean var2 = true;
                for (class179 var3 = this.field5721.method8((byte) -98); var3 != null; var3 = this.field5721.method17((byte) 95)) {
                    int var5 = (int) var3.field2798;
                    if (this.field5716[var5] == 0) {
                        this.method2320(var5, 1, false);
                    }
                    if (this.field5716[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1121(false);
                    }
                }
                while (this.field5713.field6469.length > this.field5718) {
                    if (this.field5713.field6469[this.field5718] == 0) {
                        this.field5718++;
                    } else {
                        if (this.field5714.field4185 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field5716[this.field5718] == 0) {
                            this.method2320(this.field5718, 1, false);
                        }
                        if (this.field5716[this.field5718] == 0) {
                            class179 var4 = new class179();
                            var4.field2798 = this.field5718;
                            this.field5721.method4(1, var4);
                            var2 = false;
                        }
                        this.field5718++;
                    }
                }
                if (var2) {
                    this.field5718 = 0;
                    this.field5720 = false;
                }
            } else if (this.field5719) {
                boolean var6 = true;
                for (class179 var7 = this.field5721.method8((byte) -98); var7 != null; var7 = this.field5721.method17((byte) -128)) {
                    int var9 = (int) var7.field2798;
                    if (this.field5716[var9] != 1) {
                        this.method2320(var9, 2, false);
                    }
                    if (this.field5716[var9] == 1) {
                        var7.method1121(false);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field5713.field6469.length > this.field5718) {
                    if (this.field5713.field6469[this.field5718] == 0) {
                        this.field5718++;
                    } else {
                        if (this.field5694.method2874(-21)) {
                            var6 = false;
                            break;
                        }
                        if (this.field5716[this.field5718] != 1) {
                            this.method2320(this.field5718, 2, false);
                        }
                        if (this.field5716[this.field5718] != 1) {
                            class179 var8 = new class179();
                            var8.field2798 = this.field5718;
                            var6 = false;
                            this.field5721.method4(1, var8);
                        }
                        this.field5718++;
                    }
                }
                if (var6) {
                    this.field5719 = false;
                    this.field5718 = 0;
                }
            } else {
                this.field5721 = null;
            }
        }
        int var10 = 28 % ((arg0 + 27) / 60);
        if (!this.field5724 || class344.method2111((byte) -64) < this.field5723) {
            return;
        }
        for (class257 var11 = (class257) this.field5705.method2415((byte) -120); var11 != null; var11 = (class257) this.field5705.method2416((byte) -128)) {
            if (!var11.field3923) {
                if (var11.field3922) {
                    if (!var11.field3924) {
                        throw new RuntimeException();
                    }
                    var11.method1121(false);
                } else {
                    var11.field3922 = true;
                }
            }
        }
        this.field5723 = class344.method2111((byte) -108) + 1000L;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)V")
    public final void method2322(int arg0, byte arg1) {
        field5704++;
        if (this.field5697 == null) {
            return;
        }
        if (arg1 != -104) {
            this.field5709 = null;
        }
        for (class179 var3 = this.field5722.method8((byte) -98); var3 != null; var3 = this.field5722.method17((byte) 78)) {
            if ((long) arg0 == var3.field2798) {
                return;
            }
        }
        class179 var4 = new class179();
        var4.field2798 = arg0;
        this.field5722.method4(1, var4);
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public final void method2323(int arg0) {
        field5699++;
        if (arg0 != 0) {
            this.method2327(49);
        }
        if (this.field5721 == null || this.method2317(false) == null) {
            return;
        }
        for (class179 var2 = this.field5722.method8((byte) -98); var2 != null; var2 = this.field5722.method17((byte) -107)) {
            int var3 = (int) var2.field2798;
            if (var3 < 0 || var3 >= this.field5713.field6465 || this.field5713.field6469[var3] == 0) {
                var2.method1121(false);
            } else {
                if (this.field5716[var3] == 0) {
                    this.method2320(var3, 1, false);
                }
                if (this.field5716[var3] == -1) {
                    this.method2320(var3, 2, false);
                }
                if (this.field5716[var3] == 1) {
                    var2.method1121(false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(Z)V")
    public final void method2324(boolean arg0) {
        field5696++;
        if (this.field5697 != null) {
            this.field5719 = arg0;
            if (this.field5721 == null) {
                this.field5721 = new class4();
            }
        }
    }

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)I")
    public final int method2325(int arg0) {
        if (arg0 != -19400) {
            this.field5714 = null;
        }
        field5702++;
        return this.field5713 == null ? 0 : this.field5713.field6460;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)I")
    public final int method2326(int arg0) {
        field5710++;
        if (this.field5713 == null) {
            return 0;
        } else if (!this.field5720) {
            return this.field5713.field6460;
        } else if (arg0 == 0) {
            class179 var2 = this.field5721.method8((byte) -98);
            return var2 == null ? 0 : (int) var2.field2798;
        } else {
            return -61;
        }
    }

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "(I)I")
    public final int method2327(int arg0) {
        field5698++;
        if (arg0 != 100) {
            this.field5705 = null;
        }
        if (this.method2317(false) == null) {
            return this.field5709 == null ? 0 : this.field5709.method1009(-117);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(II)[B")
    public final byte[] method2328(int arg0, int arg1) {
        field5706++;
        class257 var3 = this.method2320(arg0, 0, false);
        if (var3 == null) {
            return null;
        }
        if (arg1 < 78) {
            this.field5722 = null;
        }
        byte[] var4 = var3.method1005(114);
        var3.method1121(false);
        return var4;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(ILap;Lap;Lno;Lmf;IIZ)V")
    public class390(int arg0, class319 arg1, class319 arg2, class476 arg3, class276 arg4, int arg5, int arg6, boolean arg7) {
        this.field5697 = arg1;
        this.field5717 = arg0;
        if (this.field5697 == null) {
            this.field5720 = false;
        } else {
            this.field5720 = true;
            this.field5721 = new class4();
        }
        this.field5714 = arg4;
        this.field5711 = arg6;
        this.field5724 = arg7;
        this.field5707 = arg2;
        this.field5694 = arg3;
        this.field5703 = arg5;
        if (this.field5707 != null) {
            this.field5709 = this.field5714.method1680(this.field5707, this.field5717, 127);
        }
    }
}
