import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class173 {

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "Lll;")
    public class490 field2787 = null;

    @OriginalMember(owner = "client!ql", name = "e", descriptor = "Lla;")
    public class395 field2791 = null;

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "I")
    public static int field2788 = 0;

    @OriginalMember(owner = "client!ql", name = "d", descriptor = "I")
    public static int field2790;

    @OriginalMember(owner = "client!ql", name = "f", descriptor = "I")
    public static int field2792;

    @OriginalMember(owner = "client!ql", name = "g", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!ql", name = "c", descriptor = "J")
    public static long field2789;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILfo;Z)V")
    public static final void method1274(int arg0, class606 arg1, boolean arg2) {
        field2792++;
        if (class222.field3314 >= 50 || arg1 == null || arg1.field8723 == null || arg0 >= arg1.field8723.length || arg1.field8723[arg0] == null) {
            return;
        }
        int var3 = arg1.field8723[arg0][0];
        int var4 = var3 >> 8;
        int var5 = (var3 & 0xF4) >> 5;
        if (arg1.field8723[arg0].length > 1) {
            int var6 = (int) (Math.random() * (double) arg1.field8723[arg0].length);
            if (var6 > 0) {
                var4 = arg1.field8723[arg0][var6];
            }
        }
        int var7 = 256;
        if (arg1.field8700 != null && arg1.field8709 != null) {
            var7 = class410.method2450(arg1.field8700[arg0], arg1.field8709[arg0], false);
        }
        if (arg2) {
            field2789 = -102L;
        }
        if (arg1.field8715) {
            class522.method3076((byte) -112, false, 255, 0, var7, var5, var4);
        } else {
            class542.method3190(var7, 255, 0, true, var5, var4);
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(ILjava/lang/String;I)Z")
    public static final boolean method1275(int arg0, String arg1, int arg2) {
        field2790++;
        if (class653.field9220.field9983) {
            class97.field1450 = new class309();
            class97.field1450.field4294 = arg0;
            class97.field1450.field4286 = arg1;
            if (class554.field8103 != class205.field3174) {
                class97.field1450.field4288 = class97.field1450.field4294 + 50000;
                class97.field1450.field4298 = class97.field1450.field4294 + 40000;
            }
            if (arg0 < class432.field6219.length && class432.field6219[arg0] != null) {
                class548.field8044 = class432.field6219[arg0].field7509;
            }
            return true;
        }
        String var3 = "";
        if (class554.field8103 != class205.field3174) {
            var3 = ":" + (arg0 + 7000);
        }
        if (arg2 != 654776389) {
            method1276(9);
        }
        String var4 = "";
        if (class251.field3625 != null) {
            var4 = "/p=" + class251.field3625;
        }
        String var5 = "http://" + arg1 + var3 + "/l=" + class238.field3511 + "/a=" + class557.field8151 + var4 + "/j" + (class318.field4389 ? "1" : "0") + ",o" + (class522.field7697 ? "1" : "0") + ",a2";
        try {
            class573.field8424.getAppletContext().showDocument(new URL(var5), "_self");
            return true;
        } catch (Exception var6) {
            return false;
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(I)V")
    public static final void method1276(int arg0) {
        if (arg0 == 19566) {
            class314.field4361 = null;
            field2793++;
        }
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lla;)V")
    public class173(class395 arg0) {
        this.field2791 = arg0;
    }

    @OriginalMember(owner = "client!ql", name = "<init>", descriptor = "(Lla;Lll;)V")
    public class173(class395 arg0, class490 arg1) {
        this.field2791 = arg0;
        this.field2787 = arg1;
    }
}
