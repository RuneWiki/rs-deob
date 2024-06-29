import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class295 {

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public static int field4716 = 500;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field4719 = 2;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field4715;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field4717;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field4718;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field4720;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILdk;)V")
    public static final void method1958(int arg0, class251 arg1) {
        class134.field2124 = arg1;
        int var2 = 93 / ((arg0 + 45) / 45);
        field4718++;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILdk;ZIZI)V")
    public static final void method1959(int arg0, class251 arg1, boolean arg2, int arg3, boolean arg4, int arg5) {
        class237.field3810 = arg3;
        field4720++;
        class129.field2023 = 10000;
        class33.field509 = arg2;
        class22.field272 = 1;
        class62.field1026 = arg1;
        class293.field4691 = arg0;
        if (!arg4) {
            method1961(6, -45, 22, (Component) null);
        }
        class236.field3800 = arg5;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(II)I")
    public static final int method1960(int arg0, int arg1) {
        if (arg0 != 255) {
            field4716 = -71;
        }
        field4715++;
        class26 var2 = class67.method470(arg0 - 255, arg1);
        int var3 = var2.field322;
        int var4 = var2.field332;
        int var5 = var2.field326;
        int var6 = class10.field101[var4 - var5];
        return var6 & class195.field3160[var3] >> var5;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIILjava/awt/Component;)Lih;")
    public static final class73 method1961(int arg0, int arg1, int arg2, Component arg3) {
        field4717++;
        if (arg2 != 500) {
            return null;
        }
        try {
            Class var4 = Class.forName("dc");
            class73 var5 = (class73) var4.getDeclaredConstructor().newInstance();
            var5.method39(-7, arg1, arg0, arg3);
            return var5;
        } catch (Throwable var7) {
            class250 var6 = new class250();
            var6.method39(-7, arg1, arg0, arg3);
            return var6;
        }
    }
}
