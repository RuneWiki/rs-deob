import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class50 extends class66 {

    @OriginalMember(owner = "client!cg", name = "E", descriptor = "B")
    public byte field1028;

    @OriginalMember(owner = "client!cg", name = "F", descriptor = "I")
    public int field1029;

    @OriginalMember(owner = "client!cg", name = "H", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!cg", name = "J", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!cg", name = "K", descriptor = "I")
    public static int field1034;

    @OriginalMember(owner = "client!cg", name = "L", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!cg", name = "M", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!cg", name = "N", descriptor = "I")
    public static int field1037;

    @OriginalMember(owner = "client!cg", name = "G", descriptor = "Loe;")
    public class146 field1030;

    @OriginalMember(owner = "client!cg", name = "I", descriptor = "[I")
    public static int[] field1032;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "(I)[B", line = 13)
    public final byte[] method442(int arg0) {
        field1034++;
        if (arg0 < 99) {
            return (byte[]) null;
        } else if (this.field1243 || this.field1030.field2435 < this.field1030.field2496.length - this.field1028) {
            throw new RuntimeException();
        } else {
            return this.field1030.field2496;
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Lcj;II)V", line = 36)
    public static final void method443(class351 arg0, int arg1, int arg2) {
        class321.field5215 = 0;
        field1037++;
        int var3 = 0;
        int var4 = 0;
        int var5 = -1;
        int[] var6 = arg0.field5613;
        if (arg1 != 256) {
            return;
        }
        int[] var7 = arg0.field5612;
        byte var8 = -1;
        try {
            int var9 = 0;
            label4593: while (true) {
                var9++;
                if (var9 > arg2) {
                    throw new RuntimeException("slow");
                }
                var5++;
                int var549 = var6[var5];
                if (var549 < 100) {
                    if (var549 == 0) {
                        class198.field3308[var4++] = var7[var5];
                        continue;
                    }
                    if (var549 == 1) {
                        int var10 = var7[var5];
                        class198.field3308[var4++] = class334.field5322[var10];
                        continue;
                    }
                    if (var549 == 2) {
                        int var11 = var7[var5];
                        var4--;
                        class244.method1730(var11, (byte) -126, class198.field3308[var4]);
                        continue;
                    }
                    if (var549 == 3) {
                        class167.field2790[var3++] = arg0.field5601[var5];
                        continue;
                    }
                    if (var549 == 6) {
                        var5 += var7[var5];
                        continue;
                    }
                    if (var549 == 7) {
                        var4 -= 2;
                        if (class198.field3308[var4 + 1] != class198.field3308[var4]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var549 == 8) {
                        var4 -= 2;
                        if (class198.field3308[var4 + 1] == class198.field3308[var4]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var549 == 9) {
                        var4 -= 2;
                        if (class198.field3308[var4] < class198.field3308[var4 + 1]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var549 == 10) {
                        var4 -= 2;
                        if (class198.field3308[var4] > class198.field3308[var4 + 1]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var549 == 21) {
                        if (class321.field5215 == 0) {
                            return;
                        }
                        class122 var12 = class88.field1539[--class321.field5215];
                        class284.field4632 = var12.field2153;
                        var5 = var12.field2160;
                        arg0 = var12.field2159;
                        var6 = arg0.field5613;
                        class341.field5403 = var12.field2154;
                        var7 = arg0.field5612;
                        continue;
                    }
                    if (var549 == 25) {
                        int var13 = var7[var5];
                        class198.field3308[var4++] = class252.method1779(-6741, var13);
                        continue;
                    }
                    if (var549 == 27) {
                        int var14 = var7[var5];
                        var4--;
                        class275.method1954(1, var14, class198.field3308[var4]);
                        continue;
                    }
                    if (var549 == 31) {
                        var4 -= 2;
                        if (class198.field3308[var4] <= class198.field3308[var4 + 1]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var549 == 32) {
                        var4 -= 2;
                        if (class198.field3308[var4] >= class198.field3308[var4 + 1]) {
                            var5 += var7[var5];
                        }
                        continue;
                    }
                    if (var549 == 33) {
                        class198.field3308[var4++] = class284.field4632[var7[var5]];
                        continue;
                    }
                    int var10001;
                    if (var549 == 34) {
                        var10001 = var7[var5];
                        var4--;
                        class284.field4632[var10001] = class198.field3308[var4];
                        continue;
                    }
                    if (var549 == 35) {
                        class167.field2790[var3++] = class341.field5403[var7[var5]];
                        continue;
                    }
                    if (var549 == 36) {
                        var10001 = var7[var5];
                        var3--;
                        class341.field5403[var10001] = class167.field2790[var3];
                        continue;
                    }
                    if (var549 == 37) {
                        int var15 = var7[var5];
                        var3 -= var15;
                        String var16 = class251.method1772(var15, var3, arg1 - 252, class167.field2790);
                        class167.field2790[var3++] = var16;
                        continue;
                    }
                    if (var549 == 38) {
                        var4--;
                        continue;
                    }
                    if (var549 == 39) {
                        var3--;
                        continue;
                    }
                    if (var549 == 40) {
                        int var17 = var7[var5];
                        class351 var18 = class112.method838(0, var17);
                        int[] var19 = new int[var18.field5605];
                        String[] var20 = new String[var18.field5609];
                        for (int var21 = 0; var21 < var18.field5611; var21++) {
                            var19[var21] = class198.field3308[var4 + var21 - var18.field5611];
                        }
                        for (int var22 = 0; var22 < var18.field5602; var22++) {
                            var20[var22] = class167.field2790[var3 + var22 - var18.field5602];
                        }
                        var4 -= var18.field5611;
                        var3 -= var18.field5602;
                        class122 var23 = new class122();
                        var23.field2159 = arg0;
                        var23.field2160 = var5;
                        var23.field2154 = class341.field5403;
                        var23.field2153 = class284.field4632;
                        if (class88.field1539.length <= class321.field5215) {
                            throw new RuntimeException();
                        }
                        class88.field1539[class321.field5215++] = var23;
                        var5 = -1;
                        arg0 = var18;
                        var7 = var18.field5612;
                        var6 = var18.field5613;
                        class341.field5403 = var20;
                        class284.field4632 = var19;
                        continue;
                    }
                    if (var549 == 42) {
                        class198.field3308[var4++] = class355.field5670[var7[var5]];
                        continue;
                    }
                    if (var549 == 43) {
                        int var24 = var7[var5];
                        var4--;
                        class355.field5670[var24] = class198.field3308[var4];
                        class30.method235(var24, arg1 - 336);
                        continue;
                    }
                    if (var549 == 44) {
                        int var25 = var7[var5] >> 16;
                        var4--;
                        int var26 = class198.field3308[var4];
                        int var27 = var7[var5] & 0xFFFF;
                        if (var26 >= 0 && var26 <= 5000) {
                            class151.field2577[var25] = var26;
                            byte var28 = -1;
                            if (var27 == 105) {
                                var28 = 0;
                            }
                            int var29 = 0;
                            while (true) {
                                if (var29 >= var26) {
                                    continue label4593;
                                }
                                class303.field4930[var25][var29] = var28;
                                var29++;
                            }
                        }
                        throw new RuntimeException();
                    }
                    if (var549 == 45) {
                        int var30 = var7[var5];
                        var4--;
                        int var31 = class198.field3308[var4];
                        if (var31 >= 0 && var31 < class151.field2577[var30]) {
                            class198.field3308[var4++] = class303.field4930[var30][var31];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var549 == 46) {
                        var4 -= 2;
                        int var32 = class198.field3308[var4];
                        int var33 = var7[var5];
                        if (var32 >= 0 && var32 < class151.field2577[var33]) {
                            class303.field4930[var33][var32] = class198.field3308[var4 + 1];
                            continue;
                        }
                        throw new RuntimeException();
                    }
                    if (var549 == 47) {
                        String var34 = class56.field1109[var7[var5]];
                        if (var34 == null) {
                            var34 = "null";
                        }
                        class167.field2790[var3++] = var34;
                        continue;
                    }
                    if (var549 == 48) {
                        int var35 = var7[var5];
                        var3--;
                        class56.field1109[var35] = class167.field2790[var3];
                        class296.method2125(-26, var35);
                        continue;
                    }
                    if (var549 == 51) {
                        class328 var36 = arg0.field5608[var7[var5]];
                        var10001 = arg1 - 257;
                        var4--;
                        class111 var37 = (class111) var36.method2344(var10001, (long) class198.field3308[var4]);
                        if (var37 != null) {
                            var5 += var37.field2030;
                        }
                        continue;
                    }
                }
                boolean var38;
                if (var7[var5] == 1) {
                    var38 = true;
                } else {
                    var38 = false;
                }
                int var10000;
                if (var549 < 300) {
                    if (var549 == 100) {
                        var4 -= 3;
                        int var39 = class198.field3308[var4 + 1];
                        int var40 = class198.field3308[var4];
                        int var41 = class198.field3308[var4 + 2];
                        if (var39 == 0) {
                            throw new RuntimeException();
                        }
                        class181 var42 = class224.method1564(-117, var40);
                        if (var42.field3095 == null) {
                            var42.field3095 = new class181[var41 + 1];
                        }
                        if (var42.field3095.length <= var41) {
                            class181[] var43 = new class181[var41 + 1];
                            for (int var44 = 0; var44 < var42.field3095.length; var44++) {
                                var43[var44] = var42.field3095[var44];
                            }
                            var42.field3095 = var43;
                        }
                        if (var41 > 0 && var42.field3095[var41 - 1] == null) {
                            throw new RuntimeException("Gap at:" + (var41 - 1));
                        }
                        class181 var45 = new class181();
                        var45.field3058 = true;
                        var45.field3098 = var39;
                        var45.field3023 = var41;
                        var45.field2970 = var45.field3103 = var42.field3103;
                        var42.field3095[var41] = var45;
                        if (var38) {
                            class115.field2071 = var45;
                        } else {
                            class146.field2471 = var45;
                        }
                        class52.method459(arg1 ^ 0x180, var42);
                        continue;
                    }
                    if (var549 == 101) {
                        class181 var46 = var38 ? class115.field2071 : class146.field2471;
                        if (var46.field3023 == -1) {
                            if (var38) {
                                throw new RuntimeException("Tried to .cc_delete static .active-component!");
                            }
                            throw new RuntimeException("Tried to cc_delete static active-component!");
                        }
                        class181 var47 = class224.method1564(arg1 - 372, var46.field3103);
                        var47.field3095[var46.field3023] = null;
                        class52.method459(128, var47);
                        continue;
                    }
                    if (var549 == 102) {
                        var10000 = arg1 ^ 0xFFFFFE8B;
                        var4--;
                        class181 var48 = class224.method1564(var10000, class198.field3308[var4]);
                        var48.field3095 = null;
                        class52.method459(128, var48);
                        continue;
                    }
                    if (var549 == 200) {
                        var4 -= 2;
                        int var49 = class198.field3308[var4 + 1];
                        int var50 = class198.field3308[var4];
                        class181 var51 = class204.method1392(var50, 1, var49);
                        if (var51 != null && var49 != -1) {
                            class198.field3308[var4++] = 1;
                            if (var38) {
                                class115.field2071 = var51;
                            } else {
                                class146.field2471 = var51;
                            }
                            continue;
                        }
                        class198.field3308[var4++] = 0;
                        continue;
                    }
                    if (var549 == 201) {
                        var4--;
                        int var52 = class198.field3308[var4];
                        class181 var53 = class224.method1564(-102, var52);
                        if (var53 == null) {
                            class198.field3308[var4++] = 0;
                        } else {
                            class198.field3308[var4++] = 1;
                            if (var38) {
                                class115.field2071 = var53;
                            } else {
                                class146.field2471 = var53;
                            }
                        }
                        continue;
                    }
                } else if (var549 < 500) {
                    if (var549 == 403) {
                        var4 -= 2;
                        int var54 = class198.field3308[var4];
                        int var55 = class198.field3308[var4 + 1];
                        for (int var56 = 0; var56 < class88.field1602.length; var56++) {
                            if (class88.field1602[var56] == var54) {
                                class96.field1750.field1775.method1828(var55, (byte) -121, var56);
                                continue label4593;
                            }
                        }
                        int var57 = 0;
                        while (true) {
                            if (var57 >= class110.field2015.length) {
                                continue label4593;
                            }
                            if (class110.field2015[var57] == var54) {
                                class96.field1750.field1775.method1828(var55, (byte) -122, var57);
                                continue label4593;
                            }
                            var57++;
                        }
                    }
                    if (var549 == 404) {
                        var4 -= 2;
                        int var58 = class198.field3308[var4];
                        int var59 = class198.field3308[var4 + 1];
                        class96.field1750.field1775.method1834(-14010, var58, var59);
                        continue;
                    }
                    if (var549 == 410) {
                        var4--;
                        boolean var60 = class198.field3308[var4] != 0;
                        class96.field1750.field1775.method1832(-22038, var60);
                        continue;
                    }
                } else if (!(var549 < 1000 || var549 >= 1100) || !(var549 < 2000 || var549 >= 2100)) {
                    class181 var538;
                    if (var549 >= 2000) {
                        var549 -= 1000;
                        var10000 = arg1 - 350;
                        var4--;
                        var538 = class224.method1564(var10000, class198.field3308[var4]);
                    } else {
                        var538 = var38 ? class115.field2071 : class146.field2471;
                    }
                    if (var549 == 1000) {
                        var4 -= 4;
                        var538.field3136 = class198.field3308[var4];
                        var538.field2987 = class198.field3308[var4 + 1];
                        int var539 = class198.field3308[var4 + 2];
                        int var540 = class198.field3308[var4 + 3];
                        if (var540 < 0) {
                            var540 = 0;
                        } else if (var540 > 5) {
                            var540 = 5;
                        }
                        if (var539 < 0) {
                            var539 = 0;
                        } else if (var539 > 5) {
                            var539 = 5;
                        }
                        var538.field3077 = (byte) var539;
                        var538.field3008 = (byte) var540;
                        class52.method459(arg1 ^ 0x180, var538);
                        class217.method1515(var538, 24411);
                        if (var538.field3023 == -1) {
                            class219.method1525(var538.field3103, arg1 - 245);
                        }
                        continue;
                    }
                    if (var549 == 1001) {
                        var4 -= 4;
                        var538.field2981 = class198.field3308[var4];
                        var538.field3057 = class198.field3308[var4 + 1];
                        var538.field3113 = 0;
                        var538.field3061 = 0;
                        int var541 = class198.field3308[var4 + 3];
                        if (var541 < 0) {
                            var541 = 0;
                        } else if (var541 > 4) {
                            var541 = 4;
                        }
                        int var542 = class198.field3308[var4 + 2];
                        if (var542 < 0) {
                            var542 = 0;
                        } else if (var542 > 4) {
                            var542 = 4;
                        }
                        var538.field3128 = (byte) var541;
                        var538.field3087 = (byte) var542;
                        class52.method459(arg1 - 128, var538);
                        class217.method1515(var538, 24411);
                        if (var538.field3098 == 0) {
                            class353.method2513(false, var538, 125);
                        }
                        continue;
                    }
                    if (var549 == 1003) {
                        var4--;
                        boolean var543 = class198.field3308[var4] == 1;
                        if (var538.field3116 != var543) {
                            var538.field3116 = var543;
                            class52.method459(128, var538);
                        }
                        if (var538.field3023 == -1) {
                            class264.method1851((byte) 80, var538.field3103);
                        }
                        continue;
                    }
                    if (var549 == 1004) {
                        var4 -= 2;
                        var538.field3137 = class198.field3308[var4];
                        var538.field3021 = class198.field3308[var4 + 1];
                        class52.method459(128, var538);
                        class217.method1515(var538, 24411);
                        if (var538.field3098 == 0) {
                            class353.method2513(false, var538, 122);
                        }
                        continue;
                    }
                    if (var549 == 1005) {
                        var4--;
                        var538.field2971 = class198.field3308[var4] == 1;
                        continue;
                    }
                } else if (var549 >= 1100 && var549 < 1200 || var549 >= 2100 && var549 < 2200) {
                    class181 var533;
                    if (var549 >= 2000) {
                        var4--;
                        var533 = class224.method1564(-91, class198.field3308[var4]);
                        var549 -= 1000;
                    } else {
                        var533 = var38 ? class115.field2071 : class146.field2471;
                    }
                    if (var549 == 1100) {
                        var4 -= 2;
                        var533.field3035 = class198.field3308[var4];
                        if ((var533.field3019 - var533.field3024) < var533.field3035) {
                            var533.field3035 = var533.field3019 - var533.field3024;
                        }
                        if (var533.field3035 < 0) {
                            var533.field3035 = 0;
                        }
                        var533.field2992 = class198.field3308[var4 + 1];
                        if (var533.field3089 - var533.field2972 < var533.field2992) {
                            var533.field2992 = var533.field3089 - var533.field2972;
                        }
                        if (var533.field2992 < 0) {
                            var533.field2992 = 0;
                        }
                        class52.method459(128, var533);
                        if (var533.field3023 == -1) {
                            class7.method76(var533.field3103, 12919);
                        }
                        continue;
                    }
                    if (var549 == 1101) {
                        var4--;
                        var533.field3063 = class198.field3308[var4];
                        class52.method459(128, var533);
                        if (var533.field3023 == -1) {
                            class134.method946(var533.field3103, (byte) 100);
                        }
                        continue;
                    }
                    if (var549 == 1102) {
                        var4--;
                        var533.field3111 = class198.field3308[var4] == 1;
                        class52.method459(128, var533);
                        continue;
                    }
                    if (var549 == 1103) {
                        var4--;
                        var533.field3105 = class198.field3308[var4];
                        class52.method459(128, var533);
                        continue;
                    }
                    if (var549 == 1104) {
                        var4--;
                        var533.field3129 = class198.field3308[var4];
                        class52.method459(128, var533);
                        continue;
                    }
                    if (var549 == 1105) {
                        var4--;
                        int var534 = class198.field3308[var4];
                        if (var533.field3133 != var534) {
                            var533.field3133 = var534;
                            class52.method459(arg1 ^ 0x180, var533);
                        }
                        if (var533.field3023 == -1) {
                            class199.method1360(false, var533.field3103);
                        }
                        continue;
                    }
                    if (var549 == 1106) {
                        var4--;
                        var533.field2968 = class198.field3308[var4];
                        class52.method459(arg1 - 128, var533);
                        continue;
                    }
                    if (var549 == 1107) {
                        var4--;
                        var533.field3030 = class198.field3308[var4] == 1;
                        class52.method459(arg1 ^ 0x180, var533);
                        continue;
                    }
                    if (var549 == 1108) {
                        var533.field3118 = 1;
                        var4--;
                        var533.field3002 = class198.field3308[var4];
                        class52.method459(128, var533);
                        if (var533.field3023 == -1) {
                            class172.method1224(var533.field3103, 0);
                        }
                        continue;
                    }
                    if (var549 == 1109) {
                        var4 -= 6;
                        var533.field3012 = class198.field3308[var4];
                        var533.field3139 = class198.field3308[var4 + 1];
                        var533.field3000 = class198.field3308[var4 + 2];
                        var533.field3130 = class198.field3308[var4 + 3];
                        var533.field3055 = class198.field3308[var4 + 4];
                        var533.field3114 = class198.field3308[var4 + 5];
                        class52.method459(128, var533);
                        if (var533.field3023 == -1) {
                            class110.method830(var533.field3103, arg1 ^ 0xFFFFAB12);
                            class82.method609((byte) -96, var533.field3103);
                        }
                        continue;
                    }
                    if (var549 == 1110) {
                        var4--;
                        int var535 = class198.field3308[var4];
                        if (var533.field3092 != var535) {
                            var533.field3102 = 0;
                            var533.field3010 = 1;
                            var533.field3100 = 0;
                            var533.field3092 = var535;
                            class52.method459(128, var533);
                        }
                        if (var533.field3023 == -1) {
                            class117.method859(var533.field3103, false);
                        }
                        continue;
                    }
                    if (var549 == 1111) {
                        var4--;
                        var533.field3046 = class198.field3308[var4] == 1;
                        class52.method459(arg1 - 128, var533);
                        continue;
                    }
                    if (var549 == 1112) {
                        var3--;
                        String var536 = class167.field2790[var3];
                        if (!var536.equals(var533.field3001)) {
                            var533.field3001 = var536;
                            class52.method459(arg1 ^ 0x180, var533);
                        }
                        if (var533.field3023 == -1) {
                            class174.method1235(false, var533.field3103);
                        }
                        continue;
                    }
                    if (var549 == 1113) {
                        var4--;
                        var533.field2975 = class198.field3308[var4];
                        class52.method459(128, var533);
                        continue;
                    }
                    if (var549 == 1114) {
                        var4 -= 3;
                        var533.field3107 = class198.field3308[var4];
                        var533.field3056 = class198.field3308[var4 + 1];
                        var533.field2966 = class198.field3308[var4 + 2];
                        class52.method459(128, var533);
                        continue;
                    }
                    if (var549 == 1115) {
                        var4--;
                        var533.field2980 = class198.field3308[var4] == 1;
                        class52.method459(128, var533);
                        continue;
                    }
                    if (var549 == 1116) {
                        var4--;
                        var533.field3088 = class198.field3308[var4];
                        class52.method459(128, var533);
                        continue;
                    }
                    if (var549 == 1117) {
                        var4--;
                        var533.field3132 = class198.field3308[var4];
                        class52.method459(128, var533);
                        continue;
                    }
                    if (var549 == 1118) {
                        var4--;
                        var533.field2985 = class198.field3308[var4] == 1;
                        class52.method459(128, var533);
                        continue;
                    }
                    if (var549 == 1119) {
                        var4--;
                        var533.field3135 = class198.field3308[var4] == 1;
                        class52.method459(128, var533);
                        continue;
                    }
                    if (var549 == 1120) {
                        var4 -= 2;
                        var533.field3019 = class198.field3308[var4];
                        var533.field3089 = class198.field3308[var4 + 1];
                        class52.method459(128, var533);
                        if (var533.field3098 == 0) {
                            class353.method2513(false, var533, 126);
                        }
                        continue;
                    }
                    if (var549 == 1121) {
                        var4 -= 2;
                        var533.field3090 = (short) class198.field3308[var4];
                        var533.field2993 = (short) class198.field3308[var4 + 1];
                        class52.method459(128, var533);
                        continue;
                    }
                    if (var549 == 1122) {
                        var4--;
                        var533.field3069 = class198.field3308[var4] == 1;
                        class52.method459(128, var533);
                        continue;
                    }
                    if (var549 == 1123) {
                        var4--;
                        var533.field3114 = class198.field3308[var4];
                        class52.method459(arg1 - 128, var533);
                        if (var533.field3023 == -1) {
                            class110.method830(var533.field3103, arg1 ^ 0xFFFFAB12);
                        }
                        continue;
                    }
                    if (var549 == 1124) {
                        var4--;
                        int var537 = class198.field3308[var4];
                        var533.field3123 = var537 == 1;
                        class52.method459(128, var533);
                        continue;
                    }
                } else if (var549 >= 1200 && var549 < 1300 || var549 >= 2200 && var549 < 2300) {
                    class181 var61;
                    if (var549 >= 2000) {
                        var549 -= 1000;
                        var10000 = arg1 ^ 0xFFFFFE9E;
                        var4--;
                        var61 = class224.method1564(var10000, class198.field3308[var4]);
                    } else {
                        var61 = var38 ? class115.field2071 : class146.field2471;
                    }
                    class52.method459(128, var61);
                    if (var549 == 1200 || var549 == 1205 || var549 == 1208 || var549 == 1209) {
                        var4 -= 2;
                        int var62 = class198.field3308[var4];
                        int var63 = class198.field3308[var4 + 1];
                        if (var61.field3023 == -1) {
                            class274.method1949(var61.field3103, true);
                            class110.method830(var61.field3103, arg1 ^ 0xFFFFAB12);
                            class82.method609((byte) -66, var61.field3103);
                        }
                        if (var62 == -1) {
                            var61.field3002 = -1;
                            var61.field3118 = 1;
                            var61.field3084 = -1;
                            continue;
                        }
                        var61.field3091 = var63;
                        var61.field3084 = var62;
                        if (var549 == 1208 || var549 == 1209) {
                            var61.field3076 = true;
                        } else {
                            var61.field3076 = false;
                        }
                        class11 var64 = class296.method2124(0, var62);
                        var61.field3012 = var64.field329;
                        var61.field3114 = var64.field360;
                        if (var61.field3113 > 0) {
                            var61.field3114 = var61.field3114 * 32 / var61.field3113;
                        } else if (var61.field2981 > 0) {
                            var61.field3114 = var61.field3114 * 32 / var61.field2981;
                        }
                        var61.field3130 = var64.field306;
                        if (var549 == 1205) {
                            var61.field2999 = false;
                        } else {
                            var61.field2999 = true;
                        }
                        var61.field3139 = var64.field345;
                        var61.field3000 = var64.field332;
                        var61.field3055 = var64.field341;
                        continue;
                    }
                    if (var549 == 1201) {
                        var61.field3118 = 2;
                        var4--;
                        var61.field3002 = class198.field3308[var4];
                        if (var61.field3023 == -1) {
                            class172.method1224(var61.field3103, 0);
                        }
                        continue;
                    }
                    if (var549 == 1202) {
                        var61.field3118 = 3;
                        var61.field3002 = class96.field1750.field1775.method1833(121);
                        if (var61.field3023 == -1) {
                            class172.method1224(var61.field3103, arg1 ^ 0x100);
                        }
                        continue;
                    }
                    if (var549 == 1203) {
                        var61.field3118 = 6;
                        var4--;
                        var61.field3002 = class198.field3308[var4];
                        if (var61.field3023 == -1) {
                            class172.method1224(var61.field3103, 0);
                        }
                        continue;
                    }
                    if (var549 == 1204) {
                        var61.field3118 = 5;
                        var4--;
                        var61.field3002 = class198.field3308[var4];
                        if (var61.field3023 == -1) {
                            class172.method1224(var61.field3103, 0);
                        }
                        continue;
                    }
                    if (var549 == 1206) {
                        var4 -= 4;
                        var61.field3083 = class198.field3308[var4];
                        var61.field3145 = class198.field3308[var4 + 1];
                        var61.field3040 = class198.field3308[var4 + 2];
                        var61.field3117 = class198.field3308[var4 + 3];
                        class52.method459(128, var61);
                        continue;
                    }
                    if (var549 == 1207) {
                        var4 -= 2;
                        var61.field3049 = class198.field3308[var4];
                        var61.field2976 = class198.field3308[var4 + 1];
                        class52.method459(128, var61);
                        continue;
                    }
                    if (var549 == 1211) {
                        var61.field3118 = 5;
                        var61.field2996 = 0;
                        var61.field3002 = 2047;
                        if (var61.field3023 == -1) {
                            class172.method1224(var61.field3103, arg1 ^ 0x100);
                        }
                        continue;
                    }
                } else if ((var549 < 1300 || var549 >= 1400) && (var549 < 2300 || var549 >= 2400)) {
                    if (var549 >= 1400 && var549 < 1500 || var549 >= 2400 && var549 < 2500) {
                        int[] var71 = null;
                        class181 var72;
                        if (var549 < 2000) {
                            var72 = var38 ? class115.field2071 : class146.field2471;
                        } else {
                            var549 -= 1000;
                            var4--;
                            var72 = class224.method1564(-91, class198.field3308[var4]);
                        }
                        var3--;
                        String var73 = class167.field2790[var3];
                        if (var73.length() > 0 && var73.charAt(var73.length() - 1) == 'Y') {
                            var4--;
                            int var74 = class198.field3308[var4];
                            if (var74 > 0) {
                                var71 = new int[var74];
                                while ((var74--) > 0) {
                                    var4--;
                                    var71[var74] = class198.field3308[var4];
                                }
                            }
                            var73 = var73.substring(0, var73.length() - 1);
                        }
                        Object[] var75 = new Object[var73.length() + 1];
                        for (int var76 = var75.length - 1; var76 >= 1; var76--) {
                            if (var73.charAt(var76 - 1) == 's') {
                                var3--;
                                var75[var76] = class167.field2790[var3];
                            } else {
                                var4--;
                                var75[var76] = Integer.valueOf(class198.field3308[var4]);
                            }
                        }
                        var4--;
                        int var77 = class198.field3308[var4];
                        if (var77 == -1) {
                            var75 = null;
                        } else {
                            var75[0] = Integer.valueOf(var77);
                        }
                        if (var549 == 1400) {
                            var72.field3004 = var75;
                        } else if (var549 == 1401) {
                            var72.field2967 = var75;
                        } else if (var549 == 1402) {
                            var72.field3043 = var75;
                        } else if (var549 == 1403) {
                            var72.field3047 = var75;
                        } else if (var549 == 1404) {
                            var72.field3073 = var75;
                        } else if (var549 == 1405) {
                            var72.field3081 = var75;
                        } else if (var549 == 1406) {
                            var72.field2986 = var75;
                        } else if (var549 == 1407) {
                            var72.field3072 = var75;
                            var72.field3066 = var71;
                        } else if (var549 == 1408) {
                            var72.field3080 = var75;
                        } else if (var549 == 1409) {
                            var72.field3016 = var75;
                        } else if (var549 == 1410) {
                            var72.field2965 = var75;
                        } else if (var549 == 1411) {
                            var72.field3115 = var75;
                        } else if (var549 == 1412) {
                            var72.field3104 = var75;
                        } else if (var549 == 1414) {
                            var72.field2974 = var71;
                            var72.field3006 = var75;
                        } else if (var549 == 1415) {
                            var72.field3053 = var71;
                            var72.field3085 = var75;
                        } else if (var549 == 1416) {
                            var72.field3032 = var75;
                        } else if (var549 == 1417) {
                            var72.field3106 = var75;
                        } else if (var549 == 1418) {
                            var72.field2979 = var75;
                        } else if (var549 == 1419) {
                            var72.field3082 = var75;
                        } else if (var549 == 1420) {
                            var72.field3028 = var75;
                        } else if (var549 == 1421) {
                            var72.field2995 = var75;
                        } else if (var549 == 1422) {
                            var72.field2978 = var75;
                        } else if (var549 == 1423) {
                            var72.field3070 = var75;
                        } else if (var549 == 1424) {
                            var72.field3038 = var75;
                        } else if (var549 == 1425) {
                            var72.field3017 = var75;
                        } else if (var549 == 1426) {
                            var72.field3050 = var75;
                        } else if (var549 == 1427) {
                            var72.field3044 = var75;
                        } else if (var549 == 1428) {
                            var72.field2984 = var71;
                            var72.field3041 = var75;
                        } else if (var549 == 1429) {
                            var72.field2977 = var75;
                            var72.field3099 = var71;
                        }
                        var72.field3065 = true;
                        continue;
                    }
                    if (var549 < 1600) {
                        class181 var78 = var38 ? class115.field2071 : class146.field2471;
                        if (var549 == 1500) {
                            class198.field3308[var4++] = var78.field3125;
                            continue;
                        }
                        if (var549 == 1501) {
                            class198.field3308[var4++] = var78.field3011;
                            continue;
                        }
                        if (var549 == 1502) {
                            class198.field3308[var4++] = var78.field3024;
                            continue;
                        }
                        if (var549 == 1503) {
                            class198.field3308[var4++] = var78.field2972;
                            continue;
                        }
                        if (var549 == 1504) {
                            class198.field3308[var4++] = var78.field3116 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 1505) {
                            class198.field3308[var4++] = var78.field2970;
                            continue;
                        }
                    } else if (var549 < 1700) {
                        class181 var532 = var38 ? class115.field2071 : class146.field2471;
                        if (var549 == 1600) {
                            class198.field3308[var4++] = var532.field3035;
                            continue;
                        }
                        if (var549 == 1601) {
                            class198.field3308[var4++] = var532.field2992;
                            continue;
                        }
                        if (var549 == 1602) {
                            class167.field2790[var3++] = var532.field3001;
                            continue;
                        }
                        if (var549 == 1603) {
                            class198.field3308[var4++] = var532.field3019;
                            continue;
                        }
                        if (var549 == 1604) {
                            class198.field3308[var4++] = var532.field3089;
                            continue;
                        }
                        if (var549 == 1605) {
                            class198.field3308[var4++] = var532.field3114;
                            continue;
                        }
                        if (var549 == 1606) {
                            class198.field3308[var4++] = var532.field3000;
                            continue;
                        }
                        if (var549 == 1607) {
                            class198.field3308[var4++] = var532.field3055;
                            continue;
                        }
                        if (var549 == 1608) {
                            class198.field3308[var4++] = var532.field3130;
                            continue;
                        }
                        if (var549 == 1609) {
                            class198.field3308[var4++] = var532.field3105;
                            continue;
                        }
                        if (var549 == 1610) {
                            class198.field3308[var4++] = var532.field3012;
                            continue;
                        }
                        if (var549 == 1611) {
                            class198.field3308[var4++] = var532.field3139;
                            continue;
                        }
                        if (var549 == 1612) {
                            class198.field3308[var4++] = var532.field3133;
                            continue;
                        }
                    } else if (var549 < 1800) {
                        class181 var79 = var38 ? class115.field2071 : class146.field2471;
                        if (var549 == 1700) {
                            class198.field3308[var4++] = var79.field3084;
                            continue;
                        }
                        if (var549 == 1701) {
                            if (var79.field3084 == -1) {
                                class198.field3308[var4++] = 0;
                            } else {
                                class198.field3308[var4++] = var79.field3091;
                            }
                            continue;
                        }
                        if (var549 == 1702) {
                            class198.field3308[var4++] = var79.field3023;
                            continue;
                        }
                    } else if (var549 < 1900) {
                        class181 var530 = var38 ? class115.field2071 : class146.field2471;
                        if (var549 == 1800) {
                            class198.field3308[var4++] = client.method1990(var530).method2406(arg1 - 256);
                            continue;
                        }
                        if (var549 == 1801) {
                            var4--;
                            int var531 = class198.field3308[var4];
                            int var551 = var531 - 1;
                            if (var530.field3144 != null && var551 < var530.field3144.length && var530.field3144[var551] != null) {
                                class167.field2790[var3++] = var530.field3144[var551];
                                continue;
                            }
                            class167.field2790[var3++] = "";
                            continue;
                        }
                        if (var549 == 1802) {
                            if (var530.field3119 == null) {
                                class167.field2790[var3++] = "";
                            } else {
                                class167.field2790[var3++] = var530.field3119;
                            }
                            continue;
                        }
                    } else if (var549 < 2600) {
                        var4--;
                        class181 var529 = class224.method1564(-123, class198.field3308[var4]);
                        if (var549 == 2500) {
                            class198.field3308[var4++] = var529.field3125;
                            continue;
                        }
                        if (var549 == 2501) {
                            class198.field3308[var4++] = var529.field3011;
                            continue;
                        }
                        if (var549 == 2502) {
                            class198.field3308[var4++] = var529.field3024;
                            continue;
                        }
                        if (var549 == 2503) {
                            class198.field3308[var4++] = var529.field2972;
                            continue;
                        }
                        if (var549 == 2504) {
                            class198.field3308[var4++] = var529.field3116 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 2505) {
                            class198.field3308[var4++] = var529.field2970;
                            continue;
                        }
                    } else if (var549 < 2700) {
                        var4--;
                        class181 var80 = class224.method1564(-127, class198.field3308[var4]);
                        if (var549 == 2600) {
                            class198.field3308[var4++] = var80.field3035;
                            continue;
                        }
                        if (var549 == 2601) {
                            class198.field3308[var4++] = var80.field2992;
                            continue;
                        }
                        if (var549 == 2602) {
                            class167.field2790[var3++] = var80.field3001;
                            continue;
                        }
                        if (var549 == 2603) {
                            class198.field3308[var4++] = var80.field3019;
                            continue;
                        }
                        if (var549 == 2604) {
                            class198.field3308[var4++] = var80.field3089;
                            continue;
                        }
                        if (var549 == 2605) {
                            class198.field3308[var4++] = var80.field3114;
                            continue;
                        }
                        if (var549 == 2606) {
                            class198.field3308[var4++] = var80.field3000;
                            continue;
                        }
                        if (var549 == 2607) {
                            class198.field3308[var4++] = var80.field3055;
                            continue;
                        }
                        if (var549 == 2608) {
                            class198.field3308[var4++] = var80.field3130;
                            continue;
                        }
                        if (var549 == 2609) {
                            class198.field3308[var4++] = var80.field3105;
                            continue;
                        }
                        if (var549 == 2610) {
                            class198.field3308[var4++] = var80.field3012;
                            continue;
                        }
                        if (var549 == 2611) {
                            class198.field3308[var4++] = var80.field3139;
                            continue;
                        }
                        if (var549 == 2612) {
                            class198.field3308[var4++] = var80.field3133;
                            continue;
                        }
                    } else if (var549 < 2800) {
                        if (var549 == 2700) {
                            var10000 = arg1 ^ 0xFFFFFE8E;
                            var4--;
                            class181 var81 = class224.method1564(var10000, class198.field3308[var4]);
                            class198.field3308[var4++] = var81.field3084;
                            continue;
                        }
                        if (var549 == 2701) {
                            var4--;
                            class181 var82 = class224.method1564(-98, class198.field3308[var4]);
                            if (var82.field3084 == -1) {
                                class198.field3308[var4++] = 0;
                            } else {
                                class198.field3308[var4++] = var82.field3091;
                            }
                            continue;
                        }
                        if (var549 == 2702) {
                            var4--;
                            int var83 = class198.field3308[var4];
                            class355 var84 = (class355) class34.field758.method2344(arg1 - 257, (long) var83);
                            if (var84 == null) {
                                class198.field3308[var4++] = 0;
                            } else {
                                class198.field3308[var4++] = 1;
                            }
                            continue;
                        }
                        if (var549 == 2703) {
                            var4--;
                            class181 var85 = class224.method1564(-93, class198.field3308[var4]);
                            if (var85.field3095 == null) {
                                class198.field3308[var4++] = 0;
                                continue;
                            }
                            int var86 = var85.field3095.length;
                            for (int var87 = 0; var87 < var85.field3095.length; var87++) {
                                if (var85.field3095[var87] == null) {
                                    var86 = var87;
                                    break;
                                }
                            }
                            class198.field3308[var4++] = var86;
                            continue;
                        }
                        if (var549 == 2704 || var549 == 2705) {
                            var4 -= 2;
                            int var88 = class198.field3308[var4];
                            int var89 = class198.field3308[var4 + 1];
                            class355 var90 = (class355) class34.field758.method2344(-1, (long) var88);
                            if (var90 != null && var90.field5657 == var89) {
                                class198.field3308[var4++] = 1;
                            } else {
                                class198.field3308[var4++] = 0;
                            }
                            continue;
                        }
                    } else if (var549 < 2900) {
                        var4--;
                        class181 var527 = class224.method1564(-124, class198.field3308[var4]);
                        if (var549 == 2800) {
                            class198.field3308[var4++] = client.method1990(var527).method2406(0);
                            continue;
                        }
                        if (var549 == 2801) {
                            var4--;
                            int var528 = class198.field3308[var4];
                            int var550 = var528 - 1;
                            if (var527.field3144 != null && var550 < var527.field3144.length && var527.field3144[var550] != null) {
                                class167.field2790[var3++] = var527.field3144[var550];
                                continue;
                            }
                            class167.field2790[var3++] = "";
                            continue;
                        }
                        if (var549 == 2802) {
                            if (var527.field3119 == null) {
                                class167.field2790[var3++] = "";
                            } else {
                                class167.field2790[var3++] = var527.field3119;
                            }
                            continue;
                        }
                    } else if (var549 < 3200) {
                        if (var549 == 3100) {
                            var3--;
                            String var512 = class167.field2790[var3];
                            class172.method1225(var512, 0);
                            continue;
                        }
                        if (var549 == 3101) {
                            var4 -= 2;
                            class253.method1784(-119, class198.field3308[var4 + 1], class96.field1750, class198.field3308[var4]);
                            continue;
                        }
                        if (var549 == 3103) {
                            class341.method2410(true);
                            continue;
                        }
                        if (var549 == 3104) {
                            var3--;
                            String var513 = class167.field2790[var3];
                            class316.field5149++;
                            int var514 = 0;
                            if (class332.method2352(-99, var513)) {
                                var514 = class86.method656(var513, (byte) -119);
                            }
                            class51.field1038.method291((byte) 61, 94);
                            class51.field1038.method1045((byte) 116, var514);
                            continue;
                        }
                        if (var549 == 3105) {
                            var3--;
                            String var515 = class167.field2790[var3];
                            class73.field1329++;
                            class51.field1038.method291((byte) -123, 226);
                            class51.field1038.method1027(var515.length() + 1, -20374);
                            class51.field1038.method1012(var515, (byte) 84);
                            continue;
                        }
                        if (var549 == 3106) {
                            class269.field4392++;
                            var3--;
                            String var516 = class167.field2790[var3];
                            class51.field1038.method291((byte) 109, 70);
                            class51.field1038.method1027(var516.length() + 1, arg1 ^ 0xFFFFB16A);
                            class51.field1038.method1012(var516, (byte) 121);
                            continue;
                        }
                        if (var549 == 3107) {
                            var3--;
                            String var517 = class167.field2790[var3];
                            var4--;
                            int var518 = class198.field3308[var4];
                            class257.method1800(var517, var518, -2);
                            continue;
                        }
                        if (var549 == 3108) {
                            var4 -= 3;
                            int var519 = class198.field3308[var4 + 1];
                            int var520 = class198.field3308[var4];
                            int var521 = class198.field3308[var4 + 2];
                            class181 var522 = class224.method1564(-117, var521);
                            class289.method2058(var522, var520, -65, var519);
                            continue;
                        }
                        if (var549 == 3109) {
                            class181 var523 = var38 ? class115.field2071 : class146.field2471;
                            var4 -= 2;
                            int var524 = class198.field3308[var4 + 1];
                            int var525 = class198.field3308[var4];
                            class289.method2058(var523, var525, 19, var524);
                            continue;
                        }
                        if (var549 == 3110) {
                            var4--;
                            int var526 = class198.field3308[var4];
                            class51.field1038.method291((byte) 118, 146);
                            class69.field1277++;
                            class51.field1038.method1002((byte) -95, var526);
                            continue;
                        }
                    } else if (var549 < 3300) {
                        if (var549 == 3200) {
                            var4 -= 3;
                            class23.method195(102, class198.field3308[var4], class198.field3308[var4 + 1], 255, class198.field3308[var4 + 2]);
                            continue;
                        }
                        if (var549 == 3201) {
                            var4--;
                            class35.method259(255, -111, class198.field3308[var4]);
                            continue;
                        }
                        if (var549 == 3202) {
                            var4 -= 2;
                            class160.method1148(class198.field3308[var4 + 1], 82, 255, class198.field3308[var4]);
                            continue;
                        }
                    } else if (var549 < 3400) {
                        if (var549 == 3300) {
                            class198.field3308[var4++] = class267.field4371;
                            continue;
                        }
                        if (var549 == 3301) {
                            var4 -= 2;
                            int var91 = class198.field3308[var4 + 1];
                            int var92 = class198.field3308[var4];
                            class198.field3308[var4++] = class13.method130(var92, (byte) -55, var91);
                            continue;
                        }
                        if (var549 == 3302) {
                            var4 -= 2;
                            int var93 = class198.field3308[var4 + 1];
                            int var94 = class198.field3308[var4];
                            class198.field3308[var4++] = class101.method766(var94, var93, -1);
                            continue;
                        }
                        if (var549 == 3303) {
                            var4 -= 2;
                            int var95 = class198.field3308[var4];
                            int var96 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = class201.method1381(15195, var95, var96);
                            continue;
                        }
                        if (var549 == 3304) {
                            var4--;
                            int var97 = class198.field3308[var4];
                            class198.field3308[var4++] = class131.method926(var97, (byte) 4).field4719;
                            continue;
                        }
                        if (var549 == 3305) {
                            var4--;
                            int var98 = class198.field3308[var4];
                            class198.field3308[var4++] = class128.field2231[var98];
                            continue;
                        }
                        if (var549 == 3306) {
                            var4--;
                            int var99 = class198.field3308[var4];
                            class198.field3308[var4++] = class75.field1364[var99];
                            continue;
                        }
                        if (var549 == 3307) {
                            var4--;
                            int var100 = class198.field3308[var4];
                            class198.field3308[var4++] = class208.field3474[var100];
                            continue;
                        }
                        if (var549 == 3308) {
                            int var101 = (class96.field1750.field199 >> 7) + class272.field4426;
                            int var102 = (class96.field1750.field213 >> 7) + class21.field543;
                            int var103 = class276.field4506;
                            class198.field3308[var4++] = (var101 << 14) + (var103 << 28) + var102;
                            continue;
                        }
                        if (var549 == 3309) {
                            var4--;
                            int var104 = class198.field3308[var4];
                            class198.field3308[var4++] = class83.method613(var104 >> 14, 16383);
                            continue;
                        }
                        if (var549 == 3310) {
                            var4--;
                            int var105 = class198.field3308[var4];
                            class198.field3308[var4++] = var105 >> 28;
                            continue;
                        }
                        if (var549 == 3311) {
                            var4--;
                            int var106 = class198.field3308[var4];
                            class198.field3308[var4++] = class83.method613(var106, 16383);
                            continue;
                        }
                        if (var549 == 3312) {
                            class198.field3308[var4++] = class235.field3852 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3313) {
                            var4 -= 2;
                            int var107 = class198.field3308[var4] + 32768;
                            int var108 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = class13.method130(var107, (byte) -83, var108);
                            continue;
                        }
                        if (var549 == 3314) {
                            var4 -= 2;
                            int var109 = class198.field3308[var4] + 32768;
                            int var110 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = class101.method766(var109, var110, arg1 - 257);
                            continue;
                        }
                        if (var549 == 3315) {
                            var4 -= 2;
                            int var111 = class198.field3308[var4] + 32768;
                            int var112 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = class201.method1381(15195, var111, var112);
                            continue;
                        }
                        if (var549 == 3316) {
                            if (class300.field4883 >= 2) {
                                class198.field3308[var4++] = class300.field4883;
                            } else {
                                class198.field3308[var4++] = 0;
                            }
                            continue;
                        }
                        if (var549 == 3317) {
                            class198.field3308[var4++] = class125.field2203;
                            continue;
                        }
                        if (var549 == 3318) {
                            class198.field3308[var4++] = class68.field1262;
                            continue;
                        }
                        if (var549 == 3321) {
                            class198.field3308[var4++] = class14.field408;
                            continue;
                        }
                        if (var549 == 3322) {
                            class198.field3308[var4++] = class78.field1381;
                            continue;
                        }
                        if (var549 == 3323) {
                            if (class132.field2267 >= 5 && class132.field2267 <= 9) {
                                class198.field3308[var4++] = 1;
                                continue;
                            }
                            class198.field3308[var4++] = 0;
                            continue;
                        }
                        if (var549 == 3324) {
                            if (class132.field2267 >= 5 && class132.field2267 <= 9) {
                                class198.field3308[var4++] = class132.field2267;
                                continue;
                            }
                            class198.field3308[var4++] = 0;
                            continue;
                        }
                        if (var549 == 3325) {
                            class198.field3308[var4++] = class151.field2571 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3326) {
                            class198.field3308[var4++] = class96.field1750.field1776;
                            continue;
                        }
                        if (var549 == 3327) {
                            class198.field3308[var4++] = class96.field1750.field1775.field4255 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3328) {
                            class198.field3308[var4++] = class153.field2612 && !class345.field5452 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3329) {
                            class198.field3308[var4++] = class312.field5088 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3330) {
                            var4--;
                            int var113 = class198.field3308[var4];
                            class198.field3308[var4++] = class56.method477(arg1 - 256, var113);
                            continue;
                        }
                        if (var549 == 3331) {
                            var4 -= 2;
                            int var114 = class198.field3308[var4];
                            int var115 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = class269.method1880(var115, false, arg1 - 251, var114);
                            continue;
                        }
                        if (var549 == 3332) {
                            var4 -= 2;
                            int var116 = class198.field3308[var4];
                            int var117 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = class269.method1880(var117, true, 5, var116);
                            continue;
                        }
                        if (var549 == 3333) {
                            class198.field3308[var4++] = class88.field1532;
                            continue;
                        }
                        if (var549 == 3335) {
                            class198.field3308[var4++] = class86.field1497;
                            continue;
                        }
                        if (var549 == 3336) {
                            var4 -= 4;
                            int var118 = class198.field3308[var4];
                            int var119 = class198.field3308[var4 + 1];
                            int var120 = (var119 << 14) + var118;
                            int var121 = class198.field3308[var4 + 3];
                            int var122 = class198.field3308[var4 + 2];
                            int var123 = (var122 << 28) + var120;
                            int var124 = var121 + var123;
                            class198.field3308[var4++] = var124;
                            continue;
                        }
                        if (var549 == 3337) {
                            class198.field3308[var4++] = class363.field5745;
                            continue;
                        }
                    } else if (var549 < 3500) {
                        if (var549 == 3400) {
                            var4 -= 2;
                            int var125 = class198.field3308[var4];
                            int var126 = class198.field3308[var4 + 1];
                            class99 var127 = class155.method1103(var125, -2);
                            if (var127.field1820 == 's') {
                            }
                            class167.field2790[var3++] = var127.method759(var126, (byte) 64);
                            continue;
                        }
                        if (var549 == 3408) {
                            var4 -= 4;
                            int var128 = class198.field3308[var4 + 1];
                            int var129 = class198.field3308[var4];
                            int var130 = class198.field3308[var4 + 3];
                            int var131 = class198.field3308[var4 + 2];
                            class99 var132 = class155.method1103(var131, -2);
                            if (var132.field1818 == var129 && var132.field1820 == var128) {
                                if (var128 == 115) {
                                    class167.field2790[var3++] = var132.method759(var130, (byte) 47);
                                } else {
                                    class198.field3308[var4++] = var132.method758(var130, class115.method856(arg1, 337));
                                }
                                continue;
                            }
                            throw new RuntimeException("C3408-1");
                        }
                        if (var549 == 3409) {
                            var4 -= 3;
                            int var133 = class198.field3308[var4];
                            int var134 = class198.field3308[var4 + 2];
                            int var135 = class198.field3308[var4 + 1];
                            if (var135 == -1) {
                                throw new RuntimeException("C3409-2");
                            }
                            class99 var136 = class155.method1103(var135, -2);
                            if (var136.field1820 != var133) {
                                throw new RuntimeException("C3409-1");
                            }
                            class198.field3308[var4++] = var136.method756(23842, var134) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3410) {
                            var4--;
                            int var137 = class198.field3308[var4];
                            var3--;
                            String var138 = class167.field2790[var3];
                            if (var137 == -1) {
                                throw new RuntimeException("C3410-2");
                            }
                            class99 var139 = class155.method1103(var137, arg1 - 258);
                            if (var139.field1820 != 's') {
                                throw new RuntimeException("C3410-1");
                            }
                            class198.field3308[var4++] = var139.method752(var138, false) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3411) {
                            var4--;
                            int var140 = class198.field3308[var4];
                            class99 var141 = class155.method1103(var140, -2);
                            class198.field3308[var4++] = var141.field1831.method2340(-17734);
                            continue;
                        }
                    } else if (var549 < 3700) {
                        if (var549 == 3600) {
                            if (class34.field759 == 0) {
                                class198.field3308[var4++] = -2;
                            } else if (class34.field759 == 1) {
                                class198.field3308[var4++] = -1;
                            } else {
                                class198.field3308[var4++] = class151.field2550;
                            }
                            continue;
                        }
                        if (var549 == 3601) {
                            var4--;
                            int var142 = class198.field3308[var4];
                            if (class34.field759 == 2 && class151.field2550 > var142) {
                                class167.field2790[var3++] = class91.field1610[var142];
                                if (class18.field499[var142] == null) {
                                    class167.field2790[var3++] = "";
                                } else {
                                    class167.field2790[var3++] = class18.field499[var142];
                                }
                                continue;
                            }
                            class167.field2790[var3++] = "";
                            class167.field2790[var3++] = "";
                            continue;
                        }
                        if (var549 == 3602) {
                            var4--;
                            int var143 = class198.field3308[var4];
                            if (class34.field759 == 2 && class151.field2550 > var143) {
                                class198.field3308[var4++] = class336.field5345[var143];
                                continue;
                            }
                            class198.field3308[var4++] = 0;
                            continue;
                        }
                        if (var549 == 3603) {
                            var4--;
                            int var144 = class198.field3308[var4];
                            if (class34.field759 == 2 && class151.field2550 > var144) {
                                class198.field3308[var4++] = class125.field2202[var144];
                                continue;
                            }
                            class198.field3308[var4++] = 0;
                            continue;
                        }
                        if (var549 == 3604) {
                            var3--;
                            String var145 = class167.field2790[var3];
                            var4--;
                            int var146 = class198.field3308[var4];
                            class104.method783(var146, arg1 + 16060, var145);
                            continue;
                        }
                        if (var549 == 3605) {
                            var3--;
                            String var147 = class167.field2790[var3];
                            method444(var147, arg1 - 256);
                            continue;
                        }
                        if (var549 == 3606) {
                            var3--;
                            String var148 = class167.field2790[var3];
                            class34.method245((byte) -67, var148);
                            continue;
                        }
                        if (var549 == 3607) {
                            var3--;
                            String var149 = class167.field2790[var3];
                            class212.method1465(30597, var149, false);
                            continue;
                        }
                        if (var549 == 3608) {
                            var3--;
                            String var150 = class167.field2790[var3];
                            class278.method1969(var150, (byte) 18);
                            continue;
                        }
                        if (var549 == 3609) {
                            var3--;
                            String var151 = class167.field2790[var3];
                            if (var151.startsWith("<img=0>") || var151.startsWith("<img=1>")) {
                                var151 = var151.substring(7);
                            }
                            class198.field3308[var4++] = class253.method1782(var151, (byte) -104) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3610) {
                            var4--;
                            int var152 = class198.field3308[var4];
                            if (class34.field759 == 2 && var152 < class151.field2550) {
                                class167.field2790[var3++] = class224.field3699[var152];
                                continue;
                            }
                            class167.field2790[var3++] = "";
                            continue;
                        }
                        if (var549 == 3611) {
                            if (class37.field811 == null) {
                                class167.field2790[var3++] = "";
                            } else {
                                class167.field2790[var3++] = class348.method2488(class37.field811, (byte) 50);
                            }
                            continue;
                        }
                        if (var549 == 3612) {
                            if (class37.field811 == null) {
                                class198.field3308[var4++] = 0;
                            } else {
                                class198.field3308[var4++] = class293.field4739;
                            }
                            continue;
                        }
                        if (var549 == 3613) {
                            var4--;
                            int var153 = class198.field3308[var4];
                            if (class37.field811 != null && var153 < class293.field4739) {
                                class167.field2790[var3++] = class85.field1473[var153].field4603;
                                continue;
                            }
                            class167.field2790[var3++] = "";
                            continue;
                        }
                        if (var549 == 3614) {
                            var4--;
                            int var154 = class198.field3308[var4];
                            if (class37.field811 != null && class293.field4739 > var154) {
                                class198.field3308[var4++] = class85.field1473[var154].field4602;
                                continue;
                            }
                            class198.field3308[var4++] = 0;
                            continue;
                        }
                        if (var549 == 3615) {
                            var4--;
                            int var155 = class198.field3308[var4];
                            if (class37.field811 != null && var155 < class293.field4739) {
                                class198.field3308[var4++] = class85.field1473[var155].field4598;
                                continue;
                            }
                            class198.field3308[var4++] = 0;
                            continue;
                        }
                        if (var549 == 3616) {
                            class198.field3308[var4++] = class244.field4054;
                            continue;
                        }
                        if (var549 == 3617) {
                            var3--;
                            String var156 = class167.field2790[var3];
                            class340.method2401((byte) 107, var156);
                            continue;
                        }
                        if (var549 == 3618) {
                            class198.field3308[var4++] = class127.field2212;
                            continue;
                        }
                        if (var549 == 3619) {
                            var3--;
                            String var157 = class167.field2790[var3];
                            class182.method1290(var157, 67);
                            continue;
                        }
                        if (var549 == 3620) {
                            class342.method2413(20213);
                            continue;
                        }
                        if (var549 == 3621) {
                            if (class34.field759 == 0) {
                                class198.field3308[var4++] = -1;
                            } else {
                                class198.field3308[var4++] = class317.field5171;
                            }
                            continue;
                        }
                        if (var549 == 3622) {
                            var4--;
                            int var158 = class198.field3308[var4];
                            if (class34.field759 != 0 && var158 < class317.field5171) {
                                class167.field2790[var3++] = class306.field4974[var158];
                                if (class178.field2945[var158] == null) {
                                    class167.field2790[var3++] = "";
                                } else {
                                    class167.field2790[var3++] = class178.field2945[var158];
                                }
                                continue;
                            }
                            class167.field2790[var3++] = "";
                            class167.field2790[var3++] = "";
                            continue;
                        }
                        if (var549 == 3623) {
                            var3--;
                            String var159 = class167.field2790[var3];
                            if (var159.startsWith("<img=0>") || var159.startsWith("<img=1>")) {
                                var159 = var159.substring(7);
                            }
                            class198.field3308[var4++] = class110.method823(var159, -89) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3624) {
                            var4--;
                            int var160 = class198.field3308[var4];
                            if (class85.field1473 != null && class293.field4739 > var160 && class85.field1473[var160].field4605.equalsIgnoreCase(class96.field1750.field1779)) {
                                class198.field3308[var4++] = 1;
                                continue;
                            }
                            class198.field3308[var4++] = 0;
                            continue;
                        }
                        if (var549 == 3625) {
                            if (class34.field763 == null) {
                                class167.field2790[var3++] = "";
                            } else {
                                class167.field2790[var3++] = class34.field763;
                            }
                            continue;
                        }
                        if (var549 == 3626) {
                            var4--;
                            int var161 = class198.field3308[var4];
                            if (class37.field811 != null && var161 < class293.field4739) {
                                class167.field2790[var3++] = class85.field1473[var161].field4599;
                                continue;
                            }
                            class167.field2790[var3++] = "";
                            continue;
                        }
                        if (var549 == 3627) {
                            var4--;
                            int var162 = class198.field3308[var4];
                            if (class34.field759 == 2 && var162 >= 0 && class151.field2550 > var162) {
                                class198.field3308[var4++] = class293.field4742[var162] ? 1 : 0;
                                continue;
                            }
                            class198.field3308[var4++] = 0;
                            continue;
                        }
                        if (var549 == 3628) {
                            var3--;
                            String var163 = class167.field2790[var3];
                            if (var163.startsWith("<img=0>") || var163.startsWith("<img=1>")) {
                                var163 = var163.substring(7);
                            }
                            class198.field3308[var4++] = class321.method2309((byte) -94, var163);
                            continue;
                        }
                        if (var549 == 3629) {
                            class198.field3308[var4++] = class114.field2059;
                            continue;
                        }
                        if (var549 == 3630) {
                            var3--;
                            String var164 = class167.field2790[var3];
                            class212.method1465(30597, var164, true);
                            continue;
                        }
                        if (var549 == 3631) {
                            var4--;
                            int var165 = class198.field3308[var4];
                            class198.field3308[var4++] = class76.field1369[var165] ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3632) {
                            var4--;
                            int var166 = class198.field3308[var4];
                            if (class37.field811 != null && var166 < class293.field4739) {
                                class167.field2790[var3++] = class85.field1473[var166].field4605;
                                continue;
                            }
                            class167.field2790[var3++] = "";
                            continue;
                        }
                        if (var549 == 3633) {
                            var4--;
                            int var167 = class198.field3308[var4];
                            if (class34.field759 != 0 && var167 < class317.field5171) {
                                class167.field2790[var3++] = class340.field5382[var167];
                                continue;
                            }
                            class167.field2790[var3++] = "";
                            continue;
                        }
                    } else if (var549 < 4000) {
                        if (var549 == 3903) {
                            var4--;
                            int var498 = class198.field3308[var4];
                            class198.field3308[var4++] = class161.field2718[var498].method1573(-76);
                            continue;
                        }
                        if (var549 == 3904) {
                            var4--;
                            int var499 = class198.field3308[var4];
                            class198.field3308[var4++] = class161.field2718[var499].field3709;
                            continue;
                        }
                        if (var549 == 3905) {
                            var4--;
                            int var500 = class198.field3308[var4];
                            class198.field3308[var4++] = class161.field2718[var500].field3708;
                            continue;
                        }
                        if (var549 == 3906) {
                            var4--;
                            int var501 = class198.field3308[var4];
                            class198.field3308[var4++] = class161.field2718[var501].field3707;
                            continue;
                        }
                        if (var549 == 3907) {
                            var4--;
                            int var502 = class198.field3308[var4];
                            class198.field3308[var4++] = class161.field2718[var502].field3715;
                            continue;
                        }
                        if (var549 == 3908) {
                            var4--;
                            int var503 = class198.field3308[var4];
                            class198.field3308[var4++] = class161.field2718[var503].field3702;
                            continue;
                        }
                        if (var549 == 3910) {
                            var4--;
                            int var504 = class198.field3308[var4];
                            int var505 = class161.field2718[var504].method1571((byte) 121);
                            class198.field3308[var4++] = var505 == 0 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3911) {
                            var4--;
                            int var506 = class198.field3308[var4];
                            int var507 = class161.field2718[var506].method1571((byte) -46);
                            class198.field3308[var4++] = var507 == 2 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3912) {
                            var4--;
                            int var508 = class198.field3308[var4];
                            int var509 = class161.field2718[var508].method1571((byte) 124);
                            class198.field3308[var4++] = var509 == 5 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 3913) {
                            var4--;
                            int var510 = class198.field3308[var4];
                            int var511 = class161.field2718[var510].method1571((byte) 126);
                            class198.field3308[var4++] = var511 == 1 ? 1 : 0;
                            continue;
                        }
                    } else if (var549 < 4100) {
                        if (var549 == 4000) {
                            var4 -= 2;
                            int var168 = class198.field3308[var4 + 1];
                            int var169 = class198.field3308[var4];
                            class198.field3308[var4++] = var168 + var169;
                            continue;
                        }
                        if (var549 == 4001) {
                            var4 -= 2;
                            int var170 = class198.field3308[var4];
                            int var171 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = var170 - var171;
                            continue;
                        }
                        if (var549 == 4002) {
                            var4 -= 2;
                            int var172 = class198.field3308[var4];
                            int var173 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = var172 * var173;
                            continue;
                        }
                        if (var549 == 4003) {
                            var4 -= 2;
                            int var174 = class198.field3308[var4];
                            int var175 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = var174 / var175;
                            continue;
                        }
                        if (var549 == 4004) {
                            var4--;
                            int var176 = class198.field3308[var4];
                            class198.field3308[var4++] = (int) ((double) var176 * Math.random());
                            continue;
                        }
                        if (var549 == 4005) {
                            var4--;
                            int var177 = class198.field3308[var4];
                            class198.field3308[var4++] = (int) (Math.random() * (double) (var177 + 1));
                            continue;
                        }
                        if (var549 == 4006) {
                            var4 -= 5;
                            int var178 = class198.field3308[var4 + 1];
                            int var179 = class198.field3308[var4];
                            int var180 = class198.field3308[var4 + 2];
                            int var181 = class198.field3308[var4 + 3];
                            int var182 = class198.field3308[var4 + 4];
                            class198.field3308[var4++] = (var178 - var179) * (var182 - var180) / (var181 - var180) + var179;
                            continue;
                        }
                        if (var549 == 4007) {
                            var4 -= 2;
                            long var183 = (long) class198.field3308[var4 + 1];
                            long var185 = (long) class198.field3308[var4];
                            class198.field3308[var4++] = (int) (var183 * var185 / 100L + var185);
                            continue;
                        }
                        if (var549 == 4008) {
                            var4 -= 2;
                            int var187 = class198.field3308[var4];
                            int var188 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = class287.method2034(var187, 0x1 << var188);
                            continue;
                        }
                        if (var549 == 4009) {
                            var4 -= 2;
                            int var189 = class198.field3308[var4 + 1];
                            int var190 = class198.field3308[var4];
                            class198.field3308[var4++] = class83.method613(-(0x1 << var189) - 1, var190);
                            continue;
                        }
                        if (var549 == 4010) {
                            var4 -= 2;
                            int var191 = class198.field3308[var4];
                            int var192 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = class83.method613(var191, 0x1 << var192) == 0 ? 0 : 1;
                            continue;
                        }
                        if (var549 == 4011) {
                            var4 -= 2;
                            int var193 = class198.field3308[var4];
                            int var194 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = var193 % var194;
                            continue;
                        }
                        if (var549 == 4012) {
                            var4 -= 2;
                            int var195 = class198.field3308[var4];
                            int var196 = class198.field3308[var4 + 1];
                            if (var195 == 0) {
                                class198.field3308[var4++] = 0;
                            } else {
                                class198.field3308[var4++] = (int) Math.pow((double) var195, (double) var196);
                            }
                            continue;
                        }
                        if (var549 == 4013) {
                            var4 -= 2;
                            int var197 = class198.field3308[var4];
                            int var198 = class198.field3308[var4 + 1];
                            if (var197 == 0) {
                                class198.field3308[var4++] = 0;
                            } else if (var198 == 0) {
                                class198.field3308[var4++] = Integer.MAX_VALUE;
                            } else {
                                class198.field3308[var4++] = (int) Math.pow((double) var197, 1.0D / (double) var198);
                            }
                            continue;
                        }
                        if (var549 == 4014) {
                            var4 -= 2;
                            int var199 = class198.field3308[var4];
                            int var200 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = class83.method613(var199, var200);
                            continue;
                        }
                        if (var549 == 4015) {
                            var4 -= 2;
                            int var201 = class198.field3308[var4];
                            int var202 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = class287.method2034(var201, var202);
                            continue;
                        }
                        if (var549 == 4016) {
                            var4 -= 2;
                            int var203 = class198.field3308[var4];
                            int var204 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = var203 < var204 ? var203 : var204;
                            continue;
                        }
                        if (var549 == 4017) {
                            var4 -= 2;
                            int var205 = class198.field3308[var4 + 1];
                            int var206 = class198.field3308[var4];
                            class198.field3308[var4++] = var205 < var206 ? var206 : var205;
                            continue;
                        }
                        if (var549 == 4018) {
                            var4 -= 3;
                            long var207 = (long) class198.field3308[var4 + 1];
                            long var209 = (long) class198.field3308[var4 + 2];
                            long var211 = (long) class198.field3308[var4];
                            class198.field3308[var4++] = (int) (var209 * var211 / var207);
                            continue;
                        }
                    } else if (var549 < 4200) {
                        if (var549 == 4100) {
                            var4--;
                            int var213 = class198.field3308[var4];
                            var3--;
                            String var214 = class167.field2790[var3];
                            class167.field2790[var3++] = var214 + var213;
                            continue;
                        }
                        if (var549 == 4101) {
                            var3 -= 2;
                            String var215 = class167.field2790[var3 + 1];
                            String var216 = class167.field2790[var3];
                            class167.field2790[var3++] = var216 + var215;
                            continue;
                        }
                        if (var549 == 4102) {
                            var4--;
                            int var217 = class198.field3308[var4];
                            var3--;
                            String var218 = class167.field2790[var3];
                            class167.field2790[var3++] = var218 + class289.method2055((byte) -109, var217, true);
                            continue;
                        }
                        if (var549 == 4103) {
                            var3--;
                            String var219 = class167.field2790[var3];
                            class167.field2790[var3++] = var219.toLowerCase();
                            continue;
                        }
                        if (var549 == 4104) {
                            var4--;
                            int var220 = class198.field3308[var4];
                            long var221 = (long) var220 * 86400000L + 1014768000000L;
                            class65.field1232.setTime(new Date(var221));
                            int var223 = class65.field1232.get(5);
                            int var224 = class65.field1232.get(2);
                            int var225 = class65.field1232.get(1);
                            class167.field2790[var3++] = var223 + "-" + class134.field2301[var224] + "-" + var225;
                            continue;
                        }
                        if (var549 == 4105) {
                            var3 -= 2;
                            String var226 = class167.field2790[var3 + 1];
                            String var227 = class167.field2790[var3];
                            if (class96.field1750.field1775 != null && class96.field1750.field1775.field4255) {
                                class167.field2790[var3++] = var226;
                                continue;
                            }
                            class167.field2790[var3++] = var227;
                            continue;
                        }
                        if (var549 == 4106) {
                            var4--;
                            int var228 = class198.field3308[var4];
                            class167.field2790[var3++] = Integer.toString(var228);
                            continue;
                        }
                        if (var549 == 4107) {
                            var3 -= 2;
                            class198.field3308[var4++] = class339.method2393(class101.method765(class167.field2790[var3 + 1], class86.field1497, 3, class167.field2790[var3]), (byte) 48);
                            continue;
                        }
                        if (var549 == 4108) {
                            var4 -= 2;
                            int var229 = class198.field3308[var4];
                            var3--;
                            String var230 = class167.field2790[var3];
                            int var231 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = class303.method2165(class115.method856(arg1, 15836), var231).method642(var230, var229);
                            continue;
                        }
                        if (var549 == 4109) {
                            var3--;
                            String var232 = class167.field2790[var3];
                            var4 -= 2;
                            int var233 = class198.field3308[var4];
                            int var234 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = class303.method2165(15580, var234).method647(var232, var233);
                            continue;
                        }
                        if (var549 == 4110) {
                            var3 -= 2;
                            String var235 = class167.field2790[var3];
                            String var236 = class167.field2790[var3 + 1];
                            var4--;
                            if (class198.field3308[var4] == 1) {
                                class167.field2790[var3++] = var235;
                            } else {
                                class167.field2790[var3++] = var236;
                            }
                            continue;
                        }
                        if (var549 == 4111) {
                            var3--;
                            String var237 = class167.field2790[var3];
                            class167.field2790[var3++] = class84.method622(var237);
                            continue;
                        }
                        if (var549 == 4112) {
                            var3--;
                            String var238 = class167.field2790[var3];
                            var4--;
                            int var239 = class198.field3308[var4];
                            if (var239 == -1) {
                                throw new RuntimeException("null char");
                            }
                            class167.field2790[var3++] = var238 + (char) var239;
                            continue;
                        }
                        if (var549 == 4113) {
                            var4--;
                            int var240 = class198.field3308[var4];
                            class198.field3308[var4++] = class146.method993((char) var240, -118) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 4114) {
                            var4--;
                            int var241 = class198.field3308[var4];
                            class198.field3308[var4++] = class72.method548(90, (char) var241) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 4115) {
                            var4--;
                            int var242 = class198.field3308[var4];
                            class198.field3308[var4++] = class109.method818((char) var242, class115.method856(arg1, -346)) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 4116) {
                            var4--;
                            int var243 = class198.field3308[var4];
                            class198.field3308[var4++] = class269.method1877((char) var243, true) ? 1 : 0;
                            continue;
                        }
                        if (var549 == 4117) {
                            var3--;
                            String var244 = class167.field2790[var3];
                            if (var244 == null) {
                                class198.field3308[var4++] = 0;
                            } else {
                                class198.field3308[var4++] = var244.length();
                            }
                            continue;
                        }
                        if (var549 == 4118) {
                            var4 -= 2;
                            int var245 = class198.field3308[var4];
                            var3--;
                            String var246 = class167.field2790[var3];
                            int var247 = class198.field3308[var4 + 1];
                            class167.field2790[var3++] = var246.substring(var245, var247);
                            continue;
                        }
                        if (var549 == 4119) {
                            var3--;
                            String var248 = class167.field2790[var3];
                            StringBuffer var249 = new StringBuffer(var248.length());
                            boolean var250 = false;
                            for (int var251 = 0; var248.length() > var251; var251++) {
                                char var252 = var248.charAt(var251);
                                if (var252 == '<') {
                                    var250 = true;
                                } else if (var252 == '>') {
                                    var250 = false;
                                } else if (!var250) {
                                    var249.append(var252);
                                }
                            }
                            class167.field2790[var3++] = var249.toString();
                            continue;
                        }
                        if (var549 == 4120) {
                            var4 -= 2;
                            int var253 = class198.field3308[var4];
                            var3--;
                            String var254 = class167.field2790[var3];
                            int var255 = class198.field3308[var4 + 1];
                            class198.field3308[var4++] = var254.indexOf(var253, var255);
                            continue;
                        }
                        if (var549 == 4121) {
                            var3 -= 2;
                            String var256 = class167.field2790[var3];
                            String var257 = class167.field2790[var3 + 1];
                            var4--;
                            int var258 = class198.field3308[var4];
                            class198.field3308[var4++] = var256.indexOf(var257, var258);
                            continue;
                        }
                        if (var549 == 4122) {
                            var4--;
                            int var259 = class198.field3308[var4];
                            class198.field3308[var4++] = Character.toLowerCase((char) var259);
                            continue;
                        }
                        if (var549 == 4123) {
                            var4--;
                            int var260 = class198.field3308[var4];
                            class198.field3308[var4++] = Character.toUpperCase((char) var260);
                            continue;
                        }
                        if (var549 == 4124) {
                            var4--;
                            boolean var261 = class198.field3308[var4] != 0;
                            var4--;
                            int var262 = class198.field3308[var4];
                            class167.field2790[var3++] = class148.method1064(0, var261, class86.field1497, (long) var262, 85);
                            continue;
                        }
                    } else if (var549 < 4300) {
                        if (var549 == 4200) {
                            var4--;
                            int var479 = class198.field3308[var4];
                            class167.field2790[var3++] = class296.method2124(0, var479).field318;
                            continue;
                        }
                        if (var549 == 4201) {
                            var4 -= 2;
                            int var480 = class198.field3308[var4];
                            int var481 = class198.field3308[var4 + 1];
                            class11 var482 = class296.method2124(0, var480);
                            if (var481 >= 1 && var481 <= 5 && var482.field334[var481 - 1] != null) {
                                class167.field2790[var3++] = var482.field334[var481 - 1];
                                continue;
                            }
                            class167.field2790[var3++] = "";
                            continue;
                        }
                        if (var549 == 4202) {
                            var4 -= 2;
                            int var483 = class198.field3308[var4];
                            int var484 = class198.field3308[var4 + 1];
                            class11 var485 = class296.method2124(0, var483);
                            if (var484 >= 1 && var484 <= 5 && var485.field340[var484 - 1] != null) {
                                class167.field2790[var3++] = var485.field340[var484 - 1];
                                continue;
                            }
                            class167.field2790[var3++] = "";
                            continue;
                        }
                        if (var549 == 4203) {
                            var4--;
                            int var486 = class198.field3308[var4];
                            class198.field3308[var4++] = class296.method2124(0, var486).field323;
                            continue;
                        }
                        if (var549 == 4204) {
                            var4--;
                            int var487 = class198.field3308[var4];
                            class198.field3308[var4++] = class296.method2124(0, var487).field338 == 1 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 4205) {
                            var4--;
                            int var488 = class198.field3308[var4];
                            class11 var489 = class296.method2124(arg1 - 256, var488);
                            if (var489.field300 == -1 && var489.field296 >= 0) {
                                class198.field3308[var4++] = var489.field296;
                                continue;
                            }
                            class198.field3308[var4++] = var488;
                            continue;
                        }
                        if (var549 == 4206) {
                            var4--;
                            int var490 = class198.field3308[var4];
                            class11 var491 = class296.method2124(arg1 - 256, var490);
                            if (var491.field300 >= 0 && var491.field296 >= 0) {
                                class198.field3308[var4++] = var491.field296;
                                continue;
                            }
                            class198.field3308[var4++] = var490;
                            continue;
                        }
                        if (var549 == 4207) {
                            var4--;
                            int var492 = class198.field3308[var4];
                            class198.field3308[var4++] = class296.method2124(0, var492).field359 ? 1 : 0;
                            continue;
                        }
                        if (var549 == 4208) {
                            var4 -= 2;
                            int var493 = class198.field3308[var4];
                            int var494 = class198.field3308[var4 + 1];
                            class321 var495 = class346.method2467(var494, 11);
                            if (var495.method2311(93)) {
                                class167.field2790[var3++] = class296.method2124(0, var493).method107((byte) 123, var494, var495.field5222);
                            } else {
                                class198.field3308[var4++] = class296.method2124(class115.method856(arg1, 256), var493).method114(-129, var494, var495.field5223);
                            }
                            continue;
                        }
                        if (var549 == 4210) {
                            var3--;
                            String var496 = class167.field2790[var3];
                            var4--;
                            int var497 = class198.field3308[var4];
                            class147.method1058(arg1 ^ 0x100, var496, var497 == 1);
                            class198.field3308[var4++] = class296.field4836;
                            continue;
                        }
                        if (var549 == 4211) {
                            if (class320.field5203 != null && class122.field2161 < class296.field4836) {
                                class198.field3308[var4++] = class83.method613(65535, class320.field5203[class122.field2161++]);
                                continue;
                            }
                            class198.field3308[var4++] = -1;
                            continue;
                        }
                        if (var549 == 4212) {
                            class122.field2161 = 0;
                            continue;
                        }
                    } else if (var549 >= 4400) {
                        if (var549 >= 4500) {
                            if (var549 < 4600) {
                                if (var549 == 4500) {
                                    var4 -= 2;
                                    int var263 = class198.field3308[var4 + 1];
                                    int var264 = class198.field3308[var4];
                                    class321 var265 = class346.method2467(var263, 11);
                                    if (var265.method2311(95)) {
                                        class167.field2790[var3++] = class53.method466(32, var264).method1328(var265.field5222, 6548, var263);
                                    } else {
                                        class198.field3308[var4++] = class53.method466(arg1 - 224, var264).method1326(0, var265.field5223, var263);
                                    }
                                    continue;
                                }
                            } else if (var549 < 5100) {
                                if (var549 == 5000) {
                                    class198.field3308[var4++] = class68.field1269;
                                    continue;
                                }
                                if (var549 == 5001) {
                                    var4 -= 3;
                                    class306.field4973++;
                                    class68.field1269 = class198.field3308[var4];
                                    class136.field2334 = class198.field3308[var4 + 1];
                                    class325.field5251 = class198.field3308[var4 + 2];
                                    class51.field1038.method291((byte) 57, 52);
                                    class51.field1038.method1027(class68.field1269, arg1 ^ 0xFFFFB16A);
                                    class51.field1038.method1027(class136.field2334, -20374);
                                    class51.field1038.method1027(class325.field5251, -20374);
                                    continue;
                                }
                                if (var549 == 5002) {
                                    var4 -= 2;
                                    class76.field1368++;
                                    var3--;
                                    String var266 = class167.field2790[var3];
                                    int var267 = class198.field3308[var4 + 1];
                                    int var268 = class198.field3308[var4];
                                    class51.field1038.method291((byte) -89, 185);
                                    class51.field1038.method1027(class148.method1066(var266, (byte) 57) + 2, -20374);
                                    class51.field1038.method1012(var266, (byte) 45);
                                    class51.field1038.method1027(var268 - 1, -20374);
                                    class51.field1038.method1027(var267, -20374);
                                    continue;
                                }
                                if (var549 == 5003) {
                                    var4--;
                                    int var269 = class198.field3308[var4];
                                    String var270 = null;
                                    if (var269 < 100) {
                                        var270 = class49.field1026[var269];
                                    }
                                    if (var270 == null) {
                                        var270 = "";
                                    }
                                    class167.field2790[var3++] = var270;
                                    continue;
                                }
                                if (var549 == 5004) {
                                    int var271 = -1;
                                    var4--;
                                    int var272 = class198.field3308[var4];
                                    if (var272 < 100 && class49.field1026[var272] != null) {
                                        var271 = class323.field5237[var272];
                                    }
                                    class198.field3308[var4++] = var271;
                                    continue;
                                }
                                if (var549 == 5005) {
                                    class198.field3308[var4++] = class136.field2334;
                                    continue;
                                }
                                if (var549 == 5008) {
                                    var3--;
                                    String var273 = class167.field2790[var3];
                                    if (!var273.startsWith("::")) {
                                        if (class300.field4883 == 0 && (class153.field2612 && !class345.field5452 || class312.field5088)) {
                                            continue;
                                        }
                                        class76.field1366++;
                                        String var274 = var273.toLowerCase();
                                        byte var275 = 0;
                                        if (var274.startsWith(class119.field2125)) {
                                            var275 = 0;
                                            var273 = var273.substring(class119.field2125.length());
                                        } else if (var274.startsWith(class188.field3184)) {
                                            var273 = var273.substring(class188.field3184.length());
                                            var275 = 1;
                                        } else if (var274.startsWith(class19.field506)) {
                                            var273 = var273.substring(class19.field506.length());
                                            var275 = 2;
                                        } else if (var274.startsWith(class19.field512)) {
                                            var273 = var273.substring(class19.field512.length());
                                            var275 = 3;
                                        } else if (var274.startsWith(class349.field5588)) {
                                            var273 = var273.substring(class349.field5588.length());
                                            var275 = 4;
                                        } else if (var274.startsWith(class349.field5592)) {
                                            var273 = var273.substring(class349.field5592.length());
                                            var275 = 5;
                                        } else if (var274.startsWith(class197.field3293)) {
                                            var273 = var273.substring(class197.field3293.length());
                                            var275 = 6;
                                        } else if (var274.startsWith(class250.field4109)) {
                                            var275 = 7;
                                            var273 = var273.substring(class250.field4109.length());
                                        } else if (var274.startsWith(class66.field1249)) {
                                            var273 = var273.substring(class66.field1249.length());
                                            var275 = 8;
                                        } else if (var274.startsWith(class131.field2256)) {
                                            var273 = var273.substring(class131.field2256.length());
                                            var275 = 9;
                                        } else if (var274.startsWith(class197.field3297)) {
                                            var275 = 10;
                                            var273 = var273.substring(class197.field3297.length());
                                        } else if (var274.startsWith(class47.field955)) {
                                            var273 = var273.substring(class47.field955.length());
                                            var275 = 11;
                                        } else if (class86.field1497 != 0) {
                                            if (var274.startsWith(class312.field5099)) {
                                                var273 = var273.substring(class312.field5099.length());
                                                var275 = 0;
                                            } else if (var274.startsWith(class103.field1888)) {
                                                var273 = var273.substring(class103.field1888.length());
                                                var275 = 1;
                                            } else if (var274.startsWith(class298.field4850)) {
                                                var275 = 2;
                                                var273 = var273.substring(class298.field4850.length());
                                            } else if (var274.startsWith(class257.field4205)) {
                                                var273 = var273.substring(class257.field4205.length());
                                                var275 = 3;
                                            } else if (var274.startsWith(class220.field3650)) {
                                                var273 = var273.substring(class220.field3650.length());
                                                var275 = 4;
                                            } else if (var274.startsWith(class59.field1153)) {
                                                var275 = 5;
                                                var273 = var273.substring(class59.field1153.length());
                                            } else if (var274.startsWith(class255.field4174)) {
                                                var275 = 6;
                                                var273 = var273.substring(class255.field4174.length());
                                            } else if (var274.startsWith(class167.field2791)) {
                                                var275 = 7;
                                                var273 = var273.substring(class167.field2791.length());
                                            } else if (var274.startsWith(class348.field5564)) {
                                                var275 = 8;
                                                var273 = var273.substring(class348.field5564.length());
                                            } else if (var274.startsWith(class73.field1333)) {
                                                var275 = 9;
                                                var273 = var273.substring(class73.field1333.length());
                                            } else if (var274.startsWith(class71.field1315)) {
                                                var273 = var273.substring(class71.field1315.length());
                                                var275 = 10;
                                            } else if (var274.startsWith(class344.field5438)) {
                                                var273 = var273.substring(class344.field5438.length());
                                                var275 = 11;
                                            }
                                        }
                                        byte var276 = 0;
                                        String var277 = var273.toLowerCase();
                                        if (var277.startsWith(class201.field3376)) {
                                            var276 = 1;
                                            var273 = var273.substring(class201.field3376.length());
                                        } else if (var277.startsWith(class292.field4733)) {
                                            var273 = var273.substring(class292.field4733.length());
                                            var276 = 2;
                                        } else if (var277.startsWith(class9.field285)) {
                                            var273 = var273.substring(class9.field285.length());
                                            var276 = 3;
                                        } else if (var277.startsWith(class311.field5061)) {
                                            var276 = 4;
                                            var273 = var273.substring(class311.field5061.length());
                                        } else if (var277.startsWith(class263.field4322)) {
                                            var276 = 5;
                                            var273 = var273.substring(class263.field4322.length());
                                        } else if (class86.field1497 != 0) {
                                            if (var277.startsWith(class6.field128)) {
                                                var273 = var273.substring(class6.field128.length());
                                                var276 = 1;
                                            } else if (var277.startsWith(class25.field655)) {
                                                var276 = 2;
                                                var273 = var273.substring(class25.field655.length());
                                            } else if (var277.startsWith(class147.field2510)) {
                                                var273 = var273.substring(class147.field2510.length());
                                                var276 = 3;
                                            } else if (var277.startsWith(client.field4581)) {
                                                var276 = 4;
                                                var273 = var273.substring(client.field4581.length());
                                            } else if (var277.startsWith(class1.field24)) {
                                                var276 = 5;
                                                var273 = var273.substring(class1.field24.length());
                                            }
                                        }
                                        class51.field1038.method291((byte) -115, 112);
                                        class51.field1038.method1027(0, -20374);
                                        int var278 = class51.field1038.field2435;
                                        class51.field1038.method1027(var275, -20374);
                                        class51.field1038.method1027(var276, -20374);
                                        class58.method482(var273, class51.field1038, 28524);
                                        class51.field1038.method990(false, class51.field1038.field2435 - var278);
                                        continue;
                                    }
                                    class108.method805(var273, 0);
                                    continue;
                                }
                                if (var549 == 5009) {
                                    var3 -= 2;
                                    String var279 = class167.field2790[var3];
                                    String var280 = class167.field2790[var3 + 1];
                                    if (class300.field4883 != 0 || (!class153.field2612 || class345.field5452) && !class312.field5088) {
                                        class51.field1038.method291((byte) 112, 80);
                                        class198.field3313++;
                                        class51.field1038.method1027(0, -20374);
                                        int var281 = class51.field1038.field2435;
                                        class51.field1038.method1012(var279, (byte) 100);
                                        class58.method482(var280, class51.field1038, arg1 ^ 0x6E6C);
                                        class51.field1038.method990(false, class51.field1038.field2435 - var281);
                                    }
                                    continue;
                                }
                                if (var549 == 5010) {
                                    String var282 = null;
                                    var4--;
                                    int var283 = class198.field3308[var4];
                                    if (var283 < 100) {
                                        var282 = class22.field555[var283];
                                    }
                                    if (var282 == null) {
                                        var282 = "";
                                    }
                                    class167.field2790[var3++] = var282;
                                    continue;
                                }
                                if (var549 == 5011) {
                                    var4--;
                                    int var284 = class198.field3308[var4];
                                    String var285 = null;
                                    if (var284 < 100) {
                                        var285 = class253.field4157[var284];
                                    }
                                    if (var285 == null) {
                                        var285 = "";
                                    }
                                    class167.field2790[var3++] = var285;
                                    continue;
                                }
                                if (var549 == 5012) {
                                    var4--;
                                    int var286 = class198.field3308[var4];
                                    int var287 = -1;
                                    if (var286 < 100) {
                                        var287 = class195.field3274[var286];
                                    }
                                    class198.field3308[var4++] = var287;
                                    continue;
                                }
                                if (var549 == 5015) {
                                    String var288;
                                    if (class96.field1750 == null || class96.field1750.field1790 == null) {
                                        var288 = class306.field4983;
                                    } else {
                                        var288 = class96.field1750.method743(true, true);
                                    }
                                    class167.field2790[var3++] = var288;
                                    continue;
                                }
                                if (var549 == 5018) {
                                    int var289 = 0;
                                    var4--;
                                    int var290 = class198.field3308[var4];
                                    if (var290 < 100 && class49.field1026[var290] != null) {
                                        var289 = class323.field5237[var290];
                                    }
                                    class198.field3308[var4++] = var289;
                                    continue;
                                }
                                if (var549 == 5019) {
                                    var4--;
                                    int var291 = class198.field3308[var4];
                                    String var292 = null;
                                    if (var291 < 100) {
                                        var292 = class229.field3758[var291];
                                    }
                                    if (var292 == null) {
                                        var292 = "";
                                    }
                                    class167.field2790[var3++] = var292;
                                    continue;
                                }
                                if (var549 == 5016) {
                                    class198.field3308[var4++] = class325.field5251;
                                    continue;
                                }
                                if (var549 == 5017) {
                                    class198.field3308[var4++] = class10.field293;
                                    continue;
                                }
                                if (var549 == 5050) {
                                    var4--;
                                    int var293 = class198.field3308[var4];
                                    class167.field2790[var3++] = class174.method1234(107, var293).field4383;
                                    continue;
                                }
                                if (var549 == 5051) {
                                    var4--;
                                    int var294 = class198.field3308[var4];
                                    class269 var295 = class174.method1234(88, var294);
                                    if (var295.field4385 == null) {
                                        class198.field3308[var4++] = 0;
                                    } else {
                                        class198.field3308[var4++] = var295.field4385.length;
                                    }
                                    continue;
                                }
                                if (var549 == 5052) {
                                    var4 -= 2;
                                    int var296 = class198.field3308[var4];
                                    int var297 = class198.field3308[var4 + 1];
                                    class269 var298 = class174.method1234(arg1 ^ 0x168, var296);
                                    int var299 = var298.field4385[var297];
                                    class198.field3308[var4++] = var299;
                                    continue;
                                }
                                if (var549 == 5053) {
                                    var4--;
                                    int var300 = class198.field3308[var4];
                                    class269 var301 = class174.method1234(92, var300);
                                    if (var301.field4386 == null) {
                                        class198.field3308[var4++] = 0;
                                    } else {
                                        class198.field3308[var4++] = var301.field4386.length;
                                    }
                                    continue;
                                }
                                if (var549 == 5054) {
                                    var4 -= 2;
                                    int var302 = class198.field3308[var4];
                                    int var303 = class198.field3308[var4 + 1];
                                    class198.field3308[var4++] = class174.method1234(100, var302).field4386[var303];
                                    continue;
                                }
                                if (var549 == 5055) {
                                    var4--;
                                    int var304 = class198.field3308[var4];
                                    class167.field2790[var3++] = class335.method2362(class115.method856(arg1, 360), var304).method254(-106);
                                    continue;
                                }
                                if (var549 == 5056) {
                                    var4--;
                                    int var305 = class198.field3308[var4];
                                    class35 var306 = class335.method2362(104, var305);
                                    if (var306.field768 == null) {
                                        class198.field3308[var4++] = 0;
                                    } else {
                                        class198.field3308[var4++] = var306.field768.length;
                                    }
                                    continue;
                                }
                                if (var549 == 5057) {
                                    var4 -= 2;
                                    int var307 = class198.field3308[var4];
                                    int var308 = class198.field3308[var4 + 1];
                                    class198.field3308[var4++] = class335.method2362(class115.method856(arg1, 360), var307).field768[var308];
                                    continue;
                                }
                                if (var549 == 5058) {
                                    class289.field4698 = new class131();
                                    var4--;
                                    class289.field4698.field2265 = class198.field3308[var4];
                                    class289.field4698.field2257 = class335.method2362(arg1 - 152, class289.field4698.field2265);
                                    class289.field4698.field2260 = new int[class289.field4698.field2257.method257(-99)];
                                    continue;
                                }
                                if (var549 == 5059) {
                                    class51.field1038.method291((byte) 90, 86);
                                    class316.field5142++;
                                    class51.field1038.method1027(0, -20374);
                                    int var309 = class51.field1038.field2435;
                                    class51.field1038.method1027(0, -20374);
                                    class51.field1038.method1002((byte) -93, class289.field4698.field2265);
                                    class289.field4698.field2257.method253(class289.field4698.field2260, false, class51.field1038);
                                    class51.field1038.method990(false, class51.field1038.field2435 - var309);
                                    continue;
                                }
                                if (var549 == 5060) {
                                    class12.field374++;
                                    var3--;
                                    String var310 = class167.field2790[var3];
                                    class51.field1038.method291((byte) 61, 110);
                                    class51.field1038.method1027(0, arg1 - 20630);
                                    int var311 = class51.field1038.field2435;
                                    class51.field1038.method1012(var310, (byte) 54);
                                    class51.field1038.method1002((byte) -119, class289.field4698.field2265);
                                    class289.field4698.field2257.method253(class289.field4698.field2260, false, class51.field1038);
                                    class51.field1038.method990(false, class51.field1038.field2435 - var311);
                                    continue;
                                }
                                if (var549 == 5061) {
                                    class51.field1038.method291((byte) 88, 86);
                                    class51.field1038.method1027(0, -20374);
                                    class316.field5142++;
                                    int var312 = class51.field1038.field2435;
                                    class51.field1038.method1027(1, -20374);
                                    class51.field1038.method1002((byte) -99, class289.field4698.field2265);
                                    class289.field4698.field2257.method253(class289.field4698.field2260, false, class51.field1038);
                                    class51.field1038.method990(false, class51.field1038.field2435 - var312);
                                    continue;
                                }
                                if (var549 == 5062) {
                                    var4 -= 2;
                                    int var313 = class198.field3308[var4];
                                    int var314 = class198.field3308[var4 + 1];
                                    class198.field3308[var4++] = class174.method1234(115, var313).field4395[var314];
                                    continue;
                                }
                                if (var549 == 5063) {
                                    var4 -= 2;
                                    int var315 = class198.field3308[var4 + 1];
                                    int var316 = class198.field3308[var4];
                                    class198.field3308[var4++] = class174.method1234(93, var316).field4387[var315];
                                    continue;
                                }
                                if (var549 == 5064) {
                                    var4 -= 2;
                                    int var317 = class198.field3308[var4 + 1];
                                    int var318 = class198.field3308[var4];
                                    if (var317 == -1) {
                                        class198.field3308[var4++] = -1;
                                    } else {
                                        class198.field3308[var4++] = class174.method1234(arg1 - 133, var318).method1879(-24246, (char) var317);
                                    }
                                    continue;
                                }
                                if (var549 == 5065) {
                                    var4 -= 2;
                                    int var319 = class198.field3308[var4];
                                    int var320 = class198.field3308[var4 + 1];
                                    if (var320 == -1) {
                                        class198.field3308[var4++] = -1;
                                    } else {
                                        class198.field3308[var4++] = class174.method1234(arg1 - 171, var319).method1881((char) var320, (byte) 124);
                                    }
                                    continue;
                                }
                                if (var549 == 5066) {
                                    var4--;
                                    int var321 = class198.field3308[var4];
                                    class198.field3308[var4++] = class335.method2362(104, var321).method257(class115.method856(arg1, -370));
                                    continue;
                                }
                                if (var549 == 5067) {
                                    var4 -= 2;
                                    int var322 = class198.field3308[var4];
                                    int var323 = class198.field3308[var4 + 1];
                                    int var324 = class335.method2362(104, var322).method255(arg1 - 256, var323);
                                    class198.field3308[var4++] = var324;
                                    continue;
                                }
                                if (var549 == 5068) {
                                    var4 -= 2;
                                    int var325 = class198.field3308[var4];
                                    int var326 = class198.field3308[var4 + 1];
                                    class289.field4698.field2260[var325] = var326;
                                    continue;
                                }
                                if (var549 == 5069) {
                                    var4 -= 2;
                                    int var327 = class198.field3308[var4];
                                    int var328 = class198.field3308[var4 + 1];
                                    class289.field4698.field2260[var327] = var328;
                                    continue;
                                }
                                if (var549 == 5070) {
                                    var4 -= 3;
                                    int var329 = class198.field3308[var4];
                                    int var330 = class198.field3308[var4 + 1];
                                    int var331 = class198.field3308[var4 + 2];
                                    class35 var332 = class335.method2362(arg1 - 152, var329);
                                    if (var332.method255(0, var330) != 0) {
                                        throw new RuntimeException("bad command");
                                    }
                                    class198.field3308[var4++] = var332.method263(var331, -8418, var330);
                                    continue;
                                }
                                if (var549 == 5071) {
                                    var3--;
                                    String var333 = class167.field2790[var3];
                                    var4--;
                                    boolean var334 = class198.field3308[var4] == 1;
                                    class139.method963(var334, var333, (byte) 72);
                                    class198.field3308[var4++] = class296.field4836;
                                    continue;
                                }
                                if (var549 == 5072) {
                                    if (class320.field5203 != null && class122.field2161 < class296.field4836) {
                                        class198.field3308[var4++] = class83.method613(65535, class320.field5203[class122.field2161++]);
                                        continue;
                                    }
                                    class198.field3308[var4++] = -1;
                                    continue;
                                }
                                if (var549 == 5073) {
                                    class122.field2161 = 0;
                                    continue;
                                }
                            } else if (var549 < 5200) {
                                if (var549 == 5100) {
                                    if (class261.field4307[86]) {
                                        class198.field3308[var4++] = 1;
                                    } else {
                                        class198.field3308[var4++] = 0;
                                    }
                                    continue;
                                }
                                if (var549 == 5101) {
                                    if (class261.field4307[82]) {
                                        class198.field3308[var4++] = 1;
                                    } else {
                                        class198.field3308[var4++] = 0;
                                    }
                                    continue;
                                }
                                if (var549 == 5102) {
                                    if (class261.field4307[81]) {
                                        class198.field3308[var4++] = 1;
                                    } else {
                                        class198.field3308[var4++] = 0;
                                    }
                                    continue;
                                }
                            } else if (var549 < 5300) {
                                if (var549 == 5200) {
                                    var4--;
                                    class317.method2282(false, class198.field3308[var4]);
                                    continue;
                                }
                                if (var549 == 5201) {
                                    class198.field3308[var4++] = class109.method819(arg1 + 320);
                                    continue;
                                }
                                if (var549 == 5205) {
                                    var4--;
                                    class319.method2297(class198.field3308[var4], -1, -1, false, arg1 ^ 0x100);
                                    continue;
                                }
                                if (var549 == 5206) {
                                    var4--;
                                    int var426 = class198.field3308[var4];
                                    class226 var427 = class38.method280((var426 & 0xFFFD04E) >> 14, var426 & 0x3FFF);
                                    if (var427 == null) {
                                        class198.field3308[var4++] = -1;
                                    } else {
                                        class198.field3308[var4++] = var427.field3721;
                                    }
                                    continue;
                                }
                                if (var549 == 5207) {
                                    var4--;
                                    class226 var428 = class38.method287(class198.field3308[var4]);
                                    if (var428 != null && var428.field3725 != null) {
                                        class167.field2790[var3++] = var428.field3725;
                                        continue;
                                    }
                                    class167.field2790[var3++] = "";
                                    continue;
                                }
                                if (var549 == 5208) {
                                    class198.field3308[var4++] = class162.field2723;
                                    class198.field3308[var4++] = class148.field2526;
                                    continue;
                                }
                                if (var549 == 5209) {
                                    class198.field3308[var4++] = class38.field826 + class332.field5303;
                                    class198.field3308[var4++] = class38.field821 + class38.field820 - class206.field3449 - 1;
                                    continue;
                                }
                                if (var549 == 5210) {
                                    var4--;
                                    int var429 = class198.field3308[var4];
                                    class226 var430 = class38.method287(var429);
                                    if (var430 == null) {
                                        class198.field3308[var4++] = 0;
                                        class198.field3308[var4++] = 0;
                                    } else {
                                        class198.field3308[var4++] = class83.method613(268420093, var430.field3732) >> 14;
                                        class198.field3308[var4++] = class83.method613(16383, var430.field3732);
                                    }
                                    continue;
                                }
                                if (var549 == 5211) {
                                    var4--;
                                    int var431 = class198.field3308[var4];
                                    class226 var432 = class38.method287(var431);
                                    if (var432 == null) {
                                        class198.field3308[var4++] = 0;
                                        class198.field3308[var4++] = 0;
                                    } else {
                                        class198.field3308[var4++] = var432.field3728 - var432.field3724;
                                        class198.field3308[var4++] = var432.field3717 - var432.field3722;
                                    }
                                    continue;
                                }
                                if (var549 == 5212) {
                                    class127 var433 = class353.method2514((byte) 123);
                                    if (var433 == null) {
                                        class198.field3308[var4++] = -1;
                                        class198.field3308[var4++] = -1;
                                    } else {
                                        class198.field3308[var4++] = var433.field2219;
                                        int var434 = var433.field2213 << 28 | var433.field2216 + class38.field826 << 14 | class38.field821 + class38.field820 - var433.field2217 - 1;
                                        class198.field3308[var4++] = var434;
                                    }
                                    continue;
                                }
                                if (var549 == 5213) {
                                    class127 var435 = class292.method2070(arg1 ^ 0x16E);
                                    if (var435 == null) {
                                        class198.field3308[var4++] = -1;
                                        class198.field3308[var4++] = -1;
                                    } else {
                                        class198.field3308[var4++] = var435.field2219;
                                        int var436 = class38.field821 + class38.field820 - var435.field2217 - 1 | var435.field2213 << 28 | class38.field826 + var435.field2216 << 14;
                                        class198.field3308[var4++] = var436;
                                    }
                                    continue;
                                }
                                if (var549 == 5214) {
                                    var4--;
                                    int var437 = class198.field3308[var4];
                                    class226 var438 = class251.method1770(-67);
                                    if (var438 != null) {
                                        boolean var439 = var438.method1578((var437 & 0x30B4B491) >> 28, var437 & 0x3FFF, class222.field3668, var437 >> 14 & 0x3FFF, 601);
                                        if (var439) {
                                            class15.method160(class222.field3668[2], (byte) -88, class222.field3668[1]);
                                        }
                                    }
                                    continue;
                                }
                                if (var549 == 5215) {
                                    var4 -= 2;
                                    int var440 = class198.field3308[var4];
                                    int var441 = class198.field3308[var4 + 1];
                                    boolean var442 = false;
                                    class227 var443 = class38.method279((var440 & 0xFFFF45D) >> 14, var440 & 0x3FFF);
                                    for (class226 var444 = (class226) var443.method1580((byte) -126); var444 != null; var444 = (class226) var443.method1586((byte) 50)) {
                                        if (var444.field3721 == var441) {
                                            var442 = true;
                                            break;
                                        }
                                    }
                                    if (var442) {
                                        class198.field3308[var4++] = 1;
                                    } else {
                                        class198.field3308[var4++] = 0;
                                    }
                                    continue;
                                }
                                if (var549 == 5218) {
                                    var4--;
                                    int var445 = class198.field3308[var4];
                                    class226 var446 = class38.method287(var445);
                                    if (var446 == null) {
                                        class198.field3308[var4++] = -1;
                                    } else {
                                        class198.field3308[var4++] = var446.field3718;
                                    }
                                    continue;
                                }
                                if (var549 == 5220) {
                                    class198.field3308[var4++] = class342.field5416 == 100 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 5221) {
                                    var4--;
                                    int var447 = class198.field3308[var4];
                                    class15.method160(var447 & 0x3FFF, (byte) 64, var447 >> 14 & 0x3FFF);
                                    continue;
                                }
                                if (var549 == 5222) {
                                    class226 var448 = class251.method1770(-4);
                                    if (var448 == null) {
                                        class198.field3308[var4++] = -1;
                                        class198.field3308[var4++] = -1;
                                    } else {
                                        boolean var449 = var448.method1576(class38.field826 + class332.field5303, class222.field3668, (byte) 104, class38.field821 + class38.field820 - class206.field3449 - 1);
                                        if (var449) {
                                            class198.field3308[var4++] = class222.field3668[1];
                                            class198.field3308[var4++] = class222.field3668[2];
                                        } else {
                                            class198.field3308[var4++] = -1;
                                            class198.field3308[var4++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var549 == 5223) {
                                    var4 -= 2;
                                    int var450 = class198.field3308[var4];
                                    int var451 = class198.field3308[var4 + 1];
                                    class319.method2297(var450, var451 & 0x3FFF, var451 >> 14 & 0x3FFF, false, arg1 ^ 0x100);
                                    continue;
                                }
                                if (var549 == 5224) {
                                    var4--;
                                    int var452 = class198.field3308[var4];
                                    class226 var453 = class251.method1770(-40);
                                    if (var453 == null) {
                                        class198.field3308[var4++] = -1;
                                        class198.field3308[var4++] = -1;
                                    } else {
                                        boolean var454 = var453.method1578((var452 & 0x3352BCA7) >> 28, var452 & 0x3FFF, class222.field3668, var452 >> 14 & 0x3FFF, 601);
                                        if (var454) {
                                            class198.field3308[var4++] = class222.field3668[1];
                                            class198.field3308[var4++] = class222.field3668[2];
                                        } else {
                                            class198.field3308[var4++] = -1;
                                            class198.field3308[var4++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var549 == 5225) {
                                    var4--;
                                    int var455 = class198.field3308[var4];
                                    class226 var456 = class251.method1770(-92);
                                    if (var456 == null) {
                                        class198.field3308[var4++] = -1;
                                        class198.field3308[var4++] = -1;
                                    } else {
                                        boolean var457 = var456.method1576((var455 & 0xFFFC0B2) >> 14, class222.field3668, (byte) 104, var455 & 0x3FFF);
                                        if (var457) {
                                            class198.field3308[var4++] = class222.field3668[1];
                                            class198.field3308[var4++] = class222.field3668[2];
                                        } else {
                                            class198.field3308[var4++] = -1;
                                            class198.field3308[var4++] = -1;
                                        }
                                    }
                                    continue;
                                }
                                if (var549 == 5226) {
                                    var4--;
                                    class356.method2526(class198.field3308[var4], false);
                                    continue;
                                }
                                if (var549 == 5227) {
                                    var4 -= 2;
                                    int var458 = class198.field3308[var4];
                                    int var459 = class198.field3308[var4 + 1];
                                    class319.method2297(var458, var459 & 0x3FFF, (var459 & 0xFFFC4BD) >> 14, true, 0);
                                    continue;
                                }
                                if (var549 == 5228) {
                                    var4--;
                                    class9.field280 = class198.field3308[var4] == 1;
                                    continue;
                                }
                                if (var549 == 5229) {
                                    class198.field3308[var4++] = class9.field280 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 5230) {
                                    var4--;
                                    int var460 = class198.field3308[var4];
                                    class76.method580(var460, (byte) -95);
                                    continue;
                                }
                                if (var549 == 5231) {
                                    var4 -= 2;
                                    int var461 = class198.field3308[var4];
                                    boolean var462 = class198.field3308[var4 + 1] == 1;
                                    if (class321.field5219 == null) {
                                        continue;
                                    }
                                    class70 var463 = class321.field5219.method2344(arg1 - 257, (long) var461);
                                    if (var463 != null && !var462) {
                                        var463.method535(arg1 ^ 0xFFFFF40F);
                                        continue;
                                    }
                                    if (var463 == null && var462) {
                                        class70 var464 = new class70();
                                        class321.field5219.method2337(var464, 709, (long) var461);
                                    }
                                    continue;
                                }
                                if (var549 == 5232) {
                                    var4--;
                                    int var465 = class198.field3308[var4];
                                    if (class321.field5219 == null) {
                                        class198.field3308[var4++] = 0;
                                    } else {
                                        class70 var466 = class321.field5219.method2344(arg1 - 257, (long) var465);
                                        class198.field3308[var4++] = var466 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var549 == 5233) {
                                    var4 -= 2;
                                    boolean var467 = class198.field3308[var4 + 1] == 1;
                                    int var468 = class198.field3308[var4];
                                    if (class334.field5324 == null) {
                                        continue;
                                    }
                                    class70 var469 = class334.field5324.method2344(arg1 ^ 0xFFFFFEFF, (long) var468);
                                    if (var469 != null && !var467) {
                                        var469.method535(-2801);
                                        continue;
                                    }
                                    if (var469 == null && var467) {
                                        class70 var470 = new class70();
                                        class334.field5324.method2337(var470, 709, (long) var468);
                                    }
                                    continue;
                                }
                                if (var549 == 5234) {
                                    var4--;
                                    int var471 = class198.field3308[var4];
                                    if (class334.field5324 == null) {
                                        class198.field3308[var4++] = 0;
                                    } else {
                                        class70 var472 = class334.field5324.method2344(arg1 - 257, (long) var471);
                                        class198.field3308[var4++] = var472 == null ? 0 : 1;
                                    }
                                    continue;
                                }
                                if (var549 == 5235) {
                                    class198.field3308[var4++] = class38.field829 == null ? -1 : class38.field829.field3721;
                                    continue;
                                }
                            } else if (var549 < 5400) {
                                if (var549 == 5300) {
                                    var4 -= 2;
                                    int var335 = class198.field3308[var4];
                                    int var336 = class198.field3308[var4 + 1];
                                    class145.method986(3, var336, var335, false, false);
                                    class198.field3308[var4++] = class202.field3384 == null ? 0 : 1;
                                    continue;
                                }
                                if (var549 == 5301) {
                                    if (class202.field3384 != null) {
                                        class145.method986(class135.field2318, -1, -1, false, false);
                                    }
                                    continue;
                                }
                                if (var549 == 5302) {
                                    class248[] var337 = class310.method2254(false);
                                    class198.field3308[var4++] = var337.length;
                                    continue;
                                }
                                if (var549 == 5303) {
                                    var4--;
                                    int var338 = class198.field3308[var4];
                                    class248[] var339 = class310.method2254(false);
                                    class198.field3308[var4++] = var339[var338].field4070;
                                    class198.field3308[var4++] = var339[var338].field4073;
                                    continue;
                                }
                                if (var549 == 5305) {
                                    int var340 = class146.field2459;
                                    int var341 = class217.field3616;
                                    int var342 = -1;
                                    class248[] var343 = class310.method2254(false);
                                    for (int var344 = 0; var344 < var343.length; var344++) {
                                        class248 var345 = var343[var344];
                                        if (var345.field4070 == var341 && var345.field4073 == var340) {
                                            var342 = var344;
                                            break;
                                        }
                                    }
                                    class198.field3308[var4++] = var342;
                                    continue;
                                }
                                if (var549 == 5306) {
                                    class198.field3308[var4++] = class292.method2078(16);
                                    continue;
                                }
                                if (var549 == 5307) {
                                    var4--;
                                    int var346 = class198.field3308[var4];
                                    if (var346 < 0 || var346 > 2) {
                                        var346 = 0;
                                    }
                                    class145.method986(var346, -1, -1, false, false);
                                    continue;
                                }
                                if (var549 == 5308) {
                                    class198.field3308[var4++] = class135.field2318;
                                    continue;
                                }
                                if (var549 == 5309) {
                                    var4--;
                                    int var347 = class198.field3308[var4];
                                    if (var347 < 0 || var347 > 2) {
                                        var347 = 0;
                                    }
                                    class135.field2318 = var347;
                                    class235.method1634(class59.field1164, (byte) -47);
                                    continue;
                                }
                            } else if (var549 < 5500) {
                                if (var549 == 5400) {
                                    var3 -= 2;
                                    class319.field5191++;
                                    String var404 = class167.field2790[var3];
                                    String var405 = class167.field2790[var3 + 1];
                                    var4--;
                                    int var406 = class198.field3308[var4];
                                    class51.field1038.method291((byte) 103, 143);
                                    class51.field1038.method1027(class148.method1066(var404, (byte) 57) + (class148.method1066(var405, (byte) 57) + 1), arg1 ^ 0xFFFFB16A);
                                    class51.field1038.method1012(var404, (byte) 67);
                                    class51.field1038.method1012(var405, (byte) 65);
                                    class51.field1038.method1027(var406, -20374);
                                    continue;
                                }
                                if (var549 == 5401) {
                                    var4 -= 2;
                                    class303.field4938[class198.field3308[var4]] = (short) class71.method544(class198.field3308[var4 + 1], 29062);
                                    class355.method2521(arg1 ^ 0xFFFFB995);
                                    class90.method694(3);
                                    class81.method604(arg1 ^ 0xFFFFD1A1);
                                    class200.method1368(0);
                                    class264.method1855(arg1 - 330);
                                    continue;
                                }
                                if (var549 == 5405) {
                                    var4 -= 2;
                                    int var407 = class198.field3308[var4];
                                    int var408 = class198.field3308[var4 + 1];
                                    if (var407 >= 0 && var407 < 2) {
                                        class56.field1101[var407] = new int[var408 << 1][4];
                                    }
                                    continue;
                                }
                                if (var549 == 5406) {
                                    var4 -= 7;
                                    int var409 = class198.field3308[var4 + 1] << 1;
                                    int var410 = class198.field3308[var4];
                                    int var411 = class198.field3308[var4 + 2];
                                    int var412 = class198.field3308[var4 + 3];
                                    int var413 = class198.field3308[var4 + 4];
                                    int var414 = class198.field3308[var4 + 6];
                                    int var415 = class198.field3308[var4 + 5];
                                    if (var410 >= 0 && var410 < 2 && class56.field1101[var410] != null && var409 >= 0 && class56.field1101[var410].length > var409) {
                                        class56.field1101[var410][var409] = new int[] { (class83.method613(268426826, var411) >> 14) * 128, var412, class83.method613(var411, 16383) * 128, var414 };
                                        class56.field1101[var410][var409 + 1] = new int[] { (class83.method613(var413, 268428865) >> 14) * 128, var415, class83.method613(var413, 16383) * 128 };
                                    }
                                    continue;
                                }
                                if (var549 == 5407) {
                                    var4--;
                                    int var416 = class56.field1101[class198.field3308[var4]].length >> 1;
                                    class198.field3308[var4++] = var416;
                                    continue;
                                }
                                if (var549 == 5411) {
                                    if (class202.field3384 != null) {
                                        class145.method986(class135.field2318, -1, -1, false, false);
                                    }
                                    if (class274.field4469 == null) {
                                        class352.method2508(class78.method590(1), arg1 + 1190461, false);
                                    } else {
                                        System.exit(0);
                                    }
                                    continue;
                                }
                                if (var549 == 5419) {
                                    String var417 = "";
                                    if (class267.field4363 != null) {
                                        if (class267.field4363.field3501 == null) {
                                            var417 = class320.method2302(class267.field4363.field3505, -27286);
                                        } else {
                                            var417 = (String) class267.field4363.field3501;
                                        }
                                    }
                                    class167.field2790[var3++] = var417;
                                    continue;
                                }
                                if (var549 == 5420) {
                                    class198.field3308[var4++] = class157.field2662 == 3 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 5421) {
                                    if (class202.field3384 != null) {
                                        class145.method986(class135.field2318, -1, -1, false, false);
                                    }
                                    var3--;
                                    String var418 = class167.field2790[var3];
                                    var4--;
                                    boolean var419 = class198.field3308[var4] == 1;
                                    String var420 = class78.method590(1) + var418;
                                    if (class274.field4469 == null && (!var419 || class157.field2662 == 3 || !class157.field2661.startsWith("win") || class346.field5529)) {
                                        class352.method2508(var420, 1190717, var419);
                                        continue;
                                    }
                                    class83.field1439 = var419;
                                    class331.field5293 = var420;
                                    class234.field3830 = class59.field1164.method1129(var420, arg1 ^ 0x169);
                                    continue;
                                }
                                if (var549 == 5422) {
                                    var3 -= 2;
                                    String var421 = class167.field2790[var3];
                                    String var422 = class167.field2790[var3 + 1];
                                    var4--;
                                    int var423 = class198.field3308[var4];
                                    if (var421.length() > 0) {
                                        if (class338.field5358 == null) {
                                            class338.field5358 = new String[class301.field4898[class141.field2383]];
                                        }
                                        class338.field5358[var423] = var421;
                                    }
                                    if (var422.length() > 0) {
                                        if (class22.field553 == null) {
                                            class22.field553 = new String[class301.field4898[class141.field2383]];
                                        }
                                        class22.field553[var423] = var422;
                                    }
                                    continue;
                                }
                                if (var549 == 5423) {
                                    var3--;
                                    System.out.println(class167.field2790[var3]);
                                    continue;
                                }
                                if (var549 == 5424) {
                                    var4 -= 11;
                                    class255.field4176 = class198.field3308[var4];
                                    class240.field3990 = class198.field3308[var4 + 1];
                                    class291.field4713 = class198.field3308[var4 + 2];
                                    class276.field4496 = class198.field3308[var4 + 3];
                                    class9.field279 = class198.field3308[var4 + 4];
                                    class56.field1098 = class198.field3308[var4 + 5];
                                    class108.field1994 = class198.field3308[var4 + 6];
                                    class222.field3666 = class198.field3308[var4 + 7];
                                    class71.field1297 = class198.field3308[var4 + 8];
                                    class10.field294 = class198.field3308[var4 + 9];
                                    class353.field5638 = class198.field3308[var4 + 10];
                                    class99.field1828.method1401(class9.field279, arg1 - 2945);
                                    class99.field1828.method1401(class56.field1098, -2689);
                                    class99.field1828.method1401(class108.field1994, -2689);
                                    class99.field1828.method1401(class222.field3666, -2689);
                                    class99.field1828.method1401(class71.field1297, -2689);
                                    class170.field2807 = true;
                                    continue;
                                }
                                if (var549 == 5425) {
                                    class271.method1914((byte) -61);
                                    class170.field2807 = false;
                                    continue;
                                }
                                if (var549 == 5426) {
                                    var4--;
                                    class151.field2568 = class198.field3308[var4];
                                    continue;
                                }
                                if (var549 == 5427) {
                                    var4 -= 2;
                                    class284.field4642 = class198.field3308[var4];
                                    class153.field2624 = class198.field3308[var4 + 1];
                                    continue;
                                }
                                if (var549 == 5428) {
                                    var4 -= 2;
                                    int var424 = class198.field3308[var4 + 1];
                                    int var425 = class198.field3308[var4];
                                    class198.field3308[var4++] = class173.method1232(var425, -127, var424) ? 1 : 0;
                                    continue;
                                }
                            } else if (var549 < 5600) {
                                if (var549 == 5500) {
                                    var4 -= 4;
                                    int var387 = class198.field3308[var4];
                                    int var388 = class198.field3308[var4 + 1];
                                    int var389 = class198.field3308[var4 + 2];
                                    int var390 = class198.field3308[var4 + 3];
                                    class287.method2027(var390, (var387 & 0x3FFF) - class21.field543, var388, ((var387 & 0xFFFDFB0) >> 14) - class272.field4426, (byte) -119, false, var389);
                                    continue;
                                }
                                if (var549 == 5501) {
                                    var4 -= 4;
                                    int var391 = class198.field3308[var4];
                                    int var392 = class198.field3308[var4 + 1];
                                    int var393 = class198.field3308[var4 + 2];
                                    int var394 = class198.field3308[var4 + 3];
                                    class356.method2525((var391 & 0x3FFF) - class21.field543, (var391 >> 14 & 0x3FFF) + -class272.field4426, var394, var392, var393, arg1 - 381);
                                    continue;
                                }
                                if (var549 == 5502) {
                                    var4 -= 6;
                                    int var395 = class198.field3308[var4];
                                    if (var395 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class19.field501 = var395;
                                    int var396 = class198.field3308[var4 + 1];
                                    if (class56.field1101[class19.field501].length >> 1 <= var396 + 1) {
                                        throw new RuntimeException();
                                    }
                                    class201.field3375 = var396;
                                    class273.field4457 = 0;
                                    class308.field5027 = class198.field3308[var4 + 2];
                                    class202.field3388 = class198.field3308[var4 + 3];
                                    int var397 = class198.field3308[var4 + 4];
                                    if (var397 >= 2) {
                                        throw new RuntimeException();
                                    }
                                    class272.field4427 = var397;
                                    int var398 = class198.field3308[var4 + 5];
                                    if (var398 + 1 >= class56.field1101[class272.field4427].length >> 1) {
                                        throw new RuntimeException();
                                    }
                                    class98.field1778 = var398;
                                    class69.field1280 = 3;
                                    continue;
                                }
                                if (var549 == 5503) {
                                    class189.method1310(-1);
                                    continue;
                                }
                                if (var549 == 5504) {
                                    var4 -= 2;
                                    class250.method1761(class198.field3308[var4], 1280, class198.field3308[var4 + 1]);
                                    continue;
                                }
                                if (var549 == 5505) {
                                    class198.field3308[var4++] = (int) class87.field1523;
                                    continue;
                                }
                                if (var549 == 5506) {
                                    class198.field3308[var4++] = (int) class354.field5652;
                                    continue;
                                }
                                if (var549 == 5507) {
                                    class347.method2474((byte) -126);
                                    continue;
                                }
                                if (var549 == 5508) {
                                    class55.method473(72);
                                    continue;
                                }
                                if (var549 == 5509) {
                                    class135.method948((byte) 79);
                                    continue;
                                }
                                if (var549 == 5510) {
                                    class162.method1162(arg1 - 191);
                                    continue;
                                }
                                if (var549 == 5511) {
                                    var4--;
                                    int var399 = class198.field3308[var4];
                                    class69.field1280 = 4;
                                    int var400 = (var399 & 0xFFFD938) >> 14;
                                    int var401 = var400 - class272.field4426;
                                    int var402 = var399 & 0x3FFF;
                                    if (var401 < 0) {
                                        var401 = 0;
                                    } else if (var401 >= 104) {
                                        var401 = 104;
                                    }
                                    int var403 = var402 - class21.field543;
                                    if (var403 < 0) {
                                        var403 = 0;
                                    } else if (var403 >= 104) {
                                        var403 = 104;
                                    }
                                    class250.field4114 = var401 * 128 + 64;
                                    class212.field3511 = var403 * 128 + 64;
                                    continue;
                                }
                                if (var549 == 5512) {
                                    class269.method1876(false);
                                    continue;
                                }
                            } else if (var549 < 5700) {
                                if (var549 == 5600) {
                                    var3 -= 2;
                                    String var383 = class167.field2790[var3];
                                    String var384 = class167.field2790[var3 + 1];
                                    var4--;
                                    int var385 = class198.field3308[var4];
                                    if (class334.field5326 == 10 && class299.field4856 == 0 && class6.field124 == 0 && class65.field1234 == 0 && class79.field1407 == 0) {
                                        class171.method1217(var384, var385, var383, true);
                                    }
                                    continue;
                                }
                                if (var549 == 5601) {
                                    class287.method2031((byte) -24);
                                    continue;
                                }
                                if (var549 == 5602) {
                                    if (class6.field124 == 0) {
                                        class11.field363 = -2;
                                    }
                                    continue;
                                }
                                if (var549 == 5603) {
                                    var4 -= 4;
                                    if (class334.field5326 == 10 && class299.field4856 == 0 && class6.field124 == 0 && class65.field1234 == 0 && class79.field1407 == 0) {
                                        class271.method1913(class198.field3308[var4 + 3], 108, class198.field3308[var4], class198.field3308[var4 + 2], class198.field3308[var4 + 1]);
                                    }
                                    continue;
                                }
                                if (var549 == 5604) {
                                    var3--;
                                    if (class334.field5326 == 10 && class299.field4856 == 0 && class6.field124 == 0 && class65.field1234 == 0 && class79.field1407 == 0) {
                                        class140.method966(class167.method1189(0, class167.field2790[var3]), true);
                                    }
                                    continue;
                                }
                                if (var549 == 5605) {
                                    var4 -= 7;
                                    var3 -= 3;
                                    if (class334.field5326 == 10 && class299.field4856 == 0 && class6.field124 == 0 && class65.field1234 == 0 && class79.field1407 == 0) {
                                        class173.method1230(true, class198.field3308[var4 + 2], class198.field3308[var4], class198.field3308[var4 + 1], class167.field2790[var3 + 1], class198.field3308[var4 + 4] == 1, class167.field2790[var3 + 2], class198.field3308[var4 + 3], class198.field3308[var4 + 5] == 1, class167.method1189(arg1 - 256, class167.field2790[var3]), class198.field3308[var4 + 6] == 1);
                                    }
                                    continue;
                                }
                                if (var549 == 5606) {
                                    if (class65.field1234 == 0) {
                                        class46.field927 = -2;
                                    }
                                    continue;
                                }
                                if (var549 == 5607) {
                                    class198.field3308[var4++] = class11.field363;
                                    continue;
                                }
                                if (var549 == 5608) {
                                    class198.field3308[var4++] = class308.field5026;
                                    continue;
                                }
                                if (var549 == 5609) {
                                    class198.field3308[var4++] = class46.field927;
                                    continue;
                                }
                                if (var549 == 5610) {
                                    for (int var386 = 0; var386 < 5; var386++) {
                                        class167.field2790[var3++] = var386 < class331.field5288.length ? class348.method2488(class331.field5288[var386], (byte) 50) : "";
                                    }
                                    class331.field5288 = null;
                                    continue;
                                }
                                if (var549 == 5611) {
                                    class198.field3308[var4++] = class52.field1047;
                                    continue;
                                }
                            } else if (var549 < 6100) {
                                if (var549 == 6001) {
                                    var4--;
                                    int var348 = class198.field3308[var4];
                                    if (var348 < 1) {
                                        var348 = 1;
                                    }
                                    if (var348 > 4) {
                                        var348 = 4;
                                    }
                                    class152.field2601 = var348;
                                    if (!class241.field4016 || !class281.field4606) {
                                        if (class152.field2601 == 1) {
                                            class305.method2216(0.9F);
                                        }
                                        if (class152.field2601 == 2) {
                                            class305.method2216(0.8F);
                                        }
                                        if (class152.field2601 == 3) {
                                            class305.method2216(0.7F);
                                        }
                                        if (class152.field2601 == 4) {
                                            class305.method2216(0.6F);
                                        }
                                    }
                                    if (class241.field4016) {
                                        class215.method1500(-107);
                                        if (!class281.field4606) {
                                            class192.method1334(0);
                                        }
                                    }
                                    class90.method694(3);
                                    class235.method1634(class59.field1164, (byte) 1);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6002) {
                                    var4--;
                                    class127.method910((byte) 17, class198.field3308[var4] == 1);
                                    class91.method699(0);
                                    class192.method1334(arg1 ^ 0x100);
                                    class209.method1445(arg1 ^ 0xFFFFCF21);
                                    class235.method1634(class59.field1164, (byte) -56);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6003) {
                                    var4--;
                                    class166.field2784 = class198.field3308[var4] == 1;
                                    class209.method1445(arg1 ^ 0xFFFFCF21);
                                    class235.method1634(class59.field1164, (byte) -80);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6005) {
                                    var4--;
                                    class349.field5590 = class198.field3308[var4] == 1;
                                    class192.method1334(0);
                                    class235.method1634(class59.field1164, (byte) 9);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6006) {
                                    var4--;
                                    class136.field2333 = class198.field3308[var4] == 1;
                                    ((class7) class305.field4968).method72(28916, !class136.field2333);
                                    class235.method1634(class59.field1164, (byte) -80);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6007) {
                                    var4--;
                                    class53.field1060 = class198.field3308[var4] == 1;
                                    class235.method1634(class59.field1164, (byte) -22);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6008) {
                                    var4--;
                                    class359.field5723 = class198.field3308[var4] == 1;
                                    class235.method1634(class59.field1164, (byte) -64);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6009) {
                                    var4--;
                                    class358.field5697 = class198.field3308[var4] == 1;
                                    class235.method1634(class59.field1164, (byte) 111);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6010) {
                                    var4--;
                                    class252.field4143 = class198.field3308[var4] == 1;
                                    class235.method1634(class59.field1164, (byte) 124);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6011) {
                                    var4--;
                                    int var349 = class198.field3308[var4];
                                    if (var349 < 0 || var349 > 2) {
                                        var349 = 0;
                                    }
                                    class111.field2032 = var349;
                                    class235.method1634(class59.field1164, (byte) 126);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6012) {
                                    if (class241.field4016) {
                                        class109.method815(arg1 - 373, 0, 0);
                                    }
                                    var4--;
                                    class281.field4606 = class198.field3308[var4] == 1;
                                    if (class241.field4016 && class281.field4606) {
                                        class305.method2216(0.7F);
                                    } else {
                                        if (class152.field2601 == 1) {
                                            class305.method2216(0.9F);
                                        }
                                        if (class152.field2601 == 2) {
                                            class305.method2216(0.8F);
                                        }
                                        if (class152.field2601 == 3) {
                                            class305.method2216(0.7F);
                                        }
                                        if (class152.field2601 == 4) {
                                            class305.method2216(0.6F);
                                        }
                                    }
                                    class192.method1334(0);
                                    class235.method1634(class59.field1164, (byte) 121);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6014) {
                                    var4--;
                                    class68.field1254 = class198.field3308[var4] == 1;
                                    if (class241.field4016) {
                                        class192.method1334(0);
                                    }
                                    class235.method1634(class59.field1164, (byte) 102);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6015) {
                                    var4--;
                                    class264.field4330 = class198.field3308[var4] == 1;
                                    if (class241.field4016) {
                                        class215.method1500(arg1 ^ 0xFFFFFE95);
                                    }
                                    class235.method1634(class59.field1164, (byte) 118);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6016) {
                                    var4--;
                                    int var350 = class198.field3308[var4];
                                    if (class241.field4016) {
                                        class284.field4635 = true;
                                    }
                                    if (var350 < 0 || var350 > 2) {
                                        var350 = 0;
                                    }
                                    class117.field2083 = var350;
                                    continue;
                                }
                                if (var549 == 6017) {
                                    var4--;
                                    class277.field4519 = class198.field3308[var4] == 1;
                                    class185.method1302((byte) 105);
                                    class235.method1634(class59.field1164, (byte) -46);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6018) {
                                    var4--;
                                    int var351 = class198.field3308[var4];
                                    if (var351 < 0) {
                                        var351 = 0;
                                    }
                                    if (var351 > 127) {
                                        var351 = 127;
                                    }
                                    class8.field268 = var351;
                                    class235.method1634(class59.field1164, (byte) -32);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6019) {
                                    var4--;
                                    int var352 = class198.field3308[var4];
                                    if (var352 < 0) {
                                        var352 = 0;
                                    }
                                    if (var352 > 255) {
                                        var352 = 255;
                                    }
                                    if (class52.field1045 != var352) {
                                        if (class52.field1045 == 0 && class131.field2259 != -1) {
                                            class332.method2350(76, class131.field2259, var352, false, 0, class112.field2043);
                                            class291.field4720 = false;
                                        } else if (var352 == 0) {
                                            class65.method520(-64);
                                            class291.field4720 = false;
                                        } else {
                                            class287.method2028(var352, 5);
                                        }
                                        class52.field1045 = var352;
                                    }
                                    class235.method1634(class59.field1164, (byte) 121);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6020) {
                                    var4--;
                                    int var353 = class198.field3308[var4];
                                    if (var353 < 0) {
                                        var353 = 0;
                                    }
                                    if (var353 > 127) {
                                        var353 = 127;
                                    }
                                    class30.field706 = var353;
                                    class235.method1634(class59.field1164, (byte) 0);
                                    class224.field3696 = false;
                                    continue;
                                }
                                if (var549 == 6021) {
                                    var4--;
                                    class224.field3700 = class198.field3308[var4] == 1;
                                    class209.method1445(-12767);
                                    continue;
                                }
                                if (var549 == 6023) {
                                    boolean var354 = false;
                                    var4--;
                                    int var355 = class198.field3308[var4];
                                    if (var355 < 0) {
                                        var355 = 0;
                                    }
                                    if (var355 > 2) {
                                        var355 = 2;
                                    }
                                    if (class58.field1148 < 96) {
                                        var355 = 0;
                                        var354 = true;
                                    }
                                    class214.method1488(var355);
                                    class235.method1634(class59.field1164, (byte) 5);
                                    class224.field3696 = false;
                                    class198.field3308[var4++] = var354 ? 0 : 1;
                                    continue;
                                }
                                if (var549 == 6024) {
                                    var4--;
                                    int var356 = class198.field3308[var4];
                                    if (var356 < 0 || var356 > 2) {
                                        var356 = 0;
                                    }
                                    class178.field2937 = var356;
                                    class235.method1634(class59.field1164, (byte) 122);
                                    continue;
                                }
                                if (var549 == 6027) {
                                    var4--;
                                    int var357 = class198.field3308[var4];
                                    if (!class241.field4016) {
                                        continue;
                                    }
                                    if (var357 < 0 || var357 > 1) {
                                        var357 = 0;
                                    }
                                    class194.method1342(arg1 ^ 0xFFFFFE8B, var357 == 1);
                                    continue;
                                }
                                if (var549 == 6028) {
                                    var4--;
                                    class115.field2080 = class198.field3308[var4] != 0;
                                    class235.method1634(class59.field1164, (byte) 105);
                                    continue;
                                }
                            } else if (var549 < 6200) {
                                if (var549 == 6101) {
                                    class198.field3308[var4++] = class152.field2601;
                                    continue;
                                }
                                if (var549 == 6102) {
                                    class198.field3308[var4++] = class14.method137(256) ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6103) {
                                    class198.field3308[var4++] = class166.field2784 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6105) {
                                    class198.field3308[var4++] = class349.field5590 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6106) {
                                    class198.field3308[var4++] = class136.field2333 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6107) {
                                    class198.field3308[var4++] = class53.field1060 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6108) {
                                    class198.field3308[var4++] = class359.field5723 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6109) {
                                    class198.field3308[var4++] = class358.field5697 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6110) {
                                    class198.field3308[var4++] = class252.field4143 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6111) {
                                    class198.field3308[var4++] = class111.field2032;
                                    continue;
                                }
                                if (var549 == 6112) {
                                    class198.field3308[var4++] = class281.field4606 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6114) {
                                    class198.field3308[var4++] = class68.field1254 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6115) {
                                    class198.field3308[var4++] = class264.field4330 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6116) {
                                    class198.field3308[var4++] = class117.field2083;
                                    continue;
                                }
                                if (var549 == 6117) {
                                    class198.field3308[var4++] = class277.field4519 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6118) {
                                    class198.field3308[var4++] = class8.field268;
                                    continue;
                                }
                                if (var549 == 6119) {
                                    class198.field3308[var4++] = class52.field1045;
                                    continue;
                                }
                                if (var549 == 6120) {
                                    class198.field3308[var4++] = class30.field706;
                                    continue;
                                }
                                if (var549 == 6121) {
                                    if (class241.field4016) {
                                        class198.field3308[var4++] = class241.field4022 ? 1 : 0;
                                    } else {
                                        class198.field3308[var4++] = 0;
                                    }
                                    continue;
                                }
                                if (var549 == 6123) {
                                    class198.field3308[var4++] = class214.method1489();
                                    continue;
                                }
                                if (var549 == 6124) {
                                    class198.field3308[var4++] = class178.field2937;
                                    continue;
                                }
                                if (var549 == 6126) {
                                    if (class241.field4016) {
                                        class198.field3308[var4++] = class163.method1171() ? 1 : 0;
                                    } else {
                                        class198.field3308[var4++] = 0;
                                    }
                                    continue;
                                }
                                if (var549 == 6127) {
                                    class198.field3308[var4++] = class133.field2281 ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6128) {
                                    class198.field3308[var4++] = class115.field2080 ? 1 : 0;
                                    continue;
                                }
                            } else if (var549 < 6300) {
                                if (var549 == 6200) {
                                    var4 -= 2;
                                    class1.field45 = (short) class198.field3308[var4];
                                    if (class1.field45 <= 0) {
                                        class1.field45 = 256;
                                    }
                                    class209.field3498 = (short) class198.field3308[var4 + 1];
                                    if (class209.field3498 <= 0) {
                                        class209.field3498 = 205;
                                    }
                                    continue;
                                }
                                if (var549 == 6201) {
                                    var4 -= 2;
                                    class47.field953 = (short) class198.field3308[var4];
                                    if (class47.field953 <= 0) {
                                        class47.field953 = 256;
                                    }
                                    class182.field3155 = (short) class198.field3308[var4 + 1];
                                    if (class182.field3155 <= 0) {
                                        class182.field3155 = 320;
                                    }
                                    continue;
                                }
                                if (var549 == 6202) {
                                    var4 -= 4;
                                    class311.field5062 = (short) class198.field3308[var4];
                                    if (class311.field5062 <= 0) {
                                        class311.field5062 = 1;
                                    }
                                    class142.field2399 = (short) class198.field3308[var4 + 1];
                                    if (class142.field2399 <= 0) {
                                        class142.field2399 = 32767;
                                    } else if (class142.field2399 < class311.field5062) {
                                        class142.field2399 = class311.field5062;
                                    }
                                    class338.field5357 = (short) class198.field3308[var4 + 2];
                                    if (class338.field5357 <= 0) {
                                        class338.field5357 = 1;
                                    }
                                    class363.field5746 = (short) class198.field3308[var4 + 3];
                                    if (class363.field5746 <= 0) {
                                        class363.field5746 = 32767;
                                    } else if (class363.field5746 < class338.field5357) {
                                        class363.field5746 = class338.field5357;
                                    }
                                    continue;
                                }
                                if (var549 == 6203) {
                                    class73.method553(class338.field5359.field3024, class338.field5359.field2972, 0, 0, false, (byte) -67);
                                    class198.field3308[var4++] = class319.field5194;
                                    class198.field3308[var4++] = class269.field4376;
                                    continue;
                                }
                                if (var549 == 6204) {
                                    class198.field3308[var4++] = class47.field953;
                                    class198.field3308[var4++] = class182.field3155;
                                    continue;
                                }
                                if (var549 == 6205) {
                                    class198.field3308[var4++] = class1.field45;
                                    class198.field3308[var4++] = class209.field3498;
                                    continue;
                                }
                            } else if (var549 < 6400) {
                                if (var549 == 6300) {
                                    class198.field3308[var4++] = (int) (class218.method1520((byte) 38) / 60000L);
                                    continue;
                                }
                                if (var549 == 6301) {
                                    class198.field3308[var4++] = (int) (class218.method1520((byte) 81) / 86400000L) - 11745;
                                    continue;
                                }
                                if (var549 == 6302) {
                                    var4 -= 3;
                                    int var358 = class198.field3308[var4 + 1];
                                    int var359 = class198.field3308[var4];
                                    int var360 = class198.field3308[var4 + 2];
                                    class65.field1232.clear();
                                    class65.field1232.set(11, 12);
                                    class65.field1232.set(var360, var358, var359);
                                    class198.field3308[var4++] = (int) (class65.field1232.getTime().getTime() / 86400000L) - 11745;
                                    continue;
                                }
                                if (var549 == 6303) {
                                    class65.field1232.clear();
                                    class65.field1232.setTime(new Date(class218.method1520((byte) 88)));
                                    class198.field3308[var4++] = class65.field1232.get(1);
                                    continue;
                                }
                                if (var549 == 6304) {
                                    boolean var361 = true;
                                    var4--;
                                    int var362 = class198.field3308[var4];
                                    if (var362 < 0) {
                                        var361 = (var362 + 1) % 4 == 0;
                                    } else if (var362 < 1582) {
                                        var361 = (var362 % 4) == 0;
                                    } else if (var362 % 4 != 0) {
                                        var361 = false;
                                    } else if (var362 % 100 != 0) {
                                        var361 = true;
                                    } else if (var362 % 400 != 0) {
                                        var361 = false;
                                    }
                                    class198.field3308[var4++] = var361 ? 1 : 0;
                                    continue;
                                }
                            } else if (var549 < 6500) {
                                if (var549 == 6405) {
                                    class198.field3308[var4++] = class153.method1089(0) ? 1 : 0;
                                    continue;
                                }
                                if (var549 == 6406) {
                                    class198.field3308[var4++] = class300.method2148(arg1 - 254) ? 1 : 0;
                                    continue;
                                }
                            } else if (var549 < 6600) {
                                if (var549 == 6500) {
                                    if (class334.field5326 == 10 && class299.field4856 == 0 && class6.field124 == 0 && class65.field1234 == 0) {
                                        class198.field3308[var4++] = class234.method1630(-4) == -1 ? 0 : 1;
                                        continue;
                                    }
                                    class198.field3308[var4++] = 1;
                                    continue;
                                }
                                if (var549 == 6501) {
                                    class191 var371 = class223.method1559(arg1 - 252);
                                    if (var371 == null) {
                                        class198.field3308[var4++] = -1;
                                        class198.field3308[var4++] = 0;
                                        class167.field2790[var3++] = "";
                                        class198.field3308[var4++] = 0;
                                        class167.field2790[var3++] = "";
                                        class198.field3308[var4++] = 0;
                                    } else {
                                        class198.field3308[var4++] = var371.field3237;
                                        class198.field3308[var4++] = var371.field3625;
                                        class167.field2790[var3++] = var371.field3240;
                                        class194 var372 = var371.method1324(arg1 - 1482558239);
                                        class198.field3308[var4++] = var372.field3259;
                                        class167.field2790[var3++] = var372.field3269;
                                        class198.field3308[var4++] = var371.field3615;
                                    }
                                    continue;
                                }
                                if (var549 == 6502) {
                                    class191 var373 = class129.method919(121);
                                    if (var373 == null) {
                                        class198.field3308[var4++] = -1;
                                        class198.field3308[var4++] = 0;
                                        class167.field2790[var3++] = "";
                                        class198.field3308[var4++] = 0;
                                        class167.field2790[var3++] = "";
                                        class198.field3308[var4++] = 0;
                                    } else {
                                        class198.field3308[var4++] = var373.field3237;
                                        class198.field3308[var4++] = var373.field3625;
                                        class167.field2790[var3++] = var373.field3240;
                                        class194 var374 = var373.method1324(-1482557983);
                                        class198.field3308[var4++] = var374.field3259;
                                        class167.field2790[var3++] = var374.field3269;
                                        class198.field3308[var4++] = var373.field3615;
                                    }
                                    continue;
                                }
                                if (var549 == 6503) {
                                    var4--;
                                    int var375 = class198.field3308[var4];
                                    if (class334.field5326 == 10 && class299.field4856 == 0 && class6.field124 == 0 && class65.field1234 == 0) {
                                        class198.field3308[var4++] = class358.method2529(var375, -1) ? 1 : 0;
                                        continue;
                                    }
                                    class198.field3308[var4++] = 0;
                                    continue;
                                }
                                if (var549 == 6504) {
                                    var4--;
                                    class97.field1761 = class198.field3308[var4];
                                    class235.method1634(class59.field1164, (byte) 97);
                                    continue;
                                }
                                if (var549 == 6505) {
                                    class198.field3308[var4++] = class97.field1761;
                                    continue;
                                }
                                if (var549 == 6506) {
                                    var4--;
                                    int var376 = class198.field3308[var4];
                                    class191 var377 = class303.method2166(123, var376);
                                    if (var377 == null) {
                                        class198.field3308[var4++] = -1;
                                        class167.field2790[var3++] = "";
                                        class198.field3308[var4++] = 0;
                                        class167.field2790[var3++] = "";
                                        class198.field3308[var4++] = 0;
                                    } else {
                                        class198.field3308[var4++] = var377.field3625;
                                        class167.field2790[var3++] = var377.field3240;
                                        class194 var378 = var377.method1324(arg1 ^ 0xA7A1F4E1);
                                        class198.field3308[var4++] = var378.field3259;
                                        class167.field2790[var3++] = var378.field3269;
                                        class198.field3308[var4++] = var377.field3615;
                                    }
                                    continue;
                                }
                                if (var549 == 6507) {
                                    var4 -= 4;
                                    int var379 = class198.field3308[var4];
                                    boolean var380 = class198.field3308[var4 + 1] == 1;
                                    int var381 = class198.field3308[var4 + 2];
                                    boolean var382 = class198.field3308[var4 + 3] == 1;
                                    class352.method2511(var379, var381, (byte) 122, var382, var380);
                                    continue;
                                }
                            } else if (var549 < 6700) {
                                if (var549 == 6600) {
                                    var4--;
                                    class151.field2559 = class198.field3308[var4] == 1;
                                    class235.method1634(class59.field1164, (byte) 124);
                                    continue;
                                }
                                if (var549 == 6601) {
                                    class198.field3308[var4++] = class151.field2559 ? 1 : 0;
                                    continue;
                                }
                            } else if (var549 < 6900) {
                                if (var549 == 6800) {
                                    var4--;
                                    int var363 = class198.field3308[var4];
                                    class1 var364 = class125.method901(var363, (byte) -71);
                                    if (var364.field15 == null) {
                                        class167.field2790[var3++] = "";
                                    } else {
                                        class167.field2790[var3++] = var364.field15;
                                    }
                                    continue;
                                }
                                if (var549 == 6801) {
                                    var4--;
                                    int var365 = class198.field3308[var4];
                                    class1 var366 = class125.method901(var365, (byte) -121);
                                    class198.field3308[var4++] = var366.field16;
                                    continue;
                                }
                                if (var549 == 6802) {
                                    var4--;
                                    int var367 = class198.field3308[var4];
                                    class1 var368 = class125.method901(var367, (byte) -9);
                                    class198.field3308[var4++] = var368.field35;
                                    continue;
                                }
                                if (var549 == 6803) {
                                    var4--;
                                    int var369 = class198.field3308[var4];
                                    class1 var370 = class125.method901(var369, (byte) 109);
                                    class198.field3308[var4++] = var370.field13;
                                    continue;
                                }
                            }
                        } else if (var549 == 4400) {
                            var4 -= 2;
                            int var473 = class198.field3308[var4];
                            int var474 = class198.field3308[var4 + 1];
                            class321 var475 = class346.method2467(var474, 11);
                            if (var475.method2311(114)) {
                                class167.field2790[var3++] = class1.method7(var473, 25).method1665(31130, var474, var475.field5222);
                            } else {
                                class198.field3308[var4++] = class1.method7(var473, 25).method1664(class115.method856(arg1, 256), var474, var475.field5223);
                            }
                            continue;
                        }
                    } else if (var549 == 4300) {
                        var4 -= 2;
                        int var476 = class198.field3308[var4 + 1];
                        int var477 = class198.field3308[var4];
                        class321 var478 = class346.method2467(var476, 11);
                        if (var478.method2311(95)) {
                            class167.field2790[var3++] = class133.method934(var477, (byte) 117).method679(var478.field5222, false, var476);
                        } else {
                            class198.field3308[var4++] = class133.method934(var477, (byte) 118).method668(-65536, var478.field5223, var476);
                        }
                        continue;
                    }
                } else {
                    class181 var65;
                    if (var549 >= 2000) {
                        var10000 = arg1 - 377;
                        var4--;
                        var65 = class224.method1564(var10000, class198.field3308[var4]);
                        var549 -= 1000;
                    } else {
                        var65 = var38 ? class115.field2071 : class146.field2471;
                    }
                    if (var549 == 1300) {
                        var4--;
                        int var66 = class198.field3308[var4] - 1;
                        if (var66 >= 0 && var66 <= 9) {
                            var3--;
                            var65.method1267(var66, (byte) 95, class167.field2790[var3]);
                            continue;
                        }
                        var3--;
                        continue;
                    }
                    if (var549 == 1301) {
                        var4 -= 2;
                        int var67 = class198.field3308[var4 + 1];
                        int var68 = class198.field3308[var4];
                        var65.field3045 = class204.method1392(var68, arg1 - 255, var67);
                        continue;
                    }
                    if (var549 == 1302) {
                        var4--;
                        var65.field3140 = class198.field3308[var4] == 1;
                        continue;
                    }
                    if (var549 == 1303) {
                        var4--;
                        var65.field3068 = class198.field3308[var4];
                        continue;
                    }
                    if (var549 == 1304) {
                        var4--;
                        var65.field3013 = class198.field3308[var4];
                        continue;
                    }
                    if (var549 == 1305) {
                        var3--;
                        var65.field3119 = class167.field2790[var3];
                        continue;
                    }
                    if (var549 == 1306) {
                        var3--;
                        var65.field3122 = class167.field2790[var3];
                        continue;
                    }
                    if (var549 == 1307) {
                        var65.field3144 = null;
                        continue;
                    }
                    if (var549 == 1308) {
                        var4--;
                        var65.field3108 = class198.field3308[var4];
                        var4--;
                        var65.field2990 = class198.field3308[var4];
                        continue;
                    }
                    if (var549 == 1309) {
                        var4--;
                        int var69 = class198.field3308[var4];
                        var4--;
                        int var70 = class198.field3308[var4];
                        if (var70 >= 1 && var70 <= 10) {
                            var65.method1272(var69, var70 - 1, arg1 + -257);
                        }
                        continue;
                    }
                    if (var549 == 1310) {
                        var3--;
                        var65.field3120 = class167.field2790[var3];
                        continue;
                    }
                }
                throw new IllegalStateException();
            }
        } catch (Exception var548) {
            if (arg0.field5610 == null) {
                if (class39.field848 != 0) {
                    class172.method1225("Clientscript error - check log for details", 0);
                }
                class348.method2493(arg1 - 26956, var548, "CS2 - scr:" + arg0.field1291 + " op:" + var8);
            } else {
                StringBuffer var545 = new StringBuffer(30);
                var545.append("%0a - in: ").append(arg0.field5610);
                for (int var546 = class321.field5215 - 1; var546 >= 0; var546--) {
                    var545.append("%0a - via: ").append(class88.field1539[var546].field2159.field5610);
                }
                if (var8 == 40) {
                    int var547 = var7[var5];
                    var545.append("%0a - non-existant gosub script-num: ").append(Integer.toString(var547));
                }
                if (class39.field848 != 0) {
                    class172.method1225("Clientscript error in: " + arg0.field5610, 0);
                }
                class348.method2493(-26700, var548, "CS2 - scr:" + arg0.field1291 + " op:" + var8 + var545.toString());
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 6772)
    private static final void method444(String arg0, int arg1) {
        field1031++;
        if (arg0 == null) {
            return;
        }
        if (!(class151.field2550 < 100 || class151.field2571) || class151.field2550 >= 200) {
            class172.method1225(class362.field5732, 0);
            return;
        }
        String var2 = class310.method2259(arg0, -64);
        if (var2 == null) {
            return;
        }
        for (int var3 = arg1; var3 < class151.field2550; var3++) {
            String var4 = class310.method2259(class91.field1610[var3], arg1 - 107);
            if (var4 != null && var4.equals(var2)) {
                class172.method1225(arg0 + class144.field2419, 0);
                return;
            }
            if (class18.field499[var3] != null) {
                String var5 = class310.method2259(class18.field499[var3], arg1 - 103);
                if (var5 != null && var5.equals(var2)) {
                    class172.method1225(arg0 + class144.field2419, 0);
                    return;
                }
            }
        }
        for (int var6 = 0; var6 < class317.field5171; var6++) {
            String var7 = class310.method2259(class306.field4974[var6], -21);
            if (var7 != null && var7.equals(var2)) {
                class172.method1225(class19.field514 + arg0 + class160.field2710, 0);
                return;
            }
            if (class178.field2945[var6] != null) {
                String var8 = class310.method2259(class178.field2945[var6], -102);
                if (var8 != null && var8.equals(var2)) {
                    class172.method1225(class19.field514 + arg0 + class160.field2710, arg1);
                    return;
                }
            }
        }
        if (class310.method2259(class96.field1750.field1779, -32).equals(var2)) {
            class172.method1225(class174.field2893, 0);
        } else {
            class91.field1621++;
            class51.field1038.method291((byte) -78, 7);
            class51.field1038.method1027(class148.method1066(arg0, (byte) 57), -20374);
            class51.field1038.method1012(arg0, (byte) 54);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(IZIZIII)V", line = 6866)
    public static final void method445(int arg0, boolean arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
        if (arg2 < arg6) {
            int var7 = (arg2 + arg6) / 2;
            class191 var8 = class162.field2728[var7];
            class162.field2728[var7] = class162.field2728[arg6];
            int var9 = arg2;
            class162.field2728[arg6] = var8;
            for (int var10 = arg2; var10 < arg6; var10++) {
                if (class240.method1678(arg1, class162.field2728[var10], (byte) 48, arg3, arg5, var8, arg4) <= 0) {
                    class191 var11 = class162.field2728[var10];
                    class162.field2728[var10] = class162.field2728[var9];
                    class162.field2728[var9++] = var11;
                }
            }
            class162.field2728[arg6] = class162.field2728[var9];
            class162.field2728[var9] = var8;
            method445(127, arg1, arg2, arg3, arg4, arg5, var9 - 1);
            method445(127, arg1, var9 + 1, arg3, arg4, arg5, arg6);
        }
        if (arg0 <= 126) {
            field1033 = -29;
        }
        field1036++;
    }

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "(I)V", line = 6914)
    public static void method446(int arg0) {
        if (arg0 == -5101) {
            field1032 = null;
        }
    }

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "(I)I", line = 6926)
    public final int method447(int arg0) {
        if (arg0 != -20913) {
            method444((String) null, 107);
        }
        field1035++;
        return this.field1030 == null ? 0 : this.field1030.field2435 * 100 / (this.field1030.field2496.length - this.field1028);
    }
}
