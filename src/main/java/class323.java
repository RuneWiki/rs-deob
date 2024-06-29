import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public abstract class class323 {

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    private int field4090 = 4;

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "I")
    private int field4091 = 0;

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "I")
    private int field4092 = 4;

    @OriginalMember(owner = "client!bp", name = "h", descriptor = "I")
    private int field4097 = 4;

    @OriginalMember(owner = "client!bp", name = "j", descriptor = "I")
    public int field4099 = 4;

    @OriginalMember(owner = "client!bp", name = "m", descriptor = "[S")
    private short[] field4102 = new short[512];

    @OriginalMember(owner = "client!bp", name = "f", descriptor = "Lcea;")
    public static class180 field4095 = new class180("Loaded defaults", "Standardeinstellungen geladen", "Paramètres par défaut chargés", "Padrões carregados");

    @OriginalMember(owner = "client!bp", name = "i", descriptor = "Lvj;")
    public static class373 field4098 = null;

    @OriginalMember(owner = "client!bp", name = "k", descriptor = "Lvj;")
    public static class373 field4100 = new class373(48, 6);

    @OriginalMember(owner = "client!bp", name = "p", descriptor = "Lvj;")
    public static class373 field4105 = new class373(39, -2);

    @OriginalMember(owner = "client!bp", name = "d", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!bp", name = "e", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!bp", name = "g", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!bp", name = "l", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!bp", name = "o", descriptor = "I")
    public static int field4104;

    @OriginalMember(owner = "client!bp", name = "n", descriptor = "[S")
    private short[] field4103;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(BII)V")
    public abstract void method1487(byte arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(B)V")
    public abstract void method1485(byte arg0);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V")
    private final void method1775(int arg0) {
        field4094++;
        this.field4103 = new short[this.field4099];
        for (int var2 = 0; var2 < this.field4099; var2++) {
            this.field4103[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
        }
        if (arg0 != -1456) {
            field4095 = null;
        }
    }

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(B)V")
    public abstract void method1488(byte arg0);

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "(I)V")
    private final void method1776(int arg0) {
        field4104++;
        Random var2 = new Random((long) this.field4091);
        for (int var3 = 0; var3 < 255; var3++) {
            this.field4102[var3] = (short) var3;
        }
        for (int var4 = arg0; var4 < 255; var4++) {
            int var5 = 255 - var4;
            int var6 = class242.method1375(var5, false, var2);
            short var7 = this.field4102[var6];
            this.field4102[var6] = this.field4102[var5];
            this.field4102[var5] = this.field4102[var5 + 256] = var7;
        }
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIII)V")
    public final void method1777(int arg0, int arg1, int arg2, int arg3) {
        field4093++;
        int[] var5 = new int[arg1];
        int[] var6 = new int[arg2];
        for (int var7 = 0; var7 < arg1; var7++) {
            var5[var7] = (var7 << 12) / arg1;
        }
        int[] var8 = new int[arg3];
        for (int var9 = 0; var9 < arg2; var9++) {
            var6[var9] = (var9 << 12) / arg2;
        }
        for (int var10 = 0; var10 < arg3; var10++) {
            var8[var10] = (var10 << 12) / arg3;
        }
        this.method1488((byte) 25);
        if (arg0 > -26) {
            this.method1776(-79);
        }
        for (int var11 = 0; var11 < arg3; var11++) {
            for (int var12 = 0; var12 < arg2; var12++) {
                for (int var13 = 0; var13 < arg1; var13++) {
                    for (int var14 = 0; var14 < this.field4099; var14++) {
                        int var15 = this.field4103[var14] << 12;
                        int var16 = var5[var13] * var15 >> 12;
                        int var17 = var8[var11] * var15 >> 12;
                        int var18 = this.field4097 * var15 >> 12;
                        int var19 = this.field4090 * var15 >> 12;
                        int var20 = var6[var12] * var15 >> 12;
                        int var21 = this.field4092 * var15 >> 12;
                        int var22 = this.field4092 * var20;
                        int var23 = this.field4090 * var16;
                        int var24 = this.field4097 * var17;
                        int var25 = var23 >> 12;
                        int var26 = var25 + 1;
                        int var27 = var25 & 0xFF;
                        int var28 = var22 >> 12;
                        int var29 = var28 + 1;
                        int var30 = var28 & 0xFF;
                        int var31 = var24 >> 12;
                        int var32 = var31 + 1;
                        int var33 = var24 & 0xFFF;
                        int var34 = var31 & 0xFF;
                        int var35;
                        if (var26 < var19) {
                            var35 = var26 & 0xFF;
                        } else {
                            var35 = 0;
                        }
                        int var36 = var23 & 0xFFF;
                        int var37 = var22 & 0xFFF;
                        int var38;
                        if (var32 >= var18) {
                            var38 = 0;
                        } else {
                            var38 = var32 & 0xFF;
                        }
                        int var39;
                        if (var21 <= var29) {
                            var39 = 0;
                        } else {
                            var39 = var29 & 0xFF;
                        }
                        int var40 = var36 - 4096;
                        int var41 = var37 - 4096;
                        int var42 = var33 - 4096;
                        int var43 = class44.field373[var37];
                        short var44 = this.field4102[var34];
                        int var45 = class44.field373[var36];
                        int var46 = class44.field373[var33];
                        short var47 = this.field4102[var38];
                        short var48 = this.field4102[var39 + var47];
                        short var49 = this.field4102[var39 + var44];
                        short var50 = this.field4102[var30 + var44];
                        short var51 = this.field4102[var30 + var47];
                        int var52 = class344.method1924(this.field4102[var27 + var50], 15, var33, var36, var37);
                        int var53 = class344.method1924(this.field4102[var35 + var50], 15, var33, var40, var37);
                        int var54 = var52 + ((var53 - var52) * var45 >> 12);
                        int var55 = class344.method1924(this.field4102[var27 + var49], 15, var33, var36, var41);
                        int var56 = class344.method1924(this.field4102[var35 + var49], 15, var33, var40, var41);
                        int var57 = ((var56 - var55) * var45 >> 12) + var55;
                        int var58 = ((var57 - var54) * var43 >> 12) + var54;
                        int var59 = class344.method1924(this.field4102[var27 + var51], 15, var42, var36, var37);
                        int var60 = class344.method1924(this.field4102[var35 + var51], 15, var42, var40, var37);
                        int var61 = var59 + ((var60 - var59) * var45 >> 12);
                        int var62 = class344.method1924(this.field4102[var27 + var48], 15, var42, var36, var41);
                        int var63 = class344.method1924(this.field4102[var35 + var48], 15, var42, var40, var41);
                        int var64 = var62 + ((var63 - var62) * var45 >> 12);
                        int var65 = ((var64 - var61) * var43 >> 12) + var61;
                        this.method1487((byte) 74, ((var65 - var58) * var46 >> 12) + var58, var14);
                    }
                    this.method1485((byte) 84);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bp", name = "c", descriptor = "(I)V")
    public static void method1778(int arg0) {
        if (arg0 != 30385) {
            method1779(73, 95, 42, 57, -18, 57);
        }
        field4100 = null;
        field4098 = null;
        field4095 = null;
        field4105 = null;
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(IIIIII)V")
    public static final void method1779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (class271.field3513 >= arg4 && class563.field8282 <= arg1) {
            boolean var6;
            if (class470.field6589 > arg3) {
                var6 = false;
                arg3 = class470.field6589;
            } else if (arg3 <= class592.field8588) {
                var6 = true;
            } else {
                var6 = false;
                arg3 = class592.field8588;
            }
            boolean var7;
            if (class470.field6589 > arg0) {
                arg0 = class470.field6589;
                var7 = false;
            } else if (arg0 <= class592.field8588) {
                var7 = true;
            } else {
                arg0 = class592.field8588;
                var7 = false;
            }
            if (class563.field8282 <= arg4) {
                class62.method363(arg0, -128, arg2, class328.field4287[arg4++], arg3);
            } else {
                arg4 = class563.field8282;
            }
            if (arg1 > class271.field3513) {
                arg1 = class271.field3513;
            } else {
                class62.method363(arg0, -128, arg2, class328.field4287[arg1--], arg3);
            }
            if (var6 && var7) {
                for (int var8 = arg4; var8 <= arg1; var8++) {
                    int[] var9 = class328.field4287[var8];
                    var9[arg3] = var9[arg0] = arg2;
                }
            } else if (var6) {
                for (int var10 = arg4; var10 <= arg1; var10++) {
                    class328.field4287[var10][arg3] = arg2;
                }
            } else if (var7) {
                for (int var11 = arg4; var11 <= arg1; var11++) {
                    class328.field4287[var11][arg0] = arg2;
                }
            }
        }
        if (arg5 <= 2) {
            field4098 = null;
        }
        field4101++;
    }

    @OriginalMember(owner = "client!bp", name = "<init>", descriptor = "(IIIII)V")
    public class323(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4091 = arg0;
        this.field4099 = arg1;
        this.field4090 = arg2;
        this.field4092 = arg3;
        this.field4097 = arg4;
        this.method1775(-1456);
        this.method1776(0);
    }
}
