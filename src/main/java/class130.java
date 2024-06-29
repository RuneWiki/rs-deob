import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ko")
public class class130 extends class313 {

    @OriginalMember(owner = "client!ko", name = "T", descriptor = "I")
    private int field2244 = 0;

    @OriginalMember(owner = "client!ko", name = "N", descriptor = "I")
    private int field2238 = 1;

    @OriginalMember(owner = "client!ko", name = "K", descriptor = "I")
    private int field2235 = 0;

    @OriginalMember(owner = "client!ko", name = "P", descriptor = "J")
    public static long field2240 = 0L;

    @OriginalMember(owner = "client!ko", name = "M", descriptor = "I")
    public static int field2237 = 0;

    @OriginalMember(owner = "client!ko", name = "I", descriptor = "I")
    public static int field2233;

    @OriginalMember(owner = "client!ko", name = "J", descriptor = "I")
    public static int field2234;

    @OriginalMember(owner = "client!ko", name = "L", descriptor = "I")
    public static int field2236;

    @OriginalMember(owner = "client!ko", name = "O", descriptor = "I")
    public static int field2239;

    @OriginalMember(owner = "client!ko", name = "Q", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!ko", name = "R", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!ko", name = "S", descriptor = "I")
    public static int field2243;

    @OriginalMember(owner = "client!ko", name = "U", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!ko", name = "V", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!ko", name = "W", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!ko", name = "<init>", descriptor = "()V", line = 3)
    public class130() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IIBIIZ)V", line = 9)
    public static final void method1076(int arg0, int arg1, byte arg2, int arg3, int arg4, boolean arg5) {
        class178.field3022++;
        class49.method431(false);
        if (arg5) {
            class246.method1727(0, arg2 ^ 0x5740, false, false);
        } else {
            class53.method477((byte) 62, 0);
            class246.method1727(0, 22295, false, true);
            if (class334.field5295 == 0) {
                for (int var7 = 1; var7 <= 5; var7++) {
                    class246.method1727(var7, 22295, false, false);
                    class246.method1727(var7, arg2 + 22208, true, false);
                    class53.method477((byte) 117, var7);
                }
            } else {
                for (int var6 = 1; var6 <= 5; var6++) {
                    class53.method477((byte) 41, var6);
                    class246.method1727(var6, 22295, false, false);
                    class246.method1727(var6, arg2 ^ 0x5740, true, false);
                }
            }
        }
        field2239++;
        if (!arg5) {
            class57.method506((byte) -87);
        }
        if (arg2 != 87) {
            field2237 = 19;
        }
        class270.method1847((byte) 69);
        if (class43.field680) {
            class249.method1747(true, arg4, arg3, arg1, arg0, (byte) -38);
            arg3 = class188.field3156;
            arg1 = class125.field2156;
            arg0 = class325.field5181;
            arg4 = class195.field3274;
        }
        class65.field1019 = arg3;
        class65.field1020 = arg0;
        if (class191.field3194 == 1) {
            int var8 = (int) class288.field4590;
            if (var8 < (class138.field2553 / 256)) {
                var8 = class138.field2553 / 256;
            }
            int var9 = (int) class83.field1331 + class263.field4257 & 0x7FF;
            if (class104.field1745[4] && class42.field623[4] + 128 > var8) {
                var8 = class42.field623[4] + 128;
            }
            class41.method343(var8, arg1, class53.field833, false, var8 * 3 + 600, var9, class223.method1627((byte) -121, class218.field3632.field1985, class218.field3632.field2036, class205.field3497) - 50, class139.field2556);
        } else if (class191.field3194 == 5) {
            class106.method903(arg1, false);
        }
        int var10 = class269.field4309;
        int var11 = class139.field2563;
        int var12 = class32.field454;
        int var13 = class141.field2592;
        int var14 = class311.field4924;
        for (int var15 = 0; var15 < 5; var15++) {
            if (class104.field1745[var15]) {
                int var16 = (int) ((double) (-class329.field5243[var15]) + (double) (class329.field5243[var15] * 2 + 1) * Math.random() + Math.sin((double) class250.field4057[var15] / 100.0D * (double) class48.field734[var15]) * (double) class42.field623[var15]);
                if (var15 == 1) {
                    class139.field2563 += var16;
                }
                if (var15 == 0) {
                    class269.field4309 += var16;
                }
                if (var15 == 2) {
                    class32.field454 += var16;
                }
                if (var15 == 3) {
                    class311.field4924 = class311.field4924 + var16 & 0x7FF;
                }
                if (var15 == 4) {
                    class141.field2592 += var16;
                    if (class141.field2592 < 128) {
                        class141.field2592 = 128;
                    }
                    if (class141.field2592 > 383) {
                        class141.field2592 = 383;
                    }
                }
            }
        }
        class33.method303((byte) -72);
        if (class43.field680) {
            class169.method1330(arg3, arg0, arg3 + arg4, arg0 + arg1);
            float var18 = (float) class141.field2592 * 0.17578125F;
            boolean var19 = false;
            float var20 = (float) class311.field4924 * 0.17578125F;
            if (class191.field3194 == 3) {
                var20 = class271.field4322 * 360.0F / 6.2831855F;
                var18 = class160.field2832 * 360.0F / 6.2831855F;
            }
            int var21;
            if (class88.field1397 == 10) {
                var21 = class132.method1083(class31.field446, class32.field462, (byte) 105, class32.field454 >> 10, class269.field4309 >> 10);
            } else {
                var21 = class132.method1083(class31.field446, class32.field462, (byte) 119, class218.field3632.field2034[0] >> 3, class218.field3632.field1975[0] >> 3);
            }
            if (class74.field1218 >= 0) {
                class43.method360();
                class167 var22 = class26.method242(50, class134.field2344, class125.field2151, class74.field1218, class257.field4159);
                var22.method1315(class35.field494, arg3, arg0, arg4, arg1, class141.field2592, class311.field4924, var21);
            } else {
                class43.method374(var21);
            }
            class43.method351(arg3, arg0, arg4, arg1, arg4 / 2 + arg3, arg0 - -(arg1 / 2), var18, var20, class353.field5583, class353.field5583);
            class316.method2175(false, false);
            class43.method362();
            class43.method366(true);
            class43.method392(true);
        } else {
            class47.method420(arg3, arg0, arg3 + arg4, arg0 + arg1);
            class62.method575();
            if (class74.field1218 < 0) {
                class47.method422(arg3, arg0, arg4, arg1, 0);
            } else {
                class167 var17 = class26.method242(50, class134.field2344, class125.field2151, class74.field1218, class257.field4159);
                var17.method1316(class35.field494, arg3, arg0, arg4, arg1, class141.field2592, class311.field4924, 0);
            }
        }
        if (class207.field3515 || arg3 > class172.field2980 || class172.field2980 >= arg3 + arg4 || arg0 > class67.field1087 || class67.field1087 >= arg0 + arg1) {
            class334.field5297 = false;
            class213.field3588 = 0;
        } else {
            class334.field5297 = true;
            int var23 = class317.field5033;
            class213.field3588 = 0;
            int var24 = class321.field5096;
            class342.field5464 = (var24 - var23) * (class172.field2980 - arg3) / arg4 + var23;
            int var25 = class298.field4753;
            int var26 = class58.field901;
            class163.field2880 = (class67.field1087 - arg0) * (var26 - var25) / arg1 + var25;
        }
        class215.method1587(false);
        byte var27 = class316.method2180((byte) 74) == 2 ? (byte) class178.field3022 : 1;
        if (class43.field680) {
            class245.method1706(class181.field3045, !class249.field4036);
            class134.method1096(class32.field454, class141.field2592, (byte) -29, class269.field4309, class139.field2563, class311.field4924);
            class43.field675 = class181.field3045;
            class8.method59(class269.field4309, class139.field2563, class32.field454, class141.field2592, class311.field4924, class35.field498, class193.field3238, class300.field4780, class100.field1626, class146.field2640, class303.field4793, class205.field3497 + 1, var27, class218.field3632.field2036 >> 7, class218.field3632.field1985 >> 7);
            class155.field2759 = true;
            class245.method1713();
            class134.method1096(0, 0, (byte) -29, 0, 0, 0);
            class215.method1587(false);
            class93.method805(-128, arg0, class353.field5583, class353.field5583, arg1, arg3, arg4);
            class12.method117(arg0, class353.field5583, class353.field5583, arg1, (byte) 51, arg4, arg3);
            class242.method1699();
        } else {
            class8.method59(class269.field4309, class139.field2563, class32.field454, class141.field2592, class311.field4924, class35.field498, class193.field3238, class300.field4780, class100.field1626, class146.field2640, class303.field4793, class205.field3497 + 1, var27, class218.field3632.field2036 >> 7, class218.field3632.field1985 >> 7);
            class215.method1587(false);
            class242.method1699();
            class93.method805(-73, arg0, 256, 256, arg1, arg3, arg4);
            class12.method117(arg0, 256, 256, arg1, (byte) 51, arg4, arg3);
        }
        ((class153) class62.field953).method1218(arg2 - 84, class31.field446);
        class109.method951(arg1, 8, arg0, arg4, arg3);
        class311.field4924 = var14;
        class141.field2592 = var13;
        class139.field2563 = var11;
        class32.field454 = var12;
        class269.field4309 = var10;
        if (class313.field4964 && class247.field4009.method1990(Integer.MAX_VALUE) == 0) {
            class313.field4964 = false;
        }
        if (class313.field4964) {
            if (class43.field680) {
                class169.method1337(arg3, arg0, arg4, arg1, 0);
            } else {
                class47.method422(arg3, arg0, arg4, arg1, 0);
            }
            class120.method1019(23516, class30.field437, false);
        }
        if (!arg5 && !class313.field4964 && !class207.field3515 && class172.field2980 >= arg3 && class172.field2980 < (arg3 + arg4) && arg0 <= class67.field1087 && arg0 + arg1 > class67.field1087) {
            class114.method972(-119, arg4, class172.field2980, arg3, class67.field1087, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(FZIIIIIII)[[I", line = 287)
    public static final int[][] method1077(float arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        int[][] var9 = new int[arg5][arg6];
        if (arg2 != 395829223) {
            method1076(47, 76, (byte) 44, -53, -106, false);
        }
        field2233++;
        class284 var10 = new class284();
        var10.field4501 = arg1;
        var10.field4499 = arg4;
        var10.field4510 = arg7;
        var10.field4504 = (int) (arg0 * 4096.0F);
        var10.field4514 = arg8;
        var10.method182(arg2 ^ 0x1797BB0E);
        class74.method694(-51, arg6, arg5);
        for (int var11 = 0; var11 < arg5; var11++) {
            var10.method1935(-18, var9[var11], var11);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ko", name = "b", descriptor = "(II)[I", line = 321)
    public final int[] method111(int arg0, int arg1) {
        field2236++;
        int[] var3 = this.field4961.method1520(-1908965694, arg1);
        if (this.field4961.field3451) {
            int var4 = class1.field6[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class133.field2269; var6++) {
                int var7 = class8.field104[var6];
                int var8 = var7 - 2048 >> 1;
                int var11;
                if (this.field2244 == 0) {
                    var11 = (var7 - var4) * this.field2238;
                } else {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field2238 * var10) * 3.141592653589793D);
                }
                int var12 = var11 - (var11 & 0xFFFFF000);
                if (this.field2235 == 0) {
                    var12 = class17.field284[(var12 & 0xFFC) >> 4] + 4096 >> 1;
                } else if (this.field2235 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (arg0 != 4) {
            this.field2235 = 90;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(I)V", line = 392)
    public final void method182(int arg0) {
        class154.method1238(0);
        field2241++;
        if (arg0 != 25833) {
            method1076(38, 23, (byte) 77, 58, 118, false);
        }
    }

    @OriginalMember(owner = "client!ko", name = "c", descriptor = "(B)Ljk;", line = 404)
    public static final class99 method1078(byte arg0) {
        field2245++;
        try {
            if (arg0 <= 31) {
                field2240 = -68L;
            }
            return (class99) Class.forName("eo").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ko", name = "g", descriptor = "(I)[Ln;", line = 424)
    public static final class309[] method1079(int arg0) {
        class309[] var1 = new class309[field2242];
        if (arg0 != 383) {
            field2240 = -19L;
        }
        for (int var2 = 0; var2 < field2242; var2++) {
            int var3 = class39.field585[var2] * class123.field2138[var2];
            byte[] var4 = class191.field3205[var2];
            int[] var5 = new int[var3];
            for (int var6 = 0; var6 < var3; var6++) {
                var5[var6] = class40.field600[class36.method319(var4[var6], 255)];
            }
            var1[var2] = new class309(class308.field4901, class4.field58, class352.field5575[var2], class104.field1743[var2], class39.field585[var2], class123.field2138[var2], var5);
        }
        field2234++;
        class15.method151(0);
        return var1;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "(IILpi;)V", line = 470)
    public final void method185(int arg0, int arg1, class336 arg2) {
        if (arg1 != -17848) {
            method1079(-55);
        }
        if (arg0 == 0) {
            this.field2244 = arg2.method2364(-9069);
        } else if (arg0 == 1) {
            this.field2235 = arg2.method2364(-9069);
        } else if (arg0 == 3) {
            this.field2238 = arg2.method2364(-9069);
        }
        field2243++;
    }

    @OriginalMember(owner = "client!ko", name = "a", descriptor = "([[II)V", line = 524)
    public static final void method1080(int[][] arg0, int arg1) {
        class64.field1007 = arg0;
        field2246++;
        int var2 = -109 / ((arg1 + 34) / 60);
    }
}
