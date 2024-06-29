import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ud")
public class class121 extends class5 {

    @OriginalMember(owner = "client!ud", name = "nb", descriptor = "[Llb;")
    public class68[] field2968;

    @OriginalMember(owner = "client!ud", name = "ab", descriptor = "I")
    public static int field2955 = -1;

    @OriginalMember(owner = "client!ud", name = "V", descriptor = "I")
    public static int field2950 = 10;

    @OriginalMember(owner = "client!ud", name = "gb", descriptor = "[[I")
    public static int[][] field2961 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };

    @OriginalMember(owner = "client!ud", name = "X", descriptor = "Lhb;")
    private static class44 field2952 = class102.method810("Loaded update list", -28606);

    @OriginalMember(owner = "client!ud", name = "fb", descriptor = "I")
    public static int field2960 = 0;

    @OriginalMember(owner = "client!ud", name = "U", descriptor = "I")
    public static int field2949 = 0;

    @OriginalMember(owner = "client!ud", name = "bb", descriptor = "Lhb;")
    public static class44 field2956 = class102.method810("nicht hergestellt werden)3", -28606);

    @OriginalMember(owner = "client!ud", name = "ob", descriptor = "Lhb;")
    public static class44 field2969 = class102.method810("-5berpr-Ufen Sie Ihr Mitteilungsfach)3", -28606);

    @OriginalMember(owner = "client!ud", name = "mb", descriptor = "Lhb;")
    public static class44 field2967 = class102.method810("invback", -28606);

    @OriginalMember(owner = "client!ud", name = "lb", descriptor = "Lhb;")
    private static class44 field2966 = class102.method810("Loaded wordpack", -28606);

    @OriginalMember(owner = "client!ud", name = "hb", descriptor = "Lhb;")
    private static class44 field2962 = class102.method810("New User", -28606);

    @OriginalMember(owner = "client!ud", name = "W", descriptor = "Lhb;")
    public static class44 field2951 = field2962;

    @OriginalMember(owner = "client!ud", name = "jb", descriptor = "Lhb;")
    public static class44 field2964 = class102.method810("(U3", -28606);

    @OriginalMember(owner = "client!ud", name = "qb", descriptor = "Lhb;")
    public static class44 field2971 = field2966;

    @OriginalMember(owner = "client!ud", name = "eb", descriptor = "Lhb;")
    public static class44 field2959 = class102.method810("und loggen sich dann erneut ein)3", -28606);

    @OriginalMember(owner = "client!ud", name = "rb", descriptor = "Lhb;")
    public static class44 field2972 = field2952;

    @OriginalMember(owner = "client!ud", name = "T", descriptor = "I")
    public static int field2948;

    @OriginalMember(owner = "client!ud", name = "Y", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!ud", name = "db", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!ud", name = "ib", descriptor = "I")
    public static int field2963;

    @OriginalMember(owner = "client!ud", name = "kb", descriptor = "I")
    public static int field2965;

    @OriginalMember(owner = "client!ud", name = "pb", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!ud", name = "cb", descriptor = "Ltd;")
    public static class116 field2957;

    @OriginalMember(owner = "client!ud", name = "Z", descriptor = "Lpc;")
    public static class93 field2954;

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method930(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (!class81.field2085) {
            arg2 = 0;
        }
        field2958++;
        if (class16.field311 == arg1 && class128.field3067 == arg4 && class16.field316 == arg2) {
            return;
        }
        class16.field311 = arg1;
        class128.field3067 = arg4;
        class16.field316 = arg2;
        class131.method1009(25, arg0 ^ 0xFFFFFF8B);
        class40.method349(class36.field857, (byte) 95, false, null);
        int var6 = class104.field2666;
        class104.field2666 = (arg1 - 6) * 8;
        int var7 = class104.field2666 - var6;
        int var8 = class120.field2936;
        int var9 = class104.field2666;
        class120.field2936 = arg4 * 8 - 48;
        int var10 = class120.field2936 - var8;
        int var11 = class120.field2936;
        for (int var12 = 0; var12 < 32768; var12++) {
            class46 var28 = class116.field2845[var12];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field1355[var29] -= var7;
                    var28.field1350[var29] -= var10;
                }
                var28.field1384 -= var7 * 128;
                var28.field1371 -= var10 * 128;
            }
        }
        for (int var13 = 0; var13 < 2048; var13++) {
            class103 var26 = class82.field2110[var13];
            if (var26 != null) {
                for (int var27 = 0; var27 < 10; var27++) {
                    var26.field1355[var27] -= var7;
                    var26.field1350[var27] -= var10;
                }
                var26.field1384 -= var7 * 128;
                var26.field1371 -= var10 * 128;
            }
        }
        class79.field1993 = arg2;
        class72.field1820.method509(8613, false, arg3, arg5);
        byte var14 = 0;
        byte var15 = 104;
        byte var16 = 1;
        byte var17 = 0;
        if (var7 < 0) {
            var14 = 103;
            var15 = -1;
            var16 = -1;
        }
        byte var18 = 104;
        byte var19 = 1;
        if (arg0 > var10) {
            var17 = 103;
            var19 = -1;
            var18 = -1;
        }
        for (int var20 = var14; var20 != var15; var20 += var16) {
            for (int var22 = var17; var22 != var18; var22 += var19) {
                int var23 = var10 + var22;
                int var24 = var7 + var20;
                for (int var25 = 0; var25 < 4; var25++) {
                    if (var24 >= 0 && var23 >= 0 && var24 < 104 && var23 < 104) {
                        class82.field2115[var25][var20][var22] = class82.field2115[var25][var24][var23];
                    } else {
                        class82.field2115[var25][var20][var22] = null;
                    }
                }
            }
        }
        for (class125 var21 = (class125) class96.field2437.method443((byte) -111); var21 != null; var21 = (class125) class96.field2437.method434(true)) {
            var21.field3017 -= var10;
            var21.field3038 -= var7;
            if (var21.field3038 < 0 || var21.field3017 < 0 || var21.field3038 >= 104 || var21.field3017 >= 104) {
                var21.method948(89);
            }
        }
        class42.field977 = 0;
        class102.field2603 = -1;
        class33.field802 = false;
        if (class90.field2301 != 0) {
            class116.field2838 -= var10;
            class90.field2301 -= var7;
        }
        class22.field481.method450((byte) 111);
        class44.field1123.method450((byte) 111);
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(II)Z", line = 205)
    public final boolean method931(int arg0, int arg1) {
        field2970++;
        if (arg0 != 8741) {
            method935(122);
        }
        return this.field2968[arg1].field1702;
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 226)
    public static final void method932(Component arg0, int arg1) {
        if (arg1 != 2983) {
            field2967 = null;
        }
        field2965++;
        arg0.addMouseListener(class57.field1506);
        arg0.addMouseMotionListener(class57.field1506);
    }

    @OriginalMember(owner = "client!ud", name = "g", descriptor = "(I)V", line = 252)
    public static void method933(int arg0) {
        field2959 = null;
        field2952 = null;
        field2951 = null;
        field2961 = null;
        field2969 = null;
        field2957 = null;
        if (arg0 != 12) {
            field2969 = null;
        }
        field2954 = null;
        field2967 = null;
        field2966 = null;
        field2962 = null;
        field2956 = null;
        field2972 = null;
        field2971 = null;
        field2964 = null;
    }

    @OriginalMember(owner = "client!ud", name = "<init>", descriptor = "(Ltd;Ltd;IZ)V", line = 289)
    public class121(class116 arg0, class116 arg1, int arg2, boolean arg3) {
        class47 var5 = new class47();
        int var6 = arg0.method886(0, arg2);
        this.field2968 = new class68[var6];
        int[] var7 = arg0.method874(-413, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method892(arg2, var7[var8], false);
            class4 var10 = null;
            int var11 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            for (class4 var12 = (class4) var5.method443((byte) -111); var12 != null; var12 = (class4) var5.method434(true)) {
                if (var12.field88 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method879(var11, false, 0);
                } else {
                    var13 = arg1.method879(0, false, var11);
                }
                var10 = new class4(var11, var13);
                var5.method448(var10, true);
            }
            this.field2968[var7[var8]] = new class68(var9, var10);
        }
    }

    @OriginalMember(owner = "client!ud", name = "a", descriptor = "(Lja;I)V", line = 347)
    public static final void method934(class55 arg0, int arg1) {
        arg0.field1339 = false;
        if (arg0.field1361 != -1) {
            class118 var2 = client.method139(arg1 ^ 0xFA1F, arg0.field1361);
            arg0.field1398++;
            if (var2.field2883.length > arg0.field1334 && var2.field2885[arg0.field1334] < arg0.field1398) {
                arg0.field1334++;
                arg0.field1398 = 1;
            }
            if (var2.field2883.length <= arg0.field1334) {
                arg0.field1398 = 0;
                arg0.field1334 = 0;
            }
        }
        field2953++;
        if (arg0.field1353 != -1 && class2.field73 >= arg0.field1362) {
            if (arg0.field1377 < 0) {
                arg0.field1377 = 0;
            }
            int var3 = class98.method773(-107, arg0.field1353).field2672;
            if (var3 == -1) {
                arg0.field1353 = -1;
            } else {
                class118 var4 = client.method139(1, var3);
                arg0.field1360++;
                if (var4.field2883.length > arg0.field1377 && arg0.field1360 > var4.field2885[arg0.field1377]) {
                    arg0.field1360 = 1;
                    arg0.field1377++;
                }
                if (arg0.field1377 >= var4.field2883.length && (arg0.field1377 < 0 || arg0.field1377 >= var4.field2883.length)) {
                    arg0.field1353 = -1;
                }
            }
        }
        if (arg0.field1415 != -1 && arg0.field1359 <= 1) {
            class118 var5 = client.method139(1, arg0.field1415);
            if (var5.field2894 == 1 && arg0.field1402 > 0 && class2.field73 >= arg0.field1409 && class2.field73 > arg0.field1374) {
                arg0.field1359 = 1;
                return;
            }
        }
        if (arg0.field1415 != -1 && arg0.field1359 == 0) {
            class118 var6 = client.method139(1, arg0.field1415);
            arg0.field1410++;
            if (arg0.field1369 < var6.field2883.length && arg0.field1410 > var6.field2885[arg0.field1369]) {
                arg0.field1410 = 1;
                arg0.field1369++;
            }
            if (arg0.field1369 >= var6.field2883.length) {
                arg0.field1393++;
                if (arg0.field1393 >= var6.field2884) {
                    arg0.field1415 = -1;
                }
                arg0.field1369 -= var6.field2881;
                if (arg0.field1369 < 0 || arg0.field1369 >= var6.field2883.length) {
                    arg0.field1415 = -1;
                }
            }
            arg0.field1339 = var6.field2888;
        }
        if (arg1 == 64030 && arg0.field1359 > 0) {
            arg0.field1359--;
        }
    }

    @OriginalMember(owner = "client!ud", name = "h", descriptor = "(I)V", line = 467)
    public static final void method935(int arg0) {
        if (arg0 < 65) {
            return;
        }
        field2963++;
        class9.field192 = 0;
        int var1 = (class72.field1820.field1384 >> 7) + class104.field2666;
        int var2 = (class72.field1820.field1371 >> 7) + class120.field2936;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class9.field192 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class9.field192 = 1;
        }
        if (class9.field192 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class9.field192 = 0;
        }
    }
}
