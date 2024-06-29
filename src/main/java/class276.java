import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class276 {

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    private int field4726;

    @OriginalMember(owner = "client!hf", name = "h", descriptor = "Z")
    public static boolean field4733 = true;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Lmh;")
    public static class62 field4727 = class201.method1405(true, ")1p");

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "D")
    public static double field4732 = -1.0D;

    @OriginalMember(owner = "client!hf", name = "p", descriptor = "I")
    public static int field4741 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!hf", name = "r", descriptor = "Lmh;")
    public static class62 field4743 = class201.method1405(true, ":assist:");

    @OriginalMember(owner = "client!hf", name = "v", descriptor = "Lmh;")
    public static class62 field4747 = class201.method1405(true, "weiss:");

    @OriginalMember(owner = "client!hf", name = "w", descriptor = "J")
    public static long field4748 = 0L;

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "I")
    public static int field4728;

    @OriginalMember(owner = "client!hf", name = "i", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!hf", name = "j", descriptor = "I")
    public static int field4735;

    @OriginalMember(owner = "client!hf", name = "m", descriptor = "I")
    public int field4738;

    @OriginalMember(owner = "client!hf", name = "n", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!hf", name = "o", descriptor = "I")
    public int field4740;

    @OriginalMember(owner = "client!hf", name = "t", descriptor = "I")
    public int field4745;

    @OriginalMember(owner = "client!hf", name = "y", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!hf", name = "z", descriptor = "I")
    public static int field4751;

    @OriginalMember(owner = "client!hf", name = "q", descriptor = "Lg;")
    public class249 field4742;

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[I")
    public int[] field4729;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "[I")
    public int[] field4731;

    @OriginalMember(owner = "client!hf", name = "k", descriptor = "[I")
    public static int[] field4736;

    @OriginalMember(owner = "client!hf", name = "u", descriptor = "[I")
    public int[] field4746;

    @OriginalMember(owner = "client!hf", name = "x", descriptor = "[I")
    public int[] field4749;

    @OriginalMember(owner = "client!hf", name = "A", descriptor = "[I")
    public int[] field4752;

    @OriginalMember(owner = "client!hf", name = "B", descriptor = "[I")
    public int[] field4753;

    @OriginalMember(owner = "client!hf", name = "l", descriptor = "[Lg;")
    public class249[] field4737;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "[[I")
    public int[][] field4730;

    @OriginalMember(owner = "client!hf", name = "s", descriptor = "[[I")
    public int[][] field4744;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V", line = 11)
    public static final void method1889(int arg0, int arg1) {
        field4739++;
        if (class118.field1983 == arg1) {
            return;
        }
        if (class118.field1983 == 0) {
            class181.method1271(-90);
        }
        if (arg1 == 40) {
            class54.method356(class275.field4689, class275.field4698, class45.field679, (byte) -128);
        }
        if (arg1 != 40 && class140.field2253 != null) {
            class140.field2253.method1193(-1);
            class140.field2253 = null;
        }
        if (arg1 == 25 || arg1 == 28) {
            class148.field2335 = 0;
            class306.field5260 = 0;
            class192.field3228 = 1;
            class290.field4930 = 0;
            class265.field4479 = 1;
            class309.method2102(-100);
        }
        boolean var2 = arg1 == 5 || arg1 == 10 || arg1 == 28;
        if (arg1 == 5) {
            class36.method235(class53.field781, (byte) 58);
        } else {
            class4.method21(125);
        }
        boolean var3 = class118.field1983 == 5 || class118.field1983 == 10 || class118.field1983 == 28;
        if (var3 != var2) {
            if (var2) {
                class182.field2909 = class19.field183;
                if (class100.field1650 == 0) {
                    class73.method524(true, 2);
                } else {
                    class278.method1900(255, false, 0, class19.field183, 0, 2, class163.field2649);
                }
                class246.field4185.method1748(0, false);
            } else {
                class73.method524(true, 2);
                class246.field4185.method1748(0, true);
            }
        }
        if (arg0 <= -127) {
            if (arg1 == 25 || arg1 == 28 || arg1 == 40) {
                class154.method1142();
            }
            class118.field1983 = arg1;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z[B)V", line = 101)
    private final void method1890(boolean arg0, byte[] arg1) {
        field4750++;
        class92 var3 = new class92(class49.method320((byte) 94, arg1));
        int var4 = var3.method702(-1);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field4740 = var3.method704(1509947792);
        } else {
            this.field4740 = 0;
        }
        int var5 = var3.method702(-1);
        int var6 = 0;
        int var7 = -1;
        this.field4745 = var3.method721(65);
        this.field4753 = new int[this.field4745];
        if (!arg0) {
            return;
        }
        for (int var8 = 0; var8 < this.field4745; var8++) {
            this.field4753[var8] = var6 += var3.method721(22);
            if (this.field4753[var8] > var7) {
                var7 = this.field4753[var8];
            }
        }
        this.field4738 = var7 + 1;
        this.field4752 = new int[this.field4738];
        this.field4749 = new int[this.field4738];
        this.field4746 = new int[this.field4738];
        this.field4729 = new int[this.field4738];
        this.field4730 = new int[this.field4738][];
        if (var5 != 0) {
            this.field4731 = new int[this.field4738];
            for (int var9 = 0; var9 < this.field4738; var9++) {
                this.field4731[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4745; var10++) {
                this.field4731[this.field4753[var10]] = var3.method704(1509947792);
            }
            this.field4742 = new class249(this.field4731);
        }
        for (int var11 = 0; var11 < this.field4745; var11++) {
            this.field4729[this.field4753[var11]] = var3.method704(1509947792);
        }
        for (int var12 = 0; var12 < this.field4745; var12++) {
            this.field4749[this.field4753[var12]] = var3.method704(1509947792);
        }
        for (int var13 = 0; var13 < this.field4745; var13++) {
            this.field4746[this.field4753[var13]] = var3.method721(111);
        }
        for (int var14 = 0; var14 < this.field4745; var14++) {
            int var15 = 0;
            int var16 = this.field4753[var14];
            int var17 = this.field4746[var16];
            int var18 = -1;
            this.field4730[var16] = new int[var17];
            for (int var19 = 0; var19 < var17; var19++) {
                int var20 = this.field4730[var16][var19] = var15 += var3.method721(77);
                if (var20 > var18) {
                    var18 = var20;
                }
            }
            this.field4752[var16] = var18 + 1;
            if (var18 + 1 == var17) {
                this.field4730[var16] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field4744 = new int[var7 + 1][];
        this.field4737 = new class249[var7 + 1];
        for (int var21 = 0; var21 < this.field4745; var21++) {
            int var22 = this.field4753[var21];
            int var23 = this.field4746[var22];
            this.field4744[var22] = new int[this.field4752[var22]];
            for (int var24 = 0; var24 < this.field4752[var22]; var24++) {
                this.field4744[var22][var24] = -1;
            }
            for (int var25 = 0; var25 < var23; var25++) {
                int var26;
                if (this.field4730[var22] == null) {
                    var26 = var25;
                } else {
                    var26 = this.field4730[var22][var25];
                }
                this.field4744[var22][var26] = var3.method704(1509947792);
            }
            this.field4737[var22] = new class249(this.field4744[var22]);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(B)V", line = 285)
    public static void method1891(byte arg0) {
        field4743 = null;
        field4736 = null;
        field4727 = null;
        field4747 = null;
        if (arg0 != -23) {
            method1892((class153) null, -32);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lna;I)I", line = 334)
    public static final int method1892(class153 arg0, int arg1) {
        field4735++;
        int var2 = arg0.field2426;
        int var3 = -91 % ((arg1 + 69) / 42);
        if (arg0.field3879 == arg0.field3876) {
            var2 = arg0.field2431;
        } else if (arg0.field3876 == arg0.field3875) {
            var2 = arg0.field2451;
        }
        return var2;
    }

    @OriginalMember(owner = "client!hf", name = "<init>", descriptor = "([BI)V", line = 363)
    public class276(byte[] arg0, int arg1) {
        this.field4726 = class282.method1921(arg0, -109, arg0.length);
        if (this.field4726 != arg1) {
            throw new RuntimeException();
        }
        this.method1890(true, arg0);
    }
}
