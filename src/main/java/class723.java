import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class723 {

    @OriginalMember(owner = "client!sfa", name = "e", descriptor = "Lmw;")
    public static class517 field9818 = new class517(3, 3);

    @OriginalMember(owner = "client!sfa", name = "i", descriptor = "I")
    public static int field9822 = 0;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "I")
    public int field9814;

    @OriginalMember(owner = "client!sfa", name = "b", descriptor = "I")
    public int field9815;

    @OriginalMember(owner = "client!sfa", name = "c", descriptor = "I")
    public static int field9816;

    @OriginalMember(owner = "client!sfa", name = "d", descriptor = "I")
    public int field9817;

    @OriginalMember(owner = "client!sfa", name = "f", descriptor = "I")
    public static int field9819;

    @OriginalMember(owner = "client!sfa", name = "g", descriptor = "I")
    public static int field9820;

    @OriginalMember(owner = "client!sfa", name = "j", descriptor = "I")
    public int field9823;

    @OriginalMember(owner = "client!sfa", name = "h", descriptor = "Lclient;")
    public static client field9821;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method3994(String arg0, int arg1) {
        field9820++;
        if (!class451.field6470.field3248) {
            return -1;
        }
        if (arg1 > -20) {
            field9818 = null;
        }
        if (class732.field9911.containsKey(arg0)) {
            return 100;
        }
        String var2 = class717.method3965(24531, arg0);
        if (var2 == null) {
            return -1;
        }
        String var3 = class682.field9116 + var2;
        if (!class117.field1580.method1190("", 112, var3)) {
            return -1;
        } else if (class117.field1580.method1159(var3, (byte) -62)) {
            byte[] var4 = class117.field1580.method1189("", 0, var3);
            Object var5 = null;
            File var6;
            try {
                var6 = class167.method1140(-109, var2);
            } catch (RuntimeException var10) {
                return -1;
            }
            if (var4 == null || var6 == null) {
                return -1;
            }
            boolean var7 = true;
            byte[] var8 = class306.method1980(var6, 90);
            if (var8 != null && var4.length == var8.length) {
                for (int var9 = 0; var9 < var8.length; var9++) {
                    if (var4[var9] != var8[var9]) {
                        var7 = false;
                        break;
                    }
                }
            } else {
                var7 = false;
            }
            try {
                if (!var7) {
                    class451.field6470.method1554(var4, 1048576, var6);
                }
            } catch (Throwable var11) {
                return -1;
            }
            class152.method1066(arg0, (byte) -30, var6);
            return 100;
        } else {
            return class117.field1580.method1172(var3, 97);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V")
    public static void method3995(byte arg0) {
        field9821 = null;
        field9818 = null;
        if (arg0 != -83) {
            field9819 = -12;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIIBI)V")
    public static final void method3996(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class233.field3099 = arg1;
        class297.field4199 = arg0;
        class291.field4156 = arg4;
        field9816++;
        class45.field472 = arg2;
        if (arg3 != 3) {
            field9819 = -48;
        }
    }
}
