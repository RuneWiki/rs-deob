import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class360 extends class499 {

    @OriginalMember(owner = "client!cb", name = "D", descriptor = "Luf;")
    public static class310 field4942 = new class310(51, 8);

    @OriginalMember(owner = "client!cb", name = "B", descriptor = "F")
    public static float field4940;

    @OriginalMember(owner = "client!cb", name = "o", descriptor = "I")
    public int field4927;

    @OriginalMember(owner = "client!cb", name = "p", descriptor = "I")
    public int field4928;

    @OriginalMember(owner = "client!cb", name = "q", descriptor = "I")
    public int field4929;

    @OriginalMember(owner = "client!cb", name = "r", descriptor = "I")
    public int field4930;

    @OriginalMember(owner = "client!cb", name = "s", descriptor = "I")
    public int field4931;

    @OriginalMember(owner = "client!cb", name = "t", descriptor = "I")
    public int field4932;

    @OriginalMember(owner = "client!cb", name = "u", descriptor = "I")
    public int field4933;

    @OriginalMember(owner = "client!cb", name = "v", descriptor = "I")
    public int field4934;

    @OriginalMember(owner = "client!cb", name = "w", descriptor = "I")
    public int field4935;

    @OriginalMember(owner = "client!cb", name = "x", descriptor = "I")
    public int field4936;

    @OriginalMember(owner = "client!cb", name = "y", descriptor = "I")
    public int field4937;

    @OriginalMember(owner = "client!cb", name = "z", descriptor = "I")
    public static int field4938;

    @OriginalMember(owner = "client!cb", name = "A", descriptor = "I")
    public int field4939;

    @OriginalMember(owner = "client!cb", name = "C", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!cb", name = "E", descriptor = "I")
    public int field4943;

    @OriginalMember(owner = "client!cb", name = "F", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!cb", name = "G", descriptor = "I")
    public int field4945;

    @OriginalMember(owner = "client!cb", name = "H", descriptor = "I")
    public int field4946;

    @OriginalMember(owner = "client!cb", name = "n", descriptor = "Lmi;")
    public static class341 field4926;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cb", name = "I", descriptor = "Ljava/lang/Class;")
    public static Class field4947;

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)V")
    public static void method1998(int arg0) {
        if (arg0 != 51) {
            method2000(-3, 24, -39, 39, 120, (byte) -33, -78, 7, 95);
        }
        field4926 = null;
        field4942 = null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IBLqa;)Lc;")
    public final class121 method1999(int arg0, byte arg1, class162 arg2) {
        int var4 = -21 % ((arg1 - 47) / 41);
        field4938++;
        int var5 = class180.field2540[this.field4932];
        if (var5 == 0) {
            class134 var6 = class195.method1184(this.field4936, this.field4933, this.field4939);
            if (var6 instanceof class107) {
                class107 var7 = (class107) var6;
                if (var7.field1458 != null) {
                    return ((class55) var7.field1458).method358(4586, arg0, arg2);
                }
            }
        } else if (var5 == 1) {
            class463 var8 = class503.method2956(this.field4936, this.field4933, this.field4939);
            if (var8 instanceof class331) {
                class331 var9 = (class331) var8;
                if (var9.field4506 != null) {
                    return ((class55) var9.field4506).method358(4586, arg0, arg2);
                }
            }
        } else if (var5 == 2) {
            class33 var10 = class490.method2876(this.field4936, this.field4933, this.field4939, field4947 == null ? (field4947 = method2001("jv")) : field4947);
            if (var10 instanceof class63) {
                class63 var11 = (class63) var10;
                if (var11.field869 != null) {
                    return ((class55) var11.field869).method358(4586, arg0, arg2);
                }
            }
        } else if (var5 == 3) {
            class180 var12 = class391.method2240(this.field4936, this.field4933, this.field4939);
            if (var12 instanceof class521) {
                class521 var13 = (class521) var12;
                if (var13.field7679 != null) {
                    return ((class55) var13.field7679).method358(4586, arg0, arg2);
                }
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIIBIII)Z")
    public static final boolean method2000(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        field4944++;
        if (arg5 != -37) {
            method1998(31);
        }
        if ((arg6 + arg3) > arg0 && arg0 + arg1 > arg6) {
            return arg4 < arg2 + arg7 && (arg4 + arg8) > arg2;
        } else {
            return false;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2001(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
