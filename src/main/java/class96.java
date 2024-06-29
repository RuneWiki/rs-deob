import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class96 extends class149 {

    @OriginalMember(owner = "client!kf", name = "V", descriptor = "[Leb;")
    public class40[] field1820;

    @OriginalMember(owner = "client!kf", name = "R", descriptor = "Lsg;")
    private static class169 field1816 = class165.method1060("Loaded sprites", 1536);

    @OriginalMember(owner = "client!kf", name = "S", descriptor = "Lsg;")
    public static class169 field1817 = field1816;

    @OriginalMember(owner = "client!kf", name = "P", descriptor = "I")
    public static int field1814 = 0;

    @OriginalMember(owner = "client!kf", name = "U", descriptor = "Lsg;")
    public static class169 field1819 = class165.method1060(" ", 1536);

    @OriginalMember(owner = "client!kf", name = "X", descriptor = "I")
    public static int field1822 = 0;

    @OriginalMember(owner = "client!kf", name = "T", descriptor = "Lsg;")
    public static class169 field1818 = class165.method1060("Begeben Sie sich in ein freies Gebiet)1 um", 1536);

    @OriginalMember(owner = "client!kf", name = "Q", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!kf", name = "W", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!kf", name = "Z", descriptor = "I")
    public static int field1824;

    @OriginalMember(owner = "client!kf", name = "Y", descriptor = "Lhg;")
    public static class71 field1823;

    @OriginalMember(owner = "client!kf", name = "ab", descriptor = "Lke;")
    public static class95 field1825;

    @OriginalMember(owner = "client!kf", name = "f", descriptor = "(I)V")
    public static void method576(int arg0) {
        field1825 = null;
        if (arg0 != 0) {
            field1823 = null;
        }
        field1823 = null;
        field1819 = null;
        field1816 = null;
        field1817 = null;
        field1818 = null;
    }

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "(II)Z")
    public final boolean method577(int arg0, int arg1) {
        if (arg0 >= -69) {
            field1819 = null;
        }
        field1824++;
        return this.field1820[arg1].field753;
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(Lke;Lke;IZ)V")
    public class96(class95 arg0, class95 arg1, int arg2, boolean arg3) {
        class22 var5 = new class22();
        int var6 = arg0.method570((byte) 113, arg2);
        this.field1820 = new class40[var6];
        int[] var7 = arg0.method564(arg2, -2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method552(var7[var8], arg2, 0);
            int var10 = var9[1] & 0xFF | (var9[0] & 0xFF) << 8;
            class203 var11 = (class203) var5.method145(0);
            class203 var12 = null;
            while (var11 != null) {
                if (var11.field3968 == var10) {
                    var12 = var11;
                    break;
                }
                var11 = (class203) var5.method152((byte) -126);
            }
            if (var12 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method569(-1, var10, 0);
                } else {
                    var13 = arg1.method569(-1, 0, var10);
                }
                var12 = new class203(var10, var13);
                var5.method149(0, var12);
            }
            this.field1820[var7[var8]] = new class40(var9, var12);
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(IIIIIII[BILog;[Lvb;)V")
    public static final void method578(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, int arg8, class133 arg9, class191[] arg10) {
        int var11 = -1;
        field1821++;
        if (arg8 != -27082234) {
            method579(null, (byte) -112, -58);
        }
        class127 var12 = new class127(arg7);
        while (true) {
            int var13 = var12.method812(true);
            if (var13 == 0) {
                return;
            }
            int var14 = 0;
            var11 += var13;
            while (true) {
                int var15 = var12.method812(true);
                if (var15 == 0) {
                    break;
                }
                var14 += var15 - 1;
                int var16 = var14 & 0x3F;
                int var17 = var14 >> 6 & 0x3F;
                int var18 = var14 >> 12;
                int var19 = var12.method819((byte) 22);
                int var20 = var19 & 0x3;
                int var21 = var19 >> 2;
                if (arg5 == var18 && arg6 <= var17 && arg6 + 8 > var17 && arg4 <= var16 && arg4 + 8 > var16) {
                    class17 var22 = class138.method925(6, var11);
                    int var23 = class162.method1039(var17 & 0x7, var20, var22.field369, (byte) 76, arg0, var22.field400, var16 & 0x7) + arg1;
                    int var24 = arg2 + class188.method1235(var22.field369, var16 & 0x7, false, var17 & 0x7, arg0, var22.field400, var20);
                    if (var23 > 0 && var24 > 0 && var23 < 103 && var24 < 103) {
                        int var25 = arg3;
                        if ((class159.field3040[1][var23][var24] & 0x2) == 2) {
                            var25 = arg3 - 1;
                        }
                        class191 var26 = null;
                        if (var25 >= 0) {
                            var26 = arg10[var25];
                        }
                        class10.method53(var26, arg9, var20 + arg0 & 0x3, arg3, var21, var11, -125, var24, var23);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(Lv;BI)V")
    public static final void method579(class189 arg0, byte arg1, int arg2) {
        field1815++;
        class54.method343(arg0.field3679, arg2, -645725264, arg0.field3698);
        if (arg1 < 114) {
            field1816 = null;
        }
    }
}
