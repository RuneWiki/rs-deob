import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class114 {

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "Lge;")
    private class499 field1619 = new class499();

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "I")
    public static int field1621 = 0;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "Lff;")
    public static class9 field1618 = new class9(78, 3);

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1623;

    @OriginalMember(owner = "client!ld", name = "h", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ld", name = "i", descriptor = "I")
    public static int field1625;

    @OriginalMember(owner = "client!ld", name = "l", descriptor = "I")
    public static int field1628;

    @OriginalMember(owner = "client!ld", name = "m", descriptor = "I")
    public static int field1629;

    @OriginalMember(owner = "client!ld", name = "k", descriptor = "Lge;")
    private class499 field1627;

    @OriginalMember(owner = "client!ld", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1626;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(B)Lge;")
    public final class499 method780(byte arg0) {
        field1628++;
        class499 var2 = this.field1627;
        if (this.field1619 == var2) {
            this.field1627 = null;
            return null;
        }
        if (arg0 != -78) {
            this.method787((byte) 115);
        }
        this.field1627 = var2.field6903;
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(B)V")
    public static void method781(byte arg0) {
        field1626 = null;
        field1618 = null;
        if (arg0 >= -73) {
            method788(null, null, 106, -119, 53, 110, -61);
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIB)V")
    public static final void method782(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 < 104) {
            method788(null, null, 103, 78, -121, -65, 82);
        }
        class117.field1677 = new byte[arg1][arg0][arg2];
        field1617++;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lge;B)V")
    public final void method783(class499 arg0, byte arg1) {
        if (arg0.field6900 != null) {
            arg0.method2856(0);
        }
        field1622++;
        arg0.field6900 = this.field1619.field6900;
        arg0.field6903 = this.field1619;
        arg0.field6900.field6903 = arg0;
        arg0.field6903.field6900 = arg0;
        if (arg1 > -3) {
            this.field1627 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I)V")
    public final void method784(int arg0) {
        field1620++;
        while (true) {
            class499 var2 = this.field1619.field6903;
            if (this.field1619 == var2) {
                if (arg0 <= 92) {
                    method788(null, null, 89, 116, 7, 95, -35);
                }
                this.field1627 = null;
                return;
            }
            var2.method2856(0);
        }
    }

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "(I)I")
    public final int method785(int arg0) {
        field1623++;
        int var2 = 0;
        if (arg0 != 12899) {
            return 74;
        }
        class499 var3 = this.field1619.field6903;
        while (this.field1619 != var3) {
            var3 = var3.field6903;
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(I)Lge;")
    public final class499 method786(int arg0) {
        field1625++;
        class499 var2 = this.field1619.field6903;
        if (this.field1619 == var2) {
            this.field1627 = null;
            return null;
        }
        if (arg0 != 1) {
            this.method785(10);
        }
        this.field1627 = var2.field6903;
        return var2;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)Lge;")
    public final class499 method787(byte arg0) {
        field1624++;
        if (arg0 != 127) {
            return null;
        }
        class499 var2 = this.field1619.field6903;
        if (this.field1619 == var2) {
            return null;
        } else {
            var2.method2856(0);
            return var2;
        }
    }

    @OriginalMember(owner = "client!ld", name = "<init>", descriptor = "()V")
    public class114() {
        this.field1619.field6900 = this.field1619;
        this.field1619.field6903 = this.field1619;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lqa;Leq;IIIII)V")
    public static final void method788(class162 arg0, class140 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        boolean var7 = true;
        int var8 = arg3;
        int var9 = arg3 + arg5;
        int var10 = arg4 - 1;
        int var11 = arg4 + arg6;
        for (int var12 = arg2; var12 <= arg2 + 1; var12++) {
            if (class508.field7055 != var12) {
                for (int var13 = var8; var13 <= var9; var13++) {
                    if (var13 >= 0 && var13 < class439.field6036) {
                        for (int var14 = var10; var14 <= var11; var14++) {
                            if (var14 >= 0 && var14 < class318.field4170 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < arg4 && arg3 != var13)) {
                                class409 var15 = class497.field6886[var12][var13][var14];
                                if (var15 != null) {
                                    int var16 = (class141.field2049[var12].method272(var13, var14) + class141.field2049[var12].method272(var13 + 1, var14) + class141.field2049[var12].method272(var13, var14 + 1) + class141.field2049[var12].method272(var13 + 1, var14 + 1)) / 4 - (class141.field2049[arg2].method272(arg3, arg4) + class141.field2049[arg2].method272(arg3 + 1, arg4) + class141.field2049[arg2].method272(arg3, arg4 + 1) + class141.field2049[arg2].method272(arg3 + 1, arg4 + 1)) / 4;
                                    class56 var17 = var15.field5627;
                                    class56 var18 = var15.field5607;
                                    if (var17 != null && var17.method126((byte) 54)) {
                                        arg1.method127(1, var16, arg0, var17, (var13 - arg3) * class220.field2979 + (1 - arg5) * class497.field6892, (var14 - arg4) * class220.field2979 + (1 - arg6) * class497.field6892, var7);
                                    }
                                    if (var18 != null && var18.method126((byte) 54)) {
                                        arg1.method127(1, var16, arg0, var18, (var13 - arg3) * class220.field2979 + (1 - arg5) * class497.field6892, (var14 - arg4) * class220.field2979 + (1 - arg6) * class497.field6892, var7);
                                    }
                                    for (class165 var19 = var15.field5630; var19 != null; var19 = var19.field2400) {
                                        class37 var20 = var19.field2402;
                                        if (var20 != null && var20.method126((byte) 54) && (var20.field581 == var13 || var8 == var13) && (var20.field587 == var14 || var10 == var14)) {
                                            int var21 = var20.field580 + 1 - var20.field581;
                                            int var22 = var20.field569 + 1 - var20.field587;
                                            arg1.method127(1, var16, arg0, var20, (var20.field581 - arg3) * class220.field2979 + (var21 - arg5) * class497.field6892, (var20.field587 - arg4) * class220.field2979 + (var22 - arg6) * class497.field6892, var7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var8--;
                var7 = false;
            }
        }
    }
}
