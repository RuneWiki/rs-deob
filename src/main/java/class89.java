import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class89 {

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "J")
    public static long field1500 = 0L;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "I")
    public static int field1499;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "I")
    public static int field1503;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field1504;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field1502;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIIIII)V", line = 9)
    public static final void method703(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1504++;
        class3.method9(arg6, true);
        int var7 = 0;
        if (arg5 != -23493) {
            return;
        }
        int var8 = arg6 - arg3;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg6;
        int var10 = var8;
        int var11 = -1;
        int var12 = -var8;
        int var13 = -arg6;
        int var14 = -1;
        int[] var15 = class353.field5599[arg0];
        int var16 = arg1 - var8;
        class161.method1253(var16, var15, arg5 + 23492, arg4, arg1 - arg6);
        int var17 = arg1 + var8;
        class161.method1253(var17, var15, -1, arg2, var16);
        class161.method1253(arg1 + arg6, var15, arg5 + 23492, arg4, var17);
        while (var9 > var7) {
            var14 += 2;
            var11 += 2;
            var13 += var11;
            var12 += var14;
            if (var12 >= 0 && var10 >= 1) {
                class280.field4600[var10] = var7;
                var10--;
                var12 -= var10 << 1;
            }
            var7++;
            if (var13 >= 0) {
                var9--;
                if (var9 >= var8) {
                    int[] var18 = class353.field5599[arg0 + var9];
                    int var19 = arg1 + var7;
                    int[] var20 = class353.field5599[arg0 - var9];
                    int var21 = arg1 - var7;
                    class161.method1253(var19, var18, arg5 + 23492, arg4, var21);
                    class161.method1253(var19, var20, -1, arg4, var21);
                } else {
                    int[] var22 = class353.field5599[arg0 - var9];
                    int[] var23 = class353.field5599[arg0 + var9];
                    int var24 = class280.field4600[var9];
                    int var25 = arg1 - var7;
                    int var26 = arg1 + var7;
                    int var27 = arg1 + var24;
                    int var28 = arg1 - var24;
                    class161.method1253(var28, var23, -1, arg4, var25);
                    class161.method1253(var27, var23, -1, arg2, var28);
                    class161.method1253(var26, var23, -1, arg4, var27);
                    class161.method1253(var28, var22, -1, arg4, var25);
                    class161.method1253(var27, var22, -1, arg2, var28);
                    class161.method1253(var26, var22, -1, arg4, var27);
                }
                var13 -= var9 << 1;
            }
            int[] var29 = class353.field5599[arg0 + var7];
            int[] var30 = class353.field5599[arg0 - var7];
            int var31 = arg1 - var9;
            int var32 = arg1 + var9;
            if (var8 > var7) {
                int var33 = var7 > var10 ? class280.field4600[var7] : var10;
                int var34 = arg1 + var33;
                int var35 = arg1 - var33;
                class161.method1253(var35, var29, -1, arg4, var31);
                class161.method1253(var34, var29, -1, arg2, var35);
                class161.method1253(var32, var29, -1, arg4, var34);
                class161.method1253(var35, var30, arg5 + 23492, arg4, var31);
                class161.method1253(var34, var30, -1, arg2, var35);
                class161.method1253(var32, var30, -1, arg4, var34);
            } else {
                class161.method1253(var32, var29, arg5 + 23492, arg4, var31);
                class161.method1253(var32, var30, arg5 + 23492, arg4, var31);
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(II)V", line = 140)
    public static final void method704(int arg0, int arg1) {
        class36 var2 = class129.field2184[0][arg0][arg1];
        for (int var3 = 0; var3 < 3; var3++) {
            class36 var4 = class129.field2184[var3][arg0][arg1] = class129.field2184[var3 + 1][arg0][arg1];
            if (var4 != null) {
                var4.field536--;
                for (int var5 = 0; var5 < var4.field531; var5++) {
                    class209 var6 = var4.field544[var5];
                    if ((var6.field3279 >> 29 & 0x3L) == 2L && var6.field3283 == arg0 && var6.field3291 == arg1) {
                        var6.field3293--;
                    }
                }
            }
        }
        if (class129.field2184[0][arg0][arg1] == null) {
            class129.field2184[0][arg0][arg1] = new class36(0, arg0, arg1);
        }
        class129.field2184[0][arg0][arg1].field546 = var2;
        class129.field2184[3][arg0][arg1] = null;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIZIIIIZ)V", line = 179)
    public static final void method705(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7) {
        field1499++;
        if (!arg2 && class316.field5050 == arg3 && class113.field1844 == arg5 && class344.field5468 == arg0 || class215.method1621(25)) {
            return;
        }
        class113.field1844 = arg5;
        class316.field5050 = arg3;
        class344.field5468 = arg0;
        if (class215.method1621(25)) {
            class344.field5468 = 0;
        }
        if (arg7) {
            class22.method143(arg4 + 17661, 28);
        } else {
            class22.method143(-29, 25);
        }
        class63.method552(class148.field2373, true, arg4 + 17619);
        int var8 = class275.field4546;
        class275.field4546 = (arg5 - 6) * 8;
        int var9 = class93.field1562;
        class93.field1562 = (arg3 - 6) * 8;
        class255.field4303 = class174.method1371(class316.field5050 * 8, class113.field1844 * 8);
        int var10 = class93.field1562 - var9;
        class267.field4470 = null;
        int var11 = class93.field1562;
        int var12 = class275.field4546 - var8;
        int var13 = class275.field4546;
        if (arg7) {
            class35.field508 = 0;
            for (int var14 = 0; var14 < 32768; var14++) {
                class288 var15 = class165.field2621[var14];
                if (var15 != null) {
                    var15.field3511 -= var12 * 128;
                    var15.field3577 -= var10 * 128;
                    if (var15.field3577 >= 0 && var15.field3577 <= 13184 && var15.field3511 >= 0 && var15.field3511 <= 13184) {
                        for (int var16 = 0; var16 < 10; var16++) {
                            var15.field3519[var16] -= var10;
                            var15.field3553[var16] -= var12;
                        }
                        class330.field5253[class35.field508++] = var14;
                    } else {
                        class165.field2621[var14].method2092(arg4 ^ 0x4519, (class121) null);
                        class165.field2621[var14] = null;
                    }
                }
            }
        } else {
            for (int var17 = 0; var17 < 32768; var17++) {
                class288 var18 = class165.field2621[var17];
                if (var18 != null) {
                    for (int var19 = 0; var19 < 10; var19++) {
                        var18.field3519[var19] -= var10;
                        var18.field3553[var19] -= var12;
                    }
                    var18.field3577 -= var10 * 128;
                    var18.field3511 -= var12 * 128;
                }
            }
        }
        for (int var20 = 0; var20 < 2048; var20++) {
            class258 var21 = class56.field924[var20];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field3519[var22] -= var10;
                    var21.field3553[var22] -= var12;
                }
                var21.field3511 -= var12 * 128;
                var21.field3577 -= var10 * 128;
            }
        }
        byte var23 = 0;
        byte var24 = 104;
        class186.field2991 = arg0;
        byte var25 = 1;
        class6.field55.method1981(arg6, arg1, false, (byte) -67);
        if (var10 < 0) {
            var24 = -1;
            var25 = -1;
            var23 = 103;
        }
        byte var26 = 0;
        byte var27 = 104;
        byte var28 = 1;
        if (var12 < 0) {
            var28 = -1;
            var27 = -1;
            var26 = 103;
        }
        for (int var29 = var23; var29 != var24; var29 += var25) {
            for (int var30 = var26; var30 != var27; var30 += var28) {
                int var31 = var10 + var29;
                int var32 = var12 + var30;
                for (int var33 = 0; var33 < 4; var33++) {
                    if (var31 >= 0 && var32 >= 0 && var31 < 104 && var32 < 104) {
                        class211.field3372[var33][var29][var30] = class211.field3372[var33][var31][var32];
                    } else {
                        class211.field3372[var33][var29][var30] = null;
                    }
                }
            }
        }
        for (class304 var34 = (class304) class156.field2468.method2300((byte) 120); var34 != null; var34 = (class304) class156.field2468.method2306(-23)) {
            var34.field4871 -= var10;
            var34.field4885 -= var12;
            if (var34.field4871 < 0 || var34.field4885 < 0 || var34.field4871 >= 104 || var34.field4885 >= 104) {
                var34.method330(arg4 ^ 0xFFFFBAE9);
            }
        }
        class213.field3398 = 0;
        if (arg4 != -17690) {
            return;
        }
        if (class241.field3988 != 0) {
            class335.field5305 -= var12;
            class241.field3988 -= var10;
        }
        if (arg7) {
            class27.field328 -= var12;
            class32.field457 -= var10;
            class229.field3807 -= var12 * 128;
            class296.field4767 -= var12;
            class281.field4617 -= var10 * 128;
            class234.field3883 -= var10;
        } else if (class112.field1827 == 4) {
            class240.field3954 -= var12 * 128;
            class282.field4621 -= var10 * 128;
            class350.field5565 -= var10 * 128;
            class206.field3259 -= var12 * 128;
        } else {
            class112.field1827 = 1;
        }
        if (class42.field607 && arg7 && (Math.abs(var10) > 104 || Math.abs(var12) > 104)) {
            class74.method621(-116);
        }
        class27.method175((byte) 118);
        class189.field3039.method2301(-23);
        class206.field3254.method2301(-23);
        class158.method1237();
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V", line = 441)
    public static void method706(int arg0) {
        if (arg0 != -31598) {
            method704(58, 16);
        }
        field1502 = null;
    }
}
