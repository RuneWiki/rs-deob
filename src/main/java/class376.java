import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!at")
public class class376 extends class430 {

    @OriginalMember(owner = "client!at", name = "F", descriptor = "I")
    private int field5247 = 0;

    @OriginalMember(owner = "client!at", name = "v", descriptor = "Lgca;")
    private class209 field5237 = new class209(16);

    @OriginalMember(owner = "client!at", name = "L", descriptor = "I")
    private int field5252 = 0;

    @OriginalMember(owner = "client!at", name = "K", descriptor = "Lfha;")
    private class522 field5251 = new class522();

    @OriginalMember(owner = "client!at", name = "O", descriptor = "J")
    private long field5255 = 0L;

    @OriginalMember(owner = "client!at", name = "i", descriptor = "I")
    private int field5224;

    @OriginalMember(owner = "client!at", name = "C", descriptor = "Lhca;")
    private class244 field5244;

    @OriginalMember(owner = "client!at", name = "M", descriptor = "Z")
    private boolean field5253;

    @OriginalMember(owner = "client!at", name = "I", descriptor = "Lfha;")
    private class522 field5250;

    @OriginalMember(owner = "client!at", name = "w", descriptor = "Lfd;")
    private class297 field5238;

    @OriginalMember(owner = "client!at", name = "o", descriptor = "[B")
    private byte[] field5230;

    @OriginalMember(owner = "client!at", name = "N", descriptor = "Z")
    private boolean field5254;

    @OriginalMember(owner = "client!at", name = "l", descriptor = "Lwm;")
    private class28 field5227;

    @OriginalMember(owner = "client!at", name = "n", descriptor = "Lhca;")
    private class244 field5229;

    @OriginalMember(owner = "client!at", name = "h", descriptor = "I")
    private int field5223;

    @OriginalMember(owner = "client!at", name = "s", descriptor = "I")
    private int field5234;

    @OriginalMember(owner = "client!at", name = "j", descriptor = "Lin;")
    private class63 field5225;

    @OriginalMember(owner = "client!at", name = "k", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!at", name = "m", descriptor = "I")
    public static int field5228;

    @OriginalMember(owner = "client!at", name = "p", descriptor = "I")
    public static int field5231;

    @OriginalMember(owner = "client!at", name = "r", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!at", name = "t", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!at", name = "u", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!at", name = "y", descriptor = "I")
    public static int field5240;

    @OriginalMember(owner = "client!at", name = "z", descriptor = "I")
    public static int field5241;

    @OriginalMember(owner = "client!at", name = "A", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!at", name = "B", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!at", name = "D", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!at", name = "E", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!at", name = "G", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!at", name = "q", descriptor = "Lsia;")
    private class153 field5232;

    @OriginalMember(owner = "client!at", name = "H", descriptor = "Z")
    private boolean field5249;

    @OriginalMember(owner = "client!at", name = "x", descriptor = "[B")
    private byte[] field5239;

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(B)I", line = 3)
    public final int method2268(byte arg0) {
        field5228++;
        if (arg0 > -106) {
            this.method2272(87);
        }
        return this.field5247;
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(ZI)V", line = 14)
    public final void method2269(boolean arg0, int arg1) {
        field5235++;
        if (this.field5244 == null) {
            return;
        }
        for (class513 var3 = this.field5251.method3118((byte) 73); var3 != null; var3 = this.field5251.method3111(118)) {
            if (((long) arg1) == var3.field7166) {
                return;
            }
        }
        class513 var4 = new class513();
        var4.field7166 = arg1;
        this.field5251.method3116(29066, var4);
        if (arg0) {
            method2277((byte) -112, null);
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(Z)V", line = 43)
    public final void method2270(boolean arg0) {
        field5231++;
        if (this.field5250 != null) {
            if (this.method2280(255) == null) {
                return;
            }
            if (this.field5253) {
                boolean var2 = true;
                for (class513 var3 = this.field5250.method3118((byte) 73); var3 != null; var3 = this.field5250.method3111(123)) {
                    int var5 = (int) var3.field7166;
                    if (this.field5239[var5] == 0) {
                        this.method2273(var5, 1, (byte) -127);
                    }
                    if (this.field5239[var5] == 0) {
                        var2 = false;
                    } else {
                        var3.method3065(-17363);
                    }
                }
                while (this.field5232.field2108.length > this.field5252) {
                    if (this.field5232.field2108[this.field5252] == 0) {
                        this.field5252++;
                    } else {
                        if (this.field5227.field366 >= 250) {
                            var2 = false;
                            break;
                        }
                        if (this.field5239[this.field5252] == 0) {
                            this.method2273(this.field5252, 1, (byte) -127);
                        }
                        if (this.field5239[this.field5252] == 0) {
                            class513 var4 = new class513();
                            var4.field7166 = this.field5252;
                            var2 = false;
                            this.field5250.method3116(29066, var4);
                        }
                        this.field5252++;
                    }
                }
                if (var2) {
                    this.field5252 = 0;
                    this.field5253 = false;
                }
            } else if (this.field5249) {
                boolean var6 = true;
                for (class513 var7 = this.field5250.method3118((byte) 73); var7 != null; var7 = this.field5250.method3111(122)) {
                    int var9 = (int) var7.field7166;
                    if (this.field5239[var9] != 1) {
                        this.method2273(var9, 2, (byte) -127);
                    }
                    if (this.field5239[var9] == 1) {
                        var7.method3065(-17363);
                    } else {
                        var6 = false;
                    }
                }
                while (this.field5232.field2108.length > this.field5252) {
                    if (this.field5232.field2108[this.field5252] == 0) {
                        this.field5252++;
                    } else {
                        if (this.field5238.method1754(0)) {
                            var6 = false;
                            break;
                        }
                        if (this.field5239[this.field5252] != 1) {
                            this.method2273(this.field5252, 2, (byte) -127);
                        }
                        if (this.field5239[this.field5252] != 1) {
                            class513 var8 = new class513();
                            var8.field7166 = this.field5252;
                            var6 = false;
                            this.field5250.method3116(29066, var8);
                        }
                        this.field5252++;
                    }
                }
                if (var6) {
                    this.field5249 = false;
                    this.field5252 = 0;
                }
            } else {
                this.field5250 = null;
            }
        }
        if (this.field5254 && this.field5255 <= class224.method1457((byte) -62)) {
            for (class63 var10 = (class63) this.field5237.method1382(27901); var10 != null; var10 = (class63) this.field5237.method1383(false)) {
                if (!var10.field846) {
                    if (var10.field844) {
                        if (!var10.field843) {
                            throw new RuntimeException();
                        }
                        var10.method3065(-17363);
                    } else {
                        var10.field844 = true;
                    }
                }
            }
            this.field5255 = class224.method1457((byte) -62) + 1000L;
        }
        if (!arg0) {
            this.method2269(true, 68);
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(II)[B", line = 219)
    public final byte[] method2271(int arg0, int arg1) {
        field5242++;
        class63 var3 = this.method2273(arg0, 0, (byte) -127);
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method406(-125);
            var3.method3065(arg1 ^ 0xFFFF8D5D);
            return arg1 == 12656 ? var4 : null;
        }
    }

    @OriginalMember(owner = "client!at", name = "b", descriptor = "(I)V", line = 244)
    public final void method2272(int arg0) {
        if (arg0 <= 94) {
            method2277((byte) 19, null);
        }
        field5241++;
        if (this.field5244 != null) {
            this.field5249 = true;
            if (this.field5250 == null) {
                this.field5250 = new class522();
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IIB)Lin;", line = 262)
    private final class63 method2273(int arg0, int arg1, byte arg2) {
        if (arg2 != -127) {
            return null;
        }
        field5226++;
        class63 var4 = (class63) this.field5237.method1381(true, (long) arg0);
        if (var4 != null && arg1 == 0 && !var4.field843 && var4.field846) {
            var4.method3065(-17363);
            var4 = null;
        }
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field5244 == null || this.field5239[arg0] == -1) {
                    if (this.field5238.method1746(1)) {
                        return null;
                    }
                    var4 = this.field5238.method1753(arg0, 4, true, (byte) 2, this.field5224);
                } else {
                    var4 = this.field5227.method206(arg0, this.field5244, 32178);
                }
            } else if (arg1 == 1) {
                if (this.field5244 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field5227.method208(arg0, this.field5244, 74);
            } else if (arg1 == 2) {
                if (this.field5244 == null) {
                    throw new RuntimeException();
                }
                if (this.field5239[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field5238.method1754(arg2 + 127)) {
                    return null;
                }
                var4 = this.field5238.method1753(arg0, 4, false, (byte) 2, this.field5224);
            } else {
                throw new RuntimeException();
            }
            this.field5237.method1387(var4, (long) arg0, (byte) -116);
        }
        if (var4.field846) {
            return null;
        }
        byte[] var5 = var4.method406(-128);
        if (!var4 instanceof class331) {
            try {
                label159: {
                    if (var5 != null && var5.length > 2) {
                        class501.field7016.reset();
                        class501.field7016.update(var5, 0, var5.length - 2);
                        int var12 = (int) class501.field7016.getValue();
                        if (this.field5232.field2113[arg0] != var12) {
                            throw new RuntimeException();
                        }
                        if (this.field5232.field2107 == null || this.field5232.field2107[arg0] == null) {
                            break label159;
                        }
                        byte[] var13 = this.field5232.field2107[arg0];
                        byte[] var14 = class175.method1103(var5.length - 2, 0, (byte) 126, var5);
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
                this.field5238.field3884 = 0;
                this.field5238.field3886 = 0;
            } catch (RuntimeException var18) {
                this.field5238.method1745(-1);
                var4.method3065(-17363);
                if (var4.field843 && !this.field5238.method1746(1)) {
                    class651 var16 = this.field5238.method1753(arg0, 4, true, (byte) 2, this.field5224);
                    this.field5237.method1387(var16, (long) arg0, (byte) -115);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field5232.field2105[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field5232.field2105[arg0];
            if (this.field5244 != null) {
                this.field5227.method209(var5, false, arg0, this.field5244);
                if (this.field5239[arg0] != 1) {
                    this.field5247++;
                    this.field5239[arg0] = 1;
                }
            }
            if (!var4.field843) {
                var4.method3065(-17363);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class501.field7016.reset();
            class501.field7016.update(var5, 0, var5.length - 2);
            int var6 = (int) class501.field7016.getValue();
            if (this.field5232.field2113[arg0] != var6) {
                throw new RuntimeException();
            }
            if (this.field5232.field2107 != null && this.field5232.field2107[arg0] != null) {
                byte[] var7 = this.field5232.field2107[arg0];
                byte[] var8 = class175.method1103(var5.length - 2, 0, (byte) 34, var5);
                for (int var9 = 0; var9 < 64; var9++) {
                    if (var7[var9] != var8[var9]) {
                        throw new RuntimeException();
                    }
                }
            }
            int var10 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field5232.field2105[arg0] & 0xFFFF) != var10) {
                throw new RuntimeException();
            }
            if (this.field5239[arg0] != 1) {
                this.field5247++;
                this.field5239[arg0] = 1;
            }
            if (!var4.field843) {
                var4.method3065(-17363);
            }
            return var4;
        } catch (Exception var17) {
            this.field5239[arg0] = -1;
            var4.method3065(arg2 ^ 0x43AC);
            if (var4.field843 && !this.field5238.method1746(arg2 ^ 0xFFFFFF80)) {
                class651 var11 = this.field5238.method1753(arg0, 4, true, (byte) 2, this.field5224);
                this.field5237.method1387(var11, (long) arg0, (byte) -104);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(I)I", line = 527)
    public final int method2274(int arg0) {
        field5243++;
        if (this.field5232 == null) {
            return 0;
        } else if (this.field5253) {
            class513 var2 = this.field5250.method3118((byte) 73);
            if (var2 == null) {
                return 0;
            } else {
                if (arg0 != 0) {
                    this.method2271(13, -80);
                }
                return (int) var2.field7166;
            }
        } else {
            return this.field5232.field2098;
        }
    }

    @OriginalMember(owner = "client!at", name = "c", descriptor = "(B)I", line = 552)
    public final int method2275(byte arg0) {
        field5246++;
        if (arg0 != -56) {
            this.field5230 = null;
        }
        if (this.method2280(arg0 + 311) == null) {
            return this.field5225 == null ? 0 : this.field5225.method404((byte) 112);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(IB)I", line = 587)
    public final int method2276(int arg0, byte arg1) {
        int var3 = -124 % ((49 - arg1) / 63);
        field5240++;
        class63 var4 = (class63) this.field5237.method1381(true, (long) arg0);
        return var4 == null ? 0 : var4.method404((byte) 75);
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(BLvj;)Lsi;", line = 605)
    public static final class691 method2277(byte arg0, class26 arg1) {
        if (arg0 != -97) {
            method2277((byte) 76, null);
        }
        field5236++;
        int var2 = arg1.method193(2);
        return new class691(var2);
    }

    @OriginalMember(owner = "client!at", name = "d", descriptor = "(I)I", line = 626)
    public final int method2278(int arg0) {
        field5233++;
        int var2 = -38 % (arg0 / 56);
        return this.field5232 == null ? 0 : this.field5232.field2098;
    }

    @OriginalMember(owner = "client!at", name = "e", descriptor = "(I)V", line = 641)
    public final void method2279(int arg0) {
        if (arg0 != 1) {
            this.method2269(true, -28);
        }
        field5245++;
        if (this.field5250 == null || this.method2280(255) == null) {
            return;
        }
        for (class513 var2 = this.field5251.method3118((byte) 73); var2 != null; var2 = this.field5251.method3111(118)) {
            int var3 = (int) var2.field7166;
            if (var3 < 0 || var3 >= this.field5232.field2099 || this.field5232.field2108[var3] == 0) {
                var2.method3065(arg0 - 17364);
            } else {
                if (this.field5239[var3] == 0) {
                    this.method2273(var3, 1, (byte) -127);
                }
                if (this.field5239[var3] == -1) {
                    this.method2273(var3, 2, (byte) -127);
                }
                if (this.field5239[var3] == 1) {
                    var2.method3065(-17363);
                }
            }
        }
    }

    @OriginalMember(owner = "client!at", name = "a", descriptor = "(I)Lsia;", line = 689)
    public final class153 method2280(int arg0) {
        field5248++;
        if (this.field5232 != null) {
            return this.field5232;
        }
        if (arg0 != 255) {
            this.method2268((byte) 122);
        }
        if (this.field5225 == null) {
            if (this.field5238.method1746(1)) {
                return null;
            }
            this.field5225 = this.field5238.method1753(this.field5224, 4, true, (byte) 0, 255);
        }
        if (this.field5225.field846) {
            return null;
        }
        byte[] var2 = this.field5225.method406(58);
        if (this.field5225 instanceof class331) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5232 = new class153(var2, this.field5234, this.field5230);
                if (this.field5232.field2101 != this.field5223) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field5232 = null;
                if (this.field5238.method1746(1)) {
                    this.field5225 = null;
                } else {
                    this.field5225 = this.field5238.method1753(this.field5224, 4, true, (byte) 0, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field5232 = new class153(var2, this.field5234, this.field5230);
            } catch (RuntimeException var4) {
                this.field5238.method1745(-1);
                this.field5232 = null;
                if (this.field5238.method1746(arg0 ^ 0xFE)) {
                    this.field5225 = null;
                } else {
                    this.field5225 = this.field5238.method1753(this.field5224, arg0 ^ 0xFB, true, (byte) 0, 255);
                }
                return null;
            }
            if (this.field5229 != null) {
                this.field5227.method209(var2, false, this.field5224, this.field5229);
            }
        }
        this.field5225 = null;
        if (this.field5244 != null) {
            this.field5247 = 0;
            this.field5239 = new byte[this.field5232.field2099];
        }
        return this.field5232;
    }

    @OriginalMember(owner = "client!at", name = "<init>", descriptor = "(ILhca;Lhca;Lfd;Lwm;I[BIZ)V", line = 809)
    public class376(int arg0, class244 arg1, class244 arg2, class297 arg3, class28 arg4, int arg5, byte[] arg6, int arg7, boolean arg8) {
        this.field5224 = arg0;
        this.field5244 = arg1;
        if (this.field5244 == null) {
            this.field5253 = false;
        } else {
            this.field5253 = true;
            this.field5250 = new class522();
        }
        this.field5238 = arg3;
        this.field5230 = arg6;
        this.field5254 = arg8;
        this.field5227 = arg4;
        this.field5229 = arg2;
        this.field5223 = arg7;
        this.field5234 = arg5;
        if (this.field5229 != null) {
            this.field5225 = this.field5227.method206(this.field5224, this.field5229, 32178);
        }
    }
}
