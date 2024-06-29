import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class769 {

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "Lut;")
    private class136 field10566 = new class136();

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lut;")
    private class136 field10574 = new class136();

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Lut;")
    private class136 field10575 = new class136();

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lut;")
    private class136 field10578 = new class136();

    @OriginalMember(owner = "client!ob", name = "w", descriptor = "Les;")
    private class403 field10581 = new class403(4);

    @OriginalMember(owner = "client!ob", name = "C", descriptor = "B")
    private byte field10587 = 0;

    @OriginalMember(owner = "client!ob", name = "z", descriptor = "I")
    public volatile int field10584 = 0;

    @OriginalMember(owner = "client!ob", name = "A", descriptor = "I")
    public volatile int field10585 = 0;

    @OriginalMember(owner = "client!ob", name = "B", descriptor = "Les;")
    private class403 field10586 = new class403(8);

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field10561 = -1;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "Z")
    public static boolean field10572 = false;

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "Lde;")
    public static class558 field10571 = new class558("INTBETA", "office", "_intbeta", 6);

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field10559;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field10560;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field10562;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field10563;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field10564;

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "I")
    public static int field10565;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field10567;

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "I")
    public static int field10568;

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "I")
    public static int field10569;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "I")
    public static int field10570;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "I")
    public static int field10573;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field10576;

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "I")
    public static int field10577;

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "I")
    public static int field10579;

    @OriginalMember(owner = "client!ob", name = "x", descriptor = "I")
    private int field10582;

    @OriginalMember(owner = "client!ob", name = "v", descriptor = "J")
    private long field10580;

    @OriginalMember(owner = "client!ob", name = "D", descriptor = "Lkc;")
    private class145 field10588;

    @OriginalMember(owner = "client!ob", name = "y", descriptor = "Lwo;")
    private class775 field10583;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(B)V", line = 4)
    public final void method4256(byte arg0) {
        field10559++;
        if (this.field10583 == null) {
            return;
        }
        if (arg0 != -49) {
            method4268(-80);
        }
        try {
            this.field10581.field5262 = 0;
            this.field10581.method2353(arg0 ^ 0x64, 7);
            this.field10581.method2423((byte) -104, 0);
            this.field10583.method4307(this.field10581.field5275, 4, (byte) 125, 0);
        } catch (IOException var3) {
            try {
                this.field10583.method4304(false);
            } catch (Exception var2) {
            }
            this.field10584++;
            this.field10585 = -2;
            this.field10583 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V", line = 32)
    public final void method4257(int arg0) {
        field10567++;
        if (arg0 != -1) {
            this.method4266(-77, true);
        }
        if (this.field10583 != null) {
            this.field10583.method4304(false);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Lwo;ZB)V", line = 46)
    public final void method4258(class775 arg0, boolean arg1, byte arg2) {
        if (this.field10583 != null) {
            try {
                this.field10583.method4304(false);
            } catch (Exception var8) {
            }
            this.field10583 = null;
        }
        field10565++;
        if (arg2 != -83) {
            return;
        }
        this.field10583 = arg0;
        this.method4264((byte) 126);
        this.method4266(-119, arg1);
        this.field10586.field5262 = 0;
        this.field10588 = null;
        while (true) {
            class145 var4 = (class145) this.field10574.method1006(24360);
            if (var4 == null) {
                while (true) {
                    class145 var5 = (class145) this.field10578.method1006(arg2 + 24443);
                    if (var5 == null) {
                        if (this.field10587 != 0) {
                            try {
                                this.field10581.field5262 = 0;
                                this.field10581.method2353(arg2 ^ 0x2A, 4);
                                this.field10581.method2353(-126, this.field10587);
                                this.field10581.method2369(-18090, 0);
                                this.field10583.method4307(this.field10581.field5275, 4, (byte) 77, 0);
                            } catch (IOException var7) {
                                try {
                                    this.field10583.method4304(false);
                                } catch (Exception var6) {
                                }
                                this.field10583 = null;
                                this.field10584++;
                                this.field10585 = -2;
                            }
                        }
                        this.field10582 = 0;
                        this.field10580 = class349.method2069(true);
                        return;
                    }
                    this.field10575.method1005(-37, var5);
                }
            }
            this.field10566.method1005(-54, var4);
        }
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(I)Z", line = 119)
    public final boolean method4259(int arg0) {
        if (arg0 != 127) {
            method4268(81);
        }
        field10560++;
        return this.method4263(10530) >= 20;
    }

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "(I)V", line = 131)
    public final void method4260(int arg0) {
        field10579++;
        try {
            this.field10583.method4304(false);
        } catch (Exception var2) {
        }
        this.field10585 = -1;
        this.field10583 = null;
        this.field10584++;
        this.field10587 = (byte) ((int) (Math.random() * (double) arg0 + 1.0D));
    }

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "(I)Z", line = 148)
    public final boolean method4261(int arg0) {
        if (arg0 == 2) {
            field10564++;
            return this.method4269(1104) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZBBI)Lkc;", line = 163)
    public final class145 method4262(int arg0, boolean arg1, byte arg2, byte arg3, int arg4) {
        if (arg2 != 17) {
            method4268(90);
        }
        field10562++;
        long var6 = (long) ((arg4 << 16) + arg0);
        class145 var8 = new class145();
        var8.field378 = arg1;
        var8.field1894 = var6;
        var8.field1823 = arg3;
        if (arg1) {
            if (this.method4269(1104) >= 20) {
                throw new RuntimeException();
            }
            this.field10566.method1005(-26, var8);
        } else if (this.method4263(10530) < 20) {
            this.field10575.method1005(-91, var8);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "(I)I", line = 208)
    private final int method4263(int arg0) {
        if (arg0 != 10530) {
            this.method4266(-10, false);
        }
        field10577++;
        return this.field10575.method1001(0) + this.field10578.method1001(0);
    }

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "(B)V", line = 220)
    private final void method4264(byte arg0) {
        field10569++;
        if (this.field10583 == null) {
            return;
        }
        try {
            this.field10581.field5262 = 0;
            if (arg0 <= 125) {
                this.field10566 = null;
            }
            this.field10581.method2353(-127, 6);
            this.field10581.method2423((byte) -104, 3);
            this.field10583.method4307(this.field10581.field5275, 4, (byte) 107, 0);
        } catch (IOException var3) {
            try {
                this.field10583.method4304(false);
            } catch (Exception var2) {
            }
            this.field10584++;
            this.field10583 = null;
            this.field10585 = -2;
        }
    }

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "(I)V", line = 249)
    public final void method4265(int arg0) {
        if (arg0 != -22301) {
            this.method4266(-48, false);
        }
        field10563++;
        if (this.field10583 != null) {
            this.field10583.method4303(arg0 ^ 0xFFFFA8E3);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IZ)V", line = 266)
    public final void method4266(int arg0, boolean arg1) {
        field10576++;
        if (this.field10583 == null || arg0 > -42) {
            return;
        }
        try {
            this.field10581.field5262 = 0;
            this.field10581.method2353(-78, arg1 ? 2 : 3);
            this.field10581.method2423((byte) -104, 0);
            this.field10583.method4307(this.field10581.field5275, 4, (byte) 62, 0);
        } catch (IOException var4) {
            try {
                this.field10583.method4304(false);
            } catch (Exception var3) {
            }
            this.field10585 = -2;
            this.field10583 = null;
            this.field10584++;
        }
    }

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "(I)Z", line = 293)
    public final boolean method4267(int arg0) {
        if (this.field10583 != null) {
            long var2 = class349.method2069(true);
            int var4 = (int) (var2 - this.field10580);
            if (var4 > 200) {
                var4 = 200;
            }
            this.field10580 = var2;
            this.field10582 += var4;
            if (this.field10582 > 30000) {
                try {
                    this.field10583.method4304(false);
                } catch (Exception var27) {
                }
                this.field10583 = null;
            }
        }
        field10568++;
        if (this.field10583 == null) {
            return this.method4269(1104) == 0 && this.method4263(10530) == 0;
        }
        try {
            this.field10583.method4306(118);
            for (class145 var5 = (class145) this.field10566.method1003((byte) 53); var5 != null; var5 = (class145) this.field10566.method1004(true)) {
                this.field10581.field5262 = 0;
                this.field10581.method2353(arg0 ^ 0xFFFFFFED, 1);
                this.field10581.method2423((byte) -104, (int) var5.field1894);
                this.field10583.method4307(this.field10581.field5275, 4, (byte) 102, 0);
                this.field10574.method1005(arg0 ^ 0x3A, var5);
            }
            if (arg0 != -101) {
                this.method4269(-128);
            }
            for (class145 var6 = (class145) this.field10575.method1003((byte) 53); var6 != null; var6 = (class145) this.field10575.method1004(true)) {
                this.field10581.field5262 = 0;
                this.field10581.method2353(arg0 ^ 0xFFFFFFC5, 0);
                this.field10581.method2423((byte) -104, (int) var6.field1894);
                this.field10583.method4307(this.field10581.field5275, 4, (byte) 100, 0);
                this.field10578.method1005(arg0 + 29, var6);
            }
            for (int var7 = 0; var7 < 100; var7++) {
                int var8 = this.field10583.method4305(arg0 - 25);
                if (var8 < 0) {
                    throw new IOException();
                }
                if (var8 == 0) {
                    break;
                }
                this.field10582 = 0;
                byte var9 = 0;
                if (this.field10588 == null) {
                    var9 = 8;
                } else if (this.field10588.field1826 == 0) {
                    var9 = 1;
                }
                if (var9 <= 0) {
                    int var10 = this.field10588.field1821.field5275.length - this.field10588.field1823;
                    int var11 = 512 - this.field10588.field1826;
                    if (var11 > var10 - this.field10588.field1821.field5262) {
                        var11 = var10 - this.field10588.field1821.field5262;
                    }
                    if (var11 > var8) {
                        var11 = var8;
                    }
                    this.field10583.method4308(var11, this.field10588.field1821.field5262, true, this.field10588.field1821.field5275);
                    if (this.field10587 != 0) {
                        for (int var12 = 0; var12 < var11; var12++) {
                            this.field10588.field1821.field5275[this.field10588.field1821.field5262 + var12] = (byte) class241.method1459(this.field10588.field1821.field5275[this.field10588.field1821.field5262 + var12], this.field10587);
                        }
                    }
                    this.field10588.field1821.field5262 += var11;
                    this.field10588.field1826 += var11;
                    if (this.field10588.field1821.field5262 == var10) {
                        this.field10588.method1088(arg0 + 105);
                        this.field10588.field374 = false;
                        this.field10588 = null;
                    } else if (this.field10588.field1826 == 512) {
                        this.field10588.field1826 = 0;
                    }
                } else {
                    int var13 = var9 - this.field10586.field5262;
                    if (var8 < var13) {
                        var13 = var8;
                    }
                    this.field10583.method4308(var13, this.field10586.field5262, true, this.field10586.field5275);
                    if (this.field10587 != 0) {
                        for (int var14 = 0; var14 < var13; var14++) {
                            this.field10586.field5275[this.field10586.field5262 + var14] = (byte) class241.method1459(this.field10586.field5275[this.field10586.field5262 + var14], this.field10587);
                        }
                    }
                    this.field10586.field5262 += var13;
                    if (this.field10586.field5262 >= var9) {
                        if (this.field10588 == null) {
                            this.field10586.field5262 = 0;
                            int var15 = this.field10586.method2396((byte) -92);
                            int var16 = this.field10586.method2390((byte) -101);
                            int var17 = this.field10586.method2396((byte) -92);
                            int var18 = this.field10586.method2381((byte) 102);
                            int var19 = var17 & 0x7F;
                            boolean var20 = (var17 & 0x80) != 0;
                            long var21 = (long) ((var15 << 16) + var16);
                            Object var23 = null;
                            class145 var24;
                            if (var20) {
                                for (var24 = (class145) this.field10578.method1003((byte) 53); var24 != null && var24.field1894 != var21; var24 = (class145) this.field10578.method1004(true)) {
                                }
                            } else {
                                for (var24 = (class145) this.field10574.method1003((byte) 53); var24 != null && var24.field1894 != var21; var24 = (class145) this.field10574.method1004(true)) {
                                }
                            }
                            if (var24 == null) {
                                throw new IOException();
                            }
                            int var25 = var19 == 0 ? 5 : 9;
                            this.field10588 = var24;
                            this.field10588.field1821 = new class403(var18 + var25 + this.field10588.field1823);
                            this.field10588.field1821.method2353(104, var19);
                            this.field10588.field1821.method2391(-128, var18);
                            this.field10586.field5262 = 0;
                            this.field10588.field1826 = 8;
                        } else if (this.field10588.field1826 != 0) {
                            throw new IOException();
                        } else if (this.field10586.field5275[0] == -1) {
                            this.field10586.field5262 = 0;
                            this.field10588.field1826 = 1;
                        } else {
                            this.field10588 = null;
                        }
                    }
                }
            }
            return true;
        } catch (IOException var28) {
            try {
                this.field10583.method4304(false);
            } catch (Exception var26) {
            }
            this.field10585 = -2;
            this.field10583 = null;
            this.field10584++;
            return this.method4269(1104) == 0 && this.method4263(10530) == 0;
        }
    }

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "(I)V", line = 570)
    public static void method4268(int arg0) {
        field10571 = null;
        if (arg0 != 0) {
            field10572 = false;
        }
    }

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "(I)I", line = 585)
    public final int method4269(int arg0) {
        field10573++;
        return arg0 == 1104 ? this.field10566.method1001(0) + this.field10574.method1001(0) : -3;
    }
}
