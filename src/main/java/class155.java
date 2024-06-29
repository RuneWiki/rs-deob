import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class155 {

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    private int field2195 = 0;

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "Z")
    private boolean field2200 = false;

    @OriginalMember(owner = "client!nq", name = "p", descriptor = "Z")
    private boolean field2204 = false;

    @OriginalMember(owner = "client!nq", name = "r", descriptor = "I")
    private int field2206 = 0;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "I")
    private int field2194 = -1;

    @OriginalMember(owner = "client!nq", name = "u", descriptor = "I")
    private int field2209 = -1;

    @OriginalMember(owner = "client!nq", name = "z", descriptor = "I")
    private int field2214 = -1;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "Lcaa;")
    private class538 field2197;

    @OriginalMember(owner = "client!nq", name = "F", descriptor = "I")
    public int field2220;

    @OriginalMember(owner = "client!nq", name = "o", descriptor = "B")
    private byte field2203;

    @OriginalMember(owner = "client!nq", name = "s", descriptor = "I")
    public int field2207;

    @OriginalMember(owner = "client!nq", name = "x", descriptor = "B")
    private byte field2212;

    @OriginalMember(owner = "client!nq", name = "J", descriptor = "I")
    public int field2224;

    @OriginalMember(owner = "client!nq", name = "v", descriptor = "Z")
    private boolean field2210;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "[[B")
    public static byte[][] field2192 = new byte[50][];

    @OriginalMember(owner = "client!nq", name = "y", descriptor = "I")
    public static int field2213 = 0;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "I")
    private int field2189;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    private int field2190;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field2191;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!nq", name = "q", descriptor = "I")
    public static int field2205;

    @OriginalMember(owner = "client!nq", name = "t", descriptor = "I")
    public static int field2208;

    @OriginalMember(owner = "client!nq", name = "w", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!nq", name = "B", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!nq", name = "C", descriptor = "I")
    public static int field2217;

    @OriginalMember(owner = "client!nq", name = "D", descriptor = "I")
    private int field2218;

    @OriginalMember(owner = "client!nq", name = "G", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!nq", name = "H", descriptor = "I")
    private int field2222;

    @OriginalMember(owner = "client!nq", name = "I", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!nq", name = "n", descriptor = "Lkv;")
    public class16 field2202;

    @OriginalMember(owner = "client!nq", name = "E", descriptor = "Lda;")
    private class395 field2219;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "Lha;")
    private class425 field2193;

    @OriginalMember(owner = "client!nq", name = "A", descriptor = "Lhq;")
    private class47 field2215;

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "[Z")
    private boolean[] field2198;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZLr;)V", line = 3)
    public final void method1100(boolean arg0, class98 arg1) {
        field2211++;
        this.method1110((byte) -104, true, arg1, true, 262144);
        if (arg0) {
            this.method1107(-50, 2, 68, 48, null, -43, null, true, null);
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)I", line = 14)
    public final int method1101(byte arg0) {
        field2196++;
        return arg0 == 108 ? this.field2195 : 29;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)I", line = 26)
    public final int method1102(int arg0) {
        if (arg0 != -26609) {
            this.field2190 = 89;
        }
        field2201++;
        return this.field2206;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(II)V", line = 37)
    private final void method1103(int arg0, int arg1) {
        field2199++;
        int var3 = arg1;
        boolean var4 = false;
        if (arg0 == arg1) {
            class289 var5 = class60.field965.method2596(0, this.field2220);
            class289 var6 = var5;
            if (var5.field4213 != null) {
                var5 = var5.method1788(class308.field4545, -92);
            }
            if (var5 == null) {
                return;
            }
            if (var5 == var6) {
                var6 = null;
            }
            if (var5.field4236 != null) {
                if (this.field2215 != null && var5.method1784(false, this.field2215.field752)) {
                    return;
                }
                var3 = var5.method1789((byte) -33);
                if (this.field2194 != var5.field4224) {
                    var4 = var5.field4190;
                }
            } else if (var5.field4214 == -1) {
                if (var6 != null && var6.field4236 != null) {
                    if (this.field2215 != null && var6.method1784(false, this.field2215.field752)) {
                        return;
                    }
                    var3 = var6.method1789((byte) -33);
                    if (this.field2194 != var6.field4224) {
                        var4 = var6.field4190;
                    }
                } else if (var6 != null && var6.field4214 != -1 && this.field2194 != var6.field4224) {
                    var3 = var6.field4214;
                    var4 = var6.field4190;
                }
            } else if (this.field2194 != var5.field4224) {
                var3 = var5.field4214;
                var4 = var5.field4190;
            }
        }
        if (var3 == -1) {
            this.field2215 = null;
            return;
        }
        this.field2219 = null;
        if (this.field2215 == null || this.field2215.field752 != var3) {
            this.field2215 = class203.field2769.method2971(-67, var3);
        } else if (this.field2215.field725 == 0) {
            return;
        }
        if (this.field2215.field732 == null) {
            this.field2215 = null;
            return;
        }
        if (var4) {
            this.field2218 = (int) (Math.random() * (double) this.field2215.field732.length);
            this.field2189 = (int) ((double) this.field2215.field729[this.field2218] * Math.random()) + 1;
        } else {
            this.field2189 = 1;
            this.field2218 = 0;
        }
        this.field2222 = this.field2218 + 1;
        if (this.field2222 < 0 || this.field2222 >= this.field2215.field732.length) {
            this.field2222 = -1;
        }
        this.field2190 = class45.field685 - this.field2189;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(Lcaa;Z)V", line = 174)
    private final void method1104(class538 arg0, boolean arg1) {
        if (arg1) {
            method1108((byte) -106);
        }
        field2208++;
        label92: while (true) {
            if (this.field2215 == null) {
                if (this.field2204) {
                    return;
                }
                this.method1103(-1, -1);
                if (this.field2215 == null) {
                    return;
                }
            }
            int var3 = class45.field685 - this.field2190;
            if (var3 > 100 && this.field2215.field730 > 0) {
                int var4 = this.field2215.field732.length - this.field2215.field730;
                while (this.field2218 < var4 && this.field2215.field729[this.field2218] < var3) {
                    var3 -= this.field2215.field729[this.field2218];
                    this.field2218++;
                }
                if (var4 <= this.field2218) {
                    int var5 = 0;
                    for (int var6 = var4; var6 < this.field2215.field732.length; var6++) {
                        var5 += this.field2215.field729[var6];
                    }
                    var3 %= var5;
                }
                this.field2222 = this.field2218 + 1;
                if (this.field2222 >= this.field2215.field732.length) {
                    this.field2222 -= this.field2215.field730;
                    if (this.field2222 < 0 || this.field2222 >= this.field2215.field732.length) {
                        this.field2222 = -1;
                    }
                }
            }
            while (true) {
                do {
                    do {
                        if (this.field2215.field729[this.field2218] >= var3) {
                            this.field2190 = class45.field685 - var3;
                            this.field2189 = var3;
                            return;
                        }
                        class620.method3567(arg0, this.field2218, this.field2215, (byte) -52);
                        var3 -= this.field2215.field729[this.field2218];
                        this.field2218++;
                        if (this.field2218 >= this.field2215.field732.length) {
                            this.field2218 -= this.field2215.field730;
                            if (this.field2218 < 0 || this.field2218 >= this.field2215.field732.length) {
                                this.field2215 = null;
                                continue label92;
                            }
                        }
                        this.field2222 = this.field2218 + 1;
                    } while (this.field2215.field732.length > this.field2222);
                    this.field2222 -= this.field2215.field730;
                } while (this.field2222 >= 0 && this.field2215.field732.length > this.field2222);
                this.field2222 = -1;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Lr;Llt;IIIILcaa;ZI)V", line = 536)
    public class155(class98 arg0, class289 arg1, int arg2, int arg3, int arg4, int arg5, class538 arg6, boolean arg7, int arg8) {
        this.field2197 = arg6;
        this.field2220 = arg1.field4224;
        this.field2203 = (byte) arg5;
        this.field2200 = arg7;
        this.field2207 = arg2;
        this.field2212 = (byte) arg4;
        this.field2224 = arg3;
        this.field2210 = arg0.method671() && arg1.field4219 && !this.field2200;
        if (arg8 != -1) {
            this.field2204 = true;
        }
        this.method1103(-1, arg8);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I)Z", line = 281)
    public final boolean method1105(int arg0) {
        if (arg0 != -1) {
            this.finalize();
        }
        field2205++;
        return this.field2210;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILi;)V", line = 298)
    public static final void method1106(int arg0, class682 arg1) {
        class178.field2480[arg0] = arg1;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(IIIILr;ILq;ZLda;)V", line = 302)
    public final void method1107(int arg0, int arg1, int arg2, int arg3, class98 arg4, int arg5, class151 arg6, boolean arg7, class395 arg8) {
        field2191++;
        class30[] var10 = arg8.method1057();
        class586[] var11 = arg8.method1058();
        if ((this.field2202 == null || this.field2202.field339) && (var10 != null || var11 != null)) {
            class289 var12 = class60.field965.method2596(0, this.field2220);
            if (var12.field4213 != null) {
                var12 = var12.method1788(class308.field4545, -52);
            }
            if (var12 != null) {
                this.field2202 = class16.method120(class45.field685, true);
            }
        }
        if (arg1 != -29008) {
            method1108((byte) -110);
        }
        if (this.field2202 == null) {
            return;
        }
        arg8.method1032(arg6);
        if (arg7) {
            this.field2202.method110(arg4, (long) class45.field685, var10, var11, false);
        } else {
            this.field2202.method113((long) class45.field685);
        }
        this.field2202.method109(this.field2212, arg2, arg3, arg5, arg0);
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(B)V", line = 346)
    public static void method1108(byte arg0) {
        int var1 = 103 % ((arg0 - 22) / 57);
        field2192 = null;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ILr;)V", line = 369)
    public final void method1109(int arg0, class98 arg1) {
        field2223++;
        if (this.field2193 != null) {
            class91.method508(this.field2193, this.field2203, this.field2197.field7895, this.field2197.field7896, this.field2198);
            this.field2198 = null;
            this.field2193 = null;
        }
        if (arg0 != 0) {
            this.field2219 = null;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BZLr;ZI)Lda;", line = 393)
    public final class395 method1110(byte arg0, boolean arg1, class98 arg2, boolean arg3, int arg4) {
        field2221++;
        class289 var6 = class60.field965.method2596(0, this.field2220);
        if (var6.field4213 != null) {
            var6 = var6.method1788(class308.field4545, -58);
        }
        if (var6 == null) {
            this.method1109(arg0 + 104, arg2);
            this.field2194 = -1;
            this.field2214 = -1;
            this.field2209 = -1;
            return null;
        }
        if (!this.field2204 && this.field2194 != var6.field4224) {
            this.field2219 = null;
            this.method1103(-1, -1);
        }
        this.method1104(this.field2197, false);
        if (arg1) {
            boolean var7 = arg1 & this.field2210 & class335.field4872.method3786(class62.field996, false) != 0;
            arg1 = var7 & (this.field2209 != var6.field4224 || this.field2215 != null && class335.field4872.method3786(class62.field996, false) >= 2 && (this.field2218 != this.field2214 || (this.field2215.field748 || class59.field959) && this.field2222 != this.field2218));
        }
        if (arg3 && !arg1) {
            this.field2194 = var6.field4224;
            return null;
        }
        if (arg1) {
            class91.method508(this.field2193, this.field2203, this.field2197.field7895, this.field2197.field7896, this.field2198);
            this.field2214 = -1;
            this.field2209 = -1;
        }
        class682 var8 = class178.field2480[this.field2203];
        if (arg0 != -104) {
            this.finalize();
        }
        class682 var9;
        if (this.field2200) {
            var9 = class262.field3404[0];
        } else {
            var9 = this.field2203 < 3 ? class178.field2480[this.field2203 + 1] : null;
        }
        class395 var10 = null;
        if (this.field2215 != null) {
            if (arg1) {
                arg4 |= 0x40000;
            }
            var10 = var6.method1785(var8, 127, var8.method3824(this.field2197.field7895, 110, this.field2197.field7896), this.field2215, var9, this.field2197.field7895, arg2, this.field2222, this.field2197.field7896, this.field2218, this.field2207 == 11 ? 10 : this.field2207, this.field2207 == 11 ? this.field2224 + 4 : this.field2224, this.field2189, arg4);
            if (var10 == null) {
                this.field2206 = 0;
                this.field2193 = null;
                this.field2195 = 0;
                this.field2198 = null;
            } else {
                if (arg1) {
                    if (this.field2198 == null) {
                        this.field2198 = new boolean[4];
                    }
                    this.field2193 = var10.method1031(this.field2193);
                    class445.method2628(this.field2193, this.field2203, this.field2197.field7895, this.field2197.field7896, this.field2198);
                    this.field2209 = var6.field4224;
                    this.field2214 = this.field2218;
                }
                this.field2206 = var10.method1007();
                this.field2195 = var10.method1018();
            }
            this.field2219 = null;
        } else if (this.field2219 != null && arg4 == (arg4 & this.field2219.method1027()) && this.field2194 == var6.field4224) {
            var10 = this.field2219;
        } else {
            if (this.field2219 != null) {
                arg4 |= this.field2219.method1027();
            }
            class193 var11 = var6.method1781(this.field2207 == 11 ? this.field2224 + 4 : this.field2224, var8, 19886, arg4, var9, var8.method3824(this.field2197.field7895, 121, this.field2197.field7896), this.field2207 == 11 ? 10 : this.field2207, this.field2197.field7896, arg1, arg2, this.field2197.field7895);
            if (var11 == null) {
                this.field2219 = null;
                this.field2206 = 0;
                this.field2193 = null;
                this.field2195 = 0;
                this.field2198 = null;
            } else {
                var10 = var11.field2594;
                this.field2219 = var11.field2594;
                if (arg1) {
                    this.field2193 = var11.field2595;
                    this.field2198 = null;
                    class445.method2628(this.field2193, this.field2203, this.field2197.field7895, this.field2197.field7896, null);
                    this.field2214 = -1;
                    this.field2209 = var6.field4224;
                }
                this.field2206 = var10.method1007();
                this.field2195 = var10.method1018();
            }
        }
        this.field2194 = var6.field4224;
        return var10;
    }

    @OriginalMember(owner = "client!nq", name = "finalize", descriptor = "()V", line = 556)
    protected final void finalize() {
        if (this.field2202 != null) {
            this.field2202.method108();
        }
        field2216++;
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(II)V", line = 567)
    public final void method1111(int arg0, int arg1) {
        this.field2204 = true;
        field2217++;
        this.method1103(arg1, arg0);
    }
}
