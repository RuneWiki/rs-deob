import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class184 {

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "Z")
    public boolean field2867 = false;

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "I")
    public static int field2851 = 0;

    @OriginalMember(owner = "client!uf", name = "l", descriptor = "I")
    public static int field2861 = 0;

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field2863 = 0;

    @OriginalMember(owner = "client!uf", name = "m", descriptor = "I")
    public static int field2862 = -1;

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "[C")
    public static char[] field2865 = new char[] { '_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "I")
    public static int field2850;

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "I")
    public static int field2853;

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field2856;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!uf", name = "i", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!uf", name = "j", descriptor = "I")
    public int field2859;

    @OriginalMember(owner = "client!uf", name = "k", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "I")
    public int field2864;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public static int field2866;

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "[I")
    public static int[] field2854;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)[Ljj;")
    public static final class110[] method1217(int arg0) {
        field2853++;
        class110[] var1 = new class110[class230.field3697];
        for (int var2 = arg0; var2 < class230.field3697; var2++) {
            var1[var2] = new class5(class196.field3118, class268.field4396, class239.field3781[var2], class272.field4457[var2], field2854[var2], class263.field4341[var2], class56.field758[var2], class12.field157);
        }
        class270.method1856(-74);
        return var1;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)V")
    public static void method1218(int arg0) {
        field2854 = null;
        if (arg0 == 30642) {
            field2865 = null;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(SB)Z")
    public static final boolean method1219(short arg0, byte arg1) {
        if (arg1 != -82) {
            method1218(20);
        }
        field2852++;
        if (arg0 == 38 || arg0 == 3 || arg0 == 50 || arg0 == 10 || arg0 == 12 || arg0 == 43 || arg0 == 19 || arg0 == 60) {
            return true;
        } else if (arg0 == 36 || arg0 == 24 || arg0 == 1004 || arg0 == 1011) {
            return true;
        } else if (arg0 == 14 || arg0 == 31 || arg0 == 37 || arg0 == 59 || arg0 == 5) {
            return true;
        } else {
            return arg0 == 30 || arg0 == 42 || arg0 == 45 || arg0 == 35 || arg0 == 9 || arg0 == 20;
        }
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(I)Lh;")
    public static final class294 method1220(int arg0) {
        field2858++;
        int var1 = class263.field4341[0] * field2854[0];
        if (arg0 >= -108) {
            field2863 = 53;
        }
        int[] var2 = new int[var1];
        byte[] var3 = class56.field758[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class12.field157[class10.method53(255, var3[var4])];
        }
        class38 var5 = new class38(class196.field3118, class268.field4396, class239.field3781[0], class272.field4457[0], field2854[0], class263.field4341[0], var2);
        class270.method1856(-82);
        return var5;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1221(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2856++;
        int var7 = 0;
        class258.method1797(arg5, 31);
        int var8 = arg5 - arg0;
        if (var8 < arg3) {
            var8 = 0;
        }
        int var9 = -arg5;
        int var10 = var8;
        int var11 = -var8;
        int var12 = arg5;
        if (class63.field941 <= arg1 && class75.field1180 >= arg1) {
            int[] var13 = class130.field2005[arg1];
            int var14 = class245.method1720(class53.field711, -44, arg4 - arg5, class87.field1356);
            int var15 = class245.method1720(class53.field711, arg3 - 60, arg4 - -arg5, class87.field1356);
            int var16 = class245.method1720(class53.field711, arg3 - 57, -var8 + arg4, class87.field1356);
            int var17 = class245.method1720(class53.field711, -80, arg4 + var8, class87.field1356);
            class71.method451(arg6, true, var16, var14, var13);
            class71.method451(arg2, true, var17, var16, var13);
            class71.method451(arg6, true, var15, var17, var13);
        }
        int var18 = -1;
        int var19 = -1;
        while (var7 < var12) {
            var18 += 2;
            var9 += var18;
            var19 += 2;
            var11 += var19;
            if (var11 >= 0 && var10 >= 1) {
                var10--;
                var11 -= var10 << 1;
                class242.field3835[var10] = var7;
            }
            var7++;
            if (var9 >= 0) {
                var12--;
                var9 -= var12 << 1;
                int var20 = arg1 - var12;
                int var21 = arg1 + var12;
                if (class63.field941 <= var21 && class75.field1180 >= var20) {
                    if (var8 > var12) {
                        int var22 = class242.field3835[var12];
                        int var23 = class245.method1720(class53.field711, -51, arg4 + var7, class87.field1356);
                        int var24 = class245.method1720(class53.field711, -107, arg4 - var7, class87.field1356);
                        int var25 = class245.method1720(class53.field711, -52, arg4 + var22, class87.field1356);
                        int var26 = class245.method1720(class53.field711, arg3 - 65, arg4 - var22, class87.field1356);
                        if (var21 <= class75.field1180) {
                            int[] var27 = class130.field2005[var21];
                            class71.method451(arg6, true, var26, var24, var27);
                            class71.method451(arg2, true, var25, var26, var27);
                            class71.method451(arg6, true, var23, var25, var27);
                        }
                        if (var20 >= class63.field941) {
                            int[] var28 = class130.field2005[var20];
                            class71.method451(arg6, true, var26, var24, var28);
                            class71.method451(arg2, true, var25, var26, var28);
                            class71.method451(arg6, true, var23, var25, var28);
                        }
                    } else {
                        int var29 = class245.method1720(class53.field711, -113, arg4 + var7, class87.field1356);
                        int var30 = class245.method1720(class53.field711, -91, arg4 - var7, class87.field1356);
                        if (var21 <= class75.field1180) {
                            class71.method451(arg6, true, var29, var30, class130.field2005[var21]);
                        }
                        if (class63.field941 <= var20) {
                            class71.method451(arg6, true, var29, var30, class130.field2005[var20]);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (class63.field941 <= var32 && class75.field1180 >= var31) {
                int var33 = arg4 + var12;
                int var34 = arg4 - var12;
                if (var33 >= class53.field711 && var34 <= class87.field1356) {
                    int var35 = class245.method1720(class53.field711, -114, var33, class87.field1356);
                    int var36 = class245.method1720(class53.field711, arg3 - 87, var34, class87.field1356);
                    if (var8 <= var7) {
                        if (class75.field1180 >= var32) {
                            class71.method451(arg6, true, var35, var36, class130.field2005[var32]);
                        }
                        if (var31 >= class63.field941) {
                            class71.method451(arg6, true, var35, var36, class130.field2005[var31]);
                        }
                    } else {
                        int var37 = var7 > var10 ? class242.field3835[var7] : var10;
                        int var38 = class245.method1720(class53.field711, -48, arg4 + var37, class87.field1356);
                        int var39 = class245.method1720(class53.field711, arg3 - 75, -var37 + arg4, class87.field1356);
                        if (var32 <= class75.field1180) {
                            int[] var40 = class130.field2005[var32];
                            class71.method451(arg6, true, var39, var36, var40);
                            class71.method451(arg2, true, var38, var39, var40);
                            class71.method451(arg6, true, var35, var38, var40);
                        }
                        if (class63.field941 <= var31) {
                            int[] var41 = class130.field2005[var31];
                            class71.method451(arg6, true, var39, var36, var41);
                            class71.method451(arg2, true, var38, var39, var41);
                            class71.method451(arg6, true, var35, var38, var41);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ILma;II)V")
    private final void method1222(int arg0, class202 arg1, int arg2, int arg3) {
        field2860++;
        int var5 = 75 / ((arg2 - 1) / 58);
        if (arg3 == 1) {
            this.field2864 = arg1.method1419(120);
        } else if (arg3 == 2) {
            this.field2859 = arg1.method1401((byte) -88);
        } else if (arg3 == 3) {
            this.field2867 = true;
            return;
        } else if (arg3 == 4) {
            this.field2864 = -1;
            return;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZI)I")
    public static final int method1223(boolean arg0, int arg1) {
        field2850++;
        if (!arg0) {
            field2862 = 86;
        }
        return arg1 & 0x7F;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Lma;II)V")
    public final void method1224(class202 arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            this.method1224((class202) null, 93, -20);
        }
        while (true) {
            int var4 = arg0.method1420((byte) 0);
            if (var4 == 0) {
                field2857++;
                return;
            }
            this.method1222(arg1, arg0, 127, var4);
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(ZBI)Lti;")
    public final class5 method1225(boolean arg0, byte arg1, int arg2) {
        int var4 = -116 / ((-arg1 - 11) / 45);
        field2855++;
        class5 var5 = (class5) class284.field4745.method149((byte) -52, (long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.field2864));
        if (var5 != null) {
            return var5;
        }
        class45.field616.method1874(this.field2864, 3883);
        class5 var6 = class131.method875(class45.field616, this.field2864, 3, 0);
        if (var6 != null) {
            var6.method30(class55.field728, class179.field2791, class159.field2514);
            var6.field1680 = var6.field1681;
            var6.field1682 = var6.field1672;
            if (arg0) {
                var6.method24();
            }
            for (int var7 = 0; var7 < arg2; var7++) {
                var6.method27();
            }
            class284.field4745.method152(var6, (long) ((arg0 ? 262144 : 0) | arg2 << 16 | this.field2864), true);
        }
        return var6;
    }
}
