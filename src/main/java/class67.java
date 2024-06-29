import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class67 {

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[I")
    private int[] field1101;

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "[I")
    private int[] field1099;

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "[B")
    private byte[] field1102;

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "Lng;")
    public static class76 field1103 = new class76(5000);

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "D")
    public static double field1106 = -1.0D;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "[[[Lvj;")
    public static class115[][][] field1104 = new class115[4][104][104];

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "Z")
    public static boolean field1108 = false;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "[Ltg;")
    public static class181[] field1109 = new class181[14];

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field1110 = -2;

    @OriginalMember(owner = "client!rc", name = "o", descriptor = "I")
    public static int field1111 = -1;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1107 = Calendar.getInstance();

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lf;")
    public static class36 field1105;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BI[BII[B)I")
    public final int method466(byte arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field1097++;
        int var7 = arg3 + arg4;
        if (arg0 != 104) {
            field1107 = null;
        }
        int var8 = 0;
        int var9 = arg1 << 3;
        while (var7 > arg3) {
            int var10 = arg5[arg3] & 0xFF;
            int var11 = this.field1101[var10];
            byte var12 = this.field1102[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var8 & -var14 >> 31;
            var9 += var12;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var8 = class220.method1495(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg2[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var14 -= 8;
                        var13++;
                        arg2[var13] = (byte) (var8 = var11 >>> var14);
                        if (var13 < var16) {
                            var13++;
                            var14 -= 8;
                            arg2[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var9 + 7 >> 3) - arg1;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IIIIII)V")
    public static final void method467(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg5 - arg3;
        int var7 = arg1 - arg0;
        field1098++;
        if (var7 == 0) {
            if (var6 != 0) {
                class227.method1597(arg4, true, arg3, arg0, arg5);
            }
        } else if (var6 == 0) {
            class149.method1020(84, arg3, arg1, arg0, arg4);
        } else {
            if (var6 < 0) {
                var6 = -var6;
            }
            if (var7 < 0) {
                var7 = -var7;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg0;
                int var10 = arg1;
                arg0 = arg3;
                arg3 = var9;
                arg1 = arg5;
                arg5 = var10;
            }
            if (arg0 > arg1) {
                int var11 = arg3;
                int var12 = arg0;
                arg3 = arg5;
                arg5 = var11;
                arg0 = arg1;
                arg1 = var12;
            }
            int var13 = arg1 - arg0;
            if (arg2 > -92) {
                field1111 = 81;
            }
            int var14 = arg5 <= arg3 ? -1 : 1;
            int var15 = -(var13 >> 1);
            int var16 = arg3;
            int var17 = arg5 - arg3;
            if (var17 < 0) {
                var17 = -var17;
            }
            if (var8) {
                for (int var18 = arg0; var18 <= arg1; var18++) {
                    class29.field452[var18][var16] = arg4;
                    var15 += var17;
                    if (var15 > 0) {
                        var16 += var14;
                        var15 -= var13;
                    }
                }
            } else {
                for (int var19 = arg0; var19 <= arg1; var19++) {
                    var15 += var17;
                    class29.field452[var16][var19] = arg4;
                    if (var15 > 0) {
                        var15 -= var13;
                        var16 += var14;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V")
    public static void method468(int arg0) {
        field1105 = null;
        field1104 = null;
        if (arg0 != 23388) {
            field1104 = null;
        }
        field1107 = null;
        field1109 = null;
        field1103 = null;
    }

    @OriginalMember(owner = "client!rc", name = "<init>", descriptor = "([B)V")
    public class67(byte[] arg0) {
        int var2 = arg0.length;
        this.field1101 = new int[var2];
        this.field1099 = new int[8];
        int[] var3 = new int[33];
        this.field1102 = arg0;
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1101[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class220.method1495(var11, var12);
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
                        if (this.field1099[var14] == 0) {
                            this.field1099[var14] = var4;
                        }
                        var14 = this.field1099[var14];
                    }
                    if (this.field1099.length <= var14) {
                        int[] var17 = new int[this.field1099.length * 2];
                        for (int var18 = 0; var18 < this.field1099.length; var18++) {
                            var17[var18] = this.field1099[var18];
                        }
                        this.field1099 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field1099[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(III[BI[B)I")
    public final int method469(int arg0, int arg1, int arg2, byte[] arg3, int arg4, byte[] arg5) {
        field1100++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg1 + arg2;
        if (arg4 <= 26) {
            field1111 = -72;
        }
        int var9 = arg0;
        while (true) {
            byte var10 = arg3[var9];
            if (var10 < 0) {
                var7 = this.field1099[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field1099[var7]) < 0) {
                arg5[arg2++] = (byte) (~var11);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field1099[var7];
            }
            int var12;
            if ((var12 = this.field1099[var7]) < 0) {
                arg5[arg2++] = (byte) (~var12);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field1099[var7];
            }
            int var13;
            if ((var13 = this.field1099[var7]) < 0) {
                arg5[arg2++] = (byte) (~var13);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field1099[var7];
            }
            int var14;
            if ((var14 = this.field1099[var7]) < 0) {
                arg5[arg2++] = (byte) (~var14);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field1099[var7];
            }
            int var15;
            if ((var15 = this.field1099[var7]) < 0) {
                arg5[arg2++] = (byte) (~var15);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field1099[var7];
            }
            int var16;
            if ((var16 = this.field1099[var7]) < 0) {
                arg5[arg2++] = (byte) (~var16);
                if (arg2 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field1099[var7];
            }
            int var17;
            if ((var17 = this.field1099[var7]) < 0) {
                arg5[arg2++] = (byte) (~var17);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field1099[var7];
            }
            int var18;
            if ((var18 = this.field1099[var7]) < 0) {
                arg5[arg2++] = (byte) (~var18);
                if (var8 <= arg2) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }
}
