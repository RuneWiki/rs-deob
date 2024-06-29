import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class286 {

    @OriginalMember(owner = "client!am", name = "I", descriptor = "Lqh;")
    private class327 field3914 = null;

    @OriginalMember(owner = "client!am", name = "E", descriptor = "I")
    public int field3910;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "Z")
    private boolean field3886;

    @OriginalMember(owner = "client!am", name = "z", descriptor = "Lba;")
    private class270 field3905;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field3880;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field3881;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field3888;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public static int field3890;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!am", name = "q", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!am", name = "r", descriptor = "I")
    public static int field3897;

    @OriginalMember(owner = "client!am", name = "s", descriptor = "I")
    public static int field3898;

    @OriginalMember(owner = "client!am", name = "t", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!am", name = "u", descriptor = "I")
    public static int field3900;

    @OriginalMember(owner = "client!am", name = "v", descriptor = "I")
    public static int field3901;

    @OriginalMember(owner = "client!am", name = "x", descriptor = "I")
    public static int field3903;

    @OriginalMember(owner = "client!am", name = "y", descriptor = "I")
    public static int field3904;

    @OriginalMember(owner = "client!am", name = "A", descriptor = "I")
    public static int field3906;

    @OriginalMember(owner = "client!am", name = "B", descriptor = "I")
    public static int field3907;

    @OriginalMember(owner = "client!am", name = "C", descriptor = "I")
    public static int field3908;

    @OriginalMember(owner = "client!am", name = "D", descriptor = "I")
    public static int field3909;

    @OriginalMember(owner = "client!am", name = "F", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!am", name = "G", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!am", name = "H", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!am", name = "J", descriptor = "I")
    public static int field3915;

    @OriginalMember(owner = "client!am", name = "L", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!am", name = "M", descriptor = "I")
    public static int field3918;

    @OriginalMember(owner = "client!am", name = "w", descriptor = "[Ljava/lang/Object;")
    private Object[] field3902;

    @OriginalMember(owner = "client!am", name = "K", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field3916;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IB)Z", line = 3)
    public final boolean method1671(int arg0, byte arg1) {
        field3882++;
        if (!this.method1695(52, arg0)) {
            return false;
        } else if (this.field3902[arg0] == null) {
            this.method1698(arg0, -4858);
            if (this.field3902[arg0] == null) {
                if (arg1 != -84) {
                    this.method1674(-81, 63);
                }
                return false;
            } else {
                return true;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BII)Z", line = 37)
    private final boolean method1672(byte arg0, int arg1, int arg2) {
        field3892++;
        int var4 = -61 % ((arg0 - 52) / 60);
        if (!this.method1697((byte) -105)) {
            return false;
        } else if (arg1 >= 0 && arg2 >= 0 && this.field3914.field4337.length > arg1 && arg2 < this.field3914.field4337[arg1]) {
            return true;
        } else if (class279.field3795) {
            throw new IllegalArgumentException(arg1 + "," + arg2);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(II)Z", line = 70)
    public final boolean method1673(int arg0, int arg1) {
        field3895++;
        if (!this.method1697((byte) -81)) {
            return false;
        }
        int var3 = -121 / ((-arg0 - 67) / 35);
        if (this.field3914.field4337.length == 1) {
            return this.method1675(arg1, 0, 0);
        } else if (!this.method1695(44, arg1)) {
            return false;
        } else if (this.field3914.field4337[arg1] == 1) {
            return this.method1675(0, arg1, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II)V", line = 98)
    public final void method1674(int arg0, int arg1) {
        if (arg1 == 1574) {
            field3913++;
            if (this.method1695(arg1 - 1541, arg0) && this.field3916 != null) {
                this.field3916[arg0] = null;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Z", line = 116)
    public final boolean method1675(int arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            this.field3910 = 1;
        }
        field3900++;
        if (!this.method1672((byte) -123, arg1, arg0)) {
            return false;
        } else if (this.field3916[arg1] != null && this.field3916[arg1][arg0] != null) {
            return true;
        } else if (this.field3902[arg1] == null) {
            this.method1698(arg1, arg2 ^ 0xFFFFED06);
            return this.field3902[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)I", line = 142)
    public final int method1676(int arg0) {
        field3912++;
        if (this.method1697((byte) -98)) {
            if (arg0 <= 66) {
                this.method1685(-4, -11);
            }
            return this.field3914.field4337.length;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILam;)V", line = 163)
    public static final void method1677(int arg0, class286 arg1) {
        field3906++;
        class92.field1062 = arg1;
        if (arg0 == -1) {
            ;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IBI[I)[B", line = 177)
    public final byte[] method1678(int arg0, byte arg1, int arg2, int[] arg3) {
        if (arg1 <= 103) {
            this.field3886 = false;
        }
        field3915++;
        if (!this.method1672((byte) -95, arg2, arg0)) {
            return null;
        }
        if (this.field3916[arg2] == null || this.field3916[arg2][arg0] == null) {
            boolean var5 = this.method1693(arg0, arg3, 107, arg2);
            if (!var5) {
                this.method1698(arg2, -4858);
                boolean var6 = this.method1693(arg0, arg3, 112, arg2);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class393.method2445(false, false, this.field3916[arg2][arg0]);
        if (this.field3910 == 1) {
            this.field3916[arg2][arg0] = null;
            if (this.field3914.field4337[arg2] == 1) {
                this.field3916[arg2] = null;
            }
        } else if (this.field3910 == 2) {
            this.field3916[arg2] = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZZ)V", line = 224)
    public final void method1679(int arg0, boolean arg1, boolean arg2) {
        if (arg0 != -31676) {
            return;
        }
        field3903++;
        if (!this.method1697((byte) -116)) {
            return;
        }
        if (arg1) {
            this.field3914.field4358 = null;
            this.field3914.field4339 = null;
        }
        if (arg2) {
            this.field3914.field4360 = null;
            this.field3914.field4363 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(IB)V", line = 254)
    public static final void method1680(int arg0, byte arg1) {
        if (arg1 <= 6) {
            method1677(35, (class286) null);
        }
        class435.field6352 = 3;
        class340.field4550 = 100;
        class205.field2768 = -1;
        field3898++;
        class230.field3169 = arg0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 268)
    public final boolean method1681(int arg0, String arg1) {
        field3897++;
        if (!this.method1697((byte) -88)) {
            return false;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field3914.field4363.method1202(class212.method1152(var3, (byte) -117), 66);
        if (arg0 < 84) {
            this.field3910 = -18;
        }
        return var4 >= 0;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)[B", line = 293)
    public final byte[] method1682(String arg0, byte arg1, String arg2) {
        field3896++;
        if (!this.method1697((byte) -118)) {
            return null;
        }
        String var4 = arg2.toLowerCase();
        String var5 = arg0.toLowerCase();
        int var6 = this.field3914.field4363.method1202(class212.method1152(var4, (byte) -117), 56);
        if (!this.method1695(92, var6)) {
            return null;
        }
        int var7 = this.field3914.field4339[var6].method1202(class212.method1152(var5, (byte) -117), 54);
        if (arg1 != -7) {
            this.field3914 = null;
        }
        return this.method1687(var7, var6, 255);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLjava/lang/String;)V", line = 318)
    public final void method1683(byte arg0, String arg1) {
        field3888++;
        if (arg0 != 62) {
            this.method1701(-77);
        }
        if (this.method1697((byte) -87)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3914.field4363.method1202(class212.method1152(var3, (byte) -117), 85);
            this.method1686(var4, 118);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 336)
    public final void method1684(byte arg0) {
        field3911++;
        if (this.field3916 != null) {
            for (int var2 = 0; var2 < this.field3916.length; var2++) {
                this.field3916[var2] = null;
            }
        }
        if (arg0 > -42) {
            this.field3910 = 44;
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(II)[I", line = 372)
    public final int[] method1685(int arg0, int arg1) {
        if (arg0 != 0) {
            return null;
        }
        field3908++;
        if (!this.method1695(127, arg1)) {
            return null;
        }
        int[] var3 = this.field3914.field4347[arg1];
        if (var3 == null) {
            var3 = new int[this.field3914.field4352[arg1]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(II)V", line = 401)
    private final void method1686(int arg0, int arg1) {
        field3891++;
        if (arg1 < 116) {
            this.method1700((String) null, (byte) -39);
        }
        this.field3905.method175(arg0, (byte) -20);
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(III)[B", line = 414)
    public final byte[] method1687(int arg0, int arg1, int arg2) {
        field3883++;
        if (arg2 != 255) {
            method1677(-116, (class286) null);
        }
        return this.method1678(arg0, (byte) 115, arg1, (int[]) null);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLjava/lang/String;Ljava/lang/String;)Z", line = 425)
    public final boolean method1688(byte arg0, String arg1, String arg2) {
        field3885++;
        if (!this.method1697((byte) -102)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        if (arg0 >= -107) {
            this.method1692((byte) -32);
        }
        int var6 = this.field3914.field4363.method1202(class212.method1152(var4, (byte) -117), 110);
        if (this.method1695(67, var6)) {
            int var7 = this.field3914.field4339[var6].method1202(class212.method1152(var5, (byte) -117), 53);
            return this.method1675(var7, var6, 0);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BI)I", line = 448)
    private final int method1689(byte arg0, int arg1) {
        field3887++;
        if (!this.method1695(115, arg1)) {
            return 0;
        } else if (this.field3902[arg1] == null) {
            return arg0 < 50 ? 89 : this.field3905.method164(0, arg1);
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 467)
    public final boolean method1690(String arg0, byte arg1) {
        field3894++;
        if (arg1 >= -23) {
            this.method1681(27, (String) null);
        }
        if (this.method1697((byte) -93)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3914.field4363.method1202(class212.method1152(var3, (byte) -117), 63);
            return this.method1671(var4, (byte) -84);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!am", name = "e", descriptor = "(II)I", line = 485)
    public final int method1691(int arg0, int arg1) {
        if (arg1 != 0) {
            this.field3902 = null;
        }
        field3884++;
        return this.method1695(116, arg0) ? this.field3914.field4337[arg0] : 0;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)I", line = 499)
    public final int method1692(byte arg0) {
        field3909++;
        if (!this.method1697((byte) -86)) {
            return 0;
        } else if (arg0 >= -58) {
            return 39;
        } else {
            int var2 = 0;
            int var3 = 0;
            for (int var4 = 0; var4 < this.field3902.length; var4++) {
                if (this.field3914.field4352[var4] > 0) {
                    var2 += 100;
                    var3 += this.method1689((byte) 55, var4);
                }
            }
            if (var2 == 0) {
                return 100;
            } else {
                return var3 * 100 / var2;
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I[III)Z", line = 541)
    private final boolean method1693(int arg0, int[] arg1, int arg2, int arg3) {
        field3890++;
        if (!this.method1695(95, arg3)) {
            return false;
        } else if (this.field3902[arg3] == null) {
            return false;
        } else {
            int var5 = -9 / ((arg2 - 57) / 41);
            int var6 = this.field3914.field4352[arg3];
            int[] var7 = this.field3914.field4347[arg3];
            if (this.field3916[arg3] == null) {
                this.field3916[arg3] = new Object[this.field3914.field4337[arg3]];
            }
            Object[] var8 = this.field3916[arg3];
            boolean var9 = true;
            for (int var10 = 0; var10 < var6; var10++) {
                int var11;
                if (var7 == null) {
                    var11 = var10;
                } else {
                    var11 = var7[var10];
                }
                if (var8[var11] == null) {
                    var9 = false;
                    break;
                }
            }
            if (var9) {
                return true;
            }
            byte[] var12;
            if (arg1 == null || arg1[0] == 0 && arg1[1] == 0 && arg1[2] == 0 && arg1[3] == 0) {
                var12 = class393.method2445(false, false, this.field3902[arg3]);
            } else {
                var12 = class393.method2445(true, false, this.field3902[arg3]);
                class250 var13 = new class250(var12);
                var13.method1338((byte) 105, arg1, 5, var13.field3406.length);
            }
            byte[] var14;
            try {
                var14 = class189.method1016((byte) 116, var12);
            } catch (RuntimeException var50) {
                throw class411.method2564(var50, "T3 - " + (arg1 != null) + "," + arg3 + "," + var12.length + "," + class305.method1794(var12, var12.length, 0) + "," + class305.method1794(var12, var12.length - 2, 0) + "," + this.field3914.field4343[arg3] + "," + this.field3914.field4351);
            }
            if (this.field3886) {
                this.field3902[arg3] = null;
            }
            if (var6 <= 1) {
                int var16;
                if (var7 == null) {
                    var16 = 0;
                } else {
                    var16 = var7[0];
                }
                if (this.field3910 == 0) {
                    var8[var16] = class395.method2470(false, -18755, var14);
                } else {
                    var8[var16] = var14;
                }
            } else if (this.field3910 == 2) {
                int var33 = var14.length;
                int var52 = var33 - 1;
                int var34 = var14[var52] & 0xFF;
                int var35 = var52 - var34 * 4 * var6;
                class250 var36 = new class250(var14);
                int var37 = 0;
                int var38 = 0;
                var36.field3389 = var35;
                for (int var39 = 0; var39 < var34; var39++) {
                    int var40 = 0;
                    for (int var41 = 0; var41 < var6; var41++) {
                        var40 += var36.method1359(255);
                        int var42;
                        if (var7 == null) {
                            var42 = var41;
                        } else {
                            var42 = var7[var41];
                        }
                        if (arg0 == var42) {
                            var38 = var42;
                            var37 += var40;
                        }
                    }
                }
                if (var37 == 0) {
                    return true;
                }
                byte[] var43 = new byte[var37];
                var36.field3389 = var35;
                int var44 = 0;
                int var45 = 0;
                for (int var46 = 0; var46 < var34; var46++) {
                    int var47 = 0;
                    for (int var48 = 0; var48 < var6; var48++) {
                        var47 += var36.method1359(255);
                        int var49;
                        if (var7 == null) {
                            var49 = var48;
                        } else {
                            var49 = var7[var48];
                        }
                        if (arg0 == var49) {
                            class358.method2183(var14, var45, var43, var44, var47);
                            var44 += var47;
                        }
                        var45 += var47;
                    }
                }
                var8[var38] = var43;
            } else {
                int var17 = var14.length;
                int var51 = var17 - 1;
                int var18 = var14[var51] & 0xFF;
                int var19 = var51 - var6 * 4 * var18;
                class250 var20 = new class250(var14);
                int[] var21 = new int[var6];
                var20.field3389 = var19;
                for (int var22 = 0; var22 < var18; var22++) {
                    int var23 = 0;
                    for (int var24 = 0; var24 < var6; var24++) {
                        var23 += var20.method1359(255);
                        var21[var24] += var23;
                    }
                }
                byte[][] var25 = new byte[var6][];
                for (int var26 = 0; var26 < var6; var26++) {
                    var25[var26] = new byte[var21[var26]];
                    var21[var26] = 0;
                }
                var20.field3389 = var19;
                int var27 = 0;
                for (int var28 = 0; var28 < var18; var28++) {
                    int var29 = 0;
                    for (int var30 = 0; var30 < var6; var30++) {
                        var29 += var20.method1359(255);
                        class358.method2183(var14, var27, var25[var30], var21[var30], var29);
                        var21[var30] += var29;
                        var27 += var29;
                    }
                }
                for (int var31 = 0; var31 < var6; var31++) {
                    int var32;
                    if (var7 == null) {
                        var32 = var31;
                    } else {
                        var32 = var7[var31];
                    }
                    if (this.field3910 == 0) {
                        var8[var32] = class395.method2470(false, -18755, var25[var31]);
                    } else {
                        var8[var32] = var25[var31];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(I)I", line = 822)
    public final int method1694(int arg0) {
        if (arg0 != 0) {
            this.field3905 = null;
        }
        field3881++;
        if (!this.method1697((byte) -109)) {
            throw new IllegalStateException("");
        }
        return this.field3914.field4351;
    }

    @OriginalMember(owner = "client!am", name = "f", descriptor = "(II)Z", line = 839)
    private final boolean method1695(int arg0, int arg1) {
        field3917++;
        if (!this.method1697((byte) -77)) {
            return false;
        }
        if (arg0 <= 22) {
            this.method1690((String) null, (byte) -17);
        }
        if (arg1 >= 0 && arg1 < this.field3914.field4337.length && this.field3914.field4337[arg1] != 0) {
            return true;
        } else if (class279.field3795) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ)I", line = 865)
    public final int method1696(int arg0, boolean arg1) {
        field3880++;
        if (arg1) {
            this.field3916 = null;
        }
        if (this.method1697((byte) -125)) {
            int var3 = this.field3914.field4363.method1202(arg0, 116);
            return this.method1695(51, var3) ? var3 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(B)Z", line = 885)
    private final boolean method1697(byte arg0) {
        field3893++;
        if (arg0 >= -76) {
            this.field3916 = null;
        }
        if (this.field3914 == null) {
            this.field3914 = this.field3905.method173((byte) 0);
            if (this.field3914 == null) {
                return false;
            }
            this.field3902 = new Object[this.field3914.field4355];
            this.field3916 = new Object[this.field3914.field4355][];
        }
        return true;
    }

    @OriginalMember(owner = "client!am", name = "g", descriptor = "(II)V", line = 907)
    private final void method1698(int arg0, int arg1) {
        if (arg1 != -4858) {
            this.method1686(-103, -71);
        }
        if (this.field3886) {
            this.field3902[arg0] = this.field3905.method170((byte) -64, arg0);
        } else {
            this.field3902[arg0] = class395.method2470(false, -18755, this.field3905.method170((byte) -64, arg0));
        }
        field3907++;
    }

    @OriginalMember(owner = "client!am", name = "h", descriptor = "(II)[B", line = 922)
    public final byte[] method1699(int arg0, int arg1) {
        field3918++;
        if (!this.method1697((byte) -93)) {
            return null;
        } else if (this.field3914.field4337.length == 1) {
            return this.method1687(arg0, 0, 255);
        } else if (!this.method1695(122, arg0)) {
            return null;
        } else if (this.field3914.field4337[arg0] == 1) {
            return this.method1687(0, arg0, 255);
        } else {
            if (arg1 < 31) {
                this.method1699(2, -59);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(Ljava/lang/String;B)I", line = 952)
    public final int method1700(String arg0, byte arg1) {
        field3901++;
        if (arg1 != -70) {
            this.method1683((byte) 69, (String) null);
        }
        if (this.method1697((byte) -86)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field3914.field4363.method1202(class212.method1152(var3, (byte) -117), 106);
            return this.method1695(80, var4) ? var4 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lba;ZI)V", line = 978)
    public class286(class270 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field3910 = arg2;
        this.field3886 = arg1;
        this.field3905 = arg0;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V", line = 991)
    public final void method1701(int arg0) {
        if (this.field3902 != null) {
            for (int var2 = 0; var2 < this.field3902.length; var2++) {
                this.field3902[var2] = null;
            }
        }
        field3904++;
        if (arg0 <= 117) {
            this.method1690((String) null, (byte) -20);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)Z", line = 1012)
    public final boolean method1702(boolean arg0) {
        field3899++;
        if (arg0) {
            return true;
        } else if (this.method1697((byte) -111)) {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field3914.field4359.length; var3++) {
                int var4 = this.field3914.field4359[var3];
                if (this.field3902[var4] == null) {
                    this.method1698(var4, -4858);
                    if (this.field3902[var4] == null) {
                        var2 = false;
                    }
                }
            }
            return var2;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(ILjava/lang/String;)I", line = 1047)
    public final int method1703(int arg0, String arg1) {
        field3889++;
        if (arg0 != 0) {
            this.method1685(20, 23);
        }
        if (this.method1697((byte) -110)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field3914.field4363.method1202(class212.method1152(var3, (byte) -117), arg0 + 86);
            return this.method1689((byte) 121, var4);
        } else {
            return 0;
        }
    }
}
