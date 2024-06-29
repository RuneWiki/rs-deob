import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class257 {

    @OriginalMember(owner = "client!oj", name = "d", descriptor = "I")
    public int field3730 = 2048;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public int field3734 = 2048;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public int field3735 = 0;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public int field3738 = 0;

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "Lop;")
    public static class124 field3728 = new class124("WTWIP", 3);

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public static int field3733 = -1;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Liv;")
    public static class64 field3736 = new class64(68, 12);

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "I")
    public static int field3727;

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "I")
    public static int field3729;

    @OriginalMember(owner = "client!oj", name = "f", descriptor = "I")
    public static int field3732;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field3737;

    @OriginalMember(owner = "client!oj", name = "e", descriptor = "Lqj;")
    public static class351 field3731;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static final void method1664(byte arg0) {
        field3737++;
        class55 var1 = class175.field2676;
        synchronized (class175.field2676) {
            class175.field2676.method488(-3);
        }
        if (arg0 > 30) {
            class55 var2 = class345.field5180;
            synchronized (class345.field5180) {
                class345.field5180.method488(-3);
            }
        }
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ILcu;I)V")
    private final void method1665(int arg0, class145 arg1, int arg2) {
        int var4 = 76 % ((-arg2 - 5) / 62);
        if (arg0 == 1) {
            this.field3735 = arg1.method1063((byte) 102);
        } else if (arg0 == 2) {
            this.field3730 = arg1.method1069((byte) -69);
        } else if (arg0 == 3) {
            this.field3734 = arg1.method1069((byte) -65);
        } else if (arg0 == 4) {
            this.field3738 = arg1.method1122(65280);
        }
        field3732++;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(Lcu;I)V")
    public final void method1666(class145 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method1063((byte) 111);
            if (var3 == 0) {
                field3727++;
                if (arg1 != 0) {
                    method1667((byte) -114);
                    return;
                }
                return;
            }
            this.method1665(var3, arg0, -86);
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(B)V")
    public static void method1667(byte arg0) {
        field3728 = null;
        if (arg0 != -78) {
            method1667((byte) 84);
        }
        field3736 = null;
        field3731 = null;
    }
}
