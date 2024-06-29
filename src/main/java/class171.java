import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class171 {

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Z")
    public boolean field2431 = false;

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "[I")
    private int[] field2441 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public int field2438 = -1;

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2435 = "";

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field2436 = null;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "[J")
    public static long[] field2429 = new long[1000];

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "Z")
    public static boolean field2442 = false;

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "I")
    public static int field2437 = 0;

    @OriginalMember(owner = "client!bg", name = "w", descriptor = "Z")
    public static boolean field2447 = false;

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "[[I")
    public static int[][] field2440 = new int[][] { new int[16], { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1 }, { 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0 }, { 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0 }, { 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1 }, { 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0 }, { 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1 } };

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "I")
    public static int field2426;

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "I")
    public static int field2427;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!bg", name = "y", descriptor = "I")
    public static int field2449;

    @OriginalMember(owner = "client!bg", name = "z", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Lnh;")
    public static class305 field2444;

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Lnh;")
    public static class305 field2445;

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "[I")
    private int[] field2433;

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "[S")
    private short[] field2432;

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "[S")
    private short[] field2434;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "[S")
    private short[] field2439;

    @OriginalMember(owner = "client!bg", name = "x", descriptor = "[S")
    private short[] field2448;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lbj;II)V")
    private final void method1086(class215 arg0, int arg1, int arg2) {
        if (arg1 == 1) {
            this.field2438 = arg0.method1374((byte) -60);
        } else if (arg1 == 2) {
            int var4 = arg0.method1374((byte) -60);
            this.field2433 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2433[var5] = arg0.method1379(class207.method1290(arg2, -73));
            }
        } else if (arg1 == 3) {
            this.field2431 = true;
        } else if (arg1 == 40) {
            int var6 = arg0.method1374((byte) -60);
            this.field2434 = new short[var6];
            this.field2439 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field2434[var7] = (short) arg0.method1379(-104);
                this.field2439[var7] = (short) arg0.method1379(-101);
            }
        } else if (arg1 == 41) {
            int var8 = arg0.method1374((byte) -60);
            this.field2448 = new short[var8];
            this.field2432 = new short[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field2448[var9] = (short) arg0.method1379(-128);
                this.field2432[var9] = (short) arg0.method1379(arg2 - 122);
            }
        } else if (arg1 >= 60 && arg1 < 70) {
            this.field2441[arg1 - 60] = arg0.method1379(class207.method1290(arg2, -111));
        }
        field2430++;
        if (arg2 != 3) {
            this.method1090((class215) null, (byte) -90);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)Z")
    public final boolean method1087(int arg0) {
        field2443++;
        boolean var2 = true;
        int var3 = 102 % ((-arg0 - 14) / 36);
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2441[var4] != -1 && !class295.field4720.method2061(this.field2441[var4], 0, false)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(I)V")
    public static final void method1088(int arg0) {
        field2446++;
        for (class153 var1 = (class153) class234.field3658.method369((byte) -82); var1 != null; var1 = (class153) class234.field3658.method362(false)) {
            class218 var3 = var1.field2125;
            if (class166.field2364 != var3.field3393 || var3.field3373 < class35.field533) {
                var1.method962(128);
            } else if (var3.field3366 <= class35.field533) {
                if (var3.field3377 > 0) {
                    class310 var4 = class88.field1274[var3.field3377 - 1];
                    if (var4 != null && var4.field4081 >= 0 && var4.field4081 < 13312 && var4.field4140 >= 0 && var4.field4140 < 13312) {
                        var3.method1421(var4.field4140, -19968, class58.method360(var4.field4140, var4.field4081, false, var3.field3393) - var3.field3353, var4.field4081, class35.field533);
                    }
                }
                if (var3.field3377 < 0) {
                    int var5 = -var3.field3377 - 1;
                    class314 var6;
                    if (class305.field4917 == var5) {
                        var6 = class250.field3905;
                    } else {
                        var6 = class48.field689[var5];
                    }
                    if (var6 != null && var6.field4081 >= 0 && var6.field4081 < 13312 && var6.field4140 >= 0 && var6.field4140 < 13312) {
                        var3.method1421(var6.field4140, -19968, class58.method360(var6.field4140, var6.field4081, false, var3.field3393) - var3.field3353, var6.field4081, class35.field533);
                    }
                }
                var3.method1423(false, class208.field3094);
                class163.method1039(class166.field2364, (int) var3.field3358, (int) var3.field3382, (int) var3.field3362, 60, var3, var3.field3392, -1L, false);
            }
        }
        int var2 = -99 / ((arg0 + 62) / 58);
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Z)La;")
    public final class162 method1089(boolean arg0) {
        field2427++;
        if (this.field2433 == null) {
            return null;
        }
        class162[] var2 = new class162[this.field2433.length];
        if (arg0) {
            this.field2439 = null;
        }
        for (int var3 = 0; var3 < this.field2433.length; var3++) {
            var2[var3] = class162.method1036(class295.field4720, this.field2433[var3], 0);
        }
        class162 var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new class162(var2, var2.length);
        }
        if (this.field2434 != null) {
            for (int var5 = 0; var5 < this.field2434.length; var5++) {
                var4.method1034(this.field2434[var5], this.field2439[var5]);
            }
        }
        if (this.field2448 != null) {
            for (int var6 = 0; var6 < this.field2448.length; var6++) {
                var4.method1028(this.field2448[var6], this.field2432[var6]);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lbj;B)V")
    public final void method1090(class215 arg0, byte arg1) {
        int var3 = -76 % ((17 - arg1) / 41);
        field2426++;
        while (true) {
            int var4 = arg0.method1374((byte) -60);
            if (var4 == 0) {
                return;
            }
            this.method1086(arg0, var4, 3);
        }
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(B)V")
    public static void method1091(byte arg0) {
        if (arg0 != 19) {
            field2440 = null;
        }
        field2435 = null;
        field2440 = null;
        field2436 = null;
        field2444 = null;
        field2429 = null;
        field2445 = null;
    }

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "(I)V")
    public static final void method1092(int arg0) {
        if (class52.field739.toLowerCase().indexOf("microsoft") == -1) {
            class93.field1363[45] = 26;
            class93.field1363[92] = 74;
            class93.field1363[47] = 73;
            class93.field1363[59] = 57;
            class93.field1363[93] = 43;
            class93.field1363[44] = 71;
            class93.field1363[91] = 42;
            class93.field1363[61] = 27;
            class93.field1363[46] = 72;
            if (class52.field746 == null) {
                class93.field1363[192] = 58;
                class93.field1363[222] = 59;
            } else {
                class93.field1363[222] = 58;
                class93.field1363[192] = 28;
                class93.field1363[520] = 59;
            }
        } else {
            class93.field1363[188] = 71;
            class93.field1363[219] = 42;
            class93.field1363[220] = 74;
            class93.field1363[190] = 72;
            class93.field1363[191] = 73;
            class93.field1363[223] = 28;
            class93.field1363[221] = 43;
            class93.field1363[189] = 26;
            class93.field1363[222] = 59;
            class93.field1363[186] = 57;
            class93.field1363[192] = 58;
            class93.field1363[187] = 27;
        }
        field2450++;
        if (arg0 != -24234) {
            field2444 = null;
        }
    }

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "(I)Z")
    public final boolean method1093(int arg0) {
        field2449++;
        if (this.field2433 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = arg0; var3 < this.field2433.length; var3++) {
            if (!class295.field4720.method2061(this.field2433[var3], 0, false)) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(Lbj;BI)Lc;")
    public static final class301 method1094(class215 arg0, byte arg1, int arg2) {
        int var3 = -46 % ((-arg1 - 73) / 41);
        field2425++;
        class301 var4 = new class301(arg2, arg0.method1376(-104), arg0.method1376(-10), arg0.method1383((byte) -73), arg0.method1383((byte) 95), arg0.method1374((byte) -60) == 1, arg0.method1374((byte) -60));
        int var5 = arg0.method1374((byte) -60);
        for (int var6 = 0; var6 < var5; var6++) {
            var4.field4795.method370((byte) -22, new class292(arg0.method1374((byte) -60), arg0.method1374((byte) -60), arg0.method1379(-120), arg0.method1379(-106), arg0.method1379(-101), arg0.method1379(-101), arg0.method1379(-97), arg0.method1379(-78), arg0.method1379(-91), arg0.method1379(-85)));
        }
        var4.method2015(-24084);
        return var4;
    }

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "(B)La;")
    public final class162 method1095(byte arg0) {
        if (arg0 != -85) {
            method1094((class215) null, (byte) -36, 11);
        }
        field2428++;
        class162[] var2 = new class162[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field2441[var4] != -1) {
                var2[var3++] = class162.method1036(class295.field4720, this.field2441[var4], 0);
            }
        }
        class162 var5 = new class162(var2, var3);
        if (this.field2434 != null) {
            for (int var6 = 0; var6 < this.field2434.length; var6++) {
                var5.method1034(this.field2434[var6], this.field2439[var6]);
            }
        }
        if (this.field2448 != null) {
            for (int var7 = 0; var7 < this.field2448.length; var7++) {
                var5.method1028(this.field2448[var7], this.field2432[var7]);
            }
        }
        return var5;
    }
}
