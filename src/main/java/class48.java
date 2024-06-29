import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class48 {

    @OriginalMember(owner = "client!sj", name = "d", descriptor = "I")
    public static int field1034 = 0;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!sj", name = "c", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!sj", name = "e", descriptor = "I")
    public static int field1035;

    @OriginalMember(owner = "client!sj", name = "f", descriptor = "I")
    public static int field1036;

    @OriginalMember(owner = "client!sj", name = "g", descriptor = "[I")
    public static int[] field1037;

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZIII)I")
    public static final int method372(boolean arg0, int arg1, int arg2, int arg3) {
        field1035++;
        class13 var4 = (class13) class152.field2876.method1698((long) arg3, (byte) -48);
        if (var4 == null) {
            return 0;
        }
        int var5 = 0;
        for (int var6 = arg1; var6 < var4.field405.length; var6++) {
            if (var4.field405[var6] >= 0 && class78.field1541 > var4.field405[var6]) {
                class69 var7 = class272.method1853(0, var4.field405[var6]);
                if (var7.field1382 != null) {
                    class2 var8 = (class2) var7.field1382.method1698((long) arg2, (byte) 30);
                    if (var8 != null) {
                        if (arg0) {
                            var5 += var4.field402[var6] * var8.field24;
                        } else {
                            var5 += var8.field24;
                        }
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(I)V")
    public static void method373(int arg0) {
        field1037 = null;
        if (arg0 != 255) {
            field1036 = -18;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(ZLbj;Lbj;)V")
    public static final void method374(boolean arg0, class151 arg1, class151 arg2) {
        field1032++;
        class45.field1014 = class170.method1220(class93.field1884, false, 0, arg2, arg1);
        if (!arg0) {
            field1037 = null;
        }
        class1.field10 = (class148) class45.field1014;
        class211.field3820 = class170.method1220(class132.field2505, !arg0, 0, arg2, arg1);
        class141.field2684 = class170.method1220(class78.field1531, false, 0, arg2, arg1);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZIIIIIIIII)Z")
    public static final boolean method375(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1031++;
        if (arg11 != -24761) {
            return true;
        } else if (class124.field2412.method240((byte) -110) == 2) {
            return class105.method749(arg3, 0, arg4, arg2, arg8, arg1, arg5, arg6, arg9, arg10, arg7, arg0);
        } else if (class124.field2412.method240((byte) -120) > 2) {
            return class185.method1277(arg7, arg4, arg10, arg8, arg1, arg6, arg0, arg5, arg9, arg2, class124.field2412.method240((byte) -117), true, arg3);
        } else {
            return class1.method1(arg1, arg3, arg2, arg4, arg7, arg9, arg10, arg6, arg5, (byte) 15, arg8, arg0);
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIZ)Ljd;")
    public static final class86 method376(int arg0, int arg1, boolean arg2) {
        if (arg1 != 10) {
            method374(true, (class151) null, (class151) null);
        }
        field1033++;
        return class141.method1005(4709, 10, arg0, arg2);
    }
}
