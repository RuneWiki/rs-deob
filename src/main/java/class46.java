import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class46 extends class50 {

    @OriginalMember(owner = "client!lj", name = "G", descriptor = "I")
    private int field572 = 0;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "Lac;")
    private class153 field552 = new class153(16);

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    private int field581 = 0;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "Lol;")
    private class220 field583 = new class220();

    @OriginalMember(owner = "client!lj", name = "X", descriptor = "J")
    private long field587 = 0L;

    @OriginalMember(owner = "client!lj", name = "s", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client!lj", name = "v", descriptor = "Lhi;")
    private class278 field561;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "Z")
    private boolean field582;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "Lol;")
    private class220 field585;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "Lhi;")
    private class278 field555;

    @OriginalMember(owner = "client!lj", name = "N", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client!lj", name = "B", descriptor = "I")
    private int field567;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "Z")
    private boolean field586;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "Ldl;")
    private class35 field550;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "Lgi;")
    private class205 field575;

    @OriginalMember(owner = "client!lj", name = "x", descriptor = "Lbd;")
    private class293 field563;

    @OriginalMember(owner = "client!lj", name = "r", descriptor = "[I")
    public static int[] field557 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "I")
    public static int field571 = 0;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "[I")
    public static int[] field574 = new int[50];

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field554;

    @OriginalMember(owner = "client!lj", name = "t", descriptor = "I")
    public static int field559;

    @OriginalMember(owner = "client!lj", name = "u", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!lj", name = "z", descriptor = "I")
    public static int field565;

    @OriginalMember(owner = "client!lj", name = "A", descriptor = "I")
    public static int field566;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    public static int field569;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!lj", name = "y", descriptor = "J")
    public static long field564;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "Lie;")
    private class80 field577;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "Z")
    private boolean field584;

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "[B")
    private byte[] field556;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "[B")
    public static byte[] field580;

    @OriginalMember(owner = "client!lj", name = "w", descriptor = "[I")
    public static int[] field562;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "[I")
    public static int[] field578;

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(B)V")
    public final void method254(byte arg0) {
        field573++;
        if (arg0 != 1) {
            this.method264((byte) -101);
        }
        if (this.field561 != null) {
            this.field584 = true;
            if (this.field585 == null) {
                this.field585 = new class220();
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(II)[B")
    public final byte[] method255(int arg0, int arg1) {
        field568++;
        class293 var3 = this.method266(arg0, (byte) -119, 0);
        if (arg1 != 12963) {
            this.method260(71);
        }
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method738(-66);
            var3.method1764(64);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZI)I")
    public final int method256(boolean arg0, int arg1) {
        field560++;
        class293 var3 = (class293) this.field552.method1064(-1, (long) arg1);
        if (!arg0) {
            this.method258(-38);
        }
        return var3 == null ? 0 : var3.method742((byte) -72);
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(B)V")
    public static void method257(byte arg0) {
        if (arg0 < 91) {
            method257((byte) -71);
        }
        field562 = null;
        field574 = null;
        field580 = null;
        field557 = null;
        field578 = null;
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(I)I")
    public final int method258(int arg0) {
        if (arg0 <= 41) {
            return -92;
        } else {
            field554++;
            return this.field572;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)V")
    public final void method259(boolean arg0) {
        field551++;
        if (this.field585 != null) {
            if (this.method261((byte) 35) == null) {
                return;
            }
            if (this.field582) {
                boolean var6 = true;
                for (class247 var7 = this.field585.method1548(0); var7 != null; var7 = this.field585.method1549(-43)) {
                    int var9 = (int) var7.field4018;
                    if (this.field556[var9] == 0) {
                        this.method266(var9, (byte) -116, 1);
                    }
                    if (this.field556[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1764(64);
                    }
                }
                while (this.field577.field1217.length > this.field581) {
                    if (this.field577.field1217[this.field581] == 0) {
                        this.field581++;
                    } else {
                        if (this.field575.field3211 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field556[this.field581] == 0) {
                            this.method266(this.field581, (byte) -118, 1);
                        }
                        if (this.field556[this.field581] == 0) {
                            class247 var8 = new class247();
                            var6 = false;
                            var8.field4018 = (long) this.field581;
                            this.field585.method1540(var8, (byte) -108);
                        }
                        this.field581++;
                    }
                }
                if (var6) {
                    this.field581 = 0;
                    this.field582 = false;
                }
            } else if (this.field584) {
                boolean var2 = true;
                for (class247 var3 = this.field585.method1548(0); var3 != null; var3 = this.field585.method1549(118)) {
                    int var5 = (int) var3.field4018;
                    if (this.field556[var5] != 1) {
                        this.method266(var5, (byte) -118, 2);
                    }
                    if (this.field556[var5] == 1) {
                        var3.method1764(64);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field577.field1217.length > this.field581) {
                    if (this.field577.field1217[this.field581] == 0) {
                        this.field581++;
                    } else {
                        if (this.field550.method189((byte) -63)) {
                            var2 = false;
                            break;
                        }
                        if (this.field556[this.field581] != 1) {
                            this.method266(this.field581, (byte) -123, 2);
                        }
                        if (this.field556[this.field581] != 1) {
                            var2 = false;
                            class247 var4 = new class247();
                            var4.field4018 = (long) this.field581;
                            this.field585.method1540(var4, (byte) -71);
                        }
                        this.field581++;
                    }
                }
                if (var2) {
                    this.field584 = false;
                    this.field581 = 0;
                }
            } else {
                this.field585 = null;
            }
        }
        if (this.field586 && class98.method665(true) >= this.field587) {
            for (class293 var10 = (class293) this.field552.method1065((byte) -59); var10 != null; var10 = (class293) this.field552.method1066(-126)) {
                if (!var10.field4700) {
                    if (var10.field4705) {
                        if (!var10.field4698) {
                            throw new RuntimeException();
                        }
                        var10.method1764(64);
                    } else {
                        var10.field4705 = true;
                    }
                }
            }
            this.field587 = class98.method665(arg0) + 1000L;
        }
        if (!arg0) {
            this.method265(-11, -74);
        }
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(I)I")
    public final int method260(int arg0) {
        field549++;
        if (arg0 == 2097151) {
            return this.field577 == null ? 0 : this.field577.field1228;
        } else {
            return -98;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(B)Lie;")
    public final class80 method261(byte arg0) {
        field559++;
        if (this.field577 != null) {
            return this.field577;
        }
        if (this.field563 == null) {
            if (this.field550.method181(-16333)) {
                return null;
            }
            this.field563 = this.field550.method192(true, (byte) 0, this.field558, 255, -121);
        }
        if (arg0 < 29) {
            this.method259(false);
        }
        if (this.field563.field4700) {
            return null;
        }
        byte[] var2 = this.field563.method738(-36);
        if (this.field563 instanceof class111) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field577 = new class80(var2, this.field567);
                if (this.field577.field1208 != this.field579) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field577 = null;
                if (this.field550.method181(-16333)) {
                    this.field563 = null;
                } else {
                    this.field563 = this.field550.method192(true, (byte) 0, this.field558, 255, -117);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field577 = new class80(var2, this.field567);
            } catch (RuntimeException var4) {
                this.field550.method190((byte) -42);
                this.field577 = null;
                if (this.field550.method181(-16333)) {
                    this.field563 = null;
                } else {
                    this.field563 = this.field550.method192(true, (byte) 0, this.field558, 255, -124);
                }
                return null;
            }
            if (this.field555 != null) {
                this.field575.method1413(-128, var2, this.field558, this.field555);
            }
        }
        if (this.field561 != null) {
            this.field572 = 0;
            this.field556 = new byte[this.field577.field1206];
        }
        this.field563 = null;
        return this.field577;
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(B)I")
    public final int method262(byte arg0) {
        field576++;
        if (this.field577 == null) {
            return 0;
        } else if (this.field582) {
            class247 var2 = this.field585.method1548(0);
            if (var2 == null) {
                return 0;
            } else {
                if (arg0 < 91) {
                    this.method261((byte) 7);
                }
                return (int) var2.field4018;
            }
        } else {
            return this.field577.field1228;
        }
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(Z)V")
    public final void method263(boolean arg0) {
        field569++;
        if (this.field585 == null || this.method261((byte) 125) == null || !arg0) {
            return;
        }
        for (class247 var2 = this.field583.method1548(0); var2 != null; var2 = this.field583.method1549(-83)) {
            int var3 = (int) var2.field4018;
            if (var3 < 0 || var3 >= this.field577.field1206 || this.field577.field1217[var3] == 0) {
                var2.method1764(64);
            } else {
                if (this.field556[var3] == 0) {
                    this.method266(var3, (byte) -119, 1);
                }
                if (this.field556[var3] == -1) {
                    this.method266(var3, (byte) -128, 2);
                }
                if (this.field556[var3] == 1) {
                    var2.method1764(64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(B)I")
    public final int method264(byte arg0) {
        field553++;
        if (this.method261((byte) 71) == null) {
            return this.field563 == null ? 0 : this.field563.method742((byte) -72);
        } else {
            if (arg0 > -40) {
                this.method261((byte) -98);
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)V")
    public final void method265(int arg0, int arg1) {
        field570++;
        if (this.field561 == null) {
            return;
        }
        if (arg0 != 31) {
            method257((byte) 12);
        }
        for (class247 var3 = this.field583.method1548(0); var3 != null; var3 = this.field583.method1549(-107)) {
            if (((long) arg1) == var3.field4018) {
                return;
            }
        }
        class247 var4 = new class247();
        var4.field4018 = (long) arg1;
        this.field583.method1540(var4, (byte) -108);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBI)Lbd;")
    private final class293 method266(int arg0, byte arg1, int arg2) {
        field565++;
        class293 var4 = (class293) this.field552.method1064(-1, (long) arg0);
        if (arg1 > -115) {
            this.method261((byte) -67);
        }
        if (var4 != null && arg2 == 0 && !var4.field4698 && var4.field4700) {
            var4.method1764(64);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field561 == null || this.field556[arg0] == -1) {
                    if (this.field550.method181(-16333)) {
                        return null;
                    }
                    var4 = this.field550.method192(true, (byte) 2, arg0, this.field558, 63);
                } else {
                    var4 = this.field575.method1410(arg0, 1, this.field561);
                }
            } else if (arg2 == 1) {
                if (this.field561 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field575.method1412(arg0, this.field561, 5392);
            } else if (arg2 == 2) {
                if (this.field561 == null) {
                    throw new RuntimeException();
                }
                if (this.field556[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field550.method189((byte) 118)) {
                    return null;
                }
                var4 = this.field550.method192(false, (byte) 2, arg0, this.field558, 110);
            } else {
                throw new RuntimeException();
            }
            this.field552.method1054(-3510, var4, (long) arg0);
        }
        if (var4.field4700) {
            return null;
        }
        byte[] var5 = var4.method738(-24);
        if (!var4 instanceof class111) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class152.field2270.reset();
                class152.field2270.update(var5, 0, var5.length - 2);
                int var6 = (int) class152.field2270.getValue();
                if (this.field577.field1218[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field550.field433 = 0;
                this.field550.field432 = 0;
            } catch (RuntimeException var12) {
                this.field550.method190((byte) -93);
                var4.method1764(64);
                if (var4.field4698 && !this.field550.method181(-16333)) {
                    class298 var7 = this.field550.method192(true, (byte) 2, arg0, this.field558, 121);
                    this.field552.method1054(-3510, var7, (long) arg0);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field577.field1210[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field577.field1210[arg0];
            if (this.field561 != null) {
                this.field575.method1413(-111, var5, arg0, this.field561);
                if (this.field556[arg0] != 1) {
                    this.field572++;
                    this.field556[arg0] = 1;
                }
            }
            if (!var4.field4698) {
                var4.method1764(64);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class152.field2270.reset();
            class152.field2270.update(var5, 0, var5.length - 2);
            int var8 = (int) class152.field2270.getValue();
            if (this.field577.field1218[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field577.field1210[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field556[arg0] != 1) {
                this.field572++;
                this.field556[arg0] = 1;
            }
            if (!var4.field4698) {
                var4.method1764(64);
            }
            return var4;
        } catch (Exception var11) {
            this.field556[arg0] = -1;
            var4.method1764(64);
            if (var4.field4698 && !this.field550.method181(-16333)) {
                class298 var10 = this.field550.method192(true, (byte) 2, arg0, this.field558, -111);
                this.field552.method1054(-3510, var10, (long) arg0);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(ILhi;Lhi;Ldl;Lgi;IIZ)V")
    public class46(int arg0, class278 arg1, class278 arg2, class35 arg3, class205 arg4, int arg5, int arg6, boolean arg7) {
        this.field558 = arg0;
        this.field561 = arg1;
        if (this.field561 == null) {
            this.field582 = false;
        } else {
            this.field582 = true;
            this.field585 = new class220();
        }
        this.field555 = arg2;
        this.field579 = arg6;
        this.field567 = arg5;
        this.field586 = arg7;
        this.field550 = arg3;
        this.field575 = arg4;
        if (this.field555 != null) {
            this.field563 = this.field575.method1410(this.field558, 1, this.field555);
        }
    }
}
