import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class382 implements class450 {

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "Lvd;")
    private class39 field5753;

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "Ljv;")
    public class80 field5757;

    @OriginalMember(owner = "client!aha", name = "j", descriptor = "[C")
    public static char[] field5762 = new char[] { '€', '\u0000', '‚', 'ƒ', '„', '…', '†', '‡', 'ˆ', '‰', 'Š', '‹', 'Œ', '\u0000', 'Ž', '\u0000', '\u0000', '‘', '’', '“', '”', '•', '–', '—', '˜', '™', 'š', '›', 'œ', '\u0000', 'ž', 'Ÿ' };

    @OriginalMember(owner = "client!aha", name = "i", descriptor = "Lhe;")
    public static class372 field5761 = new class372(8);

    @OriginalMember(owner = "client!aha", name = "l", descriptor = "Lqe;")
    public static class469 field5764 = new class469(45, -1);

    @OriginalMember(owner = "client!aha", name = "m", descriptor = "F")
    public static float field5765;

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "I")
    public static int field5754;

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "I")
    public static int field5756;

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "I")
    public static int field5758;

    @OriginalMember(owner = "client!aha", name = "g", descriptor = "I")
    public static int field5759;

    @OriginalMember(owner = "client!aha", name = "h", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!aha", name = "k", descriptor = "I")
    public static int field5763;

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "Lpga;")
    public class536 field5755;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)Z")
    public final boolean method1251(int arg0) {
        if (arg0 != -24346) {
            field5762 = null;
        }
        field5754++;
        return this.field5753.method208(this.field5757.field1126, (byte) 70);
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IZ)V")
    public void method1249(int arg0, boolean arg1) {
        if (arg0 != 7620) {
            field5765 = -1.904113F;
        }
        if (arg1) {
            int var3 = this.field5757.field1127.method3778(class291.field4165, this.field5755.method1504(), false) + this.field5757.field1135;
            int var4 = this.field5757.field1129.method4065((byte) -127, this.field5755.method1514(), class344.field4988) + this.field5757.field1125;
            this.field5755.method3142(var3, var4);
        }
        field5758++;
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(I)V")
    public final void method1253(int arg0) {
        if (arg0 != 27444) {
            method2459(114, true);
        }
        field5760++;
        this.field5755 = class355.method2222(this.field5757.field1126, this.field5753, (byte) -55);
    }

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "(IZ)V")
    public static final void method2459(int arg0, boolean arg1) {
        field5759++;
        class691.field9555 = arg0;
        class79.field1102.method809(true);
        if (arg1) {
            field5764 = null;
        }
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(B)V")
    public static void method2460(byte arg0) {
        field5762 = null;
        field5761 = null;
        int var1 = -19 / ((92 - arg0) / 32);
        field5764 = null;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(II)V")
    public static final void method2461(int arg0, int arg1) {
        int var2 = 79 / ((-arg0 - 44) / 42);
        field5756++;
        class150 var3 = class676.method3885(1000, 9, arg1);
        var3.method1115(true);
    }

    @OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Lvd;Ljv;)V")
    public class382(class39 arg0, class80 arg1) {
        this.field5753 = arg0;
        this.field5757 = arg1;
    }
}
