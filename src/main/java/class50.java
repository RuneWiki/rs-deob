import java.io.DataInputStream;
import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class50 extends class177 {

    @OriginalMember(owner = "client!lj", name = "D", descriptor = "I")
    private int field766 = 0;

    @OriginalMember(owner = "client!lj", name = "V", descriptor = "I")
    private int field782 = 0;

    @OriginalMember(owner = "client!lj", name = "J", descriptor = "I")
    private int field771 = 1;

    @OriginalMember(owner = "client!lj", name = "F", descriptor = "[Z")
    public static boolean[] field768 = new boolean[112];

    @OriginalMember(owner = "client!lj", name = "S", descriptor = "I")
    public static int field779 = 2;

    @OriginalMember(owner = "client!lj", name = "I", descriptor = "I")
    public static int field770 = 0;

    @OriginalMember(owner = "client!lj", name = "C", descriptor = "I")
    public static int field765;

    @OriginalMember(owner = "client!lj", name = "E", descriptor = "I")
    public static int field767;

    @OriginalMember(owner = "client!lj", name = "H", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!lj", name = "K", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!lj", name = "L", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!lj", name = "M", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!lj", name = "O", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!lj", name = "P", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!lj", name = "Q", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!lj", name = "R", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!lj", name = "T", descriptor = "I")
    public static int field780;

    @OriginalMember(owner = "client!lj", name = "U", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!lj", name = "W", descriptor = "I")
    public static int field783;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IBIII)V", line = 6)
    public static final void method458(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        for (class117 var5 = (class117) class154.field2330.method986(false); var5 != null; var5 = (class117) class154.field2330.method982(14877)) {
            class277.method1954(arg2, arg4, var5, -115, arg0, arg3);
        }
        field776++;
        for (class117 var6 = (class117) class200.field3169.method986(false); var6 != null; var6 = (class117) class200.field3169.method982(14877)) {
            byte var7 = 1;
            class132 var8 = var6.field1828.method2030(-13196);
            if (var6.field1828.field4527 == var8.field2084) {
                var7 = 0;
            } else if (var6.field1828.field4527 == var8.field2072 || var6.field1828.field4527 == var8.field2081 || var6.field1828.field4527 == var8.field2065 || var6.field1828.field4527 == var8.field2075) {
                var7 = 2;
            } else if (var6.field1828.field4527 == var8.field2048 || var6.field1828.field4527 == var8.field2071 || var6.field1828.field4527 == var8.field2079 || var6.field1828.field4527 == var8.field2078) {
                var7 = 3;
            }
            if (var6.field1822 != var7) {
                int var9 = class104.method806((byte) -119, var6.field1828);
                if (var6.field1837 != var9) {
                    if (var6.field1842 != null) {
                        class200.field3165.method2162(var6.field1842);
                        var6.field1842 = null;
                    }
                    var6.field1837 = var9;
                }
                var6.field1822 = var7;
            }
            var6.field1827 = var6.field1828.field4507;
            var6.field1819 = var6.field1828.field4507 + var6.field1828.method929(12) * 64;
            var6.field1843 = var6.field1828.field4496;
            var6.field1844 = var6.field1828.field4496 + var6.field1828.method929(12) * 64;
            class277.method1954(arg2, arg4, var6, 124, arg0, arg3);
        }
        int var10 = 115 / ((-arg1 - 67) / 45);
        for (class117 var11 = (class117) class17.field192.method200(0); var11 != null; var11 = (class117) class17.field192.method202((byte) 88)) {
            byte var12 = 1;
            class132 var13 = var11.field1833.method2030(-13196);
            if (var11.field1833.field4527 == var13.field2084) {
                var12 = 0;
            } else if (var11.field1833.field4527 == var13.field2072 || var11.field1833.field4527 == var13.field2081 || var11.field1833.field4527 == var13.field2065 || var11.field1833.field4527 == var13.field2075) {
                var12 = 2;
            } else if (var11.field1833.field4527 == var13.field2048 || var11.field1833.field4527 == var13.field2071 || var11.field1833.field4527 == var13.field2079 || var11.field1833.field4527 == var13.field2078) {
                var12 = 3;
            }
            if (var11.field1822 != var12) {
                int var14 = class288.method2029(false, var11.field1833);
                if (var11.field1837 != var14) {
                    if (var11.field1842 != null) {
                        class200.field3165.method2162(var11.field1842);
                        var11.field1842 = null;
                    }
                    var11.field1837 = var14;
                }
                var11.field1822 = var12;
            }
            var11.field1827 = var11.field1833.field4507;
            var11.field1819 = var11.field1833.field4507 + (var11.field1833.method929(12) * 64);
            var11.field1843 = var11.field1833.field4496;
            var11.field1844 = var11.field1833.field4496 + var11.field1833.method929(12) * 64;
            class277.method1954(arg2, arg4, var11, 125, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "(I)V", line = 122)
    public static final void method459(int arg0) {
        field765++;
        int var1 = (class311.field4845 >> 10) + (class110.field1744 >> 3);
        int var2 = (class220.field3455 >> 10) + (class302.field4735 >> 3);
        byte var3 = 0;
        byte var5 = 8;
        byte var6 = 18;
        class95.field1367 = new byte[var6][];
        class22.field239 = new byte[var6][];
        class53.field809 = new int[var6][4];
        class324.field5049 = new int[var6];
        class99.field1470 = new byte[var6][];
        class180.field2710 = new int[var6];
        class210.field3302 = new int[var6];
        class150.field2276 = new int[var6];
        class86.field1259 = new byte[var6][];
        class255.field3808 = new int[var6];
        class60.field892 = new byte[var6][];
        class154.field2326 = new int[var6];
        int var7 = 0;
        for (int var8 = (var2 - 6) / 8; var8 <= (var2 + 6) / 8; var8++) {
            for (int var9 = (var1 - 6) / 8; var9 <= ((var1 + 6) / 8); var9++) {
                int var10 = (var8 << 8) + var9;
                class324.field5049[var7] = var10;
                class180.field2710[var7] = class246.field3710.method1519((byte) 16, "m" + var8 + "_" + var9);
                class150.field2276[var7] = class246.field3710.method1519((byte) 16, "l" + var8 + "_" + var9);
                class154.field2326[var7] = class246.field3710.method1519((byte) 16, "n" + var8 + "_" + var9);
                class255.field3808[var7] = class246.field3710.method1519((byte) 16, "um" + var8 + "_" + var9);
                class210.field3302[var7] = class246.field3710.method1519((byte) 16, "ul" + var8 + "_" + var9);
                if (class154.field2326[var7] == -1) {
                    class180.field2710[var7] = -1;
                    class150.field2276[var7] = -1;
                    class255.field3808[var7] = -1;
                    class210.field3302[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class154.field2326.length; var11++) {
            class154.field2326[var11] = -1;
            class180.field2710[var11] = -1;
            class150.field2276[var11] = -1;
            class255.field3808[var11] = -1;
            class210.field3302[var11] = -1;
        }
        class55.method485((byte) -90, true, var3, var2, var5, arg0, var1);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Lhb;II)V", line = 205)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg1 != -18061) {
            method463((class220) null, false, 117, (class220) null, 75, false, 91);
        }
        field777++;
        if (arg2 == 0) {
            this.field766 = arg0.method273(65280);
        } else if (arg2 == 1) {
            this.field782 = arg0.method273(65280);
        } else if (arg2 == 3) {
            this.field771 = arg0.method273(65280);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BZII)V", line = 256)
    public static final void method460(byte arg0, boolean arg1, int arg2, int arg3) {
        field780++;
        if (arg0 <= 70) {
            method460((byte) -24, false, -49, -41);
        }
        if (arg2 < 8000 || arg2 > 48000) {
            throw new IllegalArgumentException();
        }
        class41.field607 = arg2;
        class196.field3112 = arg1;
        class135.field2102 = arg3;
    }

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "(II)V", line = 276)
    public static final void method461(int arg0, int arg1) {
        class45.field713 = -1;
        field772++;
        if (arg0 == 37) {
            class175.field2588 = 3.0F;
        } else if (arg0 == 50) {
            class175.field2588 = 4.0F;
        } else if (arg0 == 75) {
            class175.field2588 = 6.0F;
        } else if (arg0 == 100) {
            class175.field2588 = 8.0F;
        } else if (arg0 == 200) {
            class175.field2588 = 16.0F;
        }
        class45.field713 = arg1;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 499)
    public class50() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(II)[I", line = 311)
    public final int[] method95(int arg0, int arg1) {
        field773++;
        if (arg0 > -52) {
            method463((class220) null, true, 7, (class220) null, -54, true, 43);
        }
        int[] var3 = this.field2652.method1481(arg1, (byte) -100);
        if (this.field2652.field3287) {
            int var4 = class260.field3858[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class287.field4415; var6++) {
                int var7 = class179.field2684[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field766 == 0) {
                    var9 = (var7 - var4) * this.field771;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field771 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field782 == 0) {
                    var12 = class307.field4795[(var12 & 0xFF0) >> 4] + 4096 >> 1;
                } else if (this.field782 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "(I)V", line = 380)
    public static void method462(int arg0) {
        field768 = null;
        int var1 = -84 % ((arg0 + 13) / 48);
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Ltb;ZILtb;IZI)I", line = 390)
    public static final int method463(class220 arg0, boolean arg1, int arg2, class220 arg3, int arg4, boolean arg5, int arg6) {
        field783++;
        if (arg6 != 8) {
            return 82;
        }
        int var7 = class290.method2050(arg4, arg0, arg3, (byte) 120, arg1);
        if (var7 != 0) {
            return arg1 ? -var7 : var7;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var8 = class290.method2050(arg2, arg0, arg3, (byte) 120, arg5);
            return arg5 ? -var8 : var8;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/Throwable;)V", line = 424)
    public static final void method464(byte arg0, String arg1, Throwable arg2) {
        field769++;
        try {
            String var3 = "";
            if (arg2 != null) {
                var3 = class57.method516(arg2, (byte) 77);
            }
            if (arg1 != null) {
                if (arg2 != null) {
                    var3 = var3 + " | ";
                }
                var3 = var3 + arg1;
            }
            class142.method1075(80, var3);
            if (arg0 != 45) {
                method458(110, (byte) -1, 44, 11, -12);
            }
            String var4 = class69.method580((byte) -118, ":", var3, "%3a");
            String var5 = class69.method580((byte) -128, "@", var4, "%40");
            String var6 = class69.method580((byte) -121, "&", var5, "%26");
            String var7 = class69.method580((byte) -123, "#", var6, "%23");
            if (class150.field2272.field285 == null) {
                return;
            }
            class233 var8 = class150.field2272.method174(new URL(class150.field2272.field285.getCodeBase(), "clienterror.ws?c=" + class175.field2585 + "&u=" + class141.field2182 + "&v1=" + class26.field297 + "&v2=" + class26.field290 + "&e=" + var7), 0);
            while (var8.field3585 == 0) {
                class97.method768(1L, 81);
            }
            if (var8.field3585 == 1) {
                DataInputStream var9 = (DataInputStream) var8.field3590;
                var9.read();
                var9.close();
            }
        } catch (Exception var11) {
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 478)
    public final void method465(int arg0) {
        int var2 = 22 / ((arg0 + 6) / 43);
        class308.method2137(-124);
        field767++;
    }
}
