import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class116 extends class279 {

    @OriginalMember(owner = "client!jl", name = "B", descriptor = "Lec;")
    public class99 field1617;

    @OriginalMember(owner = "client!jl", name = "w", descriptor = "Z")
    public static boolean field1612 = false;

    @OriginalMember(owner = "client!jl", name = "D", descriptor = "I")
    public static int field1619 = 0;

    @OriginalMember(owner = "client!jl", name = "u", descriptor = "I")
    public static int field1610;

    @OriginalMember(owner = "client!jl", name = "v", descriptor = "I")
    public static int field1611;

    @OriginalMember(owner = "client!jl", name = "x", descriptor = "I")
    public static int field1613;

    @OriginalMember(owner = "client!jl", name = "y", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!jl", name = "A", descriptor = "I")
    public static int field1616;

    @OriginalMember(owner = "client!jl", name = "C", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!jl", name = "z", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1615;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(II)Ljava/lang/String;", line = 6)
    public static final String method818(int arg0, int arg1) {
        if (arg1 <= 41) {
            field1619 = 36;
        }
        field1613++;
        return arg0 >= 999999999 ? "*" : Integer.toString(arg0);
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IILcd;)I", line = 22)
    public static final int method819(int arg0, int arg1, class136 arg2) {
        if (arg1 != -1) {
            field1619 = -53;
        }
        field1618++;
        if (!client.method953(arg2).method926((byte) 106, arg0) && arg2.field2112 == null) {
            return -1;
        } else if (arg2.field2169 == null || arg0 >= arg2.field2169.length) {
            return -1;
        } else {
            return arg2.field2169[arg0];
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIIIIBII)V", line = 36)
    public static final void method820(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 != 23) {
            return;
        }
        if (arg0 >= class291.field4490 && arg7 <= class210.field3309 && class42.field579 <= arg4 && arg6 <= class334.field5205) {
            class81.method594(arg7, arg4, -72, arg2, arg3, arg6, arg0, arg1);
        } else {
            class64.method518(arg4, arg0, -126, arg7, arg6, arg1, arg2, arg3);
        }
        field1616++;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(Z)V", line = 55)
    public static final void method821(boolean arg0) {
        class197.field3154.method1355(false);
        if (arg0) {
            class62.field909.method1355(false);
            field1611++;
            class161.field2597.method1355(false);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(IIILmm;I)V", line = 71)
    public static final void method822(int arg0, int arg1, int arg2, class121 arg3, int arg4) {
        field1610++;
        if (arg4 < 85) {
            method822(9, -18, 22, (class121) null, 88);
        }
        for (class166 var5 = (class166) class81.field1109.method22((byte) 117); var5 != null; var5 = (class166) class81.field1109.method26((byte) -127)) {
            if (var5.field2728 == arg2 && (arg1 * 128) == var5.field2714 && arg0 * 128 == var5.field2739 && var5.field2735.field1705 == arg3.field1705) {
                if (var5.field2721 != null) {
                    class86.field1174.method1313(var5.field2721);
                    var5.field2721 = null;
                }
                if (var5.field2729 != null) {
                    class86.field1174.method1313(var5.field2729);
                    var5.field2729 = null;
                }
                var5.method2028(13329);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(B)V", line = 110)
    public static final void method823(byte arg0) {
        field1614++;
        int var1 = 82 % ((arg0 - 45) / 41);
        class45.field603.method1355(false);
        class25.field372.method1355(false);
    }

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "(Z)V", line = 129)
    public static void method824(boolean arg0) {
        if (!arg0) {
            field1615 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "<init>", descriptor = "(Lec;)V", line = 139)
    public class116(class99 arg0) {
        this.field1617 = arg0;
    }
}
