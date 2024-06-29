import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class279 extends class118 {

    @OriginalMember(owner = "client!kc", name = "r", descriptor = "I")
    private int field4400 = 0;

    @OriginalMember(owner = "client!kc", name = "J", descriptor = "Lkd;")
    private class204 field4418 = new class204(16);

    @OriginalMember(owner = "client!kc", name = "L", descriptor = "I")
    private int field4420 = 0;

    @OriginalMember(owner = "client!kc", name = "M", descriptor = "Lvj;")
    private class115 field4421 = new class115();

    @OriginalMember(owner = "client!kc", name = "V", descriptor = "J")
    private long field4429 = 0L;

    @OriginalMember(owner = "client!kc", name = "j", descriptor = "I")
    private int field4392;

    @OriginalMember(owner = "client!kc", name = "q", descriptor = "Lab;")
    private class146 field4399;

    @OriginalMember(owner = "client!kc", name = "Q", descriptor = "Z")
    private boolean field4425;

    @OriginalMember(owner = "client!kc", name = "R", descriptor = "Lvj;")
    private class115 field4426;

    @OriginalMember(owner = "client!kc", name = "W", descriptor = "Z")
    private boolean field4430;

    @OriginalMember(owner = "client!kc", name = "x", descriptor = "Lta;")
    private class255 field4406;

    @OriginalMember(owner = "client!kc", name = "B", descriptor = "Lii;")
    private class256 field4410;

    @OriginalMember(owner = "client!kc", name = "w", descriptor = "I")
    private int field4405;

    @OriginalMember(owner = "client!kc", name = "C", descriptor = "Lab;")
    private class146 field4411;

    @OriginalMember(owner = "client!kc", name = "D", descriptor = "I")
    private int field4412;

    @OriginalMember(owner = "client!kc", name = "A", descriptor = "Ldi;")
    private class176 field4409;

    @OriginalMember(owner = "client!kc", name = "S", descriptor = "[S")
    public static short[] field4427 = new short[500];

    @OriginalMember(owner = "client!kc", name = "k", descriptor = "I")
    public static int field4393;

    @OriginalMember(owner = "client!kc", name = "l", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!kc", name = "m", descriptor = "I")
    public static int field4395;

    @OriginalMember(owner = "client!kc", name = "o", descriptor = "I")
    public static int field4397;

    @OriginalMember(owner = "client!kc", name = "p", descriptor = "I")
    public static int field4398;

    @OriginalMember(owner = "client!kc", name = "s", descriptor = "I")
    public static int field4401;

    @OriginalMember(owner = "client!kc", name = "t", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!kc", name = "u", descriptor = "I")
    public static int field4403;

    @OriginalMember(owner = "client!kc", name = "v", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!kc", name = "y", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!kc", name = "z", descriptor = "I")
    public static int field4408;

    @OriginalMember(owner = "client!kc", name = "E", descriptor = "I")
    public static int field4413;

    @OriginalMember(owner = "client!kc", name = "F", descriptor = "I")
    public static int field4414;

    @OriginalMember(owner = "client!kc", name = "G", descriptor = "I")
    public static int field4415;

    @OriginalMember(owner = "client!kc", name = "I", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!kc", name = "K", descriptor = "I")
    public static int field4419;

    @OriginalMember(owner = "client!kc", name = "O", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!kc", name = "P", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!kc", name = "T", descriptor = "I")
    public static int field4428;

    @OriginalMember(owner = "client!kc", name = "n", descriptor = "Lo;")
    private class248 field4396;

    @OriginalMember(owner = "client!kc", name = "N", descriptor = "Z")
    private boolean field4422;

    @OriginalMember(owner = "client!kc", name = "H", descriptor = "[B")
    private byte[] field4416;

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(I)V")
    public static final void method1872(int arg0) {
        if (arg0 != 100) {
            method1882((class78) null, false, false, 6, -68, 12, (class78) null);
        }
        field4408++;
        int var1 = class178.field2806.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class178.field2806[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class285.field4492; var4++) {
                    if (class99.field1620[var2] == class84.field1327[var4]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class84.field1327[class285.field4492] = class99.field1620[var2];
                    var3 = class285.field4492++;
                }
                class221 var5 = new class221(class178.field2806[var2]);
                int var6 = 0;
                while (var5.field3655 < class178.field2806[var2].length && var6 < 511) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method1521((byte) 113);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FD2) >> 7;
                    int var11 = (class99.field1620[var2] >> 8) * 64 + var10 - class50.field884;
                    int var12 = var8 & 0x3F;
                    int var13 = (class99.field1620[var2] & 0xFF) * 64 + var12 - class214.field3501;
                    class107 var14 = class204.method1402((byte) 77, var5.method1521((byte) 113));
                    if (class137.field2260[var7] == null && (var14.field1729 & 0x1) > 0 && class223.field3694 == var9 && var11 >= 0 && var14.field1731 + var11 < 104 && var13 >= 0 && (var13 + var14.field1731) < 104) {
                        class137.field2260[var7] = new class15();
                        class15 var15 = class137.field2260[var7];
                        class221.field3648[class141.field2287++] = var7;
                        var15.field3376 = class222.field3682;
                        var15.method114(var14, (byte) 124);
                        var15.method1438(var15.field258.field1731, (byte) -103);
                        var15.field3322 = var15.field3320 = class199.field3184[var15.field258.field1709];
                        var15.field3362 = var15.field258.field1749;
                        var15.field3349 = var15.field258.field1769;
                        if (var15.field3362 == 0) {
                            var15.field3320 = 0;
                        }
                        var15.method1430(var13, var15.method278(0), var11, (byte) 86, true);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(I)I")
    public final int method1873(int arg0) {
        if (arg0 != 23122) {
            this.method865(-86);
        }
        field4395++;
        return this.field4400;
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(IB)[B")
    public final byte[] method869(int arg0, byte arg1) {
        if (arg1 != 0) {
            return null;
        }
        class176 var3 = this.method1877(0, arg0, 125);
        field4414++;
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1201((byte) 8);
            var3.method1388(-96);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(I)V")
    public final void method1874(int arg0) {
        field4428++;
        if (this.field4426 == null || this.method865(255) == null || arg0 != 100) {
            return;
        }
        for (class202 var2 = this.field4421.method843(-104); var2 != null; var2 = this.field4421.method852((byte) 123)) {
            int var3 = (int) var2.field3247;
            if (var3 < 0 || this.field4396.field3964 <= var3 || this.field4396.field3970[var3] == 0) {
                var2.method1388(-113);
            } else {
                if (this.field4416[var3] == 0) {
                    this.method1877(1, var3, 108);
                }
                if (this.field4416[var3] == -1) {
                    this.method1877(2, var3, 112);
                }
                if (this.field4416[var3] == 1) {
                    var2.method1388(arg0 ^ 0xFFFFFFF8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(B)I")
    public final int method1875(byte arg0) {
        int var2 = -23 / ((arg0 - 13) / 32);
        field4398++;
        if (this.method865(255) == null) {
            return this.field4409 == null ? 0 : this.field4409.method1203((byte) -82);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(I)I")
    public final int method1876(int arg0) {
        field4403++;
        if (arg0 < 6) {
            return 96;
        } else if (this.field4396 == null) {
            return 0;
        } else {
            return this.field4396.field3965;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)Lo;")
    public final class248 method865(int arg0) {
        field4401++;
        if (this.field4396 != null) {
            return this.field4396;
        }
        if (this.field4409 == null) {
            if (this.field4410.method1754((byte) -42)) {
                return null;
            }
            this.field4409 = this.field4410.method1751(255, (byte) 0, -110, true, this.field4392);
        }
        if (arg0 != 255) {
            return null;
        } else if (this.field4409.field2781) {
            return null;
        } else {
            byte[] var2 = this.field4409.method1201((byte) 8);
            if (this.field4409 instanceof class271) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field4396 = new class248(var2, this.field4405);
                    if (this.field4396.field3954 != this.field4412) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field4396 = null;
                    if (this.field4410.method1754((byte) -42)) {
                        this.field4409 = null;
                    } else {
                        this.field4409 = this.field4410.method1751(255, (byte) 0, arg0 ^ 0xCE, true, this.field4392);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field4396 = new class248(var2, this.field4405);
                } catch (RuntimeException var4) {
                    this.field4410.method1753(0);
                    this.field4396 = null;
                    if (this.field4410.method1754((byte) -42)) {
                        this.field4409 = null;
                    } else {
                        this.field4409 = this.field4410.method1751(255, (byte) 0, 118, true, this.field4392);
                    }
                    return null;
                }
                if (this.field4411 != null) {
                    this.field4406.method1736(122, this.field4411, this.field4392, var2);
                }
            }
            this.field4409 = null;
            if (this.field4399 != null) {
                this.field4400 = 0;
                this.field4416 = new byte[this.field4396.field3964];
            }
            return this.field4396;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(III)Ldi;")
    private final class176 method1877(int arg0, int arg1, int arg2) {
        class176 var4 = (class176) this.field4418.method1400((long) arg1, true);
        if (arg2 <= 85) {
            return null;
        }
        field4394++;
        if (var4 != null && arg0 == 0 && !var4.field2778 && var4.field2781) {
            var4.method1388(93);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field4399 == null || this.field4416[arg1] == -1) {
                    if (this.field4410.method1754((byte) -42)) {
                        return null;
                    }
                    var4 = this.field4410.method1751(this.field4392, (byte) 2, 83, true, arg1);
                } else {
                    var4 = this.field4406.method1737(-3, arg1, this.field4399);
                }
            } else if (arg0 == 1) {
                if (this.field4399 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field4406.method1738(this.field4399, arg1, true);
            } else if (arg0 == 2) {
                if (this.field4399 == null) {
                    throw new RuntimeException();
                }
                if (this.field4416[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field4410.method1745(60)) {
                    return null;
                }
                var4 = this.field4410.method1751(this.field4392, (byte) 2, -109, false, arg1);
            } else {
                throw new RuntimeException();
            }
            this.field4418.method1399(7292, var4, (long) arg1);
        }
        if (var4.field2781) {
            return null;
        }
        byte[] var5 = var4.method1201((byte) 8);
        if (!var4 instanceof class271) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class153.field2474.reset();
                class153.field2474.update(var5, 0, var5.length - 2);
                int var9 = (int) class153.field2474.getValue();
                if (this.field4396.field3951[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field4410.field4092 = 0;
                this.field4410.field4090 = 0;
            } catch (RuntimeException var12) {
                this.field4410.method1753(0);
                var4.method1388(-110);
                if (var4.field2778 && !this.field4410.method1754((byte) -42)) {
                    class179 var10 = this.field4410.method1751(this.field4392, (byte) 2, 114, true, arg1);
                    this.field4418.method1399(7292, var10, (long) arg1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field4396.field3952[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field4396.field3952[arg1];
            if (this.field4399 != null) {
                this.field4406.method1736(107, this.field4399, arg1, var5);
                if (this.field4416[arg1] != 1) {
                    this.field4400++;
                    this.field4416[arg1] = 1;
                }
            }
            if (!var4.field2778) {
                var4.method1388(-112);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class153.field2474.reset();
            class153.field2474.update(var5, 0, var5.length - 2);
            int var6 = (int) class153.field2474.getValue();
            if (this.field4396.field3951[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field4396.field3952[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field4416[arg1] != 1) {
                this.field4400++;
                this.field4416[arg1] = 1;
            }
            if (!var4.field2778) {
                var4.method1388(107);
            }
            return var4;
        } catch (Exception var11) {
            this.field4416[arg1] = -1;
            var4.method1388(84);
            if (var4.field2778 && !this.field4410.method1754((byte) -42)) {
                class179 var8 = this.field4410.method1751(this.field4392, (byte) 2, 62, true, arg1);
                this.field4418.method1399(7292, var8, (long) arg1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "b", descriptor = "(II)V")
    public static final void method1878(int arg0, int arg1) {
        class115.field1903.method476(false, arg1);
        field4397++;
        if (arg0 != 5463) {
            field4404 = -27;
        }
    }

    @OriginalMember(owner = "client!kc", name = "c", descriptor = "(B)V")
    public final void method1879(byte arg0) {
        field4424++;
        if (arg0 <= -28 && this.field4399 != null) {
            this.field4422 = true;
            if (this.field4426 == null) {
                this.field4426 = new class115();
            }
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(IB)I")
    public final int method863(int arg0, byte arg1) {
        int var3 = -66 % ((-arg1 - 12) / 33);
        field4419++;
        class176 var4 = (class176) this.field4418.method1400((long) arg0, true);
        return var4 == null ? 0 : var4.method1203((byte) -126);
    }

    @OriginalMember(owner = "client!kc", name = "f", descriptor = "(I)I")
    public final int method1880(int arg0) {
        field4407++;
        if (this.field4396 == null) {
            return 0;
        }
        if (arg0 != -2751) {
            this.method1874(81);
        }
        if (this.field4425) {
            class202 var2 = this.field4426.method843(-94);
            return var2 == null ? 0 : (int) var2.field3247;
        } else {
            return this.field4396.field3965;
        }
    }

    @OriginalMember(owner = "client!kc", name = "d", descriptor = "(B)V")
    public final void method1881(byte arg0) {
        field4417++;
        if (this.field4426 != null) {
            if (this.method865(255) == null) {
                return;
            }
            if (this.field4425) {
                boolean var6 = true;
                for (class202 var7 = this.field4426.method843(59); var7 != null; var7 = this.field4426.method852((byte) 123)) {
                    int var9 = (int) var7.field3247;
                    if (this.field4416[var9] == 0) {
                        this.method1877(1, var9, 125);
                    }
                    if (this.field4416[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1388(116);
                    }
                }
                while (this.field4420 < this.field4396.field3970.length) {
                    if (this.field4396.field3970[this.field4420] == 0) {
                        this.field4420++;
                    } else {
                        if (this.field4406.field4062 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field4416[this.field4420] == 0) {
                            this.method1877(1, this.field4420, 117);
                        }
                        if (this.field4416[this.field4420] == 0) {
                            var6 = false;
                            class202 var8 = new class202();
                            var8.field3247 = (long) this.field4420;
                            this.field4426.method855(false, var8);
                        }
                        this.field4420++;
                    }
                }
                if (var6) {
                    this.field4420 = 0;
                    this.field4425 = false;
                }
            } else if (this.field4422) {
                boolean var2 = true;
                for (class202 var3 = this.field4426.method843(90); var3 != null; var3 = this.field4426.method852((byte) 123)) {
                    int var5 = (int) var3.field3247;
                    if (this.field4416[var5] != 1) {
                        this.method1877(2, var5, 113);
                    }
                    if (this.field4416[var5] == 1) {
                        var3.method1388(14);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field4396.field3970.length > this.field4420) {
                    if (this.field4396.field3970[this.field4420] == 0) {
                        this.field4420++;
                    } else {
                        if (this.field4410.method1745(61)) {
                            var2 = false;
                            break;
                        }
                        if (this.field4416[this.field4420] != 1) {
                            this.method1877(2, this.field4420, 125);
                        }
                        if (this.field4416[this.field4420] != 1) {
                            var2 = false;
                            class202 var4 = new class202();
                            var4.field3247 = (long) this.field4420;
                            this.field4426.method855(false, var4);
                        }
                        this.field4420++;
                    }
                }
                if (var2) {
                    this.field4420 = 0;
                    this.field4422 = false;
                }
            } else {
                this.field4426 = null;
            }
        }
        if (this.field4430 && class276.method1861((byte) 122) >= this.field4429) {
            for (class176 var10 = (class176) this.field4418.method1404(95); var10 != null; var10 = (class176) this.field4418.method1412(-80)) {
                if (!var10.field2781) {
                    if (var10.field2783) {
                        if (!var10.field2778) {
                            throw new RuntimeException();
                        }
                        var10.method1388(-112);
                    } else {
                        var10.field2783 = true;
                    }
                }
            }
            this.field4429 = class276.method1861((byte) 122) + 1000L;
        }
        if (arg0 <= 45) {
            field4427 = null;
        }
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(Lph;ZZIIILph;)I")
    public static final int method1882(class78 arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, class78 arg6) {
        if (arg3 != 255) {
            method1878(-40, 16);
        }
        int var7 = class95.method707(arg6, (byte) 124, arg0, arg5, arg1);
        field4402++;
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg4 == -1) {
            return 0;
        } else {
            int var8 = class95.method707(arg6, (byte) 61, arg0, arg4, arg2);
            return arg2 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!kc", name = "e", descriptor = "(B)V")
    public static void method1883(byte arg0) {
        int var1 = -102 / ((76 - arg0) / 34);
        field4427 = null;
    }

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(II)V")
    public final void method864(int arg0, int arg1) {
        field4393++;
        if (this.field4399 == null) {
            return;
        }
        if (arg0 != 30481) {
            this.method1874(-115);
        }
        for (class202 var3 = this.field4421.method843(68); var3 != null; var3 = this.field4421.method852((byte) 123)) {
            if (((long) arg1) == var3.field3247) {
                return;
            }
        }
        class202 var4 = new class202();
        var4.field3247 = (long) arg1;
        this.field4421.method855(false, var4);
    }

    @OriginalMember(owner = "client!kc", name = "<init>", descriptor = "(ILab;Lab;Lii;Lta;IIZ)V")
    public class279(int arg0, class146 arg1, class146 arg2, class256 arg3, class255 arg4, int arg5, int arg6, boolean arg7) {
        this.field4392 = arg0;
        this.field4399 = arg1;
        if (this.field4399 == null) {
            this.field4425 = false;
        } else {
            this.field4425 = true;
            this.field4426 = new class115();
        }
        this.field4430 = arg7;
        this.field4406 = arg4;
        this.field4410 = arg3;
        this.field4405 = arg5;
        this.field4411 = arg2;
        this.field4412 = arg6;
        if (this.field4411 != null) {
            this.field4409 = this.field4406.method1737(-3, this.field4392, this.field4411);
        }
    }
}
