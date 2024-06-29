import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class371 {

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "[I")
    private int[] field4999;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "[I")
    private int[] field4998;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Ldb;")
    public static class298 field5009 = new class298(55, -1);

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "I")
    public static int field5014 = -1;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field5001;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    private int field5002;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field5003;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field5004;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    private int field5005;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field5006;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field5007;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field5008;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public static int field5010;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    private int field5012;

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!tb", name = "r", descriptor = "I")
    private int field5015;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)I", line = 3)
    public final int method2180(byte arg0) {
        field5011++;
        if (arg0 > -42) {
            return -106;
        }
        if (this.field5002 == 0) {
            this.method2183(500298000);
            this.field5002 = 256;
        }
        return this.field4999[--this.field5002];
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 20)
    public static void method2181(int arg0) {
        if (arg0 == -26752) {
            field5009 = null;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(I)I", line = 39)
    public static final int method2182(int arg0) {
        if (arg0 >= -74) {
            method2181(-52);
        }
        field5000++;
        return class92.field1401;
    }

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "(I)V", line = 51)
    private final void method2183(int arg0) {
        field5007++;
        if (arg0 != 500298000) {
            return;
        }
        this.field5015 += ++this.field5005;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field4998[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field5012 ^= this.field5012 << 13;
                } else {
                    this.field5012 ^= this.field5012 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field5012 ^= this.field5012 << 2;
            } else {
                this.field5012 ^= this.field5012 >>> 16;
            }
            this.field5012 += this.field4998[var2 + 128 & 0xFF];
            int var4;
            this.field4998[var2] = var4 = this.field5015 + this.field5012 + this.field4998[class571.method3139(255, var3 >> 2)];
            this.field4999[var2] = this.field5015 = this.field4998[class571.method3139(var4, 261151) >> 8 >> 2] + var3;
        }
    }

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "(B)V", line = 94)
    private final void method2184(byte arg0) {
        field5003++;
        if (arg0 != -66) {
            field5014 = 27;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var7 + var8;
            int var63 = var6 + var61;
            int var64 = var62 ^ var7 >>> 2;
            int var65 = var7 + var63;
            int var66 = var5 + var64;
            int var67 = var65 ^ var63 << 8;
            int var68 = var63 + var66;
            int var69 = var4 + var67;
            var6 = var68 ^ var66 >>> 16;
            int var70 = var3 + var6;
            int var71 = var66 + var69;
            var5 = var71 ^ var69 << 10;
            int var72 = var2 + var5;
            int var73 = var69 + var70;
            var4 = var73 ^ var70 >>> 4;
            int var74 = var4 + var61;
            int var75 = var70 + var72;
            var3 = var75 ^ var72 << 8;
            int var76 = var72 + var74;
            var8 = var3 + var64;
            var2 = var76 ^ var74 >>> 9;
            var7 = var2 + var67;
            var9 = var8 + var74;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field4999[var11 + 1] + var8;
            int var38 = this.field4999[var11 + 3] + var6;
            int var39 = this.field4999[var11 + 2] + var7;
            int var40 = this.field4999[var11] + var9;
            int var41 = this.field4999[var11 + 5] + var4;
            int var42 = this.field4999[var11 + 4] + var5;
            int var43 = this.field4999[var11 + 7] + var2;
            int var44 = this.field4999[var11 + 6] + var3;
            int var45 = var40 ^ var37 << 11;
            int var46 = var37 + var39;
            int var47 = var38 + var45;
            int var48 = var46 ^ var39 >>> 2;
            int var49 = var42 + var48;
            int var50 = var39 + var47;
            int var51 = var50 ^ var47 << 8;
            int var52 = var47 + var49;
            int var53 = var41 + var51;
            var6 = var52 ^ var49 >>> 16;
            int var54 = var6 + var44;
            int var55 = var49 + var53;
            var5 = var55 ^ var53 << 10;
            int var56 = var53 + var54;
            int var57 = var5 + var43;
            var4 = var56 ^ var54 >>> 4;
            int var58 = var54 + var57;
            int var59 = var4 + var45;
            var3 = var58 ^ var57 << 8;
            var8 = var3 + var48;
            int var60 = var57 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            var7 = var2 + var51;
            this.field4998[var11] = var9;
            this.field4998[var11 + 1] = var8;
            this.field4998[var11 + 2] = var7;
            this.field4998[var11 + 3] = var6;
            this.field4998[var11 + 4] = var5;
            this.field4998[var11 + 5] = var4;
            this.field4998[var11 + 6] = var3;
            this.field4998[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field4998[var12] + var9;
            int var14 = this.field4998[var12 + 3] + var6;
            int var15 = this.field4998[var12 + 1] + var8;
            int var16 = this.field4998[var12 + 6] + var3;
            int var17 = this.field4998[var12 + 5] + var4;
            int var18 = this.field4998[var12 + 2] + var7;
            int var19 = this.field4998[var12 + 4] + var5;
            int var20 = this.field4998[var12 + 7] + var2;
            int var21 = var13 ^ var15 << 11;
            int var22 = var15 + var18;
            int var23 = var14 + var21;
            int var24 = var22 ^ var18 >>> 2;
            int var25 = var18 + var23;
            int var26 = var19 + var24;
            int var27 = var25 ^ var23 << 8;
            int var28 = var17 + var27;
            int var29 = var23 + var26;
            var6 = var29 ^ var26 >>> 16;
            int var30 = var26 + var28;
            int var31 = var6 + var16;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var20;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var31 + var32;
            int var35 = var4 + var21;
            var3 = var34 ^ var32 << 8;
            int var36 = var32 + var35;
            var8 = var3 + var24;
            var2 = var36 ^ var35 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var35;
            this.field4998[var12] = var9;
            this.field4998[var12 + 1] = var8;
            this.field4998[var12 + 2] = var7;
            this.field4998[var12 + 3] = var6;
            this.field4998[var12 + 4] = var5;
            this.field4998[var12 + 5] = var4;
            this.field4998[var12 + 6] = var3;
            this.field4998[var12 + 7] = var2;
        }
        this.method2183(arg0 ^ 0xE22E0EAE);
        this.field5002 = 256;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(ZZLvj;)V", line = 243)
    public static final void method2185(boolean arg0, boolean arg1, class411 arg2) {
        field5013++;
        class543 var3 = arg2.method2353(-1);
        if (arg2.field5642 == 0) {
            class540.field7119 = 0;
            arg2.field5644 = 0;
            class2.field14 = -1;
            return;
        }
        if (arg2.field5575 != -1 && arg2.field5611 == 0) {
            class616 var4 = class636.field8570.method231(arg2.field5575, -11764);
            if (arg2.field5641 > 0 && var4.field8167 == 0) {
                class2.field14 = -1;
                class540.field7119 = 0;
                arg2.field5644++;
                return;
            }
            if (arg2.field5641 <= 0 && var4.field8154 == 0) {
                class540.field7119 = 0;
                arg2.field5644++;
                class2.field14 = -1;
                return;
            }
        }
        if (arg2.field5602 != -1 && class642.field8626 >= arg2.field5615) {
            class580 var5 = class120.field2028.method3725(arg2.field5602, (byte) 76);
            if (var5.field7701 && var5.field7723 != -1) {
                class616 var6 = class636.field8570.method231(var5.field7723, -11764);
                if (arg2.field5641 > 0 && var6.field8167 == 0) {
                    class2.field14 = -1;
                    arg2.field5644++;
                    class540.field7119 = 0;
                    return;
                }
                if (arg2.field5641 <= 0 && var6.field8154 == 0) {
                    class2.field14 = -1;
                    arg2.field5644++;
                    class540.field7119 = 0;
                    return;
                }
            }
        }
        if (arg2.field5602 != -1 && arg2.field5615 <= class642.field8626) {
            class580 var7 = class120.field2028.method3725(arg2.field5602, (byte) 56);
            if (var7.field7701 && var7.field7723 != -1) {
                class616 var8 = class636.field8570.method231(var7.field7723, -11764);
                if (arg2.field5641 > 0 && var8.field8167 == 0) {
                    class540.field7119 = 0;
                    class2.field14 = -1;
                    arg2.field5644++;
                    return;
                }
                if (arg2.field5641 <= 0 && var8.field8154 == 0) {
                    class2.field14 = -1;
                    arg2.field5644++;
                    class540.field7119 = 0;
                    return;
                }
            }
        }
        int var9 = arg2.field8620;
        int var10 = arg2.field8612;
        int var11 = arg2.field5643[arg2.field5642 - 1] * 512 + (arg2.method2317((byte) 40) * 256);
        int var12 = arg2.field5649[arg2.field5642 - 1] * 512 + (arg2.method2317((byte) 40) * 256);
        if (var9 >= var11) {
            if (var9 <= var11) {
                if (var12 > var10) {
                    arg2.method2360(74, 8192);
                } else if (var10 > var12) {
                    arg2.method2360(92, 0);
                }
            } else if (var10 < var12) {
                arg2.method2360(116, 6144);
            } else if (var12 >= var10) {
                arg2.method2360(108, 4096);
            } else {
                arg2.method2360(60, 2048);
            }
        } else if (var10 < var12) {
            arg2.method2360(92, 10240);
        } else if (var12 >= var10) {
            arg2.method2360(102, 12288);
        } else {
            arg2.method2360(91, 14336);
        }
        byte var13 = arg2.field5650[arg2.field5642 - 1];
        if (!arg1 && var11 - var9 > 1024 || var11 - var9 < -1024 || (var12 - var10) > 1024 || (var12 - var10) < -1024) {
            arg2.field8620 = var11;
            arg2.field8612 = var12;
            arg2.method2359(arg2.field5593, (byte) -126, false);
            arg2.field5642--;
            class540.field7119 = 0;
            if (arg2.field5641 > 0) {
                arg2.field5641--;
            }
            class2.field14 = -1;
            return;
        }
        int var14 = 16;
        boolean var15 = arg0;
        if (arg2 instanceof class287) {
            var15 = ((class287) arg2).field4052.field5786;
        }
        if (var15) {
            int var16 = arg2.field5593 - arg2.field5574.field8875;
            if (var16 != 0 && arg2.field5551 == -1 && arg2.field5614 != 0) {
                var14 = 8;
            }
            if (!arg1 && arg2.field5642 > 2) {
                var14 = 24;
            }
            if (!arg1 && arg2.field5642 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg1 && arg2.field5642 > 1) {
                var14 = 24;
            }
            if (!arg1 && arg2.field5642 > 2) {
                var14 = 32;
            }
        }
        if (arg2.field5644 > 0 && arg2.field5642 > 1) {
            var14 = 32;
            arg2.field5644--;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field7169 != -1) {
            int var17 = var14 << 9;
            if (arg2.field5642 == 1) {
                int var18 = arg2.field5647 * arg2.field5647;
                int var19 = (var11 >= arg2.field8620 ? var11 - arg2.field8620 : -var11 + arg2.field8620) << 9;
                int var20 = (var12 < arg2.field8612 ? arg2.field8612 - var12 : -arg2.field8612 + var12) << 9;
                int var21 = var20 >= var19 ? var20 : var19;
                int var22 = var3.field7169 * var21 * 2;
                if (var18 > var22) {
                    arg2.field5647 /= 2;
                } else if (var18 / 2 > var21) {
                    arg2.field5647 -= var3.field7169;
                    if (arg2.field5647 < 0) {
                        arg2.field5647 = 0;
                    }
                } else if (arg2.field5647 < var17) {
                    arg2.field5647 += var3.field7169;
                    if (var17 < arg2.field5647) {
                        arg2.field5647 = var17;
                    }
                }
            } else if (var17 > arg2.field5647) {
                arg2.field5647 += var3.field7169;
                if (arg2.field5647 > var17) {
                    arg2.field5647 = var17;
                }
            } else if (arg2.field5647 > 0) {
                arg2.field5647 -= var3.field7169;
                if (arg2.field5647 < 0) {
                    arg2.field5647 = 0;
                }
            }
            var14 = arg2.field5647 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class540.field7119 = 0;
        if (var9 == var11 && var10 == var12) {
            class2.field14 = -1;
        } else {
            if (var11 > var9) {
                arg2.field8620 += var14;
                class540.field7119 |= 0x4;
                if (arg2.field8620 > var11) {
                    arg2.field8620 = var11;
                }
            } else if (var9 > var11) {
                class540.field7119 |= 0x8;
                arg2.field8620 -= var14;
                if (arg2.field8620 < var11) {
                    arg2.field8620 = var11;
                }
            }
            if (var10 < var12) {
                class540.field7119 |= 0x1;
                arg2.field8612 += var14;
                if (arg2.field8612 > var12) {
                    arg2.field8612 = var12;
                }
            } else if (var10 > var12) {
                arg2.field8612 -= var14;
                class540.field7119 |= 0x2;
                if (var12 > arg2.field8612) {
                    arg2.field8612 = var12;
                }
            }
            if (var14 < 32) {
                class2.field14 = var13;
            } else {
                class2.field14 = 2;
            }
        }
        if (arg2.field8620 == var11 && arg2.field8612 == var12) {
            if (arg2.field5641 > 0) {
                arg2.field5641--;
            }
            arg2.field5642--;
        }
    }

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "(I)I", line = 575)
    public final int method2186(int arg0) {
        if (this.field5002 == 0) {
            this.method2183(500298000);
            this.field5002 = 256;
        }
        if (arg0 != 2) {
            field5008 = 71;
        }
        field5004++;
        return this.field4999[this.field5002 - 1];
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I[I[J)V", line = 593)
    public static final void method2187(int arg0, int[] arg1, long[] arg2) {
        field5001++;
        if (arg0 < 76) {
            field5008 = 48;
        }
        class132.method997(arg2, (byte) -125, arg2.length - 1, 0, arg1);
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(IIZBLno;[I)Lmn;", line = 614)
    public static final class340 method2188(int arg0, int arg1, boolean arg2, byte arg3, class658 arg4, int[] arg5) {
        if (arg3 < 72) {
            field5006 = 86;
        }
        field5010++;
        if (!arg4.field9273 && (!class230.method1441(true, arg1) || !class230.method1441(true, arg0))) {
            return arg4.field9310 ? new class340(arg4, 34037, arg1, arg0, arg2, arg5) : new class340(arg4, arg1, arg0, class587.method3231(true, arg1), class587.method3231(true, arg0), arg5);
        } else {
            return new class340(arg4, 3553, arg1, arg0, arg2, arg5);
        }
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "()V", line = 633)
    private class371() {
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "([I)V", line = 635)
    public class371(int[] arg0) {
        this.field4999 = new int[256];
        this.field4998 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field4999[var2] = arg0[var2];
        }
        this.method2184((byte) -66);
    }
}
