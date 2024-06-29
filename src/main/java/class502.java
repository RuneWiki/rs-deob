import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class502 {

    @OriginalMember(owner = "client!qe", name = "m", descriptor = "I")
    public int field7344;

    @OriginalMember(owner = "client!qe", name = "o", descriptor = "I")
    public int field7346;

    @OriginalMember(owner = "client!qe", name = "k", descriptor = "Lqe;")
    public class502 field7342;

    @OriginalMember(owner = "client!qe", name = "n", descriptor = "Lc;")
    public class512 field7345;

    @OriginalMember(owner = "client!qe", name = "p", descriptor = "Z")
    public static boolean field7347 = false;

    @OriginalMember(owner = "client!qe", name = "j", descriptor = "Lrb;")
    public static class283 field7341 = new class283(62, -2);

    @OriginalMember(owner = "client!qe", name = "q", descriptor = "I")
    public static int field7348 = 0;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public int field7332;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "I")
    public int field7333;

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "I")
    public static int field7334;

    @OriginalMember(owner = "client!qe", name = "d", descriptor = "I")
    public static int field7335;

    @OriginalMember(owner = "client!qe", name = "e", descriptor = "I")
    public static int field7336;

    @OriginalMember(owner = "client!qe", name = "f", descriptor = "I")
    public static int field7337;

    @OriginalMember(owner = "client!qe", name = "g", descriptor = "I")
    public int field7338;

    @OriginalMember(owner = "client!qe", name = "h", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!qe", name = "i", descriptor = "I")
    public static int field7340;

    @OriginalMember(owner = "client!qe", name = "l", descriptor = "Lclient;")
    public static client field7343;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IB)Z")
    public static final boolean method2980(int arg0, byte arg1) {
        if (arg1 != 95) {
            method2980(67, (byte) 78);
        }
        field7336++;
        return arg0 == 2 || arg0 == 4 || arg0 == 5;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(III)Z")
    public static final boolean method2981(int arg0, int arg1, int arg2) {
        field7335++;
        if (arg2 == 22) {
            return (arg1 & 0x21) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(Z)V")
    public static void method2982(boolean arg0) {
        if (!arg0) {
            method2983(50);
        }
        field7341 = null;
        field7343 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(I)V")
    public static final void method2983(int arg0) {
        field7339++;
        if (arg0 != 26) {
            field7343 = null;
        }
        for (class440 var1 = (class440) class391.field5638.method3137(arg0 - 26); var1 != null; var1 = (class440) class391.field5638.method3132(0)) {
            if (class434.method2574(1400, var1.field6337)) {
                class329.method1945(0, var1);
            }
        }
        if (class527.field7690 == 1) {
            class140.method985((byte) -27);
            return;
        }
        class94.method767(class110.field1797, class72.field1031, class334.field4880, class27.field371, (byte) 39);
        int var2 = class80.field1127.method416(8364, class41.field608.method1126(class486.field6998, (byte) -19));
        for (class440 var3 = (class440) class391.field5638.method3137(0); var3 != null; var3 = (class440) class391.field5638.method3132(0)) {
            int var4 = class316.method1819((byte) 64, var3);
            if (var2 < var4) {
                var2 = var4;
            }
        }
        class334.field4880 = (class170.field2591 ? 26 : 22) + class527.field7690 * 16;
        class72.field1031 = var2 + 8;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)Lsq;")
    public final class363 method2984(byte arg0) {
        field7337++;
        int var2 = 14 % ((-arg0 - 34) / 57);
        return class509.method3013(this.field7346, -14838);
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(BI)Lqe;")
    public final class502 method2985(byte arg0, int arg1) {
        if (arg0 >= -73) {
            method2980(-7, (byte) 17);
        }
        field7334++;
        return new class502(this.field7346, arg1);
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(II)V")
    public class502(int arg0, int arg1) {
        this.field7344 = arg1;
        this.field7346 = arg0;
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "(Lqe;I)V")
    public class502(class502 arg0, int arg1) {
        this.field7342 = arg0;
        this.field7344 = this.field7342.field7344 + arg1;
        this.field7346 = this.field7342.field7346;
        this.field7345 = this.field7342.field7345;
    }
}
