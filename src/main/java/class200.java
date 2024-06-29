import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class200 {

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public int field3411 = 0;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    public int field3417 = 0;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "Leda;")
    private class14 field3413 = new class14(64);

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "Luf;")
    private class359 field3418 = null;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "Lla;")
    private class422 field3409;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "Lla;")
    private class422 field3416;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field3406 = -1;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "Lht;")
    public static class393 field3408 = new class393();

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field3410;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public static int field3414;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "I")
    public static int field3415;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(II)Lmia;")
    public final class660 method1493(int arg0, int arg1) {
        field3414++;
        class660 var3 = (class660) this.field3413.method80((byte) -124, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field3409.method2624(0, 1, arg1 & 0x7FFF);
        } else {
            var4 = this.field3416.method2624(0, 1, arg1);
        }
        class660 var5 = new class660();
        var5.field9401 = this;
        if (arg0 != 1) {
            return null;
        }
        if (var4 != null) {
            var5.method3718((byte) 54, new class301(var4));
        }
        if (arg1 >= 32768) {
            var5.method3720(arg0 - 1);
        }
        this.field3413.method67((long) arg1, var5, -6772);
        return var5;
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(II)V")
    public static final void method1494(int arg0, int arg1) {
        if (arg1 != 1960982448) {
            field3408 = null;
        }
        for (class65 var2 = class488.field7060.method3508((byte) -90); var2 != null; var2 = class488.field7060.method3520(-1)) {
            if ((var2.field1039 >> 48 & 0xFFFFL) == (long) arg0) {
                var2.method636((byte) 97);
            }
        }
        field3407++;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "([IBLln;J)Ljava/lang/String;")
    public final String method1495(int[] arg0, byte arg1, class472 arg2, long arg3) {
        field3415++;
        if (arg1 != -73) {
            method1494(68, 105);
        }
        if (this.field3418 != null) {
            String var6 = this.field3418.method1079(arg0, (byte) 102, arg3, arg2);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public static final void method1496(byte arg0) {
        int var1 = 90 / ((arg0 - 14) / 45);
        field3410++;
        class93.field1396 = new class605();
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(B)V")
    public static void method1497(byte arg0) {
        field3408 = null;
        if (arg0 < 42) {
            method1497((byte) -19);
        }
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(ILla;Lla;Luf;)V")
    public class200(int arg0, class422 arg1, class422 arg2, class359 arg3) {
        this.field3418 = arg3;
        this.field3409 = arg2;
        this.field3416 = arg1;
        if (this.field3416 != null) {
            this.field3411 = this.field3416.method2615(0, 1);
        }
        if (this.field3409 != null) {
            this.field3417 = this.field3409.method2615(0, 1);
        }
    }
}
