import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class426 {

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field6115 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!sj", name = "j", descriptor = "Lwo;")
    public static class690 field6120 = new class690(3, 8);

    @OriginalMember(owner = "client!sj", name = "l", descriptor = "Lfca;")
    public static class75 field6122 = new class75(2);

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field6111;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field6113;

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field6114;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field6116;

    @OriginalMember(owner = "client!sj", name = "h", descriptor = "I")
    public static int field6118;

    @OriginalMember(owner = "client!sj", name = "i", descriptor = "I")
    public static int field6119;

    @OriginalMember(owner = "client!sj", name = "k", descriptor = "I")
    public static int field6121;

    @OriginalMember(owner = "client!sj", name = "m", descriptor = "I")
    public static int field6123;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "Lsj;")
    public class426 field6112;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "Lsj;")
    public class426 field6117;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V")
    public final void method2564(byte arg0) {
        field6114++;
        if (arg0 == 2 && this.field6112 != null) {
            this.field6112.field6117 = this.field6117;
            this.field6117.field6112 = this.field6112;
            this.field6112 = null;
            this.field6117 = null;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IZLjava/lang/String;)Z")
    public static final boolean method2565(int arg0, boolean arg1, String arg2) {
        field6113++;
        if (class517.field7570.field3404) {
            class281.field3813 = new class337();
            class281.field3813.field4476 = arg0;
            class281.field3813.field4480 = arg2;
            if (class39.field729 != class215.field2737) {
                class281.field3813.field4468 = class281.field3813.field4476 + 40000;
                class281.field3813.field4470 = class281.field3813.field4476 + 50000;
            }
            if (class501.field7005.length > arg0 && class501.field7005[arg0] != null) {
                class55.field876 = class501.field7005[arg0].field7791;
            }
            return true;
        }
        String var3 = "";
        if (class39.field729 != class215.field2737) {
            var3 = ":" + (arg0 + 7000);
        }
        String var4 = "";
        if (!arg1) {
            return false;
        }
        if (class190.field2323 != null) {
            var4 = "/p=" + class190.field2323;
        }
        String var5 = "http://" + arg2 + var3 + "/l=" + class370.field4980 + "/a=" + class171.field2092 + var4 + "/j" + (class16.field296 ? "1" : "0") + ",o" + (class16.field298 ? "1" : "0") + ",a2";
        try {
            class683.field9762.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "(I)V")
    public static void method2566(int arg0) {
        field6115 = null;
        field6120 = null;
        if (arg0 != 50) {
            field6123 = 95;
        }
        field6122 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(III)Z")
    public static final boolean method2567(int arg0, int arg1, int arg2) {
        field6116++;
        int var3 = 12 % ((-arg1 - 64) / 45);
        return (arg2 & 0x100) != 0;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(Lte;BI)Z")
    public static final boolean method2568(class568 arg0, byte arg1, int arg2) {
        class423.field6032.method720(arg0.field8306[arg2], arg0.field8303[arg2], arg0.field8310[arg2], class78.field1151);
        field6119++;
        int var3 = class78.field1151[2];
        if (var3 < 50) {
            return false;
        }
        arg0.field8298[arg2] = (short) (class78.field1151[0] * class300.field4040 / var3 + class380.field5094);
        arg0.field8302[arg2] = (short) (class78.field1151[1] * class499.field6985 / var3 + class697.field9873);
        int var4 = 62 / ((-arg1 - 26) / 55);
        arg0.field8309[arg2] = (short) var3;
        return true;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBI)I")
    public static final int method2569(int arg0, byte arg1, int arg2) {
        if (arg1 >= -1) {
            field6121 = 124;
        }
        field6118++;
        int var3 = class120.method835(arg2 + 45365, 4, arg0 + 91923, (byte) 116) + (class120.method835(arg2 + 10294, 2, arg0 + 37821, (byte) 75) - 128 >> 1) + (class120.method835(arg2, 1, arg0, (byte) 81) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }
}
