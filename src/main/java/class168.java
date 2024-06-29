import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class168 extends class7 {

    @OriginalMember(owner = "client!j", name = "L", descriptor = "I")
    private int field2331 = 0;

    @OriginalMember(owner = "client!j", name = "w", descriptor = "Lvd;")
    private class4 field2316 = new class4(16);

    @OriginalMember(owner = "client!j", name = "P", descriptor = "I")
    private int field2334 = 0;

    @OriginalMember(owner = "client!j", name = "T", descriptor = "Lab;")
    private class148 field2338 = new class148();

    @OriginalMember(owner = "client!j", name = "V", descriptor = "J")
    private long field2340 = 0L;

    @OriginalMember(owner = "client!j", name = "z", descriptor = "Lkb;")
    private class54 field2319;

    @OriginalMember(owner = "client!j", name = "C", descriptor = "I")
    private int field2322;

    @OriginalMember(owner = "client!j", name = "Q", descriptor = "Z")
    private boolean field2335;

    @OriginalMember(owner = "client!j", name = "R", descriptor = "Lab;")
    private class148 field2336;

    @OriginalMember(owner = "client!j", name = "j", descriptor = "Lbi;")
    private class94 field2303;

    @OriginalMember(owner = "client!j", name = "o", descriptor = "Lig;")
    private class9 field2308;

    @OriginalMember(owner = "client!j", name = "u", descriptor = "I")
    private int field2314;

    @OriginalMember(owner = "client!j", name = "U", descriptor = "Z")
    private boolean field2339;

    @OriginalMember(owner = "client!j", name = "A", descriptor = "I")
    private int field2320;

    @OriginalMember(owner = "client!j", name = "l", descriptor = "Lkb;")
    private class54 field2305;

    @OriginalMember(owner = "client!j", name = "H", descriptor = "Ltf;")
    private class109 field2327;

    @OriginalMember(owner = "client!j", name = "s", descriptor = "I")
    public static int field2312 = 255;

    @OriginalMember(owner = "client!j", name = "G", descriptor = "Ljava/lang/String;")
    public static String field2326 = "flash3:";

    @OriginalMember(owner = "client!j", name = "y", descriptor = "Lab;")
    public static class148 field2318 = new class148();

    @OriginalMember(owner = "client!j", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2332 = null;

    @OriginalMember(owner = "client!j", name = "k", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!j", name = "m", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!j", name = "n", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!j", name = "p", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!j", name = "r", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!j", name = "t", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!j", name = "v", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!j", name = "B", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!j", name = "D", descriptor = "I")
    public static int field2323;

    @OriginalMember(owner = "client!j", name = "E", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!j", name = "F", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!j", name = "J", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!j", name = "K", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!j", name = "O", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!j", name = "I", descriptor = "Luj;")
    private class287 field2328;

    @OriginalMember(owner = "client!j", name = "S", descriptor = "Z")
    private boolean field2337;

    @OriginalMember(owner = "client!j", name = "q", descriptor = "[B")
    private byte[] field2310;

    @OriginalMember(owner = "client!j", name = "x", descriptor = "[Lke;")
    public static class110[] field2317;

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(B)I")
    public final int method1098(byte arg0) {
        int var2 = 47 / ((arg0 + 14) / 47);
        field2330++;
        return this.field2331;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(III)Lse;")
    public static final class211 method1099(int arg0, int arg1, int arg2) {
        field2324++;
        class211 var3 = class67.method421(arg2, arg0 + arg0);
        if (arg1 == -1) {
            return var3;
        } else if (var3 == null || var3.field3180 == null || var3.field3180.length <= arg1) {
            return null;
        } else {
            return var3.field3180[arg1];
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)I")
    public final int method1100(boolean arg0) {
        field2311++;
        if (this.field2328 == null) {
            return 0;
        } else if (this.field2335) {
            class171 var2 = this.field2336.method990(-119);
            if (arg0) {
                return var2 == null ? 0 : (int) var2.field2369;
            } else {
                return -34;
            }
        } else {
            return this.field2328.field4549;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public final void method1101(int arg0) {
        field2307++;
        if (this.field2319 != null) {
            this.field2337 = true;
            if (arg0 <= -69 && this.field2336 == null) {
                this.field2336 = new class148();
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(Z)V")
    public final void method1102(boolean arg0) {
        field2306++;
        if (this.field2336 != null) {
            if (this.method41((byte) 90) == null) {
                return;
            }
            if (this.field2335) {
                boolean var2 = true;
                for (class171 var3 = this.field2336.method990(-107); var3 != null; var3 = this.field2336.method993(-117)) {
                    int var5 = (int) var3.field2369;
                    if (this.field2310[var5] == 0) {
                        this.method1107((byte) 2, var5, 1);
                    }
                    if (this.field2310[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1115(-125);
                    }
                }
                while (this.field2328.field4536.length > this.field2334) {
                    if (this.field2328.field4536[this.field2334] == 0) {
                        this.field2334++;
                    } else {
                        if (this.field2308.field92 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2310[this.field2334] == 0) {
                            this.method1107((byte) 2, this.field2334, 1);
                        }
                        if (this.field2310[this.field2334] == 0) {
                            var2 = false;
                            class171 var4 = new class171();
                            var4.field2369 = (long) this.field2334;
                            this.field2336.method988(var4, (byte) -77);
                        }
                        this.field2334++;
                    }
                }
                if (var2) {
                    this.field2334 = 0;
                    this.field2335 = false;
                }
            } else if (this.field2337) {
                boolean var6 = true;
                for (class171 var7 = this.field2336.method990(-88); var7 != null; var7 = this.field2336.method993(-121)) {
                    int var9 = (int) var7.field2369;
                    if (this.field2310[var9] != 1) {
                        this.method1107((byte) 2, var9, 2);
                    }
                    if (this.field2310[var9] == 1) {
                        var7.method1115(86);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2328.field4536.length > this.field2334) {
                    if (this.field2328.field4536[this.field2334] == 0) {
                        this.field2334++;
                    } else {
                        if (this.field2303.method628(20)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2310[this.field2334] != 1) {
                            this.method1107((byte) 2, this.field2334, 2);
                        }
                        if (this.field2310[this.field2334] != 1) {
                            class171 var8 = new class171();
                            var6 = false;
                            var8.field2369 = (long) this.field2334;
                            this.field2336.method988(var8, (byte) -77);
                        }
                        this.field2334++;
                    }
                }
                if (var6) {
                    this.field2334 = 0;
                    this.field2337 = false;
                }
            } else {
                this.field2336 = null;
            }
        }
        if (this.field2339 && this.field2340 <= class223.method1433((byte) -100)) {
            for (class109 var10 = (class109) this.field2316.method21((byte) 67); var10 != null; var10 = (class109) this.field2316.method22(true)) {
                if (!var10.field1519) {
                    if (var10.field1520) {
                        if (!var10.field1517) {
                            throw new RuntimeException();
                        }
                        var10.method1115(-128);
                    } else {
                        var10.field1520 = true;
                    }
                }
            }
            this.field2340 = class223.method1433((byte) -110) + 1000L;
        }
        if (arg0) {
            this.method1098((byte) 1);
        }
    }

    @OriginalMember(owner = "client!j", name = "d", descriptor = "(B)I")
    public final int method1103(byte arg0) {
        field2329++;
        if (arg0 > -6) {
            this.field2314 = -15;
        }
        if (this.method41((byte) 86) == null) {
            return this.field2327 == null ? 0 : this.field2327.method143(14);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(I)I")
    public final int method1104(int arg0) {
        if (arg0 != 0) {
            this.method1098((byte) 5);
        }
        field2313++;
        return this.field2328 == null ? 0 : this.field2328.field4549;
    }

    @OriginalMember(owner = "client!j", name = "e", descriptor = "(B)V")
    public static void method1105(byte arg0) {
        field2332 = null;
        if (arg0 < 100) {
            field2333 = -81;
        }
        field2317 = null;
        field2326 = null;
        field2318 = null;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IB)V")
    public final void method47(int arg0, byte arg1) {
        field2325++;
        if (this.field2319 == null) {
            return;
        }
        for (class171 var3 = this.field2338.method990(-113); var3 != null; var3 = this.field2338.method993(-44)) {
            if ((long) arg0 == var3.field2369) {
                return;
            }
        }
        class171 var4 = new class171();
        if (arg1 < 42) {
            this.field2340 = 30L;
        }
        var4.field2369 = (long) arg0;
        this.field2338.method988(var4, (byte) -77);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(II)[B")
    public final byte[] method44(int arg0, int arg1) {
        field2304++;
        if (arg1 <= 61) {
            this.method1100(true);
        }
        class109 var3 = this.method1107((byte) 2, arg0, 0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method142(75);
            var3.method1115(-125);
            return var4;
        }
    }

    @OriginalMember(owner = "client!j", name = "c", descriptor = "(I)V")
    public final void method1106(int arg0) {
        field2321++;
        if (this.field2336 == null) {
            return;
        }
        int var2 = 21 % ((arg0 - 52) / 58);
        if (this.method41((byte) 71) == null) {
            return;
        }
        for (class171 var3 = this.field2338.method990(-124); var3 != null; var3 = this.field2338.method993(-107)) {
            int var4 = (int) var3.field2369;
            if (var4 < 0 || this.field2328.field4532 <= var4 || this.field2328.field4536[var4] == 0) {
                var3.method1115(-121);
            } else {
                if (this.field2310[var4] == 0) {
                    this.method1107((byte) 2, var4, 1);
                }
                if (this.field2310[var4] == -1) {
                    this.method1107((byte) 2, var4, 2);
                }
                if (this.field2310[var4] == 1) {
                    var3.method1115(-121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(IB)I")
    public final int method50(int arg0, byte arg1) {
        field2323++;
        if (arg1 != 117) {
            this.field2320 = -12;
        }
        class109 var3 = (class109) this.field2316.method23(216, (long) arg0);
        return var3 == null ? 0 : var3.method143(14);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)Ltf;")
    private final class109 method1107(byte arg0, int arg1, int arg2) {
        class109 var4 = (class109) this.field2316.method23(216, (long) arg1);
        if (var4 != null && arg2 == 0 && !var4.field1517 && var4.field1519) {
            var4.method1115(-122);
            var4 = null;
        }
        field2309++;
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field2319 == null || this.field2310[arg1] == -1) {
                    if (this.field2303.method633(-30387)) {
                        return null;
                    }
                    var4 = this.field2303.method634(arg0 ^ 0xFFFFFF8D, arg1, true, (byte) 2, this.field2322);
                } else {
                    var4 = this.field2308.method61(this.field2319, arg1, (byte) -70);
                }
            } else if (arg2 == 1) {
                if (this.field2319 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2308.method60(this.field2319, arg1, (byte) -115);
            } else if (arg2 == 2) {
                if (this.field2319 == null) {
                    throw new RuntimeException();
                }
                if (this.field2310[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2303.method628(arg0 + 18)) {
                    return null;
                }
                var4 = this.field2303.method634(arg0 - 101, arg1, false, (byte) 2, this.field2322);
            } else {
                throw new RuntimeException();
            }
            this.field2316.method20(var4, (long) arg1, 0);
        }
        if (var4.field1519) {
            return null;
        } else if (arg0 == 2) {
            byte[] var5 = var4.method142(67);
            if (!var4 instanceof class19) {
                try {
                    if (var5 == null || var5.length <= 2) {
                        throw new RuntimeException();
                    }
                    class296.field4664.reset();
                    class296.field4664.update(var5, 0, var5.length - 2);
                    int var6 = (int) class296.field4664.getValue();
                    if (this.field2328.field4544[arg1] != var6) {
                        throw new RuntimeException();
                    }
                    this.field2303.field1338 = 0;
                    this.field2303.field1339 = 0;
                } catch (RuntimeException var12) {
                    this.field2303.method621(false);
                    var4.method1115(-23);
                    if (var4.field1517 && !this.field2303.method633(-30387)) {
                        class229 var7 = this.field2303.method634(-109, arg1, true, (byte) 2, this.field2322);
                        this.field2316.method20(var7, (long) arg1, arg0 - 2);
                    }
                    return null;
                }
                var5[var5.length - 2] = (byte) (this.field2328.field4545[arg1] >>> 8);
                var5[var5.length - 1] = (byte) this.field2328.field4545[arg1];
                if (this.field2319 != null) {
                    this.field2308.method59(var5, (byte) -90, arg1, this.field2319);
                    if (this.field2310[arg1] != 1) {
                        this.field2331++;
                        this.field2310[arg1] = 1;
                    }
                }
                if (!var4.field1517) {
                    var4.method1115(24);
                }
                return var4;
            }
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class296.field4664.reset();
                class296.field4664.update(var5, 0, var5.length - 2);
                int var8 = (int) class296.field4664.getValue();
                if (this.field2328.field4544[arg1] != var8) {
                    throw new RuntimeException();
                }
                int var9 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field2328.field4545[arg1] & 0xFFFF) != var9) {
                    throw new RuntimeException();
                }
                if (this.field2310[arg1] != 1) {
                    this.field2331++;
                    this.field2310[arg1] = 1;
                }
                if (!var4.field1517) {
                    var4.method1115(-121);
                }
                return var4;
            } catch (Exception var11) {
                this.field2310[arg1] = -1;
                var4.method1115(arg0 ^ 0x5F);
                if (var4.field1517 && !this.field2303.method633(arg0 - 30389)) {
                    class229 var10 = this.field2303.method634(-127, arg1, true, (byte) 2, this.field2322);
                    this.field2316.method20(var10, (long) arg1, arg0 ^ 0x2);
                }
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(B)Luj;")
    public final class287 method41(byte arg0) {
        field2315++;
        if (arg0 < 51) {
            this.method50(-45, (byte) 102);
        }
        if (this.field2328 != null) {
            return this.field2328;
        }
        if (this.field2327 == null) {
            if (this.field2303.method633(-30387)) {
                return null;
            }
            this.field2327 = this.field2303.method634(-81, this.field2322, true, (byte) 0, 255);
        }
        if (this.field2327.field1519) {
            return null;
        }
        byte[] var2 = this.field2327.method142(109);
        if (this.field2327 instanceof class19) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2328 = new class287(var2, this.field2320);
                if (this.field2328.field4547 != this.field2314) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2328 = null;
                if (this.field2303.method633(-30387)) {
                    this.field2327 = null;
                } else {
                    this.field2327 = this.field2303.method634(-91, this.field2322, true, (byte) 0, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2328 = new class287(var2, this.field2320);
            } catch (RuntimeException var4) {
                this.field2303.method621(false);
                this.field2328 = null;
                if (this.field2303.method633(-30387)) {
                    this.field2327 = null;
                } else {
                    this.field2327 = this.field2303.method634(-101, this.field2322, true, (byte) 0, 255);
                }
                return null;
            }
            if (this.field2305 != null) {
                this.field2308.method59(var2, (byte) 120, this.field2322, this.field2305);
            }
        }
        this.field2327 = null;
        if (this.field2319 != null) {
            this.field2310 = new byte[this.field2328.field4532];
            this.field2331 = 0;
        }
        return this.field2328;
    }

    @OriginalMember(owner = "client!j", name = "<init>", descriptor = "(ILkb;Lkb;Lbi;Lig;IIZ)V")
    public class168(int arg0, class54 arg1, class54 arg2, class94 arg3, class9 arg4, int arg5, int arg6, boolean arg7) {
        this.field2319 = arg1;
        this.field2322 = arg0;
        if (this.field2319 == null) {
            this.field2335 = false;
        } else {
            this.field2335 = true;
            this.field2336 = new class148();
        }
        this.field2303 = arg3;
        this.field2308 = arg4;
        this.field2314 = arg6;
        this.field2339 = arg7;
        this.field2320 = arg5;
        this.field2305 = arg2;
        if (this.field2305 != null) {
            this.field2327 = this.field2308.method61(this.field2305, this.field2322, (byte) -70);
        }
    }
}
