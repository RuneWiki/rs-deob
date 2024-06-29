import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class232 extends class248 {

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    private int field4044 = 0;

    @OriginalMember(owner = "client!ua", name = "x", descriptor = "Lge;")
    private class235 field4028 = new class235(16);

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    private int field4045 = 0;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "Laa;")
    private class39 field4048 = new class39();

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "J")
    private long field4052 = 0L;

    @OriginalMember(owner = "client!ua", name = "E", descriptor = "Lkb;")
    private class73 field4035;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "I")
    private int field4040;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "Z")
    private boolean field4046;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "Laa;")
    private class39 field4047;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "Z")
    private boolean field4051;

    @OriginalMember(owner = "client!ua", name = "A", descriptor = "Lkb;")
    private class73 field4031;

    @OriginalMember(owner = "client!ua", name = "q", descriptor = "Lji;")
    private class134 field4021;

    @OriginalMember(owner = "client!ua", name = "z", descriptor = "I")
    private int field4030;

    @OriginalMember(owner = "client!ua", name = "r", descriptor = "I")
    private int field4022;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "Ltb;")
    private class173 field4037;

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "Lah;")
    private class99 field4027;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "Lha;")
    public static class46 field4025 = class271.method1828("Lade)3)3)3", -46);

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "Loc;")
    public static class220 field4038 = class150.method1105((byte) -110);

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field4016;

    @OriginalMember(owner = "client!ua", name = "m", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!ua", name = "o", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ua", name = "p", descriptor = "I")
    public static int field4020;

    @OriginalMember(owner = "client!ua", name = "s", descriptor = "I")
    public static int field4023;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field4024;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "I")
    public static int field4026;

    @OriginalMember(owner = "client!ua", name = "y", descriptor = "I")
    public static int field4029;

    @OriginalMember(owner = "client!ua", name = "B", descriptor = "I")
    public static int field4032;

    @OriginalMember(owner = "client!ua", name = "C", descriptor = "I")
    public static int field4033;

    @OriginalMember(owner = "client!ua", name = "I", descriptor = "I")
    public static int field4039;

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    public static int field4041;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    public static int field4042;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field4043;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field4049;

    @OriginalMember(owner = "client!ua", name = "n", descriptor = "Lpi;")
    public static class181 field4018;

    @OriginalMember(owner = "client!ua", name = "D", descriptor = "Ljf;")
    private class8 field4034;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "Z")
    private boolean field4050;

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "[B")
    private byte[] field4036;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(ZI)V")
    public static final void method1569(boolean arg0, int arg1) {
        if (arg0) {
            if (class114.field2157 != -1) {
                class24.method165(class114.field2157, true);
            }
            for (class31 var2 = (class31) class93.field1727.method1592(false); var2 != null; var2 = (class31) class93.field1727.method1591(84)) {
                class175.method1262(true, var2, 24);
            }
            class114.field2157 = -1;
            class93.field1727 = new class235(8);
            class145.method1079(114);
            class114.field2157 = class83.field1598;
            class81.method644((byte) 45, false);
            class271.method1827((byte) -78);
            class269.method1806(class114.field2157, arg1 ^ 0xFFFFFFFE);
        }
        field4029++;
        class277.field4824 = new class81();
        class277.field4824.field2546 = 3000;
        class277.field4824.field2585 = 3000;
        class140.method1059(class261.field4549, 0);
        class83.method661(10, arg1 ^ arg1);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IZ)I")
    public final int method1570(int arg0, boolean arg1) {
        if (arg1) {
            this.method1581((byte) 27);
        }
        field4016++;
        class99 var3 = (class99) this.field4028.method1601(-88, (long) arg0);
        return var3 == null ? 0 : var3.method21(110);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(I)V")
    public final void method1571(int arg0) {
        field4049++;
        if (this.field4047 == null || this.method1572((byte) -88) == null || arg0 != -3) {
            return;
        }
        for (class69 var2 = this.field4048.method264(-96); var2 != null; var2 = this.field4048.method269((byte) 7)) {
            int var3 = (int) var2.field1195;
            if (var3 < 0 || this.field4034.field138 <= var3 || this.field4034.field121[var3] == 0) {
                var2.method501(0);
            } else {
                if (this.field4036[var3] == 0) {
                    this.method1573(var3, 1, false);
                }
                if (this.field4036[var3] == -1) {
                    this.method1573(var3, 2, false);
                }
                if (this.field4036[var3] == 1) {
                    var2.method501(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(B)Ljf;")
    public final class8 method1572(byte arg0) {
        field4020++;
        if (this.field4034 != null) {
            return this.field4034;
        }
        if (this.field4027 == null) {
            if (this.field4037.method1238((byte) -66)) {
                return null;
            }
            this.field4027 = this.field4037.method1244(true, this.field4040, 255, true, (byte) 0);
        }
        if (this.field4027.field1834) {
            return null;
        }
        byte[] var2 = this.field4027.method20(-117);
        if (this.field4027 instanceof class5) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4034 = new class8(var2, this.field4022);
                if (this.field4034.field140 != this.field4030) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field4034 = null;
                if (this.field4037.method1238((byte) -66)) {
                    this.field4027 = null;
                } else {
                    this.field4027 = this.field4037.method1244(true, this.field4040, 255, true, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4034 = new class8(var2, this.field4022);
            } catch (RuntimeException var4) {
                this.field4037.method1230(102);
                this.field4034 = null;
                if (this.field4037.method1238((byte) -66)) {
                    this.field4027 = null;
                } else {
                    this.field4027 = this.field4037.method1244(true, this.field4040, 255, true, (byte) 0);
                }
                return null;
            }
            if (this.field4031 != null) {
                this.field4021.method1038(-81, this.field4040, this.field4031, var2);
            }
        }
        if (arg0 > -85) {
            this.method1573(-108, -100, false);
        }
        this.field4027 = null;
        if (this.field4035 != null) {
            this.field4044 = 0;
            this.field4036 = new byte[this.field4034.field138];
        }
        return this.field4034;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIZ)Lah;")
    private final class99 method1573(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method1574(-41);
        }
        class99 var4 = (class99) this.field4028.method1601(98, (long) arg0);
        field4043++;
        if (var4 != null && arg1 == 0 && !var4.field1838 && var4.field1834) {
            var4.method501(0);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field4035 == null || this.field4036[arg0] == -1) {
                    if (this.field4037.method1238((byte) -66)) {
                        return null;
                    }
                    var4 = this.field4037.method1244(true, arg0, this.field4040, true, (byte) 2);
                } else {
                    var4 = this.field4021.method1029(this.field4035, (byte) 58, arg0);
                }
            } else if (arg1 == 1) {
                if (this.field4035 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4021.method1030(arg0, this.field4035, true);
            } else if (arg1 == 2) {
                if (this.field4035 == null) {
                    throw new RuntimeException();
                }
                if (this.field4036[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4037.method1232(126)) {
                    return null;
                }
                var4 = this.field4037.method1244(!arg2, arg0, this.field4040, false, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field4028.method1597((long) arg0, (byte) -126, var4);
        }
        if (var4.field1834) {
            return null;
        }
        byte[] var5 = var4.method20(-113);
        if (!var4 instanceof class5) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class199.field3560.reset();
                class199.field3560.update(var5, 0, var5.length - 2);
                int var6 = (int) class199.field3560.getValue();
                if (this.field4034.field124[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field4037.field3107 = 0;
                this.field4037.field3105 = 0;
            } catch (RuntimeException var12) {
                this.field4037.method1230(102);
                var4.method501(0);
                if (var4.field1838 && !this.field4037.method1238((byte) -66)) {
                    class177 var7 = this.field4037.method1244(true, arg0, this.field4040, true, (byte) 2);
                    this.field4028.method1597((long) arg0, (byte) -126, var7);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4034.field141[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field4034.field141[arg0];
            if (this.field4035 != null) {
                this.field4021.method1038(-127, arg0, this.field4035, var5);
                if (this.field4036[arg0] != 1) {
                    this.field4044++;
                    this.field4036[arg0] = 1;
                }
            }
            if (!var4.field1838) {
                var4.method501(0);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class199.field3560.reset();
            class199.field3560.update(var5, 0, var5.length - 2);
            int var8 = (int) class199.field3560.getValue();
            if (this.field4034.field124[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4034.field141[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field4036[arg0] != 1) {
                this.field4044++;
                this.field4036[arg0] = 1;
            }
            if (!var4.field1838) {
                var4.method501(0);
            }
            return var4;
        } catch (Exception var11) {
            this.field4036[arg0] = -1;
            var4.method501(0);
            if (var4.field1838 && !this.field4037.method1238((byte) -66)) {
                class177 var10 = this.field4037.method1244(true, arg0, this.field4040, true, (byte) 2);
                this.field4028.method1597((long) arg0, (byte) -126, var10);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(I)V")
    public static final void method1574(int arg0) {
        if (arg0 == -13839) {
            field4019++;
            class142.field2589.method84(-32377);
        }
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(I)V")
    public static void method1575(int arg0) {
        field4038 = null;
        field4025 = null;
        if (arg0 != -2) {
            method1569(true, 127);
        }
        field4018 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)I")
    public final int method1576(boolean arg0) {
        field4032++;
        if (this.field4034 == null) {
            return 0;
        } else if (!this.field4046) {
            return this.field4034.field125;
        } else if (arg0) {
            class69 var2 = this.field4047.method264(-33);
            return var2 == null ? 0 : (int) var2.field1195;
        } else {
            return 90;
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)[B")
    public final byte[] method1577(int arg0, int arg1) {
        field4023++;
        class99 var3 = this.method1573(arg0, 0, false);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method20(-104);
        if (arg1 >= -100) {
            field4025 = null;
        }
        var3.method501(0);
        return var4;
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)V")
    public final void method1578(int arg0) {
        field4026++;
        if (this.field4035 != null && arg0 == 0) {
            this.field4050 = true;
            if (this.field4047 == null) {
                this.field4047 = new class39();
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(Z)I")
    public final int method1579(boolean arg0) {
        if (arg0) {
            return -8;
        } else {
            field4042++;
            return this.field4034 == null ? 0 : this.field4034.field125;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)V")
    public final void method1580(int arg0, byte arg1) {
        field4024++;
        if (this.field4035 == null) {
            return;
        }
        for (class69 var3 = this.field4048.method264(-94); var3 != null; var3 = this.field4048.method269((byte) 7)) {
            if ((long) arg0 == var3.field1195) {
                return;
            }
        }
        if (arg1 < -46) {
            class69 var4 = new class69();
            var4.field1195 = (long) arg0;
            this.field4048.method265(var4, -501);
        }
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(B)I")
    public final int method1581(byte arg0) {
        field4041++;
        int var2 = -57 / ((60 - arg0) / 33);
        return this.field4044;
    }

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "(B)I")
    public final int method1582(byte arg0) {
        if (arg0 != 2) {
            this.method1570(94, false);
        }
        field4033++;
        if (this.method1572((byte) -123) == null) {
            return this.field4027 == null ? 0 : this.field4027.method21(arg0 ^ 0x70);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V")
    public final void method1583(int arg0) {
        if (arg0 != -32562) {
            this.method1583(-104);
        }
        field4017++;
        if (this.field4047 != null) {
            if (this.method1572((byte) -113) == null) {
                return;
            }
            if (this.field4046) {
                boolean var2 = true;
                for (class69 var3 = this.field4047.method264(arg0 + 32434); var3 != null; var3 = this.field4047.method269((byte) 7)) {
                    int var5 = (int) var3.field1195;
                    if (this.field4036[var5] == 0) {
                        this.method1573(var5, 1, false);
                    }
                    if (this.field4036[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method501(0);
                    }
                }
                while (this.field4034.field121.length > this.field4045) {
                    if (this.field4034.field121[this.field4045] == 0) {
                        this.field4045++;
                    } else {
                        if (this.field4021.field2434 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4036[this.field4045] == 0) {
                            this.method1573(this.field4045, 1, false);
                        }
                        if (this.field4036[this.field4045] == 0) {
                            var2 = false;
                            class69 var4 = new class69();
                            var4.field1195 = (long) this.field4045;
                            this.field4047.method265(var4, -501);
                        }
                        this.field4045++;
                    }
                }
                if (var2) {
                    this.field4045 = 0;
                    this.field4046 = false;
                }
            } else if (this.field4050) {
                boolean var6 = true;
                for (class69 var7 = this.field4047.method264(arg0 ^ 0x7F5A); var7 != null; var7 = this.field4047.method269((byte) 7)) {
                    int var9 = (int) var7.field1195;
                    if (this.field4036[var9] != 1) {
                        this.method1573(var9, 2, false);
                    }
                    if (this.field4036[var9] == 1) {
                        var7.method501(0);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4045 < this.field4034.field121.length) {
                    if (this.field4034.field121[this.field4045] == 0) {
                        this.field4045++;
                    } else {
                        if (this.field4037.method1232(arg0 ^ 0x7F56)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4036[this.field4045] != 1) {
                            this.method1573(this.field4045, 2, false);
                        }
                        if (this.field4036[this.field4045] != 1) {
                            var6 = false;
                            class69 var8 = new class69();
                            var8.field1195 = (long) this.field4045;
                            this.field4047.method265(var8, arg0 ^ 0x7EC5);
                        }
                        this.field4045++;
                    }
                }
                if (var6) {
                    this.field4050 = false;
                    this.field4045 = 0;
                }
            } else {
                this.field4047 = null;
            }
        }
        if (!this.field4051 || class223.method1537(-26619) < this.field4052) {
            return;
        }
        for (class99 var10 = (class99) this.field4028.method1592(false); var10 != null; var10 = (class99) this.field4028.method1591(68)) {
            if (!var10.field1834) {
                if (var10.field1837) {
                    if (!var10.field1838) {
                        throw new RuntimeException();
                    }
                    var10.method501(0);
                } else {
                    var10.field1837 = true;
                }
            }
        }
        this.field4052 = class223.method1537(-26619) + 1000L;
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "(ILkb;Lkb;Ltb;Lji;IIZ)V")
    public class232(int arg0, class73 arg1, class73 arg2, class173 arg3, class134 arg4, int arg5, int arg6, boolean arg7) {
        this.field4035 = arg1;
        this.field4040 = arg0;
        if (this.field4035 == null) {
            this.field4046 = false;
        } else {
            this.field4046 = true;
            this.field4047 = new class39();
        }
        this.field4051 = arg7;
        this.field4031 = arg2;
        this.field4021 = arg4;
        this.field4030 = arg6;
        this.field4022 = arg5;
        this.field4037 = arg3;
        if (this.field4031 != null) {
            this.field4027 = this.field4021.method1029(this.field4031, (byte) 109, this.field4040);
        }
    }
}
