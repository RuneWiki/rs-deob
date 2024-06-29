import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class330 {

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "Z")
    public boolean field4922 = true;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "Lke;")
    public static class622 field4919 = new class622(54, -1);

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "C")
    private char field4924;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public int field4920;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field4923;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Ljava/lang/String;")
    public String field4921;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Z)V", line = 6)
    public static void method2130(boolean arg0) {
        field4919 = null;
        if (!arg0) {
            method2131((byte) -107, -89, null);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BILjava/lang/String;)Z", line = 16)
    public static final boolean method2131(byte arg0, int arg1, String arg2) {
        field4923++;
        if (class27.field395.field8334) {
            class444.field6319 = new class492();
            class444.field6319.field6989 = arg1;
            class444.field6319.field6987 = arg2;
            if (class256.field3599 != class177.field2704) {
                class444.field6319.field6984 = class444.field6319.field6989 + 50000;
                class444.field6319.field6980 = class444.field6319.field6989 + 40000;
            }
            for (int var3 = 0; var3 < class194.field2859.length; var3++) {
                if (class194.field2859[var3].field2380 == arg1) {
                    class722.field10136 = class194.field2859[var3].field10809;
                }
            }
            return true;
        }
        String var4 = "";
        if (class256.field3599 != class177.field2704) {
            var4 = ":" + (arg1 + 7000);
        }
        String var5 = "";
        if (class491.field6979 != null) {
            var5 = "/p=" + class491.field6979;
        }
        String var6 = "http://" + arg2 + var4 + "/l=" + class526.field7494 + "/a=" + class87.field1139 + var5 + "/j" + (class777.field10722 ? "1" : "0") + ",o" + (class553.field7873 ? "1" : "0") + ",a2";
        try {
            class364.field5270.getAppletContext().showDocument(new URL(var6), "_self");
        } catch (Exception var8) {
            return false;
        }
        int var7 = 22 % ((arg0 + 69) / 44);
        return true;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(BLrv;)V", line = 75)
    public final void method2132(byte arg0, class120 arg1) {
        while (true) {
            int var3 = arg1.method842(2384);
            if (var3 == 0) {
                field4916++;
                if (arg0 != -121) {
                    this.method2132((byte) -37, null);
                    return;
                }
                return;
            }
            this.method2133(var3, arg1, (byte) -34);
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(ILrv;B)V", line = 102)
    private final void method2133(int arg0, class120 arg1, byte arg2) {
        field4918++;
        if (arg0 == 1) {
            this.field4924 = class262.method1721(arg1.method877(-252), -94);
        } else if (arg0 == 2) {
            this.field4920 = arg1.method871(23995);
        } else if (arg0 == 4) {
            this.field4922 = false;
        } else if (arg0 == 5) {
            this.field4921 = arg1.method861(true);
        }
        int var4 = -38 % ((arg2 - 70) / 50);
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)Z", line = 130)
    public final boolean method2134(int arg0) {
        field4917++;
        if (arg0 != -19881) {
            this.field4920 = 110;
        }
        return this.field4924 == 's';
    }
}
