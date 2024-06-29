import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class110 extends class62 {

    @OriginalMember(owner = "client!fg", name = "N", descriptor = "I")
    private int field1563 = 0;

    @OriginalMember(owner = "client!fg", name = "P", descriptor = "[S")
    private short[] field1565 = new short[257];

    @OriginalMember(owner = "client!fg", name = "S", descriptor = "[Lgw;")
    public static class148[] field1568;

    @OriginalMember(owner = "client!fg", name = "D", descriptor = "I")
    public static int field1555;

    @OriginalMember(owner = "client!fg", name = "F", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!fg", name = "H", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!fg", name = "J", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!fg", name = "K", descriptor = "I")
    public static int field1560;

    @OriginalMember(owner = "client!fg", name = "L", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!fg", name = "Q", descriptor = "I")
    public static int field1566;

    @OriginalMember(owner = "client!fg", name = "R", descriptor = "I")
    public static int field1567;

    @OriginalMember(owner = "client!fg", name = "O", descriptor = "Lla;")
    public static class386 field1564;

    @OriginalMember(owner = "client!fg", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1562;

    @OriginalMember(owner = "client!fg", name = "C", descriptor = "[I")
    private int[] field1554;

    @OriginalMember(owner = "client!fg", name = "E", descriptor = "[I")
    private int[] field1556;

    @OriginalMember(owner = "client!fg", name = "T", descriptor = "[[I")
    private int[][] field1569;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "(I)V")
    public final void method395(int arg0) {
        ++field1559;
        if (this.field1569 == null) {
            this.field1569 = new int[][] { new int[2], { 4096, 4096 } };
        }
        if (~this.field1569.length > -3) {
            throw new RuntimeException("Curve operation requires at least two markers");
        } else {
            if (this.field1563 == 2) {
                this.method806((byte) 89);
            }
            class380.method2269(21815);
            if (arg0 > -37) {
                this.field1569 = null;
            }
            this.method808((byte) 116);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I[BIIIBI)Z")
    public static final boolean method804(int arg0, byte[] arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field1566;
        if (arg5 > -73) {
            method805(-79);
        }
        int var7 = arg4 % arg0;
        int var8;
        if (var7 != 0) {
            var8 = arg0 - var7;
        } else {
            var8 = 0;
        }
        int var9 = -((arg3 + -1 + arg0) / arg0);
        int var10 = -((arg0 + -1 + arg4) / arg0);
        for (int var11 = var9; ~var11 > -1; ++var11) {
            for (int var12 = var10; ~var12 > -1; ++var12) {
                if (~arg1[arg2] == -1) {
                    return true;
                }
                arg2 += arg0;
            }
            int var13 = arg2 - var8;
            if (arg1[var13 + -1] == 0) {
                return true;
            }
            arg2 = arg6 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Lgw;II)V")
    public final void method11(class148 arg0, int arg1, int arg2) {
        ++field1560;
        if (arg1 != -1) {
            this.field1565 = null;
        }
        if (arg2 == 0) {
            this.field1563 = arg0.method1032((byte) -33);
            this.field1569 = new int[arg0.method1032((byte) -33)][2];
            for (int var4 = 0; ~var4 > ~this.field1569.length; ++var4) {
                this.field1569[var4][0] = arg0.method1045(true);
                this.field1569[var4][1] = arg0.method1045(true);
            }
        }
    }

    @OriginalMember(owner = "client!fg", name = "<init>", descriptor = "()V")
    public class110() {
        super(1, true);
    }

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "(I)V")
    public static void method805(int arg0) {
        field1568 = null;
        field1564 = null;
        field1562 = null;
        if (arg0 != -1) {
            method804(120, (byte[]) null, -121, 112, 113, (byte) 63, -112);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    private final void method806(byte arg0) {
        ++field1567;
        int[] var2 = this.field1569[0];
        int[] var3 = this.field1569[1];
        int[] var4 = this.field1569[this.field1569.length - 2];
        int[] var5 = this.field1569[this.field1569.length + -1];
        this.field1556 = new int[] { var2[0] + -var3[0] + var2[0], var2[1] + -var3[1] + var2[1] };
        this.field1554 = new int[] { var4[0] + var4[0] - var5[0], var4[1] + -var5[1] + var4[1] };
        if (arg0 != 89) {
            method805(30);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(Z)V")
    public static final void method807(boolean arg0) {
        ++field1555;
        class633 var1 = null;
        try {
            class21 var2 = class442.field5896.method2019("3", true, arg0);
            while (~var2.field202 == -1) {
                class236.method1513(true, 1L);
            }
            if (var2.field202 == 2) {
                throw new RuntimeException("Error opening file");
            }
            var1 = (class633) var2.field201;
            byte[] var3 = new byte[(int) var1.method3686(29)];
            if (~var3.length == -1) {
                class20.field200 = "";
                class303.field4171 = "";
            } else {
                int var5;
                for (int var4 = 0; ~var4 > ~var3.length; var4 += var5) {
                    var5 = var1.method3683(61, var3.length + -var4, var4, var3);
                    if (var5 == -1) {
                        throw new IOException("EOF");
                    }
                }
                class148 var6 = new class148(var3);
                int var7 = var6.method1032((byte) -33);
                if (~var7 < -51) {
                    throw new RuntimeException("Bad length");
                }
                var6.field2177 = var7 + 1;
                if (!var6.method1014(-83)) {
                    throw new RuntimeException("Invalid CRC");
                }
                var6.field2177 = 1;
                int var8 = var6.method1032((byte) -33);
                if (var8 > 1) {
                    throw new RuntimeException("Invalid version " + var8);
                }
                class20.field200 = var6.method1031(true);
                class303.field4171 = var6.method1031(!arg0);
                if (var8 < 1) {
                    class52.field610 = class476.field6747;
                } else {
                    class52.field610 = var6.method1045(true);
                }
            }
        } catch (Exception var10) {
            class20.field200 = "";
            class303.field4171 = "";
        }
        try {
            if (var1 != null) {
                var1.method3685(-5948);
            }
        } catch (Exception var9) {
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(B)V")
    private final void method808(byte arg0) {
        int var2 = this.field1563;
        if (~var2 != -3) {
            if (~var2 == -2) {
                for (int var3 = 0; ~var3 > -258; ++var3) {
                    int var4 = var3 << 4;
                    int var5;
                    for (var5 = 1; this.field1569.length + -1 > var5 && ~this.field1569[var5][0] >= ~var4; ++var5) {
                    }
                    int[] var6 = this.field1569[var5 + -1];
                    int[] var7 = this.field1569[var5];
                    int var8 = (-var6[0] + var4 << 12) / (var7[0] - var6[0]);
                    int var9 = -class321.field4429[255 & var8 >> 5] + 4096 >> 1;
                    int var10 = -var9 + 4096;
                    int var11 = var6[1] * var10 - -(var7[1] * var9) >> 12;
                    if (~var11 >= 32767) {
                        var11 = -32767;
                    }
                    if (~var11 <= -32769) {
                        var11 = 32767;
                    }
                    this.field1565[var3] = (short) var11;
                }
            } else {
                for (int var12 = 0; ~var12 > -258; ++var12) {
                    int var13 = var12 << 4;
                    int var14;
                    for (var14 = 1; ~(this.field1569.length + -1) < ~var14 && var13 >= this.field1569[var14][0]; ++var14) {
                    }
                    int[] var15 = this.field1569[var14 + -1];
                    int[] var16 = this.field1569[var14];
                    int var17 = (var13 - var15[0] << 12) / (var16[0] + -var15[0]);
                    int var18 = -var17 + 4096;
                    int var19 = var15[1] * var18 + var16[1] * var17 >> 12;
                    if (~var19 >= 32767) {
                        var19 = -32767;
                    }
                    if (~var19 <= -32769) {
                        var19 = 32767;
                    }
                    this.field1565[var12] = (short) var19;
                }
            }
        } else {
            for (int var20 = 0; ~var20 > -258; ++var20) {
                int var21 = var20 << 4;
                int var22;
                for (var22 = 1; ~(this.field1569.length + -1) < ~var22 && ~var21 <= ~this.field1569[var22][0]; ++var22) {
                }
                int[] var23 = this.field1569[var22 + -1];
                int[] var24 = this.field1569[var22];
                int var25 = this.method809((byte) -69, var22 + -2)[1];
                int var26 = var23[1];
                int var27 = var24[1];
                int var28 = this.method809((byte) -69, var22 + 1)[1];
                int var29 = (-var23[0] + var21 << 12) / (var24[0] - var23[0]);
                int var30 = var29 * var29 >> 12;
                int var31 = -var25 + -var27 + var28 + var26;
                int var32 = -var26 + var25 - var31;
                int var33 = -var25 + var27;
                int var35 = (var29 * var31 >> 12) * var30 >> 12;
                int var36 = var30 * var32 >> 12;
                int var37 = var29 * var33 >> 12;
                int var38 = var35 - -var36 - (-var26 + -var37);
                if (~var38 >= 32767) {
                    var38 = -32767;
                }
                if (~var38 <= -32769) {
                    var38 = 32767;
                }
                this.field1565[var20] = (short) var38;
            }
        }
        ++field1561;
        if (arg0 <= 112) {
            this.field1569 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "(II)[I")
    public final int[] method13(int arg0, int arg1) {
        ++field1557;
        if (arg1 != 656024161) {
            return null;
        } else {
            int[] var3 = super.field774.method3086(arg0, -2);
            if (super.field774.field7499) {
                int[] var4 = this.method408(arg0, 0, (byte) -69);
                for (int var5 = 0; class438.field5847 > var5; ++var5) {
                    int var6 = var4[var5] >> 4;
                    if (var6 < 0) {
                        var6 = 0;
                    }
                    if (var6 > 256) {
                        var6 = 256;
                    }
                    var3[var5] = this.field1565[var6];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(BI)[I")
    private final int[] method809(byte arg0, int arg1) {
        ++field1558;
        if (arg1 < 0) {
            return this.field1556;
        } else if (arg0 != -69) {
            return null;
        } else {
            return ~this.field1569.length >= ~arg1 ? this.field1554 : this.field1569[arg1];
        }
    }

    static {
        new class572("Your clan channel has now been disabled!", "Dein Chatraum ist jetzt ausgeschaltet.", "Votre canal de clan est désactivé.", "Seu canal de clã foi desativado!");
        field1568 = new class148[2048];
    }
}
