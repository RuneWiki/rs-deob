import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class167 extends class498 {

    @OriginalMember(owner = "client!kw", name = "o", descriptor = "[I")
    public int[] field2432 = new int[] { -1 };

    @OriginalMember(owner = "client!kw", name = "p", descriptor = "[I")
    public int[] field2433 = new int[1];

    @OriginalMember(owner = "client!kw", name = "r", descriptor = "I")
    public static int field2435 = 0;

    @OriginalMember(owner = "client!kw", name = "n", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!kw", name = "q", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!kw", name = "s", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!kw", name = "t", descriptor = "I")
    public static int field2437;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)Ltj;", line = 4)
    public static final class135 method1050(int arg0, int arg1) {
        if (arg0 > -21) {
            return null;
        } else {
            field2434++;
            return class367.field5240 && class399.field5626 <= arg1 && arg1 <= class434.field6109 ? class429.field6045[arg1 - class399.field5626] : null;
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 19)
    public static final boolean method1051(String arg0, byte arg1) {
        field2436++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class419.field5909; var2++) {
            if (arg0.equalsIgnoreCase(class388.field5452[var2])) {
                return true;
            }
            if (arg0.equalsIgnoreCase(class152.field2192[var2])) {
                return true;
            }
        }
        if (arg1 >= -89) {
            method1050(18, -37);
        }
        return false;
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "([II[IBZ)J", line = 48)
    private final long method1052(int[] arg0, int arg1, int[] arg2, byte arg3, boolean arg4) {
        field2431++;
        long[] var6 = class205.field2973;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) (((long) (arg1 >> 8) ^ var7) & 0xFFL)];
        if (arg3 != -72) {
            this.field2433 = null;
        }
        long var11 = var6[(int) ((var9 ^ (long) arg1) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg0.length; var13++) {
            long var17 = var6[(int) (((long) (arg0[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) ((var17 ^ (long) (arg0[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg0[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) (((long) arg0[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg2 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg2[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg4 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(ILjl;IILza;ILeb;IIZ)Le;", line = 101)
    public final class377 method1053(int arg0, class181 arg1, int arg2, int arg3, class290 arg4, int arg5, class449 arg6, int arg7, int arg8, boolean arg9) {
        field2437++;
        class377 var11 = null;
        int var12 = arg0;
        class98 var13 = null;
        if (arg2 != -1) {
            var13 = class498.field7049.method2069((byte) -9, arg2);
        }
        int[] var14 = this.field2432;
        if (var13 != null && var13.field1290 != null) {
            var14 = new int[var13.field1290.length];
            for (int var15 = 0; var15 < var13.field1290.length; var15++) {
                int var16 = var13.field1290[var15];
                if (var16 >= 0 && var16 < this.field2432.length) {
                    var14[var15] = this.field2432[var16];
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
        class454 var24 = null;
        class454 var25 = null;
        if (arg6 != null) {
            int var26 = arg6.field6276[arg7];
            var12 = arg0 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class62.field784.method2572(var27, (byte) 103);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method2648(13834, var21);
                var17 |= var24.method2651(var21, -1094206008);
                var20 |= var24.method2649(var21, 255);
                var19 |= arg6.field6260;
            }
            if ((arg6.field6270 || class26.field318) && arg8 != -1 && arg8 < arg6.field6276.length) {
                var23 = arg6.field6258[arg7];
                int var28 = arg6.field6276[arg8];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class62.field784.method2572(var22 >>> 16, (byte) 77);
                }
                if (var25 != null) {
                    var18 |= var25.method2648(13834, var22);
                    var17 |= var25.method2651(var22, -1094206008);
                    var20 |= var25.method2649(var22, arg5 ^ 0x5EA);
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
        long var30 = this.method1052(var14, arg2, arg1 == null ? null : arg1.field2600, (byte) -72, arg9);
        if (class273.field4036 != null) {
            var11 = (class377) class273.field4036.method1088(var30, (byte) 118);
        }
        if (var11 == null || arg4.method324(var11.method1605(), var12) != 0) {
            if (var11 != null) {
                var12 = arg4.method302(var12, var11.method1605());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class344.field5000.method993(var14[var34], true).method2287(arg9, false)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class117[] var35 = new class117[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class344.field5000.method993(var14[var36], true).method2290(arg9, -14);
                }
            }
            if (var13 != null && var13.field1287 != null) {
                for (int var37 = 0; var37 < var13.field1287.length; var37++) {
                    if (var13.field1287[var37] != null && var35[var37] != null) {
                        int var38 = var13.field1287[var37][0];
                        int var39 = var13.field1287[var37][1];
                        int var40 = var13.field1287[var37][2];
                        int var41 = var13.field1287[var37][3];
                        int var42 = var13.field1287[var37][4];
                        int var43 = var13.field1287[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method780(var43, var41, var42, arg5 - 1305);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method784(var38, var39, (byte) 68, var40);
                        }
                    }
                }
            }
            class117 var44 = new class117(var35, var35.length);
            if (arg1 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg4.method293(var44, var32, class502.field7096, 64, 850);
            if (arg1 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class426.field5988[var45].length > arg1.field2600[var45]) {
                        var11.method1570(class67.field851[var45], class426.field5988[var45][arg1.field2600[var45]]);
                    }
                    if (class80.field1041[var45].length > arg1.field2600[var45]) {
                        var11.method1570(class421.field5942[var45], class80.field1041[var45][arg1.field2600[var45]]);
                    }
                }
            }
            if (class273.field4036 != null) {
                var11.method1606(var12);
                class273.field4036.method1097(19627, var11, var30);
            }
        }
        if (arg6 == null || var24 == null) {
            return var11;
        }
        class377 var46 = var11.method1590((byte) 1, var12, true);
        var46.method2205((byte) -99, var21, var22, var25, 0, arg3 - 1, var23, arg6.field6260, var24);
        if (arg5 != 1301) {
            this.field2433 = null;
        }
        return var46;
    }
}
