import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class462 {

    @OriginalMember(owner = "client!nq", name = "j", descriptor = "[I")
    private int[] field6392;

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "[B")
    private byte[] field6388;

    @OriginalMember(owner = "client!nq", name = "h", descriptor = "[I")
    private int[] field6390;

    @OriginalMember(owner = "client!nq", name = "i", descriptor = "[I")
    public static int[] field6391 = new int[64];

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "Llga;")
    public static class712 field6383 = new class712(10, 16);

    @OriginalMember(owner = "client!nq", name = "k", descriptor = "Lea;")
    public static class547 field6393 = new class547(102, -1);

    @OriginalMember(owner = "client!nq", name = "l", descriptor = "[I")
    public static int[] field6394 = new int[4096];

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field6384;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field6385;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public static int field6386;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field6387;

    @OriginalMember(owner = "client!nq", name = "g", descriptor = "I")
    public static int field6389;

    @OriginalMember(owner = "client!nq", name = "m", descriptor = "[Lkia;")
    public static class620[] field6395;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(ZLgv;)V", line = 11)
    public static final void method2568(boolean arg0, class83 arg1) {
        if (!arg0) {
            field6394 = null;
        }
        field6385++;
        class101 var2 = (class101) class374.field5207.method2552((long) arg1.field817, -1);
        if (var2 == null) {
            return;
        }
        if (var2.field1354 != null) {
            class143.field1851.method2542(var2.field1354);
            var2.field1354 = null;
        }
        var2.method315(73);
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(BIILgm;)Lch;", line = 37)
    public static final class464 method2569(byte arg0, int arg1, int arg2, class125 arg3) {
        field6387++;
        int var4 = arg3.field1632 | arg2 << 10;
        class464 var5 = (class464) class729.field10176.method566((byte) 113, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class511.field6901.method2873(class511.field6901.method2903(106, var4), 103);
        if (var6 == null) {
            int var9 = arg3.field1632 | arg1 + 65536 << 10;
            class464 var10 = (class464) class729.field10176.method566((byte) -34, (long) var9 << 16);
            int var11 = 60 / ((-arg0 - 18) / 55);
            if (var10 != null) {
                return var10;
            }
            byte[] var12 = class511.field6901.method2873(class511.field6901.method2903(116, var9), 40);
            if (var12 == null) {
                int var15 = arg3.field1632 | 0x3FFFC00;
                class464 var16 = (class464) class729.field10176.method566((byte) -82, (long) var15 << 16);
                if (var16 != null) {
                    return var16;
                }
                byte[] var17 = class511.field6901.method2873(class511.field6901.method2903(80, var15), -103);
                if (var17 == null) {
                    return null;
                } else if (var17.length <= 1) {
                    return null;
                } else {
                    class464 var18;
                    try {
                        var18 = class378.method2220(var17, 0);
                    } catch (Exception var22) {
                        throw new RuntimeException(var22.getMessage() + " S: " + var15);
                    }
                    var18.field6422 = arg3;
                    class729.field10176.method567(26404, var18, (long) var15 << 16);
                    return var18;
                }
            } else if (var12.length <= 1) {
                return null;
            } else {
                class464 var13;
                try {
                    var13 = class378.method2220(var12, 0);
                } catch (Exception var21) {
                    throw new RuntimeException(var21.getMessage() + " S: " + var9);
                }
                var13.field6422 = arg3;
                class729.field10176.method567(26404, var13, (long) var9 << 16);
                return var13;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class464 var7;
            try {
                var7 = class378.method2220(var6, 0);
            } catch (Exception var20) {
                throw new RuntimeException(var20.getMessage() + " S: " + var4);
            }
            var7.field6422 = arg3;
            class729.field10176.method567(26404, var7, (long) var4 << 16);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I[BII[BI)I", line = 115)
    public final int method2570(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field6389++;
        int var7 = 0;
        int var8 = arg0 + arg2;
        int var9 = arg3 << 3;
        if (arg5 != 6350) {
            method2573((byte) -128);
        }
        while (var8 > arg2) {
            int var10 = arg4[arg2] & 0xFF;
            int var11 = this.field6392[var10];
            byte var12 = this.field6388[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var9 >> 3;
            int var14 = var9 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var12 + var14 - 1 >> 3) + var13;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var7 = class344.method2020(var15, var11 >>> var17));
            if (var16 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var7 = var11 >>> var14);
                if (var13 < var16) {
                    var14 -= 8;
                    var13++;
                    arg1[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var7 = var11 >>> var14);
                        if (var13 < var16) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            var9 += var12;
            arg2++;
        }
        return (var9 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(I)V", line = 186)
    public static final void method2571(int arg0) {
        class678.field9465++;
        field6384++;
        class103 var1 = class752.method4186(260, class391.field5507, class449.field6285);
        var1.field1379.method3423(class386.field5452, arg0 + 1571862880);
        class27.method104(false, var1);
        if (arg0 != 8) {
            method2569((byte) 108, 108, -78, null);
        }
    }

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "(I[BII[BI)I", line = 205)
    public final int method2572(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field6386++;
        if (arg3 == 0) {
            return 0;
        }
        int var7 = 0;
        int var8 = arg3 + arg5;
        if (arg2 > -62) {
            return -32;
        }
        int var9 = arg0;
        while (true) {
            byte var10 = arg4[var9];
            if (var10 < 0) {
                var7 = this.field6390[var7];
            } else {
                var7++;
            }
            int var11;
            if ((var11 = this.field6390[var7]) < 0) {
                arg1[arg5++] = (byte) (~var11);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var7++;
            } else {
                var7 = this.field6390[var7];
            }
            int var12;
            if ((var12 = this.field6390[var7]) < 0) {
                arg1[arg5++] = (byte) (~var12);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var7++;
            } else {
                var7 = this.field6390[var7];
            }
            int var13;
            if ((var13 = this.field6390[var7]) < 0) {
                arg1[arg5++] = (byte) (~var13);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var7++;
            } else {
                var7 = this.field6390[var7];
            }
            int var14;
            if ((var14 = this.field6390[var7]) < 0) {
                arg1[arg5++] = (byte) (~var14);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var7++;
            } else {
                var7 = this.field6390[var7];
            }
            int var15;
            if ((var15 = this.field6390[var7]) < 0) {
                arg1[arg5++] = (byte) (~var15);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var7++;
            } else {
                var7 = this.field6390[var7];
            }
            int var16;
            if ((var16 = this.field6390[var7]) < 0) {
                arg1[arg5++] = (byte) (~var16);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var7++;
            } else {
                var7 = this.field6390[var7];
            }
            int var17;
            if ((var17 = this.field6390[var7]) < 0) {
                arg1[arg5++] = (byte) (~var17);
                if (arg5 >= var8) {
                    break;
                }
                var7 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var7++;
            } else {
                var7 = this.field6390[var7];
            }
            int var18;
            if ((var18 = this.field6390[var7]) < 0) {
                arg1[arg5++] = (byte) (~var18);
                if (var8 <= arg5) {
                    break;
                }
                var7 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg0;
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "([B)V", line = 355)
    public class462(byte[] arg0) {
        int var2 = arg0.length;
        this.field6392 = new int[var2];
        this.field6388 = arg0;
        this.field6390 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field6392[var5] = var8;
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
                        var3[var9] = class344.method2020(var11, var10);
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
                    if ((var8 & var16) == 0) {
                        var14++;
                    } else {
                        if (this.field6390[var14] == 0) {
                            this.field6390[var14] = var4;
                        }
                        var14 = this.field6390[var14];
                    }
                    if (var14 >= this.field6390.length) {
                        int[] var17 = new int[this.field6390.length * 2];
                        for (int var18 = 0; var18 < this.field6390.length; var18++) {
                            var17[var18] = this.field6390[var18];
                        }
                        this.field6390 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field6390[var14] = ~var5;
            }
        }
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(B)V", line = 480)
    public static void method2573(byte arg0) {
        if (arg0 >= -120) {
            return;
        }
        field6393 = null;
        field6383 = null;
        field6395 = null;
        field6394 = null;
        field6391 = null;
    }
}
