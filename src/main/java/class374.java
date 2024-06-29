import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class374 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "I")
    private int field5142 = -32768;

    @OriginalMember(owner = "client!gk", name = "w", descriptor = "I")
    private int field5164 = -1;

    @OriginalMember(owner = "client!gk", name = "C", descriptor = "Z")
    private boolean field5170 = false;

    @OriginalMember(owner = "client!gk", name = "A", descriptor = "I")
    private int field5168 = -1;

    @OriginalMember(owner = "client!gk", name = "l", descriptor = "Z")
    private boolean field5153 = false;

    @OriginalMember(owner = "client!gk", name = "t", descriptor = "I")
    private int field5161;

    @OriginalMember(owner = "client!gk", name = "o", descriptor = "I")
    public int field5156;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    private int field5145;

    @OriginalMember(owner = "client!gk", name = "E", descriptor = "I")
    public int field5172;

    @OriginalMember(owner = "client!gk", name = "D", descriptor = "I")
    public int field5171;

    @OriginalMember(owner = "client!gk", name = "s", descriptor = "B")
    private byte field5160;

    @OriginalMember(owner = "client!gk", name = "u", descriptor = "B")
    private byte field5162;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "Z")
    private boolean field5143;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "Lco;")
    public static class406 field5147 = new class406();

    @OriginalMember(owner = "client!gk", name = "J", descriptor = "Lkk;")
    public static class161 field5177;

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "I")
    private int field5144;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field5146;

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field5148;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field5149;

    @OriginalMember(owner = "client!gk", name = "i", descriptor = "I")
    public static int field5150;

    @OriginalMember(owner = "client!gk", name = "m", descriptor = "I")
    private int field5154;

    @OriginalMember(owner = "client!gk", name = "n", descriptor = "I")
    public static int field5155;

    @OriginalMember(owner = "client!gk", name = "p", descriptor = "I")
    public static int field5157;

    @OriginalMember(owner = "client!gk", name = "q", descriptor = "I")
    private int field5158;

    @OriginalMember(owner = "client!gk", name = "r", descriptor = "I")
    public static int field5159;

    @OriginalMember(owner = "client!gk", name = "y", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!gk", name = "z", descriptor = "I")
    public static int field5167;

    @OriginalMember(owner = "client!gk", name = "F", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!gk", name = "G", descriptor = "I")
    public static int field5174;

    @OriginalMember(owner = "client!gk", name = "H", descriptor = "I")
    private int field5175;

    @OriginalMember(owner = "client!gk", name = "K", descriptor = "I")
    public static int field5178;

    @OriginalMember(owner = "client!gk", name = "L", descriptor = "I")
    public static int field5179;

    @OriginalMember(owner = "client!gk", name = "v", descriptor = "Lan;")
    public class113 field5163;

    @OriginalMember(owner = "client!gk", name = "j", descriptor = "Ldh;")
    private class183 field5151;

    @OriginalMember(owner = "client!gk", name = "I", descriptor = "Lqp;")
    private class303 field5176;

    @OriginalMember(owner = "client!gk", name = "x", descriptor = "Ln;")
    private class468 field5165;

    @OriginalMember(owner = "client!gk", name = "k", descriptor = "Lvc;")
    public static class89 field5152;

    @OriginalMember(owner = "client!gk", name = "B", descriptor = "[Z")
    private boolean[] field5169;

    static {
        new class151((String) null, "bevor du die Option 'Regelverstoß melden' benutzt.", (String) null, (String) null);
        field5177 = new class161(new byte[5000]);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lvc;I)V", line = 3)
    public final void method2278(class89 arg0, int arg1) {
        if (this.field5151 != null) {
            class141.method1021(this.field5151, this.field5160, this.field5161, this.field5145, this.field5169);
            this.field5169 = null;
            this.field5151 = null;
        }
        if (arg1 == 4) {
            field5149++;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(B)Z", line = 23)
    public final boolean method2279(byte arg0) {
        field5155++;
        if (arg0 != -97) {
            this.field5142 = 30;
        }
        return this.field5143;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IB)V", line = 40)
    public final void method2280(int arg0, byte arg1) {
        field5157++;
        this.field5153 = true;
        this.method2284(-16324, arg0);
        int var3 = 20 / ((arg1 + 40) / 62);
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(Lvc;I)V", line = 52)
    public final void method2281(class89 arg0, int arg1) {
        this.method2288(-1, arg0, true, arg1, this.field5145, this.field5161, true);
        field5166++;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)I", line = 60)
    public final int method2282(int arg0) {
        field5173++;
        if (arg0 >= -47) {
            this.field5162 = 111;
        }
        return this.field5142;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Lvc;IIIIZLn;B)V", line = 74)
    public final void method2283(class89 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, class468 arg6, byte arg7) {
        field5146++;
        class295[] var9 = arg6.method1601();
        if (arg7 > -91) {
            return;
        }
        class235[] var10 = arg6.method1564();
        if ((this.field5163 == null || this.field5163.field1578) && (var9 != null || var10 != null)) {
            class267 var11 = class468.field6599.method506(-118, this.field5156);
            if (var11.field3846 != null) {
                var11 = var11.method1799(class416.field5691, (byte) -111);
            }
            if (var11 != null) {
                this.field5163 = new class113(class364.field5010);
            }
        }
        if (this.field5163 == null) {
            return;
        }
        if (arg5) {
            this.field5163.method891(arg0, (long) class364.field5010, var9, var10, false);
        } else {
            this.field5163.method889((long) class364.field5010);
        }
        this.field5163.method895(this.field5162, arg3, arg2, arg1, arg4);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(II)V", line = 116)
    private final void method2284(int arg0, int arg1) {
        field5174++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg1 == -1) {
            class267 var5 = class468.field6599.method506(arg0 ^ 0x3FBC, this.field5156);
            class267 var6 = var5;
            if (var5.field3846 != null) {
                var5 = var5.method1799(class416.field5691, (byte) -111);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field3870 != null) {
                if (this.field5176 != null && var5.method1800(arg0 ^ 0x4B64, this.field5176.field4288)) {
                    return;
                }
                var3 = var5.method1810((byte) -95);
                if (this.field5168 != var5.field3887) {
                    var4 = var5.field3915;
                }
            } else if (var5.field3869 == -1) {
                if (var6 != null && var6.field3870 != null) {
                    if (this.field5176 != null && var6.method1800(-29864, this.field5176.field4288)) {
                        return;
                    }
                    var3 = var6.method1810((byte) -38);
                    if (this.field5168 != var6.field3887) {
                        var4 = var6.field3915;
                    }
                } else if (var6 != null && var6.field3869 != -1 && this.field5168 != var6.field3887) {
                    var3 = var6.field3869;
                    var4 = var6.field3915;
                }
            } else if (this.field5168 != var5.field3887) {
                var4 = var5.field3915;
                var3 = var5.field3869;
            }
        }
        if (var3 == -1) {
            this.field5176 = null;
            return;
        }
        this.field5165 = null;
        if (this.field5176 == null || this.field5176.field4288 != var3) {
            this.field5176 = class386.field5289.method1856(92, var3);
        } else if (this.field5176.field4289 == 0) {
            return;
        }
        if (this.field5176.field4286 == null) {
            this.field5176 = null;
            return;
        }
        if (var4) {
            this.field5154 = (int) ((double) this.field5176.field4286.length * Math.random());
            this.field5175 = (int) ((double) this.field5176.field4283[this.field5154] * Math.random()) + 1;
        } else {
            this.field5154 = 0;
            this.field5175 = 1;
        }
        this.field5144 = this.field5154 + 1;
        if (this.field5144 < 0 || this.field5176.field4286.length <= this.field5144) {
            this.field5144 = -1;
        }
        this.field5158 = class364.field5010 - this.field5175;
        if (arg0 != -16324) {
            this.field5153 = false;
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(III)V", line = 238)
    private final void method2285(int arg0, int arg1, int arg2) {
        if (arg2 != -25534) {
            this.method2280(-47, (byte) -27);
        }
        field5178++;
        label92: while (true) {
            if (this.field5176 == null) {
                if (this.field5153) {
                    return;
                }
                this.method2284(-16324, -1);
                if (this.field5176 == null) {
                    return;
                }
            }
            int var4 = class364.field5010 - this.field5158;
            if (var4 > 100 && this.field5176.field4304 > 0) {
                int var5 = this.field5176.field4286.length - this.field5176.field4304;
                while (var5 > this.field5154 && var4 > this.field5176.field4283[this.field5154]) {
                    var4 -= this.field5176.field4283[this.field5154];
                    this.field5154++;
                }
                if (var5 <= this.field5154) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field5176.field4286.length; var7++) {
                        var6 += this.field5176.field4283[var7];
                    }
                    var4 %= var6;
                }
                this.field5144 = this.field5154 + 1;
                if (this.field5176.field4286.length <= this.field5144) {
                    this.field5144 -= this.field5176.field4304;
                    if (this.field5144 < 0 || this.field5176.field4286.length <= this.field5144) {
                        this.field5144 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field5176.field4283[this.field5154] >= var4) {
                            this.field5158 = class364.field5010 - var4;
                            this.field5175 = var4;
                            return;
                        }
                        class178.method1275(this.field5154, false, false, this.field5162, arg1, this.field5176, arg0);
                        var4 -= this.field5176.field4283[this.field5154];
                        this.field5154++;
                        if (this.field5176.field4286.length <= this.field5154) {
                            this.field5154 -= this.field5176.field4304;
                            if (this.field5154 < 0 || this.field5176.field4286.length <= this.field5154) {
                                this.field5176 = null;
                                continue label92;
                            }
                        }
                        this.field5144 = this.field5154 + 1;
                    } while (this.field5144 < this.field5176.field4286.length);
                    this.field5144 -= this.field5176.field4304;
                } while (this.field5144 >= 0 && this.field5176.field4286.length > this.field5144);
                this.field5144 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V", line = 342)
    public static void method2286(int arg0) {
        field5177 = null;
        field5147 = null;
        int var1 = -1 % ((arg0 + 30) / 39);
        field5152 = null;
    }

    @OriginalMember(owner = "client!gk", name = "finalize", descriptor = "()V", line = 355)
    protected final void finalize() {
        if (this.field5163 != null) {
            this.field5163.method893();
        }
        field5148++;
    }

    @OriginalMember(owner = "client!gk", name = "<init>", descriptor = "(Lvc;Lnm;IIIIIIZI)V", line = 557)
    public class374(class89 arg0, class267 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field5161 = arg6;
        this.field5156 = arg1.field3887;
        this.field5145 = arg7;
        this.field5172 = arg2;
        this.field5170 = arg8;
        this.field5171 = arg3;
        this.field5160 = (byte) arg5;
        this.field5162 = (byte) arg4;
        this.field5143 = arg0.method291() && arg1.field3876 && !this.field5170;
        if (arg9 != -1) {
            this.field5153 = true;
        }
        this.method2284(-16324, arg9);
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IZLae;)I", line = 383)
    public static final int method2287(int arg0, boolean arg1, class172 arg2) {
        field5159++;
        if (!client.method547(arg2).method871((byte) -113, arg0) && arg2.field2610 == null) {
            return -1;
        } else {
            if (arg1) {
                field5147 = null;
            }
            return arg2.field2475 == null || arg0 >= arg2.field2475.length ? -1 : arg2.field2475[arg0];
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(ILvc;ZIIIZ)Ln;", line = 405)
    public final class468 method2288(int arg0, class89 arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field5150++;
        class267 var8 = class468.field6599.method506(-119, this.field5156);
        if (var8.field3846 != null) {
            var8 = var8.method1799(class416.field5691, (byte) -111);
        }
        if (var8 == null) {
            this.method2278(arg1, 4);
            this.field5164 = this.field5154;
            this.field5168 = -1;
            return null;
        }
        if (!this.field5153 && this.field5168 != var8.field3887) {
            this.field5165 = null;
            this.method2284(arg0 - 16323, -1);
        }
        this.method2285(arg4, arg5, -25534);
        boolean var9 = arg2 & this.field5143 & class99.field1396 != 0;
        boolean var10 = var9 & (this.field5168 != var8.field3887 || (this.field5164 != this.field5154 || this.field5176 != null && (this.field5176.field4282 || class439.field6230) && this.field5154 != this.field5144) && class99.field1396 >= 2);
        if (arg6 && !var10) {
            this.field5168 = var8.field3887;
            this.field5164 = this.field5154;
            return null;
        }
        if (var10) {
            class141.method1021(this.field5151, this.field5160, this.field5161, this.field5145, this.field5169);
        }
        class241 var11 = class340.field4692[this.field5160];
        class241 var12;
        if (this.field5170) {
            var12 = class190.field2858[0];
        } else {
            var12 = this.field5160 < 3 ? class340.field4692[this.field5160 + 1] : null;
        }
        class468 var13 = null;
        if (this.field5176 != null) {
            if (var10) {
                arg3 |= 0x20000;
            }
            var13 = var8.method1801(arg3, arg1, this.field5145, this.field5175, var11, this.field5172 == 11 ? this.field5171 + 4 : this.field5171, true, this.field5161, this.field5144, this.field5176, this.field5172 == 11 ? 10 : this.field5172, var12, var11.method590(this.field5161, this.field5145), this.field5154);
            if (var13 == null) {
                this.field5142 = 0;
                this.field5169 = null;
                this.field5151 = null;
            } else {
                if (var10) {
                    if (this.field5169 == null) {
                        this.field5169 = new boolean[4];
                    }
                    this.field5151 = var13.method1568(this.field5151);
                    class404.method2425(this.field5151, this.field5160, arg5, arg4, this.field5169);
                }
                this.field5142 = var13.method1591();
            }
            this.field5165 = null;
        } else if (this.field5165 != null && arg3 == (this.field5165.method1574() & arg3) && this.field5168 == var8.field3887) {
            var13 = this.field5165;
        } else {
            if (this.field5165 != null) {
                arg3 |= this.field5165.method1574();
            }
            class406 var14 = var8.method1811(this.field5145, true, var12, var10, this.field5172 == 11 ? this.field5171 + 4 : this.field5171, arg3, arg1, this.field5161, this.field5172 == 11 ? 10 : this.field5172, var11.method590(this.field5161, this.field5145), var11);
            if (var14 == null) {
                this.field5151 = null;
                this.field5169 = null;
                this.field5142 = 0;
                this.field5165 = null;
            } else {
                var13 = var14.field5545;
                this.field5165 = var14.field5545;
                if (var10) {
                    this.field5169 = null;
                    this.field5151 = var14.field5541;
                    class404.method2425(this.field5151, this.field5160, arg5, arg4, (boolean[]) null);
                }
                this.field5142 = var13.method1591();
            }
        }
        this.field5164 = this.field5154;
        if (arg0 != -1) {
            this.field5163 = null;
        }
        this.field5145 = arg4;
        this.field5161 = arg5;
        this.field5168 = var8.field3887;
        return var13;
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(IIII)I", line = 532)
    public static final int method2289(int arg0, int arg1, int arg2, int arg3) {
        field5167++;
        if ((class372.field5120[arg2][arg3][arg0] & 0x8) == 0) {
            int var4 = 1 / ((arg1 - 39) / 32);
            return arg2 <= 0 || (class372.field5120[1][arg3][arg0] & 0x2) == 0 ? arg2 : arg2 - 1;
        } else {
            return 0;
        }
    }
}
