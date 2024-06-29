import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gt")
public class class317 extends class147 implements class503 {

    @OriginalMember(owner = "client!gt", name = "T", descriptor = "Lfr;")
    public class283 field4348;

    @OriginalMember(owner = "client!gt", name = "O", descriptor = "Z")
    private boolean field4343;

    @OriginalMember(owner = "client!gt", name = "D", descriptor = "Lwj;")
    public static class270 field4332 = new class270(53, 2);

    @OriginalMember(owner = "client!gt", name = "V", descriptor = "[Ljava/lang/String;")
    public static String[] field4350 = new String[] { "en", "de", "fr", "pt", "nl" };

    @OriginalMember(owner = "client!gt", name = "B", descriptor = "I")
    public static int field4330;

    @OriginalMember(owner = "client!gt", name = "C", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!gt", name = "E", descriptor = "I")
    public static int field4333;

    @OriginalMember(owner = "client!gt", name = "F", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!gt", name = "G", descriptor = "I")
    public static int field4335;

    @OriginalMember(owner = "client!gt", name = "H", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!gt", name = "I", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!gt", name = "J", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!gt", name = "K", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!gt", name = "L", descriptor = "I")
    public static int field4340;

    @OriginalMember(owner = "client!gt", name = "M", descriptor = "I")
    public static int field4341;

    @OriginalMember(owner = "client!gt", name = "N", descriptor = "I")
    public static int field4342;

    @OriginalMember(owner = "client!gt", name = "P", descriptor = "I")
    public static int field4344;

    @OriginalMember(owner = "client!gt", name = "Q", descriptor = "I")
    public static int field4345;

    @OriginalMember(owner = "client!gt", name = "R", descriptor = "I")
    public static int field4346;

    @OriginalMember(owner = "client!gt", name = "S", descriptor = "I")
    public static int field4347;

    @OriginalMember(owner = "client!gt", name = "U", descriptor = "I")
    public static int field4349;

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(BLya;I)Lt;")
    public final class471 method488(byte arg0, class38 arg1, int arg2) {
        if (arg0 != 124) {
            this.method486(16, (class38) null);
        }
        ++field4346;
        return this.field4348.method1687((byte) 56, false, false, 0, 0, arg1, arg2);
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(ILya;)V")
    public final void method493(int arg0, class38 arg1) {
        ++field4342;
        if (arg0 >= -114) {
            this.method486(-70, (class38) null);
        }
        class471 var3 = this.field4348.method1687((byte) 56, true, false, super.field2119, super.field2121, arg1, 262144);
        if (var3 != null) {
            int var4 = super.field2119 >> 7;
            int var5 = super.field2121 >> 7;
            this.field4348.method1681(false, var5, arg1, var4, var4, var5, var3, (byte) 72);
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ILya;)V")
    public final void method482(int arg0, class38 arg1) {
        this.field4348.method1688((byte) -121, arg1);
        ++field4336;
        if (arg0 >= -56) {
            this.method499(16);
        }
    }

    @OriginalMember(owner = "client!gt", name = "<init>", descriptor = "(Lya;Ljo;IIIIIZIIIIII)V")
    public class317(class38 arg0, class220 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class94.method694(arg11, arg12, true));
        this.field4348 = new class283(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field4343 = arg1.field3119 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(III)Z")
    public static final boolean method1850(int arg0, int arg1, int arg2) {
        ++field4341;
        if (arg2 != 0) {
            method1854(-52, -86);
        }
        return (arg0 & 34) != 0;
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(B)V")
    public static void method1851(byte arg0) {
        if (arg0 <= 113) {
            field4338 = -72;
        }
        field4332 = null;
        field4350 = null;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(Lya;B)Lmf;")
    public final class289 method484(class38 arg0, byte arg1) {
        ++field4337;
        class471 var3 = this.field4348.method1687((byte) 56, true, false, super.field2119, super.field2121, arg0, 2048);
        if (var3 == null) {
            return null;
        } else {
            class122 var4 = arg0.method280();
            if (arg1 <= 111) {
                return null;
            } else {
                var4.method182(super.field2123 + super.field2119, super.field2131, super.field2134 + super.field2121);
                class289 var5 = null;
                if (this.field4343) {
                    var5 = class165.method1099(true, 1);
                }
                if (this.field4348.field3874 == null) {
                    var3.method397(var4, var5 != null ? var5.field4009[0] : null, 0);
                } else {
                    class523 var6 = this.field4348.field3874.method1193();
                    arg0.method312(var3, var6, var4, var5 != null ? var5.field4009[0] : null, 0);
                }
                int var7 = super.field2119 >> 7;
                int var8 = super.field2121 >> 7;
                this.field4348.method1681(true, var8, arg0, var7, var7, var8, var3, (byte) 72);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!gt", name = "c", descriptor = "(I)Z")
    public final boolean method489(int arg0) {
        ++field4334;
        int var2 = 105 / ((arg0 - 23) / 62);
        return this.field4348.method1680(-1);
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(ILya;)V")
    public final void method486(int arg0, class38 arg1) {
        this.field4348.method1679((byte) -122, arg1);
        if (arg0 == 9229) {
            ++field4333;
        }
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(ZILya;I)Z")
    public final boolean method500(boolean arg0, int arg1, class38 arg2, int arg3) {
        if (!arg0) {
            this.field4343 = true;
        }
        ++field4345;
        class471 var5 = this.field4348.method1687((byte) 56, false, false, super.field2119, super.field2121, arg2, 131072);
        if (var5 == null) {
            return false;
        } else {
            class122 var6 = arg2.method280();
            var6.method182(super.field2123 + super.field2119, super.field2131, super.field2134 + super.field2121);
            return var5.method391(arg3, arg1, var6, false);
        }
    }

    @OriginalMember(owner = "client!gt", name = "e", descriptor = "(I)I")
    public final int method499(int arg0) {
        ++field4340;
        return arg0 != -15561 ? -68 : this.field4348.field3891;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(I)I")
    public final int method496(int arg0) {
        ++field4331;
        int var2 = 123 / ((arg0 - -4) / 61);
        return this.field4348.field3872;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IB)Z")
    public static final boolean method1852(int arg0, byte arg1) {
        if (arg1 < 122) {
            method1853(97, 15, true);
        }
        ++field4344;
        return arg0 == 0 || ~arg0 == -2 || ~arg0 == -3;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(IIZ)V")
    public static final void method1853(int arg0, int arg1, boolean arg2) {
        ++field4335;
        class97 var3 = class348.method2064(0, 15, -52);
        var3.method712((byte) -93);
        var3.field1468 = arg0;
        if (arg2) {
            method1853(94, -87, false);
        }
        var3.field1471 = arg1;
    }

    @OriginalMember(owner = "client!gt", name = "a", descriptor = "(II)V")
    public static final void method1854(int arg0, int arg1) {
        ++field4349;
        if (class485.field7088 == null || ~class485.field7088.length > ~arg1) {
            class485.field7088 = new int[arg1];
        }
        if (arg0 >= -88) {
            field4338 = 21;
        }
    }

    @OriginalMember(owner = "client!gt", name = "b", descriptor = "(I)V")
    public final void method485(int arg0) {
        if (arg0 <= -92) {
            ++field4339;
        }
    }

    @OriginalMember(owner = "client!gt", name = "i", descriptor = "(I)I")
    public final int method988(int arg0) {
        if (arg0 < 108) {
            field4350 = null;
        }
        ++field4330;
        return this.field4348.method1684(4);
    }

    @OriginalMember(owner = "client!gt", name = "d", descriptor = "(I)I")
    public final int method490(int arg0) {
        if (arg0 != -29679) {
            field4350 = null;
        }
        ++field4347;
        return this.field4348.field3887;
    }
}
