import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nia")
public class class671 {

    @OriginalMember(owner = "client!nia", name = "u", descriptor = "I")
    private int field9340 = -1;

    @OriginalMember(owner = "client!nia", name = "n", descriptor = "Z")
    private boolean field9333 = false;

    @OriginalMember(owner = "client!nia", name = "D", descriptor = "I")
    private int field9349 = -1;

    @OriginalMember(owner = "client!nia", name = "w", descriptor = "I")
    private int field9342 = -1;

    @OriginalMember(owner = "client!nia", name = "H", descriptor = "I")
    private int field9353 = 0;

    @OriginalMember(owner = "client!nia", name = "A", descriptor = "I")
    private int field9346 = 0;

    @OriginalMember(owner = "client!nia", name = "F", descriptor = "Z")
    private boolean field9351 = false;

    @OriginalMember(owner = "client!nia", name = "m", descriptor = "I")
    public int field9332;

    @OriginalMember(owner = "client!nia", name = "g", descriptor = "B")
    private byte field9326;

    @OriginalMember(owner = "client!nia", name = "o", descriptor = "I")
    public int field9334;

    @OriginalMember(owner = "client!nia", name = "q", descriptor = "Lje;")
    private class421 field9336;

    @OriginalMember(owner = "client!nia", name = "v", descriptor = "I")
    public int field9341;

    @OriginalMember(owner = "client!nia", name = "l", descriptor = "B")
    private byte field9331;

    @OriginalMember(owner = "client!nia", name = "p", descriptor = "Z")
    private boolean field9335;

    @OriginalMember(owner = "client!nia", name = "h", descriptor = "Lbu;")
    public static class21 field9327 = new class21(107, 6);

    @OriginalMember(owner = "client!nia", name = "E", descriptor = "[Lej;")
    public static class132[] field9350 = new class132[16];

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "I")
    public static int field9320;

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "I")
    public static int field9321;

    @OriginalMember(owner = "client!nia", name = "c", descriptor = "I")
    public static int field9322;

    @OriginalMember(owner = "client!nia", name = "d", descriptor = "I")
    public static int field9323;

    @OriginalMember(owner = "client!nia", name = "e", descriptor = "I")
    public static int field9324;

    @OriginalMember(owner = "client!nia", name = "r", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!nia", name = "s", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!nia", name = "t", descriptor = "I")
    private int field9339;

    @OriginalMember(owner = "client!nia", name = "x", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!nia", name = "y", descriptor = "I")
    public static int field9344;

    @OriginalMember(owner = "client!nia", name = "z", descriptor = "I")
    public static int field9345;

    @OriginalMember(owner = "client!nia", name = "B", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!nia", name = "I", descriptor = "I")
    public static int field9354;

    @OriginalMember(owner = "client!nia", name = "J", descriptor = "I")
    public static int field9355;

    @OriginalMember(owner = "client!nia", name = "K", descriptor = "I")
    private int field9356;

    @OriginalMember(owner = "client!nia", name = "L", descriptor = "I")
    private int field9357;

    @OriginalMember(owner = "client!nia", name = "M", descriptor = "I")
    private int field9358;

    @OriginalMember(owner = "client!nia", name = "j", descriptor = "Lr;")
    private class194 field9329;

    @OriginalMember(owner = "client!nia", name = "k", descriptor = "Lka;")
    private class496 field9330;

    @OriginalMember(owner = "client!nia", name = "C", descriptor = "Lmi;")
    private class520 field9348;

    @OriginalMember(owner = "client!nia", name = "G", descriptor = "Lcv;")
    public class593 field9352;

    @OriginalMember(owner = "client!nia", name = "i", descriptor = "Lpf;")
    private class607 field9328;

    @OriginalMember(owner = "client!nia", name = "f", descriptor = "[Z")
    private boolean[] field9325;

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lha;B)V")
    public final void method3810(class65 arg0, byte arg1) {
        field9321++;
        if (this.field9329 != null) {
            class46.method336(this.field9329, this.field9326, this.field9336.field5742, this.field9336.field5746, this.field9325);
            this.field9329 = null;
            this.field9325 = null;
        }
        if (arg1 != -4) {
            this.field9341 = 77;
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(B)I")
    public final int method3811(byte arg0) {
        if (arg0 != 110) {
            this.field9332 = 102;
        }
        field9344++;
        return this.field9346;
    }

    @OriginalMember(owner = "client!nia", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field9322++;
        if (this.field9352 != null) {
            this.field9352.method3451();
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(ILs;)V")
    public static final void method3812(int arg0, class294 arg1) {
        class208.field3219[arg0] = arg1;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lje;I)V")
    private final void method3813(class421 arg0, int arg1) {
        if (arg1 != -1) {
            this.field9341 = -49;
        }
        field9320++;
        label92: while (true) {
            if (this.field9328 == null) {
                if (this.field9351) {
                    return;
                }
                this.method3816(-1, -76);
                if (this.field9328 == null) {
                    return;
                }
            }
            int var3 = class192.field2961 - this.field9358;
            if (var3 > 100 && this.field9328.field8495 > 0) {
                int var4 = this.field9328.field8492.length - this.field9328.field8495;
                while (var4 > this.field9339 && this.field9328.field8494[this.field9339] < var3) {
                    var3 -= this.field9328.field8494[this.field9339];
                    this.field9339++;
                }
                if (var4 <= this.field9339) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field9328.field8492.length; var6++) {
                        var5 += this.field9328.field8494[var6];
                    }
                    var3 %= var5;
                }
                this.field9357 = this.field9339 + 1;
                if (this.field9328.field8492.length <= this.field9357) {
                    this.field9357 -= this.field9328.field8495;
                    if (this.field9357 < 0 || this.field9328.field8492.length <= this.field9357) {
                        this.field9357 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field9328.field8494[this.field9339] >= var3) {
                            this.field9358 = class192.field2961 - var3;
                            this.field9356 = var3;
                            return;
                        }
                        class760.method4227(255, arg0, this.field9328, this.field9339);
                        var3 -= this.field9328.field8494[this.field9339];
                        this.field9339++;
                        if (this.field9339 >= this.field9328.field8492.length) {
                            this.field9339 -= this.field9328.field8495;
                            if (this.field9339 < 0 || this.field9339 >= this.field9328.field8492.length) {
                                this.field9328 = null;
                                continue label92;
                            }
                        }
                        this.field9357 = this.field9339 + 1;
                    } while (this.field9328.field8492.length > this.field9357);
                    this.field9357 -= this.field9328.field8495;
                } while (this.field9357 >= 0 && this.field9328.field8492.length > this.field9357);
                this.field9357 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(II)V")
    public final void method3814(int arg0, int arg1) {
        field9324++;
        this.field9351 = true;
        if (arg1 >= 63) {
            this.method3816(arg0, -90);
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(IILha;ZZ)Lka;")
    public final class496 method3815(int arg0, int arg1, class65 arg2, boolean arg3, boolean arg4) {
        field9347++;
        class282 var6 = class277.field4038.method3919(true, this.field9332);
        if (var6.field4117 != null) {
            var6 = var6.method1826(class537.field7727, -121);
        }
        if (var6 == null) {
            this.method3810(arg2, (byte) -4);
            this.field9342 = -1;
            this.field9349 = -1;
            this.field9340 = -1;
            return null;
        }
        if (!this.field9351 && this.field9340 != var6.field4100) {
            this.field9330 = null;
            this.method3816(-1, -128);
        }
        if (arg0 != -779) {
            return null;
        }
        this.method3813(this.field9336, -1);
        if (arg3) {
            boolean var7 = arg3 & this.field9335 & class21.field353.field10062.method4001(-70) != 0;
            arg3 = var7 & (this.field9342 != var6.field4100 || this.field9328 != null && class21.field353.field10062.method4001(-52) >= 2 && (this.field9349 != this.field9339 || (this.field9328.field8487 || class778.field10685) && this.field9357 != this.field9339));
        }
        if (arg4 && !arg3) {
            this.field9340 = var6.field4100;
            return null;
        }
        if (arg3) {
            class46.method336(this.field9329, this.field9326, this.field9336.field5742, this.field9336.field5746, this.field9325);
            this.field9349 = -1;
            this.field9342 = -1;
        }
        class294 var8 = class208.field3219[this.field9326];
        class294 var9;
        if (this.field9333) {
            var9 = class411.field5572[0];
        } else {
            var9 = this.field9326 < 3 ? class208.field3219[this.field9326 + 1] : null;
        }
        class496 var10 = null;
        if (this.field9328 != null) {
            if (arg3) {
                arg1 |= 0x40000;
            }
            var10 = var6.method1843(var8.method1918(this.field9336.field5742, (byte) 126, this.field9336.field5746), this.field9341 == 11 ? this.field9334 + 4 : this.field9334, (byte) -95, this.field9336.field5746, arg1, var9, this.field9341 == 11 ? 10 : this.field9341, var8, this.field9336.field5742, this.field9357, this.field9348, this.field9356, this.field9339, arg2, this.field9328);
            if (var10 == null) {
                this.field9329 = null;
                this.field9346 = 0;
                this.field9325 = null;
                this.field9353 = 0;
            } else {
                if (arg3) {
                    if (this.field9325 == null) {
                        this.field9325 = new boolean[4];
                    }
                    this.field9329 = var10.method70(this.field9329);
                    class759.method4223(this.field9329, this.field9326, this.field9336.field5742, this.field9336.field5746, this.field9325);
                    this.field9349 = this.field9339;
                    this.field9342 = var6.field4100;
                }
                this.field9346 = var10.method118();
                this.field9353 = var10.method75();
            }
            this.field9330 = null;
        } else if (this.field9330 != null && arg1 == (arg1 & this.field9330.method68()) && this.field9340 == var6.field4100) {
            var10 = this.field9330;
        } else {
            if (this.field9330 != null) {
                arg1 |= this.field9330.method68();
            }
            class547 var11 = var6.method1827((byte) 94, this.field9341 == 11 ? 10 : this.field9341, arg1, this.field9348, arg2, var9, var8, arg3, this.field9336.field5742, var8.method1918(this.field9336.field5742, (byte) 126, this.field9336.field5746), this.field9336.field5746, this.field9341 == 11 ? this.field9334 + 4 : this.field9334);
            if (var11 == null) {
                this.field9325 = null;
                this.field9353 = 0;
                this.field9330 = null;
                this.field9329 = null;
                this.field9346 = 0;
            } else {
                var10 = var11.field7866;
                this.field9330 = var11.field7866;
                if (arg3) {
                    this.field9325 = null;
                    this.field9329 = var11.field7863;
                    class759.method4223(this.field9329, this.field9326, this.field9336.field5742, this.field9336.field5746, null);
                    this.field9342 = var6.field4100;
                    this.field9349 = -1;
                }
                this.field9346 = var10.method118();
                this.field9353 = var10.method75();
            }
        }
        this.field9340 = var6.field4100;
        return var10;
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(II)V")
    private final void method3816(int arg0, int arg1) {
        field9337++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class282 var5 = class277.field4038.method3919(true, this.field9332);
            class282 var6 = var5;
            if (var5.field4117 != null) {
                var5 = var5.method1826(class537.field7727, -29);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4135 != null) {
                if (this.field9328 != null && var5.method1841(this.field9328.field8512, -34)) {
                    return;
                }
                var3 = var5.method1836((byte) 83);
                if (this.field9340 != var5.field4100) {
                    var4 = var5.field4171;
                }
            } else if (var5.field4139 == -1) {
                if (var6 != null && var6.field4135 != null) {
                    if (this.field9328 != null && var6.method1841(this.field9328.field8512, -68)) {
                        return;
                    }
                    var3 = var6.method1836((byte) 83);
                    if (this.field9340 != var6.field4100) {
                        var4 = var6.field4171;
                    }
                } else if (var6 != null && var6.field4139 != -1 && this.field9340 != var6.field4100) {
                    var3 = var6.field4139;
                    var4 = var6.field4171;
                }
            } else if (this.field9340 != var5.field4100) {
                var3 = var5.field4139;
                var4 = var5.field4171;
            }
        }
        if (var3 == -1) {
            this.field9328 = null;
            return;
        }
        this.field9330 = null;
        if (this.field9328 == null || this.field9328.field8512 != var3) {
            this.field9328 = class563.field7993.method651(var3, (byte) 105);
        } else if (this.field9328.field8501 == 0) {
            return;
        }
        if (this.field9328.field8492 == null) {
            this.field9328 = null;
            return;
        }
        if (var4) {
            this.field9339 = (int) ((double) this.field9328.field8492.length * Math.random());
            this.field9356 = ((int) (Math.random() * (double) this.field9328.field8494[this.field9339])) + 1;
        } else {
            this.field9356 = 1;
            this.field9339 = 0;
        }
        this.field9357 = this.field9339 + 1;
        if (this.field9357 < 0 || this.field9357 >= this.field9328.field8492.length) {
            this.field9357 = -1;
        }
        if (arg1 < -50) {
            this.field9358 = class192.field2961 - this.field9356;
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lha;Z)V")
    public final void method3817(class65 arg0, boolean arg1) {
        this.method3815(-779, 262144, arg0, true, true);
        if (!arg1) {
            field9355++;
        }
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(ILka;IIIIZLqja;Lha;)V")
    public final void method3818(int arg0, class496 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, class326 arg7, class65 arg8) {
        field9343++;
        class88[] var10 = arg1.method97();
        class378[] var11 = arg1.method103();
        if (arg5 != 0) {
            return;
        }
        if ((this.field9352 == null || this.field9352.field8349) && (var10 != null || var11 != null)) {
            class282 var12 = class277.field4038.method3919(true, this.field9332);
            if (var12.field4117 != null) {
                var12 = var12.method1826(class537.field7727, -128);
            }
            if (var12 != null) {
                this.field9352 = class593.method3449(class192.field2961, true);
            }
        }
        if (this.field9352 == null) {
            return;
        }
        arg1.method66(arg7);
        if (arg6) {
            this.field9352.method3457(arg8, (long) class192.field2961, var10, var11, false);
        } else {
            this.field9352.method3446((long) class192.field2961);
        }
        this.field9352.method3458(this.field9331, arg3, arg4, arg0, arg2);
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(Lmi;I)V")
    public final void method3819(class520 arg0, int arg1) {
        field9354++;
        this.field9348 = arg0;
        if (arg1 != -1) {
            method3812(108, null);
        }
        this.field9330 = null;
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(B)Z")
    public final boolean method3820(byte arg0) {
        if (arg0 != 107) {
            method3822(96);
        }
        field9345++;
        return this.field9335;
    }

    @OriginalMember(owner = "client!nia", name = "a", descriptor = "(I)I")
    public final int method3821(int arg0) {
        if (arg0 != 1) {
            this.method3820((byte) -76);
        }
        field9323++;
        return this.field9353;
    }

    @OriginalMember(owner = "client!nia", name = "b", descriptor = "(I)V")
    public static void method3822(int arg0) {
        field9327 = null;
        if (arg0 == 107) {
            field9350 = null;
        }
    }

    @OriginalMember(owner = "client!nia", name = "<init>", descriptor = "(Lha;Lkv;IIIILje;ZI)V")
    public class671(class65 arg0, class282 arg1, int arg2, int arg3, int arg4, int arg5, class421 arg6, boolean arg7, int arg8) {
        this.field9332 = arg1.field4100;
        this.field9333 = arg7;
        this.field9326 = (byte) arg5;
        this.field9334 = arg3;
        this.field9336 = arg6;
        this.field9341 = arg2;
        this.field9331 = (byte) arg4;
        this.field9335 = arg0.method483() && arg1.field4115 && !this.field9333;
        if (arg8 != -1) {
            this.field9351 = true;
        }
        this.method3816(arg8, -116);
    }
}
