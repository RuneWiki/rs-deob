import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ib")
public class class80 implements Runnable {

    @OriginalMember(owner = "client!ib", name = "c", descriptor = "Z")
    public boolean field1617 = true;

    @OriginalMember(owner = "client!ib", name = "i", descriptor = "Ljava/lang/Object;")
    public Object field1623 = new Object();

    @OriginalMember(owner = "client!ib", name = "k", descriptor = "[I")
    public int[] field1625 = new int[500];

    @OriginalMember(owner = "client!ib", name = "l", descriptor = "[I")
    public int[] field1626 = new int[500];

    @OriginalMember(owner = "client!ib", name = "n", descriptor = "I")
    public int field1628 = 0;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "I")
    public static int field1615 = 0;

    @OriginalMember(owner = "client!ib", name = "d", descriptor = "Lrf;")
    private static class163 field1618 = class53.method392(-41, "Drop");

    @OriginalMember(owner = "client!ib", name = "h", descriptor = "Lrf;")
    public static class163 field1622 = field1618;

    @OriginalMember(owner = "client!ib", name = "g", descriptor = "Lrf;")
    public static class163 field1621 = class53.method392(-112, "mapdots");

    @OriginalMember(owner = "client!ib", name = "j", descriptor = "Z")
    public static boolean field1624 = false;

    @OriginalMember(owner = "client!ib", name = "b", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!ib", name = "e", descriptor = "I")
    public static int field1619;

    @OriginalMember(owner = "client!ib", name = "f", descriptor = "I")
    public static int field1620;

    @OriginalMember(owner = "client!ib", name = "m", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(Lu;ZLu;)V")
    public static final void method545(class184 arg0, boolean arg1, class184 arg2) {
        field1616++;
        class127.field2617 = arg0;
        class177.field3580 = arg2;
        class99.field2093 = class177.field3580.method1225(3, arg1);
    }

    @OriginalMember(owner = "client!ib", name = "a", descriptor = "(I)V")
    public static void method546(int arg0) {
        field1618 = null;
        field1622 = null;
        field1621 = null;
        if (arg0 >= -73) {
            field1615 = -20;
        }
    }

    @OriginalMember(owner = "client!ib", name = "run", descriptor = "()V")
    public final void run() {
        while (this.field1617) {
            Object var1 = this.field1623;
            synchronized (this.field1623) {
                if (this.field1628 < 500) {
                    this.field1626[this.field1628] = class22.field394;
                    this.field1625[this.field1628] = class75.field1555;
                    this.field1628++;
                }
            }
            class25.method151(50L, (byte) 0);
        }
        field1619++;
    }
}
