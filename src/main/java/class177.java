import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class177 extends class216 {

    @OriginalMember(owner = "client!dh", name = "L", descriptor = "I")
    public int field3031 = 12800;

    @OriginalMember(owner = "client!dh", name = "G", descriptor = "I")
    public int field3027 = 0;

    @OriginalMember(owner = "client!dh", name = "E", descriptor = "I")
    public int field3025 = -1;

    @OriginalMember(owner = "client!dh", name = "K", descriptor = "I")
    public int field3030 = 12800;

    @OriginalMember(owner = "client!dh", name = "U", descriptor = "Z")
    public boolean field3040 = true;

    @OriginalMember(owner = "client!dh", name = "O", descriptor = "I")
    public int field3034 = 0;

    @OriginalMember(owner = "client!dh", name = "T", descriptor = "I")
    public int field3039;

    @OriginalMember(owner = "client!dh", name = "P", descriptor = "I")
    public int field3035;

    @OriginalMember(owner = "client!dh", name = "W", descriptor = "Lbd;")
    public class162 field3042;

    @OriginalMember(owner = "client!dh", name = "H", descriptor = "Lbd;")
    public class162 field3028;

    @OriginalMember(owner = "client!dh", name = "N", descriptor = "Lli;")
    public class18 field3033;

    @OriginalMember(owner = "client!dh", name = "I", descriptor = "[Lqj;")
    public static class195[] field3029 = new class195[4];

    @OriginalMember(owner = "client!dh", name = "Q", descriptor = "Lbd;")
    public static class162 field3036 = class17.method142(0, "hint_mapmarkers");

    @OriginalMember(owner = "client!dh", name = "M", descriptor = "Z")
    public static boolean field3032 = false;

    @OriginalMember(owner = "client!dh", name = "F", descriptor = "I")
    public static int field3026;

    @OriginalMember(owner = "client!dh", name = "R", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!dh", name = "S", descriptor = "I")
    public static int field3038;

    @OriginalMember(owner = "client!dh", name = "X", descriptor = "I")
    public static int field3043;

    @OriginalMember(owner = "client!dh", name = "V", descriptor = "Lvb;")
    public static class166 field3041;

    @OriginalMember(owner = "client!dh", name = "d", descriptor = "(B)V", line = 11)
    public static void method1341(byte arg0) {
        field3036 = null;
        field3041 = null;
        if (arg0 >= -109) {
            field3036 = (class162) null;
        }
        field3029 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(JI)V", line = 24)
    public static final void method1342(long arg0, int arg1) {
        if (arg1 != 1) {
            return;
        }
        field3043++;
        if (arg0 <= 0L) {
            return;
        }
        if (arg0 % 10L == 0L) {
            class12.method102((byte) 123, arg0 - 1L);
            class12.method102((byte) 118, 1L);
        } else {
            class12.method102((byte) 126, arg0);
        }
    }

    @OriginalMember(owner = "client!dh", name = "<init>", descriptor = "(Lbd;Lbd;IIIZ)V", line = 157)
    public class177(class162 arg0, class162 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3039 = arg3;
        this.field3040 = arg5;
        this.field3035 = arg2;
        this.field3025 = arg4;
        this.field3042 = arg1;
        this.field3028 = arg0;
        this.field3033 = new class18();
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(III)Z", line = 86)
    public final boolean method1343(int arg0, int arg1, int arg2) {
        field3038++;
        if (arg0 < this.field3031 || this.field3027 < arg0 || this.field3030 > arg2 || arg2 > this.field3034) {
            return false;
        }
        int var4 = -109 / ((arg1 - 1) / 50);
        for (class48 var5 = (class48) this.field3033.method169(-127); var5 != null; var5 = (class48) this.field3033.method165((byte) -101)) {
            if (var5.method354(arg0, arg2, 23638)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!dh", name = "e", descriptor = "(B)V", line = 124)
    public final void method1344(byte arg0) {
        this.field3034 = 0;
        this.field3027 = 0;
        this.field3031 = 12800;
        this.field3030 = 12800;
        int var2 = 13 / ((-arg0 - 31) / 44);
        for (class48 var3 = (class48) this.field3033.method169(-123); var3 != null; var3 = (class48) this.field3033.method165((byte) -101)) {
            if (var3.field768 > this.field3034) {
                this.field3034 = var3.field768;
            }
            if (this.field3031 > var3.field770) {
                this.field3031 = var3.field770;
            }
            if (this.field3027 < var3.field766) {
                this.field3027 = var3.field766;
            }
            if (var3.field769 < this.field3030) {
                this.field3030 = var3.field769;
            }
        }
        field3026++;
    }
}
