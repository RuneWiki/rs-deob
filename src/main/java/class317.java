import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class317 extends class99 {

    @OriginalMember(owner = "client!sl", name = "k", descriptor = "I")
    private int field4523 = 0;

    @OriginalMember(owner = "client!sl", name = "l", descriptor = "Lwa;")
    private class433 field4524 = new class433(16);

    @OriginalMember(owner = "client!sl", name = "J", descriptor = "I")
    private int field4548 = 0;

    @OriginalMember(owner = "client!sl", name = "K", descriptor = "Lvp;")
    private class123 field4549 = new class123();

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "J")
    private long field4557 = 0L;

    @OriginalMember(owner = "client!sl", name = "G", descriptor = "I")
    private int field4545;

    @OriginalMember(owner = "client!sl", name = "x", descriptor = "Loc;")
    private class135 field4536;

    @OriginalMember(owner = "client!sl", name = "O", descriptor = "Z")
    private boolean field4553;

    @OriginalMember(owner = "client!sl", name = "M", descriptor = "Lvp;")
    private class123 field4551;

    @OriginalMember(owner = "client!sl", name = "o", descriptor = "I")
    private int field4527;

    @OriginalMember(owner = "client!sl", name = "F", descriptor = "I")
    private int field4544;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "Z")
    private boolean field4556;

    @OriginalMember(owner = "client!sl", name = "p", descriptor = "Lkf;")
    private class165 field4528;

    @OriginalMember(owner = "client!sl", name = "B", descriptor = "Loc;")
    private class135 field4540;

    @OriginalMember(owner = "client!sl", name = "H", descriptor = "Lbd;")
    private class43 field4546;

    @OriginalMember(owner = "client!sl", name = "m", descriptor = "Lag;")
    private class480 field4525;

    @OriginalMember(owner = "client!sl", name = "s", descriptor = "Llt;")
    public static class475 field4531 = new class475("Loading world list data", "Lade Liste der Welten", "Chargement de la liste des serveurs", "Carregando dados da lista de mundos");

    @OriginalMember(owner = "client!sl", name = "E", descriptor = "Lki;")
    public static class498 field4543 = new class498(29, 7);

    @OriginalMember(owner = "client!sl", name = "U", descriptor = "I")
    public static int field4559 = 0;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "Lne;")
    public static class207 field4558 = new class207("WTWIP", 3);

    @OriginalMember(owner = "client!sl", name = "z", descriptor = "F")
    public static float field4538;

    @OriginalMember(owner = "client!sl", name = "L", descriptor = "F")
    public static float field4550;

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "I")
    public static int field4522;

    @OriginalMember(owner = "client!sl", name = "n", descriptor = "I")
    public static int field4526;

    @OriginalMember(owner = "client!sl", name = "q", descriptor = "I")
    public static int field4529;

    @OriginalMember(owner = "client!sl", name = "r", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!sl", name = "t", descriptor = "I")
    public static int field4532;

    @OriginalMember(owner = "client!sl", name = "u", descriptor = "I")
    public static int field4533;

    @OriginalMember(owner = "client!sl", name = "v", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!sl", name = "w", descriptor = "I")
    public static int field4535;

    @OriginalMember(owner = "client!sl", name = "y", descriptor = "I")
    public static int field4537;

    @OriginalMember(owner = "client!sl", name = "A", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!sl", name = "C", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!sl", name = "D", descriptor = "I")
    public static int field4542;

    @OriginalMember(owner = "client!sl", name = "N", descriptor = "I")
    public static int field4552;

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "Lgi;")
    public static class477 field4554;

    @OriginalMember(owner = "client!sl", name = "I", descriptor = "Lbm;")
    private class74 field4547;

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "Z")
    private boolean field4555;

    @OriginalMember(owner = "client!sl", name = "i", descriptor = "[B")
    private byte[] field4521;

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(Z)V", line = 3)
    public final void method1975(boolean arg0) {
        field4533++;
        if (this.field4551 == null || this.method608(true) == null) {
            return;
        }
        if (arg0) {
            this.field4557 = -125L;
        }
        for (class337 var2 = this.field4549.method816(127); var2 != null; var2 = this.field4549.method812(91)) {
            int var3 = (int) var2.field4736;
            if (var3 < 0 || var3 >= this.field4547.field1103 || this.field4547.field1097[var3] == 0) {
                var2.method2049(-85);
            } else {
                if (this.field4521[var3] == 0) {
                    this.method1976(1, (byte) 95, var3);
                }
                if (this.field4521[var3] == -1) {
                    this.method1976(2, (byte) 62, var3);
                }
                if (this.field4521[var3] == 1) {
                    var2.method2049(-66);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)V", line = 58)
    public final void method611(int arg0, byte arg1) {
        field4534++;
        if (this.field4536 == null || arg1 != -25) {
            return;
        }
        for (class337 var3 = this.field4549.method816(126); var3 != null; var3 = this.field4549.method812(85)) {
            if ((long) arg0 == var3.field4736) {
                return;
            }
        }
        class337 var4 = new class337();
        var4.field4736 = arg0;
        this.field4549.method809(var4, false);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)Lag;", line = 89)
    private final class480 method1976(int arg0, byte arg1, int arg2) {
        field4552++;
        class480 var4 = (class480) this.field4524.method2605(false, (long) arg2);
        if (var4 != null && arg0 == 0 && !var4.field7047 && var4.field7045) {
            var4.method2049(-98);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field4536 == null || this.field4521[arg2] == -1) {
                    if (this.field4546.method268(4)) {
                        return null;
                    }
                    var4 = this.field4546.method276((byte) 2, true, -84, this.field4545, arg2);
                } else {
                    var4 = this.field4528.method1148(arg2, this.field4536, -18101);
                }
            } else if (arg0 == 1) {
                if (this.field4536 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4528.method1146((byte) -111, this.field4536, arg2);
            } else if (arg0 == 2) {
                if (this.field4536 == null) {
                    throw new RuntimeException();
                }
                if (this.field4521[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4546.method279((byte) 124)) {
                    return null;
                }
                var4 = this.field4546.method276((byte) 2, false, -73, this.field4545, arg2);
            } else {
                throw new RuntimeException();
            }
            this.field4524.method2606(var4, (long) arg2, 0);
        }
        if (arg1 <= 54) {
            this.method1977((byte) -49);
        }
        if (var4.field7045) {
            return null;
        }
        byte[] var5 = var4.method1291(0);
        if (!var4 instanceof class189) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class495.field7322.reset();
                class495.field7322.update(var5, 0, var5.length - 2);
                int var9 = (int) class495.field7322.getValue();
                if (this.field4547.field1092[arg2] != var9) {
                    throw new RuntimeException();
                }
                this.field4546.field675 = 0;
                this.field4546.field674 = 0;
            } catch (RuntimeException var12) {
                this.field4546.method266((byte) -128);
                var4.method2049(-51);
                if (var4.field7047 && !this.field4546.method268(4)) {
                    class192 var10 = this.field4546.method276((byte) 2, true, -112, this.field4545, arg2);
                    this.field4524.method2606(var10, (long) arg2, 0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4547.field1088[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field4547.field1088[arg2];
            if (this.field4536 != null) {
                this.field4528.method1151(arg2, var5, (byte) -48, this.field4536);
                if (this.field4521[arg2] != 1) {
                    this.field4523++;
                    this.field4521[arg2] = 1;
                }
            }
            if (!var4.field7047) {
                var4.method2049(-107);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class495.field7322.reset();
            class495.field7322.update(var5, 0, var5.length - 2);
            int var6 = (int) class495.field7322.getValue();
            if (this.field4547.field1092[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4547.field1088[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field4521[arg2] != 1) {
                this.field4523++;
                this.field4521[arg2] = 1;
            }
            if (!var4.field7047) {
                var4.method2049(-99);
            }
            return var4;
        } catch (Exception var11) {
            this.field4521[arg2] = -1;
            var4.method2049(-75);
            if (var4.field7047 && !this.field4546.method268(4)) {
                class192 var8 = this.field4546.method276((byte) 2, true, -88, this.field4545, arg2);
                this.field4524.method2606(var8, (long) arg2, 0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)I", line = 303)
    public final int method607(int arg0, int arg1) {
        field4539++;
        if (arg1 == 19383) {
            class480 var3 = (class480) this.field4524.method2605(false, (long) arg0);
            return var3 == null ? 0 : var3.method1293(100);
        } else {
            return 65;
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(B)I", line = 323)
    public final int method1977(byte arg0) {
        field4526++;
        if (this.field4547 == null) {
            return 0;
        } else if (arg0 == -5) {
            return this.field4547.field1094;
        } else {
            return 60;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(I)I", line = 343)
    public final int method1978(int arg0) {
        field4537++;
        return arg0 == -2 ? this.field4523 : 56;
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(I)V", line = 354)
    public final void method1979(int arg0) {
        if (arg0 != -21202) {
            this.method1978(79);
        }
        field4522++;
        if (this.field4536 != null) {
            this.field4555 = true;
            if (this.field4551 == null) {
                this.field4551 = new class123();
            }
        }
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "(ILoc;Loc;Lbd;Lkf;IIZ)V", line = 802)
    public class317(int arg0, class135 arg1, class135 arg2, class43 arg3, class165 arg4, int arg5, int arg6, boolean arg7) {
        this.field4545 = arg0;
        this.field4536 = arg1;
        if (this.field4536 == null) {
            this.field4553 = false;
        } else {
            this.field4553 = true;
            this.field4551 = new class123();
        }
        this.field4527 = arg5;
        this.field4544 = arg6;
        this.field4556 = arg7;
        this.field4528 = arg4;
        this.field4540 = arg2;
        this.field4546 = arg3;
        if (this.field4540 != null) {
            this.field4525 = this.field4528.method1148(this.field4545, this.field4540, -18101);
        }
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(I)V", line = 377)
    public static void method1980(int arg0) {
        field4531 = null;
        field4543 = null;
        field4554 = null;
        if (arg0 != -1) {
            method1984(-31, null, -99);
        }
        field4558 = null;
    }

    @OriginalMember(owner = "client!sl", name = "c", descriptor = "(Z)V", line = 392)
    public final void method1981(boolean arg0) {
        field4535++;
        if (!arg0) {
            return;
        }
        if (this.field4551 != null) {
            if (this.method608(arg0) == null) {
                return;
            }
            if (this.field4553) {
                boolean var2 = true;
                for (class337 var3 = this.field4551.method816(107); var3 != null; var3 = this.field4551.method812(92)) {
                    int var5 = (int) var3.field4736;
                    if (this.field4521[var5] == 0) {
                        this.method1976(1, (byte) 62, var5);
                    }
                    if (this.field4521[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2049(-115);
                    }
                }
                while (this.field4548 < this.field4547.field1097.length) {
                    if (this.field4547.field1097[this.field4548] == 0) {
                        this.field4548++;
                    } else {
                        if (this.field4528.field2435 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4521[this.field4548] == 0) {
                            this.method1976(1, (byte) 67, this.field4548);
                        }
                        if (this.field4521[this.field4548] == 0) {
                            class337 var4 = new class337();
                            var4.field4736 = this.field4548;
                            this.field4551.method809(var4, false);
                            var2 = false;
                        }
                        this.field4548++;
                    }
                }
                if (var2) {
                    this.field4548 = 0;
                    this.field4553 = false;
                }
            } else if (this.field4555) {
                boolean var6 = true;
                for (class337 var7 = this.field4551.method816(104); var7 != null; var7 = this.field4551.method812(120)) {
                    int var9 = (int) var7.field4736;
                    if (this.field4521[var9] != 1) {
                        this.method1976(2, (byte) 75, var9);
                    }
                    if (this.field4521[var9] == 1) {
                        var7.method2049(-72);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4547.field1097.length > this.field4548) {
                    if (this.field4547.field1097[this.field4548] == 0) {
                        this.field4548++;
                    } else {
                        if (this.field4546.method279((byte) 126)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4521[this.field4548] != 1) {
                            this.method1976(2, (byte) 61, this.field4548);
                        }
                        if (this.field4521[this.field4548] != 1) {
                            class337 var8 = new class337();
                            var8.field4736 = this.field4548;
                            var6 = false;
                            this.field4551.method809(var8, false);
                        }
                        this.field4548++;
                    }
                }
                if (var6) {
                    this.field4555 = false;
                    this.field4548 = 0;
                }
            } else {
                this.field4551 = null;
            }
        }
        if (!this.field4556 || this.field4557 > class256.method1708((byte) 118)) {
            return;
        }
        for (class480 var10 = (class480) this.field4524.method2608(true); var10 != null; var10 = (class480) this.field4524.method2603(67)) {
            if (!var10.field7045) {
                if (var10.field7044) {
                    if (!var10.field7047) {
                        throw new RuntimeException();
                    }
                    var10.method2049(-113);
                } else {
                    var10.field7044 = true;
                }
            }
        }
        this.field4557 = class256.method1708((byte) 118) + 1000L;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(Z)Lbm;", line = 574)
    public final class74 method608(boolean arg0) {
        field4542++;
        if (this.field4547 != null) {
            return this.field4547;
        }
        if (this.field4525 == null) {
            if (this.field4546.method268(4)) {
                return null;
            }
            this.field4525 = this.field4546.method276((byte) 0, true, -82, 255, this.field4545);
        }
        if (this.field4525.field7045) {
            return null;
        } else if (arg0) {
            byte[] var2 = this.field4525.method1291(0);
            if (this.field4525 instanceof class189) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field4547 = new class74(var2, this.field4527);
                    if (this.field4547.field1095 != this.field4544) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field4547 = null;
                    if (this.field4546.method268(4)) {
                        this.field4525 = null;
                    } else {
                        this.field4525 = this.field4546.method276((byte) 0, true, -39, 255, this.field4545);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field4547 = new class74(var2, this.field4527);
                } catch (RuntimeException var4) {
                    this.field4546.method266((byte) -121);
                    this.field4547 = null;
                    if (this.field4546.method268(4)) {
                        this.field4525 = null;
                    } else {
                        this.field4525 = this.field4546.method276((byte) 0, true, -111, 255, this.field4545);
                    }
                    return null;
                }
                if (this.field4540 != null) {
                    this.field4528.method1151(this.field4545, var2, (byte) -38, this.field4540);
                }
            }
            if (this.field4536 != null) {
                this.field4521 = new byte[this.field4547.field1103];
                this.field4523 = 0;
            }
            this.field4525 = null;
            return this.field4547;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "d", descriptor = "(I)I", line = 671)
    public final int method1982(int arg0) {
        field4532++;
        if (this.method608(true) == null) {
            return this.field4525 == null ? 0 : this.field4525.method1293(100);
        } else if (arg0 == -1) {
            return 100;
        } else {
            return -103;
        }
    }

    @OriginalMember(owner = "client!sl", name = "e", descriptor = "(I)I", line = 694)
    public final int method1983(int arg0) {
        field4530++;
        if (this.field4547 == null) {
            return 0;
        } else if (arg0 != 0) {
            return -113;
        } else if (this.field4553) {
            class337 var2 = this.field4551.method816(arg0 + 106);
            return var2 == null ? 0 : (int) var2.field4736;
        } else {
            return this.field4547.field1094;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ)[B", line = 722)
    public final byte[] method614(int arg0, boolean arg1) {
        if (arg1) {
            return null;
        }
        field4541++;
        class480 var3 = this.method1976(0, (byte) 116, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1291(0);
            var3.method2049(-73);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ILjava/util/Random;I)I", line = 746)
    public static final int method1984(int arg0, Random arg1, int arg2) {
        field4529++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class415.method2495(1, arg2)) {
            return (int) (((long) arg1.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4 = 71 % ((arg0 - 51) / 33);
            int var5;
            do {
                var5 = arg1.nextInt();
            } while (var3 <= var5);
            return class339.method2061(arg2, 7, var5);
        }
    }
}
