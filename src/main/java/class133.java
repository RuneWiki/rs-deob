import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class133 extends class176 {

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "[I")
    public int[] field2116 = new int[1];

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "[I")
    public int[] field2115 = new int[] { -1 };

    @OriginalMember(owner = "client!ib", name = "r", descriptor = "Loca;")
    public static class221 field2120 = new class221(10, 2, 2, 0);

    @OriginalMember(owner = "client!ib", name = "o", descriptor = "I")
    public static int field2117;

    @OriginalMember(owner = "client!ib", name = "p", descriptor = "I")
    public static int field2118;

    @OriginalMember(owner = "client!ib", name = "q", descriptor = "I")
    public static int field2119;

    @OriginalMember(owner = "client!ib", name = "s", descriptor = "I")
    public static int field2121;

    @OriginalMember(owner = "client!ib", name = "t", descriptor = "I")
    public static int field2122;

    @OriginalMember(owner = "client!ib", name = "u", descriptor = "I")
    public static int field2123;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "(III)I")
    public static final int method897(int arg0, int arg1, int arg2) {
        if (arg0 != 31354) {
            field2120 = null;
        }
        field2122++;
        int var3 = 1;
        while (arg2 > 1) {
            if ((arg2 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg2 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)I")
    public static int method898(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(B)V")
    public static void method899(byte arg0) {
        if (arg0 <= 89) {
            method899((byte) 37);
        }
        field2120 = null;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIZBILqa;ILdba;ILco;)Lr;")
    public final class157 method900(int arg0, int arg1, boolean arg2, byte arg3, int arg4, class207 arg5, int arg6, class78 arg7, int arg8, class101 arg9) {
        field2117++;
        class157 var11 = null;
        int var12 = arg6;
        class107 var13 = null;
        if (arg1 != -1) {
            var13 = class263.field3678.method710(260522, arg1);
        }
        int[] var14 = this.field2115;
        if (var13 != null && var13.field1635 != null) {
            var14 = new int[var13.field1635.length];
            for (int var15 = 0; var15 < var13.field1635.length; var15++) {
                int var16 = var13.field1635[var15];
                if (var16 >= 0 && this.field2115.length > var16) {
                    var14[var15] = this.field2115[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        if (arg3 <= 39) {
            return null;
        }
        class353 var24 = null;
        class353 var25 = null;
        if (arg7 != null) {
            var12 = arg6 | 0x20;
            int var26 = arg7.field1261[arg8];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class331.field4418.method194(var27, false);
            if (var24 != null) {
                var18 |= var24.method2115(var21, true);
                var17 |= var24.method2116((byte) 90, var21);
                var20 |= var24.method2117(var21, (byte) 69);
                var19 |= arg7.field1265;
            }
            if ((arg7.field1278 || class536.field7500) && arg0 != -1 && arg7.field1261.length > arg0) {
                var23 = arg7.field1260[arg8];
                int var28 = arg7.field1261[arg0];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class331.field4418.method194(var22 >>> 16, false);
                }
                if (var25 != null) {
                    var18 |= var25.method2115(var22, true);
                    var17 |= var25.method2116((byte) 58, var22);
                    var20 |= var25.method2117(var22, (byte) 69);
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
        long var30 = this.method902(arg2, arg1, arg9 == null ? null : arg9.field1527, -20881, var14);
        if (class483.field6809 != null) {
            var11 = (class157) class483.field6809.method3252(var30, (byte) 102);
        }
        if (var11 == null || arg5.method1357(var11.method166(), var12) != 0) {
            if (var11 != null) {
                var12 = arg5.method1306(var12, var11.method166());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class181.field2574.method866(var14[var34], (byte) 79).method3621(85, arg2)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class317[] var35 = new class317[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class181.field2574.method866(var14[var36], (byte) 79).method3624(-122, arg2);
                }
            }
            if (var13 != null && var13.field1654 != null) {
                for (int var37 = 0; var37 < var13.field1654.length; var37++) {
                    if (var13.field1654[var37] != null && var35[var37] != null) {
                        int var38 = var13.field1654[var37][0];
                        int var39 = var13.field1654[var37][1];
                        int var40 = var13.field1654[var37][2];
                        int var41 = var13.field1654[var37][3];
                        int var42 = var13.field1654[var37][4];
                        int var43 = var13.field1654[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method1979(var43, var42, 120, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method1976(0, var40, var39, var38);
                        }
                    }
                }
            }
            class317 var44 = new class317(var35, var35.length);
            if (arg9 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg5.method1293(var44, var32, class567.field7831, 64, 850);
            if (arg9 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (arg9.field1527[var45] < class245.field3413[var45].length) {
                        var11.method137(class309.field4173[var45], class245.field3413[var45][arg9.field1527[var45]]);
                    }
                    if (arg9.field1527[var45] < class532.field7447[var45].length) {
                        var11.method137(class192.field2724[var45], class532.field7447[var45][arg9.field1527[var45]]);
                    }
                }
            }
            if (class483.field6809 != null) {
                var11.method138(var12);
                class483.field6809.method3243(var11, var30, 93);
            }
        }
        if (arg7 == null || var24 == null) {
            return var11;
        } else {
            class157 var46 = var11.method163((byte) 1, var12, true);
            var46.method1014(0, var25, arg7.field1265, 16384, var24, var21, var23, var22, arg4 - 1);
            return var46;
        }
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(III)V")
    public static final void method901(int arg0, int arg1, int arg2) {
        class622 var3 = class356.field4807[arg0][arg1][arg2];
        if (var3 == null) {
            return;
        }
        if (var3.field8981 != null) {
            var3.field8981 = null;
        }
        if (var3.field8977 != null) {
            var3.field8977 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ZI[II[I)J")
    private final long method902(boolean arg0, int arg1, int[] arg2, int arg3, int[] arg4) {
        field2119++;
        long[] var6 = class439.field6245;
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg1 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) (((long) arg1 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        if (arg3 != -20881) {
            return 110L;
        }
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg4[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg4[var13] >> 16)) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg4[var13] >> 8)) & 0xFFL)];
            var11 = var6[(int) ((var21 ^ (long) arg4[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg2[var14]) & 0xFFL)];
            }
        }
        return var6[(int) ((var11 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Z)V")
    public static final void method903(boolean arg0) {
        if (arg0) {
            class356.field4807 = class118.field1941;
            class590.field8430 = client.field3472;
        } else {
            class356.field4807 = class317.field4302;
            class590.field8430 = class608.field8767;
        }
        class395.field5610 = class356.field4807.length;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IZ)V")
    public static final void method904(int arg0, boolean arg1) {
        class250.field3451++;
        if (arg0 != 0) {
            return;
        }
        class351.method2108(class323.field4359, -10511);
        field2118++;
        for (class128 var2 = (class128) class211.field2971.method1248(arg0 - 1); var2 != null; var2 = (class128) class211.field2971.method1245((byte) 95)) {
            if (!var2.method1120(0)) {
                var2 = (class128) class211.field2971.method1248(-1);
                if (var2 == null) {
                    break;
                }
            }
            if (var2.field2063 == 0) {
                class299.method1902(true, var2, (byte) 78, arg1);
            }
        }
        if (class615.field8838 != null) {
            class403.method2407(class615.field8838, -9130);
            class615.field8838 = null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IIB)Z")
    public static final boolean method905(int arg0, int arg1, byte arg2) {
        field2123++;
        if (arg2 != 14) {
            field2120 = null;
        }
        return (arg1 & 0x70000) != 0 | class320.method1993(arg1, (byte) 5, arg0) || class376.method2228(16024, arg1, arg0);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)Lfi;")
    public static final class477 method906(int arg0) {
        int var1 = 112 / ((arg0 + 70) / 52);
        field2121++;
        return class413.field5806;
    }
}
