import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aq")
public class class113 {

    @OriginalMember(owner = "client!aq", name = "l", descriptor = "Z")
    public boolean field2048 = false;

    @OriginalMember(owner = "client!aq", name = "e", descriptor = "F")
    public static float field2041 = 1024.0F;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!aq", name = "c", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!aq", name = "d", descriptor = "I")
    public int field2040;

    @OriginalMember(owner = "client!aq", name = "f", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!aq", name = "g", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!aq", name = "h", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!aq", name = "i", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!aq", name = "j", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!aq", name = "k", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!aq", name = "m", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!aq", name = "o", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!aq", name = "p", descriptor = "I")
    public static int field2052;

    @OriginalMember(owner = "client!aq", name = "q", descriptor = "I")
    public int field2053;

    @OriginalMember(owner = "client!aq", name = "n", descriptor = "Laa;")
    public class339 field2050;

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "Lph;")
    public static class459 field2038;

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(IILnn;)V", line = 3)
    private final void method935(int arg0, int arg1, class289 arg2) {
        if (arg0 == 1) {
            this.field2040 = arg2.method1841((byte) 25);
        } else if (arg0 == 2) {
            this.field2053 = arg2.method1863(-79);
        } else if (arg0 == 3) {
            this.field2048 = true;
        } else if (arg0 == 4) {
            this.field2040 = -1;
        }
        field2037++;
        int var4 = 48 / ((arg1 - 49) / 54);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lms;IIIIIZ)V", line = 30)
    public static final void method936(class535 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class387.method2372(arg0.field6078, 0, arg4, arg2, arg0.field6084, arg3, arg6, arg5, arg0.field6073, arg1);
        field2047++;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(B)V", line = 38)
    public static final void method937(byte arg0) {
        field2051++;
        class57.method521();
        if (arg0 <= 106) {
            field2041 = -1.2120934F;
        }
        for (int var1 = 0; var1 < 4; var1++) {
            class67.field1367[var1].method555((byte) -101);
        }
        class312.method1984(-1);
        class170.method1191(32427);
        System.gc();
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([Lgh;BI)V", line = 63)
    public static final void method938(class388[] arg0, byte arg1, int arg2) {
        int var3 = -24 / ((arg1 + 2) / 60);
        for (int var4 = 0; var4 < arg0.length; var4++) {
            class388 var5 = arg0[var4];
            if (var5 != null && var5.field5728 == arg2 && !client.method1365(var5)) {
                if (var5.field5784 == 0) {
                    method938(arg0, (byte) -104, var5.field5700);
                    if (var5.field5819 != null) {
                        method938(var5.field5819, (byte) 79, var5.field5700);
                    }
                    class141 var6 = (class141) class470.field6975.method1622((long) var5.field5700, -125);
                    if (var6 != null) {
                        class242.method1584(var6.field2342, false);
                    }
                }
                if (var5.field5784 == 6 && var5.field5737 != -1) {
                    class57 var7 = class422.field6355.method236(var5.field5737, (byte) 111);
                    if (var7 != null) {
                        var5.field5672 += class5.field97;
                        while (var5.field5672 > var7.field1210[var5.field5747]) {
                            var5.field5672 -= var7.field1210[var5.field5747];
                            var5.field5747++;
                            if (var5.field5747 >= var7.field1202.length) {
                                var5.field5747 -= var7.field1215;
                                if (var5.field5747 < 0 || var7.field1202.length <= var5.field5747) {
                                    var5.field5747 = 0;
                                }
                            }
                            var5.field5678 = var5.field5747 + 1;
                            if (var5.field5678 >= var7.field1202.length) {
                                var5.field5678 -= var7.field1215;
                                if (var5.field5678 < 0 || var5.field5678 >= var7.field1202.length) {
                                    var5.field5678 = -1;
                                }
                            }
                            class429.method2587(var5, (byte) -63);
                        }
                    }
                }
            }
        }
        field2049++;
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLnn;)V", line = 151)
    public final void method939(byte arg0, class289 arg1) {
        if (arg0 < 66) {
            method936(null, 88, 31, -42, 27, -24, false);
        }
        field2042++;
        while (true) {
            int var3 = arg1.method1858(-3256);
            if (var3 == 0) {
                return;
            }
            this.method935(var3, -59, arg1);
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BIZLza;)Lo;", line = 172)
    public final class24 method940(byte arg0, int arg1, boolean arg2, class288 arg3) {
        field2044++;
        long var5 = (long) (arg3.field4361 << 19 | (arg2 ? 262144 : 0) | this.field2040 | arg1 << 16);
        class24 var7 = (class24) this.field2050.field5111.method2478(1, var5);
        if (var7 != null) {
            return var7;
        } else if (this.field2050.field5110.method2739(this.field2040, 63)) {
            class340 var8 = class340.method2139(this.field2050.field5110, this.field2040, 0);
            if (var8 != null) {
                var8.field5120 = var8.field5119 = var8.field5117 = var8.field5118 = 0;
                if (arg2) {
                    var8.method2145();
                }
                for (int var9 = 0; var9 < arg1; var9++) {
                    var8.method2147();
                }
            }
            class24 var10 = arg3.method374(var8, true);
            if (arg0 != -89) {
                field2041 = -1.1305624F;
            }
            if (var10 != null) {
                this.field2050.field5111.method2472(127, var10, var5);
            }
            return var10;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Lsf;B)V", line = 221)
    public static final void method941(class366 arg0, byte arg1) {
        if (arg1 != 62) {
            method937((byte) -40);
        }
        field2043++;
        class358 var2 = (class358) class407.field6167.method1622((long) arg0.field7789, 115);
        if (var2 == null) {
            class504.method3028(arg0.field7870[0], (byte) 86, arg0, null, arg0.field7866[0], 0, arg0.field6084, null);
        } else {
            var2.method2208(arg1 ^ 0x5D);
        }
    }

    @OriginalMember(owner = "client!aq", name = "b", descriptor = "(B)Z", line = 243)
    public final boolean method942(byte arg0) {
        if (arg0 != -69) {
            this.method942((byte) -116);
        }
        field2046++;
        return this.field2050.field5110.method2739(this.field2040, 83);
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "([[BLh;I)V", line = 255)
    public static final void method943(byte[][] arg0, class474 arg1, int arg2) {
        field2045++;
        if (arg2 <= 26) {
            field2038 = null;
        }
        int[] var3 = new int[] { -1, 0, 0, 0, 0 };
        for (int var4 = 0; var4 < arg1.field1348; var4++) {
            class42.method255(123);
            for (int var5 = 0; var5 < class339.field5099 >> 3; var5++) {
                for (int var6 = 0; var6 < class484.field7129 >> 3; var6++) {
                    int var7 = class162.field2598[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x33E0E4D) >> 24;
                        if (!arg1.field1342 || var8 == 0) {
                            int var9 = var7 >> 1 & 0x3;
                            int var10 = (var7 & 0xFFFB39) >> 14;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var10 / 8 << 8) + var11 / 8;
                            for (int var13 = 0; var13 < class58.field1227.length; var13++) {
                                if (class58.field1227[var13] == var12 && arg0[var13] != null) {
                                    class289 var14 = new class289(arg0[var13]);
                                    arg1.method583(var14, var6 * 8, var9, var11, 0, var5 * 8, class67.field1367, var8, var4, var10);
                                    arg1.method2835(-101, var3[0] == -1 ? var3 : null, var5 * 8, var9, class262.field4006, var11, var10, var6 * 8, var4, var14, var8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var3[0] != -1) {
            class299.field4519 = class159.field2574.method2515(0, var3[0], var3[2], var3[3], class464.field6883, var3[1]);
            class284.field4276 = var3[4];
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(BLjava/lang/String;)V", line = 339)
    public static final void method944(byte arg0, String arg1) {
        field2052++;
        if (class509.field7425 == null) {
            class31.method218(false);
        }
        String[] var2 = class266.method1697(0, '\n', arg1);
        int var3 = -30 / ((arg0 - 9) / 60);
        for (int var4 = 0; var4 < var2.length; var4++) {
            for (int var5 = class103.field1955; var5 > 0; var5--) {
                class509.field7425[var5] = class509.field7425[var5 - 1];
            }
            class509.field7425[0] = var2[var4];
            if ((class509.field7425.length - 1) > class103.field1955) {
                if (class433.field6450 > 0) {
                    class433.field6450++;
                }
                class103.field1955++;
            }
        }
    }

    @OriginalMember(owner = "client!aq", name = "a", descriptor = "(Z)V", line = 388)
    public static void method945(boolean arg0) {
        field2038 = null;
        if (arg0) {
            field2041 = 0.7615193F;
        }
    }
}
