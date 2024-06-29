import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class439 {

    @OriginalMember(owner = "client!uj", name = "j", descriptor = "I")
    private int field6443 = -1;

    @OriginalMember(owner = "client!uj", name = "w", descriptor = "Z")
    private boolean field6456 = true;

    @OriginalMember(owner = "client!uj", name = "i", descriptor = "[Lcg;")
    private class269[] field6442;

    @OriginalMember(owner = "client!uj", name = "m", descriptor = "I")
    private int field6446;

    @OriginalMember(owner = "client!uj", name = "g", descriptor = "I")
    private int field6440;

    @OriginalMember(owner = "client!uj", name = "c", descriptor = "I")
    private int field6436;

    @OriginalMember(owner = "client!uj", name = "n", descriptor = "I")
    private int field6447;

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "Lcg;")
    private class269 field6435;

    @OriginalMember(owner = "client!uj", name = "l", descriptor = "[Lcg;")
    private class269[] field6445;

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "I")
    public static int field6437 = 0;

    @OriginalMember(owner = "client!uj", name = "h", descriptor = "[I")
    public static int[] field6441 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!uj", name = "t", descriptor = "Lcr;")
    public static class189 field6453 = new class189(64);

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "I")
    public static int field6434;

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "I")
    private int field6438;

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "I")
    private int field6439;

    @OriginalMember(owner = "client!uj", name = "k", descriptor = "I")
    public static int field6444;

    @OriginalMember(owner = "client!uj", name = "o", descriptor = "I")
    public static int field6448;

    @OriginalMember(owner = "client!uj", name = "p", descriptor = "I")
    public static int field6449;

    @OriginalMember(owner = "client!uj", name = "q", descriptor = "I")
    public static int field6450;

    @OriginalMember(owner = "client!uj", name = "r", descriptor = "I")
    public static int field6451;

    @OriginalMember(owner = "client!uj", name = "u", descriptor = "I")
    public static int field6454;

    @OriginalMember(owner = "client!uj", name = "v", descriptor = "I")
    public static int field6455;

    @OriginalMember(owner = "client!uj", name = "s", descriptor = "Lcq;")
    private class67 field6452;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILlm;)V", line = 14)
    public static final void method2759(int arg0, class347 arg1) {
        field6434++;
        class403.field6003 = arg1;
        if (arg0 != 31279) {
            method2762(-85);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(I)V", line = 29)
    public static final void method2760(int arg0) {
        field6455++;
        class333.field4826.method1141(256);
        if (arg0 != 22408) {
            method2762(-27);
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(B)V", line = 45)
    public final void method2761(byte arg0) {
        if (this.field6442 != null) {
            for (int var2 = 0; var2 < this.field6442.length; var2++) {
                this.field6442[var2].method1831();
            }
        }
        if (arg0 != -44) {
            this.field6443 = 15;
        }
        field6449++;
        this.field6452 = null;
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(I)V", line = 69)
    public static void method2762(int arg0) {
        field6453 = null;
        if (arg0 == 21490) {
            field6441 = null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "<init>", descriptor = "(I[Lcg;IIII)V", line = 493)
    public class439(int arg0, class269[] arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field6442 = arg1;
        this.field6446 = arg3;
        this.field6440 = arg5;
        this.field6436 = arg0;
        this.field6447 = arg4;
        if (arg1 == null) {
            this.field6435 = null;
            this.field6445 = null;
        } else {
            this.field6445 = new class269[arg1.length];
            this.field6435 = arg2 >= 0 ? arg1[arg2] : null;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILfh;Lii;)V", line = 88)
    public static final void method2763(int arg0, class210 arg1, class405 arg2) {
        if (arg0 != -4096) {
            method2762(126);
        }
        field6444++;
        if (class293.field4174 == null) {
            return;
        }
        if (class180.field2383 < 10) {
            if (!class293.field4175.method2282(class293.field4174.field3460, (byte) 65)) {
                class180.field2383 = class28.field417.method2275(class293.field4174.field3460, -1) / 10;
                return;
            }
            class283.method1952(0);
            class180.field2383 = 10;
        }
        if (class180.field2383 == 10) {
            class293.field4205 = class293.field4174.field3454 >> 6 << 6;
            class293.field4197 = class293.field4174.field3453 >> 6 << 6;
            class293.field4199 = (class293.field4174.field3455 >> 6 << 6) + 64 - class293.field4205;
            class293.field4192 = (class293.field4174.field3450 >> 6 << 6) + 64 - class293.field4197;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class293.field4174.method1526((class227.field2988.field740 >> 7) + class7.field138, class227.field2981, false, (class227.field2988.field734 >> 7) + class200.field2660, var3)) {
                var5 = var3[2] - class293.field4197;
                var4 = var3[1] - class293.field4205;
            }
            if (!class211.field2820 && var4 >= 0 && var4 < class293.field4199 && var5 >= 0 && class293.field4192 > var5) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + (int) (Math.random() * 10.0D) - 5;
                class373.field5426 = var7;
                class44.field624 = var6;
            } else if (class8.field144 == -1 || class177.field2339 == -1) {
                class293.field4174.method1522(var3, class293.field4174.field3462 & 0x3FFF, (byte) -102, class293.field4174.field3462 >> 14 & 0x3FFF);
                class373.field5426 = var3[2] - class293.field4197;
                class44.field624 = var3[1] - class293.field4205;
            } else {
                class293.field4174.method1522(var3, class177.field2339, (byte) 77, class8.field144);
                if (var3 != null) {
                    class373.field5426 = var3[2] - class293.field4197;
                    class44.field624 = var3[1] - class293.field4205;
                }
                class177.field2339 = -1;
                class8.field144 = -1;
                class211.field2820 = false;
            }
            if (class293.field4174.field3459 == 37) {
                class293.field4176 = 3.0F;
                class293.field4179 = 3.0F;
            } else if (class293.field4174.field3459 == 50) {
                class293.field4176 = 4.0F;
                class293.field4179 = 4.0F;
            } else if (class293.field4174.field3459 == 75) {
                class293.field4176 = 6.0F;
                class293.field4179 = 6.0F;
            } else if (class293.field4174.field3459 == 100) {
                class293.field4176 = 8.0F;
                class293.field4179 = 8.0F;
            } else if (class293.field4174.field3459 == 200) {
                class293.field4176 = 16.0F;
                class293.field4179 = 16.0F;
            } else {
                class293.field4176 = 8.0F;
                class293.field4179 = 8.0F;
            }
            class293.field4185 = (int) class293.field4176 >> 1;
            class293.field4183 = class59.method415((byte) -81, class293.field4185);
            class62.method436((byte) -105);
            class293.method1988();
            class56.field747 = new class47();
            class331.field4813 = new class179();
            class293.field4182 += (int) (Math.random() * 5.0D) - 2;
            if (class293.field4182 < -8) {
                class293.field4182 = -8;
            }
            if (class293.field4182 > 8) {
                class293.field4182 = 8;
            }
            class293.field4184 += (int) (Math.random() * 5.0D) - 2;
            if (class293.field4184 < -16) {
                class293.field4184 = -16;
            }
            if (class293.field4184 > 16) {
                class293.field4184 = 16;
            }
            class293.method1990(arg1, class293.field4182 >> 2 << 10, class293.field4184 >> 1);
            class375.method2427(256, 0, 1024);
            class316.method2135(256, 256, 63);
            class435.method2744(4096, (byte) 69);
            class430.method2720(256, (byte) 76);
            class180.field2383 = 20;
        } else if (class180.field2383 == 20) {
            class140.method900(true, 133);
            class293.method1987(arg2, class293.field4182, class293.field4184);
            class180.field2383 = 60;
            class140.method900(true, arg0 ^ 0xFFFFF085);
            class390.method2508(arg0 ^ 0xFFF);
        } else if (class180.field2383 == 60) {
            if (class293.field4175.method2259(22300, class293.field4174.field3460 + "_staticelements")) {
                if (!class293.field4175.method2282(class293.field4174.field3460 + "_staticelements", (byte) 121)) {
                    return;
                }
                class293.field4177 = class12.method89(class390.field5614, class293.field4174.field3460 + "_staticelements", arg0 ^ 0x1B38, class293.field4175);
            } else {
                class293.field4177 = new class65(0);
            }
            class293.method1999();
            class180.field2383 = 70;
            class140.method900(true, arg0 ^ 0xFFFFF085);
            class390.method2508(-1);
        } else if (class180.field2383 == 70) {
            class403.field6001 = new class427(arg2, 11, true, class202.field2708);
            class180.field2383 = 73;
            class140.method900(true, 133);
            class390.method2508(arg0 + 4095);
        } else if (class180.field2383 == 73) {
            class275.field3980 = new class427(arg2, 12, true, class202.field2708);
            class180.field2383 = 76;
            class140.method900(true, 133);
            class390.method2508(-1);
        } else if (class180.field2383 == 76) {
            class367.field5304 = new class427(arg2, 14, true, class202.field2708);
            class180.field2383 = 79;
            class140.method900(true, 133);
            class390.method2508(-1);
        } else if (class180.field2383 == 79) {
            class248.field3336 = new class427(arg2, 17, true, class202.field2708);
            class180.field2383 = 82;
            class140.method900(true, 133);
            class390.method2508(-1);
        } else if (class180.field2383 == 82) {
            class131.field1800 = new class427(arg2, 19, true, class202.field2708);
            class180.field2383 = 85;
            class140.method900(true, arg0 ^ 0xFFFFF085);
            class390.method2508(-1);
        } else if (class180.field2383 == 85) {
            class7.field91 = new class427(arg2, 22, true, class202.field2708);
            class180.field2383 = 88;
            class140.method900(true, arg0 + 4229);
            class390.method2508(arg0 ^ 0xFFF);
        } else if (class180.field2383 == 88) {
            class368.field5316 = new class427(arg2, 26, true, class202.field2708);
            class180.field2383 = 91;
            class140.method900(true, 133);
            class390.method2508(-1);
        } else {
            class302.field4445 = new class427(arg2, 30, true, class202.field2708);
            class180.field2383 = 100;
            class140.method900(true, 133);
            class390.method2508(-1);
            System.gc();
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IBIIILii;IIII)V", line = 327)
    public final void method2764(int arg0, byte arg1, int arg2, int arg3, int arg4, class405 arg5, int arg6, int arg7, int arg8, int arg9) {
        int var11 = arg0 + arg2 & 0x3FFF;
        field6454++;
        if (this.field6436 == -1) {
            arg5.method1632(arg9, arg8, arg4, arg7, arg3, 0);
        } else {
            class444 var12 = class89.field1253.method186(this.field6436, -9590);
            if (this.field6452 == null && class89.field1253.method184(this.field6436, arg1 + 14655)) {
                int[] var13 = var12.field6500 ? class89.field1253.method181(this.field6438, (byte) 100, false, this.field6438, this.field6436, 0.7F) : class89.field1253.method185(false, -128, this.field6438, this.field6438, 0.7F, this.field6436);
                this.field6452 = arg5.method1624(var13, 0, this.field6438, this.field6438, this.field6438);
            }
            if (!var12.field6500) {
                arg5.method1632(arg9, arg8, arg4, arg7, arg3, 0);
            }
            if (this.field6452 != null) {
                int var14 = var12.field6500 ? 0 : 1;
                int var15 = arg6 * arg7 / -4096;
                int var16;
                for (var16 = arg7 * var11 / 4096 + (arg4 - arg7) / 2; var16 > arg7; var16 -= arg7) {
                }
                while (var16 < 0) {
                    var16 += arg7;
                }
                while (arg7 < var15) {
                    var15 -= arg7;
                }
                while (var15 < 0) {
                    var15 += arg7;
                }
                for (int var17 = var16 - arg7; var17 < arg4; var17 += arg7) {
                    for (int var18 = var15 - arg7; var18 < arg7; var18 += arg7) {
                        this.field6452.method402(arg9 + var17, arg8 + var18, arg7, arg7, 0, 0, var14);
                    }
                }
            }
        }
        int var19 = this.field6439 - 1;
        if (arg1 != -99) {
            method2759(-123, (class347) null);
        }
        while (var19 >= 0) {
            this.field6445[var19].method1837(arg5, arg9, arg8, arg4, arg7, arg6, var11);
            var19--;
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILii;I)Z", line = 406)
    public final boolean method2765(int arg0, class405 arg1, int arg2) {
        if (this.field6443 != arg0) {
            this.field6443 = arg0;
            int var4 = class139.method896(arg0, -113);
            if (var4 > arg0) {
                var4 = class298.method2043(arg0, -125);
            }
            if (var4 > 512) {
                var4 = 512;
            }
            if (this.field6438 != var4) {
                this.field6438 = var4;
                this.field6452 = null;
            }
            if (this.field6442 != null) {
                this.field6439 = 0;
                int[] var5 = new int[this.field6442.length];
                for (int var6 = 0; var6 < this.field6442.length; var6++) {
                    class269 var7 = this.field6442[var6];
                    if (var7.method1834(this.field6446, this.field6447, this.field6440, this.field6443)) {
                        var5[this.field6439] = var7.field3891;
                        this.field6445[this.field6439++] = var7;
                    }
                }
                class319.method2150(0, -1, var5, this.field6445, this.field6439 - 1);
            }
            this.field6456 = true;
        }
        field6450++;
        int var8 = 57 % ((arg2 + 21) / 48);
        boolean var9 = false;
        if (this.field6456) {
            this.field6456 = false;
            for (int var10 = this.field6439 - 1; var10 >= 0; var10--) {
                boolean var11 = this.field6445[var10].method1835(arg1, this.field6435);
                var9 |= var11;
                this.field6456 |= !var11;
            }
        }
        return var9;
    }
}
