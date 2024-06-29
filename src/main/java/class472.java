import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class472 extends class270 {

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "[I")
    public int[] field6587 = new int[1];

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "[I")
    public int[] field6581 = new int[] { -1 };

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
    public static int field6590 = -1;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "Ltq;")
    public static class572 field6582 = new class572(16);

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "Loe;")
    public static class184 field6592 = new class184();

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public static int field6593 = 0;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public static int field6583;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public static int field6584;

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field6585;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public static int field6586;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "I")
    public static int field6589;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "Lln;")
    public static class343 field6588;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(I)Z", line = 4)
    public static final boolean method2675(int arg0) {
        field6589++;
        try {
            if (class636.field9006 == 2) {
                if (class332.field4299 == null) {
                    class332.field4299 = class258.method1471(class692.field9747, class36.field411, class377.field4896);
                    if (class332.field4299 == null) {
                        return false;
                    }
                }
                if (class373.field4840 == null) {
                    class373.field4840 = new class605(class539.field7758, class496.field7167);
                }
                if (class112.field1304.method658(class332.field4299, class347.field4525, class373.field4840, 22050, (byte) -59)) {
                    class112.field1304.method656(true);
                    class112.field1304.method663(class41.field434, arg0 - 16676);
                    class112.field1304.method655(class332.field4299, -2727, class385.field5149);
                    class373.field4840 = null;
                    class636.field9006 = 0;
                    class692.field9747 = null;
                    class332.field4299 = null;
                    return true;
                }
            }
            if (arg0 != 16683) {
                method2681(null, (byte) -127, true, null, 89, 127);
            }
        } catch (Exception var2) {
            var2.printStackTrace();
            class112.field1304.method648(0);
            class692.field9747 = null;
            class636.field9006 = 0;
            class373.field4840 = null;
            class332.field4299 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIIZI)V", line = 53)
    public static final void method2676(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field6591++;
        class120.field1368 = arg2;
        int var5 = class480.method2800(arg2 + 32032);
        if (arg0 == 3 || var5 == 3) {
            arg3 = true;
        }
        if (!class453.field6284.method323()) {
            arg3 = true;
        }
        class231.method1342((byte) -123, var5, arg3, arg0, arg1, arg4);
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIILjo;)Lob;", line = 71)
    public static final class672 method2677(int arg0, int arg1, int arg2, class303 arg3) {
        field6585++;
        class452 var4 = new class452(arg3.method1719(arg0, arg2, arg1 ^ 0x2E7D));
        class672 var5 = new class672(arg0, var4.method2516(107), var4.method2516(arg1 ^ 0x2E2B), var4.method2575((byte) -48), var4.method2575((byte) -48), var4.method2541(51) == 1, var4.method2541(96), var4.method2541(42));
        int var6 = var4.method2541(105);
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field9548.method3164(new class596(var4.method2541(104), var4.method2574(-1758460248), var4.method2574(-1758460248), var4.method2574(-1758460248), var4.method2574(-1758460248), var4.method2574(-1758460248), var4.method2574(-1758460248), var4.method2574(-1758460248), var4.method2574(-1758460248)), arg1 ^ 0x2F79);
        }
        var5.method3768((byte) 46);
        if (arg1 != 11897) {
            method2675(78);
        }
        return var5;
    }

    @OriginalMember(owner = "client!dn", name = "b", descriptor = "(I)V", line = 98)
    public static void method2678(int arg0) {
        field6592 = null;
        field6582 = null;
        if (arg0 != 3) {
            method2678(125);
        }
        field6588 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II[IZ[I)J", line = 116)
    private final long method2679(int arg0, int arg1, int[] arg2, boolean arg3, int[] arg4) {
        field6586++;
        int var6 = -101 % ((77 - arg1) / 48);
        long[] var7 = class508.field7311;
        long var8 = -1L;
        long var10 = var8 >>> 8 ^ var7[(int) (((long) (arg0 >> 8) ^ var8) & 0xFFL)];
        long var12 = var7[(int) ((var10 ^ (long) arg0) & 0xFFL)] ^ var10 >>> 8;
        for (int var14 = 0; var14 < arg4.length; var14++) {
            long var18 = var12 >>> 8 ^ var7[(int) (((long) (arg4[var14] >> 24) ^ var12) & 0xFFL)];
            long var20 = var18 >>> 8 ^ var7[(int) ((var18 ^ (long) (arg4[var14] >> 16)) & 0xFFL)];
            long var22 = var7[(int) ((var20 ^ (long) (arg4[var14] >> 8)) & 0xFFL)] ^ var20 >>> 8;
            var12 = var7[(int) ((var22 ^ (long) arg4[var14]) & 0xFFL)] ^ var22 >>> 8;
        }
        if (arg2 != null) {
            for (int var15 = 0; var15 < 5; var15++) {
                var12 = var12 >>> 8 ^ var7[(int) (((long) arg2[var15] ^ var12) & 0xFFL)];
            }
        }
        return var12 >>> 8 ^ var7[(int) ((var12 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILoa;ZIIIILam;ZLdea;)Lba;", line = 162)
    public final class350 method2680(int arg0, class635 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class576 arg7, boolean arg8, class223 arg9) {
        field6583++;
        class350 var11 = null;
        int var12 = arg4;
        class468 var13 = null;
        if (arg5 != -1) {
            var13 = class422.field5623.method3324(arg5, -28590);
        }
        int[] var14 = this.field6581;
        if (var13 != null && var13.field6517 != null) {
            var14 = new int[var13.field6517.length];
            for (int var15 = 0; var15 < var13.field6517.length; var15++) {
                int var16 = var13.field6517[var15];
                if (var16 >= 0 && this.field6581.length > var16) {
                    var14[var15] = this.field6581[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = arg2;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class2 var24 = null;
        class2 var25 = null;
        if (arg7 != null) {
            var12 = arg4 | 0x20;
            int var26 = arg7.field8216[arg3];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class618.field8696.method131(var27, !arg2);
            if (var24 != null) {
                var18 |= var24.method8(-75, var21);
                var17 |= var24.method11(var21, (byte) 57);
                var20 = arg2 | var24.method7(14569, var21);
                var19 |= arg7.field8230;
            }
            if ((arg7.field8218 || class504.field7259) && arg6 != -1 && arg7.field8216.length > arg6) {
                int var28 = arg7.field8216[arg6];
                var23 = arg7.field8208[arg3];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class618.field8696.method131(var22 >>> 16, true);
                }
                if (var25 != null) {
                    var18 |= var25.method8(-51, var22);
                    var17 |= var25.method11(var22, (byte) 51);
                    var20 |= var25.method7(14569, var22);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
            if (var20) {
                var12 |= 0x400;
            }
        }
        long var30 = this.method2679(arg5, 125, arg9 == null ? null : arg9.field2809, arg8, var14);
        if (class358.field4702 != null) {
            var11 = (class350) class358.field4702.method3690((byte) 121, var30);
        }
        if (var11 == null || arg1.method312(var11.method902(), var12) != 0) {
            if (var11 != null) {
                var12 = arg1.method372(var12, var11.method902());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !field6588.method1903(var14[var34], (byte) -111).method3062(arg8, (byte) 127)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class90[] var35 = new class90[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = field6588.method1903(var14[var36], (byte) -117).method3050(arg8, (byte) -122);
                }
            }
            if (var13 != null && var13.field6513 != null) {
                for (int var37 = 0; var37 < var13.field6513.length; var37++) {
                    if (var13.field6513[var37] != null && var35[var37] != null) {
                        int var38 = var13.field6513[var37][0];
                        int var39 = var13.field6513[var37][1];
                        int var40 = var13.field6513[var37][2];
                        int var41 = var13.field6513[var37][3];
                        int var42 = var13.field6513[var37][4];
                        int var43 = var13.field6513[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method568(!arg2, var41, var43, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method564(var39, 0, var38, var40);
                        }
                    }
                }
            }
            class90 var44 = new class90(var35, var35.length);
            if (arg9 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg1.method375(var44, var32, class557.field7950, 64, 850);
            if (arg9 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class13.field116[var45].length > arg9.field2809[var45]) {
                        var11.method863(class505.field7270[var45], class13.field116[var45][arg9.field2809[var45]]);
                    }
                    if (arg9.field2809[var45] < class509.field7318[var45].length) {
                        var11.method863(class342.field4439[var45], class509.field7318[var45][arg9.field2809[var45]]);
                    }
                }
            }
            if (class358.field4702 != null) {
                var11.method874(var12);
                class358.field4702.method3683(var11, (byte) -108, var30);
            }
        }
        if (arg7 == null || var24 == null) {
            return var11;
        } else {
            class350 var46 = var11.method602((byte) 1, var12, true);
            var46.method1938(var24, var25, arg7.field8230, var23, arg0 - 1, var22, var21, 0, (byte) 5);
            return var46;
        }
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(Lap;BZ[III)Lhea;", line = 407)
    public static final class385 method2681(class435 arg0, byte arg1, boolean arg2, int[] arg3, int arg4, int arg5) {
        field6584++;
        if (arg1 >= -72) {
            field6593 = 20;
        }
        if (!arg0.field6061 && (!class644.method3612(false, arg4) || !class644.method3612(false, arg5))) {
            return arg0.field6012 ? new class385(arg0, 34037, arg4, arg5, arg2, arg3) : new class385(arg0, arg4, arg5, class146.method799(arg4, -125), class146.method799(arg5, -116), arg3);
        } else {
            return new class385(arg0, 3553, arg4, arg5, arg2, arg3);
        }
    }
}
