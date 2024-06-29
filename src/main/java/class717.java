import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bw")
public class class717 extends class524 implements class237 {

    @OriginalMember(owner = "client!bw", name = "X", descriptor = "Z")
    private boolean field9866 = false;

    @OriginalMember(owner = "client!bw", name = "K", descriptor = "Lvw;")
    public class322 field9853;

    @OriginalMember(owner = "client!bw", name = "S", descriptor = "Z")
    private boolean field9861;

    @OriginalMember(owner = "client!bw", name = "L", descriptor = "I")
    public static int field9854;

    @OriginalMember(owner = "client!bw", name = "N", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!bw", name = "O", descriptor = "I")
    public static int field9857;

    @OriginalMember(owner = "client!bw", name = "P", descriptor = "I")
    public static int field9858;

    @OriginalMember(owner = "client!bw", name = "Q", descriptor = "I")
    public static int field9859;

    @OriginalMember(owner = "client!bw", name = "R", descriptor = "I")
    public static int field9860;

    @OriginalMember(owner = "client!bw", name = "T", descriptor = "I")
    public static int field9862;

    @OriginalMember(owner = "client!bw", name = "U", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!bw", name = "V", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!bw", name = "W", descriptor = "I")
    public static int field9865;

    @OriginalMember(owner = "client!bw", name = "Y", descriptor = "I")
    public static int field9867;

    @OriginalMember(owner = "client!bw", name = "ab", descriptor = "I")
    public static int field9869;

    @OriginalMember(owner = "client!bw", name = "bb", descriptor = "I")
    public static int field9870;

    @OriginalMember(owner = "client!bw", name = "cb", descriptor = "I")
    public static int field9871;

    @OriginalMember(owner = "client!bw", name = "db", descriptor = "I")
    public static int field9872;

    @OriginalMember(owner = "client!bw", name = "eb", descriptor = "I")
    public static int field9873;

    @OriginalMember(owner = "client!bw", name = "M", descriptor = "Ldg;")
    private class435 field9855;

    @OriginalMember(owner = "client!bw", name = "Z", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field9868;

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(I)I", line = 4)
    public final int method1034(int arg0) {
        ++field9857;
        return arg0 >= -125 ? -116 : this.field9853.field4397;
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(Z)Z", line = 16)
    public final boolean method910(boolean arg0) {
        ++field9872;
        if (arg0) {
            this.field9853 = null;
        }
        return this.field9866;
    }

    @OriginalMember(owner = "client!bw", name = "f", descriptor = "(B)V", line = 28)
    public static void method3985(byte arg0) {
        field9868 = null;
        if (arg0 != 3) {
            field9868 = null;
        }
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(BLha;)Lhga;", line = 44)
    public final class186 method898(byte arg0, class66 arg1) {
        ++field9863;
        class499 var3 = this.field9853.method2053(arg1, true, 2, false, 2048);
        if (var3 == null) {
            return null;
        } else {
            class650 var4 = arg1.method533();
            var4.method1868(super.field7125 + super.field7396, super.field7405, super.field7120 + super.field7398);
            class186 var5 = class174.method1320(1, this.field9861, 17832);
            int var6 = super.field7396 >> 9;
            if (arg0 < 123) {
                this.method900(-81);
            }
            int var7 = super.field7398 >> 9;
            this.field9853.method2043(var6, arg1, var3, var4, true, var7, var7, var6, true);
            if (class507.field6967) {
                var3.method310(var4, var5.field2877[0], class90.field1369, 0);
            } else {
                var3.method301(var4, var5.field2877[0], 0);
            }
            if (this.field9853.field4381 != null) {
                class442 var8 = this.field9853.field4381.method4299();
                if (!class507.field6967) {
                    arg1.method478(var8);
                } else {
                    arg1.method474(var8, class90.field1369);
                }
            }
            this.field9866 = var3.method327() || this.field9853.field4381 != null;
            if (this.field9855 != null) {
                class651.method3647(-31546, super.field7396, super.field7398, var3, this.field9855, super.field7405);
            } else {
                this.field9855 = class538.method3042(super.field7398, super.field7396, (byte) -47, var3, super.field7405);
            }
            return var5;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Z)I", line = 97)
    public final int method1032(boolean arg0) {
        if (arg0) {
            return 55;
        } else {
            ++field9860;
            return this.field9853.field4396;
        }
    }

    @OriginalMember(owner = "client!bw", name = "c", descriptor = "(I)I", line = 111)
    public final int method1033(int arg0) {
        if (arg0 > -12) {
            return -74;
        } else {
            ++field9856;
            return this.field9853.field4418;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Ldja;I)V", line = 124)
    public final void method3986(class326 arg0, int arg1) {
        if (arg1 != 0) {
            this.method1033(-97);
        }
        this.field9853.method2045(-1, arg0);
        ++field9865;
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(Lha;B)Ldg;", line = 135)
    public final class435 method894(class66 arg0, byte arg1) {
        if (arg1 >= -38) {
            this.method1034(28);
        }
        ++field9858;
        return this.field9855;
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(B)Z", line = 146)
    public final boolean method1036(byte arg0) {
        if (arg0 > -44) {
            return true;
        } else {
            ++field9871;
            return this.field9853.method2051(-115);
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lha;B)V", line = 157)
    public final void method1040(class66 arg0, byte arg1) {
        ++field9864;
        if (arg1 != 55) {
            this.field9853 = null;
        }
        this.field9853.method2046(arg0, (byte) 88);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lha;III)Z", line = 169)
    public final boolean method908(class66 arg0, int arg1, int arg2, int arg3) {
        ++field9869;
        class499 var5 = this.field9853.method2053(arg0, false, arg2 + -131070, false, arg2);
        if (var5 == null) {
            return false;
        } else {
            class650 var6 = arg0.method533();
            var6.method1868(super.field7125 + super.field7396, super.field7405, super.field7120 + super.field7398);
            return !class507.field6967 ? var5.method290(arg1, arg3, var6, false, 0) : var5.method286(arg1, arg3, var6, false, 0, class90.field1369);
        }
    }

    @OriginalMember(owner = "client!bw", name = "<init>", descriptor = "(Lha;Lij;IIIIIZIIIII)V", line = 185)
    public class717(class66 arg0, class445 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
        super(arg4, arg5, arg6, arg2, arg3, arg8, arg9);
        this.field9853 = new class322(arg0, arg1, arg10, arg11, super.field7391, arg3, this, arg7, arg12);
        this.field9861 = arg1.field6050 != 0 && !arg7;
    }

    @OriginalMember(owner = "client!bw", name = "b", descriptor = "(I)V", line = 194)
    public final void method1037(int arg0) {
        ++field9859;
        if (arg0 != -1114) {
            this.method1039((class66) null, 90);
        }
    }

    @OriginalMember(owner = "client!bw", name = "j", descriptor = "(I)Z", line = 204)
    public final boolean method902(int arg0) {
        ++field9862;
        if (arg0 != 0) {
            field9868 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!bw", name = "g", descriptor = "(I)I", line = 215)
    public final int method907(int arg0) {
        ++field9867;
        return arg0 != -20425 ? 98 : this.field9853.method2048(true);
    }

    @OriginalMember(owner = "client!bw", name = "h", descriptor = "(I)I", line = 226)
    public final int method900(int arg0) {
        ++field9870;
        if (arg0 != 0) {
            this.method907(-83);
        }
        return this.field9853.method2049(3162);
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(Lha;I)V", line = 237)
    public final void method1039(class66 arg0, int arg1) {
        if (arg1 >= 81) {
            this.field9853.method2044((byte) 82, arg0);
            ++field9873;
        }
    }

    @OriginalMember(owner = "client!bw", name = "a", descriptor = "(BLha;)V", line = 254)
    public final void method901(byte arg0, class66 arg1) {
        ++field9854;
        class499 var3 = this.field9853.method2053(arg1, true, 2, false, 262144);
        if (arg0 <= 114) {
            this.method3986((class326) null, -81);
        }
        if (var3 != null) {
            int var4 = super.field7396 >> 9;
            int var5 = super.field7398 >> 9;
            class650 var6 = arg1.method533();
            var6.method1868(super.field7396, super.field7405, super.field7398);
            this.field9853.method2043(var4, arg1, var3, var6, false, var5, var5, var4, true);
        }
    }
}
