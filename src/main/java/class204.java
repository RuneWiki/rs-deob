import java.awt.Canvas;
import java.awt.Component;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class204 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "I")
    public static int field3467 = 0;

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "Llg;")
    public static class137 field3473 = null;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field3470;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field3472;

    @OriginalMember(owner = "client!nm", name = "i", descriptor = "I")
    public static int field3474;

    @OriginalMember(owner = "client!nm", name = "j", descriptor = "I")
    public static int field3475;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IBILjava/awt/Component;)Lej;", line = 15)
    public static final class175 method1528(int arg0, byte arg1, int arg2, Component arg3) {
        field3469++;
        try {
            if (arg1 < 81) {
                field3475 = 76;
            }
            Class var4 = Class.forName("sl");
            class175 var5 = (class175) var4.getDeclaredConstructor().newInstance();
            var5.method958((byte) -123, arg0, arg2, arg3);
            return var5;
        } catch (Throwable var8) {
            class318 var7 = new class318();
            var7.method958((byte) -123, arg0, arg2, arg3);
            return var7;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(IIB)V", line = 50)
    public static final void method1529(int arg0, int arg1, byte arg2) {
        field3470++;
        int var3 = -82 / ((arg2 - 66) / 51);
        class30 var4 = class99.method857((byte) 104, arg0, 12);
        var4.method277(true);
        var4.field438 = arg1;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(B)V", line = 100)
    public static void method1530(byte arg0) {
        field3473 = null;
        if (arg0 != 18) {
            field3473 = (class137) null;
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 112)
    public static final void method1531(int arg0) {
        if (arg0 > -42) {
            method1531(56);
        }
        class4.field56.method470(12);
        field3468++;
    }
}
