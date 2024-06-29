import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public abstract class class66 {

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "Lrc;")
    public static class108 field966 = new class108(102, 4);

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "I")
    public static int field967 = 0;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field965;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "([BB)V")
    public abstract void method621(byte[] arg0, byte arg1);

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method622(int arg0) {
        field966 = null;
        if (arg0 >= -71) {
            method622(19);
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(II)Lsp;")
    public static final class476 method623(int arg0, int arg1) {
        field965++;
        class476 var2 = (class476) class124.field1682.method917(arg1 ^ 0xFFFF9A2B, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 < 32768) {
            var3 = class112.field1577.method2633(0, arg0, arg1 - 32872);
        } else {
            var3 = class486.field6888.method2633(0, arg0 & 0x7FFF, arg1 ^ 0x7F9B);
        }
        class476 var4 = new class476();
        if (arg1 != 32767) {
            method623(34, 83);
        }
        if (var3 != null) {
            var4.method2819(new class161(var3), arg1 - 32767);
        }
        if (arg0 >= 32768) {
            var4.method2818(32768);
        }
        class124.field1682.method922((long) arg0, 84, var4);
        return var4;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)[B")
    public abstract byte[] method624(byte arg0);
}
