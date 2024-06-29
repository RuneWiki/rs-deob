import java.awt.Component;
import java.lang.reflect.Method;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hc")
public class class79 extends class23 {

    @OriginalMember(owner = "client!hc", name = "M", descriptor = "I")
    private int field1386 = 0;

    @OriginalMember(owner = "client!hc", name = "R", descriptor = "I")
    private int field1391 = 2048;

    @OriginalMember(owner = "client!hc", name = "U", descriptor = "I")
    private int field1393 = 1024;

    @OriginalMember(owner = "client!hc", name = "ab", descriptor = "I")
    private int field1399 = 1024;

    @OriginalMember(owner = "client!hc", name = "bb", descriptor = "I")
    private int field1400 = 1024;

    @OriginalMember(owner = "client!hc", name = "V", descriptor = "I")
    private int field1394 = 1024;

    @OriginalMember(owner = "client!hc", name = "Q", descriptor = "I")
    private int field1390 = 819;

    @OriginalMember(owner = "client!hc", name = "cb", descriptor = "I")
    private int field1401 = 409;

    @OriginalMember(owner = "client!hc", name = "ib", descriptor = "I")
    private int field1407 = 0;

    @OriginalMember(owner = "client!hc", name = "O", descriptor = "I")
    public static int field1388 = 0;

    @OriginalMember(owner = "client!hc", name = "Z", descriptor = "Ldc;")
    public static class37 field1398 = class185.method1233((byte) 86, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!hc", name = "N", descriptor = "[I")
    public static int[] field1387 = new int[] { 768, 1024, 1280, 512, 1536, 256, 0, 1792 };

    @OriginalMember(owner = "client!hc", name = "T", descriptor = "Ldc;")
    public static class37 field1392 = class185.method1233((byte) 86, "Unerwartete Antwort vom Anmelde)2Server)3");

    @OriginalMember(owner = "client!hc", name = "gb", descriptor = "Ldc;")
    public static class37 field1405 = class185.method1233((byte) 86, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!hc", name = "L", descriptor = "I")
    public static int field1385;

    @OriginalMember(owner = "client!hc", name = "P", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!hc", name = "W", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!hc", name = "X", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!hc", name = "Y", descriptor = "I")
    public static int field1397;

    @OriginalMember(owner = "client!hc", name = "db", descriptor = "I")
    private int field1402;

    @OriginalMember(owner = "client!hc", name = "eb", descriptor = "I")
    public static int field1403;

    @OriginalMember(owner = "client!hc", name = "fb", descriptor = "I")
    public static int field1404;

    @OriginalMember(owner = "client!hc", name = "hb", descriptor = "Ldj;")
    public static class44 field1406;

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public static final void method541(byte arg0, Component arg1) {
        ++field1404;
        Method var2 = class21.field355;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg1.addKeyListener(class94.field1647);
        if (arg0 < 101) {
            method545(-116);
        }
        arg1.addFocusListener(class94.field1647);
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(Lce;II)V")
    public final void method40(class28 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (~arg1 != -8) {
                                        if (arg1 == 8) {
                                            this.field1394 = arg0.method230((byte) -125);
                                        }
                                    } else {
                                        this.field1393 = arg0.method230((byte) -114);
                                    }
                                } else {
                                    this.field1386 = arg0.method215(arg2 + -1797814752);
                                }
                            } else {
                                this.field1400 = arg0.method230((byte) -119);
                            }
                        } else {
                            this.field1390 = arg0.method230((byte) -98);
                        }
                    } else {
                        this.field1401 = arg0.method230((byte) -128);
                    }
                } else {
                    this.field1391 = arg0.method230((byte) -98);
                }
            } else {
                this.field1399 = arg0.method230((byte) -102);
            }
        } else {
            this.field1407 = arg0.method215(-1797813752);
        }
        if (arg2 != 1000) {
            this.field1407 = -28;
        }
        ++field1385;
    }

    @OriginalMember(owner = "client!hc", name = "g", descriptor = "(I)V")
    public static final void method542(int arg0) {
        class12.field167.method1504(arg0 ^ arg0);
        int var1 = class12.field167.method1506((byte) 113, 1);
        ++field1395;
        if (var1 != 0) {
            int var2 = class12.field167.method1506((byte) 121, 2);
            if (var2 == 0) {
                class214.field4000[class19.field309++] = 2047;
            } else if (~var2 == -2) {
                int var3 = class12.field167.method1506((byte) 124, 3);
                class238.field4382.method1263(var3, false, -30438);
                int var4 = class12.field167.method1506((byte) 124, 1);
                if (~var4 == -2) {
                    class214.field4000[class19.field309++] = 2047;
                }
            } else if (~var2 == -3) {
                int var5 = class12.field167.method1506((byte) 112, 3);
                class238.field4382.method1263(var5, true, -30438);
                int var6 = class12.field167.method1506((byte) 110, 3);
                class238.field4382.method1263(var6, true, -30438);
                int var7 = class12.field167.method1506((byte) 114, 1);
                if (var7 == 1) {
                    class214.field4000[class19.field309++] = 2047;
                }
            } else if (var2 == 3) {
                int var8 = class12.field167.method1506((byte) 117, 1);
                int var9 = class12.field167.method1506((byte) 123, 7);
                int var10 = class12.field167.method1506((byte) 115, 1);
                if (~var10 == -2) {
                    class214.field4000[class19.field309++] = 2047;
                }
                class125.field2246 = class12.field167.method1506((byte) 122, 2);
                int var11 = class12.field167.method1506((byte) 125, 7);
                class238.field4382.method1264(var9, (byte) -126, ~var8 == -2, var11);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "h", descriptor = "(I)[Ljc;")
    public static final class100[] method543(int arg0) {
        ++field1389;
        class100[] var1 = new class100[class113.field2018];
        for (int var2 = 0; ~class113.field2018 < ~var2; ++var2) {
            var1[var2] = new class148(class67.field1207, class160.field3030, class166.field3162[var2], class7.field77[var2], class174.field3308[var2], class238.field4336[var2], class217.field4040[var2], class5.field42);
        }
        if (arg0 != -16037) {
            field1392 = null;
        }
        class97.method644(true);
        return var1;
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(I[[IBLjava/util/Random;III)V")
    private final void method544(int arg0, int[][] arg1, byte arg2, Random arg3, int arg4, int arg5, int arg6) {
        int var8 = this.field1394 > 0 ? -class97.method646(arg2 + 12483, arg3, this.field1394) + 4096 : 4096;
        int var9 = this.field1402 * this.field1393 >> 12;
        if (arg2 != -81) {
            field1388 = 122;
        }
        ++field1403;
        int var10 = this.field1402 - (~var9 < -1 ? class97.method646(12402, arg3, var9) : 0);
        if (arg0 >= class199.field3705) {
            arg0 -= class199.field3705;
        }
        if (~var10 < -1) {
            if (~arg6 < -1 && arg4 > 0) {
                int var11 = arg4 / 2;
                int var12 = var10 <= var11 ? var10 : var11;
                int var13 = -(var12 * 2) + arg4;
                int var14 = arg0 + var12;
                int var15 = arg6 / 2;
                int var16 = var15 >= var10 ? var10 : var15;
                for (int var17 = 0; var17 < arg6; ++var17) {
                    int[] var18 = arg1[var17 - -arg5];
                    if (~var16 < ~var17) {
                        int var19 = var8 * var17 / var16;
                        if (~this.field1386 != -1) {
                            for (int var20 = 0; ~var12 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var12;
                                var18[class58.method449(arg0 - -var20, class215.field4008)] = var18[class58.method449(class215.field4008, arg0 - var20 + arg4 + -1)] = ~var19 >= ~var21 ? var19 : var21;
                            }
                        } else {
                            for (int var22 = 0; ~var22 > ~var12; ++var22) {
                                int var24 = var8 * var22 / var12;
                                var18[class58.method449(class215.field4008, arg0 + var22)] = var18[class58.method449(-var22 + arg0 - 1 + arg4, class215.field4008)] = var19 * var24 >> 12;
                            }
                        }
                        if (~class199.field3705 <= ~(var14 - -var13)) {
                            class4.method32(var18, var14, var13, var19);
                        } else {
                            int var23 = -var14 + class199.field3705;
                            class4.method32(var18, var14, var23, var19);
                            class4.method32(var18, 0, var13 - var23, var19);
                        }
                    } else {
                        int var25 = arg6 - var17 + -1;
                        if (~var25 > ~var16) {
                            int var26 = var8 * var25 / var16;
                            if (~this.field1386 != -1) {
                                for (int var27 = 0; var27 < var12; ++var27) {
                                    int var28 = var8 * var27 / var12;
                                    var18[class58.method449(arg0 + var27, class215.field4008)] = var18[class58.method449(class215.field4008, arg0 - (-arg4 - (-var27 - 1)))] = ~var28 <= ~var26 ? var26 : var28;
                                }
                            } else {
                                for (int var29 = 0; ~var12 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var12;
                                    var18[class58.method449(arg0 + var29, class215.field4008)] = var18[class58.method449(class215.field4008, arg0 + -1 - -arg4 - var29)] = var26 * var31 >> 12;
                                }
                            }
                            if (~(var14 - -var13) >= ~class199.field3705) {
                                class4.method32(var18, var14, var13, var26);
                            } else {
                                int var30 = -var14 + class199.field3705;
                                class4.method32(var18, var14, var30, var26);
                                class4.method32(var18, 0, var13 - var30, var26);
                            }
                        } else {
                            for (int var32 = 0; var12 > var32; ++var32) {
                                var18[class58.method449(arg0 + var32, class215.field4008)] = var18[class58.method449(class215.field4008, -var32 + arg0 + -1 - -arg4)] = var8 * var32 / var12;
                            }
                            if (~class199.field3705 > ~(var13 + var14)) {
                                int var33 = -var14 + class199.field3705;
                                class4.method32(var18, var14, var33, var8);
                                class4.method32(var18, 0, -var33 + var13, var8);
                            } else {
                                class4.method32(var18, var14, var13, var8);
                            }
                        }
                    }
                }
            }
        } else if (~(arg0 - -arg4) < ~class199.field3705) {
            int var34 = -arg0 + class199.field3705;
            for (int var35 = 0; var35 < arg6; ++var35) {
                int[] var36 = arg1[arg5 + var35];
                class4.method32(var36, arg0, var34, var8);
                class4.method32(var36, 0, -var34 + arg4, var8);
            }
        } else {
            for (int var37 = 0; arg6 > var37; ++var37) {
                class4.method32(arg1[arg5 + var37], arg0, arg4, var8);
            }
        }
    }

    @OriginalMember(owner = "client!hc", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        ++field1396;
        int[] var3 = super.field405.method1461(arg1, (byte) -126);
        if (super.field405.field4114) {
            int[][] var4 = super.field405.method1460((byte) -33);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = class199.field3705 * this.field1399 >> 12;
            int var14 = class199.field3705 * this.field1391 >> 12;
            int var15 = 0;
            int var16 = class235.field4276 * this.field1401 >> 12;
            int var17 = class235.field4276 * this.field1390 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            }
            this.field1402 = class199.field3705 / 8 * this.field1400 >> 12;
            int var18 = class199.field3705 / var13 + 1;
            int[][] var19 = new int[var18][3];
            Random var20 = new Random((long) this.field1407);
            int[][] var21 = new int[var18][3];
            label124: while (true) {
                while (true) {
                    int var22 = var13 - -class97.method646(12402, var20, -var13 + var14);
                    int var23 = var16 + class97.method646(arg0 + 12402, var20, -var16 + var17);
                    int var24 = var7 + var22;
                    if (class199.field3705 < var24) {
                        var24 = class199.field3705;
                        var22 = -var7 + class199.field3705;
                    }
                    int var28;
                    if (var10) {
                        var28 = 0;
                    } else {
                        int var25 = var6;
                        int[] var26 = var21[var6];
                        int var27 = 0;
                        var28 = var26[2];
                        int var29 = var5 + var24;
                        if (~var29 > -1) {
                            var29 += class199.field3705;
                        }
                        if (~var29 < ~class199.field3705) {
                            var29 -= class199.field3705;
                        }
                        while (true) {
                            int[] var30 = var21[var25];
                            if (~var29 <= ~var30[0] && ~var30[1] <= ~var29) {
                                if (var6 != var25) {
                                    int var31 = var5 + var7;
                                    if (var31 < 0) {
                                        var31 += class199.field3705;
                                    }
                                    if (~class199.field3705 > ~var31) {
                                        var31 -= class199.field3705;
                                    }
                                    for (int var32 = 1; var32 <= var27; ++var32) {
                                        int[] var40 = var21[(var6 + var32) % var12];
                                        var28 = Math.max(var28, var40[2]);
                                    }
                                    for (int var33 = 0; ~var27 <= ~var33; ++var33) {
                                        int[] var34 = var21[(var6 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var28 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var29 >= ~var31) {
                                                if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class199.field3705;
                                                } else {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method544(var8 + var38, var4, (byte) -81, var20, -var38 + var39, var35, var28 - var35);
                                        }
                                    }
                                }
                                var6 = var25;
                                break;
                            }
                            ++var27;
                            int var10000 = ~var12;
                            ++var25;
                            if (var10000 >= ~var25) {
                                var25 = 0;
                            }
                        }
                    }
                    if (~(var23 + var28) < ~class235.field4276) {
                        var23 = class235.field4276 - var28;
                    } else {
                        var11 = false;
                    }
                    if (~class199.field3705 != ~var24) {
                        int[] var41 = var19[var15++];
                        var41[0] = var7;
                        var41[1] = var24;
                        var41[2] = var28 - -var23;
                        this.method544(var7 + var9, var4, (byte) -81, var20, var22, var28, var23);
                        var7 = var24;
                    } else {
                        this.method544(var7 + var9, var4, (byte) -81, var20, var22, var28, var23);
                        if (var11) {
                            break label124;
                        }
                        var10 = false;
                        var11 = true;
                        var8 = var9;
                        var6 = 0;
                        int[][] var42 = var21;
                        var21 = var19;
                        int[] var43 = var19[var15++];
                        var12 = var15;
                        var43[0] = var7;
                        var7 = 0;
                        var19 = var42;
                        var43[2] = var28 - -var23;
                        var43[1] = var24;
                        var15 = 0;
                        var9 = class97.method646(arg0 + 12402, var20, class199.field3705);
                        var5 = var9 - var8;
                        int var44 = var5;
                        if (var5 < 0) {
                            var44 = class199.field3705 + var5;
                        }
                        if (class199.field3705 < var44) {
                            var44 -= class199.field3705;
                        }
                        while (true) {
                            int[] var45 = var21[var6];
                            if (var45[0] <= var44 && ~var44 >= ~var45[1]) {
                                break;
                            }
                            ++var6;
                            if (var6 >= var12) {
                                var6 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 0) {
            this.field1390 = -42;
        }
        return var3;
    }

    @OriginalMember(owner = "client!hc", name = "i", descriptor = "(I)V")
    public static void method545(int arg0) {
        field1387 = null;
        field1392 = null;
        if (arg0 != 0) {
            field1398 = null;
        }
        field1405 = null;
        field1398 = null;
        field1406 = null;
    }

    @OriginalMember(owner = "client!hc", name = "f", descriptor = "(I)V")
    public final void method53(int arg0) {
        if (arg0 != -21746) {
            this.field1407 = -62;
        }
        ++field1397;
    }

    @OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V")
    public class79() {
        super(0, true);
    }
}
