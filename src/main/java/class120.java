import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class120 {

    @OriginalMember(owner = "client!w", name = "f", descriptor = "I")
    public int field1944 = -1;

    @OriginalMember(owner = "client!w", name = "d", descriptor = "I")
    private int field1942 = 128;

    @OriginalMember(owner = "client!w", name = "q", descriptor = "I")
    private int field1955 = 0;

    @OriginalMember(owner = "client!w", name = "i", descriptor = "Z")
    public boolean field1947 = false;

    @OriginalMember(owner = "client!w", name = "t", descriptor = "I")
    private int field1958 = 128;

    @OriginalMember(owner = "client!w", name = "s", descriptor = "I")
    private int field1957 = 0;

    @OriginalMember(owner = "client!w", name = "v", descriptor = "I")
    private int field1960 = 0;

    @OriginalMember(owner = "client!w", name = "z", descriptor = "Z")
    public boolean field1964 = false;

    @OriginalMember(owner = "client!w", name = "j", descriptor = "[I")
    public static int[] field1948 = new int[8];

    @OriginalMember(owner = "client!w", name = "k", descriptor = "[Lvb;")
    public static class73[] field1949 = new class73[29];

    @OriginalMember(owner = "client!w", name = "b", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!w", name = "c", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!w", name = "g", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!w", name = "l", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!w", name = "m", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!w", name = "n", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!w", name = "o", descriptor = "I")
    public static int field1953;

    @OriginalMember(owner = "client!w", name = "p", descriptor = "I")
    public static int field1954;

    @OriginalMember(owner = "client!w", name = "r", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!w", name = "u", descriptor = "I")
    public int field1959;

    @OriginalMember(owner = "client!w", name = "w", descriptor = "I")
    private int field1961;

    @OriginalMember(owner = "client!w", name = "x", descriptor = "I")
    public static int field1962;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "[S")
    private short[] field1939;

    @OriginalMember(owner = "client!w", name = "e", descriptor = "[S")
    private short[] field1943;

    @OriginalMember(owner = "client!w", name = "h", descriptor = "[S")
    private short[] field1946;

    @OriginalMember(owner = "client!w", name = "y", descriptor = "[S")
    private short[] field1963;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Llc;IZIBI)V")
    public static final void method889(class270 arg0, int arg1, boolean arg2, int arg3, byte arg4, int arg5) {
        class207.field3062 = 1;
        field1940++;
        class35.field451 = arg2;
        class286.field4588 = arg0;
        class263.field4133 = arg5;
        if (arg4 < -76) {
            class210.field3103 = 10000;
            class287.field4604 = arg3;
            class192.field2833 = arg1;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(CLjava/lang/String;I)I")
    public static final int method890(char arg0, String arg1, int arg2) {
        int var3 = arg2;
        field1962++;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1.charAt(var5) == arg0) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(III)V")
    public static final void method891(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class188.field2799; var3++) {
            for (int var4 = 0; var4 < class159.field2481; var4++) {
                for (int var5 = 0; var5 < class7.field67; var5++) {
                    class313 var6 = class223.field3286[var3][var4][var5];
                    if (var6 != null) {
                        class231 var7 = var6.field5012;
                        if (var7 != null && var7.field3401.method21()) {
                            class220.method1535(var7.field3401, var3, var4, var5, 1, 1);
                            if (var7.field3388 != null && var7.field3388.method21()) {
                                class220.method1535(var7.field3388, var3, var4, var5, 1, 1);
                                var7.field3401.method24(var7.field3388, 0, 0, 0, false);
                                var7.field3388 = var7.field3388.method22(arg0, arg1, arg2);
                            }
                            var7.field3401 = var7.field3401.method22(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field5022; var8++) {
                            class156 var10 = var6.field5037[var8];
                            if (var10 != null && var10.field2436.method21()) {
                                class220.method1535(var10.field2436, var3, var4, var5, var10.field2447 + 1 - var10.field2443, var10.field2441 - var10.field2432 + 1);
                                var10.field2436 = var10.field2436.method22(arg0, arg1, arg2);
                            }
                        }
                        class214 var9 = var6.field5027;
                        if (var9 != null && var9.field3150.method21()) {
                            class149.method1110(var9.field3150, var3, var4, var5);
                            var9.field3150 = var9.field3150.method22(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IILhc;)V")
    private final void method892(int arg0, int arg1, class53 arg2) {
        if (arg1 == 1) {
            this.field1961 = arg2.method331(-72);
        } else if (arg1 == 2) {
            this.field1944 = arg2.method331(-57);
        } else if (arg1 == 4) {
            this.field1958 = arg2.method331(-39);
        } else if (arg1 == 5) {
            this.field1942 = arg2.method331(-97);
        } else if (arg1 == 6) {
            this.field1955 = arg2.method331(-10);
        } else if (arg1 == 7) {
            this.field1960 = arg2.method366(-16505);
        } else if (arg1 == 8) {
            this.field1957 = arg2.method366(-16505);
        } else if (arg1 == 9) {
            this.field1964 = true;
        } else if (arg1 == 10) {
            this.field1947 = true;
        } else if (arg1 == 40) {
            int var4 = arg2.method366(-16505);
            this.field1943 = new short[var4];
            this.field1963 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field1963[var5] = (short) arg2.method331(-13);
                this.field1943[var5] = (short) arg2.method331(-110);
            }
        } else if (arg1 == 41) {
            int var6 = arg2.method366(-16505);
            this.field1939 = new short[var6];
            this.field1946 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field1946[var7] = (short) arg2.method331(-70);
                this.field1939[var7] = (short) arg2.method331(-31);
            }
        }
        if (arg0 < 108) {
            this.field1964 = false;
        }
        field1950++;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method893(int arg0, String arg1, int arg2) {
        if (arg0 != 96) {
            method890('\u0019', (String) null, -43);
        }
        field1951++;
        String var3 = class85.method633((byte) 27, class78.method581(127, arg1));
        boolean var4 = false;
        for (int var5 = 0; var5 < class103.field1791; var5++) {
            class207 var6 = class92.field1475[class162.field2518[var5]];
            if (var6 != null && var6.field3069 != null && var6.field3069.equalsIgnoreCase(var3)) {
                var4 = true;
                if (arg2 == 1) {
                    class144.field2338.method683(true, 212);
                    class280.field4509++;
                    class144.field2338.method365(class162.field2518[var5], (byte) 59);
                    class144.field2338.method339(0, -2065);
                } else if (arg2 == 4) {
                    class309.field4984++;
                    class144.field2338.method683(true, 105);
                    class144.field2338.method376(class162.field2518[var5], false);
                    class144.field2338.method360(0, 25759);
                } else if (arg2 == 5) {
                    class144.field2338.method683(true, 96);
                    class144.field2338.method339(0, arg0 - 2161);
                    class197.field2897++;
                    class144.field2338.method376(class162.field2518[var5], false);
                } else if (arg2 == 6) {
                    class305.field4928++;
                    class144.field2338.method683(true, 77);
                    class144.field2338.method328(class162.field2518[var5], (byte) 111);
                    class144.field2338.method369((byte) -123, 0);
                } else if (arg2 == 7) {
                    class34.field429++;
                    class144.field2338.method683(true, 52);
                    class144.field2338.method376(class162.field2518[var5], false);
                    class144.field2338.method360(0, 25759);
                }
                break;
            }
        }
        if (!var4) {
            class258.method1777(-1, 0, "", class12.field140 + var3);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ll;ZI)V")
    public static final void method894(class10 arg0, boolean arg1, int arg2) {
        field1945++;
        if (arg1) {
            int var3 = class137.field2230;
            int var4 = var3 * 956 / 503;
            class51.field708.method719((class179.field2677 - var4) / 2, 0, var4, var3);
            class85.field1353.method1041(class179.field2677 / 2 - (class85.field1353.field2258 / 2), 18);
        }
        arg0.method67(class121.field1986 == 1 ? class66.field1012 : class256.field3867, class179.field2677 / 2, class137.field2230 / 2 - 26, 16777215, -1);
        int var5 = class137.field2230 / 2 - 18;
        class130.method1006(class179.field2677 / 2 - 152, var5, 304, 34, 9179409);
        class130.method1006(class179.field2677 / 2 - 151, var5 + 1, 302, 32, 0);
        class130.method996(class179.field2677 / 2 - 150, var5 + 2, class194.field2863 * 3, 30, 9179409);
        class130.method996(class194.field2863 * 3 + class179.field2677 / 2 - 150, var5 + 2, arg2 - (class194.field2863 * 3), 30, 0);
        arg0.method67(class232.field3412, class179.field2677 / 2, class137.field2230 / 2 + 4, 16777215, -1);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBI)Lmg;")
    public final class58 method895(int arg0, int arg1, byte arg2, int arg3) {
        field1952++;
        int var5 = -75 % ((arg2 + 16) / 43);
        class58 var6 = (class58) class52.field712.method1418((long) this.field1959, 0);
        if (var6 == null) {
            class96 var7 = class96.method760(class240.field3518, this.field1961, 0);
            if (var7 == null) {
                return null;
            }
            if (this.field1963 != null) {
                for (int var8 = 0; var8 < this.field1963.length; var8++) {
                    var7.method748(this.field1963[var8], this.field1943[var8]);
                }
            }
            if (this.field1946 != null) {
                for (int var9 = 0; var9 < this.field1946.length; var9++) {
                    var7.method739(this.field1946[var9], this.field1939[var9]);
                }
            }
            var6 = var7.method759(this.field1960 + 64, 850 - -this.field1957, -30, -50, -30);
            class52.field712.method1421((long) this.field1959, var6, (byte) 29);
        }
        class58 var10;
        if (this.field1944 == -1 || arg3 == -1) {
            var10 = var6.method419(true, true, true);
        } else {
            var10 = class232.method1609((byte) -32, this.field1944).method568(arg3, arg0, arg1, (byte) 18, var6);
        }
        if (this.field1958 != 128 || this.field1942 != 128) {
            var10.method421(this.field1958, this.field1942, this.field1958);
        }
        if (this.field1955 != 0) {
            if (this.field1955 == 90) {
                var10.method418();
            }
            if (this.field1955 == 180) {
                var10.method432();
            }
            if (this.field1955 == 270) {
                var10.method406();
            }
        }
        return var10;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Lhc;I)V")
    public final void method896(class53 arg0, int arg1) {
        field1956++;
        if (arg1 != 0) {
            this.field1960 = -47;
        }
        while (true) {
            int var3 = arg0.method366(-16505);
            if (var3 == 0) {
                return;
            }
            this.method892(117, var3, arg0);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;JBIZZIZII)V")
    public static final void method897(String arg0, String arg1, long arg2, byte arg3, int arg4, boolean arg5, boolean arg6, int arg7, boolean arg8, int arg9, int arg10) {
        field1954++;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; var13++) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class53 var14 = new class53(128);
        var14.method360(10, 25759);
        var14.method376((arg5 ? 4 : 0) | (arg8 ? 1 : 0) | (arg6 ? 2 : 0), false);
        var14.method382(902642416, arg2);
        var14.method385(var12[0], 455748840);
        var14.method338(arg0, 1970);
        var14.method385(var12[1], 455748840);
        var14.method376(class281.field4525, false);
        var14.method360(arg7, 25759);
        var14.method360(arg4, 25759);
        var14.method385(var12[2], 455748840);
        var14.method376(arg10, false);
        var14.method376(arg9, false);
        var14.method385(var12[3], 455748840);
        var14.method345(2713, class254.field3832, class283.field4554);
        class53 var15 = new class53(350);
        var15.method338(arg1, 1970);
        int var16 = 8 - (class261.method1792(arg1, -128) % 8);
        if (arg3 >= -86) {
            field1949 = null;
        }
        for (int var17 = 0; var17 < var16; var17++) {
            var15.method360((int) (Math.random() * 255.0D), 25759);
        }
        var15.method330(var12, (byte) 65);
        class144.field2338.field735 = 0;
        class144.field2338.method360(22, 25759);
        class144.field2338.method376(var14.field735 + var15.field735 + 2, false);
        class144.field2338.method376(550, false);
        class144.field2338.method384(var14.field735, 0, var14.field758, 23037);
        class144.field2338.method384(var15.field735, 0, var15.field758, 23037);
        class291.field4629 = 1;
        class313.field5007 = 0;
        class43.field569 = 0;
        class145.field2347 = -3;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIBIIZZZLki;)Llf;")
    public static final class94 method898(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5, boolean arg6, boolean arg7, class298 arg8) {
        field1941++;
        class31 var9 = class12.method88(arg3, 27838);
        if (arg4 > 1 && var9.field389 != null) {
            int var10 = -1;
            for (int var11 = 0; var11 < 10; var11++) {
                if (arg4 >= var9.field377[var11] && var9.field377[var11] != 0) {
                    var10 = var9.field389[var11];
                }
            }
            if (var10 != -1) {
                var9 = class12.method88(var10, 27838);
            }
        }
        class257 var12 = var9.method205(arg8, -10);
        if (var12 == null) {
            return null;
        }
        class148 var13 = null;
        if (var9.field323 != -1) {
            var13 = (class148) method898(0, 1, (byte) -91, var9.field378, 10, true, true, false, arg8);
            if (var13 == null) {
                return null;
            }
        } else if (var9.field369 != -1) {
            var13 = (class148) method898(arg0, arg1, (byte) -107, var9.field336, arg4, true, false, false, arg8);
            if (var13 == null) {
                return null;
            }
        }
        int[] var14 = class130.field2164;
        int var15 = class130.field2159;
        int var16 = class130.field2162;
        int[] var17 = new int[4];
        class130.method995(var17);
        class148 var18 = new class148(36, 32);
        if (arg2 > -58) {
            return null;
        }
        class130.method992(var18.field2375, 36, 32);
        class244.method1675();
        class244.method1682(16, 16);
        class244.field3593 = false;
        int var19 = var9.field339;
        if (arg6) {
            var19 = (int) ((double) var19 * 1.5D);
        } else if (arg1 == 2) {
            var19 = (int) ((double) var19 * 1.04D);
        }
        int var20 = class244.field3592[var9.field379] * var19 >> 16;
        int var21 = class244.field3590[var9.field379] * var19 >> 16;
        var12.method433(0, var9.field387, var9.field329, var9.field379, var9.field357, var21 + var9.field394 - (var12.method17() / 2), var9.field394 + var20, -1L);
        if (arg1 >= 1) {
            var18.method1102(1);
            if (arg1 >= 2) {
                var18.method1102(16777215);
            }
            class130.method992(var18.field2375, 36, 32);
        }
        if (arg0 != 0) {
            var18.method1107(arg0);
        }
        if (var9.field323 != -1) {
            var13.method726(0, 0);
        } else if (var9.field369 != -1) {
            class130.method992(var13.field2375, 36, 32);
            var18.method726(0, 0);
            var18 = var13;
        }
        if (arg7 && (var9.field367 == 1 || arg4 != 1) && arg4 != -1) {
            class57.field828.method72(class212.method1490(arg4, (byte) 83), 0, 9, 16776960, 1);
        }
        class130.method992(var14, var15, var16);
        class130.method980(var17);
        class244.method1675();
        class244.field3593 = true;
        return var18;
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIII)V")
    public static final void method899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1953++;
        int var7 = arg0 - arg5;
        int var8 = arg2 + arg5;
        int var9 = arg1 + arg5;
        int var10 = arg4 - arg5;
        for (int var11 = arg2; var11 < var8; var11++) {
            class89.method669(class104.field1795[var11], arg6, arg4, arg1, (byte) -128);
        }
        if (arg3 != 22830) {
            return;
        }
        for (int var12 = arg0; var12 > var7; var12--) {
            class89.method669(class104.field1795[var12], arg6, arg4, arg1, (byte) -125);
        }
        for (int var13 = var8; var13 <= var7; var13++) {
            int[] var14 = class104.field1795[var13];
            class89.method669(var14, arg6, var9, arg1, (byte) -124);
            class89.method669(var14, arg6, arg4, var10, (byte) -125);
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public static void method900(boolean arg0) {
        if (arg0) {
            field1949 = null;
            field1948 = null;
        }
    }
}
