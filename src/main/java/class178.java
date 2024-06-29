import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class178 extends class408 {

    @OriginalMember(owner = "client!hs", name = "r", descriptor = "I")
    private int field2507 = 0;

    @OriginalMember(owner = "client!hs", name = "D", descriptor = "Ldj;")
    private class191 field2519 = new class191(16);

    @OriginalMember(owner = "client!hs", name = "R", descriptor = "I")
    private int field2533 = 0;

    @OriginalMember(owner = "client!hs", name = "M", descriptor = "Lkn;")
    private class442 field2528 = new class442();

    @OriginalMember(owner = "client!hs", name = "T", descriptor = "J")
    private long field2535 = 0L;

    @OriginalMember(owner = "client!hs", name = "z", descriptor = "Lwe;")
    private class233 field2515;

    @OriginalMember(owner = "client!hs", name = "m", descriptor = "I")
    private int field2502;

    @OriginalMember(owner = "client!hs", name = "Q", descriptor = "Z")
    private boolean field2532;

    @OriginalMember(owner = "client!hs", name = "N", descriptor = "Lkn;")
    private class442 field2529;

    @OriginalMember(owner = "client!hs", name = "p", descriptor = "Lwe;")
    private class233 field2505;

    @OriginalMember(owner = "client!hs", name = "C", descriptor = "Las;")
    private class85 field2518;

    @OriginalMember(owner = "client!hs", name = "u", descriptor = "I")
    private int field2510;

    @OriginalMember(owner = "client!hs", name = "J", descriptor = "I")
    private int field2525;

    @OriginalMember(owner = "client!hs", name = "H", descriptor = "Lef;")
    private class284 field2523;

    @OriginalMember(owner = "client!hs", name = "U", descriptor = "Z")
    private boolean field2536;

    @OriginalMember(owner = "client!hs", name = "F", descriptor = "Lqc;")
    private class444 field2521;

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "Lpm;")
    public static class349 field2524 = new class349("Loading config - ", "Lade Konfiguration - ", "Chargement des fichiers config - ", "Carregando config - ");

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "[I")
    public static int[] field2527 = new int[5];

    @OriginalMember(owner = "client!hs", name = "K", descriptor = "Lpm;")
    public static class349 field2526 = new class349("shake:", "schütteln:", "tremblement:", "tremor:");

    @OriginalMember(owner = "client!hs", name = "k", descriptor = "I")
    public static int field2500;

    @OriginalMember(owner = "client!hs", name = "l", descriptor = "I")
    public static int field2501;

    @OriginalMember(owner = "client!hs", name = "n", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!hs", name = "o", descriptor = "I")
    public static int field2504;

    @OriginalMember(owner = "client!hs", name = "q", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!hs", name = "s", descriptor = "I")
    public static int field2508;

    @OriginalMember(owner = "client!hs", name = "t", descriptor = "I")
    public static int field2509;

    @OriginalMember(owner = "client!hs", name = "v", descriptor = "I")
    public static int field2511;

    @OriginalMember(owner = "client!hs", name = "w", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!hs", name = "x", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!hs", name = "A", descriptor = "I")
    public static int field2516;

    @OriginalMember(owner = "client!hs", name = "B", descriptor = "I")
    public static int field2517;

    @OriginalMember(owner = "client!hs", name = "E", descriptor = "I")
    public static int field2520;

    @OriginalMember(owner = "client!hs", name = "G", descriptor = "I")
    public static int field2522;

    @OriginalMember(owner = "client!hs", name = "O", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!hs", name = "S", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!hs", name = "j", descriptor = "Lr;")
    private class99 field2499;

    @OriginalMember(owner = "client!hs", name = "P", descriptor = "Z")
    private boolean field2531;

    @OriginalMember(owner = "client!hs", name = "y", descriptor = "[B")
    private byte[] field2514;

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(II)I")
    public final int method1268(int arg0, int arg1) {
        int var3 = -116 / ((75 - arg0) / 35);
        field2517++;
        class444 var4 = (class444) this.field2519.method1373((long) arg1, -11);
        return var4 == null ? 0 : var4.method453(true);
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II)V")
    public final void method1269(int arg0, int arg1) {
        field2501++;
        if (this.field2515 == null) {
            return;
        }
        for (class425 var3 = this.field2528.method2752(-54); var3 != null; var3 = this.field2528.method2754(-1)) {
            if (((long) arg0) == var3.field6070) {
                return;
            }
        }
        class425 var4 = new class425();
        var4.field6070 = (long) arg0;
        this.field2528.method2756(61, var4);
        if (arg1 != 1) {
            this.method1281(73);
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1270(int arg0, long arg1) {
        class173.field2449.setTime(new Date(arg1));
        if (arg0 != 79) {
            return null;
        }
        field2530++;
        int var3 = class173.field2449.get(7);
        int var4 = class173.field2449.get(5);
        int var5 = class173.field2449.get(2);
        int var6 = class173.field2449.get(1);
        int var7 = class173.field2449.get(11);
        int var8 = class173.field2449.get(12);
        int var9 = class173.field2449.get(13);
        return class340.field4924[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class180.field2544[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(III)Lqr;")
    public static final class41 method1271(int arg0, int arg1, int arg2) {
        field2512++;
        class41 var3 = new class41();
        var3.field570 = -1;
        var3.field561 = arg1 + 6;
        var3.field566 = arg2 + 6;
        var3.field565 = -1;
        var3.field572 = new int[var3.field566][var3.field561];
        if (arg0 != 13801) {
            field2526 = null;
        }
        var3.method277(true);
        return var3;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
    public final void method1272(byte arg0) {
        field2534++;
        if (this.field2529 != null) {
            if (this.method1281(127) == null) {
                return;
            }
            if (this.field2532) {
                boolean var2 = true;
                for (class425 var3 = this.field2529.method2752(-71); var3 != null; var3 = this.field2529.method2754(-1)) {
                    int var5 = (int) var3.field6070;
                    if (this.field2514[var5] == 0) {
                        this.method1278(-16589, 1, var5);
                    }
                    if (this.field2514[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method2660((byte) 121);
                    }
                }
                while (this.field2533 < this.field2499.field1254.length) {
                    if (this.field2499.field1254[this.field2533] == 0) {
                        this.field2533++;
                    } else {
                        if (this.field2523.field4129 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field2514[this.field2533] == 0) {
                            this.method1278(arg0 - 16576, 1, this.field2533);
                        }
                        if (this.field2514[this.field2533] == 0) {
                            class425 var4 = new class425();
                            var4.field6070 = (long) this.field2533;
                            this.field2529.method2756(-80, var4);
                            var2 = false;
                        }
                        this.field2533++;
                    }
                }
                if (var2) {
                    this.field2532 = false;
                    this.field2533 = 0;
                }
            } else if (this.field2531) {
                boolean var6 = true;
                for (class425 var7 = this.field2529.method2752(-101); var7 != null; var7 = this.field2529.method2754(-1)) {
                    int var9 = (int) var7.field6070;
                    if (this.field2514[var9] != 1) {
                        this.method1278(-16589, 2, var9);
                    }
                    if (this.field2514[var9] == 1) {
                        var7.method2660((byte) 121);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field2533 < this.field2499.field1254.length) {
                    if (this.field2499.field1254[this.field2533] == 0) {
                        this.field2533++;
                    } else {
                        if (this.field2518.method495((byte) -47)) {
                            var6 = false;
                            break;
                        }
                        if (this.field2514[this.field2533] != 1) {
                            this.method1278(arg0 - 16576, 2, this.field2533);
                        }
                        if (this.field2514[this.field2533] != 1) {
                            class425 var8 = new class425();
                            var8.field6070 = (long) this.field2533;
                            var6 = false;
                            this.field2529.method2756(-124, var8);
                        }
                        this.field2533++;
                    }
                }
                if (var6) {
                    this.field2533 = 0;
                    this.field2531 = false;
                }
            } else {
                this.field2529 = null;
            }
        }
        if (this.field2536 && class18.method107(-16145) >= this.field2535) {
            for (class444 var10 = (class444) this.field2519.method1383(arg0 ^ 0xFFFFFF9B); var10 != null; var10 = (class444) this.field2519.method1378((byte) 98)) {
                if (!var10.field6348) {
                    if (var10.field6347) {
                        if (!var10.field6349) {
                            throw new RuntimeException();
                        }
                        var10.method2660((byte) 116);
                    } else {
                        var10.field6347 = true;
                    }
                }
            }
            this.field2535 = class18.method107(-16145) + 1000L;
        }
        if (arg0 != -13) {
            field2527 = null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(B)V")
    public final void method1273(byte arg0) {
        field2506++;
        if (this.field2515 == null) {
            return;
        }
        this.field2531 = true;
        if (this.field2529 == null) {
            this.field2529 = new class442();
        }
        if (arg0 != -79) {
            this.field2536 = false;
        }
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(I)I")
    public final int method1274(int arg0) {
        field2500++;
        if (arg0 != 28706) {
            this.method1268(-72, -3);
        }
        if (this.method1281(arg0 ^ 0x7048) == null) {
            return this.field2521 == null ? 0 : this.field2521.method453(true);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "(I)V")
    public static void method1275(int arg0) {
        if (arg0 != 11792) {
            method1279(-121, 'f', 58);
        }
        field2526 = null;
        field2527 = null;
        field2524 = null;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(II)[B")
    public final byte[] method1276(int arg0, int arg1) {
        field2516++;
        class444 var3 = this.method1278(-16589, 0, arg0);
        if (var3 == null) {
            return null;
        } else if (arg1 == -224) {
            byte[] var4 = var3.method448(17484);
            var3.method2660((byte) 125);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(Z)V")
    public final void method1277(boolean arg0) {
        field2511++;
        if (this.field2529 == null || this.method1281(117) == null || !arg0) {
            return;
        }
        for (class425 var2 = this.field2528.method2752(-102); var2 != null; var2 = this.field2528.method2754(-1)) {
            int var3 = (int) var2.field6070;
            if (var3 < 0 || this.field2499.field1255 <= var3 || this.field2499.field1254[var3] == 0) {
                var2.method2660((byte) 127);
            } else {
                if (this.field2514[var3] == 0) {
                    this.method1278(-16589, 1, var3);
                }
                if (this.field2514[var3] == -1) {
                    this.method1278(-16589, 2, var3);
                }
                if (this.field2514[var3] == 1) {
                    var2.method2660((byte) 114);
                }
            }
        }
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(III)Lqc;")
    private final class444 method1278(int arg0, int arg1, int arg2) {
        field2522++;
        class444 var4 = (class444) this.field2519.method1373((long) arg2, arg0 ^ 0xFFFFBF4C);
        if (var4 != null && arg1 == 0 && !var4.field6349 && var4.field6348) {
            var4.method2660((byte) 117);
            var4 = null;
        }
        if (arg0 != -16589) {
            this.method1272((byte) -12);
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field2515 == null || this.field2514[arg2] == -1) {
                    if (this.field2518.method498((byte) -17)) {
                        return null;
                    }
                    var4 = this.field2518.method504(this.field2502, (byte) 101, true, arg2, (byte) 2);
                } else {
                    var4 = this.field2523.method1952(this.field2515, arg2, -116);
                }
            } else if (arg1 == 1) {
                if (this.field2515 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2523.method1957(arg2, this.field2515, (byte) 63);
            } else if (arg1 == 2) {
                if (this.field2515 == null) {
                    throw new RuntimeException();
                }
                if (this.field2514[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2518.method495((byte) -47)) {
                    return null;
                }
                var4 = this.field2518.method504(this.field2502, (byte) 101, false, arg2, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field2519.method1376(var4, (long) arg2, 124);
        }
        if (var4.field6348) {
            return null;
        }
        byte[] var5 = var4.method448(17484);
        if (!var4 instanceof class75) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class47.field621.reset();
                class47.field621.update(var5, 0, var5.length - 2);
                int var9 = (int) class47.field621.getValue();
                if (this.field2499.field1246[arg2] != var9) {
                    throw new RuntimeException();
                }
                this.field2518.field1111 = 0;
                this.field2518.field1110 = 0;
            } catch (RuntimeException var12) {
                this.field2518.method502(0);
                var4.method2660((byte) 127);
                if (var4.field6349 && !this.field2518.method498((byte) -17)) {
                    class435 var10 = this.field2518.method504(this.field2502, (byte) 101, true, arg2, (byte) 2);
                    this.field2519.method1376(var10, (long) arg2, 122);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2499.field1248[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field2499.field1248[arg2];
            if (this.field2515 != null) {
                this.field2523.method1953(1000, this.field2515, arg2, var5);
                if (this.field2514[arg2] != 1) {
                    this.field2507++;
                    this.field2514[arg2] = 1;
                }
            }
            if (!var4.field6349) {
                var4.method2660((byte) 120);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class47.field621.reset();
            class47.field621.update(var5, 0, var5.length - 2);
            int var6 = (int) class47.field621.getValue();
            if (this.field2499.field1246[arg2] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2499.field1248[arg2] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field2514[arg2] != 1) {
                this.field2507++;
                this.field2514[arg2] = 1;
            }
            if (!var4.field6349) {
                var4.method2660((byte) 114);
            }
            return var4;
        } catch (Exception var11) {
            this.field2514[arg2] = -1;
            var4.method2660((byte) 119);
            if (var4.field6349 && !this.field2518.method498((byte) -17)) {
                class435 var8 = this.field2518.method504(this.field2502, (byte) 101, true, arg2, (byte) 2);
                this.field2519.method1376(var8, (long) arg2, 80);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(ICI)C")
    public static final char method1279(int arg0, char arg1, int arg2) {
        field2509++;
        if (arg1 >= 'À' && arg1 <= 'ÿ') {
            if (arg1 >= 'À' && arg1 <= 'Æ') {
                return 'A';
            }
            if (arg1 == 'Ç') {
                return 'C';
            }
            if (arg1 >= 'È' && arg1 <= 'Ë') {
                return 'E';
            }
            if (arg1 >= 'Ì' && arg1 <= 'Ï') {
                return 'I';
            }
            if (arg1 == 'Ñ' && arg0 != 0) {
                return 'N';
            }
            if (arg1 >= 'Ò' && arg1 <= 'Ö') {
                return 'O';
            }
            if (arg1 >= 'Ù' && arg1 <= 'Ü') {
                return 'U';
            }
            if (arg1 == 'Ý') {
                return 'Y';
            }
            if (arg1 == 'ß') {
                return 's';
            }
            if (arg1 >= 'à' && arg1 <= 'æ') {
                return 'a';
            }
            if (arg1 == 'ç') {
                return 'c';
            }
            if (arg1 >= 'è' && arg1 <= 'ë') {
                return 'e';
            }
            if (arg1 >= 'ì' && arg1 <= 'ï') {
                return 'i';
            }
            if (arg1 == 'ñ' && arg0 != 0) {
                return 'n';
            }
            if (arg1 >= 'ò' && arg1 <= 'ö') {
                return 'o';
            }
            if (arg1 >= 'ù' && arg1 <= 'ü') {
                return 'u';
            }
            if (arg1 == 'ý' || arg1 == 'ÿ') {
                return 'y';
            }
        }
        if (arg1 == 'Œ') {
            return 'O';
        } else if (arg1 == 'œ') {
            return 'o';
        } else if (arg1 == 'Ÿ') {
            return 'Y';
        } else {
            if (arg2 >= -88) {
                field2527 = null;
            }
            return arg1;
        }
    }

    @OriginalMember(owner = "client!hs", name = "c", descriptor = "(B)I")
    public final int method1280(byte arg0) {
        int var2 = -20 % ((31 - arg0) / 38);
        field2508++;
        return this.field2507;
    }

    @OriginalMember(owner = "client!hs", name = "b", descriptor = "(I)Lr;")
    public final class99 method1281(int arg0) {
        field2504++;
        if (this.field2499 != null) {
            return this.field2499;
        }
        if (this.field2521 == null) {
            if (this.field2518.method498((byte) -17)) {
                return null;
            }
            this.field2521 = this.field2518.method504(255, (byte) 101, true, this.field2502, (byte) 0);
        }
        if (this.field2521.field6348) {
            return null;
        }
        byte[] var2 = this.field2521.method448(17484);
        if (arg0 < 88) {
            return null;
        }
        if (this.field2521 instanceof class75) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2499 = new class99(var2, this.field2510);
                if (this.field2499.field1258 != this.field2525) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2499 = null;
                if (this.field2518.method498((byte) -17)) {
                    this.field2521 = null;
                } else {
                    this.field2521 = this.field2518.method504(255, (byte) 101, true, this.field2502, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2499 = new class99(var2, this.field2510);
            } catch (RuntimeException var4) {
                this.field2518.method502(0);
                this.field2499 = null;
                if (this.field2518.method498((byte) -17)) {
                    this.field2521 = null;
                } else {
                    this.field2521 = this.field2518.method504(255, (byte) 101, true, this.field2502, (byte) 0);
                }
                return null;
            }
            if (this.field2505 != null) {
                this.field2523.method1953(1000, this.field2505, this.field2502, var2);
            }
        }
        this.field2521 = null;
        if (this.field2515 != null) {
            this.field2507 = 0;
            this.field2514 = new byte[this.field2499.field1255];
        }
        return this.field2499;
    }

    @OriginalMember(owner = "client!hs", name = "d", descriptor = "(B)I")
    public final int method1282(byte arg0) {
        field2520++;
        if (this.field2499 == null) {
            return 0;
        } else if (this.field2532) {
            if (arg0 < 48) {
                this.field2514 = null;
            }
            class425 var2 = this.field2529.method2752(-55);
            return var2 == null ? 0 : (int) var2.field6070;
        } else {
            return this.field2499.field1251;
        }
    }

    @OriginalMember(owner = "client!hs", name = "e", descriptor = "(II)V")
    public static final void method1283(int arg0, int arg1) {
        field2513++;
        if (class103.method609(arg1, 1)) {
            if (arg0 != 3215) {
                field2526 = null;
            }
            class409.method2590(class186.field2657[arg1], -1, (byte) 92);
        }
    }

    @OriginalMember(owner = "client!hs", name = "f", descriptor = "(I)I")
    public final int method1284(int arg0) {
        if (arg0 != 10) {
            this.method1272((byte) 115);
        }
        field2503++;
        return this.field2499 == null ? 0 : this.field2499.field1251;
    }

    @OriginalMember(owner = "client!hs", name = "<init>", descriptor = "(ILwe;Lwe;Las;Lef;IIZ)V")
    public class178(int arg0, class233 arg1, class233 arg2, class85 arg3, class284 arg4, int arg5, int arg6, boolean arg7) {
        this.field2515 = arg1;
        this.field2502 = arg0;
        if (this.field2515 == null) {
            this.field2532 = false;
        } else {
            this.field2532 = true;
            this.field2529 = new class442();
        }
        this.field2505 = arg2;
        this.field2518 = arg3;
        this.field2510 = arg5;
        this.field2525 = arg6;
        this.field2523 = arg4;
        this.field2536 = arg7;
        if (this.field2505 != null) {
            this.field2521 = this.field2523.method1952(this.field2505, this.field2502, -95);
        }
    }
}
