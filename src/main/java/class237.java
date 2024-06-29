import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vg")
public class class237 {

    @OriginalMember(owner = "client!vg", name = "c", descriptor = "[B")
    private byte[] field3783;

    @OriginalMember(owner = "client!vg", name = "f", descriptor = "[I")
    private int[] field3786;

    @OriginalMember(owner = "client!vg", name = "j", descriptor = "[I")
    private int[] field3790;

    @OriginalMember(owner = "client!vg", name = "k", descriptor = "I")
    public static int field3791 = -1;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!vg", name = "b", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!vg", name = "d", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!vg", name = "e", descriptor = "I")
    public static int field3785;

    @OriginalMember(owner = "client!vg", name = "g", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!vg", name = "h", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!vg", name = "i", descriptor = "I")
    public static int field3789;

    @OriginalMember(owner = "client!vg", name = "l", descriptor = "I")
    public static int field3792;

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(IIBIIIIII)V")
    public static final void method1558(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3792++;
        if (arg2 < 72) {
            return;
        }
        if (class280.method1870(110, arg1)) {
            class97.method695(-1, arg3, arg5, arg0, arg6, 10, arg4, class133.field2204[arg1], arg7, arg8);
        } else if (arg5 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class272.field4396[var9] = true;
            }
        } else {
            class272.field4396[arg5] = true;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(Z)V")
    public static final void method1559(boolean arg0) {
        class88.field1204++;
        field3784++;
        class83.field1148.method1238(167, -136478397);
        class83.field1148.method1757(class195.method1321(arg0), (byte) 112);
        class83.field1148.method1761(class107.field1856, 4334);
        class83.field1148.method1761(class97.field1469, 4334);
        class83.field1148.method1757(class108.field1877, (byte) -63);
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(BI)V")
    public static final void method1560(byte arg0, int arg1) {
        field3785++;
        int var2 = class44.field522;
        int var3 = class119.field2014;
        if (arg0 >= -64) {
            method1563(false, (byte) 126, 113L);
        }
        int var4 = class193.field3108;
        int var5 = class8.field119;
        int var6 = class244.field3910;
        int var7 = (int) class121.field2039 + class115.field1979 & 0x7FF;
        int var8 = (int) client.field3605;
        if (var8 < class138.field2280 / 256) {
            var8 = class138.field2280 / 256;
        }
        if (class66.field944[4] && var8 < (class238.field3800[4] + 128)) {
            var8 = class238.field3800[4] + 128;
        }
        class99.method708(class220.method1461(class197.field3179.field614, class28.field336, class197.field3179.field613, 88) - 50, var8 * 3 + 600, arg1, var7, class291.field4635, class140.field2296, var8, (byte) -128);
        if (class44.field522 == var2 && class193.field3108 == var4 && class119.field2014 == var3 && class8.field119 == var5 && class244.field3910 == var6) {
            class92.field1316 = 1;
            return;
        }
        class124.field2075 = 10;
        class34.field420 = 10;
        class230.field3659 = 10;
        int var9 = class244.field3910 - var6;
        if (class8.field119 > var5) {
            var5 += (class8.field119 - var5) * class34.field420 / 1000 + class124.field2075;
            if (class8.field119 > var5) {
                class8.field119 = var5;
            }
        }
        class171.field2761 = 10;
        if (var2 < class44.field522) {
            var2 += (class44.field522 - var2) * class171.field2761 / 1000 + class230.field3659;
            if (class44.field522 > var2) {
                class44.field522 = var2;
            }
        }
        if (var2 > class44.field522) {
            int var10 = var2 - ((var2 - class44.field522) * class171.field2761 / 1000 + class230.field3659);
            if (var10 > class44.field522) {
                class44.field522 = var10;
            }
        }
        if (class8.field119 < var5) {
            int var11 = var5 - ((var5 - class8.field119) * class34.field420 / 1000 + class124.field2075);
            if (var11 > class8.field119) {
                class8.field119 = var11;
            }
        }
        if (var9 > 1024) {
            var9 -= 2048;
        }
        if (var9 < -1024) {
            var9 += 2048;
        }
        if (class119.field2014 > var3) {
            var3 += (class119.field2014 - var3) * class171.field2761 / 1000 + class230.field3659;
            if (var3 < class119.field2014) {
                class119.field2014 = var3;
            }
        }
        if (var4 < class193.field3108) {
            var4 += (class193.field3108 - var4) * class171.field2761 / 1000 + class230.field3659;
            if (var4 < class193.field3108) {
                class193.field3108 = var4;
            }
        }
        if (class193.field3108 < var4) {
            int var12 = var4 - ((var4 - class193.field3108) * class171.field2761 / 1000 + class230.field3659);
            if (class193.field3108 < var12) {
                class193.field3108 = var12;
            }
        }
        if (class119.field2014 < var3) {
            int var13 = var3 - ((var3 - class119.field2014) * class171.field2761 / 1000 + class230.field3659);
            if (class119.field2014 < var13) {
                class119.field2014 = var13;
            }
        }
        if (var9 > 0) {
            int var14 = class34.field420 * var9 / 1000 + class124.field2075 + var6;
            var6 = var14 & 0x7FF;
        }
        if (var9 < 0) {
            int var15 = var6 - (-var9 * class34.field420 / 1000 + class124.field2075);
            var6 = var15 & 0x7FF;
        }
        int var16 = class244.field3910 - var6;
        if (var16 > 1024) {
            var16 -= 2048;
        }
        if (var16 < -1024) {
            var16 += 2048;
        }
        if (var16 >= 0 || var9 <= 0 || var16 > 0 && var9 < 0) {
            class244.field3910 = var6;
        }
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([BIII[BI)I")
    public final int method1561(byte[] arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5) {
        field3789++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg1 + arg3;
        int var8 = 0;
        if (arg2 != 32) {
            return 68;
        }
        int var9 = arg5;
        while (true) {
            byte var10 = arg0[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field3790[var8];
            }
            int var11;
            if ((var11 = this.field3790[var8]) < 0) {
                arg4[arg3++] = (byte) (~var11);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field3790[var8];
            }
            int var12;
            if ((var12 = this.field3790[var8]) < 0) {
                arg4[arg3++] = (byte) (~var12);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field3790[var8];
            }
            int var13;
            if ((var13 = this.field3790[var8]) < 0) {
                arg4[arg3++] = (byte) (~var13);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field3790[var8];
            }
            int var14;
            if ((var14 = this.field3790[var8]) < 0) {
                arg4[arg3++] = (byte) (~var14);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field3790[var8];
            }
            int var15;
            if ((var15 = this.field3790[var8]) < 0) {
                arg4[arg3++] = (byte) (~var15);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field3790[var8];
            }
            int var16;
            if ((var16 = this.field3790[var8]) < 0) {
                arg4[arg3++] = (byte) (~var16);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field3790[var8];
            }
            int var17;
            if ((var17 = this.field3790[var8]) < 0) {
                arg4[arg3++] = (byte) (~var17);
                if (arg3 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field3790[var8];
            }
            int var18;
            if ((var18 = this.field3790[var8]) < 0) {
                arg4[arg3++] = (byte) (~var18);
                if (var7 <= arg3) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "([BIIII[B)I")
    public final int method1562(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5) {
        int var7 = arg1 + arg3;
        field3782++;
        int var8 = 112 / (arg2 / 36);
        int var9 = 0;
        int var10 = arg4 << 3;
        while (var7 > arg3) {
            int var11 = arg5[arg3] & 0xFF;
            byte var12 = this.field3783[var11];
            int var13 = this.field3786[var11];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var11);
            }
            int var14 = var10 & 0x7;
            int var15 = var9 & -var14 >> 31;
            int var16 = var10 >> 3;
            int var17 = (var12 + var14 - 1 >> 3) + var16;
            int var18 = var14 + 24;
            arg0[var16] = (byte) (var9 = class45.method348(var15, var13 >>> var18));
            if (var16 < var17) {
                var14 = var18 - 8;
                var16++;
                arg0[var16] = (byte) (var9 = var13 >>> var14);
                if (var17 > var16) {
                    var14 -= 8;
                    var16++;
                    arg0[var16] = (byte) (var9 = var13 >>> var14);
                    if (var17 > var16) {
                        var14 -= 8;
                        var16++;
                        arg0[var16] = (byte) (var9 = var13 >>> var14);
                        if (var16 < var17) {
                            var14 -= 8;
                            var16++;
                            arg0[var16] = (byte) (var9 = var13 << -var14);
                        }
                    }
                }
            }
            var10 += var12;
            arg3++;
        }
        return (var10 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!vg", name = "a", descriptor = "(ZBJ)V")
    public static final void method1563(boolean arg0, byte arg1, long arg2) {
        field3788++;
        if (arg2 == 0L) {
            return;
        }
        if (class33.field399 >= 100) {
            class297.method1986(0, "", true, client.field3601);
            return;
        }
        String var4 = class94.method659(arg2, (byte) -103);
        for (int var5 = 0; var5 < class33.field399; var5++) {
            if (class140.field2301[var5] == arg2) {
                class297.method1986(0, "", true, var4 + class264.field4202);
                return;
            }
        }
        int var6 = 0;
        if (arg1 < 116) {
            method1558(-35, -74, (byte) -68, -98, 80, -59, -32, 68, -23);
        }
        while (var6 < class264.field4224) {
            if (class266.field4313[var6] == arg2) {
                class297.method1986(0, "", true, class92.field1318 + var4 + class41.field491);
                return;
            }
            var6++;
        }
        if (var4.equals(class197.field3179.field3735)) {
            class297.method1986(0, "", true, class251.field4013);
            return;
        }
        class140.field2301[class33.field399] = arg2;
        class111.field1913++;
        class242.field3883[class33.field399] = class245.method1608(arg2, true);
        class225.field3570[class33.field399++] = arg0;
        class204.field3273 = class64.field906;
        class83.field1148.method1238(253, -136478397);
        class83.field1148.method1762(arg2, (byte) 39);
    }

    @OriginalMember(owner = "client!vg", name = "<init>", descriptor = "([B)V")
    public class237(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field3783 = arg0;
        int var4 = 0;
        this.field3786 = new int[var2];
        this.field3790 = new int[8];
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field3786[var5] = var8;
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
                        var3[var10] = class45.method348(var12, var11);
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
                        if (this.field3790[var14] == 0) {
                            this.field3790[var14] = var4;
                        }
                        var14 = this.field3790[var14];
                    }
                    if (var14 >= this.field3790.length) {
                        int[] var17 = new int[this.field3790.length * 2];
                        for (int var18 = 0; var18 < this.field3790.length; var18++) {
                            var17[var18] = this.field3790[var18];
                        }
                        this.field3790 = var17;
                    }
                    int var19 = var16 >>> 1;
                }
                this.field3790[var14] = ~var5;
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
