import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class193 extends class101 {

    @OriginalMember(owner = "client!ak", name = "D", descriptor = "I")
    public int field3141 = -1;

    @OriginalMember(owner = "client!ak", name = "C", descriptor = "I")
    public int field3140 = -1;

    @OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
    public static int field3130 = 0;

    @OriginalMember(owner = "client!ak", name = "A", descriptor = "Ljava/lang/String;")
    public static String field3138 = "Continue";

    @OriginalMember(owner = "client!ak", name = "H", descriptor = "[Ljava/lang/String;")
    public static String[] field3145 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ak", name = "F", descriptor = "I")
    public static int field3143 = 0;

    @OriginalMember(owner = "client!ak", name = "t", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
    public int field3132;

    @OriginalMember(owner = "client!ak", name = "v", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!ak", name = "w", descriptor = "I")
    public int field3134;

    @OriginalMember(owner = "client!ak", name = "y", descriptor = "I")
    public static int field3136;

    @OriginalMember(owner = "client!ak", name = "z", descriptor = "I")
    public static int field3137;

    @OriginalMember(owner = "client!ak", name = "B", descriptor = "I")
    public int field3139;

    @OriginalMember(owner = "client!ak", name = "E", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!ak", name = "G", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ak", name = "I", descriptor = "I")
    public int field3146;

    @OriginalMember(owner = "client!ak", name = "x", descriptor = "Lmo;")
    public static class447 field3135;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(IIILe;)Z")
    public final boolean method188(int arg0, int arg1, int arg2, class312 arg3) {
        ++field3136;
        class435 var5 = arg3.method713();
        var5.method1984(super.field1413, super.field1408, super.field1405);
        class348 var6 = class155.method1092(true, this.field3139).method728((class417) null, arg1, -9202, arg3, (class208) null, this.field3132, 0, -1, 0);
        if (var6 != null && var6.method39(arg0, arg2, var5, true)) {
            return true;
        } else {
            if (~this.field3140 != 0) {
                class348 var7 = class155.method1092(true, this.field3140).method728((class417) null, 65536, arg1 + -74738, arg3, (class208) null, this.field3146, 0, -1, 0);
                if (var7 != null && var7.method39(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            if (this.field3141 != -1) {
                class348 var8 = class155.method1092(true, this.field3141).method728((class417) null, 65536, -9202, arg3, (class208) null, this.field3134, 0, -1, 0);
                if (var8 != null && var8.method39(arg0, arg2, var5, true)) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Le;Z)Lum;")
    public final class306 method189(class312 arg0, boolean arg1) {
        ++field3131;
        class435 var3 = arg0.method713();
        var3.method1984(super.field1413, super.field1408, super.field1405);
        class306 var4 = class203.method1443(-89, 3);
        if (this.field3141 != -1) {
            class348 var5 = class155.method1092(arg1, this.field3141).method728((class417) null, 1024, -9202, arg0, (class208) null, this.field3134, 0, -1, 0);
            if (var5 != null) {
                var5.method26(var3, var4.field4856[2], 0);
            }
        }
        if (~this.field3140 != 0) {
            class348 var6 = class155.method1092(true, this.field3140).method728((class417) null, 1024, -9202, arg0, (class208) null, this.field3146, 0, -1, 0);
            if (var6 != null) {
                var6.method26(var3, var4.field4856[1], 0);
            }
        }
        class348 var7 = class155.method1092(arg1, this.field3139).method728((class417) null, 1024, -9202, arg0, (class208) null, this.field3132, 0, -1, 0);
        if (var7 != null) {
            var7.method26(var3, var4.field4856[0], 0);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(B)I")
    public static final int method1355(byte arg0) {
        ++field3144;
        int var1 = 25 % ((-36 - arg0) / 61);
        return class358.field5467;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(Le;B)V")
    public final void method196(class312 arg0, byte arg1) {
        if (arg1 > -66) {
            this.field3132 = 127;
        }
        ++field3137;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(B)V")
    public static final void method1356(byte arg0) {
        ++field3133;
        int var1 = -55 % ((33 - arg0) / 56);
        for (int var2 = 0; var2 < 100; ++var2) {
            class267.field4296[var2] = true;
        }
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V")
    public static void method1357(int arg0) {
        field3145 = null;
        field3135 = null;
        if (arg0 < -28) {
            field3138 = null;
        }
    }
}
