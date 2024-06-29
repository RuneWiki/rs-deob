import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class487 extends class238 {

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    private int field7127 = 0;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Lsba;")
    private class200 field7131 = new class200(16);

    @OriginalMember(owner = "client!lh", name = "M", descriptor = "I")
    private int field7150 = 0;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "Lor;")
    private class594 field7146 = new class594();

    @OriginalMember(owner = "client!lh", name = "O", descriptor = "J")
    private long field7152 = 0L;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    private int field7126;

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "Lmu;")
    private class275 field7118;

    @OriginalMember(owner = "client!lh", name = "L", descriptor = "Z")
    private boolean field7149;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "Lor;")
    private class594 field7147;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "I")
    private int field7139;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "[B")
    private byte[] field7145;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "Lrs;")
    private class605 field7142;

    @OriginalMember(owner = "client!lh", name = "j", descriptor = "Lmu;")
    private class275 field7121;

    @OriginalMember(owner = "client!lh", name = "C", descriptor = "Lgq;")
    private class476 field7140;

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "I")
    private int field7119;

    @OriginalMember(owner = "client!lh", name = "N", descriptor = "Z")
    private boolean field7151;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "Ldm;")
    private class48 field7133;

    @OriginalMember(owner = "client!lh", name = "i", descriptor = "I")
    public static int field7120;

    @OriginalMember(owner = "client!lh", name = "k", descriptor = "I")
    public static int field7122;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "I")
    public static int field7125;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field7128;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "I")
    public static int field7130;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field7132;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field7134;

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "I")
    public static int field7135;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public static int field7136;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public static int field7137;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field7138;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "Lit;")
    private class599 field7124;

    @OriginalMember(owner = "client!lh", name = "K", descriptor = "Z")
    private boolean field7148;

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "[B")
    private byte[] field7123;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "[Lf;")
    public static class702[] field7143;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(ZI)V", line = 6)
    public final void method1711(boolean arg0, int arg1) {
        field7134++;
        if (this.field7118 == null || !arg0) {
            return;
        }
        for (class66 var3 = this.field7146.method3465((byte) 115); var3 != null; var3 = this.field7146.method3469(0)) {
            if (((long) arg1) == var3.field844) {
                return;
            }
        }
        class66 var4 = new class66();
        var4.field844 = arg1;
        this.field7146.method3463((byte) -87, var4);
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V", line = 36)
    public final void method2983(int arg0) {
        field7130++;
        if (this.field7118 != null && arg0 == 0) {
            this.field7148 = true;
            if (this.field7147 == null) {
                this.field7147 = new class594();
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V", line = 53)
    public static final void method2984(byte arg0) {
        if (arg0 != 17) {
            method2987(-118);
        }
        class7.field116 = null;
        class259.field4146 = null;
        class452.field6794 = null;
        class207.field3461 = null;
        class87.field1068 = null;
        field7128++;
        class281.field4497 = null;
        class114.field1790 = null;
        class518.field7508 = null;
        class267.field4350 = null;
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(B)V", line = 74)
    public final void method2985(byte arg0) {
        if (arg0 < 2) {
            this.field7151 = true;
        }
        field7129++;
        if (this.field7147 == null || this.method1713(62) == null) {
            return;
        }
        for (class66 var2 = this.field7146.method3465((byte) -49); var2 != null; var2 = this.field7146.method3469(0)) {
            int var3 = (int) var2.field844;
            if (var3 < 0 || var3 >= this.field7124.field8529 || this.field7124.field8522[var3] == 0) {
                var2.method707((byte) -42);
            } else {
                if (this.field7123[var3] == 0) {
                    this.method2991(1, var3, 0);
                }
                if (this.field7123[var3] == -1) {
                    this.method2991(2, var3, 0);
                }
                if (this.field7123[var3] == 1) {
                    var2.method707((byte) -86);
                }
            }
        }
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(B)I", line = 126)
    public final int method2986(byte arg0) {
        if (arg0 != 77) {
            this.field7150 = -80;
        }
        field7136++;
        if (this.field7124 == null) {
            return 0;
        } else if (this.field7149) {
            class66 var2 = this.field7147.method3465((byte) 120);
            return var2 == null ? 0 : (int) var2.field844;
        } else {
            return this.field7124.field8538;
        }
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V", line = 154)
    public static void method2987(int arg0) {
        field7143 = null;
        if (arg0 != -2730) {
            method2987(-123);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(ZI)[B", line = 172)
    public final byte[] method1717(boolean arg0, int arg1) {
        field7138++;
        class48 var3 = this.method2991(0, arg1, 0);
        if (!arg0) {
            this.method1713(-123);
        }
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method552(false);
            var3.method707((byte) -96);
            return var4;
        }
    }

    @OriginalMember(owner = "client!lh", name = "e", descriptor = "(I)V", line = 194)
    public final void method2988(int arg0) {
        field7135++;
        if (this.field7147 != null) {
            if (this.method1713(118) == null) {
                return;
            }
            if (this.field7149) {
                boolean var2 = true;
                for (class66 var3 = this.field7147.method3465((byte) -73); var3 != null; var3 = this.field7147.method3469(0)) {
                    int var5 = (int) var3.field844;
                    if (this.field7123[var5] == 0) {
                        this.method2991(1, var5, 0);
                    }
                    if (this.field7123[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method707((byte) -11);
                    }
                }
                while (this.field7124.field8522.length > this.field7150) {
                    if (this.field7124.field8522[this.field7150] == 0) {
                        this.field7150++;
                    } else {
                        if (this.field7142.field8591 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field7123[this.field7150] == 0) {
                            this.method2991(1, this.field7150, 0);
                        }
                        if (this.field7123[this.field7150] == 0) {
                            class66 var4 = new class66();
                            var4.field844 = this.field7150;
                            this.field7147.method3463((byte) -87, var4);
                            var2 = false;
                        }
                        this.field7150++;
                    }
                }
                if (var2) {
                    this.field7150 = 0;
                    this.field7149 = false;
                }
            } else if (this.field7148) {
                boolean var6 = true;
                for (class66 var7 = this.field7147.method3465((byte) -64); var7 != null; var7 = this.field7147.method3469(0)) {
                    int var9 = (int) var7.field844;
                    if (this.field7123[var9] != 1) {
                        this.method2991(2, var9, 0);
                    }
                    if (this.field7123[var9] == 1) {
                        var7.method707((byte) -112);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field7150 < this.field7124.field8522.length) {
                    if (this.field7124.field8522[this.field7150] == 0) {
                        this.field7150++;
                    } else {
                        if (this.field7140.method2949((byte) -105)) {
                            var6 = false;
                            break;
                        }
                        if (this.field7123[this.field7150] != 1) {
                            this.method2991(2, this.field7150, 0);
                        }
                        if (this.field7123[this.field7150] != 1) {
                            class66 var8 = new class66();
                            var8.field844 = this.field7150;
                            var6 = false;
                            this.field7147.method3463((byte) -87, var8);
                        }
                        this.field7150++;
                    }
                }
                if (var6) {
                    this.field7150 = 0;
                    this.field7148 = false;
                }
            } else {
                this.field7147 = null;
            }
        }
        if (arg0 >= -102) {
            this.field7139 = 76;
        }
        if (!this.field7151 || this.field7152 > class112.method1033(-11752)) {
            return;
        }
        for (class48 var10 = (class48) this.field7131.method1556(65); var10 != null; var10 = (class48) this.field7131.method1559(92)) {
            if (!var10.field644) {
                if (var10.field643) {
                    if (!var10.field648) {
                        throw new RuntimeException();
                    }
                    var10.method707((byte) -93);
                } else {
                    var10.field643 = true;
                }
            }
        }
        this.field7152 = class112.method1033(-11752) + 1000L;
    }

    @OriginalMember(owner = "client!lh", name = "f", descriptor = "(I)I", line = 373)
    public final int method2989(int arg0) {
        field7137++;
        int var2 = 119 % ((3 - arg0) / 50);
        return this.field7127;
    }

    @OriginalMember(owner = "client!lh", name = "g", descriptor = "(I)I", line = 385)
    public final int method2990(int arg0) {
        if (arg0 != 100) {
            this.method1711(true, -92);
        }
        field7144++;
        if (this.method1713(103) == null) {
            return this.field7133 == null ? 0 : this.field7133.method553(100);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(III)Ldm;", line = 406)
    private final class48 method2991(int arg0, int arg1, int arg2) {
        field7125++;
        class48 var4 = (class48) this.field7131.method1558((long) arg1, (byte) -93);
        if (var4 != null && arg0 == 0 && !var4.field648 && var4.field644) {
            var4.method707((byte) -113);
            var4 = null;
        }
        if (arg2 != 0) {
            this.field7124 = null;
        }
        if (var4 == null) {
            if (arg0 == 0) {
                if (this.field7118 == null || this.field7123[arg1] == -1) {
                    if (this.field7140.method2951(arg2 - 6508)) {
                        return null;
                    }
                    var4 = this.field7140.method2957((byte) 83, this.field7126, true, (byte) 2, arg1);
                } else {
                    var4 = this.field7142.method3518(this.field7118, arg1, true);
                }
            } else if (arg0 == 1) {
                if (this.field7118 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field7142.method3517(arg1, this.field7118, arg2 - 81);
            } else if (arg0 == 2) {
                if (this.field7118 == null) {
                    throw new RuntimeException();
                }
                if (this.field7123[arg1] != -1) {
                    throw new RuntimeException();
                }
                if (this.field7140.method2949((byte) 118)) {
                    return null;
                }
                var4 = this.field7140.method2957((byte) -96, this.field7126, false, (byte) 2, arg1);
            } else {
                throw new RuntimeException();
            }
            this.field7131.method1564((long) arg1, var4, (byte) 85);
        }
        if (var4.field644) {
            return null;
        }
        byte[] var5 = var4.method552(false);
        if (!(var4 instanceof class261)) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class533.field7761.reset();
                class533.field7761.update(var5, 0, var5.length - 2);
                int var6 = (int) class533.field7761.getValue();
                if (this.field7124.field8525[arg1] != var6) {
                    throw new RuntimeException();
                }
                if (this.field7124.field8535 != null && this.field7124.field8535[arg1] != null) {
                    byte[] var7 = this.field7124.field8535[arg1];
                    byte[] var8 = class275.method1931(var5, var5.length - 2, 0, 29654);
                    for (int var9 = 0; var9 < 64; var9++) {
                        if (var7[var9] != var8[var9]) {
                            throw new RuntimeException();
                        }
                    }
                }
                this.field7140.field7066 = 0;
                this.field7140.field7068 = 0;
            } catch (RuntimeException var17) {
                this.field7140.method2952((byte) -126);
                var4.method707((byte) -104);
                if (var4.field648 && !this.field7140.method2951(arg2 ^ 0xFFFFE694)) {
                    class381 var10 = this.field7140.method2957((byte) 77, this.field7126, true, (byte) 2, arg1);
                    this.field7131.method1564((long) arg1, var10, (byte) 85);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field7124.field8539[arg1] >>> 8);
            var5[var5.length - 1] = (byte) this.field7124.field8539[arg1];
            if (this.field7118 != null) {
                this.field7142.method3521(var5, -31139, arg1, this.field7118);
                if (this.field7123[arg1] != 1) {
                    this.field7127++;
                    this.field7123[arg1] = 1;
                }
            }
            if (!var4.field648) {
                var4.method707((byte) -30);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class533.field7761.reset();
            class533.field7761.update(var5, 0, var5.length - 2);
            int var11 = (int) class533.field7761.getValue();
            if (this.field7124.field8525[arg1] != var11) {
                throw new RuntimeException();
            }
            if (this.field7124.field8535 != null && this.field7124.field8535[arg1] != null) {
                byte[] var12 = this.field7124.field8535[arg1];
                byte[] var13 = class275.method1931(var5, var5.length - 2, 0, 29654);
                for (int var14 = 0; var14 < 64; var14++) {
                    if (var12[var14] != var13[var14]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var15 = ((var5[var5.length - 2] & 0xFF) << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field7124.field8539[arg1] & 0xFFFF) != var15) {
                throw new RuntimeException();
            }
            if (this.field7123[arg1] != 1) {
                this.field7127++;
                this.field7123[arg1] = 1;
            }
            if (!var4.field648) {
                var4.method707((byte) -53);
            }
            return var4;
        } catch (Exception var18) {
            this.field7123[arg1] = -1;
            var4.method707((byte) -58);
            if (var4.field648 && !this.field7140.method2951(-6508)) {
                class381 var16 = this.field7140.method2957((byte) -93, this.field7126, true, (byte) 2, arg1);
                this.field7131.method1564((long) arg1, var16, (byte) 112);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IBI)B", line = 670)
    public static final byte method2992(int arg0, byte arg1, int arg2) {
        if (arg1 != -66) {
            return -19;
        }
        field7122++;
        if (arg0 == 9) {
            return (byte) ((arg2 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!lh", name = "h", descriptor = "(I)I", line = 694)
    public final int method2993(int arg0) {
        field7132++;
        if (this.field7124 == null) {
            return 0;
        } else if (arg0 < 11) {
            return -88;
        } else {
            return this.field7124.field8538;
        }
    }

    @OriginalMember(owner = "client!lh", name = "<init>", descriptor = "(ILmu;Lmu;Lgq;Lrs;I[BIZ)V", line = 844)
    public class487(int arg0, class275 arg1, class275 arg2, class476 arg3, class605 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field7126 = arg0;
        this.field7118 = arg1;
        if (this.field7118 == null) {
            this.field7149 = false;
        } else {
            this.field7149 = true;
            this.field7147 = new class594();
        }
        this.field7139 = arg7;
        this.field7145 = arg6;
        this.field7142 = arg4;
        this.field7121 = arg2;
        this.field7140 = arg3;
        this.field7119 = arg5;
        this.field7151 = arg8;
        if (this.field7121 != null) {
            this.field7133 = this.field7142.method3518(this.field7121, this.field7126, true);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(II)I", line = 711)
    public final int method1710(int arg0, int arg1) {
        field7141++;
        class48 var3 = (class48) this.field7131.method1558((long) arg0, (byte) -93);
        if (var3 == null) {
            if (arg1 < 39) {
                this.field7151 = false;
            }
            return 0;
        } else {
            return var3.method553(100);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(I)Lit;", line = 733)
    public final class599 method1713(int arg0) {
        field7120++;
        if (this.field7124 != null) {
            return this.field7124;
        }
        if (this.field7133 == null) {
            if (this.field7140.method2951(-6508)) {
                return null;
            }
            this.field7133 = this.field7140.method2957((byte) 32, 255, true, (byte) 0, this.field7126);
        }
        if (this.field7133.field644) {
            return null;
        }
        byte[] var2 = this.field7133.method552(false);
        if (this.field7133 instanceof class261) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field7124 = new class599(var2, this.field7119, this.field7145);
                if (this.field7124.field8533 != this.field7139) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field7124 = null;
                if (this.field7140.method2951(-6508)) {
                    this.field7133 = null;
                } else {
                    this.field7133 = this.field7140.method2957((byte) 86, 255, true, (byte) 0, this.field7126);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field7124 = new class599(var2, this.field7119, this.field7145);
            } catch (RuntimeException var4) {
                this.field7140.method2952((byte) -102);
                this.field7124 = null;
                if (this.field7140.method2951(-6508)) {
                    this.field7133 = null;
                } else {
                    this.field7133 = this.field7140.method2957((byte) 67, 255, true, (byte) 0, this.field7126);
                }
                return null;
            }
            if (this.field7121 != null) {
                this.field7142.method3521(var2, -31139, this.field7126, this.field7121);
            }
        }
        if (arg0 <= 3) {
            this.field7133 = null;
        }
        this.field7133 = null;
        if (this.field7118 != null) {
            this.field7123 = new byte[this.field7124.field8529];
            this.field7127 = 0;
        }
        return this.field7124;
    }
}
