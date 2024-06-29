import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class196 extends class101 {

    @OriginalMember(owner = "client!ch", name = "m", descriptor = "I")
    public static int field2946;

    @OriginalMember(owner = "client!ch", name = "n", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ch", name = "p", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ch", name = "q", descriptor = "I")
    public static int field2950;

    @OriginalMember(owner = "client!ch", name = "r", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ch", name = "s", descriptor = "I")
    public static int field2952;

    @OriginalMember(owner = "client!ch", name = "t", descriptor = "I")
    public static int field2953;

    @OriginalMember(owner = "client!ch", name = "u", descriptor = "I")
    public static int field2954;

    @OriginalMember(owner = "client!ch", name = "v", descriptor = "J")
    public long field2955;

    @OriginalMember(owner = "client!ch", name = "o", descriptor = "Lch;")
    public class196 field2948;

    @OriginalMember(owner = "client!ch", name = "w", descriptor = "Lch;")
    public class196 field2956;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Llm;Z)V", line = 4)
    public static final void method1349(class210 arg0, boolean arg1) {
        field2946++;
        if (!arg1) {
            field2949 = -83;
        }
        class22.field291 = arg0;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(II)V", line = 17)
    public static final void method1350(int arg0, int arg1) {
        if (arg0 != 23881) {
            method1352((byte) -76, -118, (String) null);
        }
        field2952++;
        if (class54.field682 == 0) {
            class54.field673.method2014((byte) 27, arg1);
        } else {
            class307.field4683 = arg1;
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(IZ)Z", line = 36)
    public static final boolean method1351(int arg0, boolean arg1) {
        field2951++;
        class178 var2 = class205.method1410(arg0, 2586);
        if (var2 == null) {
            return false;
        } else if (class262.field3960 == 1 || class262.field3960 == 2 || class252.field3769 == 2) {
            class258.field3921 = var2.field2643;
            class283.field4286 = var2.field2639;
            if (class252.field3769 != 0) {
                class207.field3130 = class258.field3921 + 40000;
                class41.field498 = class258.field3921 + 50000;
                class302.field4614 = class207.field3130;
            }
            return true;
        } else {
            if (arg1) {
                field2949 = 111;
            }
            String var3 = "";
            String var4 = "";
            if (class252.field3769 != 0) {
                var3 = ":" + (var2.field2643 + 7000);
            }
            if (class171.field2569 != null) {
                var4 = "/p=" + class171.field2569;
            }
            String var5 = "http://" + var2.field2639 + var3 + "/l=" + class256.field3882 + "/a=" + class5.field24 + var4 + "/j" + (class49.field624 ? "1" : "0") + ",o" + (class194.field2908 ? "1" : "0") + ",a2,m" + (class176.field2610 ? "1" : "0");
            try {
                class142.field2150.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var7) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(BILjava/lang/String;)I", line = 85)
    public static final int method1352(byte arg0, int arg1, String arg2) {
        if (arg0 < 124) {
            method1351(-78, false);
        }
        field2950++;
        return class55.method367(true, 28637, arg1, arg2);
    }

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "(I)V", line = 107)
    public final void method1353(int arg0) {
        field2953++;
        if (this.field2956 == null) {
            return;
        }
        if (arg0 != 29792) {
            this.field2956 = (class196) null;
        }
        this.field2956.field2948 = this.field2948;
        this.field2948.field2956 = this.field2956;
        this.field2948 = null;
        this.field2956 = null;
    }

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(ILlm;Llm;)V", line = 128)
    public static final void method1354(int arg0, class210 arg1, class210 arg2) {
        class101.field1596 = arg1;
        class311.field4729 = arg2;
        field2947++;
        class101.field1596.method1464((byte) 64, 34);
        int var3 = (int) (Math.random() * 21.0D) - 10;
        int var4 = -36 % ((arg0 + 57) / 32);
        int var5 = (int) (Math.random() * 21.0D) - 10;
        int var6 = (int) (Math.random() * 21.0D) - 10;
        int var7 = (int) (Math.random() * 41.0D) - 20;
        class197.field2959 = var3 + var7;
        class10.field103 = var6 + var7;
        class120.field1886 = var5 + var7;
    }
}
