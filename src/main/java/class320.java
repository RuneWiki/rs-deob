import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class320 {

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "[I")
    private int[] field5207;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[I")
    private int[] field5206;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "[B")
    private byte[] field5212;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Z")
    public static boolean field5210 = false;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "Lih;")
    public static class39 field5204 = new class39(5000);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "[Lbn;")
    public static class75[] field5211;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "[S")
    public static short[] field5203;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BI[BI[BI)I", line = 7)
    public final int method2301(byte arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field5201++;
        if (arg1 == 0) {
            return 0;
        }
        if (arg0 != 72) {
            this.field5206 = (int[]) null;
        }
        int var7 = arg1 + arg5;
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field5206[var8];
            }
            int var11;
            if ((var11 = this.field5206[var8]) < 0) {
                arg4[arg5++] = (byte) (~var11);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field5206[var8];
            }
            int var12;
            if ((var12 = this.field5206[var8]) < 0) {
                arg4[arg5++] = (byte) (~var12);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field5206[var8];
            }
            int var13;
            if ((var13 = this.field5206[var8]) < 0) {
                arg4[arg5++] = (byte) (~var13);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field5206[var8];
            }
            int var14;
            if ((var14 = this.field5206[var8]) < 0) {
                arg4[arg5++] = (byte) (~var14);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field5206[var8];
            }
            int var15;
            if ((var15 = this.field5206[var8]) < 0) {
                arg4[arg5++] = (byte) (~var15);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field5206[var8];
            }
            int var16;
            if ((var16 = this.field5206[var8]) < 0) {
                arg4[arg5++] = (byte) (~var16);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field5206[var8];
            }
            int var17;
            if ((var17 = this.field5206[var8]) < 0) {
                arg4[arg5++] = (byte) (~var17);
                if (arg5 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field5206[var8];
            }
            int var18;
            if ((var18 = this.field5206[var8]) < 0) {
                arg4[arg5++] = (byte) (~var18);
                if (var7 <= arg5) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Ljava/lang/String;", line = 160)
    public static final String method2302(int arg0, int arg1) {
        if (arg1 == -27286) {
            field5205++;
            return (arg0 >> 24 & 0xFF) + "." + (arg0 >> 16 & 0xFF) + "." + (arg0 >> 8 & 0xFF) + "." + (arg0 & 0xFF);
        } else {
            return (String) null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 173)
    public static void method2303(int arg0) {
        field5204 = null;
        if (arg0 != 255) {
            method2302(-1, 127);
        }
        field5203 = null;
        field5211 = null;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[BII[BI)I", line = 192)
    public final int method2304(int arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        int var7 = arg3 << 3;
        int var8 = 0;
        field5202++;
        int var9 = arg0 + arg2;
        if (arg5 >= -48) {
            field5203 = (short[]) null;
        }
        while (var9 > arg2) {
            int var10 = arg4[arg2] & 0xFF;
            int var11 = this.field5207[var10];
            byte var12 = this.field5212[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var7 >> 3;
            int var14 = var7 & 0x7;
            var7 += var12;
            int var15 = var13 + (var12 + var14 - 1 >> 3);
            int var16 = var8 & -var14 >> 31;
            int var17 = var14 + 24;
            arg1[var13] = (byte) (var8 = class287.method2034(var16, var11 >>> var17));
            if (var15 > var13) {
                var14 = var17 - 8;
                var13++;
                arg1[var13] = (byte) (var8 = var11 >>> var14);
                if (var15 > var13) {
                    var13++;
                    var14 -= 8;
                    arg1[var13] = (byte) (var8 = var11 >>> var14);
                    if (var15 > var13) {
                        var13++;
                        var14 -= 8;
                        arg1[var13] = (byte) (var8 = var11 >>> var14);
                        if (var15 > var13) {
                            var14 -= 8;
                            var13++;
                            arg1[var13] = (byte) (var8 = var11 << -var14);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var7 + 7 >> 3) - arg3;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 261)
    public static final void method2305(byte arg0) {
        class47.field943++;
        class51.field1038.method291((byte) 66, 243);
        class51.field1038.method1027(class292.method2078(16), -20374);
        field5208++;
        class51.field1038.method1002((byte) -84, class133.field2287);
        class51.field1038.method1002((byte) -119, class287.field4696);
        if (arg0 != -62) {
            method2305((byte) 97);
        }
        class51.field1038.method1027(class117.field2083, -20374);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Lek;BLek;Lek;Lek;)V", line = 278)
    public static final void method2306(class206 arg0, byte arg1, class206 arg2, class206 arg3, class206 arg4) {
        class213.field3523 = arg0;
        class152.field2597 = arg3;
        class191.field3241 = arg4;
        int var5 = 102 % ((arg1 + 85) / 37);
        class198.field3319 = arg2;
        class178.field2938 = new class181[class198.field3319.method1423((byte) -112)][];
        field5209++;
        class232.field3797 = new boolean[class198.field3319.method1423((byte) -45)];
    }

    @OriginalMember(owner = "client!sh", name = "<init>", descriptor = "([B)V", line = 300)
    public class320(byte[] arg0) {
        int var2 = arg0.length;
        this.field5207 = new int[var2];
        this.field5206 = new int[8];
        this.field5212 = arg0;
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field5207[var5] = var8;
                int var9;
                if ((var8 & var7) == 0) {
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
                        var3[var10] = class287.method2034(var12, var11);
                    }
                    var9 = var8 | var7;
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
                        if (this.field5206[var14] == 0) {
                            this.field5206[var14] = var4;
                        }
                        var14 = this.field5206[var14];
                    }
                    if (var14 >= this.field5206.length) {
                        int[] var17 = new int[this.field5206.length * 2];
                        for (int var18 = 0; var18 < this.field5206.length; var18++) {
                            var17[var18] = this.field5206[var18];
                        }
                        this.field5206 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field5206[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
