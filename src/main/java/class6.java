import java.lang.reflect.Method;
import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!er")
public class class6 {

    @OriginalMember(owner = "client!er", name = "c", descriptor = "[[I")
    public static int[][] field143 = new int[6][];

    @OriginalMember(owner = "client!er", name = "a", descriptor = "I")
    public static int field141;

    @OriginalMember(owner = "client!er", name = "b", descriptor = "I")
    public static int field142;

    @OriginalMember(owner = "client!er", name = "d", descriptor = "I")
    public static int field144;

    // $FF: synthetic field
    @OriginalMember(owner = "client!er", name = "e", descriptor = "Ljava/lang/Class;")
    public static Class field145;

    // $FF: synthetic field
    @OriginalMember(owner = "client!er", name = "f", descriptor = "Ljava/lang/Class;")
    public static Class field146;

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(JB)Ljava/lang/String;")
    public static final String method50(long arg0, byte arg1) {
        class500.field6597.setTime(new Date(arg0));
        field142++;
        int var3 = class500.field6597.get(7);
        int var4 = class500.field6597.get(5);
        int var5 = class500.field6597.get(2);
        int var6 = class500.field6597.get(1);
        int var7 = class500.field6597.get(11);
        if (arg1 <= 114) {
            return null;
        } else {
            int var8 = class500.field6597.get(12);
            int var9 = class500.field6597.get(13);
            return class490.field6482[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class408.field5119[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(I)V")
    public static final synchronized void method51(int arg0) {
        field141++;
        if (class288.field3583 != null) {
            return;
        }
        try {
            if (arg0 != -30983) {
                field143 = null;
            }
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field145 == null ? (field145 = method53("java.lang.String")) : field145, field146 == null ? (field146 = method53("java.lang.Class")) : field146);
            class288.field3583 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }

    @OriginalMember(owner = "client!er", name = "a", descriptor = "(B)V")
    public static void method52(byte arg0) {
        if (arg0 != -42) {
            method51(-117);
        }
        field143 = null;
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!er", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method53(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
