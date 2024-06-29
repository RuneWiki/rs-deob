import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public abstract class class471 {

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "[F")
    public static float[] field6778 = new float[16];

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "I")
    public static int field6777;

    @OriginalMember(owner = "client!oga", name = "c", descriptor = "I")
    public static int field6779;

    @OriginalMember(owner = "client!oga", name = "d", descriptor = "I")
    public static int field6780;

    @OriginalMember(owner = "client!oga", name = "e", descriptor = "Lcq;")
    public static class464 field6781;

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(B)V")
    public static void method2855(byte arg0) {
        field6781 = null;
        field6778 = null;
        if (arg0 != -70) {
            method2856(70, -6, -7);
        }
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(III)Z")
    public static final boolean method2856(int arg0, int arg1, int arg2) {
        if (arg0 != 7) {
            method2855((byte) -60);
        }
        field6780++;
        return (arg2 & 0x800) != 0;
    }

    @OriginalMember(owner = "client!oga", name = "b", descriptor = "(B)V")
    public abstract void method1538(byte arg0);

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(Z)Lou;")
    public abstract class602 method1541(boolean arg0);

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(I)V")
    public abstract void method1535(int arg0);

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(BI)Z")
    public static final boolean method2857(byte arg0, int arg1) {
        if (arg0 != 72) {
            method2856(12, -60, -16);
        }
        field6777++;
        return arg1 != 1 && arg1 != 7;
    }

    @OriginalMember(owner = "client!oga", name = "a", descriptor = "(II)Z")
    public abstract boolean method1540(int arg0, int arg1);
}
