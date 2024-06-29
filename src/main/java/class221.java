import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!k")
public class class221 extends class127 {

    @OriginalMember(owner = "client!k", name = "q", descriptor = "I")
    private int field3537 = 0;

    @OriginalMember(owner = "client!k", name = "I", descriptor = "Lsb;")
    private class110 field3555 = new class110(16);

    @OriginalMember(owner = "client!k", name = "S", descriptor = "I")
    private int field3564 = 0;

    @OriginalMember(owner = "client!k", name = "R", descriptor = "Lab;")
    private class269 field3563 = new class269();

    @OriginalMember(owner = "client!k", name = "W", descriptor = "J")
    private long field3568 = 0L;

    @OriginalMember(owner = "client!k", name = "n", descriptor = "I")
    private int field3534;

    @OriginalMember(owner = "client!k", name = "v", descriptor = "Ls;")
    private class107 field3542;

    @OriginalMember(owner = "client!k", name = "U", descriptor = "Z")
    private boolean field3566;

    @OriginalMember(owner = "client!k", name = "Q", descriptor = "Lab;")
    private class269 field3562;

    @OriginalMember(owner = "client!k", name = "u", descriptor = "I")
    private int field3541;

    @OriginalMember(owner = "client!k", name = "L", descriptor = "Lae;")
    private class92 field3558;

    @OriginalMember(owner = "client!k", name = "w", descriptor = "I")
    private int field3543;

    @OriginalMember(owner = "client!k", name = "V", descriptor = "Z")
    private boolean field3567;

    @OriginalMember(owner = "client!k", name = "A", descriptor = "Ls;")
    private class107 field3547;

    @OriginalMember(owner = "client!k", name = "G", descriptor = "Lsj;")
    private class177 field3553;

    @OriginalMember(owner = "client!k", name = "D", descriptor = "Lhj;")
    private class224 field3550;

    @OriginalMember(owner = "client!k", name = "y", descriptor = "Ljava/lang/String;")
    public static String field3545 = "Loading defaults - ";

    @OriginalMember(owner = "client!k", name = "B", descriptor = "[I")
    public static int[] field3548 = new int[1000];

    @OriginalMember(owner = "client!k", name = "H", descriptor = "Lab;")
    public static class269 field3554 = new class269();

    @OriginalMember(owner = "client!k", name = "P", descriptor = "I")
    public static int field3561 = 0;

    @OriginalMember(owner = "client!k", name = "O", descriptor = "Lte;")
    public static class244 field3560 = new class244(50);

    @OriginalMember(owner = "client!k", name = "k", descriptor = "I")
    public static int field3531;

    @OriginalMember(owner = "client!k", name = "l", descriptor = "I")
    public static int field3532;

    @OriginalMember(owner = "client!k", name = "m", descriptor = "I")
    public static int field3533;

    @OriginalMember(owner = "client!k", name = "o", descriptor = "I")
    public static int field3535;

    @OriginalMember(owner = "client!k", name = "p", descriptor = "I")
    public static int field3536;

    @OriginalMember(owner = "client!k", name = "r", descriptor = "I")
    public static int field3538;

    @OriginalMember(owner = "client!k", name = "t", descriptor = "I")
    public static int field3540;

    @OriginalMember(owner = "client!k", name = "x", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!k", name = "C", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!k", name = "F", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!k", name = "J", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!k", name = "K", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!k", name = "M", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!k", name = "z", descriptor = "Lhh;")
    private class44 field3546;

    @OriginalMember(owner = "client!k", name = "E", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field3551;

    @OriginalMember(owner = "client!k", name = "T", descriptor = "Z")
    private boolean field3565;

    @OriginalMember(owner = "client!k", name = "s", descriptor = "[B")
    private byte[] field3539;

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(BI)V")
    public final void method864(byte arg0, int arg1) {
        if (arg0 <= 1) {
            this.method1566((byte) 55);
        }
        field3552++;
        if (this.field3542 == null) {
            return;
        }
        for (class237 var3 = this.field3563.method1802(43); var3 != null; var3 = this.field3563.method1815(0)) {
            if ((long) arg1 == var3.field3923) {
                return;
            }
        }
        class237 var4 = new class237();
        var4.field3923 = (long) arg1;
        this.field3563.method1803(var4, -1);
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(II)[B")
    public final byte[] method860(int arg0, int arg1) {
        class224 var3 = this.method1563(117, arg0, arg1);
        field3532++;
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method917(100);
            var3.method1673(14510);
            return var4;
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(I)I")
    public final int method1557(int arg0) {
        field3536++;
        if (arg0 != 100) {
            field3560 = null;
        }
        if (this.method869((byte) 47) == null) {
            return this.field3550 == null ? 0 : this.field3550.method916((byte) -128);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!k", name = "c", descriptor = "(B)V")
    public final void method1558(byte arg0) {
        field3544++;
        if (this.field3542 == null) {
            return;
        }
        this.field3565 = true;
        if (this.field3562 == null) {
            this.field3562 = new class269();
        }
        if (arg0 > -4) {
            this.field3564 = -31;
        }
    }

    @OriginalMember(owner = "client!k", name = "d", descriptor = "(B)V")
    public final void method1559(byte arg0) {
        field3533++;
        if (arg0 != 0) {
            this.field3568 = -108L;
        }
        if (this.field3562 != null) {
            if (this.method869((byte) 47) == null) {
                return;
            }
            if (this.field3566) {
                boolean var2 = true;
                for (class237 var3 = this.field3562.method1802(43); var3 != null; var3 = this.field3562.method1815(0)) {
                    int var5 = (int) var3.field3923;
                    if (this.field3539[var5] == 0) {
                        this.method1563(93, var5, 1);
                    }
                    if (this.field3539[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method1673(arg0 ^ 0x38AE);
                    }
                }
                while (this.field3546.field572.length > this.field3564) {
                    if (this.field3546.field572[this.field3564] == 0) {
                        this.field3564++;
                    } else {
                        if (this.field3553.field2814 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field3539[this.field3564] == 0) {
                            this.method1563(arg0 + 126, this.field3564, 1);
                        }
                        if (this.field3539[this.field3564] == 0) {
                            var2 = false;
                            class237 var4 = new class237();
                            var4.field3923 = (long) this.field3564;
                            this.field3562.method1803(var4, -1);
                        }
                        this.field3564++;
                    }
                }
                if (var2) {
                    this.field3564 = 0;
                    this.field3566 = false;
                }
            } else if (this.field3565) {
                boolean var6 = true;
                for (class237 var7 = this.field3562.method1802(43); var7 != null; var7 = this.field3562.method1815(0)) {
                    int var9 = (int) var7.field3923;
                    if (this.field3539[var9] != 1) {
                        this.method1563(113, var9, 2);
                    }
                    if (this.field3539[var9] == 1) {
                        var7.method1673(14510);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field3564 < this.field3546.field572.length) {
                    if (this.field3546.field572[this.field3564] == 0) {
                        this.field3564++;
                    } else {
                        if (this.field3558.method510((byte) -99)) {
                            var6 = false;
                            break;
                        }
                        if (this.field3539[this.field3564] != 1) {
                            this.method1563(arg0 ^ 0x69, this.field3564, 2);
                        }
                        if (this.field3539[this.field3564] != 1) {
                            var6 = false;
                            class237 var8 = new class237();
                            var8.field3923 = (long) this.field3564;
                            this.field3562.method1803(var8, -1);
                        }
                        this.field3564++;
                    }
                }
                if (var6) {
                    this.field3564 = 0;
                    this.field3565 = false;
                }
            } else {
                this.field3562 = null;
            }
        }
        if (!this.field3567 || class249.method1723((byte) 93) < this.field3568) {
            return;
        }
        for (class224 var10 = (class224) this.field3555.method710((byte) -109); var10 != null; var10 = (class224) this.field3555.method709(false)) {
            if (!var10.field3610) {
                if (var10.field3603) {
                    if (!var10.field3604) {
                        throw new RuntimeException();
                    }
                    var10.method1673(14510);
                } else {
                    var10.field3603 = true;
                }
            }
        }
        this.field3568 = class249.method1723((byte) 49) + 1000L;
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(B)I")
    public final int method1560(byte arg0) {
        if (arg0 >= -79) {
            field3551 = null;
        }
        field3559++;
        return this.field3537;
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(II)I")
    public final int method866(int arg0, int arg1) {
        if (arg1 == 0) {
            class224 var3 = (class224) this.field3555.method708((long) arg0, arg1 + 127);
            field3531++;
            return var3 == null ? 0 : var3.method916((byte) -128);
        } else {
            return -95;
        }
    }

    @OriginalMember(owner = "client!k", name = "e", descriptor = "(I)V")
    public static void method1561(int arg0) {
        field3551 = null;
        field3554 = null;
        int var1 = -95 / ((-arg0 - 55) / 45);
        field3548 = null;
        field3545 = null;
        field3560 = null;
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(IIILq;BZ)V")
    public static final void method1562(int arg0, int arg1, int arg2, class165 arg3, byte arg4, boolean arg5) {
        field3535++;
        if (class288.field4599 >= 50 || arg3 == null || arg3.field2638 == null || arg0 >= arg3.field2638.length || arg3.field2638[arg0] == null) {
            return;
        }
        int var6 = arg3.field2638[arg0][0];
        int var7 = var6 >> 8;
        int var8 = var6 >> 5 & 0x7;
        int var9 = var6 & 0x1F;
        if (arg3.field2638[arg0].length > 1) {
            int var10 = (int) (Math.random() * (double) arg3.field2638[arg0].length);
            if (var10 > 0) {
                var7 = arg3.field2638[arg0][var10];
            }
        }
        if (var9 != 0) {
            if (arg4 != 47) {
                method1562(-96, 55, 123, (class165) null, (byte) 30, true);
            }
            if (class63.field818 != 0) {
                int var11 = (arg2 - 64) / 128;
                int var12 = (arg1 - 64) / 128;
                class4.field63[class288.field4599] = var7;
                class275.field4399[class288.field4599] = var8;
                class77.field971[class288.field4599] = 0;
                class220.field3526[class288.field4599] = null;
                class68.field858[class288.field4599] = 255;
                class206.field3282[class288.field4599] = (var11 << 16) + (var12 << 8) + var9;
                class288.field4599++;
            }
        } else if (arg5) {
            class130.method885(var7, 0, 255, 0, var8);
        }
    }

    @OriginalMember(owner = "client!k", name = "a", descriptor = "(III)Lhj;")
    private final class224 method1563(int arg0, int arg1, int arg2) {
        field3540++;
        class224 var4 = (class224) this.field3555.method708((long) arg1, 127);
        if (arg0 < 4) {
            this.method864((byte) -66, 80);
        }
        if (var4 != null && arg2 == 0 && !var4.field3604 && var4.field3610) {
            var4.method1673(14510);
            var4 = null;
        }
        if (var4 == null) {
            if (arg2 == 0) {
                if (this.field3542 == null || this.field3539[arg1] == -1) {
                    if (this.field3558.method503(3)) {
                        return null;
                    }
                    var4 = this.field3558.method501(true, (byte) 2, (byte) 41, this.field3534, arg1);
                } else {
                    var4 = this.field3553.method1224(-97, this.field3542, arg1);
                }
            } else if (arg2 == 1) {
                if (this.field3542 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field3553.method1229(arg1, -16765, this.field3542);
            } else if (arg2 == 2) {
                if (this.field3542 == null) {
                    throw new RuntimeException();
                }
                if (this.field3539[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field3558.method510((byte) -99)) {
                    return null;
                }
                var4 = this.field3558.method501(false, (byte) 2, (byte) 41, this.field3534, arg1);
            } else {
                throw new RuntimeException();
            }
            this.field3555.method707((long) arg1, var4, (byte) 120);
        }
        if (var4.field3610) {
            return null;
        }
        byte[] var5 = var4.method917(100);
        if (!var4 instanceof class173) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class187.field2992.reset();
                class187.field2992.update(var5, 0, var5.length - 2);
                int var9 = (int) class187.field2992.getValue();
                if (this.field3546.field565[arg1] != var9) {
                    throw new RuntimeException();
                }
                this.field3558.field1170 = 0;
                this.field3558.field1173 = 0;
            } catch (RuntimeException var12) {
                this.field3558.method507(1);
                var4.method1673(14510);
                if (var4.field3604 && !this.field3558.method503(3)) {
                    class136 var10 = this.field3558.method501(true, (byte) 2, (byte) 41, this.field3534, arg1);
                    this.field3555.method707((long) arg1, var10, (byte) 120);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field3546.field561[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field3546.field561[arg1];
            if (this.field3542 != null) {
                this.field3553.method1231(arg1, this.field3542, (byte) 104, var5);
                if (this.field3539[arg1] != 1) {
                    this.field3537++;
                    this.field3539[arg1] = 1;
                }
            }
            if (!var4.field3604) {
                var4.method1673(14510);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class187.field2992.reset();
            class187.field2992.update(var5, 0, var5.length - 2);
            int var6 = (int) class187.field2992.getValue();
            if (this.field3546.field565[arg1] != var6) {
                throw new RuntimeException();
            }
            int var7 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field3546.field561[arg1] & 0xFFFF) != var7) {
                throw new RuntimeException();
            }
            if (this.field3539[arg1] != 1) {
                this.field3537++;
                this.field3539[arg1] = 1;
            }
            if (!var4.field3604) {
                var4.method1673(14510);
            }
            return var4;
        } catch (Exception var11) {
            this.field3539[arg1] = -1;
            var4.method1673(14510);
            if (var4.field3604 && !this.field3558.method503(3)) {
                class136 var8 = this.field3558.method501(true, (byte) 2, (byte) 41, this.field3534, arg1);
                this.field3555.method707((long) arg1, var8, (byte) 120);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!k", name = "b", descriptor = "(B)Lhh;")
    public final class44 method869(byte arg0) {
        field3556++;
        if (this.field3546 != null) {
            return this.field3546;
        }
        if (this.field3550 == null) {
            if (this.field3558.method503(3)) {
                return null;
            }
            this.field3550 = this.field3558.method501(true, (byte) 0, (byte) 41, 255, this.field3534);
        }
        if (this.field3550.field3610) {
            return null;
        }
        byte[] var2 = this.field3550.method917(100);
        if (arg0 != 47) {
            field3545 = null;
        }
        if (this.field3550 instanceof class173) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3546 = new class44(var2, this.field3543);
                if (this.field3546.field547 != this.field3541) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field3546 = null;
                if (this.field3558.method503(3)) {
                    this.field3550 = null;
                } else {
                    this.field3550 = this.field3558.method501(true, (byte) 0, (byte) 41, 255, this.field3534);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field3546 = new class44(var2, this.field3543);
            } catch (RuntimeException var4) {
                this.field3558.method507(1);
                this.field3546 = null;
                if (this.field3558.method503(arg0 ^ 0x2C)) {
                    this.field3550 = null;
                } else {
                    this.field3550 = this.field3558.method501(true, (byte) 0, (byte) 41, 255, this.field3534);
                }
                return null;
            }
            if (this.field3547 != null) {
                this.field3553.method1231(this.field3534, this.field3547, (byte) 104, var2);
            }
        }
        if (this.field3542 != null) {
            this.field3539 = new byte[this.field3546.field549];
            this.field3537 = 0;
        }
        this.field3550 = null;
        return this.field3546;
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(B)V")
    public final void method1564(byte arg0) {
        field3549++;
        if (this.field3562 == null || this.method869((byte) 47) == null) {
            return;
        }
        if (arg0 != 50) {
            this.field3550 = null;
        }
        for (class237 var2 = this.field3563.method1802(43); var2 != null; var2 = this.field3563.method1815(arg0 ^ 0x32)) {
            int var3 = (int) var2.field3923;
            if (var3 < 0 || this.field3546.field549 <= var3 || this.field3546.field572[var3] == 0) {
                var2.method1673(14510);
            } else {
                if (this.field3539[var3] == 0) {
                    this.method1563(28, var3, 1);
                }
                if (this.field3539[var3] == -1) {
                    this.method1563(arg0 ^ 0x25, var3, 2);
                }
                if (this.field3539[var3] == 1) {
                    var2.method1673(arg0 + 14460);
                }
            }
        }
    }

    @OriginalMember(owner = "client!k", name = "f", descriptor = "(I)I")
    public final int method1565(int arg0) {
        field3557++;
        if (arg0 != -3850) {
            this.method864((byte) 36, 53);
        }
        return this.field3546 == null ? 0 : this.field3546.field558;
    }

    @OriginalMember(owner = "client!k", name = "g", descriptor = "(B)I")
    public final int method1566(byte arg0) {
        field3538++;
        if (this.field3546 == null) {
            return 0;
        }
        int var2 = -52 / ((arg0 + 11) / 34);
        if (this.field3566) {
            class237 var3 = this.field3562.method1802(43);
            return var3 == null ? 0 : (int) var3.field3923;
        } else {
            return this.field3546.field558;
        }
    }

    @OriginalMember(owner = "client!k", name = "<init>", descriptor = "(ILs;Ls;Lae;Lsj;IIZ)V")
    public class221(int arg0, class107 arg1, class107 arg2, class92 arg3, class177 arg4, int arg5, int arg6, boolean arg7) {
        this.field3534 = arg0;
        this.field3542 = arg1;
        if (this.field3542 == null) {
            this.field3566 = false;
        } else {
            this.field3566 = true;
            this.field3562 = new class269();
        }
        this.field3541 = arg6;
        this.field3558 = arg3;
        this.field3543 = arg5;
        this.field3567 = arg7;
        this.field3547 = arg2;
        this.field3553 = arg4;
        if (this.field3547 != null) {
            this.field3550 = this.field3553.method1224(-112, this.field3547, this.field3534);
        }
    }
}
