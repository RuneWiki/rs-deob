import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!km")
public class class55 extends class59 {

    @OriginalMember(owner = "client!km", name = "w", descriptor = "I")
    public int field804;

    @OriginalMember(owner = "client!km", name = "x", descriptor = "I")
    public static int field805 = 0;

    @OriginalMember(owner = "client!km", name = "y", descriptor = "I")
    public static int field806;

    @OriginalMember(owner = "client!km", name = "z", descriptor = "I")
    public static int field807;

    @OriginalMember(owner = "client!km", name = "A", descriptor = "I")
    public static int field808;

    @OriginalMember(owner = "client!km", name = "B", descriptor = "I")
    public static int field809;

    @OriginalMember(owner = "client!km", name = "v", descriptor = "Ljava/awt/Frame;")
    public static Frame field803;

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(ID)V", line = 5)
    public static final void method389(int arg0, double arg1) {
        if (class132.field1979 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class294.field4751[var3] = var4 > 255 ? 255 : var4;
            }
            class132.field1979 = arg1;
        }
        int var5 = 4 % ((arg0 - 80) / 37);
        field808++;
    }

    @OriginalMember(owner = "client!km", name = "a", descriptor = "(Lok;IZLok;)V", line = 33)
    public static final void method390(class41 arg0, int arg1, boolean arg2, class41 arg3) {
        field806++;
        class266.field4236 = arg3;
        class266.field4232 = arg0;
        if (!arg2) {
            return;
        }
        class124.field1837 = arg1;
        if (class266.field4236.method268(class266.field4233, 1631) || class266.field4232.method268(class266.field4233, 1631)) {
            class134.field2001 = 3;
        } else if (class218.field3495 == -1) {
            class165.field2616 = 0;
            class134.field2001 = -3;
            class32.field485 = 1;
            class201.field3223 = 0;
            class112 var4 = new class112(128);
            var4.method797(10, -22096);
            var4.method778((int) (Math.random() * 99999.0D), (byte) -4);
            var4.method778(520, (byte) -4);
            var4.method800(class266.field4236.method291((byte) 65), (byte) -113);
            var4.method787(853918096, (int) (Math.random() * 9.9999999E7D));
            var4.method776(341440880, class266.field4232);
            var4.method787(853918096, (int) (Math.random() * 9.9999999E7D));
            var4.method786(class210.field3378, class235.field3764, 0);
            class285.field4642.field1640 = 0;
            class285.field4642.method797(91, -22096);
            class285.field4642.method797(var4.field1640, -22096);
            class285.field4642.method813(var4.field1640, 0, var4.field1607, -1);
        } else {
            class5.method19(119);
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "()V", line = 96)
    public class55() {
    }

    @OriginalMember(owner = "client!km", name = "d", descriptor = "(I)V", line = 100)
    public static void method391(int arg0) {
        field803 = null;
        if (arg0 != 0) {
            field803 = (Frame) null;
        }
    }

    @OriginalMember(owner = "client!km", name = "<init>", descriptor = "(I)V", line = 108)
    public class55(int arg0) {
        this.field804 = arg0;
    }
}
