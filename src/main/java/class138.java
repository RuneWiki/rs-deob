import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class138 extends Canvas {

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field1918;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "[I")
    public static int[] field1915 = new int[5];

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Lap;")
    public static class310 field1919 = new class310(14, 11);

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field1920 = 0;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field1921 = 0;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field1916;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field1917;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field1922;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)V")
    public static void method1011(byte arg0) {
        field1919 = null;
        if (arg0 != 23) {
            field1921 = 90;
        }
        field1915 = null;
    }

    @OriginalMember(owner = "client!vj", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class138(Component arg0) {
        this.field1918 = arg0;
    }

    @OriginalMember(owner = "client!vj", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        this.field1918.update(arg0);
        field1917++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIBLwg;)V")
    public static final void method1012(int arg0, int arg1, byte arg2, class361 arg3) {
        if (arg2 <= 49) {
            field1921 = 109;
        }
        field1916++;
        if (arg3.field5742 == arg1 && arg1 != -1) {
            class303 var4 = class386.field5289.method1856(116, arg1);
            int var5 = var4.field4289;
            if (var5 == 1) {
                arg3.field5770 = 0;
                arg3.field5773 = arg0;
                arg3.field5800 = 0;
                arg3.field5789 = 0;
                arg3.field5781 = 1;
                class178.method1275(arg3.field5789, false, false, arg3.field4531, arg3.field4537, var4, arg3.field4530);
            }
            if (var5 == 2) {
                arg3.field5800 = 0;
                return;
            }
        } else if (arg1 == -1 || arg3.field5742 == -1 || class386.field5289.method1856(69, arg1).field4307 >= class386.field5289.method1856(14, arg3.field5742).field4307) {
            arg3.field5789 = 0;
            arg3.field5770 = 0;
            arg3.field5773 = arg0;
            arg3.field5809 = arg3.field5810;
            arg3.field5800 = 0;
            arg3.field5742 = arg1;
            arg3.field5781 = 1;
            if (arg3.field5742 == -1) {
                return;
            }
            class178.method1275(arg3.field5789, false, false, arg3.field4531, arg3.field4537, class386.field5289.method1856(118, arg3.field5742), arg3.field4530);
        }
    }

    @OriginalMember(owner = "client!vj", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field1923++;
        this.field1918.paint(arg0);
    }
}
