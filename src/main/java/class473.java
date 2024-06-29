import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!maa")
public class class473 extends class720 {

    @OriginalMember(owner = "client!maa", name = "s", descriptor = "I")
    private int field6350 = 0;

    @OriginalMember(owner = "client!maa", name = "F", descriptor = "Ltba;")
    private class165 field6363 = new class165(16);

    @OriginalMember(owner = "client!maa", name = "O", descriptor = "I")
    private int field6372 = 0;

    @OriginalMember(owner = "client!maa", name = "K", descriptor = "Lfh;")
    private class653 field6368 = new class653();

    @OriginalMember(owner = "client!maa", name = "Q", descriptor = "J")
    private long field6374 = 0L;

    @OriginalMember(owner = "client!maa", name = "B", descriptor = "Luj;")
    private class387 field6359;

    @OriginalMember(owner = "client!maa", name = "I", descriptor = "I")
    private int field6366;

    @OriginalMember(owner = "client!maa", name = "M", descriptor = "Z")
    private boolean field6370;

    @OriginalMember(owner = "client!maa", name = "L", descriptor = "Lfh;")
    private class653 field6369;

    @OriginalMember(owner = "client!maa", name = "i", descriptor = "I")
    private int field6340;

    @OriginalMember(owner = "client!maa", name = "g", descriptor = "I")
    private int field6338;

    @OriginalMember(owner = "client!maa", name = "P", descriptor = "Z")
    private boolean field6373;

    @OriginalMember(owner = "client!maa", name = "l", descriptor = "Lfi;")
    private class558 field6343;

    @OriginalMember(owner = "client!maa", name = "p", descriptor = "Luj;")
    private class387 field6347;

    @OriginalMember(owner = "client!maa", name = "h", descriptor = "[B")
    private byte[] field6339;

    @OriginalMember(owner = "client!maa", name = "E", descriptor = "Lsw;")
    private class757 field6362;

    @OriginalMember(owner = "client!maa", name = "y", descriptor = "Luaa;")
    private class119 field6356;

    @OriginalMember(owner = "client!maa", name = "u", descriptor = "I")
    public static int field6352 = 0;

    @OriginalMember(owner = "client!maa", name = "z", descriptor = "Z")
    public static boolean field6357 = false;

    @OriginalMember(owner = "client!maa", name = "v", descriptor = "Z")
    public static boolean field6353 = false;

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "I")
    public static int field6335;

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "I")
    public static int field6337;

    @OriginalMember(owner = "client!maa", name = "j", descriptor = "I")
    public static int field6341;

    @OriginalMember(owner = "client!maa", name = "k", descriptor = "I")
    public static int field6342;

    @OriginalMember(owner = "client!maa", name = "m", descriptor = "I")
    public static int field6344;

    @OriginalMember(owner = "client!maa", name = "n", descriptor = "I")
    public static int field6345;

    @OriginalMember(owner = "client!maa", name = "q", descriptor = "I")
    public static int field6348;

    @OriginalMember(owner = "client!maa", name = "r", descriptor = "I")
    public static int field6349;

    @OriginalMember(owner = "client!maa", name = "w", descriptor = "I")
    public static int field6354;

    @OriginalMember(owner = "client!maa", name = "x", descriptor = "I")
    public static int field6355;

    @OriginalMember(owner = "client!maa", name = "A", descriptor = "I")
    public static int field6358;

    @OriginalMember(owner = "client!maa", name = "C", descriptor = "I")
    public static int field6360;

    @OriginalMember(owner = "client!maa", name = "D", descriptor = "I")
    public static int field6361;

    @OriginalMember(owner = "client!maa", name = "G", descriptor = "I")
    public static int field6364;

    @OriginalMember(owner = "client!maa", name = "H", descriptor = "I")
    public static int field6365;

    @OriginalMember(owner = "client!maa", name = "J", descriptor = "I")
    public static int field6367;

    @OriginalMember(owner = "client!maa", name = "o", descriptor = "Lrf;")
    private class85 field6346;

    @OriginalMember(owner = "client!maa", name = "N", descriptor = "Z")
    private boolean field6371;

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "[B")
    private byte[] field6336;

    @OriginalMember(owner = "client!maa", name = "t", descriptor = "[Lcu;")
    public static class222[] field6351;

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(B)V")
    public final void method2690(byte arg0) {
        field6344++;
        if (this.field6369 != null) {
            if (this.method2694(126) == null) {
                return;
            }
            if (this.field6370) {
                boolean var6 = true;
                for (class168 var7 = this.field6369.method3672(-1); var7 != null; var7 = this.field6369.method3662(-1)) {
                    int var9 = (int) var7.field2333;
                    if (this.field6336[var9] == 0) {
                        this.method2703(true, var9, 1);
                    }
                    if (this.field6336[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method1175(arg0 - 104);
                    }
                }
                while (this.field6346.field1182.length > this.field6372) {
                    if (this.field6346.field1182[this.field6372] == 0) {
                        this.field6372++;
                    } else {
                        if (this.field6343.field7758 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field6336[this.field6372] == 0) {
                            this.method2703(true, this.field6372, 1);
                        }
                        if (this.field6336[this.field6372] == 0) {
                            class168 var8 = new class168();
                            var8.field2333 = this.field6372;
                            var6 = false;
                            this.field6369.method3671(var8, false);
                        }
                        this.field6372++;
                    }
                }
                if (var6) {
                    this.field6372 = 0;
                    this.field6370 = false;
                }
            } else if (this.field6371) {
                boolean var2 = true;
                for (class168 var3 = this.field6369.method3672(-1); var3 != null; var3 = this.field6369.method3662(-1)) {
                    int var5 = (int) var3.field2333;
                    if (this.field6336[var5] != 1) {
                        this.method2703(true, var5, 2);
                    }
                    if (this.field6336[var5] == 1) {
                        var3.method1175(-2);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field6346.field1182.length > this.field6372) {
                    if (this.field6346.field1182[this.field6372] == 0) {
                        this.field6372++;
                    } else {
                        if (this.field6362.method4212((byte) -85)) {
                            var2 = false;
                            break;
                        }
                        if (this.field6336[this.field6372] != 1) {
                            this.method2703(true, this.field6372, 2);
                        }
                        if (this.field6336[this.field6372] != 1) {
                            class168 var4 = new class168();
                            var4.field2333 = this.field6372;
                            var2 = false;
                            this.field6369.method3671(var4, false);
                        }
                        this.field6372++;
                    }
                }
                if (var2) {
                    this.field6371 = false;
                    this.field6372 = 0;
                }
            } else {
                this.field6369 = null;
            }
        }
        if (this.field6373 && class446.method2525(500) >= this.field6374) {
            for (class119 var10 = (class119) this.field6363.method1156(arg0 ^ 0x66); var10 != null; var10 = (class119) this.field6363.method1158(22706)) {
                if (!var10.field1745) {
                    if (var10.field1744) {
                        if (!var10.field1739) {
                            throw new RuntimeException();
                        }
                        var10.method1175(arg0 - 104);
                    } else {
                        var10.field1744 = true;
                    }
                }
            }
            this.field6374 = class446.method2525(500) + 1000L;
        }
        if (arg0 != 102) {
            this.field6369 = null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(II)[B")
    public final byte[] method2691(int arg0, int arg1) {
        field6348++;
        class119 var3 = this.method2703(true, arg1, arg0);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method921((byte) 125);
            var3.method1175(-2);
            return var4;
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(I)V")
    public final void method2692(int arg0) {
        field6367++;
        int var2 = -50 % ((arg0 - 54) / 43);
        if (this.field6369 == null || this.method2694(127) == null) {
            return;
        }
        for (class168 var3 = this.field6368.method3672(-1); var3 != null; var3 = this.field6368.method3662(-1)) {
            int var4 = (int) var3.field2333;
            if (var4 < 0 || var4 >= this.field6346.field1181 || this.field6346.field1182[var4] == 0) {
                var3.method1175(-2);
            } else {
                if (this.field6336[var4] == 0) {
                    this.method2703(true, var4, 1);
                }
                if (this.field6336[var4] == -1) {
                    this.method2703(true, var4, 2);
                }
                if (this.field6336[var4] == 1) {
                    var3.method1175(-2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(II)Z")
    public static final boolean method2693(int arg0, int arg1) {
        field6345++;
        if (~arg1 == arg0 || arg1 == 16 || arg1 == 5 || arg1 == 18 || arg1 == 1002) {
            return true;
        } else {
            return arg1 == 10 || arg1 == 1003;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(I)Lrf;")
    public final class85 method2694(int arg0) {
        field6364++;
        if (this.field6346 != null) {
            return this.field6346;
        }
        if (this.field6356 == null) {
            if (this.field6362.method4204(-105)) {
                return null;
            }
            this.field6356 = this.field6362.method4203(255, true, this.field6366, -61, (byte) 0);
        }
        if (this.field6356.field1745) {
            return null;
        }
        byte[] var2 = this.field6356.method921((byte) 126);
        if (this.field6356 instanceof class197) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6346 = new class85(var2, this.field6340, this.field6339);
                if (this.field6346.field1172 != this.field6338) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field6346 = null;
                if (this.field6362.method4204(-61)) {
                    this.field6356 = null;
                } else {
                    this.field6356 = this.field6362.method4203(255, true, this.field6366, 122, (byte) 0);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field6346 = new class85(var2, this.field6340, this.field6339);
            } catch (RuntimeException var4) {
                this.field6362.method4216(-23483);
                this.field6346 = null;
                if (this.field6362.method4204(-82)) {
                    this.field6356 = null;
                } else {
                    this.field6356 = this.field6362.method4203(255, true, this.field6366, -58, (byte) 0);
                }
                return null;
            }
            if (this.field6347 != null) {
                this.field6343.method3220((byte) -60, this.field6366, var2, this.field6347);
            }
        }
        this.field6356 = null;
        if (arg0 <= 125) {
            return null;
        }
        if (this.field6359 != null) {
            this.field6336 = new byte[this.field6346.field1181];
            this.field6350 = 0;
        }
        return this.field6346;
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(I)I")
    public final int method2695(int arg0) {
        field6349++;
        if (this.method2694(126) == null) {
            return this.field6356 == null ? 0 : this.field6356.method922(arg0 + 121);
        } else {
            if (arg0 != -2) {
                this.field6347 = null;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(B)I")
    public final int method2696(byte arg0) {
        field6361++;
        if (arg0 != -77) {
            this.method2692(-68);
        }
        return this.field6350;
    }

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "(I)V")
    public static final void method2697(int arg0) {
        class534 var1 = class26.field470;
        synchronized (class26.field470) {
            class26.field470.method3065(true);
            if (arg0 != -2) {
                method2693(-125, 0);
            }
        }
        field6337++;
    }

    @OriginalMember(owner = "client!maa", name = "b", descriptor = "(II)I")
    public final int method2698(int arg0, int arg1) {
        if (arg0 == 24788) {
            field6335++;
            class119 var3 = (class119) this.field6363.method1160((long) arg1, 122);
            return var3 == null ? 0 : var3.method922(123);
        } else {
            return -44;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(ILcc;[I[I[I)V")
    public static final void method2699(int arg0, class733 arg1, int[] arg2, int[] arg3, int[] arg4) {
        if (arg0 != 15825) {
            return;
        }
        field6341++;
        for (int var5 = 0; var5 < arg3.length; var5++) {
            int var6 = arg3[var5];
            int var7 = arg4[var5];
            int var8 = arg2[var5];
            for (int var9 = 0; var7 != 0 && var9 < arg1.field248.length; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg1.field248[var9] = null;
                    } else {
                        class56 var10 = class66.field941.method1299((byte) -115, var6);
                        int var11 = var10.field776;
                        class571 var12 = arg1.field248[var9];
                        if (var12 != null) {
                            if (var12.field8035 == var6) {
                                if (var11 == 0) {
                                    var12 = arg1.field248[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field8041 = 0;
                                    var12.field8038 = var8;
                                    var12.field8034 = 1;
                                    var12.field8036 = 0;
                                    var12.field8030 = 0;
                                    if (!arg1.field206) {
                                        class758.method4218(0, arg1, 0, var10);
                                    }
                                } else if (var11 == 2) {
                                    var12.field8030 = 0;
                                }
                            } else if (var10.field786 >= class66.field941.method1299((byte) -92, var12.field8035).field786) {
                                var12 = arg1.field248[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class571 var13 = arg1.field248[var9] = new class571();
                            var13.field8036 = 0;
                            var13.field8041 = 0;
                            var13.field8038 = var8;
                            var13.field8030 = 0;
                            var13.field8034 = 1;
                            var13.field8035 = var6;
                            if (!arg1.field206) {
                                class758.method4218(0, arg1, arg0 - 15825, var10);
                            }
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!maa", name = "e", descriptor = "(I)I")
    public final int method2700(int arg0) {
        if (arg0 != 0) {
            this.method2692(-57);
        }
        field6354++;
        if (this.field6346 == null) {
            return 0;
        } else if (this.field6370) {
            class168 var2 = this.field6369.method3672(-1);
            return var2 == null ? 0 : (int) var2.field2333;
        } else {
            return this.field6346.field1178;
        }
    }

    @OriginalMember(owner = "client!maa", name = "c", descriptor = "(B)V")
    public final void method2701(byte arg0) {
        field6358++;
        if (this.field6359 != null) {
            this.field6371 = true;
            if (arg0 >= 100 && this.field6369 == null) {
                this.field6369 = new class653();
            }
        }
    }

    @OriginalMember(owner = "client!maa", name = "d", descriptor = "(B)I")
    public final int method2702(byte arg0) {
        if (arg0 > -90) {
            return 88;
        } else {
            field6360++;
            return this.field6346 == null ? 0 : this.field6346.field1178;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(ZII)Luaa;")
    private final class119 method2703(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            this.field6336 = null;
        }
        field6355++;
        class119 var4 = (class119) this.field6363.method1160((long) arg1, 120);
        if (var4 != null && arg2 == 0 && !var4.field1739 && var4.field1745) {
            var4.method1175(-2);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field6359 == null || this.field6336[arg1] == -1) {
                    if (this.field6362.method4204(-101)) {
                        return null;
                    }
                    var4 = this.field6362.method4203(this.field6366, true, arg1, 102, (byte) 2);
                } else {
                    var4 = this.field6343.method3217(112, arg1, this.field6359);
                }
            } else if (arg2 == 1) {
                if (this.field6359 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field6343.method3219(this.field6359, 116, arg1);
            } else if (arg2 == 2) {
                if (this.field6359 == null) {
                    throw new RuntimeException();
                }
                if (this.field6336[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field6362.method4212((byte) -87)) {
                    return null;
                }
                var4 = this.field6362.method4203(this.field6366, false, arg1, 122, (byte) 2);
            } else {
                throw new RuntimeException();
            }
            this.field6363.method1153(var4, (long) arg1, -1);
        }
        if (var4.field1745) {
            return null;
        }
        byte[] var5 = var4.method921((byte) 124);
        if (!(var4 instanceof class197)) {
            try {
                label154: {
                    if (var5 != null && var5.length > 2) {
                        class161.field2217.reset();
                        class161.field2217.update(var5, 0, var5.length - 2);
                        int var6 = (int) class161.field2217.getValue();
                        if (this.field6346.field1177[arg1] != var6) {
                            throw new RuntimeException();
                        }
                        if (this.field6346.field1169 == null || this.field6346.field1169[arg1] == null) {
                            break label154;
                        }
                        byte[] var7 = this.field6346.field1169[arg1];
                        byte[] var8 = class289.method1732(var5.length - 2, 0, var5, !arg0);
                        int var9 = 0;
                        while (true) {
                            if (var9 >= 64) {
                                break label154;
                            }
                            if (var7[var9] != var8[var9]) {
                                throw new RuntimeException();
                            }
                            var9++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field6362.field10572 = 0;
                this.field6362.field10573 = 0;
            } catch (RuntimeException var17) {
                this.field6362.method4216(-23483);
                var4.method1175(-2);
                if (var4.field1739 && !this.field6362.method4204(-63)) {
                    class235 var10 = this.field6362.method4203(this.field6366, true, arg1, 121, (byte) 2);
                    this.field6363.method1153(var10, (long) arg1, -1);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field6346.field1184[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field6346.field1184[arg1];
            if (this.field6359 != null) {
                this.field6343.method3220((byte) -60, arg1, var5, this.field6359);
                if (this.field6336[arg1] != 1) {
                    this.field6350++;
                    this.field6336[arg1] = 1;
                }
            }
            if (!var4.field1739) {
                var4.method1175(-2);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class161.field2217.reset();
            class161.field2217.update(var5, 0, var5.length - 2);
            int var11 = (int) class161.field2217.getValue();
            if (this.field6346.field1177[arg1] != var11) {
                throw new RuntimeException();
            }
            if (this.field6346.field1169 != null && this.field6346.field1169[arg1] != null) {
                byte[] var12 = this.field6346.field1169[arg1];
                byte[] var13 = class289.method1732(var5.length - 2, 0, var5, !arg0);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field6346.field1184[arg1] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field6336[arg1] != 1) {
                this.field6350++;
                this.field6336[arg1] = 1;
            }
            if (!var4.field1739) {
                var4.method1175(-2);
            }
            return var4;
        } catch (Exception var18) {
            this.field6336[arg1] = -1;
            var4.method1175(-2);
            if (var4.field1739 && !this.field6362.method4204(-122)) {
                class235 var16 = this.field6362.method4203(this.field6366, true, arg1, -123, (byte) 2);
                this.field6363.method1153(var16, (long) arg1, -1);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!maa", name = "a", descriptor = "(IZ)V")
    public final void method2704(int arg0, boolean arg1) {
        field6342++;
        if (this.field6359 == null) {
            return;
        }
        for (class168 var3 = this.field6368.method3672(-1); var3 != null; var3 = this.field6368.method3662(-1)) {
            if (((long) arg0) == var3.field2333) {
                return;
            }
        }
        if (!arg1) {
            this.method2700(-34);
        }
        class168 var4 = new class168();
        var4.field2333 = arg0;
        this.field6368.method3671(var4, !arg1);
    }

    @OriginalMember(owner = "client!maa", name = "f", descriptor = "(I)V")
    public static void method2705(int arg0) {
        int var1 = -115 % ((arg0 + 62) / 57);
        field6351 = null;
    }

    @OriginalMember(owner = "client!maa", name = "<init>", descriptor = "(ILuj;Luj;Lsw;Lfi;I[BIZ)V")
    public class473(int arg0, class387 arg1, class387 arg2, class757 arg3, class558 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field6359 = arg1;
        this.field6366 = arg0;
        if (this.field6359 == null) {
            this.field6370 = false;
        } else {
            this.field6370 = true;
            this.field6369 = new class653();
        }
        this.field6340 = arg5;
        this.field6338 = arg7;
        this.field6373 = arg8;
        this.field6343 = arg4;
        this.field6347 = arg2;
        this.field6339 = arg6;
        this.field6362 = arg3;
        if (this.field6347 != null) {
            this.field6356 = this.field6343.method3217(113, this.field6366, this.field6347);
        }
    }
}
