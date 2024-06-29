import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class133 extends class213 {

    @OriginalMember(owner = "client!hk", name = "z", descriptor = "I")
    private int field2149 = 0;

    @OriginalMember(owner = "client!hk", name = "w", descriptor = "Li;")
    private class58 field2146 = new class58(16);

    @OriginalMember(owner = "client!hk", name = "N", descriptor = "I")
    private int field2163 = 0;

    @OriginalMember(owner = "client!hk", name = "O", descriptor = "Lnb;")
    private class223 field2164 = new class223();

    @OriginalMember(owner = "client!hk", name = "Q", descriptor = "J")
    private long field2166 = 0L;

    @OriginalMember(owner = "client!hk", name = "q", descriptor = "I")
    private int field2140;

    @OriginalMember(owner = "client!hk", name = "B", descriptor = "Lki;")
    private class64 field2151;

    @OriginalMember(owner = "client!hk", name = "L", descriptor = "Z")
    private boolean field2161;

    @OriginalMember(owner = "client!hk", name = "K", descriptor = "Lnb;")
    private class223 field2160;

    @OriginalMember(owner = "client!hk", name = "D", descriptor = "Lnl;")
    private class101 field2153;

    @OriginalMember(owner = "client!hk", name = "E", descriptor = "I")
    private int field2154;

    @OriginalMember(owner = "client!hk", name = "P", descriptor = "Z")
    private boolean field2165;

    @OriginalMember(owner = "client!hk", name = "v", descriptor = "Ltf;")
    private class115 field2145;

    @OriginalMember(owner = "client!hk", name = "h", descriptor = "I")
    private int field2131;

    @OriginalMember(owner = "client!hk", name = "r", descriptor = "Lki;")
    private class64 field2141;

    @OriginalMember(owner = "client!hk", name = "J", descriptor = "Lab;")
    private class154 field2159;

    @OriginalMember(owner = "client!hk", name = "o", descriptor = "I")
    public static int field2138 = -1;

    @OriginalMember(owner = "client!hk", name = "n", descriptor = "Ljava/lang/String;")
    public static String field2137 = "Loaded interfaces";

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "I")
    public static int field2129;

    @OriginalMember(owner = "client!hk", name = "g", descriptor = "I")
    public static int field2130;

    @OriginalMember(owner = "client!hk", name = "i", descriptor = "I")
    public static int field2132;

    @OriginalMember(owner = "client!hk", name = "j", descriptor = "I")
    public static int field2133;

    @OriginalMember(owner = "client!hk", name = "k", descriptor = "I")
    public static int field2134;

    @OriginalMember(owner = "client!hk", name = "l", descriptor = "I")
    public static int field2135;

    @OriginalMember(owner = "client!hk", name = "p", descriptor = "I")
    public static int field2139;

    @OriginalMember(owner = "client!hk", name = "s", descriptor = "I")
    public static int field2142;

    @OriginalMember(owner = "client!hk", name = "u", descriptor = "I")
    public static int field2144;

    @OriginalMember(owner = "client!hk", name = "x", descriptor = "I")
    public static int field2147;

    @OriginalMember(owner = "client!hk", name = "y", descriptor = "I")
    public static int field2148;

    @OriginalMember(owner = "client!hk", name = "A", descriptor = "I")
    public static int field2150;

    @OriginalMember(owner = "client!hk", name = "C", descriptor = "I")
    public static int field2152;

    @OriginalMember(owner = "client!hk", name = "G", descriptor = "I")
    public static int field2156;

    @OriginalMember(owner = "client!hk", name = "H", descriptor = "I")
    public static int field2157;

    @OriginalMember(owner = "client!hk", name = "I", descriptor = "I")
    public static int field2158;

    @OriginalMember(owner = "client!hk", name = "m", descriptor = "Lgm;")
    private class226 field2136;

    @OriginalMember(owner = "client!hk", name = "M", descriptor = "Z")
    private boolean field2162;

    @OriginalMember(owner = "client!hk", name = "F", descriptor = "[B")
    private byte[] field2155;

    @OriginalMember(owner = "client!hk", name = "t", descriptor = "[I")
    public static int[] field2143;

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IB)[B")
    public final byte[] method898(int arg0, byte arg1) {
        class154 var3 = this.method904(arg0, 0, 12956);
        if (arg1 >= -13) {
            this.method910(-110);
        }
        field2144++;
        if (var3 == null) {
            return null;
        } else {
            byte[] var4 = var3.method1045(true);
            var3.method952((byte) 122);
            return var4;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(ZI)V")
    public static final void method899(boolean arg0, int arg1) {
        field2152++;
        if (!arg0) {
            class120.field1900.method1880(-122, arg1);
            class161.field2633.method1880(-69, arg1);
            class254.field4198.method1880(-100, arg1);
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I")
    public final int method900(int arg0, int arg1) {
        class154 var3 = (class154) this.field2146.method371(116, (long) arg1);
        if (arg0 > -124) {
            this.field2145 = null;
        }
        field2148++;
        return var3 == null ? 0 : var3.method1043(-12007);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(I)I")
    public final int method901(int arg0) {
        if (arg0 != 17732) {
            this.field2140 = -69;
        }
        field2158++;
        return this.field2149;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(I)I")
    public final int method902(int arg0) {
        if (arg0 != 0) {
            this.method902(37);
        }
        field2132++;
        if (this.method907((byte) 118) == null) {
            return this.field2159 == null ? 0 : this.field2159.method1043(-12007);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(III)V")
    public static final void method903(int arg0, int arg1, int arg2) {
        field2142++;
        if (arg0 != -11072) {
            method906(false);
        }
        class291 var3 = class61.method389(arg1, 1, arg0 + 11072);
        var3.method2009(arg0 + 11033);
        var3.field4763 = arg2;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(III)Lab;")
    private final class154 method904(int arg0, int arg1, int arg2) {
        class154 var4 = (class154) this.field2146.method371(-107, (long) arg0);
        if (var4 != null && arg1 == 0 && !var4.field2462 && var4.field2461) {
            var4.method952((byte) 78);
            var4 = null;
        }
        field2147++;
        if (var4 == null) {
            if (arg1 == 0) {
                if (this.field2151 == null || this.field2155[arg0] == -1) {
                    if (this.field2153.method715((byte) -47)) {
                        return null;
                    }
                    var4 = this.field2153.method724(true, arg0, (byte) 2, false, this.field2140);
                } else {
                    var4 = this.field2145.method794(this.field2151, arg0, (byte) -60);
                }
            } else if (arg1 == 1) {
                if (this.field2151 == null) {
                    throw new RuntimeException();
                }
                var4 = this.field2145.method793(arg0, this.field2151, 3);
            } else if (arg1 == 2) {
                if (this.field2151 == null) {
                    throw new RuntimeException();
                }
                if (this.field2155[arg0] != -1) {
                    throw new RuntimeException();
                }
                if (this.field2153.method716((byte) 127)) {
                    return null;
                }
                var4 = this.field2153.method724(false, arg0, (byte) 2, false, this.field2140);
            } else {
                throw new RuntimeException();
            }
            this.field2146.method368((long) arg0, var4, -104);
        }
        if (arg2 != 12956) {
            this.field2151 = null;
        }
        if (var4.field2461) {
            return null;
        }
        byte[] var5 = var4.method1045(true);
        if (!var4 instanceof class310) {
            try {
                if (var5 == null || var5.length <= 2) {
                    throw new RuntimeException();
                }
                class50.field731.reset();
                class50.field731.update(var5, 0, var5.length - 2);
                int var6 = (int) class50.field731.getValue();
                if (this.field2136.field3553[arg0] != var6) {
                    throw new RuntimeException();
                }
                this.field2153.field1607 = 0;
                this.field2153.field1605 = 0;
            } catch (RuntimeException var12) {
                this.field2153.method710((byte) 70);
                var4.method952((byte) 117);
                if (var4.field2462 && !this.field2153.method715((byte) -47)) {
                    class155 var7 = this.field2153.method724(true, arg0, (byte) 2, false, this.field2140);
                    this.field2146.method368((long) arg0, var7, arg2 - 13083);
                }
                return null;
            }
            var5[var5.length - 2] = (byte) (this.field2136.field3556[arg0] >>> 8);
            var5[var5.length - 1] = (byte) this.field2136.field3556[arg0];
            if (this.field2151 != null) {
                this.field2145.method795(this.field2151, 10129, var5, arg0);
                if (this.field2155[arg0] != 1) {
                    this.field2149++;
                    this.field2155[arg0] = 1;
                }
            }
            if (!var4.field2462) {
                var4.method952((byte) 67);
            }
            return var4;
        }
        try {
            if (var5 == null || var5.length <= 2) {
                throw new RuntimeException();
            }
            class50.field731.reset();
            class50.field731.update(var5, 0, var5.length - 2);
            int var8 = (int) class50.field731.getValue();
            if (this.field2136.field3553[arg0] != var8) {
                throw new RuntimeException();
            }
            int var9 = (var5[var5.length - 2] & 0xFF << 8) + (var5[var5.length - 1] & 0xFF);
            if ((this.field2136.field3556[arg0] & 0xFFFF) != var9) {
                throw new RuntimeException();
            }
            if (this.field2155[arg0] != 1) {
                this.field2149++;
                this.field2155[arg0] = 1;
            }
            if (!var4.field2462) {
                var4.method952((byte) 40);
            }
            return var4;
        } catch (Exception var11) {
            this.field2155[arg0] = -1;
            var4.method952((byte) 91);
            if (var4.field2462 && !this.field2153.method715((byte) -47)) {
                class155 var10 = this.field2153.method724(true, arg0, (byte) 2, false, this.field2140);
                this.field2146.method368((long) arg0, var10, -88);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(B)I")
    public final int method905(byte arg0) {
        field2156++;
        if (arg0 != 0) {
            this.field2160 = null;
        }
        return this.field2136 == null ? 0 : this.field2136.field3560;
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(Z)V")
    public static void method906(boolean arg0) {
        field2137 = null;
        field2143 = null;
        if (!arg0) {
            field2135 = -56;
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(B)Lgm;")
    public final class226 method907(byte arg0) {
        field2134++;
        if (this.field2136 != null) {
            return this.field2136;
        }
        if (this.field2159 == null) {
            if (this.field2153.method715((byte) -47)) {
                return null;
            }
            this.field2159 = this.field2153.method724(true, this.field2140, (byte) 0, false, 255);
        }
        if (this.field2159.field2461) {
            return null;
        }
        if (arg0 != 118) {
            this.field2162 = true;
        }
        byte[] var2 = this.field2159.method1045(true);
        if (this.field2159 instanceof class310) {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2136 = new class226(var2, this.field2154);
                if (this.field2136.field3557 != this.field2131) {
                    throw new RuntimeException();
                }
            } catch (RuntimeException var3) {
                this.field2136 = null;
                if (this.field2153.method715((byte) -47)) {
                    this.field2159 = null;
                } else {
                    this.field2159 = this.field2153.method724(true, this.field2140, (byte) 0, false, 255);
                }
                return null;
            }
        } else {
            try {
                if (var2 == null) {
                    throw new RuntimeException();
                }
                this.field2136 = new class226(var2, this.field2154);
            } catch (RuntimeException var4) {
                this.field2153.method710((byte) 70);
                this.field2136 = null;
                if (this.field2153.method715((byte) -47)) {
                    this.field2159 = null;
                } else {
                    this.field2159 = this.field2153.method724(true, this.field2140, (byte) 0, false, 255);
                }
                return null;
            }
            if (this.field2141 != null) {
                this.field2145.method795(this.field2141, 10129, var2, this.field2140);
            }
        }
        this.field2159 = null;
        if (this.field2151 != null) {
            this.field2149 = 0;
            this.field2155 = new byte[this.field2136.field3548];
        }
        return this.field2136;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)V")
    public final void method908(int arg0, byte arg1) {
        int var3 = -18 % ((-arg1 - 4) / 36);
        field2129++;
        if (this.field2151 == null) {
            return;
        }
        for (class137 var4 = this.field2164.method1553(true); var4 != null; var4 = this.field2164.method1551(0)) {
            if (((long) arg0) == var4.field2209) {
                return;
            }
        }
        class137 var5 = new class137();
        var5.field2209 = (long) arg0;
        this.field2164.method1554(5257, var5);
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V")
    public final void method909(byte arg0) {
        field2157++;
        if (this.field2160 == null || this.method907((byte) 118) == null) {
            return;
        }
        for (class137 var2 = this.field2164.method1553(true); var2 != null; var2 = this.field2164.method1551(0)) {
            int var3 = (int) var2.field2209;
            if (var3 < 0 || var3 >= this.field2136.field3548 || this.field2136.field3544[var3] == 0) {
                var2.method952((byte) 56);
            } else {
                if (this.field2155[var3] == 0) {
                    this.method904(var3, 1, 12956);
                }
                if (this.field2155[var3] == -1) {
                    this.method904(var3, 2, 12956);
                }
                if (this.field2155[var3] == 1) {
                    var2.method952((byte) 38);
                }
            }
        }
        if (arg0 < 8) {
            method899(false, -119);
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(I)V")
    public final void method910(int arg0) {
        field2150++;
        if (this.field2160 != null) {
            if (this.method907((byte) 118) == null) {
                return;
            }
            if (this.field2161) {
                boolean var6 = true;
                for (class137 var7 = this.field2160.method1553(true); var7 != null; var7 = this.field2160.method1551(0)) {
                    int var9 = (int) var7.field2209;
                    if (this.field2155[var9] == 0) {
                        this.method904(var9, 1, 12956);
                    }
                    if (this.field2155[var9] == 0) {
                        var6 = false;
                    } else {
                        var7.method952((byte) 89);
                    }
                }
                while (this.field2136.field3544.length > this.field2163) {
                    if (this.field2136.field3544[this.field2163] == 0) {
                        this.field2163++;
                    } else {
                        if (this.field2145.field1759 >= 250) {
                            var6 = false;
                            break;
                        }
                        if (this.field2155[this.field2163] == 0) {
                            this.method904(this.field2163, 1, 12956);
                        }
                        if (this.field2155[this.field2163] == 0) {
                            var6 = false;
                            class137 var8 = new class137();
                            var8.field2209 = (long) this.field2163;
                            this.field2160.method1554(5257, var8);
                        }
                        this.field2163++;
                    }
                }
                if (var6) {
                    this.field2161 = false;
                    this.field2163 = 0;
                }
            } else if (this.field2162) {
                boolean var2 = true;
                for (class137 var3 = this.field2160.method1553(true); var3 != null; var3 = this.field2160.method1551(0)) {
                    int var5 = (int) var3.field2209;
                    if (this.field2155[var5] != 1) {
                        this.method904(var5, 2, 12956);
                    }
                    if (this.field2155[var5] == 1) {
                        var3.method952((byte) 121);
                    } else {
                        var2 = false;
                    }
                }
                while (this.field2163 < this.field2136.field3544.length) {
                    if (this.field2136.field3544[this.field2163] == 0) {
                        this.field2163++;
                    } else {
                        if (this.field2153.method716((byte) 112)) {
                            var2 = false;
                            break;
                        }
                        if (this.field2155[this.field2163] != 1) {
                            this.method904(this.field2163, 2, 12956);
                        }
                        if (this.field2155[this.field2163] != 1) {
                            var2 = false;
                            class137 var4 = new class137();
                            var4.field2209 = (long) this.field2163;
                            this.field2160.method1554(arg0 + 5257, var4);
                        }
                        this.field2163++;
                    }
                }
                if (var2) {
                    this.field2163 = 0;
                    this.field2162 = false;
                }
            } else {
                this.field2160 = null;
            }
        }
        if (arg0 != 0) {
            this.field2163 = 45;
        }
        if (!this.field2165 || this.field2166 > class264.method1778(arg0 ^ 0x19AD)) {
            return;
        }
        for (class154 var10 = (class154) this.field2146.method379(-21146); var10 != null; var10 = (class154) this.field2146.method369(true)) {
            if (!var10.field2461) {
                if (var10.field2465) {
                    if (!var10.field2462) {
                        throw new RuntimeException();
                    }
                    var10.method952((byte) 95);
                } else {
                    var10.field2465 = true;
                }
            }
        }
        this.field2166 = class264.method1778(6573) + 1000L;
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(B)V")
    public final void method911(byte arg0) {
        field2130++;
        if (this.field2151 != null) {
            this.field2162 = true;
            if (arg0 == -35 && this.field2160 == null) {
                this.field2160 = new class223();
            }
        }
    }

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)I")
    public final int method912(int arg0) {
        field2139++;
        if (this.field2136 == null) {
            return 0;
        } else if (this.field2161) {
            if (arg0 != -17004) {
                this.method909((byte) 18);
            }
            class137 var2 = this.field2160.method1553(true);
            return var2 == null ? 0 : (int) var2.field2209;
        } else {
            return this.field2136.field3560;
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "(ILki;Lki;Lnl;Ltf;IIZ)V")
    public class133(int arg0, class64 arg1, class64 arg2, class101 arg3, class115 arg4, int arg5, int arg6, boolean arg7) {
        this.field2140 = arg0;
        this.field2151 = arg1;
        if (this.field2151 == null) {
            this.field2161 = false;
        } else {
            this.field2161 = true;
            this.field2160 = new class223();
        }
        this.field2153 = arg3;
        this.field2154 = arg5;
        this.field2165 = arg7;
        this.field2145 = arg4;
        this.field2131 = arg6;
        this.field2141 = arg2;
        if (this.field2141 != null) {
            this.field2159 = this.field2145.method794(this.field2141, this.field2140, (byte) -81);
        }
    }
}
