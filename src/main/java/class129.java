import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class129 {

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Lvh;")
    private class328 field1777 = new class328(64);

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "Lpj;")
    private class132 field1776;

    @OriginalMember(owner = "client!mr", name = "f", descriptor = "Lpj;")
    private class132 field1780;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "J")
    public static long field1775 = 0L;

    @OriginalMember(owner = "client!mr", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1779 = new String[200];

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field1778;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V", line = 4)
    public static void method904(byte arg0) {
        int var1 = -57 / ((-arg0 - 19) / 44);
        field1779 = null;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IB)Lvq;", line = 34)
    public final class424 method905(int arg0, byte arg1) {
        field1778++;
        class424 var3 = (class424) this.field1777.method1986((byte) -125, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 < 32768) {
            var4 = this.field1776.method940(0, arg0, 0);
        } else {
            var4 = this.field1780.method940(0, arg0 & 0x7FFF, 0);
        }
        if (arg1 != -65) {
            this.method905(119, (byte) 30);
        }
        class424 var5 = new class424();
        if (var4 != null) {
            var5.method2410((byte) 91, new class96(var4));
        }
        if (arg0 >= 32768) {
            var5.method2409(arg1 - 37);
        }
        this.field1777.method1985(var5, (long) arg0, (byte) -102);
        return var5;
    }

    @OriginalMember(owner = "client!mr", name = "<init>", descriptor = "(ILpj;Lpj;)V", line = 72)
    public class129(int arg0, class132 arg1, class132 arg2) {
        this.field1776 = arg1;
        this.field1780 = arg2;
        if (this.field1776 != null) {
            this.field1776.method936(0, -121);
        }
        if (this.field1780 != null) {
            this.field1780.method936(0, -110);
        }
    }
}
