import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class80 extends class14 {

    @OriginalMember(owner = "client!ut", name = "J", descriptor = "[I")
    public static int[] field1181 = new int[3];

    @OriginalMember(owner = "client!ut", name = "K", descriptor = "Lvj;")
    public static class304 field1182 = new class304("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!ut", name = "T", descriptor = "[I")
    public static int[] field1191 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
    public static int field1183;

    @OriginalMember(owner = "client!ut", name = "O", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!ut", name = "P", descriptor = "I")
    public static int field1187;

    @OriginalMember(owner = "client!ut", name = "Q", descriptor = "I")
    public static int field1188;

    @OriginalMember(owner = "client!ut", name = "R", descriptor = "I")
    public static int field1189;

    @OriginalMember(owner = "client!ut", name = "N", descriptor = "[I")
    public static int[] field1185;

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "[Lfp;")
    public static class211[] field1184;

    @OriginalMember(owner = "client!ut", name = "S", descriptor = "[Ljg;")
    private class223[] field1190;

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(II)[[I", line = 3)
    public final int[][] method141(int arg0, int arg1) {
        ++field1187;
        int[][] var3 = super.field268.method2561(arg1, 0);
        if (super.field268.field6091) {
            int var4 = class115.field1637;
            int var5 = class494.field6866;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = super.field268.method2560(arg0 ^ -6072);
            this.method497(var6, false);
            for (int var8 = 0; ~class494.field6866 < ~var8; ++var8) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[0];
                int[] var12 = var10[1];
                int[] var13 = var10[2];
                for (int var14 = 0; ~class115.field1637 < ~var14; ++var14) {
                    int var15 = var9[var14];
                    var13[var14] = class494.method2839(var15 << 4, 4080);
                    var12[var14] = class494.method2839(4080, var15 >> 4);
                    var11[var14] = class494.method2839(16711680, var15) >> 12;
                }
            }
        }
        if (arg0 != -30909) {
            method495((String) null, (byte) 74);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IBLmd;)V", line = 69)
    public final void method147(int arg0, byte arg1, class379 arg2) {
        ++field1189;
        if (arg0 != 0) {
            if (~arg0 == -2) {
                super.field263 = ~arg2.method2238(255) == -2;
            }
        } else {
            this.field1190 = new class223[arg2.method2238(255)];
            for (int var4 = 0; var4 < this.field1190.length; ++var4) {
                int var6 = arg2.method2238(255);
                if (~var6 != -1) {
                    if (~var6 != -2) {
                        if (var6 != 2) {
                            if (~var6 == -4) {
                                this.field1190[var4] = class264.method1591(false, arg2);
                            }
                        } else {
                            this.field1190[var4] = class422.method2433(arg2, 7761);
                        }
                    } else {
                        this.field1190[var4] = class441.method2545((byte) -114, arg2);
                    }
                } else {
                    this.field1190[var4] = class159.method1087(arg2, (byte) -63);
                }
            }
        }
        int var5 = 123 / ((-51 - arg1) / 37);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 142)
    public static final boolean method495(String arg0, byte arg1) {
        ++field1188;
        int var2 = -68 / ((arg1 - 37) / 62);
        return class1.method15(true, arg0, 10, -28);
    }

    @OriginalMember(owner = "client!ut", name = "d", descriptor = "(Z)V", line = 160)
    public static void method496(boolean arg0) {
        field1181 = null;
        field1185 = null;
        field1184 = null;
        field1191 = null;
        field1182 = null;
        if (arg0) {
            field1191 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V", line = 175)
    public class80() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "([[IZ)V", line = 178)
    private final void method497(int[][] arg0, boolean arg1) {
        ++field1186;
        int var3 = class115.field1637;
        if (!arg1) {
            int var4 = class494.field6866;
            class212.method1344(arg0, 1);
            class478.method2742(class511.field7361, 375, 0, class305.field4023, 0);
            if (this.field1190 != null) {
                for (int var5 = 0; this.field1190.length > var5; ++var5) {
                    class223 var6 = this.field1190[var5];
                    int var7 = var6.field3005;
                    int var8 = var6.field3010;
                    if (~var7 > -1) {
                        if (~var8 <= -1) {
                            var6.method211(var4, var3, 91);
                        }
                    } else if (~var8 <= -1) {
                        var6.method205(var4, var3, -28706);
                    } else {
                        var6.method209(var4, 0, var3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IB)[I", line = 229)
    public final int[] method140(int arg0, byte arg1) {
        ++field1183;
        int[] var3 = super.field270.method2263(-29596, arg0);
        if (arg1 > -2) {
            return null;
        } else {
            if (super.field270.field5222) {
                this.method497(super.field270.method2264(0), false);
            }
            return var3;
        }
    }
}
