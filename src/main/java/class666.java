import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class666 extends class331 {

    @OriginalMember(owner = "client!ji", name = "u", descriptor = "Lus;")
    public static class328 field9121 = new class328(27, 15);

    @OriginalMember(owner = "client!ji", name = "v", descriptor = "Lus;")
    public static class328 field9122 = new class328(77, 2);

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "I")
    public static int field9113;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field9114;

    @OriginalMember(owner = "client!ji", name = "o", descriptor = "I")
    public static int field9115;

    @OriginalMember(owner = "client!ji", name = "p", descriptor = "I")
    public static int field9116;

    @OriginalMember(owner = "client!ji", name = "q", descriptor = "I")
    public static int field9117;

    @OriginalMember(owner = "client!ji", name = "r", descriptor = "I")
    public static int field9118;

    @OriginalMember(owner = "client!ji", name = "s", descriptor = "I")
    public static int field9119;

    @OriginalMember(owner = "client!ji", name = "t", descriptor = "I")
    public static int field9120;

    @OriginalMember(owner = "client!ji", name = "w", descriptor = "I")
    public static int field9123;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(B)I")
    public final int method3604(byte arg0) {
        if (arg0 > -119) {
            field9122 = null;
        }
        ++field9119;
        return super.field4202;
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            method3606(116, 76);
        }
        ++field9123;
        return 1;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(ILts;)V")
    public class666(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        ++field9116;
        if (arg1 != 1) {
            return 91;
        } else if (super.field4203.method344((byte) -84)) {
            return 3;
        } else if (super.field4203.method345((byte) 122) == class400.field5535) {
            if (~arg0 == -1) {
                if (super.field4203.field585.method3565((byte) -123) == 1) {
                    return 2;
                }
                if (~super.field4203.field621.method2399((byte) -123) == -2) {
                    return 2;
                }
                if (~super.field4203.field604.method1060((byte) -126) < -1) {
                    return 2;
                }
            }
            return 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(B)Z")
    public final boolean method3605(byte arg0) {
        ++field9117;
        if (super.field4203.method344((byte) -9)) {
            return false;
        } else if (super.field4203.method345((byte) 122) == class400.field5535) {
            return true;
        } else {
            return arg0 <= 103;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        ++field9120;
        if (arg0 == -1959) {
            if (super.field4203.method345((byte) 122) != class400.field5535) {
                super.field4202 = 1;
            } else if (super.field4203.method344((byte) 25)) {
                super.field4202 = 0;
            }
            if (super.field4202 != 0 && super.field4202 != 1) {
                super.field4202 = this.method226((byte) 13);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        super.field4202 = arg1;
        ++field9113;
        if (arg0 <= 113) {
            field9121 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "(II)Z")
    public static final boolean method3606(int arg0, int arg1) {
        ++field9115;
        if (class499.field7058[arg1]) {
            return true;
        } else if (!class456.field6390.method3818((byte) 81, arg1)) {
            return false;
        } else {
            int var2 = class456.field6390.method3812(0, arg1);
            if (~var2 == -1) {
                class499.field7058[arg1] = true;
                return true;
            } else {
                int var3 = 14 % ((-29 - arg0) / 49);
                if (class323.field4125[arg1] == null) {
                    class323.field4125[arg1] = new class460[var2];
                }
                for (int var4 = 0; var4 < var2; ++var4) {
                    if (class323.field4125[arg1][var4] == null) {
                        byte[] var5 = class456.field6390.method3810(arg1, -23360, var4);
                        if (var5 != null) {
                            class460 var6 = class323.field4125[arg1][var4] = new class460();
                            var6.field6524 = (arg1 << 16) + var4;
                            if (~var5[0] != 0) {
                                throw new IllegalStateException("if1");
                            }
                            var6.method2695(false, new class179(var5));
                        }
                    }
                }
                class499.field7058[arg1] = true;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "(Lts;)V")
    public class666(class41 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(Z)V")
    public static void method3607(boolean arg0) {
        field9122 = null;
        if (arg0) {
            field9121 = null;
        }
    }
}
