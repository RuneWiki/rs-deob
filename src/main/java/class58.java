import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class58 {

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    private int field1100 = 0;

    @OriginalMember(owner = "client!de", name = "l", descriptor = "J")
    private long field1109 = -1L;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "J")
    private long field1105 = -1L;

    @OriginalMember(owner = "client!de", name = "v", descriptor = "Lfh;")
    private class191 field1119;

    @OriginalMember(owner = "client!de", name = "C", descriptor = "J")
    private long field1125;

    @OriginalMember(owner = "client!de", name = "s", descriptor = "J")
    private long field1116;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[B")
    private byte[] field1099;

    @OriginalMember(owner = "client!de", name = "z", descriptor = "J")
    private long field1123;

    @OriginalMember(owner = "client!de", name = "n", descriptor = "[B")
    private byte[] field1111;

    @OriginalMember(owner = "client!de", name = "r", descriptor = "I")
    public static int field1115 = 0;

    @OriginalMember(owner = "client!de", name = "t", descriptor = "Lhi;")
    public static class282 field1117 = new class282();

    @OriginalMember(owner = "client!de", name = "F", descriptor = "[I")
    public static int[] field1128 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!de", name = "a", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field1101;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "I")
    private int field1104;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field1106;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!de", name = "m", descriptor = "I")
    public static int field1110;

    @OriginalMember(owner = "client!de", name = "o", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!de", name = "q", descriptor = "I")
    public static int field1114;

    @OriginalMember(owner = "client!de", name = "u", descriptor = "I")
    public static int field1118;

    @OriginalMember(owner = "client!de", name = "w", descriptor = "I")
    public static int field1120;

    @OriginalMember(owner = "client!de", name = "x", descriptor = "I")
    public static int field1121;

    @OriginalMember(owner = "client!de", name = "y", descriptor = "I")
    public static int field1122;

    @OriginalMember(owner = "client!de", name = "A", descriptor = "I")
    public static int field1124;

    @OriginalMember(owner = "client!de", name = "D", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "client!de", name = "E", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "J")
    private long field1108;

    @OriginalMember(owner = "client!de", name = "p", descriptor = "Lsa;")
    public static class104 field1113;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILqd;B)V", line = 14)
    public static final void method482(int arg0, class40 arg1, byte arg2) {
        field1101++;
        class177 var3 = class177.method1310(37, 2, arg0);
        var3.method1302(-20040);
        if (arg2 > -120) {
            field1117 = (class282) null;
        }
        var3.field2904 = arg1;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZLfm;)V", line = 40)
    public static final void method483(boolean arg0, class42 arg1) {
        field1120++;
        for (class255 var2 = (class255) class253.field4194.method1971(100); var2 != null; var2 = (class255) class253.field4194.method1967(100)) {
            if (var2.field4244 == arg1) {
                if (var2.field4234 != null) {
                    class89.field1610.method1336(var2.field4234);
                    var2.field4234 = null;
                }
                var2.method2095(0);
                return;
            }
        }
        if (arg0) {
            field1117 = (class282) null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 78)
    private final void method484(byte arg0) throws IOException {
        if (arg0 != 84) {
            return;
        }
        if (this.field1105 != -1L) {
            if (this.field1108 != this.field1105) {
                this.field1119.method1375(0, this.field1105);
                this.field1108 = this.field1105;
            }
            this.field1119.method1373(this.field1100, (byte) 79, this.field1099, 0);
            long var2 = -1L;
            this.field1108 += (long) this.field1100;
            if (this.field1105 >= this.field1109 && ((long) this.field1104 + this.field1109) > this.field1105) {
                var2 = this.field1105;
            } else if (this.field1109 >= this.field1105 && this.field1109 < (this.field1105 + ((long) this.field1100))) {
                var2 = this.field1109;
            }
            if (this.field1108 > this.field1125) {
                this.field1125 = this.field1108;
            }
            long var4 = -1L;
            if ((this.field1105 + ((long) this.field1100)) > this.field1109 && this.field1105 + ((long) this.field1100) <= this.field1109 - -((long) this.field1104)) {
                var4 = (long) this.field1100 + this.field1105;
            } else if (this.field1105 < (long) this.field1104 + this.field1109 && (long) this.field1104 + this.field1109 <= this.field1105 - -((long) this.field1100)) {
                var4 = this.field1109 + ((long) this.field1104);
            }
            if (var2 > -1L && var4 > var2) {
                int var6 = (int) (var4 - var2);
                class234.method1627(this.field1099, (int) (var2 - this.field1105), this.field1111, (int) (var2 - this.field1109), var6);
            }
            this.field1100 = 0;
            this.field1105 = -1L;
        }
        field1114++;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI)V", line = 156)
    public static final void method485(byte arg0, int arg1) {
        int var2 = -77 / ((-arg0 - 52) / 38);
        field1106++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class236.method1636((byte) 127);
        } else if (arg1 == 2) {
            class186.method1346((byte) -71);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(B)V", line = 178)
    public static void method486(byte arg0) {
        if (arg0 > -55) {
            field1115 = 101;
        }
        field1113 = null;
        field1128 = null;
        field1117 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BI[BI)V", line = 190)
    public final void method487(byte arg0, int arg1, byte[] arg2, int arg3) throws IOException {
        field1103++;
        try {
            if ((arg1 + arg3) > arg2.length) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg3 - arg2.length);
            }
            if (this.field1105 != -1L && this.field1105 <= this.field1123 && (this.field1105 + ((long) this.field1100)) >= ((long) arg1 + this.field1123)) {
                class234.method1627(this.field1099, (int) (this.field1123 - this.field1105), arg2, arg3, arg1);
                this.field1123 += (long) arg1;
                return;
            }
            long var5 = this.field1123;
            int var7 = arg3;
            if (arg0 <= 14) {
                this.field1111 = (byte[]) null;
            }
            int var8 = arg1;
            if (this.field1109 <= this.field1123 && (long) this.field1104 + this.field1109 > this.field1123) {
                int var9 = (int) (this.field1109 - (this.field1123 - (long) this.field1104));
                if (arg1 < var9) {
                    var9 = arg1;
                }
                class234.method1627(this.field1111, (int) (this.field1123 - this.field1109), arg2, arg3, var9);
                this.field1123 += (long) var9;
                arg1 -= var9;
                arg3 += var9;
            }
            if (arg1 > this.field1111.length) {
                this.field1119.method1375(0, this.field1123);
                this.field1108 = this.field1123;
                while (arg1 > 0) {
                    int var10 = this.field1119.method1371(arg3, 1, arg1, arg2);
                    if (var10 == -1) {
                        break;
                    }
                    arg3 += var10;
                    arg1 -= var10;
                    this.field1123 += (long) var10;
                    this.field1108 += (long) var10;
                }
            } else if (arg1 > 0) {
                this.method496((byte) 41);
                int var11 = arg1;
                if (arg1 > this.field1104) {
                    var11 = this.field1104;
                }
                arg1 -= var11;
                class234.method1627(this.field1111, 0, arg2, arg3, var11);
                arg3 += var11;
                this.field1123 += (long) var11;
            }
            if (this.field1105 != -1L) {
                if (this.field1105 > this.field1123 && arg1 > 0) {
                    int var12 = (int) (this.field1105 - this.field1123) + arg3;
                    if ((arg3 + arg1) < var12) {
                        var12 = arg1 + arg3;
                    }
                    while (var12 > arg3) {
                        arg2[arg3++] = 0;
                        this.field1123++;
                        arg1--;
                    }
                }
                long var13 = -1L;
                if (var5 <= this.field1105 && this.field1105 < ((long) var8 + var5)) {
                    var13 = this.field1105;
                } else if (var5 >= this.field1105 && (this.field1105 + ((long) this.field1100)) > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (long) this.field1100 + this.field1105 && (var5 + ((long) var8)) >= ((long) this.field1100 + this.field1105)) {
                    var15 = this.field1105 + ((long) this.field1100);
                } else if (this.field1105 < (long) var8 + var5 && ((long) this.field1100 + this.field1105) >= (var5 + ((long) var8))) {
                    var15 = (long) var8 + var5;
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class234.method1627(this.field1099, (int) (var13 - this.field1105), arg2, var7 + ((int) (var13 - var5)), var17);
                    if (var15 > this.field1123) {
                        arg1 = (int) ((long) arg1 - (var15 - this.field1123));
                        this.field1123 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field1108 = -1L;
            throw var19;
        }
        if (arg1 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)J", line = 377)
    public final long method488(int arg0) {
        field1127++;
        if (arg0 != 3) {
            method489((byte) 35, -103);
        }
        return this.field1116;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(BI)I", line = 391)
    public static final int method489(byte arg0, int arg1) {
        if (arg0 < 122) {
            field1128 = (int[]) null;
        }
        field1122++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "(Lfh;II)V", line = 1328)
    public class58(class191 arg0, int arg1, int arg2) throws IOException {
        this.field1119 = arg0;
        this.field1116 = this.field1125 = arg0.method1372(true);
        this.field1099 = new byte[arg2];
        this.field1123 = 0L;
        this.field1111 = new byte[arg1];
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)V", line = 428)
    public static final void method490(int arg0, int arg1) {
        field1121++;
        if (arg0 > 43) {
            class177 var2 = class177.method1310(71, 2, arg1);
            var2.method1303((byte) 115);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([BI)V", line = 440)
    public final void method491(byte[] arg0, int arg1) throws IOException {
        this.method487((byte) 26, arg0.length, arg0, 0);
        field1118++;
        if (arg1 != -105) {
            method486((byte) -128);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([BIIB)V", line = 451)
    public final void method492(byte[] arg0, int arg1, int arg2, byte arg3) throws IOException {
        field1112++;
        try {
            if ((this.field1123 + ((long) arg2)) > this.field1116) {
                this.field1116 = (long) arg2 + this.field1123;
            }
            if (this.field1105 != -1L && (this.field1123 < this.field1105 || (long) this.field1100 + this.field1105 < this.field1123)) {
                this.method484((byte) 84);
            }
            if (this.field1105 != -1L && (long) arg2 + this.field1123 > (long) this.field1099.length + this.field1105) {
                int var5 = (int) ((long) this.field1099.length - (this.field1123 - this.field1105));
                class234.method1627(arg0, arg1, this.field1099, (int) (this.field1123 - this.field1105), var5);
                arg1 += var5;
                this.field1123 += (long) var5;
                this.field1100 = this.field1099.length;
                this.method484((byte) 84);
                arg2 -= var5;
            }
            if (arg2 > this.field1099.length) {
                long var6 = -1L;
                if (this.field1123 != this.field1108) {
                    this.field1119.method1375(0, this.field1123);
                    this.field1108 = this.field1123;
                }
                long var8 = -1L;
                this.field1119.method1373(arg2, (byte) 79, arg0, arg1);
                if (this.field1123 >= this.field1109 && ((long) this.field1104 + this.field1109) > this.field1123) {
                    var6 = this.field1123;
                } else if (this.field1123 <= this.field1109 && (long) arg2 + this.field1123 > this.field1109) {
                    var6 = this.field1109;
                }
                this.field1108 += (long) arg2;
                if (this.field1125 < this.field1108) {
                    this.field1125 = this.field1108;
                }
                if (((long) arg2 + this.field1123) > this.field1109 && (long) arg2 + this.field1123 <= (long) this.field1104 + this.field1109) {
                    var8 = this.field1123 + ((long) arg2);
                } else if ((long) this.field1104 + this.field1109 > this.field1123 && (this.field1109 + ((long) this.field1104)) <= ((long) arg2 + this.field1123)) {
                    var8 = this.field1109 + ((long) this.field1104);
                }
                if (var6 > -1L && var8 > var6) {
                    int var10 = (int) (var8 - var6);
                    class234.method1627(arg0, (int) ((long) arg1 + var6 - this.field1123), this.field1111, (int) (var6 - this.field1109), var10);
                }
                this.field1123 += (long) arg2;
            } else if (arg2 > 0) {
                if (this.field1105 == -1L) {
                    this.field1105 = this.field1123;
                }
                class234.method1627(arg0, arg1, this.field1099, (int) (this.field1123 - this.field1105), arg2);
                this.field1123 += (long) arg2;
                if ((this.field1123 - this.field1105) > ((long) this.field1100)) {
                    this.field1100 = (int) (this.field1123 - this.field1105);
                }
            } else {
                int var11 = -47 % ((arg3 - 35) / 55);
            }
        } catch (IOException var13) {
            this.field1108 = -1L;
            throw var13;
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 575)
    public final void method493(int arg0) throws IOException {
        this.method484((byte) 84);
        field1124++;
        this.field1119.method1376(-1);
        int var2 = 112 / ((arg0 + 68) / 44);
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ZIZIIIIILm;BI)V", line = 592)
    public static final void method494(boolean arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class44 arg8, byte arg9, int arg10) {
        field1126++;
        if (arg0 && !class118.method893(2) && (class274.field4564[0][arg4][arg1] & 0x2) == 0) {
            if ((class274.field4564[arg5][arg4][arg1] & 0x10) != 0) {
                return;
            }
            if (class85.method655(arg5, arg1, arg4, -6681) != class188.field3022) {
                return;
            }
        }
        if (arg5 < class56.field1080) {
            class56.field1080 = arg5;
        }
        class27 var11 = class72.method540(0, arg10);
        if (class21.field350 && var11.field547) {
            return;
        }
        int var12;
        int var13;
        if (arg3 == 1 || arg3 == 3) {
            var13 = var11.field568;
            var12 = var11.field519;
        } else {
            var12 = var11.field568;
            var13 = var11.field519;
        }
        int var14;
        int var15;
        if (arg4 + var13 <= 104) {
            var14 = (var13 + 1 >> 1) + arg4;
            var15 = (var13 >> 1) + arg4;
        } else {
            var14 = arg4 + 1;
            var15 = arg4;
        }
        if (arg9 < 60) {
            method483(true, (class42) null);
        }
        int[][] var16 = class78.field1316[arg7];
        int var17;
        int var18;
        if ((arg1 + var12) <= 104) {
            var17 = arg1 + (var12 >> 1);
            var18 = (var12 + 1 >> 1) + arg1;
        } else {
            var18 = arg1 + 1;
            var17 = arg1;
        }
        int var19 = (arg4 << 7) + (var13 << 6);
        int var20 = var16[var14][var17] + var16[var15][var18] + var16[var14][var18] + var16[var15][var17] >> 2;
        int var21 = 0;
        int var22 = (arg1 << 7) + (var12 << 6);
        if (class21.field350 && arg7 != 0) {
            int[][] var23 = class78.field1316[0];
            var21 = var20 - (var23[var15][var17] + var23[var14][var18] + var23[var14][var17] + var23[var15][var18] >> 2);
        }
        int[][] var24 = (int[][]) null;
        if (arg2) {
            var24 = class244.field4020[0];
        } else if (arg7 < 3) {
            var24 = class78.field1316[arg7 + 1];
        }
        long var25 = (long) (arg1 | 0x800000 << 7 | arg4 | arg6 << 14 | arg3 << 20);
        if (var11.field573 == 0 || arg2) {
            var25 |= Long.MIN_VALUE;
        }
        if (var11.field578 == 1) {
            var25 |= 0x400000L;
        }
        if (var11.field528) {
            var25 |= 0x80000000L;
        }
        long var27 = var25 | (long) arg10 << 32;
        if (var11.method262(101)) {
            class31.method281(arg5, arg1, (class42) null, 128, arg4, arg3, (class258) null, var11);
        }
        boolean var29 = !arg2 & var11.field583;
        if (arg6 == 22) {
            if (class217.field3623 || var11.field573 != 0 || var11.field588 == 1 || var11.field569) {
                class196 var31;
                if (var11.field577 == -1 && var11.field546 == null) {
                    class294 var30 = var11.method257(var24, 22, var19, -127, arg3, var20, var16, (class114) null, arg0, var22, var29);
                    if (class21.field350 && var29) {
                        class241.method1700(var30.field4939, var19, var21, var22);
                    }
                    var31 = var30.field4941;
                } else {
                    var31 = new class280(arg10, 22, arg3, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
                }
                class189.method1364(arg5, arg4, arg1, var20, var31, var27, var11.field561);
                if (var11.field588 == 1 && arg8 != null) {
                    arg8.method398(arg4, arg1, (byte) 117);
                }
            }
        } else if (arg6 == 10 || arg6 == 11) {
            class196 var73;
            if (var11.field577 == -1 && var11.field546 == null) {
                class294 var72 = var11.method257(var24, 10, var19, -127, arg6 == 11 ? arg3 + 4 : arg3, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var72.field4939, var19, var21, var22);
                }
                var73 = var72.field4941;
            } else {
                var73 = new class280(arg10, 10, arg6 == 11 ? arg3 + 4 : arg3, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
            }
            if (var73 != null) {
                boolean var74 = class73.method544(arg5, arg4, arg1, var20, var13, var12, var73, 0, var27);
                if (var11.field530 && var74 && arg0) {
                    int var75 = 15;
                    if (var73 instanceof class266) {
                        var75 = ((class266) var73).method1149() / 4;
                        if (var75 > 30) {
                            var75 = 30;
                        }
                    }
                    for (int var76 = 0; var76 <= var13; var76++) {
                        for (int var77 = 0; var77 <= var12; var77++) {
                            if (var75 > class104.field1845[arg5][arg4 + var76][arg1 + var77]) {
                                class104.field1845[arg5][arg4 + var76][arg1 + var77] = (byte) var75;
                            }
                        }
                    }
                }
            }
            if (var11.field588 != 0 && arg8 != null) {
                arg8.method410(arg4, 127, arg1, var12, var11.field570, var13);
            }
        } else if (arg6 >= 12) {
            class196 var71;
            if (var11.field577 == -1 && var11.field546 == null) {
                class294 var70 = var11.method257(var24, arg6, var19, -124, arg3, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var70.field4939, var19, var21, var22);
                }
                var71 = var70.field4941;
            } else {
                var71 = new class280(arg10, arg6, arg3, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
            }
            class73.method544(arg5, arg4, arg1, var20, 1, 1, var71, 0, var27);
            if (arg0 && arg6 >= 12 && arg6 <= 17 && arg6 != 13 && arg5 > 0) {
                class252.field4188[arg5][arg4][arg1] = class11.method71(class252.field4188[arg5][arg4][arg1], 4);
            }
            if (var11.field588 != 0 && arg8 != null) {
                arg8.method410(arg4, 78, arg1, var12, var11.field570, var13);
            }
        } else if (arg6 == 0) {
            class196 var69;
            if (var11.field577 == -1 && var11.field546 == null) {
                class294 var68 = var11.method257(var24, 0, var19, -127, arg3, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var68.field4939, var19, var21, var22);
                }
                var69 = var68.field4941;
            } else {
                var69 = new class280(arg10, 0, arg3, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
            }
            class41.method376(arg5, arg4, arg1, var20, var69, (class196) null, class299.field5004[arg3], 0, var27);
            if (arg0) {
                if (arg3 == 0) {
                    if (var11.field530) {
                        class104.field1845[arg5][arg4][arg1] = 50;
                        class104.field1845[arg5][arg4][arg1 + 1] = 50;
                    }
                    if (var11.field515) {
                        class252.field4188[arg5][arg4][arg1] = class11.method71(class252.field4188[arg5][arg4][arg1], 1);
                    }
                } else if (arg3 == 1) {
                    if (var11.field530) {
                        class104.field1845[arg5][arg4][arg1 + 1] = 50;
                        class104.field1845[arg5][arg4 + 1][arg1 + 1] = 50;
                    }
                    if (var11.field515) {
                        class252.field4188[arg5][arg4][arg1 + 1] = class11.method71(class252.field4188[arg5][arg4][arg1 + 1], 2);
                    }
                } else if (arg3 == 2) {
                    if (var11.field530) {
                        class104.field1845[arg5][arg4 + 1][arg1] = 50;
                        class104.field1845[arg5][arg4 + 1][arg1 + 1] = 50;
                    }
                    if (var11.field515) {
                        class252.field4188[arg5][arg4 + 1][arg1] = class11.method71(class252.field4188[arg5][arg4 + 1][arg1], 1);
                    }
                } else if (arg3 == 3) {
                    if (var11.field530) {
                        class104.field1845[arg5][arg4][arg1] = 50;
                        class104.field1845[arg5][arg4 + 1][arg1] = 50;
                    }
                    if (var11.field515) {
                        class252.field4188[arg5][arg4][arg1] = class11.method71(class252.field4188[arg5][arg4][arg1], 2);
                    }
                }
            }
            if (var11.field588 != 0 && arg8 != null) {
                arg8.method396(arg3, arg6, var11.field570, arg1, arg4, (byte) -39);
            }
            if (var11.field566 != 16) {
                class202.method1408(arg5, arg4, arg1, var11.field566);
            }
        } else if (arg6 == 1) {
            class196 var33;
            if (var11.field577 == -1 && var11.field546 == null) {
                class294 var32 = var11.method257(var24, 1, var19, -127, arg3, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var32.field4939, var19, var21, var22);
                }
                var33 = var32.field4941;
            } else {
                var33 = new class280(arg10, 1, arg3, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
            }
            class41.method376(arg5, arg4, arg1, var20, var33, (class196) null, class120.field2022[arg3], 0, var27);
            if (var11.field530 && arg0) {
                if (arg3 == 0) {
                    class104.field1845[arg5][arg4][arg1 + 1] = 50;
                } else if (arg3 == 1) {
                    class104.field1845[arg5][arg4 + 1][arg1 + 1] = 50;
                } else if (arg3 == 2) {
                    class104.field1845[arg5][arg4 + 1][arg1] = 50;
                } else if (arg3 == 3) {
                    class104.field1845[arg5][arg4][arg1] = 50;
                }
            }
            if (var11.field588 != 0 && arg8 != null) {
                arg8.method396(arg3, arg6, var11.field570, arg1, arg4, (byte) -39);
            }
        } else if (arg6 == 2) {
            int var34 = arg3 + 1 & 0x3;
            class196 var36;
            class196 var38;
            if (var11.field577 == -1 && var11.field546 == null) {
                class294 var35 = var11.method257(var24, 2, var19, -126, arg3 + 4, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var35.field4939, var19, var21, var22);
                }
                var36 = var35.field4941;
                class294 var37 = var11.method257(var24, 2, var19, -127, var34, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var37.field4939, var19, var21, var22);
                }
                var38 = var37.field4941;
            } else {
                var36 = new class280(arg10, 2, arg3 + 4, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
                var38 = new class280(arg10, 2, var34, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
            }
            class41.method376(arg5, arg4, arg1, var20, var36, var38, class299.field5004[arg3], class299.field5004[var34], var27);
            if (var11.field515 && arg0) {
                if (arg3 == 0) {
                    class252.field4188[arg5][arg4][arg1] = class11.method71(class252.field4188[arg5][arg4][arg1], 1);
                    class252.field4188[arg5][arg4][arg1 + 1] = class11.method71(class252.field4188[arg5][arg4][arg1 + 1], 2);
                } else if (arg3 == 1) {
                    class252.field4188[arg5][arg4][arg1 + 1] = class11.method71(class252.field4188[arg5][arg4][arg1 + 1], 2);
                    class252.field4188[arg5][arg4 + 1][arg1] = class11.method71(class252.field4188[arg5][arg4 + 1][arg1], 1);
                } else if (arg3 == 2) {
                    class252.field4188[arg5][arg4 + 1][arg1] = class11.method71(class252.field4188[arg5][arg4 + 1][arg1], 1);
                    class252.field4188[arg5][arg4][arg1] = class11.method71(class252.field4188[arg5][arg4][arg1], 2);
                } else if (arg3 == 3) {
                    class252.field4188[arg5][arg4][arg1] = class11.method71(class252.field4188[arg5][arg4][arg1], 2);
                    class252.field4188[arg5][arg4][arg1] = class11.method71(class252.field4188[arg5][arg4][arg1], 1);
                }
            }
            if (var11.field588 != 0 && arg8 != null) {
                arg8.method396(arg3, arg6, var11.field570, arg1, arg4, (byte) -39);
            }
            if (var11.field566 != 16) {
                class202.method1408(arg5, arg4, arg1, var11.field566);
            }
        } else if (arg6 == 3) {
            class196 var40;
            if (var11.field577 == -1 && var11.field546 == null) {
                class294 var39 = var11.method257(var24, 3, var19, -124, arg3, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var39.field4939, var19, var21, var22);
                }
                var40 = var39.field4941;
            } else {
                var40 = new class280(arg10, 3, arg3, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
            }
            class41.method376(arg5, arg4, arg1, var20, var40, (class196) null, class120.field2022[arg3], 0, var27);
            if (var11.field530 && arg0) {
                if (arg3 == 0) {
                    class104.field1845[arg5][arg4][arg1 + 1] = 50;
                } else if (arg3 == 1) {
                    class104.field1845[arg5][arg4 + 1][arg1 + 1] = 50;
                } else if (arg3 == 2) {
                    class104.field1845[arg5][arg4 + 1][arg1] = 50;
                } else if (arg3 == 3) {
                    class104.field1845[arg5][arg4][arg1] = 50;
                }
            }
            if (var11.field588 != 0 && arg8 != null) {
                arg8.method396(arg3, arg6, var11.field570, arg1, arg4, (byte) -39);
            }
        } else if (arg6 == 9) {
            class196 var42;
            if (var11.field577 == -1 && var11.field546 == null) {
                class294 var41 = var11.method257(var24, arg6, var19, -126, arg3, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var41.field4939, var19, var21, var22);
                }
                var42 = var41.field4941;
            } else {
                var42 = new class280(arg10, arg6, arg3, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
            }
            class73.method544(arg5, arg4, arg1, var20, 1, 1, var42, 0, var27);
            if (var11.field588 != 0 && arg8 != null) {
                arg8.method410(arg4, -85, arg1, var12, var11.field570, var13);
            }
            if (var11.field566 != 16) {
                class202.method1408(arg5, arg4, arg1, var11.field566);
            }
        } else if (arg6 == 4) {
            class196 var67;
            if (var11.field577 == -1 && var11.field546 == null) {
                class294 var66 = var11.method257(var24, 4, var19, -125, arg3, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var66.field4939, var19, var21, var22);
                }
                var67 = var66.field4941;
            } else {
                var67 = new class280(arg10, 4, arg3, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
            }
            class98.method728(arg5, arg4, arg1, var20, var67, (class196) null, class299.field5004[arg3], 0, 0, 0, var27);
        } else if (arg6 == 5) {
            int var43 = 16;
            long var44 = class56.method478(arg5, arg4, arg1);
            if (var44 != 0L) {
                var43 = class72.method540(0, Integer.MAX_VALUE & (int) (var44 >>> 32)).field566;
            }
            class196 var47;
            if (var11.field577 == -1 && var11.field546 == null) {
                class294 var46 = var11.method257(var24, 4, var19, -124, arg3, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var46.field4939, var19 - (class297.field4964[arg3] * 8), var21, var22 - (class250.field4150[arg3] * 8));
                }
                var47 = var46.field4941;
            } else {
                var47 = new class280(arg10, 4, arg3, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
            }
            class98.method728(arg5, arg4, arg1, var20, var47, (class196) null, class299.field5004[arg3], 0, class297.field4964[arg3] * var43, class250.field4150[arg3] * var43, var27);
        } else if (arg6 == 6) {
            long var48 = class56.method478(arg5, arg4, arg1);
            int var50 = 8;
            if (var48 != 0L) {
                var50 = class72.method540(0, Integer.MAX_VALUE & (int) (var48 >>> 32)).field566 / 2;
            }
            class196 var52;
            if (var11.field577 == -1 && var11.field546 == null) {
                class294 var51 = var11.method257(var24, 4, var19, -124, arg3 + 4, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var51.field4939, var19 - class45.field882[arg3] * 8, var21, var22 - class78.field1320[arg3] * 8);
                }
                var52 = var51.field4941;
            } else {
                var52 = new class280(arg10, 4, arg3 + 4, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
            }
            class98.method728(arg5, arg4, arg1, var20, var52, (class196) null, 256, arg3, class45.field882[arg3] * var50, class78.field1320[arg3] * var50, var27);
        } else if (arg6 == 7) {
            int var53 = arg3 + 2 & 0x3;
            class196 var55;
            if (var11.field577 == -1 && var11.field546 == null) {
                class294 var54 = var11.method257(var24, 4, var19, -127, var53 + 4, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var54.field4939, var19, var21, var22);
                }
                var55 = var54.field4941;
            } else {
                var55 = new class280(arg10, 4, var53 + 4, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
            }
            class98.method728(arg5, arg4, arg1, var20, var55, (class196) null, 256, var53, 0, 0, var27);
        } else if (arg6 == 8) {
            long var56 = class56.method478(arg5, arg4, arg1);
            int var58 = 8;
            if (var56 != 0L) {
                var58 = class72.method540(0, Integer.MAX_VALUE & (int) (var56 >>> 32)).field566 / 2;
            }
            int var59 = arg3 + 2 & 0x3;
            class196 var63;
            class196 var65;
            if (var11.field577 == -1 && var11.field546 == null) {
                int var60 = class45.field882[arg3] * 8;
                int var61 = class78.field1320[arg3] * 8;
                class294 var62 = var11.method257(var24, 4, var19, -128, arg3 + 4, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var62.field4939, var19 - var60, var21, var22 - var61);
                }
                var63 = var62.field4941;
                class294 var64 = var11.method257(var24, 4, var19, -124, var59 + 4, var20, var16, (class114) null, arg0, var22, var29);
                if (class21.field350 && var29) {
                    class241.method1700(var64.field4939, var19 - var60, var21, var22 - var61);
                }
                var65 = var64.field4941;
            } else {
                var63 = new class280(arg10, 4, arg3 + 4, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
                var65 = new class280(arg10, 4, var59 + 4, arg7, arg4, arg1, var11.field577, var11.field524, (class196) null);
            }
            class98.method728(arg5, arg4, arg1, var20, var63, var65, 256, arg3, class45.field882[arg3] * var58, class78.field1320[arg3] * var58, var27);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(JI)V", line = 1245)
    public final void method495(long arg0, int arg1) throws IOException {
        field1098++;
        if ((long) arg1 > arg0) {
            throw new IOException("Invalid seek to " + arg0 + " in file " + this.method497(-45));
        }
        this.field1123 = arg0;
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V", line = 1258)
    private final void method496(byte arg0) throws IOException {
        field1110++;
        this.field1104 = 0;
        if (arg0 != 41) {
            method494(true, -97, false, 95, -73, -90, 42, 64, (class44) null, (byte) 111, 49);
        }
        if (this.field1123 != this.field1108) {
            this.field1119.method1375(0, this.field1123);
            this.field1108 = this.field1123;
        }
        this.field1109 = this.field1123;
        while (this.field1111.length > this.field1104) {
            int var2 = this.field1111.length - this.field1104;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field1119.method1371(this.field1104, 1, var2, this.field1111);
            if (var3 == -1) {
                break;
            }
            this.field1104 += var3;
            this.field1108 += (long) var3;
        }
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(I)Ljava/io/File;", line = 1309)
    private final File method497(int arg0) {
        if (arg0 > -34) {
            method486((byte) 120);
        }
        field1102++;
        return this.field1119.method1374(0);
    }
}
