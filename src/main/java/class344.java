import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class344 {

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[I")
    public static int[] field5299 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99 };

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field5294;

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field5296;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field5297;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "Lgl;")
    public static class356 field5298;

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Ljava/lang/String;")
    public static String field5295;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method2250(byte arg0) {
        field5299 = null;
        field5295 = null;
        field5298 = null;
        int var1 = -96 % ((arg0 - 80) / 33);
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIBII)V")
    public static final void method2251(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg3 >= class99.field1378 && arg3 <= class396.field5925) {
            int var5 = class21.method153(arg1, (byte) -110, class185.field3005, class406.field6033);
            int var6 = class21.method153(arg4, (byte) -109, class185.field3005, class406.field6033);
            class129.method956(arg3, var5, 0, arg0, var6);
        }
        if (arg2 != 100) {
            method2253((byte) 43, 105);
        }
        field5294++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(II)V")
    public static final void method2252(int arg0, int arg1) {
        class191.field3116.method337(arg1, (byte) -126);
        field5296++;
        if (arg0 <= 94) {
            method2250((byte) 71);
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(BI)Ljs;")
    public static final class180 method2253(byte arg0, int arg1) {
        field5297++;
        class180 var2 = (class180) class324.field5054.method1660(2, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class29.field352.method2771(1, arg1 & 0x7FFF, 3);
        } else {
            var3 = class156.field2462.method2771(1, arg1, 3);
        }
        class180 var4 = new class180();
        int var5 = -41 % ((arg0 + 29) / 62);
        if (var3 != null) {
            var4.method1232((byte) 91, new class186(var3));
        }
        if (arg1 >= 32768) {
            var4.method1240((byte) 16);
        }
        class324.field5054.method1655(false, var4, (long) arg1);
        return var4;
    }
}
