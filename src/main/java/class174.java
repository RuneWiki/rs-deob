import java.io.IOException;
import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class174 implements class57 {

    @OriginalMember(owner = "client!q", name = "d", descriptor = "[Ldc;")
    public static class37[] field3311 = new class37[1000];

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public static volatile int field3316 = 0;

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3314 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Ldc;")
    public static class37 field3320 = class185.method1233((byte) 86, ")4slr2)3ws?order=LPWM");

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Ldc;")
    public static class37 field3322 = class185.method1233((byte) 86, "blinken2:");

    @OriginalMember(owner = "client!q", name = "l", descriptor = "[I")
    public static int[] field3319 = new int[32];

    @OriginalMember(owner = "client!q", name = "p", descriptor = "[I")
    public static int[] field3323 = new int[5];

    @OriginalMember(owner = "client!q", name = "n", descriptor = "I")
    public static volatile int field3321 = 0;

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public static int field3313;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "[I")
    public static int[] field3308;

    @OriginalMember(owner = "client!q", name = "k", descriptor = "[I")
    public static int[] field3318;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IBJ[I)Ldc;")
    public final class37 method444(int arg0, byte arg1, long arg2, int[] arg3) {
        field3313++;
        if (arg0 == 0) {
            class142 var6 = class9.method61(arg3[0], false);
            return var6.method994((int) arg2, -110);
        } else if (arg0 == 1) {
            class125 var7 = class223.method1471(-112, (int) arg2);
            return var7.field2232;
        } else {
            if (arg1 != 56) {
                method1177(126);
            }
            return arg0 == 6 ? class9.method61(arg3[0], false).method994((int) arg2, -120) : null;
        }
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Lce;B)Ljb;")
    public static final class99 method1173(class28 arg0, byte arg1) {
        field3312++;
        class99 var2 = new class99();
        var2.field1718 = arg0.method230((byte) -115);
        if (arg1 <= 8) {
            method1173(null, (byte) -29);
        }
        var2.field1719 = class66.method486(var2.field1718, 1);
        return var2;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(Z)V")
    public static void method1174(boolean arg0) {
        field3314 = null;
        field3311 = null;
        field3318 = null;
        if (!arg0) {
            field3311 = null;
        }
        field3319 = null;
        field3308 = null;
        field3320 = null;
        field3323 = null;
        field3322 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(IJ)Ldc;")
    public static final class37 method1175(int arg0, long arg1) {
        field3310++;
        if (arg0 != -16309) {
            method1175(99, -45L);
        }
        return class163.method1105(arg1, 10, (byte) 43, false);
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)Z")
    public static final boolean method1176(int arg0) {
        field3315++;
        if (arg0 != -51) {
            method1177(-29);
        }
        try {
            return class77.method531(20044);
        } catch (IOException var4) {
            class101.method665(-94);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class223.field4136 + "," + class59.field1105 + "," + class59.field1096 + " - " + class8.field100 + "," + (class238.field4382.field3494[0] + class99.field1735) + "," + (class238.field4382.field3525[0] + class124.field2212) + " - ";
            for (int var3 = 0; var3 < class8.field100 && var3 < 50; var3++) {
                var2 = var2 + class12.field167.field502[var3] + ",";
            }
            class60.method455(95, var5, var2);
            class84.method574(true);
            return true;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static final void method1177(int arg0) {
        for (int var1 = 0; var1 < class95.field1669; var1++) {
            int var2 = class92.field1579[var1];
            class66 var3 = class70.field1262[var2];
            if (var3 != null) {
                class62.method462((byte) 84, var3, var3.field1190.field3851);
            }
        }
        if (arg0 < 73) {
            field3322 = null;
        }
        field3317++;
    }
}
