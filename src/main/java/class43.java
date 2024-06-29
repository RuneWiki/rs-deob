import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class43 {

    @OriginalMember(owner = "client!vo", name = "m", descriptor = "I")
    private int field447 = -1;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "Z")
    private boolean field454 = false;

    @OriginalMember(owner = "client!vo", name = "i", descriptor = "I")
    private int field443 = 0;

    @OriginalMember(owner = "client!vo", name = "F", descriptor = "I")
    private int field466 = -1;

    @OriginalMember(owner = "client!vo", name = "C", descriptor = "I")
    private int field463 = 0;

    @OriginalMember(owner = "client!vo", name = "M", descriptor = "I")
    private int field473 = -1;

    @OriginalMember(owner = "client!vo", name = "E", descriptor = "Z")
    private boolean field465 = false;

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "B")
    private byte field441;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public int field439;

    @OriginalMember(owner = "client!vo", name = "K", descriptor = "I")
    public int field471;

    @OriginalMember(owner = "client!vo", name = "h", descriptor = "B")
    private byte field442;

    @OriginalMember(owner = "client!vo", name = "z", descriptor = "I")
    public int field460;

    @OriginalMember(owner = "client!vo", name = "v", descriptor = "Lgg;")
    private class176 field456;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "Z")
    private boolean field437;

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "Lvea;")
    public static class276 field452 = new class276(10, 2, 2, 0);

    @OriginalMember(owner = "client!vo", name = "J", descriptor = "I")
    public static int field470 = 0;

    @OriginalMember(owner = "client!vo", name = "L", descriptor = "[I")
    public static int[] field472 = new int[4096];

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!vo", name = "j", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!vo", name = "k", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!vo", name = "l", descriptor = "I")
    public static int field446;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    public static int field453;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client!vo", name = "w", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!vo", name = "x", descriptor = "I")
    public static int field458;

    @OriginalMember(owner = "client!vo", name = "A", descriptor = "I")
    public static int field461;

    @OriginalMember(owner = "client!vo", name = "B", descriptor = "I")
    public static int field462;

    @OriginalMember(owner = "client!vo", name = "D", descriptor = "I")
    public static int field464;

    @OriginalMember(owner = "client!vo", name = "I", descriptor = "I")
    public static int field469;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "Lmg;")
    private class150 field448;

    @OriginalMember(owner = "client!vo", name = "y", descriptor = "Lr;")
    private class184 field459;

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "Lgaa;")
    private class300 field449;

    @OriginalMember(owner = "client!vo", name = "H", descriptor = "Lka;")
    private class472 field468;

    @OriginalMember(owner = "client!vo", name = "N", descriptor = "Llba;")
    public class550 field474;

    @OriginalMember(owner = "client!vo", name = "G", descriptor = "[Lgg;")
    public static class176[] field467;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "[Z")
    private boolean[] field436;

    @OriginalMember(owner = "client!vo", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field464++;
        if (this.field474 != null) {
            this.field474.method3114();
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lha;I)V")
    public final void method259(class60 arg0, int arg1) {
        field458++;
        this.method264(-1, true, 262144, arg0, true);
        if (arg1 < 101) {
            this.method266((byte) -109);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lgg;I)V")
    private final void method260(class176 arg0, int arg1) {
        if (arg1 != -23137) {
            this.field454 = true;
        }
        field462++;
        label92: while (true) {
            if (this.field449 == null) {
                if (this.field454) {
                    return;
                }
                this.method269(-1, (byte) 101);
                if (this.field449 == null) {
                    return;
                }
            }
            int var3 = class406.field5732 - this.field455;
            if (var3 > 100 && this.field449.field4055 > 0) {
                int var4 = this.field449.field4042.length - this.field449.field4055;
                while (var4 > this.field457 && this.field449.field4033[this.field457] < var3) {
                    var3 -= this.field449.field4033[this.field457];
                    this.field457++;
                }
                if (this.field457 >= var4) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field449.field4042.length; var6++) {
                        var5 += this.field449.field4033[var6];
                    }
                    var3 %= var5;
                }
                this.field435 = this.field457 + 1;
                if (this.field435 >= this.field449.field4042.length) {
                    this.field435 -= this.field449.field4055;
                    if (this.field435 < 0 || this.field449.field4042.length <= this.field435) {
                        this.field435 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field449.field4033[this.field457] >= var3) {
                            this.field455 = class406.field5732 - var3;
                            this.field445 = var3;
                            return;
                        }
                        class153.method930((byte) -127, arg0, this.field457, this.field449);
                        var3 -= this.field449.field4033[this.field457];
                        this.field457++;
                        if (this.field449.field4042.length <= this.field457) {
                            this.field457 -= this.field449.field4055;
                            if (this.field457 < 0 || this.field449.field4042.length <= this.field457) {
                                this.field449 = null;
                                continue label92;
                            }
                        }
                        this.field435 = this.field457 + 1;
                    } while (this.field435 < this.field449.field4042.length);
                    this.field435 -= this.field449.field4055;
                } while (this.field435 >= 0 && this.field449.field4042.length > this.field435);
                this.field435 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BLha;)V")
    public final void method261(byte arg0, class60 arg1) {
        if (this.field459 != null) {
            class65.method500(this.field459, this.field442, this.field456.field2170, this.field456.field2165, this.field436);
            this.field459 = null;
            this.field436 = null;
        }
        int var3 = 124 % ((74 - arg0) / 35);
        field444++;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lka;IILhba;ZILha;ZI)V")
    public final void method262(class472 arg0, int arg1, int arg2, class10 arg3, boolean arg4, int arg5, class60 arg6, boolean arg7, int arg8) {
        field450++;
        class653[] var10 = arg0.method218();
        class614[] var11 = arg0.method201();
        if ((this.field474 == null || this.field474.field7783) && (var10 != null || var11 != null)) {
            class685 var12 = class707.field9894.method4109(this.field460, (byte) 119);
            if (var12.field9528 != null) {
                var12 = var12.method3875(class386.field5455, (byte) -116);
            }
            if (var12 != null) {
                this.field474 = class550.method3117(class406.field5732, true);
            }
        }
        if (arg7) {
            this.field442 = -118;
        }
        if (this.field474 == null) {
            return;
        }
        arg0.method217(arg3);
        if (arg4) {
            this.field474.method3120(arg6, (long) class406.field5732, var10, var11, false);
        } else {
            this.field474.method3126((long) class406.field5732);
        }
        this.field474.method3123(this.field441, arg5, arg1, arg2, arg8);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(I)V")
    public static void method263(int arg0) {
        if (arg0 == 11) {
            field467 = null;
            field452 = null;
            field472 = null;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZILha;Z)Lka;")
    public final class472 method264(int arg0, boolean arg1, int arg2, class60 arg3, boolean arg4) {
        field453++;
        if (arg0 != -1) {
            return null;
        }
        class685 var6 = class707.field9894.method4109(this.field460, (byte) 119);
        if (var6.field9528 != null) {
            var6 = var6.method3875(class386.field5455, (byte) -118);
        }
        if (var6 == null) {
            this.method261((byte) -80, arg3);
            this.field466 = -1;
            this.field473 = -1;
            this.field447 = -1;
            return null;
        }
        if (!this.field454 && this.field473 != var6.field9541) {
            this.field468 = null;
            this.method269(-1, (byte) 101);
        }
        this.method260(this.field456, -23137);
        if (arg4) {
            boolean var7 = arg4 & this.field437 & class11.field68.field5545.method61((byte) 120) != 0;
            arg4 = var7 & (this.field447 != var6.field9541 || this.field449 != null && class11.field68.field5545.method61((byte) 121) >= 2 && (this.field466 != this.field457 || (this.field449.field4048 || class686.field9625) && this.field457 != this.field435));
        }
        if (arg1 && !arg4) {
            this.field473 = var6.field9541;
            return null;
        }
        if (arg4) {
            class65.method500(this.field459, this.field442, this.field456.field2170, this.field456.field2165, this.field436);
            this.field447 = -1;
            this.field466 = -1;
        }
        class281 var8 = class25.field188[this.field442];
        class281 var9;
        if (this.field465) {
            var9 = class86.field1182[0];
        } else {
            var9 = this.field442 < 3 ? class25.field188[this.field442 + 1] : null;
        }
        class472 var10 = null;
        if (this.field449 != null) {
            if (arg4) {
                arg2 |= 0x40000;
            }
            var10 = var6.method3882(var8, this.field456.field2170, var8.method1683(this.field456.field2170, this.field456.field2165, true), (byte) -125, arg3, var9, arg2, this.field439 == 11 ? this.field471 + 4 : this.field471, this.field456.field2165, this.field439 == 11 ? 10 : this.field439, this.field448, this.field457, this.field449, this.field435, this.field445);
            if (var10 == null) {
                this.field463 = 0;
                this.field443 = 0;
                this.field459 = null;
                this.field436 = null;
            } else {
                if (arg4) {
                    if (this.field436 == null) {
                        this.field436 = new boolean[4];
                    }
                    this.field459 = var10.method215(this.field459);
                    class432.method2467(this.field459, this.field442, this.field456.field2170, this.field456.field2165, this.field436);
                    this.field447 = var6.field9541;
                    this.field466 = this.field457;
                }
                this.field443 = var10.method234();
                this.field463 = var10.method212();
            }
            this.field468 = null;
        } else if (this.field468 != null && (arg2 & this.field468.method225()) == arg2 && this.field473 == var6.field9541) {
            var10 = this.field468;
        } else {
            if (this.field468 != null) {
                arg2 |= this.field468.method225();
            }
            class696 var11 = var6.method3874(this.field456.field2165, false, var9, this.field439 == 11 ? this.field471 + 4 : this.field471, var8.method1683(this.field456.field2170, this.field456.field2165, true), arg4, this.field456.field2170, arg2, this.field448, var8, arg3, this.field439 == 11 ? 10 : this.field439);
            if (var11 == null) {
                this.field463 = 0;
                this.field459 = null;
                this.field443 = 0;
                this.field468 = null;
                this.field436 = null;
            } else {
                var10 = var11.field9718;
                this.field468 = var11.field9718;
                if (arg4) {
                    this.field459 = var11.field9720;
                    this.field436 = null;
                    class432.method2467(this.field459, this.field442, this.field456.field2170, this.field456.field2165, null);
                    this.field466 = -1;
                    this.field447 = var6.field9541;
                }
                this.field443 = var10.method234();
                this.field463 = var10.method212();
            }
        }
        this.field473 = var6.field9541;
        return var10;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(I)Z")
    public final boolean method265(int arg0) {
        field451++;
        if (arg0 < 17) {
            this.field439 = -60;
        }
        return this.field437;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(B)I")
    public final int method266(byte arg0) {
        if (arg0 < 124) {
            return 32;
        } else {
            field440++;
            return this.field443;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
    public final void method267(int arg0, int arg1) {
        this.field454 = true;
        field461++;
        if (arg1 >= -41) {
            this.field474 = null;
        }
        this.method269(arg0, (byte) 101);
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Lmg;I)V")
    public final void method268(class150 arg0, int arg1) {
        this.field448 = arg0;
        if (arg1 < -106) {
            this.field468 = null;
            field469++;
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IB)V")
    private final void method269(int arg0, byte arg1) {
        field438++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class685 var5 = class707.field9894.method4109(this.field460, (byte) 119);
            class685 var6 = var5;
            if (var5.field9528 != null) {
                var5 = var5.method3875(class386.field5455, (byte) -44);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field9589 != null) {
                if (this.field449 != null && var5.method3883(this.field449.field4052, true)) {
                    return;
                }
                var3 = var5.method3884(0);
                if (this.field473 != var5.field9541) {
                    var4 = var5.field9525;
                }
            } else if (var5.field9547 == -1) {
                if (var6 != null && var6.field9589 != null) {
                    if (this.field449 != null && var6.method3883(this.field449.field4052, true)) {
                        return;
                    }
                    var3 = var6.method3884(0);
                    if (this.field473 != var6.field9541) {
                        var4 = var6.field9525;
                    }
                } else if (var6 != null && var6.field9547 != -1 && this.field473 != var6.field9541) {
                    var4 = var6.field9525;
                    var3 = var6.field9547;
                }
            } else if (this.field473 != var5.field9541) {
                var4 = var5.field9525;
                var3 = var5.field9547;
            }
        }
        if (var3 == -1) {
            this.field449 = null;
            return;
        }
        this.field468 = null;
        if (this.field449 == null || this.field449.field4052 != var3) {
            this.field449 = class460.field6365.method1090(var3, 16383);
        } else if (this.field449.field4043 == 0) {
            return;
        }
        if (this.field449.field4042 == null) {
            this.field449 = null;
            return;
        }
        if (var4) {
            this.field457 = (int) (Math.random() * (double) this.field449.field4042.length);
            this.field445 = (int) ((double) this.field449.field4033[this.field457] * Math.random()) + 1;
        } else {
            this.field445 = 1;
            this.field457 = 0;
        }
        if (arg1 != 101) {
            return;
        }
        this.field435 = this.field457 + 1;
        if (this.field435 < 0 || this.field449.field4042.length <= this.field435) {
            this.field435 = -1;
        }
        this.field455 = class406.field5732 - this.field445;
    }

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(B)I")
    public final int method270(byte arg0) {
        int var2 = 64 % ((arg0 + 29) / 45);
        field446++;
        return this.field463;
    }

    @OriginalMember(owner = "client!vo", name = "<init>", descriptor = "(Lha;Lvha;IIIILgg;ZI)V")
    public class43(class60 arg0, class685 arg1, int arg2, int arg3, int arg4, int arg5, class176 arg6, boolean arg7, int arg8) {
        this.field441 = (byte) arg4;
        this.field439 = arg2;
        this.field471 = arg3;
        this.field442 = (byte) arg5;
        this.field460 = arg1.field9541;
        this.field465 = arg7;
        this.field456 = arg6;
        this.field437 = arg0.method381() && arg1.field9540 && !this.field465;
        if (arg8 != -1) {
            this.field454 = true;
        }
        this.method269(arg8, (byte) 101);
    }
}
