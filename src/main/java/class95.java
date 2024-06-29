import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class95 extends class303 {

    @OriginalMember(owner = "client!ib", name = "H", descriptor = "I")
    private int field1559 = 4096;

    @OriginalMember(owner = "client!ib", name = "J", descriptor = "I")
    private int field1561 = 4096;

    @OriginalMember(owner = "client!ib", name = "R", descriptor = "I")
    private int field1569 = 4096;

    @OriginalMember(owner = "client!ib", name = "L", descriptor = "Lhi;")
    public static class293 field1563 = new class293();

    @OriginalMember(owner = "client!ib", name = "M", descriptor = "I")
    public static int field1564 = 0;

    @OriginalMember(owner = "client!ib", name = "P", descriptor = "I")
    public static int field1567 = 64;

    @OriginalMember(owner = "client!ib", name = "I", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!ib", name = "K", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!ib", name = "N", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!ib", name = "O", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!ib", name = "Q", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!ib", name = "U", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!ib", name = "V", descriptor = "I")
    public static int field1573;

    @OriginalMember(owner = "client!ib", name = "X", descriptor = "I")
    public static int field1574;

    @OriginalMember(owner = "client!ib", name = "G", descriptor = "Lvd;")
    public static class135 field1558;

    @OriginalMember(owner = "client!ib", name = "T", descriptor = "Ljava/lang/String;")
    public static String field1571;

    @OriginalMember(owner = "client!ib", name = "S", descriptor = "[I")
    public static int[] field1570;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(IB)[F", line = 8)
    public static final float[] method678(int arg0, byte arg1) {
        field1562++;
        if (arg1 != 80) {
            field1563 = (class293) null;
        }
        float var2 = class97.method703() + class97.method706();
        int var3 = class97.method704();
        class326.field5062[3] = 1.0F;
        float var4 = (float) ((var3 & 0xFFC021) >> 16) / 255.0F;
        float var5 = (float) (var3 & 0xFF) / 255.0F;
        float var6 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class326.field5062[2] = var5 * ((float) class280.method2001(255, arg0) / 255.0F) * var7 * var2;
        class326.field5062[1] = var2 * var7 * (float) (class280.method2001(arg0, 65329) >> 8) / 255.0F * var6;
        class326.field5062[0] = var2 * var7 * (float) class280.method2001(arg0 >> 16, 255) / 255.0F * var4;
        return class326.field5062;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(II)[[I", line = 34)
    public final int[][] method74(int arg0, int arg1) {
        field1574++;
        int[][] var3 = this.field4772.method1175(-100, arg0);
        if (this.field4772.field2488) {
            int[][] var4 = this.method2106(arg0, 0, 89);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[2];
            int[] var10 = var3[1];
            for (int var11 = 0; var11 < class70.field1108; var11++) {
                int var12 = var7[var11];
                int var13 = var5[var11];
                int var14 = var6[var11];
                if (var12 == var13 && var12 == var14) {
                    var8[var11] = this.field1561 * var13 >> 12;
                    var10[var11] = this.field1569 * var12 >> 12;
                    var9[var11] = this.field1559 * var14 >> 12;
                } else {
                    var8[var11] = this.field1561;
                    var10[var11] = this.field1569;
                    var9[var11] = this.field1559;
                }
            }
        }
        if (arg1 != 82) {
            method679((class64) null, 85, (class64) null, true, -128);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lja;ILja;ZI)Lbl;", line = 98)
    public static final class312 method679(class64 arg0, int arg1, class64 arg2, boolean arg3, int arg4) {
        field1573++;
        if (arg4 != -27477) {
            field1563 = (class293) null;
        }
        boolean var5 = true;
        int[] var6 = arg2.method477(arg1, 0);
        for (int var7 = 0; var7 < var6.length; var7++) {
            byte[] var8 = arg2.method485(arg1, (byte) -104, var6[var7]);
            if (var8 == null) {
                var5 = false;
            } else {
                int var9 = var8[0] & 0xFF << 8 | var8[1] & 0xFF;
                byte[] var10;
                if (arg3) {
                    var10 = arg0.method485(0, (byte) -115, var9);
                } else {
                    var10 = arg0.method485(var9, (byte) -128, 0);
                }
                if (var10 == null) {
                    var5 = false;
                }
            }
        }
        if (!var5) {
            return null;
        }
        try {
            return new class312(arg2, arg0, arg1, arg3);
        } catch (Exception var12) {
            return null;
        }
    }

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "(I)V", line = 152)
    public static void method680(int arg0) {
        field1570 = null;
        if (arg0 != 4096) {
            method679((class64) null, -33, (class64) null, true, 55);
        }
        field1558 = null;
        field1563 = null;
        field1571 = null;
    }

    @OriginalMember(owner = "client!ib", name = "<init>", descriptor = "()V", line = 173)
    public class95() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILpe;I)V", line = 187)
    public final void method65(int arg0, class101 arg1, int arg2) {
        if (arg2 == 0) {
            this.field1561 = arg1.method731(false);
        } else if (arg2 == 1) {
            this.field1569 = arg1.method731(false);
        } else if (arg2 == 2) {
            this.field1559 = arg1.method731(false);
        }
        if (arg0 != -4004) {
            this.method74(48, 69);
        }
        field1568++;
    }

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "(III)V", line = 223)
    public static final void method681(int arg0, int arg1, int arg2) {
        if (arg1 != -3873) {
            field1571 = (String) null;
        }
        for (int var3 = 0; var3 < class222.field3565; var3++) {
            class323 var4 = class107.method819(var3, 16173);
            if (var4 != null) {
                int var5 = var4.field5016;
                if (var5 >= 0 && !class174.field2734.method1486(arg1 + 3750, var5)) {
                    var5 = -1;
                }
                int var9;
                if (var4.field5021 >= 0) {
                    int var6 = var4.field5021;
                    int var7 = (var6 & 0x7F) + arg2;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 127) {
                        var7 = 127;
                    }
                    int var8 = (arg0 + var6 & 0xFC00) + (var6 & 0x380) + var7;
                    var9 = class174.field2740[class231.method1668(var8, 108, 96)];
                } else if (var5 >= 0) {
                    var9 = class174.field2740[class231.method1668(class174.field2734.method1476(65535, var5), 119, 96)];
                } else if (var4.field5008 == -1) {
                    var9 = -1;
                } else {
                    int var10 = var4.field5008;
                    int var11 = (var10 & 0x7F) + arg2;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg0 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var9 = class174.field2740[class231.method1668(var12, arg1 + 3988, 96)];
                }
                class23.field403[var3 + 1] = var9;
            }
        }
        field1560++;
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(ILja;BLja;I)Lvd;", line = 298)
    public static final class135 method682(int arg0, class64 arg1, byte arg2, class64 arg3, int arg4) {
        if (arg2 > -64) {
            field1565 = -24;
        }
        field1566++;
        return class150.method1152(arg3, arg0, 50, arg4) ? class24.method166((byte) 72, arg1.method467(arg4, 68, arg0)) : null;
    }

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "(II)V", line = 331)
    public static final void method683(int arg0, int arg1) {
        if (arg1 != 16760865) {
            field1565 = -86;
        }
        field1572++;
        class175.field2750.method1828(arg0, (byte) 95);
    }
}
