import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public abstract class class478 extends class280 {

    @OriginalMember(owner = "client!tq", name = "A", descriptor = "Z")
    public boolean field6762;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
    public int field6755;

    @OriginalMember(owner = "client!tq", name = "E", descriptor = "B")
    public byte field6766;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "S")
    public short field6751;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "S")
    public short field6749;

    @OriginalMember(owner = "client!tq", name = "z", descriptor = "B")
    public byte field6761;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "S")
    public short field6753;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "S")
    public short field6747;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public int field6746;

    @OriginalMember(owner = "client!tq", name = "D", descriptor = "I")
    public int field6765;

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!tq", name = "C", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field6748;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "I")
    public int field6752;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!tq", name = "x", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!tq", name = "B", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "Lg;")
    public static class256 field6758;

    @OriginalMember(owner = "client!tq", name = "y", descriptor = "[I")
    public static int[] field6760;

    static {
        new class112("Unable to send message - player not on your friendlist.", "Nachricht kann nicht geschickt werden,", "Impossible d'envoyer un message - joueur non inclus dans votre liste d'amis.", "Não foi possível enviar a mensagem. O jogador não está na sua lista de amigos.");
        field6757 = 2;
        field6764 = 0;
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(B)V", line = 6)
    public void method510(byte arg0) {
        field6756++;
        int var2 = -88 % ((27 - arg0) / 63);
    }

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(II)Llp;", line = 18)
    public static final class202 method2808(int arg0, int arg1) {
        field6754++;
        class202 var2 = (class202) class338.field4635.method1209(false, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class321.field4404.method2029(0, arg1 & 0x7FFF, 0);
        } else {
            var3 = class451.field6199.method2029(0, arg1, 0);
        }
        class202 var4 = new class202();
        if (var3 != null) {
            var4.method1280(new class425(var3), 0);
        }
        if (arg0 != 0) {
            return null;
        }
        if (arg1 >= 32768) {
            var4.method1287((byte) 40);
        }
        class338.field4635.method1207(-1, (long) arg1, var4);
        return var4;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIIIIIII)V", line = 53)
    public static final void method2809(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field6750++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg3 - arg5;
        int var12 = arg2 - arg5;
        int var13 = arg3 * arg3;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg2 << 1;
        int var22 = var12 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = var14 - ((var21 - 1) * var18);
        int var25 = (1 - var22) * var15 + var19;
        int var26 = var16 - (var22 - 1) * var20;
        if (arg4 < 72) {
            field6757 = -86;
        }
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 - 3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg2 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 - 1) * var29;
        if (arg0 >= class53.field874 && class8.field174 >= arg0) {
            int[] var39 = class2.field16[arg0];
            int var40 = class229.method1443(class299.field4121, arg6 - arg3, class248.field3487, (byte) -68);
            int var41 = class229.method1443(class299.field4121, arg3 + arg6, class248.field3487, (byte) -68);
            int var42 = class229.method1443(class299.field4121, arg6 - var11, class248.field3487, (byte) -68);
            int var43 = class229.method1443(class299.field4121, arg6 + var11, class248.field3487, (byte) -68);
            class80.method554(var39, 100, arg7, var42, var40);
            class80.method554(var39, 92, arg1, var43, var42);
            class80.method554(var39, 107, arg7, var41, var43);
        }
        while (var9 > 0) {
            boolean var44 = var12 >= var9;
            if (var23 < 0) {
                while (var23 < 0) {
                    var24 += var35;
                    var23 += var31;
                    var35 += var28;
                    var31 += var28;
                    var8++;
                }
            }
            if (var44) {
                if (var25 < 0) {
                    while (var25 < 0) {
                        var25 += var33;
                        var26 += var37;
                        var33 += var30;
                        var37 += var30;
                        var10++;
                    }
                }
                if (var26 < 0) {
                    var25 += var33;
                    var26 += var37;
                    var37 += var30;
                    var10++;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var38 -= var29;
                var34 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                var35 += var28;
                var8++;
            }
            var23 += -var36;
            var24 += -var32;
            var32 -= var27;
            var9--;
            var36 -= var27;
            int var45 = arg0 - var9;
            int var46 = arg0 + var9;
            if (class53.field874 <= var46 && class8.field174 >= var45) {
                int var47 = class229.method1443(class299.field4121, arg6 + var8, class248.field3487, (byte) -68);
                int var48 = class229.method1443(class299.field4121, arg6 - var8, class248.field3487, (byte) -68);
                if (var44) {
                    int var49 = class229.method1443(class299.field4121, arg6 + var10, class248.field3487, (byte) -68);
                    int var50 = class229.method1443(class299.field4121, arg6 - var10, class248.field3487, (byte) -68);
                    if (class53.field874 <= var45) {
                        int[] var51 = class2.field16[var45];
                        class80.method554(var51, 126, arg7, var50, var48);
                        class80.method554(var51, 113, arg1, var49, var50);
                        class80.method554(var51, 106, arg7, var47, var49);
                    }
                    if (var46 <= class8.field174) {
                        int[] var52 = class2.field16[var46];
                        class80.method554(var52, 120, arg7, var50, var48);
                        class80.method554(var52, 114, arg1, var49, var50);
                        class80.method554(var52, 119, arg7, var47, var49);
                    }
                } else {
                    if (var45 >= class53.field874) {
                        class80.method554(class2.field16[var45], 93, arg7, var47, var48);
                    }
                    if (class8.field174 >= var46) {
                        class80.method554(class2.field16[var46], 110, arg7, var47, var48);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIILwe;Lwe;)V", line = 260)
    public static final void method2810(int arg0, int arg1, int arg2, class87 arg3, class87 arg4) {
        class406 var5 = class11.method105(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field5625 = arg3;
            var5.field5608 = arg4;
        }
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(Z)V", line = 269)
    public static final void method2811(boolean arg0) {
        field6748++;
        class33.field532.method2561(-4);
        class59.field928.method1976((byte) 51);
        class393.field5529.method1244((byte) -117);
        class304.field4160.method2071(-6166);
        class467.field6550.method1362((byte) 126);
        class58.field918.method334((byte) 103);
        class31.field505.method948(true);
        class163.field2348.method543((byte) 74);
        class147.field2084.method402(-1);
        class181.field2632.method2428(-12467);
        class363.field5161.method2804(0);
        class425.field5861.method372(6);
        class292.field4009.method88(102);
        class192.field2728.method426(-23624);
        class68.field1007.method964(238);
        class487.field6864.method2532(120);
        class191.field2725.method686(30);
        class448.field6178.method1197((byte) 118);
        class38.field659.method1403(64);
        class375.field5314.method2351((byte) 87);
        class71.method495(10765);
        class167.method1022(128);
        class120.method750(123);
        class261.method1610((byte) -35);
        class344.field4712.method654(false);
        class196.field2786.method654(false);
        class479.field6770.method654(arg0);
        class90.field1345.method654(arg0);
        class212.field3006.method654(false);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZI)V", line = 306)
    public static final void method2812(boolean arg0, int arg1) {
        if (!class122.field1699) {
            arg1 = -1;
        }
        field6759++;
        if (class136.field1929 == arg1) {
            return;
        }
        if (arg1 != -1) {
            class335 var2 = class38.field659.method1406(33, arg1);
            class140 var3 = var2.method1990(2);
            if (var3 == null) {
                arg1 = -1;
            } else {
                class343.field4703.method134(var3.method859(), -1, class138.field1965, var3.method863(), var3.method857(), new Point(var2.field4594, var2.field4601));
                class136.field1929 = arg1;
            }
        }
        if (arg1 == -1 && class136.field1929 != -1) {
            class343.field4703.method134(-1, -117, class138.field1965, -1, (int[]) null, new Point());
            class136.field1929 = -1;
        }
        if (!arg0) {
            field6757 = 103;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IC)Z", line = 361)
    public static final boolean method2813(int arg0, char arg1) {
        field6763++;
        if (arg0 != 3) {
            field6757 = -76;
        }
        return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
    }

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "(I)V", line = 376)
    public static void method2814(int arg0) {
        int var1 = -35 / ((arg0 + 19) / 50);
        field6758 = null;
        field6760 = null;
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(IIIIIIIIZB)V", line = 388)
    public class478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, byte arg9) {
        this.field6762 = arg8;
        this.field6755 = (short) arg2;
        this.field6766 = (byte) arg0;
        this.field6751 = (short) arg5;
        this.field6749 = (short) arg7;
        this.field6761 = arg9;
        this.field6753 = (short) arg4;
        this.field6747 = (short) arg6;
        this.field6746 = (short) arg3;
        this.field6765 = (short) arg1;
    }

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "(B)I")
    public abstract int method205(byte arg0);
}
