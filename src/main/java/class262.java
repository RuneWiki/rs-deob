import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!op")
public class class262 {

    @OriginalMember(owner = "client!op", name = "u", descriptor = "I")
    private int field4004 = -1;

    @OriginalMember(owner = "client!op", name = "i", descriptor = "I")
    private int field3992 = -32768;

    @OriginalMember(owner = "client!op", name = "p", descriptor = "Z")
    private boolean field3999 = false;

    @OriginalMember(owner = "client!op", name = "q", descriptor = "I")
    private int field4000 = -1;

    @OriginalMember(owner = "client!op", name = "g", descriptor = "Z")
    private boolean field3990 = false;

    @OriginalMember(owner = "client!op", name = "b", descriptor = "I")
    public int field3985;

    @OriginalMember(owner = "client!op", name = "o", descriptor = "I")
    public int field3998;

    @OriginalMember(owner = "client!op", name = "y", descriptor = "B")
    private byte field4008;

    @OriginalMember(owner = "client!op", name = "v", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!op", name = "x", descriptor = "I")
    private int field4007;

    @OriginalMember(owner = "client!op", name = "r", descriptor = "B")
    private byte field4001;

    @OriginalMember(owner = "client!op", name = "h", descriptor = "I")
    private int field3991;

    @OriginalMember(owner = "client!op", name = "F", descriptor = "Z")
    private boolean field4015;

    @OriginalMember(owner = "client!op", name = "c", descriptor = "Lwl;")
    public static class452 field3986 = new class452(82, -1);

    @OriginalMember(owner = "client!op", name = "C", descriptor = "I")
    public static int field4012 = 0;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "I")
    public static int field3984;

    @OriginalMember(owner = "client!op", name = "d", descriptor = "I")
    private int field3987;

    @OriginalMember(owner = "client!op", name = "e", descriptor = "I")
    public static int field3988;

    @OriginalMember(owner = "client!op", name = "j", descriptor = "I")
    public static int field3993;

    @OriginalMember(owner = "client!op", name = "k", descriptor = "I")
    public static int field3994;

    @OriginalMember(owner = "client!op", name = "m", descriptor = "I")
    private int field3996;

    @OriginalMember(owner = "client!op", name = "n", descriptor = "I")
    private int field3997;

    @OriginalMember(owner = "client!op", name = "s", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!op", name = "t", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!op", name = "w", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!op", name = "z", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!op", name = "B", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!op", name = "H", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!op", name = "I", descriptor = "I")
    private int field4018;

    @OriginalMember(owner = "client!op", name = "J", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!op", name = "G", descriptor = "Lwp;")
    private class292 field4016;

    @OriginalMember(owner = "client!op", name = "f", descriptor = "Lmk;")
    public class336 field3989;

    @OriginalMember(owner = "client!op", name = "l", descriptor = "Lgr;")
    private class379 field3995;

    @OriginalMember(owner = "client!op", name = "A", descriptor = "Lqn;")
    private class380 field4010;

    @OriginalMember(owner = "client!op", name = "D", descriptor = "[Lkr;")
    public static class234[] field4013;

    @OriginalMember(owner = "client!op", name = "E", descriptor = "[Z")
    private boolean[] field4014;

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIILwp;BILdr;Z)V")
    public final void method1623(int arg0, int arg1, int arg2, class292 arg3, byte arg4, int arg5, class261 arg6, boolean arg7) {
        field4017++;
        int var9 = 86 % ((arg4 - 50) / 44);
        class219[] var10 = arg3.method1302();
        class95[] var11 = arg3.method1271();
        if ((this.field3989 == null || this.field3989.field4991) && (var10 != null || var11 != null)) {
            class85 var12 = class411.method2575(0, this.field3998);
            if (var12.field1133 != null) {
                var12 = var12.method542(6796);
            }
            if (var12 != null) {
                this.field3989 = new class336(class26.field332);
            }
        }
        if (this.field3989 == null) {
            return;
        }
        if (arg7) {
            this.field3989.method2060(arg6, (long) class26.field332, var10, var11, false);
        } else {
            this.field3989.method2054((long) class26.field332);
        }
        this.field3989.method2049(this.field4008, arg0, arg1, arg2, arg5);
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IIII)I")
    public static final int method1624(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -12095) {
            field4012 = 106;
        }
        field4019++;
        int var4 = ((arg2 & 0xFF00FF) * arg3 & 0xFF00FF00 | (arg2 & 0xFF00) * arg3 & 0xFF0000) >>> 8;
        int var5 = 255 - arg3;
        return (((arg0 & 0xFF00) * var5 & 0xFF0000 | (arg0 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IB)V")
    public final void method1625(int arg0, byte arg1) {
        field4002++;
        int var3 = 15 / ((arg1 + 38) / 48);
        this.field3999 = true;
        this.method1632(-101, arg0);
    }

    @OriginalMember(owner = "client!op", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        if (this.field3989 != null) {
            this.field3989.method2051();
        }
        field4011++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(I)Z")
    public final boolean method1626(int arg0) {
        if (arg0 != -27318) {
            this.field3985 = -108;
        }
        field3984++;
        return this.field4015;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(III)V")
    private final void method1627(int arg0, int arg1, int arg2) {
        int var4 = -49 % ((arg1 - 74) / 52);
        field3988++;
        label88: while (true) {
            if (this.field3995 == null) {
                if (this.field3999) {
                    return;
                }
                this.method1632(-101, -1);
                if (this.field3995 == null) {
                    return;
                }
            }
            int var5 = class26.field332 - this.field3997;
            if (var5 > 100 && this.field3995.field5527 > 0) {
                int var6 = this.field3995.field5539.length - this.field3995.field5527;
                while (this.field3996 < var6 && this.field3995.field5540[this.field3996] < var5) {
                    var5 -= this.field3995.field5540[this.field3996];
                    this.field3996++;
                }
                if (var6 <= this.field3996) {
                    int var7 = 0;
                    for (int var8 = var6; var8 < this.field3995.field5539.length; var8++) {
                        var7 += this.field3995.field5540[var8];
                    }
                    var5 %= var7;
                }
                this.field3987 = this.field3996 + 1;
                if (this.field3987 >= this.field3995.field5539.length) {
                    this.field3987 -= this.field3995.field5527;
                    if (this.field3987 < 0 || this.field3995.field5539.length <= this.field3987) {
                        this.field3987 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field3995.field5540[this.field3996] >= var5) {
                            this.field3997 = class26.field332 - var5;
                            this.field4018 = var5;
                            return;
                        }
                        class251.method1528(false, this.field3996, arg0, arg2, this.field3995, this.field4008, (byte) -118);
                        var5 -= this.field3995.field5540[this.field3996];
                        this.field3996++;
                        if (this.field3995.field5539.length <= this.field3996) {
                            this.field3996 -= this.field3995.field5527;
                            if (this.field3996 < 0 || this.field3996 >= this.field3995.field5539.length) {
                                this.field3995 = null;
                                continue label88;
                            }
                        }
                        this.field3987 = this.field3996 + 1;
                    } while (this.field3987 < this.field3995.field5539.length);
                    this.field3987 -= this.field3995.field5527;
                } while (this.field3987 >= 0 && this.field3995.field5539.length > this.field3987);
                this.field3987 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Ldr;B)V")
    public final void method1628(class261 arg0, byte arg1) {
        this.method1630(this.field4007, true, true, arg0, 124, 131072, this.field3991);
        int var3 = 56 / ((15 - arg1) / 58);
        field4003++;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(Z)V")
    public static void method1629(boolean arg0) {
        field3986 = null;
        field4013 = null;
        if (!arg0) {
            field4013 = null;
        }
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(IZZLdr;III)Lwp;")
    public final class292 method1630(int arg0, boolean arg1, boolean arg2, class261 arg3, int arg4, int arg5, int arg6) {
        field3994++;
        class85 var8 = class411.method2575(0, this.field3998);
        if (var8.field1133 != null) {
            var8 = var8.method542(6796);
        }
        if (var8 == null) {
            this.method1633(true, arg3);
            this.field4004 = -1;
            this.field4000 = this.field3996;
            return null;
        }
        if (!this.field3999 && this.field4004 != var8.field1156) {
            this.field4016 = null;
            this.method1632(-101, -1);
        }
        this.method1627(arg0, 126, arg6);
        boolean var9 = arg2 & class97.field1334 != 0 & this.field4015;
        boolean var10 = var9 & (this.field4004 != var8.field1156 || (this.field4000 != this.field3996 || this.field3995 != null && (this.field3995.field5526 || class440.field6479) && this.field3996 != this.field3987) && class97.field1334 >= 2);
        if (arg1 && !var10) {
            this.field4000 = this.field3996;
            this.field4004 = var8.field1156;
            return null;
        }
        if (var10) {
            class85.method557(this.field4010, this.field4001, this.field3991, this.field4007, this.field4014);
        }
        class143 var11 = class307.field4638[this.field4001];
        class143 var12;
        if (this.field3990) {
            var12 = class85.field1201[0];
        } else {
            var12 = this.field4001 < 3 ? class307.field4638[this.field4001 + 1] : null;
        }
        class292 var13 = null;
        if (this.field3995 != null) {
            if (var10) {
                arg5 |= 0x20000;
            }
            var13 = var8.method548((byte) 3, this.field3991, this.field4007, arg3, var11.method100(this.field3991, this.field4007), var11, this.field4018, this.field3987, this.field3985 == 11 ? this.field4005 + 4 : this.field4005, arg5, this.field3985 == 11 ? 10 : this.field3985, this.field3996, var12, this.field3995);
            if (var13 == null) {
                this.field3992 = 0;
                this.field4010 = null;
                this.field4014 = null;
            } else {
                if (var10) {
                    if (this.field4014 == null) {
                        this.field4014 = new boolean[4];
                    }
                    this.field4010 = var13.method1305(this.field4010);
                    class177.method1080(this.field4010, this.field4001, arg6, arg0, this.field4014);
                }
                this.field3992 = var13.method1263();
            }
            this.field4016 = null;
        } else if (this.field4016 != null && (this.field4016.method1274() & arg5) == arg5 && this.field4004 == var8.field1156) {
            var13 = this.field4016;
        } else {
            if (this.field4016 != null) {
                arg5 |= this.field4016.method1274();
            }
            class221 var14 = var8.method538(var12, -119, this.field4007, this.field3985 == 11 ? this.field4005 + 4 : this.field4005, this.field3985 == 11 ? 10 : this.field3985, var11, arg5, var11.method100(this.field3991, this.field4007), arg3, this.field3991, var10);
            if (var14 == null) {
                this.field4016 = null;
                this.field3992 = 0;
                this.field4010 = null;
                this.field4014 = null;
            } else {
                var13 = var14.field3362;
                this.field4016 = var14.field3362;
                if (var10) {
                    this.field4010 = var14.field3366;
                    this.field4014 = null;
                    class177.method1080(this.field4010, this.field4001, arg6, arg0, (boolean[]) null);
                }
                this.field3992 = var13.method1263();
            }
        }
        this.field4007 = arg0;
        if (arg4 < 86) {
            return null;
        } else {
            this.field4004 = var8.field1156;
            this.field3991 = arg6;
            this.field4000 = this.field3996;
            return var13;
        }
    }

    @OriginalMember(owner = "client!op", name = "b", descriptor = "(I)I")
    public final int method1631(int arg0) {
        int var2 = 15 % ((arg0 + 61) / 58);
        field4009++;
        return this.field3992;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(II)V")
    private final void method1632(int arg0, int arg1) {
        if (arg0 != -101) {
            return;
        }
        field4006++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class85 var5 = class411.method2575(0, this.field3998);
            class85 var6 = var5;
            if (var5.field1133 != null) {
                var5 = var5.method542(6796);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1124 != null) {
                if (this.field3995 != null && var5.method552(true, this.field3995.field5521)) {
                    return;
                }
                var3 = var5.method541((byte) 116);
                if (this.field4004 != var5.field1156) {
                    var4 = var5.field1150;
                }
            } else if (var5.field1125 == -1) {
                if (var6 != null && var6.field1124 != null) {
                    if (this.field3995 != null && var6.method552(true, this.field3995.field5521)) {
                        return;
                    }
                    var3 = var6.method541((byte) 93);
                    if (this.field4004 != var6.field1156) {
                        var4 = var6.field1150;
                    }
                } else if (var6 != null && var6.field1125 != -1 && this.field4004 != var6.field1156) {
                    var4 = var6.field1150;
                    var3 = var6.field1125;
                }
            } else if (this.field4004 != var5.field1156) {
                var3 = var5.field1125;
                var4 = var5.field1150;
            }
        }
        if (var3 == -1) {
            this.field3995 = null;
            return;
        }
        this.field4016 = null;
        if (this.field3995 == null || this.field3995.field5521 != var3) {
            this.field3995 = class98.method629(var3, (byte) -115);
        } else if (this.field3995.field5531 == 0) {
            return;
        }
        if (this.field3995.field5539 == null) {
            this.field3995 = null;
            return;
        }
        if (var4) {
            this.field3996 = (int) (Math.random() * (double) this.field3995.field5539.length);
            this.field4018 = (int) (Math.random() * (double) this.field3995.field5540[this.field3996]) + 1;
        } else {
            this.field4018 = 1;
            this.field3996 = 0;
        }
        this.field3987 = this.field3996 + 1;
        if (this.field3987 < 0 || this.field3987 >= this.field3995.field5539.length) {
            this.field3987 = -1;
        }
        this.field3997 = class26.field332 - this.field4018;
    }

    @OriginalMember(owner = "client!op", name = "a", descriptor = "(ZLdr;)V")
    public final void method1633(boolean arg0, class261 arg1) {
        if (this.field4010 != null) {
            class85.method557(this.field4010, this.field4001, this.field3991, this.field4007, this.field4014);
            this.field4010 = null;
            this.field4014 = null;
        }
        if (arg0) {
            field3993++;
        }
    }

    @OriginalMember(owner = "client!op", name = "<init>", descriptor = "(Ldr;Lfq;IIIIIIZI)V")
    public class262(class261 arg0, class85 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field3985 = arg2;
        this.field3998 = arg1.field1156;
        this.field4008 = (byte) arg4;
        this.field4005 = arg3;
        this.field4007 = arg7;
        this.field4001 = (byte) arg5;
        this.field3990 = arg8;
        this.field3991 = arg6;
        this.field4015 = arg0.method427() && arg1.field1158 && !this.field3990;
        if (arg9 != -1) {
            this.field3999 = true;
        }
        this.method1632(-101, arg9);
    }
}
