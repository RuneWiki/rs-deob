import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hu")
public abstract class class472 {

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "I")
    public static int field6996 = 100;

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "I")
    public static int field6997;

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "I")
    public static int field6998;

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(I)Z")
    public abstract boolean method309(int arg0);

    @OriginalMember(owner = "client!hu", name = "b", descriptor = "(I)C")
    public abstract char method306(int arg0);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IZ)V")
    public static final void method2792(int arg0, boolean arg1) {
        field6997++;
        if (class289.field4712 == null || class289.field4712.length < arg0) {
            class289.field4712 = new int[arg0];
        }
        if (arg1) {
            method2793(112, (byte) -53, -128, false);
        }
    }

    @OriginalMember(owner = "client!hu", name = "c", descriptor = "(I)I")
    public abstract int method308(int arg0);

    @OriginalMember(owner = "client!hu", name = "d", descriptor = "(I)J")
    public abstract long method303(int arg0);

    @OriginalMember(owner = "client!hu", name = "a", descriptor = "(IBIZ)I")
    public static final int method2793(int arg0, byte arg1, int arg2, boolean arg3) {
        field6998++;
        class112 var4 = class295.method1888(arg3, arg2, (byte) 109);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            if (arg1 <= 1) {
                method2792(94, false);
            }
            for (int var6 = 0; var6 < var4.field1973.length; var6++) {
                if (var4.field1971[var6] == arg0) {
                    var5 += var4.field1973[var6];
                }
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!hu", name = "e", descriptor = "(I)I")
    public abstract int method304(int arg0);
}
