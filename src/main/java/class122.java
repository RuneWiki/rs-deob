import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class122 {

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public int field1650;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "I")
    public int field1651;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public int field1649;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!sg", name = "i", descriptor = "Ljava/lang/String;")
    public static String field1653 = "wave:";

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field1647 = 0;

    @OriginalMember(owner = "client!sg", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1654 = "Loading world list data";

    @OriginalMember(owner = "client!sg", name = "k", descriptor = "I")
    public static int field1655 = 0;

    @OriginalMember(owner = "client!sg", name = "l", descriptor = "Lik;")
    public static class17 field1656 = new class17(16);

    @OriginalMember(owner = "client!sg", name = "m", descriptor = "I")
    public static int field1657 = 0;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!sg", name = "h", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 6)
    public static final void method881(int arg0) {
        class323.method2266(arg0 ^ 0x265);
        class6.method32((byte) 16);
        class248.method1695(120);
        field1646++;
        if (arg0 != 512) {
            field1655 = -95;
        }
        class56.method386((byte) 117);
        class123.method889((byte) -81);
        class201.method1431(arg0 ^ 0x25A);
        class68.method496((byte) -109);
        class307.method2087((byte) 123);
        class315.method2152((byte) -59);
        class202.method1436(5);
        class162.method1168(-5504);
        class187.method1311(true);
        class28.method163(-3);
        class90.method689(-25591);
        class107.method786((byte) 122);
        class7.method39(16);
        class276.method1898((byte) 73);
        class171.method1203(arg0 ^ 0xFFFFA447);
        class266.method1805(-49);
        class125.method908(arg0 - 621);
        class16.field196.method724(0);
        class140.field1918.method724(0);
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(ILbo;)V", line = 43)
    public static final void method882(int arg0, class256 arg1) {
        int var2 = arg1.field3758 - class329.field4966;
        field1648++;
        int var3 = arg1.field3694 * 128 + (arg1.method1653(-1) * 64);
        int var4 = arg1.field3685 * 128 + arg1.method1653(-1) * 64;
        arg1.field3745 += (var3 - arg1.field3745) / var2;
        if (arg1.field3705 == 0) {
            arg1.field3666 = 1024;
        }
        arg1.field3662 = 0;
        arg1.field3679 += (var4 - arg1.field3679) / var2;
        if (arg1.field3705 == 1) {
            arg1.field3666 = 1536;
        }
        if (arg1.field3705 == 2) {
            arg1.field3666 = 0;
        }
        if (arg1.field3705 == 3) {
            arg1.field3666 = 512;
        }
        if (arg0 > -13) {
            field1657 = -125;
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 86)
    public static void method883(int arg0) {
        int var1 = -9 % ((27 - arg0) / 61);
        field1656 = null;
        field1654 = null;
        field1653 = null;
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "()V", line = 106)
    public class122() {
    }

    @OriginalMember(owner = "client!sg", name = "<init>", descriptor = "(Lsg;)V", line = 108)
    public class122(class122 arg0) {
        this.field1650 = arg0.field1650;
        this.field1651 = arg0.field1651;
        this.field1649 = arg0.field1649;
        this.field1645 = arg0.field1645;
    }
}
