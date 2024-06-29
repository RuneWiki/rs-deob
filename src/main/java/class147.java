import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class147 {

    @OriginalMember(owner = "client!ad", name = "f", descriptor = "Z")
    private boolean field2334 = false;

    @OriginalMember(owner = "client!ad", name = "j", descriptor = "I")
    public int field2338 = 0;

    @OriginalMember(owner = "client!ad", name = "w", descriptor = "I")
    public int field2351 = 0;

    @OriginalMember(owner = "client!ad", name = "m", descriptor = "Lhi;")
    public static class323 field2341 = null;

    @OriginalMember(owner = "client!ad", name = "i", descriptor = "[Lka;")
    public static class211[] field2337 = new class211[29];

    @OriginalMember(owner = "client!ad", name = "o", descriptor = "F")
    public static float field2343;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    private int field2329;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field2330;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public int field2331;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public int field2332;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public int field2333;

    @OriginalMember(owner = "client!ad", name = "g", descriptor = "I")
    public int field2335;

    @OriginalMember(owner = "client!ad", name = "h", descriptor = "I")
    public static int field2336;

    @OriginalMember(owner = "client!ad", name = "k", descriptor = "I")
    public int field2339;

    @OriginalMember(owner = "client!ad", name = "n", descriptor = "I")
    public static int field2342;

    @OriginalMember(owner = "client!ad", name = "p", descriptor = "I")
    public int field2344;

    @OriginalMember(owner = "client!ad", name = "q", descriptor = "I")
    public int field2345;

    @OriginalMember(owner = "client!ad", name = "r", descriptor = "I")
    public int field2346;

    @OriginalMember(owner = "client!ad", name = "s", descriptor = "I")
    public static int field2347;

    @OriginalMember(owner = "client!ad", name = "t", descriptor = "I")
    public static int field2348;

    @OriginalMember(owner = "client!ad", name = "u", descriptor = "I")
    public int field2349;

    @OriginalMember(owner = "client!ad", name = "v", descriptor = "I")
    public static int field2350;

    @OriginalMember(owner = "client!ad", name = "l", descriptor = "J")
    public long field2340;

    @OriginalMember(owner = "client!ad", name = "x", descriptor = "Lkn;")
    public static class220 field2352;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(I)V", line = 4)
    public static void method1079(int arg0) {
        field2337 = null;
        field2352 = null;
        field2341 = null;
        if (arg0 != 25419) {
            field2341 = (class323) null;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V", line = 18)
    public final void method1080(byte arg0) {
        field2342++;
        this.field2344 = class104.field1435[this.field2329];
        this.field2333 = (int) Math.sqrt((double) (this.field2335 * this.field2335 + this.field2346 * this.field2346 + this.field2345 * this.field2345));
        if (this.field2331 == 0) {
            this.field2331 = 1;
        }
        if (this.field2349 == 0) {
            this.field2340 = 2147483647L;
        } else if (this.field2349 == 1) {
            this.field2340 = (long) (this.field2333 * 8 / this.field2331);
            this.field2340 *= this.field2340;
        } else if (this.field2349 == 2) {
            this.field2340 = (long) (this.field2333 * 8 / this.field2331);
        }
        if (this.field2334) {
            this.field2333 *= -1;
        }
        if (arg0 >= -37) {
            this.field2351 = 67;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IBLlf;)V", line = 52)
    private final void method1081(int arg0, byte arg1, class143 arg2) {
        if (arg0 == 1) {
            this.field2329 = arg2.method1051(1);
        } else if (arg0 == 2) {
            arg2.method1043(true);
        } else if (arg0 == 3) {
            this.field2345 = arg2.method1057(-113);
            this.field2346 = arg2.method1057(-104);
            this.field2335 = arg2.method1057(-122);
        } else if (arg0 == 4) {
            this.field2349 = arg2.method1043(true);
            this.field2331 = arg2.method1057(-111);
        } else if (arg0 == 6) {
            this.field2332 = arg2.method1043(true);
        } else if (arg0 == 8) {
            this.field2338 = 1;
        } else if (arg0 == 9) {
            this.field2351 = 1;
        } else if (arg0 == 10) {
            this.field2334 = true;
        }
        if (arg1 > 119) {
            field2347++;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(IZ)V", line = 108)
    public static final void method1082(int arg0, boolean arg1) {
        class307.field4775 = arg1;
        field2330++;
        if (arg0 != -49) {
            field2337 = (class211[]) null;
        }
        if (!class307.field4775) {
            int var26 = class282.field4499.method1051(arg0 + 50);
            int var27 = class282.field4499.method1048(68);
            boolean var28 = class298.method2111(class282.field4499.method1059((byte) 91), false);
            int var29 = class282.field4499.method1048(-49);
            int var30 = class282.field4499.method1046(2);
            int var31 = (class191.field2869 - class282.field4499.field2295) / 16;
            class312.field4893 = new int[var31][4];
            for (int var32 = 0; var32 < var31; var32++) {
                for (int var33 = 0; var33 < 4; var33++) {
                    class312.field4893[var32][var33] = class282.field4499.method1058((byte) -116);
                }
            }
            int var34 = class282.field4499.method1031(false);
            class67.field834 = (byte[][]) null;
            class316.field4951 = new byte[var31][];
            class119.field1658 = new byte[var31][];
            class203.field3090 = new int[var31];
            class84.field1098 = new int[var31];
            class185.field2787 = new int[var31];
            class256.field4049 = new byte[var31][];
            class218.field3277 = new int[var31];
            boolean var35 = false;
            if (((var27 / 8) == 48 || var27 / 8 == 49) && var26 / 8 == 48) {
                var35 = true;
            }
            class108.field1490 = new byte[var31][];
            class253.field4009 = new int[var31];
            if ((var27 / 8) == 48 && var26 / 8 == 148) {
                var35 = true;
            }
            int var36 = 0;
            class128.field1874 = null;
            for (int var37 = (var27 - 6) / 8; var37 <= (var27 + 6) / 8; var37++) {
                for (int var38 = (var26 - 6) / 8; var38 <= ((var26 + 6) / 8); var38++) {
                    int var39 = (var37 << 8) + var38;
                    if (var35 && var38 == 49 || var38 == 149 || var38 == 147 || var37 == 50 || !(var37 != 49 || var38 != 47)) {
                        class218.field3277[var36] = var39;
                        class185.field2787[var36] = -1;
                        class253.field4009[var36] = -1;
                        class203.field3090[var36] = -1;
                        class84.field1098[var36] = -1;
                    } else {
                        class218.field3277[var36] = var39;
                        class185.field2787[var36] = class102.field1380.method93(-62, "m" + var37 + "_" + var38);
                        class253.field4009[var36] = class102.field1380.method93(-59, "l" + var37 + "_" + var38);
                        class203.field3090[var36] = class102.field1380.method93(-107, "um" + var37 + "_" + var38);
                        class84.field1098[var36] = class102.field1380.method93(-104, "ul" + var37 + "_" + var38);
                    }
                    var36++;
                }
            }
            class229.method1587(var28, var34, var26, var29, var27, false, arg0 + 57, var30);
            return;
        }
        int var2 = class282.field4499.method1032(0);
        int var3 = class282.field4499.method1051(1);
        boolean var4 = class298.method2111(class282.field4499.method1062((byte) -20), false);
        int var5 = class282.field4499.method1048(-50);
        int var6 = class282.field4499.method1048(arg0 ^ 0xFFFFFF8A);
        class282.field4499.method301(-26380);
        for (int var7 = 0; var7 < 4; var7++) {
            for (int var8 = 0; var8 < 13; var8++) {
                for (int var9 = 0; var9 < 13; var9++) {
                    int var10 = class282.field4499.method307(1, true);
                    if (var10 == 1) {
                        class184.field2766[var7][var8][var9] = class282.field4499.method307(26, true);
                    } else {
                        class184.field2766[var7][var8][var9] = -1;
                    }
                }
            }
        }
        class282.field4499.method303(125);
        int var11 = (class191.field2869 - class282.field4499.field2295) / 16;
        class312.field4893 = new int[var11][4];
        for (int var12 = 0; var12 < var11; var12++) {
            for (int var13 = 0; var13 < 4; var13++) {
                class312.field4893[var12][var13] = class282.field4499.method1058((byte) -109);
            }
        }
        int var14 = class282.field4499.method1043(true);
        class67.field834 = (byte[][]) null;
        class128.field1874 = null;
        class256.field4049 = new byte[var11][];
        class84.field1098 = new int[var11];
        class218.field3277 = new int[var11];
        class203.field3090 = new int[var11];
        class316.field4951 = new byte[var11][];
        class119.field1658 = new byte[var11][];
        class185.field2787 = new int[var11];
        class108.field1490 = new byte[var11][];
        class253.field4009 = new int[var11];
        int var15 = 0;
        for (int var16 = 0; var16 < 4; var16++) {
            for (int var17 = 0; var17 < 13; var17++) {
                for (int var18 = 0; var18 < 13; var18++) {
                    int var19 = class184.field2766[var16][var17][var18];
                    if (var19 != -1) {
                        int var20 = var19 >> 3 & 0x7FF;
                        int var21 = var19 >> 14 & 0x3FF;
                        int var22 = (var21 / 8 << 8) + (var20 / 8);
                        for (int var23 = 0; var23 < var15; var23++) {
                            if (class218.field3277[var23] == var22) {
                                var22 = -1;
                                break;
                            }
                        }
                        if (var22 != -1) {
                            class218.field3277[var15] = var22;
                            int var24 = var22 & 0xFF;
                            int var25 = (var22 & 0xFFE7) >> 8;
                            class185.field2787[var15] = class102.field1380.method93(-53, "m" + var25 + "_" + var24);
                            class253.field4009[var15] = class102.field1380.method93(-90, "l" + var25 + "_" + var24);
                            class203.field3090[var15] = class102.field1380.method93(class60.method368(arg0, 108), "um" + var25 + "_" + var24);
                            class84.field1098[var15] = class102.field1380.method93(-124, "ul" + var25 + "_" + var24);
                            var15++;
                        }
                    }
                }
            }
        }
        class229.method1587(var4, var6, var2, var3, var5, false, 8, var14);
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Llf;Z)V", line = 361)
    public final void method1083(class143 arg0, boolean arg1) {
        field2348++;
        while (true) {
            int var3 = arg0.method1043(true);
            if (var3 == 0) {
                if (!arg1) {
                    this.field2331 = 8;
                }
                return;
            }
            this.method1081(var3, (byte) 121, arg0);
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lgi;I)V", line = 387)
    public static final void method1084(class242 arg0, int arg1) {
        if (class102.field1381 == arg0.field3780 || arg0.field3807 == -1 || arg0.field3796 != 0 || arg0.field3740 + 1 > class289.method2067((byte) -30, arg0.field3807).field1524[arg0.field3738]) {
            int var2 = arg0.field3780 - arg0.field3773;
            int var3 = class102.field1381 - arg0.field3773;
            int var4 = arg0.field3761 * 128 + arg0.method412((byte) 86) * 64;
            int var5 = arg0.field3733 * 128 + arg0.method412((byte) 101) * 64;
            int var6 = arg0.field3719 * 128 + arg0.method412((byte) 102) * 64;
            int var7 = arg0.field3790 * 128 + arg0.method412((byte) 94) * 64;
            arg0.field3763 = ((var2 - var3) * var5 + (var3 * var7)) / var2;
            arg0.field3767 = ((var2 - var3) * var4 + var3 * var6) / var2;
        }
        field2350++;
        arg0.field3713 = 0;
        if (arg0.field3770 == arg1) {
            arg0.field3806 = 1024;
        }
        if (arg0.field3770 == 1) {
            arg0.field3806 = 1536;
        }
        if (arg0.field3770 == 2) {
            arg0.field3806 = 0;
        }
        if (arg0.field3770 == 3) {
            arg0.field3806 = 512;
        }
        arg0.field3760 = arg0.field3806;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Lmd;", line = 434)
    public static final class279 method1085(int arg0, int arg1, int arg2) {
        field2336++;
        if (arg1 != -19443) {
            method1082(75, false);
        }
        class279 var3 = (class279) class245.field3862.method770((long) arg2 << 32 | (long) arg0, -35);
        if (var3 == null) {
            var3 = new class279(arg2, arg0);
            class245.field3862.method764(arg1 ^ 0xFFFFEB3C, var3, var3.field2834);
        }
        return var3;
    }
}
