import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class178 extends class235 {

    @OriginalMember(owner = "client!va", name = "db", descriptor = "Le;")
    private static class191 field3057 = class54.method368("Loaded fonts", 2047);

    @OriginalMember(owner = "client!va", name = "gb", descriptor = "Lc;")
    public static class60 field3060 = null;

    @OriginalMember(owner = "client!va", name = "hb", descriptor = "Le;")
    public static class191 field3061 = class54.method368(" )2> <col=ffff00>", 2047);

    @OriginalMember(owner = "client!va", name = "T", descriptor = "Le;")
    public static class191 field3053 = field3057;

    @OriginalMember(owner = "client!va", name = "jb", descriptor = "I")
    public static int field3063 = 0;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "I")
    public static int field3055;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
    public int field3056;

    @OriginalMember(owner = "client!va", name = "fb", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!va", name = "ib", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "Lr;")
    public class59 field3054;

    @OriginalMember(owner = "client!va", name = "eb", descriptor = "[B")
    public byte[] field3058;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Z)V")
    public static void method1195(boolean arg0) {
        field3053 = null;
        field3060 = null;
        field3057 = null;
        if (arg0) {
            method1197((class225) null, (class191) null, true);
        }
        field3061 = null;
    }

    @OriginalMember(owner = "client!va", name = "f", descriptor = "(I)[B")
    public final byte[] method77(int arg0) {
        ++field3059;
        if (super.field4183) {
            throw new RuntimeException();
        } else {
            return arg0 != -15219 ? null : this.field3058;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(IIIBII)V")
    public static final void method1196(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        ++field3062;
        if (arg3 <= 14) {
            field3060 = null;
        }
        int var6 = class213.method1459(arg4, (byte) -74, class242.field4314, class99.field1584);
        int var7 = class213.method1459(arg1, (byte) -53, class242.field4314, class99.field1584);
        int var8 = class213.method1459(arg2, (byte) -114, class37.field678, class207.field3680);
        int var9 = class213.method1459(arg0, (byte) -24, class37.field678, class207.field3680);
        for (int var10 = var6; var10 <= var7; ++var10) {
            class242.method1700(7, arg5, var9, class232.field4151[var10], var8);
        }
    }

    @OriginalMember(owner = "client!va", name = "g", descriptor = "(I)I")
    public final int method80(int arg0) {
        ++field3052;
        if (super.field4183) {
            return 0;
        } else {
            if (arg0 < 29) {
                field3063 = -94;
            }
            return 100;
        }
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lji;Le;Z)I")
    public static final int method1197(class225 arg0, class191 arg1, boolean arg2) {
        ++field3055;
        int var3 = arg0.field3996;
        arg0.method1561(-105, arg1.field3379);
        arg0.field3996 += class97.field1556.method1231(7, arg0.field3995, arg1.field3379, arg1.field3392, arg0.field3996, 0);
        if (!arg2) {
            method1197((class225) null, (class191) null, true);
        }
        return -var3 + arg0.field3996;
    }
}
