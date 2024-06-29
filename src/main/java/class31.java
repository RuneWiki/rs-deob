import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class31 extends class255 {

    @OriginalMember(owner = "client!na", name = "O", descriptor = "Leb;")
    public static class230 field569 = class68.method589(0, "<img=0>");

    @OriginalMember(owner = "client!na", name = "V", descriptor = "Leb;")
    public static class230 field575 = class68.method589(0, "Okay");

    @OriginalMember(owner = "client!na", name = "eb", descriptor = "Leb;")
    public static class230 field584 = class68.method589(0, "underlay");

    @OriginalMember(owner = "client!na", name = "fb", descriptor = "Leb;")
    public static class230 field585 = class68.method589(0, "loginscreen");

    @OriginalMember(owner = "client!na", name = "M", descriptor = "I")
    public static int field567;

    @OriginalMember(owner = "client!na", name = "N", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!na", name = "P", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!na", name = "S", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!na", name = "T", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!na", name = "W", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!na", name = "X", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!na", name = "Y", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!na", name = "ab", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!na", name = "bb", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!na", name = "cb", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!na", name = "db", descriptor = "I")
    public static int field583;

    @OriginalMember(owner = "client!na", name = "hb", descriptor = "I")
    public static int field587;

    @OriginalMember(owner = "client!na", name = "gb", descriptor = "Lkk;")
    public static class223 field586;

    @OriginalMember(owner = "client!na", name = "R", descriptor = "[I")
    private int[] field571;

    @OriginalMember(owner = "client!na", name = "Z", descriptor = "[I")
    public int[] field579;

    @OriginalMember(owner = "client!na", name = "U", descriptor = "[Leb;")
    private class230[] field574;

    @OriginalMember(owner = "client!na", name = "L", descriptor = "[[I")
    private int[][] field566;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(B)Leb;")
    public final class230 method282(byte arg0) {
        int var2 = 72 / ((arg0 - 57) / 48);
        field573++;
        class230 var3 = class214.method1481(0, 80);
        if (this.field574 == null) {
            return class71.field1296;
        }
        var3.method1606((byte) 41, this.field574[0]);
        for (int var4 = 1; var4 < this.field574.length; var4++) {
            var3.method1606((byte) 41, class243.field4181);
            var3.method1606((byte) 41, this.field574[var4]);
        }
        return var3.method1631(76);
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Lfk;I)V")
    public final void method283(class14 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method200(255);
            if (var3 == 0) {
                field567++;
                int var4 = 121 % ((arg1 - 79) / 35);
                return;
            }
            this.method293(1, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILfk;)Leb;")
    public final class230 method284(int arg0, class14 arg1) {
        class230 var3 = class214.method1481(arg0, 80);
        field587++;
        if (this.field571 != null) {
            for (int var4 = 0; var4 < this.field571.length; var4++) {
                var3.method1606((byte) 41, this.field574[var4]);
                var3.method1606((byte) 41, class190.method1354(arg1.method175(-8, class25.field479[this.field571[var4]]), this.field571[var4], this.field566[var4], -2));
            }
        }
        var3.method1606((byte) 41, this.field574[this.field574.length - 1]);
        return var3.method1631(52);
    }

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(III)I")
    public final int method285(int arg0, int arg1, int arg2) {
        field582++;
        if (this.field571 == null || arg1 < 0 || arg1 > this.field571.length) {
            return -1;
        } else if (this.field566[arg1] == null || arg2 < 0 || this.field566[arg1].length < arg2) {
            return -1;
        } else {
            if (arg0 != -1) {
                this.method293(126, (class14) null, 70);
            }
            return this.field566[arg1][arg2];
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IBIII)V")
    public static final void method286(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        int var5 = 0;
        field568++;
        int var6 = arg3;
        int var7 = -arg3;
        if (arg1 > -38) {
            field575 = null;
        }
        int var8 = class106.method882(class78.field1404, 1, class42.field769, arg2 + arg3);
        int var9 = class106.method882(class78.field1404, 1, class42.field769, arg2 - arg3);
        class182.method1311(arg0, var8, true, class66.field1254[arg4], var9);
        int var10 = -1;
        while (var6 > var5) {
            var10 += 2;
            var7 += var10;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg4 - var6;
                int var12 = arg4 + var6;
                if (class15.field345 <= var12 && var11 <= class259.field4587) {
                    int var13 = class106.method882(class78.field1404, 1, class42.field769, arg2 + var5);
                    int var14 = class106.method882(class78.field1404, 1, class42.field769, arg2 - var5);
                    if (var12 <= class259.field4587) {
                        class182.method1311(arg0, var13, true, class66.field1254[var12], var14);
                    }
                    if (var11 >= class15.field345) {
                        class182.method1311(arg0, var13, true, class66.field1254[var11], var14);
                    }
                }
            }
            var5++;
            int var15 = arg4 - var5;
            int var16 = arg4 + var5;
            if (var16 >= class15.field345 && var15 <= class259.field4587) {
                int var17 = class106.method882(class78.field1404, 1, class42.field769, arg2 + var6);
                int var18 = class106.method882(class78.field1404, 1, class42.field769, arg2 - var6);
                if (var16 <= class259.field4587) {
                    class182.method1311(arg0, var17, true, class66.field1254[var16], var18);
                }
                if (var15 >= class15.field345) {
                    class182.method1311(arg0, var17, true, class66.field1254[var15], var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(I)V")
    public final void method287(int arg0) {
        if (arg0 != -24979) {
            this.field574 = null;
        }
        field570++;
        if (this.field579 != null) {
            for (int var2 = 0; var2 < this.field579.length; var2++) {
                this.field579[var2] = class177.method1290(this.field579[var2], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "([IBLfk;)V")
    public final void method288(int[] arg0, byte arg1, class14 arg2) {
        field580++;
        if (this.field571 == null) {
            return;
        }
        int var4 = 0;
        if (arg1 >= -82) {
            field584 = null;
        }
        while (var4 < this.field571.length) {
            if (var4 >= arg0.length) {
                return;
            }
            int var5 = class115.field2063[this.method289(var4, -125)];
            if (var5 > 0) {
                arg2.method185(-3526, var5, (long) arg0[var4]);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!na", name = "e", descriptor = "(II)I")
    public final int method289(int arg0, int arg1) {
        field572++;
        if (this.field571 == null || arg0 < 0 || this.field571.length < arg0) {
            return -1;
        } else {
            if (arg1 > -120) {
                this.field571 = null;
            }
            return this.field571[arg0];
        }
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(B)V")
    public static void method290(byte arg0) {
        field586 = null;
        field575 = null;
        field585 = null;
        field584 = null;
        int var1 = -71 / ((arg0 + 42) / 33);
        field569 = null;
    }

    @OriginalMember(owner = "client!na", name = "g", descriptor = "(B)I")
    public final int method291(byte arg0) {
        field583++;
        if (this.field571 == null) {
            return 0;
        } else if (arg0 == -113) {
            return this.field571.length;
        } else {
            return -128;
        }
    }

    @OriginalMember(owner = "client!na", name = "f", descriptor = "(II)I")
    public static final int method292(int arg0, int arg1) {
        field578++;
        return arg0 == 2899 ? arg1 & 0xFF : 100;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILfk;I)V")
    private final void method293(int arg0, class14 arg1, int arg2) {
        if (arg0 == arg2) {
            this.field574 = arg1.method171((byte) 79).method1586(60, false);
        } else if (arg2 == 2) {
            int var8 = arg1.method200(255);
            this.field579 = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                this.field579[var9] = arg1.method161(4);
            }
        } else if (arg2 == 3) {
            int var4 = arg1.method200(255);
            this.field571 = new int[var4];
            this.field566 = new int[var4][];
            for (int var5 = 0; var5 < var4; var5++) {
                int var6 = arg1.method161(arg0 ^ 0x5);
                this.field571[var5] = var6;
                this.field566[var5] = new int[class75.field1373[var6]];
                for (int var7 = 0; var7 < class75.field1373[var6]; var7++) {
                    this.field566[var5][var7] = arg1.method161(4);
                }
            }
        }
        field581++;
    }
}
