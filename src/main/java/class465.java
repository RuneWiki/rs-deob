import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!it")
public class class465 {

    @OriginalMember(owner = "client!it", name = "c", descriptor = "[Lpg;")
    private class525[] field6751;

    @OriginalMember(owner = "client!it", name = "g", descriptor = "I")
    private int field6755;

    @OriginalMember(owner = "client!it", name = "e", descriptor = "I")
    public static int field6753 = 0;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "Lrm;")
    public static class288 field6749 = new class288();

    @OriginalMember(owner = "client!it", name = "k", descriptor = "Luw;")
    public static class293 field6759 = new class293(0, -1);

    @OriginalMember(owner = "client!it", name = "m", descriptor = "Ljava/util/Calendar;")
    public static Calendar field6761 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!it", name = "o", descriptor = "I")
    public static int field6763 = 0;

    @OriginalMember(owner = "client!it", name = "p", descriptor = "Lvr;")
    public static class92 field6764 = new class92(11, 0, 1, 2);

    @OriginalMember(owner = "client!it", name = "b", descriptor = "I")
    public static int field6750;

    @OriginalMember(owner = "client!it", name = "f", descriptor = "I")
    public static int field6754;

    @OriginalMember(owner = "client!it", name = "i", descriptor = "I")
    public static int field6757;

    @OriginalMember(owner = "client!it", name = "j", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!it", name = "l", descriptor = "I")
    public static int field6760;

    @OriginalMember(owner = "client!it", name = "n", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!it", name = "d", descriptor = "J")
    private long field6752;

    @OriginalMember(owner = "client!it", name = "h", descriptor = "Lpg;")
    private class525 field6756;

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(B)Lpg;", line = 4)
    public final class525 method2758(byte arg0) {
        field6757++;
        if (this.field6756 == null) {
            return null;
        }
        class525 var2 = this.field6751[(int) ((long) (this.field6755 - 1) & this.field6752)];
        int var3 = 110 / ((arg0 + 53) / 48);
        while (this.field6756 != var2) {
            if (this.field6756.field7659 == this.field6752) {
                class525 var4 = this.field6756;
                this.field6756 = this.field6756.field7660;
                return var4;
            }
            this.field6756 = this.field6756.field7660;
        }
        this.field6756 = null;
        return null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IJ)Lpg;", line = 37)
    public final class525 method2759(int arg0, long arg1) {
        field6762++;
        this.field6752 = arg1;
        class525 var4 = this.field6751[(int) ((long) (this.field6755 - 1) & arg1)];
        this.field6756 = var4.field7660;
        int var5 = 87 / (-arg0 / 61);
        while (this.field6756 != var4) {
            if (this.field6756.field7659 == arg1) {
                class525 var6 = this.field6756;
                this.field6756 = this.field6756.field7660;
                return var6;
            }
            this.field6756 = this.field6756.field7660;
        }
        this.field6756 = null;
        return null;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IBI)Z", line = 79)
    public static final boolean method2760(int arg0, byte arg1, int arg2) {
        field6760++;
        if (arg1 >= -12) {
            field6761 = null;
        }
        return (arg2 & 0x70000) != 0 | class463.method2749(arg2, arg0, 68) || class409.method2431(arg0, arg2, true);
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "([JI[Ljava/lang/Object;)V", line = 90)
    public static final void method2761(long[] arg0, int arg1, Object[] arg2) {
        field6758++;
        class296.method1906((byte) 126, 0, arg0.length - 1, arg2, arg0);
        int var3 = -45 / ((arg1 - 76) / 37);
    }

    @OriginalMember(owner = "client!it", name = "<init>", descriptor = "(I)V", line = 100)
    public class465(int arg0) {
        this.field6751 = new class525[arg0];
        this.field6755 = arg0;
        for (int var2 = 0; var2 < arg0; var2++) {
            class525 var3 = this.field6751[var2] = new class525();
            var3.field7662 = var3;
            var3.field7660 = var3;
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(I)V", line = 123)
    public static void method2762(int arg0) {
        field6761 = null;
        field6759 = null;
        field6749 = null;
        field6764 = null;
        if (arg0 != -25733) {
            method2760(71, (byte) -80, -83);
        }
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(IIIIIII)V", line = 140)
    public static final void method2763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6750++;
        class65.field1108 = arg5;
        class383.field5488 = arg3;
        if (arg2 != 8069) {
            field6761 = null;
        }
        class130.field2040 = arg1;
        class153.field2332 = arg4;
        class69.field1144 = arg6;
        class274.field4098 = arg0;
    }

    @OriginalMember(owner = "client!it", name = "a", descriptor = "(Lpg;IJ)V", line = 167)
    public final void method2764(class525 arg0, int arg1, long arg2) {
        if (arg0.field7662 != null) {
            arg0.method3115((byte) 103);
        }
        field6754++;
        class525 var5 = this.field6751[(int) (arg2 & (long) (this.field6755 + arg1))];
        arg0.field7660 = var5;
        arg0.field7662 = var5.field7662;
        arg0.field7662.field7660 = arg0;
        arg0.field7659 = arg2;
        arg0.field7660.field7662 = arg0;
    }
}
