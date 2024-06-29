import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!im")
public class class596 extends class527 {

    @OriginalMember(owner = "client!im", name = "t", descriptor = "I")
    private int field8374 = 0;

    @OriginalMember(owner = "client!im", name = "x", descriptor = "Ljo;")
    private class353 field8378 = new class353(16);

    @OriginalMember(owner = "client!im", name = "K", descriptor = "I")
    private int field8391 = 0;

    @OriginalMember(owner = "client!im", name = "N", descriptor = "Lok;")
    private class266 field8394 = new class266();

    @OriginalMember(owner = "client!im", name = "O", descriptor = "J")
    private long field8395 = 0L;

    @OriginalMember(owner = "client!im", name = "m", descriptor = "I")
    private int field8367;

    @OriginalMember(owner = "client!im", name = "G", descriptor = "Luaa;")
    private class126 field8387;

    @OriginalMember(owner = "client!im", name = "L", descriptor = "Z")
    private boolean field8392;

    @OriginalMember(owner = "client!im", name = "M", descriptor = "Lok;")
    private class266 field8393;

    @OriginalMember(owner = "client!im", name = "P", descriptor = "Z")
    private boolean field8396;

    @OriginalMember(owner = "client!im", name = "w", descriptor = "[B")
    private byte[] field8377;

    @OriginalMember(owner = "client!im", name = "r", descriptor = "I")
    private int field8372;

    @OriginalMember(owner = "client!im", name = "n", descriptor = "I")
    private int field8368;

    @OriginalMember(owner = "client!im", name = "H", descriptor = "Lgu;")
    private class605 field8388;

    @OriginalMember(owner = "client!im", name = "l", descriptor = "Luaa;")
    private class126 field8366;

    @OriginalMember(owner = "client!im", name = "E", descriptor = "Lrf;")
    private class90 field8385;

    @OriginalMember(owner = "client!im", name = "I", descriptor = "Laka;")
    private class84 field8389;

    @OriginalMember(owner = "client!im", name = "u", descriptor = "[Z")
    public static boolean[] field8375 = new boolean[8];

    @OriginalMember(owner = "client!im", name = "p", descriptor = "I")
    public static int field8370 = -1;

    @OriginalMember(owner = "client!im", name = "h", descriptor = "I")
    public static int field8362;

    @OriginalMember(owner = "client!im", name = "i", descriptor = "I")
    public static int field8363;

    @OriginalMember(owner = "client!im", name = "j", descriptor = "I")
    public static int field8364;

    @OriginalMember(owner = "client!im", name = "k", descriptor = "I")
    public static int field8365;

    @OriginalMember(owner = "client!im", name = "q", descriptor = "I")
    public static int field8371;

    @OriginalMember(owner = "client!im", name = "s", descriptor = "I")
    public static int field8373;

    @OriginalMember(owner = "client!im", name = "v", descriptor = "I")
    public static int field8376;

    @OriginalMember(owner = "client!im", name = "y", descriptor = "I")
    public static int field8379;

    @OriginalMember(owner = "client!im", name = "z", descriptor = "I")
    public static int field8380;

    @OriginalMember(owner = "client!im", name = "A", descriptor = "I")
    public static int field8381;

    @OriginalMember(owner = "client!im", name = "B", descriptor = "I")
    public static int field8382;

    @OriginalMember(owner = "client!im", name = "C", descriptor = "I")
    public static int field8383;

    @OriginalMember(owner = "client!im", name = "F", descriptor = "I")
    public static int field8386;

    @OriginalMember(owner = "client!im", name = "D", descriptor = "Lel;")
    private class572 field8384;

    @OriginalMember(owner = "client!im", name = "g", descriptor = "Z")
    public static boolean field8361;

    @OriginalMember(owner = "client!im", name = "J", descriptor = "Z")
    private boolean field8390;

    @OriginalMember(owner = "client!im", name = "o", descriptor = "[B")
    private byte[] field8369;

    @OriginalMember(owner = "client!im", name = "b", descriptor = "(B)I")
    public final int method3474(byte arg0) {
        field8380++;
        if (this.method3180(111) == null) {
            return this.field8389 == null ? 0 : this.field8389.method641((byte) -14);
        } else {
            if (arg0 != -57) {
                this.field8391 = -13;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(I)V")
    public final void method3475(int arg0) {
        field8363++;
        if (this.field8393 == null || this.method3180(arg0 ^ 0x81) == null) {
            return;
        }
        if (arg0 != 255) {
            this.method3475(101);
        }
        for (class577 var2 = this.field8394.method1731((byte) -117); var2 != null; var2 = this.field8394.method1724(arg0 - 255)) {
            int var3 = (int) var2.field8133;
            if (var3 < 0 || this.field8384.field8072 <= var3 || this.field8384.field8068[var3] == 0) {
                var2.method3387((byte) 122);
            } else {
                if (this.field8369[var3] == 0) {
                    this.method3477(var3, 1, arg0 ^ 0x86);
                }
                if (this.field8369[var3] == -1) {
                    this.method3477(var3, 2, 121);
                }
                if (this.field8369[var3] == 1) {
                    var2.method3387((byte) -52);
                }
            }
        }
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(I)V")
    public final void method3476(int arg0) {
        field8383++;
        if (this.field8387 == null) {
            return;
        }
        this.field8390 = true;
        if (this.field8393 == null) {
            this.field8393 = new class266();
        }
        if (arg0 <= 126) {
            this.field8387 = null;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IB)V")
    public final void method3183(int arg0, byte arg1) {
        field8379++;
        if (this.field8387 == null) {
            return;
        }
        int var3 = -12 % ((arg1 - 6) / 56);
        for (class577 var4 = this.field8394.method1731((byte) -108); var4 != null; var4 = this.field8394.method1724(0)) {
            if (((long) arg0) == var4.field8133) {
                return;
            }
        }
        class577 var5 = new class577();
        var5.field8133 = arg0;
        this.field8394.method1727(var5, (byte) 101);
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(III)Laka;")
    private final class84 method3477(int arg0, int arg1, int arg2) {
        field8382++;
        class84 var4 = (class84) this.field8378.method2242((long) arg0, -1);
        if (var4 != null && arg1 == 0 && !var4.field928 && var4.field930) {
            var4.method3387((byte) 121);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field8387 == null || this.field8369[arg0] == -1) {
                    if (this.field8388.method3515((byte) -127)) {
                        return null;
                    }
                    var4 = this.field8388.method3504(-127, this.field8367, arg0, (byte) 2, true);
                } else {
                    var4 = this.field8385.method673(this.field8387, -3, arg0);
                }
            } else if (arg1 == 1) {
                if (this.field8387 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field8385.method670(3, arg0, this.field8387);
            } else if (arg1 == 2) {
                if (this.field8387 == null) {
                    throw new RuntimeException();
                }
                if (this.field8369[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field8388.method3513(-33)) {
                    return null;
                }
                var4 = this.field8388.method3504(-128, this.field8367, arg0, (byte) 2, false);
            } else {
                throw new RuntimeException();
            }
            this.field8378.method2241(108, (long) arg0, var4);
        }
        if (arg2 <= 104) {
            field8375 = null;
        }
        if (var4.field930) {
            return null;
        }
        byte[] var5 = var4.method638((byte) -99);
        if (!var4 instanceof class792) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class248.field3672.reset();
                        class248.field3672.update(var5, 0, var5.length - 2);
                        int var12 = (int) class248.field3672.getValue();
                        if (this.field8384.field8078[arg0] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field8384.field8076 == null || this.field8384.field8076[arg0] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field8384.field8076[arg0];
                        byte[] var14 = class413.method2507(122, 0, var5, var5.length - 2);
                        int var15 = 0;
                        while (true) {
                            if (var15 >= 64) {
                                break label159;
                            }
                            if (var13[var15] != var14[var15]) {
                                throw new RuntimeException();
                            }
                            var15++;
                        }
                    }
                    throw new RuntimeException();
                }
                this.field8388.field8473 = 0;
                this.field8388.field8472 = 0;
            } catch (RuntimeException var18) {
                this.field8388.method3516(-91);
                var4.method3387((byte) -49);
                if (var4.field928 && !this.field8388.method3515((byte) 35)) {
                    class327 var16 = this.field8388.method3504(-128, this.field8367, arg0, (byte) 2, true);
                    this.field8378.method2241(-73, (long) arg0, var16);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field8384.field8079[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field8384.field8079[arg0];
            if (this.field8387 != null) {
                this.field8385.method672(var5, 63, this.field8387, arg0);
                if (this.field8369[arg0] != 1) {
                    this.field8374++;
                    this.field8369[arg0] = 1;
                }
            }
            if (!var4.field928) {
                var4.method3387((byte) -48);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class248.field3672.reset();
            class248.field3672.update(var5, 0, var5.length - 2);
            int var6 = (int) class248.field3672.getValue();
            if (this.field8384.field8078[arg0] != var6) {
                throw new RuntimeException();
            }
            if (this.field8384.field8076 != null && this.field8384.field8076[arg0] != null) {
                byte[] var7 = this.field8384.field8076[arg0];
                byte[] var8 = class413.method2507(101, 0, var5, var5.length - 2);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field8384.field8079[arg0] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field8369[arg0] != 1) {
                this.field8374++;
                this.field8369[arg0] = 1;
            }
            if (!var4.field928) {
                var4.method3387((byte) -29);
            }
            return var4;
        } catch (Exception var17) {
            this.field8369[arg0] = -1;
            var4.method3387((byte) -19);
            if (var4.field928 && !this.field8388.method3515((byte) 114)) {
                class327 var11 = this.field8388.method3504(-127, this.field8367, arg0, (byte) 2, true);
                this.field8378.method2241(103, (long) arg0, var11);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!im", name = "c", descriptor = "(B)V")
    public static void method3478(byte arg0) {
        field8375 = null;
        if (arg0 < 82) {
            method3481(null, -113);
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(I)Lel;")
    public final class572 method3180(int arg0) {
        field8373++;
        if (this.field8384 != null) {
            return this.field8384;
        }
        if (this.field8389 == null) {
            if (this.field8388.method3515((byte) 80)) {
                return null;
            }
            this.field8389 = this.field8388.method3504(-128, 255, this.field8367, (byte) 0, true);
        }
        if (this.field8389.field930) {
            return null;
        }
        int var2 = -6 / ((arg0 - 4) / 41);
        byte[] var3 = this.field8389.method638((byte) -125);
        if (this.field8389 instanceof class792) {
            try {
                if (var3 == null) {
                    throw new RuntimeException();
                }
                this.field8384 = new class572(var3, this.field8372, this.field8377);
                if (this.field8384.field8080 != this.field8368) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var4) {
                this.field8384 = null;
                if (this.field8388.method3515((byte) -112)) {
                    this.field8389 = null;
                } else {
                    this.field8389 = this.field8388.method3504(-127, 255, this.field8367, (byte) 0, true);
                }
                return null;
            }
        } else {
            try {
                if (var3 == null) {
                    throw new RuntimeException();
                }
                this.field8384 = new class572(var3, this.field8372, this.field8377);
            } catch (RuntimeException var5) {
                this.field8388.method3516(-66);
                this.field8384 = null;
                if (this.field8388.method3515((byte) 76)) {
                    this.field8389 = null;
                } else {
                    this.field8389 = this.field8388.method3504(-128, 255, this.field8367, (byte) 0, true);
                }
                return null;
            }
            if (this.field8366 != null) {
                this.field8385.method672(var3, 63, this.field8366, this.field8367);
            }
        }
        if (this.field8387 != null) {
            this.field8374 = 0;
            this.field8369 = new byte[this.field8384.field8072];
        }
        this.field8389 = null;
        return this.field8384;
    }

    @OriginalMember(owner = "client!im", name = "e", descriptor = "(I)I")
    public final int method3479(int arg0) {
        field8364++;
        int var2 = -94 / ((arg0 - 76) / 38);
        return this.field8374;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Z)V")
    public final void method3480(boolean arg0) {
        if (arg0) {
            return;
        }
        field8365++;
        if (this.field8393 != null) {
            if (this.method3180(89) == null) {
                return;
            }
            if (this.field8392) {
                boolean var2 = true;
                for (class577 var3 = this.field8393.method1731((byte) -127); var3 != null; var3 = this.field8393.method1724(0)) {
                    int var5 = (int) var3.field8133;
                    if (this.field8369[var5] == 0) {
                        this.method3477(var5, 1, 126);
                    }
                    if (this.field8369[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method3387((byte) -118);
                    }
                }
                while (this.field8384.field8068.length > this.field8391) {
                    if (this.field8384.field8068[this.field8391] == 0) {
                        this.field8391++;
                    } else {
                        if (this.field8385.field1018 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field8369[this.field8391] == 0) {
                            this.method3477(this.field8391, 1, 115);
                        }
                        if (this.field8369[this.field8391] == 0) {
                            class577 var4 = new class577();
                            var4.field8133 = this.field8391;
                            this.field8393.method1727(var4, (byte) 105);
                            var2 = false;
                        }
                        this.field8391++;
                    }
                }
                if (var2) {
                    this.field8392 = false;
                    this.field8391 = 0;
                }
            } else if (this.field8390) {
                boolean var6 = true;
                for (class577 var7 = this.field8393.method1731((byte) -128); var7 != null; var7 = this.field8393.method1724(0)) {
                    int var9 = (int) var7.field8133;
                    if (this.field8369[var9] != 1) {
                        this.method3477(var9, 2, 110);
                    }
                    if (this.field8369[var9] == 1) {
                        var7.method3387((byte) 113);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field8391 < this.field8384.field8068.length) {
                    if (this.field8384.field8068[this.field8391] == 0) {
                        this.field8391++;
                    } else {
                        if (this.field8388.method3513(-112)) {
                            var6 = false;
                            break;
                        }
                        if (this.field8369[this.field8391] != 1) {
                            this.method3477(this.field8391, 2, 110);
                        }
                        if (this.field8369[this.field8391] != 1) {
                            class577 var8 = new class577();
                            var8.field8133 = this.field8391;
                            var6 = false;
                            this.field8393.method1727(var8, (byte) 109);
                        }
                        this.field8391++;
                    }
                }
                if (var6) {
                    this.field8390 = false;
                    this.field8391 = 0;
                }
            } else {
                this.field8393 = null;
            }
        }
        if (!this.field8396 || class459.method2731(97) < this.field8395) {
            return;
        }
        for (class84 var10 = (class84) this.field8378.method2243((byte) 100); var10 != null; var10 = (class84) this.field8378.method2248(-15690)) {
            if (!var10.field930) {
                if (var10.field929) {
                    if (!var10.field928) {
                        throw new RuntimeException();
                    }
                    var10.method3387((byte) -77);
                } else {
                    var10.field929 = true;
                }
            }
        }
        this.field8395 = class459.method2731(123) + 1000L;
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(II)I")
    public final int method3178(int arg0, int arg1) {
        if (arg1 == -2545) {
            field8376++;
            class84 var3 = (class84) this.field8378.method2242((long) arg0, -1);
            return var3 == null ? 0 : var3.method641((byte) -14);
        } else {
            return 24;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(Lmea;I)Lmea;")
    public static final class451 method3481(class451 arg0, int arg1) {
        field8371++;
        if (arg0.field6233 != -1) {
            return class166.method1238((byte) -125, arg0.field6233);
        }
        int var2 = arg0.field6222 >>> 16;
        class548 var3 = new class548(class11.field217);
        class744 var4 = (class744) var3.method3274(true);
        if (arg1 != 1887758448) {
            method3481(null, -29);
        }
        while (var4 != null) {
            if (var4.field10314 == var2) {
                return class166.method1238((byte) -55, (int) var4.field8133);
            }
            var4 = (class744) var3.method3276(true);
        }
        return null;
    }

    @OriginalMember(owner = "client!im", name = "f", descriptor = "(I)I")
    public final int method3482(int arg0) {
        field8386++;
        if (this.field8384 == null) {
            return 0;
        } else if (arg0 == -2) {
            return this.field8384.field8083;
        } else {
            return 103;
        }
    }

    @OriginalMember(owner = "client!im", name = "a", descriptor = "(IZ)[B")
    public final byte[] method3181(int arg0, boolean arg1) {
        field8381++;
        if (arg1) {
            this.method3181(13, true);
        }
        class84 var3 = this.method3477(arg0, 0, 108);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method638((byte) 55);
            var3.method3387((byte) -70);
            return var4;
        }
    }

    @OriginalMember(owner = "client!im", name = "d", descriptor = "(B)I")
    public final int method3483(byte arg0) {
        field8362++;
        if (this.field8384 == null) {
            return 0;
        } else if (this.field8392) {
            if (arg0 != -34) {
                this.field8392 = false;
            }
            class577 var2 = this.field8393.method1731((byte) -109);
            return var2 == null ? 0 : (int) var2.field8133;
        } else {
            return this.field8384.field8083;
        }
    }

    @OriginalMember(owner = "client!im", name = "<init>", descriptor = "(ILuaa;Luaa;Lgu;Lrf;I[BIZ)V")
    public class596(int arg0, class126 arg1, class126 arg2, class605 arg3, class90 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field8367 = arg0;
        this.field8387 = arg1;
        if (this.field8387 == null) {
            this.field8392 = false;
        } else {
            this.field8392 = true;
            this.field8393 = new class266();
        }
        this.field8396 = arg8;
        this.field8377 = arg6;
        this.field8372 = arg5;
        this.field8368 = arg7;
        this.field8388 = arg3;
        this.field8366 = arg2;
        this.field8385 = arg4;
        if (this.field8366 != null) {
            this.field8389 = this.field8385.method673(this.field8366, -3, this.field8367);
        }
    }
}
