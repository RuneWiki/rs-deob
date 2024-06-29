import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nr")
public class class40 extends class108 {

    @OriginalMember(owner = "client!nr", name = "A", descriptor = "I")
    private int field609 = 0;

    @OriginalMember(owner = "client!nr", name = "x", descriptor = "Lcv;")
    private class398 field606 = new class398(16);

    @OriginalMember(owner = "client!nr", name = "Q", descriptor = "I")
    private int field624 = 0;

    @OriginalMember(owner = "client!nr", name = "N", descriptor = "Lko;")
    private class348 field621 = new class348();

    @OriginalMember(owner = "client!nr", name = "T", descriptor = "J")
    private long field627 = 0L;

    @OriginalMember(owner = "client!nr", name = "G", descriptor = "Lkn;")
    private class518 field614;

    @OriginalMember(owner = "client!nr", name = "J", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client!nr", name = "P", descriptor = "Z")
    private boolean field623;

    @OriginalMember(owner = "client!nr", name = "O", descriptor = "Lko;")
    private class348 field622;

    @OriginalMember(owner = "client!nr", name = "L", descriptor = "Lkn;")
    private class518 field619;

    @OriginalMember(owner = "client!nr", name = "H", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "client!nr", name = "S", descriptor = "Z")
    private boolean field626;

    @OriginalMember(owner = "client!nr", name = "I", descriptor = "I")
    private int field616;

    @OriginalMember(owner = "client!nr", name = "y", descriptor = "Lik;")
    private class138 field607;

    @OriginalMember(owner = "client!nr", name = "o", descriptor = "Lml;")
    private class263 field597;

    @OriginalMember(owner = "client!nr", name = "n", descriptor = "Lt;")
    private class470 field596;

    @OriginalMember(owner = "client!nr", name = "K", descriptor = "I")
    public static int field618 = -1;

    @OriginalMember(owner = "client!nr", name = "m", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!nr", name = "q", descriptor = "I")
    public static int field599;

    @OriginalMember(owner = "client!nr", name = "r", descriptor = "I")
    public static int field600;

    @OriginalMember(owner = "client!nr", name = "s", descriptor = "I")
    public static int field601;

    @OriginalMember(owner = "client!nr", name = "t", descriptor = "I")
    public static int field602;

    @OriginalMember(owner = "client!nr", name = "u", descriptor = "I")
    public static int field603;

    @OriginalMember(owner = "client!nr", name = "v", descriptor = "I")
    public static int field604;

    @OriginalMember(owner = "client!nr", name = "w", descriptor = "I")
    public static int field605;

    @OriginalMember(owner = "client!nr", name = "B", descriptor = "I")
    public static int field610;

    @OriginalMember(owner = "client!nr", name = "C", descriptor = "I")
    public static int field611;

    @OriginalMember(owner = "client!nr", name = "E", descriptor = "I")
    public static int field612;

    @OriginalMember(owner = "client!nr", name = "F", descriptor = "I")
    public static int field613;

    @OriginalMember(owner = "client!nr", name = "M", descriptor = "I")
    public static int field620;

    @OriginalMember(owner = "client!nr", name = "p", descriptor = "Llb;")
    private class378 field598;

    @OriginalMember(owner = "client!nr", name = "R", descriptor = "Z")
    private boolean field625;

    @OriginalMember(owner = "client!nr", name = "z", descriptor = "[B")
    private byte[] field608;

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(B)I")
    public final int method304(byte arg0) {
        field605++;
        return arg0 >= -121 ? -120 : this.field609;
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(Z)V")
    public final void method305(boolean arg0) {
        field603++;
        if (this.field622 != null) {
            if (this.method313(1246180808) == null) {
                return;
            }
            if (this.field623) {
                boolean var2 = true;
                for (class439 var3 = this.field622.method2257((byte) 124); var3 != null; var3 = this.field622.method2256(125)) {
                    int var5 = (int) var3.field6399;
                    if (this.field608[var5] == 0) {
                        this.method308(25069, var5, 1);
                    }
                    if (this.field608[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2663(-107);
                    }
                }
                while (this.field598.field5634.length > this.field624) {
                    if (this.field598.field5634[this.field624] == 0) {
                        this.field624++;
                    } else {
                        if (this.field607.field2092 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field608[this.field624] == 0) {
                            this.method308(25069, this.field624, 1);
                        }
                        if (this.field608[this.field624] == 0) {
                            class439 var4 = new class439();
                            var4.field6399 = this.field624;
                            var2 = false;
                            this.field622.method2270(0, var4);
                        }
                        this.field624++;
                    }
                }
                if (var2) {
                    this.field624 = 0;
                    this.field623 = false;
                }
            } else if (this.field625) {
                boolean var6 = true;
                for (class439 var7 = this.field622.method2257((byte) 123); var7 != null; var7 = this.field622.method2256(71)) {
                    int var9 = (int) var7.field6399;
                    if (this.field608[var9] != 1) {
                        this.method308(25069, var9, 2);
                    }
                    if (this.field608[var9] == 1) {
                        var7.method2663(-108);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field598.field5634.length > this.field624) {
                    if (this.field598.field5634[this.field624] == 0) {
                        this.field624++;
                    } else {
                        if (this.field597.method1678(121)) {
                            var6 = false;
                            break;
                        }
                        if (this.field608[this.field624] != 1) {
                            this.method308(25069, this.field624, 2);
                        }
                        if (this.field608[this.field624] != 1) {
                            class439 var8 = new class439();
                            var8.field6399 = this.field624;
                            var6 = false;
                            this.field622.method2270(0, var8);
                        }
                        this.field624++;
                    }
                }
                if (var6) {
                    this.field625 = false;
                    this.field624 = 0;
                }
            } else {
                this.field622 = null;
            }
        }
        if (this.field626 && class464.method2773((byte) 103) >= this.field627) {
            for (class470 var10 = (class470) this.field606.method2483(-8); var10 != null; var10 = (class470) this.field606.method2481((byte) -27)) {
                if (!var10.field6915) {
                    if (var10.field6910) {
                        if (!var10.field6916) {
                            throw new RuntimeException();
                        }
                        var10.method2663(-118);
                    } else {
                        var10.field6910 = true;
                    }
                }
            }
            this.field627 = class464.method2773((byte) 103) + 1000L;
        }
        if (!arg0) {
            this.field621 = null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(BI)V")
    public final void method306(byte arg0, int arg1) {
        field600++;
        if (this.field614 == null) {
            return;
        }
        if (arg0 < 45) {
            this.method306((byte) 103, -89);
        }
        for (class439 var3 = this.field621.method2257((byte) 114); var3 != null; var3 = this.field621.method2256(-63)) {
            if ((long) arg1 == var3.field6399) {
                return;
            }
        }
        class439 var4 = new class439();
        var4.field6399 = arg1;
        this.field621.method2270(0, var4);
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(II)Z")
    public static final boolean method307(int arg0, int arg1) {
        if (arg1 <= 114) {
            method307(86, -71);
        }
        field601++;
        return arg0 >= 0 && arg0 <= 3 || arg0 == 9;
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(III)Lt;")
    private final class470 method308(int arg0, int arg1, int arg2) {
        if (arg0 != 25069) {
            this.field617 = 61;
        }
        field595++;
        class470 var4 = (class470) this.field606.method2485(27, (long) arg1);
        if (var4 != null && arg2 == 0 && !var4.field6916 && var4.field6915) {
            var4.method2663(-117);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field614 == null || this.field608[arg1] == -1) {
                    if (this.field597.method1675((byte) 105)) {
                        return null;
                    }
                    var4 = this.field597.method1685(this.field617, (byte) -25, (byte) 2, true, arg1);
                } else {
                    var4 = this.field607.method1017(arg1, (byte) 31, this.field614);
                }
            } else if (arg2 == 1) {
                if (this.field614 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field607.method1020((byte) 46, arg1, this.field614);
            } else if (arg2 == 2) {
                if (this.field614 == null) {
                    throw new RuntimeException();
                }
                if (this.field608[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field597.method1678(112)) {
                    return null;
                }
                var4 = this.field597.method1685(this.field617, (byte) -25, (byte) 2, false, arg1);
            } else {
                throw new RuntimeException();
            }
            this.field606.method2486(arg0 ^ 0x61D6, var4, (long) arg1);
        }
        if (var4.field6915) {
            return null;
        }
        byte[] var5 = var4.method1266(100);
        if (!var4 instanceof class409) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class80.field1327.reset();
                class80.field1327.update(var5, 0, var5.length - 2);
                int var6 = (int) class80.field1327.getValue();
                if (this.field598.field5645[arg1] != var6) {
                    throw new RuntimeException();
                }
                this.field597.field3799 = 0;
                this.field597.field3801 = 0;
            } catch (RuntimeException var12) {
                this.field597.method1677(arg0 - 24953);
                var4.method2663(arg0 ^ 0xFFFF9E6B);
                if (var4.field6916 && !this.field597.method1675((byte) 101)) {
                    class178 var7 = this.field597.method1685(this.field617, (byte) -25, (byte) 2, true, arg1);
                    this.field606.method2486(-123, var7, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field598.field5636[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field598.field5636[arg1];
            if (this.field614 != null) {
                this.field607.method1016(arg1, this.field614, var5, false);
                if (this.field608[arg1] != 1) {
                    this.field609++;
                    this.field608[arg1] = 1;
                }
            }
            if (!var4.field6916) {
                var4.method2663(arg0 ^ 0xFFFF9E60);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class80.field1327.reset();
            class80.field1327.update(var5, 0, var5.length - 2);
            int var8 = (int) class80.field1327.getValue();
            if (this.field598.field5645[arg1] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field598.field5636[arg1] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field608[arg1] != 1) {
                this.field609++;
                this.field608[arg1] = 1;
            }
            if (!var4.field6916) {
                var4.method2663(arg0 - 25190);
            }
            return var4;
        } catch (Exception var11) {
            this.field608[arg1] = -1;
            var4.method2663(arg0 ^ 0xFFFF9E60);
            if (var4.field6916 && !this.field597.method1675((byte) 112)) {
                class178 var10 = this.field597.method1685(this.field617, (byte) -25, (byte) 2, true, arg1);
                this.field606.method2486(arg0 ^ 0x61FC, var10, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(B)I")
    public final int method309(byte arg0) {
        field602++;
        if (this.field598 == null) {
            return 0;
        } else if (this.field623) {
            int var2 = -33 / ((arg0 - 12) / 32);
            class439 var3 = this.field622.method2257((byte) 97);
            return var3 == null ? 0 : (int) var3.field6399;
        } else {
            return this.field598.field5632;
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(II)I")
    public final int method310(int arg0, int arg1) {
        field599++;
        if (arg0 == -21601) {
            class470 var3 = (class470) this.field606.method2485(117, (long) arg1);
            return var3 == null ? 0 : var3.method1267(true);
        } else {
            return -56;
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(Z)V")
    public final void method311(boolean arg0) {
        field610++;
        if (this.field622 == null || this.method313(1246180808) == null) {
            return;
        }
        class439 var2 = this.field621.method2257((byte) 109);
        if (arg0) {
            this.field617 = 99;
        }
        while (var2 != null) {
            int var3 = (int) var2.field6399;
            if (var3 < 0 || var3 >= this.field598.field5639 || this.field598.field5634[var3] == 0) {
                var2.method2663(-119);
            } else {
                if (this.field608[var3] == 0) {
                    this.method308(25069, var3, 1);
                }
                if (this.field608[var3] == -1) {
                    this.method308(25069, var3, 2);
                }
                if (this.field608[var3] == 1) {
                    var2.method2663(-110);
                }
            }
            var2 = this.field621.method2256(30);
        }
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(Z)I")
    public final int method312(boolean arg0) {
        field620++;
        if (!arg0) {
            this.field608 = null;
        }
        if (this.method313(1246180808) == null) {
            return this.field596 == null ? 0 : this.field596.method1267(true);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!nr", name = "b", descriptor = "(I)Llb;")
    public final class378 method313(int arg0) {
        if (arg0 != 1246180808) {
            return null;
        }
        field604++;
        if (this.field598 != null) {
            return this.field598;
        }
        if (this.field596 == null) {
            if (this.field597.method1675((byte) -90)) {
                return null;
            }
            this.field596 = this.field597.method1685(255, (byte) -25, (byte) 0, true, this.field617);
        }
        if (this.field596.field6915) {
            return null;
        }
        byte[] var2 = this.field596.method1266(100);
        if (this.field596 instanceof class409) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field598 = new class378(var2, this.field616);
                if (this.field598.field5644 != this.field615) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field598 = null;
                if (this.field597.method1675((byte) 126)) {
                    this.field596 = null;
                } else {
                    this.field596 = this.field597.method1685(255, (byte) -25, (byte) 0, true, this.field617);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field598 = new class378(var2, this.field616);
            } catch (RuntimeException var4) {
                this.field597.method1677(115);
                this.field598 = null;
                if (this.field597.method1675((byte) 112)) {
                    this.field596 = null;
                } else {
                    this.field596 = this.field597.method1685(255, (byte) -25, (byte) 0, true, this.field617);
                }
                return null;
            }
            if (this.field619 != null) {
                this.field607.method1016(this.field617, this.field619, var2, false);
            }
        }
        if (this.field614 != null) {
            this.field608 = new byte[this.field598.field5639];
            this.field609 = 0;
        }
        this.field596 = null;
        return this.field598;
    }

    @OriginalMember(owner = "client!nr", name = "c", descriptor = "(I)I")
    public final int method314(int arg0) {
        if (arg0 <= 37) {
            this.method312(false);
        }
        field612++;
        return this.field598 == null ? 0 : this.field598.field5632;
    }

    @OriginalMember(owner = "client!nr", name = "d", descriptor = "(I)V")
    public final void method315(int arg0) {
        field611++;
        if (this.field614 == null) {
            return;
        }
        this.field625 = true;
        if (arg0 != 1) {
            this.method305(true);
        }
        if (this.field622 == null) {
            this.field622 = new class348();
        }
    }

    @OriginalMember(owner = "client!nr", name = "a", descriptor = "(IB)[B")
    public final byte[] method316(int arg0, byte arg1) {
        if (arg1 >= -88) {
            return null;
        }
        field613++;
        class470 var3 = this.method308(25069, arg0, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1266(100);
            var3.method2663(-125);
            return var4;
        }
    }

    @OriginalMember(owner = "client!nr", name = "<init>", descriptor = "(ILkn;Lkn;Lml;Lik;IIZ)V")
    public class40(int arg0, class518 arg1, class518 arg2, class263 arg3, class138 arg4, int arg5, int arg6, boolean arg7) {
        this.field614 = arg1;
        this.field617 = arg0;
        if (this.field614 == null) {
            this.field623 = false;
        } else {
            this.field623 = true;
            this.field622 = new class348();
        }
        this.field619 = arg2;
        this.field615 = arg6;
        this.field626 = arg7;
        this.field616 = arg5;
        this.field607 = arg4;
        this.field597 = arg3;
        if (this.field619 != null) {
            this.field596 = this.field607.method1017(this.field617, (byte) 59, this.field619);
        }
    }
}
