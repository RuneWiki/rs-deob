import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class417 extends class46 {

    @OriginalMember(owner = "client!sg", name = "M", descriptor = "I")
    public int field6158;

    @OriginalMember(owner = "client!sg", name = "r", descriptor = "J")
    public long field6137;

    @OriginalMember(owner = "client!sg", name = "J", descriptor = "I")
    public int field6146;

    @OriginalMember(owner = "client!sg", name = "v", descriptor = "I")
    public int field6147;

    @OriginalMember(owner = "client!sg", name = "s", descriptor = "Z")
    public boolean field6148;

    @OriginalMember(owner = "client!sg", name = "w", descriptor = "Z")
    public boolean field6151;

    @OriginalMember(owner = "client!sg", name = "y", descriptor = "Ljava/lang/String;")
    public String field6149;

    @OriginalMember(owner = "client!sg", name = "B", descriptor = "I")
    public int field6145;

    @OriginalMember(owner = "client!sg", name = "K", descriptor = "Ljava/lang/String;")
    public String field6139;

    @OriginalMember(owner = "client!sg", name = "I", descriptor = "I")
    public int field6141;

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "J")
    public long field6154;

    @OriginalMember(owner = "client!sg", name = "t", descriptor = "Z")
    public boolean field6142;

    @OriginalMember(owner = "client!sg", name = "N", descriptor = "[Ljava/lang/String;")
    private static final String[] field6159 = new String[] { method3240(method3239("V\u0014:\u0013{")), method3240(method3239("V\u0014:\u001c{")), method3240(method3239("^]:z.")), method3240(method3239("K\u0006x8")), method3240(method3239("V\u0014:h:K\u001a`j{")), method3240(method3239("V\u0014:\u0012{")) };

    @OriginalMember(owner = "client!sg", name = "H", descriptor = "Lvaa;")
    public static class494 field6138 = new class494(1, 2);

    @OriginalMember(owner = "client!sg", name = "A", descriptor = "Lef;")
    public static class513 field6150 = new class513();

    @OriginalMember(owner = "client!sg", name = "G", descriptor = "Lvha;")
    public static class713 field6156 = new class713(12, 7);

    @OriginalMember(owner = "client!sg", name = "L", descriptor = "Lwq;")
    public static class178 field6157 = new class178(50);

    @OriginalMember(owner = "client!sg", name = "C", descriptor = "I")
    public static int field6143;

    @OriginalMember(owner = "client!sg", name = "F", descriptor = "I")
    public static int field6153;

    @OriginalMember(owner = "client!sg", name = "x", descriptor = "Lws;")
    public static class376 field6144;

    @OriginalMember(owner = "client!sg", name = "E", descriptor = "Lla;")
    public static class476 field6155;

    @OriginalMember(owner = "client!sg", name = "D", descriptor = "Ljq;")
    public static class537 field6140;

    @OriginalMember(owner = "client!sg", name = "u", descriptor = "Ljava/lang/String;")
    public String field6152;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V")
    public static void method3236(int arg0) {
        try {
            field6156 = null;
            field6157 = null;
            field6144 = null;
            field6138 = null;
            field6150 = null;
            field6155 = null;
            if (arg0 != -20679) {
                field6157 = null;
            }
            field6140 = null;
        } catch (RuntimeException var2) {
            throw class759.method5498(var2, field6159[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(II)I")
    public static final int method3237(int arg0, int arg1) {
        try {
            field6143++;
            if (arg0 < 96) {
                return 0;
            } else {
                if (arg1 != 20194) {
                    field6140 = null;
                }
                return arg0 < 128 ? 2 : 3;
            }
        } catch (RuntimeException var3) {
            throw class759.method5498(var3, field6159[5] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IIIIB)V")
    public static final void method3238(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        try {
            for (class142 var5 = (class142) class743.field10807.method3863((byte) 64); var5 != null; var5 = (class142) class743.field10807.method3862(-353)) {
                class387.method3087(-1, arg2, arg0, arg3, var5, arg1);
            }
            field6153++;
            for (class142 var6 = (class142) class278.field4182.method3863((byte) 64); var6 != null; var6 = (class142) class278.field4182.method3862(-353)) {
                byte var7 = 1;
                class144 var8 = var6.field1702.method2099(99);
                if (var6.field1702.field3796 == -1 || var6.field1702.field3849) {
                    var7 = 0;
                } else if (var6.field1702.field3796 == var8.field1729 || var6.field1702.field3796 == var8.field1742 || var6.field1702.field3796 == var8.field1763 || var6.field1702.field3796 == var8.field1748) {
                    var7 = 2;
                } else if (var6.field1702.field3796 == var8.field1725 || var6.field1702.field3796 == var8.field1773 || var6.field1702.field3796 == var8.field1745 || var6.field1702.field3796 == var8.field1735) {
                    var7 = 3;
                }
                if (var6.field1709 != var7) {
                    int var9 = class555.method4175(-1, var6.field1702);
                    class496 var10 = var6.field1702.field8947;
                    if (var10.field7110 != null) {
                        var10 = var10.method3742(arg4 - 54, class276.field4168);
                    }
                    if (var10 == null || var9 == -1) {
                        var6.field1698 = -1;
                        var6.field1709 = var7;
                        var6.field1701 = false;
                    } else if (var6.field1698 == var9 && var6.field1701 == var10.field7140) {
                        var6.field1707 = var10.field7131;
                        var6.field1709 = var7;
                    } else {
                        boolean var11 = false;
                        if (var6.field1700 == null) {
                            var11 = true;
                        } else {
                            var6.field1707 -= 512;
                            if (var6.field1707 <= 0) {
                                class594.field8714.method4980(var6.field1700);
                                var11 = true;
                                var6.field1700 = null;
                            }
                        }
                        if (var11) {
                            var6.field1692 = null;
                            var6.field1707 = var10.field7131;
                            var6.field1709 = var7;
                            var6.field1701 = var10.field7140;
                            var6.field1691 = null;
                            var6.field1698 = var9;
                        }
                    }
                }
                var6.field1689 = var6.field1702.field6197;
                var6.field1687 = var6.field1702.field6197 + (var6.field1702.method2101(31463) << 8);
                var6.field1694 = var6.field1702.field6211;
                var6.field1693 = var6.field1702.field6211 + (var6.field1702.method2101(31463) << 8);
                class387.method3087(-1, arg2, arg0, arg3, var6, arg1);
            }
            for (class142 var12 = (class142) class761.field11026.method971(347); var12 != null; var12 = (class142) class761.field11026.method973(true)) {
                byte var13 = 1;
                class144 var14 = var12.field1688.method2099(arg4 + 48);
                if (var12.field1688.field3796 == -1 || var12.field1688.field3849) {
                    var13 = 0;
                } else if (var12.field1688.field3796 == var14.field1729 || var12.field1688.field3796 == var14.field1742 || var12.field1688.field3796 == var14.field1763 || var12.field1688.field3796 == var14.field1748) {
                    var13 = 2;
                } else if (var12.field1688.field3796 == var14.field1725 || var12.field1688.field3796 == var14.field1773 || var12.field1688.field3796 == var14.field1745 || var12.field1688.field3796 == var14.field1735) {
                    var13 = 3;
                }
                if (var12.field1709 != var13) {
                    int var15 = class538.method4057(4, var12.field1688);
                    if (var12.field1698 == var15 && var12.field1688.field10525 == var12.field1701) {
                        var12.field1707 = var12.field1688.field10517;
                        var12.field1709 = var13;
                    } else {
                        boolean var16 = false;
                        if (var12.field1700 == null) {
                            var16 = true;
                        } else {
                            var12.field1707 -= 512;
                            if (var12.field1707 <= 0) {
                                class594.field8714.method4980(var12.field1700);
                                var12.field1700 = null;
                                var16 = true;
                            }
                        }
                        if (var16) {
                            var12.field1692 = null;
                            var12.field1698 = var15;
                            var12.field1701 = var12.field1688.field10525;
                            var12.field1691 = null;
                            var12.field1709 = var13;
                            var12.field1707 = var12.field1688.field10517;
                        }
                    }
                }
                var12.field1689 = var12.field1688.field6197;
                var12.field1687 = var12.field1688.field6197 + (var12.field1688.method2101(31463) << 8);
                var12.field1694 = var12.field1688.field6211;
                var12.field1693 = var12.field1688.field6211 + (var12.field1688.method2101(31463) << 8);
                class387.method3087(-1, arg2, arg0, arg3, var12, arg1);
            }
            if (arg4 != 53) {
                field6155 = null;
            }
        } catch (RuntimeException var18) {
            throw class759.method5498(var18, field6159[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
        }
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIIJIIZZJZ)V")
    public class417(String arg0, String arg1, int arg2, int arg3, int arg4, long arg5, int arg6, int arg7, boolean arg8, boolean arg9, long arg10, boolean arg11) {
        try {
            this.field6158 = arg6;
            this.field6137 = arg5;
            this.field6146 = arg3;
            this.field6147 = arg2;
            this.field6148 = arg9;
            this.field6151 = arg11;
            this.field6149 = arg1;
            this.field6145 = arg4;
            this.field6139 = arg0;
            this.field6141 = arg7;
            this.field6154 = arg10;
            this.field6142 = arg8;
        } catch (RuntimeException var16) {
            throw class759.method5498(var16, field6159[4] + (arg0 == null ? field6159[3] : field6159[2]) + ',' + (arg1 == null ? field6159[3] : field6159[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
        }
    }

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method3239(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x53);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!sg", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method3240(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 37;
                    break;
                case 1:
                    var10005 = 115;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 84;
                    break;
                default:
                    var10005 = 83;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
