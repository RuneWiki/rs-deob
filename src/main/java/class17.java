import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class17 extends class439 {

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    private int field275 = 0;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "Ljw;")
    private class520 field286 = new class520(16);

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    private int field291 = 0;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "Lgj;")
    private class593 field288 = new class593();

    @OriginalMember(owner = "client!n", name = "L", descriptor = "J")
    private long field293 = 0L;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "Lcc;")
    private class685 field261;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "Z")
    private boolean field287;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "Lgj;")
    private class593 field290;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "Llfa;")
    private class103 field282;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "Z")
    private boolean field292;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "Lcc;")
    private class685 field277;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lde;")
    private class497 field259;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "[B")
    private byte[] field263;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Lgq;")
    private class481 field266;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Z")
    public static boolean field262 = false;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Lmf;")
    public static class388 field268 = new class388();

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Ldb;")
    public static class298 field272;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "Lsv;")
    private class617 field283;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "Z")
    private boolean field289;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "[B")
    private byte[] field279;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(IB)I")
    public final int method172(int arg0, byte arg1) {
        if (arg1 != 64) {
            this.method173(-125);
        }
        field278++;
        class481 var3 = (class481) this.field286.method2918((long) arg0, (byte) -126);
        return var3 == null ? 0 : var3.method2646(-6774);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)I")
    public final int method173(int arg0) {
        field276++;
        if (arg0 != -23098) {
            this.field286 = null;
        }
        if (this.field283 == null) {
            return 0;
        } else if (this.field287) {
            class504 var2 = this.field290.method3257(-18);
            return var2 == null ? 0 : (int) var2.field6724;
        } else {
            return this.field283.field8182;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)V")
    public final void method174(int arg0, byte arg1) {
        field280++;
        if (this.field261 == null) {
            return;
        }
        int var3 = 118 / ((arg1 + 73) / 33);
        for (class504 var4 = this.field288.method3257(-90); var4 != null; var4 = this.field288.method3263((byte) -83)) {
            if ((long) arg0 == var4.field6724) {
                return;
            }
        }
        class504 var5 = new class504();
        var5.field6724 = arg0;
        this.field288.method3265(var5, (byte) -120);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method175(byte arg0) {
        if (arg0 < 43) {
            field262 = true;
        }
        field272 = null;
        field268 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Lsv;")
    public final class617 method176(int arg0) {
        field271++;
        if (this.field283 != null) {
            return this.field283;
        }
        if (this.field266 == null) {
            if (this.field282.method792((byte) -110)) {
                return null;
            }
            this.field266 = this.field282.method787(255, true, (byte) 0, this.field270, (byte) 119);
        }
        if (this.field266.field6415) {
            return null;
        }
        byte[] var2 = this.field266.method2645(35);
        if (this.field266 instanceof class515) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field283 = new class617(var2, this.field284, this.field263);
                if (this.field283.field8183 != this.field285) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field283 = null;
                if (this.field282.method792((byte) -115)) {
                    this.field266 = null;
                } else {
                    this.field266 = this.field282.method787(255, true, (byte) 0, this.field270, (byte) 119);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field283 = new class617(var2, this.field284, this.field263);
            } catch (RuntimeException var4) {
                this.field282.method784((byte) -30);
                this.field283 = null;
                if (this.field282.method792((byte) 20)) {
                    this.field266 = null;
                } else {
                    this.field266 = this.field282.method787(255, true, (byte) 0, this.field270, (byte) 119);
                }
                return null;
            }
            if (this.field277 != null) {
                this.field259.method2758(this.field277, this.field270, var2, 2);
            }
        }
        this.field266 = null;
        if (arg0 != -15550) {
            this.method178((byte) 96);
        }
        if (this.field261 != null) {
            this.field279 = new byte[this.field283.field8186];
            this.field275 = 0;
        }
        return this.field283;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
    public final void method177(int arg0) {
        if (arg0 != 29780) {
            this.method177(29);
        }
        field265++;
        if (this.field290 != null) {
            if (this.method176(-15550) == null) {
                return;
            }
            if (this.field287) {
                boolean var6 = true;
                for (class504 var7 = this.field290.method3257(-31); var7 != null; var7 = this.field290.method3263((byte) -110)) {
                    int var9 = (int) var7.field6724;
                    if (this.field279[var9] == 0) {
                        this.method182(1, true, var9);
                    }
                    if (this.field279[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method2797(77);
                    }
                }
                while (this.field291 < this.field283.field8177.length) {
                    if (this.field283.field8177[this.field291] == 0) {
                        this.field291++;
                    } else {
                        if (this.field259.field6673 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field279[this.field291] == 0) {
                            this.method182(1, true, this.field291);
                        }
                        if (this.field279[this.field291] == 0) {
                            class504 var8 = new class504();
                            var8.field6724 = this.field291;
                            this.field290.method3265(var8, (byte) -114);
                            var6 = false;
                        }
                        this.field291++;
                    }
                }
                if (var6) {
                    this.field287 = false;
                    this.field291 = 0;
                }
            } else if (this.field289) {
                boolean var2 = true;
                for (class504 var3 = this.field290.method3257(arg0 - 29819); var3 != null; var3 = this.field290.method3263((byte) -78)) {
                    int var5 = (int) var3.field6724;
                    if (this.field279[var5] != 1) {
                        this.method182(2, true, var5);
                    }
                    if (this.field279[var5] == 1) {
                        var3.method2797(119);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field291 < this.field283.field8177.length) {
                    if (this.field283.field8177[this.field291] == 0) {
                        this.field291++;
                    } else {
                        if (this.field282.method780((byte) -51)) {
                            var2 = false;
                            break;
                        }
                        if (this.field279[this.field291] != 1) {
                            this.method182(2, true, this.field291);
                        }
                        if (this.field279[this.field291] != 1) {
                            class504 var4 = new class504();
                            var4.field6724 = this.field291;
                            this.field290.method3265(var4, (byte) -102);
                            var2 = false;
                        }
                        this.field291++;
                    }
                }
                if (var2) {
                    this.field291 = 0;
                    this.field289 = false;
                }
            } else {
                this.field290 = null;
            }
        }
        if (!this.field292 || class681.method3802(-23600) < this.field293) {
            return;
        }
        for (class481 var10 = (class481) this.field286.method2915(66); var10 != null; var10 = (class481) this.field286.method2912((byte) 119)) {
            if (!var10.field6415) {
                if (var10.field6414) {
                    if (!var10.field6416) {
                        throw new RuntimeException();
                    }
                    var10.method2797(76);
                } else {
                    var10.field6414 = true;
                }
            }
        }
        this.field293 = class681.method3802(-23600) + 1000L;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
    public final void method178(byte arg0) {
        field273++;
        if (this.field290 == null || this.method176(-15550) == null) {
            return;
        }
        if (arg0 <= 120) {
            this.method174(27, (byte) 17);
        }
        for (class504 var2 = this.field288.method3257(-66); var2 != null; var2 = this.field288.method3263((byte) -107)) {
            int var3 = (int) var2.field6724;
            if (var3 < 0 || var3 >= this.field283.field8186 || this.field283.field8177[var3] == 0) {
                var2.method2797(-127);
            } else {
                if (this.field279[var3] == 0) {
                    this.method182(1, true, var3);
                }
                if (this.field279[var3] == -1) {
                    this.method182(2, true, var3);
                }
                if (this.field279[var3] == 1) {
                    var2.method2797(-114);
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(Z)I")
    public final int method179(boolean arg0) {
        if (arg0) {
            return -77;
        } else {
            field264++;
            return this.field275;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)[B")
    public final byte[] method180(int arg0, int arg1) {
        field274++;
        class481 var3 = this.method182(arg0, true, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method2645(35);
            var3.method2797(-128);
            return var4;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(B)V")
    public final void method181(byte arg0) {
        field260++;
        if (this.field261 == null) {
            return;
        }
        if (arg0 <= 117) {
            this.method178((byte) -34);
        }
        this.field289 = true;
        if (this.field290 == null) {
            this.field290 = new class593();
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IZI)Lgq;")
    private final class481 method182(int arg0, boolean arg1, int arg2) {
        field269++;
        class481 var4 = (class481) this.field286.method2918((long) arg2, (byte) -127);
        if (var4 != null && arg0 == 0 && !var4.field6416 && var4.field6415) {
            var4.method2797(-121);
            var4 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field261 == null || this.field279[arg2] == -1) {
                    if (this.field282.method792((byte) 109)) {
                        return null;
                    }
                    var4 = this.field282.method787(this.field270, true, (byte) 2, arg2, (byte) 119);
                } else {
                    var4 = this.field259.method2754(-63, this.field261, arg2);
                }
            } else if (arg0 == 1) {
                if (this.field261 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field259.method2753(3, this.field261, arg2);
            } else if (arg0 == 2) {
                if (this.field261 == null) {
                    throw new RuntimeException();
                }
                if (this.field279[arg2] != -1) {
                    throw new RuntimeException();
                }
                if (this.field282.method780((byte) -116)) {
                    return null;
                }
                var4 = this.field282.method787(this.field270, false, (byte) 2, arg2, (byte) 119);
            } else {
                throw new RuntimeException();
            }
            this.field286.method2911((long) arg2, var4, (byte) -28);
        }
        if (var4.field6415) {
            return null;
        }
        byte[] var5 = var4.method2645(35);
        if (!arg1) {
            this.field275 = -94;
        }
        if (!(var4 instanceof class515)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class364.field4921.reset();
                class364.field4921.update(var5, 0, var5.length - 2);
                int var6 = (int) class364.field4921.getValue();
                if (this.field283.field8172[arg2] != var6) {
                    throw new RuntimeException();
                }
                if (this.field283.field8189 != null && this.field283.field8189[arg2] != null) {
                    byte[] var7 = this.field283.field8189[arg2];
                    byte[] var8 = class701.method3883(0, var5.length - 2, true, var5);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field282.field1553 = 0;
                this.field282.field1551 = 0;
            } catch (RuntimeException var17) {
                this.field282.method784((byte) -30);
                var4.method2797(73);
                if (var4.field6416 && !this.field282.method792((byte) -93)) {
                    class470 var10 = this.field282.method787(this.field270, true, (byte) 2, arg2, (byte) 119);
                    this.field286.method2911((long) arg2, var10, (byte) -28);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field283.field8181[arg2] >>> 8);
            var5[var5.length - 1] = (byte) this.field283.field8181[arg2];
            if (this.field261 != null) {
                this.field259.method2758(this.field261, arg2, var5, 2);
                if (this.field279[arg2] != 1) {
                    this.field275++;
                    this.field279[arg2] = 1;
                }
            }
            if (!var4.field6416) {
                var4.method2797(110);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class364.field4921.reset();
            class364.field4921.update(var5, 0, var5.length - 2);
            int var11 = (int) class364.field4921.getValue();
            if (this.field283.field8172[arg2] != var11) {
                throw new RuntimeException();
            }
            if (this.field283.field8189 != null && this.field283.field8189[arg2] != null) {
                byte[] var12 = this.field283.field8189[arg2];
                byte[] var13 = class701.method3883(0, var5.length - 2, true, var5);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field283.field8181[arg2] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field279[arg2] != 1) {
                this.field275++;
                this.field279[arg2] = 1;
            }
            if (!var4.field6416) {
                var4.method2797(-113);
            }
            return var4;
        } catch (Exception var18) {
            this.field279[arg2] = -1;
            var4.method2797(-118);
            if (var4.field6416 && !this.field282.method792((byte) -67)) {
                class470 var16 = this.field282.method787(this.field270, true, (byte) 2, arg2, (byte) 119);
                this.field286.method2911((long) arg2, var16, (byte) -28);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(B)I")
    public final int method183(byte arg0) {
        field281++;
        if (this.field283 == null) {
            return 0;
        } else {
            if (arg0 != 43) {
                this.field286 = null;
            }
            return this.field283.field8182;
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)I")
    public final int method184(int arg0) {
        field267++;
        if (this.method176(arg0 - 15650) == null) {
            return this.field266 == null ? 0 : this.field266.method2646(-6774);
        } else if (arg0 == 100) {
            return 100;
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(ILcc;Lcc;Llfa;Lde;I[BIZ)V")
    public class17(int arg0, class685 arg1, class685 arg2, class103 arg3, class497 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field261 = arg1;
        this.field270 = arg0;
        if (this.field261 == null) {
            this.field287 = false;
        } else {
            this.field287 = true;
            this.field290 = new class593();
        }
        this.field282 = arg3;
        this.field292 = arg8;
        this.field285 = arg7;
        this.field277 = arg2;
        this.field284 = arg5;
        this.field259 = arg4;
        this.field263 = arg6;
        if (this.field277 != null) {
            this.field266 = this.field259.method2754(107, this.field277, this.field270);
        }
    }
}
