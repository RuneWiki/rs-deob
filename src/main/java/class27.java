import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class27 {

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "[I")
    private int[] field439;

    @OriginalMember(owner = "client!sd", name = "f", descriptor = "[I")
    private int[] field444;

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "[B")
    private byte[] field443;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "I")
    public static int field440 = 0;

    @OriginalMember(owner = "client!sd", name = "h", descriptor = "I")
    public static volatile int field446 = 0;

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "I")
    public static int field441;

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "I")
    public static int field442;

    @OriginalMember(owner = "client!sd", name = "g", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!sd", name = "i", descriptor = "I")
    public static int field447;

    @OriginalMember(owner = "client!sd", name = "j", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BII[B[BI)I", line = 10)
    public final int method177(byte arg0, int arg1, int arg2, byte[] arg3, byte[] arg4, int arg5) {
        field442++;
        if (arg5 == 0) {
            return 0;
        }
        int var7 = arg1 + arg5;
        int var8 = 0;
        int var9 = 4 / ((arg0 - 26) / 47);
        int var10 = arg2;
        while (true) {
            byte var11 = arg3[var10];
            if (var11 < 0) {
                var8 = this.field444[var8];
            } else {
                var8++;
            }
            int var12;
            if ((var12 = this.field444[var8]) < 0) {
                arg4[arg1++] = (byte) (~var12);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field444[var8];
            }
            int var13;
            if ((var13 = this.field444[var8]) < 0) {
                arg4[arg1++] = (byte) (~var13);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field444[var8];
            }
            int var14;
            if ((var14 = this.field444[var8]) < 0) {
                arg4[arg1++] = (byte) (~var14);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field444[var8];
            }
            int var15;
            if ((var15 = this.field444[var8]) < 0) {
                arg4[arg1++] = (byte) (~var15);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field444[var8];
            }
            int var16;
            if ((var16 = this.field444[var8]) < 0) {
                arg4[arg1++] = (byte) (~var16);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field444[var8];
            }
            int var17;
            if ((var17 = this.field444[var8]) < 0) {
                arg4[arg1++] = (byte) (~var17);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field444[var8];
            }
            int var18;
            if ((var18 = this.field444[var8]) < 0) {
                arg4[arg1++] = (byte) (~var18);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var11 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field444[var8];
            }
            int var19;
            if ((var19 = this.field444[var8]) < 0) {
                arg4[arg1++] = (byte) (~var19);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var10++;
        }
        return var10 - (arg2 - 1);
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IJZBI)Ljava/lang/String;", line = 167)
    public static final String method178(int arg0, long arg1, boolean arg2, byte arg3, int arg4) {
        char var6 = ',';
        field448++;
        char var7 = '.';
        if (arg0 == 0) {
            var7 = ',';
            var6 = '.';
        }
        if (arg0 == 2) {
            var7 = ' ';
        }
        boolean var8 = false;
        if (arg1 < 0L) {
            var8 = true;
            arg1 = -arg1;
        }
        StringBuffer var9 = new StringBuffer(26);
        if (arg3 > -55) {
            field446 = -4;
        }
        if (arg4 > 0) {
            for (int var10 = 0; var10 < arg4; var10++) {
                int var11 = (int) arg1;
                arg1 /= 10L;
                var9.append((char) (var11 + 48 - ((int) arg1 * 10)));
            }
            var9.append(var6);
        }
        int var12 = 0;
        while (true) {
            int var13 = (int) arg1;
            arg1 /= 10L;
            var9.append((char) (var13 + 48 - (int) arg1 * 10));
            if (arg1 == 0L) {
                if (var8) {
                    var9.append('-');
                }
                return var9.reverse().toString();
            }
            if (arg2) {
                var12++;
                if ((var12 % 3) == 0) {
                    var9.append(var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(BI[BII[B)I", line = 248)
    public final int method179(byte arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        int var7 = 0;
        field441++;
        int var8 = arg3 + arg4;
        int var9 = arg1 << 3;
        while (arg4 < var8) {
            int var10 = arg2[arg4] & 0xFF;
            byte var11 = this.field443[var10];
            int var12 = this.field439[var10];
            if (var11 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = (var11 + var14 - 1 >> 3) + var13;
            int var16 = var7 & -var14 >> 31;
            int var18 = var14 + 24;
            arg5[var13] = (byte) (var7 = class94.method673(var16, var12 >>> var18));
            if (var15 > var13) {
                var14 = var18 - 8;
                var13++;
                arg5[var13] = (byte) (var7 = var12 >>> var14);
                if (var15 > var13) {
                    var13++;
                    var14 -= 8;
                    arg5[var13] = (byte) (var7 = var12 >>> var14);
                    if (var15 > var13) {
                        var13++;
                        var14 -= 8;
                        arg5[var13] = (byte) (var7 = var12 >>> var14);
                        if (var15 > var13) {
                            var14 -= 8;
                            var13++;
                            arg5[var13] = (byte) (var7 = var12 << -var14);
                        }
                    }
                }
            }
            var9 += var11;
            arg4++;
        }
        int var17 = -123 / ((58 - arg0) / 53);
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!sd", name = "<init>", descriptor = "([B)V", line = 324)
    public class27(byte[] arg0) {
        int var2 = arg0.length;
        this.field439 = new int[var2];
        this.field444 = new int[8];
        this.field443 = arg0;
        int var3 = 0;
        int[] var4 = new int[33];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var4[var6];
                this.field439[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
                    var9 = var8 | var7;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var4[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var4[var10] = var4[var10 - 1];
                            break;
                        }
                        var4[var10] = class94.method673(var12, var11);
                    }
                } else {
                    var9 = var4[var6 - 1];
                }
                var4[var6] = var9;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var4[var13] == var8) {
                        var4[var13] = var9;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field444[var14] == 0) {
                            this.field444[var14] = var3;
                        }
                        var14 = this.field444[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field444.length) {
                        int[] var18 = new int[this.field444.length * 2];
                        for (int var19 = 0; var19 < this.field444.length; var19++) {
                            var18[var19] = this.field444[var19];
                        }
                        this.field444 = var18;
                    }
                }
                if (var14 >= var3) {
                    var3 = var14 + 1;
                }
                this.field444[var14] = ~var5;
            }
        }
    }
}
