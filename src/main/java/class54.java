import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public class class54 implements class346 {

    @OriginalMember(owner = "client!mk", name = "i", descriptor = "Leq;")
    private class209 field1034;

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Ljava/util/Hashtable;")
    public static Hashtable field1029 = new Hashtable();

    @OriginalMember(owner = "client!mk", name = "h", descriptor = "I")
    public static int field1033 = -1;

    @OriginalMember(owner = "client!mk", name = "j", descriptor = "I")
    public static int field1035 = 0;

    @OriginalMember(owner = "client!mk", name = "f", descriptor = "Ljw;")
    public static class551 field1031 = new class551(6, 1);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!mk", name = "g", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(BZI)V")
    public static final void method490(byte arg0, boolean arg1, int arg2) {
        field1026++;
        int var3 = -71 / ((arg0 - 56) / 49);
        class416.method2539(class281.field3953.method1839((byte) 45, class744.field10426), 8, arg2, arg1);
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(I)V")
    public static final void method491(int arg0) {
        class184.field2629.method2082(328);
        field1028++;
        for (int var1 = arg0; var1 < 32; var1++) {
            class339.field4773[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class135.field2105[var2] = 0L;
        }
        class701.field9843 = 0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)Lqfa;")
    public final class98 method492(int arg0) {
        if (arg0 != -29480) {
            this.method492(-65);
        }
        field1027++;
        return class98.field1667;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)I")
    public final int method493(byte arg0) {
        field1030++;
        if (this.field1034.method1461(-22627)) {
            return 100;
        } else {
            if (arg0 != 124) {
                method494(-59, -62, true, 73, 84, -127, 26, 18);
            }
            return this.field1034.method1462(100);
        }
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IIZIIIII)V")
    public static final void method494(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1032++;
        if (~(arg2 ? class471.field6781.field6666.method3134(27669) : class471.field6781.field6690.method3134(arg7 + 27670)) != arg7 && arg4 != 0 && class570.field8115 < 50 && arg5 != -1) {
            class719.field10073[class570.field8115++] = new class710((byte) (arg2 ? 3 : 2), arg5, arg4, arg6, arg3, arg0, arg1, null);
        }
    }

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public static void method495(byte arg0) {
        field1031 = null;
        field1029 = null;
        int var1 = -26 % ((arg0 - 12) / 43);
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Leq;)V")
    public class54(class209 arg0) {
        this.field1034 = arg0;
    }
}
