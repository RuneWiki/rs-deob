import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class41 extends class5 {

    @OriginalMember(owner = "client!le", name = "E", descriptor = "Lsa;")
    public class247 field579;

    @OriginalMember(owner = "client!le", name = "H", descriptor = "Lhj;")
    private static class69 field582 = class181.method1318("purple:", (byte) -112);

    @OriginalMember(owner = "client!le", name = "D", descriptor = "[I")
    public static int[] field578 = new int[100];

    @OriginalMember(owner = "client!le", name = "F", descriptor = "[[I")
    public static int[][] field580 = new int[104][104];

    @OriginalMember(owner = "client!le", name = "J", descriptor = "Lhj;")
    public static class69 field583 = field582;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "Lhj;")
    public static class69 field585 = class181.method1318("Hierhin gehen", (byte) -111);

    @OriginalMember(owner = "client!le", name = "K", descriptor = "Lhj;")
    public static class69 field584 = field582;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field588 = 0;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "Lhj;")
    public static class69 field587 = class181.method1318("W-=hlen Sie eine Welt", (byte) -112);

    @OriginalMember(owner = "client!le", name = "M", descriptor = "Lnc;")
    public static class83 field586;

    @OriginalMember(owner = "client!le", name = "G", descriptor = "[[[B")
    public static byte[][][] field581;

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(Led;IIIII)V")
    public static final void method227(class177 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class66.field1275 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class109.field2091) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class146.field2694 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class217 var14 = class158.field2935[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class271.field4793[var11][var12 + 1][var13] + class271.field4793[var11][var12][var13] + class271.field4793[var11][var12][var13 + 1] + class271.field4793[var11][var12 + 1][var13 + 1]) / 4 - (class271.field4793[arg1][arg2 + 1][arg3] + class271.field4793[arg1][arg2][arg3] + class271.field4793[arg1][arg2][arg3 + 1] + class271.field4793[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class118 var16 = var14.field3932;
                                    if (var16 != null) {
                                        if (var16.field2235.method512()) {
                                            arg0.method522(var16.field2235, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field2227 != null && var16.field2227.method512()) {
                                            arg0.method522(var16.field2227, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field3940; var17++) {
                                        class85 var18 = var14.field3933[var17];
                                        if (var18 != null && var18.field1660.method512() && (var18.field1662 == var12 || var7 == var12) && (var18.field1653 == var13 || var9 == var13)) {
                                            int var19 = var18.field1651 + 1 - var18.field1662;
                                            int var20 = var18.field1655 + 1 - var18.field1653;
                                            arg0.method522(var18.field1660, (var18.field1662 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1653 - arg3) * 128 + (var20 - arg5) * 64, var6);
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

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(I)V")
    public static void method228(int arg0) {
        field578 = null;
        field583 = null;
        field582 = null;
        field587 = null;
        field585 = null;
        field581 = null;
        if (arg0 >= -109) {
            field586 = null;
        }
        field586 = null;
        field580 = null;
        field584 = null;
    }

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "(Lsa;)V")
    public class41(class247 arg0) {
        this.field579 = arg0;
    }
}
