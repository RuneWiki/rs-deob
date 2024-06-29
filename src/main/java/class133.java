import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class133 {

    @OriginalMember(owner = "client!l", name = "H", descriptor = "Lqm;")
    private class216 field2126 = null;

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lra;")
    private class178 field2108;

    @OriginalMember(owner = "client!l", name = "J", descriptor = "Z")
    private boolean field2128;

    @OriginalMember(owner = "client!l", name = "E", descriptor = "Z")
    private boolean field2123;

    @OriginalMember(owner = "client!l", name = "F", descriptor = "I")
    public static int field2124 = 0;

    @OriginalMember(owner = "client!l", name = "y", descriptor = "Ljava/lang/String;")
    public static String field2117 = "Loading world list data";

    @OriginalMember(owner = "client!l", name = "N", descriptor = "I")
    public static int field2132 = 0;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "I")
    public static int field2105;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "I")
    public static int field2107;

    @OriginalMember(owner = "client!l", name = "q", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!l", name = "r", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!l", name = "s", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!l", name = "t", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!l", name = "u", descriptor = "I")
    public static int field2113;

    @OriginalMember(owner = "client!l", name = "v", descriptor = "I")
    public static int field2114;

    @OriginalMember(owner = "client!l", name = "x", descriptor = "I")
    public static int field2116;

    @OriginalMember(owner = "client!l", name = "z", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!l", name = "A", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!l", name = "C", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!l", name = "D", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!l", name = "G", descriptor = "I")
    public static int field2125;

    @OriginalMember(owner = "client!l", name = "I", descriptor = "I")
    public static int field2127;

    @OriginalMember(owner = "client!l", name = "K", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!l", name = "L", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!l", name = "M", descriptor = "I")
    public static int field2131;

    @OriginalMember(owner = "client!l", name = "P", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!l", name = "Q", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!l", name = "R", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!l", name = "B", descriptor = "[Ljava/lang/Object;")
    private Object[] field2120;

    @OriginalMember(owner = "client!l", name = "w", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field2115;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IB)Loh;", line = 11)
    public static final class281 method948(int arg0, byte arg1) {
        field2100++;
        class281 var2 = (class281) class202.field3028.method2179(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class77.field1240.method980(class80.method578(arg0, arg1 ^ 0xFFFFE9A4), class275.method1889(arg0, true), 5);
        class281 var4 = new class281();
        var4.field4340 = arg0;
        if (var3 != null) {
            var4.method1922(-13091, new class166(var3));
        }
        if (arg1 == 33) {
            var4.method1925(22463);
            class202.field3028.method2173(var4, true, (long) arg0);
            return var4;
        } else {
            return (class281) null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(III)Z", line = 46)
    public final boolean method949(int arg0, int arg1, int arg2) {
        field2097++;
        if (!this.method953(arg0, arg1, (byte) -117)) {
            return false;
        } else if (this.field2115[arg1] != null && this.field2115[arg1][arg0] != null) {
            return true;
        } else if (this.field2120[arg1] == null) {
            this.method972(arg1, 1);
            if (arg2 != -17264) {
                field2132 = -58;
            }
            return this.field2120[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)V", line = 73)
    public static void method950(int arg0) {
        field2117 = null;
        if (arg0 != 27692) {
            method960((class220) null, false);
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IB)Z", line = 84)
    public final boolean method951(int arg0, byte arg1) {
        field2104++;
        if (arg1 != 102) {
            return false;
        } else if (!this.method965(arg0, (byte) 110)) {
            return false;
        } else if (this.field2120[arg0] == null) {
            this.method972(arg0, 1);
            return this.field2120[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([III)Z", line = 112)
    private final boolean method952(int[] arg0, int arg1, int arg2) {
        field2127++;
        if (!this.method965(arg1, (byte) 127)) {
            return false;
        } else if (this.field2120[arg1] == null) {
            return false;
        } else {
            int var4 = this.field2126.field3285[arg1];
            if (arg2 != -7048) {
                field2132 = 61;
            }
            int[] var5 = this.field2126.field3288[arg1];
            boolean var6 = true;
            if (this.field2115[arg1] == null) {
                this.field2115[arg1] = new Object[this.field2126.field3284[arg1]];
            }
            Object[] var7 = this.field2115[arg1];
            for (int var8 = 0; var8 < var4; var8++) {
                int var9;
                if (var5 == null) {
                    var9 = var8;
                } else {
                    var9 = var5[var8];
                }
                if (var7[var9] == null) {
                    var6 = false;
                    break;
                }
            }
            if (var6) {
                return true;
            }
            byte[] var10;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var10 = class101.method740(true, this.field2120[arg1], -126);
                class166 var11 = new class166(var10);
                var11.method1181(115, 5, var11.field2500.length, arg0);
            } else {
                var10 = class101.method740(false, this.field2120[arg1], -116);
            }
            byte[] var12;
            try {
                var12 = class345.method2386(21301, var10);
            } catch (RuntimeException var31) {
                throw class252.method1744(var31, "T3 - " + (arg0 != null) + "," + arg1 + "," + var10.length + "," + class263.method1789((byte) -22, var10, var10.length) + "," + class263.method1789((byte) -22, var10, var10.length - 2) + "," + this.field2126.field3275[arg1] + "," + this.field2126.field3286);
            }
            if (this.field2123) {
                this.field2120[arg1] = null;
            }
            if (var4 > 1) {
                int var14 = var12.length;
                int var32 = var14 - 1;
                int var15 = var12[var32] & 0xFF;
                int var16 = var32 - var4 * 4 * var15;
                class166 var17 = new class166(var12);
                var17.field2532 = var16;
                int[] var18 = new int[var4];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = 0;
                    for (int var21 = 0; var21 < var4; var21++) {
                        if (var5 == null) {
                        }
                        var20 += var17.method1137(arg2 ^ 0xFFFFE43C);
                        var18[var21] += var20;
                    }
                }
                byte[][] var22 = new byte[var4][];
                for (int var23 = 0; var23 < var4; var23++) {
                    var22[var23] = new byte[var18[var23]];
                    var18[var23] = 0;
                }
                var17.field2532 = var16;
                int var24 = 0;
                for (int var25 = 0; var25 < var15; var25++) {
                    int var26 = 0;
                    for (int var27 = 0; var27 < var4; var27++) {
                        var26 += var17.method1137(arg2 ^ 0x1BDA);
                        class343.method2373(var12, var24, var22[var27], var18[var27], var26);
                        var24 += var26;
                        var18[var27] += var26;
                    }
                }
                for (int var28 = 0; var28 < var4; var28++) {
                    int var29;
                    if (var5 == null) {
                        var29 = var28;
                    } else {
                        var29 = var5[var28];
                    }
                    if (this.field2128) {
                        var7[var29] = var22[var28];
                    } else {
                        var7[var29] = class303.method2072(-7948, var22[var28], false);
                    }
                }
            } else {
                int var30;
                if (var5 == null) {
                    var30 = 0;
                } else {
                    var30 = var5[0];
                }
                if (this.field2128) {
                    var7[var30] = var12;
                } else {
                    var7[var30] = class303.method2072(-7948, var12, false);
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIB)Z", line = 311)
    private final boolean method953(int arg0, int arg1, byte arg2) {
        field2105++;
        if (!this.method977((byte) 95)) {
            return false;
        } else if (arg1 >= 0 && arg0 >= 0 && arg1 < this.field2126.field3284.length && this.field2126.field3284[arg1] > arg0) {
            if (arg2 != -117) {
                this.method980(-73, -52, 10);
            }
            return true;
        } else if (class154.field2311) {
            throw new IllegalArgumentException(arg1 + "," + arg0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II)I", line = 335)
    public final int method954(int arg0, int arg1) {
        if (arg0 != -24001) {
            this.method963(-128);
        }
        field2096++;
        return this.method965(arg1, (byte) 105) ? this.field2126.field3284[arg1] : 0;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V", line = 353)
    public final void method955(byte arg0) {
        field2135++;
        if (arg0 >= 30 && this.field2115 != null) {
            for (int var2 = 0; var2 < this.field2115.length; var2++) {
                this.field2115[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZ)Z", line = 376)
    public final boolean method956(int arg0, boolean arg1) {
        field2107++;
        if (!this.method977((byte) 118)) {
            return false;
        } else if (this.field2126.field3284.length == 1) {
            return this.method949(arg0, 0, -17264);
        } else {
            if (!arg1) {
                this.method951(-43, (byte) 28);
            }
            if (!this.method965(arg0, (byte) 125)) {
                return false;
            } else if (this.field2126.field3284[arg0] == 1) {
                return this.method949(0, arg0, -17264);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(II[II)[B", line = 404)
    public final byte[] method957(int arg0, int arg1, int[] arg2, int arg3) {
        field2103++;
        if (arg0 > -122) {
            field2132 = -20;
        }
        if (!this.method953(arg1, arg3, (byte) -117)) {
            return null;
        }
        if (this.field2115[arg3] == null || this.field2115[arg3][arg1] == null) {
            boolean var5 = this.method952(arg2, arg3, -7048);
            if (!var5) {
                this.method972(arg3, 1);
                boolean var6 = this.method952(arg2, arg3, -7048);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class101.method740(false, this.field2115[arg3][arg1], -121);
        if (this.field2128) {
            this.field2115[arg3][arg1] = null;
            if (this.field2126.field3284[arg3] == 1) {
                this.field2115[arg3] = null;
            }
        }
        return var7;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z", line = 448)
    public final boolean method958(byte arg0, String arg1, String arg2) {
        field2121++;
        if (!this.method977((byte) 76)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        if (arg0 != -113) {
            field2124 = -7;
        }
        String var5 = arg2.toLowerCase();
        int var6 = this.field2126.field3274.method1749(class338.method2350(var4, arg0 - 32103), 0);
        if (this.method965(var6, (byte) 109)) {
            int var7 = this.field2126.field3294[var6].method1749(class338.method2350(var5, -32216), 0);
            return this.method949(var7, var6, -17264);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(BLjava/lang/String;Ljava/lang/String;)[B", line = 477)
    public final byte[] method959(byte arg0, String arg1, String arg2) {
        if (arg0 != -23) {
            return (byte[]) null;
        }
        field2095++;
        if (!this.method977((byte) 61)) {
            return null;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field2126.field3274.method1749(class338.method2350(var4, -32216), 0);
        if (this.method965(var6, (byte) 112)) {
            int var7 = this.field2126.field3294[var6].method1749(class338.method2350(var5, -32216), 0);
            return this.method980(var6, var7, 5);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ltb;Z)V", line = 503)
    public static final void method960(class220 arg0, boolean arg1) {
        field2131++;
        class220 var2 = class67.method513(20786, arg0);
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class188.field2816;
            var4 = class322.field5024;
        } else {
            var3 = var2.field3526;
            var4 = var2.field3458;
        }
        class332.method2309(false, arg1, arg0, var3, var4);
        class292.method1996(var4, var3, arg0, 112);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ILjava/lang/String;)I", line = 529)
    public final int method961(int arg0, String arg1) {
        field2099++;
        if (this.method977((byte) 50)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2126.field3274.method1749(class338.method2350(var3, -32216), arg0);
            return this.method982((byte) -121, var4);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 545)
    public final boolean method962(byte arg0, String arg1) {
        field2130++;
        if (!this.method977((byte) 50)) {
            return false;
        }
        if (arg0 > -48) {
            this.field2108 = (class178) null;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field2126.field3274.method1749(class338.method2350(var3, -32216), 0);
        return this.method951(var4, (byte) 102);
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(I)I", line = 563)
    public final int method963(int arg0) {
        if (arg0 != 30836) {
            this.method958((byte) -32, (String) null, (String) null);
        }
        field2119++;
        if (!this.method977((byte) 112)) {
            throw new IllegalStateException("");
        }
        return this.field2126.field3286;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(ILjava/lang/String;)Z", line = 578)
    public final boolean method964(int arg0, String arg1) {
        field2133++;
        if (this.method977((byte) 98)) {
            String var3 = arg1.toLowerCase();
            int var4 = -69 / ((arg0 + 46) / 49);
            int var5 = this.field2126.field3274.method1749(class338.method2350(var3, -32216), 0);
            return var5 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(IB)Z", line = 600)
    private final boolean method965(int arg0, byte arg1) {
        if (arg1 <= 101) {
            return true;
        }
        field2093++;
        if (!this.method977((byte) 56)) {
            return false;
        } else if (arg0 >= 0 && arg0 < this.field2126.field3284.length && this.field2126.field3284[arg0] != 0) {
            return true;
        } else if (class154.field2311) {
            throw new IllegalArgumentException(Integer.toString(arg0));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(ILjava/lang/String;)V", line = 626)
    public final void method966(int arg0, String arg1) {
        if (arg0 > 0) {
            return;
        }
        field2134++;
        if (this.method977((byte) 123)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field2126.field3274.method1749(class338.method2350(var3, -32216), 0);
            this.method974(var4, -106);
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(I)Z", line = 644)
    public final boolean method967(int arg0) {
        field2110++;
        if (!this.method977((byte) 76)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field2126.field3282.length; var3++) {
            int var4 = this.field2126.field3282[var3];
            if (this.field2120[var4] == null) {
                this.method972(var4, 1);
                if (this.field2120[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(III)[B", line = 678)
    public final byte[] method968(int arg0, int arg1, int arg2) {
        field2106++;
        if (!this.method953(arg1, arg0, (byte) -117)) {
            return null;
        }
        if (this.field2115[arg0] == null || this.field2115[arg0][arg1] == null) {
            boolean var4 = this.method952((int[]) null, arg0, arg2 - 7048);
            if (!var4) {
                this.method972(arg0, 1);
                boolean var5 = this.method952((int[]) null, arg0, -7048);
                if (!var5) {
                    return null;
                }
            }
        }
        return arg2 == 0 ? class101.method740(false, this.field2115[arg0][arg1], -120) : (byte[]) null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZI)[B", line = 711)
    public final byte[] method969(boolean arg0, int arg1) {
        field2098++;
        if (!this.method977((byte) 52)) {
            return null;
        } else if (this.field2126.field3284.length == 1) {
            return this.method980(0, arg1, 5);
        } else {
            if (!arg0) {
                this.field2115 = (Object[][]) ((Object[][]) null);
            }
            if (!this.method965(arg1, (byte) 106)) {
                return null;
            } else if (this.field2126.field3284[arg1] == 1) {
                return this.method980(arg1, 0, 5);
            } else {
                throw new RuntimeException();
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 738)
    public final int method970(String arg0, byte arg1) {
        if (arg1 != -10) {
            this.method958((byte) -108, (String) null, (String) null);
        }
        field2112++;
        if (this.method977((byte) 53)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field2126.field3274.method1749(class338.method2350(var3, arg1 ^ 0x7DDE), arg1 + 10);
            return this.method965(var4, (byte) 119) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(IB)V", line = 760)
    public final void method971(int arg0, byte arg1) {
        field2125++;
        if (arg1 == 41 && this.method965(arg0, (byte) 112) && this.field2115 != null) {
            this.field2115[arg0] = null;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(II)V", line = 783)
    private final void method972(int arg0, int arg1) {
        if (this.field2123) {
            this.field2120[arg0] = this.field2108.method788(arg0, (byte) -43);
        } else {
            this.field2120[arg0] = class303.method2072(-7948, this.field2108.method788(arg0, (byte) -43), false);
        }
        if (arg1 == 1) {
            field2102++;
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(II)[I", line = 810)
    public final int[] method973(int arg0, int arg1) {
        field2118++;
        if (!this.method965(arg1, (byte) 124)) {
            return null;
        }
        if (arg0 != 0) {
            this.method949(119, 7, -24);
        }
        int[] var3 = this.field2126.field3288[arg1];
        if (var3 == null) {
            var3 = new int[this.field2126.field3285[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(II)V", line = 840)
    private final void method974(int arg0, int arg1) {
        field2101++;
        if (arg1 > -93) {
            this.field2128 = true;
        }
        this.field2108.method785(false, arg0);
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IZZ)V", line = 851)
    public final void method975(int arg0, boolean arg1, boolean arg2) {
        field2122++;
        if (!this.method977((byte) 63)) {
            return;
        }
        if (arg1) {
            this.field2126.field3295 = null;
            this.field2126.field3274 = null;
        }
        if (arg2) {
            this.field2126.field3294 = null;
            this.field2126.field3280 = (int[][]) null;
        }
        if (arg0 != 0) {
            this.method955((byte) -50);
        }
    }

    @OriginalMember(owner = "client!l", name = "d", descriptor = "(I)I", line = 878)
    public final int method976(int arg0) {
        field2114++;
        if (!this.method977((byte) 118)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field2120.length; var4++) {
            if (this.field2126.field3285[var4] > 0) {
                var3 += 100;
                var2 += this.method982((byte) -76, var4);
            }
        }
        if (arg0 == var3) {
            return 100;
        } else {
            return var2 * 100 / var3;
        }
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(B)Z", line = 917)
    private final boolean method977(byte arg0) {
        field2116++;
        if (arg0 <= 45) {
            field2124 = -121;
        }
        if (this.field2126 == null) {
            this.field2126 = this.field2108.method775(-72);
            if (this.field2126 == null) {
                return false;
            }
            this.field2115 = new Object[this.field2126.field3289][];
            this.field2120 = new Object[this.field2126.field3289];
        }
        return true;
    }

    @OriginalMember(owner = "client!l", name = "b", descriptor = "(IZ)Z", line = 942)
    public static final boolean method978(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            field2109++;
            return arg0 >= 0 && class175.field2646.length > arg0 ? class175.field2646[arg0] : false;
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IIIIZII)V", line = 961)
    public static final void method979(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (!arg4) {
            field2117 = (String) null;
        }
        field2129++;
        if (class206.field3170 <= (arg0 - arg3) && class12.field184 >= arg0 + arg3 && class119.field1817 <= arg6 - arg3 && (arg6 + arg3) <= class141.field2187) {
            class52.method432(arg1, arg5, arg6, arg3, arg0, true, arg2);
        } else {
            class96.method715(104, arg0, arg1, arg3, arg5, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(III)[B", line = 987)
    public final byte[] method980(int arg0, int arg1, int arg2) {
        field2094++;
        if (arg2 != 5) {
            field2132 = 62;
        }
        return this.method957(arg2 - 133, arg1, (int[]) null, arg0);
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lra;ZZ)V", line = 1000)
    public class133(class178 arg0, boolean arg1, boolean arg2) {
        this.field2108 = arg0;
        this.field2128 = arg2;
        this.field2123 = arg1;
    }

    @OriginalMember(owner = "client!l", name = "c", descriptor = "(B)I", line = 1015)
    public final int method981(byte arg0) {
        field2113++;
        if (arg0 >= -40) {
            method948(-41, (byte) 101);
        }
        return this.method977((byte) 121) ? this.field2126.field3284.length : -1;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(BI)I", line = 1030)
    private final int method982(byte arg0, int arg1) {
        if (arg0 > -60) {
            return -83;
        }
        field2111++;
        if (this.method965(arg1, (byte) 118)) {
            return this.field2120[arg1] == null ? this.field2108.method789(arg1, (byte) 31) : 100;
        } else {
            return 0;
        }
    }
}
