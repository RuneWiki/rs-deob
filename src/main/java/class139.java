import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class139 extends class264 {

    @OriginalMember(owner = "client!oq", name = "N", descriptor = "Lch;")
    public static class151 field1924 = new class151("Created gameworld", "Spielwelt erstellt.", "Monde de jeu créé", "Universo de jogo criado");

    @OriginalMember(owner = "client!oq", name = "T", descriptor = "I")
    public static int field1930 = 0;

    @OriginalMember(owner = "client!oq", name = "O", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!oq", name = "P", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!oq", name = "Q", descriptor = "I")
    public static int field1927;

    @OriginalMember(owner = "client!oq", name = "R", descriptor = "I")
    public static int field1928;

    @OriginalMember(owner = "client!oq", name = "S", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "()V")
    public class139() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(IBLnl;)Lgn;")
    public static final class368 method1013(int arg0, byte arg1, class435 arg2) {
        if (arg1 != -128) {
            method1013(-90, (byte) -22, (class435) null);
        }
        ++field1925;
        byte[] var3 = arg2.method2650((byte) -72, arg0);
        return var3 == null ? null : new class368(var3);
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(ICLjava/lang/String;)I")
    public static final int method1014(int arg0, char arg1, String arg2) {
        ++field1926;
        int var3 = 0;
        int var4 = arg2.length();
        if (arg0 < 24) {
            method1015(-64);
        }
        for (int var5 = 0; var5 < var4; ++var5) {
            if (~arg1 == ~arg2.charAt(var5)) {
                ++var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oq", name = "h", descriptor = "(I)V")
    public static void method1015(int arg0) {
        field1924 = null;
        if (arg0 <= 2) {
            method1014(15, '^', (String) null);
        }
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(BII)I")
    private final int method1016(byte arg0, int arg1, int arg2) {
        ++field1928;
        int var4 = arg1 * 57 + arg2;
        if (arg0 != 28) {
            method1013(-117, (byte) 62, (class435) null);
        }
        int var5 = var4 ^ var4 << 1;
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        if (arg1 != 21034) {
            method1013(28, (byte) -77, (class435) null);
        }
        ++field1929;
        int[] var3 = super.field3808.method958((byte) 102, arg0);
        if (super.field3808.field1732) {
            int var4 = class379.field5216[arg0];
            for (int var5 = 0; ~class478.field6792 < ~var5; ++var5) {
                var3[var5] = this.method1016((byte) 28, var4, class151.field2084[var5]) % 4096;
            }
        }
        return var3;
    }
}
