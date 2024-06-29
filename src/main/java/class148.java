import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gw")
public abstract class class148 extends class132 {

    @OriginalMember(owner = "client!gw", name = "u", descriptor = "I")
    public int field1823 = -1;

    @OriginalMember(owner = "client!gw", name = "v", descriptor = "Lfk;")
    public class569 field1824;

    @OriginalMember(owner = "client!gw", name = "r", descriptor = "I")
    private int field1820;

    @OriginalMember(owner = "client!gw", name = "n", descriptor = "[[I")
    public int[][] field1816;

    @OriginalMember(owner = "client!gw", name = "o", descriptor = "[[B")
    private byte[][] field1817;

    @OriginalMember(owner = "client!gw", name = "q", descriptor = "[[B")
    private byte[][] field1819;

    @OriginalMember(owner = "client!gw", name = "k", descriptor = "I")
    public int field1813;

    @OriginalMember(owner = "client!gw", name = "l", descriptor = "I")
    public int field1814;

    @OriginalMember(owner = "client!gw", name = "m", descriptor = "I")
    public int field1815;

    @OriginalMember(owner = "client!gw", name = "p", descriptor = "I")
    public int field1818;

    @OriginalMember(owner = "client!gw", name = "w", descriptor = "I")
    public int field1825;

    @OriginalMember(owner = "client!gw", name = "x", descriptor = "I")
    public int field1826;

    @OriginalMember(owner = "client!gw", name = "y", descriptor = "I")
    public int field1827;

    @OriginalMember(owner = "client!gw", name = "z", descriptor = "I")
    public int field1828;

    @OriginalMember(owner = "client!gw", name = "A", descriptor = "I")
    public int field1829;

    @OriginalMember(owner = "client!gw", name = "C", descriptor = "I")
    public int field1831;

    @OriginalMember(owner = "client!gw", name = "E", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!gw", name = "F", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!gw", name = "B", descriptor = "[[Lej;")
    public class105[][] field1830;

    @OriginalMember(owner = "client!gw", name = "s", descriptor = "[[Lnp;")
    public class423[][] field1821;

    @OriginalMember(owner = "client!gw", name = "D", descriptor = "[[Ljw;")
    public class482[][] field1832;

    @OriginalMember(owner = "client!gw", name = "t", descriptor = "[[Lge;")
    public class617[][] field1822;

    @OriginalMember(owner = "client!gw", name = "b", descriptor = "(II)I", line = 8)
    private static final int method879(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Loj;[I)V", line = 36)
    public final void method258(class321 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(I)Z", line = 41)
    public final boolean method880(int arg0) {
        if ((this.field1820 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!gw", name = "aa", descriptor = "(Lw;IIIIZ)V", line = 55)
    public final void method256(class252 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!gw", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 59)
    public final void method252(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field1832 == null) {
            this.field1832 = new class482[super.field1656][super.field1660];
            this.field1821 = new class423[super.field1656][super.field1660];
        } else if (this.field1822 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class348.field4972[class26.method156(124, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class348.field4972[class26.method156(101, arg7[var16]) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field1662 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field1662 && arg4[var22] == super.field1662) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field1662) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field1662 != arg2[var24] && arg2[0] - super.field1662 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field1662 != arg4[var24] && arg4[0] - super.field1662 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class482 var25 = new class482();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field7070 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field7079 = (byte) (var25.field7079 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field1816[arg0 + 1][arg1] == this.field1816[arg0][arg1] && this.field1816[arg0 + 1][arg1 + 1] == this.field1816[arg0][arg1] && this.field1816[arg0][arg1 + 1] == this.field1816[arg0][arg1]) {
                    var25.field7079 = (byte) (var25.field7079 | 1);
                }
                if (var27 != -1 && (var25.field7079 & 2) == 0 && !this.field1824.field8852.method438(103, var27).field8928) {
                    var25.field7075 = this.field1817[arg0][arg1] - this.field1819[arg0][arg1];
                    var25.field7069 = this.field1817[arg0 + 1][arg1] - this.field1819[arg0 + 1][arg1];
                    var25.field7073 = this.field1817[arg0 + 1][arg1 + 1] - this.field1819[arg0 + 1][arg1 + 1];
                    var25.field7076 = this.field1817[arg0][arg1 + 1] - this.field1819[arg0][arg1 + 1];
                    var25.field7072 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field7075 = class496.method2974(method879(arg6[var18] >> 8, this.field1817[arg0][arg1] - this.field1819[arg0][arg1]), var28, 93, arg10);
                    if (var25.field7070 != 0) {
                        var25.field7075 |= 255 - (this.field1817[arg0][arg1] - this.field1819[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field7069 = class496.method2974(method879(arg6[var19] >> 8, this.field1817[arg0 + 1][arg1] - this.field1819[arg0 + 1][arg1]), var29, 53, arg10);
                    if (var25.field7070 != 0) {
                        var25.field7069 |= 255 - (this.field1817[arg0 + 1][arg1] - this.field1819[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field7073 = class496.method2974(method879(arg6[var20] >> 8, this.field1817[arg0 + 1][arg1 + 1] - this.field1819[arg0 + 1][arg1 + 1]), var30, 75, arg10);
                    if (var25.field7070 != 0) {
                        var25.field7073 |= 255 - (this.field1817[arg0 + 1][arg1 + 1] - this.field1819[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field7076 = class496.method2974(method879(arg6[var21] >> 8, this.field1817[arg0][arg1 + 1] - this.field1819[arg0][arg1 + 1]), var31, 63, arg10);
                    if (var25.field7070 != 0) {
                        var25.field7076 |= 255 - (this.field1817[arg0][arg1 + 1] - this.field1819[arg0][arg1 + 1]) << 25;
                    }
                    var25.field7072 = -1;
                }
                if (arg5 != null) {
                    var25.field7078 = (short) arg5[var20];
                    var25.field7074 = (short) arg5[var21];
                    var25.field7071 = (short) arg5[var19];
                    var25.field7077 = (short) arg5[var18];
                }
                this.field1832[arg0][arg1] = var25;
            } else {
                class423 var32 = new class423();
                var32.field6316 = (short) arg2.length;
                var32.field6318 = (short) (arg2.length / 3);
                var32.field6314 = new short[var32.field6316];
                var32.field6319 = new short[var32.field6316];
                var32.field6313 = new short[var32.field6316];
                var32.field6311 = new int[var32.field6316];
                if (arg5 != null) {
                    var32.field6317 = new short[var32.field6316];
                }
                for (int var33 = 0; var33 < var32.field6316; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field1817[arg0][arg1] - this.field1819[arg0][arg1];
                    } else if (var48 == 0 && super.field1662 == var49) {
                        var51 = this.field1817[arg0][arg1 + 1] - this.field1819[arg0][arg1 + 1];
                    } else if (super.field1662 == var48 && super.field1662 == var49) {
                        var51 = this.field1817[arg0 + 1][arg1 + 1] - this.field1819[arg0 + 1][arg1 + 1];
                    } else if (super.field1662 == var48 && var49 == 0) {
                        var51 = this.field1817[arg0 + 1][arg1] - this.field1819[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field1817[arg0 + 1][arg1] - this.field1819[arg0 + 1][arg1]) * var48 + (this.field1817[arg0][arg1] - this.field1819[arg0][arg1]) * (super.field1662 - var48);
                        int var53 = (this.field1817[arg0 + 1][arg1 + 1] - this.field1819[arg0 + 1][arg1 + 1]) * var48 + (this.field1817[arg0][arg1 + 1] - this.field1819[arg0][arg1 + 1]) * (super.field1662 - var48);
                        var51 = (super.field1662 - var49) * var52 + var49 * var53 >> super.field1663 * 2;
                    }
                    int var54 = (arg0 << super.field1663) + var48;
                    int var55 = (arg1 << super.field1663) + var49;
                    var32.field6314[var33] = (short) var48;
                    var32.field6313[var33] = (short) var49;
                    var32.field6319[var33] = (short) (this.method249(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field1824.field8852.method438(76, arg8[var33]).field8928) {
                        var32.field6311[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field6311[var33] = var51 << 25;
                        } else {
                            var32.field6311[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field6317[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field6311[var33] = class496.method2974(method879(arg6[var33] >> 8, var51), var56, 123, arg10);
                        if (arg7 != null) {
                            var32.field6311[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field6318; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field1824.field8852.method438(117, arg8[var35 * 3]).field8928) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field6315 = new int[var32.field6318];
                }
                if (var34) {
                    var32.field6320 = new short[var32.field6318];
                    var32.field6312 = new short[var32.field6318];
                }
                for (int var36 = 0; var36 < var32.field6318; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field6315[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field1824.field8852.method438(64, var42).field8928) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field1824.field8852.method438(68, var43).field8928) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field1824.field8852.method438(65, var44).field8928) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field6320[var36] = (short) var44;
                            var32.field6312[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field1824.field8852.method438(96, var45).field8928) {
                                    var32.field6311[var37] = class348.field4972[class26.method156(100, this.field1824.field8852.method438(74, var45).field8934 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field1824.field8852.method438(70, var46).field8928) {
                                    var32.field6311[var38] = class348.field4972[class26.method156(121, this.field1824.field8852.method438(74, var46).field8934 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field1824.field8852.method438(63, var47).field8928) {
                                    var32.field6311[var39] = class348.field4972[class26.method156(117, this.field1824.field8852.method438(40, var47).field8934 & 65535) & 65535];
                                }
                            }
                            var32.field6320[var36] = -1;
                        }
                    }
                }
                this.field1821[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "c", descriptor = "(IILw;)Lw;", line = 561)
    public final class252 method250(int arg0, int arg1, class252 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!gw", name = "<init>", descriptor = "(Lfk;IIII[[I[[II)V", line = 570)
    public class148(class569 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field1824 = arg0;
        this.field1820 = arg2;
        this.field1816 = arg5;
        this.field1817 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1824.field8191 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1824.field8171 * var18 + this.field1824.field8199 * var16 + this.field1824.field8177 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1817[var11][var10] = (byte) var20;
            }
        }
        this.field1819 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(III[[ZZ)V", line = 621)
    public final void method262(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class597 var6 = this.field1824.field8187;
        this.field1823 = -1;
        this.field1831 = var6.field8715;
        this.field1813 = var6.field8726;
        this.field1818 = var6.field8723;
        this.field1825 = var6.field8717;
        this.field1815 = var6.field8718;
        this.field1834 = var6.field8724;
        this.field1829 = var6.field8719;
        this.field1814 = var6.field8716;
        this.field1827 = var6.field8721;
        this.field1826 = var6.field8720;
        this.field1833 = var6.field8725;
        this.field1828 = var6.field8722;
    }

    @OriginalMember(owner = "client!gw", name = "ba", descriptor = "()V", line = 637)
    public final void method257() {
        this.field1817 = null;
        this.field1819 = null;
    }

    @OriginalMember(owner = "client!gw", name = "FA", descriptor = "(Lw;IIIIZ)V", line = 641)
    public final void method261(class252 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!gw", name = "JA", descriptor = "(II)I", line = 644)
    public final int method259(int arg0, int arg1) {
        return this.field1816[arg0][arg1];
    }

    @OriginalMember(owner = "client!gw", name = "EA", descriptor = "(III)V", line = 647)
    public final void method251(int arg0, int arg1, int arg2) {
        if (this.field1819[arg0][arg1] < arg2) {
            this.field1819[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(Lw;IIIIZ)Z", line = 653)
    public final boolean method248(class252 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!gw", name = "sa", descriptor = "(II)I", line = 660)
    public final int method249(int arg0, int arg1) {
        int var3 = arg0 >> super.field1663;
        int var4 = arg1 >> super.field1663;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field1656 - 1 && var4 <= super.field1660 - 1) {
            int var5 = arg0 & super.field1662 - 1;
            int var6 = arg1 & super.field1662 - 1;
            int var7 = (super.field1662 - var5) * this.field1816[var3][var4] + this.field1816[var3 + 1][var4] * var5 >> super.field1663;
            int var8 = (super.field1662 - var5) * this.field1816[var3][var4 + 1] + this.field1816[var3 + 1][var4 + 1] * var5 >> super.field1663;
            return (super.field1662 - var6) * var7 + var6 * var8 >> super.field1663;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 683)
    public final void method263(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field1822 == null) {
            this.field1822 = new class617[super.field1656][super.field1660];
            this.field1830 = new class105[super.field1656][super.field1660];
        } else if (this.field1832 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field1662 != var20 || var21 != 0 && super.field1662 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class105 var22 = new class105();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field1263 = var23;
            var22.field1255 = new short[var23];
            var22.field1264 = new short[var23];
            var22.field1257 = new short[var23];
            var22.field1261 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field1255[var25] = (short) (this.field1817[arg0][arg1] - this.field1819[arg0][arg1]);
                } else if (var30 == 0 && super.field1662 == var31) {
                    var22.field1255[var25] = (short) (this.field1817[arg0][arg1 + 1] - this.field1819[arg0][arg1 + 1]);
                } else if (super.field1662 == var30 && super.field1662 == var31) {
                    var22.field1255[var25] = (short) (this.field1817[arg0 + 1][arg1 + 1] - this.field1819[arg0 + 1][arg1 + 1]);
                } else if (super.field1662 == var30 && var31 == 0) {
                    var22.field1255[var25] = (short) (this.field1817[arg0 + 1][arg1] - this.field1819[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field1817[arg0 + 1][arg1] - this.field1819[arg0 + 1][arg1]) * var30 + (this.field1817[arg0][arg1] - this.field1819[arg0][arg1]) * (super.field1662 - var30);
                    int var33 = (this.field1817[arg0 + 1][arg1 + 1] - this.field1819[arg0 + 1][arg1 + 1]) * var30 + (this.field1817[arg0][arg1 + 1] - this.field1819[arg0][arg1 + 1]) * (super.field1662 - var30);
                    var22.field1255[var25] = (short) ((super.field1662 - var31) * var32 + var31 * var33 >> super.field1663 * 2);
                }
                int var34 = (arg0 << super.field1663) + var30;
                int var35 = (arg1 << super.field1663) + var31;
                var22.field1264[var25] = (short) var30;
                var22.field1261[var25] = (short) var31;
                var22.field1257[var25] = (short) (this.method249(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field1255[var25] < 2) {
                    var22.field1255[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field1824.field8852.method438(110, arg11[var28]).field8928) {
                    var26 = true;
                }
            }
            var22.field1256 = new int[var27];
            if (arg10 != null) {
                var22.field1266 = new int[var27];
            }
            var22.field1259 = new short[var27];
            var22.field1265 = new short[var27];
            var22.field1262 = new short[var27];
            if (var26) {
                var22.field1258 = new short[var27];
                var22.field1260 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field1256[var22.field1267] = class26.method156(125, arg9[var29]);
                    } else {
                        var22.field1256[var22.field1267] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field1266[var22.field1267] = class26.method156(120, arg10[var29]);
                        } else {
                            var22.field1266[var22.field1267] = -1;
                        }
                    }
                    var22.field1259[var22.field1267] = (short) arg6[var29];
                    var22.field1265[var22.field1267] = (short) arg7[var29];
                    var22.field1262[var22.field1267] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field1824.field8852.method438(46, arg11[var29]).field8928) {
                            var22.field1258[var22.field1267] = (short) arg11[var29];
                            var22.field1260[var22.field1267] = (short) arg12[var29];
                        } else {
                            var22.field1258[var22.field1267] = -1;
                        }
                    }
                    ++var22.field1267;
                }
            }
            this.field1830[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class617 var36 = new class617();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field8966 = class326.method2114(this.field1817[arg0][arg1] - this.field1819[arg0][arg1], (byte) -42, class26.method156(113, arg10[0]));
                    if (var37 == -1) {
                        var36.field8968 = (byte) (var36.field8968 | 2);
                    }
                }
                if (this.field1816[arg0 + 1][arg1] == this.field1816[arg0][arg1] && this.field1816[arg0 + 1][arg1 + 1] == this.field1816[arg0][arg1] && this.field1816[arg0][arg1 + 1] == this.field1816[arg0][arg1]) {
                    var36.field8968 = (byte) (var36.field8968 | 1);
                }
                if (var38 != -1 && (var36.field8968 & 2) == 0 && !this.field1824.field8852.method438(88, var38).field8928) {
                    var36.field8971 = (short) (this.field1817[arg0][arg1] - this.field1819[arg0][arg1]);
                    var36.field8970 = (short) (this.field1817[arg0 + 1][arg1] - this.field1819[arg0 + 1][arg1]);
                    var36.field8965 = (short) (this.field1817[arg0 + 1][arg1 + 1] - this.field1819[arg0 + 1][arg1 + 1]);
                    var36.field8967 = (short) (this.field1817[arg0][arg1 + 1] - this.field1819[arg0][arg1 + 1]);
                    var36.field8969 = (short) var38;
                } else {
                    short var39 = class26.method156(116, var37);
                    var36.field8971 = (short) class326.method2114(this.field1817[arg0][arg1] - this.field1819[arg0][arg1], (byte) -42, var39);
                    var36.field8970 = (short) class326.method2114(this.field1817[arg0 + 1][arg1] - this.field1819[arg0 + 1][arg1], (byte) -42, var39);
                    var36.field8965 = (short) class326.method2114(this.field1817[arg0 + 1][arg1 + 1] - this.field1819[arg0 + 1][arg1 + 1], (byte) -42, var39);
                    var36.field8967 = (short) class326.method2114(this.field1817[arg0][arg1 + 1] - this.field1819[arg0][arg1 + 1], (byte) -42, var39);
                    var36.field8969 = -1;
                }
                this.field1822[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(II)V")
    public abstract void method254(int arg0, int arg1);

    @OriginalMember(owner = "client!gw", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);
}
