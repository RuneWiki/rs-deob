import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aa")
public class class214 extends class285 {

    @OriginalMember(owner = "client!aa", name = "S", descriptor = "I")
    private int field3490 = -1;

    @OriginalMember(owner = "client!aa", name = "R", descriptor = "Lhh;")
    public static class169 field3489 = new class169();

    @OriginalMember(owner = "client!aa", name = "O", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!aa", name = "P", descriptor = "I")
    private int field3487;

    @OriginalMember(owner = "client!aa", name = "Q", descriptor = "I")
    public static int field3488;

    @OriginalMember(owner = "client!aa", name = "T", descriptor = "I")
    public static int field3491;

    @OriginalMember(owner = "client!aa", name = "U", descriptor = "I")
    public static int field3492;

    @OriginalMember(owner = "client!aa", name = "W", descriptor = "I")
    public static int field3494;

    @OriginalMember(owner = "client!aa", name = "X", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!aa", name = "Y", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!aa", name = "Z", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!aa", name = "ab", descriptor = "I")
    public static int field3498;

    @OriginalMember(owner = "client!aa", name = "db", descriptor = "I")
    public static int field3501;

    @OriginalMember(owner = "client!aa", name = "eb", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!aa", name = "fb", descriptor = "I")
    public static int field3503;

    @OriginalMember(owner = "client!aa", name = "gb", descriptor = "I")
    private int field3504;

    @OriginalMember(owner = "client!aa", name = "bb", descriptor = "Lnc;")
    public static class161 field3499;

    @OriginalMember(owner = "client!aa", name = "V", descriptor = "Lak;")
    public static class172 field3493;

    @OriginalMember(owner = "client!aa", name = "cb", descriptor = "[I")
    private int[] field3500;

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZLjj;I)V", line = 4)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field3491++;
        if (arg0 && arg2 == 0) {
            this.field3490 = arg1.method271(21081);
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ILqi;)I", line = 20)
    public static final int method1536(int arg0, class234 arg1) {
        field3488++;
        class256 var2 = arg1.field3752;
        if (arg0 != 0) {
            field3489 = (class169) null;
        }
        if (var2.field4080 != null) {
            var2 = var2.method1843(arg0 - 1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field4076;
        class17 var4 = arg1.method1876((byte) 125);
        if (arg1.field4232 == var4.field200) {
            var3 = var2.field4124;
        } else if (arg1.field4232 == var4.field229 || arg1.field4232 == var4.field210 || arg1.field4232 == var4.field217 || arg1.field4232 == var4.field202) {
            var3 = var2.field4084;
        } else if (arg1.field4232 == var4.field224 || arg1.field4232 == var4.field208 || arg1.field4232 == var4.field218 || arg1.field4232 == var4.field199) {
            var3 = var2.field4075;
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(Z)I", line = 62)
    public final int method1537(boolean arg0) {
        field3495++;
        return arg0 ? this.field3490 : 24;
    }

    @OriginalMember(owner = "client!aa", name = "i", descriptor = "(I)V", line = 74)
    public final void method1028(int arg0) {
        super.method1028(arg0);
        this.field3500 = null;
        field3494++;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(IIIIIIIIII)V", line = 90)
    public static final void method1538(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3492++;
        if (arg0 >= -54) {
            field3489 = (class169) null;
        }
        if (arg1 == arg3 && arg4 == arg5 && arg2 == arg8 && arg7 == arg9) {
            class70.method462(arg3, (byte) -87, arg7, arg2, arg4, arg6);
            return;
        }
        int var10 = arg3;
        int var11 = arg4;
        int var12 = arg4 * 3;
        int var13 = arg3 * 3;
        int var14 = arg1 * 3;
        int var15 = arg8 * 3;
        int var16 = var14 + arg2 - var15 - arg3;
        int var17 = arg5 * 3;
        int var18 = arg9 * 3;
        int var19 = arg7 + var17 - arg4 - var18;
        int var20 = var14 - var13;
        int var21 = var15 + var13 - var14 - var14;
        int var22 = var12 + var18 - var17 - var17;
        int var23 = var17 - var12;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var21 * var25;
            int var27 = var20 * var24;
            int var28 = var23 * var24;
            int var29 = var24 * var25 >> 12;
            int var30 = var16 * var29;
            int var31 = var22 * var25;
            int var32 = var19 * var29;
            int var33 = (var26 + var27 + var30 >> 12) + arg3;
            int var34 = (var28 + var31 + var32 >> 12) + arg4;
            class70.method462(var10, (byte) -87, var34, var33, var11, arg6);
            var10 = var33;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!aa", name = "<init>", descriptor = "()V", line = 282)
    public class214() {
        super(0, false);
    }

    @OriginalMember(owner = "client!aa", name = "j", descriptor = "(I)V", line = 169)
    public static final void method1539(int arg0) {
        field3497++;
        int var1 = class247.field3898.method2374(8, (byte) -36);
        if (class275.field4435 > var1) {
            for (int var2 = var1; var2 < class275.field4435; var2++) {
                class117.field1773[class24.field330++] = class160.field2656[var2];
            }
        }
        if (arg0 <= 99) {
            method1542(true, (byte) 7);
        }
        if (class275.field4435 < var1) {
            throw new RuntimeException("gppov1");
        }
        class275.field4435 = 0;
        for (int var3 = 0; var3 < var1; var3++) {
            int var4 = class160.field2656[var3];
            class334 var5 = class74.field1049[var4];
            int var6 = class247.field3898.method2374(1, (byte) -36);
            if (var6 == 0) {
                class160.field2656[class275.field4435++] = var4;
                var5.field4204 = class240.field3818;
            } else {
                int var7 = class247.field3898.method2374(2, (byte) -36);
                if (var7 == 0) {
                    class160.field2656[class275.field4435++] = var4;
                    var5.field4204 = class240.field3818;
                    class322.field4988[class192.field3138++] = var4;
                } else if (var7 == 1) {
                    class160.field2656[class275.field4435++] = var4;
                    var5.field4204 = class240.field3818;
                    int var12 = class247.field3898.method2374(3, (byte) -36);
                    var5.method1885(1, -19157, var12);
                    int var13 = class247.field3898.method2374(1, (byte) -36);
                    if (var13 == 1) {
                        class322.field4988[class192.field3138++] = var4;
                    }
                } else if (var7 == 2) {
                    class160.field2656[class275.field4435++] = var4;
                    var5.field4204 = class240.field3818;
                    if (class247.field3898.method2374(1, (byte) -36) == 1) {
                        int var8 = class247.field3898.method2374(3, (byte) -36);
                        var5.method1885(2, -19157, var8);
                        int var9 = class247.field3898.method2374(3, (byte) -36);
                        var5.method1885(2, -19157, var9);
                    } else {
                        int var10 = class247.field3898.method2374(3, (byte) -36);
                        var5.method1885(0, -19157, var10);
                    }
                    int var11 = class247.field3898.method2374(1, (byte) -36);
                    if (var11 == 1) {
                        class322.field4988[class192.field3138++] = var4;
                    }
                } else if (var7 == 3) {
                    class117.field1773[class24.field330++] = var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(CLjava/lang/String;I)I", line = 290)
    public static final int method1540(char arg0, String arg1, int arg2) {
        int var3 = arg2;
        int var4 = arg1.length();
        field3501++;
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg1.charAt(var5) == arg0) {
                var3++;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(BI)[[I", line = 316)
    public final int[][] method62(byte arg0, int arg1) {
        field3502++;
        if (arg0 <= 121) {
            this.method1543(-123);
        }
        int[][] var3 = this.field4564.method1552(arg1, (byte) -69);
        if (this.field4564.field3529 && this.method1543(1)) {
            int var4 = this.field3487 * (class27.field372 == this.field3504 ? arg1 : this.field3504 * arg1 / class27.field372);
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            if (class287.field4599 == this.field3487) {
                for (int var8 = 0; var8 < class287.field4599; var8++) {
                    int var9 = this.field3500[var4++];
                    var6[var8] = client.method767(var9 << 4, 4080);
                    var5[var8] = client.method767(var9, 65280) >> 4;
                    var7[var8] = client.method767(var9 >> 12, 4080);
                }
            } else {
                for (int var10 = 0; var10 < class287.field4599; var10++) {
                    int var11 = this.field3487 * var10 / class287.field4599;
                    int var12 = this.field3500[var4 + var11];
                    var6[var10] = client.method767(var12, 255) << 4;
                    var5[var10] = client.method767(4080, var12 >> 4);
                    var7[var10] = client.method767(var12 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!aa", name = "k", descriptor = "(I)V", line = 386)
    public static void method1541(int arg0) {
        if (arg0 == 8) {
            field3493 = null;
            field3499 = null;
            field3489 = null;
        }
    }

    @OriginalMember(owner = "client!aa", name = "a", descriptor = "(ZB)V", line = 399)
    public static final void method1542(boolean arg0, byte arg1) {
        if (arg1 != 109) {
            return;
        }
        field3503++;
        byte var2;
        byte[][] var3;
        if (class232.field3690 && arg0) {
            var2 = 1;
            var3 = class156.field2413;
        } else {
            var3 = class129.field2017;
            var2 = 4;
        }
        int[] var4 = null;
        for (int var5 = 0; var5 < var2; var5++) {
            class76.method516((byte) -51);
            for (int var6 = 0; var6 < 13; var6++) {
                for (int var7 = 0; var7 < 13; var7++) {
                    boolean var8 = false;
                    int var9 = class83.field1172[var5][var6][var7];
                    if (var9 != -1) {
                        int var10 = var9 >> 24 & 0x3;
                        if (!arg0 || var10 == 0) {
                            int var11 = (var9 & 0x7) >> 1;
                            int var12 = (var9 & 0xFFD81F) >> 14;
                            int var13 = (var9 & 0x3FFA) >> 3;
                            int var14 = (var12 / 8 << 8) + var13 / 8;
                            for (int var15 = 0; var15 < class330.field5109.length; var15++) {
                                if (class330.field5109[var15] == var14 && var3[var15] != null) {
                                    var8 = true;
                                    int[] var16 = class51.method335(var7 * 8, var12, var11, var5, class126.field1964, (byte) -64, var6 * 8, var10, var13, arg0, var3[var15]);
                                    if (var4 == null && var16 != null) {
                                        var4 = var16;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class84.method568(var7 * 8, 8, (byte) -122, var5, 8, var6 * 8);
                    }
                }
            }
        }
        if (var4 == null) {
            class55.field771 = -1;
            return;
        }
        class89.field1238 = var4[3];
        class55.field771 = var4[0];
        class243.field3841 = var4[2];
        class160.field2652 = var4[4];
        class86.field1198 = var4[1];
    }

    @OriginalMember(owner = "client!aa", name = "l", descriptor = "(I)Z", line = 507)
    private final boolean method1543(int arg0) {
        field3496++;
        if (this.field3500 != null) {
            return true;
        }
        if (arg0 != 1) {
            method1536(31, (class234) null);
        }
        if (this.field3490 < 0) {
            return false;
        }
        int var2 = class287.field4599;
        int var3 = class27.field372;
        int var4 = class210.field3453.method437((byte) 75, this.field3490).field253 ? 64 : 128;
        this.field3500 = class210.field3453.method439(1000, var4, false, var4, this.field3490, 1.0F);
        this.field3504 = var4;
        this.field3487 = var4;
        class324.method2271((byte) -76, var2, var3);
        return this.field3500 != null;
    }
}
