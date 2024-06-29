import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class202 {

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "Lqe;")
    public static class179 field3737 = class206.method1380("da dieser Computer gegen unsere ", (byte) -128);

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field3741 = 0;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    public static int field3742 = 0;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field3739 = 0;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "Lsg;")
    public static class201 field3744 = new class201(30);

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field3735;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field3736;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "I")
    public static int field3738;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "I")
    public static int field3746;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Leh;")
    public static class52 field3740;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "[Lfc;")
    public static class58[] field3748;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IIII)I")
    public static final int method1341(int arg0, int arg1, int arg2, int arg3) {
        field3735++;
        int var4 = arg1 >> 7;
        int var5 = arg3 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > 103 || var5 > 103) {
            return 0;
        }
        int var6 = arg2;
        int var7 = arg1 & 0x7F;
        if (arg2 < 3 && (class9.field265[1][var4][var5] & 0x2) == 2) {
            var6 = arg2 + 1;
        }
        int var8 = -34 % ((arg0 - 18) / 50);
        int var9 = arg3 & 0x7F;
        int var10 = (128 - var7) * class194.field3619[var6][var4][var5] + class194.field3619[var6][var4 + 1][var5] * var7 >> 7;
        int var11 = (128 - var7) * class194.field3619[var6][var4][var5 + 1] + class194.field3619[var6][var4 + 1][var5 + 1] * var7 >> 7;
        return (128 - var9) * var10 + var9 * var11 >> 7;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IBIIII)V")
    public static final void method1342(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        field3747++;
        if (class2.field35 == arg2 && class116.field2191 == arg3 && (class182.field3364 == arg4 || !class180.field3307)) {
            return;
        }
        class182.field3364 = arg4;
        if (arg1 != 124) {
            return;
        }
        class116.field2191 = arg3;
        if (!class180.field3307) {
            class182.field3364 = 0;
        }
        class2.field35 = arg2;
        class223.method1449((byte) 106, 25);
        class163.method1045(4, true, class32.field683);
        int var6 = class2.field26;
        int var7 = class141.field2582;
        class141.field2582 = arg3 * 8 - 48;
        int var8 = class141.field2582 - var7;
        class2.field26 = (arg2 - 6) * 8;
        int var9 = class2.field26 - var6;
        int var10 = class141.field2582;
        int var11 = class2.field26;
        for (int var12 = 0; var12 < 32768; var12++) {
            class188 var28 = class53.field1152[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field3200[var29] -= var9;
                    var28.field3160[var29] -= var8;
                }
                var28.field3198 -= var8 * 128;
                var28.field3159 -= var9 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class115 var26 = class23.field554[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field3200[var27] -= var9;
                    var26.field3160[var27] -= var8;
                }
                var26.field3198 -= var8 * 128;
                var26.field3159 -= var9 * 128;
            }
        }
        class49.field1038 = arg4;
        class61.field1298.method1108(arg0, false, arg5, arg1 + 20702);
        byte var14 = 104;
        byte var15 = 0;
        byte var16 = 1;
        byte var17 = 0;
        byte var18 = 1;
        byte var19 = 104;
        if (var9 < 0) {
            var15 = 103;
            var16 = -1;
            var14 = -1;
        }
        if (var8 < 0) {
            var18 = -1;
            var17 = 103;
            var19 = -1;
        }
        for (int var20 = var15; var20 != var14; var20 += var16) {
            for (int var22 = var17; var22 != var19; var22 += var18) {
                int var23 = var9 + var20;
                int var24 = var22 + var8;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var23 >= 0 && var24 >= 0 && var23 < 104 && var24 < 104) {
                        class108.field2021[var25][var20][var22] = class108.field2021[var25][var23][var24];
                    } else {
                        class108.field2021[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class112 var21 = (class112) class58.field1253.method242(16711680); var21 != null; var21 = (class112) class58.field1253.method237(10)) {
            var21.field2102 -= var8;
            var21.field2104 -= var9;
            if (var21.field2104 < 0 || var21.field2102 < 0 || var21.field2104 >= 104 || var21.field2102 >= 104) {
                var21.method592((byte) -128);
            }
        }
        class227.field4205 = -1;
        class112.field2108 = false;
        class220.field4072 = 0;
        if (class139.field2567 != 0) {
            class139.field2567 -= var9;
            class199.field3704 -= var8;
        }
        class78.field1509.method236((byte) 68);
        class94.field1767.method236((byte) 101);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V")
    public static final void method1343(int arg0, int arg1, int arg2) {
        field3746++;
        int var3 = -125 / ((arg1 - 50) / 40);
        int var4 = 1;
        int[] var5 = new int[4];
        int[] var6 = new int[4];
        var5[0] = arg0;
        var6[0] = arg2;
        for (int var7 = 0; var7 < 4; var7++) {
            if (class227.field4204[var7] != arg0) {
                var5[var4] = class227.field4204[var7];
                var6[var4] = class171.field3071[var7];
                var4++;
            }
        }
        class227.field4204 = var5;
        class171.field3071 = var6;
        class114.method733(class13.field326.length - 1, -111, class13.field326, 0);
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(BIIIIIII)V")
    public static final void method1344(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3745++;
        int var8 = arg2 + arg3;
        int var9 = arg6 - arg3;
        int var10 = arg3 + arg7;
        int var11 = arg1 - arg3;
        for (int var12 = arg2; var12 < var8; var12++) {
            class23.method161(arg1, -1, arg5, arg7, class14.field331[var12]);
        }
        for (int var13 = arg6; var13 > var9; var13--) {
            class23.method161(arg1, -1, arg5, arg7, class14.field331[var13]);
        }
        if (arg0 != -127) {
            field3740 = null;
        }
        for (int var14 = var8; var14 <= var9; var14++) {
            int[] var15 = class14.field331[var14];
            class23.method161(var10, arg0 + 126, arg5, arg7, var15);
            class23.method161(var11, -1, arg4, var10, var15);
            class23.method161(arg1, -1, arg5, var11, var15);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V")
    public static void method1345(byte arg0) {
        field3744 = null;
        if (arg0 > 21) {
            field3740 = null;
            field3737 = null;
            field3748 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(II)Z")
    public static final boolean method1346(int arg0, int arg1) {
        field3738++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class23.field552[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg1 != 104) {
            field3741 = 85;
        }
        return var2 == 1003;
    }
}
