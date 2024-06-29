import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class331 {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Z")
    private boolean field5141 = false;

    @OriginalMember(owner = "client!nb", name = "n", descriptor = "I")
    private int field5152 = 32;

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "J")
    private long field5158 = class212.method1543(22326);

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "[Lkn;")
    private class210[] field5163 = new class210[8];

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "J")
    private long field5173 = 0L;

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "[Lkn;")
    private class210[] field5172 = new class210[8];

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "I")
    private int field5166 = 0;

    @OriginalMember(owner = "client!nb", name = "E", descriptor = "I")
    private int field5169 = 0;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "Z")
    private boolean field5168 = true;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "J")
    private long field5164 = 0L;

    @OriginalMember(owner = "client!nb", name = "L", descriptor = "I")
    private int field5176 = 0;

    @OriginalMember(owner = "client!nb", name = "M", descriptor = "I")
    private int field5177 = 0;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "I")
    public static int field5139;

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field5142;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!nb", name = "g", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!nb", name = "i", descriptor = "I")
    public static int field5147;

    @OriginalMember(owner = "client!nb", name = "j", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!nb", name = "k", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!nb", name = "l", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!nb", name = "m", descriptor = "I")
    public static int field5151;

    @OriginalMember(owner = "client!nb", name = "p", descriptor = "I")
    public static int field5154;

    @OriginalMember(owner = "client!nb", name = "q", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!nb", name = "r", descriptor = "I")
    public static int field5156;

    @OriginalMember(owner = "client!nb", name = "s", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "I")
    public static int field5161;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public int field5167;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public int field5170;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field5171;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    private int field5175;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Llg;")
    public static class132 field5165;

    @OriginalMember(owner = "client!nb", name = "o", descriptor = "Lkn;")
    private class210 field5153;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "[I")
    public int[] field5140;

    @OriginalMember(owner = "client!nb", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field5146;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V", line = 5)
    public void method1852(int arg0) throws Exception {
        field5143++;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(I)V", line = 13)
    public final synchronized void method2316(int arg0) {
        field5161++;
        int var2 = -46 / ((arg0 - 34) / 51);
        this.field5168 = true;
        try {
            this.method1855();
        } catch (Exception var4) {
            this.method1857();
            this.field5173 = class212.method1543(22326) + 2000L;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)Lqa;", line = 36)
    public static final class139 method2317(byte arg0, int arg1) {
        field5174++;
        if (arg0 != -30) {
            method2322((class1) null, (byte) 87);
        }
        class139 var2 = (class139) class325.field5074.method1183((long) arg1, (byte) -114);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class5.field121.method967(11, arg1, 65280);
        class139 var4 = new class139();
        if (var3 != null) {
            var4.method1065(new class1(var3), 0);
        }
        class325.field5074.method1182((byte) -42, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(BI)V", line = 65)
    private final void method2318(byte arg0, int arg1) {
        this.field5169 -= arg1;
        field5139++;
        if (this.field5169 < 0) {
            this.field5169 = 0;
        }
        if (this.field5153 != null) {
            this.field5153.method235(arg1);
        }
        if (arg0 != -54) {
            this.field5169 = 50;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "()V", line = 82)
    public void method1853() throws Exception {
        field5156++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILkn;)V", line = 95)
    private final void method2319(byte arg0, int arg1, class210 arg2) {
        field5147++;
        if (arg0 != -99) {
            this.field5169 = 80;
        }
        int var4 = arg1 >> 5;
        class210 var5 = this.field5172[var4];
        if (var5 == null) {
            this.field5163[var4] = arg2;
        } else {
            var5.field3309 = arg2;
        }
        this.field5172[var4] = arg2;
        arg2.field3307 = arg1;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V", line = 117)
    public static final void method2320(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5148++;
        if (class333.field5188 >= arg2 && arg1 >= class104.field1719) {
            boolean var6;
            if (class310.field4897 > arg0) {
                arg0 = class310.field4897;
                var6 = false;
            } else if (class180.field2862 < arg0) {
                arg0 = class180.field2862;
                var6 = false;
            } else {
                var6 = true;
            }
            boolean var7;
            if (class310.field4897 > arg5) {
                var7 = false;
                arg5 = class310.field4897;
            } else if (class180.field2862 >= arg5) {
                var7 = true;
            } else {
                var7 = false;
                arg5 = class180.field2862;
            }
            if (arg2 < class104.field1719) {
                arg2 = class104.field1719;
            } else {
                class323.method2273(arg0, arg3, class221.field3443[arg2++], arg5, 97);
            }
            if (class333.field5188 >= arg1) {
                class323.method2273(arg0, arg3, class221.field3443[arg1--], arg5, 112);
            } else {
                arg1 = class333.field5188;
            }
            if (var6 && var7) {
                for (int var8 = arg2; var8 <= arg1; var8++) {
                    int[] var9 = class221.field3443[var8];
                    var9[arg0] = var9[arg5] = arg3;
                }
            } else if (var6) {
                for (int var11 = arg2; var11 <= arg1; var11++) {
                    class221.field3443[var11][arg0] = arg3;
                }
            } else if (var7) {
                for (int var10 = arg2; var10 <= arg1; var10++) {
                    class221.field3443[var10][arg5] = arg3;
                }
            }
        }
        int var12 = -114 % ((-arg4 - 56) / 55);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(B)V", line = 223)
    public final synchronized void method2321(byte arg0) {
        field5144++;
        if (class136.field2220 != null) {
            boolean var2 = true;
            for (int var3 = 0; var3 < 2; var3++) {
                if (class136.field2220.field905[var3] == this) {
                    class136.field2220.field905[var3] = null;
                }
                if (class136.field2220.field905[var3] != null) {
                    var2 = false;
                }
            }
            if (var2) {
                class136.field2220.field906 = true;
                while (class136.field2220.field901) {
                    class245.method1729(124, 50L);
                }
                class136.field2220 = null;
            }
        }
        this.method1857();
        if (arg0 != -119) {
            method2320(14, -57, -76, 51, -20, 67);
        }
        this.field5141 = true;
        this.field5140 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Laj;B)Ljava/lang/String;", line = 272)
    public static final String method2322(class1 arg0, byte arg1) {
        field5159++;
        if (arg1 >= -86) {
            field5160 = -105;
        }
        return class30.method271(70, 32767, arg0);
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "()V", line = 290)
    public void method1857() {
        field5145++;
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(B)V", line = 301)
    public static void method2323(byte arg0) {
        field5146 = null;
        int var1 = -45 / ((arg0 - 33) / 56);
        field5165 = null;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BLkn;)V", line = 311)
    public final synchronized void method2324(byte arg0, class210 arg1) {
        this.field5153 = arg1;
        field5142++;
        int var3 = 45 % ((arg0 + 16) / 47);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(BI)I", line = 322)
    public static final int method2325(byte arg0, int arg1) {
        field5162++;
        if (arg0 != 64) {
            field5160 = -57;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljava/awt/Component;)V", line = 333)
    public void method1854(Component arg0) throws Exception {
        field5155++;
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(B)V", line = 340)
    public final void method2326(byte arg0) {
        field5151++;
        this.field5168 = true;
        if (arg0 <= 8) {
            this.field5170 = 122;
        }
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "()V", line = 352)
    public void method1855() throws Exception {
        field5150++;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "()I", line = 367)
    public int method1856() throws Exception {
        field5154++;
        return this.field5170;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(SB)Z", line = 380)
    public static final boolean method2327(short arg0, byte arg1) {
        int var2 = -17 / ((-arg1 - 30) / 63);
        field5157++;
        if (arg0 == 35 || arg0 == 15 || arg0 == 2 || arg0 == 37 || arg0 == 36 || arg0 == 1 || arg0 == 29 || arg0 == 14) {
            return true;
        } else if (arg0 == 42 || arg0 == 19 || arg0 == 1006 || arg0 == 1004) {
            return true;
        } else if (arg0 == 51 || arg0 == 28 || arg0 == 13 || arg0 == 43 || arg0 == 33) {
            return true;
        } else {
            return arg0 == 24 || arg0 == 9 || arg0 == 26 || arg0 == 32 || arg0 == 8 || arg0 == 25;
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI[BI)Z", line = 417)
    public static final boolean method2328(byte arg0, int arg1, byte[] arg2, int arg3) {
        field5149++;
        class1 var4 = new class1(arg2);
        int var5 = -1;
        boolean var6 = true;
        label76: while (true) {
            int var7 = var4.method1((byte) 57);
            if (var7 == 0) {
                if (arg0 <= 4) {
                    method2328((byte) 113, -15, (byte[]) null, 8);
                }
                return var6;
            }
            var5 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                int var14;
                class101 var16;
                do {
                    int var13;
                    int var15;
                    do {
                        do {
                            do {
                                do {
                                    while (var9) {
                                        int var17 = var4.method63(127);
                                        if (var17 == 0) {
                                            continue label76;
                                        }
                                        var4.method15((byte) 118);
                                    }
                                    int var10 = var4.method63(127);
                                    if (var10 == 0) {
                                        continue label76;
                                    }
                                    var8 += var10 - 1;
                                    int var11 = (var8 & 0xFCD) >> 6;
                                    int var12 = var8 & 0x3F;
                                    var13 = arg3 + var11;
                                    var14 = var4.method15((byte) -72) >> 2;
                                    var15 = arg1 + var12;
                                } while (var13 <= 0);
                            } while (var15 <= 0);
                        } while (var13 >= 103);
                    } while (var15 >= 103);
                    var16 = class288.method2025(var5, -1);
                } while (var14 == 22 && !class90.field1436 && var16.field1598 == 0 && var16.field1624 != 1 && !var16.field1607);
                if (!var16.method824(true)) {
                    class174.field2786++;
                    var6 = false;
                }
                var9 = true;
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "([II)V", line = 505)
    private final void method2329(int[] arg0, int arg1) {
        int var3 = arg1;
        if (class52.field774) {
            var3 = arg1 << 1;
        }
        class330.method2309(arg0, 0, var3);
        this.field5169 -= arg1;
        if (this.field5153 != null && this.field5169 <= 0) {
            this.field5169 += class297.field4778 >> 4;
            class185.method1345((byte) 31, this.field5153);
            this.method2319((byte) -99, this.field5153.method1538(), this.field5153);
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
                        class210 var10 = null;
                        class210 var11 = this.field5163[var7];
                        label99: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label99;
                                }
                                class193 var12 = var11.field3306;
                                if (var12 == null || var12.field3006 <= var8) {
                                    var11.field3308 = true;
                                    int var13 = var11.method240();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3006 += var13;
                                    }
                                    if (var4 >= this.field5152) {
                                        break label105;
                                    }
                                    class210 var14 = var11.method239();
                                    if (var14 != null) {
                                        int var15 = var11.field3307;
                                        while (var14 != null) {
                                            this.method2319((byte) -99, var15 * var14.method1538() >> 8, var14);
                                            var14 = var11.method233();
                                        }
                                    }
                                    class210 var16 = var11.field3309;
                                    var11.field3309 = null;
                                    if (var10 == null) {
                                        this.field5163[var7] = var16;
                                    } else {
                                        var10.field3309 = var16;
                                    }
                                    if (var16 == null) {
                                        this.field5172[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field3309;
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
                class210 var18 = this.field5163[var17];
                this.field5163[var17] = this.field5172[var17] = null;
                while (var18 != null) {
                    class210 var19 = var18.field3309;
                    var18.field3309 = null;
                    var18 = var19;
                }
            }
        }
        if (this.field5169 < 0) {
            this.field5169 = 0;
        }
        if (this.field5153 != null) {
            this.field5153.method232(arg0, 0, arg1);
        }
        this.field5158 = class212.method1543(22326);
    }

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "(I)V", line = 668)
    public final synchronized void method2330(int arg0) {
        field5171++;
        if (this.field5141) {
            return;
        }
        if (arg0 <= 32) {
            this.field5140 = (int[]) null;
        }
        long var2 = class212.method1543(22326);
        try {
            if (var2 > this.field5158 + 500000L) {
                this.field5158 = var2 - 500000L;
            }
            while ((this.field5158 + 5000L) < var2) {
                this.method2318((byte) -54, 256);
                this.field5158 += (long) (256000 / class297.field4778);
            }
        } catch (Exception var9) {
            this.field5158 = var2;
        }
        if (this.field5140 == null) {
            return;
        }
        try {
            if (this.field5173 != 0L) {
                if (var2 < this.field5173) {
                    return;
                }
                this.method1852(this.field5170);
                this.field5173 = 0L;
                this.field5168 = true;
            }
            int var5 = this.method1856();
            int var6 = this.field5167 + this.field5175;
            if ((this.field5176 - var5) > this.field5177) {
                this.field5177 = this.field5176 - var5;
            }
            if (var6 + 256 > 16384) {
                var6 = 16128;
            }
            if (var6 + 256 > this.field5170) {
                this.field5170 += 1024;
                var5 = 0;
                if (this.field5170 > 16384) {
                    this.field5170 = 16384;
                }
                this.method1857();
                this.method1852(this.field5170);
                if (var6 + 256 > this.field5170) {
                    var6 = this.field5170 - 256;
                    this.field5175 = var6 - this.field5167;
                }
                this.field5168 = true;
            }
            while (var5 < var6) {
                var5 += 256;
                this.method2329(this.field5140, 256);
                this.method1853();
            }
            if (this.field5164 < var2) {
                if (this.field5168) {
                    this.field5168 = false;
                } else if (this.field5177 == 0 && this.field5166 == 0) {
                    this.method1857();
                    this.field5173 = var2 + 2000L;
                    return;
                } else {
                    this.field5175 = Math.min(this.field5166, this.field5177);
                    this.field5166 = this.field5177;
                }
                this.field5164 = var2 + 2000L;
                this.field5177 = 0;
            }
            this.field5176 = var5;
        } catch (Exception var8) {
            this.method1857();
            this.field5173 = var2 + 2000L;
        }
    }
}
