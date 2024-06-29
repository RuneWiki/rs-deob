import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vi")
public class class6 {

    @OriginalMember(owner = "client!vi", name = "c", descriptor = "B")
    public static byte field76;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "I")
    public static int field74;

    @OriginalMember(owner = "client!vi", name = "b", descriptor = "I")
    public static int field75;

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(BILik;)Lvd;", line = 18)
    public static final class135 method37(byte arg0, int arg1, class262 arg2) {
        field74++;
        if (class25.method168(-12, arg2, arg1)) {
            if (arg0 != 35) {
                method38(-13, 54, -110);
            }
            return class55.method386(arg0 ^ 0xDC);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!vi", name = "a", descriptor = "(III)Lal;", line = 40)
    public static final class326 method38(int arg0, int arg1, int arg2) {
        class74 var3 = class99.field1759[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field1119; var4++) {
            class326 var5 = var3.field1118[var4];
            if ((var5.field5563 >> 29 & 0x3L) == 2L && var5.field5575 == arg1 && var5.field5576 == arg2) {
                return var5;
            }
        }
        return null;
    }
}
