import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class50 extends class160 {

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "I")
    private int field731 = 585;

    @OriginalMember(owner = "client!sj", name = "bb", descriptor = "Loh;")
    public static class281 field736 = new class281(64);

    @OriginalMember(owner = "client!sj", name = "eb", descriptor = "I")
    public static int field739 = 0;

    @OriginalMember(owner = "client!sj", name = "gb", descriptor = "I")
    public static int field741 = 64;

    @OriginalMember(owner = "client!sj", name = "fb", descriptor = "I")
    public static int field740 = 3;

    @OriginalMember(owner = "client!sj", name = "hb", descriptor = "[Ljava/lang/String;")
    public static String[] field742 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    public static int field727;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    public static int field728;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "I")
    public static int field729;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "I")
    public static int field733;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!sj", name = "ib", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!sj", name = "db", descriptor = "Lgd;")
    public static class76 field738;

    @OriginalMember(owner = "client!sj", name = "cb", descriptor = "[[[B")
    public static byte[][][] field737;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZ)I")
    public static final int method372(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            method377(-105);
        }
        int var3 = arg1 + -1 & arg0 >> 31;
        ++field729;
        return ((arg0 >>> 31) + arg0) % arg1 + var3;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V")
    public class50() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ILhc;Lhc;)V")
    public static final void method373(int arg0, class235 arg1, class235 arg2) {
        if (arg0 == 16) {
            class228.field3641 = arg2;
            ++field727;
            class170.field2649 = arg1;
        }
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V")
    public static void method374(int arg0) {
        field737 = null;
        field738 = null;
        if (arg0 == 1) {
            field736 = null;
            field742 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IB)[I")
    public final int[] method1(int arg0, byte arg1) {
        if (arg1 != 57) {
            field739 = -18;
        }
        ++field728;
        int[] var3 = super.field2488.method15((byte) 126, arg0);
        if (super.field2488.field42) {
            int var4 = class103.field1713[arg0];
            for (int var5 = 0; class240.field3896 > var5; ++var5) {
                int var6 = class190.field2946[var5];
                if (~var6 < ~this.field731 && -this.field731 + 4096 > var6 && 2048 - this.field731 < var4 && ~(this.field731 + 2048) < ~var4) {
                    int var7 = -var6 + 2048;
                    int var8 = ~var7 <= -1 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (-this.field731 + 2048);
                    var3[var5] = -var10 + 4096;
                } else if (2048 - this.field731 < var6 && ~var6 > ~(2048 - -this.field731)) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field731;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field731 + 2048);
                } else if (~var4 <= ~this.field731 && var4 <= -this.field731 + 4096) {
                    if (~var6 <= ~this.field731 && var6 <= -this.field731 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = -var4 + 2048;
                        int var16 = ~var15 > -1 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field731 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field731;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field731);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lai;II)V")
    public final void method2(class88 arg0, int arg1, int arg2) {
        if (arg1 <= 11) {
            method378((class22) null, -96, -77, -90, 117, -49, -89, -109, false);
        }
        if (arg2 == 0) {
            this.field731 = arg0.method645(11596);
        }
        ++field730;
    }

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "(I)V")
    public static final void method375(int arg0) {
        ++field733;
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; class128.field2018 + -1 > var2; ++var2) {
                if (class146.field2319[var2] < 1000 && class146.field2319[var2 + 1] > 1000) {
                    var1 = false;
                    String var3 = class256.field4099[var2];
                    class256.field4099[var2] = class256.field4099[var2 + 1];
                    class256.field4099[var2 + 1] = var3;
                    String var4 = class88.field1492[var2];
                    class88.field1492[var2] = class88.field1492[var2 - -1];
                    class88.field1492[var2 + 1] = var4;
                    int var5 = class29.field415[var2];
                    class29.field415[var2] = class29.field415[var2 - -1];
                    class29.field415[var2 + 1] = var5;
                    int var6 = class45.field648[var2];
                    class45.field648[var2] = class45.field648[var2 - -1];
                    class45.field648[var2 + 1] = var6;
                    int var7 = class268.field4273[var2];
                    class268.field4273[var2] = class268.field4273[var2 + 1];
                    class268.field4273[var2 - -1] = var7;
                    short var8 = class146.field2319[var2];
                    class146.field2319[var2] = class146.field2319[var2 + 1];
                    class146.field2319[var2 + 1] = var8;
                    long var9 = class243.field3962[var2];
                    class243.field3962[var2] = class243.field3962[var2 + 1];
                    class243.field3962[var2 - -1] = var9;
                }
            }
        }
        if (arg0 != 1) {
            field741 = -111;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method376(String arg0, int arg1, String arg2, String arg3) {
        ++field732;
        int var4 = arg2.length();
        int var5 = arg3.length();
        int var6 = arg0.length();
        if (arg1 == var5) {
            throw new IllegalArgumentException("Key cannot have zero length");
        } else {
            int var7 = var4;
            int var8 = var6 - var5;
            if (~var8 != -1) {
                int var9 = 0;
                while (true) {
                    int var10 = arg2.indexOf(arg3, var9);
                    if (~var10 > -1) {
                        break;
                    }
                    var9 = var5 + var10;
                    var7 += var8;
                }
            }
            int var11 = 0;
            StringBuffer var12 = new StringBuffer(var7);
            while (true) {
                int var13 = arg2.indexOf(arg3, var11);
                if (var13 < 0) {
                    var12.append(arg2.substring(var11));
                    return var12.toString();
                }
                var12.append(arg2.substring(var11, var13));
                var11 = var5 + var13;
                var12.append(arg0);
            }
        }
    }

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "(I)V")
    public static final void method377(int arg0) {
        class113.field1847.method1888(arg0 + -17501);
        ++field734;
        if (arg0 != 17627) {
            field740 = -64;
        }
        class62.field1072.method1888(-74);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lpc;IIIIIIIZ)V")
    public static final void method378(class22 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8) {
        int var9;
        int var10 = var9 = (arg6 << 7) - class6.field127;
        int var11;
        int var12 = var11 = (arg7 << 7) - class193.field3029;
        int var13;
        int var14 = var13 = var10 + 128;
        int var15;
        int var16 = var15 = var12 + 128;
        int var17 = class66.field1107[arg1][arg6][arg7] - class140.field2145;
        int var18 = class66.field1107[arg1][arg6 + 1][arg7] - class140.field2145;
        int var19 = class66.field1107[arg1][arg6 + 1][arg7 + 1] - class140.field2145;
        int var20 = class66.field1107[arg1][arg6][arg7 + 1] - class140.field2145;
        int var21 = arg4 * var12 + arg5 * var10 >> 16;
        int var22 = arg5 * var12 - arg4 * var10 >> 16;
        int var24 = arg3 * var17 - arg2 * var22 >> 16;
        int var25 = arg2 * var17 + arg3 * var22 >> 16;
        if (var25 >= 50) {
            int var27 = arg4 * var11 + arg5 * var14 >> 16;
            int var28 = arg5 * var11 - arg4 * var14 >> 16;
            int var30 = arg3 * var18 - arg2 * var28 >> 16;
            int var31 = arg2 * var18 + arg3 * var28 >> 16;
            if (var31 >= 50) {
                int var33 = arg4 * var16 + arg5 * var13 >> 16;
                int var34 = arg5 * var16 - arg4 * var13 >> 16;
                int var36 = arg3 * var19 - arg2 * var34 >> 16;
                int var37 = arg2 * var19 + arg3 * var34 >> 16;
                if (var37 >= 50) {
                    int var39 = arg4 * var15 + arg5 * var9 >> 16;
                    int var40 = arg5 * var15 - arg4 * var9 >> 16;
                    int var42 = arg3 * var20 - arg2 * var40 >> 16;
                    int var43 = arg2 * var20 + arg3 * var40 >> 16;
                    if (var43 >= 50) {
                        int var45 = (var21 << 9) / var25 + class195.field3078;
                        int var46 = (var24 << 9) / var25 + class195.field3082;
                        int var47 = (var27 << 9) / var31 + class195.field3078;
                        int var48 = (var30 << 9) / var31 + class195.field3082;
                        int var49 = (var33 << 9) / var37 + class195.field3078;
                        int var50 = (var36 << 9) / var37 + class195.field3082;
                        int var51 = (var39 << 9) / var43 + class195.field3078;
                        int var52 = (var42 << 9) / var43 + class195.field3082;
                        class195.field3092 = 0;
                        if ((var48 - var52) * (var49 - var51) - (var47 - var51) * (var50 - var52) > 0) {
                            if (class16.field248 && class243.method1679(class195.field3078 + class112.field1840, class278.field4420 + class195.field3082, var50, var52, var48, var49, var51, var47)) {
                                class283.field4480 = arg6;
                                class51.field749 = arg7;
                            }
                            if (!arg8) {
                                class195.field3088 = false;
                                if (var49 < 0 || var51 < 0 || var47 < 0 || var49 > class195.field3084 || var51 > class195.field3084 || var47 > class195.field3084) {
                                    class195.field3088 = true;
                                }
                                if (arg0.field320 == -1) {
                                    if (arg0.field318 != 12345678) {
                                        class195.method1329(var50, var52, var48, var49, var51, var47, arg0.field318, arg0.field314, arg0.field311);
                                    }
                                } else if (class170.field2648) {
                                    if (arg0.field316) {
                                        class195.method1326(var50, var52, var48, var49, var51, var47, arg0.field318, arg0.field314, arg0.field311, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field320);
                                    } else {
                                        class195.method1326(var50, var52, var48, var49, var51, var47, arg0.field318, arg0.field314, arg0.field311, var33, var39, var27, var36, var42, var30, var37, var43, var31, arg0.field320);
                                    }
                                } else {
                                    int var53 = class195.field3087.method497(arg0.field320, (byte) -74);
                                    class195.method1329(var50, var52, var48, var49, var51, var47, class147.method992(var53, arg0.field318), class147.method992(var53, arg0.field314), class147.method992(var53, arg0.field311));
                                }
                            }
                        }
                        if ((var45 - var47) * (var52 - var48) - (var46 - var48) * (var51 - var47) > 0) {
                            if (class16.field248 && class243.method1679(class195.field3078 + class112.field1840, class278.field4420 + class195.field3082, var46, var48, var52, var45, var47, var51)) {
                                class283.field4480 = arg6;
                                class51.field749 = arg7;
                            }
                            if (!arg8) {
                                class195.field3088 = false;
                                if (var45 < 0 || var47 < 0 || var51 < 0 || var45 > class195.field3084 || var47 > class195.field3084 || var51 > class195.field3084) {
                                    class195.field3088 = true;
                                }
                                if (arg0.field320 == -1) {
                                    if (arg0.field313 != 12345678) {
                                        class195.method1329(var46, var48, var52, var45, var47, var51, arg0.field313, arg0.field311, arg0.field314);
                                        return;
                                    }
                                } else {
                                    if (class170.field2648) {
                                        class195.method1326(var46, var48, var52, var45, var47, var51, arg0.field313, arg0.field311, arg0.field314, var21, var27, var39, var24, var30, var42, var25, var31, var43, arg0.field320);
                                        return;
                                    }
                                    int var54 = class195.field3087.method497(arg0.field320, (byte) -74);
                                    class195.method1329(var46, var48, var52, var45, var47, var51, class147.method992(var54, arg0.field313), class147.method992(var54, arg0.field311), class147.method992(var54, arg0.field314));
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
