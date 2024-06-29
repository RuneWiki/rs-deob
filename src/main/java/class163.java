import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class163 {

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "Leb;")
    public static class230 field2905 = class68.method589(0, "Stufe: ");

    @OriginalMember(owner = "client!jg", name = "p", descriptor = "I")
    public static int field2911 = 0;

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Leb;")
    public static class230 field2897 = class68.method589(0, "::");

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "I")
    public static int field2896;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field2898;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "I")
    public static int field2899;

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field2900;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public int field2901;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public int field2902;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field2904;

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "I")
    public int field2906;

    @OriginalMember(owner = "client!jg", name = "l", descriptor = "I")
    public static int field2907;

    @OriginalMember(owner = "client!jg", name = "m", descriptor = "I")
    public static int field2908;

    @OriginalMember(owner = "client!jg", name = "n", descriptor = "I")
    public int field2909;

    @OriginalMember(owner = "client!jg", name = "o", descriptor = "I")
    public int field2910;

    @OriginalMember(owner = "client!jg", name = "q", descriptor = "I")
    public int field2912;

    @OriginalMember(owner = "client!jg", name = "r", descriptor = "I")
    public int field2913;

    @OriginalMember(owner = "client!jg", name = "t", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!jg", name = "u", descriptor = "I")
    public static int field2916;

    @OriginalMember(owner = "client!jg", name = "v", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!jg", name = "s", descriptor = "Lkk;")
    public static class223 field2914;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "[B")
    public byte[] field2903;

    @OriginalMember(owner = "client!jg", name = "w", descriptor = "[B")
    public byte[] field2918;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "()V")
    public static final void method1218() {
        class27.field506 = 0;
        label191: for (int var0 = 0; var0 < class120.field2119; var0++) {
            class221 var1 = class80.field1456[var0];
            if (class261.field4639 != null) {
                for (int var2 = 0; var2 < class261.field4639.length; var2++) {
                    if (class261.field4639[var2] != -1000000 && (var1.field3798 <= class261.field4639[var2] || var1.field3784 <= class261.field4639[var2]) && (var1.field3790 <= class244.field4191[var2] || var1.field3792 <= class244.field4191[var2]) && (var1.field3790 >= class44.field785[var2] || var1.field3792 >= class44.field785[var2]) && (var1.field3789 <= class110.field1971[var2] || var1.field3788 <= class110.field1971[var2]) && (var1.field3789 >= class169.field2986[var2] || var1.field3788 >= class169.field2986[var2])) {
                        continue label191;
                    }
                }
            }
            if (var1.field3781 == 1) {
                int var3 = var1.field3780 + class108.field1945 - class158.field2821;
                if (var3 >= 0 && var3 <= class108.field1945 + class108.field1945) {
                    int var4 = var1.field3787 + class108.field1945 - class145.field2611;
                    if (var4 < 0) {
                        var4 = 0;
                    }
                    int var5 = var1.field3795 + class108.field1945 - class145.field2611;
                    if (var5 > class108.field1945 + class108.field1945) {
                        var5 = class108.field1945 + class108.field1945;
                    }
                    boolean var6 = false;
                    while (var4 <= var5) {
                        if (class13.field255[var3][var4++]) {
                            var6 = true;
                            break;
                        }
                    }
                    if (var6) {
                        int var7 = class274.field4817 - var1.field3790;
                        if (var7 > 32) {
                            var1.field3782 = 1;
                        } else {
                            if (var7 >= -32) {
                                continue;
                            }
                            var1.field3782 = 2;
                            var7 = -var7;
                        }
                        var1.field3791 = (var1.field3789 - class79.field1439 << 8) / var7;
                        var1.field3794 = (var1.field3788 - class79.field1439 << 8) / var7;
                        var1.field3783 = (var1.field3798 - class72.field1317 << 8) / var7;
                        var1.field3796 = (var1.field3784 - class72.field1317 << 8) / var7;
                        class116.field2093[class27.field506++] = var1;
                    }
                }
            } else if (var1.field3781 == 2) {
                int var8 = var1.field3787 + class108.field1945 - class145.field2611;
                if (var8 >= 0 && var8 <= class108.field1945 + class108.field1945) {
                    int var9 = var1.field3780 + class108.field1945 - class158.field2821;
                    if (var9 < 0) {
                        var9 = 0;
                    }
                    int var10 = var1.field3797 + class108.field1945 - class158.field2821;
                    if (var10 > class108.field1945 + class108.field1945) {
                        var10 = class108.field1945 + class108.field1945;
                    }
                    boolean var11 = false;
                    while (var9 <= var10) {
                        if (class13.field255[var9++][var8]) {
                            var11 = true;
                            break;
                        }
                    }
                    if (var11) {
                        int var12 = class79.field1439 - var1.field3789;
                        if (var12 > 32) {
                            var1.field3782 = 3;
                        } else {
                            if (var12 >= -32) {
                                continue;
                            }
                            var1.field3782 = 4;
                            var12 = -var12;
                        }
                        var1.field3793 = (var1.field3790 - class274.field4817 << 8) / var12;
                        var1.field3800 = (var1.field3792 - class274.field4817 << 8) / var12;
                        var1.field3783 = (var1.field3798 - class72.field1317 << 8) / var12;
                        var1.field3796 = (var1.field3784 - class72.field1317 << 8) / var12;
                        class116.field2093[class27.field506++] = var1;
                    }
                }
            } else if (var1.field3781 == 4) {
                int var13 = var1.field3798 - class72.field1317;
                if (var13 > 128) {
                    int var14 = var1.field3787 + class108.field1945 - class145.field2611;
                    if (var14 < 0) {
                        var14 = 0;
                    }
                    int var15 = var1.field3795 + class108.field1945 - class145.field2611;
                    if (var15 > class108.field1945 + class108.field1945) {
                        var15 = class108.field1945 + class108.field1945;
                    }
                    if (var14 <= var15) {
                        int var16 = var1.field3780 + class108.field1945 - class158.field2821;
                        if (var16 < 0) {
                            var16 = 0;
                        }
                        int var17 = var1.field3797 + class108.field1945 - class158.field2821;
                        if (var17 > class108.field1945 + class108.field1945) {
                            var17 = class108.field1945 + class108.field1945;
                        }
                        boolean var18 = false;
                        label163: for (int var19 = var16; var19 <= var17; var19++) {
                            for (int var20 = var14; var20 <= var15; var20++) {
                                if (class13.field255[var19][var20]) {
                                    var18 = true;
                                    break label163;
                                }
                            }
                        }
                        if (var18) {
                            var1.field3782 = 5;
                            var1.field3793 = (var1.field3790 - class274.field4817 << 8) / var13;
                            var1.field3800 = (var1.field3792 - class274.field4817 << 8) / var13;
                            var1.field3791 = (var1.field3789 - class79.field1439 << 8) / var13;
                            var1.field3794 = (var1.field3788 - class79.field1439 << 8) / var13;
                            class116.field2093[class27.field506++] = var1;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IIBLka;)V")
    public static final void method1219(int arg0, int arg1, byte arg2, class245 arg3) {
        field2916++;
        if (class229.field3940 != null || class243.field4188 || arg3 == null || class171.method1258(arg2 ^ 0xFFFFFFE0, arg3) == null) {
            return;
        }
        class229.field3940 = arg3;
        if (arg2 != 31) {
            return;
        }
        class138.field2473 = class171.method1258(arg2 - 32, arg3);
        class66.field1232 = 0;
        class28.field511 = arg1;
        class49.field869 = arg0;
        class177.field3104 = false;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILrk;IIBII)Lrk;")
    public static final class257 method1220(int arg0, class257 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        if (arg4 > -58) {
            method1218();
        }
        field2907++;
        long var7 = (long) arg6;
        class257 var9 = (class257) class124.field2182.method1125(var7, true);
        if (var9 == null) {
            class250 var10 = class250.method1770(field2914, arg6, 0);
            if (var10 == null) {
                return null;
            }
            var9 = var10.method1746(64, 768, -50, -10, -50);
            class124.field2182.method1129(var7, true, var9);
        }
        int var11 = arg1.method737();
        int var12 = arg1.method768();
        int var13 = arg1.method751();
        int var14 = arg1.method744();
        class257 var15 = var9.method764(true, true);
        if (arg5 != 0) {
            var15.method765(arg5);
        }
        class90 var16 = (class90) var15;
        if (arg2 != class37.method333(arg0 + var13, 1637367879, class124.field2174, arg3 + var11) || arg2 != class37.method333(arg0 + var14, 1637367879, class124.field2174, arg3 + var12)) {
            for (int var17 = 0; var17 < var16.field1599; var17++) {
                var16.field1585[var17] += class37.method333(var16.field1594[var17] + arg0, 1637367879, class124.field2174, var16.field1596[var17] + arg3) - arg2;
            }
            var16.field1591 = false;
        }
        return var15;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Ltj;B)V")
    public static final void method1221(class260 arg0, byte arg1) {
        int var2 = -110 / ((40 - arg1) / 40);
        field2899++;
        class66 var3 = (class66) class61.field1162.method394(arg0.field4620.method1587(61), -21083);
        if (var3 == null) {
            class115.method919((class109) null, arg0.field2253[0], arg0.field2296[0], 0, arg0, class124.field2174, 128, (class194) null);
        } else {
            var3.method582(false);
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method1222(int arg0) {
        field2905 = null;
        field2897 = null;
        if (arg0 != 0) {
            field2917 = 6;
        }
        field2914 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V")
    public static final void method1223(int arg0, int arg1) {
        int var2 = -14 / ((arg1 - 20) / 47);
        if (class36.field677 == null || class36.field677.length < arg0) {
            class36.field677 = new int[arg0];
        }
        field2908++;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BZ[Lhh;II[B)V")
    public static final void method1224(byte arg0, boolean arg1, class116[] arg2, int arg3, int arg4, byte[] arg5) {
        if (arg0 > -76) {
            return;
        }
        field2900++;
        class14 var6 = new class14(arg5);
        int var7 = -1;
        while (true) {
            int var8 = var6.method152((byte) 44);
            if (var8 == 0) {
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method202(91);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 - 1;
                int var11 = var9 & 0x3F;
                int var12 = var9 >> 6 & 0x3F;
                int var13 = var9 >> 12;
                int var14 = var6.method200(255);
                int var15 = var14 >> 2;
                int var16 = var14 & 0x3;
                int var17 = arg3 + var12;
                int var18 = arg4 + var11;
                if (var17 > 0 && var18 > 0 && var17 < 103 && var18 < 103) {
                    class116 var19 = null;
                    if (!arg1) {
                        int var20 = var13;
                        if ((class79.field1435[1][var17][var18] & 0x2) == 2) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class130.method1026(var18, var16, 83, var17, !arg1, var19, var13, var7, var15, arg1, var13);
                }
            }
        }
    }
}
