import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public abstract class class634 {

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "[I")
    public static int[] field8848 = new int[13];

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "I")
    public static int field8849;

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "I")
    public static int field8850;

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "I")
    public static int field8851;

    @OriginalMember(owner = "client!iv", name = "e", descriptor = "I")
    public static int field8852;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(B)V", line = 8)
    public static void method3635(byte arg0) {
        field8848 = null;
        if (arg0 < 8) {
            field8848 = null;
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(IZI)Ljava/lang/String;", line = 18)
    public static final String method3636(int arg0, boolean arg1, int arg2) {
        if (arg2 != 10) {
            method3641((byte) -42);
        }
        field8852++;
        return arg1 && arg0 >= 0 ? class556.method3275(127, arg1, 10, arg0) : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(CI)Z", line = 41)
    public static final boolean method3638(char arg0, int arg1) {
        field8851++;
        int var2 = 59 / ((arg1 - 46) / 63);
        return arg0 >= '0' && arg0 <= '9';
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 51)
    public static final void method3639(String arg0, byte arg1) {
        class704.field9801 = arg0;
        field8849++;
        if (class511.field7007 == null) {
            return;
        }
        try {
            String var2 = class511.field7007.getParameter("cookieprefix");
            String var3 = class511.field7007.getParameter("cookiehost");
            String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
            String var5;
            if (arg0.length() == 0) {
                var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
            } else {
                var5 = var4 + "; Expires=" + class294.method1937(class683.method3903((byte) 4) + 94608000000L, 2) + "; Max-Age=" + 94608000L;
            }
            if (arg1 > 7) {
                class552.method3254("document.cookie=\"" + var5 + "\"", true, class511.field7007);
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)V", line = 87)
    public static final void method3641(byte arg0) {
        field8850++;
        class377.field5424.method194(class221.field3034);
        class377.field5424.method242(class1.field8, class602.field8447, class535.field7398, class391.field5565);
        if (arg0 != -72) {
            method3638((char) 65515, -122);
        }
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public abstract void method3632(int arg0);

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II)Z")
    public abstract boolean method3633(int arg0, int arg1) throws IOException;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(I)V")
    public abstract void method3634(int arg0);

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(II[BB)V")
    public abstract void method3637(int arg0, int arg1, byte[] arg2, byte arg3) throws IOException;

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I[BII)I")
    public abstract int method3640(int arg0, byte[] arg1, int arg2, int arg3) throws IOException;
}
