import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class172 extends class80 {

    @OriginalMember(owner = "client!fc", name = "I", descriptor = "I")
    private int field2776 = 585;

    @OriginalMember(owner = "client!fc", name = "J", descriptor = "I")
    public static int field2777;

    @OriginalMember(owner = "client!fc", name = "L", descriptor = "I")
    public static int field2779;

    @OriginalMember(owner = "client!fc", name = "K", descriptor = "I")
    public static int field2778;

    @OriginalMember(owner = "client!fc", name = "M", descriptor = "I")
    public static int field2780;

    @OriginalMember(owner = "client!fc", name = "N", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!fc", name = "O", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(BII)Z")
    public static final boolean method1194(byte arg0, int arg1, int arg2) {
        ++field2780;
        int var3 = -1 / ((arg0 - -29) / 40);
        return ~(arg1 & 16) != -1;
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([Lo;I)V")
    public static final void method1195(class24[] arg0, int arg1) {
        ++field2782;
        class21.field320 = arg0.length;
        client.field3219 = new int[class21.field320 - -10];
        class365.field5333 = new class24[class21.field320 - -10];
        class394.method2453(arg0, 0, class365.field5333, 0, class21.field320);
        for (int var2 = 0; ~class21.field320 < ~var2; ++var2) {
            client.field3219[var2] = class365.field5333[var2].method165();
        }
        if (arg1 > -120) {
            field2779 = -122;
        }
        for (int var3 = class21.field320; ~class365.field5333.length < ~var3; ++var3) {
            client.field3219[var3] = 12;
        }
    }

    @OriginalMember(owner = "client!fc", name = "<init>", descriptor = "()V")
    public class172() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(IILnn;)V")
    public final void method26(int arg0, int arg1, class289 arg2) {
        ++field2778;
        int var4 = -124 % ((arg1 - 28) / 53);
        if (~arg0 == -1) {
            this.field2776 = arg2.method1841((byte) 38);
        }
    }

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field2781;
        if (arg1 != -16828) {
            this.method25(-9, 93);
        }
        int[] var3 = super.field1601.method48(arg0, (byte) 0);
        if (super.field1601.field124) {
            int var4 = class44.field795[arg0];
            for (int var5 = 0; ~class137.field2308 < ~var5; ++var5) {
                int var6 = class460.field6860[var5];
                if (this.field2776 < var6 && ~(4096 - this.field2776) < ~var6 && var4 > -this.field2776 + 2048 && ~var4 > ~(this.field2776 + 2048)) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field2776);
                    var3[var5] = -var10 + 4096;
                } else if (-this.field2776 + 2048 < var6 && var6 < this.field2776 + 2048) {
                    int var11 = var4 + -2048;
                    int var12 = var11 >= 0 ? var11 : -var11;
                    int var13 = var12 - this.field2776;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (-this.field2776 + 2048);
                } else if (var4 >= this.field2776 && ~var4 >= ~(4096 - this.field2776)) {
                    if (~var6 <= ~this.field2776 && -this.field2776 + 4096 >= var6) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 < 0 ? -var15 : var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field2776 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 > -1 ? -var19 : var19;
                    int var21 = var20 - this.field2776;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field2776);
                }
            }
        }
        return var3;
    }

    static {
        new class309("Player ", "Spieler ", "Joueur ", "Jogador ");
        field2777 = 0;
        field2779 = -1;
    }
}
