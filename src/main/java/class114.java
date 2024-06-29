import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public abstract class class114 {

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field1649 = 0;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "Lhl;")
    public static class40 field1650 = new class40(64);

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field1652 = 0;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "I")
    public static int field1648;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "Llc;")
    public static class86 field1646;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIIIIBI)I")
    public static final int method838(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (arg5 > -33) {
            field1649 = 53;
        }
        field1647++;
        if ((arg1 & 0x1) == 1) {
            int var7 = arg0;
            arg0 = arg2;
            arg2 = var7;
        }
        int var8 = arg6 & 0x3;
        if (var8 == 0) {
            return arg4;
        } else if (var8 == 1) {
            return arg3;
        } else if (var8 == 2) {
            return 1 + 7 - arg4 - arg0;
        } else {
            return -arg2 - (arg3 - 1 - 7);
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V")
    public static void method839(int arg0) {
        if (arg0 == 9565) {
            field1650 = null;
            field1646 = null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ILjava/awt/Component;)V")
    public abstract void method840(int arg0, Component arg1);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)I")
    public abstract int method841(boolean arg0);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method842(Component arg0, byte arg1);

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZII)I")
    public static final int method843(boolean arg0, int arg1, int arg2) {
        int var3 = 0;
        if (!arg0) {
            field1651 = 40;
        }
        while (arg1 > 0) {
            var3 = var3 << 1 | arg2 & 0x1;
            arg1--;
            arg2 >>>= 0x1;
        }
        field1648++;
        return var3;
    }
}
