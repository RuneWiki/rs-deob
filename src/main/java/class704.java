import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class704 {

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "Ljava/lang/String;")
    public static String field9878 = "";

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field9877;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field9879;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "I")
    public static int field9881;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "Les;")
    public static class386 field9876;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "Lni;")
    public static class522 field9882;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lufa;")
    public static class680 field9880;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZII)V")
    public static final void method3969(boolean arg0, int arg1, int arg2) {
        field9879++;
        class252 var3 = class150.method916(arg2, -126, 14);
        var3.method1502((byte) -103);
        var3.field3251 = arg1;
        if (!arg0) {
            method3971((byte) 111);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(JZLha;)V")
    public static final void method3970(long arg0, boolean arg1, class60 arg2) {
        class98.field1310 = 0;
        field9877++;
        if (!arg1) {
            field9882 = null;
        }
        class293.field3925 = 0;
        class79.field1090 = class750.field10397;
        class750.field10397 = 0;
        long var4 = class538.method2963(-47);
        for (class550 var6 = (class550) class146.field1891.method113((byte) 15); var6 != null; var6 = (class550) class146.field1891.method119(false)) {
            if (var6.method3121(arg2, arg0)) {
                class293.field3925++;
            }
        }
        if (class166.field2074 && arg0 % 100L == 0L) {
            System.out.println("Particle system count: " + class146.field1891.method121(15) + ", running: " + class293.field3925);
            System.out.println("Emitters: " + class98.field1310 + " Particles: " + class750.field10397 + ". Time taken: " + (class538.method2963(-47) - var4) + "ms");
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V")
    public static void method3971(byte arg0) {
        field9878 = null;
        field9880 = null;
        field9882 = null;
        int var1 = 83 % ((38 - arg0) / 60);
        field9876 = null;
    }
}
