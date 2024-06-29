import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class109 extends class55 {

    @OriginalMember(owner = "client!er", name = "v", descriptor = "Z")
    public boolean field1454;

    @OriginalMember(owner = "client!er", name = "t", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "client!er", name = "q", descriptor = "I")
    public int field1449;

    @OriginalMember(owner = "client!er", name = "o", descriptor = "I")
    public int field1447;

    @OriginalMember(owner = "client!er", name = "k", descriptor = "I")
    public int field1443;

    @OriginalMember(owner = "client!er", name = "p", descriptor = "I")
    public int field1448;

    @OriginalMember(owner = "client!er", name = "u", descriptor = "Lea;")
    public static class547 field1453 = new class547(66, 1);

    @OriginalMember(owner = "client!er", name = "l", descriptor = "I")
    public static int field1444;

    @OriginalMember(owner = "client!er", name = "m", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!er", name = "n", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!er", name = "r", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!er", name = "s", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!er", name = "w", descriptor = "I")
    public static int field1455;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Lef;I)I", line = 11)
    public static final int method736(class488 arg0, int arg1) {
        int var2 = -102 % ((-arg1 - 28) / 60);
        field1444++;
        if (class71.field769 == arg0) {
            return 5890;
        } else if (class293.field3928 == arg0) {
            return 34167;
        } else if (class547.field7717 == arg0) {
            return 34168;
        } else if (class421.field5897 == arg0) {
            return 34166;
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Z)V", line = 37)
    public static void method737(boolean arg0) {
        if (arg0) {
            method737(false);
        }
        field1453 = null;
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V", line = 48)
    public static final void method738(int arg0) {
        field1445++;
        if (class713.field9949 == 9) {
            class237.method1429(5, false);
        } else if (class713.field9949 == 5 || class713.field9949 == 6) {
            class237.method1429(3, false);
        } else if (class713.field9949 == 12) {
            class237.method1429(3, false);
        }
        if (arg0 != 27089) {
            method738(-66);
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(IILjava/lang/String;)Z", line = 82)
    public static final boolean method739(int arg0, int arg1, String arg2) {
        field1451++;
        if (class287.field3823.field10290) {
            class294.field3941 = new class564();
            class294.field3941.field7975 = arg2;
            class294.field3941.field7967 = arg1;
            if (class61.field673 != class200.field2376) {
                class294.field3941.field7969 = class294.field3941.field7967 + 50000;
                class294.field3941.field7974 = class294.field3941.field7967 + 40000;
            }
            if (class688.field9635.length > arg1 && class688.field9635[arg1] != null) {
                class392.field5551 = class688.field9635[arg1].field695;
            }
            return true;
        }
        String var3 = "";
        if (class61.field673 != class200.field2376) {
            var3 = ":" + (arg1 + 7000);
        }
        String var4 = "";
        if (class734.field10237 != null) {
            var4 = "/p=" + class734.field10237;
        }
        String var5 = "http://" + arg2 + var3 + "/l=" + class723.field10095 + "/a=" + class586.field8204 + var4 + "/j" + (class584.field8175 ? "1" : "0") + ",o" + (class494.field6735 ? "1" : "0") + ",a2";
        if (arg0 != -8804) {
            method737(false);
        }
        try {
            class58.field623.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!er", name = "<init>", descriptor = "(IIIIIZ)V", line = 129)
    public class109(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field1454 = arg5;
        this.field1452 = arg0;
        this.field1449 = arg3;
        this.field1447 = arg2;
        this.field1443 = arg4;
        this.field1448 = arg1;
    }
}
