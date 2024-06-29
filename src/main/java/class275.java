import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class275 {

    @OriginalMember(owner = "client!li", name = "j", descriptor = "I")
    private int field4828 = 0;

    @OriginalMember(owner = "client!li", name = "b", descriptor = "Lge;")
    private class69 field4820;

    @OriginalMember(owner = "client!li", name = "e", descriptor = "Lpj;")
    private static class237 field4823 = class33.method353("yellow:", 75);

    @OriginalMember(owner = "client!li", name = "h", descriptor = "Lpj;")
    public static class237 field4826 = field4823;

    @OriginalMember(owner = "client!li", name = "i", descriptor = "I")
    public static int field4827 = -1;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "[I")
    public static int[] field4819 = new int[5];

    @OriginalMember(owner = "client!li", name = "k", descriptor = "J")
    public static long field4829 = 0L;

    @OriginalMember(owner = "client!li", name = "c", descriptor = "Lpj;")
    public static class237 field4821 = field4823;

    @OriginalMember(owner = "client!li", name = "f", descriptor = "I")
    public static int field4824;

    @OriginalMember(owner = "client!li", name = "g", descriptor = "I")
    public static int field4825;

    @OriginalMember(owner = "client!li", name = "m", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!li", name = "n", descriptor = "I")
    public static int field4832;

    @OriginalMember(owner = "client!li", name = "o", descriptor = "I")
    public static int field4833;

    @OriginalMember(owner = "client!li", name = "p", descriptor = "I")
    public static int field4834;

    @OriginalMember(owner = "client!li", name = "q", descriptor = "I")
    public static int field4835;

    @OriginalMember(owner = "client!li", name = "l", descriptor = "Llk;")
    private class81 field4830;

    @OriginalMember(owner = "client!li", name = "d", descriptor = "[I")
    public static int[] field4822;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(ILie;)V")
    public static final void method1870(int arg0, class32 arg1) {
        field4831++;
        int var2 = arg1.method303(16);
        class202.field3470 = new class27[var2];
        for (int var3 = 0; var3 < var2; var3++) {
            class202.field3470[var3] = new class27();
            class202.field3470[var3].field492 = arg1.method303(41);
            class202.field3470[var3].field486 = arg1.method312((byte) -95);
        }
        class31.field620 = arg1.method303(17);
        class190.field3308 = arg1.method303(-100);
        class193.field3338 = arg1.method303(-127);
        class81.field1521 = new class122[class190.field3308 + 1 - class31.field620];
        for (int var4 = 0; var4 < class193.field3338; var4++) {
            int var5 = arg1.method303(-97);
            class122 var6 = class81.field1521[var5] = new class122();
            var6.field3129 = arg1.method316((byte) -69);
            var6.field3134 = arg1.method319((byte) -18);
            var6.field2157 = class31.field620 + var5;
            var6.field2149 = arg1.method312((byte) 124);
            var6.field2155 = arg1.method312((byte) 121);
        }
        if (arg0 != -25949) {
            method1873((byte) 56, -61);
        }
        class170.field2987 = arg1.method319((byte) -18);
        class270.field4620 = true;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(B)Llk;")
    public final class81 method1871(byte arg0) {
        int var2 = -102 % ((34 - arg0) / 43);
        field4832++;
        this.field4828 = 0;
        return this.method1872(9361);
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(I)Llk;")
    public final class81 method1872(int arg0) {
        field4824++;
        if (this.field4828 > 0 && this.field4820.field1363[this.field4828 - 1] != this.field4830) {
            class81 var2 = this.field4830;
            this.field4830 = var2.field1527;
            return var2;
        }
        while (this.field4828 < this.field4820.field1365) {
            class81 var3 = this.field4820.field1363[this.field4828++].field1527;
            if (this.field4820.field1363[this.field4828 - 1] != var3) {
                this.field4830 = var3.field1527;
                return var3;
            }
        }
        return arg0 == 9361 ? null : null;
    }

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(BI)I")
    public static final int method1873(byte arg0, int arg1) {
        field4835++;
        return arg0 < 60 ? 59 : arg1 >> 18 & 0x7;
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(B)V")
    public static void method1874(byte arg0) {
        field4823 = null;
        field4822 = null;
        field4821 = null;
        if (arg0 != 78) {
            method1870(-97, (class32) null);
        }
        field4819 = null;
        field4826 = null;
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lge;)V")
    public class275(class69 arg0) {
        this.field4820 = arg0;
    }
}
