import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class72 extends class45 {

    @OriginalMember(owner = "client!a", name = "o", descriptor = "[I")
    public int[] field1040 = new int[1];

    @OriginalMember(owner = "client!a", name = "m", descriptor = "[I")
    public int[] field1038 = new int[] { -1 };

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field1037 = 0;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "[B")
    public static byte[] field1039;

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Ljava/lang/String;")
    public static String field1045;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!a", name = "p", descriptor = "I")
    public static int field1041;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field1042;

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field1043;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "I")
    public static int field1044;

    static {
        int var0 = 0;
        field1039 = new byte[32896];
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field1039[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + (var1 * var1 + 65535)) / 65535.0F))));
            }
        }
        field1045 = "purple:";
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method527(boolean arg0) {
        field1036++;
        class276.field3998 = -1;
        if (arg0) {
            method529((class45) null, (class45) null, -103);
        }
        class351.field5090 = 0;
        class59.field792 = -1;
        class376.field5470 = -1;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "([IZZI[I)J", line = 18)
    private final long method528(int[] arg0, boolean arg1, boolean arg2, int arg3, int[] arg4) {
        field1042++;
        long[] var6 = class397.field5895;
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg3 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) (((long) arg3 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) (((long) (arg4[var13] >> 24) ^ var11) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg4[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var6[(int) ((var19 ^ (long) (arg4[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var6[(int) (((long) arg4[var13] ^ var21) & 0xFFL)] ^ var21 >>> 8;
        }
        if (!arg1) {
            field1045 = null;
        }
        if (arg0 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg0[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg2 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lfb;Lfb;I)V", line = 62)
    public static final void method529(class45 arg0, class45 arg1, int arg2) {
        if (arg0.field641 != null) {
            arg0.method322(11);
        }
        field1041++;
        arg0.field641 = arg1.field641;
        if (arg2 == 5) {
            arg0.field636 = arg1;
            arg0.field641.field636 = arg0;
            arg0.field636.field641 = arg0;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)Lil;", line = 81)
    public static final class264 method530(int arg0, int arg1) {
        field1043++;
        if (arg1 < 73) {
            method529((class45) null, (class45) null, -25);
        }
        class264 var2 = (class264) class11.field167.method1137((long) arg0, 2108653711);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class448.field6567.method2261(arg0, 1, 114);
        class264 var4 = new class264();
        if (var3 != null) {
            var4.method1814(new class228(var3), (byte) -35, arg0);
        }
        class11.field167.method1144((long) arg0, var4, -3480);
        return var4;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ZLrj;IIILii;ILls;II)Ldc;", line = 105)
    public final class375 method531(boolean arg0, class12 arg1, int arg2, int arg3, int arg4, class405 arg5, int arg6, class296 arg7, int arg8, int arg9) {
        field1044++;
        class375 var11 = null;
        int var12 = arg6;
        class396 var13 = null;
        if (arg4 != -1) {
            var13 = class354.method2329(arg4, -104);
        }
        int[] var14 = this.field1038;
        if (var13 != null && var13.field5855 != null) {
            var14 = new int[var13.field5855.length];
            for (int var15 = 0; var15 < var13.field5855.length; var15++) {
                int var16 = var13.field5855[var15];
                if (var16 >= 0 && var16 < this.field1038.length) {
                    var14[var15] = this.field1038[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = arg8;
        class442 var23 = null;
        class442 var24 = null;
        if (arg1 != null) {
            int var25 = arg1.field182[arg9];
            var12 = arg6 | 0x20;
            int var26 = var25 >>> 16;
            var23 = class307.method2093(arg8 + 3, var26);
            var20 = var25 & 0xFFFF;
            if (var23 != null) {
                var18 |= var23.method2782((byte) 87, var20);
                var17 |= var23.method2783(var20, (byte) -83);
                var19 |= arg1.field201;
            }
            if ((arg1.field196 || class120.field1676) && arg3 != -1 && arg3 < arg1.field182.length) {
                int var27 = arg1.field182[arg3];
                var22 = arg1.field176[arg9];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class307.method2093(3, var21 >>> 16);
                }
                if (var24 != null) {
                    var18 |= var24.method2782((byte) 87, var21);
                    var17 |= var24.method2783(var21, (byte) -83);
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
        }
        long var29 = this.method528(arg7 == null ? null : arg7.field4258, true, arg0, arg4, var14);
        if (class403.field5996 != null) {
            var11 = (class375) class403.field5996.method1137(var29, 2108653711);
        }
        if (var11 == null || arg5.method1643(var11.method1608(), var12) != 0) {
            if (var11 != null) {
                var12 = arg5.method1620(var12, var11.method1608());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class9.method74(var14[var33], (byte) 85).method596(arg0, 91)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class245[] var34 = new class245[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class9.method74(var14[var35], (byte) -115).method585(-113, arg0);
                }
            }
            if (var13 != null && var13.field5888 != null) {
                for (int var36 = 0; var36 < var13.field5888.length; var36++) {
                    if (var13.field5888[var36] != null && var34[var36] != null) {
                        int var37 = var13.field5888[var36][0];
                        int var38 = var13.field5888[var36][1];
                        int var39 = var13.field5888[var36][2];
                        int var40 = var13.field5888[var36][3];
                        int var41 = var13.field5888[var36][4];
                        int var42 = var13.field5888[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method1474((byte) -125, var42, var41, var40);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method1483(var39, var37, var38, (byte) 110);
                        }
                    }
                }
            }
            if (arg7 != null) {
                var31 = var12 | 0x2000;
            }
            class245 var43 = new class245(var34, var34.length);
            var11 = arg5.method1715(var43, var31, class434.field6383, 64, 850);
            if (arg7 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (arg7.field4258[var44] < class442.field6478[var44].length) {
                        var11.method1569(class308.field4539[var44], class442.field6478[var44][arg7.field4258[var44]]);
                    }
                    if (arg7.field4258[var44] < class98.field1371[var44].length) {
                        var11.method1569(class394.field5729[var44], class98.field1371[var44][arg7.field4258[var44]]);
                    }
                }
            }
            if (class403.field5996 != null) {
                var11.method1593(var12);
                class403.field5996.method1144(var29, var11, -3480);
            }
        }
        if (arg1 == null || var23 == null) {
            return var11;
        } else {
            class375 var45 = var11.method1568((byte) 1, var12, true);
            var45.method2429(var20, var22, var24, arg2 - 1, arg8 ^ 0x2, var21, 0, var23, arg1.field201);
            return var45;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)V", line = 338)
    public static void method532(byte arg0) {
        if (arg0 != -50) {
            method532((byte) -9);
        }
        field1039 = null;
        field1045 = null;
    }
}
