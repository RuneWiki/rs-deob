import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ho")
public abstract class class359 {

    @OriginalMember(owner = "client!ho", name = "d", descriptor = "[Los;")
    public static class377[] field5121 = new class377[29];

    @OriginalMember(owner = "client!ho", name = "b", descriptor = "I")
    public static int field5119;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "J")
    public static long field5118;

    @OriginalMember(owner = "client!ho", name = "c", descriptor = "Ldp;")
    public static class174 field5120;

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(I)I")
    public abstract int method1280(int arg0);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public abstract void method1281(boolean arg0, Component arg1);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public abstract void method1282(Component arg0, int arg1);

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(Lbr;III)V")
    public static final void method2302(class348 arg0, int arg1, int arg2, int arg3) {
        int var4 = class450.field6537[arg1][arg2][arg3];
        int var5 = 0;
        arg0.field4927 = 0;
        while (var5 <= 24) {
            int var6 = var4 >> var5 & 0xFF;
            if (var6 <= 0) {
                break;
            }
            arg0.field4925[arg0.field4927++] = class115.field1834[var6 - 1];
            var5 += 8;
        }
        for (int var7 = arg0.field4927; var7 < 4; var7++) {
            arg0.field4925[var7] = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(B)V")
    public static void method2303(byte arg0) {
        field5121 = null;
        field5120 = null;
        if (arg0 != 54) {
            field5120 = null;
        }
    }

    @OriginalMember(owner = "client!ho", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method2304(int arg0, int arg1, String arg2) {
        class13.field216.method2781(false, 93);
        class156.field2361++;
        field5119++;
        class13.field216.method267(class429.method2677(arg2, arg1) + 1, false);
        class13.field216.method267(arg0, false);
        class13.field216.method265((byte) -123, arg2);
    }
}
