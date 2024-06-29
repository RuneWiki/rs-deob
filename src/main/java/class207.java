import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class207 {

    @OriginalMember(owner = "client!se", name = "q", descriptor = "B")
    public byte field2776;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "Lwh;")
    public static class546 field2761 = new class546(16);

    @OriginalMember(owner = "client!se", name = "a", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "Lia;")
    public class190 field2767;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "Lia;")
    public class190 field2768;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "Lse;")
    public class207 field2771;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "Llt;")
    public class271 field2765;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "Lhk;")
    public class363 field2763;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "Lhk;")
    public class363 field2764;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "Lri;")
    public class634 field2774;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "Lqv;")
    public class98 field2769;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "S")
    public short field2770;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "S")
    public short field2772;

    @OriginalMember(owner = "client!se", name = "n", descriptor = "S")
    public short field2773;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "S")
    public short field2775;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V", line = 5)
    public final void method1315(int arg0) {
        field2762++;
        if (arg0 != -1) {
            this.method1315(81);
        }
        while (this.field2774 != null) {
            class634 var2 = this.field2774.field8764;
            this.field2774.method3515(1);
            this.field2774 = var2;
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)V", line = 26)
    public static void method1316(boolean arg0) {
        field2761 = null;
        if (arg0) {
            method1318(true, true);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILjava/lang/String;)I", line = 36)
    public static final int method1317(int arg0, String arg1) {
        field2766++;
        if (!class28.field412.field5176) {
            return -1;
        } else if (class611.field8485.containsKey(arg1)) {
            return 100;
        } else {
            String var2 = class190.method1251(arg1, (byte) -31);
            if (var2 == null) {
                return -1;
            }
            String var3 = class417.field5484 + var2;
            if (!class307.field4105.method1945("", arg0 - 6438, var3)) {
                return -1;
            } else if (class307.field4105.method1961(var3, false)) {
                byte[] var4 = class307.field4105.method1947(arg0 - 6340, "", var3);
                Object var5 = null;
                File var6;
                try {
                    var6 = class40.method223(var2, -113);
                } catch (RuntimeException var10) {
                    return -1;
                }
                if (var4 == null || var6 == null) {
                    if (arg0 != 6345) {
                        field2761 = null;
                    }
                    return -1;
                }
                boolean var7 = true;
                byte[] var8 = class50.method264(123, var6);
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
                        class28.field412.method2238(var6, 0, var4);
                    }
                } catch (Throwable var11) {
                    return -1;
                }
                class535.method3004(4666, var6, arg1);
                return 100;
            } else {
                return class307.field4105.method1964(var3, (byte) -85);
            }
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZZ)I", line = 126)
    public static final int method1318(boolean arg0, boolean arg1) {
        field2760++;
        if (class600.field8341 == null) {
            return 0;
        } else if (!arg0 && class421.field5524 != null) {
            return class600.field8341.length * 2;
        } else if (arg1) {
            return -9;
        } else {
            int var2 = 0;
            for (int var3 = 0; var3 < class600.field8341.length; var3++) {
                int var4 = class600.field8341[var3];
                if (class6.field62.method1931(1, var4)) {
                    var2++;
                }
                if (class418.field5501.method1931(1, var4)) {
                    var2++;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(I)V", line = 161)
    public class207(int arg0) {
        this.field2776 = (byte) arg0;
    }
}
