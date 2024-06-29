import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class528 extends class334 {

    @OriginalMember(owner = "client!kr", name = "m", descriptor = "I")
    private int field7695 = 0;

    @OriginalMember(owner = "client!kr", name = "k", descriptor = "Lgu;")
    private class412 field7693 = new class412(16);

    @OriginalMember(owner = "client!kr", name = "L", descriptor = "I")
    private int field7719 = 0;

    @OriginalMember(owner = "client!kr", name = "N", descriptor = "Loe;")
    private class137 field7721 = new class137();

    @OriginalMember(owner = "client!kr", name = "Q", descriptor = "J")
    private long field7724 = 0L;

    @OriginalMember(owner = "client!kr", name = "q", descriptor = "I")
    private int field7699;

    @OriginalMember(owner = "client!kr", name = "F", descriptor = "Leo;")
    private class196 field7713;

    @OriginalMember(owner = "client!kr", name = "K", descriptor = "Z")
    private boolean field7718;

    @OriginalMember(owner = "client!kr", name = "M", descriptor = "Loe;")
    private class137 field7720;

    @OriginalMember(owner = "client!kr", name = "n", descriptor = "Leo;")
    private class196 field7696;

    @OriginalMember(owner = "client!kr", name = "D", descriptor = "Lpr;")
    private class313 field7711;

    @OriginalMember(owner = "client!kr", name = "u", descriptor = "I")
    private int field7703;

    @OriginalMember(owner = "client!kr", name = "H", descriptor = "Ltj;")
    private class135 field7715;

    @OriginalMember(owner = "client!kr", name = "P", descriptor = "Z")
    private boolean field7723;

    @OriginalMember(owner = "client!kr", name = "p", descriptor = "I")
    private int field7698;

    @OriginalMember(owner = "client!kr", name = "w", descriptor = "Lku;")
    private class257 field7705;

    @OriginalMember(owner = "client!kr", name = "o", descriptor = "S")
    public static short field7697 = 256;

    @OriginalMember(owner = "client!kr", name = "l", descriptor = "I")
    public static int field7694;

    @OriginalMember(owner = "client!kr", name = "r", descriptor = "I")
    public static int field7700;

    @OriginalMember(owner = "client!kr", name = "t", descriptor = "I")
    public static int field7702;

    @OriginalMember(owner = "client!kr", name = "v", descriptor = "I")
    public static int field7704;

    @OriginalMember(owner = "client!kr", name = "x", descriptor = "I")
    public static int field7706;

    @OriginalMember(owner = "client!kr", name = "y", descriptor = "I")
    public static int field7707;

    @OriginalMember(owner = "client!kr", name = "z", descriptor = "I")
    public static int field7708;

    @OriginalMember(owner = "client!kr", name = "A", descriptor = "I")
    public static int field7709;

    @OriginalMember(owner = "client!kr", name = "C", descriptor = "I")
    public static int field7710;

    @OriginalMember(owner = "client!kr", name = "E", descriptor = "I")
    public static int field7712;

    @OriginalMember(owner = "client!kr", name = "G", descriptor = "I")
    public static int field7714;

    @OriginalMember(owner = "client!kr", name = "I", descriptor = "I")
    public static int field7716;

    @OriginalMember(owner = "client!kr", name = "s", descriptor = "Ll;")
    public static class16 field7701;

    @OriginalMember(owner = "client!kr", name = "j", descriptor = "Lhd;")
    private class524 field7692;

    @OriginalMember(owner = "client!kr", name = "O", descriptor = "Z")
    private boolean field7722;

    @OriginalMember(owner = "client!kr", name = "J", descriptor = "[B")
    private byte[] field7717;

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(Z)V", line = 6)
    public static final void method3119(boolean arg0) {
        if (arg0) {
            client.field3311 = class75.field1076;
            class491.field7059 = class290.field4367;
        } else {
            client.field3311 = class258.field3939;
            class491.field7059 = class289.field4358;
        }
        class213.field3467 = client.field3311.length;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(II)[B", line = 25)
    public final byte[] method2113(int arg0, int arg1) {
        field7702++;
        class257 var3 = this.method3127(arg0, (byte) -84, 0);
        if (var3 == null) {
            return null;
        } else if (arg1 <= 30) {
            return null;
        } else {
            byte[] var4 = var3.method1718(true);
            var3.method2677(-22491);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIII)Z", line = 50)
    public static final boolean method3120(int arg0, int arg1, int arg2, int arg3) {
        if (!class274.method1804(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << class163.field2415;
        int var5 = arg2 << class163.field2415;
        int var6 = class491.field7059[arg0].method411(arg1, arg2) - 1;
        int var7 = var6 - (0x78 << class163.field2415 - 7);
        int var8 = var6 - (0xE6 << class163.field2415 - 7);
        int var9 = var6 - (0xEE << class163.field2415 - 7);
        if (arg3 == 1) {
            if (var4 > class62.field761) {
                if (!class52.method497(var4, var6, var5)) {
                    return false;
                }
                if (!class52.method497(var4, var6, class5.field63 + var5)) {
                    return false;
                }
                if (!class52.method497(var4, var6, class450.field6574 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class52.method497(var4, var7, var5)) {
                    return false;
                }
                if (!class52.method497(var4, var7, class5.field63 + var5)) {
                    return false;
                }
                if (!class52.method497(var4, var7, class450.field6574 + var5)) {
                    return false;
                }
            }
            if (!class52.method497(var4, var8, var5)) {
                return false;
            } else if (class52.method497(var4, var8, class5.field63 + var5)) {
                return class52.method497(var4, var8, class450.field6574 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 2) {
            if (var5 < class529.field7735) {
                if (!class52.method497(var4, var6, class450.field6574 + var5)) {
                    return false;
                }
                if (!class52.method497(class5.field63 + var4, var6, class450.field6574 + var5)) {
                    return false;
                }
                if (!class52.method497(class450.field6574 + var4, var6, class450.field6574 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class52.method497(var4, var7, class450.field6574 + var5)) {
                    return false;
                }
                if (!class52.method497(class5.field63 + var4, var7, class450.field6574 + var5)) {
                    return false;
                }
                if (!class52.method497(class450.field6574 + var4, var7, class450.field6574 + var5)) {
                    return false;
                }
            }
            if (!class52.method497(var4, var8, class450.field6574 + var5)) {
                return false;
            } else if (class52.method497(class5.field63 + var4, var8, class450.field6574 + var5)) {
                return class52.method497(class450.field6574 + var4, var8, class450.field6574 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 4) {
            if (var4 < class62.field761) {
                if (!class52.method497(class450.field6574 + var4, var6, var5)) {
                    return false;
                }
                if (!class52.method497(class450.field6574 + var4, var6, class5.field63 + var5)) {
                    return false;
                }
                if (!class52.method497(class450.field6574 + var4, var6, class450.field6574 + var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class52.method497(class450.field6574 + var4, var7, var5)) {
                    return false;
                }
                if (!class52.method497(class450.field6574 + var4, var7, class5.field63 + var5)) {
                    return false;
                }
                if (!class52.method497(class450.field6574 + var4, var7, class450.field6574 + var5)) {
                    return false;
                }
            }
            if (!class52.method497(class450.field6574 + var4, var8, var5)) {
                return false;
            } else if (class52.method497(class450.field6574 + var4, var8, class5.field63 + var5)) {
                return class52.method497(class450.field6574 + var4, var8, class450.field6574 + var5);
            } else {
                return false;
            }
        } else if (arg3 == 8) {
            if (var5 > class529.field7735) {
                if (!class52.method497(var4, var6, var5)) {
                    return false;
                }
                if (!class52.method497(class5.field63 + var4, var6, var5)) {
                    return false;
                }
                if (!class52.method497(class450.field6574 + var4, var6, var5)) {
                    return false;
                }
            }
            if (arg0 > 0) {
                if (!class52.method497(var4, var7, var5)) {
                    return false;
                }
                if (!class52.method497(class5.field63 + var4, var7, var5)) {
                    return false;
                }
                if (!class52.method497(class450.field6574 + var4, var7, var5)) {
                    return false;
                }
            }
            if (!class52.method497(var4, var8, var5)) {
                return false;
            } else if (class52.method497(class5.field63 + var4, var8, var5)) {
                return class52.method497(class450.field6574 + var4, var8, var5);
            } else {
                return false;
            }
        } else if (!class52.method497(class5.field63 + var4, var9, class5.field63 + var5)) {
            return false;
        } else if (arg3 == 16) {
            return class52.method497(var4, var8, class450.field6574 + var5);
        } else if (arg3 == 32) {
            return class52.method497(class450.field6574 + var4, var8, class450.field6574 + var5);
        } else if (arg3 == 64) {
            return class52.method497(class450.field6574 + var4, var8, var5);
        } else if (arg3 == 128) {
            return class52.method497(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(I)V", line = 271)
    public final void method3121(int arg0) {
        field7712++;
        if (this.field7713 == null) {
            return;
        }
        this.field7722 = true;
        if (this.field7720 == null) {
            this.field7720 = new class137();
        }
        if (arg0 != 100) {
            method3120(-48, -59, 113, 5);
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(B)V", line = 293)
    public final void method3122(byte arg0) {
        field7707++;
        if (arg0 != 113) {
            return;
        }
        if (this.field7720 != null) {
            if (this.method2109((byte) -15) == null) {
                return;
            }
            if (this.field7718) {
                boolean var2 = true;
                for (class431 var3 = this.field7720.method1004((byte) -106); var3 != null; var3 = this.field7720.method996(1)) {
                    int var5 = (int) var3.field6388;
                    if (this.field7717[var5] == 0) {
                        this.method3127(var5, (byte) -84, 1);
                    }
                    if (this.field7717[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2677(-22491);
                    }
                }
                while (this.field7692.field7671.length > this.field7719) {
                    if (this.field7692.field7671[this.field7719] == 0) {
                        this.field7719++;
                    } else {
                        if (this.field7715.field2070 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field7717[this.field7719] == 0) {
                            this.method3127(this.field7719, (byte) -84, 1);
                        }
                        if (this.field7717[this.field7719] == 0) {
                            class431 var4 = new class431();
                            var4.field6388 = this.field7719;
                            this.field7720.method994(var4, arg0 - 3723);
                            var2 = false;
                        }
                        this.field7719++;
                    }
                }
                if (var2) {
                    this.field7718 = false;
                    this.field7719 = 0;
                }
            } else if (this.field7722) {
                boolean var6 = true;
                for (class431 var7 = this.field7720.method1004((byte) -108); var7 != null; var7 = this.field7720.method996(arg0 ^ 0x70)) {
                    int var9 = (int) var7.field6388;
                    if (this.field7717[var9] != 1) {
                        this.method3127(var9, (byte) -84, 2);
                    }
                    if (this.field7717[var9] == 1) {
                        var7.method2677(-22491);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field7719 < this.field7692.field7671.length) {
                    if (this.field7692.field7671[this.field7719] == 0) {
                        this.field7719++;
                    } else {
                        if (this.field7711.method2000(0)) {
                            var6 = false;
                            break;
                        }
                        if (this.field7717[this.field7719] != 1) {
                            this.method3127(this.field7719, (byte) -84, 2);
                        }
                        if (this.field7717[this.field7719] != 1) {
                            class431 var8 = new class431();
                            var8.field6388 = this.field7719;
                            var6 = false;
                            this.field7720.method994(var8, -3610);
                        }
                        this.field7719++;
                    }
                }
                if (var6) {
                    this.field7719 = 0;
                    this.field7722 = false;
                }
            } else {
                this.field7720 = null;
            }
        }
        if (!this.field7723 || class493.method2937(arg0 ^ 0xFFFFFFDA) < this.field7724) {
            return;
        }
        for (class257 var10 = (class257) this.field7693.method2592(121); var10 != null; var10 = (class257) this.field7693.method2589(-1)) {
            if (!var10.field3927) {
                if (var10.field3925) {
                    if (!var10.field3926) {
                        throw new RuntimeException();
                    }
                    var10.method2677(-22491);
                } else {
                    var10.field3925 = true;
                }
            }
        }
        this.field7724 = class493.method2937(-114) + 1000L;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(BI)V", line = 472)
    public final void method2110(byte arg0, int arg1) {
        field7700++;
        if (this.field7713 == null) {
            return;
        }
        if (arg0 != -89) {
            this.method3125(false);
        }
        for (class431 var3 = this.field7721.method1004((byte) -75); var3 != null; var3 = this.field7721.method996(1)) {
            if ((long) arg1 == var3.field6388) {
                return;
            }
        }
        class431 var4 = new class431();
        var4.field6388 = arg1;
        this.field7721.method994(var4, -3610);
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(I)V", line = 501)
    public static void method3123(int arg0) {
        field7701 = null;
        if (arg0 <= 9) {
            field7697 = 124;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)Lhd;", line = 511)
    public final class524 method2109(byte arg0) {
        if (arg0 != -15) {
            method3120(-80, 122, 118, 98);
        }
        field7706++;
        if (this.field7692 != null) {
            return this.field7692;
        }
        if (this.field7705 == null) {
            if (this.field7711.method2005(0)) {
                return null;
            }
            this.field7705 = this.field7711.method2006(255, (byte) 0, true, this.field7699, (byte) 0);
        }
        if (this.field7705.field3927) {
            return null;
        }
        byte[] var2 = this.field7705.method1718(true);
        if (this.field7705 instanceof class304) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field7692 = new class524(var2, this.field7698);
                if (this.field7692.field7665 != this.field7703) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field7692 = null;
                if (this.field7711.method2005(0)) {
                    this.field7705 = null;
                } else {
                    this.field7705 = this.field7711.method2006(255, (byte) 0, true, this.field7699, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field7692 = new class524(var2, this.field7698);
            } catch (RuntimeException var4) {
                this.field7711.method2002(10914);
                this.field7692 = null;
                if (this.field7711.method2005(0)) {
                    this.field7705 = null;
                } else {
                    this.field7705 = this.field7711.method2006(255, (byte) 0, true, this.field7699, (byte) 0);
                }
                return null;
            }
            if (this.field7696 != null) {
                this.field7715.method986(var2, this.field7696, this.field7699, false);
            }
        }
        this.field7705 = null;
        if (this.field7713 != null) {
            this.field7717 = new byte[this.field7692.field7659];
            this.field7695 = 0;
        }
        return this.field7692;
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(B)V", line = 609)
    public final void method3124(byte arg0) {
        if (arg0 >= -18) {
            return;
        }
        field7694++;
        if (this.field7720 == null || this.method2109((byte) -15) == null) {
            return;
        }
        for (class431 var2 = this.field7721.method1004((byte) -119); var2 != null; var2 = this.field7721.method996(1)) {
            int var3 = (int) var2.field6388;
            if (var3 < 0 || this.field7692.field7659 <= var3 || this.field7692.field7671[var3] == 0) {
                var2.method2677(-22491);
            } else {
                if (this.field7717[var3] == 0) {
                    this.method3127(var3, (byte) -84, 1);
                }
                if (this.field7717[var3] == -1) {
                    this.method3127(var3, (byte) -84, 2);
                }
                if (this.field7717[var3] == 1) {
                    var2.method2677(-22491);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "(Z)I", line = 654)
    public final int method3125(boolean arg0) {
        field7708++;
        if (!arg0) {
            return 80;
        } else if (this.method2109((byte) -15) == null) {
            return this.field7705 == null ? 0 : this.field7705.method1717((byte) -105);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(I)I", line = 678)
    public final int method3126(int arg0) {
        field7704++;
        if (arg0 <= 122) {
            this.field7715 = null;
        }
        return this.field7695;
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IBI)Lku;", line = 698)
    private final class257 method3127(int arg0, byte arg1, int arg2) {
        field7709++;
        class257 var4 = (class257) this.field7693.method2585((byte) 114, (long) arg0);
        if (arg1 != -84) {
            method3120(45, 62, -69, -102);
        }
        if (var4 != null && arg2 == 0 && !var4.field3926 && var4.field3927) {
            var4.method2677(-22491);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field7713 == null || this.field7717[arg0] == -1) {
                    if (this.field7711.method2005(arg1 ^ 0xFFFFFFAC)) {
                        return null;
                    }
                    var4 = this.field7711.method2006(this.field7699, (byte) 2, true, arg0, (byte) 0);
                } else {
                    var4 = this.field7715.method983(this.field7713, (byte) -113, arg0);
                }
            } else if (arg2 == 1) {
                if (this.field7713 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field7715.method989(arg0, this.field7713, (byte) 102);
            } else if (arg2 == 2) {
                if (this.field7713 == null) {
                    throw new RuntimeException();
                }
                if (this.field7717[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field7711.method2000(0)) {
                    return null;
                }
                var4 = this.field7711.method2006(this.field7699, (byte) 2, false, arg0, (byte) 0);
            } else {
                throw new RuntimeException();
            }
            this.field7693.method2591((long) arg0, var4, (byte) -105);
        }
        if (var4.field3927) {
            return null;
        }
        byte[] var5 = var4.method1718(true);
        if (!var4 instanceof class304) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class314.field4742.reset();
                class314.field4742.update(var5, 0, var5.length - 2);
                int var6 = (int) class314.field4742.getValue();
                if (this.field7692.field7669[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field7711.field4732 = 0;
                this.field7711.field4730 = 0;
            } catch (RuntimeException var12) {
                this.field7711.method2002(10914);
                var4.method2677(-22491);
                if (var4.field3926 && !this.field7711.method2005(0)) {
                    class270 var7 = this.field7711.method2006(this.field7699, (byte) 2, true, arg0, (byte) 0);
                    this.field7693.method2591((long) arg0, var7, (byte) -108);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field7692.field7673[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field7692.field7673[arg0];
            if (this.field7713 != null) {
                this.field7715.method986(var5, this.field7713, arg0, false);
                if (this.field7717[arg0] != 1) {
                    this.field7695++;
                    this.field7717[arg0] = 1;
                }
            }
            if (!var4.field3926) {
                var4.method2677(-22491);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class314.field4742.reset();
            class314.field4742.update(var5, 0, var5.length - 2);
            int var8 = (int) class314.field4742.getValue();
            if (this.field7692.field7669[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field7692.field7673[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field7717[arg0] != 1) {
                this.field7695++;
                this.field7717[arg0] = 1;
            }
            if (!var4.field3926) {
                var4.method2677(-22491);
            }
            return var4;
        } catch (Exception var11) {
            this.field7717[arg0] = -1;
            var4.method2677(-22491);
            if (var4.field3926 && !this.field7711.method2005(arg1 + 84)) {
                class270 var10 = this.field7711.method2006(this.field7699, (byte) 2, true, arg0, (byte) 0);
                this.field7693.method2591((long) arg0, var10, (byte) -112);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "(II)I", line = 911)
    public final int method2115(int arg0, int arg1) {
        field7716++;
        if (arg0 == 2) {
            class257 var3 = (class257) this.field7693.method2585((byte) 114, (long) arg1);
            return var3 == null ? 0 : var3.method1717((byte) -105);
        } else {
            return 50;
        }
    }

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "(I)I", line = 928)
    public final int method3128(int arg0) {
        int var2 = 31 % ((-arg0 - 29) / 56);
        field7710++;
        if (this.field7692 == null) {
            return 0;
        } else if (this.field7718) {
            class431 var3 = this.field7720.method1004((byte) -111);
            return var3 == null ? 0 : (int) var3.field6388;
        } else {
            return this.field7692.field7662;
        }
    }

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "(B)I", line = 949)
    public final int method3129(byte arg0) {
        if (arg0 == 25) {
            field7714++;
            return this.field7692 == null ? 0 : this.field7692.field7662;
        } else {
            return 99;
        }
    }

    @OriginalMember(owner = "client!kr", name = "<init>", descriptor = "(ILeo;Leo;Lpr;Ltj;IIZ)V", line = 986)
    public class528(int arg0, class196 arg1, class196 arg2, class313 arg3, class135 arg4, int arg5, int arg6, boolean arg7) {
        this.field7699 = arg0;
        this.field7713 = arg1;
        if (this.field7713 == null) {
            this.field7718 = false;
        } else {
            this.field7718 = true;
            this.field7720 = new class137();
        }
        this.field7696 = arg2;
        this.field7711 = arg3;
        this.field7703 = arg6;
        this.field7715 = arg4;
        this.field7723 = arg7;
        this.field7698 = arg5;
        if (this.field7696 != null) {
            this.field7705 = this.field7715.method983(this.field7696, (byte) -113, this.field7699);
        }
    }
}
