import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class66 {

    @OriginalMember(owner = "client!pk", name = "k", descriptor = "Lch;")
    private class167 field1154 = new class167();

    @OriginalMember(owner = "client!pk", name = "o", descriptor = "Lkh;")
    private class5 field1158 = new class5();

    @OriginalMember(owner = "client!pk", name = "n", descriptor = "I")
    private int field1157;

    @OriginalMember(owner = "client!pk", name = "m", descriptor = "I")
    private int field1156;

    @OriginalMember(owner = "client!pk", name = "p", descriptor = "Lwd;")
    private class97 field1159;

    @OriginalMember(owner = "client!pk", name = "i", descriptor = "[I")
    public static int[] field1152 = new int[1000];

    @OriginalMember(owner = "client!pk", name = "j", descriptor = "Le;")
    public static class191 field1153 = class54.method368("sl_flags", 2047);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "I")
    public static int field1145;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field1146;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field1148;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field1149;

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!pk", name = "l", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "[[Z")
    public static boolean[][] field1150;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V")
    public static final void method432(int arg0) {
        field1147++;
        int var1 = class192.field3447;
        int var2 = class123.field2041;
        int var3 = class224.field3986;
        int var4 = class93.field1522;
        int var5 = 6116423;
        if (arg0 != 16776960) {
            return;
        }
        class7.method55(var1, var2, var3, var4, var5);
        class7.method55(var1 + 1, var2 + 1, var3 - 2, 16, 0);
        class7.method48(var1 + 1, var2 - -18, var3 - 2, var4 + -19, 0);
        class230.field4128.method296(class107.field1774, var1 + 3, var2 - -14, var5, -1);
        int var6 = class189.field3325;
        int var7 = class133.field2229;
        for (int var8 = 0; var8 < class167.field2824; var8++) {
            int var9 = (class167.field2824 - var8 - 1) * 15 + var2 + 31;
            int var10 = 16777215;
            if (var6 > var1 && (var1 + var3) > var6 && (var9 - 13) < var7 && var7 < (var9 + 3)) {
                var10 = 16776960;
            }
            class230.field4128.method296(class106.method683(-8029, var8), var1 + 3, var9, var10, 0);
        }
        class12.method83(class123.field2041, class224.field3986, class192.field3447, (byte) 36, class93.field1522);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BI)V")
    public static final void method433(byte arg0, int arg1) {
        class273.field4822.method990(arg0 + 136, arg1);
        field1151++;
        if (arg0 != -29) {
            method433((byte) -39, -103);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BB)I")
    public static final int method434(byte arg0, byte arg1) {
        field1145++;
        if (arg1 >= 65 && arg1 <= 90) {
            return arg1 - 65;
        } else if (arg1 >= 97 && arg1 <= 122) {
            return arg1 + 26 - 97;
        } else if (arg1 >= 48 && arg1 <= 57) {
            return arg1 + 4;
        } else if (arg1 == 43) {
            return 62;
        } else if (arg1 == 42) {
            return 62;
        } else if (arg1 == 47) {
            return 63;
        } else {
            if (arg0 < 74) {
                field1152 = null;
            }
            return arg1 == 45 ? 63 : -1;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V")
    public static void method435(boolean arg0) {
        field1153 = null;
        field1150 = null;
        field1152 = null;
        if (!arg0) {
            field1150 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(I)Lw;")
    public final class104 method436(int arg0) {
        if (arg0 >= -36) {
            return null;
        } else {
            field1144++;
            return this.field1159.method609(false);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BJ)Lch;")
    public final class167 method437(byte arg0, long arg1) {
        if (arg0 < 108) {
            field1150 = null;
        }
        class167 var4 = (class167) this.field1159.method612(arg1, true);
        if (var4 != null) {
            this.field1158.method22(47, var4);
        }
        field1146++;
        return var4;
    }

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)Lw;")
    public final class104 method438(int arg0) {
        field1148++;
        int var2 = -118 / ((arg0 - 46) / 61);
        return this.field1159.method610(110);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lch;IJ)V")
    public final void method439(class167 arg0, int arg1, long arg2) {
        field1155++;
        if (~this.field1156 == arg1) {
            class167 var5 = this.field1158.method17(arg1 + 1);
            var5.method655(63);
            var5.method1124(0);
            if (this.field1154 == var5) {
                class167 var6 = this.field1158.method17(0);
                var6.method655(63);
                var6.method1124(0);
            }
        } else {
            this.field1156--;
        }
        this.field1159.method605(arg2, arg1 - 2, arg0);
        this.field1158.method22(40, arg0);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(B)V")
    public final void method440(byte arg0) {
        if (arg0 != 56) {
            field1152 = null;
        }
        this.field1158.method23(true);
        field1149++;
        this.field1159.method613(0);
        this.field1154 = new class167();
        this.field1156 = this.field1157;
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(I)V")
    public class66(int arg0) {
        this.field1157 = arg0;
        this.field1156 = arg0;
        int var2;
        for (var2 = 1; arg0 > var2 + var2; var2 += var2) {
        }
        this.field1159 = new class97(var2);
    }
}
