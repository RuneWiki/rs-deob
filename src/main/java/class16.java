import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 extends class62 {

    @OriginalMember(owner = "client!n", name = "y", descriptor = "I")
    private int field262 = 0;

    @OriginalMember(owner = "client!n", name = "K", descriptor = "Lge;")
    private class69 field274 = new class69(16);

    @OriginalMember(owner = "client!n", name = "S", descriptor = "I")
    private int field282 = 0;

    @OriginalMember(owner = "client!n", name = "W", descriptor = "Lub;")
    private class88 field286 = new class88();

    @OriginalMember(owner = "client!n", name = "X", descriptor = "J")
    private long field287 = 0L;

    @OriginalMember(owner = "client!n", name = "P", descriptor = "Lob;")
    private class128 field279;

    @OriginalMember(owner = "client!n", name = "D", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!n", name = "V", descriptor = "Z")
    private boolean field285;

    @OriginalMember(owner = "client!n", name = "U", descriptor = "Lub;")
    private class88 field284;

    @OriginalMember(owner = "client!n", name = "E", descriptor = "Luc;")
    private class38 field268;

    @OriginalMember(owner = "client!n", name = "H", descriptor = "Lob;")
    private class128 field271;

    @OriginalMember(owner = "client!n", name = "I", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Le;")
    private class64 field258;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client!n", name = "Y", descriptor = "Z")
    private boolean field288;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "Lpb;")
    private class124 field256;

    @OriginalMember(owner = "client!n", name = "O", descriptor = "Lub;")
    public static class88 field278 = new class88();

    @OriginalMember(owner = "client!n", name = "q", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!n", name = "r", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!n", name = "z", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!n", name = "A", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!n", name = "B", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!n", name = "C", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!n", name = "F", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!n", name = "G", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!n", name = "J", descriptor = "I")
    public static int field273;

    @OriginalMember(owner = "client!n", name = "L", descriptor = "I")
    public static int field275;

    @OriginalMember(owner = "client!n", name = "M", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!n", name = "N", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!n", name = "Q", descriptor = "I")
    public static int field280;

    @OriginalMember(owner = "client!n", name = "R", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "Ltb;")
    private class68 field261;

    @OriginalMember(owner = "client!n", name = "T", descriptor = "Z")
    private boolean field283;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "[B")
    private byte[] field259;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BI)V")
    public final void method137(byte arg0, int arg1) {
        if (arg0 != -89) {
            this.field261 = null;
        }
        field273++;
        if (this.field279 == null) {
            return;
        }
        for (class81 var3 = this.field286.method673(false); var3 != null; var3 = this.field286.method680(71)) {
            if ((long) arg1 == var3.field1530) {
                return;
            }
        }
        class81 var4 = new class81();
        var4.field1530 = (long) arg1;
        this.field286.method675(var4, (byte) -120);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)I")
    public final int method138(int arg0) {
        field270++;
        if (this.field261 == null) {
            return 0;
        }
        if (arg0 < 68) {
            this.method140(false);
        }
        if (this.field285) {
            class81 var2 = this.field284.method673(false);
            return var2 == null ? 0 : (int) var2.field1530;
        } else {
            return this.field261.field1329;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)I")
    public final int method139(int arg0) {
        field254++;
        if (this.field261 == null) {
            return 0;
        } else {
            if (arg0 != 0) {
                this.method147(-72);
            }
            return this.field261.field1329;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Z)Ltb;")
    public final class68 method140(boolean arg0) {
        field277++;
        if (this.field261 != null) {
            return this.field261;
        }
        if (this.field256 == null) {
            if (this.field268.method397(12)) {
                return null;
            }
            this.field256 = this.field268.method386(this.field267, true, (byte) 0, 255, (byte) -43);
        }
        if (this.field256.field2175) {
            return null;
        }
        byte[] var2 = this.field256.method885(1);
        if (this.field256 instanceof class195) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field261 = new class68(var2, this.field272);
                if (this.field261.field1330 != this.field257) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field261 = null;
                if (this.field268.method397(101)) {
                    this.field256 = null;
                } else {
                    this.field256 = this.field268.method386(this.field267, true, (byte) 0, 255, (byte) 12);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field261 = new class68(var2, this.field272);
            } catch (RuntimeException var4) {
                this.field268.method393((byte) -22);
                this.field261 = null;
                if (this.field268.method397(19)) {
                    this.field256 = null;
                } else {
                    this.field256 = this.field268.method386(this.field267, true, (byte) 0, 255, (byte) -113);
                }
                return null;
            }
            if (this.field271 != null) {
                this.field258.method535(2, this.field267, var2, this.field271);
            }
        }
        this.field256 = null;
        if (arg0) {
            method143(-61);
        }
        if (this.field279 != null) {
            this.field262 = 0;
            this.field259 = new byte[this.field261.field1340];
        }
        return this.field261;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)[B")
    public final byte[] method141(int arg0, int arg1) {
        field275++;
        class124 var3 = this.method148(arg0, 1, arg1);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method885(arg1 + 1);
            var3.method629(arg1);
            return var4;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(I)V")
    public final void method142(int arg0) {
        field276++;
        if (this.field284 == null || this.method140(false) == null) {
            return;
        }
        if (arg0 != 0) {
            this.method144((byte) -73);
        }
        for (class81 var2 = this.field286.method673(false); var2 != null; var2 = this.field286.method680(arg0 + 88)) {
            int var3 = (int) var2.field1530;
            if (var3 < 0 || var3 >= this.field261.field1340 || this.field261.field1337[var3] == 0) {
                var2.method629(0);
            } else {
                if (this.field259[var3] == 0) {
                    this.method148(var3, 1, 1);
                }
                if (this.field259[var3] == -1) {
                    this.method148(var3, arg0 ^ 0x1, 2);
                }
                if (this.field259[var3] == 1) {
                    var2.method629(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "d", descriptor = "(I)V")
    public static final void method143(int arg0) {
        if (arg0 != 6735) {
            return;
        }
        if (class210.field3585 != null) {
            class175 var1 = class210.field3585;
            synchronized (class210.field3585) {
                class210.field3585 = null;
            }
        }
        field265++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public final void method144(byte arg0) {
        field255++;
        if (this.field279 == null) {
            return;
        }
        this.field283 = true;
        if (this.field284 == null) {
            this.field284 = new class88();
        }
        if (arg0 != 80) {
            this.field258 = null;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I")
    public final int method145(int arg0, int arg1) {
        field281++;
        int var3 = 65 % ((arg0 + 12) / 35);
        class124 var4 = (class124) this.field274.method568((long) arg1, -1);
        return var4 == null ? 0 : var4.method889((byte) -30);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BII)V")
    public static final void method146(byte arg0, int arg1, int arg2) {
        field260++;
        if (arg0 != -91) {
            method143(-17);
        }
        if (class47.method434(0, arg1)) {
            class200.method1362(-65, arg2, class22.field406[arg1]);
        }
    }

    @OriginalMember(owner = "client!n", name = "e", descriptor = "(I)I")
    public final int method147(int arg0) {
        field264++;
        if (arg0 < 47) {
            this.method148(-78, 33, 53);
        }
        if (this.method140(false) == null) {
            return this.field256 == null ? 0 : this.field256.method889((byte) -30);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(III)Lpb;")
    private final class124 method148(int arg0, int arg1, int arg2) {
        field269++;
        class124 var4 = (class124) this.field274.method568((long) arg0, -1);
        if (arg1 != 1) {
            this.method149((byte) 9);
        }
        if (var4 != null && arg2 == 0 && !var4.field2185 && var4.field2175) {
            var4.method629(arg1 - 1);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field279 == null || this.field259[arg0] == -1) {
                    if (this.field268.method397(56)) {
                        return null;
                    }
                    var4 = this.field268.method386(arg0, true, (byte) 2, this.field267, (byte) 116);
                } else {
                    var4 = this.field258.method530((byte) 121, arg0, this.field279);
                }
            } else if (arg2 == 1) {
                if (this.field279 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field258.method532(-113, arg0, this.field279);
            } else if (arg2 == 2) {
                if (this.field279 == null) {
                    throw new RuntimeException();
                }
                if (this.field259[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field268.method387(0)) {
                    return null;
                }
                var4 = this.field268.method386(arg0, false, (byte) 2, this.field267, (byte) -68);
            } else {
                throw new RuntimeException();
            }
            this.field274.method562(var4, (long) arg0, (byte) 56);
        }
        if (var4.field2175) {
            return null;
        }
        byte[] var5 = var4.method885(arg1);
        if (!var4 instanceof class195) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class213.field3627.reset();
                class213.field3627.update(var5, 0, var5.length - 2);
                int var6 = (int) class213.field3627.getValue();
                if (this.field261.field1327[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field268.field876 = 0;
                this.field268.field877 = 0;
            } catch (RuntimeException var12) {
                this.field268.method393((byte) -22);
                var4.method629(arg1 ^ 0x1);
                if (var4.field2185 && !this.field268.method397(arg1 + 14)) {
                    class174 var7 = this.field268.method386(arg0, true, (byte) 2, this.field267, (byte) 121);
                    this.field274.method562(var7, (long) arg0, (byte) 56);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field261.field1325[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field261.field1325[arg0];
            if (this.field279 != null) {
                this.field258.method535(2, arg0, var5, this.field279);
                if (this.field259[arg0] != 1) {
                    this.field262++;
                    this.field259[arg0] = 1;
                }
            }
            if (!var4.field2185) {
                var4.method629(0);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class213.field3627.reset();
            class213.field3627.update(var5, 0, var5.length - 2);
            int var8 = (int) class213.field3627.getValue();
            if (this.field261.field1327[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field261.field1325[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field259[arg0] != 1) {
                this.field262++;
                this.field259[arg0] = 1;
            }
            if (!var4.field2185) {
                var4.method629(0);
            }
            return var4;
        } catch (Exception var11) {
            this.field259[arg0] = -1;
            var4.method629(0);
            if (var4.field2185 && !this.field268.method397(arg1 + 82)) {
                class174 var10 = this.field268.method386(arg0, true, (byte) 2, this.field267, (byte) 16);
                this.field274.method562(var10, (long) arg0, (byte) 56);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)I")
    public final int method149(byte arg0) {
        int var2 = 51 / ((arg0 - 77) / 32);
        field280++;
        return this.field262;
    }

    @OriginalMember(owner = "client!n", name = "f", descriptor = "(I)V")
    public final void method150(int arg0) {
        field266++;
        if (this.field284 != null) {
            if (this.method140(false) == null) {
                return;
            }
            if (this.field285) {
                boolean var2 = true;
                for (class81 var3 = this.field284.method673(false); var3 != null; var3 = this.field284.method680(arg0 + 13966)) {
                    int var5 = (int) var3.field1530;
                    if (this.field259[var5] == 0) {
                        this.method148(var5, 1, 1);
                    }
                    if (this.field259[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method629(0);
                    }
                }
                while (this.field261.field1337.length > this.field282) {
                    if (this.field261.field1337[this.field282] == 0) {
                        this.field282++;
                    } else {
                        if (this.field258.field1277 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field259[this.field282] == 0) {
                            this.method148(this.field282, arg0 ^ 0xFFFFC9A2, 1);
                        }
                        if (this.field259[this.field282] == 0) {
                            var2 = false;
                            class81 var4 = new class81();
                            var4.field1530 = (long) this.field282;
                            this.field284.method675(var4, (byte) -91);
                        }
                        this.field282++;
                    }
                }
                if (var2) {
                    this.field285 = false;
                    this.field282 = 0;
                }
            } else if (this.field283) {
                boolean var6 = true;
                for (class81 var7 = this.field284.method673(false); var7 != null; var7 = this.field284.method680(40)) {
                    int var9 = (int) var7.field1530;
                    if (this.field259[var9] != 1) {
                        this.method148(var9, arg0 + 13918, 2);
                    }
                    if (this.field259[var9] == 1) {
                        var7.method629(arg0 ^ 0xFFFFC9A3);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field261.field1337.length > this.field282) {
                    if (this.field261.field1337[this.field282] == 0) {
                        this.field282++;
                    } else {
                        if (this.field268.method387(0)) {
                            var6 = false;
                            break;
                        }
                        if (this.field259[this.field282] != 1) {
                            this.method148(this.field282, 1, 2);
                        }
                        if (this.field259[this.field282] != 1) {
                            var6 = false;
                            class81 var8 = new class81();
                            var8.field1530 = (long) this.field282;
                            this.field284.method675(var8, (byte) -95);
                        }
                        this.field282++;
                    }
                }
                if (var6) {
                    this.field283 = false;
                    this.field282 = 0;
                }
            } else {
                this.field284 = null;
            }
        }
        if (arg0 != -13917) {
            this.field259 = null;
        }
        if (!this.field288 || this.field287 > class181.method1244((byte) -56)) {
            return;
        }
        for (class124 var10 = (class124) this.field274.method566(0); var10 != null; var10 = (class124) this.field274.method565(101)) {
            if (!var10.field2175) {
                if (var10.field2180) {
                    if (!var10.field2185) {
                        throw new RuntimeException();
                    }
                    var10.method629(arg0 + 13917);
                } else {
                    var10.field2180 = true;
                }
            }
        }
        this.field287 = class181.method1244((byte) -92) + 1000L;
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(Z)V")
    public static void method151(boolean arg0) {
        if (!arg0) {
            field278 = null;
        }
        field278 = null;
    }

    @OriginalMember(owner = "client!n", name = "<init>", descriptor = "(ILob;Lob;Luc;Le;IIZ)V")
    public class16(int arg0, class128 arg1, class128 arg2, class38 arg3, class64 arg4, int arg5, int arg6, boolean arg7) {
        this.field279 = arg1;
        this.field267 = arg0;
        if (this.field279 == null) {
            this.field285 = false;
        } else {
            this.field285 = true;
            this.field284 = new class88();
        }
        this.field268 = arg3;
        this.field271 = arg2;
        this.field272 = arg5;
        this.field258 = arg4;
        this.field257 = arg6;
        this.field288 = arg7;
        if (this.field271 != null) {
            this.field256 = this.field258.method530((byte) 121, this.field267, this.field271);
        }
    }
}
