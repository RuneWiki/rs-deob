import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public abstract class class532 {

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "Lwg;")
    public class449 field7494;

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field7493 = Calendar.getInstance();

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field7497 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "Z")
    public static boolean field7498 = false;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "I")
    public static int field7491;

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "I")
    public static int field7492;

    @OriginalMember(owner = "client!bda", name = "e", descriptor = "I")
    public static int field7495;

    @OriginalMember(owner = "client!bda", name = "f", descriptor = "I")
    public static int field7496;

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "I")
    public static int field7499;

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "I")
    public static int field7500;

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "I")
    public static int field7501;

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "I")
    public static int field7502;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(I)V")
    public void method705(int arg0) {
        if (arg0 != 1580) {
            field7498 = false;
        }
        field7491++;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "([[BLer;B)V")
    public static final void method3169(byte[][] arg0, class117 arg1, byte arg2) {
        field7492++;
        if (arg2 != 101) {
            field7498 = true;
        }
        int var3 = class786.field10842.length;
        for (int var4 = 0; var4 < var3; var4++) {
            byte[] var5 = arg0[var4];
            if (var5 != null) {
                int var6 = (class471.field6569[var4] >> 8) * 64 - class632.field8626;
                int var7 = (class471.field6569[var4] & 0xFF) * 64 - class620.field8435;
                class580.method3339((byte) -58);
                arg1.method916(arg2 + 899005597, class363.field4526, var7, class633.field8649, var5, var6);
            }
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(B)V")
    public void method698(byte arg0) {
        int var2 = -49 % ((68 - arg0) / 40);
        field7499++;
    }

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(B)V")
    public void method706(byte arg0) {
        field7501++;
        if (arg0 > -20) {
            this.method1371(74);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)V")
    public abstract void method699(boolean arg0);

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZI)V")
    public abstract void method707(boolean arg0, int arg1);

    @OriginalMember(owner = "client!bda", name = "b", descriptor = "(I)V")
    public void method697(int arg0) {
        if (arg0 > 14) {
            field7495++;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IILjava/lang/String;)Lwn;")
    public static final class753 method3170(int arg0, int arg1, String arg2) {
        field7500++;
        class753 var3;
        try {
            var3 = (class753) Class.forName("dea").getDeclaredConstructor().newInstance();
        } catch (Throwable var4) {
            var3 = new class401();
        }
        var3.field10442 = arg2;
        var3.field10439 = arg1;
        if (arg0 != 64) {
            method3169(null, null, (byte) 18);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(B)V")
    public void method704(byte arg0) {
        field7502++;
        if (arg0 < 41) {
            field7498 = false;
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZILgaa;)V")
    public abstract void method701(boolean arg0, int arg1, class315 arg2);

    @OriginalMember(owner = "client!bda", name = "c", descriptor = "(I)V")
    public void method1371(int arg0) {
        field7496++;
        if (arg0 != 64) {
            this.method706((byte) -77);
        }
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(ZB)V")
    public abstract void method702(boolean arg0, byte arg1);

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "(I)V")
    public static void method3171(int arg0) {
        field7497 = null;
        field7493 = null;
        int var1 = -45 % ((-arg0 - 8) / 39);
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(Lwg;)V")
    public class532(class449 arg0) {
        this.field7494 = arg0;
    }

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(IBI)V")
    public abstract void method700(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!bda", name = "d", descriptor = "(B)Z")
    public abstract boolean method703(byte arg0);
}
