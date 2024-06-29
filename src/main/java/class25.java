import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class25 extends class30 {

    @OriginalMember(owner = "client!cd", name = "O", descriptor = "I")
    public int field532 = -1;

    @OriginalMember(owner = "client!cd", name = "P", descriptor = "I")
    public int field533 = -1;

    @OriginalMember(owner = "client!cd", name = "M", descriptor = "I")
    public int field530 = 0;

    @OriginalMember(owner = "client!cd", name = "W", descriptor = "Z")
    public boolean field540 = true;

    @OriginalMember(owner = "client!cd", name = "S", descriptor = "Lrd;")
    public static class173 field536 = class133.method843("Lade Konfiguration )2 ", -124);

    @OriginalMember(owner = "client!cd", name = "N", descriptor = "Z")
    public static boolean field531 = false;

    @OriginalMember(owner = "client!cd", name = "L", descriptor = "B")
    public static byte field529 = 0;

    @OriginalMember(owner = "client!cd", name = "V", descriptor = "I")
    public static int field539 = 0;

    @OriginalMember(owner = "client!cd", name = "K", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!cd", name = "R", descriptor = "I")
    public static int field535;

    @OriginalMember(owner = "client!cd", name = "T", descriptor = "I")
    public static int field537;

    @OriginalMember(owner = "client!cd", name = "U", descriptor = "I")
    public static int field538;

    @OriginalMember(owner = "client!cd", name = "Y", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!cd", name = "Q", descriptor = "Lde;")
    public static class36 field534;

    @OriginalMember(owner = "client!cd", name = "X", descriptor = "[Lsa;")
    public static class180[] field541;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lmb;III)V")
    private final void method193(class121 arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 1) {
            this.field530 = this.method196(true, arg0.method780(16711680));
        } else if (arg2 == 2) {
            this.field532 = arg0.method751((byte) 90);
        } else if (arg2 == 3) {
            this.field532 = arg0.method755((byte) -124);
            if (this.field532 == 65535) {
                this.field532 = -1;
            }
        } else if (arg2 == 5) {
            this.field540 = false;
        } else if (arg2 == 7) {
            this.field533 = this.method196(true, arg0.method780(16711680));
        } else if (arg2 != 8 && arg2 == 9) {
            arg0.method755((byte) -80);
        }
        field528++;
        if (arg3 != 7779) {
            method195(null, -77, 104, -11, -95, -64);
        }
    }

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "(I)V")
    public static void method194(int arg0) {
        if (arg0 <= 72) {
            method197(-57, 91);
        }
        field534 = null;
        field541 = null;
        field536 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lob;IIIII)V")
    public static final void method195(class141 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class108.field2023 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class71.field1384) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class55.field1093 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class105 var14 = class208.field4055[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class124.field2328[var11][var12 + 1][var13] + class124.field2328[var11][var12][var13] + class124.field2328[var11][var12][var13 + 1] + class124.field2328[var11][var12 + 1][var13 + 1]) / 4 - (class124.field2328[arg1][arg2 + 1][arg3] + class124.field2328[arg1][arg2][arg3] + class124.field2328[arg1][arg2][arg3 + 1] + class124.field2328[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class107 var16 = var14.field1959;
                                    if (var16 != null) {
                                        if (var16.field1995 instanceof class141) {
                                            class141 var17 = (class141) var16.field1995;
                                            class141.method877(arg0, var17, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1987 instanceof class141) {
                                            class141 var18 = (class141) var16.field1987;
                                            class141.method877(arg0, var18, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var19 = 0; var19 < var14.field1972; var19++) {
                                        class5 var20 = var14.field1948[var19];
                                        if (var20 != null && var20.field113 instanceof class141) {
                                            class141 var21 = (class141) var20.field113;
                                            int var22 = var20.field112 + 1 - var20.field120;
                                            int var23 = var20.field104 + 1 - var20.field125;
                                            class141.method877(arg0, var21, (var20.field120 - arg2) * 128 + (var22 - arg4) * 64, var15, (var20.field125 - arg3) * 128 + (var23 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ZI)I")
    private final int method196(boolean arg0, int arg1) {
        field542++;
        if (arg1 == 16711935) {
            return -1;
        }
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var3 < var5) {
            var9 = var5;
        }
        double var11 = var3;
        if (var9 < var7) {
            var9 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        if (var5 < var3) {
            var11 = var5;
        }
        if (var11 > var7) {
            var11 = var7;
        }
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 + -var11);
            }
            if (var3 == var9) {
                var13 = (var5 - var7) / (var9 - var11);
            } else if (var5 == var9) {
                var13 = (var7 - var3) / (var9 - var11) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var3 - var5) / (-var11 + var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        int var21 = (int) (var19 * 256.0D);
        int var22 = (int) (var15 * 256.0D);
        if (!arg0) {
            return -14;
        }
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = (int) (var17 * 256.0D);
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        if (var23 > 243) {
            var22 >>= 0x4;
        } else if (var23 > 217) {
            var22 >>= 0x3;
        } else if (var23 > 192) {
            var22 >>= 0x2;
        } else if (var23 > 179) {
            var22 >>= 0x1;
        }
        return (var21 >> 2 << 10) - (-(var22 >> 5 << 7) - (var23 >> 1));
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(II)V")
    public static final void method197(int arg0, int arg1) {
        field538++;
        class37 var2 = (class37) class8.field150.method677(-2755, (long) arg0);
        if (arg1 != -17117) {
            method195(null, 90, -125, 75, 31, 71);
        }
        if (var2 != null) {
            var2.method824((byte) -126);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILmb;I)V")
    public final void method198(int arg0, class121 arg1, int arg2) {
        field537++;
        while (true) {
            int var4 = arg1.method751((byte) 103);
            if (var4 == 0) {
                int var5 = -28 % ((arg2 + 44) / 41);
                return;
            }
            this.method193(arg1, arg0, var4, 7779);
        }
    }
}
