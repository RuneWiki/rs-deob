import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class17 extends class18 {

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "Lud;")
    public class52 field166 = new class52();

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "Llj;")
    public class25 field169 = new class25();

    @OriginalMember(owner = "client!rh", name = "y", descriptor = "Lfg;")
    private class74 field152;

    @OriginalMember(owner = "client!rh", name = "C", descriptor = "Lmh;")
    private static class62 field156 = class201.method1405(true, "Examine");

    @OriginalMember(owner = "client!rh", name = "z", descriptor = "I")
    public static int field153 = 0;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "I")
    public static int field160 = 0;

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "Lmh;")
    public static class62 field164 = field156;

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "[I")
    public static int[] field172 = new int[100];

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "[I")
    public static int[] field170 = new int[256];

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "Lmh;")
    private static class62 field174 = class201.method1405(true, "Loaded sprites");

    @OriginalMember(owner = "client!rh", name = "F", descriptor = "Lmh;")
    public static class62 field159 = field174;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "Lmh;")
    public static class62 field162 = class201.method1405(true, "<)4col>");

    @OriginalMember(owner = "client!rh", name = "x", descriptor = "I")
    public static int field151;

    @OriginalMember(owner = "client!rh", name = "A", descriptor = "I")
    public static int field154;

    @OriginalMember(owner = "client!rh", name = "B", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!rh", name = "D", descriptor = "I")
    public static int field157;

    @OriginalMember(owner = "client!rh", name = "E", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    public static int field161;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
    public static int field171;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "Lwj;")
    public static class135 field173;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "([III)V", line = 8)
    public final void method65(int[] arg0, int arg1, int arg2) {
        this.field169.method65(arg0, arg1, arg2);
        field165++;
        for (class190 var4 = (class190) this.field166.method334(-18673); var4 != null; var4 = (class190) this.field166.method335((byte) 61)) {
            if (!this.field152.method543((byte) -84, var4)) {
                int var5 = arg1;
                int var6 = arg2;
                do {
                    if (var6 <= var4.field3031) {
                        this.method76(var5, var4, var5 + var6, arg0, var6, (byte) -67);
                        var4.field3031 -= var6;
                        break;
                    }
                    this.method76(var5, var4, var5 + var6, arg0, var4.field3031, (byte) -67);
                    var5 += var4.field3031;
                    var6 -= var4.field3031;
                } while (!this.field152.method560(arg0, var5, (byte) -8, var4, var6));
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "e", descriptor = "(B)V", line = 48)
    public static void method66(byte arg0) {
        field164 = null;
        field173 = null;
        int var1 = -20 % ((5 - arg0) / 62);
        field170 = null;
        field156 = null;
        field159 = null;
        field174 = null;
        field162 = null;
        field172 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lmh;ZI)V", line = 65)
    public static final void method67(class62 arg0, boolean arg1, int arg2) {
        field171++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = var3 + 6;
        int var6 = class20.field195.method2027(arg0, 250);
        int var7 = class20.field195.method2032(arg0, 250) * 13;
        class311.method2117(var4 - var3, -var3 + var5, var3 + var6 + var3, var3 + var7 + var3, 0);
        class311.method2115(var4 - var3, var5 - var3, var3 + var6 + var3, var3 + var3 + var7, 16777215);
        if (arg2 != 10) {
            method73((byte) 76, 113);
        }
        class20.field195.method2023(arg0, var4, var5, var6, var7, 16777215, -1, 1, 1, 0);
        class267.method1840(var4 - var3, var3 + var7 + var3, var5 - var3, 0, var3 + var6 + var3);
        if (arg1) {
            class154.method1114();
        } else {
            class173.method1234(0, var4, var5, var6, var7);
        }
    }

    @OriginalMember(owner = "client!rh", name = "d", descriptor = "()Lwf;", line = 120)
    public final class18 method68() {
        field158++;
        class190 var1;
        do {
            var1 = (class190) this.field166.method335((byte) 71);
            if (var1 == null) {
                return null;
            }
        } while (var1.field3027 == null);
        return var1.field3027;
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(I)V", line = 141)
    public final void method69(int arg0) {
        field155++;
        this.field169.method69(arg0);
        for (class190 var2 = (class190) this.field166.method334(-18673); var2 != null; var2 = (class190) this.field166.method335((byte) 68)) {
            if (!this.field152.method543((byte) -96, var2)) {
                int var3 = arg0;
                do {
                    if (var2.field3031 >= var3) {
                        this.method75((byte) 60, var3, var2);
                        var2.field3031 -= var3;
                        break;
                    }
                    this.method75((byte) 60, var2.field3031, var2);
                    var3 -= var2.field3031;
                } while (!this.field152.method560((int[]) null, 0, (byte) -8, var2, var3));
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIIIZIII)Z", line = 176)
    public static final boolean method70(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field151++;
        for (int var12 = 0; var12 < 104; var12++) {
            for (int var13 = 0; var13 < 104; var13++) {
                class278.field4767[var12][var13] = 0;
                class159.field2566[var12][var13] = 99999999;
            }
        }
        class278.field4767[arg4][arg5] = 99;
        if (arg9 != -1) {
            method67((class62) null, false, -62);
        }
        class159.field2566[arg4][arg5] = 0;
        int var14 = arg4;
        int var15 = arg5;
        byte var16 = 0;
        class92.field1468[var16] = arg4;
        int var17 = 0;
        int var32 = var16 + 1;
        class182.field2900[var16] = arg5;
        int[][] var18 = class250.field4244[class7.field85].field3756;
        boolean var19 = false;
        while (var32 != var17) {
            var14 = class92.field1468[var17];
            var15 = class182.field2900[var17];
            var17 = var17 + 1 & 0xFFF;
            if (arg10 == var14 && arg6 == var15) {
                var19 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && class250.field4244[class7.field85].method1553(arg1 - 1, 2, (byte) -119, arg11, arg6, arg10, var15, var14)) {
                    var19 = true;
                    break;
                }
                if (arg1 < 10 && class250.field4244[class7.field85].method1556(arg6, 2, var14, arg1 - 1, arg11, arg10, var15, -1)) {
                    var19 = true;
                    break;
                }
            }
            if (arg0 != 0 && arg7 != 0 && class250.field4244[class7.field85].method1549(arg10, 2, arg7, 0, arg0, var14, arg3, var15, arg6)) {
                var19 = true;
                break;
            }
            int var20 = class159.field2566[var14][var15] + 1;
            if (var14 > 0 && class278.field4767[var14 - 1][var15] == 0 && (var18[var14 - 1][var15] & 0x12C010E) == 0 && (var18[var14 - 1][var15 + 1] & 0x12C0138) == 0) {
                class92.field1468[var32] = var14 - 1;
                class182.field2900[var32] = var15;
                var32 = var32 + 1 & 0xFFF;
                class278.field4767[var14 - 1][var15] = 2;
                class159.field2566[var14 - 1][var15] = var20;
            }
            if (var14 < 102 && class278.field4767[var14 + 1][var15] == 0 && (var18[var14 + 2][var15] & 0x12C0183) == 0 && (var18[var14 + 2][var15 + 1] & 0x12C01E0) == 0) {
                class92.field1468[var32] = var14 + 1;
                class182.field2900[var32] = var15;
                class278.field4767[var14 + 1][var15] = 8;
                class159.field2566[var14 + 1][var15] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var15 > 0 && class278.field4767[var14][var15 - 1] == 0 && (var18[var14][var15 - 1] & 0x12C010E) == 0 && (var18[var14 + 1][var15 - 1] & 0x12C0183) == 0) {
                class92.field1468[var32] = var14;
                class182.field2900[var32] = var15 - 1;
                class278.field4767[var14][var15 - 1] = 1;
                var32 = var32 + 1 & 0xFFF;
                class159.field2566[var14][var15 - 1] = var20;
            }
            if (var15 < 102 && class278.field4767[var14][var15 + 1] == 0 && (var18[var14][var15 + 2] & 0x12C0138) == 0 && (var18[var14 + 1][var15 + 2] & 0x12C01E0) == 0) {
                class92.field1468[var32] = var14;
                class182.field2900[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class278.field4767[var14][var15 + 1] = 4;
                class159.field2566[var14][var15 + 1] = var20;
            }
            if (var14 > 0 && var15 > 0 && class278.field4767[var14 - 1][var15 - 1] == 0 && (var18[var14 - 1][var15] & 0x12C0138) == 0 && (var18[var14 - 1][var15 - 1] & 0x12C010E) == 0 && (var18[var14][var15 - 1] & 0x12C0183) == 0) {
                class92.field1468[var32] = var14 - 1;
                class182.field2900[var32] = var15 - 1;
                class278.field4767[var14 - 1][var15 - 1] = 3;
                class159.field2566[var14 - 1][var15 - 1] = var20;
                var32 = var32 + 1 & 0xFFF;
            }
            if (var14 < 102 && var15 > 0 && class278.field4767[var14 + 1][var15 - 1] == 0 && (var18[var14 + 1][var15 - 1] & 0x12C010E) == 0 && (var18[var14 + 2][var15 - 1] & 0x12C0183) == 0 && (var18[var14 + 2][var15] & 0x12C01E0) == 0) {
                class92.field1468[var32] = var14 + 1;
                class182.field2900[var32] = var15 - 1;
                class278.field4767[var14 + 1][var15 - 1] = 9;
                var32 = var32 + 1 & 0xFFF;
                class159.field2566[var14 + 1][var15 - 1] = var20;
            }
            if (var14 > 0 && var15 < 102 && class278.field4767[var14 - 1][var15 + 1] == 0 && (var18[var14 - 1][var15 + 1] & 0x12C010E) == 0 && (var18[var14 - 1][var15 + 2] & 0x12C0138) == 0 && (var18[var14][var15 + 2] & 0x12C01E0) == 0) {
                class92.field1468[var32] = var14 - 1;
                class182.field2900[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class278.field4767[var14 - 1][var15 + 1] = 6;
                class159.field2566[var14 - 1][var15 + 1] = var20;
            }
            if (var14 < 102 && var15 < 102 && class278.field4767[var14 + 1][var15 + 1] == 0 && (var18[var14 + 1][var15 + 2] & 0x12C0138) == 0 && (var18[var14 + 2][var15 + 2] & 0x12C01E0) == 0 && (var18[var14 + 2][var15 + 1] & 0x12C0183) == 0) {
                class92.field1468[var32] = var14 + 1;
                class182.field2900[var32] = var15 + 1;
                var32 = var32 + 1 & 0xFFF;
                class278.field4767[var14 + 1][var15 + 1] = 12;
                class159.field2566[var14 + 1][var15 + 1] = var20;
            }
        }
        class69.field1059 = 0;
        if (!var19) {
            if (!arg8) {
                return false;
            }
            byte var21 = 10;
            int var22 = 100;
            int var23 = 1000;
            for (int var24 = arg10 - var21; var24 <= arg10 + var21; var24++) {
                for (int var25 = arg6 - var21; var25 <= (arg6 + var21); var25++) {
                    if (var24 >= 0 && var25 >= 0 && var24 < 104 && var25 < 104 && class159.field2566[var24][var25] < 100) {
                        int var26 = 0;
                        if (arg6 > var25) {
                            var26 = arg6 - var25;
                        } else if ((arg6 + arg7 - 1) < var25) {
                            var26 = var25 + 1 - arg7 - arg6;
                        }
                        int var27 = 0;
                        if (arg10 > var24) {
                            var27 = arg10 - var24;
                        } else if (var24 > (arg10 + arg0 - 1)) {
                            var27 = var24 + 1 - arg0 - arg10;
                        }
                        int var28 = var26 * var26 + var27 * var27;
                        if (var28 < var23 || var23 == var28 && var22 > class159.field2566[var24][var25]) {
                            var23 = var28;
                            var22 = class159.field2566[var24][var25];
                            var15 = var25;
                            var14 = var24;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg4 == var14 && arg5 == var15) {
                return false;
            }
            class69.field1059 = 1;
        }
        byte var29 = 0;
        class92.field1468[var29] = var14;
        int var33 = var29 + 1;
        class182.field2900[var29] = var15;
        int var30;
        int var31 = var30 = class278.field4767[var14][var15];
        while (arg4 != var14 || arg5 != var15) {
            if (var30 != var31) {
                var30 = var31;
                class92.field1468[var33] = var14;
                class182.field2900[var33++] = var15;
            }
            if ((var31 & 0x2) != 0) {
                var14++;
            } else if ((var31 & 0x8) != 0) {
                var14--;
            }
            if ((var31 & 0x1) != 0) {
                var15++;
            } else if ((var31 & 0x4) != 0) {
                var15--;
            }
            var31 = class278.field4767[var14][var15];
        }
        if (var33 > 0) {
            class304.method2082(arg2, (byte) -104, var33);
            return true;
        } else if (arg2 == 1) {
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "()I", line = 569)
    public final int method71() {
        field157++;
        return 0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BLhi;)V", line = 580)
    public static final void method72(byte arg0, class26 arg1) {
        class52.field739 = arg1.method153((byte) 110, class71.field1087);
        class304.field5232 = arg1.method153((byte) 110, class212.field3562);
        field161++;
        class156.field2508 = arg1.method153((byte) 110, class29.field404);
        class85.field1383 = arg1.method153((byte) 110, class111.field1824);
        class50.field728 = arg1.method153((byte) 110, class149.field2359);
        class53.field770 = arg1.method153((byte) 110, class269.field4568);
        class262.field4396 = arg1.method153((byte) 110, class196.field3325);
        class260.field4376 = arg1.method153((byte) 110, class240.field4098);
        class244.field4145 = arg1.method153((byte) 110, class291.field4938);
        class187.field2983 = arg1.method153((byte) 110, class309.field5302);
        class42.field644 = arg1.method153((byte) 110, class116.field1938);
        int var2 = -25 % ((arg0 - 8) / 38);
        class155.field2497 = arg1.method153((byte) 110, class170.field2775);
        class27.field333 = arg1.method153((byte) 110, class26.field320);
        class2.field28 = arg1.method153((byte) 110, class7.field70);
        class174.field2803 = arg1.method153((byte) 110, class171.field2779);
        class281.field4799 = arg1.method153((byte) 110, class184.field2956);
        class193.field3245 = arg1.method153((byte) 110, class291.field4940);
        class92.field1504 = arg1.method153((byte) 110, class121.field2019);
        class267.field4506 = arg1.method153((byte) 110, class293.field4991);
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BI)I", line = 614)
    public static final int method73(byte arg0, int arg1) {
        if (arg0 < 25) {
            method67((class62) null, true, -127);
        }
        field167++;
        return arg1 & 0xFF;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "()Lwf;", line = 627)
    public final class18 method74() {
        field154++;
        class190 var1 = (class190) this.field166.method334(-18673);
        if (var1 == null) {
            return null;
        } else if (var1.field3027 == null) {
            return this.method68();
        } else {
            return var1.field3027;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "(Lfg;)V", line = 778)
    public class17(class74 arg0) {
        this.field152 = arg0;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(BILpd;)V", line = 663)
    private final void method75(byte arg0, int arg1, class190 arg2) {
        if ((this.field152.field1147[arg2.field3015] & 0x4) != 0 && arg2.field3039 < 0) {
            int var4 = this.field152.field1140[arg2.field3015] / class151.field2393;
            int var5 = (var4 + 1048575 - arg2.field3041) / var4;
            arg2.field3041 = arg1 * var4 + arg2.field3041 & 0xFFFFF;
            if (var5 <= arg1) {
                if (this.field152.field1191[arg2.field3015] == 0) {
                    arg2.field3027 = class132.method988(arg2.field3044, arg2.field3027.method997(), arg2.field3027.method975(), arg2.field3027.method991());
                } else {
                    arg2.field3027 = class132.method988(arg2.field3044, arg2.field3027.method997(), 0, arg2.field3027.method991());
                    this.field152.method529(arg2, -16257, ~arg2.field3016.field1775[arg2.field3019] > -1);
                }
                if (arg2.field3016.field1775[arg2.field3019] < 0) {
                    arg2.field3027.method1005(-1);
                }
                arg1 = arg2.field3041 / var4;
            }
        }
        arg2.field3027.method69(arg1);
        field168++;
        if (arg0 != 60) {
            field159 = (class62) null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(ILpd;I[IIB)V", line = 714)
    private final void method76(int arg0, class190 arg1, int arg2, int[] arg3, int arg4, byte arg5) {
        field163++;
        if ((this.field152.field1147[arg1.field3015] & 0x4) != 0 && arg1.field3039 < 0) {
            int var7 = this.field152.field1140[arg1.field3015] / class151.field2393;
            while (true) {
                int var8 = (var7 + 1048575 - arg1.field3041) / var7;
                if (var8 > arg4) {
                    arg1.field3041 += arg4 * var7;
                    break;
                }
                arg1.field3027.method65(arg3, arg0, var8);
                int var9 = class151.field2393 / 100;
                arg0 += var8;
                arg1.field3041 += var7 * var8 - 1048576;
                int var10 = 262144 / var7;
                arg4 -= var8;
                class132 var11 = arg1.field3027;
                if (var10 < var9) {
                    var9 = var10;
                }
                if (this.field152.field1191[arg1.field3015] == 0) {
                    arg1.field3027 = class132.method988(arg1.field3044, var11.method997(), var11.method975(), var11.method991());
                } else {
                    arg1.field3027 = class132.method988(arg1.field3044, var11.method997(), 0, var11.method991());
                    this.field152.method529(arg1, -16257, ~arg1.field3016.field1775[arg1.field3019] > -1);
                    arg1.field3027.method980(var9, var11.method975());
                }
                if (arg1.field3016.field1775[arg1.field3019] < 0) {
                    arg1.field3027.method1005(-1);
                }
                var11.method1001(var9);
                var11.method65(arg3, arg0, arg2 - arg0);
                if (var11.method969()) {
                    this.field169.method128(var11);
                }
            }
        }
        arg1.field3027.method65(arg3, arg0, arg4);
        if (arg5 != -67) {
            field172 = (int[]) null;
        }
    }
}
