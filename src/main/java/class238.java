import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class238 extends class159 {

    @OriginalMember(owner = "client!dn", name = "q", descriptor = "I")
    public static int field3763 = -1;

    @OriginalMember(owner = "client!dn", name = "u", descriptor = "[I")
    public static int[] field3767 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!dn", name = "l", descriptor = "I")
    public int field3758;

    @OriginalMember(owner = "client!dn", name = "m", descriptor = "I")
    public static int field3759;

    @OriginalMember(owner = "client!dn", name = "n", descriptor = "I")
    public int field3760;

    @OriginalMember(owner = "client!dn", name = "o", descriptor = "I")
    public int field3761;

    @OriginalMember(owner = "client!dn", name = "p", descriptor = "I")
    public int field3762;

    @OriginalMember(owner = "client!dn", name = "r", descriptor = "I")
    public int field3764;

    @OriginalMember(owner = "client!dn", name = "s", descriptor = "I")
    public int field3765;

    @OriginalMember(owner = "client!dn", name = "t", descriptor = "I")
    public static int field3766;

    @OriginalMember(owner = "client!dn", name = "v", descriptor = "I")
    public int field3768;

    @OriginalMember(owner = "client!dn", name = "w", descriptor = "I")
    public int field3769;

    @OriginalMember(owner = "client!dn", name = "x", descriptor = "I")
    public int field3770;

    @OriginalMember(owner = "client!dn", name = "y", descriptor = "I")
    public int field3771;

    @OriginalMember(owner = "client!dn", name = "z", descriptor = "I")
    public int field3772;

    @OriginalMember(owner = "client!dn", name = "A", descriptor = "I")
    public int field3773;

    @OriginalMember(owner = "client!dn", name = "B", descriptor = "I")
    public static int field3774;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(II)Z", line = 9)
    public static final boolean method1667(int arg0, int arg1) {
        if (arg0 != 1) {
            field3767 = (int[]) null;
        }
        field3759++;
        return (-arg1 & arg1) == arg1;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(ILfh;B)Ljava/lang/String;", line = 21)
    public static final String method1668(int arg0, class313 arg1, byte arg2) {
        if (arg2 != -73) {
            return (String) null;
        }
        field3766++;
        try {
            int var3 = arg1.method2201(128);
            if (var3 > arg0) {
                var3 = arg0;
            }
            byte[] var4 = new byte[var3];
            arg1.field5137 += class138.field2182.method42(arg1.field5124, (byte) 73, arg1.field5137, 0, var3, var4);
            return class315.method2264(var4, var3, 0, 0);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!dn", name = "d", descriptor = "(I)V", line = 61)
    public static void method1669(int arg0) {
        field3767 = null;
        if (arg0 != 1) {
            method1668(34, (class313) null, (byte) 72);
        }
    }
}
