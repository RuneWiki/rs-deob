import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qg")
public class class181 extends class146 {

    @OriginalMember(owner = "client!qg", name = "n", descriptor = "I")
    public static int field3097 = 0;

    @OriginalMember(owner = "client!qg", name = "o", descriptor = "Lka;")
    public static class131 field3098 = class89.method532((byte) -11);

    @OriginalMember(owner = "client!qg", name = "p", descriptor = "Lub;")
    private static class227 field3099 = class257.method1749("Walk here", 17263);

    @OriginalMember(owner = "client!qg", name = "q", descriptor = "Lub;")
    public static class227 field3100 = field3099;

    @OriginalMember(owner = "client!qg", name = "j", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!qg", name = "k", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!qg", name = "l", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!qg", name = "m", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(B)V")
    public static void method1156(byte arg0) {
        field3100 = null;
        if (arg0 < 65) {
            method1156((byte) -98);
        }
        field3099 = null;
        field3098 = null;
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(ILn;I)[Lna;")
    public static final class209[] method1157(int arg0, class138 arg1, int arg2) {
        field3093++;
        if (arg2 != -3169) {
            field3098 = null;
        }
        return class115.method728(false, arg1, arg0) ? class148.method939(-6375) : null;
    }

    @OriginalMember(owner = "client!qg", name = "c", descriptor = "(I)V")
    public static final void method1158(int arg0) {
        class186.field3173 = null;
        class29.field473 = null;
        field3094++;
        class2.field31 = null;
        class245.field4272 = null;
        if (arg0 >= -124) {
            field3098 = null;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(IZ)I")
    public static final int method1159(int arg0, boolean arg1) {
        if (arg1) {
            field3095++;
            return arg0 == 16711935 ? -1 : class218.method1378(arg0, 126);
        } else {
            return 88;
        }
    }

    @OriginalMember(owner = "client!qg", name = "a", descriptor = "(Lub;IILub;ILub;)V")
    public static final void method1160(class227 arg0, int arg1, int arg2, class227 arg3, int arg4, class227 arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class204.field3477[var6] = class204.field3477[var6 - 1];
            class167.field2801[var6] = class167.field2801[var6 - 1];
            class167.field2805[var6] = class167.field2805[var6 - 1];
            class195.field3324[var6] = class195.field3324[var6 - 1];
            class148.field2593[var6] = class148.field2593[var6 - 1];
        }
        class95.field1649 = class77.field1356;
        class91.field1562++;
        class204.field3477[0] = arg4;
        class148.field2593[0] = arg2;
        field3096++;
        class167.field2801[0] = arg0;
        class167.field2805[0] = arg3;
        class195.field3324[arg1] = arg5;
    }
}
