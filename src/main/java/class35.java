import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class35 extends class212 {

    @OriginalMember(owner = "client!ha", name = "y", descriptor = "I")
    public int field395 = -1;

    @OriginalMember(owner = "client!ha", name = "x", descriptor = "I")
    public int field394 = -1;

    @OriginalMember(owner = "client!ha", name = "E", descriptor = "[I")
    public static int[] field400 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ha", name = "F", descriptor = "I")
    public static int field401 = 10;

    @OriginalMember(owner = "client!ha", name = "J", descriptor = "I")
    public static int field405 = -1;

    @OriginalMember(owner = "client!ha", name = "w", descriptor = "I")
    public static int field393;

    @OriginalMember(owner = "client!ha", name = "z", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!ha", name = "A", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!ha", name = "C", descriptor = "I")
    public int field398;

    @OriginalMember(owner = "client!ha", name = "D", descriptor = "I")
    public int field399;

    @OriginalMember(owner = "client!ha", name = "G", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!ha", name = "H", descriptor = "I")
    public static int field403;

    @OriginalMember(owner = "client!ha", name = "I", descriptor = "I")
    public int field404;

    @OriginalMember(owner = "client!ha", name = "K", descriptor = "I")
    public static int field406;

    @OriginalMember(owner = "client!ha", name = "L", descriptor = "I")
    public int field407;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(BLae;)Ljg;", line = 3)
    public final class186 method52(byte arg0, class134 arg1) {
        ++field396;
        class18 var3 = arg1.method649();
        var3.method116(super.field3008, super.field3015, super.field3013);
        class186 var4 = class348.method2229(3, 21534);
        if (~this.field394 != 0) {
            class210 var5 = class50.method288(0, this.field394).method1096((byte) 125, (class274) null, -1, this.field407, 0, 1024, (class412) null, 0, arg1);
            if (var5 != null) {
                var5.method1416(var3, var4.field2704[2], 0);
            }
        }
        if (arg0 != -120) {
            method214(90, false, 8);
        }
        if (~this.field395 != 0) {
            class210 var6 = class50.method288(0, this.field395).method1096((byte) 82, (class274) null, -1, this.field404, 0, 1024, (class412) null, 0, arg1);
            if (var6 != null) {
                var6.method1416(var3, var4.field2704[1], 0);
            }
        }
        class210 var7 = class50.method288(0, this.field399).method1096((byte) 127, (class274) null, -1, this.field398, 0, 1024, (class412) null, 0, arg1);
        if (var7 != null) {
            var7.method1416(var3, var4.field2704[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ILae;II)Z", line = 47)
    public final boolean method56(int arg0, class134 arg1, int arg2, int arg3) {
        ++field406;
        class18 var5 = arg1.method649();
        var5.method116(super.field3008, super.field3015, super.field3013);
        class210 var6 = class50.method288(arg2 ^ arg2, this.field399).method1096((byte) 108, (class274) null, -1, this.field398, 0, 65536, (class412) null, 0, arg1);
        if (var6 != null && var6.method1382(arg0, arg3, var5, true)) {
            return true;
        } else {
            if (~this.field395 != 0) {
                class210 var7 = class50.method288(0, this.field395).method1096((byte) 111, (class274) null, -1, this.field404, 0, 65536, (class412) null, 0, arg1);
                if (var7 != null && var7.method1382(arg0, arg3, var5, true)) {
                    return true;
                }
            }
            if (~this.field394 != 0) {
                class210 var8 = class50.method288(0, this.field394).method1096((byte) 112, (class274) null, -1, this.field407, 0, 65536, (class412) null, 0, arg1);
                if (var8 != null && var8.method1382(arg0, arg3, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IZI)I", line = 90)
    public static final int method214(int arg0, boolean arg1, int arg2) {
        ++field403;
        if (arg1) {
            return 0;
        } else {
            class411 var3 = class144.method878(arg1, arg0, -104);
            if (var3 == null) {
                return class285.method1865(arg0, -31016).field7;
            } else {
                int var4 = 0;
                if (arg2 != -1) {
                    method214(-105, true, -123);
                }
                for (int var5 = 0; ~var5 > ~var3.field5904.length; ++var5) {
                    if (~var3.field5904[var5] == 0) {
                        ++var4;
                    }
                }
                return var4 + class285.method1865(arg0, -31016).field7 + -var3.field5904.length;
            }
        }
    }

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "(I)V", line = 128)
    public static void method215(int arg0) {
        if (arg0 <= 16) {
            field400 = null;
        }
        field400 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(Lae;B)V", line = 152)
    public final void method64(class134 arg0, byte arg1) {
        ++field397;
        if (arg1 >= -50) {
            this.field404 = 76;
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(IIB)V", line = 163)
    public static final void method216(int arg0, int arg1, byte arg2) {
        ++field393;
        if (arg2 != -22) {
            method215(-34);
        }
        class273.field3879 = new class237(arg1);
        class161.field2126 = new class237(arg0);
    }
}
