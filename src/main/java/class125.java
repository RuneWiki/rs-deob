import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class125 extends class544 {

    @OriginalMember(owner = "client!ct", name = "q", descriptor = "[I")
    public int[] field1535 = new int[] { -1 };

    @OriginalMember(owner = "client!ct", name = "t", descriptor = "[I")
    public int[] field1538 = new int[1];

    @OriginalMember(owner = "client!ct", name = "s", descriptor = "Z")
    public static boolean field1537;

    @OriginalMember(owner = "client!ct", name = "m", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!ct", name = "n", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!ct", name = "o", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!ct", name = "p", descriptor = "I")
    public static int field1534;

    @OriginalMember(owner = "client!ct", name = "r", descriptor = "I")
    public static int field1536;

    static {
        new class180("Leave request already in progress - please wait...", "Du versuchst bereits, einen Chatraum zu verlassen - bitte warte.", "Demande de sortie déjà effectuée - veuillez patienter...", "Solicitação de saída já em andamento. Aguarde...");
        field1537 = false;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IB)Lpj;", line = 4)
    public static final class126 method714(int arg0, byte arg1) {
        field1536++;
        class126 var2 = (class126) class198.field2387.method696(3, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class48.field401.method2558(100, 0, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        }
        class126 var4 = class470.method2743(false, var3);
        if (arg1 < 121) {
            field1537 = true;
        }
        class198.field2387.method691((byte) 92, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(I[I[IIZ)J", line = 28)
    private final long method715(int arg0, int[] arg1, int[] arg2, int arg3, boolean arg4) {
        field1533++;
        long[] var6 = class242.field3025;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg0 >> 8)) & 0xFFL)];
        if (arg3 != -14874) {
            return 44L;
        }
        long var11 = var6[(int) ((var9 ^ (long) arg0) & 0xFFL)] ^ var9 >>> 8;
        for (int var13 = 0; var13 < arg2.length; var13++) {
            long var17 = var6[(int) (((long) (arg2[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var17 >>> 8 ^ var6[(int) ((var17 ^ (long) (arg2[var13] >> 16)) & 0xFFL)];
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg2[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg2[var13]) & 0xFFL)];
        }
        if (arg1 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg1[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg4 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(IZIIBILpf;Lqa;ILlk;)Lr;", line = 75)
    public final class157 method716(int arg0, boolean arg1, int arg2, int arg3, byte arg4, int arg5, class498 arg6, class206 arg7, int arg8, class502 arg9) {
        if (arg4 != 37) {
            return null;
        }
        field1534++;
        class157 var11 = null;
        int var12 = arg5;
        class352 var13 = null;
        if (arg8 != -1) {
            var13 = class16.field125.method3605(arg8, 0);
        }
        int[] var14 = this.field1535;
        if (var13 != null && var13.field4556 != null) {
            var14 = new int[var13.field4556.length];
            for (int var15 = 0; var15 < var13.field4556.length; var15++) {
                int var16 = var13.field4556[var15];
                if (var16 >= 0 && this.field1535.length > var16) {
                    var14[var15] = this.field1535[var16];
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
        class183 var24 = null;
        class183 var25 = null;
        if (arg9 != null) {
            int var26 = arg9.field6944[arg3];
            var12 = arg5 | 0x20;
            int var27 = var26 >>> 16;
            var21 = var26 & 0xFFFF;
            var24 = class393.field5190.method766(var27, 100);
            if (var24 != null) {
                var18 |= var24.method1004((byte) -6, var21);
                var17 |= var24.method1006(arg4 + 134217690, var21);
                var20 |= var24.method1002(var21, 3);
                var19 |= arg9.field6943;
            }
            if ((arg9.field6954 || class166.field2034) && arg0 != -1 && arg0 < arg9.field6944.length) {
                var23 = arg9.field6952[arg3];
                int var28 = arg9.field6944[arg0];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class393.field5190.method766(var22 >>> 16, 100);
                }
                if (var25 != null) {
                    var18 |= var25.method1004((byte) -6, var22);
                    var17 |= var25.method1006(134217727, var22);
                    var20 |= var25.method1002(var22, 3);
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
        long var30 = this.method715(arg8, arg6 == null ? null : arg6.field6924, var14, -14874, arg1);
        if (class337.field4387 != null) {
            var11 = (class157) class337.field4387.method3682(0, var30);
        }
        if (var11 == null || arg7.method1128(var11.method77(), var12) != 0) {
            if (var11 != null) {
                var12 = arg7.method1145(var12, var11.method77());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class449.field6217.method2026((byte) -74, var14[var34]).method3498(arg1, arg4 + 19255)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class152[] var35 = new class152[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class449.field6217.method2026((byte) -115, var14[var36]).method3501(arg1, class347.method1937(arg4, -94));
                }
            }
            if (var13 != null && var13.field4583 != null) {
                for (int var37 = 0; var37 < var13.field4583.length; var37++) {
                    if (var13.field4583[var37] != null && var35[var37] != null) {
                        int var38 = var13.field4583[var37][0];
                        int var39 = var13.field4583[var37][1];
                        int var40 = var13.field4583[var37][2];
                        int var41 = var13.field4583[var37][3];
                        int var42 = var13.field4583[var37][4];
                        int var43 = var13.field4583[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method838(var42, (byte) 73, var43, var41);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method828(var40, var38, arg4 + 88, var39);
                        }
                    }
                }
            }
            class152 var44 = new class152(var35, var35.length);
            if (arg6 != null) {
                var32 = var12 | 0x4000;
            }
            var11 = arg7.method277(var44, var32, class522.field7323, 64, 850);
            if (arg6 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class80.field963[var45].length > arg6.field6924[var45]) {
                        var11.method70(class578.field8430[var45], class80.field963[var45][arg6.field6924[var45]]);
                    }
                    if (class379.field5035[var45].length > arg6.field6924[var45]) {
                        var11.method70(class369.field4865[var45], class379.field5035[var45][arg6.field6924[var45]]);
                    }
                }
            }
            if (class337.field4387 != null) {
                var11.method72(var12);
                class337.field4387.method3684(var11, 0, var30);
            }
        }
        if (arg9 == null || var24 == null) {
            return var11;
        } else {
            class157 var46 = var11.method64((byte) 1, var12, true);
            var46.method863(var25, 0, var21, 0, arg9.field6943, var22, var24, arg2 - 1, var23);
            return var46;
        }
    }

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "(II)V", line = 322)
    public static final void method717(int arg0, int arg1) {
        field1532++;
        if (arg1 != -1150) {
            return;
        }
        if (class578.field8436 == 0) {
            class390.field5159.method1532((byte) -125, arg0);
        } else {
            class79.field923 = arg0;
        }
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(Let;Let;I)V", line = 340)
    public static final void method718(class509 arg0, class509 arg1, int arg2) {
        field1531++;
        class574.field8388++;
        class418.method2378(17984, class607.field8791);
        class136.field1663.method2131(arg1.field7045, -1495157560);
        class136.field1663.method2101(false, arg1.field7082);
        class136.field1663.method2101(false, arg0.field7082);
        class136.field1663.method2130(0, arg0.field7045);
        class136.field1663.method2115(arg1.field7086, 3324);
        if (arg2 >= 8) {
            class136.field1663.method2148(arg0.field7086, 29780);
        }
    }
}
