import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rv")
public class class94 {

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "I")
    public int field1496;

    @OriginalMember(owner = "client!rv", name = "b", descriptor = "I")
    public int field1497;

    @OriginalMember(owner = "client!rv", name = "d", descriptor = "I")
    public int field1499;

    @OriginalMember(owner = "client!rv", name = "f", descriptor = "I")
    public static int field1501;

    @OriginalMember(owner = "client!rv", name = "c", descriptor = "Lpu;")
    public static class522 field1498;

    @OriginalMember(owner = "client!rv", name = "e", descriptor = "Z")
    public boolean field1500;

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(I)V", line = 5)
    public static void method775(int arg0) {
        if (arg0 == 3) {
            field1498 = null;
        }
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IILjava/lang/String;)V", line = 18)
    public static final void method776(int arg0, int arg1, String arg2) {
        field1501++;
        if (arg0 != 11788) {
            method777(-75, -40, -79, null);
        }
        class191 var3 = class6.method38(3, -82, arg1);
        var3.method1285((byte) -1);
        var3.field2752 = arg2;
    }

    @OriginalMember(owner = "client!rv", name = "a", descriptor = "(IIILjava/lang/Class;)V", line = 33)
    public static final void method777(int arg0, int arg1, int arg2, Class arg3) {
        class40 var4 = class153.field2210[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class106 var5 = var4.field671; var5 != null; var5 = var5.field1641) {
            class454 var6 = var5.field1638;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field6524 == arg1 && var6.field6521 == arg2) {
                class583.method3316(var6, false);
                return;
            }
        }
    }
}
