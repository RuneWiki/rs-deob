import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class44 extends class24 {

    @OriginalMember(owner = "client!m", name = "v", descriptor = "I")
    public int field543;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public int field546;

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Luf;")
    public static class168 field537 = class148.method1019(-1720, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!m", name = "o", descriptor = "J")
    public static long field536 = 0L;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field538 = 100;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Z")
    public static boolean field539 = true;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field545 = 0;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field540;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field542;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public static int field544;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "Ldk;")
    public static class241 field541;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Ljava/awt/Font;")
    public static Font field535;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V", line = 8)
    public static final void method240() {
        for (int var0 = 0; var0 < class280.field4715; var0++) {
            class91 var1 = class92.field1419[var0];
            class106.method791(var1);
            class92.field1419[var0] = null;
        }
        class280.field4715 = 0;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(III)V", line = 22)
    public static final void method241(int arg0, int arg1, int arg2) {
        field544++;
        if (class22.field275 < 2 && class211.field3461 == 0 && !class111.field1740) {
            return;
        }
        if (arg0 != -31476) {
            field541 = (class241) null;
        }
        class168 var3;
        if (class211.field3461 == 1 && class22.field275 < 2) {
            var3 = class134.method938((byte) -127, new class168[] { class127.field1957, class272.field4576, class213.field3486, class125.field1925 });
        } else if (class111.field1740 && class22.field275 < 2) {
            var3 = class134.method938((byte) -126, new class168[] { class120.field1872, class272.field4576, class233.field3754, class125.field1925 });
        } else {
            var3 = class142.method979(class22.field275 - 1, true);
        }
        if (class22.field275 > 2) {
            var3 = class134.method938((byte) -125, new class168[] { var3, class122.field1898, class169.method1228(class22.field275 - 2, 0), class17.field198 });
        }
        int var4 = class102.field1588.method201(var3, arg2 + 4, arg1 + 15, 16777215, 0, class299.field5075, class124.field1919);
        class127.method901(arg2 + 4, (byte) 110, 15, arg1, class102.field1588.method207(var3) + var4);
    }

    @OriginalMember(owner = "client!m", name = "b", descriptor = "(I)V", line = 52)
    public static void method242(int arg0) {
        field541 = null;
        if (arg0 <= 125) {
            field537 = (class168) null;
        }
        field535 = null;
        field537 = null;
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(II)V", line = 95)
    public class44(int arg0, int arg1) {
        this.field543 = arg1;
        this.field546 = arg0;
    }
}
