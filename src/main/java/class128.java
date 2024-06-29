import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ti")
public class class128 {

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "J")
    private long field2272 = -1L;

    @OriginalMember(owner = "client!ti", name = "o", descriptor = "I")
    private int field2285 = 0;

    @OriginalMember(owner = "client!ti", name = "y", descriptor = "J")
    private long field2295 = -1L;

    @OriginalMember(owner = "client!ti", name = "C", descriptor = "Lej;")
    private class254 field2299;

    @OriginalMember(owner = "client!ti", name = "t", descriptor = "J")
    private long field2290;

    @OriginalMember(owner = "client!ti", name = "n", descriptor = "J")
    private long field2284;

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "[B")
    private byte[] field2274;

    @OriginalMember(owner = "client!ti", name = "q", descriptor = "[B")
    private byte[] field2287;

    @OriginalMember(owner = "client!ti", name = "k", descriptor = "J")
    private long field2281;

    @OriginalMember(owner = "client!ti", name = "w", descriptor = "Lia;")
    public static class257 field2293 = class28.method234(125, "loginscreen");

    @OriginalMember(owner = "client!ti", name = "z", descriptor = "Lia;")
    public static class257 field2296 = class28.method234(127, "Fps:");

    @OriginalMember(owner = "client!ti", name = "D", descriptor = "[S")
    public static short[] field2300 = new short[256];

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "I")
    public static int field2273;

    @OriginalMember(owner = "client!ti", name = "e", descriptor = "I")
    public static int field2275;

    @OriginalMember(owner = "client!ti", name = "g", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!ti", name = "h", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!ti", name = "j", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!ti", name = "l", descriptor = "I")
    public static int field2282;

    @OriginalMember(owner = "client!ti", name = "m", descriptor = "I")
    public static int field2283;

    @OriginalMember(owner = "client!ti", name = "p", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!ti", name = "r", descriptor = "I")
    public static int field2288;

    @OriginalMember(owner = "client!ti", name = "u", descriptor = "I")
    public static int field2291;

    @OriginalMember(owner = "client!ti", name = "v", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!ti", name = "x", descriptor = "I")
    private int field2294;

    @OriginalMember(owner = "client!ti", name = "A", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!ti", name = "B", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!ti", name = "E", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!ti", name = "s", descriptor = "J")
    private long field2289;

    @OriginalMember(owner = "client!ti", name = "i", descriptor = "Lvb;")
    public static class226 field2279;

    @OriginalMember(owner = "client!ti", name = "f", descriptor = "[I")
    public static int[] field2276;

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I)V")
    public final void method883(int arg0) throws IOException {
        field2288++;
        this.method886(true);
        if (arg0 != 7273) {
            this.method896(-24);
        }
        this.field2299.method1658(arg0 ^ 0x2FE7);
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B[BII)V")
    public final void method884(byte arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        field2282++;
        try {
            if (((long) arg3 + this.field2281) > this.field2284) {
                this.field2284 = (long) arg3 + this.field2281;
            }
            if (arg0 <= 106) {
                this.method892(false);
            }
            if (this.field2272 != -1L && (this.field2281 < this.field2272 || this.field2281 > ((long) this.field2285 + this.field2272))) {
                this.method886(true);
            }
            if (this.field2272 != -1L && ((long) this.field2287.length + this.field2272) < ((long) arg3 + this.field2281)) {
                int var5 = (int) (this.field2272 - (this.field2281 - (long) this.field2287.length));
                class86.method644(arg1, arg2, this.field2287, (int) (this.field2281 - this.field2272), var5);
                arg2 += var5;
                arg3 -= var5;
                this.field2281 += (long) var5;
                this.field2285 = this.field2287.length;
                this.method886(true);
            }
            if (arg3 > this.field2287.length) {
                long var6 = -1L;
                if (this.field2289 != this.field2281) {
                    this.field2299.method1660(this.field2281, -103);
                    this.field2289 = this.field2281;
                }
                this.field2299.method1655(arg3, arg1, 1, arg2);
                long var8 = -1L;
                if (this.field2281 >= this.field2295 && (long) this.field2294 + this.field2295 > this.field2281) {
                    var8 = this.field2281;
                } else if (this.field2295 >= this.field2281 && this.field2295 < ((long) arg3 + this.field2281)) {
                    var8 = this.field2295;
                }
                this.field2289 += (long) arg3;
                if (this.field2290 < this.field2289) {
                    this.field2290 = this.field2289;
                }
                if (((long) arg3 + this.field2281) > this.field2295 && (long) this.field2294 + this.field2295 >= (long) arg3 + this.field2281) {
                    var6 = this.field2281 + ((long) arg3);
                } else if (this.field2281 < ((long) this.field2294 + this.field2295) && (long) arg3 + this.field2281 >= this.field2295 - -((long) this.field2294)) {
                    var6 = (long) this.field2294 + this.field2295;
                }
                if (var8 > -1L && var6 > var8) {
                    int var10 = (int) (var6 - var8);
                    class86.method644(arg1, (int) (var8 + (long) arg2 - this.field2281), this.field2274, (int) (var8 - this.field2295), var10);
                }
                this.field2281 += (long) arg3;
            } else if (arg3 > 0) {
                if (this.field2272 == -1L) {
                    this.field2272 = this.field2281;
                }
                class86.method644(arg1, arg2, this.field2287, (int) (this.field2281 - this.field2272), arg3);
                this.field2281 += (long) arg3;
                if ((this.field2281 - this.field2272) > ((long) this.field2285)) {
                    this.field2285 = (int) (this.field2281 - this.field2272);
                }
            }
        } catch (IOException var12) {
            this.field2289 = -1L;
            throw var12;
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(II)Z")
    public static final boolean method885(int arg0, int arg1) {
        int var2 = -98 / ((arg1 - 62) / 47);
        field2271++;
        return (arg0 & 0x1B1ABD) >> 20 != 0;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(Z)V")
    private final void method886(boolean arg0) throws IOException {
        if (this.field2272 != -1L) {
            long var2 = -1L;
            long var4 = -1L;
            if (this.field2289 != this.field2272) {
                this.field2299.method1660(this.field2272, -126);
                this.field2289 = this.field2272;
            }
            this.field2299.method1655(this.field2285, this.field2287, 1, 0);
            if (this.field2295 < (long) this.field2285 + this.field2272 && this.field2295 + ((long) this.field2294) >= (long) this.field2285 + this.field2272) {
                var4 = this.field2272 + ((long) this.field2285);
            } else if (this.field2272 < this.field2295 + ((long) this.field2294) && ((long) this.field2285 + this.field2272) >= ((long) this.field2294 + this.field2295)) {
                var4 = (long) this.field2294 + this.field2295;
            }
            if (this.field2295 <= this.field2272 && this.field2272 < ((long) this.field2294 + this.field2295)) {
                var2 = this.field2272;
            } else if (this.field2272 <= this.field2295 && (long) this.field2285 + this.field2272 > this.field2295) {
                var2 = this.field2295;
            }
            this.field2289 += (long) this.field2285;
            if (this.field2289 > this.field2290) {
                this.field2290 = this.field2289;
            }
            if (var2 > -1L && var2 < var4) {
                int var6 = (int) (var4 - var2);
                class86.method644(this.field2287, (int) (var2 - this.field2272), this.field2274, (int) (var2 - this.field2295), var6);
            }
            this.field2272 = -1L;
            this.field2285 = 0;
        }
        field2292++;
        if (!arg0) {
            this.field2285 = -122;
        }
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(I)V")
    public static final void method887(int arg0) {
        field2275++;
        class40.field827.method912((byte) 36);
        int var1 = class40.field827.method909(8, (byte) -111);
        if (class140.field2487 > var1) {
            for (int var2 = var1; var2 < class140.field2487; var2++) {
                class125.field2241[class183.field3192++] = class199.field3412[var2];
            }
        }
        if (class140.field2487 < var1) {
            throw new RuntimeException("gnpov1");
        }
        class140.field2487 = 0;
        int var3 = -89 / ((26 - arg0) / 52);
        for (int var4 = 0; var4 < var1; var4++) {
            int var5 = class199.field3412[var4];
            class197 var6 = class92.field1758[var5];
            int var7 = class40.field827.method909(1, (byte) -115);
            if (var7 == 0) {
                class199.field3412[class140.field2487++] = var5;
                var6.field4180 = class7.field153;
            } else {
                int var8 = class40.field827.method909(2, (byte) -110);
                if (var8 == 0) {
                    class199.field3412[class140.field2487++] = var5;
                    var6.field4180 = class7.field153;
                    class210.field3591[class212.field3628++] = var5;
                } else if (var8 == 1) {
                    class199.field3412[class140.field2487++] = var5;
                    var6.field4180 = class7.field153;
                    int var9 = class40.field827.method909(3, (byte) -100);
                    var6.method1584(var9, false, (byte) 4);
                    int var10 = class40.field827.method909(1, (byte) -107);
                    if (var10 == 1) {
                        class210.field3591[class212.field3628++] = var5;
                    }
                } else if (var8 == 2) {
                    class199.field3412[class140.field2487++] = var5;
                    var6.field4180 = class7.field153;
                    int var11 = class40.field827.method909(3, (byte) -119);
                    var6.method1584(var11, true, (byte) 4);
                    int var12 = class40.field827.method909(3, (byte) -121);
                    var6.method1584(var12, true, (byte) 4);
                    int var13 = class40.field827.method909(1, (byte) -114);
                    if (var13 == 1) {
                        class210.field3591[class212.field3628++] = var5;
                    }
                } else if (var8 == 3) {
                    class125.field2241[class183.field3192++] = var5;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(B)V")
    public static void method888(byte arg0) {
        field2276 = null;
        field2300 = null;
        field2293 = null;
        field2279 = null;
        int var1 = 61 / ((-arg0 - 18) / 54);
        field2296 = null;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(ILmb;)I")
    public static final int method889(int arg0, class178 arg1) {
        field2278++;
        int var2 = arg0;
        if (arg1.method1207(class55.field1173, (byte) 109)) {
            var2 = arg0 + 1;
        }
        if (arg1.method1207(class96.field1809, (byte) -14)) {
            var2++;
        }
        if (arg1.method1207(class229.field3846, (byte) 98)) {
            var2++;
        }
        if (arg1.method1207(class64.field1300, (byte) 117)) {
            var2++;
        }
        if (arg1.method1207(class44.field1031, (byte) -29)) {
            var2++;
        }
        if (arg1.method1207(class213.field3640, (byte) -112)) {
            var2++;
        }
        if (arg1.method1207(class152.field2642, (byte) 96)) {
            var2++;
        }
        if (arg1.method1207(class85.field1664, (byte) -90)) {
            var2++;
        }
        if (arg1.method1207(class32.field614, (byte) -31)) {
            var2++;
        }
        if (arg1.method1207(class9.field178, (byte) 120)) {
            var2++;
        }
        if (arg1.method1207(class216.field3660, (byte) 112)) {
            var2++;
        }
        if (arg1.method1207(class178.field3082, (byte) -73)) {
            var2++;
        }
        if (arg1.method1207(class204.field3505, (byte) 99)) {
            var2++;
        }
        var2++;
        if (arg1.method1207(class161.field2827, (byte) -119)) {
            var2++;
        }
        if (arg1.method1207(client.field1532, (byte) 92)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IIIIIII)V")
    public static final void method890(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2286++;
        if (class31.field611 == 0 && !class257.field4404) {
            class251.field4329++;
            int var7 = class238.field4086;
            int var8 = class213.field3642;
            int var9 = class151.field2594;
            int var10 = class228.field3834;
            int var11 = (arg3 - arg0) * (var8 - var7) / arg1 + var7;
            int var12 = (arg4 - arg2) * (var10 - var9) / arg5 + var9;
            class95.method694(class17.field378, class26.field511, var11, 27360, var12, (short) 3, 0L);
        }
        long var13 = -1L;
        if (arg6 != 20) {
            return;
        }
        for (int var15 = 0; var15 < class216.field3665; var15++) {
            long var16 = class152.field2646[var15];
            int var18 = (int) var16 >> 7 & 0x7F;
            int var19 = (int) var16 & 0x7F;
            int var20 = (int) var16 >> 29 & 0x3;
            int var21 = Integer.MAX_VALUE & (int) (var16 >>> 32);
            if (var13 != var16) {
                var13 = var16;
                if (var20 == 2 && class210.method1413(class189.field3261, var19, var18, var16)) {
                    class233 var22 = class5.method96(var21, false);
                    if (var22.field3952 != null) {
                        var22 = var22.method1537((byte) 87);
                    }
                    if (var22 == null) {
                        continue;
                    }
                    if (class31.field611 == 1) {
                        class95.method694(class233.method1528(new class257[] { class181.field3142, class92.field1751, var22.field3982 }, 0), class200.field3414, var19, 27360, var18, (short) 12, var16);
                        class260.field4514++;
                    } else if (!class257.field4404) {
                        class166.field2893++;
                        class257[] var23 = var22.field3987;
                        if (class41.field839) {
                            var23 = class144.method977(29212, var23);
                        }
                        if (var23 != null) {
                            for (int var24 = 4; var24 >= 0; var24--) {
                                if (var23[var24] != null) {
                                    class201.field3438++;
                                    short var25 = 0;
                                    if (var24 == 0) {
                                        var25 = 28;
                                    }
                                    if (var24 == 1) {
                                        var25 = 30;
                                    }
                                    if (var24 == 2) {
                                        var25 = 47;
                                    }
                                    if (var24 == 3) {
                                        var25 = 7;
                                    }
                                    if (var24 == 4) {
                                        var25 = 1004;
                                    }
                                    class95.method694(class233.method1528(new class257[] { class260.field4513, var22.field3982 }, 0), var23[var24], var19, 27360, var18, var25, var16);
                                }
                            }
                        }
                        class95.method694(class233.method1528(new class257[] { class260.field4513, var22.field3982 }, arg6 ^ 0x14), class92.field1753, var19, 27360, var18, (short) 1007, (long) var22.field4019);
                    } else if ((class76.field1491 & 0x4) == 4) {
                        class95.method694(class233.method1528(new class257[] { class72.field1405, class92.field1751, var22.field3982 }, arg6 ^ 0x14), class181.field3143, var19, 27360, var18, (short) 20, var16);
                        class96.field1808++;
                    }
                }
                if (var20 == 1) {
                    class197 var26 = class92.field1758[var21];
                    if (var26.field3322.field3390 == 1 && (var26.field4177 & 0x7F) == 64 && (var26.field4143 & 0x7F) == 64) {
                        for (int var27 = 0; var27 < class140.field2487; var27++) {
                            class197 var30 = class92.field1758[class199.field3412[var27]];
                            if (var30 != null && var26 != var30 && var30.field3322.field3390 == 1 && var26.field4177 == var30.field4177 && var26.field4143 == var30.field4143) {
                                class12.method126(var18, var19, true, class199.field3412[var27], var30.field3322);
                            }
                        }
                        for (int var28 = 0; var28 < class231.field3880; var28++) {
                            class180 var29 = class55.field1180[class132.field2362[var28]];
                            if (var29 != null && var26.field4177 == var29.field4177 && var26.field4143 == var29.field4143) {
                                class104.method757(arg6 - 13, var29, class132.field2362[var28], var18, var19);
                            }
                        }
                    }
                    class12.method126(var18, var19, true, var21, var26.field3322);
                }
                if (var20 == 0) {
                    class180 var31 = class55.field1180[var21];
                    if ((var31.field4177 & 0x7F) == 64 && (var31.field4143 & 0x7F) == 64) {
                        for (int var32 = 0; var32 < class140.field2487; var32++) {
                            class197 var35 = class92.field1758[class199.field3412[var32]];
                            if (var35 != null && var35.field3322.field3390 == 1 && var31.field4177 == var35.field4177 && var31.field4143 == var35.field4143) {
                                class12.method126(var18, var19, true, class199.field3412[var32], var35.field3322);
                            }
                        }
                        for (int var33 = 0; var33 < class231.field3880; var33++) {
                            class180 var34 = class55.field1180[class132.field2362[var33]];
                            if (var34 != null && var31 != var34 && var31.field4177 == var34.field4177 && var31.field4143 == var34.field4143) {
                                class104.method757(arg6 - 13, var34, class132.field2362[var33], var18, var19);
                            }
                        }
                    }
                    class104.method757(arg6 - 13, var31, var21, var18, var19);
                }
                if (var20 == 3) {
                    class33 var36 = class78.field1499[class189.field3261][var19][var18];
                    if (var36 != null) {
                        for (class112 var37 = (class112) var36.method280((byte) -121); var37 != null; var37 = (class112) var36.method279(-22101)) {
                            int var38 = var37.field2043.field3;
                            class14 var39 = class156.method1090(var38, arg6 ^ 0x14);
                            if (class31.field611 == 1) {
                                class95.method694(class233.method1528(new class257[] { class181.field3142, class150.field2589, var39.field295 }, 0), class200.field3414, var19, 27360, var18, (short) 16, (long) var38);
                                class73.field1420++;
                            } else if (!class257.field4404) {
                                class257[] var40 = var39.field293;
                                class57.field1222++;
                                if (class41.field839) {
                                    var40 = class144.method977(29212, var40);
                                }
                                for (int var41 = 4; var41 >= 0; var41--) {
                                    if (var40 != null && var40[var41] != null) {
                                        class169.field2913++;
                                        byte var42 = 0;
                                        if (var41 == 0) {
                                            var42 = 48;
                                        }
                                        if (var41 == 1) {
                                            var42 = 14;
                                        }
                                        if (var41 == 2) {
                                            var42 = 37;
                                        }
                                        if (var41 == 3) {
                                            var42 = 51;
                                        }
                                        if (var41 == 4) {
                                            var42 = 2;
                                        }
                                        class95.method694(class233.method1528(new class257[] { class126.field2251, var39.field295 }, 0), var40[var41], var19, 27360, var18, var42, (long) var38);
                                    } else if (var41 == 2) {
                                        class95.method694(class233.method1528(new class257[] { class126.field2251, var39.field295 }, 0), class129.field2306, var19, 27360, var18, (short) 37, (long) var38);
                                        class25.field495++;
                                    }
                                }
                                class95.method694(class233.method1528(new class257[] { class126.field2251, var39.field295 }, 0), class92.field1753, var19, 27360, var18, (short) 1006, (long) var38);
                            } else if ((class76.field1491 & 0x1) == 1) {
                                class256.field4388++;
                                class95.method694(class233.method1528(new class257[] { class72.field1405, class150.field2589, var39.field295 }, 0), class181.field3143, var19, 27360, var18, (short) 45, (long) var38);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(I[B)V")
    public final void method891(int arg0, byte[] arg1) throws IOException {
        if (arg0 <= 103) {
            method885(51, -65);
        }
        field2280++;
        this.method893(arg1, 0, arg1.length, 0);
    }

    @OriginalMember(owner = "client!ti", name = "b", descriptor = "(Z)J")
    public final long method892(boolean arg0) {
        field2301++;
        if (!arg0) {
            this.field2299 = null;
        }
        return this.field2284;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "([BIII)V")
    public final void method893(byte[] arg0, int arg1, int arg2, int arg3) throws IOException {
        field2291++;
        try {
            if (arg0.length < (arg1 + arg2)) {
                throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
            }
            if (this.field2272 != -1L && this.field2272 <= this.field2281 && (long) this.field2285 + this.field2272 >= (long) arg2 + this.field2281) {
                class86.method644(this.field2287, (int) (this.field2281 - this.field2272), arg0, arg1, arg2);
                this.field2281 += (long) arg2;
                return;
            }
            if (arg3 != 0) {
                this.field2289 = -110L;
            }
            long var5 = this.field2281;
            int var7 = arg1;
            int var8 = arg2;
            if (this.field2295 <= this.field2281 && ((long) this.field2294 + this.field2295) > this.field2281) {
                int var9 = (int) ((long) this.field2294 + this.field2295 - this.field2281);
                if (var9 > arg2) {
                    var9 = arg2;
                }
                arg2 -= var9;
                class86.method644(this.field2274, (int) (this.field2281 - this.field2295), arg0, arg1, var9);
                arg1 += var9;
                this.field2281 += (long) var9;
            }
            if (this.field2274.length < arg2) {
                this.field2299.method1660(this.field2281, -128);
                this.field2289 = this.field2281;
                while (arg2 > 0) {
                    int var10 = this.field2299.method1656(arg1, arg2, -1, arg0);
                    if (var10 == -1) {
                        break;
                    }
                    this.field2281 += (long) var10;
                    this.field2289 += (long) var10;
                    arg2 -= var10;
                    arg1 += var10;
                }
            } else if (arg2 > 0) {
                this.method894(-1);
                int var11 = arg2;
                if (arg2 > this.field2294) {
                    var11 = this.field2294;
                }
                arg2 -= var11;
                class86.method644(this.field2274, 0, arg0, arg1, var11);
                arg1 += var11;
                this.field2281 += (long) var11;
            }
            if (this.field2272 != -1L) {
                if (this.field2281 < this.field2272 && arg2 > 0) {
                    int var12 = (int) (this.field2272 - this.field2281) + arg1;
                    if ((arg1 + arg2) < var12) {
                        var12 = arg1 + arg2;
                    }
                    while (var12 > arg1) {
                        arg0[arg1++] = 0;
                        arg2--;
                        this.field2281++;
                    }
                }
                long var13 = -1L;
                if (this.field2272 >= var5 && (long) var8 + var5 > this.field2272) {
                    var13 = this.field2272;
                } else if (var5 >= this.field2272 && (long) this.field2285 + this.field2272 > var5) {
                    var13 = var5;
                }
                long var15 = -1L;
                if (var5 < (this.field2272 + ((long) this.field2285)) && (long) var8 + var5 >= (long) this.field2285 + this.field2272) {
                    var15 = (long) this.field2285 + this.field2272;
                } else if (this.field2272 < ((long) var8 + var5) && ((long) this.field2285 + this.field2272) >= (var5 + ((long) var8))) {
                    var15 = var5 + ((long) var8);
                }
                if (var13 > -1L && var13 < var15) {
                    int var17 = (int) (var15 - var13);
                    class86.method644(this.field2287, (int) (var13 - this.field2272), arg0, var7 + ((int) (var13 - var5)), var17);
                    if (this.field2281 < var15) {
                        arg2 = (int) ((long) arg2 - (var15 - this.field2281));
                        this.field2281 = var15;
                    }
                }
            }
        } catch (IOException var19) {
            this.field2289 = -1L;
            throw var19;
        }
        if (arg2 > 0) {
            throw new EOFException();
        }
    }

    @OriginalMember(owner = "client!ti", name = "c", descriptor = "(I)V")
    private final void method894(int arg0) throws IOException {
        if (arg0 != -1) {
            field2296 = null;
        }
        this.field2294 = 0;
        if (this.field2289 != this.field2281) {
            this.field2299.method1660(this.field2281, -93);
            this.field2289 = this.field2281;
        }
        this.field2295 = this.field2281;
        while (this.field2294 < this.field2274.length) {
            int var2 = this.field2274.length - this.field2294;
            if (var2 > 200000000) {
                var2 = 200000000;
            }
            int var3 = this.field2299.method1656(this.field2294, var2, -1, this.field2274);
            if (var3 == -1) {
                break;
            }
            this.field2294 += var3;
            this.field2289 += (long) var3;
        }
        field2297++;
    }

    @OriginalMember(owner = "client!ti", name = "a", descriptor = "(IJ)V")
    public final void method895(int arg0, long arg1) throws IOException {
        field2277++;
        if (arg1 < (long) arg0) {
            throw new IOException("Invalid seek to " + arg1 + " in file " + this.method896(75));
        }
        this.field2281 = arg1;
    }

    @OriginalMember(owner = "client!ti", name = "d", descriptor = "(I)Ljava/io/File;")
    private final File method896(int arg0) {
        field2298++;
        if (arg0 <= 21) {
            field2276 = null;
        }
        return this.field2299.method1659(0);
    }

    @OriginalMember(owner = "client!ti", name = "<init>", descriptor = "(Lej;II)V")
    public class128(class254 arg0, int arg1, int arg2) throws IOException {
        this.field2299 = arg0;
        this.field2284 = this.field2290 = arg0.method1657((byte) 8);
        this.field2274 = new byte[arg1];
        this.field2287 = new byte[arg2];
        this.field2281 = 0L;
    }
}
