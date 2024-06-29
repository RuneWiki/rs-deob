import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!il")
public class class264 extends class338 {

    @OriginalMember(owner = "client!il", name = "p", descriptor = "Ljava/lang/String;")
    public String field3603;

    @OriginalMember(owner = "client!il", name = "t", descriptor = "I")
    public static int field3607 = 0;

    @OriginalMember(owner = "client!il", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3600 = "";

    @OriginalMember(owner = "client!il", name = "v", descriptor = "Z")
    public static boolean field3609 = true;

    @OriginalMember(owner = "client!il", name = "n", descriptor = "I")
    public static int field3601;

    @OriginalMember(owner = "client!il", name = "o", descriptor = "I")
    public static int field3602;

    @OriginalMember(owner = "client!il", name = "q", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!il", name = "u", descriptor = "I")
    public static int field3608;

    @OriginalMember(owner = "client!il", name = "r", descriptor = "Lqp;")
    public static class278 field3605;

    @OriginalMember(owner = "client!il", name = "w", descriptor = "Ljava/lang/String;")
    public static String field3610;

    @OriginalMember(owner = "client!il", name = "s", descriptor = "[B")
    public static byte[] field3606;

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(IIIII)V", line = 3)
    public static final void method1476(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= class322.field4306 && arg4 <= class310.field4183) {
            int var5 = class104.method556(class335.field4462, 2048, arg1, class6.field42);
            int var6 = class104.method556(class335.field4462, 2048, arg3, class6.field42);
            class297.method1745(-99, var6, arg0, var5, arg4);
        }
        if (arg2 < 29) {
            field3607 = 28;
        }
        field3608++;
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(B)Lin;", line = 20)
    public static final class180 method1477(byte arg0) {
        field3602++;
        if (arg0 >= -127) {
            method1478((byte) 64);
        }
        return class443.field6447;
    }

    @OriginalMember(owner = "client!il", name = "b", descriptor = "(B)V", line = 35)
    public static final void method1478(byte arg0) {
        field3601++;
        class281.field3857.field3389 = 0;
        class112.field1405 = -1;
        class140.field1793 = 0;
        class85.field952 = -1;
        class448.field6514.field3389 = 0;
        class161.field2065 = 0;
        class7.field68 = -1;
        class184.field2345 = -1;
        class422.field6188 = 0;
        class118.method639(1150);
        class228.method1234(Integer.MAX_VALUE);
        for (int var1 = 0; var1 < class85.field957.length; var1++) {
            if (class85.field957[var1] != null) {
                class85.field957[var1].field6024 = -1;
            }
        }
        if (arg0 <= 59) {
            field3605 = null;
        }
        for (int var2 = 0; var2 < class38.field397.length; var2++) {
            if (class38.field397[var2] != null) {
                class38.field397[var2].field6024 = -1;
            }
        }
        class342.method2001(-123);
        class294.field3993 = 1;
        class352.method2159(30, (byte) 65);
        for (int var3 = 0; var3 < 100; var3++) {
            class321.field4290[var3] = true;
        }
        class96.method526((byte) -113);
    }

    @OriginalMember(owner = "client!il", name = "c", descriptor = "(B)V", line = 92)
    public static void method1479(byte arg0) {
        field3600 = null;
        field3606 = null;
        if (arg0 <= 118) {
            method1476(-120, 39, -70, -111, 4);
        }
        field3605 = null;
        field3610 = null;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "()V", line = 114)
    public class264() {
    }

    @OriginalMember(owner = "client!il", name = "a", descriptor = "(BII)I", line = 121)
    public static final int method1480(byte arg0, int arg1, int arg2) {
        int var3 = -13 % ((arg0 - 42) / 62);
        field3604++;
        int var4 = arg1 >>> 31;
        return (arg1 + var4) / arg2 - var4;
    }

    @OriginalMember(owner = "client!il", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 132)
    public class264(String arg0, int arg1) {
        this.field3603 = arg0;
    }
}
