package deob;

@ObfuscatedName("dc")
public class class113 {

    @ObfuscatedName("dc.i")
    public int[] field1953;

    @ObfuscatedName("dc.v")
    public byte[] field1948;

    @ObfuscatedName("dc.f")
    public int[] field1949;

    public class113(byte[] arg0) {
        int var2 = arg0.length;
        this.field1953 = new int[var2];
        this.field1948 = arg0;
        int[] var3 = new int[33];
        this.field1949 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1953[var5] = var8;
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
                        var3[var10] = var11 | var12;
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
                        if (this.field1949[var14] == 0) {
                            this.field1949[var14] = var4;
                        }
                        var14 = this.field1949[var14];
                    }
                    if (var14 >= this.field1949.length) {
                        int[] var17 = new int[this.field1949.length * 2];
                        for (int var18 = 0; var18 < this.field1949.length; var18++) {
                            var17[var18] = this.field1949[var18];
                        }
                        this.field1949 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field1949[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }

    @ObfuscatedName("dc.i([BII[BIB)I")
    public int method2230(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int var6 = 0;
        int var7 = arg4 << 3;
        int var8 = arg1 + arg2;
        while (arg1 < var8) {
            int var9 = arg0[arg1] & 0xFF;
            int var10 = this.field1953[var9];
            byte var11 = this.field1948[var9];
            if (var11 == 0) {
                throw new RuntimeException("");
            }
            int var12 = var7 >> 3;
            int var13 = var7 & 0x7;
            int var14 = var6 & -var13 >> 31;
            int var15 = (var11 + var13 - 1 >> 3) + var12;
            int var16 = var13 + 24;
            arg3[var12] = (byte) (var6 = var14 | var10 >>> var16);
            if (var12 < var15) {
                var12++;
                var13 = var16 - 8;
                arg3[var12] = (byte) (var6 = var10 >>> var13);
                if (var12 < var15) {
                    var12++;
                    var13 -= 8;
                    arg3[var12] = (byte) (var6 = var10 >>> var13);
                    if (var12 < var15) {
                        var12++;
                        var13 -= 8;
                        arg3[var12] = (byte) (var6 = var10 >>> var13);
                        if (var12 < var15) {
                            var12++;
                            var13 -= 8;
                            arg3[var12] = (byte) (var6 = var10 << -var13);
                        }
                    }
                }
            }
            var7 += var11;
            arg1++;
        }
        return (var7 + 7 >> 3) - arg4;
    }

    @ObfuscatedName("dc.v([BI[BIII)I")
    public int method2232(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        if (arg4 == 0) {
            return 0;
        }
        int var6 = 0;
        int var7 = arg3 + arg4;
        int var8 = arg1;
        while (true) {
            byte var9 = arg0[var8];
            if (var9 < 0) {
                var6 = this.field1949[var6];
            } else {
                var6++;
            }
            int var10;
            if ((var10 = this.field1949[var6]) < 0) {
                arg2[arg3++] = (byte) (~var10);
                if (arg3 >= var7) {
                    break;
                }
                var6 = 0;
            }
            if ((var9 & 0x40) == 0) {
                var6++;
            } else {
                var6 = this.field1949[var6];
            }
            int var11;
            if ((var11 = this.field1949[var6]) < 0) {
                arg2[arg3++] = (byte) (~var11);
                if (arg3 >= var7) {
                    break;
                }
                var6 = 0;
            }
            if ((var9 & 0x20) == 0) {
                var6++;
            } else {
                var6 = this.field1949[var6];
            }
            int var12;
            if ((var12 = this.field1949[var6]) < 0) {
                arg2[arg3++] = (byte) (~var12);
                if (arg3 >= var7) {
                    break;
                }
                var6 = 0;
            }
            if ((var9 & 0x10) == 0) {
                var6++;
            } else {
                var6 = this.field1949[var6];
            }
            int var13;
            if ((var13 = this.field1949[var6]) < 0) {
                arg2[arg3++] = (byte) (~var13);
                if (arg3 >= var7) {
                    break;
                }
                var6 = 0;
            }
            if ((var9 & 0x8) == 0) {
                var6++;
            } else {
                var6 = this.field1949[var6];
            }
            int var14;
            if ((var14 = this.field1949[var6]) < 0) {
                arg2[arg3++] = (byte) (~var14);
                if (arg3 >= var7) {
                    break;
                }
                var6 = 0;
            }
            if ((var9 & 0x4) == 0) {
                var6++;
            } else {
                var6 = this.field1949[var6];
            }
            int var15;
            if ((var15 = this.field1949[var6]) < 0) {
                arg2[arg3++] = (byte) (~var15);
                if (arg3 >= var7) {
                    break;
                }
                var6 = 0;
            }
            if ((var9 & 0x2) == 0) {
                var6++;
            } else {
                var6 = this.field1949[var6];
            }
            int var16;
            if ((var16 = this.field1949[var6]) < 0) {
                arg2[arg3++] = (byte) (~var16);
                if (arg3 >= var7) {
                    break;
                }
                var6 = 0;
            }
            if ((var9 & 0x1) == 0) {
                var6++;
            } else {
                var6 = this.field1949[var6];
            }
            int var17;
            if ((var17 = this.field1949[var6]) < 0) {
                arg2[arg3++] = (byte) (~var17);
                if (arg3 >= var7) {
                    break;
                }
                var6 = 0;
            }
            var8++;
        }
        return var8 + 1 - arg1;
    }
}
