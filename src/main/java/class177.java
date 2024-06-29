import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class177 extends class147 {

    @OriginalMember(owner = "client!se", name = "G", descriptor = "Ldg;")
    public class51 field2978;

    @OriginalMember(owner = "client!se", name = "H", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2979 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!se", name = "J", descriptor = "S")
    public static short field2981 = 32767;

    @OriginalMember(owner = "client!se", name = "K", descriptor = "Lqj;")
    private static class196 field2982 = class80.method502("skill)2", -48);

    @OriginalMember(owner = "client!se", name = "N", descriptor = "Lqj;")
    public static class196 field2984 = field2982;

    @OriginalMember(owner = "client!se", name = "L", descriptor = "Lrd;")
    public static class253 field2983 = new class253();

    @OriginalMember(owner = "client!se", name = "O", descriptor = "Lqj;")
    public static class196 field2985 = class80.method502("<col=ffffff>", -48);

    @OriginalMember(owner = "client!se", name = "P", descriptor = "[I")
    public static int[] field2986 = new int[99];

    @OriginalMember(owner = "client!se", name = "R", descriptor = "[I")
    public static int[] field2988;

    @OriginalMember(owner = "client!se", name = "Q", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!se", name = "F", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!se", name = "I", descriptor = "I")
    public static int field2980;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZLbk;)V")
    public static final void method1150(boolean arg0, class136 arg1) {
        class226.field4044 = arg1;
        if (!arg0) {
            field2987 = 116;
        }
        class122.field1744 = class226.field4044.method831(-12858, 16);
        field2980++;
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)V")
    public static void method1151(byte arg0) {
        field2979 = null;
        field2988 = null;
        if (arg0 <= 102) {
            return;
        }
        field2986 = null;
        field2984 = null;
        field2982 = null;
        field2983 = null;
        field2985 = null;
    }

    @OriginalMember(owner = "client!se", name = "<init>", descriptor = "(Ldg;)V")
    public class177(class51 arg0) {
        this.field2978 = arg0;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field2986[var1] = var0 / 4;
        }
        field2988 = new int[] { 12543016, 15504954, 15914854, 16773818 };
        field2987 = 0;
    }
}
