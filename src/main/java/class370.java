import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ufa")
public class class370 extends class190 implements class599 {

    @OriginalMember(owner = "client!ufa", name = "jb", descriptor = "Z")
    private boolean field4869 = false;

    @OriginalMember(owner = "client!ufa", name = "lb", descriptor = "Lsw;")
    public class11 field4871;

    @OriginalMember(owner = "client!ufa", name = "Y", descriptor = "Z")
    private boolean field4858;

    @OriginalMember(owner = "client!ufa", name = "db", descriptor = "Z")
    public static boolean field4863 = false;

    @OriginalMember(owner = "client!ufa", name = "nb", descriptor = "Ljava/lang/String;")
    public static String field4873 = null;

    @OriginalMember(owner = "client!ufa", name = "Q", descriptor = "I")
    public static int field4850;

    @OriginalMember(owner = "client!ufa", name = "R", descriptor = "I")
    public static int field4851;

    @OriginalMember(owner = "client!ufa", name = "S", descriptor = "I")
    public static int field4852;

    @OriginalMember(owner = "client!ufa", name = "T", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!ufa", name = "U", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!ufa", name = "V", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!ufa", name = "W", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!ufa", name = "X", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!ufa", name = "Z", descriptor = "I")
    public static int field4859;

    @OriginalMember(owner = "client!ufa", name = "ab", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!ufa", name = "bb", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!ufa", name = "cb", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!ufa", name = "eb", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!ufa", name = "gb", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!ufa", name = "hb", descriptor = "I")
    public static int field4867;

    @OriginalMember(owner = "client!ufa", name = "ib", descriptor = "I")
    public static int field4868;

    @OriginalMember(owner = "client!ufa", name = "kb", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!ufa", name = "mb", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!ufa", name = "ob", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!ufa", name = "fb", descriptor = "Lcu;")
    private class475 field4865;

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lr;I)V")
    public final void method700(class562 arg0, int arg1) {
        if (arg1 == -21186) {
            this.field4871.method65(-109, arg0);
            ++field4857;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ILir;ZILr;IB)V")
    public final void method169(int arg0, class27 arg1, boolean arg2, int arg3, class562 arg4, int arg5, byte arg6) {
        if (arg6 < -117) {
            ++field4867;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ufa", name = "n", descriptor = "(I)V")
    public static void method2139(int arg0) {
        field4873 = null;
        if (arg0 != 2048) {
            method2139(-123);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(I)I")
    public final int method706(int arg0) {
        if (arg0 != 16259) {
            this.method167(true, (class562) null, 65, -4);
        }
        ++field4852;
        return this.field4871.field129;
    }

    @OriginalMember(owner = "client!ufa", name = "<init>", descriptor = "(Lr;Ltc;IIIIIZIII)V")
    public class370(class562 arg0, class600 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10) {
        super(arg4, arg5, arg6, arg2, arg3, class447.method2519(arg8, arg9, 3));
        this.field4871 = new class11(arg0, arg1, arg8, arg9, super.field385, arg3, super.field398, super.field397, arg7, arg10);
        this.field4858 = ~arg1.field8293 != -1 && !arg7;
    }

    @OriginalMember(owner = "client!ufa", name = "c", descriptor = "(B)V")
    public final void method175(byte arg0) {
        if (arg0 > 24) {
            ++field4874;
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(ZLr;II)Z")
    public final boolean method167(boolean arg0, class562 arg1, int arg2, int arg3) {
        ++field4866;
        class470 var5 = this.field4871.method67(arg0, super.field398, super.field397, false, arg1, 0, 131072);
        if (var5 == null) {
            return false;
        } else {
            class487 var6 = arg1.method1153();
            var6.method359(super.field398, super.field388, super.field397);
            return !class347.field4632 ? var5.method655(arg3, arg2, var6, false) : var5.method603(arg3, arg2, var6, false, class414.field5430);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "i", descriptor = "(I)Z")
    public final boolean method166(int arg0) {
        ++field4860;
        if (arg0 != 0) {
            this.method165((byte) -21, (class562) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lr;B)V")
    public final void method707(class562 arg0, byte arg1) {
        ++field4872;
        this.field4871.method61(arg0, (byte) -93);
        int var3 = -118 / ((-28 - arg1) / 54);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(B)I")
    public final int method710(byte arg0) {
        ++field4855;
        return arg0 <= 55 ? 125 : this.field4871.field131;
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(I)Z")
    public final boolean method705(int arg0) {
        ++field4868;
        if (arg0 <= 67) {
            this.method700((class562) null, 45);
        }
        return this.field4871.method59(0);
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(I)V")
    public final void method703(int arg0) {
        ++field4853;
        if (arg0 != 6956) {
            this.method161(19);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "j", descriptor = "(I)Z")
    public final boolean method168(int arg0) {
        if (arg0 != 20071) {
            this.field4858 = false;
        }
        ++field4859;
        return this.field4869;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(BLr;)Lqw;")
    public final class329 method165(byte arg0, class562 arg1) {
        ++field4856;
        class470 var3 = this.field4871.method67(false, super.field398, super.field397, true, arg1, 0, 2048);
        if (var3 == null) {
            return null;
        } else {
            class487 var4 = arg1.method1153();
            var4.method359(super.field398, super.field388, super.field397);
            class329 var5 = null;
            if (this.field4858) {
                var5 = class541.method3035(27479, 1);
            }
            int var6 = super.field398 >> 9;
            int var7 = super.field397 >> 9;
            this.field4871.method62(var4, var7, var3, -20068, arg1, true, var6, var6, var7);
            if (!class347.field4632) {
                var3.method625(var4, var5 == null ? null : var5.field4414[0], 0);
            } else {
                var3.method648(var4, var5 != null ? var5.field4414[0] : null, class414.field5430, 0);
            }
            if (this.field4871.field122 != null) {
                class144 var8 = this.field4871.field122.method2915();
                if (!class347.field4632) {
                    arg1.method1096(var8);
                } else {
                    arg1.method1120(var8, class414.field5430);
                }
            }
            this.field4869 = var3.method657() || this.field4871.field122 != null;
            if (this.field4865 != null) {
                class424.method2404(var3, -17171, super.field397, super.field398, this.field4865, super.field388);
            } else {
                this.field4865 = class258.method1562(super.field398, (byte) -47, super.field397, var3, super.field388);
            }
            if (arg0 < 109) {
                field4863 = false;
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(B)I")
    public final int method699(byte arg0) {
        if (arg0 > -32) {
            this.method706(-112);
        }
        ++field4864;
        return this.field4871.field124;
    }

    @OriginalMember(owner = "client!ufa", name = "l", descriptor = "(I)I")
    public final int method173(int arg0) {
        if (arg0 != 0) {
            this.field4871 = null;
        }
        ++field4870;
        return this.field4871.method63(arg0 ^ -124);
    }

    @OriginalMember(owner = "client!ufa", name = "f", descriptor = "(I)Z")
    public final boolean method161(int arg0) {
        ++field4861;
        if (arg0 != 28602) {
            this.field4869 = false;
        }
        return false;
    }

    @OriginalMember(owner = "client!ufa", name = "a", descriptor = "(Lr;Z)V")
    public final void method177(class562 arg0, boolean arg1) {
        ++field4850;
        class470 var3 = this.field4871.method67(true, super.field398, super.field397, arg1, arg0, 0, 262144);
        if (var3 != null) {
            int var4 = super.field398 >> 9;
            int var5 = super.field397 >> 9;
            class487 var6 = arg0.method1153();
            var6.method359(super.field398, super.field388, super.field397);
            this.field4871.method62(var6, var5, var3, -20068, arg0, false, var4, var4, var5);
        }
    }

    @OriginalMember(owner = "client!ufa", name = "b", descriptor = "(Lr;I)Lcu;")
    public final class475 method174(class562 arg0, int arg1) {
        ++field4851;
        return arg1 != -14700 ? null : this.field4865;
    }

    @OriginalMember(owner = "client!ufa", name = "d", descriptor = "(B)I")
    public final int method176(byte arg0) {
        ++field4862;
        if (arg0 >= -114) {
            this.method707((class562) null, (byte) 123);
        }
        return this.field4871.method64(-82);
    }
}
