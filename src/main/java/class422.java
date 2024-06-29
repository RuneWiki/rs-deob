import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class422 extends class305 {

    @OriginalMember(owner = "client!ep", name = "i", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field6289;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "I")
    public static int field6291;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    public static int field6292;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public static int field6293;

    // $FF: synthetic field
    @OriginalMember(owner = "client!ep", name = "p", descriptor = "Ljava/lang/Class;")
    public static Class field6294;

    @OriginalMember(owner = "client!ep", name = "c", descriptor = "(II)I")
    public final int method306(int arg0, int arg1) {
        if (arg0 != 31401) {
            this.method303(123, -21);
        }
        ++field6289;
        return 1;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(II)V")
    public final void method303(int arg0, int arg1) {
        super.field4320 = arg1;
        if (arg0 == -27751) {
            ++field6291;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(B)I")
    public final int method305(byte arg0) {
        if (arg0 != 68) {
            return -16;
        } else {
            ++field6287;
            return super.field4323.method4104(arg0 ^ 49).method3293(24061) > 1 ? 4 : 2;
        }
    }

    @OriginalMember(owner = "client!ep", name = "e", descriptor = "(II)I")
    public static final int method2648(int arg0, int arg1) {
        if (arg0 != -21303) {
            return 38;
        } else {
            ++field6293;
            return arg1 & 1023;
        }
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(ILhb;)V")
    public class422(int arg0, class728 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Lbu;B)V")
    public static final void method2649(class19 arg0, byte arg1) {
        ++field6288;
        if (class80.field1136 != null) {
            class721 var2 = null;
            if (~arg0.field212 == -1) {
                var2 = (class721) class608.method3529(arg0.field209, arg0.field208, arg0.field211);
            }
            if (~arg0.field212 == -2) {
                var2 = (class721) class245.method1634(arg0.field209, arg0.field208, arg0.field211);
            }
            int var3 = -124 % ((45 - arg1) / 36);
            if (arg0.field212 == 2) {
                var2 = (class721) class755.method4208(arg0.field209, arg0.field208, arg0.field211, field6294 != null ? field6294 : (field6294 = method2651("jn")));
            }
            if (~arg0.field212 == -4) {
                var2 = (class721) class577.method3340(arg0.field209, arg0.field208, arg0.field211);
            }
            if (var2 != null) {
                arg0.field218 = var2.method317(119);
                arg0.field210 = var2.method309((byte) -38);
                arg0.field207 = var2.method327(-118);
            } else {
                arg0.field207 = 0;
                arg0.field218 = -1;
                arg0.field210 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(B)V")
    public final void method308(byte arg0) {
        if (super.field4320 < 0 && ~super.field4320 < -5) {
            super.field4320 = this.method305((byte) 68);
        }
        if (arg0 >= -40) {
            this.method308((byte) -94);
        }
        ++field6292;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(I)I")
    public final int method2650(int arg0) {
        ++field6290;
        return arg0 != 17503 ? -63 : super.field4320;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Lhb;)V")
    public class422(class728 arg0) {
        super(arg0);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2651(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
