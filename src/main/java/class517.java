import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class517 extends class54 {

    @OriginalMember(owner = "client!au", name = "v", descriptor = "I")
    private int field7591 = 0;

    @OriginalMember(owner = "client!au", name = "n", descriptor = "Lbj;")
    private class159 field7583 = new class159(16);

    @OriginalMember(owner = "client!au", name = "P", descriptor = "I")
    private int field7611 = 0;

    @OriginalMember(owner = "client!au", name = "O", descriptor = "Lwo;")
    private class522 field7610 = new class522();

    @OriginalMember(owner = "client!au", name = "S", descriptor = "J")
    private long field7614 = 0L;

    @OriginalMember(owner = "client!au", name = "m", descriptor = "I")
    private int field7582;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "Ldh;")
    private class209 field7589;

    @OriginalMember(owner = "client!au", name = "Q", descriptor = "Z")
    private boolean field7612;

    @OriginalMember(owner = "client!au", name = "N", descriptor = "Lwo;")
    private class522 field7609;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "Lkp;")
    private class337 field7597;

    @OriginalMember(owner = "client!au", name = "j", descriptor = "Ldh;")
    private class209 field7579;

    @OriginalMember(owner = "client!au", name = "J", descriptor = "Lgl;")
    private class425 field7605;

    @OriginalMember(owner = "client!au", name = "E", descriptor = "I")
    private int field7600;

    @OriginalMember(owner = "client!au", name = "R", descriptor = "Z")
    private boolean field7613;

    @OriginalMember(owner = "client!au", name = "L", descriptor = "I")
    private int field7607;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "Lfr;")
    private class282 field7599;

    @OriginalMember(owner = "client!au", name = "z", descriptor = "[I")
    public static int[] field7595;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!au", name = "s", descriptor = "Luf;")
    public static class310 field7588;

    @OriginalMember(owner = "client!au", name = "l", descriptor = "I")
    public static int field7581;

    @OriginalMember(owner = "client!au", name = "o", descriptor = "I")
    public static int field7584;

    @OriginalMember(owner = "client!au", name = "p", descriptor = "I")
    public static int field7585;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "I")
    public static int field7586;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "I")
    public static int field7590;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "I")
    public static int field7592;

    @OriginalMember(owner = "client!au", name = "x", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "I")
    public static int field7594;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!au", name = "F", descriptor = "I")
    public static int field7601;

    @OriginalMember(owner = "client!au", name = "H", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!au", name = "I", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!au", name = "G", descriptor = "Lus;")
    public static class1 field7602;

    @OriginalMember(owner = "client!au", name = "k", descriptor = "Ljn;")
    private class504 field7580;

    @OriginalMember(owner = "client!au", name = "M", descriptor = "Z")
    private boolean field7608;

    @OriginalMember(owner = "client!au", name = "K", descriptor = "[B")
    private byte[] field7606;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IB)V")
    public final void method353(int arg0, byte arg1) {
        field7603++;
        if (this.field7589 == null) {
            return;
        }
        for (class499 var3 = this.field7610.method3072((byte) 123); var3 != null; var3 = this.field7610.method3066(2)) {
            if (((long) arg0) == var3.field7342) {
                return;
            }
        }
        class499 var4 = new class499();
        var4.field7342 = arg0;
        if (arg1 != 87) {
            this.field7580 = null;
        }
        this.field7610.method3070(var4, (byte) -125);
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V")
    public final void method3032(int arg0) {
        field7584++;
        if (this.field7609 == null || this.method352(-26270) == null) {
            return;
        }
        for (class499 var2 = this.field7610.method3072((byte) 67); var2 != null; var2 = this.field7610.method3066(2)) {
            int var3 = (int) var2.field7342;
            if (var3 < 0 || var3 >= this.field7580.field7399 || this.field7580.field7401[var3] == 0) {
                var2.method2946(-120);
            } else {
                if (this.field7606[var3] == 0) {
                    this.method3038(var3, 1, -3);
                }
                if (this.field7606[var3] == -1) {
                    this.method3038(var3, 2, arg0 - 2);
                }
                if (this.field7606[var3] == 1) {
                    var2.method2946(-113);
                }
            }
        }
        if (arg0 != -1) {
            this.method350((byte) 32, -34);
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(II)I")
    public final int method349(int arg0, int arg1) {
        field7581++;
        class282 var3 = (class282) this.field7583.method979((byte) 28, (long) arg1);
        if (arg0 != 0) {
            field7595 = null;
        }
        return var3 == null ? 0 : var3.method613(-15473);
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(I)V")
    public static final void method3033(int arg0) {
        field7590++;
        class275.field3736.method67(-94);
        class61.field810.method67(arg0 - 99);
        class214.field3047.method67(103);
        class483.field7080.method67(arg0 + 123);
        class227.field3184.method67(127);
        if (arg0 != 0) {
            field7596 = -68;
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(B)I")
    public final int method3034(byte arg0) {
        field7586++;
        if (this.field7580 == null) {
            return 0;
        }
        if (arg0 != 39) {
            this.field7580 = null;
        }
        if (this.field7612) {
            class499 var2 = this.field7609.method3072((byte) 91);
            return var2 == null ? 0 : (int) var2.field7342;
        } else {
            return this.field7580.field7398;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(Z)V")
    public final void method3035(boolean arg0) {
        field7593++;
        if (this.field7589 == null) {
            return;
        }
        if (arg0) {
            this.field7612 = true;
        }
        this.field7608 = true;
        if (this.field7609 == null) {
            this.field7609 = new class522();
        }
    }

    @OriginalMember(owner = "client!au", name = "d", descriptor = "(I)V")
    public final void method3036(int arg0) {
        field7598++;
        if (arg0 < 0) {
            return;
        }
        if (this.field7609 != null) {
            if (this.method352(-26270) == null) {
                return;
            }
            if (this.field7612) {
                boolean var2 = true;
                for (class499 var3 = this.field7609.method3072((byte) 88); var3 != null; var3 = this.field7609.method3066(2)) {
                    int var5 = (int) var3.field7342;
                    if (this.field7606[var5] == 0) {
                        this.method3038(var5, 1, -3);
                    }
                    if (this.field7606[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2946(-105);
                    }
                }
                while (this.field7611 < this.field7580.field7401.length) {
                    if (this.field7580.field7401[this.field7611] == 0) {
                        this.field7611++;
                    } else {
                        if (this.field7597.field4653 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field7606[this.field7611] == 0) {
                            this.method3038(this.field7611, 1, -3);
                        }
                        if (this.field7606[this.field7611] == 0) {
                            class499 var4 = new class499();
                            var4.field7342 = this.field7611;
                            this.field7609.method3070(var4, (byte) -125);
                            var2 = false;
                        }
                        this.field7611++;
                    }
                }
                if (var2) {
                    this.field7612 = false;
                    this.field7611 = 0;
                }
            } else if (this.field7608) {
                boolean var6 = true;
                for (class499 var7 = this.field7609.method3072((byte) 52); var7 != null; var7 = this.field7609.method3066(2)) {
                    int var9 = (int) var7.field7342;
                    if (this.field7606[var9] != 1) {
                        this.method3038(var9, 2, -3);
                    }
                    if (this.field7606[var9] == 1) {
                        var7.method2946(-127);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field7580.field7401.length > this.field7611) {
                    if (this.field7580.field7401[this.field7611] == 0) {
                        this.field7611++;
                    } else {
                        if (this.field7605.method2537(29)) {
                            var6 = false;
                            break;
                        }
                        if (this.field7606[this.field7611] != 1) {
                            this.method3038(this.field7611, 2, -3);
                        }
                        if (this.field7606[this.field7611] != 1) {
                            class499 var8 = new class499();
                            var8.field7342 = this.field7611;
                            var6 = false;
                            this.field7609.method3070(var8, (byte) -122);
                        }
                        this.field7611++;
                    }
                }
                if (var6) {
                    this.field7611 = 0;
                    this.field7608 = false;
                }
            } else {
                this.field7609 = null;
            }
        }
        if (!this.field7613 || class333.method1850(-3562) < this.field7614) {
            return;
        }
        for (class282 var10 = (class282) this.field7583.method981(0); var10 != null; var10 = (class282) this.field7583.method989(0)) {
            if (!var10.field3807) {
                if (var10.field3811) {
                    if (!var10.field3809) {
                        throw new RuntimeException();
                    }
                    var10.method2946(-118);
                } else {
                    var10.field3811 = true;
                }
            }
        }
        this.field7614 = class333.method1850(-3562) + 1000L;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(BI)[B")
    public final byte[] method350(byte arg0, int arg1) {
        field7587++;
        class282 var3 = this.method3038(arg1, 0, -3);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method614(72);
        var3.method2946(-119);
        if (arg0 <= 120) {
            field7588 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(Z)I")
    public final int method3037(boolean arg0) {
        field7604++;
        if (!arg0) {
            this.method3034((byte) -90);
        }
        return this.field7591;
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(III)Lfr;")
    private final class282 method3038(int arg0, int arg1, int arg2) {
        field7592++;
        if (arg2 != -3) {
            return null;
        }
        class282 var4 = (class282) this.field7583.method979((byte) 28, (long) arg0);
        if (var4 != null && arg1 == 0 && !var4.field3809 && var4.field3807) {
            var4.method2946(-119);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field7589 == null || this.field7606[arg0] == -1) {
                    if (this.field7605.method2538((byte) 112)) {
                        return null;
                    }
                    var4 = this.field7605.method2543(this.field7582, -114, arg0, true, (byte) 2);
                } else {
                    var4 = this.field7597.method1872(this.field7589, -5883, arg0);
                }
            } else if (arg1 == 1) {
                if (this.field7589 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field7597.method1875(arg0, arg2 ^ 0xFFFFFFF9, this.field7589);
            } else if (arg1 == 2) {
                if (this.field7589 == null) {
                    throw new RuntimeException();
                }
                if (this.field7606[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field7605.method2537(68)) {
                    return null;
                }
                var4 = this.field7605.method2543(this.field7582, -105, arg0, false, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field7583.method990((long) arg0, (byte) 6, var4);
        }
        if (var4.field3807) {
            return null;
        }
        byte[] var5 = var4.method614(56);
        if (!var4 instanceof class514) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class349.field4783.reset();
                class349.field4783.update(var5, 0, var5.length - 2);
                int var9 = (int) class349.field4783.getValue();
                if (this.field7580.field7393[arg0] != var9) {
                    throw new RuntimeException();
                }
                this.field7605.field6227 = 0;
                this.field7605.field6226 = 0;
            } catch (RuntimeException var12) {
                this.field7605.method2542(-5451);
                var4.method2946(-104);
                if (var4.field3809 && !this.field7605.method2538((byte) 124)) {
                    class88 var10 = this.field7605.method2543(this.field7582, 85, arg0, true, (byte) 2);
                    this.field7583.method990((long) arg0, (byte) 109, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field7580.field7408[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field7580.field7408[arg0];
            if (this.field7589 != null) {
                this.field7597.method1874(arg0, var5, false, this.field7589);
                if (this.field7606[arg0] != 1) {
                    this.field7591++;
                    this.field7606[arg0] = 1;
                }
            }
            if (!var4.field3809) {
                var4.method2946(arg2 ^ 0x6D);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class349.field4783.reset();
            class349.field4783.update(var5, 0, var5.length - 2);
            int var6 = (int) class349.field4783.getValue();
            if (this.field7580.field7393[arg0] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field7580.field7408[arg0] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field7606[arg0] != 1) {
                this.field7591++;
                this.field7606[arg0] = 1;
            }
            if (!var4.field3809) {
                var4.method2946(arg2 ^ 0x62);
            }
            return var4;
        } catch (Exception var11) {
            this.field7606[arg0] = -1;
            var4.method2946(-106);
            if (var4.field3809 && !this.field7605.method2538((byte) 49)) {
                class88 var8 = this.field7605.method2543(this.field7582, 61, arg0, true, (byte) 2);
                this.field7583.method990((long) arg0, (byte) 35, var8);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!au", name = "e", descriptor = "(I)V")
    public static void method3039(int arg0) {
        field7595 = null;
        field7602 = null;
        field7588 = null;
        if (arg0 != -2) {
            field7588 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "c", descriptor = "(B)I")
    public final int method3040(byte arg0) {
        field7585++;
        if (this.method352(-26270) == null) {
            return this.field7599 == null ? 0 : this.field7599.method613(-15473);
        } else {
            if (arg0 < 54) {
                this.field7608 = false;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!au", name = "f", descriptor = "(I)I")
    public final int method3041(int arg0) {
        if (arg0 == 0) {
            field7594++;
            return this.field7580 == null ? 0 : this.field7580.field7398;
        } else {
            return 110;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)Ljn;")
    public final class504 method352(int arg0) {
        field7601++;
        if (this.field7580 != null) {
            return this.field7580;
        } else if (arg0 == -26270) {
            if (this.field7599 == null) {
                if (this.field7605.method2538((byte) 79)) {
                    return null;
                }
                this.field7599 = this.field7605.method2543(255, -83, this.field7582, true, (byte) 0);
            }
            if (this.field7599.field3807) {
                return null;
            }
            byte[] var2 = this.field7599.method614(40);
            if (this.field7599 instanceof class514) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field7580 = new class504(var2, this.field7600);
                    if (this.field7580.field7400 != this.field7607) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field7580 = null;
                    if (this.field7605.method2538((byte) 106)) {
                        this.field7599 = null;
                    } else {
                        this.field7599 = this.field7605.method2543(255, 84, this.field7582, true, (byte) 0);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field7580 = new class504(var2, this.field7600);
                } catch (RuntimeException var4) {
                    this.field7605.method2542(-5451);
                    this.field7580 = null;
                    if (this.field7605.method2538((byte) 89)) {
                        this.field7599 = null;
                    } else {
                        this.field7599 = this.field7605.method2543(255, -121, this.field7582, true, (byte) 0);
                    }
                    return null;
                }
                if (this.field7579 != null) {
                    this.field7597.method1874(this.field7582, var2, false, this.field7579);
                }
            }
            if (this.field7589 != null) {
                this.field7591 = 0;
                this.field7606 = new byte[this.field7580.field7399];
            }
            this.field7599 = null;
            return this.field7580;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(ILdh;Ldh;Lgl;Lkp;IIZ)V")
    public class517(int arg0, class209 arg1, class209 arg2, class425 arg3, class337 arg4, int arg5, int arg6, boolean arg7) {
        this.field7582 = arg0;
        this.field7589 = arg1;
        if (this.field7589 == null) {
            this.field7612 = false;
        } else {
            this.field7612 = true;
            this.field7609 = new class522();
        }
        this.field7597 = arg4;
        this.field7579 = arg2;
        this.field7605 = arg3;
        this.field7600 = arg5;
        this.field7613 = arg7;
        this.field7607 = arg6;
        if (this.field7579 != null) {
            this.field7599 = this.field7597.method1872(this.field7579, -5883, this.field7582);
        }
    }

    static {
        new class83("You have been permanently muted due to breaking a rule.", "Du wurdest permanent stumm geschaltet, da du gegen eine Regel verstoßen hast.", "L'accès à la messagerie instantanée vous a définitivement été retiré suite à une infraction.", "Você foi permanentemente vetado por ter violado uma regra.");
        field7595 = new int[2];
        field7596 = -1;
        field7588 = new class310(99, -1);
    }
}
