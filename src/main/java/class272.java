import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class272 {

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lgda;")
    public static class53 field3888 = new class53(43, 18);

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lpca;")
    public static class714 field3890 = new class714(4);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static int field3886;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3887;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "Ljava/awt/Frame;")
    public static Frame field3891;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILjava/awt/Canvas;)V", line = 3)
    public static final void method1772(int arg0, Canvas arg1) {
        field3886++;
        Dimension var2 = arg1.getSize();
        if (arg0 > -126) {
            field3890 = null;
        }
        class492.method2930(var2.height, 0, var2.width);
        if (class221.field2883 == 1) {
            class263.field3799.method385(arg1, class414.field5838, class712.field9900);
        } else {
            class263.field3799.method385(arg1, class260.field3746, class586.field8252);
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V", line = 28)
    public static void method1773(byte arg0) {
        field3891 = null;
        field3888 = null;
        int var1 = 38 % ((arg0 - 60) / 57);
        field3890 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(CI)B", line = 39)
    public static final byte method1774(char arg0, int arg1) {
        if (arg1 != -8910) {
            method1772(-40, null);
        }
        field3889++;
        byte var2;
        if (!(arg0 <= '\u0000' || arg0 >= '\u0080') || !(arg0 < ' ' || arg0 > 'ÿ')) {
            var2 = (byte) arg0;
        } else if (arg0 == '€') {
            var2 = -128;
        } else if (arg0 == '‚') {
            var2 = -126;
        } else if (arg0 == 'ƒ') {
            var2 = -125;
        } else if (arg0 == '„') {
            var2 = -124;
        } else if (arg0 == '…') {
            var2 = -123;
        } else if (arg0 == '†') {
            var2 = -122;
        } else if (arg0 == '‡') {
            var2 = -121;
        } else if (arg0 == 'ˆ') {
            var2 = -120;
        } else if (arg0 == '‰') {
            var2 = -119;
        } else if (arg0 == 'Š') {
            var2 = -118;
        } else if (arg0 == '‹') {
            var2 = -117;
        } else if (arg0 == 'Œ') {
            var2 = -116;
        } else if (arg0 == 'Ž') {
            var2 = -114;
        } else if (arg0 == '‘') {
            var2 = -111;
        } else if (arg0 == '’') {
            var2 = -110;
        } else if (arg0 == '“') {
            var2 = -109;
        } else if (arg0 == '”') {
            var2 = -108;
        } else if (arg0 == '•') {
            var2 = -107;
        } else if (arg0 == '–') {
            var2 = -106;
        } else if (arg0 == '—') {
            var2 = -105;
        } else if (arg0 == '˜') {
            var2 = -104;
        } else if (arg0 == '™') {
            var2 = -103;
        } else if (arg0 == 'š') {
            var2 = -102;
        } else if (arg0 == '›') {
            var2 = -101;
        } else if (arg0 == 'œ') {
            var2 = -100;
        } else if (arg0 == 'ž') {
            var2 = -98;
        } else if (arg0 == 'Ÿ') {
            var2 = -97;
        } else {
            var2 = 63;
        }
        return var2;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(BII)V", line = 176)
    public static final void method1775(byte arg0, int arg1, int arg2) {
        field3887++;
        class592 var3 = class682.method3825(-652872096, 6, arg1);
        var3.method3351(0);
        var3.field8337 = arg2;
        if (arg0 != 76) {
            field3891 = null;
        }
    }
}
