import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class222 extends class23 {

    @OriginalMember(owner = "client!gj", name = "bb", descriptor = "Lqd;")
    public static class40 field3686 = class147.method1106("; version=1; path=)4; domain=", (byte) -103);

    @OriginalMember(owner = "client!gj", name = "Y", descriptor = "Lwh;")
    public static class9 field3683 = new class9();

    @OriginalMember(owner = "client!gj", name = "hb", descriptor = "Lqd;")
    public static class40 field3692 = class147.method1106("Benutzen", (byte) -61);

    @OriginalMember(owner = "client!gj", name = "ib", descriptor = "I")
    public static int field3693 = 0;

    @OriginalMember(owner = "client!gj", name = "Z", descriptor = "I")
    public static int field3684;

    @OriginalMember(owner = "client!gj", name = "ab", descriptor = "I")
    public static int field3685;

    @OriginalMember(owner = "client!gj", name = "cb", descriptor = "I")
    public static int field3687;

    @OriginalMember(owner = "client!gj", name = "db", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!gj", name = "fb", descriptor = "I")
    public static int field3690;

    @OriginalMember(owner = "client!gj", name = "gb", descriptor = "I")
    public static int field3691;

    @OriginalMember(owner = "client!gj", name = "eb", descriptor = "[Lbi;")
    private class78[] field3689;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "(B)V", line = 15)
    public static final void method1554(byte arg0) {
        field3688++;
        int var1 = 63 % ((arg0 - 82) / 39);
        class95 var2 = class306.field5135;
        synchronized (class306.field5135) {
            class14.field241++;
            class257.field4280 = class98.field1753;
            if (class265.field4447 < 0) {
                for (int var3 = 0; var3 < 112; var3++) {
                    class251.field4162[var3] = false;
                }
                class265.field4447 = class96.field1727;
            } else {
                while (class96.field1727 != class265.field4447) {
                    int var4 = class1.field1[class96.field1727];
                    class96.field1727 = class96.field1727 + 1 & 0x7F;
                    if (var4 < 0) {
                        class251.field4162[~var4] = false;
                    } else {
                        class251.field4162[var4] = true;
                    }
                }
            }
            class98.field1753 = class164.field2720;
        }
    }

    @OriginalMember(owner = "client!gj", name = "<init>", descriptor = "()V", line = 55)
    public class222() {
        super(0, true);
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(II)[[I", line = 61)
    public final int[][] method17(int arg0, int arg1) {
        field3690++;
        if (arg0 < 30) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field417.method1251(arg1, 122);
        if (this.field417.field2751) {
            int var4 = class52.field1007;
            int var5 = class271.field4497;
            int[][] var6 = new int[var5][var4];
            int[][][] var7 = this.field417.method1249(1);
            this.method1556((byte) -117, var6);
            for (int var8 = 0; var8 < class271.field4497; var8++) {
                int[] var9 = var6[var8];
                int[][] var10 = var7[var8];
                int[] var11 = var10[1];
                int[] var12 = var10[2];
                int[] var13 = var10[0];
                for (int var14 = 0; var14 < class52.field1007; var14++) {
                    int var15 = var9[var14];
                    var12[var14] = class276.method1923(var15 << 4, 4080);
                    var11[var14] = class276.method1923(var15, 65280) >> 4;
                    var13[var14] = class276.method1923(16711680, var15) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IBIIII)V", line = 121)
    public static final void method1555(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        class240.field3977 = arg4;
        class1.field6 = arg2;
        class7.field110 = arg5;
        field3685++;
        int var6 = 16 % ((-arg1 - 39) / 57);
        class242.field3989 = arg0;
        class19.field324 = arg3;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(B[[I)V", line = 135)
    private final void method1556(byte arg0, int[][] arg1) {
        if (arg0 > -86) {
            return;
        }
        field3691++;
        int var3 = class52.field1007;
        int var4 = class271.field4497;
        class98.method730(12731, arg1);
        class284.method1980(0, 0, 0, class212.field3384, class6.field92);
        if (this.field3689 == null) {
            return;
        }
        for (int var5 = 0; var5 < this.field3689.length; var5++) {
            class78 var6 = this.field3689[var5];
            int var7 = var6.field1321;
            int var8 = var6.field1325;
            if (var7 < 0) {
                if (var8 >= 0) {
                    var6.method2(59, var3, var4);
                }
            } else if (var8 >= 0) {
                var6.method3(var4, (byte) -100, var3);
            } else {
                var6.method5(var3, var4, -1);
            }
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IILsd;)V", line = 185)
    public final void method23(int arg0, int arg1, class26 arg2) {
        if (arg1 != 0) {
            return;
        }
        if (arg0 == 0) {
            this.field3689 = new class78[arg2.method226(255)];
            for (int var4 = 0; var4 < this.field3689.length; var4++) {
                int var5 = arg2.method226(255);
                if (var5 == 0) {
                    this.field3689[var4] = class103.method776(true, arg2);
                } else if (var5 == 1) {
                    this.field3689[var4] = class44.method402(arg1 + 73, arg2);
                } else if (var5 == 2) {
                    this.field3689[var4] = class214.method1517(arg2, arg1 + 75);
                } else if (var5 == 3) {
                    this.field3689[var4] = class50.method437(-3, arg2);
                }
            }
        } else if (arg0 == 1) {
            this.field415 = arg2.method226(255) == 1;
        }
        field3684++;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(BI)[I", line = 261)
    public final int[] method32(byte arg0, int arg1) {
        field3687++;
        int[] var3 = this.field403.method724((byte) -60, arg1);
        if (this.field403.field1760) {
            this.method1556((byte) -101, this.field403.method727(false));
        }
        return arg0 == -94 ? var3 : (int[]) null;
    }

    @OriginalMember(owner = "client!gj", name = "g", descriptor = "(I)V", line = 288)
    public static void method1557(int arg0) {
        if (arg0 != -3) {
            field3693 = 47;
        }
        field3692 = null;
        field3686 = null;
        field3683 = null;
    }
}
