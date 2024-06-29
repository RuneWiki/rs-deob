import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class430 extends class425 {

    @OriginalMember(owner = "client!vq", name = "n", descriptor = "[I")
    public int[] field6215 = new int[] { -1 };

    @OriginalMember(owner = "client!vq", name = "q", descriptor = "[I")
    public int[] field6218 = new int[1];

    @OriginalMember(owner = "client!vq", name = "p", descriptor = "[C")
    public static char[] field6217 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!vq", name = "s", descriptor = "Z")
    public static volatile boolean field6220 = true;

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "I")
    public static int field6211;

    @OriginalMember(owner = "client!vq", name = "l", descriptor = "I")
    public static int field6213;

    @OriginalMember(owner = "client!vq", name = "m", descriptor = "I")
    public static int field6214;

    @OriginalMember(owner = "client!vq", name = "o", descriptor = "I")
    public static int field6216;

    @OriginalMember(owner = "client!vq", name = "r", descriptor = "I")
    public static int field6219;

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "Lf;")
    public static class702 field6212;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Z[II[IZ)J")
    private final long method2619(boolean arg0, int[] arg1, int arg2, int[] arg3, boolean arg4) {
        field6214++;
        long[] var6 = class311.field4629;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg2 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg2 ^ var9) & 0xFFL)];
        int var13 = 0;
        if (arg4) {
            this.method2620(null, -120, (byte) -45, null, -56, -35, -1, false, -60, null);
        }
        while (arg1.length > var13) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg1[var13] >> 24)) & 0xFFL)];
            long var19 = var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg1[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var6[(int) ((var21 ^ (long) arg1[var13]) & 0xFFL)] ^ var21 >>> 8;
            var13++;
        }
        if (arg3 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg3[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg0 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lr;IBLefa;IIIZILas;)Lda;")
    public final class55 method2620(class167 arg0, int arg1, byte arg2, class168 arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, class138 arg9) {
        field6219++;
        class55 var11 = null;
        int var12 = arg4;
        class658 var13 = null;
        if (arg1 != -1) {
            var13 = class373.field5557.method1155(arg1, -40);
        }
        int[] var14 = this.field6215;
        if (var13 != null && var13.field9459 != null) {
            var14 = new int[var13.field9459.length];
            for (int var15 = 0; var15 < var13.field9459.length; var15++) {
                int var16 = var13.field9459[var15];
                if (var16 >= 0 && this.field6215.length > var16) {
                    var14[var15] = this.field6215[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        if (arg2 > -89) {
            return null;
        }
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class501 var24 = null;
        class501 var25 = null;
        if (arg9 != null) {
            var12 = arg4 | 0x20;
            int var26 = arg9.field2440[arg5];
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class357.field5338.method2103(var27, (byte) 41);
            if (var24 != null) {
                var18 |= var24.method2985(1, var21);
                var17 |= var24.method2987(var21, -83);
                var20 |= var24.method2991(var21, (byte) -17);
                var19 |= arg9.field2438;
            }
            if ((arg9.field2445 || class537.field7512) && arg8 != -1 && arg9.field2440.length > arg8) {
                int var28 = arg9.field2440[arg8];
                var23 = arg9.field2431[arg5];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class357.field5338.method2103(var22 >>> 16, (byte) 41);
                }
                if (var25 != null) {
                    var18 |= var25.method2985(1, var22);
                    var17 |= var25.method2987(var22, -22);
                    var20 |= var25.method2991(var22, (byte) -17);
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
        long var30 = this.method2619(arg7, var14, arg1, arg3 == null ? null : arg3.field2794, false);
        if (class70.field1483 != null) {
            var11 = (class55) class70.field1483.method1900(var30, -104);
        }
        if (var11 == null || arg0.method35(var11.method352(), var12) != 0) {
            if (var11 != null) {
                var12 = arg0.method34(var12, var11.method352());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class268.field3985.method258(var14[var34], (byte) -67).method985((byte) 106, arg7)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class519[] var35 = new class519[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class268.field3985.method258(var14[var36], (byte) -67).method1001(arg7, (byte) -104);
                }
            }
            if (var13 != null && var13.field9460 != null) {
                for (int var37 = 0; var37 < var13.field9460.length; var37++) {
                    if (var13.field9460[var37] != null && var35[var37] != null) {
                        int var38 = var13.field9460[var37][0];
                        int var39 = var13.field9460[var37][1];
                        int var40 = var13.field9460[var37][2];
                        int var41 = var13.field9460[var37][3];
                        int var42 = var13.field9460[var37][4];
                        int var43 = var13.field9460[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method3049(var43, var42, var41, -1);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method3051(8385, var39, var40, var38);
                        }
                    }
                }
            }
            class519 var44 = new class519(var35, var35.length);
            if (arg3 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg0.method37(var44, var32, class198.field3096, 64, 850);
            if (arg3 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    for (int var46 = 0; var46 < class85.field1611.length; var46++) {
                        if (class85.field1611[var46][var45].length > arg3.field2794[var45]) {
                            var11.method365(class154.field2612[var46][var45], class85.field1611[var46][var45][arg3.field2794[var45]]);
                        }
                    }
                }
            }
            if (class70.field1483 != null) {
                var11.method361(var12);
                class70.field1483.method1904(var11, var30, -1);
            }
        }
        if (arg9 == null || var24 == null) {
            return var11;
        } else {
            class55 var47 = var11.method357((byte) 1, var12, true);
            var47.method650(var25, arg9.field2438, var22, 117, 0, var23, arg6 - 1, var21, var24);
            return var47;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(B)V")
    public static void method2621(byte arg0) {
        if (arg0 >= -94) {
            field6217 = null;
        }
        field6217 = null;
        field6212 = null;
    }
}
