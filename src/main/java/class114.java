import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class114 extends class155 {

    @OriginalMember(owner = "client!mm", name = "L", descriptor = "[Log;")
    public class271[] field1891;

    @OriginalMember(owner = "client!mm", name = "J", descriptor = "[I")
    public static int[] field1889 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
    public static int field1884 = -1;

    @OriginalMember(owner = "client!mm", name = "Q", descriptor = "I")
    public static volatile int field1896 = -1;

    @OriginalMember(owner = "client!mm", name = "M", descriptor = "Lbk;")
    public static class153 field1892 = null;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "I")
    public static int field1885;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!mm", name = "I", descriptor = "I")
    public static int field1888;

    @OriginalMember(owner = "client!mm", name = "K", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!mm", name = "O", descriptor = "I")
    public static int field1894;

    @OriginalMember(owner = "client!mm", name = "P", descriptor = "I")
    public static int field1895;

    @OriginalMember(owner = "client!mm", name = "R", descriptor = "I")
    public static int field1897;

    @OriginalMember(owner = "client!mm", name = "N", descriptor = "Lai;")
    public static class249 field1893;

    @OriginalMember(owner = "client!mm", name = "G", descriptor = "[I")
    public static int[] field1887;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "(I)V")
    public static final void method852(int arg0) {
        if (arg0 != 14339) {
            field1892 = null;
        }
        field1885++;
        class136.field2219.method1420((byte) -60);
        class275.field4452.method1420((byte) 115);
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIIIIIIBI)Z")
    public static final boolean method853(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        field1886++;
        if (arg7 != 37) {
            field1884 = -124;
        }
        if (arg1 + arg5 > arg0 && (arg0 + arg3) > arg1) {
            return arg6 < arg4 + arg8 && arg2 + arg6 > arg8;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "(BI)Z")
    public final boolean method854(byte arg0, int arg1) {
        field1897++;
        if (arg0 > -117) {
            field1889 = null;
        }
        return this.field1891[arg1].field4389;
    }

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "(Z)V")
    public static void method855(boolean arg0) {
        if (!arg0) {
            field1887 = null;
        }
        field1887 = null;
        field1892 = null;
        field1893 = null;
        field1889 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILlc;IILlc;)Ll;")
    public static final class10 method856(int arg0, class270 arg1, int arg2, int arg3, class270 arg4) {
        if (arg2 == 2) {
            field1895++;
            return class144.method1079(arg3, arg4, arg0, (byte) 59) ? class241.method1650(arg1.method1868(arg0, arg3, arg2 ^ 0x3), -805) : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)I")
    public static final int method857(int arg0, int arg1, int arg2, int arg3) {
        field1890++;
        int var4 = arg1 & 0x3;
        if (arg3 != 7) {
            method857(-114, 72, -100, -20);
        }
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return 7 - arg2;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return arg2;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Llc;Llc;IZ)V")
    public class114(class270 arg0, class270 arg1, int arg2, boolean arg3) {
        class2 var5 = new class2();
        int var6 = arg0.method1891(arg2, 127);
        this.field1891 = new class271[var6];
        int[] var7 = arg0.method1866((byte) -69, arg2);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method1868(var7[var8], arg2, 1);
            class260 var10 = null;
            int var11 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            for (class260 var12 = (class260) var5.method8(-96); var12 != null; var12 = (class260) var5.method12((byte) 69)) {
                if (var12.field4016 == var11) {
                    var10 = var12;
                    break;
                }
            }
            if (var10 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method1893(var11, true, 0);
                } else {
                    var13 = arg1.method1893(0, true, var11);
                }
                var10 = new class260(var11, var13);
                var5.method13(32, var10);
            }
            this.field1891[var7[var8]] = new class271(var9, var10);
        }
    }

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "(BI)Z")
    public final boolean method858(byte arg0, int arg1) {
        if (arg0 == 104) {
            field1894++;
            return this.field1891[arg1].field4386;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILdk;)V")
    public static final void method859(int arg0, class207 arg1) {
        field1888++;
        class301 var2 = (class301) class21.field233.method1073(arg0, class143.method1064((byte) -94, arg1.field3069));
        if (var2 == null) {
            class203.method1439((class93) null, 0, arg1.field3686[0], (byte) 92, arg1, (class12) null, class37.field474, arg1.field3761[0]);
        } else {
            var2.method2053((byte) 123);
        }
    }
}
