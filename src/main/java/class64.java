import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qr")
public class class64 {

    @OriginalMember(owner = "client!qr", name = "d", descriptor = "I")
    public static int field654 = 1406;

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "Lpia;")
    public static class94 field652 = new class94(7, -1);

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!qr", name = "c", descriptor = "I")
    public static int field653;

    @OriginalMember(owner = "client!qr", name = "f", descriptor = "I")
    public static int field656;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qr", name = "g", descriptor = "Ljava/lang/Class;")
    public static Class field657;

    // $FF: synthetic field
    @OriginalMember(owner = "client!qr", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field658;

    @OriginalMember(owner = "client!qr", name = "e", descriptor = "[[I")
    public static int[][] field655;

    // $FF: synthetic method
    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method486(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(I)V", line = 7)
    public static void method482(int arg0) {
        if (arg0 != -16309) {
            method485(-123);
        }
        field655 = null;
        field652 = null;
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(BZ)V", line = 18)
    public static final void method483(byte arg0, boolean arg1) {
        class57.field572++;
        field653++;
        if (arg0 < 45) {
            method485(-56);
        }
        class249 var2 = class289.method1715(class562.field8007, 78, class41.field470);
        class510.method3017(var2, 57);
        for (class424 var3 = (class424) class153.field1688.method1753(0); var3 != null; var3 = (class424) class153.field1688.method1755(-117)) {
            if (!var3.method863(51)) {
                var3 = (class424) class153.field1688.method1753(0);
                if (var3 == null) {
                    break;
                }
            }
            if (var3.field6158 == 0) {
                class441.method2749(0, true, var3, arg1);
            }
        }
        if (class468.field6697 != null) {
            class11.method50(class468.field6697, (byte) -102);
            class468.field6697 = null;
        }
    }

    @OriginalMember(owner = "client!qr", name = "a", descriptor = "(Z)V", line = 59)
    public static final void method484(boolean arg0) {
        field656++;
        class35.field382.method963((byte) 95);
        class147.field1641.method3240((byte) -128);
        class606.field8619.method3191(-257);
        class445.field6442.method3979((byte) 58);
        class451.field6506.method140(228);
        class361.field4643.method910(109);
        class637.field9158.method1904((byte) 63);
        class173.field2036.method1218(60);
        class628.field9019.method1407(-1);
        class422.field6147.method1994(16);
        class182.field2148.method2680((byte) 92);
        class119.field1233.method2339((byte) -124);
        class337.field4323.method2053(-120);
        class579.field8200.method2114((byte) 81);
        class84.field884.method95(-7316);
        class430.field6249.method2502(arg0);
        class82.field857.method1304(116);
        class56.field565.method1965(6);
        class184.field2207.method560((byte) -112);
        class724.field10140.method4091(3553);
        class441.method2746((byte) -104);
        class668.method3795(162);
        class267.method1602((byte) 115);
        class205.method1228(0);
        class512.method3023((byte) 115);
        class560.field7991.method3541(-647);
        class592.field8346.method3541(-647);
        class209.field2467.method3541(-647);
        class634.field9110.method3541(-647);
        class133.field1513.method3541(-647);
    }

    @OriginalMember(owner = "client!qr", name = "b", descriptor = "(I)V", line = 106)
    public static final synchronized void method485(int arg0) {
        field651++;
        if (arg0 != 13711) {
            method485(100);
        }
        if (class741.field10360 != null) {
            return;
        }
        try {
            Class var1 = Class.forName("java.lang.management.ManagementFactory");
            Method var2 = var1.getDeclaredMethod("getPlatformMBeanServer", null);
            Object var3 = var2.invoke(null, (Object[]) null);
            Method var4 = var1.getMethod("newPlatformMXBeanProxy", Class.forName("javax.management.MBeanServerConnection"), field657 == null ? (field657 = method486("java.lang.String")) : field657, field658 == null ? (field658 = method486("java.lang.Class")) : field658);
            class741.field10360 = var4.invoke(null, var3, "com.sun.management:type=HotSpotDiagnostic", Class.forName("com.sun.management.HotSpotDiagnosticMXBean"));
        } catch (Exception var6) {
            System.out.println("HeapDump setup error:");
            var6.printStackTrace();
        }
    }
}
