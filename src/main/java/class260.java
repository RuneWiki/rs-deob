import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class260 {

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "Lcf;")
    public static class93 field4669 = class147.method1066("tbrefresh", -48);

    @OriginalMember(owner = "client!sa", name = "i", descriptor = "[Lcf;")
    public static class93[] field4676 = new class93[100];

    @OriginalMember(owner = "client!sa", name = "e", descriptor = "Lnh;")
    public static class54 field4672 = new class54(100);

    @OriginalMember(owner = "client!sa", name = "j", descriptor = "Lcf;")
    public static class93 field4677 = class147.method1066("brillant1:", -48);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field4668;

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "I")
    public static int field4671;

    @OriginalMember(owner = "client!sa", name = "f", descriptor = "I")
    public static int field4673;

    @OriginalMember(owner = "client!sa", name = "g", descriptor = "I")
    public static int field4674;

    @OriginalMember(owner = "client!sa", name = "h", descriptor = "I")
    public static int field4675;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "Ltd;")
    public static class72 field4670;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ZLtg;)Z")
    public static final boolean method1750(boolean arg0, class181 arg1) {
        field4673++;
        if (arg1.field3333 == null) {
            return false;
        } else if (arg0) {
            return true;
        } else {
            for (int var2 = 0; var2 < arg1.field3333.length; var2++) {
                int var3 = class102.method732(var2, 125, arg1);
                int var4 = arg1.field3247[var2];
                if (arg1.field3333[var2] == 2) {
                    if (var3 >= var4) {
                        return false;
                    }
                } else if (arg1.field3333[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (arg1.field3333[var2] == 4) {
                    if (var3 == var4) {
                        return false;
                    }
                } else if (var3 != var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V")
    public static void method1751(int arg0) {
        if (arg0 <= 85) {
            method1753((class93) null, (class93) null, (class93) null, 24, -63, 17);
        }
        field4676 = null;
        field4670 = null;
        field4669 = null;
        field4672 = null;
        field4677 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)I")
    public static final int method1752(int arg0, int arg1) {
        field4674++;
        int var2 = arg0 & 0x3F;
        int var3 = (arg0 & 0xF2) >> 6;
        if (arg1 != 21) {
            method1750(true, (class181) null);
        }
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lcf;Lcf;Lcf;III)V")
    public static final void method1753(class93 arg0, class93 arg1, class93 arg2, int arg3, int arg4, int arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class39.field606[var6] = class39.field606[var6 - 1];
            class253.field4550[var6] = class253.field4550[var6 - 1];
            class270.field4816[var6] = class270.field4816[var6 - 1];
            field4676[var6] = field4676[var6 - 1];
            class9.field133[var6] = class9.field133[var6 - 1];
        }
        class172.field3015++;
        class253.field4550[0] = arg2;
        class72.field1293 = class193.field3542;
        class270.field4816[0] = arg1;
        field4676[0] = arg0;
        field4675++;
        class39.field606[0] = arg5;
        class9.field133[0] = arg3;
        if (arg4 != -4252) {
            method1753((class93) null, (class93) null, (class93) null, -125, 48, -71);
        }
    }
}
