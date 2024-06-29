import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringReader;
import java.io.StringWriter;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jd")
public class class146 extends class179 {

    @OriginalMember(owner = "client!jd", name = "j", descriptor = "[I")
    public int[] field2359 = new int[1];

    @OriginalMember(owner = "client!jd", name = "r", descriptor = "[I")
    public int[] field2367 = new int[] { -1 };

    @OriginalMember(owner = "client!jd", name = "q", descriptor = "[I")
    public static int[] field2366 = new int[500];

    @OriginalMember(owner = "client!jd", name = "s", descriptor = "[Llp;")
    public static class256[] field2368 = new class256[30];

    @OriginalMember(owner = "client!jd", name = "n", descriptor = "Z")
    public static boolean field2363 = false;

    @OriginalMember(owner = "client!jd", name = "k", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!jd", name = "l", descriptor = "I")
    public static int field2361;

    @OriginalMember(owner = "client!jd", name = "m", descriptor = "I")
    public static int field2362;

    @OriginalMember(owner = "client!jd", name = "p", descriptor = "I")
    public static int field2365;

    @OriginalMember(owner = "client!jd", name = "v", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!jd", name = "o", descriptor = "Llp;")
    public static class256 field2364;

    @OriginalMember(owner = "client!jd", name = "u", descriptor = "Llt;")
    public static class458 field2370;

    @OriginalMember(owner = "client!jd", name = "t", descriptor = "[[[B")
    public static byte[][][] field2369;

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Leu;IZIILqq;IIILfn;)Lcd;", line = 8)
    public final class198 method955(class320 arg0, int arg1, boolean arg2, int arg3, int arg4, class318 arg5, int arg6, int arg7, int arg8, class87 arg9) {
        field2360++;
        class198 var11 = null;
        int var12 = arg8;
        class14 var13 = null;
        if (arg7 != -1) {
            var13 = class511.field7740.method1405(arg7, -124);
        }
        int[] var14 = this.field2367;
        if (var13 != null && var13.field184 != null) {
            var14 = new int[var13.field184.length];
            for (int var15 = 0; var15 < var13.field184.length; var15++) {
                int var16 = var13.field184[var15];
                if (var16 >= 0 && var16 < this.field2367.length) {
                    var14[var15] = this.field2367[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        if (arg3 != 1) {
            return null;
        }
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class312 var24 = null;
        class312 var25 = null;
        if (arg9 != null) {
            int var26 = arg9.field1512[arg6];
            var12 = arg8 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class429.field6302.method108(var27, 3);
            if (var24 != null) {
                var18 |= var24.method1863(false, var21);
                var17 |= var24.method1867(var21, arg3 ^ 0xFFFFFF87);
                var20 |= var24.method1865(-108, var21);
                var19 |= arg9.field1501;
            }
            if ((arg9.field1523 || class4.field43) && arg4 != -1 && arg4 < arg9.field1512.length) {
                var23 = arg9.field1526[arg6];
                int var28 = arg9.field1512[arg4];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class429.field6302.method108(var22 >>> 16, arg3 ^ 0x2);
                }
                if (var25 != null) {
                    var18 |= var25.method1863(false, var22);
                    var17 |= var25.method1867(var22, -41);
                    var20 |= var25.method1865(-52, var22);
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
        long var30 = this.method956(true, arg0 == null ? null : arg0.field4822, var14, arg2, arg7);
        if (class394.field5752 != null) {
            var11 = (class198) class394.field5752.method1752(0, var30);
        }
        if (var11 == null || arg5.method1944(var11.method489(), var12) != 0) {
            if (var11 != null) {
                var12 = arg5.method1951(var12, var11.method489());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class288.field4362.method3030((byte) 87, var14[var34]).method1145(arg2, -1)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class303[] var35 = new class303[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class288.field4362.method3030((byte) 92, var14[var36]).method1143(-17, arg2);
                }
            }
            if (var13 != null && var13.field164 != null) {
                for (int var37 = 0; var37 < var13.field164.length; var37++) {
                    if (var13.field164[var37] != null && var35[var37] != null) {
                        int var38 = var13.field164[var37][0];
                        int var39 = var13.field164[var37][1];
                        int var40 = var13.field164[var37][2];
                        int var41 = var13.field164[var37][3];
                        int var42 = var13.field164[var37][4];
                        int var43 = var13.field164[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method1823(var43, var41, var42, 1);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method1820(var40, 0, var38, var39);
                        }
                    }
                }
            }
            class303 var44 = new class303(var35, var35.length);
            if (arg0 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg5.method1908(var44, var32, field2361, 64, 850);
            if (arg0 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class67.field1088[var45].length > arg0.field4822[var45]) {
                        var11.method485(class405.field5892[var45], class67.field1088[var45][arg0.field4822[var45]]);
                    }
                    if (class457.field7009[var45].length > arg0.field4822[var45]) {
                        var11.method485(class497.field7546[var45], class457.field7009[var45][arg0.field4822[var45]]);
                    }
                }
            }
            if (class394.field5752 != null) {
                var11.method504(var12);
                class394.field5752.method1758(1, var11, var30);
            }
        }
        if (arg9 == null || var24 == null) {
            return var11;
        } else {
            class198 var46 = var11.method511((byte) 1, var12, true);
            var46.method1232(0, var23, (byte) -16, var25, var21, arg1 - 1, var22, arg9.field1501, var24);
            return var46;
        }
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(Z[I[IZI)J", line = 252)
    private final long method956(boolean arg0, int[] arg1, int[] arg2, boolean arg3, int arg4) {
        field2362++;
        long[] var6 = class483.field7371;
        if (!arg0) {
            return 5L;
        }
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg4 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var6[(int) (((long) arg4 ^ var9) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg2[var13] >> 24)) & 0xFFL)];
            long var19 = var17 >>> 8 ^ var6[(int) (((long) (arg2[var13] >> 16) ^ var17) & 0xFFL)];
            long var21 = var6[(int) ((var19 ^ (long) (arg2[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) (((long) arg2[var13] ^ var21) & 0xFFL)];
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) (((long) arg1[var14] ^ var11) & 0xFFL)];
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg3 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(B)I", line = 298)
    public static final int method957(byte arg0) {
        field2371++;
        if (class450.field6931 == null) {
            if (!class381.field5555 && class330.field4948 > 0) {
                if (class440.field6454 && class308.field4662.method1650(81, 27365) && class330.field4948 > 2) {
                    return ((class2) class329.field4932.field45.field2795.field2795).field11;
                }
                return ((class2) class329.field4932.field45.field2795).field11;
            }
            int var1 = class251.field3835.method1686(25478);
            int var2 = class251.field3835.method1690(arg0 - 38);
            int var3 = class170.field2647;
            int var4 = class120.field2001;
            int var5 = class218.field3358;
            if (var1 > var3 && (var3 + var5) > var1) {
                int var6 = -1;
                for (int var7 = 0; var7 < class330.field4948; var7++) {
                    if (class504.field7624) {
                        int var11 = var4 + ((class330.field4948 - var7 - 1) * 16) + 33;
                        if ((var11 - 13) < var2 && var2 <= var11 + 3) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = (class330.field4948 - var7 - 1) * 16 + (var4 + 31);
                        if (var2 > var12 - 13 && var2 <= var12 + 3) {
                            var6 = var7;
                        }
                    }
                }
                if (var6 != -1) {
                    int var8 = 0;
                    class254 var9 = new class254(class329.field4932);
                    for (class2 var10 = (class2) var9.method1527(-2); var10 != null; var10 = (class2) var9.method1525((byte) 45)) {
                        if (var8++ == var6) {
                            return var10.field11;
                        }
                    }
                }
            }
        }
        if (arg0 != 46) {
            field2361 = -61;
        }
        return -1;
    }

    @OriginalMember(owner = "client!jd", name = "a", descriptor = "(ILjava/lang/Throwable;)Ljava/lang/String;", line = 412)
    public static final String method958(int arg0, Throwable arg1) throws IOException {
        if (arg0 != 14892) {
            field2368 = null;
        }
        field2365++;
        String var3;
        if (arg1 instanceof class311) {
            class311 var2 = (class311) arg1;
            var3 = var2.field4680 + " | ";
            arg1 = var2.field4683;
        } else {
            var3 = "";
        }
        StringWriter var4 = new StringWriter();
        PrintWriter var5 = new PrintWriter(var4);
        arg1.printStackTrace(var5);
        var5.close();
        String var6 = var4.toString();
        BufferedReader var7 = new BufferedReader(new StringReader(var6));
        String var8 = var7.readLine();
        while (true) {
            String var9 = var7.readLine();
            if (var9 == null) {
                return var3 + "| " + var8;
            }
            int var10 = var9.indexOf(40);
            int var11 = var9.indexOf(41, var10 + 1);
            String var12;
            if (var10 == -1) {
                var12 = var9;
            } else {
                var12 = var9.substring(0, var10);
            }
            String var13 = var12.trim();
            String var14 = var13.substring(var13.lastIndexOf(32) + 1);
            String var15 = var14.substring(var14.lastIndexOf(9) + 1);
            String var16 = var3 + var15;
            if (var10 != -1 && var11 != -1) {
                int var17 = var9.indexOf(".java:", var10);
                if (var17 >= 0) {
                    var16 = var16 + var9.substring(var17 + 5, var11);
                }
            }
            var3 = var16 + ' ';
        }
    }

    @OriginalMember(owner = "client!jd", name = "d", descriptor = "(I)V", line = 485)
    public static void method959(int arg0) {
        field2370 = null;
        field2368 = null;
        if (arg0 == 0) {
            field2369 = null;
            field2364 = null;
            field2366 = null;
        }
    }
}
