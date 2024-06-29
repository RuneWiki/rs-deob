import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class1 {

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "[I")
    private int[] field5;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "[I")
    private int[] field4;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "Lga;")
    private class154 field6;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lga;")
    private class154 field8;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "[Lga;")
    private class154[] field14;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "Leg;")
    public static class37 field15 = class174.method1167("Liste des serveurs charg-Be", 111);

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "Leg;")
    private static class37 field18 = class174.method1167("Opened title screen", 59);

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "Leg;")
    public static class37 field10 = field18;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "I")
    public static int field11;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!dc", name = "s", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!dc", name = "t", descriptor = "I")
    public static int field20;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field7;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Leh;")
    public static class136 field16;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIII)V")
    public static final void method1(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 <= arg1) {
            for (int var5 = arg2; var5 < arg1; var5++) {
                class210.field3617[var5][arg3] = arg0;
            }
        } else {
            for (int var6 = arg1; var6 < arg2; var6++) {
                class210.field3617[var6][arg3] = arg0;
            }
        }
        if (arg4 <= 101) {
            method7((byte) -37);
        }
        field19++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IB)Loi;")
    public static final class30 method2(int arg0, byte arg1) {
        class30 var2 = (class30) class26.field367.method344((byte) 14, (long) arg0);
        field17++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class247.field4433.method666(arg0, 1, (byte) -51);
        } else {
            var3 = class225.field3865.method666(arg0 & 0x7FFF, 1, (byte) -51);
        }
        class30 var4 = new class30();
        int var5 = -7 % ((-arg1 - 23) / 57);
        if (var3 != null) {
            var4.method174(new class187(var3), false);
        }
        if (arg0 >= 32768) {
            var4.method170(false);
        }
        class26.field367.method341((byte) 16, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field9++;
        if (arg6 < 128 || arg3 < 128 || arg6 > 13056 || arg3 > 13056) {
            class189.field3257 = -1;
            class203.field3460 = -1;
            return;
        }
        int var8 = class262.method1768(class237.field4140, arg6, arg3, (byte) -104) - arg2;
        int var9 = var8 - class137.field2338;
        int var10 = arg3 - class200.field3403;
        int var11 = class76.field1192[class159.field2655];
        int var12 = arg6 - class213.field3683;
        int var13 = class76.field1189[class159.field2655];
        int var14 = class76.field1192[class117.field1990];
        int var15 = class76.field1189[class117.field1990];
        int var16 = var10 * var14 + (var12 * var15) >> 16;
        int var17 = var10 * var15 - var12 * var14 >> 16;
        if (arg5 != -22971) {
            field3 = -16;
        }
        int var19 = var9 * var13 - (var11 * var17) >> 16;
        int var20 = var9 * var11 + var13 * var17 >> 16;
        if (var20 < 50) {
            class189.field3257 = -1;
            class203.field3460 = -1;
        } else {
            class189.field3257 = (var19 << 9) / var20 + arg7;
            class203.field3460 = arg0 + ((var16 << 9) / var20);
        }
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lad;ILjl;)Z")
    public final boolean method4(class161 arg0, int arg1, class101 arg2) {
        field7++;
        if (class224.field3844 <= 0) {
            for (int var4 = 0; var4 < this.field4.length; var4++) {
                if (!arg2.method658(this.field4[var4], (byte) 44)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field4.length; var5++) {
                if (!arg2.method667(this.field4[var5], class224.field3844, (byte) -104)) {
                    return false;
                }
            }
        }
        if (arg1 != 23241) {
            field1 = 64;
        }
        for (int var6 = 0; var6 < this.field5.length; var6++) {
            if (!arg0.method718(255, this.field5[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lad;ZIZIIDLjl;)[I")
    public final int[] method5(class161 arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, double arg6, class101 arg7) {
        field13++;
        class26.method150(arg5 - 257, arg6);
        class239.field4259 = arg7;
        client.field1893 = arg0;
        class66.method462(arg2, (byte) -123, arg4);
        for (int var10 = 0; var10 < this.field14.length; var10++) {
            this.field14[var10].method1056(arg2, -14687, arg4);
        }
        int[] var11 = new int[arg2 * arg4];
        byte var12;
        int var13;
        int var14;
        if (arg3) {
            var12 = -1;
            var13 = -1;
            var14 = arg2 - 1;
        } else {
            var12 = 1;
            var13 = arg2;
            var14 = 0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg4; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field6.field2579) {
                int[] var18 = this.field6.method143(var16, 1075962732);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field6.method193((byte) 115, var16);
                var19 = var22[1];
                var20 = var22[0];
                var21 = var22[2];
            }
            for (int var23 = var14; var23 != var13; var23 += var12) {
                int var24 = var20[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                int var25 = var19[var23] >> 4;
                int var26 = var21[var23] >> 4;
                if (var24 < 0) {
                    var24 = 0;
                }
                int var27 = class96.field1499[var24];
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class96.field1499[var26];
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var29 = class96.field1499[var25];
                var11[var15++] = (var27 << 16) + var28 + (var29 << 8);
                if (arg1) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var17 = arg5; var17 < this.field14.length; var17++) {
            this.field14[var17].method539(54);
        }
        return var11;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lva;I)V")
    public static final void method6(class187 arg0, int arg1) {
        field20++;
        if ((arg0.field3175.length - arg0.field3169) < 1) {
            return;
        }
        int var2 = arg0.method1268(255);
        if (var2 < 0 || var2 > 8) {
            return;
        }
        byte var3;
        if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if ((arg0.field3175.length - arg0.field3169) < var3) {
            return;
        }
        class68.field1088 = arg0.method1268(255);
        if (class68.field1088 < 1) {
            class68.field1088 = 1;
        } else if (class68.field1088 > 4) {
            class68.field1088 = 4;
        }
        class226.method1575(arg1 ^ 0xFFFFFF92, arg0.method1268(255) == 1);
        class198.field3366 = arg0.method1268(255) == 1;
        class271.field4754 = arg0.method1268(255) == 1;
        class31.field461 = arg0.method1268(255) == 1;
        client.field1895 = arg0.method1268(255) == 1;
        class124.field2083 = arg0.method1268(255) == 1;
        class40.field646 = arg0.method1268(arg1 ^ 0xFD) == 1;
        class232.field4013 = arg0.method1268(255) == 1;
        class23.field300 = arg0.method1268(255);
        if (class23.field300 > 2) {
            class23.field300 = 2;
        }
        if (arg1 > var2) {
            class120.field2034 = arg0.method1268(255) == 1;
            arg0.method1268(arg1 + 253);
        } else {
            class120.field2034 = arg0.method1268(arg1 ^ 0xFD) == 1;
        }
        class36.field517 = arg0.method1268(255) == 1;
        class78.field1217 = arg0.method1268(arg1 ^ 0xFD) == 1;
        class24.field315 = arg0.method1268(255);
        if (class24.field315 > 2) {
            class24.field315 = 2;
        }
        class74.field1162 = class24.field315;
        class144.field2467 = arg0.method1268(255) == 1;
        class156.field2602 = arg0.method1268(255);
        if (class156.field2602 > 127) {
            class156.field2602 = 127;
        }
        class252.field4507 = arg0.method1268(255);
        class151.field2544 = arg0.method1268(255);
        if (class151.field2544 > 127) {
            class151.field2544 = 127;
        }
        if (var2 >= 1) {
            class35.field492 = arg0.method1244(false);
            class116.field1983 = arg0.method1244(false);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method1268(255);
        }
        if (var2 >= 4) {
            class193.method1328(arg0.method1268(255));
        }
        if (var2 >= 5) {
            class240.field4265 = arg0.method1290((byte) 90);
        }
        if (var2 >= 6) {
            class121.field2037 = arg0.method1268(255);
        }
        if (var2 >= 7) {
            class285.field5024 = arg0.method1268(255) == 1;
        }
        if (var2 >= 8) {
            class202.field3458 = arg0.method1268(255) == 1;
        }
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "()V")
    public class1() {
        this.field5 = new int[0];
        this.field4 = new int[0];
        this.field6 = new class49();
        this.field6.field2589 = 1;
        this.field8 = new class49();
        this.field14 = new class154[] { this.field6, this.field8 };
        this.field8.field2589 = 1;
    }

    @OriginalMember(owner = "client!dc", name = "<init>", descriptor = "(Lva;)V")
    public class1(class187 arg0) {
        int var2 = arg0.method1268(255);
        this.field14 = new class154[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class154 var16 = class249.method1715(104, arg0);
            if (var16.method543((byte) -117) >= 0) {
                var4++;
            }
            if (var16.method1058((byte) 121) >= 0) {
                var3++;
            }
            int var17 = var16.field2575.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1268(255);
            }
            this.field14[var6] = var16;
        }
        this.field5 = new int[var3];
        this.field4 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class154 var11 = this.field14[var9];
            int var12 = var11.field2575.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field2575[var13] = this.field14[var5[var9][var13]];
            }
            int var14 = var11.method543((byte) -68);
            int var15 = var11.method1058((byte) 121);
            if (var14 > 0) {
                this.field4[var8++] = var14;
            }
            if (var15 > 0) {
                this.field5[var7++] = var15;
            }
            var5[var9] = null;
        }
        Object var10 = null;
        this.field6 = this.field14[arg0.method1268(255)];
        this.field8 = this.field14[arg0.method1268(255)];
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(B)V")
    public static void method7(byte arg0) {
        int var1 = 78 % ((arg0 + 50) / 37);
        field16 = null;
        field15 = null;
        field10 = null;
        field18 = null;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Z)V")
    public static final void method8(boolean arg0) {
        field2++;
        for (class89 var1 = (class89) class127.field2130.method1566(-3); var1 != null; var1 = (class89) class127.field2130.method1570(3)) {
            if (var1.field1406) {
                var1.method588((byte) -126);
            }
        }
        if (arg0) {
            method1(75, 95, 103, 122, -122);
        }
        for (class89 var2 = (class89) class175.field2928.method1566(-3); var2 != null; var2 = (class89) class175.field2928.method1570(3)) {
            if (var2.field1406) {
                var2.method588((byte) -99);
            }
        }
    }
}
