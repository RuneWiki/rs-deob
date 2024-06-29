import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class433 extends class264 {

    @OriginalMember(owner = "client!st", name = "V", descriptor = "I")
    private int field6123 = 204;

    @OriginalMember(owner = "client!st", name = "Q", descriptor = "I")
    private int field6119 = 1;

    @OriginalMember(owner = "client!st", name = "R", descriptor = "I")
    private int field6120 = 1;

    @OriginalMember(owner = "client!st", name = "O", descriptor = "Lbc;")
    public static class8 field6117 = new class8(14, 1);

    @OriginalMember(owner = "client!st", name = "W", descriptor = "Lbc;")
    public static class8 field6124 = new class8(15, 4);

    @OriginalMember(owner = "client!st", name = "X", descriptor = "Lbc;")
    public static class8 field6125 = new class8(16, -2);

    @OriginalMember(owner = "client!st", name = "Y", descriptor = "Lbc;")
    public static class8 field6126 = new class8(17, 0);

    @OriginalMember(owner = "client!st", name = "Z", descriptor = "Lbc;")
    public static class8 field6127 = new class8(18, -2);

    @OriginalMember(owner = "client!st", name = "ab", descriptor = "Lbc;")
    public static class8 field6128 = new class8(20, 6);

    @OriginalMember(owner = "client!st", name = "bb", descriptor = "Lbc;")
    public static class8 field6129 = new class8(21, 8);

    @OriginalMember(owner = "client!st", name = "cb", descriptor = "Lbc;")
    public static class8 field6130 = new class8(22, -2);

    @OriginalMember(owner = "client!st", name = "db", descriptor = "Lbc;")
    public static class8 field6131 = new class8(23, 4);

    @OriginalMember(owner = "client!st", name = "eb", descriptor = "Lbc;")
    public static class8 field6132 = new class8(24, -1);

    @OriginalMember(owner = "client!st", name = "fb", descriptor = "[Lbc;")
    private static class8[] field6133 = new class8[32];

    @OriginalMember(owner = "client!st", name = "N", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!st", name = "P", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!st", name = "S", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!st", name = "U", descriptor = "I")
    public static int field6122;

    @OriginalMember(owner = "client!st", name = "hb", descriptor = "I")
    public static int field6135;

    @OriginalMember(owner = "client!st", name = "gb", descriptor = "Lnl;")
    public static class435 field6134;

    static {
        class8[] var0 = class22.method160(0);
        for (int var1 = 0; ~var0.length < ~var1; ++var1) {
            field6133[var0[var1].field60] = var0[var1];
        }
        new class151("Your clan channel has now been enabled!", "Dein Chatraum ist jetzt eingeschaltet.", "Votre canal de clan est activé !", "Seu canal de clã já está ativado!");
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(II)[I", line = 5)
    public final int[] method90(int arg0, int arg1) {
        ++field6116;
        int[] var3 = super.field3808.method958((byte) 56, arg0);
        if (super.field3808.field1732) {
            for (int var4 = 0; ~class478.field6792 < ~var4; ++var4) {
                int var5 = class151.field2084[var4];
                int var6 = class379.field5216[arg0];
                int var7 = this.field6119 * var5 >> 12;
                int var8 = this.field6120 * var6 >> 12;
                int var9 = var5 % (4096 / this.field6119) * this.field6119;
                int var10 = var6 % (4096 / this.field6120) * this.field6120;
                if (~var10 > ~this.field6123) {
                    for (var7 -= var8; var7 < 0; var7 += 4) {
                    }
                    while (var7 > 3) {
                        var7 -= 4;
                    }
                    if (~var7 != -2) {
                        var3[var4] = 0;
                        continue;
                    }
                    if (~var9 > ~this.field6123) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                if (~var9 > ~this.field6123) {
                    int var11;
                    for (var11 = var7 - var8; ~var11 > -1; var11 += 4) {
                    }
                    while (var11 > 3) {
                        var11 -= 4;
                    }
                    if (var11 > 0) {
                        var3[var4] = 0;
                        continue;
                    }
                }
                var3[var4] = 4096;
            }
        }
        if (arg1 != 21034) {
            field6134 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "()V", line = 89)
    public class433() {
        super(0, true);
    }

    @OriginalMember(owner = "client!st", name = "b", descriptor = "(B)V", line = 92)
    public static void method2620(byte arg0) {
        field6134 = null;
        field6132 = null;
        field6128 = null;
        field6127 = null;
        field6124 = null;
        field6131 = null;
        field6133 = null;
        field6117 = null;
        field6125 = null;
        field6126 = null;
        field6130 = null;
        field6129 = null;
        if (arg0 != -102) {
            method2621(96);
        }
    }

    @OriginalMember(owner = "client!st", name = "h", descriptor = "(I)V", line = 117)
    public static final void method2621(int arg0) {
        ++field6121;
        if (!class107.field1498) {
            class303.field4311 = true;
            class107.field1498 = true;
            if (class165.field2399) {
                class91.field1281 = (float) ((int) class91.field1281 + -65 & -128);
            } else {
                class95.field1340 += (-24.0F - class95.field1340) / 2.0F;
            }
            if (arg0 != -128) {
                method2621(99);
            }
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BLkk;I)V", line = 154)
    public final void method7(byte arg0, class161 arg1, int arg2) {
        ++field6118;
        if (arg0 < 31) {
            this.method7((byte) -31, (class161) null, 72);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field6123 = arg1.method1134(-16848);
                }
            } else {
                this.field6120 = arg1.method1172((byte) 63);
            }
        } else {
            this.field6119 = arg1.method1172((byte) 56);
        }
    }
}
