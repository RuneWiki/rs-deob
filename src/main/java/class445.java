import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class445 {

    @OriginalMember(owner = "client!p", name = "a", descriptor = "Lql;")
    private class346 field6513 = new class346();

    @OriginalMember(owner = "client!p", name = "f", descriptor = "Lql;")
    private class346 field6518 = new class346();

    @OriginalMember(owner = "client!p", name = "r", descriptor = "Lql;")
    private class346 field6530 = new class346();

    @OriginalMember(owner = "client!p", name = "s", descriptor = "Lql;")
    private class346 field6531 = new class346();

    @OriginalMember(owner = "client!p", name = "w", descriptor = "Lnj;")
    private class228 field6535 = new class228(4);

    @OriginalMember(owner = "client!p", name = "A", descriptor = "B")
    private byte field6539 = 0;

    @OriginalMember(owner = "client!p", name = "y", descriptor = "I")
    public volatile int field6537 = 0;

    @OriginalMember(owner = "client!p", name = "B", descriptor = "I")
    public volatile int field6540 = 0;

    @OriginalMember(owner = "client!p", name = "z", descriptor = "Lnj;")
    private class228 field6538 = new class228(8);

    @OriginalMember(owner = "client!p", name = "k", descriptor = "Lab;")
    public static class236 field6523 = new class236();

    @OriginalMember(owner = "client!p", name = "b", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!p", name = "c", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!p", name = "d", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!p", name = "e", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!p", name = "g", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!p", name = "h", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!p", name = "i", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!p", name = "j", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!p", name = "l", descriptor = "I")
    public static int field6524;

    @OriginalMember(owner = "client!p", name = "m", descriptor = "I")
    public static int field6525;

    @OriginalMember(owner = "client!p", name = "n", descriptor = "I")
    public static int field6526;

    @OriginalMember(owner = "client!p", name = "o", descriptor = "I")
    public static int field6527;

    @OriginalMember(owner = "client!p", name = "p", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!p", name = "q", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!p", name = "t", descriptor = "I")
    public static int field6532;

    @OriginalMember(owner = "client!p", name = "v", descriptor = "I")
    private int field6534;

    @OriginalMember(owner = "client!p", name = "x", descriptor = "J")
    private long field6536;

    @OriginalMember(owner = "client!p", name = "C", descriptor = "Lsf;")
    private class142 field6541;

    @OriginalMember(owner = "client!p", name = "u", descriptor = "Luq;")
    private class233 field6533;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(B)V", line = 3)
    public final void method2794(byte arg0) {
        field6525++;
        if (this.field6533 != null) {
            this.field6533.method1400((byte) -96);
        }
        if (arg0 != 27) {
            this.method2796(-101);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Luq;BZ)V", line = 17)
    public final void method2795(class233 arg0, byte arg1, boolean arg2) {
        field6516++;
        if (this.field6533 != null) {
            try {
                this.field6533.method1398((byte) 97);
            } catch (Exception var8) {
            }
            this.field6533 = null;
        }
        this.field6533 = arg0;
        this.method2805(arg1 ^ 0x34F6);
        this.method2798(arg2, (byte) -2);
        this.field6541 = null;
        this.field6538.field3029 = 0;
        while (true) {
            class142 var4 = (class142) this.field6518.method2246((byte) -100);
            if (var4 == null) {
                while (true) {
                    class142 var5 = (class142) this.field6531.method2246((byte) -120);
                    if (var5 == null) {
                        if (this.field6539 != 0) {
                            try {
                                this.field6535.field3029 = 0;
                                this.field6535.method1346(4, 32767);
                                this.field6535.method1346(this.field6539, arg1 ^ 0x7FE4);
                                this.field6535.method1326(0, arg1 ^ 0xFFFFFF85);
                                this.field6533.method1401(3, 0, 4, this.field6535.field3040);
                            } catch (IOException var7) {
                                try {
                                    this.field6533.method1398((byte) -86);
                                } catch (Exception var6) {
                                }
                                this.field6540 = -2;
                                this.field6537++;
                                this.field6533 = null;
                            }
                        }
                        this.field6534 = 0;
                        this.field6536 = class114.method735(110);
                        if (arg1 == 27) {
                            return;
                        } else {
                            this.field6531 = null;
                            return;
                        }
                    }
                    this.field6530.method2245(var5, (byte) -111);
                }
            }
            this.field6513.method2245(var4, (byte) -67);
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(I)I", line = 89)
    private final int method2796(int arg0) {
        if (arg0 == -8917) {
            field6522++;
            return this.field6530.method2252((byte) 118) + this.field6531.method2252((byte) 115);
        } else {
            return 78;
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(I)Z", line = 101)
    public final boolean method2797(int arg0) {
        if (arg0 == 20) {
            field6529++;
            return this.method2796(arg0 - 8937) >= 20;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ZB)V", line = 113)
    public final void method2798(boolean arg0, byte arg1) {
        field6521++;
        if (this.field6533 == null) {
            return;
        }
        try {
            this.field6535.field3029 = 0;
            this.field6535.method1346(arg0 ? 2 : 3, 32767);
            if (arg1 == -2) {
                this.field6535.method1365((byte) 76, 0);
                this.field6533.method1401(3, 0, 4, this.field6535.field3040);
            }
        } catch (IOException var4) {
            try {
                this.field6533.method1398((byte) -106);
            } catch (Exception var3) {
            }
            this.field6533 = null;
            this.field6537++;
            this.field6540 = -2;
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(IIBZI)Lsf;", line = 141)
    public final class142 method2799(int arg0, int arg1, byte arg2, boolean arg3, int arg4) {
        field6514++;
        long var6 = (long) ((arg4 << 16) + arg1);
        class142 var8 = new class142();
        var8.field1926 = arg2;
        int var9 = 42 % ((arg0 - 56) / 48);
        var8.field2962 = var6;
        var8.field49 = arg3;
        if (arg3) {
            if (this.method2801(false) >= 20) {
                throw new RuntimeException();
            }
            this.field6513.method2245(var8, (byte) -119);
        } else if (this.method2796(-8917) < 20) {
            this.field6530.method2245(var8, (byte) -69);
        } else {
            throw new RuntimeException();
        }
        return var8;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(I)Z", line = 182)
    public final boolean method2800(int arg0) {
        if (arg0 != -21) {
            this.method2794((byte) 30);
        }
        field6524++;
        return this.method2801(false) >= 20;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Z)I", line = 200)
    public final int method2801(boolean arg0) {
        field6527++;
        if (arg0) {
            this.method2805(25);
        }
        return this.field6513.method2252((byte) 115) + this.field6518.method2252((byte) 127);
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V", line = 211)
    public final void method2802(byte arg0) {
        if (this.field6533 != null) {
            this.field6533.method1398((byte) -84);
        }
        int var2 = -122 / ((-arg0 - 13) / 55);
        field6515++;
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(B)V", line = 227)
    public static void method2803(byte arg0) {
        field6523 = null;
        int var1 = 2 / ((arg0 - 3) / 55);
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(I)Z", line = 239)
    public final boolean method2804(int arg0) {
        if (this.field6533 != null) {
            long var2 = class114.method735(115);
            int var4 = (int) (var2 - this.field6536);
            this.field6536 = var2;
            if (var4 > 200) {
                var4 = 200;
            }
            this.field6534 += var4;
            if (this.field6534 > 30000) {
                try {
                    this.field6533.method1398((byte) 127);
                } catch (Exception var27) {
                }
                this.field6533 = null;
            }
        }
        field6520++;
        if (arg0 != 4) {
            return false;
        } else if (this.field6533 == null) {
            return this.method2801(false) == 0 && this.method2796(arg0 ^ 0xFFFFDD2F) == 0;
        } else {
            try {
                this.field6533.method1396(5000);
                for (class142 var5 = (class142) this.field6513.method2250(1580); var5 != null; var5 = (class142) this.field6513.method2244(0)) {
                    this.field6535.field3029 = 0;
                    this.field6535.method1346(1, 32767);
                    this.field6535.method1365((byte) 76, (int) var5.field2962);
                    this.field6533.method1401(3, 0, 4, this.field6535.field3040);
                    this.field6518.method2245(var5, (byte) -49);
                }
                for (class142 var6 = (class142) this.field6530.method2250(arg0 ^ 0x628); var6 != null; var6 = (class142) this.field6530.method2244(0)) {
                    this.field6535.field3029 = 0;
                    this.field6535.method1346(0, arg0 ^ 0x7FFB);
                    this.field6535.method1365((byte) 76, (int) var6.field2962);
                    this.field6533.method1401(arg0 - 1, 0, 4, this.field6535.field3040);
                    this.field6531.method2245(var6, (byte) -50);
                }
                for (int var7 = 0; var7 < 100; var7++) {
                    int var8 = this.field6533.method1394(true);
                    if (var8 < 0) {
                        throw new IOException();
                    }
                    if (var8 == 0) {
                        break;
                    }
                    this.field6534 = 0;
                    byte var9 = 0;
                    if (this.field6541 == null) {
                        var9 = 8;
                    } else if (this.field6541.field1927 == 0) {
                        var9 = 1;
                    }
                    if (var9 > 0) {
                        int var10 = var9 - this.field6538.field3029;
                        if (var10 > var8) {
                            var10 = var8;
                        }
                        this.field6533.method1397(false, this.field6538.field3029, this.field6538.field3040, var10);
                        if (this.field6539 != 0) {
                            for (int var11 = 0; var11 < var10; var11++) {
                                this.field6538.field3040[this.field6538.field3029 + var11] = (byte) class399.method2571(this.field6538.field3040[this.field6538.field3029 + var11], this.field6539);
                            }
                        }
                        this.field6538.field3029 += var10;
                        if (this.field6538.field3029 >= var9) {
                            if (this.field6541 == null) {
                                this.field6538.field3029 = 0;
                                int var12 = this.field6538.method1348(-123);
                                int var13 = this.field6538.method1343(255);
                                int var14 = this.field6538.method1348(-126);
                                int var15 = this.field6538.method1344((byte) 80);
                                int var16 = var14 & 0x7F;
                                boolean var17 = (var14 & 0x80) != 0;
                                long var18 = (long) ((var12 << 16) + var13);
                                Object var20 = null;
                                class142 var21;
                                if (var17) {
                                    for (var21 = (class142) this.field6531.method2250(1580); var21 != null && var21.field2962 != var18; var21 = (class142) this.field6531.method2244(arg0 - 4)) {
                                    }
                                } else {
                                    for (var21 = (class142) this.field6518.method2250(1580); var21 != null && var21.field2962 != var18; var21 = (class142) this.field6518.method2244(0)) {
                                    }
                                }
                                if (var21 == null) {
                                    throw new IOException();
                                }
                                int var22 = var16 == 0 ? 5 : 9;
                                this.field6541 = var21;
                                this.field6541.field1928 = new class228(this.field6541.field1926 + var15 + var22);
                                this.field6541.field1928.method1346(var16, arg0 + 32763);
                                this.field6541.field1928.method1330(var15, -125);
                                this.field6538.field3029 = 0;
                                this.field6541.field1927 = 8;
                            } else if (this.field6541.field1927 != 0) {
                                throw new IOException();
                            } else if (this.field6538.field3040[0] == -1) {
                                this.field6538.field3029 = 0;
                                this.field6541.field1927 = 1;
                            } else {
                                this.field6541 = null;
                            }
                        }
                    } else {
                        int var23 = this.field6541.field1928.field3040.length - this.field6541.field1926;
                        int var24 = 512 - this.field6541.field1927;
                        if (var23 - this.field6541.field1928.field3029 < var24) {
                            var24 = var23 - this.field6541.field1928.field3029;
                        }
                        if (var8 < var24) {
                            var24 = var8;
                        }
                        this.field6533.method1397(false, this.field6541.field1928.field3029, this.field6541.field1928.field3040, var24);
                        if (this.field6539 != 0) {
                            for (int var25 = 0; var25 < var24; var25++) {
                                this.field6541.field1928.field3040[this.field6541.field1928.field3029 + var25] = (byte) class399.method2571(this.field6541.field1928.field3040[this.field6541.field1928.field3029 + var25], this.field6539);
                            }
                        }
                        this.field6541.field1928.field3029 += var24;
                        this.field6541.field1927 += var24;
                        if (this.field6541.field1928.field3029 == var23) {
                            this.field6541.method1302(true);
                            this.field6541.field50 = false;
                            this.field6541 = null;
                        } else if (this.field6541.field1927 == 512) {
                            this.field6541.field1927 = 0;
                        }
                    }
                }
                return true;
            } catch (IOException var28) {
                try {
                    this.field6533.method1398((byte) -93);
                } catch (Exception var26) {
                }
                this.field6540 = -2;
                this.field6533 = null;
                this.field6537++;
                return this.method2801(false) == 0 && this.method2796(arg0 - 8921) == 0;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V", line = 513)
    private final void method2805(int arg0) {
        field6526++;
        if (this.field6533 == null) {
            return;
        }
        try {
            this.field6535.field3029 = 0;
            if (arg0 != 13549) {
                this.field6533 = null;
            }
            this.field6535.method1346(6, arg0 ^ 0x4B12);
            this.field6535.method1365((byte) 76, 3);
            this.field6533.method1401(3, 0, 4, this.field6535.field3040);
        } catch (IOException var3) {
            try {
                this.field6533.method1398((byte) 69);
            } catch (Exception var2) {
            }
            this.field6537++;
            this.field6540 = -2;
            this.field6533 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V", line = 542)
    public final void method2806(int arg0) {
        try {
            this.field6533.method1398((byte) 123);
        } catch (Exception var2) {
        }
        field6528++;
        this.field6540 = -1;
        this.field6537++;
        if (arg0 != -21947) {
            this.method2795((class233) null, (byte) -7, false);
        }
        this.field6533 = null;
        this.field6539 = (byte) ((int) (Math.random() * 255.0D + 1.0D));
    }

    @OriginalMember(owner = "client!p", name = "d", descriptor = "(B)Z", line = 561)
    public static final boolean method2807(byte arg0) {
        if (arg0 < 40) {
            field6523 = null;
        }
        field6519++;
        if (class329.field4789) {
            try {
                class421.method2690(class76.field1085.field519, "showVideoAd", -27444);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!p", name = "g", descriptor = "(I)V", line = 589)
    public final void method2808(int arg0) {
        field6517++;
        if (this.field6533 == null) {
            return;
        }
        try {
            if (arg0 > -3) {
                this.method2805(91);
            }
            this.field6535.field3029 = 0;
            this.field6535.method1346(7, 32767);
            this.field6535.method1365((byte) 76, 0);
            this.field6533.method1401(3, 0, 4, this.field6535.field3040);
        } catch (IOException var3) {
            try {
                this.field6533.method1398((byte) 49);
            } catch (Exception var2) {
            }
            this.field6537++;
            this.field6533 = null;
            this.field6540 = -2;
        }
    }
}
