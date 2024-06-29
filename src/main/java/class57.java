import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class57 {

    @OriginalMember(owner = "client!d", name = "c", descriptor = "[I")
    private int[] field833;

    @OriginalMember(owner = "client!d", name = "f", descriptor = "[B")
    private byte[] field836;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "[I")
    private int[] field835;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "[I")
    public static int[] field837 = new int[256];

    @OriginalMember(owner = "client!d", name = "a", descriptor = "Lap;")
    public static class310 field831 = new class310(47, 5);

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[I")
    public static int[] field840 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field834;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I[BI[BII)I")
    public final int method520(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        field832++;
        int var7 = 0;
        int var8 = arg2 << 3;
        int var9 = arg4 + arg5;
        while (var9 > arg4) {
            int var10 = arg1[arg4] & 0xFF;
            int var11 = this.field833[var10];
            byte var12 = this.field836[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var8 >> 3;
            int var14 = var8 & 0x7;
            int var15 = var7 & -var14 >> 31;
            int var16 = (var14 + var12 - 1 >> 3) + var13;
            var8 += var12;
            int var17 = var14 + 24;
            arg3[var13] = (byte) (var7 = class142.method1024(var15, var11 >>> var17));
            if (var13 < var16) {
                var13++;
                var14 = var17 - 8;
                arg3[var13] = (byte) (var7 = var11 >>> var14);
                if (var16 > var13) {
                    var14 -= 8;
                    var13++;
                    arg3[var13] = (byte) (var7 = var11 >>> var14);
                    if (var16 > var13) {
                        var13++;
                        var14 -= 8;
                        arg3[var13] = (byte) (var7 = var11 >>> var14);
                        if (var16 > var13) {
                            var13++;
                            var14 -= 8;
                            arg3[var13] = (byte) (var7 = var11 << -var14);
                        }
                    }
                }
            }
            arg4++;
        }
        if (arg0 != 1) {
            field831 = null;
        }
        return (var8 + 7 >> 3) - arg2;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static final void method521(byte arg0) {
        if (arg0 != 72) {
            method521((byte) 93);
        }
        field834++;
        if (class309.field4388 < 0) {
            class466.field6571 = -1;
            class430.field6008 = -1;
            class309.field4388 = 0;
        }
        if (class309.field4388 > class330.field4600) {
            class466.field6571 = -1;
            class430.field6008 = -1;
            class309.field4388 = class330.field4600;
        }
        if (class25.field267 < 0) {
            class466.field6571 = -1;
            class25.field267 = 0;
            class430.field6008 = -1;
        }
        if (class330.field4581 < class25.field267) {
            class466.field6571 = -1;
            class25.field267 = class330.field4581;
            class430.field6008 = -1;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[BI[BI)I")
    public final int method522(int arg0, int arg1, byte[] arg2, int arg3, byte[] arg4, int arg5) {
        field839++;
        if (arg1 == 0) {
            return 0;
        }
        int var7 = arg0 + arg1;
        if (arg5 != 32) {
            method521((byte) 112);
        }
        int var8 = 0;
        int var9 = arg3;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field835[var8];
            }
            int var11;
            if ((var11 = this.field835[var8]) < 0) {
                arg4[arg0++] = (byte) (~var11);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field835[var8];
            }
            int var12;
            if ((var12 = this.field835[var8]) < 0) {
                arg4[arg0++] = (byte) (~var12);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field835[var8];
            }
            int var13;
            if ((var13 = this.field835[var8]) < 0) {
                arg4[arg0++] = (byte) (~var13);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field835[var8];
            }
            int var14;
            if ((var14 = this.field835[var8]) < 0) {
                arg4[arg0++] = (byte) (~var14);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field835[var8];
            }
            int var15;
            if ((var15 = this.field835[var8]) < 0) {
                arg4[arg0++] = (byte) (~var15);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field835[var8];
            }
            int var16;
            if ((var16 = this.field835[var8]) < 0) {
                arg4[arg0++] = (byte) (~var16);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field835[var8];
            }
            int var17;
            if ((var17 = this.field835[var8]) < 0) {
                arg4[arg0++] = (byte) (~var17);
                if (arg0 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field835[var8];
            }
            int var18;
            if ((var18 = this.field835[var8]) < 0) {
                arg4[arg0++] = (byte) (~var18);
                if (var7 <= arg0) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method523(int arg0) {
        field837 = null;
        field840 = null;
        if (arg0 == 1) {
            field831 = null;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public static final void method524(int arg0, int arg1) {
        field838++;
        if (arg0 == 777) {
            class334 var2 = class352.method2172(arg1, 10, 16711935);
            var2.method2099(true);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "([B)V")
    public class57(byte[] arg0) {
        int var2 = arg0.length;
        this.field833 = new int[var2];
        this.field836 = arg0;
        this.field835 = new int[8];
        int[] var3 = new int[33];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field833[var5] = var8;
                int var9;
                if ((var7 & var8) == 0) {
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
                        var3[var10] = class142.method1024(var11, var12);
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
                        if (this.field835[var14] == 0) {
                            this.field835[var14] = var4;
                        }
                        var14 = this.field835[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (var14 >= this.field835.length) {
                        int[] var18 = new int[this.field835.length * 2];
                        for (int var19 = 0; var19 < this.field835.length; var19++) {
                            var18[var19] = this.field835[var19];
                        }
                        this.field835 = var18;
                    }
                }
                if (var14 >= var4) {
                    var4 = var14 + 1;
                }
                this.field835[var14] = ~var5;
            }
        }
    }
}
