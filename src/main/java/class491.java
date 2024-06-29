import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class491 {

    @OriginalMember(owner = "client!np", name = "b", descriptor = "Lfc;")
    private class262 field6701 = new class262(64);

    @OriginalMember(owner = "client!np", name = "e", descriptor = "Lni;")
    private class522 field6704;

    @OriginalMember(owner = "client!np", name = "g", descriptor = "Lni;")
    private class522 field6706;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "[I")
    public static int[] field6700 = new int[5];

    @OriginalMember(owner = "client!np", name = "d", descriptor = "I")
    public static int field6703 = 0;

    @OriginalMember(owner = "client!np", name = "c", descriptor = "J")
    public static long field6702 = 20000000L;

    @OriginalMember(owner = "client!np", name = "f", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!np", name = "h", descriptor = "Lni;")
    public static class522 field6707;

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(B)V")
    public static void method2754(byte arg0) {
        if (arg0 == -102) {
            field6707 = null;
            field6700 = null;
        }
    }

    @OriginalMember(owner = "client!np", name = "a", descriptor = "(II)Law;")
    public final class77 method2755(int arg0, int arg1) {
        field6705++;
        class77 var3 = (class77) this.field6701.method1571(-124, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field6706.method2885(arg1 & 0x7FFF, 0, false);
        } else {
            var4 = this.field6704.method2885(arg1, 0, false);
        }
        class77 var5 = new class77();
        if (arg0 != 28559) {
            return null;
        }
        if (var4 != null) {
            var5.method573(new class611(var4), true);
        }
        if (arg1 >= 32768) {
            var5.method572(arg0 ^ 0xEF8F);
        }
        this.field6701.method1574((long) arg1, var5, (byte) -80);
        return var5;
    }

    @OriginalMember(owner = "client!np", name = "<init>", descriptor = "(ILni;Lni;)V")
    public class491(int arg0, class522 arg1, class522 arg2) {
        this.field6704 = arg1;
        this.field6706 = arg2;
        if (this.field6704 != null) {
            this.field6704.method2901(0, 0);
        }
        if (this.field6706 != null) {
            this.field6706.method2901(0, 0);
        }
    }
}
