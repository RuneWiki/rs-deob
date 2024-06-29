import java.awt.Component;
import java.awt.event.ActionEvent;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ob")
public class class45 {

    @OriginalMember(owner = "client!ob", name = "g", descriptor = "Lug;")
    public static class179 field531 = new class179(5000);

    @OriginalMember(owner = "client!ob", name = "k", descriptor = "Lqj;")
    public static class196 field535 = class80.method502("leuchten3:", -48);

    @OriginalMember(owner = "client!ob", name = "j", descriptor = "Ldf;")
    public static class231 field534 = new class231(32);

    @OriginalMember(owner = "client!ob", name = "m", descriptor = "I")
    public static int field537 = -1;

    @OriginalMember(owner = "client!ob", name = "r", descriptor = "I")
    public static int field542 = 0;

    @OriginalMember(owner = "client!ob", name = "o", descriptor = "Lqj;")
    private static class196 field539 = class80.method502("K", -48);

    @OriginalMember(owner = "client!ob", name = "s", descriptor = "Z")
    public static boolean field543 = true;

    @OriginalMember(owner = "client!ob", name = "l", descriptor = "Lqj;")
    public static class196 field536 = field539;

    @OriginalMember(owner = "client!ob", name = "t", descriptor = "Lqj;")
    private static class196 field544 = class80.method502("Ok", -48);

    @OriginalMember(owner = "client!ob", name = "u", descriptor = "Lqj;")
    public static class196 field545 = class80.method502("(Udns", -48);

    @OriginalMember(owner = "client!ob", name = "q", descriptor = "Lqj;")
    public static class196 field541 = field539;

    @OriginalMember(owner = "client!ob", name = "p", descriptor = "Lqj;")
    public static class196 field540 = field544;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!ob", name = "b", descriptor = "I")
    public static int field526;

    @OriginalMember(owner = "client!ob", name = "c", descriptor = "I")
    public static int field527;

    @OriginalMember(owner = "client!ob", name = "d", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!ob", name = "e", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!ob", name = "f", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!ob", name = "h", descriptor = "I")
    public static int field532;

    @OriginalMember(owner = "client!ob", name = "i", descriptor = "I")
    public static int field533;

    @OriginalMember(owner = "client!ob", name = "n", descriptor = "[[[B")
    public static byte[][][] field538;

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method237(Component arg0, boolean arg1) {
        Method var2 = class205.field3684;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        arg0.addKeyListener(class105.field1522);
        if (arg1) {
            method242(41, -60, 55, -123);
        }
        field530++;
        arg0.addFocusListener(class105.field1522);
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(BI)V")
    public static final void method238(byte arg0, int arg1) {
        field529++;
        if (arg0 == -9) {
            class182.field3209.method1535(arg1, 30704);
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(Z)I")
    public static final int method239(boolean arg0) {
        field528++;
        if (!arg0) {
            method243(123, null, null);
        }
        return class218.field3911;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(I)V")
    public static void method240(int arg0) {
        field541 = null;
        field540 = null;
        field531 = null;
        field544 = null;
        field539 = null;
        field535 = null;
        field538 = null;
        if (arg0 == -21595) {
            field534 = null;
            field536 = null;
            field545 = null;
        }
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(III)J")
    public static final long method241(int arg0, int arg1, int arg2) {
        class61 var3 = class249.field4410[arg0][arg1][arg2];
        if (var3 == null) {
            return 0L;
        }
        for (int var4 = 0; var4 < var3.field836; var4++) {
            class200 var5 = var3.field823[var4];
            if ((var5.field3554 >> 29 & 0x3L) == 2L && var5.field3549 == arg1 && var5.field3548 == arg2) {
                return var5.field3554;
            }
        }
        return 0L;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(IIII)Ljj;")
    public static final class63 method242(int arg0, int arg1, int arg2, int arg3) {
        class63 var4 = new class63();
        var4.field875 = arg0;
        field526++;
        var4.field864 = arg3;
        class101.field1445.method1552(var4, (long) arg2, arg1 ^ arg1);
        class10.method44(arg3, 117);
        class178 var5 = class201.method1356(arg2, (byte) -114);
        if (var5 != null) {
            class214.method1472(arg1 - 96, var5);
        }
        if (class30.field387 != null) {
            class214.method1472(-128, class30.field387);
            class30.field387 = null;
        }
        class160.field2574 = false;
        class125.field1767 = 0;
        class166.method1070(class11.field127, class158.field2551, class143.field2193, 0, class231.field4110);
        if (var5 != null) {
            class163.method1026(false, -94, var5);
        }
        class158.method995(29288, arg3);
        if (class9.field103 != -1) {
            class17.method92(arg1 + 66, class9.field103, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ob", name = "a", descriptor = "(ILjava/lang/Object;Llj;)V")
    public static final void method243(int arg0, Object arg1, class205 arg2) {
        field525++;
        if (arg2.field3679 == null) {
            return;
        }
        int var3 = 0;
        if (arg0 != -31656) {
            return;
        }
        while (var3 < 50 && arg2.field3679.peekEvent() != null) {
            class73.method464((byte) -100, 1L);
            var3++;
        }
        if (arg1 != null) {
            arg2.field3679.postEvent(new ActionEvent(arg1, 1001, "dummy"));
        }
    }
}
