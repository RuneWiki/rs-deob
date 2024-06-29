import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class36 {

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    private int field534 = 32;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "J")
    private long field550 = class247.method1762(19166);

    @OriginalMember(owner = "client!cd", name = "E", descriptor = "J")
    private long field564 = 0L;

    @OriginalMember(owner = "client!cd", name = "C", descriptor = "[Lcm;")
    private class258[] field562 = new class258[8];

    @OriginalMember(owner = "client!cd", name = "D", descriptor = "J")
    private long field563 = 0L;

    @OriginalMember(owner = "client!cd", name = "F", descriptor = "I")
    private int field565 = 0;

    @OriginalMember(owner = "client!cd", name = "H", descriptor = "Z")
    private boolean field567 = true;

    @OriginalMember(owner = "client!cd", name = "x", descriptor = "I")
    private int field557 = 0;

    @OriginalMember(owner = "client!cd", name = "z", descriptor = "I")
    private int field559 = 0;

    @OriginalMember(owner = "client!cd", name = "I", descriptor = "I")
    private int field568 = 0;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "[Lcm;")
    private class258[] field556 = new class258[8];

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "[I")
    public static int[] field545 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Z")
    public static boolean field552 = true;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field539 = 99;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "Lok;")
    public static class41 field554 = class137.method956("weiss:", 45);

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field536;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field541;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "I")
    public static int field543;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public static int field546;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public static int field548;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field549;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public static int field551;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public int field555;

    @OriginalMember(owner = "client!cd", name = "y", descriptor = "I")
    public int field558;

    @OriginalMember(owner = "client!cd", name = "A", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!cd", name = "B", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!cd", name = "G", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lcm;")
    private class258 field535;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "[I")
    public int[] field547;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 5)
    public final synchronized void method236(boolean arg0) {
        field551++;
        this.field567 = true;
        try {
            if (arg0) {
                this.method246((int[]) null, 0);
            }
            this.method247();
        } catch (Exception var3) {
            this.method241();
            this.field564 = class247.method1762(19166) + 2000L;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "()I", line = 26)
    public int method237() throws Exception {
        field537++;
        return this.field558;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLcm;I)V", line = 35)
    private final void method238(byte arg0, class258 arg1, int arg2) {
        int var4 = arg2 >> 5;
        class258 var5 = this.field562[var4];
        field538++;
        if (arg0 != -51) {
            method240(67, -127, (byte[]) null, true);
        }
        if (var5 == null) {
            this.field556[var4] = arg1;
        } else {
            var5.field4123 = arg1;
        }
        this.field562[var4] = arg1;
        arg1.field4124 = arg2;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V", line = 56)
    public void method239(int arg0) throws Exception {
        field543++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II[BZ)Z", line = 73)
    public static final boolean method240(int arg0, int arg1, byte[] arg2, boolean arg3) {
        field560++;
        boolean var4 = arg3;
        class112 var5 = new class112(arg2);
        int var6 = -1;
        label59: while (true) {
            int var7 = var5.method801(-128);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            boolean var8 = false;
            int var9 = 0;
            while (true) {
                while (!var8) {
                    int var11 = var5.method756(97);
                    if (var11 == 0) {
                        continue label59;
                    }
                    var9 += var11 - 1;
                    int var12 = var9 & 0x3F;
                    int var13 = var5.method792(2) >> 2;
                    int var14 = (var9 & 0xFE0) >> 6;
                    int var15 = arg1 + var12;
                    int var16 = arg0 + var14;
                    if (var16 > 0 && var15 > 0 && var16 < 103 && var15 < 103) {
                        class171 var17 = class234.method1684(-2441, var6);
                        if (var13 != 22 || class296.field4778 || var17.field2725 != 0 || var17.field2771 == 1 || var17.field2750) {
                            if (!var17.method1232(23190)) {
                                class283.field4601++;
                                var4 = false;
                            }
                            var8 = true;
                        }
                    }
                }
                int var10 = var5.method756(95);
                if (var10 == 0) {
                    break;
                }
                var5.method792(2);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "()V", line = 158)
    public void method241() {
        field546++;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(I)V", line = 165)
    public final synchronized void method242(int arg0) {
        if (arg0 != 0) {
            return;
        }
        if (class112.field1651 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class112.field1651.field1843[var3] == this) {
                    class112.field1651.field1843[var3] = null;
                }
                if (class112.field1651.field1843[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class112.field1651.field1844 = true;
                while (class112.field1651.field1847) {
                    class300.method2068(124, 50L);
                }
                class112.field1651 = null;
            }
        }
        field561++;
        this.method241();
        this.field547 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V", line = 210)
    public final void method243(byte arg0) {
        this.field567 = true;
        if (arg0 < 90) {
            this.field550 = -100L;
        }
        field540++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(II)V", line = 221)
    private final void method244(int arg0, int arg1) {
        if (arg0 > -94) {
            this.method248(true, (class258) null);
        }
        this.field568 -= arg1;
        field542++;
        if (this.field568 < 0) {
            this.field568 = 0;
        }
        if (this.field535 != null) {
            this.field535.method1054(arg1);
        }
    }

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "()V", line = 240)
    public void method245() throws Exception {
        field541++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "([II)V", line = 252)
    private final void method246(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class112.field1656) {
            var3 = arg1 << 1;
        }
        class21.method142(arg0, 0, var3);
        this.field568 -= arg1;
        if (this.field535 != null && this.field568 <= 0) {
            this.field568 += class202.field3240 >> 4;
            class311.method2151(this.field535, (byte) 95);
            this.method238((byte) -51, this.field535, this.field535.method1524());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label105: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class258 var10 = null;
                        class258 var11 = this.field556[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class42 var12 = var11.field4122;
                                if (var12 == null || var12.field677 <= var8) {
                                    var11.field4125 = true;
                                    int var13 = var11.method1067();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field677 += var13;
                                    }
                                    if (var4 >= this.field534) {
                                        break label105;
                                    }
                                    class258 var14 = var11.method1070();
                                    if (var14 != null) {
                                        int var15 = var11.field4124;
                                        while (var14 != null) {
                                            this.method238((byte) -51, var14, var15 * var14.method1524() >> 8);
                                            var14 = var11.method1075();
                                        }
                                    }
                                    class258 var16 = var11.field4123;
                                    var11.field4123 = null;
                                    if (var10 == null) {
                                        this.field556[var7] = var16;
                                    } else {
                                        var10.field4123 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field562[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field4123;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class258 var18 = this.field556[var17];
                this.field556[var17] = this.field562[var17] = null;
                while (var18 != null) {
                    class258 var19 = var18.field4123;
                    var18.field4123 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field568 < 0) {
            this.field568 = 0;
        }
        if (this.field535 != null) {
            this.field535.method1072(arg0, 0, arg1);
        }
        this.field550 = class247.method1762(19166);
    }

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "()V", line = 429)
    public void method247() throws Exception {
        field548++;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZLcm;)V", line = 438)
    public final synchronized void method248(boolean arg0, class258 arg1) {
        this.field535 = arg1;
        field553++;
        if (arg0) {
            this.method244(3, -81);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 450)
    public void method249(Component arg0) throws Exception {
        field536++;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(Z)V", line = 457)
    public final synchronized void method250(boolean arg0) {
        field549++;
        if (this.field547 == null) {
            return;
        }
        long var2 = class247.method1762(19166);
        try {
            if (this.field564 != 0L) {
                if (this.field564 > var2) {
                    return;
                }
                this.method239(this.field558);
                this.field567 = true;
                this.field564 = 0L;
            }
            int var4 = this.method237();
            int var5 = this.field566 + this.field555;
            if (this.field557 < this.field565 - var4) {
                this.field557 = this.field565 - var4;
            }
            if (var5 + 256 > 16384) {
                var5 = 16128;
            }
            if (arg0) {
                this.field563 = 37L;
            }
            if ((var5 + 256) > this.field558) {
                var4 = 0;
                this.field558 += 1024;
                if (this.field558 > 16384) {
                    this.field558 = 16384;
                }
                this.method241();
                this.method239(this.field558);
                this.field567 = true;
                if (this.field558 < (var5 + 256)) {
                    var5 = this.field558 - 256;
                    this.field566 = var5 - this.field555;
                }
            }
            while (var5 > var4) {
                this.method246(this.field547, 256);
                var4 += 256;
                this.method245();
            }
            if (this.field563 < var2) {
                if (this.field567) {
                    this.field567 = false;
                } else if (this.field557 == 0 && this.field559 == 0) {
                    this.method241();
                    this.field564 = var2 + 2000L;
                    return;
                } else {
                    this.field566 = Math.min(this.field559, this.field557);
                    this.field559 = this.field557;
                }
                this.field563 = var2 + 2000L;
                this.field557 = 0;
            }
            this.field565 = var4;
        } catch (Exception var9) {
            this.method241();
            this.field564 = var2 + 2000L;
        }
        try {
            if (var2 > this.field550 + 500000L) {
                var2 = this.field550;
            }
            while (this.field550 + 5000L < var2) {
                this.method244(-107, 256);
                this.field550 += (long) (256000 / class202.field3240);
            }
        } catch (Exception var8) {
            this.field550 = var2;
        }
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V", line = 589)
    public static void method251(byte arg0) {
        if (arg0 < 24) {
            method251((byte) 70);
        }
        field545 = null;
        field554 = null;
    }
}
