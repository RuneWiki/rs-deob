import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ur")
public class class92 extends class424 {

    @OriginalMember(owner = "client!ur", name = "U", descriptor = "[B")
    public static byte[] field1289;

    @OriginalMember(owner = "client!ur", name = "W", descriptor = "Lka;")
    public static class408 field1291;

    @OriginalMember(owner = "client!ur", name = "X", descriptor = "Lhc;")
    public static class368 field1292;

    @OriginalMember(owner = "client!ur", name = "L", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ur", name = "M", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ur", name = "N", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!ur", name = "O", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ur", name = "P", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!ur", name = "Q", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ur", name = "R", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ur", name = "S", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ur", name = "V", descriptor = "I")
    public static int field1290;

    @OriginalMember(owner = "client!ur", name = "Y", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!ur", name = "T", descriptor = "[Lvb;")
    private class91[] field1288;

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (arg1 == -48) {
            if (~arg2 == -1) {
                this.field1288 = new class91[arg0.method2306((byte) 104)];
                for (int var4 = 0; ~var4 > ~this.field1288.length; ++var4) {
                    int var5 = arg0.method2306((byte) 53);
                    if (var5 != 0) {
                        if (var5 != 1) {
                            if (~var5 != -3) {
                                if (var5 == 3) {
                                    this.field1288[var4] = class6.method36(true, arg0);
                                }
                            } else {
                                this.field1288[var4] = class323.method1969(arg1 + 158, arg0);
                            }
                        } else {
                            this.field1288[var4] = class204.method1392(arg0, (byte) -123);
                        }
                    } else {
                        this.field1288[var4] = class42.method365(arg0, 105);
                    }
                }
            } else if (arg2 == 1) {
                super.field5893 = arg0.method2306((byte) 126) == 1;
            }
            ++field1280;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(Ljava/util/Random;II)I")
    public static final int method724(Random arg0, int arg1, int arg2) {
        ++field1281;
        if (~arg1 >= -1) {
            throw new IllegalArgumentException();
        } else if (class93.method730(true, arg1)) {
            return (int) ((4294967295L & (long) arg0.nextInt()) * (long) arg1 >> 32);
        } else {
            if (arg2 <= 93) {
                method724((Random) null, -69, -29);
            }
            int var3 = -((int) (4294967296L % (long) arg1)) + Integer.MIN_VALUE;
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (~var3 >= ~var4);
            return class214.method1427(arg1, var4, (byte) -117);
        }
    }

    @OriginalMember(owner = "client!ur", name = "c", descriptor = "(III)Z")
    public static final boolean method725(int arg0, int arg1, int arg2) {
        ++field1287;
        if (!class317.field4324) {
            return false;
        } else {
            int var3 = arg2 >> 16;
            int var4 = 65535 & arg2;
            if (arg1 != 1009) {
                return true;
            } else if (class103.field1425[var3] != null && class103.field1425[var3][var4] != null) {
                class108 var5 = class103.field1425[var3][var4];
                if (~arg0 == 0 && var5.field1666 == 0) {
                    for (class429 var6 = (class429) class451.field6491.method1173(0); var6 != null; var6 = (class429) class451.field6491.method1165(true)) {
                        if (var6.field5977 == 6 || ~var6.field5977 == -1010 || ~var6.field5977 == -6 || ~var6.field5977 == -3 || ~var6.field5977 == -24) {
                            for (class108 var7 = class157.method1139(var6.field5974, false); var7 != null; var7 = class452.method2820(var7, (byte) -92)) {
                                if (var5.field1631 == var7.field1631) {
                                    return true;
                                }
                            }
                        }
                    }
                } else {
                    for (class429 var8 = (class429) class451.field6491.method1173(0); var8 != null; var8 = (class429) class451.field6491.method1165(true)) {
                        if (~var8.field5975 == ~arg0 && ~var5.field1631 == ~var8.field5974 && (var8.field5977 == 6 || var8.field5977 == 1009 || var8.field5977 == 5 || var8.field5977 == 2 || var8.field5977 == 23)) {
                            return true;
                        }
                    }
                }
                return false;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(ILon;)V")
    public static final void method726(int arg0, class35 arg1) {
        int var2 = -105 % ((arg0 - 13) / 63);
        ++field1285;
        class129.field1951 = arg1;
    }

    @OriginalMember(owner = "client!ur", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        if (arg1 != -10) {
            return null;
        } else {
            ++field1282;
            int[] var3 = super.field5892.method783(arg0, (byte) -31);
            if (super.field5892.field1427) {
                this.method729(super.field5892.method781(arg1 + 32345), (byte) -84);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IIIBII)V")
    public static final void method727(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field1283;
        int var6 = -arg5 + arg2;
        int var7 = -arg1 + arg4;
        if (var7 == 0) {
            if (var6 != 0) {
                class149.method1111(arg0, -1147, arg2, arg1, arg5);
            }
        } else if (~var6 == -1) {
            class442.method2742(arg1, arg4, false, arg5, arg0);
        } else {
            if (~var7 > -1) {
                var7 = -var7;
            }
            if (var6 < 0) {
                var6 = -var6;
            }
            boolean var8 = ~var6 < ~var7;
            if (var8) {
                int var9 = arg1;
                arg1 = arg5;
                int var10 = arg4;
                arg4 = arg2;
                arg5 = var9;
                arg2 = var10;
            }
            if (~arg4 > ~arg1) {
                int var11 = arg1;
                int var12 = arg5;
                arg1 = arg4;
                arg5 = arg2;
                arg4 = var11;
                arg2 = var12;
            }
            int var13 = -17 / ((arg3 - -50) / 38);
            int var14 = arg5;
            int var15 = arg4 - arg1;
            int var16 = arg2 - arg5;
            int var17 = -(var15 >> 1);
            int var18 = ~arg5 <= ~arg2 ? -1 : 1;
            if (var16 < 0) {
                var16 = -var16;
            }
            if (var8) {
                for (int var19 = arg1; var19 <= arg4; ++var19) {
                    var17 += var16;
                    class83.field1157[var19][var14] = arg0;
                    if (var17 > 0) {
                        var14 += var18;
                        var17 -= var15;
                    }
                }
            } else {
                for (int var20 = arg1; ~arg4 <= ~var20; ++var20) {
                    var17 += var16;
                    class83.field1157[var14][var20] = arg0;
                    if (~var17 < -1) {
                        var17 -= var15;
                        var14 += var18;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "(IZ)[[I")
    public final int[][] method21(int arg0, boolean arg1) {
        ++field1284;
        int[][] var3 = super.field5896.method693(arg1, arg0);
        if (super.field5896.field1228) {
            int var4 = class303.field4135;
            int var5 = class423.field5866;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field5896.method694((byte) -8);
            this.method729(var6, (byte) -84);
            for (int var8 = 0; class423.field5866 > var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~var14 > ~class303.field4135; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class187.method1301(var15, 255) << 4;
                    var12[var14] = class187.method1301(65280, var15) >> 4;
                    var11[var14] = class187.method1301(var15 >> 12, 4080);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ur", name = "<init>", descriptor = "()V")
    public class92() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ur", name = "d", descriptor = "(B)V")
    public static void method728(byte arg0) {
        field1291 = null;
        field1289 = null;
        field1292 = null;
        if (arg0 != 2) {
            field1292 = null;
        }
    }

    @OriginalMember(owner = "client!ur", name = "a", descriptor = "([[IB)V")
    private final void method729(int[][] arg0, byte arg1) {
        ++field1286;
        int var3 = class303.field4135;
        int var4 = class423.field5866;
        class86.method688(arg0, 2);
        if (arg1 == -84) {
            class312.method1889(0, (byte) 119, class174.field2484, class65.field898, 0);
            if (this.field1288 != null) {
                for (int var5 = 0; var5 < this.field1288.length; ++var5) {
                    class91 var6 = this.field1288[var5];
                    int var7 = var6.field1275;
                    int var8 = var6.field1270;
                    if (var7 < 0) {
                        if (~var8 <= -1) {
                            var6.method363(4, var4, var3);
                        }
                    } else if (~var8 <= -1) {
                        var6.method362(false, var3, var4);
                    } else {
                        var6.method367(var4, 104, var3);
                    }
                }
            }
        }
    }

    static {
        new class368((String) null, "der Spieler ist momentan nicht verfügbar.", (String) null, (String) null);
        field1289 = new byte[32896];
        int var0 = 0;
        for (int var1 = 0; var1 < 256; ++var1) {
            for (int var2 = 0; ~var2 >= ~var1; ++var2) {
                field1289[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var2 * var2 + var1 * var1 + 65535) / 65535.0F))));
            }
        }
        field1291 = new class408(8);
        field1292 = new class368(" is already on your ignore list.", " steht bereits auf deiner Ignorieren-Liste!", " est déjà dans votre liste noire.", " já está na sua lista de ignorados.");
    }
}
