import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cs")
public class class189 {

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "Lkn;")
    private class442 field2703;

    @OriginalMember(owner = "client!cs", name = "c", descriptor = "I")
    public static int field2705 = 0;

    @OriginalMember(owner = "client!cs", name = "h", descriptor = "Z")
    public static boolean field2710 = false;

    @OriginalMember(owner = "client!cs", name = "l", descriptor = "Z")
    public static boolean field2714 = true;

    @OriginalMember(owner = "client!cs", name = "i", descriptor = "I")
    public static int field2711 = 0;

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!cs", name = "e", descriptor = "I")
    public static int field2707;

    @OriginalMember(owner = "client!cs", name = "f", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!cs", name = "j", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!cs", name = "m", descriptor = "I")
    public static int field2715;

    @OriginalMember(owner = "client!cs", name = "n", descriptor = "I")
    public static int field2716;

    @OriginalMember(owner = "client!cs", name = "g", descriptor = "Lge;")
    private class425 field2709;

    @OriginalMember(owner = "client!cs", name = "d", descriptor = "Z")
    public static boolean field2706;

    @OriginalMember(owner = "client!cs", name = "k", descriptor = "[Z")
    public static boolean[] field2713;

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(ILkn;)V", line = 4)
    public final void method1353(int arg0, class442 arg1) {
        if (arg0 != 22303) {
            method1355(-126, -23);
        }
        this.field2703 = arg1;
        field2708++;
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(I)Lge;", line = 25)
    public final class425 method1354(int arg0) {
        field2704++;
        if (arg0 != -14082) {
            return null;
        }
        class425 var2 = this.field2703.field6329.field6074;
        if (this.field2703.field6329 == var2) {
            this.field2709 = null;
            return null;
        } else {
            this.field2709 = var2.field6074;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(II)V", line = 49)
    public static final void method1355(int arg0, int arg1) {
        class25.field311.method91(arg1 + 4, arg0);
        field2707++;
        class109.field1413.method91(4, arg0);
        if (arg1 == 0) {
            class40.field548.method91(4, arg0);
            class53.field686.method91(arg1 ^ 0x4, arg0);
            class295.field4267.method91(4, arg0);
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "()V", line = 72)
    public class189() {
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(I)Lge;", line = 78)
    public final class425 method1356(int arg0) {
        field2712++;
        class425 var2 = this.field2709;
        if (arg0 != -28309) {
            field2711 = -15;
        }
        if (this.field2703.field6329 == var2) {
            this.field2709 = null;
            return null;
        } else {
            this.field2709 = var2.field6074;
            return var2;
        }
    }

    @OriginalMember(owner = "client!cs", name = "a", descriptor = "(B)V", line = 100)
    public static void method1357(byte arg0) {
        int var1 = -107 % ((arg0 - 59) / 49);
        field2713 = null;
    }

    @OriginalMember(owner = "client!cs", name = "b", descriptor = "(II)V", line = 113)
    public static final void method1358(int arg0, int arg1) {
        class216.field3116 = arg0;
        field2716++;
        class15 var2 = class44.field592;
        synchronized (class44.field592) {
            class44.field592.method102((byte) -120);
            if (arg1 != 0) {
                method1357((byte) -40);
            }
        }
    }

    @OriginalMember(owner = "client!cs", name = "<init>", descriptor = "(Lkn;)V", line = 129)
    public class189(class442 arg0) {
        this.field2703 = arg0;
    }
}
