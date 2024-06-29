import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pe")
public class class262 extends class76 {

    @OriginalMember(owner = "client!pe", name = "z", descriptor = "I")
    private int field4148 = 0;

    @OriginalMember(owner = "client!pe", name = "A", descriptor = "Lpf;")
    private class305 field4149 = new class305(16);

    @OriginalMember(owner = "client!pe", name = "K", descriptor = "I")
    private int field4159 = 0;

    @OriginalMember(owner = "client!pe", name = "M", descriptor = "Lud;")
    private class2 field4161 = new class2();

    @OriginalMember(owner = "client!pe", name = "P", descriptor = "J")
    private long field4164 = 0L;

    @OriginalMember(owner = "client!pe", name = "s", descriptor = "Lkb;")
    private class54 field4141;

    @OriginalMember(owner = "client!pe", name = "r", descriptor = "I")
    private int field4140;

    @OriginalMember(owner = "client!pe", name = "J", descriptor = "Z")
    private boolean field4158;

    @OriginalMember(owner = "client!pe", name = "N", descriptor = "Lud;")
    private class2 field4162;

    @OriginalMember(owner = "client!pe", name = "I", descriptor = "Lke;")
    private class112 field4157;

    @OriginalMember(owner = "client!pe", name = "v", descriptor = "Lkb;")
    private class54 field4144;

    @OriginalMember(owner = "client!pe", name = "O", descriptor = "Z")
    private boolean field4163;

    @OriginalMember(owner = "client!pe", name = "q", descriptor = "I")
    private int field4139;

    @OriginalMember(owner = "client!pe", name = "i", descriptor = "I")
    private int field4131;

    @OriginalMember(owner = "client!pe", name = "j", descriptor = "Lok;")
    private class41 field4132;

    @OriginalMember(owner = "client!pe", name = "x", descriptor = "Llk;")
    private class85 field4146;

    @OriginalMember(owner = "client!pe", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4134 = "Loading wordpack - ";

    @OriginalMember(owner = "client!pe", name = "p", descriptor = "Ljava/lang/String;")
    public static String field4138 = "skill: ";

    @OriginalMember(owner = "client!pe", name = "D", descriptor = "Lud;")
    public static class2 field4152 = new class2();

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!pe", name = "g", descriptor = "I")
    public static int field4129;

    @OriginalMember(owner = "client!pe", name = "h", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!pe", name = "k", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!pe", name = "m", descriptor = "I")
    public static int field4135;

    @OriginalMember(owner = "client!pe", name = "n", descriptor = "I")
    public static int field4136;

    @OriginalMember(owner = "client!pe", name = "t", descriptor = "I")
    public static int field4142;

    @OriginalMember(owner = "client!pe", name = "u", descriptor = "I")
    public static int field4143;

    @OriginalMember(owner = "client!pe", name = "w", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!pe", name = "C", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!pe", name = "F", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!pe", name = "G", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!pe", name = "H", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!pe", name = "B", descriptor = "J")
    public static long field4150;

    @OriginalMember(owner = "client!pe", name = "o", descriptor = "Lsb;")
    private class239 field4137;

    @OriginalMember(owner = "client!pe", name = "L", descriptor = "Z")
    private boolean field4160;

    @OriginalMember(owner = "client!pe", name = "E", descriptor = "[B")
    private byte[] field4153;

    @OriginalMember(owner = "client!pe", name = "y", descriptor = "[Z")
    public static boolean[] field4147;

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(I)V")
    public static void method1752(int arg0) {
        if (arg0 != -7869) {
            field4152 = null;
        }
        field4147 = null;
        field4138 = null;
        field4152 = null;
        field4134 = null;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(ZI)V")
    public final void method599(boolean arg0, int arg1) {
        field4143++;
        if (this.field4141 == null) {
            return;
        }
        for (class134 var3 = this.field4161.method6(-111); var3 != null; var3 = this.field4161.method11((byte) 71)) {
            if (((long) arg1) == var3.field2009) {
                return;
            }
        }
        if (arg0) {
            this.method1759(-94);
        }
        class134 var4 = new class134();
        var4.field2009 = (long) arg1;
        this.field4161.method12(var4, 12);
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(B)I")
    public final int method1753(byte arg0) {
        field4136++;
        if (this.field4137 == null) {
            return 0;
        } else if (this.field4158) {
            class134 var2 = this.field4162.method6(-108);
            if (arg0 >= -23) {
                this.field4161 = null;
            }
            return var2 == null ? 0 : (int) var2.field2009;
        } else {
            return this.field4137.field3767;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(I)Lsb;")
    public final class239 method595(int arg0) {
        field4133++;
        if (this.field4137 != null) {
            return this.field4137;
        }
        if (this.field4146 == null) {
            if (this.field4157.method836(-125)) {
                return null;
            }
            this.field4146 = this.field4157.method823(this.field4140, true, false, 255, (byte) 0);
        }
        if (this.field4146.field1264) {
            return null;
        }
        byte[] var2 = this.field4146.method249(256);
        if (this.field4146 instanceof class30) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4137 = new class239(var2, this.field4139);
                if (this.field4137.field3763 != this.field4131) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var4) {
                this.field4137 = null;
                if (this.field4157.method836(-104)) {
                    this.field4146 = null;
                } else {
                    this.field4146 = this.field4157.method823(this.field4140, true, false, 255, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field4137 = new class239(var2, this.field4139);
            } catch (RuntimeException var5) {
                this.field4157.method838(0);
                this.field4137 = null;
                if (this.field4157.method836(-85)) {
                    this.field4146 = null;
                } else {
                    this.field4146 = this.field4157.method823(this.field4140, true, false, 255, (byte) 0);
                }
                return null;
            }
            if (this.field4144 != null) {
                this.field4132.method361(this.field4144, -123, this.field4140, var2);
            }
        }
        if (this.field4141 != null) {
            this.field4153 = new byte[this.field4137.field3778];
            this.field4148 = 0;
        }
        this.field4146 = null;
        int var3 = -13 % ((-arg0 - 8) / 38);
        return this.field4137;
    }

    @OriginalMember(owner = "client!pe", name = "b", descriptor = "(ZI)[B")
    public final byte[] method600(boolean arg0, int arg1) {
        field4128++;
        class85 var3 = this.method1758((byte) -1, 0, arg1);
        if (var3 == null) {
            return null;
        } else if (arg0) {
            return null;
        } else {
            byte[] var4 = var3.method249(256);
            var3.method995((byte) -118);
            return var4;
        }
    }

    @OriginalMember(owner = "client!pe", name = "c", descriptor = "(I)I")
    public final int method1754(int arg0) {
        field4154++;
        return arg0 == -26902 ? this.field4148 : 121;
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(B)V")
    public final void method1755(byte arg0) {
        field4129++;
        if (this.field4162 != null) {
            if (this.method595(-83) == null) {
                return;
            }
            if (this.field4158) {
                boolean var2 = true;
                for (class134 var3 = this.field4162.method6(-108); var3 != null; var3 = this.field4162.method11((byte) 53)) {
                    int var5 = (int) var3.field2009;
                    if (this.field4153[var5] == 0) {
                        this.method1758((byte) -1, 1, var5);
                    }
                    if (this.field4153[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method995((byte) -117);
                    }
                }
                while (this.field4159 < this.field4137.field3765.length) {
                    if (this.field4137.field3765[this.field4159] == 0) {
                        this.field4159++;
                    } else {
                        if (this.field4132.field693 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field4153[this.field4159] == 0) {
                            this.method1758((byte) -1, 1, this.field4159);
                        }
                        if (this.field4153[this.field4159] == 0) {
                            var2 = false;
                            class134 var4 = new class134();
                            var4.field2009 = (long) this.field4159;
                            this.field4162.method12(var4, 12);
                        }
                        this.field4159++;
                    }
                }
                if (var2) {
                    this.field4159 = 0;
                    this.field4158 = false;
                }
            } else if (this.field4160) {
                boolean var6 = true;
                for (class134 var7 = this.field4162.method6(-121); var7 != null; var7 = this.field4162.method11((byte) 67)) {
                    int var9 = (int) var7.field2009;
                    if (this.field4153[var9] != 1) {
                        this.method1758((byte) -1, 2, var9);
                    }
                    if (this.field4153[var9] == 1) {
                        var7.method995((byte) -107);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field4137.field3765.length > this.field4159) {
                    if (this.field4137.field3765[this.field4159] == 0) {
                        this.field4159++;
                    } else {
                        if (this.field4157.method825(20)) {
                            var6 = false;
                            break;
                        }
                        if (this.field4153[this.field4159] != 1) {
                            this.method1758((byte) -1, 2, this.field4159);
                        }
                        if (this.field4153[this.field4159] != 1) {
                            var6 = false;
                            class134 var8 = new class134();
                            var8.field2009 = (long) this.field4159;
                            this.field4162.method12(var8, 12);
                        }
                        this.field4159++;
                    }
                }
                if (var6) {
                    this.field4159 = 0;
                    this.field4160 = false;
                }
            } else {
                this.field4162 = null;
            }
        }
        if (arg0 != -81) {
            this.method1758((byte) 102, -103, 91);
        }
        if (!this.field4163 || this.field4164 > class242.method1650(arg0 + 175)) {
            return;
        }
        for (class85 var10 = (class85) this.field4149.method2049(0); var10 != null; var10 = (class85) this.field4149.method2047(arg0 ^ 0x28)) {
            if (!var10.field1264) {
                if (var10.field1273) {
                    if (!var10.field1266) {
                        throw new RuntimeException();
                    }
                    var10.method995((byte) -14);
                } else {
                    var10.field1273 = true;
                }
            }
        }
        this.field4164 = class242.method1650(arg0 + 107) + 1000L;
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(II)I")
    public final int method597(int arg0, int arg1) {
        if (arg1 != 0) {
            field4134 = null;
        }
        class85 var3 = (class85) this.field4149.method2043((long) arg0, -1);
        field4155++;
        return var3 == null ? 0 : var3.method253(-12);
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(B)I")
    public final int method1756(byte arg0) {
        field4145++;
        if (arg0 != 126) {
            this.field4160 = false;
        }
        if (this.method595(arg0 - 2) == null) {
            return this.field4146 == null ? 0 : this.field4146.method253(-12);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!pe", name = "d", descriptor = "(I)I")
    public final int method1757(int arg0) {
        field4151++;
        if (this.field4137 == null) {
            return 0;
        } else if (arg0 <= 84) {
            return -52;
        } else {
            return this.field4137.field3767;
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(BII)Llk;")
    private final class85 method1758(byte arg0, int arg1, int arg2) {
        field4130++;
        class85 var4 = (class85) this.field4149.method2043((long) arg2, arg0);
        if (arg0 != -1) {
            this.method597(-76, -120);
        }
        if (var4 != null && arg1 == 0 && !var4.field1266 && var4.field1264) {
            var4.method995((byte) 121);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field4141 == null || this.field4153[arg2] == -1) {
                    if (this.field4157.method836(-126)) {
                        return null;
                    }
                    var4 = this.field4157.method823(arg2, true, false, this.field4140, (byte) 2);
                } else {
                    var4 = this.field4132.method357(arg2, (byte) -111, this.field4141);
                }
            } else if (arg1 == 1) {
                if (this.field4141 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4132.method364(this.field4141, arg2, 124);
            } else if (arg1 == 2) {
                if (this.field4141 == null) {
                    throw new RuntimeException();
                }
                if (this.field4153[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4157.method825(20)) {
                    return null;
                }
                var4 = this.field4157.method823(arg2, false, false, this.field4140, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field4149.method2046(var4, -49, (long) arg2);
        }
        if (var4.field1264) {
            return null;
        }
        byte[] var5 = var4.method249(256);
        if (!var4 instanceof class30) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class195.field3055.reset();
                class195.field3055.update(var5, 0, var5.length - 2);
                int var9 = (int) class195.field3055.getValue();
                if (this.field4137.field3779[arg2] != var9) {
                    throw new RuntimeException();
                }
                this.field4157.field1743 = 0;
                this.field4157.field1744 = 0;
            } catch (RuntimeException var12) {
                this.field4157.method838(0);
                var4.method995((byte) -126);
                if (var4.field1266 && !this.field4157.method836(arg0 ^ 0x77)) {
                    class232 var10 = this.field4157.method823(arg2, true, false, this.field4140, (byte) 2);
                    this.field4149.method2046(var10, -37, (long) arg2);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4137.field3768[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field4137.field3768[arg2];
            if (this.field4141 != null) {
                this.field4132.method361(this.field4141, -115, arg2, var5);
                if (this.field4153[arg2] != 1) {
                    this.field4148++;
                    this.field4153[arg2] = 1;
                }
            }
            if (!var4.field1266) {
                var4.method995((byte) -127);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class195.field3055.reset();
            class195.field3055.update(var5, 0, var5.length - 2);
            int var6 = (int) class195.field3055.getValue();
            if (this.field4137.field3779[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4137.field3768[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field4153[arg2] != 1) {
                this.field4148++;
                this.field4153[arg2] = 1;
            }
            if (!var4.field1266) {
                var4.method995((byte) 27);
            }
            return var4;
        } catch (Exception var11) {
            this.field4153[arg2] = -1;
            var4.method995((byte) -103);
            if (var4.field1266 && !this.field4157.method836(-84)) {
                class232 var8 = this.field4157.method823(arg2, true, false, this.field4140, (byte) 2);
                this.field4149.method2046(var8, -53, (long) arg2);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "e", descriptor = "(I)V")
    public final void method1759(int arg0) {
        field4135++;
        if (this.field4162 == null || this.method595(123) == null) {
            return;
        }
        for (class134 var2 = this.field4161.method6(-124); var2 != null; var2 = this.field4161.method11((byte) 87)) {
            int var3 = (int) var2.field2009;
            if (var3 < 0 || this.field4137.field3778 <= var3 || this.field4137.field3765[var3] == 0) {
                var2.method995((byte) -116);
            } else {
                if (this.field4153[var3] == 0) {
                    this.method1758((byte) -1, 1, var3);
                }
                if (this.field4153[var3] == -1) {
                    this.method1758((byte) -1, 2, var3);
                }
                if (this.field4153[var3] == 1) {
                    var2.method995((byte) -111);
                }
            }
        }
        if (arg0 > -75) {
            this.field4141 = null;
        }
    }

    @OriginalMember(owner = "client!pe", name = "f", descriptor = "(I)V")
    public final void method1760(int arg0) {
        if (arg0 <= 64) {
            this.method1757(81);
        }
        field4142++;
        if (this.field4141 != null) {
            this.field4160 = true;
            if (this.field4162 == null) {
                this.field4162 = new class2();
            }
        }
    }

    @OriginalMember(owner = "client!pe", name = "a", descriptor = "(III)I")
    public static final int method1761(int arg0, int arg1, int arg2) {
        field4156++;
        int var3 = class53.method450(arg1 + 45365, arg2 ^ 0x47, 4, arg0 + 91923) - (128 - ((class53.method450(arg1 + 10294, -126, 2, arg0 + 37821) - 128 >> 1) + (class53.method450(arg1, 57, 1, arg0) - 128 >> 2)));
        int var4 = (int) ((double) var3 * 0.3D) + arg2;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pe", name = "<init>", descriptor = "(ILkb;Lkb;Lke;Lok;IIZ)V")
    public class262(int arg0, class54 arg1, class54 arg2, class112 arg3, class41 arg4, int arg5, int arg6, boolean arg7) {
        this.field4141 = arg1;
        this.field4140 = arg0;
        if (this.field4141 == null) {
            this.field4158 = false;
        } else {
            this.field4158 = true;
            this.field4162 = new class2();
        }
        this.field4157 = arg3;
        this.field4144 = arg2;
        this.field4163 = arg7;
        this.field4139 = arg5;
        this.field4131 = arg6;
        this.field4132 = arg4;
        if (this.field4144 != null) {
            this.field4146 = this.field4132.method357(this.field4140, (byte) -111, this.field4144);
        }
    }
}
