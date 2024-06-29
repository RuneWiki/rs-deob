import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ds")
public class class274 {

    @OriginalMember(owner = "client!ds", name = "f", descriptor = "[I")
    public static int[] field3479 = new int[] { 4, 4, 1, 2, 6, 4, 2, 47, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!ds", name = "i", descriptor = "[B")
    public static byte[] field3482 = new byte[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ds", name = "k", descriptor = "[I")
    public static int[] field3484 = new int[13];

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "I")
    public int field3474;

    @OriginalMember(owner = "client!ds", name = "c", descriptor = "I")
    public static int field3476;

    @OriginalMember(owner = "client!ds", name = "d", descriptor = "I")
    public static int field3477;

    @OriginalMember(owner = "client!ds", name = "e", descriptor = "I")
    private int field3478;

    @OriginalMember(owner = "client!ds", name = "g", descriptor = "I")
    public static int field3480;

    @OriginalMember(owner = "client!ds", name = "h", descriptor = "I")
    public static int field3481;

    @OriginalMember(owner = "client!ds", name = "j", descriptor = "I")
    public static int field3483;

    @OriginalMember(owner = "client!ds", name = "l", descriptor = "I")
    public int field3485;

    @OriginalMember(owner = "client!ds", name = "m", descriptor = "I")
    public static int field3486;

    @OriginalMember(owner = "client!ds", name = "n", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!ds", name = "b", descriptor = "Lin;")
    public class166 field3475;

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IIIII)V")
    public static final void method1679(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3480++;
        if (arg2 > -10) {
            field3482 = null;
        }
        for (class72 var5 = (class72) class315.field4060.method49(46); var5 != null; var5 = (class72) class315.field4060.method46((byte) 30)) {
            class18.method116(-124, var5, arg4, arg1, arg0, arg3);
        }
        for (class72 var6 = (class72) class368.field4741.method49(78); var6 != null; var6 = (class72) class368.field4741.method46((byte) 117)) {
            byte var11 = 1;
            class371 var12 = var6.field891.method2347((byte) -121);
            if (var6.field891.field5196) {
                var11 = 0;
            } else if (var6.field891.field5174 == var12.field4808 || var6.field891.field5174 == var12.field4813 || var6.field891.field5174 == var12.field4783 || var6.field891.field5174 == var12.field4807) {
                var11 = 2;
            } else if (var6.field891.field5174 == var12.field4816 || var6.field891.field5174 == var12.field4790 || var6.field891.field5174 == var12.field4792 || var6.field891.field5174 == var12.field4785) {
                var11 = 3;
            }
            if (var6.field900 != var11) {
                int var13 = class485.method2902(var6.field891, (byte) 74);
                if (var6.field902 != var13) {
                    if (var6.field886 != null) {
                        class18.field313.method1890(var6.field886);
                        var6.field886 = null;
                    }
                    var6.field902 = var13;
                }
                var6.field900 = var11;
            }
            var6.field896 = var6.field891.field6239;
            var6.field883 = var6.field891.field6239 + (var6.field891.method2342(10804) << 6);
            var6.field906 = var6.field891.field6241;
            var6.field897 = var6.field891.field6241 + (var6.field891.method2342(10804) << 6);
            class18.method116(-94, var6, arg4, arg1, arg0, arg3);
        }
        for (class72 var7 = (class72) class157.field2072.method2087(0); var7 != null; var7 = (class72) class157.field2072.method2091(-128)) {
            byte var8 = 1;
            class371 var9 = var7.field894.method2347((byte) -121);
            if (var7.field894.field5196) {
                var8 = 0;
            } else if (var7.field894.field5174 == var9.field4808 || var7.field894.field5174 == var9.field4813 || var7.field894.field5174 == var9.field4783 || var7.field894.field5174 == var9.field4807) {
                var8 = 2;
            } else if (var7.field894.field5174 == var9.field4816 || var7.field894.field5174 == var9.field4790 || var7.field894.field5174 == var9.field4792 || var7.field894.field5174 == var9.field4785) {
                var8 = 3;
            }
            if (var7.field900 != var8) {
                int var10 = class470.method2822(92, var7.field894);
                if (var7.field902 != var10) {
                    if (var7.field886 != null) {
                        class18.field313.method1890(var7.field886);
                        var7.field886 = null;
                    }
                    var7.field902 = var10;
                }
                var7.field900 = var8;
            }
            var7.field896 = var7.field894.field6239;
            var7.field883 = var7.field894.field6239 + (var7.field894.method2342(10804) << 6);
            var7.field906 = var7.field894.field6241;
            var7.field897 = var7.field894.field6241 + (var7.field894.method2342(10804) << 6);
            class18.method116(-112, var7, arg4, arg1, arg0, arg3);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(III)I")
    public static final int method1680(int arg0, int arg1, int arg2) {
        if (arg2 == 342124927) {
            field3483++;
            int var3 = arg1 - 1 & arg0 >> 31;
            return ((arg0 >>> 31) + arg0) % arg1 + var3;
        } else {
            return 40;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(B)V")
    public static void method1681(byte arg0) {
        field3482 = null;
        field3479 = null;
        field3484 = null;
        if (arg0 != 64) {
            field3482 = null;
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(I)Lne;")
    public final synchronized class136 method1682(int arg0) {
        field3477++;
        class136 var2 = (class136) this.field3475.field2150.method78((long) this.field3478, (byte) -123);
        if (var2 != null) {
            return var2;
        }
        class136 var3 = class136.method945(this.field3475.field2143, this.field3478, arg0);
        if (var3 != null) {
            this.field3475.field2150.method88((long) this.field3478, 79, var3);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(IBLbt;)V")
    private final void method1683(int arg0, byte arg1, class88 arg2) {
        field3476++;
        if (arg1 != -39) {
            return;
        }
        if (arg0 == 1) {
            this.field3478 = arg2.method568((byte) 110);
        } else if (arg0 == 2) {
            this.field3474 = arg2.method617(2);
            this.field3485 = arg2.method617(2);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(BLbt;)V")
    public final void method1684(byte arg0, class88 arg1) {
        while (true) {
            int var3 = arg1.method617(2);
            if (var3 == 0) {
                if (arg0 != -73) {
                    field3482 = null;
                }
                field3486++;
                return;
            }
            this.method1683(var3, (byte) -39, arg1);
        }
    }

    @OriginalMember(owner = "client!ds", name = "a", descriptor = "(ZZILhs;Ljava/lang/String;)V")
    public static final void method1685(boolean arg0, boolean arg1, int arg2, class441 arg3, String arg4) {
        field3481++;
        if (arg2 < 22) {
            method1685(true, false, 42, null, null);
        }
        if (!arg1) {
            class395.method2351(3, arg3, 0, arg4);
            return;
        }
        if (class441.field6145.startsWith("win") && class441.field6150 != 3) {
            String var5 = null;
            if (arg3.field6139 != null) {
                var5 = arg3.field6139.getParameter("haveie6");
            }
            if (var5 == null || !var5.equals("1")) {
                class277 var6 = class395.method2351(0, arg3, 0, arg4);
                class246.field3154 = var6;
                class482.field7021 = arg4;
                class126.field1727 = arg3;
                return;
            }
        }
        if (class441.field6145.startsWith("mac")) {
            String var7 = null;
            if (arg3.field6139 != null) {
                var7 = arg3.field6139.getParameter("havefirefox");
            }
            if (var7 != null && var7.equals("1") && arg0) {
                class395.method2351(1, arg3, 0, arg4);
                return;
            }
        }
        class395.method2351(2, arg3, 0, arg4);
    }
}
