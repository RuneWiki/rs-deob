import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class480 {

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "[I")
    public static int[] field6400 = new int[256];

    @OriginalMember(owner = "client!nga", name = "l", descriptor = "Lgj;")
    public static class593 field6411 = new class593();

    @OriginalMember(owner = "client!nga", name = "m", descriptor = "[I")
    public static int[] field6412 = new int[5];

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
    public int field6401;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
    public int field6403;

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "I")
    public static int field6405;

    @OriginalMember(owner = "client!nga", name = "g", descriptor = "I")
    public int field6406;

    @OriginalMember(owner = "client!nga", name = "h", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!nga", name = "i", descriptor = "I")
    public static int field6408;

    @OriginalMember(owner = "client!nga", name = "j", descriptor = "I")
    public static int field6409;

    @OriginalMember(owner = "client!nga", name = "k", descriptor = "I")
    public int field6410;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V", line = 7)
    public static void method2678(int arg0) {
        field6400 = null;
        if (arg0 != -17460) {
            field6408 = 99;
        }
        field6411 = null;
        field6412 = null;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(III)Z", line = 21)
    public static final boolean method2679(int arg0, int arg1, int arg2) {
        field6402++;
        if (arg1 == -1) {
            return (arg2 & 0x34) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(II)Z", line = 35)
    public static final boolean method2680(int arg0, int arg1) {
        field6404++;
        if (arg0 >= -53) {
            return true;
        } else {
            return arg1 == 7 || arg1 == 9;
        }
    }

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "(III)Z", line = 50)
    public static final boolean method2681(int arg0, int arg1, int arg2) {
        if (arg1 == 23978) {
            field6405++;
            return (arg0 & 0x8000) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 61)
    public static final void method2682(String arg0, boolean arg1) {
        class135.method1011("", "", arg0, 0, "", 0, 109);
        if (arg1) {
            field6407++;
        }
    }
}
