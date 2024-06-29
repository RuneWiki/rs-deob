import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!b")
public class class48 {

    @OriginalMember(owner = "client!b", name = "n", descriptor = "Lcb;")
    public class236 field1099 = new class236();

    @OriginalMember(owner = "client!b", name = "f", descriptor = "[I")
    public static int[] field1091 = new int[99];

    @OriginalMember(owner = "client!b", name = "c", descriptor = "[Lsg;")
    public static class30[] field1088 = new class30[500];

    @OriginalMember(owner = "client!b", name = "k", descriptor = "I")
    public static int field1096 = 0;

    @OriginalMember(owner = "client!b", name = "o", descriptor = "Lsg;")
    public static class30 field1100 = class167.method1221((byte) 33, "<col=ffffff> )4 ");

    @OriginalMember(owner = "client!b", name = "i", descriptor = "I")
    public static int field1094 = 0;

    @OriginalMember(owner = "client!b", name = "u", descriptor = "Lsg;")
    public static class30 field1106 = class167.method1221((byte) 33, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!b", name = "t", descriptor = "[Z")
    public static boolean[] field1105 = new boolean[8];

    @OriginalMember(owner = "client!b", name = "a", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!b", name = "b", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!b", name = "d", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!b", name = "e", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!b", name = "h", descriptor = "I")
    public static int field1093;

    @OriginalMember(owner = "client!b", name = "j", descriptor = "I")
    public static int field1095;

    @OriginalMember(owner = "client!b", name = "l", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!b", name = "m", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "client!b", name = "q", descriptor = "I")
    public static int field1102;

    @OriginalMember(owner = "client!b", name = "s", descriptor = "I")
    public static int field1104;

    @OriginalMember(owner = "client!b", name = "v", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!b", name = "g", descriptor = "Lmc;")
    public static class151 field1092;

    @OriginalMember(owner = "client!b", name = "p", descriptor = "Lwi;")
    public static class218 field1101;

    @OriginalMember(owner = "client!b", name = "r", descriptor = "Lcb;")
    private class236 field1103;

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IIBI)I")
    public static final int method471(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 >= -29) {
            method474(-19, -79);
        }
        field1097++;
        int var4 = arg0 / arg1;
        int var5 = arg1 - 1 & arg0;
        int var6 = arg3 / arg1;
        int var7 = arg1 - 1 & arg3;
        int var8 = class229.method1633(true, var6, var4);
        int var9 = class229.method1633(true, var6, var4 + 1);
        int var10 = class229.method1633(true, var6 + 1, var4);
        int var11 = class229.method1633(true, var6 + 1, var4 - -1);
        int var12 = class195.method1411(-85, arg1, var9, var8, var5);
        int var13 = class195.method1411(-125, arg1, var11, var10, var5);
        return class195.method1411(-111, arg1, var13, var12, var7);
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(B)Lcb;")
    public final class236 method472(byte arg0) {
        field1098++;
        class236 var2 = this.field1099.field4218;
        int var3 = 42 / ((arg0 - 50) / 61);
        if (this.field1099 == var2) {
            this.field1103 = null;
            return null;
        } else {
            this.field1103 = var2.field4218;
            return var2;
        }
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(B)Lcb;")
    public final class236 method473(byte arg0) {
        field1090++;
        class236 var2 = this.field1103;
        if (this.field1099 == var2) {
            this.field1103 = null;
            return null;
        } else {
            this.field1103 = var2.field4218;
            int var3 = -45 / ((29 - arg0) / 35);
            return var2;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(II)Lag;")
    public static final class93 method474(int arg0, int arg1) {
        field1102++;
        if (arg0 > -52) {
            return null;
        }
        class93 var2 = (class93) class270.field4752.method174((long) arg1, (byte) -51);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class201.field3585.method1115(class11.method108(6038, arg1), (byte) -86, class125.method944(arg1, true));
        class93 var4 = new class93();
        if (var3 != null) {
            var4.method756(95, new class8(var3));
        }
        class270.field4752.method169(var4, -81, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lcb;Z)V")
    public final void method475(class236 arg0, boolean arg1) {
        field1089++;
        if (arg0.field4218 != null) {
            arg0.method1681(false);
        }
        arg0.field4218 = this.field1099;
        arg0.field4211 = this.field1099.field4211;
        if (!arg1) {
            this.method478(-67);
        }
        arg0.field4218.field4211 = arg0;
        arg0.field4211.field4218 = arg0;
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(B)Lcb;")
    public final class236 method476(byte arg0) {
        if (arg0 != 13) {
            field1105 = null;
        }
        field1086++;
        class236 var2 = this.field1103;
        if (this.field1099 == var2) {
            this.field1103 = null;
            return null;
        } else {
            this.field1103 = var2.field4211;
            return var2;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(Lcb;B)V")
    public final void method477(class236 arg0, byte arg1) {
        if (arg0.field4218 != null) {
            arg0.method1681(false);
        }
        arg0.field4211 = this.field1099;
        if (arg1 == 6) {
            arg0.field4218 = this.field1099.field4218;
            field1095++;
            arg0.field4218.field4211 = arg0;
            arg0.field4211.field4218 = arg0;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(I)Lcb;")
    public final class236 method478(int arg0) {
        field1107++;
        class236 var2 = this.field1099.field4211;
        if (arg0 != 0) {
            return null;
        } else if (this.field1099 == var2) {
            this.field1103 = null;
            return null;
        } else {
            this.field1103 = var2.field4211;
            return var2;
        }
    }

    @OriginalMember(owner = "client!b", name = "a", descriptor = "(IB)Lwb;")
    public static final class127 method479(int arg0, byte arg1) {
        field1104++;
        class127 var2 = (class127) class24.field462.method174((long) arg0, (byte) -100);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class116.field2292.method1115(0, (byte) -78, arg0);
        if (var3 == null) {
            return null;
        }
        class127 var4 = new class127();
        class8 var5 = new class8(var3);
        if (arg1 != 77) {
            method479(124, (byte) 19);
        }
        var5.field146 = var5.field124.length - 2;
        int var6 = var5.method65((byte) 121);
        int var7 = var5.field124.length - var6 - 2 - 12;
        var5.field146 = var7;
        int var8 = var5.method70(65280);
        var4.field2476 = var5.method65((byte) 115);
        var4.field2466 = var5.method65((byte) 122);
        var4.field2477 = var5.method65((byte) 121);
        var4.field2475 = var5.method65((byte) 118);
        int var9 = var5.method63((byte) 105);
        if (var9 > 0) {
            var4.field2467 = new class157[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method65((byte) 120);
                class157 var12 = new class157(class177.method1294(var11, (byte) -59));
                var4.field2467[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method70(65280);
                    int var14 = var5.method70(65280);
                    var12.method1164((byte) -106, (long) var13, new class203(var14));
                }
            }
        }
        var5.field146 = 0;
        int var15 = 0;
        var4.field2479 = var5.method52(0);
        var4.field2465 = new int[var8];
        var4.field2468 = new class30[var8];
        var4.field2464 = new int[var8];
        while (var5.field146 < var7) {
            int var16 = var5.method65((byte) 119);
            if (var16 == 3) {
                var4.field2468[var15] = var5.method84(class186.method1344(arg1, 77));
            } else if (var16 >= 100 || var16 == 21 || var16 == 38 || var16 == 39) {
                var4.field2465[var15] = var5.method63((byte) 99);
            } else {
                var4.field2465[var15] = var5.method70(65280);
            }
            var4.field2464[var15++] = var16;
        }
        class24.field462.method169(var4, 124, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!b", name = "b", descriptor = "(I)V")
    public final void method480(int arg0) {
        while (true) {
            class236 var2 = this.field1099.field4211;
            if (this.field1099 == var2) {
                if (arg0 < 6) {
                    field1106 = null;
                }
                field1087++;
                this.field1103 = null;
                return;
            }
            var2.method1681(false);
        }
    }

    @OriginalMember(owner = "client!b", name = "c", descriptor = "(I)Lcb;")
    public final class236 method481(int arg0) {
        field1093++;
        int var2 = 60 % ((-arg0 - 70) / 40);
        class236 var3 = this.field1099.field4211;
        if (this.field1099 == var3) {
            return null;
        } else {
            var3.method1681(false);
            return var3;
        }
    }

    @OriginalMember(owner = "client!b", name = "d", descriptor = "(I)V")
    public static void method482(int arg0) {
        field1101 = null;
        field1106 = null;
        field1092 = null;
        if (arg0 == 2) {
            field1091 = null;
            field1088 = null;
            field1105 = null;
            field1100 = null;
        }
    }

    @OriginalMember(owner = "client!b", name = "<init>", descriptor = "()V")
    public class48() {
        this.field1099.field4218 = this.field1099;
        this.field1099.field4211 = this.field1099;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) ((double) var2 + Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D);
            var0 += var3;
            field1091[var1] = var0 / 4;
        }
    }
}
