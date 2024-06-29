import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class157 {

    @OriginalMember(owner = "client!wh", name = "k", descriptor = "Z")
    public boolean field2530;

    @OriginalMember(owner = "client!wh", name = "h", descriptor = "I")
    public static int field2527 = -1;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "F")
    public static float field2523;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field2521;

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!wh", name = "g", descriptor = "I")
    public static int field2526;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "Ldk;")
    public class535 field2520;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Ldk;")
    public class535 field2522;

    @OriginalMember(owner = "client!wh", name = "j", descriptor = "Lwia;")
    public static class791 field2529;

    @OriginalMember(owner = "client!wh", name = "i", descriptor = "Z")
    public boolean field2528;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(I)V", line = 9)
    public static void method1200(int arg0) {
        field2529 = null;
        if (arg0 != 40000) {
            field2529 = null;
        }
    }

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "(I)Z", line = 21)
    public final boolean method1201(int arg0) {
        field2524++;
        if (arg0 == 50000) {
            return this.field2528 && !this.field2530;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IILjava/lang/Object;Z)[B", line = 33)
    public static final byte[] method1202(int arg0, int arg1, Object arg2, boolean arg3) {
        field2526++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class538.method3231(arg1, arg0, var4, true);
        } else if (arg2 instanceof class734) {
            class734 var5 = (class734) arg2;
            return var5.method1953(arg0, (byte) 114, arg1);
        } else if (arg3) {
            return null;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V", line = 64)
    public final void method1203(byte arg0) {
        if (this.field2520 != null) {
            this.field2520.method602((byte) 41);
        }
        int var2 = 118 / ((-arg0 - 19) / 59);
        field2521++;
        this.field2528 = false;
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(ILjava/lang/String;I)Z", line = 80)
    public static final boolean method1204(int arg0, String arg1, int arg2) {
        field2525++;
        if (class519.field7328.field6674) {
            class5.field34 = new class63();
            class5.field34.field760 = arg1;
            class5.field34.field763 = arg0;
            if (class622.field8739 != class300.field4326) {
                class5.field34.field767 = class5.field34.field763 + 40000;
                class5.field34.field766 = class5.field34.field763 + 50000;
            }
            for (int var3 = 0; var3 < class386.field5355.length; var3++) {
                if (class386.field5355[var3].field3170 == arg0) {
                    class425.field5804 = class386.field5355[var3].field7399;
                }
            }
            return true;
        }
        String var4 = "";
        if (class622.field8739 != class300.field4326) {
            var4 = ":" + (arg0 + 7000);
        }
        if (arg2 != 50000) {
            method1204(-122, null, 63);
        }
        String var5 = "";
        if (class357.field5022 != null) {
            var5 = "/p=" + class357.field5022;
        }
        String var6 = "http://" + arg1 + var4 + "/l=" + class140.field2081 + "/a=" + class467.field6560 + var5 + "/j" + (class685.field9515 ? "1" : "0") + ",o" + (class22.field367 ? "1" : "0") + ",a2";
        try {
            class256.field3768.getAppletContext().showDocument(new URL(var6), "_self");
            return true;
        } catch (Exception var7) {
            return false;
        }
    }

    @OriginalMember(owner = "client!wh", name = "<init>", descriptor = "(Z)V", line = 139)
    public class157(boolean arg0) {
        this.field2530 = arg0;
    }
}
