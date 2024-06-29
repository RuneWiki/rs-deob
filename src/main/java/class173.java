import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class173 extends class271 {

    @OriginalMember(owner = "client!db", name = "G", descriptor = "[I")
    public static int[] field2916 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!db", name = "P", descriptor = "I")
    public static int field2924 = 0;

    @OriginalMember(owner = "client!db", name = "T", descriptor = "Lwa;")
    private static class75 field2928 = class66.method560("Loaded config", false);

    @OriginalMember(owner = "client!db", name = "K", descriptor = "Lwa;")
    public static class75 field2920 = field2928;

    @OriginalMember(owner = "client!db", name = "D", descriptor = "Lgb;")
    public static class158 field2913 = new class158(200);

    @OriginalMember(owner = "client!db", name = "V", descriptor = "[I")
    public static int[] field2930 = new int[200];

    @OriginalMember(owner = "client!db", name = "W", descriptor = "J")
    public static long field2931 = 0L;

    @OriginalMember(owner = "client!db", name = "C", descriptor = "I")
    public static int field2912;

    @OriginalMember(owner = "client!db", name = "E", descriptor = "I")
    public static int field2914;

    @OriginalMember(owner = "client!db", name = "F", descriptor = "I")
    public static int field2915;

    @OriginalMember(owner = "client!db", name = "H", descriptor = "I")
    public static int field2917;

    @OriginalMember(owner = "client!db", name = "J", descriptor = "I")
    public static int field2919;

    @OriginalMember(owner = "client!db", name = "M", descriptor = "I")
    public static int field2921;

    @OriginalMember(owner = "client!db", name = "O", descriptor = "I")
    public static int field2923;

    @OriginalMember(owner = "client!db", name = "Q", descriptor = "I")
    public static int field2925;

    @OriginalMember(owner = "client!db", name = "R", descriptor = "I")
    public static int field2926;

    @OriginalMember(owner = "client!db", name = "S", descriptor = "I")
    public static int field2927;

    @OriginalMember(owner = "client!db", name = "U", descriptor = "I")
    public static int field2929;

    @OriginalMember(owner = "client!db", name = "I", descriptor = "[I")
    public int[] field2918;

    @OriginalMember(owner = "client!db", name = "N", descriptor = "[I")
    private int[] field2922;

    @OriginalMember(owner = "client!db", name = "A", descriptor = "[Lwa;")
    private class75[] field2910;

    @OriginalMember(owner = "client!db", name = "B", descriptor = "[[I")
    private int[][] field2911;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 7)
    public final void method1275(byte arg0) {
        if (this.field2918 != null) {
            for (int var2 = 0; var2 < this.field2918.length; var2++) {
                this.field2918[var2] = class102.method799(this.field2918[var2], 32768);
            }
        }
        if (arg0 != 108) {
            this.field2918 = (int[]) null;
        }
        field2921++;
    }

    @OriginalMember(owner = "client!db", name = "f", descriptor = "(I)V", line = 30)
    public static void method1276(int arg0) {
        field2930 = null;
        field2913 = null;
        int var1 = -62 % ((arg0 - 56) / 44);
        field2920 = null;
        field2928 = null;
        field2916 = null;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lja;I)V", line = 47)
    public final void method1277(class60 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method501(0);
            if (var3 == 0) {
                field2929++;
                int var4 = -87 / ((arg1 + 18) / 38);
                return;
            }
            this.method1281(var3, arg0, 97);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)I", line = 65)
    public final int method1278(int arg0, byte arg1) {
        field2915++;
        if (this.field2922 == null || arg0 < 0 || arg0 > this.field2922.length) {
            return -1;
        } else {
            if (arg1 != 103) {
                field2924 = 66;
            }
            return this.field2922[arg0];
        }
    }

    @OriginalMember(owner = "client!db", name = "g", descriptor = "(I)Lwa;", line = 85)
    public final class75 method1279(int arg0) {
        field2926++;
        if (arg0 != 18696) {
            this.field2922 = (int[]) null;
        }
        class75 var2 = class89.method708(7391, 80);
        if (this.field2910 == null) {
            return class207.field3497;
        }
        var2.method633(-112, this.field2910[0]);
        for (int var3 = 1; var3 < this.field2910.length; var3++) {
            var2.method633(arg0 - 18752, class13.field174);
            var2.method633(-107, this.field2910[var3]);
        }
        return var2.method623(false);
    }

    @OriginalMember(owner = "client!db", name = "h", descriptor = "(I)I", line = 117)
    public final int method1280(int arg0) {
        field2927++;
        if (arg0 == 6972) {
            return this.field2922 == null ? 0 : this.field2922.length;
        } else {
            return -43;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ILja;I)V", line = 133)
    private final void method1281(int arg0, class60 arg1, int arg2) {
        field2914++;
        if (arg2 <= 26) {
            method1284(-89);
        }
        if (arg0 == 1) {
            this.field2910 = arg1.method532(-1).method654(-121, 60);
        } else if (arg0 == 2) {
            int var4 = arg1.method501(0);
            this.field2918 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field2918[var5] = arg1.method485((byte) -2);
            }
        } else if (arg0 == 3) {
            int var6 = arg1.method501(0);
            this.field2922 = new int[var6];
            this.field2911 = new int[var6][];
            for (int var7 = 0; var7 < var6; var7++) {
                int var8 = arg1.method485((byte) -2);
                this.field2922[var7] = var8;
                this.field2911[var7] = new int[class199.field3333[var8]];
                for (int var9 = 0; var9 < class199.field3333[var8]; var9++) {
                    this.field2911[var7][var9] = arg1.method485((byte) -2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(III)I", line = 207)
    public final int method1282(int arg0, int arg1, int arg2) {
        field2925++;
        if (this.field2922 == null || arg0 < 0 || arg0 > this.field2922.length) {
            return -1;
        } else if (this.field2911[arg0] == null || arg1 < 0 || this.field2911[arg0].length < arg1) {
            return -1;
        } else {
            if (arg2 > -119) {
                this.method1282(18, 59, -127);
            }
            return this.field2911[arg0][arg1];
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Lja;B)Lwa;", line = 237)
    public final class75 method1283(class60 arg0, byte arg1) {
        field2919++;
        int var3 = -72 / ((arg1 + 23) / 57);
        class75 var4 = class89.method708(7391, 80);
        if (this.field2922 != null) {
            for (int var5 = 0; var5 < this.field2922.length; var5++) {
                var4.method633(-52, this.field2910[var5]);
                var4.method633(-67, class211.method1561(this.field2922[var5], arg0.method484(class52.field863[this.field2922[var5]], -24868), 93, this.field2911[var5]));
            }
        }
        var4.method633(-71, this.field2910[this.field2910.length - 1]);
        return var4.method623(false);
    }

    @OriginalMember(owner = "client!db", name = "i", descriptor = "(I)V", line = 265)
    public static final void method1284(int arg0) {
        if (arg0 <= 125) {
            return;
        }
        field2923++;
        field2924 = 0;
        class281.field4848 = 0;
        class87.method697((byte) 114);
        class140.method1088((byte) 43);
        class100.method763(76);
        for (int var1 = 0; var1 < class281.field4848; var1++) {
            int var2 = class83.field1377[var1];
            if (class143.field2463 != class35.field521[var2].field3271) {
                if (class35.field521[var2].field5070.method1671((byte) -115)) {
                    class123.method929(class35.field521[var2], (byte) 124);
                }
                class35.field521[var2].field5070 = null;
                class35.field521[var2] = null;
            }
        }
        if (class299.field5105 != class136.field2328.field1012) {
            throw new RuntimeException("gnp1 pos:" + class136.field2328.field1012 + " psize:" + class299.field5105);
        }
        for (int var3 = 0; var3 < class121.field2031; var3++) {
            if (class35.field521[class132.field2281[var3]] == null) {
                throw new RuntimeException("gnp2 pos:" + var3 + " size:" + class121.field2031);
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "([ILja;B)V", line = 323)
    public final void method1285(int[] arg0, class60 arg1, byte arg2) {
        field2917++;
        if (this.field2922 == null) {
            return;
        }
        if (arg2 != 1) {
            field2930 = (int[]) null;
        }
        for (int var4 = 0; var4 < this.field2922.length && var4 < arg0.length; var4++) {
            int var5 = class195.field3287[this.method1278(var4, (byte) 103)];
            if (var5 > 0) {
                arg1.method478(var5, (long) arg0[var4], 16820);
            }
        }
    }
}
