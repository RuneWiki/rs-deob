import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class9 {

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "[I")
    private int[] field121;

    @OriginalMember(owner = "client!aa", name = "e", descriptor = "[I")
    private int[] field117;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "[B")
    private byte[] field113;

    @OriginalMember(owner = "client!aa", name = "c", descriptor = "I")
    public static int field115 = 0;

    @OriginalMember(owner = "client!aa", name = "f", descriptor = "I")
    public static int field118 = 0;

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "Lfd;")
    public static class243 field114 = new class243(128);

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "Lwm;")
    public static class152 field124 = class157.method1048(")4p=", 112);

    @OriginalMember(owner = "client!aa", name = "d", descriptor = "I")
    public static int field116;

    @OriginalMember(owner = "client!aa", name = "g", descriptor = "I")
    public static int field119;

    @OriginalMember(owner = "client!aa", name = "h", descriptor = "I")
    public static int field120;

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "I")
    public static int field122;

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(III)V", line = 4)
    public static final void method43(int arg0, int arg1, int arg2) {
        field116++;
        int var3 = -39 % ((22 - arg1) / 63);
        for (int var4 = 0; var4 < class297.field5076; var4++) {
            class137 var5 = class314.method2194(4, var4);
            if (var5 != null) {
                int var6 = var5.field2088;
                if (var6 >= 0 && !class181.field2878.method1774(-57, var6)) {
                    var6 = -1;
                }
                int var10;
                if (var5.field2108 >= 0) {
                    int var7 = var5.field2108;
                    int var8 = (var7 & 0x7F) + arg2;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg0 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var10 = class181.field2885[class302.method2111(96, var9, (byte) -105)];
                } else if (var6 >= 0) {
                    var10 = class181.field2885[class302.method2111(96, class181.field2878.method1773(var6, (byte) 78), (byte) -124)];
                } else if (var5.field2097 == -1) {
                    var10 = -1;
                } else {
                    int var11 = var5.field2097;
                    int var12 = (var11 & 0x7F) + arg2;
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 127) {
                        var12 = 127;
                    }
                    int var13 = (arg0 + var11 & 0xFC00) + (var11 & 0x380) + var12;
                    var10 = class181.field2885[class302.method2111(96, var13, (byte) -111)];
                }
                class322.field5630[var4 + 1] = var10;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I[BI[BZI)I", line = 95)
    public final int method44(int arg0, byte[] arg1, int arg2, byte[] arg3, boolean arg4, int arg5) {
        field122++;
        if (arg2 == 0) {
            return 0;
        }
        int var7 = arg0 + arg2;
        int var8 = 0;
        if (arg4) {
            this.method47(74, (byte) 71, 127, -96, (byte[]) null, (byte[]) null);
        }
        int var9 = arg5;
        while (true) {
            byte var10 = arg1[var9];
            if (var10 < 0) {
                var8 = this.field121[var8];
            } else {
                var8++;
            }
            int var11;
            if ((var11 = this.field121[var8]) < 0) {
                arg3[arg0++] = (byte) (~var11);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field121[var8];
            }
            int var12;
            if ((var12 = this.field121[var8]) < 0) {
                arg3[arg0++] = (byte) (~var12);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field121[var8];
            }
            int var13;
            if ((var13 = this.field121[var8]) < 0) {
                arg3[arg0++] = (byte) (~var13);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field121[var8];
            }
            int var14;
            if ((var14 = this.field121[var8]) < 0) {
                arg3[arg0++] = (byte) (~var14);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field121[var8];
            }
            int var15;
            if ((var15 = this.field121[var8]) < 0) {
                arg3[arg0++] = (byte) (~var15);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field121[var8];
            }
            int var16;
            if ((var16 = this.field121[var8]) < 0) {
                arg3[arg0++] = (byte) (~var16);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field121[var8];
            }
            int var17;
            if ((var17 = this.field121[var8]) < 0) {
                arg3[arg0++] = (byte) (~var17);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field121[var8];
            }
            int var18;
            if ((var18 = this.field121[var8]) < 0) {
                arg3[arg0++] = (byte) (~var18);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZZILl;Ll;)I", line = 249)
    public static final int method45(boolean arg0, boolean arg1, int arg2, class295 arg3, class295 arg4) {
        if (arg0) {
            method46(70, 95, 61);
        }
        field119++;
        if (arg2 == 1) {
            int var5 = arg4.field2581;
            int var6 = arg3.field2581;
            if (!arg1) {
                if (var5 == -1) {
                    var5 = 2001;
                }
                if (var6 == -1) {
                    var6 = 2001;
                }
            }
            return var6 - var5;
        } else if (arg2 == 2) {
            return arg3.method2037(120).field4799.method1005(255, arg4.method2037(125).field4799);
        } else if (arg2 == 3) {
            if (arg3.field5038.method992(23292, class316.field5490)) {
                if (arg4.field5038.method992(23292, class316.field5490)) {
                    return 0;
                } else if (arg1) {
                    return -1;
                } else {
                    return 1;
                }
            } else if (arg4.field5038.method992(23292, class316.field5490)) {
                return arg1 ? 1 : -1;
            } else {
                return arg3.field5038.method1005(255, arg4.field5038);
            }
        } else if (arg2 == 4) {
            return arg3.method1092((byte) 104) ? (arg4.method1092((byte) 104) ? 0 : 1) : (arg4.method1092((byte) 104) ? -1 : 0);
        } else if (arg2 == 5) {
            return arg3.method1095(-31887) ? (arg4.method1095(-31887) ? 0 : 1) : (arg4.method1095(-31887) ? -1 : 0);
        } else if (arg2 == 6) {
            return arg3.method1090(0) ? (arg4.method1090(0) ? 0 : 1) : (arg4.method1090(0) ? -1 : 0);
        } else if (arg2 == 7) {
            return arg3.method1094((byte) -56) ? (arg4.method1094((byte) 116) ? 0 : 1) : (arg4.method1094((byte) -27) ? -1 : 0);
        } else {
            return arg3.field5040 - arg4.field5040;
        }
    }

    @OriginalMember(owner = "client!aa", name = "b", descriptor = "(III)I", line = 316)
    public static final int method46(int arg0, int arg1, int arg2) {
        field123++;
        class123 var3 = (class123) class225.field3655.method1586((long) arg0, -53);
        if (var3 == null) {
            return -1;
        } else {
            if (arg1 != -1) {
                field115 = 83;
            }
            return arg2 >= 0 && var3.field1730.length > arg2 ? var3.field1730[arg2] : -1;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IBII[B[B)I", line = 344)
    public final int method47(int arg0, byte arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        int var7 = arg0 + arg3;
        if (arg1 <= 91) {
            field124 = (class152) null;
        }
        field120++;
        int var8 = arg2 << 3;
        int var9 = 0;
        while (var7 > arg3) {
            int var10 = arg4[arg3] & 0xFF;
            byte var11 = this.field113[var10];
            int var12 = this.field117[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var9 & -var14 >> 31;
            int var16 = (var14 + var11 - 1 >> 3) + var13;
            var8 += var11;
            int var17 = var14 + 24;
            arg5[var13] = (byte) (var9 = class72.method493(var15, var12 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg5[var13] = (byte) (var9 = var12 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg5[var13] = (byte) (var9 = var12 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg5[var13] = (byte) (var9 = var12 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var9 = var12 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "([B)V", line = 414)
    public class9(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field121 = new int[8];
        this.field117 = new int[var2];
        this.field113 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field117[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var11 & var12) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class72.method493(var11, var12);
                    }
                } else {
                    var9 = var3[var6 - 1];
                }
                var3[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field121[var14] == 0) {
                            this.field121[var14] = var4;
                        }
                        var14 = this.field121[var14];
                    }
                    if (var14 >= this.field121.length) {
                        int[] var17 = new int[this.field121.length * 2];
                        for (int var18 = 0; var18 < this.field121.length; var18++) {
                            var17[var18] = this.field121[var18];
                        }
                        this.field121 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field121[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(I)V", line = 539)
    public static void method48(int arg0) {
        field114 = null;
        int var1 = -47 / ((9 - arg0) / 57);
        field124 = null;
    }
}
