import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class127 extends class107 {

    @OriginalMember(owner = "client!lb", name = "T", descriptor = "I")
    private int field2213 = 4096;

    @OriginalMember(owner = "client!lb", name = "R", descriptor = "I")
    private int field2211 = 409;

    @OriginalMember(owner = "client!lb", name = "Q", descriptor = "[I")
    private int[] field2210 = new int[3];

    @OriginalMember(owner = "client!lb", name = "Y", descriptor = "I")
    private int field2218 = 4096;

    @OriginalMember(owner = "client!lb", name = "X", descriptor = "I")
    private int field2217 = 4096;

    @OriginalMember(owner = "client!lb", name = "V", descriptor = "Lak;")
    public static class135 field2215 = new class135(20);

    @OriginalMember(owner = "client!lb", name = "db", descriptor = "Lpj;")
    private static class237 field2223 = class33.method353("Opened title screen", 22);

    @OriginalMember(owner = "client!lb", name = "gb", descriptor = "Lpj;")
    public static class237 field2226 = class33.method353("", 115);

    @OriginalMember(owner = "client!lb", name = "ab", descriptor = "Lpj;")
    public static class237 field2220 = class33.method353("Lade Benutzeroberfl-=che )2 ", 105);

    @OriginalMember(owner = "client!lb", name = "fb", descriptor = "Z")
    public static boolean field2225 = false;

    @OriginalMember(owner = "client!lb", name = "cb", descriptor = "Lpj;")
    public static class237 field2222 = field2223;

    @OriginalMember(owner = "client!lb", name = "kb", descriptor = "[J")
    public static long[] field2230 = new long[100];

    @OriginalMember(owner = "client!lb", name = "P", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!lb", name = "S", descriptor = "I")
    public static int field2212;

    @OriginalMember(owner = "client!lb", name = "U", descriptor = "I")
    public static int field2214;

    @OriginalMember(owner = "client!lb", name = "W", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!lb", name = "eb", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!lb", name = "hb", descriptor = "I")
    public static int field2227;

    @OriginalMember(owner = "client!lb", name = "ib", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!lb", name = "jb", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!lb", name = "Z", descriptor = "Lme;")
    public static class214 field2219;

    @OriginalMember(owner = "client!lb", name = "bb", descriptor = "[[B")
    public static byte[][] field2221;

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "()V")
    public class127() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method240(byte arg0, int arg1) {
        int[][] var3 = super.field1903.method634(arg1, 13012);
        ++field2228;
        int var4 = 78 / ((26 - arg0) / 45);
        if (super.field1903.field1551) {
            int[][] var5 = this.method802(3, arg1, 0);
            int[] var6 = var5[0];
            int[] var7 = var5[2];
            int[] var8 = var5[1];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            int[] var11 = var3[0];
            for (int var12 = 0; ~var12 > ~class106.field1862; ++var12) {
                int var13 = var6[var12];
                int var14 = -this.field2210[0] + var13;
                if (var14 < 0) {
                    var14 = -var14;
                }
                if (~this.field2211 > ~var14) {
                    var11[var12] = var13;
                    var10[var12] = var8[var12];
                    var9[var12] = var7[var12];
                } else {
                    int var15 = var8[var12];
                    int var16 = -this.field2210[1] + var15;
                    if (var16 < 0) {
                        var16 = -var16;
                    }
                    if (~this.field2211 > ~var16) {
                        var11[var12] = var13;
                        var10[var12] = var15;
                        var9[var12] = var7[var12];
                    } else {
                        int var17 = var7[var12];
                        int var18 = -this.field2210[2] + var17;
                        if (var18 < 0) {
                            var18 = -var18;
                        }
                        if (~var18 < ~this.field2211) {
                            var11[var12] = var13;
                            var10[var12] = var15;
                            var9[var12] = var17;
                        } else {
                            var11[var12] = this.field2217 * var13 >> 12;
                            var10[var12] = this.field2213 * var15 >> 12;
                            var9[var12] = this.field2218 * var17 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILsa;II)V")
    public static final void method896(int arg0, int arg1, int arg2, class249 arg3, int arg4, int arg5) {
        ++field2216;
        if (~arg3.field4316 != 0 || arg3.field4314 != null) {
            int var6 = arg1;
            if (arg3.field4322 < arg4) {
                var6 = -arg3.field4322 + arg4 + arg1;
            } else if (~arg3.field4309 < ~arg4) {
                var6 = -arg4 + arg3.field4309 + arg1;
            }
            if (~arg3.field4326 > ~arg0) {
                var6 += -arg3.field4326 + arg0;
            } else if (arg0 < arg3.field4315) {
                var6 += arg3.field4315 - arg0;
            }
            if (~arg3.field4317 != -1 && arg3.field4317 >= var6 + -64 && ~class204.field3497 != -1 && ~arg3.field4318 == ~arg5) {
                var6 -= 64;
                if (~var6 > -1) {
                    var6 = 0;
                }
                int var7 = (arg3.field4317 - var6) * class204.field3497 / arg3.field4317;
                if (arg3.field4333 != null) {
                    arg3.field4333.method29(var7);
                } else if (~arg3.field4316 <= -1) {
                    class60 var8 = class60.method515(class108.field1928, arg3.field4316, 0);
                    if (var8 != null) {
                        class266 var9 = var8.method517().method1771(class105.field1846);
                        class2 var10 = class2.method14(var9, 100, var7);
                        var10.method39(-1);
                        class74.field1424.method586(var10);
                        arg3.field4333 = var10;
                    }
                }
                if (arg3.field4335 != null) {
                    arg3.field4335.method29(var7);
                    if (!arg3.field4335.method628(arg1 ^ -14793)) {
                        arg3.field4335 = null;
                        return;
                    }
                } else {
                    if (arg3.field4314 == null || ~(arg3.field4313 -= arg2) < -1) {
                        return;
                    }
                    int var11 = (int) (Math.random() * (double) arg3.field4314.length);
                    class60 var12 = class60.method515(class108.field1928, arg3.field4314[var11], 0);
                    if (var12 == null) {
                        return;
                    }
                    class266 var13 = var12.method517().method1771(class105.field1846);
                    class2 var14 = class2.method14(var13, 100, var7);
                    var14.method39(0);
                    class74.field1424.method586(var14);
                    arg3.field4313 = arg3.field4334 + (int) ((double) (-arg3.field4334 + arg3.field4319) * Math.random());
                    arg3.field4335 = var14;
                }
            } else {
                if (arg3.field4333 != null) {
                    class74.field1424.method583(arg3.field4333);
                    arg3.field4333 = null;
                }
                if (arg3.field4335 != null) {
                    class74.field1424.method583(arg3.field4335);
                    arg3.field4335 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        if (arg2 != -32513) {
            this.field2213 = -79;
        }
        ++field2209;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (~arg1 == -5) {
                            int var5 = arg0.method313((byte) -80);
                            this.field2210[1] = class272.method1817(var5, 65280) >> 4;
                            this.field2210[0] = class272.method1817(var5 << 4, 267386880);
                            this.field2210[2] = class272.method1817(var5 >> 12, 0);
                        }
                    } else {
                        this.field2217 = arg0.method339(-16777216);
                    }
                } else {
                    this.field2213 = arg0.method339(-16777216);
                }
            } else {
                this.field2218 = arg0.method339(-16777216);
            }
        } else {
            this.field2211 = arg0.method339(-16777216);
        }
    }

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "(I)V")
    public static final void method897(int arg0) {
        class216.field3755.method942(0);
        class203.field3482.method942(arg0);
        class232.field4020.method942(0);
        ++field2224;
        class32.field670.method942(0);
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ZI)Z")
    public static final boolean method898(boolean arg0, int arg1) {
        ++field2212;
        if (arg1 >= 97 && arg1 <= 122) {
            return true;
        } else if (arg1 >= 65 && arg1 <= 90) {
            return true;
        } else if (arg1 >= 48 && ~arg1 >= -58) {
            return true;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(ILie;)Lde;")
    public static final class107 method899(int arg0, class32 arg1) {
        arg1.method316((byte) -45);
        int var2 = arg1.method316((byte) 102);
        class107 var3 = class48.method444(-87, var2);
        if (arg0 != -16778) {
            field2221 = null;
        }
        var3.field1906 = arg1.method316((byte) 107);
        ++field2227;
        int var4 = arg1.method316((byte) -27);
        for (int var5 = 0; var5 < var4; ++var5) {
            int var6 = arg1.method316((byte) -52);
            var3.method122(arg1, var6, arg0 + -15735);
        }
        var3.method124(31);
        return var3;
    }

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "(Z)V")
    public static final void method900(boolean arg0) {
        ++field2214;
        if (field2219 != null) {
            field2219.method1431((byte) 49);
            field2219 = null;
        }
        class81.method630(false);
        class139.method960();
        for (int var1 = 0; var1 < 4; ++var1) {
            class146.field2613[var1].method232(-1);
        }
        class142.method982(0);
        System.gc();
        class211.method1411(2, -25906);
        class190.field3311 = -1;
        class140.field2406 = false;
        class102.method775(-114, arg0);
        class235.field4087 = 0;
        class27.field494 = 0;
        class151.field2691 = false;
        for (int var2 = 0; class144.field2599.length > var2; ++var2) {
            class144.field2599[var2] = null;
        }
        class89.field1636 = 0;
        class258.field4439 = 0;
        for (int var3 = 0; var3 < 2048; ++var3) {
            class232.field4025[var3] = null;
            class169.field2969[var3] = null;
        }
        for (int var4 = 0; var4 < 32768; ++var4) {
            class232.field4022[var4] = null;
        }
        for (int var5 = 0; ~var5 > -5; ++var5) {
            for (int var6 = 0; var6 < 104; ++var6) {
                for (int var7 = 0; var7 < 104; ++var7) {
                    class32.field674[var5][var6][var7] = null;
                }
            }
        }
        class57.method500(7079);
        class8.field160 = 0;
        class126.method893(true, (byte) 108);
    }

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "(Z)V")
    public static void method901(boolean arg0) {
        field2226 = null;
        field2219 = null;
        field2215 = null;
        field2220 = null;
        field2222 = null;
        field2223 = null;
        field2230 = null;
        if (!arg0) {
            field2229 = 100;
        }
        field2221 = null;
    }
}
