import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class371 {

    @OriginalMember(owner = "client!we", name = "b", descriptor = "[B")
    private byte[] field5298;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "[I")
    private int[] field5302;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "[I")
    private int[] field5306;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field5301 = new Rectangle[100];

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field5300;

    @OriginalMember(owner = "client!we", name = "g", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lbga;")
    public static class324 field5299;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II[BII[B)I", line = 4)
    public final int method2240(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field5300++;
        int var7 = 0;
        int var8 = arg0 + arg1;
        int var9 = arg3 << 3;
        int var10 = -2 % ((arg4 + 53) / 33);
        while (var8 > arg0) {
            int var11 = arg2[arg0] & 0xFF;
            int var12 = this.field5302[var11];
            byte var13 = this.field5298[var11];
            if (var13 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var9 >> 3;
            int var15 = var9 & 0x7;
            int var16 = var7 & -var15 >> 31;
            int var17 = (var15 - (1 - var13) >> 3) + var14;
            var9 += var13;
            int var18 = var15 + 24;
            arg5[var14] = (byte) (var7 = class486.method2826(var16, var12 >>> var18));
            if (var14 < var17) {
                var14++;
                var15 = var18 - 8;
                arg5[var14] = (byte) (var7 = var12 >>> var15);
                if (var17 > var14) {
                    var15 -= 8;
                    var14++;
                    arg5[var14] = (byte) (var7 = var12 >>> var15);
                    if (var17 > var14) {
                        var14++;
                        var15 -= 8;
                        arg5[var14] = (byte) (var7 = var12 >>> var15);
                        if (var17 > var14) {
                            var15 -= 8;
                            var14++;
                            arg5[var14] = (byte) (var7 = var12 << -var15);
                        }
                    }
                }
            }
            arg0++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IB)I", line = 75)
    public static final int method2241(int arg0, byte arg1) {
        if (arg1 == 59) {
            field5305++;
            return arg0 >>> 8;
        } else {
            return 75;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Z)V", line = 87)
    public static void method2242(boolean arg0) {
        field5301 = null;
        field5299 = null;
        if (arg0) {
            field5301 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Lqaa;I)V", line = 105)
    public static final void method2243(class26 arg0, int arg1) {
        if (arg1 > -31) {
            method2242(true);
        }
        arg0.method312(119);
        field5303++;
        int var2 = class99.field1551;
        class491 var3 = class648.field9106 = class141.field2087[var2] = new class491();
        var3.field6216 = var2;
        int var4 = arg0.method309((byte) 57, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = (var4 & 0xFFFC5DF) >> 14;
        var3.field6271[0] = var6 - class109.field1672;
        int var7 = var4 & 0x3FFF;
        var3.field3024 = (var3.field6271[0] << 9) + (var3.method2553((byte) 84) << 8);
        var3.field6262[0] = var7 - class203.field2874;
        var3.field3029 = (var3.field6262[0] << 9) + (var3.method2553((byte) 106) << 8);
        class58.field1112 = var3.field3019 = var3.field3023 = var5;
        if (class261.method1718(var3.field6262[0], 1, var3.field6271[0])) {
            var3.field3023++;
        }
        if (class263.field3987[var2] != null) {
            var3.method2850(class263.field3987[var2], 0);
        }
        class7.field65 = 0;
        class629.field8801[class7.field65++] = var2;
        class574.field8080[var2] = 0;
        class407.field5954 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg0.method309((byte) 57, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFFDF) >> 8;
                int var12 = var9 & 0xFF;
                class94 var13 = class495.field7033[var8] = new class94();
                var13.field1496 = 0;
                var13.field1497 = -1;
                var13.field1499 = (var10 << 28) + (var11 << 14) + var12;
                var13.field1500 = false;
                class57.field1101[class407.field5954++] = var8;
                class574.field8080[var8] = 0;
            }
        }
        arg0.method317(8);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "([BI[BIII)I", line = 184)
    public final int method2244(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field5304++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg4 + arg5;
        int var9 = arg3;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var7++;
            } else {
                var7 = this.field5306[var7];
            }
            int var11;
            if ((var11 = this.field5306[var7]) < 0) {
                arg0[arg5++] = (byte) (~var11);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field5306[var7];
            }
            int var12;
            if ((var12 = this.field5306[var7]) < 0) {
                arg0[arg5++] = (byte) (~var12);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field5306[var7];
            }
            int var13;
            if ((var13 = this.field5306[var7]) < 0) {
                arg0[arg5++] = (byte) (~var13);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field5306[var7];
            }
            int var14;
            if ((var14 = this.field5306[var7]) < 0) {
                arg0[arg5++] = (byte) (~var14);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field5306[var7];
            }
            int var15;
            if ((var15 = this.field5306[var7]) < 0) {
                arg0[arg5++] = (byte) (~var15);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field5306[var7];
            }
            int var16;
            if ((var16 = this.field5306[var7]) < 0) {
                arg0[arg5++] = (byte) (~var16);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field5306[var7];
            }
            int var17;
            if ((var17 = this.field5306[var7]) < 0) {
                arg0[arg5++] = (byte) (~var17);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field5306[var7];
            }
            int var18;
            if ((var18 = this.field5306[var7]) < 0) {
                arg0[arg5++] = (byte) (~var18);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        if (arg1 != 17099) {
            method2243(null, 98);
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "([B)V", line = 334)
    public class371(byte[] arg0) {
        int var2 = arg0.length;
        this.field5298 = arg0;
        this.field5302 = new int[var2];
        int[] var3 = new int[33];
        this.field5306 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field5302[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
                    var9 = var7 | var8;
                    for (int var10 = var6 - 1; var10 >= 1; var10--) {
                        int var11 = var3[var10];
                        if (var8 != var11) {
                            break;
                        }
                        int var12 = 0x1 << 32 - var10;
                        if ((var12 & var11) != 0) {
                            var3[var10] = var3[var10 - 1];
                            break;
                        }
                        var3[var10] = class486.method2826(var12, var11);
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
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field5306[var14] == 0) {
                            this.field5306[var14] = var4;
                        }
                        var14 = this.field5306[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field5306.length) {
                        int[] var18 = new int[this.field5306.length * 2];
                        for (int var19 = 0; var19 < this.field5306.length; var19++) {
                            var18[var19] = this.field5306[var19];
                        }
                        this.field5306 = var18;
                    }
                }
                this.field5306[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 458)
    public static final int method2245(String arg0, int arg1) {
        field5297++;
        if (arg1 != 14960) {
            field5299 = null;
        }
        if (arg0 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class142.field2091; var2++) {
            if (arg0.equalsIgnoreCase(class124.field1865[var2])) {
                return var2;
            }
        }
        return -1;
    }
}
