import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class12 {

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "I")
    public int field139;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "Ljb;")
    public static class519 field140 = new class519(125, 5);

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "I")
    public static int field136;

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "I")
    public static int field137;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public static int field138;

    @OriginalMember(owner = "client!daa", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field138++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(III)Z", line = 13)
    public static final boolean method81(int arg0, int arg1, int arg2) {
        field136++;
        if (arg0 != 55) {
            field140 = null;
        }
        return (arg2 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!daa", name = "<init>", descriptor = "(I)V", line = 26)
    public class12(int arg0) {
        this.field139 = arg0;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(I)V", line = 39)
    public static void method82(int arg0) {
        if (arg0 <= 47) {
            field140 = null;
        }
        field140 = null;
    }

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(IILofa;)Ljava/lang/String;", line = 50)
    public static final String method83(int arg0, int arg1, class347 arg2) {
        field137++;
        if (!client.method2055(arg2).method2116(arg1, 0) && arg2.field4941 == null) {
            return null;
        } else if (arg0 >= -106) {
            return null;
        } else if (arg2.field4983 == null || arg2.field4983.length <= arg1 || arg2.field4983[arg1] == null || arg2.field4983[arg1].trim().length() == 0) {
            return class341.field4764 ? "Hidden-" + arg1 : null;
        } else {
            return arg2.field4983[arg1];
        }
    }
}
