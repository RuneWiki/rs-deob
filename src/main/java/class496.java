import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class496 {

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "I")
    public int field7008;

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "Lnv;")
    private class417 field7009;

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "Lso;")
    public static class468 field7010 = new class468(13, -1);

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "I")
    public static int field7007;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "I")
    public static int field7011;

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public static int field7012;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "I")
    public static int field7013;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public static int field7014;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field7015;

    @OriginalMember(owner = "client!pi", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field7009.method2623(this.field7008, -88);
        field7013++;
        super.finalize();
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILig;)Lgo;", line = 12)
    public static final class626 method2957(int arg0, class244 arg1) {
        field7007++;
        class511 var2 = class347.method2064(arg1, arg0 ^ arg0);
        int var3 = arg1.method1466((byte) 31);
        return new class626(var2.field1253, var2.field1245, var2.field1244, var2.field1247, var2.field1249, var2.field1250, var2.field1255, var2.field1258, var2.field1252, var2.field7299, var2.field7295, var2.field7289, var2.field7294, var2.field7286, var2.field7296, var3);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILha;IILtp;IIILaa;)V", line = 26)
    public static final void method2958(int arg0, class58 arg1, int arg2, int arg3, class532 arg4, int arg5, int arg6, int arg7, class485 arg8) {
        field7011++;
        class228 var9 = class337.field4323.method2054(36, arg2);
        if (var9 != null && var9.field2596 && var9.method1317(class722.field10125, 20099)) {
            if (var9.field2641 != null) {
                int[] var10 = new int[var9.field2641.length];
                for (int var11 = 0; var11 < var10.length / 2; var11++) {
                    int var28;
                    if (field7014 == 4) {
                        var28 = (int) class227.field2590 & 0x3FFF;
                    } else {
                        var28 = (int) class227.field2590 + class34.field367 & 0x3FFF;
                    }
                    int var29 = class260.field3230[var28];
                    int var30 = class260.field3229[var28];
                    if (field7014 != 4) {
                        var29 = var29 * 256 / (class730.field10216 + 256);
                        var30 = var30 * 256 / (class730.field10216 + 256);
                    }
                    var10[var11 * 2] = arg4.field7658 / 2 + ((arg0 + (var9.field2641[var11 * 2] * 4)) * var30 + (var9.field2641[var11 * 2 + 1] * 4 + arg5) * var29 >> 14) + arg3;
                    var10[var11 * 2 + 1] = arg4.field7573 / 2 + arg7 - ((var9.field2641[var11 * 2 + 1] * 4 + arg5) * var30 - (var9.field2641[var11 * 2] * 4 + arg0) * var29 >> 14);
                }
                class63.method473(arg1, var10, var9.field2607, arg4.field7551, arg4.field7640);
                if (var9.field2632 <= 0) {
                    for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                        arg1.method330(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[(var12 + 1) * 2 + 1], var9.field2650[var9.field2647[var12] & 0xFF], 1, arg8, arg3, arg7);
                    }
                    arg1.method330(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field2650[var9.field2647[var9.field2647.length - 1] & 0xFF], 1, arg8, arg3, arg7);
                } else {
                    for (int var13 = 0; var13 < var10.length / 2 - 1; var13++) {
                        int var21 = var10[var13 * 2];
                        int var22 = var10[var13 * 2 + 1];
                        int var23 = var10[(var13 + 1) * 2];
                        int var24 = var10[var13 * 2 + 3];
                        if (var21 > var23) {
                            int var26 = var21;
                            var21 = var23;
                            int var27 = var22;
                            var22 = var24;
                            var23 = var26;
                            var24 = var27;
                        } else if (var21 == var23 && var24 < var22) {
                            int var25 = var22;
                            var22 = var24;
                            var24 = var25;
                        }
                        arg1.method409(var21, var22, var23, var24, var9.field2650[var9.field2647[var13] & 0xFF], 1, arg8, arg3, arg7, var9.field2632, var9.field2602, var9.field2609);
                    }
                    int var14 = var10[var10.length - 2];
                    int var15 = var10[var10.length - 1];
                    int var16 = var10[0];
                    int var17 = var10[1];
                    if (var16 < var14) {
                        int var19 = var14;
                        var14 = var16;
                        int var20 = var15;
                        var15 = var17;
                        var16 = var19;
                        var17 = var20;
                    } else if (var14 == var16 && var15 > var17) {
                        int var18 = var15;
                        var15 = var17;
                        var17 = var18;
                    }
                    arg1.method409(var14, var15, var16, var17, var9.field2650[var9.field2647[var9.field2647.length - 1] & 0xFF], 1, arg8, arg3, arg7, var9.field2632, var9.field2602, var9.field2609);
                }
            }
            class131 var31 = null;
            if (var9.field2605 != -1) {
                var31 = var9.method1313(arg1, true, false);
                if (var31 != null) {
                    class13.method58(arg0, arg4, arg7, false, arg3, arg5, arg8, var31);
                }
            }
            if (var9.field2646 != null) {
                int var32 = 0;
                if (var31 != null) {
                    var32 = var31.method509();
                }
                class59 var33 = class322.field4116;
                class535 var34 = class47.field511;
                if (var9.field2628 == 1) {
                    var34 = class740.field10344;
                    var33 = class720.field10104;
                }
                if (var9.field2628 == 2) {
                    var34 = class96.field1014;
                    var33 = class567.field8070;
                }
                class359.method2115(var9.field2631, arg4, arg8, arg3, var32, var34, arg7, var9.field2646, arg5, arg0, (byte) -122, var33);
            }
        }
        if (arg6 > -79) {
            field7010 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V", line = 203)
    public static void method2959(byte arg0) {
        if (arg0 < -105) {
            field7010 = null;
        }
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "(Lnv;II)V", line = 224)
    public class496(class417 arg0, int arg1, int arg2) {
        this.field7008 = arg2;
        this.field7009 = arg0;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZ)V", line = 235)
    public static final void method2960(int arg0, boolean arg1) {
        field7012++;
        if (arg0 != -30022) {
            field7015 = 68;
        }
        int var2 = class359.field4594;
        int var3 = class354.field4542;
        if (arg1 && class626.field8994) {
            var2 <<= 0x1;
            var3 = -var2;
        }
        class275.field3370.method381(var3, var2);
    }
}
