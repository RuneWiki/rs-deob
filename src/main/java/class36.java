import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class36 extends class270 {

    @OriginalMember(owner = "client!wd", name = "v", descriptor = "I")
    private int field358 = 0;

    @OriginalMember(owner = "client!wd", name = "u", descriptor = "Luc;")
    private class58 field357 = new class58(16);

    @OriginalMember(owner = "client!wd", name = "W", descriptor = "I")
    private int field385 = 0;

    @OriginalMember(owner = "client!wd", name = "V", descriptor = "Lmk;")
    private class154 field384 = new class154();

    @OriginalMember(owner = "client!wd", name = "Z", descriptor = "J")
    private long field388 = 0L;

    @OriginalMember(owner = "client!wd", name = "L", descriptor = "Lqk;")
    private class334 field374;

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!wd", name = "X", descriptor = "Z")
    private boolean field386;

    @OriginalMember(owner = "client!wd", name = "U", descriptor = "Lmk;")
    private class154 field383;

    @OriginalMember(owner = "client!wd", name = "x", descriptor = "Lqk;")
    private class334 field360;

    @OriginalMember(owner = "client!wd", name = "q", descriptor = "Lud;")
    private class2 field353;

    @OriginalMember(owner = "client!wd", name = "z", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client!wd", name = "Y", descriptor = "Z")
    private boolean field387;

    @OriginalMember(owner = "client!wd", name = "S", descriptor = "I")
    private int field381;

    @OriginalMember(owner = "client!wd", name = "G", descriptor = "Lho;")
    private class359 field369;

    @OriginalMember(owner = "client!wd", name = "E", descriptor = "Lub;")
    private class132 field367;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field348 = 0;

    @OriginalMember(owner = "client!wd", name = "w", descriptor = "I")
    public static int field359 = 999999;

    @OriginalMember(owner = "client!wd", name = "p", descriptor = "[Lqs;")
    public static class438[] field352 = new class438[4];

    @OriginalMember(owner = "client!wd", name = "H", descriptor = "I")
    public static int field370 = 2;

    @OriginalMember(owner = "client!wd", name = "Q", descriptor = "I")
    public static int field379 = 0;

    @OriginalMember(owner = "client!wd", name = "P", descriptor = "I")
    public static int field378 = 0;

    @OriginalMember(owner = "client!wd", name = "M", descriptor = "I")
    public static int field375 = 10;

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!wd", name = "m", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!wd", name = "n", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!wd", name = "o", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!wd", name = "r", descriptor = "I")
    public static int field354;

    @OriginalMember(owner = "client!wd", name = "s", descriptor = "I")
    public static int field355;

    @OriginalMember(owner = "client!wd", name = "t", descriptor = "I")
    public static int field356;

    @OriginalMember(owner = "client!wd", name = "y", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!wd", name = "A", descriptor = "I")
    public static int field363;

    @OriginalMember(owner = "client!wd", name = "B", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!wd", name = "C", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!wd", name = "I", descriptor = "I")
    public static int field371;

    @OriginalMember(owner = "client!wd", name = "J", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!wd", name = "K", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "client!wd", name = "N", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!wd", name = "O", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!wd", name = "R", descriptor = "Lam;")
    public static class286 field380;

    @OriginalMember(owner = "client!wd", name = "F", descriptor = "Lvm;")
    public static class322 field368;

    @OriginalMember(owner = "client!wd", name = "D", descriptor = "Lqh;")
    private class327 field366;

    @OriginalMember(owner = "client!wd", name = "T", descriptor = "Z")
    private boolean field382;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "[B")
    private byte[] field344;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I", line = 11)
    public final int method164(int arg0, int arg1) {
        field354++;
        class132 var3 = (class132) this.field357.method308((long) arg1, (byte) -98);
        if (arg0 != 0) {
            this.field347 = -89;
        }
        return var3 == null ? 0 : var3.method335(26655);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Z)V", line = 43)
    public static void method165(boolean arg0) {
        field380 = null;
        if (!arg0) {
            method165(false);
        }
        field368 = null;
        field352 = null;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(Z)I", line = 59)
    public final int method166(boolean arg0) {
        if (arg0) {
            this.method164(-11, 52);
        }
        field361++;
        if (this.method173((byte) 0) == null) {
            return this.field367 == null ? 0 : this.field367.method335(26655);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 81)
    public final void method167(int arg0) {
        field373++;
        if (this.field383 == null || this.method173((byte) 0) == null) {
            return;
        }
        if (arg0 < 123) {
            this.method168(64);
        }
        for (class338 var2 = this.field384.method814((byte) 90); var2 != null; var2 = this.field384.method827(-2)) {
            int var3 = (int) var2.field4510;
            if (var3 < 0 || var3 >= this.field366.field4355 || this.field366.field4352[var3] == 0) {
                var2.method1967(-1);
            } else {
                if (this.field344[var3] == 0) {
                    this.method172(1, var3, true);
                }
                if (this.field344[var3] == -1) {
                    this.method172(2, var3, true);
                }
                if (this.field344[var3] == 1) {
                    var2.method1967(-1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)I", line = 124)
    public final int method168(int arg0) {
        if (arg0 != -64) {
            this.method170((byte) -110, -21);
        }
        field355++;
        return this.field358;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BJ)V", line = 136)
    public static final void method169(byte arg0, long arg1) {
        if (class98.field1161 != null) {
            if (class294.field3993 == 1 || class294.field3993 == 5) {
                class243.method1306(1, arg1);
            } else if (class294.field3993 == 2) {
                class271.method1503(-85);
            } else if (class294.field3993 == 4) {
                class242.method1300((byte) 37, arg1);
            } else {
                class289.method1710(4602);
            }
        }
        field364++;
        class452.method2806(-121, (long) class234.field3224, class88.field1003);
        if (class272.field3680 != -1) {
            class209.method1133(class272.field3680, 85);
        }
        int var3 = -32 % ((64 - arg0) / 38);
        for (int var4 = 0; var4 < class274.field3694; var4++) {
            if (class321.field4290[var4]) {
                class405.field5895[var4] = true;
            }
            class175.field2194[var4] = class321.field4290[var4];
            class321.field4290[var4] = false;
        }
        class300.field4088 = class234.field3224;
        if (class88.field1003.method1562()) {
            class1.field2 = true;
        }
        class212.field2878 = null;
        if (class272.field3680 != -1) {
            class274.field3694 = 0;
            class298.method1747(4);
        }
        class88.field1003.method1584();
        class342.method2003(-9013, class88.field1003);
        int var5 = class204.method1109(-3);
        if (var5 == -1) {
            var5 = class12.field116;
        }
        class314.method1819(var5, -95);
        class235.method1275((byte) -124, class263.field3592, class259.field3526, class427.field6264.field152, class427.field6264.field154);
        class259.field3526 = 0;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BI)[B", line = 205)
    public final byte[] method170(byte arg0, int arg1) {
        if (arg0 != -64) {
            this.method179(true);
        }
        field351++;
        class132 var3 = this.method172(0, arg1, true);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method337(-3695);
            var3.method1967(arg0 ^ 0x3F);
            return var4;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Lam;I)V", line = 226)
    public static final void method171(class286 arg0, int arg1) {
        field356++;
        class149.field1901 = arg1;
        class243.field3317 = 0;
        class299.field4074 = new class184();
        class149.field1890 = new class4[1024];
        class262.method1463(127, arg0);
        class153.method813(arg0, (byte) 5);
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIZ)Lub;", line = 239)
    private final class132 method172(int arg0, int arg1, boolean arg2) {
        field377++;
        class132 var4 = (class132) this.field357.method308((long) arg1, (byte) -102);
        if (var4 != null && arg0 == 0 && !var4.field1700 && var4.field1708) {
            var4.method1967(-1);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field374 == null || this.field344[arg1] == -1) {
                    if (this.field369.method2192(6)) {
                        return null;
                    }
                    var4 = this.field369.method2186(arg1, this.field347, true, (byte) 2, false);
                } else {
                    var4 = this.field353.method6(false, this.field374, arg1);
                }
            } else if (arg0 == 1) {
                if (this.field374 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field353.method10((byte) -122, arg1, this.field374);
            } else if (arg0 == 2) {
                if (this.field374 == null) {
                    throw new RuntimeException();
                }
                if (this.field344[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field369.method2185((byte) -5)) {
                    return null;
                }
                var4 = this.field369.method2186(arg1, this.field347, false, (byte) 2, false);
            } else {
                throw new RuntimeException();
            }
            this.field357.method314((long) arg1, var4, 7079);
        }
        if (var4.field1708) {
            return null;
        }
        if (!arg2) {
            field368 = null;
        }
        byte[] var5 = var4.method337(-3695);
        if (!var4 instanceof class84) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class143.field1832.reset();
                class143.field1832.update(var5, 0, var5.length - 2);
                int var9 = (int) class143.field1832.getValue();
                if (this.field366.field4343[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field369.field5095 = 0;
                this.field369.field5096 = 0;
            } catch (RuntimeException var12) {
                this.field369.method2199((byte) -57);
                var4.method1967(-1);
                if (var4.field1700 && !this.field369.method2192(6)) {
                    class62 var10 = this.field369.method2186(arg1, this.field347, true, (byte) 2, false);
                    this.field357.method314((long) arg1, var10, 7079);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field366.field4357[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field366.field4357[arg1];
            if (this.field374 != null) {
                this.field353.method11(arg1, var5, this.field374, true);
                if (this.field344[arg1] != 1) {
                    this.field358++;
                    this.field344[arg1] = 1;
                }
            }
            if (!var4.field1700) {
                var4.method1967(-1);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class143.field1832.reset();
            class143.field1832.update(var5, 0, var5.length - 2);
            int var6 = (int) class143.field1832.getValue();
            if (this.field366.field4343[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field366.field4357[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field344[arg1] != 1) {
                this.field358++;
                this.field344[arg1] = 1;
            }
            if (!var4.field1700) {
                var4.method1967(-1);
            }
            return var4;
        } catch (Exception var11) {
            this.field344[arg1] = -1;
            var4.method1967(-1);
            if (var4.field1700 && !this.field369.method2192(6)) {
                class62 var8 = this.field369.method2186(arg1, this.field347, true, (byte) 2, false);
                this.field357.method314((long) arg1, var8, 7079);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)Lqh;", line = 457)
    public final class327 method173(byte arg0) {
        field350++;
        if (this.field366 != null) {
            return this.field366;
        }
        if (arg0 != 0) {
            method169((byte) -2, -76L);
        }
        if (this.field367 == null) {
            if (this.field369.method2192(6)) {
                return null;
            }
            this.field367 = this.field369.method2186(this.field347, 255, true, (byte) 0, false);
        }
        if (this.field367.field1708) {
            return null;
        }
        byte[] var2 = this.field367.method337(arg0 - 3695);
        if (this.field367 instanceof class84) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field366 = new class327(var2, this.field362);
                if (this.field366.field4342 != this.field381) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field366 = null;
                if (this.field369.method2192(arg0 ^ 0x6)) {
                    this.field367 = null;
                } else {
                    this.field367 = this.field369.method2186(this.field347, 255, true, (byte) 0, false);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field366 = new class327(var2, this.field362);
            } catch (RuntimeException var4) {
                this.field369.method2199((byte) -124);
                this.field366 = null;
                if (this.field369.method2192(6)) {
                    this.field367 = null;
                } else {
                    this.field367 = this.field369.method2186(this.field347, 255, true, (byte) 0, false);
                }
                return null;
            }
            if (this.field360 != null) {
                this.field353.method11(this.field347, var2, this.field360, true);
            }
        }
        if (this.field374 != null) {
            this.field344 = new byte[this.field366.field4355];
            this.field358 = 0;
        }
        this.field367 = null;
        return this.field366;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(B)V", line = 561)
    public final void method174(byte arg0) {
        field365++;
        if (this.field374 == null) {
            return;
        }
        this.field382 = true;
        int var2 = -37 % ((2 - arg0) / 48);
        if (this.field383 == null) {
            this.field383 = new class154();
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IB)V", line = 579)
    public final void method175(int arg0, byte arg1) {
        field345++;
        int var3 = -13 % ((80 - arg1) / 45);
        if (this.field374 == null) {
            return;
        }
        for (class338 var4 = this.field384.method814((byte) 90); var4 != null; var4 = this.field384.method827(-126)) {
            if ((long) arg0 == var4.field4510) {
                return;
            }
        }
        class338 var5 = new class338();
        var5.field4510 = (long) arg0;
        this.field384.method825(97, var5);
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(I)V", line = 609)
    public final void method176(int arg0) {
        field376++;
        if (this.field383 != null) {
            if (this.method173((byte) 0) == null) {
                return;
            }
            if (this.field386) {
                boolean var2 = true;
                for (class338 var3 = this.field383.method814((byte) 90); var3 != null; var3 = this.field383.method827(-126)) {
                    int var5 = (int) var3.field4510;
                    if (this.field344[var5] == 0) {
                        this.method172(1, var5, true);
                    }
                    if (this.field344[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1967(-1);
                    }
                }
                while (this.field366.field4352.length > this.field385) {
                    if (this.field366.field4352[this.field385] == 0) {
                        this.field385++;
                    } else {
                        if (this.field353.field23 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field344[this.field385] == 0) {
                            this.method172(1, this.field385, true);
                        }
                        if (this.field344[this.field385] == 0) {
                            class338 var4 = new class338();
                            var4.field4510 = (long) this.field385;
                            var2 = false;
                            this.field383.method825(-76, var4);
                        }
                        this.field385++;
                    }
                }
                if (var2) {
                    this.field385 = 0;
                    this.field386 = false;
                }
            } else if (this.field382) {
                boolean var6 = true;
                for (class338 var7 = this.field383.method814((byte) 90); var7 != null; var7 = this.field383.method827(-29)) {
                    int var9 = (int) var7.field4510;
                    if (this.field344[var9] != 1) {
                        this.method172(2, var9, true);
                    }
                    if (this.field344[var9] == 1) {
                        var7.method1967(arg0);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field385 < this.field366.field4352.length) {
                    if (this.field366.field4352[this.field385] == 0) {
                        this.field385++;
                    } else {
                        if (this.field369.method2185((byte) -5)) {
                            var6 = false;
                            break;
                        }
                        if (this.field344[this.field385] != 1) {
                            this.method172(2, this.field385, true);
                        }
                        if (this.field344[this.field385] != 1) {
                            class338 var8 = new class338();
                            var8.field4510 = (long) this.field385;
                            var6 = false;
                            this.field383.method825(110, var8);
                        }
                        this.field385++;
                    }
                }
                if (var6) {
                    this.field385 = 0;
                    this.field382 = false;
                }
            } else {
                this.field383 = null;
            }
        }
        if (arg0 != -1) {
            this.method170((byte) -127, 8);
        }
        if (!this.field387 || this.field388 > class442.method2730(25207)) {
            return;
        }
        for (class132 var10 = (class132) this.field357.method315((byte) -111); var10 != null; var10 = (class132) this.field357.method310(arg0 ^ 0x7C)) {
            if (!var10.field1708) {
                if (var10.field1707) {
                    if (!var10.field1700) {
                        throw new RuntimeException();
                    }
                    var10.method1967(-1);
                } else {
                    var10.field1707 = true;
                }
            }
        }
        this.field388 = class442.method2730(25207) + 1000L;
    }

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "(B)I", line = 787)
    public final int method177(byte arg0) {
        field372++;
        if (this.field366 == null) {
            return 0;
        } else if (this.field386) {
            class338 var2 = this.field383.method814((byte) 90);
            int var3 = -91 / ((-arg0 - 41) / 44);
            return var2 == null ? 0 : (int) var2.field4510;
        } else {
            return this.field366.field4344;
        }
    }

    @OriginalMember(owner = "client!wd", name = "<init>", descriptor = "(ILqk;Lqk;Lho;Lud;IIZ)V", line = 915)
    public class36(int arg0, class334 arg1, class334 arg2, class359 arg3, class2 arg4, int arg5, int arg6, boolean arg7) {
        this.field374 = arg1;
        this.field347 = arg0;
        if (this.field374 == null) {
            this.field386 = false;
        } else {
            this.field386 = true;
            this.field383 = new class154();
        }
        this.field360 = arg2;
        this.field353 = arg4;
        this.field362 = arg5;
        this.field387 = arg7;
        this.field381 = arg6;
        this.field369 = arg3;
        if (this.field360 != null) {
            this.field367 = this.field353.method6(false, this.field360, this.field347);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIIBI)V", line = 816)
    public static final void method178(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5) {
        class128.field1654 = arg2;
        field346++;
        class219.field2934 = arg1;
        class162.field2074 = arg0;
        int var6 = -32 % ((arg4 + 12) / 50);
        class168.field2130 = arg3;
        class139.field1781 = arg5;
        if (class168.field2130 >= 100) {
            int var7 = class128.field1654 * 128 + 64;
            int var8 = class139.field1781 * 128 + 64;
            int var9 = class201.method1098(var7, var8, class263.field3592, (byte) 71) - class162.field2074;
            int var10 = var7 - class127.field1633;
            int var11 = var9 - class175.field2197;
            int var12 = var8 - class180.field2272;
            int var13 = (int) Math.sqrt((double) (var10 * var10 + var12 * var12));
            class67.field700 = (int) (Math.atan2((double) var11, (double) var13) * 2607.5945876176133D) & 0x3FFF;
            class308.field4177 = (int) (-2607.5945876176133D * Math.atan2((double) var10, (double) var12)) & 0x3FFF;
            if (class67.field700 < 1024) {
                class67.field700 = 1024;
            }
            if (class67.field700 > 3072) {
                class67.field700 = 3072;
            }
        }
        class294.field3993 = 2;
    }

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "(Z)I", line = 860)
    public final int method179(boolean arg0) {
        if (arg0) {
            field371++;
            return this.field366 == null ? 0 : this.field366.field4344;
        } else {
            return 22;
        }
    }
}
