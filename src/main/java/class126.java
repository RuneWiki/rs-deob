import java.security.MessageDigest;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class126 {

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "[I")
    private int[] field2254;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "[I")
    private int[] field2257;

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lia;")
    public static class257 field2251 = class28.method234(-16, "<col=ff9040>");

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Lw;")
    public static class82 field2260 = new class82(128);

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field2252;

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "I")
    private int field2253;

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "I")
    public static int field2255;

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "I")
    public static int field2256;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "I")
    private int field2259;

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "I")
    private int field2264;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    private int field2265;

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(B)V")
    public static void method874(byte arg0) {
        if (arg0 >= -11) {
            method880(97, -109, -43, (class31) null, -106, -55, false, (class168) null, 119, -90, 101, -55, -79, -8);
        }
        field2251 = null;
        field2260 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V")
    public static final void method875(boolean arg0) {
        class137.field2454 = null;
        if (arg0) {
            return;
        }
        class154.field2701 = null;
        class57.field1212 = null;
        field2256++;
        class3.field92 = null;
        class72.field1411 = null;
        class193.field3287 = null;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIIIZIII)V")
    public static final void method876(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7) {
        field2252++;
        int var8 = arg0 + arg7;
        int var9 = arg1 - arg7;
        int var10 = arg6 + arg7;
        for (int var11 = arg0; var11 < var8; var11++) {
            class94.method692(class185.field3220[var11], (byte) -127, arg6, arg2, arg3);
        }
        int var12 = arg3 - arg7;
        for (int var13 = arg1; var13 > var9; var13--) {
            class94.method692(class185.field3220[var13], (byte) -122, arg6, arg2, arg3);
        }
        if (!arg4) {
            field2266 = 45;
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class185.field3220[var14];
            class94.method692(var15, (byte) -128, arg6, arg2, var10);
            class94.method692(var15, (byte) -126, var10, arg5, var12);
            class94.method692(var15, (byte) 122, var12, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V")
    private final void method877(int arg0) {
        field2258++;
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = arg0; var10 < 4; var10++) {
            int var61 = var9 ^ var8 << 11;
            int var62 = var6 + var61;
            int var63 = var7 + var8;
            int var64 = var63 ^ var7 >>> 2;
            int var65 = var5 + var64;
            int var66 = var7 + var62;
            int var67 = var66 ^ var62 << 8;
            int var68 = var4 + var67;
            int var69 = var62 + var65;
            var6 = var69 ^ var65 >>> 16;
            int var70 = var65 + var68;
            var5 = var70 ^ var68 << 10;
            int var71 = var2 + var5;
            int var72 = var3 + var6;
            int var73 = var68 + var72;
            var4 = var73 ^ var72 >>> 4;
            int var74 = var71 + var72;
            var3 = var74 ^ var71 << 8;
            int var75 = var4 + var61;
            var8 = var3 + var64;
            int var76 = var71 + var75;
            var2 = var76 ^ var75 >>> 9;
            var9 = var8 + var75;
            var7 = var2 + var67;
        }
        for (int var11 = 0; var11 < 256; var11 += 8) {
            int var37 = this.field2257[var11 + 1] + var8;
            int var38 = this.field2257[var11 + 2] + var7;
            int var39 = this.field2257[var11 + 3] + var6;
            int var40 = this.field2257[var11] + var9;
            int var41 = var40 ^ var37 << 11;
            int var42 = this.field2257[var11 + 7] + var2;
            int var43 = this.field2257[var11 + 5] + var4;
            int var44 = this.field2257[var11 + 4] + var5;
            int var45 = var37 + var38;
            int var46 = var45 ^ var38 >>> 2;
            int var47 = var44 + var46;
            int var48 = var39 + var41;
            int var49 = this.field2257[var11 + 6] + var3;
            int var50 = var38 + var48;
            int var51 = var50 ^ var48 << 8;
            int var52 = var43 + var51;
            int var53 = var47 + var48;
            var6 = var53 ^ var47 >>> 16;
            int var54 = var6 + var49;
            int var55 = var47 + var52;
            var5 = var55 ^ var52 << 10;
            int var56 = var5 + var42;
            int var57 = var52 + var54;
            var4 = var57 ^ var54 >>> 4;
            int var58 = var54 + var56;
            var3 = var58 ^ var56 << 8;
            var8 = var3 + var46;
            int var59 = var4 + var41;
            int var60 = var56 + var59;
            var2 = var60 ^ var59 >>> 9;
            var9 = var8 + var59;
            this.field2254[var11] = var9;
            var7 = var2 + var51;
            this.field2254[var11 + 1] = var8;
            this.field2254[var11 + 2] = var7;
            this.field2254[var11 + 3] = var6;
            this.field2254[var11 + 4] = var5;
            this.field2254[var11 + 5] = var4;
            this.field2254[var11 + 6] = var3;
            this.field2254[var11 + 7] = var2;
        }
        for (int var12 = 0; var12 < 256; var12 += 8) {
            int var13 = this.field2254[var12 + 5] + var4;
            int var14 = this.field2254[var12 + 4] + var5;
            int var15 = this.field2254[var12] + var9;
            int var16 = this.field2254[var12 + 6] + var3;
            int var17 = this.field2254[var12 + 2] + var7;
            int var18 = this.field2254[var12 + 7] + var2;
            int var19 = this.field2254[var12 + 1] + var8;
            int var20 = var15 ^ var19 << 11;
            int var21 = this.field2254[var12 + 3] + var6;
            int var22 = var17 + var19;
            int var23 = var20 + var21;
            int var24 = var22 ^ var17 >>> 2;
            int var25 = var14 + var24;
            int var26 = var17 + var23;
            int var27 = var26 ^ var23 << 8;
            int var28 = var13 + var27;
            int var29 = var23 + var25;
            var6 = var29 ^ var25 >>> 16;
            int var30 = var25 + var28;
            int var31 = var6 + var16;
            var5 = var30 ^ var28 << 10;
            int var32 = var5 + var18;
            int var33 = var28 + var31;
            var4 = var33 ^ var31 >>> 4;
            int var34 = var4 + var20;
            int var35 = var31 + var32;
            var3 = var35 ^ var32 << 8;
            int var36 = var32 + var34;
            var8 = var3 + var24;
            var2 = var36 ^ var34 >>> 9;
            var7 = var2 + var27;
            var9 = var8 + var34;
            this.field2254[var12] = var9;
            this.field2254[var12 + 1] = var8;
            this.field2254[var12 + 2] = var7;
            this.field2254[var12 + 3] = var6;
            this.field2254[var12 + 4] = var5;
            this.field2254[var12 + 5] = var4;
            this.field2254[var12 + 6] = var3;
            this.field2254[var12 + 7] = var2;
        }
        this.method879(-40);
        this.field2265 = 256;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Lia;I)Z")
    public static final boolean method878(class257 arg0, int arg1) {
        field2261++;
        try {
            int var2 = arg0.method1699(44, 35);
            if (var2 == -1) {
                return false;
            }
            class257 var3 = arg0.method1713(48, 0, var2);
            class257 var4 = arg0.method1674(var2 + 1, arg1 + 29345);
            MessageDigest var5 = MessageDigest.getInstance("SHA");
            var5.reset();
            var5.update(var3.method1667((byte) 32));
            if (arg1 != -29090) {
                field2266 = 47;
            }
            byte[] var6 = var5.digest();
            byte[] var7 = var4.method1676(1);
            class152 var8 = new class152(5000);
            var8.method1032(var7.length, 0, var7, 1848138600);
            var8.field2677 = 0;
            var8.method1072(class184.field3201, class182.field3156, -21136);
            if (var8.field2638[0] != 1) {
                return false;
            }
            for (int var9 = 0; var9 < 20; var9++) {
                if (var8.field2638[var9 + 1] != var6[var9]) {
                    return false;
                }
            }
            return true;
        } catch (Exception var10) {
            return false;
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)V")
    private final void method879(int arg0) {
        this.field2253 += ++this.field2264;
        field2263++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2254[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2259 ^= this.field2259 << 13;
                } else {
                    this.field2259 ^= this.field2259 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2259 ^= this.field2259 << 2;
            } else {
                this.field2259 ^= this.field2259 >>> 16;
            }
            this.field2259 += this.field2254[var2 + 128 & 0xFF];
            int var4;
            this.field2254[var2] = var4 = this.field2259 + this.field2254[class30.method252(var3, 1020) >> 2] + this.field2253;
            this.field2257[var2] = this.field2253 = var3 + this.field2254[class30.method252(var4, 261281) >> 8 >> 2];
        }
        if (arg0 >= -9) {
            method876(53, -22, 38, -23, true, -101, -102, -122);
        }
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(IIILfc;IIZLei;IIIIII)Lei;")
    public static final class168 method880(int arg0, int arg1, int arg2, class31 arg3, int arg4, int arg5, boolean arg6, class168 arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        long var14 = (long) ((arg1 << 16) + (arg2 << 24) + arg10) + ((long) arg0 << 32) + ((long) arg9 << 48);
        class168 var16 = (class168) class150.field2586.method836(19, var14);
        if (var16 == null) {
            byte var17;
            if (arg10 == 1) {
                var17 = 9;
            } else if (arg10 == 2) {
                var17 = 12;
            } else if (arg10 == 3) {
                var17 = 15;
            } else if (arg10 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            class67 var20 = new class67(var17 * var18 + 1, var18 * 2 * var17 + -var17, 0);
            int var21 = var20.method503(0, 0, 0);
            int[][] var22 = new int[var18][var17];
            for (int var23 = 0; var23 < var18; var23++) {
                int var30 = var19[var23];
                int var31 = var19[var23];
                for (int var32 = 0; var32 < var17; var32++) {
                    int var33 = (var32 << 11) / var17;
                    int var34 = arg13 + (class101.field1871[var33] * var31) >> 16;
                    int var35 = class101.field1872[var33] * var30 + arg5 >> 16;
                    var22[var23][var32] = var20.method503(var35, 0, var34);
                }
            }
            for (int var24 = 0; var24 < var18; var24++) {
                int var25 = (var24 * 256 + 128) / var18;
                int var26 = 256 - var25;
                short var27 = (short) (((arg0 & 0xFC00) * var26 + (arg9 & 0xFC00) * var25 & 0xFC0000) + ((arg0 & 0x7F) * var26 + (arg9 & 0x7F) * var25 & 0x7F00) + ((arg0 & 0x380) * var26 + (arg9 & 0x380) * var25 & 0x38000) >> 8);
                byte var28 = (byte) (arg1 * var26 + arg2 * var25 >> 8);
                for (int var29 = 0; var29 < var17; var29++) {
                    if (var24 == 0) {
                        var20.method514(var21, var22[0][(var29 + 1) % var17], var22[0][var29], (byte) 1, var27, var28);
                    } else {
                        var20.method514(var22[var24 - 1][var29], var22[var24 - 1][(var29 + 1) % var17], var22[var24][(var29 + 1) % var17], (byte) 1, var27, var28);
                        var20.method514(var22[var24 - 1][var29], var22[var24][(var29 + 1) % var17], var22[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var20.method506(64, 768, -50, -10, -50);
            class150.field2586.method832(var16, var14, 0);
        }
        field2250++;
        int var36 = arg10 * 64 - 1;
        int var37 = -var36;
        int var38 = -var36;
        int var39 = var36;
        int var40 = arg7.method1142();
        int var41 = arg7.method1138();
        int var42 = arg7.method1139();
        int var43 = var36;
        int var44 = arg7.method1147();
        class205 var45 = null;
        if (arg3 != null) {
            int var46 = arg3.field589[arg12];
            var45 = class94.method693(var46 >> 16, (byte) 52);
            arg12 = var46 & 0xFFFF;
        }
        if (arg6) {
            if (arg11 > 128 && arg11 < 896) {
                var38 -= 128;
            }
            if (arg11 > 1152 && arg11 < 1920) {
                var39 = var36 + 128;
            }
            if (arg11 > 1664 || arg11 < 384) {
                var37 -= 128;
            }
            if (arg11 > 640 && arg11 < 1408) {
                var43 = var36 + 128;
            }
        }
        if (arg8 != -1) {
            return null;
        }
        if (var41 > var39) {
            var41 = var39;
        }
        if (var38 > var40) {
            var40 = var38;
        }
        if (var37 > var42) {
            var42 = var37;
        }
        if (var44 > var43) {
            var44 = var43;
        }
        class168 var47;
        if (var45 == null) {
            var47 = var16.method1140(true, true);
            var47.method1146((var41 - var40) / 2, 128, (var44 - var42) / 2);
            var47.method1149((var40 + var41) / 2, 0, (var42 + var44) / 2);
        } else {
            var47 = var16.method1140(!var45.method1380(arg12, 651), true);
            var47.method1146((var41 - var40) / 2, 128, (var44 - var42) / 2);
            var47.method1149((var40 + var41) / 2, 0, (var42 + var44) / 2);
            var47.method1156(var45, arg12);
        }
        if (arg11 != 0) {
            var47.method1154(arg11);
        }
        class232 var48 = (class232) var47;
        if (class109.method803(class189.field3261, arg13 + var42, (byte) 114, arg5 + var40) != arg4 || arg4 != class109.method803(class189.field3261, arg13 + var44, (byte) 111, arg5 + var41)) {
            for (int var49 = 0; var49 < var48.field3889; var49++) {
                var48.field3912[var49] += class109.method803(class189.field3261, var48.field3911[var49] + arg13, (byte) -58, var48.field3895[var49] + arg5) - arg4;
            }
            var48.field3920 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(B)I")
    public final int method881(byte arg0) {
        field2255++;
        if (arg0 != -102) {
            this.field2253 = -6;
        }
        if ((this.field2265--) == 0) {
            this.method879(-70);
            this.field2265 = 255;
        }
        return this.field2257[this.field2265];
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "()V")
    private class126() {
    }

    @OriginalMember(owner = "client!nd", name = "<init>", descriptor = "([I)V")
    public class126(int[] arg0) {
        this.field2254 = new int[256];
        this.field2257 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2257[var2] = arg0[var2];
        }
        this.method877(0);
    }
}
