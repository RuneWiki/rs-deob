import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class308 {

    @OriginalMember(owner = "client!ui", name = "e", descriptor = "Lbh;")
    public static class538 field3976 = new class538(4);

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "I")
    public static int field3972;

    @OriginalMember(owner = "client!ui", name = "b", descriptor = "I")
    public static int field3973;

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "I")
    public static int field3974;

    @OriginalMember(owner = "client!ui", name = "d", descriptor = "I")
    public static int field3975;

    @OriginalMember(owner = "client!ui", name = "f", descriptor = "I")
    public static int field3977;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(III)Z")
    public static final boolean method1808(int arg0, int arg1, int arg2) {
        field3975++;
        int var3 = -100 % ((-arg0 - 17) / 45);
        return (arg2 & 0x180) != 0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(I)V")
    public static void method1809(int arg0) {
        field3976 = null;
        if (arg0 < 56) {
            field3976 = null;
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1810(boolean arg0, String arg1, String arg2, int arg3) {
        class692.field9685 = arg0;
        class552.field7816 = arg1;
        class392.field5460 = arg2;
        field3972++;
        if (!class692.field9685 && class552.field7816.equals("") || class392.field5460.equals("")) {
            class22.method125(arg3 + 1, 3);
            return;
        }
        class594.field8566 = false;
        if (class93.field1268 != 1) {
            class260.field3538 = -1;
            class262.field3583 = 0;
        }
        class22.method125(1, -3);
        class213.field3003 = 1;
        class609.field8675 = arg3;
        class749.field10434 = 0;
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(Lr;III[Z)V")
    public static final void method1811(class706 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class52.field741 == class435.field5969) {
            return;
        }
        int var5 = class155.field2126[arg1].method1960(arg2, arg3, 116);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class339 var7 = class155.field2126[var6];
                if (var7 != null) {
                    var7.method502(arg0, arg2, var5 - var7.method1960(arg2, arg3, 124), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ZLha;IILjava/lang/String;III)V")
    public static final void method1812(boolean arg0, class545 arg1, int arg2, int arg3, String arg4, int arg5, int arg6, int arg7) {
        if (class367.field4707 == null || class589.field8463 == null) {
            if (class323.field4156.method3340(0, class15.field201) && class323.field4156.method3340(0, class20.field249)) {
                class367.field4707 = arg1.method2126(class320.method1870(class323.field4156, class15.field201, 0), true);
                class320 var8 = class320.method1870(class323.field4156, class20.field249, 0);
                class589.field8463 = arg1.method2126(var8, true);
                var8.method1864();
                class718.field10143 = arg1.method2126(var8, true);
            } else {
                arg1.method2194(arg3, arg7, arg6, arg5, class324.field4169 | 255 - class146.field2021 << 24, 1);
            }
        }
        field3974++;
        if (arg0) {
            method1812(false, null, 53, 95, null, -17, -97, -100);
        }
        if (class367.field4707 != null && class589.field8463 != null) {
            int var9 = (arg6 - class589.field8463.method115() * 2) / class367.field4707.method115();
            for (int var10 = 0; var10 < var9; var10++) {
                class367.field4707.method101(class589.field8463.method115() + arg3 + var10 * class367.field4707.method115(), arg7);
            }
            class589.field8463.method101(arg3, arg7);
            class718.field10143.method101(arg3 + arg6 - class718.field10143.method115(), arg7);
        }
        class743.field10354.method2427(648, arg3 + 3, arg4, arg7 + 14, class82.field1118 | 0xFF000000, -1);
        arg1.method2194(arg3, arg5 + arg7, arg6, arg2 - arg5, -class146.field2021 + 255 << 24 | class324.field4169, 1);
    }
}
