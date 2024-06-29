import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dp")
public class class2 {

    @OriginalMember(owner = "client!dp", name = "c", descriptor = "I")
    private int field17 = -1;

    @OriginalMember(owner = "client!dp", name = "j", descriptor = "I")
    private int field24 = 0;

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "Lvn;")
    private class169 field16 = new class169();

    @OriginalMember(owner = "client!dp", name = "u", descriptor = "Z")
    public boolean field35 = false;

    @OriginalMember(owner = "client!dp", name = "n", descriptor = "I")
    private int field28;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "I")
    private int field15;

    @OriginalMember(owner = "client!dp", name = "k", descriptor = "[[I")
    private int[][] field25;

    @OriginalMember(owner = "client!dp", name = "h", descriptor = "[Lsg;")
    private class226[] field22;

    @OriginalMember(owner = "client!dp", name = "g", descriptor = "[Z")
    public static boolean[] field21 = new boolean[100];

    @OriginalMember(owner = "client!dp", name = "o", descriptor = "I")
    public static int field29 = 0;

    @OriginalMember(owner = "client!dp", name = "d", descriptor = "I")
    public static int field18;

    @OriginalMember(owner = "client!dp", name = "e", descriptor = "I")
    public static int field19;

    @OriginalMember(owner = "client!dp", name = "i", descriptor = "I")
    public static int field23;

    @OriginalMember(owner = "client!dp", name = "l", descriptor = "I")
    public static int field26;

    @OriginalMember(owner = "client!dp", name = "m", descriptor = "I")
    public static int field27;

    @OriginalMember(owner = "client!dp", name = "p", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!dp", name = "q", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!dp", name = "r", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!dp", name = "s", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!dp", name = "t", descriptor = "I")
    public static int field34;

    @OriginalMember(owner = "client!dp", name = "f", descriptor = "Ltc;")
    public static class196 field20;

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(III)V")
    public static final void method11(int arg0, int arg1, int arg2) {
        field34++;
        int var3 = class390.field5715.field6351[0];
        int var4 = class390.field5715.field6350[0];
        if (class136.field1912 == 1) {
            if (class138.method824(var4, arg0, 1, -2, 1, false, 0, (byte) -110, 0, var3, arg1)) {
                return;
            }
            class138.method824(var4, arg0, 1, -3, 1, false, 0, (byte) 125, 0, var3, arg1);
        } else if (class138.method824(var4, arg0, 1, -3, 1, false, 0, (byte) 89, 0, var3, arg1)) {
            return;
        } else {
            class138.method824(var4, arg0, 1, -2, 1, false, 0, (byte) -100, 0, var3, arg1);
        }
        if (arg2 != 17585) {
            field21 = null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(IIII)V")
    public static final void method12(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != -20298) {
            return;
        }
        int var4 = class75.field834 * arg3 >> 8;
        field26++;
        if (var4 != 0 && arg0 != -1) {
            class8.method80(arg0, false, class213.field2919, 0, -83, var4);
            class343.field5049 = true;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(B[[I)V")
    public static final void method13(byte arg0, int[][] arg1) {
        field33++;
        class318.field4522 = arg1;
        if (arg0 != 95) {
            method12(80, -67, -80, -26);
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(II)[I")
    public final int[] method14(int arg0, int arg1) {
        if (arg0 < 23) {
            this.method15(false);
        }
        field27++;
        if (this.field28 == this.field15) {
            this.field35 = this.field22[arg1] == null;
            this.field22[arg1] = class19.field200;
            return this.field25[arg1];
        } else if (this.field28 == 1) {
            this.field35 = this.field17 != arg1;
            this.field17 = arg1;
            return this.field25[0];
        } else {
            class226 var3 = this.field22[arg1];
            if (var3 == null) {
                this.field35 = true;
                if (this.field28 <= this.field24) {
                    class226 var4 = (class226) this.field16.method1117((byte) -115);
                    var3 = new class226(arg1, var4.field3081);
                    this.field22[var4.field3084] = null;
                    var4.method2290((byte) 98);
                } else {
                    var3 = new class226(arg1, this.field24);
                    this.field24++;
                }
                this.field22[arg1] = var3;
            } else {
                this.field35 = false;
            }
            this.field16.method1123((byte) 126, var3);
            return this.field25[var3.field3081];
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Z)[[I")
    public final int[][] method15(boolean arg0) {
        field30++;
        if (this.field28 != this.field15) {
            throw new RuntimeException("Can only retrieve a full image cache");
        } else if (arg0) {
            for (int var2 = 0; var2 < this.field28; var2++) {
                this.field22[var2] = class19.field200;
            }
            return this.field25;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(I)V")
    public static void method16(int arg0) {
        if (arg0 < 110) {
            field23 = -54;
        }
        field21 = null;
        field20 = null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(BI)V")
    public static final void method17(byte arg0, int arg1) {
        field19++;
        if (!class344.method2202((byte) -83, arg1)) {
            return;
        }
        class119[] var2 = class224.field3054[arg1];
        if (arg0 != -10) {
            return;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class119 var4 = var2[var3];
            if (var4 != null) {
                var4.field1470 = 1;
                var4.field1447 = 0;
                var4.field1561 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "b", descriptor = "(I)V")
    public final void method18(int arg0) {
        field32++;
        for (int var2 = arg0; var2 < this.field28; var2++) {
            this.field25[var2] = null;
        }
        this.field25 = null;
        this.field22 = null;
        this.field16.method1116((byte) -123);
        this.field16 = null;
    }

    @OriginalMember(owner = "client!dp", name = "a", descriptor = "(Lnj;I[I[I[I)V")
    public static final void method19(class133 arg0, int arg1, int[] arg2, int[] arg3, int[] arg4) {
        field31++;
        for (int var5 = arg1; var5 < arg4.length; var5++) {
            int var6 = arg4[var5];
            int var7 = arg2[var5];
            int var8 = arg3[var5];
            for (int var9 = 0; var7 != 0 && arg0.field6269.length > var9; var9++) {
                if ((var7 & 0x1) != 0) {
                    if (var6 == -1) {
                        arg0.field6269[var9] = null;
                    } else {
                        class182 var10 = class437.method2717(var6, (byte) -103);
                        int var11 = var10.field2487;
                        class138 var12 = arg0.field6269[var9];
                        if (var12 != null) {
                            if (var12.field1963 == var6) {
                                if (var11 == 0) {
                                    var12 = arg0.field6269[var9] = null;
                                } else if (var11 == 1) {
                                    var12.field1967 = 1;
                                    var12.field1962 = var8;
                                    var12.field1960 = 0;
                                    var12.field1970 = 0;
                                    var12.field1959 = 0;
                                    class424.method2628(0, arg0.field1304, var10, 0, arg0.field1311, class390.field5715 == arg0);
                                } else if (var11 == 2) {
                                    var12.field1960 = 0;
                                }
                            } else if (var10.field2489 >= class437.method2717(var12.field1963, (byte) -103).field2489) {
                                var12 = arg0.field6269[var9] = null;
                            }
                        }
                        if (var12 == null) {
                            class138 var13 = arg0.field6269[var9] = new class138();
                            var13.field1967 = 1;
                            var13.field1963 = var6;
                            var13.field1960 = 0;
                            var13.field1959 = 0;
                            var13.field1970 = 0;
                            var13.field1962 = var8;
                            class424.method2628(0, arg0.field1304, var10, 0, arg0.field1311, class390.field5715 == arg0);
                        }
                    }
                }
                var7 >>>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!dp", name = "<init>", descriptor = "(III)V")
    public class2(int arg0, int arg1, int arg2) {
        this.field28 = arg0;
        this.field15 = arg1;
        this.field25 = new int[this.field28][arg2];
        this.field22 = new class226[this.field15];
    }
}
