import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wq")
public class class113 extends class499 {

    @OriginalMember(owner = "client!wq", name = "p", descriptor = "[I")
    public int[] field1529 = new int[1];

    @OriginalMember(owner = "client!wq", name = "o", descriptor = "[I")
    public int[] field1528 = new int[] { -1 };

    @OriginalMember(owner = "client!wq", name = "n", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field1527 = new Rectangle[100];

    @OriginalMember(owner = "client!wq", name = "u", descriptor = "F")
    public static float field1534;

    @OriginalMember(owner = "client!wq", name = "q", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!wq", name = "r", descriptor = "I")
    public static int field1531;

    @OriginalMember(owner = "client!wq", name = "s", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!wq", name = "t", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!wq", name = "v", descriptor = "I")
    public static int field1535;

    static {
        for (int var0 = 0; var0 < 100; var0++) {
            field1527[var0] = new Rectangle();
        }
        new class83(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BI)I", line = 7)
    public static final int method724(byte arg0, int arg1) {
        field1535++;
        if (arg1 == 16711935) {
            return -1;
        } else if (arg0 < 54) {
            return 40;
        } else {
            return class343.method1913(arg1, -244);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(I)I", line = 29)
    public static final int method725(int arg0) {
        field1532++;
        if (arg0 != -17117) {
            field1527 = null;
        }
        class9 var1 = class383.field5390;
        synchronized (class383.field5390) {
            return class383.field5390.method72(115);
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(IIILjh;ILqp;ZZILqa;)Lc;", line = 51)
    public final class121 method726(int arg0, int arg1, int arg2, class109 arg3, int arg4, class467 arg5, boolean arg6, boolean arg7, int arg8, class162 arg9) {
        field1531++;
        class121 var11 = null;
        int var12 = arg1;
        class21 var13 = null;
        if (arg2 != -1) {
            var13 = class20.field211.method2561(16300, arg2);
        }
        int[] var14 = this.field1528;
        if (var13 != null && var13.field239 != null) {
            var14 = new int[var13.field239.length];
            for (int var15 = 0; var15 < var13.field239.length; var15++) {
                int var16 = var13.field239[var15];
                if (var16 >= 0 && this.field1528.length > var16) {
                    var14[var15] = this.field1528[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = arg6;
        boolean var18 = false;
        boolean var19 = false;
        boolean var20 = false;
        int var21 = -1;
        int var22 = -1;
        int var23 = 0;
        class102 var24 = null;
        class102 var25 = null;
        if (arg5 != null) {
            int var26 = arg5.field6806[arg0];
            var12 = arg1 | 0x20;
            int var27 = var26 >>> 16;
            var24 = class275.field3740.method1488(-24, var27);
            var21 = var26 & 0xFFFF;
            if (var24 != null) {
                var18 |= var24.method672((byte) 94, var21);
                var17 = arg6 | var24.method673(var21, 2);
                var20 |= var24.method677((byte) -114, var21);
                var19 |= arg5.field6820;
            }
            if ((arg5.field6816 || class239.field3287) && arg4 != -1 && arg4 < arg5.field6806.length) {
                int var28 = arg5.field6806[arg4];
                var23 = arg5.field6829[arg0];
                int var29 = var28 >>> 16;
                var22 = var28 & 0xFFFF;
                if (var27 == var29) {
                    var25 = var24;
                } else {
                    var25 = class275.field3740.method1488(-24, var22 >>> 16);
                }
                if (var25 != null) {
                    var18 |= var25.method672((byte) 85, var22);
                    var17 |= var25.method673(var22, 2);
                    var20 |= var25.method677((byte) -86, var22);
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
        long var30 = this.method727((byte) 83, arg2, arg7, var14, arg3 == null ? null : arg3.field1490);
        if (class454.field6634 != null) {
            var11 = (class121) class454.field6634.method56(var30, 112);
        }
        if (var11 == null || arg9.method472(var11.method775(), var12) != 0) {
            if (var11 != null) {
                var12 = arg9.method463(var12, var11.method775());
            }
            int var32 = var12;
            boolean var33 = false;
            for (int var34 = 0; var34 < var14.length; var34++) {
                if (var14[var34] != -1 && !class75.field1097.method823(false, var14[var34]).method1791(false, arg7)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class94[] var35 = new class94[var14.length];
            for (int var36 = 0; var36 < var14.length; var36++) {
                if (var14[var36] != -1) {
                    var35[var36] = class75.field1097.method823(false, var14[var36]).method1785((byte) -11, arg7);
                }
            }
            if (var13 != null && var13.field246 != null) {
                for (int var37 = 0; var37 < var13.field246.length; var37++) {
                    if (var13.field246[var37] != null && var35[var37] != null) {
                        int var38 = var13.field246[var37][0];
                        int var39 = var13.field246[var37][1];
                        int var40 = var13.field246[var37][2];
                        int var41 = var13.field246[var37][3];
                        int var42 = var13.field246[var37][4];
                        int var43 = var13.field246[var37][5];
                        if (var41 != 0 || var42 != 0 || var43 != 0) {
                            var35[var37].method637(var41, (byte) -120, var43, var42);
                        }
                        if (var38 != 0 || var39 != 0 || var40 != 0) {
                            var35[var37].method626(var39, var38, var40, 685939247);
                        }
                    }
                }
            }
            if (arg3 != null) {
                var32 = var12 | 0x4000;
            }
            class94 var44 = new class94(var35, var35.length);
            var11 = arg9.method540(var44, var32, class154.field2217, 64, 850);
            if (arg3 != null) {
                for (int var45 = 0; var45 < 5; var45++) {
                    if (class425.field6216[var45].length > arg3.field1490[var45]) {
                        var11.method791(class159.field2288[var45], class425.field6216[var45][arg3.field1490[var45]]);
                    }
                    if (class311.field4288[var45].length > arg3.field1490[var45]) {
                        var11.method791(class458.field6685[var45], class311.field4288[var45][arg3.field1490[var45]]);
                    }
                }
            }
            if (class454.field6634 != null) {
                var11.method787(var12);
                class454.field6634.method73(var30, var11, 26425);
            }
        }
        if (arg5 == null || var24 == null) {
            return var11;
        } else {
            class121 var46 = var11.method761((byte) 1, var12, true);
            var46.method768(arg8 - 1, var21, 0, var25, arg5.field6820, var24, var22, -112, var23);
            return var46;
        }
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "(BIZ[I[I)J", line = 291)
    private final long method727(byte arg0, int arg1, boolean arg2, int[] arg3, int[] arg4) {
        field1530++;
        long[] var6 = class444.field6450;
        long var7 = -1L;
        long var9 = var6[(int) (((long) (arg1 >> 8) ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg1 ^ var9) & 0xFFL)];
        int var13 = 0;
        if (arg0 <= 79) {
            field1527 = null;
        }
        while (arg3.length > var13) {
            long var17 = var6[(int) (((long) (arg3[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) ((var17 ^ (long) (arg3[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) (((long) (arg3[var13] >> 8) ^ var19) & 0xFFL)];
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg3[var13]) & 0xFFL)];
            var13++;
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) arg4[var14]) & 0xFFL)];
            }
        }
        return var6[(int) (((long) (arg2 ? 1 : 0) ^ var11) & 0xFFL)] ^ var11 >>> 8;
    }

    @OriginalMember(owner = "client!wq", name = "c", descriptor = "(B)V", line = 335)
    public static void method728(byte arg0) {
        int var1 = 70 % ((arg0 + 57) / 47);
        field1527 = null;
    }

    @OriginalMember(owner = "client!wq", name = "a", descriptor = "([SBI)[S", line = 344)
    public static final short[] method729(short[] arg0, byte arg1, int arg2) {
        if (arg1 >= -100) {
            field1534 = -1.1198545F;
        }
        field1533++;
        short[] var3 = new short[arg2];
        class416.method2489(arg0, 0, var3, 0, arg2);
        return var3;
    }
}
