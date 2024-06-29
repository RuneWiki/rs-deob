import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class308 {

    @OriginalMember(owner = "client!oi", name = "d", descriptor = "I")
    public int field5163 = -1;

    @OriginalMember(owner = "client!oi", name = "b", descriptor = "I")
    private int field5161 = 0;

    @OriginalMember(owner = "client!oi", name = "l", descriptor = "I")
    public int field5171 = 128;

    @OriginalMember(owner = "client!oi", name = "t", descriptor = "Z")
    public boolean field5179 = true;

    @OriginalMember(owner = "client!oi", name = "e", descriptor = "Z")
    public static boolean field5164 = false;

    @OriginalMember(owner = "client!oi", name = "k", descriptor = "[I")
    public static int[] field5170 = new int[25];

    @OriginalMember(owner = "client!oi", name = "m", descriptor = "I")
    public static int field5172 = 0;

    @OriginalMember(owner = "client!oi", name = "g", descriptor = "[[B")
    public static byte[][] field5166 = new byte[50][];

    @OriginalMember(owner = "client!oi", name = "j", descriptor = "[I")
    public static int[] field5169 = new int[4096];

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "I")
    public static int field5160;

    @OriginalMember(owner = "client!oi", name = "c", descriptor = "I")
    public static int field5162;

    @OriginalMember(owner = "client!oi", name = "h", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!oi", name = "i", descriptor = "I")
    public int field5168;

    @OriginalMember(owner = "client!oi", name = "n", descriptor = "I")
    public int field5173;

    @OriginalMember(owner = "client!oi", name = "o", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!oi", name = "p", descriptor = "I")
    public static int field5175;

    @OriginalMember(owner = "client!oi", name = "q", descriptor = "I")
    public int field5176;

    @OriginalMember(owner = "client!oi", name = "r", descriptor = "I")
    public static int field5177;

    @OriginalMember(owner = "client!oi", name = "s", descriptor = "I")
    public int field5178;

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "Lmm;")
    public static class249 field5165;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(ILsd;I)V", line = 10)
    public final void method2103(int arg0, class26 arg1, int arg2) {
        int var4 = 20 / ((arg0 - 59) / 40);
        field5160++;
        while (true) {
            int var5 = arg1.method226(255);
            if (var5 == 0) {
                return;
            }
            this.method2105((byte) -4, var5, arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lel;IIIIIIZ)V", line = 29)
    public static final void method2104(class113 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        int var8 = arg0.field1972.length;
        for (int var9 = 0; var9 < var8; var9++) {
            int var10 = arg0.field1972[var9] - class208.field3331;
            int var11 = arg0.field1959[var9] - class48.field940;
            int var12 = arg0.field1958[var9] - class180.field2939;
            int var13 = arg3 * var12 + arg4 * var10 >> 16;
            int var14 = arg4 * var12 - arg3 * var10 >> 16;
            int var16 = arg2 * var11 - arg1 * var14 >> 16;
            int var17 = arg1 * var11 + arg2 * var14 >> 16;
            if (var17 < 50) {
                return;
            }
            if (arg0.field1975 != null) {
                class113.field1964[var9] = var13;
                class113.field1966[var9] = var16;
                class113.field1957[var9] = var17;
            }
            class113.field1956[var9] = (var13 << 9) / var17 + class203.field3210;
            class113.field1969[var9] = (var16 << 9) / var17 + class203.field3222;
        }
        class203.field3215 = 0;
        int var19 = arg0.field1970.length;
        for (int var20 = 0; var20 < var19; var20++) {
            int var21 = arg0.field1970[var20];
            int var22 = arg0.field1954[var20];
            int var23 = arg0.field1962[var20];
            int var24 = class113.field1956[var21];
            int var25 = class113.field1956[var22];
            int var26 = class113.field1956[var23];
            int var27 = class113.field1969[var21];
            int var28 = class113.field1969[var22];
            int var29 = class113.field1969[var23];
            if ((var24 - var25) * (var29 - var28) - (var26 - var25) * (var27 - var28) > 0) {
                if (class55.field1070 && class106.method794(class76.field1308 + class203.field3210, class203.field3222 + class106.field1863, var27, var28, var29, var24, var25, var26)) {
                    class42.field801 = arg5;
                    class294.field4936 = arg6;
                }
                if (!class21.field350 && !arg7) {
                    class203.field3214 = false;
                    if (var24 < 0 || var25 < 0 || var26 < 0 || var24 > class203.field3220 || var25 > class203.field3220 || var26 > class203.field3220) {
                        class203.field3214 = true;
                    }
                    if (arg0.field1975 == null || arg0.field1975[var20] == -1) {
                        if (arg0.field1965[var20] != 12345678) {
                            class203.method1418(var27, var28, var29, var24, var25, var26, arg0.field1965[var20], arg0.field1971[var20], arg0.field1963[var20]);
                        }
                    } else if (!class104.field1847) {
                        int var30 = class203.field3217.method566(-63, arg0.field1975[var20]);
                        class203.method1418(var27, var28, var29, var24, var25, var26, class258.method1816(var30, arg0.field1965[var20]), class258.method1816(var30, arg0.field1971[var20]), class258.method1816(var30, arg0.field1963[var20]));
                    } else if (arg0.field1968) {
                        class203.method1416(var27, var28, var29, var24, var25, var26, arg0.field1965[var20], arg0.field1971[var20], arg0.field1963[var20], class113.field1964[0], class113.field1964[1], class113.field1964[3], class113.field1966[0], class113.field1966[1], class113.field1966[3], class113.field1957[0], class113.field1957[1], class113.field1957[3], arg0.field1975[var20]);
                    } else {
                        class203.method1416(var27, var28, var29, var24, var25, var26, arg0.field1965[var20], arg0.field1971[var20], arg0.field1963[var20], class113.field1964[var21], class113.field1964[var22], class113.field1964[var23], class113.field1966[var21], class113.field1966[var22], class113.field1966[var23], class113.field1957[var21], class113.field1957[var22], class113.field1957[var23], arg0.field1975[var20]);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BIILsd;)V", line = 147)
    private final void method2105(byte arg0, int arg1, int arg2, class26 arg3) {
        field5177++;
        if (arg1 == 1) {
            this.field5161 = arg3.method244(-26711);
            this.method2106(this.field5161, arg0 ^ 0x69);
        } else if (arg1 == 2) {
            this.field5163 = arg3.method197(arg0 + 3);
            if (this.field5163 == 65535) {
                this.field5163 = -1;
            }
        } else if (arg1 == 3) {
            this.field5171 = arg3.method197(-1);
        } else if (arg1 == 4) {
            this.field5179 = false;
        }
        if (arg0 != -4) {
            this.field5173 = -72;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(II)V", line = 193)
    private final void method2106(int arg0, int arg1) {
        field5162++;
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 < var5) {
            var9 = var5;
        }
        double var11 = 0.0D;
        if (var7 > var9) {
            var9 = var7;
        }
        double var13 = var3;
        if (var3 > var5) {
            var13 = var5;
        }
        if (var7 < var13) {
            var13 = var7;
        }
        double var15 = 0.0D;
        int var17 = -54 % ((arg1 - 32) / 63);
        double var18 = (var9 + var13) / 2.0D;
        if (var9 != var13) {
            if (var18 < 0.5D) {
                var11 = (var9 - var13) / (var9 + var13);
            }
            if (var3 == var9) {
                var15 = (var5 - var7) / (var9 - var13);
            } else if (var5 == var9) {
                var15 = (var7 - var3) / (var9 - var13) + 2.0D;
            } else if (var7 == var9) {
                var15 = (var3 - var5) / (var9 - var13) + 4.0D;
            }
            if (var18 >= 0.5D) {
                var11 = (var9 - var13) / (2.0D - var9 - var13);
            }
        }
        this.field5176 = (int) (var18 * 256.0D);
        double var20 = var15 / 6.0D;
        this.field5173 = (int) (var11 * 256.0D);
        if (this.field5173 < 0) {
            this.field5173 = 0;
        } else if (this.field5173 > 255) {
            this.field5173 = 255;
        }
        if (this.field5176 < 0) {
            this.field5176 = 0;
        } else if (this.field5176 > 255) {
            this.field5176 = 255;
        }
        if ((var18 > 0.5D)) {
            this.field5168 = (int) ((1.0D - var18) * var11 * 512.0D);
        } else {
            this.field5168 = (int) (var11 * var18 * 512.0D);
        }
        if (this.field5168 < 1) {
            this.field5168 = 1;
        }
        this.field5178 = (int) ((double) this.field5168 * var20);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(B)V", line = 287)
    public static final void method2107(byte arg0) {
        field5167++;
        int var1 = class230.field3789.method1830(class98.field1756);
        for (int var2 = 0; var2 < class255.field4252; var2++) {
            int var3 = class230.field3789.method1830(class108.method819(var2, (byte) -58));
            if (var3 > var1) {
                var1 = var3;
            }
        }
        var1 += 8;
        int var4 = class255.field4252 * 15 + 21;
        if (arg0 <= 50) {
            method2109(-60);
        }
        int var5 = class294.field4937;
        int var6 = class159.field2664 - (var1 / 2);
        if (class112.field1945 < var6 + var1) {
            var6 = class112.field1945 - var1;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        if ((var4 + var5) > class73.field1287) {
            var5 = class73.field1287 - var4;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (class140.field2370 == 1) {
            if (class85.field1471 == class159.field2664 && class294.field4937 == class291.field4865) {
                class250.field4138 = var1;
                class178.field2934 = class255.field4252 * 15 + 22;
                class140.field2370 = 0;
                class27.field550 = var5;
                class160.field2681 = var6;
                class27.field518 = true;
            }
        } else if (class159.field2664 == class128.field2208 && class62.field1171 == class294.field4937) {
            class27.field518 = true;
            class178.field2934 = class255.field4252 * 15 + 22;
            class140.field2370 = 0;
            class250.field4138 = var1;
            class27.field550 = var5;
            class160.field2681 = var6;
        } else {
            class140.field2370 = 1;
            class291.field4865 = class62.field1171;
            class85.field1471 = class128.field2208;
        }
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(BLjava/lang/String;)Lqd;", line = 383)
    public static final class40 method2108(byte arg0, String arg1) {
        field5174++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var6) {
            var2 = arg1.getBytes();
        }
        class40 var4 = new class40();
        var4.field766 = 0;
        var4.field745 = var2;
        int var5 = 0;
        if (arg0 != -114) {
            return (class40) null;
        }
        while (var5 < var2.length) {
            if (var2[var5] != 0) {
                var2[var4.field766++] = var2[var5];
            }
            var5++;
        }
        return var4;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(I)V", line = 445)
    public static void method2109(int arg0) {
        field5165 = null;
        field5166 = (byte[][]) null;
        if (arg0 != -22243) {
            field5170 = (int[]) null;
        }
        field5169 = null;
        field5170 = null;
    }
}
