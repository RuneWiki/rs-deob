import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rr")
public class class412 implements class283 {

    @OriginalMember(owner = "client!rr", name = "e", descriptor = "Lpl;")
    private class612 field5147;

    @OriginalMember(owner = "client!rr", name = "f", descriptor = "Ljava/lang/String;")
    private String field5148;

    @OriginalMember(owner = "client!rr", name = "g", descriptor = "I")
    public static int field5149 = -2;

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "I")
    public static int field5143;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "I")
    public static int field5144;

    @OriginalMember(owner = "client!rr", name = "c", descriptor = "I")
    public static int field5145;

    @OriginalMember(owner = "client!rr", name = "d", descriptor = "I")
    public static int field5146;

    // $FF: synthetic field
    @OriginalMember(owner = "client!rr", name = "i", descriptor = "Ljava/lang/Class;")
    public static Class field5151;

    @OriginalMember(owner = "client!rr", name = "h", descriptor = "[I")
    public static int[] field5150;

    @OriginalMember(owner = "client!rr", name = "b", descriptor = "(I)V")
    public static void method2180(int arg0) {
        field5150 = null;
        if (arg0 != -2526) {
            field5150 = null;
        }
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(B)Ltj;")
    public final class31 method1265(byte arg0) {
        field5143++;
        return arg0 == -58 ? class31.field440 : null;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIIII)V")
    public static final void method2181(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5145++;
        class592 var5 = class61.method371(8, arg4, (byte) 119);
        var5.method3256((byte) 11);
        if (arg2 != -26287) {
            method2181(-57, -80, 55, 1, 72);
        }
        var5.field8314 = arg3;
        var5.field8312 = arg1;
        var5.field8319 = arg0;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(IIII)Z")
    public static final boolean method2182(int arg0, int arg1, int arg2, int arg3) {
        field5146++;
        boolean var4 = true;
        class339 var5 = (class339) class312.method1803(arg3, arg2, arg0);
        if (arg1 != 100) {
            method2182(25, -62, 92, -75);
        }
        if (var5 != null) {
            var4 &= class65.method386(0, var5);
        }
        class339 var6 = (class339) class700.method3933(arg3, arg2, arg0, field5151 == null ? (field5151 = method2183("vda")) : field5151);
        if (var6 != null) {
            var4 &= class65.method386(arg1 - 100, var6);
        }
        class339 var7 = (class339) class279.method1586(arg3, arg2, arg0);
        if (var7 != null) {
            var4 &= class65.method386(arg1 ^ 0x64, var7);
        }
        return var4;
    }

    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(I)I")
    public final int method1266(int arg0) {
        field5144++;
        if (this.field5147.method3369(31850, this.field5148)) {
            return 100;
        } else {
            int var2 = 70 / ((arg0 + 55) / 49);
            return 0;
        }
    }

    @OriginalMember(owner = "client!rr", name = "<init>", descriptor = "(Lpl;Ljava/lang/String;)V")
    public class412(class612 arg0, String arg1) {
        this.field5147 = arg0;
        this.field5148 = arg1;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!rr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method2183(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
