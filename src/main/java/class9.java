import java.awt.Canvas;
import java.awt.event.FocusListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class9 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lrm;")
    public static class184 field169 = new class184(32);

    @OriginalMember(owner = "client!n", name = "j", descriptor = "I")
    public static int field171 = 0;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "Z")
    public static boolean field172 = false;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field165;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field166;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Ljava/lang/String;")
    public static String field170;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)I", line = 5)
    public static final int method122(int arg0, int arg1) {
        int var2 = (arg1 & 0x55555555) + (arg1 >>> 1 & 0x55555555);
        if (arg0 != -21103920) {
            field172 = false;
        }
        int var3 = ((var2 & 0xCCCCCCCC) >>> 2) + (var2 & 0x33333333);
        field162++;
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 46)
    public static final int method123(String arg0, int arg1) {
        field163++;
        for (int var2 = 0; var2 < class329.field5154.length; var2++) {
            if (class329.field5154[var2].equalsIgnoreCase(arg0)) {
                return var2;
            }
        }
        if (arg1 <= 69) {
            method122(-64, 72);
        }
        return -1;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)Lfd;", line = 87)
    public static final class234 method124(int arg0, int arg1) {
        field166++;
        class234 var2 = (class234) class181.field2942.method1351((long) arg0, arg1 - 1431655702);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class283.field4386.method1813(class22.method216(arg1 - 1431655833, arg0), class1.method1(arg0, true), true);
        class234 var4 = new class234();
        var4.field3640 = arg0;
        if (arg1 != 1431655765) {
            field171 = -81;
        }
        if (var3 != null) {
            var4.method1682(new class6(var3), (byte) 99);
        }
        class181.field2942.method1347(var4, (long) arg0, (byte) -65);
        return var4;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V", line = 121)
    public static void method125(byte arg0) {
        if (arg0 == 103) {
            field170 = null;
            field169 = null;
        }
    }
}
