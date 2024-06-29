import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class30 extends class41 {

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public int field495;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "I")
    public int field496;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    public int field497;

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "I")
    public int field499;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "[I")
    public static int[] field498 = new int[2048];

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!ba", name = "b", descriptor = "(B)V")
    public static final void method240(byte arg0) {
        field501++;
        if (arg0 != 123) {
            field498 = null;
        }
        boolean var1 = false;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < (class131.field2177 - 1); var2++) {
                if (class172.field2873[var2] < 1000 && class172.field2873[var2 + 1] > 1000) {
                    var1 = false;
                    class181 var3 = class63.field970[var2];
                    class63.field970[var2] = class63.field970[var2 + 1];
                    class63.field970[var2 + 1] = var3;
                    class181 var4 = class161.field2749[var2];
                    class161.field2749[var2] = class161.field2749[var2 + 1];
                    class161.field2749[var2 + 1] = var4;
                    int var5 = class222.field3830[var2];
                    class222.field3830[var2] = class222.field3830[var2 + 1];
                    class222.field3830[var2 + 1] = var5;
                    int var6 = class22.field395[var2];
                    class22.field395[var2] = class22.field395[var2 + 1];
                    class22.field395[var2 + 1] = var6;
                    short var7 = class172.field2873[var2];
                    class172.field2873[var2] = class172.field2873[var2 + 1];
                    class172.field2873[var2 + 1] = var7;
                    long var8 = class98.field1586[var2];
                    class98.field1586[var2] = class98.field1586[var2 + 1];
                    class98.field1586[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IIIIZII)V")
    public static final void method241(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var7 = arg2 - arg6;
        if (var7 < 0) {
            var7 = 0;
        }
        int var8 = arg2;
        int var9 = -arg2;
        int var10 = var7;
        class18.method169((byte) -125, arg2);
        int var11 = -1;
        field500++;
        int var12 = 0;
        int var13 = -var7;
        if (!arg4) {
            return;
        }
        int var14 = -1;
        if (arg5 >= class23.field408 && class125.field2056 >= arg5) {
            int[] var15 = class149.field2507[arg5];
            int var16 = class144.method931(117, class124.field2032, class11.field219, arg0 - arg2);
            int var17 = class144.method931(102, class124.field2032, class11.field219, arg0 + arg2);
            int var18 = class144.method931(-124, class124.field2032, class11.field219, arg0 - var7);
            int var19 = class144.method931(113, class124.field2032, class11.field219, arg0 + var7);
            class171.method1133(var15, var16, arg1, var18, (byte) 127);
            class171.method1133(var15, var18, arg3, var19, (byte) 126);
            class171.method1133(var15, var19, arg1, var17, (byte) 127);
        }
        while (var12 < var8) {
            var14 += 2;
            var13 += var14;
            var11 += 2;
            var9 += var11;
            if (var13 >= 0 && var10 >= 1) {
                var10--;
                var13 -= var10 << 1;
                class80.field1291[var10] = var12;
            }
            var12++;
            if (var9 >= 0) {
                var8--;
                var9 -= var8 << 1;
                int var20 = arg5 + var8;
                int var21 = arg5 - var8;
                if (class23.field408 <= var20 && var21 <= class125.field2056) {
                    if (var7 > var8) {
                        int var22 = class80.field1291[var8];
                        int var23 = class144.method931(-24, class124.field2032, class11.field219, arg0 + var12);
                        int var24 = class144.method931(127, class124.field2032, class11.field219, arg0 - var12);
                        int var25 = class144.method931(-83, class124.field2032, class11.field219, arg0 + var22);
                        int var26 = class144.method931(107, class124.field2032, class11.field219, arg0 - var22);
                        if (var20 <= class125.field2056) {
                            int[] var27 = class149.field2507[var20];
                            class171.method1133(var27, var24, arg1, var26, (byte) 125);
                            class171.method1133(var27, var26, arg3, var25, (byte) 127);
                            class171.method1133(var27, var25, arg1, var23, (byte) 127);
                        }
                        if (var21 >= class23.field408) {
                            int[] var28 = class149.field2507[var21];
                            class171.method1133(var28, var24, arg1, var26, (byte) 125);
                            class171.method1133(var28, var26, arg3, var25, (byte) 125);
                            class171.method1133(var28, var25, arg1, var23, (byte) 126);
                        }
                    } else {
                        int var29 = class144.method931(102, class124.field2032, class11.field219, arg0 + var12);
                        int var30 = class144.method931(94, class124.field2032, class11.field219, arg0 - var12);
                        if (class125.field2056 >= var20) {
                            class171.method1133(class149.field2507[var20], var30, arg1, var29, (byte) 125);
                        }
                        if (class23.field408 <= var21) {
                            class171.method1133(class149.field2507[var21], var30, arg1, var29, (byte) 126);
                        }
                    }
                }
            }
            int var31 = arg5 - var12;
            int var32 = arg5 + var12;
            if (class23.field408 <= var32 && class125.field2056 >= var31) {
                int var33 = arg0 + var8;
                int var34 = arg0 - var8;
                if (class11.field219 <= var33 && class124.field2032 >= var34) {
                    int var35 = class144.method931(-112, class124.field2032, class11.field219, var33);
                    int var36 = class144.method931(102, class124.field2032, class11.field219, var34);
                    if (var7 > var12) {
                        int var37 = var12 <= var10 ? var10 : class80.field1291[var12];
                        int var38 = class144.method931(106, class124.field2032, class11.field219, arg0 + var37);
                        int var39 = class144.method931(-18, class124.field2032, class11.field219, arg0 - var37);
                        if (class125.field2056 >= var32) {
                            int[] var40 = class149.field2507[var32];
                            class171.method1133(var40, var36, arg1, var39, (byte) 125);
                            class171.method1133(var40, var39, arg3, var38, (byte) 125);
                            class171.method1133(var40, var38, arg1, var35, (byte) 125);
                        }
                        if (var31 >= class23.field408) {
                            int[] var41 = class149.field2507[var31];
                            class171.method1133(var41, var36, arg1, var39, (byte) 126);
                            class171.method1133(var41, var39, arg3, var38, (byte) 125);
                            class171.method1133(var41, var38, arg1, var35, (byte) 126);
                        }
                    } else {
                        if (var32 <= class125.field2056) {
                            class171.method1133(class149.field2507[var32], var36, arg1, var35, (byte) 127);
                        }
                        if (class23.field408 <= var31) {
                            class171.method1133(class149.field2507[var31], var36, arg1, var35, (byte) 127);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(IIII)V")
    public class30(int arg0, int arg1, int arg2, int arg3) {
        this.field495 = arg0;
        this.field496 = arg3;
        this.field497 = arg2;
        this.field499 = arg1;
    }

    @OriginalMember(owner = "client!ba", name = "c", descriptor = "(I)Lvf;")
    public static final class230 method242(int arg0) {
        field502++;
        class230 var1 = new class230(24);
        var1.method1538(3, (byte) -90);
        var1.method1538(class209.field3590, (byte) -99);
        var1.method1538(class259.field4527 ? 1 : 0, (byte) 121);
        var1.method1538(class8.field140 ? 1 : 0, (byte) 79);
        var1.method1538(class239.field4165 ? 1 : 0, (byte) -119);
        var1.method1538(class180.field3140 ? 1 : 0, (byte) 105);
        var1.method1538(class207.field3552 ? 1 : 0, (byte) 111);
        var1.method1538(class148.field2481 ? 1 : 0, (byte) 55);
        var1.method1538(class73.field1166 ? 1 : 0, (byte) 110);
        var1.method1538(class239.field4154 ? 1 : 0, (byte) 126);
        var1.method1538(class184.field3252, (byte) -95);
        var1.method1538(class254.field4445 ? 1 : 0, (byte) -114);
        var1.method1538(class78.field1268 ? 1 : 0, (byte) -67);
        var1.method1538(class77.field1241 ? 1 : 0, (byte) 124);
        var1.method1538(class242.field4212, (byte) -112);
        var1.method1538(class82.field1317 ? 1 : 0, (byte) -111);
        var1.method1538(class173.field2911, (byte) -109);
        var1.method1538(class94.field1502, (byte) 75);
        var1.method1538(class55.field849, (byte) -124);
        var1.method1534(arg0, class225.field3883);
        var1.method1534(0, class85.field1351);
        var1.method1538(class264.field4614 ? 1 : 0, (byte) -97);
        return var1;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(III)Z")
    public final boolean method243(int arg0, int arg1, int arg2) {
        field494++;
        if (arg1 != 1) {
            field498 = null;
        }
        return this.field495 <= arg0 && this.field497 >= arg0 && arg2 >= this.field499 && this.field496 >= arg2;
    }

    @OriginalMember(owner = "client!ba", name = "d", descriptor = "(I)V")
    public static void method244(int arg0) {
        field498 = null;
        if (arg0 != -27361) {
            method241(-8, 49, -15, 33, false, 123, -122);
        }
    }
}
