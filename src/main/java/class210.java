import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class210 {

    @OriginalMember(owner = "client!ui", name = "k", descriptor = "I")
    private int field3195 = -1;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "I")
    private int field3205 = 0;

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "I")
    private int field3209 = 0;

    @OriginalMember(owner = "client!ui", name = "j", descriptor = "I")
    private int field3194 = -1;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "Z")
    private boolean field3219 = false;

    @OriginalMember(owner = "client!ui", name = "M", descriptor = "Z")
    private boolean field3223 = false;

    @OriginalMember(owner = "client!ui", name = "h", descriptor = "I")
    private int field3192 = -1;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "I")
    public int field3212;

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public int field3203;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "B")
    private byte field3211;

    @OriginalMember(owner = "client!ui", name = "i", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "I")
    private int field3213;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "B")
    private byte field3199;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    private int field3220;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "Z")
    private boolean field3187;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "[I")
    public static int[] field3188 = new int[14];

    @OriginalMember(owner = "client!ui", name = "l", descriptor = "I")
    public static int field3196 = 0;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "I")
    public static int field3198 = 0;

    @OriginalMember(owner = "client!ui", name = "D", descriptor = "F")
    public static float field3214;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field3186;

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    private int field3190;

    @OriginalMember(owner = "client!ui", name = "g", descriptor = "I")
    public static int field3191;

    @OriginalMember(owner = "client!ui", name = "m", descriptor = "I")
    private int field3197;

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "I")
    public static int field3200;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "I")
    private int field3202;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public static int field3204;

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "I")
    private int field3208;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "I")
    public static int field3216;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "I")
    public static int field3217;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!ui", name = "N", descriptor = "I")
    public static int field3224;

    @OriginalMember(owner = "client!ui", name = "O", descriptor = "I")
    public static int field3225;

    @OriginalMember(owner = "client!ui", name = "P", descriptor = "Las;")
    private class138 field3226;

    @OriginalMember(owner = "client!ui", name = "L", descriptor = "Lgp;")
    public class45 field3222;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "Lha;")
    private class54 field3221;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "Lda;")
    private class55 field3207;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "[Z")
    private boolean[] field3185;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLr;)V")
    public final void method1463(boolean arg0, class167 arg1) {
        if (this.field3221 != null) {
            class474.method2840(this.field3221, this.field3211, this.field3220, this.field3213, this.field3185);
            this.field3185 = null;
            this.field3221 = null;
        }
        field3216++;
        if (arg0) {
            this.field3211 = 11;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lr;I)V")
    public final void method1464(class167 arg0, int arg1) {
        this.method1470(262144, (byte) 92, this.field3213, arg0, true, true, this.field3220);
        if (arg1 == -1) {
            field3218++;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static final void method1465(int arg0) {
        field3224++;
        for (int var1 = arg0; var1 < 100; var1++) {
            class588.field8472[var1] = null;
        }
        class32.field960 = 0;
    }

    @OriginalMember(owner = "client!ui", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        field3189++;
        if (this.field3222 != null) {
            this.field3222.method588();
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)V")
    private final void method1466(int arg0, int arg1, int arg2) {
        field3225++;
        if (arg0 < 103) {
            return;
        }
        label90: while (true) {
            if (this.field3226 == null) {
                if (this.field3219) {
                    return;
                }
                this.method1475(-1, -6049);
                if (this.field3226 == null) {
                    return;
                }
            }
            int var4 = class336.field5031 - this.field3190;
            if (var4 > 100 && this.field3226.field2427 > 0) {
                int var5 = this.field3226.field2440.length - this.field3226.field2427;
                while (this.field3208 < var5 && var4 > this.field3226.field2431[this.field3208]) {
                    var4 -= this.field3226.field2431[this.field3208];
                    this.field3208++;
                }
                if (var5 <= this.field3208) {
                    int var6 = 0;
                    for (int var7 = var5; var7 < this.field3226.field2440.length; var7++) {
                        var6 += this.field3226.field2431[var7];
                    }
                    var4 %= var6;
                }
                this.field3202 = this.field3208 + 1;
                if (this.field3202 >= this.field3226.field2440.length) {
                    this.field3202 -= this.field3226.field2427;
                    if (this.field3202 < 0 || this.field3226.field2440.length <= this.field3202) {
                        this.field3202 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field3226.field2431[this.field3208] >= var4) {
                            this.field3190 = class336.field5031 - var4;
                            this.field3197 = var4;
                            return;
                        }
                        class536.method3101(this.field3208, (byte) 124, this.field3226, arg2, arg1, this.field3199, false);
                        var4 -= this.field3226.field2431[this.field3208];
                        this.field3208++;
                        if (this.field3208 >= this.field3226.field2440.length) {
                            this.field3208 -= this.field3226.field2427;
                            if (this.field3208 < 0 || this.field3226.field2440.length <= this.field3208) {
                                this.field3226 = null;
                                continue label90;
                            }
                        }
                        this.field3202 = this.field3208 + 1;
                    } while (this.field3226.field2440.length > this.field3202);
                    this.field3202 -= this.field3226.field2427;
                } while (this.field3202 >= 0 && this.field3202 < this.field3226.field2440.length);
                this.field3202 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(I)I")
    public final int method1467(int arg0) {
        if (arg0 != 0) {
            this.field3208 = -53;
        }
        field3200++;
        return this.field3205;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(B)Z")
    public final boolean method1468(byte arg0) {
        field3206++;
        return arg0 < 30 ? true : this.field3187;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(II)V")
    public final void method1469(int arg0, int arg1) {
        this.field3219 = true;
        field3210++;
        if (arg1 != 17601) {
            this.method1472(61);
        }
        this.method1475(arg0, -6049);
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IBILr;ZZI)Lda;")
    public final class55 method1470(int arg0, byte arg1, int arg2, class167 arg3, boolean arg4, boolean arg5, int arg6) {
        field3186++;
        if (arg1 <= 70) {
            return null;
        }
        class56 var8 = class237.field3521.method3515(this.field3212, 50);
        if (var8.field1248 != null) {
            var8 = var8.method662(3433, class113.field2038);
        }
        if (var8 == null) {
            this.method1463(false, arg3);
            this.field3195 = -1;
            this.field3192 = -1;
            this.field3194 = -1;
            return null;
        }
        if (!this.field3219 && this.field3192 != var8.field1272) {
            this.field3207 = null;
            this.method1475(-1, -6049);
        }
        this.method1466(120, arg6, arg2);
        if (arg5) {
            boolean var9 = arg5 & this.field3187 & class527.field7429.method1211(class90.field1654, (byte) 36) != 0;
            arg5 = var9 & (this.field3194 != var8.field1272 || this.field3226 != null && class527.field7429.method1211(class90.field1654, (byte) 36) >= 2 && (this.field3208 != this.field3195 || (this.field3226.field2439 || class537.field7512) && this.field3208 != this.field3202));
        }
        if (arg4 && !arg5) {
            this.field3192 = var8.field1272;
            return null;
        }
        if (arg5) {
            class474.method2840(this.field3221, this.field3211, this.field3220, this.field3213, this.field3185);
            this.field3194 = -1;
            this.field3195 = -1;
        }
        class37 var10 = class485.field6947[this.field3211];
        class37 var11;
        if (this.field3223) {
            var11 = class185.field2987[0];
        } else {
            var11 = this.field3211 < 3 ? class485.field6947[this.field3211 + 1] : null;
        }
        class55 var12 = null;
        if (this.field3226 != null) {
            if (arg5) {
                arg0 |= 0x40000;
            }
            var12 = var8.method653(var11, this.field3197, arg3, var10, this.field3202, this.field3220, -24075, arg0, this.field3208, this.field3193 == 11 ? 10 : this.field3193, this.field3193 == 11 ? this.field3203 + 4 : this.field3203, var10.method552(1, this.field3220, this.field3213), this.field3213, this.field3226);
            if (var12 == null) {
                this.field3221 = null;
                this.field3205 = 0;
                this.field3209 = 0;
                this.field3185 = null;
            } else {
                if (arg5) {
                    if (this.field3185 == null) {
                        this.field3185 = new boolean[4];
                    }
                    this.field3221 = var12.method311(this.field3221);
                    class307.method2011(this.field3221, this.field3211, arg6, arg2, this.field3185);
                    this.field3194 = var8.field1272;
                    this.field3195 = this.field3208;
                }
                this.field3205 = var12.method315();
                this.field3209 = var12.method368();
            }
            this.field3207 = null;
        } else if (this.field3207 != null && (this.field3207.method352() & arg0) == arg0 && this.field3192 == var8.field1272) {
            var12 = this.field3207;
        } else {
            if (this.field3207 != null) {
                arg0 |= this.field3207.method352();
            }
            class371 var13 = var8.method655(arg5, var11, this.field3220, arg0, this.field3193 == 11 ? this.field3203 + 4 : this.field3203, this.field3193 == 11 ? 10 : this.field3193, var10.method552(1, this.field3220, this.field3213), arg3, true, var10, this.field3213);
            if (var13 == null) {
                this.field3207 = null;
                this.field3209 = 0;
                this.field3205 = 0;
                this.field3221 = null;
                this.field3185 = null;
            } else {
                var12 = var13.field5508;
                this.field3207 = var13.field5508;
                if (arg5) {
                    this.field3221 = var13.field5512;
                    this.field3185 = null;
                    class307.method2011(this.field3221, this.field3211, arg6, arg2, null);
                    this.field3194 = var8.field1272;
                    this.field3195 = -1;
                }
                this.field3205 = var12.method315();
                this.field3209 = var12.method368();
            }
        }
        this.field3220 = arg6;
        this.field3192 = var8.field1272;
        this.field3213 = arg2;
        return var12;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLjava/lang/String;BLjava/lang/String;)V")
    public static final void method1471(boolean arg0, String arg1, byte arg2, String arg3) {
        class477.field6864 = arg0;
        class362.field5384 = arg1;
        field3217++;
        class284.field4229 = arg3;
        if (!class477.field6864 && class37.field1050 != 3 && class362.field5384.equals("") || class284.field4229.equals("")) {
            class705.method3936(3, false);
            return;
        }
        class310.field4624 = false;
        int var4 = 40 / ((arg2 + 74) / 49);
        if (class37.field1050 != 1) {
            class405.field5850 = -1;
            class531.field7452 = 0;
        }
        class705.method3936(-3, false);
        class302.field4507 = 0;
        class183.field2942 = 1;
        class392.field5749 = 0;
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(I)I")
    public final int method1472(int arg0) {
        field3201++;
        int var2 = 44 % ((arg0 - 71) / 39);
        return this.field3209;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(IIILr;Lq;ILda;IZ)V")
    public final void method1473(int arg0, int arg1, int arg2, class167 arg3, class396 arg4, int arg5, class55 arg6, int arg7, boolean arg8) {
        field3191++;
        if (arg7 != 0) {
            this.field3219 = false;
        }
        class317[] var10 = arg6.method362();
        class146[] var11 = arg6.method348();
        if ((this.field3222 == null || this.field3222.field1104) && (var10 != null || var11 != null)) {
            class56 var12 = class237.field3521.method3515(this.field3212, 50);
            if (var12.field1248 != null) {
                var12 = var12.method662(arg7 + 3433, class113.field2038);
            }
            if (var12 != null) {
                this.field3222 = class45.method587(class336.field5031, true);
            }
        }
        if (this.field3222 == null) {
            return;
        }
        arg6.method313(arg4);
        if (arg8) {
            this.field3222.method589(arg3, (long) class336.field5031, var10, var11, false);
        } else {
            this.field3222.method590((long) class336.field5031);
        }
        this.field3222.method578(this.field3199, arg0, arg1, arg5, arg2);
    }

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "(I)V")
    public static void method1474(int arg0) {
        field3188 = null;
        if (arg0 >= -98) {
            field3204 = 4;
        }
    }

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "(II)V")
    private final void method1475(int arg0, int arg1) {
        field3215++;
        int var3 = arg0;
        boolean var4 = false;
        if (arg0 == -1) {
            class56 var5 = class237.field3521.method3515(this.field3212, arg1 ^ 0xFFFFE86D);
            class56 var6 = var5;
            if (var5.field1248 != null) {
                var5 = var5.method662(3433, class113.field2038);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field1246 != null) {
                if (this.field3226 != null && var5.method657((byte) 46, this.field3226.field2443)) {
                    return;
                }
                var3 = var5.method656(126);
                if (this.field3192 != var5.field1272) {
                    var4 = var5.field1263;
                }
            } else if (var5.field1291 == -1) {
                if (var6 != null && var6.field1246 != null) {
                    if (this.field3226 != null && var6.method657((byte) 99, this.field3226.field2443)) {
                        return;
                    }
                    var3 = var6.method656(arg1 + 6160);
                    if (this.field3192 != var6.field1272) {
                        var4 = var6.field1263;
                    }
                } else if (var6 != null && var6.field1291 != -1 && this.field3192 != var6.field1272) {
                    var3 = var6.field1291;
                    var4 = var6.field1263;
                }
            } else if (this.field3192 != var5.field1272) {
                var4 = var5.field1263;
                var3 = var5.field1291;
            }
        }
        if (var3 == -1) {
            this.field3226 = null;
            return;
        }
        this.field3207 = null;
        if (this.field3226 == null || this.field3226.field2443 != var3) {
            this.field3226 = class357.field5338.method2099(var3, true);
        } else if (this.field3226.field2434 == 0) {
            return;
        }
        if (this.field3226.field2440 == null) {
            this.field3226 = null;
            return;
        }
        if (arg1 != -6049) {
            field3198 = 120;
        }
        if (var4) {
            this.field3208 = (int) (Math.random() * (double) this.field3226.field2440.length);
            this.field3197 = (int) (Math.random() * (double) this.field3226.field2431[this.field3208]) + 1;
        } else {
            this.field3197 = 1;
            this.field3208 = 0;
        }
        this.field3202 = this.field3208 + 1;
        if (this.field3202 < 0 || this.field3202 >= this.field3226.field2440.length) {
            this.field3202 = -1;
        }
        this.field3190 = class336.field5031 - this.field3197;
    }

    @OriginalMember(owner = "client!ui", name = "<init>", descriptor = "(Lr;Lbd;IIIIIIZI)V")
    public class210(class167 arg0, class56 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9) {
        this.field3212 = arg1.field1272;
        this.field3203 = arg3;
        this.field3211 = (byte) arg5;
        this.field3193 = arg2;
        this.field3223 = arg8;
        this.field3213 = arg7;
        this.field3199 = (byte) arg4;
        this.field3220 = arg6;
        this.field3187 = arg0.method171() && arg1.field1280 && !this.field3223;
        if (arg9 != -1) {
            this.field3219 = true;
        }
        this.method1475(arg9, -6049);
    }
}
