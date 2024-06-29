import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class316 extends Canvas {

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "Ljava/awt/Component;")
    private Component field4700;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "Luc;")
    public static class27 field4704 = new class27(59, 2);

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "I")
    public static int field4701;

    @OriginalMember(owner = "client!sc", name = "c", descriptor = "I")
    public static int field4702;

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "I")
    public static int field4703;

    @OriginalMember(owner = "client!sc", name = "f", descriptor = "I")
    public static int field4705;

    @OriginalMember(owner = "client!sc", name = "g", descriptor = "I")
    public static int field4706;

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(BI)Z", line = 3)
    public static final boolean method1933(byte arg0, int arg1) {
        field4701++;
        int var2 = arg0 & 0xFF;
        if (var2 == 0) {
            return false;
        } else {
            if (arg1 != 160) {
                method1937(-98, 101, -47);
            }
            return var2 < 128 || var2 >= 160 || class587.field8205[var2 - 128] != '\u0000';
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IIZ)Z", line = 28)
    public static final boolean method1934(int arg0, int arg1, boolean arg2) {
        field4703++;
        if (arg2) {
            return true;
        } else {
            return (arg1 & 0x20) != 0;
        }
    }

    @OriginalMember(owner = "client!sc", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 39)
    public final void paint(Graphics arg0) {
        this.field4700.paint(arg0);
        field4706++;
    }

    @OriginalMember(owner = "client!sc", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 47)
    public final void update(Graphics arg0) {
        field4702++;
        this.field4700.update(arg0);
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(B)V", line = 55)
    public static void method1935(byte arg0) {
        if (arg0 == 126) {
            field4704 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(Lfaa;ZB)V", line = 69)
    public static final void method1936(class140 arg0, boolean arg1, byte arg2) {
        field4705++;
        int var3 = arg0.field2062 == 0 ? arg0.field2121 : arg0.field2062;
        int var4 = arg0.field1961 == 0 ? arg0.field2082 : arg0.field1961;
        class218.method1409(0, var3, arg1, arg0.field2100, class676.field9545[arg0.field2100 >> 16], var4);
        if (arg0.field2043 != null) {
            class218.method1409(0, var3, arg1, arg0.field2100, arg0.field2043, var4);
        }
        int var5 = 65 / ((arg2 + 6) / 37);
        class198 var6 = (class198) class368.field5262.method2061(-17305, (long) arg0.field2100);
        if (var6 != null) {
            class327.method1976(var3, var6.field2922, var4, arg1, true);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(III)V", line = 94)
    public static final void method1937(int arg0, int arg1, int arg2) {
        class486 var3 = class658.field9266[arg0][arg1][arg2];
        if (var3 != null && var3.field6748 != null) {
            var3.field6748 = null;
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 108)
    public class316(Component arg0) {
        this.field4700 = arg0;
    }
}
