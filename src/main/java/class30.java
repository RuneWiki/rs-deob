import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class30 extends class390 {

    @OriginalMember(owner = "client!na", name = "p", descriptor = "[B")
    public byte[] field496;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field490 = 0;

    @OriginalMember(owner = "client!na", name = "m", descriptor = "F")
    public static float field493;

    @OriginalMember(owner = "client!na", name = "k", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!na", name = "l", descriptor = "I")
    public static int field492;

    @OriginalMember(owner = "client!na", name = "q", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!na", name = "r", descriptor = "Lja;")
    public static class152 field498;

    @OriginalMember(owner = "client!na", name = "n", descriptor = "Lnq;")
    public static class268 field494;

    @OriginalMember(owner = "client!na", name = "o", descriptor = "Lnq;")
    public static class268 field495;

    @OriginalMember(owner = "client!na", name = "b", descriptor = "(I)V")
    public static void method311(int arg0) {
        field494 = null;
        if (arg0 != 0) {
            method312(85, (class268) null, (class268) null);
        }
        field498 = null;
        field495 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(ILnq;Lnq;)V")
    public static final void method312(int arg0, class268 arg1, class268 arg2) {
        class328.field4550 = arg2;
        class440.field6203 = arg1;
        if (arg0 >= -115) {
            method314(true);
        }
        field492++;
    }

    @OriginalMember(owner = "client!na", name = "<init>", descriptor = "([B)V")
    public class30(byte[] arg0) {
        this.field496 = arg0;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method313(int arg0, int arg1, String arg2) {
        if (arg1 != -29133) {
            field494 = null;
        }
        field497++;
        class239 var3 = class436.method2740(3, arg0, arg1 - 323256659);
        var3.method1622(arg1 ^ 0xFFFF8E55);
        var3.field3404 = arg2;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(Z)V")
    public static final void method314(boolean arg0) {
        field491++;
        if (!arg0) {
            method311(51);
        }
        try {
            if (class347.field4737 == 1) {
                int var1 = class314.field4303.method1375(0);
                if (var1 > 0 && class314.field4303.method1353(25967)) {
                    int var2 = var1 - class290.field4063;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class314.field4303.method1386(-125, var2);
                } else {
                    class314.field4303.method1382(false);
                    class314.field4303.method1384(1);
                    class79.field1123 = null;
                    if (class130.field1832 == null) {
                        class347.field4737 = 0;
                    } else {
                        class347.field4737 = 2;
                    }
                    class392.field5619 = null;
                }
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class314.field4303.method1382(false);
            class347.field4737 = 0;
            class79.field1123 = null;
            class130.field1832 = null;
            class392.field5619 = null;
        }
    }
}
