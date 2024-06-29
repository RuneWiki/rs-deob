import java.awt.Graphics;
import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 {

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public int field482 = 0;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "I")
    public int field487 = 0;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Ljb;")
    public static class64 field489 = new class64(64);

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Lkd;")
    private static class73 field496 = class126.method1070((byte) -66, "Remove");

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "[I")
    public static int[] field497 = new int[200];

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Lkd;")
    private static class73 field495 = class126.method1070((byte) -66, "Please reload this page)3");

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lkd;")
    public static class73 field498 = field496;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "Lkd;")
    public static class73 field492 = field495;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field499 = 2;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "I")
    public int field478;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public int field480;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "I")
    public static int field488;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field490;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "I")
    public static int field491;

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "I")
    public static int field493;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field494;

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "I")
    public int field500;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "Lcc;")
    public class18 field486;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static void method127(byte arg0) {
        field498 = null;
        field495 = null;
        field496 = null;
        if (arg0 < -117) {
            field492 = null;
            field497 = null;
            field489 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IZ)V")
    public static final void method128(int arg0, boolean arg1) {
        field485++;
        if (class107.field2637.field3623 == null) {
            return;
        }
        for (int var2 = arg0; var2 < 50 && class107.field2637.field3623.peekEvent() != null; var2++) {
            class112.method913(arg0 ^ 0x1, 1L);
        }
        if (arg1) {
            class107.field2637.field3623.postEvent(new ActionEvent(class18.field519, 1001, "dummy"));
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
    public static final void method129(byte arg0) {
        if (arg0 > 62) {
            field484++;
            if (class80.field2028 != null) {
                class80.field2028.method1135(-124);
            }
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static final void method130(int arg0) {
        if (arg0 != 26049) {
            return;
        }
        try {
            Graphics var1 = class18.field519.getGraphics();
            class136.field3399.method98(550, 4, arg0 - 43010, var1);
        } catch (Exception var2) {
            class18.field519.repaint();
        }
        field490++;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(Lua;Lpe;BI)V")
    public static final void method131(class137 arg0, class109 arg1, byte arg2, int arg3) {
        field491++;
        byte[] var4 = null;
        class61 var5 = class1.field67;
        synchronized (class1.field67) {
            if (arg2 > -107) {
                field495 = null;
            }
            for (class3 var6 = (class3) class1.field67.method514((byte) -79); var6 != null; var6 = (class3) class1.field67.method517(-100)) {
                if ((long) arg3 == var6.field3522 && var6.field158 == arg1 && var6.field162 == 0) {
                    var4 = var6.field166;
                    break;
                }
            }
        }
        if (var4 == null) {
            byte[] var7 = arg1.method877(3, arg3);
            arg0.method1120(var7, arg3, 255, true, arg1);
        } else {
            arg0.method1120(var4, arg3, 255, true, arg1);
        }
    }
}
