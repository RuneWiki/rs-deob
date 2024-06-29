import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class96 {

    @OriginalMember(owner = "client!vn", name = "c", descriptor = "I")
    public static int field1534 = 0;

    @OriginalMember(owner = "client!vn", name = "f", descriptor = "I")
    public static int field1537 = 0;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "I")
    public static int field1533 = 0;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1532 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!vn", name = "d", descriptor = "I")
    public static int field1535;

    @OriginalMember(owner = "client!vn", name = "e", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(ZBLtb;)V", line = 9)
    public static final void method714(boolean arg0, byte arg1, class220 arg2) {
        field1535++;
        int var3 = arg2.field3370 == 0 ? arg2.field3526 : arg2.field3370;
        int var4 = arg2.field3465 == 0 ? arg2.field3458 : arg2.field3465;
        if (arg1 != 71) {
            return;
        }
        class193.method1372(var3, arg0, (byte) -54, arg2.field3404, class163.field2463[arg2.field3404 >> 16], var4);
        if (arg2.field3472 != null) {
            class193.method1372(var3, arg0, (byte) -104, arg2.field3404, arg2.field3472, var4);
        }
        class61 var5 = (class61) class276.field4257.method1222(0, (long) arg2.field3404);
        if (var5 != null) {
            class263.method1797(var4, -11999, arg0, var3, var5.field982);
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(IIIIIII)V", line = 33)
    public static final void method715(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1538++;
        class217.method1532(-49, arg3);
        if (arg0 < 33) {
            method716(-16);
        }
        int var7 = 0;
        int var8 = arg3 - arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = -arg3;
        int var10 = var8;
        int var11 = -var8;
        int var12 = arg3;
        int var13 = -1;
        if (arg5 >= class119.field1817 && class141.field2187 >= arg5) {
            int[] var14 = class34.field525[arg5];
            int var15 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1 - arg3);
            int var16 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1 + arg3);
            int var17 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1 - var8);
            int var18 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1 + var8);
            class272.method1876(var14, var17, var15, arg4, (byte) -37);
            class272.method1876(var14, var18, var17, arg2, (byte) -12);
            class272.method1876(var14, var16, var18, arg4, (byte) -57);
        }
        int var19 = -1;
        while (var12 > var7) {
            var19 += 2;
            var9 += var19;
            var13 += 2;
            var11 += var13;
            if (var11 >= 0 && var10 >= 1) {
                var10--;
                class158.field2373[var10] = var7;
                var11 -= var10 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var12--;
                var9 -= var12 << 1;
                int var20 = arg5 + var12;
                int var21 = arg5 - var12;
                if (class119.field1817 <= var20 && var21 <= class141.field2187) {
                    if (var12 < var8) {
                        int var22 = class158.field2373[var12];
                        int var23 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1 + var7);
                        int var24 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1 - var7);
                        int var25 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1 + var22);
                        int var26 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1 - var22);
                        if (var20 <= class141.field2187) {
                            int[] var27 = class34.field525[var20];
                            class272.method1876(var27, var26, var24, arg4, (byte) -43);
                            class272.method1876(var27, var25, var26, arg2, (byte) -54);
                            class272.method1876(var27, var23, var25, arg4, (byte) -101);
                        }
                        if (class119.field1817 <= var21) {
                            int[] var28 = class34.field525[var21];
                            class272.method1876(var28, var26, var24, arg4, (byte) -13);
                            class272.method1876(var28, var25, var26, arg2, (byte) -117);
                            class272.method1876(var28, var23, var25, arg4, (byte) -116);
                        }
                    } else {
                        int var29 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1 + var7);
                        int var30 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1 - var7);
                        if (var20 <= class141.field2187) {
                            class272.method1876(class34.field525[var20], var29, var30, arg4, (byte) -119);
                        }
                        if (class119.field1817 <= var21) {
                            class272.method1876(class34.field525[var21], var29, var30, arg4, (byte) -22);
                        }
                    }
                }
            }
            int var31 = arg5 + var7;
            int var32 = arg5 - var7;
            if (class119.field1817 <= var31 && var32 <= class141.field2187) {
                int var33 = arg1 - var12;
                int var34 = arg1 + var12;
                if (class206.field3170 <= var34 && var33 <= class12.field184) {
                    int var35 = class101.method739(class12.field184, class206.field3170, (byte) 68, var34);
                    int var36 = class101.method739(class12.field184, class206.field3170, (byte) 68, var33);
                    if (var8 <= var7) {
                        if (var31 <= class141.field2187) {
                            class272.method1876(class34.field525[var31], var35, var36, arg4, (byte) -48);
                        }
                        if (var32 >= class119.field1817) {
                            class272.method1876(class34.field525[var32], var35, var36, arg4, (byte) -17);
                        }
                    } else {
                        int var37 = var7 <= var10 ? var10 : class158.field2373[var7];
                        int var38 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1 + var37);
                        int var39 = class101.method739(class12.field184, class206.field3170, (byte) 68, arg1 - var37);
                        if (var31 <= class141.field2187) {
                            int[] var40 = class34.field525[var31];
                            class272.method1876(var40, var39, var36, arg4, (byte) -42);
                            class272.method1876(var40, var38, var39, arg2, (byte) -112);
                            class272.method1876(var40, var35, var38, arg4, (byte) -92);
                        }
                        if (class119.field1817 <= var32) {
                            int[] var41 = class34.field525[var32];
                            class272.method1876(var41, var39, var36, arg4, (byte) -51);
                            class272.method1876(var41, var38, var39, arg2, (byte) -59);
                            class272.method1876(var41, var35, var38, arg4, (byte) -46);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(I)V", line = 232)
    public static void method716(int arg0) {
        field1532 = null;
        if (arg0 != 13213) {
            method716(55);
        }
    }
}
