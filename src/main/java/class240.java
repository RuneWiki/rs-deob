import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class240 {

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "I")
    public static int field3406 = 1;

    @OriginalMember(owner = "client!sm", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3409 = "";

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "Lkca;")
    public static class73 field3405 = new class73(58, -1);

    @OriginalMember(owner = "client!sm", name = "g", descriptor = "F")
    public static float field3411;

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "I")
    public static int field3408;

    @OriginalMember(owner = "client!sm", name = "f", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "Lgh;")
    public static class476 field3407;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(BII)Z", line = 4)
    public static final boolean method1599(byte arg0, int arg1, int arg2) {
        int var3 = 94 % ((arg0 + 58) / 55);
        field3408++;
        return (arg1 & 0x8000) != 0;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(Lw;III[Z)V", line = 16)
    public static final void method1600(class252 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class492.field7164 == class435.field6449) {
            return;
        }
        int var5 = class544.field7780[arg1].method249(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class132 var7 = class544.field7780[var6];
                if (var7 != null) {
                    var7.method261(arg0, arg2, var5 - var7.method249(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(I)V", line = 52)
    public static void method1601(int arg0) {
        field3405 = null;
        field3409 = null;
        if (arg0 >= -40) {
            field3409 = null;
        }
        field3407 = null;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IILtq;III)Ljava/awt/Frame;", line = 67)
    public static final Frame method1602(int arg0, int arg1, class545 arg2, int arg3, int arg4, int arg5) {
        field3410++;
        if (!arg2.method3165(true)) {
            return null;
        }
        if (arg5 == 0) {
            class290[] var6 = class197.method1254(arg2, 110);
            if (var6 == null) {
                return null;
            }
            boolean var7 = false;
            for (int var8 = 0; var8 < var6.length; var8++) {
                if (var6[var8].field4011 == arg0 && var6[var8].field4013 == arg3 && (arg4 == 0 || var6[var8].field4008 == arg4) && (!var7 || var6[var8].field4015 > arg5)) {
                    var7 = true;
                    arg5 = var6[var8].field4015;
                }
            }
            if (!var7) {
                return null;
            }
        }
        class175 var9 = arg2.method3168((byte) 27, arg4, arg0, arg3, arg5);
        while (var9.field2138 == 0) {
            class646.method3696(1, 10L);
        }
        if (arg1 != -1) {
            return null;
        }
        Frame var10 = (Frame) var9.field2140;
        if (var10 == null) {
            return null;
        } else if (var9.field2138 == 2) {
            class514.method3053(-29, var10, arg2);
            return null;
        } else {
            return var10;
        }
    }
}
