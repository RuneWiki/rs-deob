import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!em")
public class class123 {

    @OriginalMember(owner = "client!em", name = "d", descriptor = "[I")
    public static int[] field1724 = new int[128];

    @OriginalMember(owner = "client!em", name = "c", descriptor = "I")
    public static int field1723 = -1;

    @OriginalMember(owner = "client!em", name = "f", descriptor = "[I")
    public static int[] field1726 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!em", name = "a", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!em", name = "b", descriptor = "I")
    public static int field1722;

    @OriginalMember(owner = "client!em", name = "g", descriptor = "I")
    public static int field1727;

    @OriginalMember(owner = "client!em", name = "h", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!em", name = "i", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!em", name = "j", descriptor = "I")
    public static int field1730;

    @OriginalMember(owner = "client!em", name = "k", descriptor = "I")
    public static int field1731;

    @OriginalMember(owner = "client!em", name = "l", descriptor = "I")
    public static int field1732;

    @OriginalMember(owner = "client!em", name = "e", descriptor = "Lsr;")
    public static class136 field1725;

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(ILrg;II)V")
    public static final void method820(int arg0, class383 arg1, int arg2, int arg3) {
        class28.field451 = arg1;
        if (arg3 == -8018) {
            field1721++;
            class94.field1405 = arg2;
            class359.field5048 = arg0;
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "([I[I[ILql;I)V")
    public static final void method821(int[] arg0, int[] arg1, int[] arg2, class437 arg3, int arg4) {
        field1730++;
        for (int var5 = arg4; var5 < arg0.length; var5++) {
            int var6 = arg0[var5];
            int var7 = arg2[var5];
            int var8 = arg1[var5];
            for (int var9 = 0; var7 != 0 && arg3.field887.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg3.field887[var9] = null;
                    } else {
                        class449 var10 = class86.method599(false, var6);
                        int var11 = var10.field6516;
                        class7 var12 = arg3.field887[var9];
                        if (var12 != null) {
                            if (var12.field116 == var6) {
                                if (var11 == 0) {
                                    var12 = arg3.field887[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field109 = var8;
                                    var12.field108 = 1;
                                    var12.field113 = 0;
                                    var12.field112 = 0;
                                    var12.field114 = 0;
                                    class27.method218(false, (byte) -116, var10, 0, arg3.field6192, arg3.field6197);
                                } else if (var11 == 2) {
                                    var12.field112 = 0;
                                }
                            } else if (var10.field6504 >= class86.method599(false, var12.field116).field6504) {
                                var12 = arg3.field887[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class7 var13 = arg3.field887[var9] = new class7();
                            var13.field112 = 0;
                            var13.field114 = 0;
                            var13.field116 = var6;
                            var13.field113 = 0;
                            var13.field109 = var8;
                            var13.field108 = 1;
                            class27.method218(false, (byte) -88, var10, 0, arg3.field6192, arg3.field6197);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(I)V")
    public static void method822(int arg0) {
        field1726 = null;
        if (arg0 != 7901) {
            method824(23);
        }
        field1725 = null;
        field1724 = null;
    }

    @OriginalMember(owner = "client!em", name = "a", descriptor = "(BII)I")
    public static final int method823(byte arg0, int arg1, int arg2) {
        field1727++;
        int var3 = class285.method1844(arg1 + 45365, arg2 - -91923, -85, 4) + (class285.method1844(arg1 + 10294, arg2 + 37821, -113, 2) - 128 >> 1) + (class285.method1844(arg1, arg2, -124, 1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (arg0 != 101) {
            return -64;
        }
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!em", name = "b", descriptor = "(I)V")
    public static final void method824(int arg0) {
        class167.field2382++;
        field1722++;
        if (arg0 != -18391) {
            field1724 = null;
        }
        class442.field6400.method158((byte) 7, 42);
        class442.field6400.method2396(0, 12450);
    }

    @OriginalMember(owner = "client!em", name = "c", descriptor = "(I)V")
    public static final void method825(int arg0) {
        class27.field432.method1243(1000);
        if (arg0 != -882360351) {
            field1731 = -25;
        }
        field1732++;
        class299.field4141.method1243(1000);
    }
}
