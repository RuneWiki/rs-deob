import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!la")
public class class121 {

    @OriginalMember(owner = "client!la", name = "b", descriptor = "[Li;")
    public static class88[] field2208 = new class88[100];

    @OriginalMember(owner = "client!la", name = "c", descriptor = "I")
    public int field2209;

    @OriginalMember(owner = "client!la", name = "d", descriptor = "I")
    public int field2210;

    @OriginalMember(owner = "client!la", name = "e", descriptor = "I")
    public int field2211;

    @OriginalMember(owner = "client!la", name = "f", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!la", name = "g", descriptor = "I")
    public int field2213;

    @OriginalMember(owner = "client!la", name = "h", descriptor = "I")
    public int field2214;

    @OriginalMember(owner = "client!la", name = "i", descriptor = "I")
    public static int field2215;

    @OriginalMember(owner = "client!la", name = "j", descriptor = "I")
    public static int field2216;

    @OriginalMember(owner = "client!la", name = "k", descriptor = "I")
    public int field2217;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "[B")
    public byte[] field2207;

    @OriginalMember(owner = "client!la", name = "l", descriptor = "[B")
    public byte[] field2218;

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(Lq;IIBI)V")
    public static final void method826(class174 arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 58) {
            method826(null, -32, 17, (byte) 37, -38);
        }
        class219.method1481(2);
        field2216++;
        class72.method480(arg2, arg4, arg2 + arg0.field3382, arg0.field3424 + arg4);
        if (class247.field4514 == 2 || class247.field4514 == 5) {
            class72.method491(arg2, arg4, 0, arg0.field3404, arg0.field3423);
        } else {
            int var5 = class52.field943 + class207.field3932 & 0x7FF;
            int var6 = 464 - class240.field4458.field4123 / 32;
            int var7 = class240.field4458.field4138 / 32 + 48;
            ((class169) class110.field2012).method1178(arg2, arg4, arg0.field3382, arg0.field3424, var7, var6, var5, class65.field1185 + 256, arg0.field3404, arg0.field3423);
            for (int var8 = 0; var8 < class50.field930; var8++) {
                int var41 = class139.field2579[var8] * 4 + 2 - class240.field4458.field4138 / 32;
                int var42 = class134.field2503[var8] * 4 + 2 - class240.field4458.field4123 / 32;
                class148 var43 = class190.method1323(class146.field2747[var8], -12450);
                if (var43.field2772 != null) {
                    var43 = var43.method1000((byte) 126);
                    if (var43 == null || var43.field2819 == -1) {
                        continue;
                    }
                }
                class57.method418(arg4, arg2, arg3 + 13423, var42, arg0, class247.field4527[var43.field2819], var41);
            }
            for (int var9 = 0; var9 < 104; var9++) {
                for (int var37 = 0; var37 < 104; var37++) {
                    class248 var38 = class134.field2499[class149.field2909][var9][var37];
                    if (var38 != null) {
                        int var39 = var9 * 4 + 2 - class240.field4458.field4138 / 32;
                        int var40 = var37 * 4 + 2 - class240.field4458.field4123 / 32;
                        class57.method418(arg4, arg2, 13481, var40, arg0, class35.field597[0], var39);
                    }
                }
            }
            for (int var10 = 0; var10 < class55.field1041; var10++) {
                class191 var33 = class225.field4225[class25.field402[var10]];
                if (var33 != null && var33.method287(arg3 ^ 0xFFFFFFC5)) {
                    class126 var34 = var33.field3684;
                    if (var34 != null && var34.field2329 != null) {
                        var34 = var34.method864((byte) 90);
                    }
                    if (var34 != null && var34.field2359 && var34.field2361) {
                        int var35 = var33.field4123 / 32 - class240.field4458.field4123 / 32;
                        int var36 = var33.field4138 / 32 - class240.field4458.field4138 / 32;
                        class57.method418(arg4, arg2, 13481, var35, arg0, class35.field597[1], var36);
                    }
                }
            }
            for (int var11 = 0; var11 < class55.field1027; var11++) {
                class44 var25 = class244.field4493[class174.field3430[var11]];
                if (var25 != null && var25.method287(arg3 - 59)) {
                    int var26 = var25.field4138 / 32 - class240.field4458.field4138 / 32;
                    int var27 = var25.field4123 / 32 - class240.field4458.field4123 / 32;
                    boolean var28 = false;
                    long var29 = var25.field766.method630(false);
                    for (int var31 = 0; var31 < class146.field2731; var31++) {
                        if (class115.field2088[var31] == var29 && class160.field3094[var31] != 0) {
                            var28 = true;
                            break;
                        }
                    }
                    boolean var32 = false;
                    if (class240.field4458.field752 != 0 && var25.field752 != 0 && class240.field4458.field752 == var25.field752) {
                        var32 = true;
                    }
                    if (var28) {
                        class57.method418(arg4, arg2, 13481, var27, arg0, class35.field597[3], var26);
                    } else if (var32) {
                        class57.method418(arg4, arg2, 13481, var27, arg0, class35.field597[4], var26);
                    } else {
                        class57.method418(arg4, arg2, arg3 + 13423, var27, arg0, class35.field597[2], var26);
                    }
                }
            }
            class118[] var12 = class64.field1171;
            for (int var13 = 0; var13 < var12.length; var13++) {
                class118 var16 = var12[var13];
                if (var16 != null && var16.field2141 != 0 && class117.field2115 % 20 < 10) {
                    if (var16.field2141 == 1 && var16.field2148 >= 0 && var16.field2148 < class225.field4225.length) {
                        class191 var17 = class225.field4225[var16.field2148];
                        if (var17 != null) {
                            int var18 = var17.field4138 / 32 - class240.field4458.field4138 / 32;
                            int var19 = var17.field4123 / 32 - class240.field4458.field4123 / 32;
                            class241.method1590(arg0, var18, arg4, var19, var16.field2139, (byte) 127, arg2);
                        }
                    }
                    if (var16.field2141 == 2) {
                        int var20 = (var16.field2140 - class223.field4214) * 4 + 2 - class240.field4458.field4138 / 32;
                        int var21 = (var16.field2137 - class190.field3681) * 4 + 2 - class240.field4458.field4123 / 32;
                        class241.method1590(arg0, var20, arg4, var21, var16.field2139, (byte) 127, arg2);
                    }
                    if (var16.field2141 == 10 && var16.field2148 >= 0 && var16.field2148 < class244.field4493.length) {
                        class44 var22 = class244.field4493[var16.field2148];
                        if (var22 != null) {
                            int var23 = var22.field4138 / 32 - class240.field4458.field4138 / 32;
                            int var24 = var22.field4123 / 32 - class240.field4458.field4123 / 32;
                            class241.method1590(arg0, var23, arg4, var24, var16.field2139, (byte) 127, arg2);
                        }
                    }
                }
            }
            if (class116.field2104 != 0) {
                int var14 = class140.field2596 * 4 + 2 - class240.field4458.field4123 / 32;
                int var15 = class116.field2104 * 4 + 2 - class240.field4458.field4138 / 32;
                class57.method418(arg4, arg2, 13481, var14, arg0, class200.field3828, var15);
            }
            class72.method478(arg0.field3382 / 2 + arg2 - 1, arg4 - -(arg0.field3424 / 2) + -1, 3, 3, 16777215);
        }
        class211.field4007[arg1] = true;
    }

    @OriginalMember(owner = "client!la", name = "a", descriptor = "(I)V")
    public static void method827(int arg0) {
        field2208 = null;
        if (arg0 != 0) {
            method827(-30);
        }
    }
}
