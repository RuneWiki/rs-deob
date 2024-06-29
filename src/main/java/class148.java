import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class148 extends class337 {

    @OriginalMember(owner = "client!nt", name = "l", descriptor = "[I")
    public int[] field1884 = new int[1];

    @OriginalMember(owner = "client!nt", name = "t", descriptor = "[I")
    public int[] field1892 = new int[] { -1 };

    @OriginalMember(owner = "client!nt", name = "q", descriptor = "I")
    public static int field1889 = 0;

    @OriginalMember(owner = "client!nt", name = "m", descriptor = "[C")
    private static char[] field1885 = new char[64];

    @OriginalMember(owner = "client!nt", name = "v", descriptor = "Liea;")
    public static class12 field1894;

    @OriginalMember(owner = "client!nt", name = "n", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!nt", name = "o", descriptor = "I")
    public static int field1887;

    @OriginalMember(owner = "client!nt", name = "p", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!nt", name = "r", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!nt", name = "s", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!nt", name = "u", descriptor = "[J")
    public static long[] field1893;

    static {
        for (int var0 = 0; var0 < 26; var0++) {
            field1885[var0] = (char) (var0 + 65);
        }
        for (int var1 = 26; var1 < 52; var1++) {
            field1885[var1] = (char) (var1 + 71);
        }
        for (int var2 = 52; var2 < 62; var2++) {
            field1885[var2] = (char) (var2 + 48 - 52);
        }
        field1885[63] = '-';
        field1885[62] = '*';
        field1894 = new class12();
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "([I[IIZI)J", line = 7)
    private final long method844(int[] arg0, int[] arg1, int arg2, boolean arg3, int arg4) {
        field1887++;
        if (arg2 != -485709496) {
            this.field1884 = null;
        }
        long[] var6 = class693.field8897;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg4 >> 8) ^ var7) & 0xFFL)];
        long var11 = var6[(int) (((long) arg4 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg0.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var6[(int) (((long) (arg0[var13] >> 16) ^ var17) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) ((var21 ^ (long) arg0[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg1[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg3 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(Lwm;II)Lkca;", line = 50)
    public static final class790 method845(class30 arg0, int arg1, int arg2) {
        field1891++;
        byte[] var3 = arg0.method148((byte) 119, arg2);
        if (var3 == null) {
            return null;
        } else if (arg1 == 0) {
            return new class790(var3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(B)V", line = 67)
    public static void method846(byte arg0) {
        field1894 = null;
        if (arg0 != 82) {
            field1893 = null;
        }
        field1885 = null;
        field1893 = null;
    }

    @OriginalMember(owner = "client!nt", name = "a", descriptor = "(ILjba;IIIIZILlga;Lha;)Lka;", line = 88)
    public final class299 method847(int arg0, class11 arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, class756 arg8, class570 arg9) {
        field1888++;
        class299 var11 = null;
        int var12 = arg2;
        class68 var13 = null;
        if (arg0 != -1) {
            var13 = class66.field869.method2048(arg0, (byte) 120);
        }
        int[] var14 = this.field1892;
        if (var13 != null && var13.field925 != null) {
            var14 = new int[var13.field925.length];
            for (int var15 = 0; var15 < var13.field925.length; var15++) {
                int var16 = var13.field925[var15];
                if (var16 >= 0 && var16 < this.field1892.length) {
                    var14[var15] = this.field1892[var16];
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
        class350 var24 = null;
        class350 var25 = null;
        if (arg1 != null) {
            var12 = arg2 | 0x20;
            int var26 = arg1.field109[arg4];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class143.field1864.method4264(26510, var27);
            if (var24 != null) {
                var18 |= var24.method2021(var21, 127);
                var17 |= var24.method2025(var21, arg3 ^ 0x3F);
                var20 |= var24.method2020(var21, arg3 + 64);
                var19 |= arg1.field98;
            }
            if ((arg1.field108 || class449.field5850) && arg5 != -1 && arg5 < arg1.field109.length) {
                var23 = arg1.field121[arg4];
                int var28 = arg1.field109[arg5];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class143.field1864.method4264(26510, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method2021(var22, 121);
                    var17 |= var25.method2025(var22, -2);
                    var20 |= var25.method2020(var22, 1);
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
        long var30 = this.method844(var14, arg8 == null ? null : arg8.field10307, -485709496, arg6, arg0);
        if (class456.field5972 != null) {
            var11 = (class299) class456.field5972.method2931(var30, (byte) -94);
        }
        if (var11 == null || arg9.method941(var11.method1239(), var12) != 0) {
            if (var11 != null) {
                var12 = arg9.method886(var12, var11.method1239());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class640.field8189.method705(var14[var34], -11467).method311(null, (byte) 108, arg6)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class615[] var35 = new class615[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class640.field8189.method705(var14[var36], arg3 - 11404).method315(0, null, arg6);
                }
            }
            if (var13 != null && var13.field920 != null) {
                for (int var37 = 0; var37 < var13.field920.length; var37++) {
                    if (var13.field920[var37] != null && var35[var37] != null) {
                        int var38 = var13.field920[var37][0];
                        int var39 = var13.field920[var37][1];
                        int var40 = var13.field920[var37][2];
                        int var41 = var13.field920[var37][3];
                        int var42 = var13.field920[var37][4];
                        int var43 = var13.field920[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3300(var41, var43, var42, (byte) 9);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3290(var38, true, var40, var39);
                        }
                    }
                }
            }
            if (arg8 != null) {
                var32 = var12 | 0x4000;
            }
            class615 var44 = new class615(var35, var35.length);
            var11 = arg9.method930(var44, var32, class766.field10417, 64, 850);
            if (arg8 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class493.field6321.length; var46++) {
                        if (class493.field6321[var46][var45].length > arg8.field10307[var45]) {
                            var11.method1265(class45.field513[var46][var45], class493.field6321[var46][var45][arg8.field10307[var45]]);
                        }
                    }
                }
            }
            if (class456.field5972 != null) {
                var11.method1252(var12);
                class456.field5972.method2918(var30, var11, 127);
            }
        }
        if (arg1 == null || var24 == null) {
            return var11;
        } else {
            class299 var47 = var11.method1284((byte) 1, var12, true);
            var47.method1787(arg7 - 1, var23, var25, 0, var21, var22, arg3 ^ arg3, arg1.field98, var24);
            return var47;
        }
    }
}
