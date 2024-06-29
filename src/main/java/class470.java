import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class470 extends class287 {

    @OriginalMember(owner = "client!bca", name = "u", descriptor = "I")
    public int field6418 = 0;

    @OriginalMember(owner = "client!bca", name = "w", descriptor = "Lrm;")
    public static class94 field6420 = new class94(0, -1);

    @OriginalMember(owner = "client!bca", name = "y", descriptor = "Lbh;")
    public static class538 field6422 = new class538(64);

    @OriginalMember(owner = "client!bca", name = "A", descriptor = "I")
    public static int field6424 = -1;

    @OriginalMember(owner = "client!bca", name = "t", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!bca", name = "v", descriptor = "I")
    public static int field6419;

    @OriginalMember(owner = "client!bca", name = "x", descriptor = "I")
    public static int field6421;

    @OriginalMember(owner = "client!bca", name = "z", descriptor = "I")
    public static int field6423;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BLvj;)V")
    public final void method2798(byte arg0, class26 arg1) {
        field6421++;
        while (true) {
            int var3 = arg1.method194((byte) 119);
            if (var3 == 0) {
                if (arg0 == 112) {
                    return;
                } else {
                    field6420 = null;
                    return;
                }
            }
            this.method2801((byte) -30, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)V")
    public static void method2799(int arg0) {
        if (arg0 != -1) {
            method2800(-91, 84, null);
        }
        field6420 = null;
        field6422 = null;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IILjava/lang/String;)Z")
    public static final boolean method2800(int arg0, int arg1, String arg2) {
        field6419++;
        if (class379.field5339.field8732) {
            class396.field5504 = new class59();
            class396.field5504.field813 = arg2;
            class396.field5504.field812 = arg1;
            if (class746.field10392 != class456.field6280) {
                class396.field5504.field815 = class396.field5504.field812 + 50000;
                class396.field5504.field820 = class396.field5504.field812 + 40000;
            }
            if (class571.field8083.length > arg1 && class571.field8083[arg1] != null) {
                class59.field814 = class571.field8083[arg1].field5394;
            }
            return true;
        }
        String var3 = "";
        if (class746.field10392 != class456.field6280) {
            var3 = ":" + (arg1 + 7000);
        }
        String var4 = "";
        if (class686.field9626 != null) {
            var4 = "/p=" + class686.field9626;
        }
        String var5 = "http://" + arg2 + var3 + "/l=" + class369.field4721 + "/a=" + class711.field9915 + var4 + "/j" + (class668.field9408 ? "1" : "0") + ",o" + (class72.field1014 ? "1" : "0") + ",a2";
        try {
            class306.field3966.getAppletContext().showDocument(new URL(var5), "_self");
        } catch (Exception var6) {
            return false;
        }
        if (arg0 != -13796) {
            method2800(-88, 41, null);
        }
        return true;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(BLvj;I)V")
    private final void method2801(byte arg0, class26 arg1, int arg2) {
        field6417++;
        int var4 = 24 / ((24 - arg0) / 53);
        if (arg2 == 2) {
            this.field6418 = arg1.method193(2);
        }
    }
}
