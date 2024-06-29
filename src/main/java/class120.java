import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class120 {

    @OriginalMember(owner = "client!kj", name = "l", descriptor = "[I")
    private int[] field1924;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "[I")
    private int[] field1916;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "[B")
    private byte[] field1913;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1920 = "green:";

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1917 = "flash2:";

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public static int field1915;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public static int field1918;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public static int field1921;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "[I")
    public static int[] field1914;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ZILjava/lang/String;Ljava/lang/String;)V")
    public static final void method846(boolean arg0, int arg1, String arg2, String arg3) {
        class240.field3836 = arg3;
        class60.field984 = arg1;
        field1918++;
        class69.field1146 = arg2;
        if (class240.field3836.equals("") || class69.field1146.equals("")) {
            class311.field4973 = 3;
        } else if (class60.field979 == -1) {
            class311.field4973 = -3;
            class247.field3933 = 1;
            class212.field3510 = 0;
            class225.field3659 = 0;
            class162 var4 = new class162(128);
            var4.method1108(10, arg0);
            var4.method1125((int) (Math.random() * 9.9999999E7D), 255);
            var4.method1156(-31881, class178.method1303(class240.field3836, -128));
            var4.method1125((int) (Math.random() * 9.9999999E7D), 255);
            var4.method1148((byte) -99, class69.field1146);
            var4.method1125((int) (Math.random() * 9.9999999E7D), 255);
            var4.method1110(class104.field1663, (byte) 117, class309.field4937);
            class314.field5061.field2568 = 0;
            class314.field5061.method1108(24, arg0);
            class314.field5061.method1108(var4.field2568 + 2, arg0);
            class314.field5061.method1120(552, arg0);
            class314.field5061.method1131(var4.field2568, var4.field2573, 0, 2);
        } else {
            class48.method340(true);
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(IZII[B[B)I")
    public final int method847(int arg0, boolean arg1, int arg2, int arg3, byte[] arg4, byte[] arg5) {
        if (!arg1) {
            return -89;
        }
        field1922++;
        if (arg0 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg3;
        int var9 = arg2;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field1924[var7];
            }
            int var11;
            if ((var11 = this.field1924[var7]) < 0) {
                arg5[arg3++] = (byte) (~var11);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field1924[var7];
            }
            int var12;
            if ((var12 = this.field1924[var7]) < 0) {
                arg5[arg3++] = (byte) (~var12);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field1924[var7];
            }
            int var13;
            if ((var13 = this.field1924[var7]) < 0) {
                arg5[arg3++] = (byte) (~var13);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field1924[var7];
            }
            int var14;
            if ((var14 = this.field1924[var7]) < 0) {
                arg5[arg3++] = (byte) (~var14);
                if (arg3 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field1924[var7];
            }
            int var15;
            if ((var15 = this.field1924[var7]) < 0) {
                arg5[arg3++] = (byte) (~var15);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field1924[var7];
            }
            int var16;
            if ((var16 = this.field1924[var7]) < 0) {
                arg5[arg3++] = (byte) (~var16);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field1924[var7];
            }
            int var17;
            if ((var17 = this.field1924[var7]) < 0) {
                arg5[arg3++] = (byte) (~var17);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field1924[var7];
            }
            int var18;
            if ((var18 = this.field1924[var7]) < 0) {
                arg5[arg3++] = (byte) (~var18);
                if (var8 <= arg3) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg2;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(II)I")
    public static final int method848(int arg0, int arg1) {
        field1921++;
        int var2 = arg1 >>> 1;
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = -76 / ((-arg0 - 28) / 38);
        int var7 = var5 | var5 >>> 8;
        int var8 = var7 | var7 >>> 16;
        return arg1 & ~var8;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(III[B[BI)I")
    public final int method849(int arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        int var7 = arg2 + arg5;
        int var8 = 0;
        field1923++;
        if (arg0 <= 52) {
            method850(100);
        }
        int var9 = arg1 << 3;
        while (var7 > arg5) {
            int var10 = arg4[arg5] & 0xFF;
            int var11 = this.field1916[var10];
            byte var12 = this.field1913[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var8 & -var14 >> 31;
            int var16 = var13 + (var14 + var12 - 1 >> 3);
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var8 = class173.method1263(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg3[var13] = (byte) (var8 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg3[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg5++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(I)V")
    public static void method850(int arg0) {
        field1920 = null;
        int var1 = -107 % ((-arg0 - 48) / 49);
        field1914 = null;
        field1917 = null;
    }

    @OriginalMember(owner = "client!kj", name = "<init>", descriptor = "([B)V")
    public class120(byte[] arg0) {
        int var2 = arg0.length;
        this.field1924 = new int[8];
        this.field1916 = new int[var2];
        this.field1913 = arg0;
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field1916[var5] = var8;
                int var12;
                if ((var8 & var7) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var4[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var10 & var11) != 0) {
                            var4[var9] = var4[var9 - 1];
                            break;
                        }
                        var4[var9] = class173.method1263(var10, var11);
                    }
                    var12 = var8 | var7;
                } else {
                    var12 = var4[var6 - 1];
                }
                var4[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1924[var14] == 0) {
                            this.field1924[var14] = var3;
                        }
                        var14 = this.field1924[var14];
                    }
                    if (var14 >= this.field1924.length) {
                        int[] var17 = new int[this.field1924.length * 2];
                        for (int var18 = 0; var18 < this.field1924.length; var18++) {
                            var17[var18] = this.field1924[var18];
                        }
                        this.field1924 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field1924[var14] = ~var5;
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
            }
        }
    }
}
