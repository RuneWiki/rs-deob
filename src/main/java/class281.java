import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wha")
public abstract class class281 {

    @OriginalMember(owner = "client!wha", name = "c", descriptor = "[Liaa;")
    public static class494[] field3999 = new class494[14];

    @OriginalMember(owner = "client!wha", name = "d", descriptor = "I")
    public static int field4000 = 0;

    @OriginalMember(owner = "client!wha", name = "e", descriptor = "[I")
    public static int[] field4001 = new int[5];

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "I")
    public static int field3997;

    @OriginalMember(owner = "client!wha", name = "b", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(B)V")
    public static void method1845(byte arg0) {
        field3999 = null;
        field4001 = null;
        if (arg0 != 17) {
            field4000 = 19;
        }
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IZI)[B")
    public abstract byte[] method1846(int arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IBI)Z")
    public static final boolean method1847(int arg0, byte arg1, int arg2) {
        field3997++;
        if (arg1 != -65) {
            method1847(-85, (byte) 114, -2);
        }
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I[B)V")
    public abstract void method1848(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(I)[B")
    public abstract byte[] method1849(int arg0);

    @OriginalMember(owner = "client!wha", name = "a", descriptor = "(IIILlv;Llv;)V")
    public static final void method1850(int arg0, int arg1, int arg2, class444 arg3, class444 arg4) {
        class165 var5 = class307.method2008(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        var5.field2269 = arg3;
        var5.field2265 = arg4;
        int var6 = class459.field6474 == class135.field1969 ? 1 : 0;
        if (!arg3.method746(-122)) {
            arg3.field1251 = class321.field4433[var6];
            class321.field4433[var6] = arg3;
        } else if (arg3.method751(false)) {
            arg3.field1251 = class373.field5234[var6];
            class373.field5234[var6] = arg3;
        } else {
            arg3.field1251 = class710.field9861[var6];
            class710.field9861[var6] = arg3;
            class230.field3098 = true;
        }
        if (arg4 == null) {
            return;
        }
        if (arg4.method746(-107)) {
            if (arg4.method751(false)) {
                arg4.field1251 = class373.field5234[var6];
                class373.field5234[var6] = arg4;
                return;
            }
            arg4.field1251 = class710.field9861[var6];
            class710.field9861[var6] = arg4;
            class230.field3098 = true;
            return;
        }
        arg4.field1251 = class321.field4433[var6];
        class321.field4433[var6] = arg4;
    }
}
