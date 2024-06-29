import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public abstract class class309 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "I")
    public static int field4558 = -1;

    @OriginalMember(owner = "client!je", name = "a", descriptor = "Lvq;")
    public static class24 field4556 = new class24(64, 5);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "I")
    public static int field4559 = 0;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(B)V", line = 6)
    public static void method2059(byte arg0) {
        field4556 = null;
        if (arg0 != 38) {
            field4558 = 102;
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(B)V", line = 18)
    public static final void method2060(byte arg0) {
        field4557++;
        for (class375 var1 = (class375) class138.field1885.method2478(1603); var1 != null; var1 = (class375) class138.field1885.method2486((byte) -82)) {
            if (class266.method1832((byte) 119, var1.field5469)) {
                class319.method2099(false, var1);
            }
        }
        if (arg0 < 40) {
            method2059((byte) 47);
        }
        if (class237.field3532 == 1) {
            class286.field4210 = false;
            class3.method23(class441.field6420, class427.field6215, class130.field1732, class466.field6860, 255);
            return;
        }
        class3.method23(class441.field6420, class427.field6215, class130.field1732, class466.field6860, 255);
        int var2 = class233.field3502.method2333(95, class42.field565.method2543(false, class153.field2073));
        for (class375 var3 = (class375) class138.field1885.method2478(1603); var3 != null; var3 = (class375) class138.field1885.method2486((byte) -82)) {
            int var4 = class421.method2599(var3, (byte) 12);
            if (var4 > var2) {
                var2 = var4;
            }
        }
        class130.field1732 = class237.field3532 * 16 + (class92.field1144 ? 26 : 22);
        class466.field6860 = var2 + 8;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(ILfp;)Luq;")
    public abstract class241 method2(int arg0, class9 arg1);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(I)V")
    public abstract void method33(int arg0);

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(ILfp;)V")
    public abstract void method14(int arg0, class9 arg1);

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(B)Z")
    public abstract boolean method34(byte arg0);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lfp;III)Z")
    public abstract boolean method5(class9 arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lfp;Lje;ZIIII)V")
    public abstract void method32(class9 arg0, class309 arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6);
}
