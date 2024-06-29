import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class104 {

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "[I")
    private int[] field1497;

    @OriginalMember(owner = "client!pj", name = "l", descriptor = "[B")
    private byte[] field1501;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "[I")
    private int[] field1494;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1495 = Calendar.getInstance();

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field1499 = -1;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "S")
    public static short field1500 = 256;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field1490;

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "I")
    public static int field1491;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field1492;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "I")
    public static int field1493;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public static int field1496;

    @OriginalMember(owner = "client!pj", name = "m", descriptor = "I")
    public static int field1502;

    @OriginalMember(owner = "client!pj", name = "o", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!pj", name = "p", descriptor = "I")
    public static int field1505;

    @OriginalMember(owner = "client!pj", name = "q", descriptor = "I")
    public static int field1506;

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "Le;")
    public static class177 field1498;

    @OriginalMember(owner = "client!pj", name = "n", descriptor = "[S")
    public static short[] field1503;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BC)B")
    public static final byte method662(byte arg0, char arg1) {
        field1492++;
        if (arg0 != -123) {
            method663((byte) 73, 76);
        }
        byte var2;
        if (!(arg1 <= '\u0000' || arg1 >= '\u0080') || !(arg1 < ' ' || arg1 > 'ÿ')) {
            var2 = (byte) arg1;
        } else if (arg1 == '€') {
            var2 = -128;
        } else if (arg1 == '‚') {
            var2 = -126;
        } else if (arg1 == 'ƒ') {
            var2 = -125;
        } else if (arg1 == '„') {
            var2 = -124;
        } else if (arg1 == '…') {
            var2 = -123;
        } else if (arg1 == '†') {
            var2 = -122;
        } else if (arg1 == '‡') {
            var2 = -121;
        } else if (arg1 == 'ˆ') {
            var2 = -120;
        } else if (arg1 == '‰') {
            var2 = -119;
        } else if (arg1 == 'Š') {
            var2 = -118;
        } else if (arg1 == '‹') {
            var2 = -117;
        } else if (arg1 == 'Œ') {
            var2 = -116;
        } else if (arg1 == 'Ž') {
            var2 = -114;
        } else if (arg1 == '‘') {
            var2 = -111;
        } else if (arg1 == '’') {
            var2 = -110;
        } else if (arg1 == '“') {
            var2 = -109;
        } else if (arg1 == '”') {
            var2 = -108;
        } else if (arg1 == '•') {
            var2 = -107;
        } else if (arg1 == '–') {
            var2 = -106;
        } else if (arg1 == '—') {
            var2 = -105;
        } else if (arg1 == '˜') {
            var2 = -104;
        } else if (arg1 == '™') {
            var2 = -103;
        } else if (arg1 == 'š') {
            var2 = -102;
        } else if (arg1 == '›') {
            var2 = -101;
        } else if (arg1 == 'œ') {
            var2 = -100;
        } else if (arg1 == 'ž') {
            var2 = -98;
        } else if (arg1 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)Lof;")
    public static final class243 method663(byte arg0, int arg1) {
        field1505++;
        class243 var2 = (class243) class215.field3297.method950((long) arg1, (byte) -45);
        int var3 = 125 % ((arg0 + 54) / 59);
        if (var2 != null) {
            return var2;
        }
        byte[] var4 = class5.field39.method2050(104, 1, arg1);
        class243 var5 = new class243();
        if (var4 != null) {
            var5.method1594(arg1, (byte) 82, new class215(var4));
        }
        class215.field3297.method942((long) arg1, (byte) 85, var5);
        return var5;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[BII[B)I")
    public final int method664(int arg0, int arg1, byte[] arg2, int arg3, int arg4, byte[] arg5) {
        field1504++;
        if (arg3 != 1) {
            field1495 = null;
        }
        if (arg1 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg0 + arg1;
        int var9 = arg4;
        while (true) {
            byte var10 = arg5[var9];
            if (var10 < 0) {
                var7 = this.field1497[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field1497[var7]) < 0) {
                arg2[arg0++] = (byte) (~var11);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field1497[var7];
            }
            int var12;
            if ((var12 = this.field1497[var7]) < 0) {
                arg2[arg0++] = (byte) (~var12);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field1497[var7];
            }
            int var13;
            if ((var13 = this.field1497[var7]) < 0) {
                arg2[arg0++] = (byte) (~var13);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field1497[var7];
            }
            int var14;
            if ((var14 = this.field1497[var7]) < 0) {
                arg2[arg0++] = (byte) (~var14);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field1497[var7];
            }
            int var15;
            if ((var15 = this.field1497[var7]) < 0) {
                arg2[arg0++] = (byte) (~var15);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field1497[var7];
            }
            int var16;
            if ((var16 = this.field1497[var7]) < 0) {
                arg2[arg0++] = (byte) (~var16);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field1497[var7];
            }
            int var17;
            if ((var17 = this.field1497[var7]) < 0) {
                arg2[arg0++] = (byte) (~var17);
                if (var8 <= arg0) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field1497[var7];
            }
            int var18;
            if ((var18 = this.field1497[var7]) < 0) {
                arg2[arg0++] = (byte) (~var18);
                if (arg0 >= var8) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg4;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II[BI[BI)I")
    public final int method665(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field1496++;
        int var7 = arg1 + arg3;
        int var8 = arg0;
        int var9 = arg5 << 3;
        while (var7 > arg3) {
            int var10 = arg4[arg3] & 0xFF;
            int var11 = this.field1494[var10];
            byte var12 = this.field1501[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            var9 += var12;
            int var15 = var8 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg2[var13] = (byte) (var8 = class161.method1003(var15, var11 >>> var17));
            if (var13 < var16) {
                var14 = var17 - 8;
                var13++;
                arg2[var13] = (byte) (var8 = var11 >>> var14);
                if (var13 < var16) {
                    var13++;
                    var14 -= 8;
                    arg2[var13] = (byte) (var8 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg2[var13] = (byte) (var8 = var11 >>> var14);
                        if (var16 > var13) {
                            var14 -= 8;
                            var13++;
                            arg2[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg3++;
        }
        return (var9 + 7 >> 3) - arg5;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(B)V")
    public static void method666(byte arg0) {
        field1498 = null;
        field1495 = null;
        if (arg0 > -50) {
            field1499 = -107;
        }
        field1503 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(II)V")
    public static final void method667(int arg0, int arg1) {
        class145.field2008 = arg0;
        field1490++;
        class145.field2008 = -1;
        class311.field5005 = arg1;
        class163.method1040(0);
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "([B)V")
    public class104(byte[] arg0) {
        int var2 = arg0.length;
        this.field1497 = new int[8];
        int[] var3 = new int[33];
        this.field1501 = arg0;
        this.field1494 = new int[var2];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1494[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class161.method1003(var11, var10);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1497[var14] == 0) {
                            this.field1497[var14] = var4;
                        }
                        var14 = this.field1497[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1497.length <= var14) {
                        int[] var18 = new int[this.field1497.length * 2];
                        for (int var19 = 0; var19 < this.field1497.length; var19++) {
                            var18[var19] = this.field1497[var19];
                        }
                        this.field1497 = var18;
                    }
                }
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
                this.field1497[var14] = ~var5;
            }
        }
    }
}
