import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class253 extends class196 {

    @OriginalMember(owner = "client!bk", name = "o", descriptor = "I")
    private int field3612 = 0;

    @OriginalMember(owner = "client!bk", name = "A", descriptor = "Lan;")
    private class20 field3624 = new class20(16);

    @OriginalMember(owner = "client!bk", name = "M", descriptor = "I")
    private int field3636 = 0;

    @OriginalMember(owner = "client!bk", name = "N", descriptor = "Lug;")
    private class392 field3637 = new class392();

    @OriginalMember(owner = "client!bk", name = "Q", descriptor = "J")
    private long field3640 = 0L;

    @OriginalMember(owner = "client!bk", name = "l", descriptor = "I")
    private int field3609;

    @OriginalMember(owner = "client!bk", name = "I", descriptor = "Lsk;")
    private class438 field3632;

    @OriginalMember(owner = "client!bk", name = "L", descriptor = "Z")
    private boolean field3635;

    @OriginalMember(owner = "client!bk", name = "K", descriptor = "Lug;")
    private class392 field3634;

    @OriginalMember(owner = "client!bk", name = "y", descriptor = "Lsk;")
    private class438 field3622;

    @OriginalMember(owner = "client!bk", name = "k", descriptor = "Lvf;")
    private class103 field3608;

    @OriginalMember(owner = "client!bk", name = "x", descriptor = "I")
    private int field3621;

    @OriginalMember(owner = "client!bk", name = "D", descriptor = "I")
    private int field3627;

    @OriginalMember(owner = "client!bk", name = "v", descriptor = "Ld;")
    private class102 field3619;

    @OriginalMember(owner = "client!bk", name = "R", descriptor = "Z")
    private boolean field3641;

    @OriginalMember(owner = "client!bk", name = "w", descriptor = "Lnn;")
    private class284 field3620;

    @OriginalMember(owner = "client!bk", name = "u", descriptor = "Lpi;")
    public static class342 field3618 = new class342("Prepared sound engine", "Musik-Engine vorbereitet.", "Moteur son préparé", "Mecanismo de som preparado");

    @OriginalMember(owner = "client!bk", name = "F", descriptor = "La;")
    public static class435 field3629 = new class435();

    @OriginalMember(owner = "client!bk", name = "i", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!bk", name = "j", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!bk", name = "m", descriptor = "I")
    public static int field3610;

    @OriginalMember(owner = "client!bk", name = "n", descriptor = "I")
    public static int field3611;

    @OriginalMember(owner = "client!bk", name = "p", descriptor = "I")
    public static int field3613;

    @OriginalMember(owner = "client!bk", name = "r", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!bk", name = "t", descriptor = "I")
    public static int field3617;

    @OriginalMember(owner = "client!bk", name = "z", descriptor = "I")
    public static int field3623;

    @OriginalMember(owner = "client!bk", name = "B", descriptor = "I")
    public static int field3625;

    @OriginalMember(owner = "client!bk", name = "C", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!bk", name = "E", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!bk", name = "G", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!bk", name = "H", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!bk", name = "J", descriptor = "I")
    public static int field3633;

    @OriginalMember(owner = "client!bk", name = "P", descriptor = "Lbu;")
    public static class17 field3639;

    @OriginalMember(owner = "client!bk", name = "q", descriptor = "Lfv;")
    private class77 field3614;

    @OriginalMember(owner = "client!bk", name = "O", descriptor = "Z")
    private boolean field3638;

    @OriginalMember(owner = "client!bk", name = "s", descriptor = "[B")
    private byte[] field3616;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(I)V", line = 3)
    public final void method1623(int arg0) {
        field3626++;
        if (this.field3634 == null || this.method1362(false) == null) {
            return;
        }
        if (arg0 != -1) {
            this.field3632 = null;
        }
        for (class320 var2 = this.field3637.method2427(arg0 ^ 0xFFFFFF88); var2 != null; var2 = this.field3637.method2422(-74)) {
            int var3 = (int) var2.field4904;
            if (var3 < 0 || this.field3614.field1291 <= var3 || this.field3614.field1296[var3] == 0) {
                var2.method2090(-1);
            } else {
                if (this.field3616[var3] == 0) {
                    this.method1624(1, (byte) -113, var3);
                }
                if (this.field3616[var3] == -1) {
                    this.method1624(2, (byte) -109, var3);
                }
                if (this.field3616[var3] == 1) {
                    var2.method2090(arg0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)V", line = 53)
    public final void method1365(int arg0, int arg1) {
        field3607++;
        if (this.field3632 == null) {
            return;
        }
        for (class320 var3 = this.field3637.method2427(109); var3 != null; var3 = this.field3637.method2422(-90)) {
            if (((long) arg0) == var3.field4904) {
                return;
            }
        }
        if (arg1 != 255) {
            this.method1623(-55);
        }
        class320 var4 = new class320();
        var4.field4904 = arg0;
        this.field3637.method2417(25, var4);
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IBI)Lnn;", line = 90)
    private final class284 method1624(int arg0, byte arg1, int arg2) {
        field3623++;
        class284 var4 = (class284) this.field3624.method171((byte) -78, (long) arg2);
        if (var4 != null && arg0 == 0 && !var4.field4056 && var4.field4053) {
            var4.method2090(-1);
            var4 = null;
        }
        int var5 = 85 / ((arg1 + 58) / 44);
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field3632 == null || this.field3616[arg2] == -1) {
                    if (this.field3608.method772(-21)) {
                        return null;
                    }
                    var4 = this.field3608.method773(this.field3609, (byte) 2, 1, true, arg2);
                } else {
                    var4 = this.field3619.method764(this.field3632, arg2, 1);
                }
            } else if (arg0 == 1) {
                if (this.field3632 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3619.method759(arg2, this.field3632, (byte) -38);
            } else if (arg0 == 2) {
                if (this.field3632 == null) {
                    throw new RuntimeException();
                }
                if (this.field3616[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3608.method781((byte) 111)) {
                    return null;
                }
                var4 = this.field3608.method773(this.field3609, (byte) 2, 1, false, arg2);
            } else {
                throw new RuntimeException();
            }
            this.field3624.method166(var4, (long) arg2, 124);
        }
        if (var4.field4053) {
            return null;
        }
        byte[] var6 = var4.method1445((byte) 111);
        if (!var4 instanceof class217) {
            try {
                if (var6 == null || var6.length <= 2) {
                    throw new RuntimeException();
                }
                class226.field3207.reset();
                class226.field3207.update(var6, 0, var6.length - 2);
                int var10 = (int) class226.field3207.getValue();
                if (this.field3614.field1283[arg2] != var10) {
                    throw new RuntimeException();
                }
                this.field3608.field1720 = 0;
                this.field3608.field1722 = 0;
            } catch (RuntimeException var13) {
                this.field3608.method782((byte) 73);
                var4.method2090(-1);
                if (var4.field4056 && !this.field3608.method772(-21)) {
                    class298 var11 = this.field3608.method773(this.field3609, (byte) 2, 1, true, arg2);
                    this.field3624.method166(var11, (long) arg2, -116);
                }
                return null;
            }
            var6[var6.length - 2] = (byte) (this.field3614.field1280[arg2] >>> 8);
            var6[var6.length - 1] = (byte) this.field3614.field1280[arg2];
            if (this.field3632 != null) {
                this.field3619.method760(false, this.field3632, var6, arg2);
                if (this.field3616[arg2] != 1) {
                    this.field3612++;
                    this.field3616[arg2] = 1;
                }
            }
            if (!var4.field4056) {
                var4.method2090(-1);
            }
            return var4;
        }
        try {
            if (var6 == null || var6.length <= 2) {
                throw new RuntimeException();
            }
            class226.field3207.reset();
            class226.field3207.update(var6, 0, var6.length - 2);
            int var7 = (int) class226.field3207.getValue();
            if (this.field3614.field1283[arg2] != var7) {
                throw new RuntimeException();
            }
            int var8 = (var6[var6.length - 2] & 0xFF << 8) + (var6[var6.length - 1] & 0xFF);
            if ((this.field3614.field1280[arg2] & 0xFFFF) != var8) {
                throw new RuntimeException();
            }
            if (this.field3616[arg2] != 1) {
                this.field3612++;
                this.field3616[arg2] = 1;
            }
            if (!var4.field4056) {
                var4.method2090(-1);
            }
            return var4;
        } catch (Exception var12) {
            this.field3616[arg2] = -1;
            var4.method2090(-1);
            if (var4.field4056 && !this.field3608.method772(-21)) {
                class298 var9 = this.field3608.method773(this.field3609, (byte) 2, 1, true, arg2);
                this.field3624.method166(var9, (long) arg2, -116);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "(I)V", line = 303)
    public final void method1625(int arg0) {
        if (arg0 != 1276117928) {
            return;
        }
        field3613++;
        if (this.field3634 != null) {
            if (this.method1362(false) == null) {
                return;
            }
            if (this.field3635) {
                boolean var2 = true;
                for (class320 var3 = this.field3634.method2427(arg0 ^ 0x4C1003C7); var3 != null; var3 = this.field3634.method2422(-94)) {
                    int var5 = (int) var3.field4904;
                    if (this.field3616[var5] == 0) {
                        this.method1624(1, (byte) 54, var5);
                    }
                    if (this.field3616[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2090(arg0 ^ 0xB3EFFC57);
                    }
                }
                while (this.field3636 < this.field3614.field1296.length) {
                    if (this.field3614.field1296[this.field3636] == 0) {
                        this.field3636++;
                    } else {
                        if (this.field3619.field1688 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3616[this.field3636] == 0) {
                            this.method1624(1, (byte) 31, this.field3636);
                        }
                        if (this.field3616[this.field3636] == 0) {
                            class320 var4 = new class320();
                            var4.field4904 = this.field3636;
                            this.field3634.method2417(-30, var4);
                            var2 = false;
                        }
                        this.field3636++;
                    }
                }
                if (var2) {
                    this.field3636 = 0;
                    this.field3635 = false;
                }
            } else if (this.field3638) {
                boolean var6 = true;
                for (class320 var7 = this.field3634.method2427(105); var7 != null; var7 = this.field3634.method2422(-105)) {
                    int var9 = (int) var7.field4904;
                    if (this.field3616[var9] != 1) {
                        this.method1624(2, (byte) 75, var9);
                    }
                    if (this.field3616[var9] == 1) {
                        var7.method2090(arg0 - 1276117929);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3636 < this.field3614.field1296.length) {
                    if (this.field3614.field1296[this.field3636] == 0) {
                        this.field3636++;
                    } else {
                        if (this.field3608.method781((byte) 62)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3616[this.field3636] != 1) {
                            this.method1624(2, (byte) 123, this.field3636);
                        }
                        if (this.field3616[this.field3636] != 1) {
                            class320 var8 = new class320();
                            var8.field4904 = this.field3636;
                            var6 = false;
                            this.field3634.method2417(-120, var8);
                        }
                        this.field3636++;
                    }
                }
                if (var6) {
                    this.field3636 = 0;
                    this.field3638 = false;
                }
            } else {
                this.field3634 = null;
            }
        }
        if (!this.field3641 || class211.method1419(12921) < this.field3640) {
            return;
        }
        for (class284 var10 = (class284) this.field3624.method160((byte) -20); var10 != null; var10 = (class284) this.field3624.method163(123)) {
            if (!var10.field4053) {
                if (var10.field4049) {
                    if (!var10.field4056) {
                        throw new RuntimeException();
                    }
                    var10.method2090(-1);
                } else {
                    var10.field4049 = true;
                }
            }
        }
        this.field3640 = class211.method1419(12921) + 1000L;
    }

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "(I)V", line = 481)
    public final void method1626(int arg0) {
        field3631++;
        if (this.field3632 != null && arg0 == 7874) {
            this.field3638 = true;
            if (this.field3634 == null) {
                this.field3634 = new class392();
            }
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(IB)[B", line = 500)
    public final byte[] method1363(int arg0, byte arg1) {
        field3628++;
        class284 var3 = this.method1624(0, (byte) 42, arg0);
        int var4 = -7 % ((-arg1 - 84) / 41);
        if (var3 == null) {
            return null;
        } else {
            byte[] var5 = var3.method1445((byte) 113);
            var3.method2090(-1);
            return var5;
        }
    }

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "(I)I", line = 519)
    public final int method1627(int arg0) {
        field3611++;
        if (arg0 != 255) {
            method1630(36L, 99);
        }
        return this.field3612;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(Z)Lfv;", line = 530)
    public final class77 method1362(boolean arg0) {
        field3633++;
        if (this.field3614 != null) {
            return this.field3614;
        }
        if (this.field3620 == null) {
            if (this.field3608.method772(-21)) {
                return null;
            }
            this.field3620 = this.field3608.method773(255, (byte) 0, 1, true, this.field3609);
        }
        if (this.field3620.field4053) {
            return null;
        }
        byte[] var2 = this.field3620.method1445((byte) 119);
        if (this.field3620 instanceof class217) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3614 = new class77(var2, this.field3621);
                if (this.field3614.field1293 != this.field3627) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3614 = null;
                if (this.field3608.method772(-21)) {
                    this.field3620 = null;
                } else {
                    this.field3620 = this.field3608.method773(255, (byte) 0, 1, true, this.field3609);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3614 = new class77(var2, this.field3621);
            } catch (RuntimeException var4) {
                this.field3608.method782((byte) 126);
                this.field3614 = null;
                if (this.field3608.method772(-21)) {
                    this.field3620 = null;
                } else {
                    this.field3620 = this.field3608.method773(255, (byte) 0, 1, true, this.field3609);
                }
                return null;
            }
            if (this.field3622 != null) {
                this.field3619.method760(false, this.field3622, var2, this.field3609);
            }
        }
        this.field3620 = null;
        if (arg0) {
            this.method1628(114);
        }
        if (this.field3632 != null) {
            this.field3612 = 0;
            this.field3616 = new byte[this.field3614.field1291];
        }
        return this.field3614;
    }

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "(I)I", line = 627)
    public final int method1628(int arg0) {
        field3625++;
        if (this.field3614 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                field3618 = null;
            }
            return this.field3614.field1279;
        }
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(Z)I", line = 646)
    public final int method1629(boolean arg0) {
        field3630++;
        if (this.method1362(arg0) == null) {
            return this.field3620 == null ? 0 : this.field3620.method1451(0);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(JI)V", line = 663)
    public static final void method1630(long arg0, int arg1) {
        class410.field6141.field2289 = 0;
        field3610++;
        class410.field6141.method1109(false, class339.field5134.field6139);
        class410.field6141.method1084(2, arg0);
        class47.field864 = -3;
        class369.field5594 = 0;
        class91.field1568 = 1;
        if (arg1 != 22937) {
            method1632(27);
        }
        class457.field6848 = 0;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)I", line = 680)
    public final int method1366(byte arg0, int arg1) {
        field3606++;
        if (arg0 != -21) {
            this.field3609 = -101;
        }
        class284 var3 = (class284) this.field3624.method171((byte) -124, (long) arg1);
        return var3 == null ? 0 : var3.method1451(arg0 ^ 0xFFFFFFEB);
    }

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "(I)I", line = 707)
    public final int method1631(int arg0) {
        field3617++;
        if (this.field3614 == null) {
            return 0;
        }
        if (arg0 != 1) {
            this.method1624(27, (byte) -91, 91);
        }
        if (this.field3635) {
            class320 var2 = this.field3634.method2427(126);
            return var2 == null ? 0 : (int) var2.field4904;
        } else {
            return this.field3614.field1279;
        }
    }

    @OriginalMember(owner = "client!bk", name = "h", descriptor = "(I)V", line = 730)
    public static void method1632(int arg0) {
        if (arg0 > -116) {
            field3629 = null;
        }
        field3618 = null;
        field3629 = null;
        field3639 = null;
    }

    @OriginalMember(owner = "client!bk", name = "<init>", descriptor = "(ILsk;Lsk;Lvf;Ld;IIZ)V", line = 780)
    public class253(int arg0, class438 arg1, class438 arg2, class103 arg3, class102 arg4, int arg5, int arg6, boolean arg7) {
        this.field3609 = arg0;
        this.field3632 = arg1;
        if (this.field3632 == null) {
            this.field3635 = false;
        } else {
            this.field3635 = true;
            this.field3634 = new class392();
        }
        this.field3622 = arg2;
        this.field3608 = arg3;
        this.field3621 = arg5;
        this.field3627 = arg6;
        this.field3619 = arg4;
        this.field3641 = arg7;
        if (this.field3622 != null) {
            this.field3620 = this.field3619.method764(this.field3622, this.field3609, 1);
        }
    }
}
