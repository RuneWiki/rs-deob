import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class143 extends class36 {

    @OriginalMember(owner = "client!th", name = "w", descriptor = "Lqc;")
    public static class99 field1950 = new class99(30);

    @OriginalMember(owner = "client!th", name = "L", descriptor = "Ljava/lang/String;")
    public static String field1964 = " from your friend list first.";

    @OriginalMember(owner = "client!th", name = "H", descriptor = "Lfm;")
    public static class53 field1960 = new class53(16);

    @OriginalMember(owner = "client!th", name = "N", descriptor = "[J")
    public static long[] field1966 = new long[100];

    @OriginalMember(owner = "client!th", name = "x", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!th", name = "y", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!th", name = "z", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!th", name = "B", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!th", name = "C", descriptor = "I")
    public static int field1955;

    @OriginalMember(owner = "client!th", name = "D", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!th", name = "E", descriptor = "I")
    public static int field1957;

    @OriginalMember(owner = "client!th", name = "F", descriptor = "I")
    public int field1958;

    @OriginalMember(owner = "client!th", name = "G", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!th", name = "I", descriptor = "I")
    public static int field1961;

    @OriginalMember(owner = "client!th", name = "J", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!th", name = "K", descriptor = "I")
    public int field1963;

    @OriginalMember(owner = "client!th", name = "M", descriptor = "I")
    public int field1965;

    @OriginalMember(owner = "client!th", name = "P", descriptor = "Lkm;")
    public static class133 field1968;

    @OriginalMember(owner = "client!th", name = "v", descriptor = "Ljava/lang/String;")
    public String field1949;

    @OriginalMember(owner = "client!th", name = "O", descriptor = "[[[I")
    public static int[][][] field1967;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1027(boolean arg0) {
        if (!arg0) {
            field1966 = (long[]) null;
        }
        field1950 = null;
        field1968 = null;
        field1964 = null;
        field1960 = null;
        field1966 = null;
        field1967 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(I)I", line = 21)
    public final int method1028(int arg0) {
        if (arg0 > -90) {
            this.field1963 = 47;
        }
        field1961++;
        return (int) (this.field2522 >>> 32 & 0xFFL);
    }

    @OriginalMember(owner = "client!th", name = "e", descriptor = "(I)I", line = 32)
    public static final int method1029(int arg0) {
        field1959++;
        if (class132.field1811 == null) {
            return -1;
        }
        while (class89.field1255 < class132.field1811.field2397) {
            if (class132.field1811.method1225(-1, class89.field1255)) {
                return class89.field1255++;
            }
            class89.field1255++;
        }
        if (arg0 <= 94) {
            method1036(126, 114);
        }
        return -1;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(III)Z", line = 62)
    public static final boolean method1030(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class56.field769; var3++) {
            class209 var4 = class201.field2865[var3];
            if (var4.field3007 == 1) {
                int var5 = var4.field3016 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field3023 * var5 >> 8) + var4.field3019;
                    int var7 = (var4.field3018 * var5 >> 8) + var4.field3010;
                    int var8 = (var4.field3017 * var5 >> 8) + var4.field3005;
                    int var9 = (var4.field3013 * var5 >> 8) + var4.field3008;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field3007 == 2) {
                int var10 = arg0 - var4.field3016;
                if (var10 > 0) {
                    int var11 = (var4.field3023 * var10 >> 8) + var4.field3019;
                    int var12 = (var4.field3018 * var10 >> 8) + var4.field3010;
                    int var13 = (var4.field3017 * var10 >> 8) + var4.field3005;
                    int var14 = (var4.field3013 * var10 >> 8) + var4.field3008;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field3007 == 3) {
                int var15 = var4.field3019 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field3021 * var15 >> 8) + var4.field3016;
                    int var17 = (var4.field3015 * var15 >> 8) + var4.field3024;
                    int var18 = (var4.field3017 * var15 >> 8) + var4.field3005;
                    int var19 = (var4.field3013 * var15 >> 8) + var4.field3008;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field3007 == 4) {
                int var20 = arg2 - var4.field3019;
                if (var20 > 0) {
                    int var21 = (var4.field3021 * var20 >> 8) + var4.field3016;
                    int var22 = (var4.field3015 * var20 >> 8) + var4.field3024;
                    int var23 = (var4.field3017 * var20 >> 8) + var4.field3005;
                    int var24 = (var4.field3013 * var20 >> 8) + var4.field3008;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field3007 == 5) {
                int var25 = arg1 - var4.field3005;
                if (var25 > 0) {
                    int var26 = (var4.field3021 * var25 >> 8) + var4.field3016;
                    int var27 = (var4.field3015 * var25 >> 8) + var4.field3024;
                    int var28 = (var4.field3023 * var25 >> 8) + var4.field3019;
                    int var29 = (var4.field3018 * var25 >> 8) + var4.field3010;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(ZB)V", line = 194)
    public static final void method1031(boolean arg0, byte arg1) {
        class256.field3680 = new int[104];
        class82.field1196 = new int[104];
        class44.field542 = new int[104];
        class320.field4868 = 99;
        class134.field1857 = new int[104];
        if (arg1 >= -39) {
            field1966 = (long[]) null;
        }
        field1952++;
        class230.field3259 = new int[104];
        class201.field2862 = new int[5];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class232.field3277 = new byte[var2][104][104];
        class242.field3458 = new byte[var2][105][105];
        class108.field1463 = new byte[var2][104][104];
        class334.field5051 = new int[var2][105][105];
        class247.field3565 = new byte[var2][104][104];
        class221.field3164 = new byte[var2][104][104];
    }

    @OriginalMember(owner = "client!th", name = "d", descriptor = "(B)V", line = 227)
    public final void method1032(byte arg0) {
        field1951++;
        this.field414 |= Long.MIN_VALUE;
        if (this.method1039(116) == 0L) {
            class315.field4745.method443(true, this);
        }
        if (arg0 <= 107) {
            field1950 = (class99) null;
        }
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(IIIILdn;JZ)V", line = 243)
    public static final void method1033(int arg0, int arg1, int arg2, int arg3, class132 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class306 var8 = new class306();
        var8.field4586 = arg4;
        var8.field4581 = arg1 * 128 + 64;
        var8.field4588 = arg2 * 128 + 64;
        var8.field4583 = arg3;
        var8.field4580 = arg5;
        var8.field4582 = arg6;
        if (class142.field1940[arg0][arg1][arg2] == null) {
            class142.field1940[arg0][arg1][arg2] = new class202(arg0, arg1, arg2);
        }
        class142.field1940[arg0][arg1][arg2].field2869 = var8;
    }

    @OriginalMember(owner = "client!th", name = "f", descriptor = "(I)I", line = 263)
    public static final int method1034(int arg0) {
        field1954++;
        try {
            if (class318.field4860 == 0) {
                if ((class29.method174(27763) - 5000L) < class293.field4363) {
                    return 0;
                }
                class125.field1697 = class165.field2258.method618(class273.field4088, class296.field4391, 95);
                class336.field5065 = class29.method174(27763);
                class318.field4860 = 1;
            }
            if (class336.field5065 + 30000L < class29.method174(27763)) {
                return class59.method405(1000, 109);
            }
            if (class318.field4860 == 1) {
                if (class125.field1697.field4241 == 2) {
                    return class59.method405(1001, 118);
                }
                if (class125.field1697.field4241 != 1) {
                    return -1;
                }
                class39.field442 = new class223((Socket) class125.field1697.field4244, class165.field2258);
                class125.field1697 = null;
                int var1 = 0;
                if (class101.field1395) {
                    var1 = class107.field1440;
                }
                class90.field1264.field4777 = 0;
                class90.field1264.method2184((byte) 89, 23);
                class90.field1264.method2188(255, var1);
                class39.field442.method1575(class90.field1264.field4777, 0, 5000, class90.field1264.field4798);
                if (class96.field1291 != null) {
                    class96.field1291.method1770((byte) -115);
                }
                if (class344.field5325 != null) {
                    class344.field5325.method1770((byte) -127);
                }
                int var2 = class39.field442.method1570((byte) 127);
                if (class96.field1291 != null) {
                    class96.field1291.method1770((byte) -60);
                }
                if (class344.field5325 != null) {
                    class344.field5325.method1770((byte) -50);
                }
                if (var2 != 0) {
                    return class59.method405(var2, 120);
                }
                class318.field4860 = 2;
            }
            if (class318.field4860 == 2) {
                if (class39.field442.method1572(0) < 2) {
                    return -1;
                }
                class6.field51 = class39.field442.method1570((byte) 32);
                class6.field51 <<= 0x8;
                class6.field51 += class39.field442.method1570((byte) 109);
                class11.field117 = 0;
                class187.field2587 = new byte[class6.field51];
                class318.field4860 = 3;
            }
            int var3 = -75 % ((15 - arg0) / 57);
            if (class318.field4860 != 3) {
                return -1;
            }
            int var4 = class39.field442.method1572(0);
            if (var4 < 1) {
                return -1;
            }
            if ((class6.field51 - class11.field117) < var4) {
                var4 = class6.field51 - class11.field117;
            }
            class39.field442.method1573(class187.field2587, var4, -19451, class11.field117);
            class11.field117 += var4;
            if (class6.field51 > class11.field117) {
                return -1;
            } else if (class327.method2290((byte) -38, class187.field2587)) {
                class262.field3848 = new class259[class188.field2604];
                int var5 = 0;
                for (int var6 = class65.field853; var6 <= class318.field4855; var6++) {
                    class259 var7 = class125.method901(true, var6);
                    if (var7 != null) {
                        class262.field3848[var5++] = var7;
                    }
                }
                class39.field442.method1577((byte) -100);
                class318.field4860 = 0;
                class39.field442 = null;
                class181.field2452 = 0;
                class187.field2587 = null;
                class293.field4363 = class29.method174(27763);
                return 0;
            } else {
                return class59.method405(1002, 107);
            }
        } catch (IOException var9) {
            return class59.method405(1003, 110);
        }
    }

    @OriginalMember(owner = "client!th", name = "b", descriptor = "(Z)I", line = 391)
    public final int method1035(boolean arg0) {
        if (!arg0) {
            this.method1028(39);
        }
        field1953++;
        return (int) this.field2522;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(II)V", line = 403)
    public static final void method1036(int arg0, int arg1) {
        if (arg1 != -181413792) {
            method1036(-6, 83);
        }
        field1957++;
        class145.field2001.method720(arg0, arg1 + 181414880);
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lkm;III)Lpn;", line = 418)
    public static final class170 method1037(class133 arg0, int arg1, int arg2, int arg3) {
        if (arg1 > -93) {
            field1966 = (long[]) null;
        }
        field1962++;
        return class129.method931(arg2, arg3, arg0, (byte) 105) ? class246.method1688(-49) : null;
    }

    @OriginalMember(owner = "client!th", name = "g", descriptor = "(I)V", line = 433)
    public final void method1038(int arg0) {
        this.field414 = Long.MIN_VALUE & this.field414 | class29.method174(27763) + 500L;
        field1956++;
        class187.field2581.method443(true, this);
        if (arg0 != 0) {
            field1950 = (class99) null;
        }
    }

    @OriginalMember(owner = "client!th", name = "h", descriptor = "(I)J", line = 451)
    public final long method1039(int arg0) {
        field1955++;
        if (arg0 < 60) {
            this.field1965 = -67;
        }
        return this.field414 & Long.MAX_VALUE;
    }

    @OriginalMember(owner = "client!th", name = "<init>", descriptor = "(II)V", line = 463)
    public class143(int arg0, int arg1) {
        this.field2522 = (long) arg1 | (long) arg0 << 32;
    }
}
