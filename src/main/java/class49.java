import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class49 extends InputStream {

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field730;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "I")
    public static int field731;

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field732;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "Lhh;")
    public static class84 field735;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "[Ltn;")
    public static class58[] field733;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I)V", line = 5)
    public static final void method359(int arg0) {
        if (class348.field5285 > 0) {
            int var1 = 0;
            for (int var2 = 0; var2 < class82.field1358.length; var2++) {
                if (class82.field1358[var2].startsWith("--> ")) {
                    int var10000 = ~class348.field5285;
                    var1++;
                    if (var10000 == ~var1) {
                        class41.field633 = class82.field1358[var2].substring(4);
                        break;
                    }
                }
            }
        } else {
            class41.field633 = "";
        }
        if (arg0 != 0) {
            method361((byte) -24);
        }
        field731++;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZZBLcp;ILcp;I)I", line = 45)
    public static final int method360(boolean arg0, boolean arg1, byte arg2, class507 arg3, int arg4, class507 arg5, int arg6) {
        field734++;
        int var7 = class282.method1779(arg3, -17937, arg0, arg4, arg5);
        if (var7 != 0) {
            return arg0 ? -var7 : var7;
        } else if (arg6 == -1) {
            return 0;
        } else {
            int var8 = -58 / ((arg2 + 34) / 46);
            int var9 = class282.method1779(arg3, -17937, arg1, arg6, arg5);
            return arg1 ? -var9 : var9;
        }
    }

    @OriginalMember(owner = "client!sh", name = "read", descriptor = "()I", line = 77)
    public final int read() {
        class185.method1285(125, 30000L);
        field732++;
        return -1;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)V", line = 87)
    public static void method361(byte arg0) {
        field735 = null;
        field733 = null;
        if (arg0 <= 74) {
            field733 = null;
        }
    }
}
