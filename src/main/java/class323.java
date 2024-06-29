import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fp")
public class class323 {

    @OriginalMember(owner = "client!fp", name = "C", descriptor = "Leg;")
    private class107 field4486 = null;

    @OriginalMember(owner = "client!fp", name = "M", descriptor = "I")
    public int field4496;

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "Lrfa;")
    private class197 field4467;

    @OriginalMember(owner = "client!fp", name = "m", descriptor = "Z")
    private boolean field4470;

    @OriginalMember(owner = "client!fp", name = "G", descriptor = "Lvl;")
    public static class13 field4490 = new class13("WTI", 5);

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "I")
    public static int field4460;

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "I")
    public static int field4465;

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!fp", name = "k", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!fp", name = "l", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!fp", name = "n", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!fp", name = "o", descriptor = "I")
    public static int field4472;

    @OriginalMember(owner = "client!fp", name = "q", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!fp", name = "r", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!fp", name = "s", descriptor = "I")
    public static int field4476;

    @OriginalMember(owner = "client!fp", name = "t", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!fp", name = "u", descriptor = "I")
    public static int field4478;

    @OriginalMember(owner = "client!fp", name = "v", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!fp", name = "w", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!fp", name = "x", descriptor = "I")
    public static int field4481;

    @OriginalMember(owner = "client!fp", name = "y", descriptor = "I")
    public static int field4482;

    @OriginalMember(owner = "client!fp", name = "z", descriptor = "I")
    public static int field4483;

    @OriginalMember(owner = "client!fp", name = "A", descriptor = "I")
    public static int field4484;

    @OriginalMember(owner = "client!fp", name = "B", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!fp", name = "D", descriptor = "I")
    public static int field4487;

    @OriginalMember(owner = "client!fp", name = "E", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!fp", name = "F", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!fp", name = "H", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!fp", name = "I", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!fp", name = "J", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!fp", name = "L", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!fp", name = "N", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!fp", name = "O", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!fp", name = "K", descriptor = "[Ljava/lang/Object;")
    private Object[] field4494;

    @OriginalMember(owner = "client!fp", name = "p", descriptor = "[[Ljava/lang/Object;")
    private Object[][] field4473;

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method2077(int arg0, int arg1) {
        field4482++;
        if (!this.method2107(arg1 ^ 0x34E4, arg0)) {
            return null;
        }
        if (arg1 != 0) {
            method2085((byte) 94);
        }
        int[] var3 = this.field4486.field1302[arg0];
        if (var3 == null) {
            var3 = new int[this.field4486.field1292[arg0]];
            int var4 = 0;
            while (var3.length > var4) {
                var3[var4] = var4++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 35)
    public final int method2078(String arg0, byte arg1) {
        field4487++;
        if (!this.method2105(123)) {
            return 0;
        }
        String var3 = arg0.toLowerCase();
        if (arg1 < 11) {
            return -44;
        } else {
            int var4 = this.field4486.field1293.method2427(false, class432.method2633(var3, (byte) -29));
            return this.method2089(0, var4);
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(II)V", line = 54)
    private final void method2079(int arg0, int arg1) {
        if (arg0 != -1) {
            return;
        }
        if (this.field4470) {
            this.field4494[arg1] = this.field4467.method1212(arg1, class286.method1875(arg0, 23158));
        } else {
            this.field4494[arg1] = class273.method1777(105, false, this.field4467.method1212(arg1, -23159));
        }
        field4480++;
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(II)V", line = 71)
    public final void method2080(int arg0, int arg1) {
        field4472++;
        if (this.method2107(13540, arg1) && arg0 < -111 && this.field4473 != null) {
            this.field4473[arg1] = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I)V", line = 88)
    public final void method2081(int arg0) {
        if (this.field4473 != null) {
            for (int var2 = 0; var2 < this.field4473.length; var2++) {
                this.field4473[var2] = null;
            }
        }
        if (arg0 < -81) {
            field4462++;
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(I)I", line = 112)
    public final int method2082(int arg0) {
        field4479++;
        if (!this.method2105(104)) {
            return 0;
        }
        int var2 = 0;
        int var3 = 0;
        for (int var4 = 0; var4 < this.field4494.length; var4++) {
            if (this.field4486.field1292[var4] > 0) {
                var3 += this.method2089(0, var4);
                var2 += 100;
            }
        }
        if (arg0 == var2) {
            return 100;
        } else {
            return var3 * 100 / var2;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(IBI)Ljb;", line = 150)
    public static final class493 method2083(int arg0, byte arg1, int arg2) {
        field4478++;
        class493 var3 = class127.method854((byte) -112, arg0);
        int var4 = -91 % ((arg1 + 37) / 53);
        if (arg2 == -1) {
            return var3;
        } else if (var3 == null || var3.field7009 == null || arg2 >= var3.field7009.length) {
            return null;
        } else {
            return var3.field7009[arg2];
        }
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(II)I", line = 176)
    public final int method2084(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method2100(-74, (byte) -42, -18);
        }
        field4466++;
        return this.method2107(13540, arg0) ? this.field4486.field1296[arg0] : 0;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(B)V", line = 197)
    public static void method2085(byte arg0) {
        field4490 = null;
        if (arg0 != 12) {
            field4490 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(I)Z", line = 211)
    public final boolean method2086(int arg0) {
        field4468++;
        if (arg0 != -7296) {
            this.field4467 = null;
        }
        if (!this.method2105(105)) {
            return false;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field4486.field1300.length; var3++) {
            int var4 = this.field4486.field1300[var3];
            if (this.field4494[var4] == null) {
                this.method2079(-1, var4);
                if (this.field4494[var4] == null) {
                    var2 = false;
                }
            }
        }
        return var2;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "([IIII)Z", line = 246)
    private final boolean method2087(int[] arg0, int arg1, int arg2, int arg3) {
        field4484++;
        if (!this.method2107(13540, arg2)) {
            return false;
        } else if (this.field4494[arg2] == null) {
            return false;
        } else {
            int var5 = this.field4486.field1292[arg2];
            int[] var6 = this.field4486.field1302[arg2];
            if (this.field4473[arg2] == null) {
                this.field4473[arg2] = new Object[this.field4486.field1296[arg2]];
            }
            Object[] var7 = this.field4473[arg2];
            boolean var8 = true;
            for (int var9 = arg3; var9 < var5; var9++) {
                int var10;
                if (var6 == null) {
                    var10 = var9;
                } else {
                    var10 = var6[var9];
                }
                if (var7[var10] == null) {
                    var8 = false;
                    break;
                }
            }
            if (var8) {
                return true;
            }
            byte[] var11;
            if (arg0 != null && (arg0[0] != 0 || arg0[1] != 0 || arg0[2] != 0 || arg0[3] != 0)) {
                var11 = class294.method1917(arg3 ^ 0x2, true, this.field4494[arg2]);
                class675 var12 = new class675(var11);
                var12.method3731(5, arg0, var12.field9154.length, (byte) -127);
            } else {
                var11 = class294.method1917(arg3 ^ 0x2, false, this.field4494[arg2]);
            }
            byte[] var13;
            try {
                var13 = class755.method4197(var11, false);
            } catch (RuntimeException var49) {
                throw class470.method2805(var49, "T3 - " + (arg0 != null) + "," + arg2 + "," + var11.length + "," + class382.method2428(var11.length, (byte) 28, var11) + "," + class382.method2428(var11.length - 2, (byte) 28, var11) + "," + this.field4486.field1289[arg2] + "," + this.field4486.field1294);
            }
            if (this.field4470) {
                this.field4494[arg2] = null;
            }
            if (var5 <= 1) {
                int var15;
                if (var6 == null) {
                    var15 = 0;
                } else {
                    var15 = var6[0];
                }
                if (this.field4496 == 0) {
                    var7[var15] = class273.method1777(101, false, var13);
                } else {
                    var7[var15] = var13;
                }
            } else if (this.field4496 == 2) {
                int var32 = var13.length;
                int var51 = var32 - 1;
                int var33 = var13[var51] & 0xFF;
                int var34 = var51 - var33 * 4 * var5;
                class675 var35 = new class675(var13);
                int var36 = 0;
                int var37 = 0;
                var35.field9146 = var34;
                for (int var38 = 0; var38 < var33; var38++) {
                    int var39 = 0;
                    for (int var40 = 0; var40 < var5; var40++) {
                        var39 += var35.method3703(93);
                        int var41;
                        if (var6 == null) {
                            var41 = var40;
                        } else {
                            var41 = var6[var40];
                        }
                        if (arg1 == var41) {
                            var36 += var39;
                            var37 = var41;
                        }
                    }
                }
                if (var36 == 0) {
                    return true;
                }
                byte[] var42 = new byte[var36];
                var35.field9146 = var34;
                int var43 = 0;
                int var44 = 0;
                for (int var45 = 0; var45 < var33; var45++) {
                    int var46 = 0;
                    for (int var47 = 0; var47 < var5; var47++) {
                        var46 += var35.method3703(arg3 ^ 0x5F);
                        int var48;
                        if (var6 == null) {
                            var48 = var47;
                        } else {
                            var48 = var6[var47];
                        }
                        if (arg1 == var48) {
                            class255.method1690(var13, var44, var42, var43, var46);
                            var43 += var46;
                        }
                        var44 += var46;
                    }
                }
                var7[var37] = var42;
            } else {
                int var16 = var13.length;
                int var50 = var16 - 1;
                int var17 = var13[var50] & 0xFF;
                int var18 = var50 - var5 * var17 * 4;
                class675 var19 = new class675(var13);
                int[] var20 = new int[var5];
                var19.field9146 = var18;
                for (int var21 = 0; var21 < var17; var21++) {
                    int var22 = 0;
                    for (int var23 = 0; var23 < var5; var23++) {
                        var22 += var19.method3703(123);
                        var20[var23] += var22;
                    }
                }
                byte[][] var24 = new byte[var5][];
                for (int var25 = 0; var25 < var5; var25++) {
                    var24[var25] = new byte[var20[var25]];
                    var20[var25] = 0;
                }
                var19.field9146 = var18;
                int var26 = 0;
                for (int var27 = 0; var27 < var17; var27++) {
                    int var28 = 0;
                    for (int var29 = 0; var29 < var5; var29++) {
                        var28 += var19.method3703(arg3 + 90);
                        class255.method1690(var13, var26, var24[var29], var20[var29], var28);
                        var26 += var28;
                        var20[var29] += var28;
                    }
                }
                for (int var30 = 0; var30 < var5; var30++) {
                    int var31;
                    if (var6 == null) {
                        var31 = var30;
                    } else {
                        var31 = var6[var30];
                    }
                    if (this.field4496 == 0) {
                        var7[var31] = class273.method1777(88, false, var24[var30]);
                    } else {
                        var7[var31] = var24[var30];
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(II)Z", line = 533)
    public final boolean method2088(int arg0, int arg1) {
        field4469++;
        int var3 = 63 % ((arg1 - 33) / 54);
        if (!this.method2105(-109)) {
            return false;
        } else if (this.field4486.field1296.length == 1) {
            return this.method2097((byte) -84, 0, arg0);
        } else if (!this.method2107(13540, arg0)) {
            return false;
        } else if (this.field4486.field1296[arg0] == 1) {
            return this.method2097((byte) -117, arg0, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fp", name = "f", descriptor = "(II)I", line = 559)
    private final int method2089(int arg0, int arg1) {
        field4477++;
        if (this.method2107(13540, arg1)) {
            if (arg0 != 0) {
                method2085((byte) 14);
            }
            return this.field4494[arg1] == null ? this.field4467.method1209(false, arg1) : 100;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILjava/lang/String;)I", line = 576)
    public final int method2090(int arg0, String arg1) {
        field4489++;
        if (this.method2105(108)) {
            int var3 = -66 % ((57 - arg0) / 52);
            String var4 = arg1.toLowerCase();
            int var5 = this.field4486.field1293.method2427(false, class432.method2633(var4, (byte) -24));
            return this.method2107(13540, var5) ? var5 : -1;
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;I)Z", line = 600)
    public final boolean method2091(String arg0, int arg1) {
        field4464++;
        if (arg1 != -2) {
            return false;
        } else if (this.method2105(arg1 + 124)) {
            String var3 = arg0.toLowerCase();
            int var4 = this.field4486.field1293.method2427(false, class432.method2633(var3, (byte) -61));
            return this.method2101(var4, -88);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZIZ)V", line = 620)
    public final void method2092(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            this.method2104(null, (byte) 96);
        }
        field4461++;
        if (!this.method2105(123)) {
            return;
        }
        if (arg2) {
            this.field4486.field1297 = null;
            this.field4486.field1293 = null;
        }
        if (arg0) {
            this.field4486.field1291 = null;
            this.field4486.field1288 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BLjava/lang/String;)Z", line = 653)
    public final boolean method2093(byte arg0, String arg1) {
        field4463++;
        if (this.method2105(120)) {
            String var3 = arg1.toLowerCase();
            int var4 = this.field4486.field1293.method2427(false, class432.method2633(var3, (byte) -46));
            int var5 = -28 % ((-arg0 - 65) / 57);
            return var4 >= 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;)Z", line = 685)
    public final boolean method2094(int arg0, String arg1, String arg2) {
        field4458++;
        if (!this.method2105(108)) {
            return false;
        }
        String var4 = arg1.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field4486.field1293.method2427(false, class432.method2633(var4, (byte) -80));
        if (var6 < 0) {
            return false;
        }
        int var7 = this.field4486.field1291[var6].method2427(false, class432.method2633(var5, (byte) -108));
        if (arg0 <= 21) {
            this.method2091(null, -72);
        }
        return var7 >= 0;
    }

    @OriginalMember(owner = "client!fp", name = "d", descriptor = "(I)I", line = 712)
    public final int method2095(int arg0) {
        int var2 = -53 % ((68 - arg0) / 46);
        field4488++;
        if (!this.method2105(-97)) {
            throw new IllegalStateException("");
        }
        return this.field4486.field1294;
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)Z", line = 725)
    private final boolean method2096(String arg0, int arg1, String arg2) {
        field4481++;
        if (!this.method2105(117)) {
            return false;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg2.toLowerCase();
        int var6 = this.field4486.field1293.method2427(false, class432.method2633(var4, (byte) -45));
        if (!this.method2107(13540, var6)) {
            return false;
        } else if (arg1 == 5) {
            int var7 = this.field4486.field1291[var6].method2427(false, class432.method2633(var5, (byte) -128));
            return this.method2097((byte) -101, var6, var7);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(BII)Z", line = 750)
    public final boolean method2097(byte arg0, int arg1, int arg2) {
        field4465++;
        if (!this.method2110((byte) 25, arg2, arg1)) {
            return false;
        }
        if (arg0 >= -66) {
            this.method2097((byte) -101, 122, 79);
        }
        if (this.field4473[arg1] != null && this.field4473[arg1][arg2] != null) {
            return true;
        } else if (this.field4494[arg1] == null) {
            this.method2079(-1, arg1);
            return this.field4494[arg1] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fp", name = "<init>", descriptor = "(Lrfa;ZI)V", line = 1106)
    public class323(class197 arg0, boolean arg1, int arg2) {
        if (arg2 < 0 || arg2 > 2) {
            throw new IllegalArgumentException("js5: Invalid value " + arg2 + " supplied for discardunpacked");
        }
        this.field4496 = arg2;
        this.field4467 = arg0;
        this.field4470 = arg1;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(B)I", line = 782)
    public final int method2098(byte arg0) {
        field4483++;
        if (arg0 == 20) {
            return this.method2105(arg0 ^ 0xFFFFFFD5) ? this.field4486.field1296.length : -1;
        } else {
            return 127;
        }
    }

    @OriginalMember(owner = "client!fp", name = "g", descriptor = "(II)V", line = 797)
    private final void method2099(int arg0, int arg1) {
        if (arg0 > -64) {
            this.field4494 = null;
        }
        field4476++;
        this.field4467.method1210((byte) 1, arg1);
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(IBI)[B", line = 808)
    public final byte[] method2100(int arg0, byte arg1, int arg2) {
        if (arg1 != 112) {
            this.method2081(53);
        }
        field4497++;
        return this.method2103(arg2, null, (byte) 105, arg0);
    }

    @OriginalMember(owner = "client!fp", name = "h", descriptor = "(II)Z", line = 819)
    public final boolean method2101(int arg0, int arg1) {
        field4485++;
        if (!this.method2107(13540, arg0)) {
            return false;
        }
        if (arg1 >= -58) {
            method2085((byte) 4);
        }
        if (this.field4494[arg0] == null) {
            this.method2079(-1, arg0);
            return this.field4494[arg0] != null;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;I)[B", line = 844)
    public final byte[] method2102(String arg0, String arg1, int arg2) {
        if (arg2 != 0) {
            return null;
        }
        field4498++;
        if (!this.method2105(arg2 ^ 0x7D)) {
            return null;
        }
        String var4 = arg0.toLowerCase();
        String var5 = arg1.toLowerCase();
        int var6 = this.field4486.field1293.method2427(false, class432.method2633(var4, (byte) -39));
        if (this.method2107(13540, var6)) {
            int var7 = this.field4486.field1291[var6].method2427(false, class432.method2633(var5, (byte) -77));
            return this.method2100(var7, (byte) 112, var6);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(I[IBI)[B", line = 870)
    public final byte[] method2103(int arg0, int[] arg1, byte arg2, int arg3) {
        field4471++;
        if (!this.method2110((byte) 25, arg3, arg0)) {
            return null;
        }
        if (this.field4473[arg0] == null || this.field4473[arg0][arg3] == null) {
            boolean var5 = this.method2087(arg1, arg3, arg0, arg2 ^ 0x69);
            if (!var5) {
                this.method2079(-1, arg0);
                boolean var6 = this.method2087(arg1, arg3, arg0, 0);
                if (!var6) {
                    return null;
                }
            }
        }
        byte[] var7 = class294.method1917(2, false, this.field4473[arg0][arg3]);
        if (this.field4496 == 1) {
            this.field4473[arg0][arg3] = null;
            if (this.field4486.field1296[arg0] == 1) {
                this.field4473[arg0] = null;
            }
        } else if (this.field4496 == 2) {
            this.field4473[arg0] = null;
        }
        if (arg2 != 105) {
            this.field4486 = null;
        }
        return var7;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(Ljava/lang/String;B)Z", line = 921)
    public final boolean method2104(String arg0, byte arg1) {
        field4459++;
        int var3 = this.method2090(124, "");
        if (var3 == -1) {
            int var4 = -70 / ((-arg1 - 53) / 52);
            return this.method2096(arg0, 5, "");
        } else {
            return this.method2096("", 5, arg0);
        }
    }

    @OriginalMember(owner = "client!fp", name = "e", descriptor = "(I)Z", line = 937)
    private final boolean method2105(int arg0) {
        int var2 = 108 / ((arg0 - 63) / 37);
        field4491++;
        if (this.field4486 == null) {
            this.field4486 = this.field4467.method1213(12607);
            if (this.field4486 == null) {
                return false;
            }
            this.field4473 = new Object[this.field4486.field1295][];
            this.field4494 = new Object[this.field4486.field1295];
        }
        return true;
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(BLjava/lang/String;)V", line = 959)
    public final void method2106(byte arg0, String arg1) {
        field4475++;
        if (!this.method2105(121)) {
            return;
        }
        String var3 = arg1.toLowerCase();
        int var4 = this.field4486.field1293.method2427(false, class432.method2633(var3, (byte) -59));
        this.method2099(-105, var4);
        if (arg0 >= -8) {
            this.field4494 = null;
        }
    }

    @OriginalMember(owner = "client!fp", name = "i", descriptor = "(II)Z", line = 983)
    private final boolean method2107(int arg0, int arg1) {
        field4492++;
        if (!this.method2105(110)) {
            return false;
        } else if (arg1 >= 0 && arg1 < this.field4486.field1296.length && this.field4486.field1296[arg1] != 0) {
            if (arg0 != 13540) {
                this.field4470 = false;
            }
            return true;
        } else if (class516.field7362) {
            throw new IllegalArgumentException(Integer.toString(arg1));
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fp", name = "j", descriptor = "(II)[B", line = 1010)
    public final byte[] method2108(int arg0, int arg1) {
        field4495++;
        if (!this.method2105(arg1 ^ 0xFFFFFFAE)) {
            return null;
        } else if (arg1 != 0) {
            return null;
        } else if (this.field4486.field1296.length == 1) {
            return this.method2100(arg0, (byte) 112, 0);
        } else if (!this.method2107(13540, arg0)) {
            return null;
        } else if (this.field4486.field1296[arg0] == 1) {
            return this.method2100(0, (byte) 112, arg0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!fp", name = "c", descriptor = "(B)V", line = 1038)
    public final void method2109(byte arg0) {
        field4474++;
        if (arg0 > 38 && this.field4494 != null) {
            for (int var2 = 0; var2 < this.field4494.length; var2++) {
                this.field4494[var2] = null;
            }
        }
    }

    @OriginalMember(owner = "client!fp", name = "b", descriptor = "(BII)Z", line = 1061)
    private final boolean method2110(byte arg0, int arg1, int arg2) {
        field4493++;
        if (arg0 != 25) {
            field4490 = null;
        }
        if (!this.method2105(arg0 ^ 0xFFFFFFA0)) {
            return false;
        } else if (arg2 >= 0 && arg1 >= 0 && this.field4486.field1296.length > arg2 && arg1 < this.field4486.field1296[arg2]) {
            return true;
        } else if (class516.field7362) {
            throw new IllegalArgumentException(arg2 + "," + arg1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fp", name = "a", descriptor = "(ZI)I", line = 1086)
    public final int method2111(boolean arg0, int arg1) {
        field4460++;
        if (!this.method2105(17)) {
            return -1;
        } else if (arg0) {
            return 45;
        } else {
            int var3 = this.field4486.field1293.method2427(arg0, arg1);
            return this.method2107(13540, var3) ? var3 : -1;
        }
    }
}
