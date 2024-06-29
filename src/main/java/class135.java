import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class135 {

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lnh;")
    public class495 field2179;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field2172 = 328;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "Liv;")
    public static class565 field2178 = new class565();

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public static int field2173;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field2174;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 5)
    public void method381(int arg0) {
        if (arg0 <= 125) {
            field2172 = -9;
        }
        field2174++;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 17)
    public void method383(byte arg0) {
        if (arg0 >= 25) {
            field2175++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(I)V", line = 31)
    public static final void method1035(int arg0) {
        if (arg0 != 16628) {
            method1036(75);
        }
        field2173++;
        if (!class213.field3233) {
            return;
        }
        while (true) {
            while (class347.field4912 < class432.field6219.length) {
                class613 var1 = class432.field6219[class347.field4912];
                if (var1 != null && var1.field8779 == -1) {
                    if (class619.field8831 == null) {
                        class619.field8831 = class294.field4105.method1548(var1.field8780, 0);
                    }
                    int var2 = class619.field8831.field1478;
                    if (var2 == -1) {
                        return;
                    }
                    var1.field8779 = var2;
                    class619.field8831 = null;
                    class347.field4912++;
                } else {
                    class347.field4912++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "(I)V", line = 77)
    public void method378(int arg0) {
        if (arg0 == 0) {
            field2177++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "(I)V", line = 87)
    public static void method1036(int arg0) {
        field2178 = null;
        if (arg0 != 1634) {
            field2178 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)V", line = 98)
    public void method1037(int arg0) {
        field2176++;
        if (arg0 != -13501) {
            method1036(93);
        }
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V", line = 112)
    public void method380(byte arg0) {
        field2171++;
        if (arg0 <= 63) {
            field2172 = 0;
        }
    }

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "(I)V", line = 123)
    public void method382(int arg0) {
        if (arg0 <= -34) {
            field2180++;
        }
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(Lnh;)V", line = 138)
    public class135(class495 arg0) {
        this.field2179 = arg0;
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(I)V")
    public abstract void method385(int arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ZI)V")
    public abstract void method376(boolean arg0, int arg1);

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "(I)Z")
    public abstract boolean method379(int arg0);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Laj;II)V")
    public abstract void method384(class402 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZ)V")
    public abstract void method375(int arg0, boolean arg1);

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(III)V")
    public abstract void method377(int arg0, int arg1, int arg2);
}
