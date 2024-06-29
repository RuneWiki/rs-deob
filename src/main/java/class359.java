import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!re")
public class class359 extends class351 {

    @OriginalMember(owner = "client!re", name = "y", descriptor = "I")
    private int field5108 = 0;

    @OriginalMember(owner = "client!re", name = "g", descriptor = "Lva;")
    private class288 field5090 = new class288(16);

    @OriginalMember(owner = "client!re", name = "N", descriptor = "I")
    private int field5123 = 0;

    @OriginalMember(owner = "client!re", name = "Q", descriptor = "Lwq;")
    private class92 field5126 = new class92();

    @OriginalMember(owner = "client!re", name = "T", descriptor = "J")
    private long field5128 = 0L;

    @OriginalMember(owner = "client!re", name = "L", descriptor = "I")
    private int field5121;

    @OriginalMember(owner = "client!re", name = "z", descriptor = "Lgb;")
    private class117 field5109;

    @OriginalMember(owner = "client!re", name = "P", descriptor = "Z")
    private boolean field5125;

    @OriginalMember(owner = "client!re", name = "O", descriptor = "Lwq;")
    private class92 field5124;

    @OriginalMember(owner = "client!re", name = "F", descriptor = "I")
    private int field5115;

    @OriginalMember(owner = "client!re", name = "i", descriptor = "Lgb;")
    private class117 field5092;

    @OriginalMember(owner = "client!re", name = "o", descriptor = "Lqs;")
    private class360 field5098;

    @OriginalMember(owner = "client!re", name = "j", descriptor = "I")
    private int field5093;

    @OriginalMember(owner = "client!re", name = "x", descriptor = "Lnh;")
    private class448 field5107;

    @OriginalMember(owner = "client!re", name = "S", descriptor = "Z")
    private boolean field5127;

    @OriginalMember(owner = "client!re", name = "t", descriptor = "Lia;")
    private class352 field5103;

    @OriginalMember(owner = "client!re", name = "w", descriptor = "[I")
    public static int[] field5106;

    @OriginalMember(owner = "client!re", name = "I", descriptor = "[S")
    public static short[] field5118;

    @OriginalMember(owner = "client!re", name = "K", descriptor = "Lfi;")
    public static class332 field5120;

    @OriginalMember(owner = "client!re", name = "f", descriptor = "I")
    public static int field5089;

    @OriginalMember(owner = "client!re", name = "h", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!re", name = "k", descriptor = "I")
    public static int field5094;

    @OriginalMember(owner = "client!re", name = "l", descriptor = "I")
    public static int field5095;

    @OriginalMember(owner = "client!re", name = "m", descriptor = "I")
    public static int field5096;

    @OriginalMember(owner = "client!re", name = "n", descriptor = "I")
    public static int field5097;

    @OriginalMember(owner = "client!re", name = "p", descriptor = "I")
    public static int field5099;

    @OriginalMember(owner = "client!re", name = "q", descriptor = "I")
    public static int field5100;

    @OriginalMember(owner = "client!re", name = "r", descriptor = "I")
    public static int field5101;

    @OriginalMember(owner = "client!re", name = "u", descriptor = "I")
    public static int field5104;

    @OriginalMember(owner = "client!re", name = "v", descriptor = "I")
    public static int field5105;

    @OriginalMember(owner = "client!re", name = "A", descriptor = "I")
    public static int field5110;

    @OriginalMember(owner = "client!re", name = "B", descriptor = "I")
    public static int field5111;

    @OriginalMember(owner = "client!re", name = "C", descriptor = "I")
    public static int field5112;

    @OriginalMember(owner = "client!re", name = "E", descriptor = "I")
    public static int field5114;

    @OriginalMember(owner = "client!re", name = "G", descriptor = "I")
    public static int field5116;

    @OriginalMember(owner = "client!re", name = "H", descriptor = "I")
    public static int field5117;

    @OriginalMember(owner = "client!re", name = "J", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!re", name = "s", descriptor = "Ler;")
    private class54 field5102;

    @OriginalMember(owner = "client!re", name = "M", descriptor = "Z")
    private boolean field5122;

    @OriginalMember(owner = "client!re", name = "D", descriptor = "[B")
    private byte[] field5113;

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(I)I")
    public final int method2297(int arg0) {
        field5101++;
        if (this.field5102 == null) {
            return 0;
        } else if (this.field5125) {
            if (arg0 != 0) {
                this.field5127 = true;
            }
            class406 var2 = this.field5124.method506((byte) -128);
            return var2 == null ? 0 : (int) var2.field5855;
        } else {
            return this.field5102.field629;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(Ltq;Ltq;I)V")
    public static final void method2298(class376 arg0, class376 arg1, int arg2) {
        class68.field787 = arg1;
        class86.field976 = arg0;
        field5112++;
        if (arg2 != 0) {
            method2307(-97, (class376) null);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(III)Z")
    public static final boolean method2299(int arg0, int arg1, int arg2) {
        if (arg1 != 1262026644) {
            return true;
        }
        field5114++;
        class88 var3 = class374.method2382(arg2, false);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        return var3.method484(arg0, false);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(B)I")
    public final int method2300(byte arg0) {
        if (arg0 >= -77) {
            return -108;
        } else {
            field5091++;
            return this.field5108;
        }
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(B)I")
    public final int method2301(byte arg0) {
        field5110++;
        if (this.method2240(255) == null) {
            return this.field5103 == null ? 0 : this.field5103.method770((byte) -126);
        } else {
            if (arg0 <= 94) {
                field5106 = null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!re", name = "c", descriptor = "(B)I")
    public static final int method2302(byte arg0) {
        int var1 = 80 / ((-arg0 - 18) / 55);
        field5100++;
        return ((class334.field4729 == 0 ? 0 : 1) << 21) + ((class401.field5730 == 0 ? 0 : 1) << 20) + (class433.field6227 << 17) + ((class18.field210 ? 1 : 0) << 16) + ((class254.field3656 ? 1 : 0) << 15) + ((class272.field3859 ? 1 : 0) << 13) + (class141.field1739 & 0x3 << 11) + ((class271.field3838 ? 1 : 0) << 6) + ((class286.field4013 ? 1 : 0) << 4) + ((class23.field289 & 0x7) + (((class210.field2997 ? 1 : 0) << 3) - -((class332.field4706 ? 1 : 0) << 5) - (-((class414.field5947 ? 1 : 0) << 8) + -((class20.field265 ? 1 : 0) << 9))) - -((class33.field381 ? 1 : 0) << 10)) - (-((class94.field1134 ? 1 : 0) << 19) - (((class355.field4999 == 0 ? 0 : 1) << 22) - -(class246.method1674((byte) 122) << 23))) - (-(class347.field4921 << 25) - (((class222.field3117 ? 1 : 0) << 27) + (class140.field1736 << 28)));
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(I)Ler;")
    public final class54 method2240(int arg0) {
        field5097++;
        if (this.field5102 != null) {
            return this.field5102;
        }
        if (this.field5103 == null) {
            if (this.field5098.method2327(true)) {
                return null;
            }
            this.field5103 = this.field5098.method2326(255, (byte) 0, false, true, this.field5121);
        }
        if (arg0 != 255) {
            return null;
        } else if (this.field5103.field4971) {
            return null;
        } else {
            byte[] var2 = this.field5103.method772(1);
            if (this.field5103 instanceof class229) {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field5102 = new class54(var2, this.field5115);
                    if (this.field5102.field643 != this.field5093) {
                        throw new RuntimeException();
                    }
                } catch (RuntimeException var3) {
                    this.field5102 = null;
                    if (this.field5098.method2327(true)) {
                        this.field5103 = null;
                    } else {
                        this.field5103 = this.field5098.method2326(255, (byte) 0, false, true, this.field5121);
                    }
                    return null;
                }
            } else {
                try {
                    if (var2 == null) {
                        throw new RuntimeException();
                    }
                    this.field5102 = new class54(var2, this.field5115);
                } catch (RuntimeException var4) {
                    this.field5098.method2328(-1);
                    this.field5102 = null;
                    if (this.field5098.method2327(true)) {
                        this.field5103 = null;
                    } else {
                        this.field5103 = this.field5098.method2326(255, (byte) 0, false, true, this.field5121);
                    }
                    return null;
                }
                if (this.field5092 != null) {
                    this.field5107.method2781(var2, 5, this.field5121, this.field5092);
                }
            }
            if (this.field5109 != null) {
                this.field5108 = 0;
                this.field5113 = new byte[this.field5102.field633];
            }
            this.field5103 = null;
            return this.field5102;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IIB)Lia;")
    private final class352 method2303(int arg0, int arg1, byte arg2) {
        field5104++;
        class352 var4 = (class352) this.field5090.method1888((long) arg0, (byte) -30);
        if (var4 != null && arg1 == 0 && !var4.field4974 && var4.field4971) {
            var4.method2594((byte) -22);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field5109 == null || this.field5113[arg0] == -1) {
                    if (this.field5098.method2327(true)) {
                        return null;
                    }
                    var4 = this.field5098.method2326(this.field5121, (byte) 2, false, true, arg0);
                } else {
                    var4 = this.field5107.method2784(arg0, this.field5109, false);
                }
            } else if (arg1 == 1) {
                if (this.field5109 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5107.method2783(this.field5109, arg0, -1077);
            } else if (arg1 == 2) {
                if (this.field5109 == null) {
                    throw new RuntimeException();
                }
                if (this.field5113[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5098.method2315((byte) 120)) {
                    return null;
                }
                var4 = this.field5098.method2326(this.field5121, (byte) 2, false, false, arg0);
            } else {
                throw new RuntimeException();
            }
            this.field5090.method1886(var4, (long) arg0, arg2 - 75);
        }
        if (var4.field4971) {
            return null;
        } else if (arg2 == 76) {
            byte[] var5 = var4.method772(1);
            if (!var4 instanceof class229) {
                try {
                    if (var5 == null || var5.length <= 2) {
                        throw new RuntimeException();
                    }
                    class49.field587.reset();
                    class49.field587.update(var5, 0, var5.length - 2);
                    int var6 = (int) class49.field587.getValue();
                    if (this.field5102.field641[arg0] != var6) {
                        throw new RuntimeException();
                    }
                    this.field5098.field5157 = 0;
                    this.field5098.field5159 = 0;
                } catch (RuntimeException var12) {
                    this.field5098.method2328(arg2 - 77);
                    var4.method2594((byte) -22);
                    if (var4.field4974 && !this.field5098.method2327(true)) {
                        class121 var7 = this.field5098.method2326(this.field5121, (byte) 2, false, true, arg0);
                        this.field5090.method1886(var7, (long) arg0, arg2 ^ 0x4D);
                    }
                    return null;
                }
                var5[var5.length - 2] = (byte) (this.field5102.field631[arg0] >>> 8);
                var5[var5.length - 1] = (byte) this.field5102.field631[arg0];
                if (this.field5109 != null) {
                    this.field5107.method2781(var5, 5, arg0, this.field5109);
                    if (this.field5113[arg0] != 1) {
                        this.field5108++;
                        this.field5113[arg0] = 1;
                    }
                }
                if (!var4.field4974) {
                    var4.method2594((byte) -22);
                }
                return var4;
            }
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class49.field587.reset();
                class49.field587.update(var5, 0, var5.length - 2);
                int var8 = (int) class49.field587.getValue();
                if (this.field5102.field641[arg0] != var8) {
                    throw new RuntimeException();
                }
                int var9 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
                if ((this.field5102.field631[arg0] & 0xFFFF) != var9) {
                    throw new RuntimeException();
                }
                if (this.field5113[arg0] != 1) {
                    this.field5108++;
                    this.field5113[arg0] = 1;
                }
                if (!var4.field4974) {
                    var4.method2594((byte) -22);
                }
                return var4;
            } catch (Exception var11) {
                this.field5113[arg0] = -1;
                var4.method2594((byte) -22);
                if (var4.field4974 && !this.field5098.method2327(true)) {
                    class121 var10 = this.field5098.method2326(this.field5121, (byte) 2, false, true, arg0);
                    this.field5090.method1886(var10, (long) arg0, 1);
                }
                return null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(B)V")
    public final void method2304(byte arg0) {
        if (arg0 != 24) {
            return;
        }
        field5099++;
        if (this.field5124 != null) {
            if (this.method2240(arg0 ^ 0xE7) == null) {
                return;
            }
            if (this.field5125) {
                boolean var2 = true;
                for (class406 var3 = this.field5124.method506((byte) -128); var3 != null; var3 = this.field5124.method514(true)) {
                    int var5 = (int) var3.field5855;
                    if (this.field5113[var5] == 0) {
                        this.method2303(var5, 1, (byte) 76);
                    }
                    if (this.field5113[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2594((byte) -22);
                    }
                }
                while (this.field5102.field640.length > this.field5123) {
                    if (this.field5102.field640[this.field5123] == 0) {
                        this.field5123++;
                    } else {
                        if (this.field5107.field6435 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field5113[this.field5123] == 0) {
                            this.method2303(this.field5123, 1, (byte) 76);
                        }
                        if (this.field5113[this.field5123] == 0) {
                            class406 var4 = new class406();
                            var4.field5855 = (long) this.field5123;
                            this.field5124.method509((byte) 122, var4);
                            var2 = false;
                        }
                        this.field5123++;
                    }
                }
                if (var2) {
                    this.field5125 = false;
                    this.field5123 = 0;
                }
            } else if (this.field5122) {
                boolean var6 = true;
                for (class406 var7 = this.field5124.method506((byte) -128); var7 != null; var7 = this.field5124.method514(true)) {
                    int var9 = (int) var7.field5855;
                    if (this.field5113[var9] != 1) {
                        this.method2303(var9, 2, (byte) 76);
                    }
                    if (this.field5113[var9] == 1) {
                        var7.method2594((byte) -22);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field5102.field640.length > this.field5123) {
                    if (this.field5102.field640[this.field5123] == 0) {
                        this.field5123++;
                    } else {
                        if (this.field5098.method2315((byte) 116)) {
                            var6 = false;
                            break;
                        }
                        if (this.field5113[this.field5123] != 1) {
                            this.method2303(this.field5123, 2, (byte) 76);
                        }
                        if (this.field5113[this.field5123] != 1) {
                            class406 var8 = new class406();
                            var8.field5855 = (long) this.field5123;
                            var6 = false;
                            this.field5124.method509((byte) 105, var8);
                        }
                        this.field5123++;
                    }
                }
                if (var6) {
                    this.field5122 = false;
                    this.field5123 = 0;
                }
            } else {
                this.field5124 = null;
            }
        }
        if (!this.field5127 || this.field5128 > class175.method1195(45)) {
            return;
        }
        for (class352 var10 = (class352) this.field5090.method1884(0); var10 != null; var10 = (class352) this.field5090.method1890(-1)) {
            if (!var10.field4971) {
                if (var10.field4973) {
                    if (!var10.field4974) {
                        throw new RuntimeException();
                    }
                    var10.method2594((byte) -22);
                } else {
                    var10.field4973 = true;
                }
            }
        }
        this.field5128 = class175.method1195(arg0 ^ 0x3) + 1000L;
    }

    @OriginalMember(owner = "client!re", name = "d", descriptor = "(I)V")
    public final void method2305(int arg0) {
        field5094++;
        if (arg0 != -7530) {
            this.method2297(-114);
        }
        if (this.field5109 != null) {
            this.field5122 = true;
            if (this.field5124 == null) {
                this.field5124 = new class92();
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(I)V")
    public final void method2306(int arg0) {
        field5116++;
        if (this.field5124 == null || this.method2240(255) == null || arg0 != -1) {
            return;
        }
        for (class406 var2 = this.field5126.method506((byte) -128); var2 != null; var2 = this.field5126.method514(true)) {
            int var3 = (int) var2.field5855;
            if (var3 < 0 || this.field5102.field633 <= var3 || this.field5102.field640[var3] == 0) {
                var2.method2594((byte) -22);
            } else {
                if (this.field5113[var3] == 0) {
                    this.method2303(var3, 1, (byte) 76);
                }
                if (this.field5113[var3] == -1) {
                    this.method2303(var3, 2, (byte) 76);
                }
                if (this.field5113[var3] == 1) {
                    var2.method2594((byte) -22);
                }
            }
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILtq;)V")
    public static final void method2307(int arg0, class376 arg1) {
        class323.field4606 = arg1;
        field5096++;
        class323.field4606.method2415(35, (byte) 56);
        if (arg0 != 0) {
            method2308(34);
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(IB)I")
    public final int method2243(int arg0, byte arg1) {
        field5111++;
        class352 var3 = (class352) this.field5090.method1888((long) arg0, (byte) -30);
        if (arg1 != 1) {
            this.field5115 = -12;
        }
        return var3 == null ? 0 : var3.method770((byte) -125);
    }

    @OriginalMember(owner = "client!re", name = "f", descriptor = "(I)V")
    public static final void method2308(int arg0) {
        class237 var1 = class5.field84;
        synchronized (class5.field84) {
            class5.field84.method1618(arg0);
        }
        field5095++;
    }

    @OriginalMember(owner = "client!re", name = "b", descriptor = "(IB)V")
    public final void method2244(int arg0, byte arg1) {
        field5119++;
        if (this.field5109 == null) {
            return;
        }
        if (arg1 != 31) {
            method2302((byte) 31);
        }
        for (class406 var3 = this.field5126.method506((byte) -128); var3 != null; var3 = this.field5126.method514(true)) {
            if (((long) arg0) == var3.field5855) {
                return;
            }
        }
        class406 var4 = new class406();
        var4.field5855 = (long) arg0;
        this.field5126.method509((byte) 127, var4);
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(ILdn;)Ljava/lang/String;")
    public static final String method2309(int arg0, class302 arg1) {
        field5089++;
        if (arg0 == 0) {
            return arg1.field4248 == null || arg1.field4248.length() <= 0 ? arg1.field4249 : arg1.field4249 + class214.field3028.method2331(25, class271.field3836) + arg1.field4248;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!re", name = "e", descriptor = "(B)I")
    public final int method2310(byte arg0) {
        field5105++;
        if (this.field5102 == null) {
            return 0;
        } else {
            if (arg0 > -5) {
                this.field5113 = null;
            }
            return this.field5102.field629;
        }
    }

    @OriginalMember(owner = "client!re", name = "a", descriptor = "(BI)[B")
    public final byte[] method2239(byte arg0, int arg1) {
        if (arg0 < 85) {
            this.field5121 = 57;
        }
        field5117++;
        class352 var3 = this.method2303(arg1, 0, (byte) 76);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method772(1);
            var3.method2594((byte) -22);
            return var4;
        }
    }

    @OriginalMember(owner = "client!re", name = "g", descriptor = "(I)V")
    public static void method2311(int arg0) {
        field5106 = null;
        field5120 = null;
        field5118 = null;
        int var1 = -64 % ((14 - arg0) / 34);
    }

    @OriginalMember(owner = "client!re", name = "<init>", descriptor = "(ILgb;Lgb;Lqs;Lnh;IIZ)V")
    public class359(int arg0, class117 arg1, class117 arg2, class360 arg3, class448 arg4, int arg5, int arg6, boolean arg7) {
        this.field5121 = arg0;
        this.field5109 = arg1;
        if (this.field5109 == null) {
            this.field5125 = false;
        } else {
            this.field5125 = true;
            this.field5124 = new class92();
        }
        this.field5115 = arg5;
        this.field5092 = arg2;
        this.field5098 = arg3;
        this.field5093 = arg6;
        this.field5107 = arg4;
        this.field5127 = arg7;
        if (this.field5092 != null) {
            this.field5103 = this.field5107.method2784(this.field5121, this.field5092, false);
        }
    }

    static {
        new class362("You have been kicked from the channel.", "Du wurdest aus dem Chatraum rausgeworfen.", "Vous avez été expulsé du canal.", "Você foi expulso do canal.");
        field5106 = new int[] { 28, 35, 40, 44 };
        field5118 = new short[] { 960, 957, -21568, -21571, 22464 };
        field5120 = new class332(5000);
    }
}
