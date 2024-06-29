import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class35 extends class145 {

    @OriginalMember(owner = "client!rf", name = "R", descriptor = "Lo;")
    public static class14 field442 = new class14();

    @OriginalMember(owner = "client!rf", name = "V", descriptor = "Lnh;")
    public static class312 field446 = new class312(128);

    @OriginalMember(owner = "client!rf", name = "W", descriptor = "[I")
    public static int[] field447 = new int[2];

    @OriginalMember(owner = "client!rf", name = "Z", descriptor = "Ljava/lang/String;")
    public static String field450 = "Discard";

    @OriginalMember(owner = "client!rf", name = "X", descriptor = "Ljava/lang/String;")
    public static String field448 = null;

    @OriginalMember(owner = "client!rf", name = "Y", descriptor = "Lpi;")
    public static class201 field449 = new class201(64);

    @OriginalMember(owner = "client!rf", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field452 = "Examine";

    @OriginalMember(owner = "client!rf", name = "L", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "client!rf", name = "N", descriptor = "I")
    public static int field438;

    @OriginalMember(owner = "client!rf", name = "O", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!rf", name = "P", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!rf", name = "S", descriptor = "I")
    public int field443;

    @OriginalMember(owner = "client!rf", name = "T", descriptor = "I")
    public static int field444;

    @OriginalMember(owner = "client!rf", name = "U", descriptor = "I")
    public static int field445;

    @OriginalMember(owner = "client!rf", name = "M", descriptor = "Lea;")
    public class224 field437;

    @OriginalMember(owner = "client!rf", name = "ab", descriptor = "Z")
    public static boolean field451;

    @OriginalMember(owner = "client!rf", name = "Q", descriptor = "[B")
    public byte[] field441;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "(B)[B")
    public final byte[] method222(byte arg0) {
        int var2 = 123 / ((arg0 - 2) / 33);
        ++field436;
        if (super.field2341) {
            throw new RuntimeException();
        } else {
            return this.field441;
        }
    }

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "(I)I")
    public final int method223(int arg0) {
        ++field440;
        if (arg0 != 100) {
            method225(-98, -54, 102, 43, 123, -67, -109);
        }
        return super.field2341 ? 0 : 100;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(ZLca;)V")
    public static final void method224(boolean arg0, class122 arg1) {
        class240.field3525 = 3;
        ++field438;
        class267.method1834(-31477, true);
        class207.field3054 = true;
        class77.field1218 = 0;
        class22.field247 = true;
        class243.field3577 = true;
        class74.field1173 = 2;
        class99.field1688 = 255;
        class149.field2388 = 0;
        class79.field1278 = 0;
        class294.field4688 = true;
        class146.field2351 = 0;
        class281.field4536 = true;
        class171.field2582 = 127;
        class69.field1112 = true;
        class225.field3308 = true;
        class229.field3368 = true;
        class56.field817 = true;
        class51.field705 = true;
        class208.field3085 = 127;
        class47.field658 = true;
        if (~class246.field3634 <= -97) {
            class88.method656(2);
        } else {
            class88.method656(0);
        }
        class32.field398 = true;
        class64.field969 = 0;
        class168 var2 = null;
        class306.field4942 = arg0;
        class299.field4829 = false;
        class210.field3109 = 0;
        class265.field4245 = 0;
        class69.field1110 = false;
        try {
            class60 var3 = arg1.method930("runescape", 0);
            while (~var3.field936 == -1) {
                class155.method1130(1, 1L);
            }
            if (~var3.field936 == -2) {
                var2 = (class168) var3.field932;
                int var4 = 0;
                byte[] var5 = new byte[(int) var2.method1197(-122)];
                while (~var4 > ~var5.length) {
                    int var6 = var2.method1201(var4, false, var5, var5.length - var4);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                    var4 += var6;
                }
                class87.method647(new class53(var5), -24);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1202(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method225(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field439;
        class247.method1701(arg4, 1000);
        int var7 = 0;
        if (arg3 != 29260) {
            method227((byte) -39);
        }
        int var8 = arg4 - arg0;
        if (~var8 > -1) {
            var8 = 0;
        }
        int var9 = arg4;
        int var10 = -arg4;
        int var11 = var8;
        int var12 = -var8;
        if (arg5 >= class73.field1156 && ~arg5 >= ~class59.field859) {
            int[] var13 = class104.field1795[arg5];
            int var14 = class289.method1972(class264.field4230, (byte) 122, -arg4 + arg6, class273.field4418);
            int var15 = class289.method1972(class264.field4230, (byte) 122, arg4 + arg6, class273.field4418);
            int var16 = class289.method1972(class264.field4230, (byte) 122, -var8 + arg6, class273.field4418);
            int var17 = class289.method1972(class264.field4230, (byte) 122, arg6 + var8, class273.field4418);
            class89.method669(var13, arg2, var16, var14, (byte) -123);
            class89.method669(var13, arg1, var17, var16, (byte) -126);
            class89.method669(var13, arg2, var15, var17, (byte) -125);
        }
        int var18 = -1;
        int var19 = -1;
        while (var9 > var7) {
            var18 += 2;
            var12 += var18;
            var19 += 2;
            var10 += var19;
            if (~var12 <= -1 && var11 >= 1) {
                --var11;
                class114.field1887[var11] = var7;
                var12 -= var11 << 1;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                var10 -= var9 << 1;
                int var20 = -var9 + arg5;
                int var21 = arg5 - -var9;
                if (~class73.field1156 >= ~var21 && ~class59.field859 <= ~var20) {
                    if (~var8 < ~var9) {
                        int var22 = class114.field1887[var9];
                        int var23 = class289.method1972(class264.field4230, (byte) 122, arg6 - -var7, class273.field4418);
                        int var24 = class289.method1972(class264.field4230, (byte) 122, -var7 + arg6, class273.field4418);
                        int var25 = class289.method1972(class264.field4230, (byte) 122, arg6 + var22, class273.field4418);
                        int var26 = class289.method1972(class264.field4230, (byte) 122, arg6 - var22, class273.field4418);
                        if (class59.field859 >= var21) {
                            int[] var27 = class104.field1795[var21];
                            class89.method669(var27, arg2, var26, var24, (byte) -126);
                            class89.method669(var27, arg1, var25, var26, (byte) -123);
                            class89.method669(var27, arg2, var23, var25, (byte) -126);
                        }
                        if (var20 >= class73.field1156) {
                            int[] var28 = class104.field1795[var20];
                            class89.method669(var28, arg2, var26, var24, (byte) -128);
                            class89.method669(var28, arg1, var25, var26, (byte) -125);
                            class89.method669(var28, arg2, var23, var25, (byte) -125);
                        }
                    } else {
                        int var29 = class289.method1972(class264.field4230, (byte) 122, arg6 + var7, class273.field4418);
                        int var30 = class289.method1972(class264.field4230, (byte) 122, -var7 + arg6, class273.field4418);
                        if (~class59.field859 <= ~var21) {
                            class89.method669(class104.field1795[var21], arg2, var29, var30, (byte) -127);
                        }
                        if (~var20 <= ~class73.field1156) {
                            class89.method669(class104.field1795[var20], arg2, var29, var30, (byte) -128);
                        }
                    }
                }
            }
            int var31 = arg5 + var7;
            int var32 = arg5 - var7;
            if (~class73.field1156 >= ~var31 && ~class59.field859 <= ~var32) {
                int var33 = arg6 - -var9;
                int var34 = arg6 - var9;
                if (class264.field4230 <= var33 && ~var34 >= ~class273.field4418) {
                    int var35 = class289.method1972(class264.field4230, (byte) 122, var33, class273.field4418);
                    int var36 = class289.method1972(class264.field4230, (byte) 122, var34, class273.field4418);
                    if (~var8 < ~var7) {
                        int var37 = ~var11 <= ~var7 ? var11 : class114.field1887[var7];
                        int var38 = class289.method1972(class264.field4230, (byte) 122, arg6 + var37, class273.field4418);
                        int var39 = class289.method1972(class264.field4230, (byte) 122, -var37 + arg6, class273.field4418);
                        if (class59.field859 >= var31) {
                            int[] var40 = class104.field1795[var31];
                            class89.method669(var40, arg2, var39, var36, (byte) -126);
                            class89.method669(var40, arg1, var38, var39, (byte) -124);
                            class89.method669(var40, arg2, var35, var38, (byte) -127);
                        }
                        if (~var32 <= ~class73.field1156) {
                            int[] var41 = class104.field1795[var32];
                            class89.method669(var41, arg2, var39, var36, (byte) -128);
                            class89.method669(var41, arg1, var38, var39, (byte) -127);
                            class89.method669(var41, arg2, var35, var38, (byte) -128);
                        }
                    } else {
                        if (~var31 >= ~class59.field859) {
                            class89.method669(class104.field1795[var31], arg2, var35, var36, (byte) -123);
                        }
                        if (~var32 <= ~class73.field1156) {
                            class89.method669(class104.field1795[var32], arg2, var35, var36, (byte) -127);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lb;ZI)V")
    public static final void method226(class133 arg0, boolean arg1, int arg2) {
        ++field444;
        int var3 = arg0.field2187;
        int var4 = (int) arg0.field4008;
        arg0.method1781(5250);
        if (arg1) {
            class275.method1913(50, var3);
        }
        class102.method793(0, var3);
        class263 var5 = class144.method1078(var4, 8534);
        if (var5 != null) {
            class63.method476(var5, 14105);
        }
        int var6 = class147.field2360;
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            if (class53.method333(class204.field3009[var7], -12611)) {
                class302.method2058(1, var7);
            }
        }
        if (arg2 >= -55) {
            method227((byte) -66);
        }
        if (class147.field2360 == 1) {
            class191.field2823 = false;
            class210.method1482(class171.field2587, true, class71.field1125, class137.field2226, class253.field3817);
        } else {
            class210.method1482(class171.field2587, true, class71.field1125, class137.field2226, class253.field3817);
            int var8 = class208.field3084.method78(class143.field2310);
            for (int var9 = 0; ~class147.field2360 < ~var9; ++var9) {
                int var10 = class208.field3084.method78(class207.method1462(var9, -1));
                if (~var8 > ~var10) {
                    var8 = var10;
                }
            }
            class137.field2226 = class147.field2360 * 15 - -(class247.field3655 ? 26 : 22);
            class253.field3817 = var8 + 8;
        }
        if (class1.field17 != -1) {
            class16.method108(48, class1.field17, 1);
        }
    }

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "(B)V")
    public static void method227(byte arg0) {
        field442 = null;
        if (arg0 == -98) {
            field450 = null;
            field447 = null;
            field449 = null;
            field452 = null;
            field446 = null;
            field448 = null;
        }
    }
}
