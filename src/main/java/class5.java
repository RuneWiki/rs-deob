import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class5 implements class311 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Lg;")
    private class67 field122 = new class67(256);

    @OriginalMember(owner = "client!lj", name = "g", descriptor = "Lph;")
    private class361 field127;

    @OriginalMember(owner = "client!lj", name = "d", descriptor = "Lph;")
    private class361 field124;

    @OriginalMember(owner = "client!lj", name = "k", descriptor = "[Lob;")
    private class185[] field131;

    @OriginalMember(owner = "client!lj", name = "e", descriptor = "[I")
    public static int[] field125 = new int[2048];

    @OriginalMember(owner = "client!lj", name = "j", descriptor = "Ljava/lang/String;")
    public static String field130 = "yellow:";

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field121;

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field123;

    @OriginalMember(owner = "client!lj", name = "f", descriptor = "I")
    public static int field126;

    @OriginalMember(owner = "client!lj", name = "h", descriptor = "I")
    public static int field128;

    @OriginalMember(owner = "client!lj", name = "i", descriptor = "I")
    public static int field129;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field132;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 4)
    public static void method33(int arg0) {
        field125 = null;
        field130 = null;
        if (arg0 >= -6) {
            method36(86L, -124);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IZ)Z", line = 19)
    public final boolean method34(int arg0, boolean arg1) {
        if (!arg1) {
            field125 = (int[]) null;
        }
        field123++;
        class41 var3 = this.method38(arg0, 1491);
        return var3 != null && var3.method302(this.field124, (byte) -90, this);
    }

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "(III)Ltn;", line = 35)
    public static final class85 method35(int arg0, int arg1, int arg2) {
        class167 var3 = class302.field4502[arg0][arg1][arg2];
        return var3 == null || var3.field2390 == null ? null : var3.field2390;
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(JI)V", line = 45)
    public static final void method36(long arg0, int arg1) {
        field121++;
        if (class86.field1208 == 1 || class86.field1208 == 5) {
            class353.method2463((byte) -57, arg0);
        } else if (class86.field1208 == 2) {
            class207.method1516(118);
        } else if (class86.field1208 == 4) {
            class132.method955(false, arg0);
        } else {
            class358.method2480((byte) -90);
        }
        if (!class15.field246) {
            if (class181.field2603 != 0) {
                class193.field2807 = class152.field2192;
                class255.field3814 = class354.field5444;
            } else if (class31.field445 == 0) {
                class193.field2807 = class56.field815;
                class255.field3814 = class165.field2353;
            } else {
                class255.field3814 = class227.field3425;
                class193.field2807 = class180.field2592;
            }
            class158.field2274[0] = class128.field1867;
            class324.field4886[0] = class133.field1949;
            class264.field4043 = 1;
            class216.field3186[0] = 1002;
            class281.field4267[0] = "";
        }
        class155.method1121((long) class304.field4560);
        if (class257.field3850 != -1) {
            class73.method603(-128, class257.field3850);
        }
        for (int var3 = 0; var3 < class178.field2558; var3++) {
            if (class332.field5051[var3]) {
                class186.field2674[var3] = true;
            }
            class158.field2276[var3] = class332.field5051[var3];
            class332.field5051[var3] = false;
        }
        if (class141.field2031) {
            class174.field2513 = true;
        }
        class17.field288 = null;
        class134.field1955 = -1;
        class274.field4157 = null;
        class4.field119 = class304.field4560;
        class22.field332 = -1;
        if (class257.field3850 != -1) {
            class178.field2558 = 0;
            class167.method1189((byte) 59);
        }
        int var4 = -102 / ((-arg1 - 34) / 42);
        if (class141.field2031) {
            class205.method1489();
        } else {
            class44.method318();
        }
        class307.method2156(-8600);
        if (class15.field246) {
            if (class304.field4564) {
                class4.method25((byte) -127);
            } else {
                class219.method1601(-16620);
            }
        } else if (class274.field4157 != null) {
            class97.method768(client.field647, -21783, class67.field981, class274.field4157);
        } else if (class134.field1955 != -1) {
            class97.method768(class134.field1955, -21783, class22.field332, (class359) null);
        }
        int var5 = class15.field246 ? -1 : class150.method1062(false);
        if (var5 == -1) {
            var5 = class110.field1613;
        }
        class1.method2((byte) 123, var5);
        if (class203.field2992 == 1) {
            class203.field2992 = 2;
        }
        if (class256.field3831 == 1) {
            class256.field3831 = 2;
        }
        if (class7.field139 == 3) {
            for (int var6 = 0; var6 < class178.field2558; var6++) {
                if (class158.field2276[var6]) {
                    if (class141.field2031) {
                        class205.method1500(class27.field383[var6], class324.field4883[var6], class338.field5251[var6], class96.field1358[var6], 16711935, 128);
                    } else {
                        class44.method315(class27.field383[var6], class324.field4883[var6], class338.field5251[var6], class96.field1358[var6], 16711935, 128);
                    }
                } else if (class186.field2674[var6]) {
                    if (class141.field2031) {
                        class205.method1500(class27.field383[var6], class324.field4883[var6], class338.field5251[var6], class96.field1358[var6], 16711680, 128);
                    } else {
                        class44.method315(class27.field383[var6], class324.field4883[var6], class338.field5251[var6], class96.field1358[var6], 16711680, 128);
                    }
                }
            }
        }
        class167.method1186(class321.field4835, class1.field55.field5137, class1.field55.field5165, class94.field1310, (byte) 108);
        class94.field1310 = 0;
    }

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "(II)Lob;", line = 209)
    public final class185 method37(int arg0, int arg1) {
        if (arg0 >= -77) {
            this.method38(14, 54);
        }
        field132++;
        return this.field131[arg1];
    }

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "(II)Lud;", line = 222)
    public class41 method38(int arg0, int arg1) {
        field126++;
        if (arg1 != 1491) {
            this.field122 = (class67) null;
        }
        class77 var3 = this.field122.method551(0, (long) arg0);
        if (var3 != null) {
            return (class41) var3;
        }
        byte[] var4 = this.field127.method2513((byte) -84, arg0);
        if (var4 == null) {
            return null;
        } else {
            class41 var5 = new class41(new class190(var4));
            this.field122.method547((long) arg0, -1, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(ZFIIIZ)[I", line = 253)
    public final int[] method39(boolean arg0, float arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field128++;
        return arg0 ? (int[]) null : this.method38(arg2, 1491).method301(this.field124, arg5, arg4, (byte) 42, this, arg3, (double) arg1, this.field131[arg2].field2653);
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(Lph;Lph;Lph;)V", line = 268)
    public class5(class361 arg0, class361 arg1, class361 arg2) {
        this.field127 = arg1;
        this.field124 = arg2;
        class190 var4 = new class190(arg0.method2520(0, 0, (byte) -25));
        int var5 = var4.method1317((byte) 58);
        this.field131 = new class185[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method1319(255) == 1) {
                this.field131[var6] = new class185();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field131[var7] != null) {
                this.field131[var7].field2655 = var4.method1319(255) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field131[var8] != null) {
                this.field131[var8].field2663 = var4.method1319(255) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field131[var9] != null) {
                this.field131[var9].field2664 = var4.method1319(255) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field131[var10] != null) {
                this.field131[var10].field2667 = var4.method1319(255) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field131[var11] != null) {
                this.field131[var11].field2665 = var4.method1322(9813);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field131[var12] != null) {
                this.field131[var12].field2662 = var4.method1322(9813);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field131[var13] != null) {
                this.field131[var13].field2657 = var4.method1322(9813);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field131[var14] != null) {
                this.field131[var14].field2654 = var4.method1322(9813);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field131[var15] != null) {
                this.field131[var15].field2659 = (short) var4.method1317((byte) 65);
            }
        }
        if (var4.field2776 < var4.field2718.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field131[var16] != null) {
                    var4.method1322(9813);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field131[var17] != null) {
                    var4.method1322(9813);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field131[var18] != null) {
                    var4.method1319(255);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field131[var19] != null) {
                    this.field131[var19].field2653 = var4.method1319(255) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field131[var20] != null) {
                    var4.method1322(9813);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field131[var21] != null) {
                    var4.method1319(255);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field131[var22] != null) {
                    var4.method1319(255);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field131[var23] != null) {
                    var4.method1319(255);
                }
            }
        }
    }
}
