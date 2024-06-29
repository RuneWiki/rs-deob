import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class198 extends class512 {

    @OriginalMember(owner = "client!jf", name = "F", descriptor = "I")
    private int field2421 = 0;

    @OriginalMember(owner = "client!jf", name = "y", descriptor = "Ltq;")
    private class572 field2414 = new class572(16);

    @OriginalMember(owner = "client!jf", name = "J", descriptor = "I")
    private int field2425 = 0;

    @OriginalMember(owner = "client!jf", name = "K", descriptor = "Lmfa;")
    private class562 field2426 = new class562();

    @OriginalMember(owner = "client!jf", name = "O", descriptor = "J")
    private long field2430 = 0L;

    @OriginalMember(owner = "client!jf", name = "r", descriptor = "I")
    private int field2407;

    @OriginalMember(owner = "client!jf", name = "s", descriptor = "Lqn;")
    private class59 field2408;

    @OriginalMember(owner = "client!jf", name = "M", descriptor = "Z")
    private boolean field2428;

    @OriginalMember(owner = "client!jf", name = "I", descriptor = "Lmfa;")
    private class562 field2424;

    @OriginalMember(owner = "client!jf", name = "v", descriptor = "[B")
    private byte[] field2411;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lqn;")
    private class59 field2401;

    @OriginalMember(owner = "client!jf", name = "N", descriptor = "Z")
    private boolean field2429;

    @OriginalMember(owner = "client!jf", name = "H", descriptor = "I")
    private int field2423;

    @OriginalMember(owner = "client!jf", name = "z", descriptor = "I")
    private int field2415;

    @OriginalMember(owner = "client!jf", name = "w", descriptor = "Lsc;")
    private class315 field2412;

    @OriginalMember(owner = "client!jf", name = "B", descriptor = "Lnp;")
    private class448 field2417;

    @OriginalMember(owner = "client!jf", name = "G", descriptor = "Lqt;")
    private class580 field2422;

    @OriginalMember(owner = "client!jf", name = "q", descriptor = "Z")
    public static boolean field2406 = false;

    @OriginalMember(owner = "client!jf", name = "n", descriptor = "Z")
    public static boolean field2403 = false;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field2394;

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "I")
    public static int field2395;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!jf", name = "o", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!jf", name = "p", descriptor = "I")
    public static int field2405;

    @OriginalMember(owner = "client!jf", name = "t", descriptor = "I")
    public static int field2409;

    @OriginalMember(owner = "client!jf", name = "x", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!jf", name = "A", descriptor = "I")
    public static int field2416;

    @OriginalMember(owner = "client!jf", name = "C", descriptor = "I")
    public static int field2418;

    @OriginalMember(owner = "client!jf", name = "D", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!jf", name = "E", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!jf", name = "u", descriptor = "Lhc;")
    private class127 field2410;

    @OriginalMember(owner = "client!jf", name = "m", descriptor = "Ljo;")
    public static class303 field2402;

    @OriginalMember(owner = "client!jf", name = "L", descriptor = "Z")
    private boolean field2427;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "[B")
    private byte[] field2398;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V", line = 6)
    public final void method1204(byte arg0) {
        field2419++;
        if (arg0 != 1) {
            return;
        }
        if (this.field2424 != null) {
            if (this.method1214(-1) == null) {
                return;
            }
            if (this.field2428) {
                boolean var6 = true;
                for (class270 var7 = this.field2424.method3174((byte) 49); var7 != null; var7 = this.field2424.method3168(false)) {
                    int var9 = (int) var7.field3405;
                    if (this.field2398[var9] == 0) {
                        this.method1216(var9, 1, (byte) 29);
                    }
                    if (this.field2398[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1519((byte) 121);
                    }
                }
                while (this.field2410.field1441.length > this.field2425) {
                    if (this.field2410.field1441[this.field2425] == 0) {
                        this.field2425++;
                    } else {
                        if (this.field2412.field4103 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field2398[this.field2425] == 0) {
                            this.method1216(this.field2425, 1, (byte) 29);
                        }
                        if (this.field2398[this.field2425] == 0) {
                            class270 var8 = new class270();
                            var8.field3405 = this.field2425;
                            var6 = false;
                            this.field2424.method3164(var8, 256);
                        }
                        this.field2425++;
                    }
                }
                if (var6) {
                    this.field2425 = 0;
                    this.field2428 = false;
                }
            } else if (this.field2427) {
                boolean var2 = true;
                for (class270 var3 = this.field2424.method3174((byte) 49); var3 != null; var3 = this.field2424.method3168(false)) {
                    int var5 = (int) var3.field3405;
                    if (this.field2398[var5] != 1) {
                        this.method1216(var5, 2, (byte) 29);
                    }
                    if (this.field2398[var5] == 1) {
                        var3.method1519((byte) 121);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field2425 < this.field2410.field1441.length) {
                    if (this.field2410.field1441[this.field2425] == 0) {
                        this.field2425++;
                    } else {
                        if (this.field2417.method2480(true)) {
                            var2 = false;
                            break;
                        }
                        if (this.field2398[this.field2425] != 1) {
                            this.method1216(this.field2425, 2, (byte) 29);
                        }
                        if (this.field2398[this.field2425] != 1) {
                            class270 var4 = new class270();
                            var4.field3405 = this.field2425;
                            this.field2424.method3164(var4, 256);
                            var2 = false;
                        }
                        this.field2425++;
                    }
                }
                if (var2) {
                    this.field2425 = 0;
                    this.field2427 = false;
                }
            } else {
                this.field2424 = null;
            }
        }
        if (!this.field2429 || class641.method3604(false) < this.field2430) {
            return;
        }
        for (class580 var10 = (class580) this.field2414.method3232(-1); var10 != null; var10 = (class580) this.field2414.method3236(arg0 ^ 0xFFFF9403)) {
            if (!var10.field8252) {
                if (var10.field8253) {
                    if (!var10.field8250) {
                        throw new RuntimeException();
                    }
                    var10.method1519((byte) 121);
                } else {
                    var10.field8253 = true;
                }
            }
        }
        this.field2430 = class641.method3604(false) + 1000L;
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(II)[B", line = 184)
    public final byte[] method1205(int arg0, int arg1) {
        if (arg1 != 7843) {
            this.method1213(95);
        }
        field2396++;
        class580 var3 = this.method1216(arg0, 0, (byte) 29);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method750(-118);
            var3.method1519((byte) 121);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(II)V", line = 203)
    public static final void method1206(int arg0, int arg1) {
        field2409++;
        class530 var2 = class242.method1402(-95, arg0, arg1);
        var2.method3027((byte) -83);
    }

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "(I)I", line = 213)
    public final int method1207(int arg0) {
        field2400++;
        if (arg0 != -1) {
            this.field2417 = null;
        }
        return this.field2421;
    }

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "(I)V", line = 228)
    public static void method1208(int arg0) {
        if (arg0 != 100) {
            field2403 = false;
        }
        field2402 = null;
    }

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "(I)V", line = 240)
    public final void method1209(int arg0) {
        field2394++;
        if (arg0 != -9395) {
            this.method1209(32);
        }
        if (this.field2424 == null || this.method1214(arg0 ^ 0x24B2) == null) {
            return;
        }
        for (class270 var2 = this.field2426.method3174((byte) 49); var2 != null; var2 = this.field2426.method3168(false)) {
            int var3 = (int) var2.field3405;
            if (var3 < 0 || var3 >= this.field2410.field1447 || this.field2410.field1441[var3] == 0) {
                var2.method1519((byte) 121);
            } else {
                if (this.field2398[var3] == 0) {
                    this.method1216(var3, 1, (byte) 29);
                }
                if (this.field2398[var3] == -1) {
                    this.method1216(var3, 2, (byte) 29);
                }
                if (this.field2398[var3] == 1) {
                    var2.method1519((byte) 121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "(I)V", line = 283)
    public final void method1210(int arg0) {
        field2418++;
        if (this.field2408 != null && arg0 == -1) {
            this.field2427 = true;
            if (this.field2424 == null) {
                this.field2424 = new class562();
            }
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIIILoa;II)Lba;", line = 302)
    public static final class350 method1211(int arg0, int arg1, int arg2, int arg3, class635 arg4, int arg5, int arg6) {
        field2413++;
        long var7 = (long) arg1;
        class350 var9 = (class350) class389.field5193.method3690((byte) 1, var7);
        short var10 = 2055;
        if (arg2 <= 7) {
            field2403 = true;
        }
        if (var9 == null) {
            class90 var11 = class189.method1098(arg1, 0, 1, class389.field5195);
            if (var11 == null) {
                return null;
            }
            if (var11.field984 < 13) {
                var11.method561(2, 1);
            }
            var9 = arg4.method375(var11, var10, class284.field3600, 64, 768);
            class389.field5193.method3683(var9, (byte) 112, var7);
        }
        class350 var12 = var9.method602((byte) 2, var10, true);
        if (arg5 != 0) {
            var12.method903(arg5);
        }
        if (arg0 != 0) {
            var12.method865(arg0);
        }
        if (arg3 != 0) {
            var12.method870(arg3);
        }
        if (arg6 != 0) {
            var12.method862(0, arg6, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(B)I", line = 356)
    public final int method1212(byte arg0) {
        field2405++;
        if (this.method1214(-1) == null) {
            return this.field2422 == null ? 0 : this.field2422.method749(30849);
        } else if (arg0 == -1) {
            return 100;
        } else {
            return 30;
        }
    }

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "(I)I", line = 386)
    public final int method1213(int arg0) {
        field2397++;
        if (this.field2410 == null) {
            return 0;
        } else if (this.field2428) {
            if (arg0 != 0) {
                this.method1218((byte) 29, 35);
            }
            class270 var2 = this.field2424.method3174((byte) 49);
            return var2 == null ? 0 : (int) var2.field3405;
        } else {
            return this.field2410.field1443;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)Lhc;", line = 419)
    public final class127 method1214(int arg0) {
        field2395++;
        if (this.field2410 != null) {
            return this.field2410;
        }
        if (this.field2422 == null) {
            if (this.field2417.method2481(false)) {
                return null;
            }
            this.field2422 = this.field2417.method2488((byte) -83, true, this.field2407, 255, (byte) 0);
        }
        if (arg0 != -1) {
            this.field2427 = true;
        }
        if (this.field2422.field8252) {
            return null;
        }
        byte[] var2 = this.field2422.method750(88);
        if (this.field2422 instanceof class134) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2410 = new class127(var2, this.field2423, this.field2411);
                if (this.field2410.field1444 != this.field2415) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2410 = null;
                if (this.field2417.method2481(false)) {
                    this.field2422 = null;
                } else {
                    this.field2422 = this.field2417.method2488((byte) -83, true, this.field2407, 255, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2410 = new class127(var2, this.field2423, this.field2411);
            } catch (RuntimeException var4) {
                this.field2417.method2476((byte) 29);
                this.field2410 = null;
                if (this.field2417.method2481(false)) {
                    this.field2422 = null;
                } else {
                    this.field2422 = this.field2417.method2488((byte) -83, true, this.field2407, 255, (byte) 0);
                }
                return null;
            }
            if (this.field2401 != null) {
                this.field2412.method1782((byte) 8, var2, this.field2401, this.field2407);
            }
        }
        if (this.field2408 != null) {
            this.field2398 = new byte[this.field2410.field1447];
            this.field2421 = 0;
        }
        this.field2422 = null;
        return this.field2410;
    }

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "(I)I", line = 516)
    public final int method1215(int arg0) {
        field2416++;
        if (this.field2410 == null) {
            return 0;
        } else {
            int var2 = -84 % ((arg0 - 59) / 38);
            return this.field2410.field1443;
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(IIB)Lqt;", line = 533)
    private final class580 method1216(int arg0, int arg1, byte arg2) {
        field2399++;
        class580 var4 = (class580) this.field2414.method3234((byte) -51, (long) arg0);
        if (var4 != null && arg1 == 0 && !var4.field8250 && var4.field8252) {
            var4.method1519((byte) 121);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field2408 == null || this.field2398[arg0] == -1) {
                    if (this.field2417.method2481(false)) {
                        return null;
                    }
                    var4 = this.field2417.method2488((byte) -83, true, arg0, this.field2407, (byte) 2);
                } else {
                    var4 = this.field2412.method1777(this.field2408, arg0, 113);
                }
            } else if (arg1 == 1) {
                if (this.field2408 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2412.method1780(this.field2408, arg0, (byte) 121);
            } else if (arg1 == 2) {
                if (this.field2408 == null) {
                    throw new RuntimeException();
                }
                if (this.field2398[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2417.method2480(true)) {
                    return null;
                }
                var4 = this.field2417.method2488((byte) -83, false, arg0, this.field2407, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field2414.method3235((long) arg0, -1, var4);
        }
        if (var4.field8252) {
            return null;
        }
        byte[] var5 = var4.method750(-104);
        if (arg2 != 29) {
            return null;
        } else if (var4 instanceof class134) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class548.field7826.reset();
                class548.field7826.update(var5, 0, var5.length - 2);
                int var6 = (int) class548.field7826.getValue();
                if (this.field2410.field1449[arg0] != var6) {
                    throw new RuntimeException();
                }
                if (this.field2410.field1448 != null && this.field2410.field1448[arg0] != null) {
                    byte[] var7 = this.field2410.field1448[arg0];
                    byte[] var8 = class235.method1364(var5.length - 2, var5, (byte) 14, 0);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field2410.field1451[arg0] & 0xFFFF) != var10) {
                    throw new RuntimeException();
                }
                if (this.field2398[arg0] != 1) {
                    this.field2421++;
                    this.field2398[arg0] = 1;
                }
                if (!var4.field8250) {
                    var4.method1519((byte) 121);
                }
                return var4;
            } catch (Exception var17) {
                this.field2398[arg0] = -1;
                var4.method1519((byte) 121);
                if (var4.field8250 && !this.field2417.method2481(false)) {
                    class501 var11 = this.field2417.method2488((byte) -83, true, arg0, this.field2407, (byte) 2);
                    this.field2414.method3235((long) arg0, arg2 ^ 0xFFFFFFE2, var11);
                }
                return null;
            }
        } else {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class548.field7826.reset();
                        class548.field7826.update(var5, 0, var5.length - 2);
                        int var12 = (int) class548.field7826.getValue();
                        if (this.field2410.field1449[arg0] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field2410.field1448 == null || this.field2410.field1448[arg0] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field2410.field1448[arg0];
                        byte[] var14 = class235.method1364(var5.length - 2, var5, (byte) 14, 0);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label159;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field2417.field6168 = 0;
                this.field2417.field6170 = 0;
            } catch (RuntimeException var18) {
                this.field2417.method2476((byte) 29);
                var4.method1519((byte) 121);
                if (var4.field8250 && !this.field2417.method2481(false)) {
                    class501 var16 = this.field2417.method2488((byte) -83, true, arg0, this.field2407, (byte) 2);
                    this.field2414.method3235((long) arg0, arg2 - 30, var16);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2410.field1451[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field2410.field1451[arg0];
            if (this.field2408 != null) {
                this.field2412.method1782((byte) 8, var5, this.field2408, arg0);
                if (this.field2398[arg0] != 1) {
                    this.field2421++;
                    this.field2398[arg0] = 1;
                }
            }
            if (!var4.field8250) {
                var4.method1519((byte) 121);
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(II)I", line = 804)
    public final int method1217(int arg0, int arg1) {
        if (arg0 > -70) {
            this.field2401 = null;
        }
        field2420++;
        class580 var3 = (class580) this.field2414.method3234((byte) -124, (long) arg1);
        return var3 == null ? 0 : var3.method749(30849);
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(BI)V", line = 821)
    public final void method1218(byte arg0, int arg1) {
        field2404++;
        if (this.field2408 == null) {
            return;
        }
        for (class270 var3 = this.field2426.method3174((byte) 49); var3 != null; var3 = this.field2426.method3168(false)) {
            if (((long) arg1) == var3.field3405) {
                return;
            }
        }
        if (arg0 >= -33) {
            this.field2415 = 54;
        }
        class270 var4 = new class270();
        var4.field3405 = arg1;
        this.field2426.method3164(var4, 256);
    }

    @OriginalMember(owner = "client!jf", name = "<init>", descriptor = "(ILqn;Lqn;Lnp;Lsc;I[BIZ)V", line = 871)
    public class198(int arg0, class59 arg1, class59 arg2, class448 arg3, class315 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field2407 = arg0;
        this.field2408 = arg1;
        if (this.field2408 == null) {
            this.field2428 = false;
        } else {
            this.field2428 = true;
            this.field2424 = new class562();
        }
        this.field2411 = arg6;
        this.field2401 = arg2;
        this.field2429 = arg8;
        this.field2423 = arg5;
        this.field2415 = arg7;
        this.field2412 = arg4;
        this.field2417 = arg3;
        if (this.field2401 != null) {
            this.field2422 = this.field2412.method1777(this.field2401, this.field2407, 118);
        }
    }
}
