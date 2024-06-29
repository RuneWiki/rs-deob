import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class143 {

    @OriginalMember(owner = "client!fk", name = "l", descriptor = "Lvi;")
    private class560 field1823 = new class560(256);

    @OriginalMember(owner = "client!fk", name = "k", descriptor = "Le;")
    private class479 field1822;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "Lsv;")
    private class312 field1812;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "[Lnb;")
    public static class136[] field1818 = new class136[128];

    @OriginalMember(owner = "client!fk", name = "i", descriptor = "I")
    public static int field1820 = 0;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!fk", name = "j", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!fk", name = "h", descriptor = "Lcb;")
    public static class318 field1819;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public final void method976(int arg0) {
        field1816++;
        if (arg0 != -118989143) {
            this.field1812 = null;
        }
        this.field1823.method3129(5, arg0 + 119003726);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static final void method977(byte arg0) {
        field1817++;
        class606.field8280.method1986(((float) class72.field935.field6533 * 0.1F + 0.7F) * class74.field946);
        int var1 = -92 / ((arg0 - 11) / 63);
        class606.field8280.method1991(class629.field8552, class79.field1006, class509.field6871, (float) (class326.field4750 << 2), (float) (class265.field3638 << 2), (float) (class572.field7918 << 2));
        class606.field8280.method1952(class250.field3380);
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(I)V")
    public static final void method978(int arg0) {
        field1821++;
        class557.field7604 = 0;
        int var1 = (class596.field8164.field3929 >> 9) + class253.field3490;
        int var2 = (class596.field8164.field3917 >> 9) + class186.field2280;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class557.field7604 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class557.field7604 = 1;
        }
        if (class557.field7604 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class557.field7604 = 0;
        }
        if (arg0 > -126) {
            field1820 = -56;
        }
    }

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "(B)V")
    public static void method979(byte arg0) {
        field1818 = null;
        field1819 = null;
        if (arg0 != 121) {
            method979((byte) -39);
        }
    }

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "(I)V")
    public final void method980(int arg0) {
        this.field1823.method3142(false);
        field1814++;
        int var2 = -81 % ((arg0 + 10) / 54);
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ZI)Lsd;")
    public final class595 method981(boolean arg0, int arg1) {
        field1813++;
        Object var3 = this.field1823.method3134((long) arg1, -77);
        if (var3 != null) {
            return (class595) var3;
        }
        if (arg0) {
            method978(-121);
        }
        if (!this.field1822.method1732(arg1, 44)) {
            return null;
        }
        class568 var4 = this.field1822.method1728(-106, arg1);
        int var5 = var4.field7853 ? 64 : this.field1812.field4476;
        class595 var7;
        if (var4.field7851 && this.field1812.method811()) {
            float[] var6 = this.field1822.method1736(arg1, 8171, var5, var5, false, 0.7F);
            var7 = this.field1812.method1998(class420.field5862, var5, var4.field7852 != 0, 106, var6, var5);
        } else {
            int[] var8 = var4.field7868 ? this.field1822.method1734(true, var5, 0.7F, var5, arg1, false) : this.field1822.method1731(true, 0.7F, 26409, var5, var5, arg1);
            var7 = this.field1812.method1974(var5, var5, false, var8, var4.field7852 != 0);
        }
        var7.method169(var4.field7861, (byte) -68, var4.field7854);
        this.field1823.method3130((long) arg1, true, var7);
        return var7;
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lsv;Le;)V")
    public class143(class312 arg0, class479 arg1) {
        this.field1822 = arg1;
        this.field1812 = arg0;
    }

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "(I)V")
    public static final void method982(int arg0) {
        field1815++;
        int var1 = (int) ((double) class588.field8082 * 34.46D);
        int var2 = var1 << 2;
        if (class9.field103.method1903()) {
            var2 += 512;
        }
        class9.field103.method1885(arg0, var2);
    }
}
