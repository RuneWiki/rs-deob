import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class105 extends class144 {

    @OriginalMember(owner = "client!d", name = "n", descriptor = "[I")
    public int[] field1966;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[I")
    public int[] field1962;

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Z")
    public static boolean field1965 = false;

    @OriginalMember(owner = "client!d", name = "o", descriptor = "I")
    public static int field1967 = 0;

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field1963;

    @OriginalMember(owner = "client!d", name = "l", descriptor = "I")
    public static int field1964;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V", line = 3)
    public static final void method904(int arg0) {
        field1964++;
        int var1 = 111 / ((arg0 + 35) / 58);
        for (class169 var2 = (class169) class378.field5541.method1892(97); var2 != null; var2 = (class169) class378.field5541.method1893((byte) -2)) {
            if (var2.field2742 == -1) {
                var2.field2744 = 0;
                if (var2.field2747 >= 0 && var2.field2756 >= 0 && var2.field2747 < class339.field5099 && var2.field2756 < class484.field7129) {
                    class271.method1713(false, var2);
                }
            } else {
                var2.method1676(true);
            }
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IBI)V", line = 45)
    public static final void method905(int arg0, byte arg1, int arg2) {
        field1963++;
        class18 var3 = class140.method1047(16, arg0, false);
        var3.method122(true);
        if (arg1 != -111) {
            field1965 = true;
        }
        var3.field283 = arg2;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(II[I[I)V", line = 58)
    public class105(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field1966 = arg3;
        this.field1962 = arg2;
    }
}
