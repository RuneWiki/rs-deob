import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gn")
public class class417 {

    @OriginalMember(owner = "client!gn", name = "l", descriptor = "I")
    public int field6034 = -1;

    @OriginalMember(owner = "client!gn", name = "g", descriptor = "I")
    public static int field6029 = 0;

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "I")
    public static int field6024;

    @OriginalMember(owner = "client!gn", name = "o", descriptor = "I")
    public static int field6037;

    @OriginalMember(owner = "client!gn", name = "r", descriptor = "I")
    public static int field6040;

    @OriginalMember(owner = "client!gn", name = "u", descriptor = "I")
    public static int field6043;

    @OriginalMember(owner = "client!gn", name = "v", descriptor = "I")
    public static int field6044;

    @OriginalMember(owner = "client!gn", name = "x", descriptor = "I")
    public static int field6046;

    @OriginalMember(owner = "client!gn", name = "y", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!gn", name = "e", descriptor = "Lbr;")
    private class223 field6027;

    @OriginalMember(owner = "client!gn", name = "h", descriptor = "Ljava/lang/String;")
    private String field6030;

    @OriginalMember(owner = "client!gn", name = "m", descriptor = "Ljava/lang/String;")
    private String field6035;

    @OriginalMember(owner = "client!gn", name = "c", descriptor = "[I")
    private int[] field6025;

    @OriginalMember(owner = "client!gn", name = "d", descriptor = "[I")
    private int[] field6026;

    @OriginalMember(owner = "client!gn", name = "f", descriptor = "[I")
    private int[] field6028;

    @OriginalMember(owner = "client!gn", name = "i", descriptor = "[I")
    private int[] field6031;

    @OriginalMember(owner = "client!gn", name = "k", descriptor = "[I")
    private int[] field6033;

    @OriginalMember(owner = "client!gn", name = "n", descriptor = "[I")
    private int[] field6036;

    @OriginalMember(owner = "client!gn", name = "p", descriptor = "[I")
    private int[] field6038;

    @OriginalMember(owner = "client!gn", name = "q", descriptor = "[I")
    private int[] field6039;

    @OriginalMember(owner = "client!gn", name = "s", descriptor = "[Ljava/lang/String;")
    private String[] field6041;

    @OriginalMember(owner = "client!gn", name = "t", descriptor = "[Ljava/lang/String;")
    private String[] field6042;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "[[I")
    private int[][] field6023;

    @OriginalMember(owner = "client!gn", name = "j", descriptor = "[[I")
    private int[][] field6032;

    @OriginalMember(owner = "client!gn", name = "w", descriptor = "[[I")
    private int[][] field6045;

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(BLeb;)Lka;", line = 3)
    public static final class275 method2657(byte arg0, class371 arg1) {
        field6037++;
        if (arg0 != -31) {
            method2662(-34, 77);
        }
        class275 var2 = new class275();
        var2.field3736 = arg1.method2403((byte) 61);
        var2.field3732 = class411.method2632(var2.field3736, (byte) 58);
        return var2;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(Z)V", line = 38)
    public final void method2658(boolean arg0) {
        field6044++;
        if (this.field6035 == null) {
            this.field6035 = this.field6030;
        }
        if (arg0) {
            this.method2658(true);
        }
    }

    @OriginalMember(owner = "client!gn", name = "b", descriptor = "(BLeb;)V", line = 62)
    public final void method2659(byte arg0, class371 arg1) {
        while (true) {
            int var3 = arg1.method2429(0);
            if (var3 == 0) {
                if (arg0 != 51) {
                    return;
                }
                field6047++;
                return;
            }
            this.method2660(arg0 ^ 0xFFFFED3A, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(IILeb;)V", line = 91)
    private final void method2660(int arg0, int arg1, class371 arg2) {
        if (arg1 == 1) {
            this.field6030 = arg2.method2383(6941);
        } else if (arg1 == 2) {
            this.field6035 = arg2.method2383(arg0 ^ 0xFFFFF614);
        } else if (arg1 == 3) {
            int var4 = arg2.method2429(arg0 + 4855);
            this.field6045 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field6045[var5][0] = arg2.method2403((byte) 63);
                this.field6045[var5][1] = arg2.method2413((byte) -30);
                this.field6045[var5][2] = arg2.method2413((byte) -30);
            }
        } else if (arg1 == 4) {
            int var6 = arg2.method2429(0);
            this.field6032 = new int[var6][3];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field6032[var7][0] = arg2.method2403((byte) 79);
                this.field6032[var7][1] = arg2.method2413((byte) -30);
                this.field6032[var7][2] = arg2.method2413((byte) -30);
            }
        } else if (arg1 == 5) {
            arg2.method2403((byte) 77);
        } else if (arg1 == 6) {
            arg2.method2429(0);
        } else if (arg1 == 7) {
            arg2.method2429(0);
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg2.method2429(arg0 + 4855);
            } else if (arg1 == 10) {
                int var8 = arg2.method2429(0);
                this.field6039 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field6039[var9] = arg2.method2413((byte) -30);
                }
            } else if (arg1 == 12) {
                arg2.method2413((byte) -30);
            } else if (arg1 == 13) {
                int var10 = arg2.method2429(0);
                this.field6038 = new int[var10];
                for (int var11 = 0; var11 < var10; var11++) {
                    this.field6038[var11] = arg2.method2403((byte) 117);
                }
            } else if (arg1 == 14) {
                int var22 = arg2.method2429(0);
                this.field6023 = new int[var22][2];
                for (int var23 = 0; var23 < var22; var23++) {
                    this.field6023[var23][0] = arg2.method2429(0);
                    this.field6023[var23][1] = arg2.method2429(0);
                }
            } else if (arg1 == 15) {
                arg2.method2403((byte) 80);
            } else if (arg1 == 17) {
                this.field6034 = arg2.method2403((byte) 57);
            } else if (arg1 == 18) {
                int var20 = arg2.method2429(0);
                this.field6025 = new int[var20];
                this.field6031 = new int[var20];
                this.field6026 = new int[var20];
                this.field6042 = new String[var20];
                for (int var21 = 0; var21 < var20; var21++) {
                    this.field6025[var21] = arg2.method2413((byte) -30);
                    this.field6031[var21] = arg2.method2413((byte) -30);
                    this.field6026[var21] = arg2.method2413((byte) -30);
                    this.field6042[var21] = arg2.method2422(-1);
                }
            } else if (arg1 == 19) {
                int var18 = arg2.method2429(arg0 ^ 0xFFFFED09);
                this.field6041 = new String[var18];
                this.field6033 = new int[var18];
                this.field6036 = new int[var18];
                this.field6028 = new int[var18];
                for (int var19 = 0; var19 < var18; var19++) {
                    this.field6033[var19] = arg2.method2413((byte) -30);
                    this.field6036[var19] = arg2.method2413((byte) -30);
                    this.field6028[var19] = arg2.method2413((byte) -30);
                    this.field6041[var19] = arg2.method2422(-1);
                }
            } else if (arg1 == 249) {
                int var12 = arg2.method2429(0);
                if (this.field6027 == null) {
                    int var13 = class164.method1089(var12, (byte) -114);
                    this.field6027 = new class223(var13);
                }
                for (int var14 = 0; var14 < var12; var14++) {
                    boolean var15 = arg2.method2429(0) == 1;
                    int var16 = arg2.method2425(52);
                    class376 var17;
                    if (var15) {
                        var17 = new class424(arg2.method2422(-1));
                    } else {
                        var17 = new class23(arg2.method2413((byte) -30));
                    }
                    this.field6027.method1419((long) var16, 105, var17);
                }
            }
        }
        if (arg0 != -4855) {
            this.field6025 = null;
        }
        field6040++;
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(I)V", line = 330)
    public static final void method2661(int arg0) {
        field6046++;
        if (arg0 != 22214) {
            field6029 = 95;
        }
        if (class293.field4057 != null) {
            return;
        }
        class293.field4057 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = (float) (-var13) + var12;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var11 = var16;
                    var10 = var18;
                    var9 = var8;
                } else if (var14 == 1) {
                    var10 = var8;
                    var11 = var16;
                    var9 = var17;
                } else if (var14 == 2) {
                    var11 = var18;
                    var9 = var16;
                    var10 = var8;
                } else if (var14 == 3) {
                    var11 = var8;
                    var10 = var17;
                    var9 = var16;
                } else if (var14 == 4) {
                    var11 = var8;
                    var9 = var18;
                    var10 = var16;
                } else if (var14 == 5) {
                    var9 = var8;
                    var10 = var16;
                    var11 = var17;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var23 << 8) + (var22 << 16) + var24 - 16777216;
                class293.field4057[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!gn", name = "a", descriptor = "(II)Lvf;", line = 452)
    public static final class84 method2662(int arg0, int arg1) {
        field6024++;
        class84 var2 = (class84) class7.field110.method567((byte) 66, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class146.field2121.method1920(arg1, false, arg0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else {
            class84 var4 = class270.method1662(var3, (byte) -108);
            class7.field110.method565(arg1 - 1, var4, (long) arg0);
            return var4;
        }
    }
}
