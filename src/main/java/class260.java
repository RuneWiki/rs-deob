import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public class class260 {

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "[I")
    private int[] field4246;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "[I")
    private int[] field4252;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "[B")
    private byte[] field4249;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "[I")
    public static int[] field4247 = new int[256];

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field4258;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "I")
    public static int field4251;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Lqf;")
    public static class148 field4254;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "[[[B")
    public static byte[][][] field4257;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(B)Ls;", line = 6)
    public static final class271 method1833(byte arg0) {
        field4245++;
        try {
            if (arg0 != -31) {
                field4254 = (class148) null;
            }
            return (class271) Class.forName("om").getDeclaredConstructor().newInstance();
        } catch (Throwable var2) {
            return new class50();
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(BI)Lna;", line = 24)
    public static final class26 method1834(byte arg0, int arg1) {
        field4253++;
        class26 var2 = class149.method1019((byte) 9, arg1);
        if (arg0 >= -87) {
            return (class26) null;
        }
        for (int var3 = var2.method171(-123) - 3; var3 > 0; var3 -= 3) {
            var2 = class236.method1587(new class26[] { var2.method188(var3, 0, 0), class268.field4426, var2.method187(var3, (byte) -74) }, (byte) -62);
        }
        if (var2.method171(-50) > 9) {
            return class236.method1587(new class26[] { class22.field324, var2.method188(var2.method171(-50) - 8, 0, 0), class198.field3078, class149.field2329, var2, class28.field464 }, (byte) -113);
        } else if (var2.method171(-63) > 6) {
            return class236.method1587(new class26[] { class74.field1142, var2.method188(var2.method171(-65) - 4, 0, 0), class132.field2008, class149.field2329, var2, class28.field464 }, (byte) -112);
        } else {
            return class236.method1587(new class26[] { class216.field3382, var2, class56.field910 }, (byte) -82);
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4247[var0] = var1;
        }
        field4256 = 0;
        field4255 = 0;
        field4258 = 0;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(III)V", line = 77)
    public static final void method1835(int arg0, int arg1, int arg2) {
        int var3 = 120 / ((15 - arg0) / 41);
        for (int var4 = 0; var4 < class29.field497; var4++) {
            class89 var5 = class144.method960((byte) 120, var4);
            if (var5 != null) {
                int var6 = var5.field1473;
                if (var6 >= 0 && !class200.field3102.method103(var6, 126)) {
                    var6 = -1;
                }
                int var7;
                if (var5.field1477 >= 0) {
                    int var11 = var5.field1477;
                    int var12 = (var11 & 0x7F) + arg1;
                    if (var12 < 0) {
                        var12 = 0;
                    } else if (var12 > 127) {
                        var12 = 127;
                    }
                    int var13 = (arg2 + var11 & 0xFC00) + (var11 & 0x380) + var12;
                    var7 = class200.field3098[class56.method406((byte) -63, var13, 96)];
                } else if (var6 >= 0) {
                    var7 = class200.field3098[class56.method406((byte) -74, class200.field3102.method100(var6, 65535), 96)];
                } else if (var5.field1483 == -1) {
                    var7 = -1;
                } else {
                    int var8 = var5.field1483;
                    int var9 = (var8 & 0x7F) + arg1;
                    if (var9 < 0) {
                        var9 = 0;
                    } else if (var9 > 127) {
                        var9 = 127;
                    }
                    int var10 = (arg2 + var8 & 0xFC00) + (var8 & 0x380) + var9;
                    var7 = class200.field3098[class56.method406((byte) -127, var10, 96)];
                }
                class124.field1924[var4 + 1] = var7;
            }
        }
        field4250++;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[B[BII)I", line = 151)
    public final int method1836(int arg0, int arg1, byte[] arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = arg0 + arg4;
        field4248++;
        int var8 = 0;
        int var9 = arg5 << 3;
        while (var7 > arg4) {
            int var10 = arg3[arg4] & 0xFF;
            int var11 = this.field4252[var10];
            byte var12 = this.field4249[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = (var12 + var14 - 1 >> 3) + var13;
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var8 = class240.method1652(var16, var11 >>> var17));
            if (var13 < var15) {
                var13++;
                var14 = var17 - 8;
                arg2[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var15) {
                    var14 -= 8;
                    var13++;
                    arg2[var13] = (byte) (var8 = var11 >>> var14);
                    if (var15 > var13) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var8 = var11 >>> var14);
                        if (var15 > var13) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        if (arg1 >= -73) {
            this.field4246 = (int[]) null;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(B)V", line = 221)
    public static void method1837(byte arg0) {
        field4257 = (byte[][][]) null;
        if (arg0 <= 85) {
            field4255 = 33;
        }
        field4247 = null;
        field4254 = null;
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[BI[BI)I", line = 242)
    public final int method1838(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field4251++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg1;
        int var9 = arg5;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var7 = this.field4246[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field4246[var7]) < 0) {
                arg2[arg0++] = (byte) (~var11);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field4246[var7];
            }
            int var12;
            if ((var12 = this.field4246[var7]) < 0) {
                arg2[arg0++] = (byte) (~var12);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field4246[var7];
            }
            int var13;
            if ((var13 = this.field4246[var7]) < 0) {
                arg2[arg0++] = (byte) (~var13);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field4246[var7];
            }
            int var14;
            if ((var14 = this.field4246[var7]) < 0) {
                arg2[arg0++] = (byte) (~var14);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field4246[var7];
            }
            int var15;
            if ((var15 = this.field4246[var7]) < 0) {
                arg2[arg0++] = (byte) (~var15);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field4246[var7];
            }
            int var16;
            if ((var16 = this.field4246[var7]) < 0) {
                arg2[arg0++] = (byte) (~var16);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field4246[var7];
            }
            int var17;
            if ((var17 = this.field4246[var7]) < 0) {
                arg2[arg0++] = (byte) (~var17);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field4246[var7];
            }
            int var18;
            if ((var18 = this.field4246[var7]) < 0) {
                arg2[arg0++] = (byte) (~var18);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return arg3 == -1248 ? var9 + 1 - arg5 : 98;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "([B)V", line = 394)
    public class260(byte[] arg0) {
        int[] var2 = new int[33];
        int var3 = arg0.length;
        this.field4246 = new int[8];
        this.field4252 = new int[var3];
        this.field4249 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var3; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var2[var6];
                this.field4252[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var2[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var2[var9] = var2[var9 - 1];
                            break;
                        }
                        var2[var9] = class240.method1652(var11, var10);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var2[var6 - 1];
                }
                var2[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var2[var13] == var8) {
                        var2[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field4246[var14] == 0) {
                            this.field4246[var14] = var4;
                        }
                        var14 = this.field4246[var14];
                    }
                    if (this.field4246.length <= var14) {
                        int[] var17 = new int[this.field4246.length * 2];
                        for (int var18 = 0; var18 < this.field4246.length; var18++) {
                            var17[var18] = this.field4246[var18];
                        }
                        this.field4246 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field4246[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
