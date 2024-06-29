import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class294 {

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "I")
    public int field4650;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field4641 = 0;

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field4642 = 0;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field4647 = -1;

    @OriginalMember(owner = "client!mg", name = "k", descriptor = "I")
    public static int field4651 = 0;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "I")
    public static int field4649 = -1;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public int field4643;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public static int field4644;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public int field4648;

    @OriginalMember(owner = "client!mg", name = "l", descriptor = "I")
    public int field4652;

    @OriginalMember(owner = "client!mg", name = "m", descriptor = "I")
    public static int field4653;

    @OriginalMember(owner = "client!mg", name = "n", descriptor = "I")
    public static int field4654;

    @OriginalMember(owner = "client!mg", name = "s", descriptor = "I")
    public static int field4659;

    @OriginalMember(owner = "client!mg", name = "x", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!mg", name = "r", descriptor = "Loh;")
    public class248 field4658;

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "[I")
    public int[] field4645;

    @OriginalMember(owner = "client!mg", name = "o", descriptor = "[I")
    public int[] field4655;

    @OriginalMember(owner = "client!mg", name = "p", descriptor = "[I")
    public int[] field4656;

    @OriginalMember(owner = "client!mg", name = "t", descriptor = "[I")
    public int[] field4660;

    @OriginalMember(owner = "client!mg", name = "u", descriptor = "[I")
    public int[] field4661;

    @OriginalMember(owner = "client!mg", name = "v", descriptor = "[I")
    public int[] field4662;

    @OriginalMember(owner = "client!mg", name = "w", descriptor = "[Loh;")
    public class248[] field4663;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "[[I")
    public int[][] field4646;

    @OriginalMember(owner = "client!mg", name = "q", descriptor = "[[I")
    public int[][] field4657;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(BLbc;)V")
    public static final void method1964(byte arg0, class282 arg1) {
        if (arg0 < -114) {
            field4659++;
            class63.field745 = arg1;
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(Z)V")
    public static final void method1965(boolean arg0) {
        class233.field3367 = null;
        if (!arg0) {
            return;
        }
        class165.field2367 = null;
        class273.field4041 = null;
        class91.field1236 = null;
        class296.field4677 = null;
        field4664++;
        class277.field4210 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "([BZ)V")
    private final void method1966(byte[] arg0, boolean arg1) {
        field4653++;
        class216 var3 = new class216(class50.method302(arg0, -2));
        int var4 = var3.method1407(123);
        if (var4 != 5 && var4 != 6) {
            throw new RuntimeException();
        }
        if (var4 < 6) {
            this.field4643 = 0;
        } else {
            this.field4643 = var3.method1358(95);
        }
        int var5 = var3.method1407(107);
        this.field4652 = var3.method1380(arg1);
        this.field4655 = new int[this.field4652];
        int var6 = 0;
        int var7 = -1;
        for (int var8 = 0; var8 < this.field4652; var8++) {
            this.field4655[var8] = var6 += var3.method1380(true);
            if (this.field4655[var8] > var7) {
                var7 = this.field4655[var8];
            }
        }
        this.field4648 = var7 + 1;
        this.field4646 = new int[this.field4648][];
        this.field4656 = new int[this.field4648];
        this.field4660 = new int[this.field4648];
        this.field4645 = new int[this.field4648];
        this.field4661 = new int[this.field4648];
        if (var5 != 0) {
            this.field4662 = new int[this.field4648];
            for (int var9 = 0; var9 < this.field4648; var9++) {
                this.field4662[var9] = -1;
            }
            for (int var10 = 0; var10 < this.field4652; var10++) {
                this.field4662[this.field4655[var10]] = var3.method1358(99);
            }
            this.field4658 = new class248(this.field4662);
        }
        for (int var11 = 0; var11 < this.field4652; var11++) {
            this.field4660[this.field4655[var11]] = var3.method1358(57);
        }
        for (int var12 = 0; var12 < this.field4652; var12++) {
            this.field4661[this.field4655[var12]] = var3.method1358(59);
        }
        for (int var13 = 0; var13 < this.field4652; var13++) {
            this.field4645[this.field4655[var13]] = var3.method1380(true);
        }
        for (int var14 = 0; var14 < this.field4652; var14++) {
            int var21 = 0;
            int var22 = -1;
            int var23 = this.field4655[var14];
            int var24 = this.field4645[var23];
            this.field4646[var23] = new int[var24];
            for (int var25 = 0; var25 < var24; var25++) {
                int var26 = this.field4646[var23][var25] = var21 += var3.method1380(arg1);
                if (var26 > var22) {
                    var22 = var26;
                }
            }
            this.field4656[var23] = var22 + 1;
            if (var22 + 1 == var24) {
                this.field4646[var23] = null;
            }
        }
        if (var5 == 0) {
            return;
        }
        this.field4657 = new int[var7 + 1][];
        this.field4663 = new class248[var7 + 1];
        for (int var15 = 0; var15 < this.field4652; var15++) {
            int var16 = this.field4655[var15];
            int var17 = this.field4645[var16];
            this.field4657[var16] = new int[this.field4656[var16]];
            for (int var18 = 0; var18 < this.field4656[var16]; var18++) {
                this.field4657[var16][var18] = -1;
            }
            for (int var19 = 0; var19 < var17; var19++) {
                int var20;
                if (this.field4646[var16] == null) {
                    var20 = var19;
                } else {
                    var20 = this.field4646[var16][var19];
                }
                this.field4657[var16][var20] = var3.method1358(104);
            }
            this.field4663[var16] = new class248(this.field4657[var16]);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(B)V")
    public static final void method1967(byte arg0) {
        class82.field1116.method67((byte) -120);
        class104.field1408.method67((byte) -122);
        field4654++;
        int var1 = -70 % (arg0 / 47);
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(III)I")
    public static final int method1968(int arg0, int arg1, int arg2) {
        field4644++;
        int var3 = arg1 + arg2 & arg0 >> 31;
        return ((arg0 >>> 31) + arg0) % arg2 + var3;
    }

    @OriginalMember(owner = "client!mg", name = "<init>", descriptor = "([BI)V")
    public class294(byte[] arg0, int arg1) {
        this.field4650 = class64.method389(arg0.length, arg0, -32344);
        if (this.field4650 != arg1) {
            throw new RuntimeException();
        }
        this.method1966(arg0, true);
    }
}
