import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dh")
public class class15 extends class187 {

    @OriginalMember(owner = "client!dh", name = "q", descriptor = "[I")
    public int[] field154 = new int[] { -1 };

    @OriginalMember(owner = "client!dh", name = "n", descriptor = "[I")
    public int[] field151 = new int[] { 0 };

    @OriginalMember(owner = "client!dh", name = "t", descriptor = "Ljava/lang/String;")
    public static String field157 = " more options";

    @OriginalMember(owner = "client!dh", name = "p", descriptor = "I")
    public static int field153 = 0;

    @OriginalMember(owner = "client!dh", name = "v", descriptor = "[I")
    public static int[] field159 = new int[100];

    @OriginalMember(owner = "client!dh", name = "o", descriptor = "I")
    public static int field152;

    @OriginalMember(owner = "client!dh", name = "r", descriptor = "I")
    public static int field155;

    @OriginalMember(owner = "client!dh", name = "s", descriptor = "I")
    public static int field156;

    @OriginalMember(owner = "client!dh", name = "u", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!dh", name = "w", descriptor = "Lwf;")
    public static class306 field160;

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Lll;", line = 6)
    public static final class315 method117(Throwable arg0, String arg1) {
        field152++;
        class315 var2;
        if ((arg0 instanceof class315)) {
            var2 = (class315) arg0;
            var2.field4969 = var2.field4969 + ' ' + arg1;
        } else {
            var2 = new class315(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(I)V", line = 25)
    public static void method118(int arg0) {
        field159 = null;
        if (arg0 != 0) {
            field160 = (class306) null;
        }
        field157 = null;
        field160 = null;
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(IZZIIIIIII)V", line = 40)
    public static final void method119(int arg0, boolean arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = arg0 - arg5;
        if (!arg2) {
            return;
        }
        int var11 = arg3 - arg7;
        field158++;
        int var12 = (arg6 - arg4 << 16) / var10;
        int var13 = (arg9 - arg8 << 16) / var11;
        class42.method303((byte) 31, 0, var12, arg3, arg4, arg8, 0, var13, arg0, arg1, arg5, arg7);
    }

    @OriginalMember(owner = "client!dh", name = "b", descriptor = "(Lwf;I)V", line = 68)
    public static final void method120(class306 arg0, int arg1) {
        class168.field2571 = arg0.method2107("titlebg", (byte) 127);
        field156++;
        class311.field4932 = arg0.method2107("logo", (byte) 116);
        if (arg1 < 125) {
            method118(111);
        }
    }

    @OriginalMember(owner = "client!dh", name = "a", descriptor = "(B)V", line = 81)
    public static final void method121(byte arg0) {
        class172.field2619.method1298((byte) 110);
        if (arg0 >= 21) {
            class47.field662.method1298((byte) 110);
            field155++;
        }
    }
}
