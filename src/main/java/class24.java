import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public class class24 extends class60 {

    @OriginalMember(owner = "client!uf", name = "p", descriptor = "I")
    public static int field412 = 1;

    @OriginalMember(owner = "client!uf", name = "v", descriptor = "Ljava/lang/String;")
    public static String field418 = "purple:";

    @OriginalMember(owner = "client!uf", name = "o", descriptor = "Lef;")
    public static class339 field411 = new class339();

    @OriginalMember(owner = "client!uf", name = "n", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!uf", name = "q", descriptor = "I")
    public int field413;

    @OriginalMember(owner = "client!uf", name = "r", descriptor = "I")
    public static int field414;

    @OriginalMember(owner = "client!uf", name = "s", descriptor = "I")
    public static int field415;

    @OriginalMember(owner = "client!uf", name = "t", descriptor = "I")
    public static int field416;

    @OriginalMember(owner = "client!uf", name = "u", descriptor = "I")
    public int field417;

    @OriginalMember(owner = "client!uf", name = "w", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(II[Ltk;)V", line = 6)
    public static final void method224(int arg0, int arg1, class266[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class266 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field4084 == 0) {
                    if (var4.field3994 != null) {
                        method224(arg0, 93, var4.field3994);
                    }
                    class24 var5 = (class24) class158.field2584.method79((long) var4.field4088, (byte) 0);
                    if (var5 != null) {
                        class79.method618(arg0, var5.field417, 26822);
                    }
                }
                if (arg0 == 0 && var4.field3942 != null) {
                    class150 var6 = new class150();
                    var6.field2450 = var4.field3942;
                    var6.field2458 = var4;
                    class172.method1280(var6, (byte) 12);
                }
                if (arg0 == 1 && var4.field4002 != null) {
                    if (var4.field3958 >= 0) {
                        class266 var7 = class171.method1276(var4.field4088, (byte) 21);
                        if (var7 == null || var7.field3994 == null || var4.field3958 >= var7.field3994.length || var7.field3994[var4.field3958] != var4) {
                            continue;
                        }
                    }
                    class150 var8 = new class150();
                    var8.field2458 = var4;
                    var8.field2450 = var4.field4002;
                    class172.method1280(var8, (byte) 12);
                }
            }
        }
        if (arg1 < 75) {
            method227(false);
        }
        field410++;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(IZ)V", line = 96)
    public static final void method225(int arg0, boolean arg1) {
        class208.field3279 = arg1;
        field415++;
        if (class208.field3279) {
            class80.field1248.method1795(-114);
            for (int var16 = 0; var16 < 4; var16++) {
                for (int var17 = 0; var17 < 13; var17++) {
                    for (int var18 = 0; var18 < 13; var18++) {
                        int var19 = class80.field1248.method1800(79, 1);
                        if (var19 == 1) {
                            class174.field2795[var16][var17][var18] = class80.field1248.method1800(7, 26);
                        } else {
                            class174.field2795[var16][var17][var18] = -1;
                        }
                    }
                }
            }
            class80.field1248.method1801((byte) -100);
            int var20 = (class128.field2060 - class80.field1248.field48) / 16;
            class245.field3658 = new int[var20][4];
            for (int var21 = 0; var21 < var20; var21++) {
                for (int var22 = 0; var22 < 4; var22++) {
                    class245.field3658[var21][var22] = class80.field1248.method62(false);
                }
            }
            boolean var23 = class83.method659(class80.field1248.method30(-683), (byte) -100);
            int var24 = class80.field1248.method56(19612);
            int var25 = class80.field1248.method3((byte) -117);
            int var26 = class80.field1248.method56(19612);
            int var27 = class80.field1248.method58((byte) -78);
            int var28 = class80.field1248.method58((byte) -78);
            class67.field1017 = null;
            class305.field4853 = new int[var20];
            class172.field2756 = new int[var20];
            class126.field2020 = new byte[var20][];
            class338.field5222 = new byte[var20][];
            class180.field2867 = new int[var20];
            class115.field1862 = new byte[var20][];
            class274.field4293 = new int[var20];
            class15.field318 = (byte[][]) null;
            class14.field307 = new byte[var20][];
            class338.field5218 = new int[var20];
            int var29 = 0;
            for (int var30 = 0; var30 < 4; var30++) {
                for (int var31 = 0; var31 < 13; var31++) {
                    for (int var32 = 0; var32 < 13; var32++) {
                        int var33 = class174.field2795[var30][var31][var32];
                        if (var33 != -1) {
                            int var34 = var33 >> 14 & 0x3FF;
                            int var35 = var33 >> 3 & 0x7FF;
                            int var36 = (var34 / 8 << 8) + (var35 / 8);
                            for (int var37 = 0; var37 < var29; var37++) {
                                if (class338.field5218[var37] == var36) {
                                    var36 = -1;
                                    break;
                                }
                            }
                            if (var36 != -1) {
                                class338.field5218[var29] = var36;
                                int var38 = var36 >> 8 & 0xFF;
                                int var39 = var36 & 0xFF;
                                class305.field4853[var29] = class200.field3062.method958(112, "m" + var38 + "_" + var39);
                                class274.field4293[var29] = class200.field3062.method958(111, "l" + var38 + "_" + var39);
                                class172.field2756[var29] = class200.field3062.method958(115, "um" + var38 + "_" + var39);
                                class180.field2867[var29] = class200.field3062.method958(114, "ul" + var38 + "_" + var39);
                                var29++;
                            }
                        }
                    }
                }
            }
            class154.method1150(var25, var23, false, var26, (byte) 111, var28, var27, var24);
        } else {
            int var2 = class80.field1248.method29(15976);
            int var3 = (class128.field2060 - class80.field1248.field48) / 16;
            class245.field3658 = new int[var3][4];
            for (int var4 = 0; var4 < var3; var4++) {
                for (int var5 = 0; var5 < 4; var5++) {
                    class245.field3658[var4][var5] = class80.field1248.method57(-106);
                }
            }
            int var6 = class80.field1248.method29(15976);
            boolean var7 = class83.method659(class80.field1248.method3((byte) -117), (byte) 77);
            int var8 = class80.field1248.method58((byte) -78);
            int var9 = class80.field1248.method3((byte) -117);
            int var10 = class80.field1248.method56(19612);
            class274.field4293 = new int[var3];
            class126.field2020 = new byte[var3][];
            class305.field4853 = new int[var3];
            class15.field318 = (byte[][]) null;
            class172.field2756 = new int[var3];
            class180.field2867 = new int[var3];
            class67.field1017 = null;
            class338.field5218 = new int[var3];
            class115.field1862 = new byte[var3][];
            class14.field307 = new byte[var3][];
            class338.field5222 = new byte[var3][];
            int var11 = 0;
            boolean var12 = false;
            if ((var8 / 8 == 48 || var8 / 8 == 49) && var2 / 8 == 48) {
                var12 = true;
            }
            if ((var8 / 8) == 48 && var2 / 8 == 148) {
                var12 = true;
            }
            for (int var13 = (var8 - 6) / 8; var13 <= (var8 + 6) / 8; var13++) {
                for (int var14 = (var2 - 6) / 8; var14 <= (var2 + 6) / 8; var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var12 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class338.field5218[var11] = var15;
                        class305.field4853[var11] = -1;
                        class274.field4293[var11] = -1;
                        class172.field2756[var11] = -1;
                        class180.field2867[var11] = -1;
                    } else {
                        class338.field5218[var11] = var15;
                        class305.field4853[var11] = class200.field3062.method958(110, "m" + var13 + "_" + var14);
                        class274.field4293[var11] = class200.field3062.method958(120, "l" + var13 + "_" + var14);
                        class172.field2756[var11] = class200.field3062.method958(119, "um" + var13 + "_" + var14);
                        class180.field2867[var11] = class200.field3062.method958(126, "ul" + var13 + "_" + var14);
                    }
                    var11++;
                }
            }
            class154.method1150(var9, var7, false, var8, (byte) 123, var2, var6, var10);
        }
        if (arg0 <= 83) {
            field416 = 108;
        }
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V", line = 352)
    public static final void method226(int arg0) {
        class333.field5186 = class197.method1396(35, 4, 8, false, 0.4F, true, 8, 2048);
        if (arg0 != 6) {
            field416 = 120;
        }
        field419++;
    }

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "(Z)V", line = 370)
    public static void method227(boolean arg0) {
        if (arg0) {
            field418 = null;
            field411 = null;
        }
    }
}
