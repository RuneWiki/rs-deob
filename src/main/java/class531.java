import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class531 extends class159 {

    @OriginalMember(owner = "client!ef", name = "B", descriptor = "I")
    private int field7386 = 0;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "Lcb;")
    private class78 field7376 = new class78(16);

    @OriginalMember(owner = "client!ef", name = "N", descriptor = "I")
    private int field7398 = 0;

    @OriginalMember(owner = "client!ef", name = "O", descriptor = "Lfea;")
    private class47 field7399 = new class47();

    @OriginalMember(owner = "client!ef", name = "R", descriptor = "J")
    private long field7402 = 0L;

    @OriginalMember(owner = "client!ef", name = "H", descriptor = "Lgg;")
    private class270 field7392;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    private int field7368;

    @OriginalMember(owner = "client!ef", name = "K", descriptor = "Z")
    private boolean field7395;

    @OriginalMember(owner = "client!ef", name = "L", descriptor = "Lfea;")
    private class47 field7396;

    @OriginalMember(owner = "client!ef", name = "E", descriptor = "Lcq;")
    private class106 field7389;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    private int field7371;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "[B")
    private byte[] field7377;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "Lgg;")
    private class270 field7374;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    private int field7366;

    @OriginalMember(owner = "client!ef", name = "G", descriptor = "Lpt;")
    private class372 field7391;

    @OriginalMember(owner = "client!ef", name = "Q", descriptor = "Z")
    private boolean field7401;

    @OriginalMember(owner = "client!ef", name = "F", descriptor = "Lau;")
    private class477 field7390;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "[I")
    public static int[] field7380 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field7363;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field7364;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field7365;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "I")
    public static int field7367;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field7372;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "I")
    public static int field7373;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field7375;

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "I")
    public static int field7378;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public static int field7379;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field7381;

    @OriginalMember(owner = "client!ef", name = "y", descriptor = "I")
    public static int field7383;

    @OriginalMember(owner = "client!ef", name = "z", descriptor = "I")
    public static int field7384;

    @OriginalMember(owner = "client!ef", name = "A", descriptor = "I")
    public static int field7385;

    @OriginalMember(owner = "client!ef", name = "C", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!ef", name = "D", descriptor = "I")
    public static int field7388;

    @OriginalMember(owner = "client!ef", name = "I", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!ef", name = "J", descriptor = "I")
    public static int field7394;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "Lha;")
    public static class116 field7382;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "Ltn;")
    private class523 field7369;

    @OriginalMember(owner = "client!ef", name = "P", descriptor = "Z")
    private boolean field7400;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "[B")
    private byte[] field7370;

    @OriginalMember(owner = "client!ef", name = "M", descriptor = "[Lmd;")
    public static class266[] field7397;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)I")
    public final int method2982(int arg0) {
        if (arg0 != 10437) {
            this.field7391 = null;
        }
        field7388++;
        return this.field7386;
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(II)V")
    public final void method1128(int arg0, int arg1) {
        field7394++;
        if (arg0 != 1000 || this.field7392 == null) {
            return;
        }
        for (class108 var3 = this.field7399.method427(true); var3 != null; var3 = this.field7399.method420(false)) {
            if (((long) arg1) == var3.field1798) {
                return;
            }
        }
        class108 var4 = new class108();
        var4.field1798 = arg1;
        this.field7399.method414(var4, (byte) 90);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(I)V")
    public final void method2983(int arg0) {
        if (arg0 > -54) {
            this.field7370 = null;
        }
        field7393++;
        if (this.field7392 != null) {
            this.field7400 = true;
            if (this.field7396 == null) {
                this.field7396 = new class47();
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(II)[B")
    public final byte[] method1127(int arg0, int arg1) {
        field7367++;
        class477 var3 = this.method2987((byte) 100, 0, arg1);
        if (var3 == null) {
            return null;
        }
        if (arg0 > -103) {
            this.method2987((byte) -59, -69, -123);
        }
        byte[] var4 = var3.method2526(-14568);
        var3.method911(-52);
        return var4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)Lbo;")
    public static final class225 method2984(byte arg0) {
        field7387++;
        int var1 = 64 % ((arg0 + 45) / 38);
        return class530.field7362 < class445.field6493.length ? class445.field6493[class530.field7362++] : null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)Ltn;")
    public final class523 method1126(boolean arg0) {
        field7373++;
        if (this.field7369 != null) {
            return this.field7369;
        }
        if (this.field7390 == null) {
            if (this.field7389.method898((byte) -112)) {
                return null;
            }
            this.field7390 = this.field7389.method908(512, (byte) 0, true, 255, this.field7368);
        }
        if (this.field7390.field6814) {
            return null;
        }
        byte[] var2 = this.field7390.method2526(-14568);
        if (this.field7390 instanceof class420) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field7369 = new class523(var2, this.field7366, this.field7377);
                if (this.field7369.field7260 != this.field7371) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field7369 = null;
                if (this.field7389.method898((byte) -112)) {
                    this.field7390 = null;
                } else {
                    this.field7390 = this.field7389.method908(512, (byte) 0, true, 255, this.field7368);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field7369 = new class523(var2, this.field7366, this.field7377);
            } catch (RuntimeException var4) {
                this.field7389.method901(14943);
                this.field7369 = null;
                if (this.field7389.method898((byte) -112)) {
                    this.field7390 = null;
                } else {
                    this.field7390 = this.field7389.method908(512, (byte) 0, true, 255, this.field7368);
                }
                return null;
            }
            if (this.field7374 != null) {
                this.field7391.method2258(24702, var2, this.field7374, this.field7368);
            }
        }
        if (this.field7392 != null) {
            this.field7370 = new byte[this.field7369.field7263];
            this.field7386 = 0;
        }
        this.field7390 = null;
        return arg0 ? this.field7369 : null;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(I)V")
    public final void method2985(int arg0) {
        if (arg0 != 1) {
            this.method1127(-10, -124);
        }
        field7384++;
        if (this.field7396 != null) {
            if (this.method1126(true) == null) {
                return;
            }
            if (this.field7395) {
                boolean var6 = true;
                for (class108 var7 = this.field7396.method427(true); var7 != null; var7 = this.field7396.method420(false)) {
                    int var9 = (int) var7.field1798;
                    if (this.field7370[var9] == 0) {
                        this.method2987((byte) 100, 1, var9);
                    }
                    if (this.field7370[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method911(-52);
                    }
                }
                while (this.field7369.field7261.length > this.field7398) {
                    if (this.field7369.field7261[this.field7398] == 0) {
                        this.field7398++;
                    } else {
                        if (this.field7391.field5381 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field7370[this.field7398] == 0) {
                            this.method2987((byte) 100, 1, this.field7398);
                        }
                        if (this.field7370[this.field7398] == 0) {
                            class108 var8 = new class108();
                            var8.field1798 = this.field7398;
                            this.field7396.method414(var8, (byte) 64);
                            var6 = false;
                        }
                        this.field7398++;
                    }
                }
                if (var6) {
                    this.field7398 = 0;
                    this.field7395 = false;
                }
            } else if (this.field7400) {
                boolean var2 = true;
                for (class108 var3 = this.field7396.method427(true); var3 != null; var3 = this.field7396.method420(false)) {
                    int var5 = (int) var3.field1798;
                    if (this.field7370[var5] != 1) {
                        this.method2987((byte) 100, 2, var5);
                    }
                    if (this.field7370[var5] == 1) {
                        var3.method911(-52);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field7369.field7261.length > this.field7398) {
                    if (this.field7369.field7261[this.field7398] == 0) {
                        this.field7398++;
                    } else {
                        if (this.field7389.method895(103)) {
                            var2 = false;
                            break;
                        }
                        if (this.field7370[this.field7398] != 1) {
                            this.method2987((byte) 100, 2, this.field7398);
                        }
                        if (this.field7370[this.field7398] != 1) {
                            class108 var4 = new class108();
                            var4.field1798 = this.field7398;
                            this.field7396.method414(var4, (byte) 26);
                            var2 = false;
                        }
                        this.field7398++;
                    }
                }
                if (var2) {
                    this.field7400 = false;
                    this.field7398 = 0;
                }
            } else {
                this.field7396 = null;
            }
        }
        if (!this.field7401 || this.field7402 > class508.method2860(false)) {
            return;
        }
        for (class477 var10 = (class477) this.field7376.method734(arg0 ^ 0x1); var10 != null; var10 = (class477) this.field7376.method736(arg0 ^ 0xFFFFFFFE)) {
            if (!var10.field6814) {
                if (var10.field6817) {
                    if (!var10.field6811) {
                        throw new RuntimeException();
                    }
                    var10.method911(-52);
                } else {
                    var10.field6817 = true;
                }
            }
        }
        this.field7402 = class508.method2860(false) + 1000L;
    }

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "(I)I")
    public final int method2986(int arg0) {
        if (arg0 != 0) {
            this.method2990((byte) -104);
        }
        field7363++;
        if (this.method1126(true) == null) {
            return this.field7390 == null ? 0 : this.field7390.method2525(127);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(BII)Lau;")
    private final class477 method2987(byte arg0, int arg1, int arg2) {
        field7372++;
        class477 var4 = (class477) this.field7376.method740(0, (long) arg2);
        if (var4 != null && arg1 == 0 && !var4.field6811 && var4.field6814) {
            var4.method911(-52);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field7392 == null || this.field7370[arg2] == -1) {
                    if (this.field7389.method898((byte) -112)) {
                        return null;
                    }
                    var4 = this.field7389.method908(512, (byte) 2, true, this.field7368, arg2);
                } else {
                    var4 = this.field7391.method2257(arg2, (byte) -109, this.field7392);
                }
            } else if (arg1 == 1) {
                if (this.field7392 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field7391.method2259(arg2, this.field7392, (byte) -91);
            } else if (arg1 == 2) {
                if (this.field7392 == null) {
                    throw new RuntimeException();
                }
                if (this.field7370[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field7389.method895(113)) {
                    return null;
                }
                var4 = this.field7389.method908(512, (byte) 2, false, this.field7368, arg2);
            } else {
                throw new RuntimeException();
            }
            this.field7376.method737((long) arg2, (byte) 92, var4);
        }
        if (arg0 != 100) {
            this.method1128(74, 102);
        }
        if (var4.field6814) {
            return null;
        }
        byte[] var5 = var4.method2526(arg0 - 14668);
        if (!(var4 instanceof class420)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class154.field2329.reset();
                class154.field2329.update(var5, 0, var5.length - 2);
                int var6 = (int) class154.field2329.getValue();
                if (this.field7369.field7267[arg2] != var6) {
                    throw new RuntimeException();
                }
                if (this.field7369.field7255 != null && this.field7369.field7255[arg2] != null) {
                    byte[] var7 = this.field7369.field7255[arg2];
                    byte[] var8 = class454.method2672(var5.length - 2, var5, 0, arg0 - 36);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field7389.field1791 = 0;
                this.field7389.field1793 = 0;
            } catch (RuntimeException var17) {
                this.field7389.method901(14943);
                var4.method911(-52);
                if (var4.field6811 && !this.field7389.method898((byte) -112)) {
                    class474 var10 = this.field7389.method908(arg0 + 412, (byte) 2, true, this.field7368, arg2);
                    this.field7376.method737((long) arg2, (byte) 92, var10);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field7369.field7253[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field7369.field7253[arg2];
            if (this.field7392 != null) {
                this.field7391.method2258(arg0 + 24602, var5, this.field7392, arg2);
                if (this.field7370[arg2] != 1) {
                    this.field7386++;
                    this.field7370[arg2] = 1;
                }
            }
            if (!var4.field6811) {
                var4.method911(-52);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class154.field2329.reset();
            class154.field2329.update(var5, 0, var5.length - 2);
            int var11 = (int) class154.field2329.getValue();
            if (this.field7369.field7267[arg2] != var11) {
                throw new RuntimeException();
            }
            if (this.field7369.field7255 != null && this.field7369.field7255[arg2] != null) {
                byte[] var12 = this.field7369.field7255[arg2];
                byte[] var13 = class454.method2672(var5.length - 2, var5, 0, arg0 - 36);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field7369.field7253[arg2] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field7370[arg2] != 1) {
                this.field7386++;
                this.field7370[arg2] = 1;
            }
            if (!var4.field6811) {
                var4.method911(-52);
            }
            return var4;
        } catch (Exception var18) {
            this.field7370[arg2] = -1;
            var4.method911(-52);
            if (var4.field6811 && !this.field7389.method898((byte) -112)) {
                class474 var16 = this.field7389.method908(512, (byte) 2, true, this.field7368, arg2);
                this.field7376.method737((long) arg2, (byte) 92, var16);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "(I)I")
    public final int method2988(int arg0) {
        int var2 = 28 / ((arg0 - 45) / 48);
        field7381++;
        return this.field7369 == null ? 0 : this.field7369.field7270;
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(II)I")
    public static final int method2989(int arg0, int arg1) {
        return class99.field1716 == null ? 0 : class99.field1716[arg0][arg1] & 0xFFFFFF;
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(B)V")
    public final void method2990(byte arg0) {
        field7385++;
        if (this.field7396 == null || this.method1126(true) == null) {
            return;
        }
        int var2 = -70 % ((arg0 + 45) / 39);
        for (class108 var3 = this.field7399.method427(true); var3 != null; var3 = this.field7399.method420(false)) {
            int var4 = (int) var3.field1798;
            if (var4 < 0 || var4 >= this.field7369.field7263 || this.field7369.field7261[var4] == 0) {
                var3.method911(-52);
            } else {
                if (this.field7370[var4] == 0) {
                    this.method2987((byte) 100, 1, var4);
                }
                if (this.field7370[var4] == -1) {
                    this.method2987((byte) 100, 2, var4);
                }
                if (this.field7370[var4] == 1) {
                    var3.method911(-52);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIIIILaea;IIII)Z")
    public static final boolean method2991(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class39 arg6, int arg7, int arg8, int arg9, int arg10) {
        field7383++;
        int var11 = arg7;
        int var12 = arg2;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg7 - var13;
        class552.field7817[var13][var14] = 99;
        if (arg8 != -25013) {
            return false;
        }
        int var16 = arg2 - var14;
        class561.field8015[var13][var14] = 0;
        byte var17 = 0;
        int var18 = 0;
        class374.field5503[var17] = arg7;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class446.field6515[var10001] = arg2;
        int[][] var19 = arg6.field526;
        while (var26 != var18) {
            var12 = class446.field6515[var18];
            var11 = class374.field5503[var18];
            int var20 = var12 - var16;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 0xFFF;
            int var22 = var11 - arg6.field531;
            int var23 = var12 - arg6.field530;
            if (arg0 == -4) {
                if (arg10 == var11 && arg4 == var12) {
                    class492.field6908 = var11;
                    class47.field667 = var12;
                    return true;
                }
            } else if (arg0 == -3) {
                if (class181.method1222(var11, 12, arg5, arg1, 2, 2, arg10, var12, arg4)) {
                    class492.field6908 = var11;
                    class47.field667 = var12;
                    return true;
                }
            } else if (arg0 == -2) {
                if (arg6.method330(arg3, arg10, arg5, arg8 ^ 0xFFFFC6E7, arg4, arg1, 2, 2, var11, var12)) {
                    class492.field6908 = var11;
                    class47.field667 = var12;
                    return true;
                }
            } else if (arg0 == -1) {
                if (arg6.method338(var12, arg3, var11, arg1, -9497, arg5, 2, arg4, arg10)) {
                    class492.field6908 = var11;
                    class47.field667 = var12;
                    return true;
                }
            } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                if (arg6.method342(var11, arg4, var12, -21730, arg10, 2, arg9, arg0)) {
                    class492.field6908 = var11;
                    class47.field667 = var12;
                    return true;
                }
            } else if (arg6.method337(arg9, 32, var12, arg0, arg10, var11, 2, arg4)) {
                class492.field6908 = var11;
                class47.field667 = var12;
                return true;
            }
            int var25 = class561.field8015[var21][var20] + 1;
            if (var21 > 0 && class552.field7817[var21 - 1][var20] == 0 && (var19[var22 - 1][var23] & 0x43A40000) == 0 && (var19[var22 - 1][var23 + 1] & 0x4E240000) == 0) {
                class374.field5503[var26] = var11 - 1;
                class446.field6515[var26] = var12;
                class552.field7817[var21 - 1][var20] = 2;
                var26 = var26 + 1 & 0xFFF;
                class561.field8015[var21 - 1][var20] = var25;
            }
            if (var21 < 126 && class552.field7817[var21 + 1][var20] == 0 && (var19[var22 + 2][var23] & 0x60E40000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78240000) == 0) {
                class374.field5503[var26] = var11 + 1;
                class446.field6515[var26] = var12;
                var26 = var26 + 1 & 0xFFF;
                class552.field7817[var21 + 1][var20] = 8;
                class561.field8015[var21 + 1][var20] = var25;
            }
            if (var20 > 0 && class552.field7817[var21][var20 - 1] == 0 && (var19[var22][var23 - 1] & 0x43A40000) == 0 && (var19[var22 + 1][var23 - 1] & 0x60E40000) == 0) {
                class374.field5503[var26] = var11;
                class446.field6515[var26] = var12 - 1;
                class552.field7817[var21][var20 - 1] = 1;
                var26 = var26 + 1 & 0xFFF;
                class561.field8015[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && class552.field7817[var21][var20 + 1] == 0 && (var19[var22][var23 + 2] & 0x4E240000) == 0 && (var19[var22 + 1][var23 + 2] & 0x78240000) == 0) {
                class374.field5503[var26] = var11;
                class446.field6515[var26] = var12 + 1;
                class552.field7817[var21][var20 + 1] = 4;
                var26 = var26 + 1 & 0xFFF;
                class561.field8015[var21][var20 + 1] = var25;
            }
            if (var21 > 0 && var20 > 0 && class552.field7817[var21 - 1][var20 - 1] == 0 && (var19[var22 - 1][var23] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var19[var22][var23 - 1] & 0x63E40000) == 0) {
                class374.field5503[var26] = var11 - 1;
                class446.field6515[var26] = var12 - 1;
                class552.field7817[var21 - 1][var20 - 1] = 3;
                var26 = var26 + 1 & 0xFFF;
                class561.field8015[var21 - 1][var20 - 1] = var25;
            }
            if (var21 < 126 && var20 > 0 && class552.field7817[var21 + 1][var20 - 1] == 0 && (var19[var22 + 1][var23 - 1] & 0x63E40000) == 0 && (var19[var22 + 2][var23 - 1] & 0x60E40000) == 0 && (var19[var22 + 2][var23] & 0x78E40000) == 0) {
                class374.field5503[var26] = var11 + 1;
                class446.field6515[var26] = var12 - 1;
                class552.field7817[var21 + 1][var20 - 1] = 9;
                var26 = var26 + 1 & 0xFFF;
                class561.field8015[var21 + 1][var20 - 1] = var25;
            }
            if (var21 > 0 && var20 < 126 && class552.field7817[var21 - 1][var20 + 1] == 0 && (var19[var22 - 1][var23 + 1] & 0x4FA40000) == 0 && (var19[var22 - 1][var23 + 2] & 0x4E240000) == 0 && (var19[var22][var23 + 2] & 0x7E240000) == 0) {
                class374.field5503[var26] = var11 - 1;
                class446.field6515[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class552.field7817[var21 - 1][var20 + 1] = 6;
                class561.field8015[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && var20 < 126 && class552.field7817[var21 + 1][var20 + 1] == 0 && (var19[var22 + 1][var23 + 2] & 0x7E240000) == 0 && (var19[var22 + 2][var23 + 2] & 0x78240000) == 0 && (var19[var22 + 2][var23 + 1] & 0x78E40000) == 0) {
                class374.field5503[var26] = var11 + 1;
                class446.field6515[var26] = var12 + 1;
                var26 = var26 + 1 & 0xFFF;
                class552.field7817[var21 + 1][var20 + 1] = 12;
                class561.field8015[var21 + 1][var20 + 1] = var25;
            }
        }
        class47.field667 = var12;
        class492.field6908 = var11;
        return false;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(II)I")
    public final int method1123(int arg0, int arg1) {
        field7379++;
        class477 var3 = (class477) this.field7376.method740(arg1, (long) arg0);
        return var3 == null ? 0 : var3.method2525(-119);
    }

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "(B)I")
    public final int method2992(byte arg0) {
        field7375++;
        if (this.field7369 == null) {
            return 0;
        } else if (this.field7395) {
            class108 var2 = this.field7396.method427(true);
            if (var2 == null) {
                return 0;
            } else {
                if (arg0 != 29) {
                    this.field7389 = null;
                }
                return (int) var2.field1798;
            }
        } else {
            return this.field7369.field7270;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)B")
    public static final byte method2993(int arg0, int arg1, int arg2) {
        field7365++;
        if (arg2 != -4762) {
            return 2;
        } else if (arg1 == 9) {
            return (byte) ((arg0 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "(I)V")
    public static final void method2994(int arg0) {
        field7378++;
        if (arg0 > -6) {
            field7382 = null;
        }
        int var1 = class202.field2854.method2639(class646.field9388, (byte) 125);
        if (var1 == 0) {
            class338.field4854 = null;
            class426.method2547((byte) 4, 0);
        } else if (var1 == 1) {
            class539.method3031(126, (byte) 0);
            class426.method2547((byte) 4, 512);
            if (class104.field1755 != null) {
                class194.method1282(31808);
            }
        } else {
            class539.method3031(97, (byte) (class79.field1432 - 4 & 0xFF));
            class426.method2547((byte) 4, 2);
        }
        class306.field4410 = class545.field7583;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILjava/lang/String;)V")
    public static final void method2995(int arg0, String arg1) {
        field7364++;
        if (class10.field115 == null) {
            return;
        }
        if (arg0 != 0) {
            method2996((byte) 44);
        }
        class225.field3367++;
        class624.method3537(-100, class547.field7608);
        class127.field2088.method1710(class51.method441((byte) -107, arg1), 37);
        class127.field2088.method1726((byte) -52, arg1);
    }

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "(B)V")
    public static void method2996(byte arg0) {
        if (arg0 != -78) {
            method2995(90, null);
        }
        field7382 = null;
        field7397 = null;
        field7380 = null;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(ILgg;Lgg;Lcq;Lpt;I[BIZ)V")
    public class531(int arg0, class270 arg1, class270 arg2, class106 arg3, class372 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field7392 = arg1;
        this.field7368 = arg0;
        if (this.field7392 == null) {
            this.field7395 = false;
        } else {
            this.field7395 = true;
            this.field7396 = new class47();
        }
        this.field7389 = arg3;
        this.field7371 = arg7;
        this.field7377 = arg6;
        this.field7374 = arg2;
        this.field7366 = arg5;
        this.field7391 = arg4;
        this.field7401 = arg8;
        if (this.field7374 != null) {
            this.field7390 = this.field7391.method2257(this.field7368, (byte) -97, this.field7374);
        }
    }
}
