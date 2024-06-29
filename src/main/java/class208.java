import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class208 extends class165 {

    @OriginalMember(owner = "client!mi", name = "G", descriptor = "I")
    private int field3646 = 0;

    @OriginalMember(owner = "client!mi", name = "y", descriptor = "Loe;")
    private class79 field3638 = new class79(16);

    @OriginalMember(owner = "client!mi", name = "T", descriptor = "I")
    private int field3659 = 0;

    @OriginalMember(owner = "client!mi", name = "U", descriptor = "Lam;")
    private class277 field3660 = new class277();

    @OriginalMember(owner = "client!mi", name = "V", descriptor = "J")
    private long field3661 = 0L;

    @OriginalMember(owner = "client!mi", name = "u", descriptor = "Lph;")
    private class282 field3634;

    @OriginalMember(owner = "client!mi", name = "n", descriptor = "I")
    private int field3627;

    @OriginalMember(owner = "client!mi", name = "Q", descriptor = "Z")
    private boolean field3656;

    @OriginalMember(owner = "client!mi", name = "R", descriptor = "Lam;")
    private class277 field3657;

    @OriginalMember(owner = "client!mi", name = "M", descriptor = "Lqg;")
    private class196 field3652;

    @OriginalMember(owner = "client!mi", name = "x", descriptor = "Lde;")
    private class226 field3637;

    @OriginalMember(owner = "client!mi", name = "v", descriptor = "I")
    private int field3635;

    @OriginalMember(owner = "client!mi", name = "N", descriptor = "Lph;")
    private class282 field3653;

    @OriginalMember(owner = "client!mi", name = "W", descriptor = "Z")
    private boolean field3662;

    @OriginalMember(owner = "client!mi", name = "l", descriptor = "I")
    private int field3625;

    @OriginalMember(owner = "client!mi", name = "H", descriptor = "Lng;")
    private class142 field3647;

    @OriginalMember(owner = "client!mi", name = "t", descriptor = "I")
    public static int field3633 = 0;

    @OriginalMember(owner = "client!mi", name = "I", descriptor = "Lhi;")
    public static class82 field3648 = class95.method664((byte) -113, "Abandonner");

    @OriginalMember(owner = "client!mi", name = "B", descriptor = "Z")
    public static boolean field3641 = true;

    @OriginalMember(owner = "client!mi", name = "F", descriptor = "[I")
    public static int[] field3645 = new int[25];

    @OriginalMember(owner = "client!mi", name = "O", descriptor = "Lhi;")
    public static class82 field3654 = class95.method664((byte) -39, " loggt sich ein)3");

    @OriginalMember(owner = "client!mi", name = "P", descriptor = "Z")
    public static boolean field3655 = false;

    @OriginalMember(owner = "client!mi", name = "m", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!mi", name = "o", descriptor = "I")
    public static int field3628;

    @OriginalMember(owner = "client!mi", name = "p", descriptor = "I")
    public static int field3629;

    @OriginalMember(owner = "client!mi", name = "q", descriptor = "I")
    public static int field3630;

    @OriginalMember(owner = "client!mi", name = "r", descriptor = "I")
    public static int field3631;

    @OriginalMember(owner = "client!mi", name = "s", descriptor = "I")
    public static int field3632;

    @OriginalMember(owner = "client!mi", name = "z", descriptor = "I")
    public static int field3639;

    @OriginalMember(owner = "client!mi", name = "C", descriptor = "I")
    public static int field3642;

    @OriginalMember(owner = "client!mi", name = "E", descriptor = "I")
    public static int field3644;

    @OriginalMember(owner = "client!mi", name = "J", descriptor = "I")
    public static int field3649;

    @OriginalMember(owner = "client!mi", name = "K", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!mi", name = "L", descriptor = "I")
    public static int field3651;

    @OriginalMember(owner = "client!mi", name = "w", descriptor = "Lu;")
    private class34 field3636;

    @OriginalMember(owner = "client!mi", name = "D", descriptor = "Lei;")
    public static class70 field3643;

    @OriginalMember(owner = "client!mi", name = "S", descriptor = "Z")
    private boolean field3658;

    @OriginalMember(owner = "client!mi", name = "A", descriptor = "[B")
    private byte[] field3640;

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(B)I", line = 20)
    public final int method1486(byte arg0) {
        field3631++;
        if (arg0 < 83) {
            this.method1488(-101);
        }
        if (this.method1188((byte) 123) == null) {
            return this.field3647 == null ? 0 : this.field3647.method967(-96);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IZ)I", line = 43)
    public final int method1190(int arg0, boolean arg1) {
        field3628++;
        class142 var3 = (class142) this.field3638.method507((long) arg0, 602425312);
        if (var3 == null) {
            if (!arg1) {
                this.method1491(-95);
            }
            return 0;
        } else {
            return var3.method967(-89);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(B)Lu;", line = 60)
    public final class34 method1188(byte arg0) {
        field3651++;
        if (this.field3636 != null) {
            return this.field3636;
        }
        if (this.field3647 == null) {
            if (this.field3652.method1370(-127)) {
                return null;
            }
            this.field3647 = this.field3652.method1369(255, this.field3627, 20, true, (byte) 0);
        }
        if (this.field3647.field2433) {
            return null;
        }
        byte[] var2 = this.field3647.method964(-1);
        if (this.field3647 instanceof class150) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3636 = new class34(var2, this.field3635);
                if (this.field3636.field537 != this.field3625) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var5) {
                this.field3636 = null;
                if (this.field3652.method1370(-37)) {
                    this.field3647 = null;
                } else {
                    this.field3647 = this.field3652.method1369(255, this.field3627, 20, true, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3636 = new class34(var2, this.field3635);
            } catch (RuntimeException var6) {
                this.field3652.method1368(-28536);
                this.field3636 = null;
                if (this.field3652.method1370(-127)) {
                    this.field3647 = null;
                } else {
                    this.field3647 = this.field3652.method1369(255, this.field3627, 20, true, (byte) 0);
                }
                return null;
            }
            if (this.field3653 != null) {
                this.field3637.method1613(this.field3653, this.field3627, var2, 19909);
            }
        }
        if (this.field3634 != null) {
            this.field3646 = 0;
            this.field3640 = new byte[this.field3636.field505];
        }
        this.field3647 = null;
        return arg0 <= 27 ? (class34) null : this.field3636;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(II)[B", line = 157)
    public final byte[] method1192(int arg0, int arg1) {
        field3642++;
        class142 var3 = this.method1487(-37, 0, arg1);
        if (var3 == null) {
            return null;
        }
        byte[] var4 = var3.method964(-1);
        var3.method961((byte) 124);
        if (arg0 != 2) {
            this.field3662 = false;
        }
        return var4;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(III)Lng;", line = 177)
    private final class142 method1487(int arg0, int arg1, int arg2) {
        field3644++;
        class142 var4 = (class142) this.field3638.method507((long) arg2, 602425312);
        if (var4 != null && arg1 == 0 && !var4.field2426 && var4.field2433) {
            var4.method961((byte) 54);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field3634 == null || this.field3640[arg2] == -1) {
                    if (this.field3652.method1370(30)) {
                        return null;
                    }
                    var4 = this.field3652.method1369(this.field3627, arg2, 20, true, (byte) 2);
                } else {
                    var4 = this.field3637.method1610(arg2, 111, this.field3634);
                }
            } else if (arg1 == 1) {
                if (this.field3634 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3637.method1615(this.field3634, arg2, -25);
            } else if (arg1 == 2) {
                if (this.field3634 == null) {
                    throw new RuntimeException();
                }
                if (this.field3640[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3652.method1373(20)) {
                    return null;
                }
                var4 = this.field3652.method1369(this.field3627, arg2, 20, false, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field3638.method503((long) arg2, -120, var4);
        }
        if (var4.field2433) {
            return null;
        }
        if (arg0 > -7) {
            this.field3627 = -56;
        }
        byte[] var5 = var4.method964(-1);
        if (!var4 instanceof class150) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class296.field4992.reset();
                class296.field4992.update(var5, 0, var5.length - 2);
                int var10 = (int) class296.field4992.getValue();
                if (this.field3636.field512[arg2] != var10) {
                    throw new RuntimeException();
                }
                this.field3652.field3361 = 0;
                this.field3652.field3362 = 0;
            } catch (RuntimeException var14) {
                this.field3652.method1368(-28536);
                var4.method961((byte) 94);
                if (var4.field2426 && !this.field3652.method1370(-125)) {
                    class152 var12 = this.field3652.method1369(this.field3627, arg2, 20, true, (byte) 2);
                    this.field3638.method503((long) arg2, -45, var12);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3636.field521[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field3636.field521[arg2];
            if (this.field3634 != null) {
                this.field3637.method1613(this.field3634, arg2, var5, 19909);
                if (this.field3640[arg2] != 1) {
                    this.field3646++;
                    this.field3640[arg2] = 1;
                }
            }
            if (!var4.field2426) {
                var4.method961((byte) 117);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class296.field4992.reset();
            class296.field4992.update(var5, 0, var5.length - 2);
            int var6 = (int) class296.field4992.getValue();
            if (this.field3636.field512[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3636.field521[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field3640[arg2] != 1) {
                if (this.field3640[arg2] != 0) {
                }
                this.field3646++;
                this.field3640[arg2] = 1;
            }
            if (!var4.field2426) {
                var4.method961((byte) 123);
            }
            return var4;
        } catch (Exception var13) {
            this.field3640[arg2] = -1;
            var4.method961((byte) 101);
            if (var4.field2426 && !this.field3652.method1370(23)) {
                class152 var9 = this.field3652.method1369(this.field3627, arg2, 20, true, (byte) 2);
                this.field3638.method503((long) arg2, -70, var9);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "b", descriptor = "(I)I", line = 386)
    public final int method1488(int arg0) {
        field3626++;
        if (this.field3636 == null) {
            return 0;
        } else if (!this.field3656) {
            return this.field3636.field510;
        } else if (arg0 == 0) {
            class141 var2 = this.field3657.method1936(arg0 + 16173);
            return var2 == null ? 0 : (int) var2.field2418;
        } else {
            return 40;
        }
    }

    @OriginalMember(owner = "client!mi", name = "c", descriptor = "(I)I", line = 411)
    public final int method1489(int arg0) {
        field3639++;
        if (arg0 <= 80) {
            this.field3646 = 89;
        }
        return this.field3646;
    }

    @OriginalMember(owner = "client!mi", name = "d", descriptor = "(I)I", line = 428)
    public final int method1490(int arg0) {
        field3632++;
        if (this.field3636 == null) {
            return 0;
        } else if (arg0 <= 97) {
            return 19;
        } else {
            return this.field3636.field510;
        }
    }

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "(I)V", line = 451)
    public final void method1491(int arg0) {
        if (arg0 > -57) {
            this.method1491(24);
        }
        field3630++;
        if (this.field3657 != null) {
            if (this.method1188((byte) 99) == null) {
                return;
            }
            if (this.field3656) {
                boolean var6 = true;
                for (class141 var7 = this.field3657.method1936(16173); var7 != null; var7 = this.field3657.method1926((byte) 90)) {
                    int var8 = (int) var7.field2418;
                    if (this.field3640[var8] == 0) {
                        this.method1487(-51, 1, var8);
                    }
                    if (this.field3640[var8] == 0) {
                        var6 = false;
                    } else {
                        var7.method961((byte) 106);
                    }
                }
                while (this.field3659 < this.field3636.field526.length) {
                    if (this.field3636.field526[this.field3659] == 0) {
                        this.field3659++;
                    } else {
                        if (this.field3637.field3913 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field3640[this.field3659] == 0) {
                            this.method1487(-64, 1, this.field3659);
                        }
                        if (this.field3640[this.field3659] == 0) {
                            var6 = false;
                            class141 var9 = new class141();
                            var9.field2418 = (long) this.field3659;
                            this.field3657.method1940((byte) 96, var9);
                        }
                        this.field3659++;
                    }
                }
                if (var6) {
                    this.field3656 = false;
                    this.field3659 = 0;
                }
            } else if (this.field3658) {
                boolean var2 = true;
                for (class141 var3 = this.field3657.method1936(16173); var3 != null; var3 = this.field3657.method1926((byte) 90)) {
                    int var4 = (int) var3.field2418;
                    if (this.field3640[var4] != 1) {
                        this.method1487(-66, 2, var4);
                    }
                    if (this.field3640[var4] == 1) {
                        var3.method961((byte) 100);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field3659 < this.field3636.field526.length) {
                    if (this.field3636.field526[this.field3659] == 0) {
                        this.field3659++;
                    } else {
                        if (this.field3652.method1373(20)) {
                            var2 = false;
                            break;
                        }
                        if (this.field3640[this.field3659] != 1) {
                            this.method1487(-80, 2, this.field3659);
                        }
                        if (this.field3640[this.field3659] != 1) {
                            class141 var5 = new class141();
                            var5.field2418 = (long) this.field3659;
                            this.field3657.method1940((byte) 118, var5);
                            var2 = false;
                        }
                        this.field3659++;
                    }
                }
                if (var2) {
                    this.field3658 = false;
                    this.field3659 = 0;
                }
            } else {
                this.field3657 = null;
            }
        }
        if (!this.field3662 || this.field3661 > class57.method391(19211)) {
            return;
        }
        for (class142 var10 = (class142) this.field3638.method502((byte) -104); var10 != null; var10 = (class142) this.field3638.method494(true)) {
            if (!var10.field2433) {
                if (var10.field2432) {
                    if (!var10.field2426) {
                        throw new RuntimeException();
                    }
                    var10.method961((byte) 103);
                } else {
                    var10.field2432 = true;
                }
            }
        }
        this.field3661 = class57.method391(19211) + 1000L;
    }

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "(I)V", line = 629)
    public static void method1492(int arg0) {
        field3654 = null;
        field3645 = null;
        if (arg0 == 255) {
            field3643 = null;
            field3648 = null;
        }
    }

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "(I)V", line = 642)
    public final void method1493(int arg0) {
        field3649++;
        if (this.field3657 == null || this.method1188((byte) 118) == null) {
            return;
        }
        if (arg0 >= -95) {
            this.method1486((byte) 109);
        }
        for (class141 var2 = this.field3660.method1936(16173); var2 != null; var2 = this.field3660.method1926((byte) 90)) {
            int var3 = (int) var2.field2418;
            if (var3 < 0 || this.field3636.field505 <= var3 || this.field3636.field526[var3] == 0) {
                var2.method961((byte) 97);
            } else {
                if (this.field3640[var3] == 0) {
                    this.method1487(-8, 1, var3);
                }
                if (this.field3640[var3] == -1) {
                    this.method1487(-96, 2, var3);
                }
                if (this.field3640[var3] == 1) {
                    var2.method961((byte) 78);
                }
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "(I)V", line = 697)
    public final void method1494(int arg0) {
        field3650++;
        if (arg0 != 0) {
            this.method1188((byte) 116);
        }
        if (this.field3634 != null) {
            this.field3658 = true;
            if (this.field3657 == null) {
                this.field3657 = new class277();
            }
        }
    }

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(ILph;Lph;Lqg;Lde;IIZ)V", line = 793)
    public class208(int arg0, class282 arg1, class282 arg2, class196 arg3, class226 arg4, int arg5, int arg6, boolean arg7) {
        this.field3634 = arg1;
        this.field3627 = arg0;
        if (this.field3634 == null) {
            this.field3656 = false;
        } else {
            this.field3656 = true;
            this.field3657 = new class277();
        }
        this.field3652 = arg3;
        this.field3637 = arg4;
        this.field3635 = arg5;
        this.field3653 = arg2;
        this.field3662 = arg7;
        this.field3625 = arg6;
        if (this.field3653 != null) {
            this.field3647 = this.field3637.method1610(this.field3627, 84, this.field3653);
        }
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(BI)V", line = 736)
    public final void method1193(byte arg0, int arg1) {
        field3629++;
        if (arg0 != 3) {
            this.method1190(22, false);
        }
        if (this.field3634 == null) {
            return;
        }
        for (class141 var3 = this.field3660.method1936(16173); var3 != null; var3 = this.field3660.method1926((byte) 90)) {
            if (((long) arg1) == var3.field2418) {
                return;
            }
        }
        class141 var4 = new class141();
        var4.field2418 = (long) arg1;
        this.field3660.method1940((byte) -96, var4);
    }
}
