import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class256 extends class149 {

    @OriginalMember(owner = "client!in", name = "R", descriptor = "I")
    private int field3548 = 4096;

    @OriginalMember(owner = "client!in", name = "O", descriptor = "[Ljava/lang/String;")
    public static String[] field3545 = new String[100];

    @OriginalMember(owner = "client!in", name = "J", descriptor = "Lui;")
    public static class375 field3540 = new class375("Loaded world list data", "Liste der Welten geladen", "Liste des serveurs chargée", "Dados da lista de mundos carregados");

    @OriginalMember(owner = "client!in", name = "I", descriptor = "I")
    public static int field3539;

    @OriginalMember(owner = "client!in", name = "K", descriptor = "I")
    public static int field3541;

    @OriginalMember(owner = "client!in", name = "L", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!in", name = "M", descriptor = "I")
    public static int field3543;

    @OriginalMember(owner = "client!in", name = "N", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!in", name = "P", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!in", name = "Q", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(II)[I", line = 4)
    public final int[] method92(int arg0, int arg1) {
        ++field3541;
        if (arg0 != -10835) {
            field3547 = 55;
        }
        int[] var3 = super.field2152.method2891(arg1, (byte) 104);
        if (super.field2152.field7051) {
            int[] var4 = this.method983(0, 24824, arg1 - 1 & class51.field694);
            int[] var5 = this.method983(0, 24824, arg1);
            int[] var6 = this.method983(0, 24824, arg1 + 1 & class51.field694);
            for (int var7 = 0; ~class316.field4838 < ~var7; ++var7) {
                int var8 = (var6[var7] - var4[var7]) * this.field3548;
                int var9 = (var5[class320.field4897 & var7 - -1] + -var5[var7 + -1 & class320.field4897]) * this.field3548;
                int var10 = var9 >> 12;
                int var11 = var8 >> 12;
                int var12 = var10 * var10 >> 12;
                int var13 = var11 * var11 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var13 + 4096 + var12) / 4096.0F)));
                int var15 = var14 == 0 ? 0 : 16777216 / var14;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!in", name = "e", descriptor = "(I)V", line = 61)
    public static final void method1662(int arg0) {
        if (arg0 != 4096) {
            method1666(48);
        }
        ++field3546;
        class423.field6309.method658(arg0 + -4169);
        class398.field6048.method1691((byte) 37);
        class75.field1012.method3032(66);
        class56.field755.method2034((byte) -11);
        class410.field6175.method1218(59);
        class84.field1154.method2443(-8750);
        class260.field3621.method1933((byte) -120);
        class275.field3826.method107(arg0 + -4000);
        class144.field2075.method653(true);
        class513.field7614.method100((byte) 8);
        class186.field2620.method2682((byte) 34);
        class471.field6878.method325(true);
        class237.field3377.method357(arg0 ^ 20108);
        class525.field7770.method269(64);
        class209.field2960.method3084((byte) 92);
        class296.field4391.method392((byte) -76);
        class496.field7258.method1674((byte) -91);
        class64.field896.method2773(true);
        class31.field473.method677(10450);
        class128.field1812.method2664((byte) -70);
        class62.method425((byte) 95);
        class138.method917(1024);
        class403.method2470(-108);
        class494.method2935(126);
        class224.field3158.method1022((byte) -34);
        class302.field4450.method1022((byte) -34);
        class209.field2947.method1022((byte) -34);
        class130.field1894.method1022((byte) -34);
        class291.field4339.method1022((byte) -34);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IBLtl;)V", line = 102)
    public final void method93(int arg0, byte arg1, class91 arg2) {
        ++field3542;
        if (arg0 == 0) {
            this.field3548 = arg2.method631(10494);
        }
        if (arg1 != 35) {
            method1663(54);
        }
    }

    @OriginalMember(owner = "client!in", name = "f", descriptor = "(I)V", line = 115)
    public static void method1663(int arg0) {
        field3545 = null;
        field3540 = null;
        int var1 = -52 / ((arg0 - -53) / 42);
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(II)V", line = 125)
    public static final void method1664(int arg0, int arg1) {
        ++field3543;
        class377 var2 = class99.method672(arg0, false, arg1);
        var2.method2339(-11688);
    }

    @OriginalMember(owner = "client!in", name = "<init>", descriptor = "()V", line = 139)
    public class256() {
        super(1, true);
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Ltl;B)Ld;", line = 145)
    public static final class65 method1665(class91 arg0, byte arg1) {
        if (arg1 < 12) {
            field3540 = null;
        }
        ++field3539;
        return new class65(arg0.method643((byte) 112), arg0.method643((byte) 119), arg0.method643((byte) 120), arg0.method643((byte) 112), arg0.method641(32455), arg0.method618((byte) 100));
    }

    @OriginalMember(owner = "client!in", name = "g", descriptor = "(I)V", line = 156)
    public static final void method1666(int arg0) {
        if (arg0 == 0) {
            class265.field3700 = true;
            ++field3544;
        }
    }
}
