import java.awt.Canvas;
import java.awt.Component;
import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class499 extends Canvas {

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "Ljava/awt/Component;")
    private Component field6231;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field6228;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field6229;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!tp", name = "paint", descriptor = "(Ljava/awt/Graphics;)V")
    public final void paint(Graphics arg0) {
        field6229++;
        this.field6231.paint(arg0);
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IJ)V")
    public static final void method2720(int arg0, long arg1) {
        field6232++;
        if (class407.field5237 != null) {
            if (class385.field4946 == 1 || class385.field4946 == 5) {
                class563.method2991((byte) 87, arg1);
            } else if (class385.field4946 == 4) {
                class694.method3835(arg1, (byte) 105);
            }
        }
        class176.method1051(0, class309.field3898, (long) class665.field9027);
        if (class305.field3866 != -1) {
            class569.method3015(class305.field3866, (byte) 58);
        }
        for (int var3 = 0; var3 < class211.field2489; var3++) {
            if (class58.field743[var3]) {
                class128.field1559[var3] = true;
            }
            class33.field516[var3] = class58.field743[var3];
            class58.field743[var3] = false;
        }
        class448.field5648 = class665.field9027;
        if (class309.field3898.method419()) {
            class413.field5288 = true;
        }
        if (class305.field3866 != -1) {
            class211.field2489 = 0;
            class568.method3012(-31456);
        }
        class309.field3898.method410();
        class96.method715(7, class309.field3898);
        int var4 = class292.method1760(124);
        if (var4 == -1) {
            var4 = class530.field6684;
        }
        if (var4 == -1) {
            var4 = class585.field7863;
        }
        class288.method1732(var4, arg0 ^ 0xFFFF8150);
        if (arg0 == 16764) {
            class570.method3021((byte) -117, class67.field815.field8018, class67.field815.field8010, class67.field815.field8011, class231.field3008);
            class231.field3008 = 0;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(ZB)V")
    public static final void method2721(boolean arg0, byte arg1) {
        field6227++;
        if (class229.field2957.length() == 0) {
            return;
        }
        class8.method28(-1, "--> " + class229.field2957);
        class288.method1730(false, false, class229.field2957, arg0);
        class593.field7960 = 0;
        int var2 = 68 / ((arg1 + 74) / 37);
        class229.field2957 = "";
        class608.field8289 = 0;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(III)Z")
    public static final boolean method2722(int arg0, int arg1, int arg2) {
        if (arg0 <= 29) {
            return true;
        } else {
            field6228++;
            return (arg1 & 0x400) != 0;
        }
    }

    @OriginalMember(owner = "client!tp", name = "update", descriptor = "(Ljava/awt/Graphics;)V")
    public final void update(Graphics arg0) {
        field6230++;
        this.field6231.update(arg0);
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Ljava/awt/Component;)V")
    public class499(Component arg0) {
        this.field6231 = arg0;
    }
}
