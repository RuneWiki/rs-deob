import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class300 extends class390 {

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "J")
    public static long field4146 = 0L;

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "[I")
    public static int[] field4147 = new int[2500];

    @OriginalMember(owner = "client!cn", name = "p", descriptor = "I")
    public static int field4150 = 0;

    @OriginalMember(owner = "client!cn", name = "t", descriptor = "[J")
    public static long[] field4154 = new long[32];

    @OriginalMember(owner = "client!cn", name = "z", descriptor = "I")
    public static int field4160 = 0;

    @OriginalMember(owner = "client!cn", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4161 = "Starting 3d Library";

    @OriginalMember(owner = "client!cn", name = "B", descriptor = "I")
    public static int field4162 = 0;

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "Lgs;")
    public static class29 field4148 = new class29();

    @OriginalMember(owner = "client!cn", name = "C", descriptor = "Ltc;")
    public static class196 field4163 = new class196();

    @OriginalMember(owner = "client!cn", name = "D", descriptor = "I")
    public static int field4164 = 0;

    @OriginalMember(owner = "client!cn", name = "o", descriptor = "I")
    public int field4149;

    @OriginalMember(owner = "client!cn", name = "q", descriptor = "I")
    public static int field4151;

    @OriginalMember(owner = "client!cn", name = "s", descriptor = "I")
    public int field4153;

    @OriginalMember(owner = "client!cn", name = "u", descriptor = "I")
    public int field4155;

    @OriginalMember(owner = "client!cn", name = "v", descriptor = "I")
    public static int field4156;

    @OriginalMember(owner = "client!cn", name = "y", descriptor = "I")
    public static int field4159;

    @OriginalMember(owner = "client!cn", name = "x", descriptor = "Lvo;")
    public static class28 field4158;

    @OriginalMember(owner = "client!cn", name = "w", descriptor = "Lqh;")
    public class43 field4157;

    @OriginalMember(owner = "client!cn", name = "r", descriptor = "[Lbd;")
    public class38[] field4152;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "(B)V")
    public static void method1934(byte arg0) {
        field4161 = null;
        field4158 = null;
        if (arg0 <= 77) {
            method1936(-50, (byte) -17);
        }
        field4154 = null;
        field4148 = null;
        field4147 = null;
        field4163 = null;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IBLaa;I)Z")
    public final boolean method1935(int arg0, byte arg1, class281 arg2, int arg3) {
        if (arg1 >= -100) {
            this.field4153 = -27;
        }
        field4156++;
        if (this.field4152 != null) {
            for (int var5 = 0; var5 < this.field4152.length; var5++) {
                if (this.field4152[var5].method265(arg0, arg3) && this.field4157.method136(0, arg0, arg3, arg2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IB)Loa;")
    public static final class413 method1936(int arg0, byte arg1) {
        field4151++;
        class190 var2 = class395.field5776;
        class413 var3;
        synchronized (class395.field5776) {
            var3 = (class413) class395.field5776.method1246((byte) -102, (long) arg0);
        }
        if (arg1 != -11) {
            field4158 = null;
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class125.field1745.method1920(class66.method451(arg0, arg1 + 1034), false, class401.method2592(arg0, (byte) 60));
        class413 var5 = new class413();
        if (var4 != null) {
            var5.method2646(new class371(var4), -70);
        }
        class190 var6 = class395.field5776;
        synchronized (class395.field5776) {
            class395.field5776.method1247((long) arg0, (byte) -117, var5);
            return var5;
        }
    }
}
