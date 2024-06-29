import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!le")
public class class43 extends class8 {

    @OriginalMember(owner = "client!le", name = "K", descriptor = "I")
    public static int field791 = 0;

    @OriginalMember(owner = "client!le", name = "J", descriptor = "I")
    public static int field790 = -1;

    @OriginalMember(owner = "client!le", name = "R", descriptor = "[I")
    public static int[] field798 = new int[50];

    @OriginalMember(owner = "client!le", name = "S", descriptor = "[I")
    public static int[] field799 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!le", name = "V", descriptor = "I")
    public static int field802 = 0;

    @OriginalMember(owner = "client!le", name = "N", descriptor = "[I")
    public static int[] field794 = new int[2500];

    @OriginalMember(owner = "client!le", name = "W", descriptor = "I")
    public static volatile int field803 = -1;

    @OriginalMember(owner = "client!le", name = "L", descriptor = "I")
    public static int field792;

    @OriginalMember(owner = "client!le", name = "O", descriptor = "I")
    public static int field795;

    @OriginalMember(owner = "client!le", name = "Q", descriptor = "I")
    public static int field797;

    @OriginalMember(owner = "client!le", name = "U", descriptor = "I")
    public static int field801;

    @OriginalMember(owner = "client!le", name = "T", descriptor = "Lwf;")
    public static class1 field800;

    @OriginalMember(owner = "client!le", name = "M", descriptor = "Ld;")
    public static class238 field793;

    @OriginalMember(owner = "client!le", name = "P", descriptor = "[S")
    public static short[] field796;

    @OriginalMember(owner = "client!le", name = "<init>", descriptor = "()V")
    public class43() {
        super(0, true);
    }

    @OriginalMember(owner = "client!le", name = "a", descriptor = "(JZ)V")
    public static final void method358(long arg0, boolean arg1) {
        field795++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg1) {
            field803 = 47;
        }
        if (arg0 % 10L == 0L) {
            class179.method1223(arg0 - 1L, (byte) 53);
            class179.method1223(1L, (byte) 88);
        } else {
            class179.method1223(arg0, (byte) 60);
        }
    }

    @OriginalMember(owner = "client!le", name = "b", descriptor = "(II)[I")
    public final int[] method44(int arg0, int arg1) {
        if (arg0 != 3) {
            field799 = null;
        }
        field801++;
        return class176.field2776;
    }

    @OriginalMember(owner = "client!le", name = "c", descriptor = "(III)Ldf;")
    public static final class55 method359(int arg0, int arg1, int arg2) {
        field792++;
        class55 var3 = (class55) class9.field117.method843(-41);
        if (arg0 != 1) {
            field803 = -106;
        }
        while (var3 != null) {
            if (var3.field949 && var3.method408(arg2, true, arg1)) {
                return var3;
            }
            var3 = (class55) class9.field117.method852((byte) 123);
        }
        return null;
    }

    @OriginalMember(owner = "client!le", name = "d", descriptor = "(Z)V")
    public static void method360(boolean arg0) {
        field798 = null;
        field796 = null;
        field799 = null;
        field794 = null;
        field793 = null;
        field800 = null;
        if (!arg0) {
            field790 = -76;
        }
    }
}
