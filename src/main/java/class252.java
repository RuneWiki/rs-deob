import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class252 {

    @OriginalMember(owner = "client!oa", name = "r", descriptor = "I")
    public int field4544;

    @OriginalMember(owner = "client!oa", name = "l", descriptor = "Llc;")
    public static class143 field4538 = class66.method374("Prendre", -1);

    @OriginalMember(owner = "client!oa", name = "s", descriptor = "Llc;")
    public static class143 field4545 = class66.method374(" )4 ", -1);

    @OriginalMember(owner = "client!oa", name = "u", descriptor = "Llc;")
    private static class143 field4547 = class66.method374("wishes to trade with you)3", -1);

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "Llc;")
    public static class143 field4529 = field4547;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "I")
    public int field4528;

    @OriginalMember(owner = "client!oa", name = "h", descriptor = "I")
    public static int field4534;

    @OriginalMember(owner = "client!oa", name = "i", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!oa", name = "k", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!oa", name = "m", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "Lnf;")
    public class56 field4527;

    @OriginalMember(owner = "client!oa", name = "n", descriptor = "Lgf;")
    public static class7 field4540;

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "[I")
    public int[] field4530;

    @OriginalMember(owner = "client!oa", name = "e", descriptor = "[I")
    public int[] field4531;

    @OriginalMember(owner = "client!oa", name = "f", descriptor = "[I")
    public int[] field4532;

    @OriginalMember(owner = "client!oa", name = "g", descriptor = "[I")
    public int[] field4533;

    @OriginalMember(owner = "client!oa", name = "o", descriptor = "[I")
    public int[] field4541;

    @OriginalMember(owner = "client!oa", name = "q", descriptor = "[I")
    public int[] field4543;

    @OriginalMember(owner = "client!oa", name = "j", descriptor = "[Lnf;")
    public class56[] field4536;

    @OriginalMember(owner = "client!oa", name = "p", descriptor = "[[I")
    public int[][] field4542;

    @OriginalMember(owner = "client!oa", name = "t", descriptor = "[[I")
    public int[][] field4546;

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(I[B)V")
    private final void method1669(int arg0, byte[] arg1) {
        if (arg0 >= -63) {
            return;
        }
        field4534++;
        class190 var3 = new class190(class185.method1210(-1, arg1));
        int var4 = var3.method1265(115);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 >= 6) {
            this.field4528 = var3.method1269(116);
        } else {
            this.field4528 = 0;
        }
        int var5 = var3.method1265(125);
        int var6 = 0;
        int var7 = -1;
        this.field4535 = var3.method1275(128);
        this.field4531 = new int[this.field4535];
        for (int var8 = 0; var8 < this.field4535; var8++) {
            this.field4531[var8] = var6 += var3.method1275(128);
            if (this.field4531[var8] > var7) {
                var7 = this.field4531[var8];
            }
        }
        this.field4537 = var7 + 1;
        this.field4541 = new int[this.field4537];
        this.field4546 = new int[this.field4537][];
        this.field4530 = new int[this.field4537];
        this.field4532 = new int[this.field4537];
        this.field4543 = new int[this.field4537];
        if (var5 != 0) {
            this.field4533 = new int[this.field4537];
            for (int var9 = 0; var9 < this.field4537; var9++) {
                this.field4533[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4535; var10++) {
                this.field4533[this.field4531[var10]] = var3.method1269(103);
            }
            this.field4527 = new class56(this.field4533);
        }
        for (int var11 = 0; var11 < this.field4535; var11++) {
            this.field4543[this.field4531[var11]] = var3.method1269(77);
        }
        for (int var12 = 0; var12 < this.field4535; var12++) {
            this.field4530[this.field4531[var12]] = var3.method1269(86);
        }
        for (int var13 = 0; var13 < this.field4535; var13++) {
            this.field4541[this.field4531[var13]] = var3.method1275(128);
        }
        for (int var14 = 0; var14 < this.field4535; var14++) {
            int var21 = this.field4531[var14];
            int var22 = 0;
            int var23 = this.field4541[var21];
            this.field4546[var21] = new int[var23];
            int var24 = -1;
            for (int var25 = 0; var25 < var23; var25++) {
                int var26 = this.field4546[var21][var25] = var22 += var3.method1275(128);
                if (var26 > var24) {
                    var24 = var26;
                }
            }
            this.field4532[var21] = var24 + 1;
            if (var24 + 1 == var23) {
                this.field4546[var21] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field4542 = new int[var7 + 1][];
        this.field4536 = new class56[var7 + 1];
        for (int var15 = 0; var15 < this.field4535; var15++) {
            int var16 = this.field4531[var15];
            int var17 = this.field4541[var16];
            this.field4542[var16] = new int[this.field4532[var16]];
            for (int var18 = 0; var18 < this.field4532[var16]; var18++) {
                this.field4542[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field4546[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field4546[var16][var19];
                }
                this.field4542[var16][var20] = var3.method1269(87);
            }
            this.field4536[var16] = new class56(this.field4542[var16]);
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(B)V")
    public static void method1670(byte arg0) {
        field4547 = null;
        field4529 = null;
        field4545 = null;
        if (arg0 < -116) {
            field4540 = null;
            field4538 = null;
        }
    }

    @OriginalMember(owner = "client!oa", name = "a", descriptor = "(IIILqb;I)V")
    public static final void method1671(int arg0, int arg1, int arg2, class85 arg3, int arg4) {
        field4539++;
        if (class257.field4625 >= 400) {
            return;
        }
        if (arg3.field1538 != null) {
            arg3 = arg3.method489(arg1 ^ 0x7A6E);
        }
        if (arg3 == null || !arg3.field1518) {
            return;
        }
        class143 var5 = arg3.field1549;
        if (arg1 != -9747) {
            method1670((byte) -4);
        }
        if (arg3.field1521 != 0) {
            var5 = class25.method179(arg1 ^ 0xFFFFD9ED, new class143[] { var5, class212.method1477(arg3.field1521, class229.field4195.field510, -6), class245.field4407, class214.field3951, class274.method1806(arg3.field1521, true), class5.field81 });
        }
        if (class175.field3132 == 1) {
            class54.field1050++;
            class75.method432((short) 48, class254.field4549, arg4, true, class25.method179(0, new class143[] { class210.field3904, class10.field219, var5 }), arg2, (long) arg0);
        } else if (!class71.field1351) {
            class250.field4505++;
            class143[] var6 = arg3.field1573;
            if (class258.field4635) {
                var6 = class72.method415(var6, true);
            }
            if (var6 != null) {
                for (int var7 = 4; var7 >= 0; var7--) {
                    if (var6[var7] != null && (class153.field2764 != 0 || !var6[var7].method895((byte) -117, class246.field4425))) {
                        class250.field4509++;
                        byte var8 = 0;
                        if (var7 == 0) {
                            var8 = 22;
                        }
                        if (var7 == 1) {
                            var8 = 17;
                        }
                        if (var7 == 2) {
                            var8 = 1;
                        }
                        if (var7 == 3) {
                            var8 = 5;
                        }
                        if (var7 == 4) {
                            var8 = 24;
                        }
                        class75.method432(var8, var6[var7], arg4, true, class25.method179(0, new class143[] { class210.field3902, var5 }), arg2, (long) arg0);
                    }
                }
            }
            if (class153.field2764 == 0 && var6 != null) {
                for (int var9 = 4; var9 >= 0; var9--) {
                    if (var6[var9] != null && var6[var9].method895((byte) -104, class246.field4425)) {
                        class144.field2579++;
                        short var10 = 0;
                        short var11 = 0;
                        if (var9 == 0) {
                            var11 = 22;
                        }
                        if (var9 == 1) {
                            var11 = 17;
                        }
                        if (arg3.field1521 > class229.field4195.field510) {
                            var10 = 2000;
                        }
                        if (var9 == 2) {
                            var11 = 1;
                        }
                        if (var9 == 3) {
                            var11 = 5;
                        }
                        if (var9 == 4) {
                            var11 = 24;
                        }
                        if (var11 != 0) {
                            var11 += var10;
                        }
                        class75.method432(var11, var6[var9], arg4, true, class25.method179(arg1 ^ 0xFFFFD9ED, new class143[] { class210.field3902, var5 }), arg2, (long) arg0);
                    }
                }
            }
            class75.method432((short) 1007, class118.field2101, arg4, true, class25.method179(0, new class143[] { class210.field3902, var5 }), arg2, (long) arg0);
            return;
        } else if ((class106.field1864 & 0x2) == 2) {
            class75.method432((short) 9, class55.field1067, arg4, true, class25.method179(0, new class143[] { class226.field4085, class10.field219, var5 }), arg2, (long) arg0);
            class31.field482++;
            return;
        }
    }

    @OriginalMember(owner = "client!oa", name = "<init>", descriptor = "([BI)V")
    public class252(byte[] arg0, int arg1) {
        this.field4544 = class7.method58(arg0.length, arg0, -123);
        if (this.field4544 != arg1) {
            throw new RuntimeException();
        }
        this.method1669(-119, arg0);
    }
}
