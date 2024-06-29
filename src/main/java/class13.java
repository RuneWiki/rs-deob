import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class class13 extends class39 {

    @OriginalMember(owner = "client!ba", name = "E", descriptor = "[J")
    private long[] field187 = new long[10];

    @OriginalMember(owner = "client!ba", name = "C", descriptor = "I")
    private int field185 = 256;

    @OriginalMember(owner = "client!ba", name = "B", descriptor = "I")
    private int field184 = 0;

    @OriginalMember(owner = "client!ba", name = "v", descriptor = "I")
    private int field178 = 1;

    @OriginalMember(owner = "client!ba", name = "y", descriptor = "J")
    private long field181 = class214.method1416(22624);

    @OriginalMember(owner = "client!ba", name = "s", descriptor = "I")
    public static int field175 = 0;

    @OriginalMember(owner = "client!ba", name = "A", descriptor = "Lsg;")
    public static class203 field183 = new class203();

    @OriginalMember(owner = "client!ba", name = "F", descriptor = "[I")
    public static int[] field188 = new int[128];

    @OriginalMember(owner = "client!ba", name = "D", descriptor = "Lsg;")
    public static class203 field186 = new class203();

    @OriginalMember(owner = "client!ba", name = "G", descriptor = "I")
    public static int field189 = 0;

    @OriginalMember(owner = "client!ba", name = "H", descriptor = "Z")
    public static boolean field190 = false;

    @OriginalMember(owner = "client!ba", name = "t", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ba", name = "u", descriptor = "I")
    public static int field177;

    @OriginalMember(owner = "client!ba", name = "w", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
    public static int field180;

    @OriginalMember(owner = "client!ba", name = "z", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(B)V")
    public static void method83(byte arg0) {
        field186 = null;
        if (arg0 > -10) {
            method83((byte) -27);
        }
        field183 = null;
        field188 = null;
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IILmf;)I")
    public static final int method84(int arg0, int arg1, class136 arg2) {
        field177++;
        if (arg2.field2568 == null || arg1 >= arg2.field2568.length) {
            return -2;
        }
        try {
            if (arg0 != -26) {
                field186 = null;
            }
            int var3 = 0;
            int[] var4 = arg2.field2568[arg1];
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var4[var6++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var3;
                }
                if (var7 == 1) {
                    var8 = class44.field944[var4[var6++]];
                }
                if (var7 == 2) {
                    var8 = class246.field4498[var4[var6++]];
                }
                if (var7 == 3) {
                    var8 = class115.field2062[var4[var6++]];
                }
                if (var7 == 4) {
                    int var10 = var4[var6++] << 16;
                    int var11 = var10 + var4[var6++];
                    class136 var12 = class180.method1200(var11, (byte) 111);
                    int var13 = var4[var6++];
                    if (var13 != -1 && (!class223.method1471(-36, var13).field2238 || class168.field3203)) {
                        for (int var14 = 0; var14 < var12.field2538.length; var14++) {
                            if (var13 + 1 == var12.field2538[var14]) {
                                var8 += var12.field2657[var14];
                            }
                        }
                    }
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 5) {
                    var8 = class159.field3011[var4[var6++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 6) {
                    var8 = class85.field1501[class246.field4498[var4[var6++]] - 1];
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 7) {
                    var8 = class159.field3011[var4[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class238.field4382.field2181;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class58.field1093[var15]) {
                            var8 += class246.field4498[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var4[var6++] << 16;
                    int var17 = var16 + var4[var6++];
                    class136 var18 = class180.method1200(var17, (byte) 111);
                    int var19 = var4[var6++];
                    if (var19 != -1 && (!class223.method1471(arg0 - 12, var19).field2238 || class168.field3203)) {
                        for (int var20 = 0; var20 < var18.field2538.length; var20++) {
                            if (var19 + 1 == var18.field2538[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class191.field3571;
                }
                if (var7 == 12) {
                    var8 = class85.field1503;
                }
                if (var7 == 13) {
                    int var21 = class159.field3011[var4[var6++]];
                    int var22 = var4[var6++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var4[var6++];
                    var8 = class236.method1521(-84, var23);
                }
                if (var7 == 18) {
                    var8 = (class238.field4382.field3505 >> 7) + class99.field1735;
                }
                if (var7 == 19) {
                    var8 = (class238.field4382.field3490 >> 7) + class124.field2212;
                }
                if (var7 == 20) {
                    var8 = var4[var6++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var3 += var8;
                    }
                    if (var5 == 1) {
                        var3 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var3 /= var8;
                    }
                    if (var5 == 3) {
                        var3 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(IBI)I")
    public final int method85(int arg0, byte arg1, int arg2) {
        field180++;
        int var4 = this.field185;
        this.field185 = 300;
        int var5 = this.field178;
        int var6 = 48 / ((-arg1 - 49) / 45);
        this.field178 = 1;
        this.field181 = class214.method1416(22624);
        if (this.field187[this.field182] == 0L) {
            this.field185 = var4;
            this.field178 = var5;
        } else if (this.field187[this.field182] < this.field181) {
            this.field185 = (int) ((long) (arg0 * 2560) / (this.field181 - this.field187[this.field182]));
        }
        if (this.field185 < 25) {
            this.field185 = 25;
        }
        if (this.field185 > 256) {
            this.field185 = 256;
            this.field178 = (int) ((long) arg0 - (this.field181 - this.field187[this.field182]) / 10L);
        }
        if (this.field178 > arg0) {
            this.field178 = arg0;
        }
        this.field187[this.field182] = this.field181;
        this.field182 = (this.field182 + 1) % 10;
        if (this.field178 > 1) {
            for (int var7 = 0; var7 < 10; var7++) {
                if (this.field187[var7] != 0L) {
                    this.field187[var7] += this.field178;
                }
            }
        }
        if (arg2 > this.field178) {
            this.field178 = arg2;
        }
        class238.method1548((byte) -80, (long) this.field178);
        int var8 = 0;
        while (this.field184 < 256) {
            var8++;
            this.field184 += this.field185;
        }
        this.field184 &= 0xFF;
        return var8;
    }

    @OriginalMember(owner = "client!ba", name = "<init>", descriptor = "()V")
    public class13() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field187[var1] = this.field181;
        }
    }

    @OriginalMember(owner = "client!ba", name = "a", descriptor = "(I)V")
    public final void method86(int arg0) {
        field179++;
        int var2 = 30 / ((arg0 + 80) / 35);
        for (int var3 = 0; var3 < 10; var3++) {
            this.field187[var3] = 0L;
        }
    }
}
