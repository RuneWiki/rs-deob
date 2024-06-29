import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class359 {

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static volatile int field5701 = 0;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field5699 = new String[100];

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "I")
    public static int field5698;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field5700;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IB)Lgm;", line = 40)
    public static final class119 method2520(int arg0, byte arg1) {
        class119 var2 = (class119) class139.field2316.method1386(-1, (long) arg0);
        field5700++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg0 >= 32768) {
            var3 = class314.field4861.method187(1, arg0 & 0x7FFF, -1);
        } else {
            var3 = class232.field3621.method187(1, arg0, -1);
        }
        class119 var4 = new class119();
        if (var3 != null) {
            var4.method1015(-124, new class25(var3));
        }
        if (arg0 >= 32768) {
            var4.method1009((byte) -17);
        }
        int var5 = 92 / ((arg1 + 53) / 43);
        class139.field2316.method1385(var4, (byte) -30, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V", line = 78)
    public static void method2521(byte arg0) {
        if (arg0 != -84) {
            field5699 = (String[]) null;
        }
        field5699 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILjava/awt/Component;)V", line = 92)
    public static final void method2522(int arg0, Component arg1) {
        field5698++;
        Method var2 = class323.field4980;
        if (var2 != null) {
            try {
                var2.invoke(arg1, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        if (arg0 == -32769) {
            arg1.addKeyListener(class113.field1724);
            arg1.addFocusListener(class113.field1724);
        }
    }
}
