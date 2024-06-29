import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fea")
public class class142 {

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "[I")
    public static int[] field1864 = new int[4096];

    @OriginalMember(owner = "client!fea", name = "b", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIZ)V")
    public static final void method986(int arg0, int arg1, boolean arg2) {
        field1865++;
        class150 var3 = class676.method3885(1000, 17, arg0);
        var3.method1116(81);
        if (!arg2) {
            var3.field2346 = arg1;
        }
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(IIII[[[B[I[I[I[I[IIBIIZZIIZ)V")
    public static final void method987(int arg0, int arg1, int arg2, int arg3, byte[][][] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, byte arg11, int arg12, int arg13, boolean arg14, boolean arg15, int arg16, int arg17, boolean arg18) {
        class587.field8325 = true;
        class94.field1347 = class118.field1620.method433() > 0;
        class557.field7949 = arg15;
        class736.field10315 = arg1 >> class459.field6769;
        class116.field1600 = arg3 >> class459.field6769;
        class499.field7101 = arg1;
        class310.field4389 = arg3;
        class518.field7397 = arg2;
        class358.field5196 = class736.field10315 - class60.field843;
        if (class358.field5196 < 0) {
            class214.field3202 = -class358.field5196;
            class358.field5196 = 0;
        } else {
            class214.field3202 = 0;
        }
        class8.field110 = class116.field1600 - class60.field843;
        if (class8.field110 < 0) {
            class285.field4047 = -class8.field110;
            class8.field110 = 0;
        } else {
            class285.field4047 = 0;
        }
        class595.field8439 = class736.field10315 + class60.field843;
        if (class595.field8439 > class34.field356) {
            class595.field8439 = class34.field356;
        }
        class87.field1242 = class60.field843 + class116.field1600;
        if (class87.field1242 > class565.field8040) {
            class87.field1242 = class565.field8040;
        }
        boolean[][] var19 = class464.field6819;
        boolean[][] var20 = class582.field8264;
        if (class557.field7949) {
            for (int var21 = 0; var21 < class60.field843 + class60.field843 + 2; var21++) {
                int var22 = 0;
                int var23 = 0;
                for (int var24 = 0; var24 < class60.field843 + class60.field843 + 2; var24++) {
                    if (var24 > 1) {
                        class364.field5242[var24 - 2] = var22;
                    }
                    var22 = var23;
                    int var25 = class736.field10315 + var21 - class60.field843;
                    int var26 = class116.field1600 + var24 - class60.field843;
                    if (var25 >= 0 && var26 >= 0 && var25 < class34.field356 && var26 < class565.field8040) {
                        int var27 = var25 << class459.field6769;
                        int var28 = var26 << class459.field6769;
                        int var29 = class531.field7566[class531.field7566.length - 1].method1787(var25, 19646, var26) - (0x3E8 << class459.field6769 - 7);
                        int var30 = class46.field568 == null ? class531.field7566[0].method1787(var25, 19646, var26) + class504.field7164 : class46.field568[0].method1787(var25, 19646, var26) + class504.field7164;
                        var23 = arg16 >= 0 ? class118.field1620.method524(var27, var29, var28, var27, var30, var28, arg16) : class118.field1620.method494(var27, var29, var28, var27, var30, var28);
                        class582.field8264[var21][var24] = var23 == 0;
                    } else {
                        var23 = -1;
                        class582.field8264[var21][var24] = false;
                    }
                    if (var21 > 0 && var24 > 0) {
                        int var31 = class364.field5242[var24 - 1] & class364.field5242[var24] & var22 & var23;
                        class464.field6819[var21 - 1][var24 - 1] = var31 == 0;
                    }
                }
                class364.field5242[class60.field843 + class60.field843] = var22;
                class364.field5242[class60.field843 + class60.field843 + 1] = var23;
            }
            if (arg16 >= 0) {
                class587.field8325 = false;
            } else {
                class754.field10533 = arg5;
                class506.field7199 = arg6;
                class515.field7303 = arg7;
                class426.field6317 = arg8;
                class474.field6893 = arg9;
                class193.method1345(arg10, class118.field1620, false);
            }
        } else {
            if (class741.field10403 == null) {
                class741.field10403 = new boolean[class34.field356 + class34.field356 + 1][class565.field8040 + class34.field356 + 1];
            }
            for (int var32 = 0; var32 < class741.field10403.length; var32++) {
                for (int var42 = 0; var42 < class741.field10403[0].length; var42++) {
                    class741.field10403[var32][var42] = true;
                }
            }
            class582.field8264 = class741.field10403;
            class464.field6819 = class741.field10403;
            class358.field5196 = 0;
            class8.field110 = 0;
            class595.field8439 = class34.field356;
            class87.field1242 = class565.field8040;
            class587.field8325 = false;
        }
        class89.method722((byte) -87, class118.field1620);
        if (!class177.field2736.field1686) {
            class243 var33 = class177.field2736.field1682;
            for (class187 var34 = (class187) var33.method1615((byte) 97); var34 != null; var34 = (class187) var33.method1625(-36)) {
                var34.method385((byte) -102);
                class387.method2494(2780, var34);
            }
        }
        if (class94.field1347) {
            for (int var35 = 0; var35 < class625.field8752; var35++) {
                class234.field3410[var35].method89(arg0, arg14, -111);
            }
        }
        if (class413.field6206) {
            class307.field4348 = class118.field1620.method434();
            class118.field1620.method530(class98.field1384);
            int var36 = (class98.field1384[2] - class98.field1384[0]) / class412.field6191;
            for (int var37 = 0; var37 < class412.field6191 - 1; var37++) {
                class575.field8142[var37] = (var37 + 1) * var36 + class192.field2905[var37];
            }
            for (int var38 = 0; var38 < class449.field6662.length; var38++) {
                class449.field6662[var38].method1389();
            }
        }
        if (class277.field3946 != null) {
            if (class413.field6206) {
                class175.method1247(0);
            }
            class320.method2023(true);
            class118.field1620.method529(-1, 1583160, 40, 127);
            class190.method1320(true, arg4, arg10, arg11, arg16, arg17, arg18);
            if (class413.field6206) {
                class56.method391();
            }
            class118.field1620.method466();
            class320.method2023(false);
        }
        class190.method1320(false, arg4, arg10, arg11, arg16, arg17, arg18);
        if (class413.field6206) {
            for (int var39 = 0; var39 < class409.field6165; var39++) {
                class760.field10608[var39] = class727.field10148[var39];
            }
            class175.method1247(0);
            for (int var40 = 0; var40 < class449.field6662.length; var40++) {
                class449.field6662[var40].method1389();
            }
        }
        if (class413.field6206) {
            class56.method391();
            for (int var41 = 0; var41 < class409.field6165; var41++) {
                class727.field10148[var41] = class760.field10608[var41];
            }
            if (class686.field9489 == 2) {
                int var10002;
                if (class600.field8498[0] < class600.field8498[1]) {
                    if (class575.field8142[0] + class192.field2905[0] > class98.field1384[0]) {
                        var10002 = class192.field2905[0]++;
                    }
                } else if (class600.field8498[0] > class600.field8498[1] && class575.field8142[0] + class192.field2905[0] < class98.field1384[2]) {
                    var10002 = class192.field2905[0]--;
                }
            }
        }
        if (!class557.field7949) {
            class464.field6819 = var19;
            class582.field8264 = var20;
        }
        class426.method2660();
    }

    @OriginalMember(owner = "client!fea", name = "a", descriptor = "(I)V")
    public static void method988(int arg0) {
        field1864 = null;
        if (arg0 != 0) {
            field1864 = null;
        }
    }
}
