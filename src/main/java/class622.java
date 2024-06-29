import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ww")
public class class622 {

    @OriginalMember(owner = "client!ww", name = "e", descriptor = "Lil;")
    public static class7 field8967 = new class7("WTI", 5);

    @OriginalMember(owner = "client!ww", name = "f", descriptor = "Ljava/util/Calendar;")
    public static Calendar field8968 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "I")
    public static int field8963;

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "I")
    public static int field8964;

    @OriginalMember(owner = "client!ww", name = "c", descriptor = "I")
    public static int field8965;

    @OriginalMember(owner = "client!ww", name = "d", descriptor = "I")
    public static int field8966;

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(Los;II)Ljava/lang/String;", line = 3)
    public static final String method3564(class374 arg0, int arg1, int arg2) {
        field8964++;
        try {
            int var3 = -111 % ((arg1 + 71) / 32);
            int var4 = arg0.method2122(false);
            if (arg2 < var4) {
                var4 = arg2;
            }
            byte[] var5 = new byte[var4];
            arg0.field4966 += class93.field1141.method2844(var4, arg0.field4966, (byte) -119, arg0.field4929, 0, var5);
            return class341.method1906(var5, 0, var4, (byte) 86);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(I)V", line = 32)
    public static final void method3565(int arg0) {
        for (int var1 = arg0; var1 < 100; var1++) {
            class5.field45[var1] = null;
        }
        field8963++;
        class602.field8691 = 0;
    }

    @OriginalMember(owner = "client!ww", name = "b", descriptor = "(I)V", line = 47)
    public static void method3566(int arg0) {
        field8968 = null;
        if (arg0 < 118) {
            method3564(null, -36, 32);
        }
        field8967 = null;
    }

    @OriginalMember(owner = "client!ww", name = "a", descriptor = "(B)V", line = 59)
    public static final void method3567(byte arg0) {
        field8966++;
        class400.method2291(27115);
        class93.method560(true);
        int var1 = -68 / ((69 - arg0) / 40);
    }
}
