import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class116 {

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "I")
    public static int field1669 = 0;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field1670;

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field1671;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field1672;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(III)V")
    public static final void method848(int arg0, int arg1, int arg2) {
        field1671++;
        if (arg2 != -325268312) {
            field1669 = 4;
        }
        int var3 = class241.field3845 * arg1 >> 8;
        if (arg0 == -1 && !class195.field3136) {
            class257.method1816(false);
        } else if (arg0 != -1 && (class92.field1372 != arg0 || !class155.method1151(0)) && var3 != 0 && !class195.field3136) {
            class80.method585(2, arg0, class81.field1173, false, var3, 0, true);
        }
        class92.field1372 = arg0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;B)Z")
    public static final boolean method849(String arg0, String arg1, byte arg2) {
        field1672++;
        int var3 = arg0.length();
        int var4 = arg1.length();
        if (var3 < var4) {
            return false;
        }
        for (int var5 = 0; var5 < var4; var5++) {
            char var6 = arg0.charAt(var5);
            char var7 = arg1.charAt(var5);
            if (var6 != var7 && Character.toLowerCase(var6) != Character.toLowerCase(var7) && Character.toUpperCase(var6) != Character.toUpperCase(var7)) {
                return false;
            }
        }
        if (arg2 != 26) {
            field1670 = 115;
        }
        return true;
    }
}
