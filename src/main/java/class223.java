import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class223 extends class550 {

    @OriginalMember(owner = "client!ig", name = "f", descriptor = "I")
    public static int field3351 = 0;

    @OriginalMember(owner = "client!ig", name = "g", descriptor = "[Lfh;")
    public static class605[] field3352 = new class605[4];

    @OriginalMember(owner = "client!ig", name = "j", descriptor = "[I")
    public static int[] field3355 = new int[1];

    @OriginalMember(owner = "client!ig", name = "k", descriptor = "Ljava/util/Calendar;")
    public static Calendar field3356 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field3350;

    @OriginalMember(owner = "client!ig", name = "h", descriptor = "I")
    public static int field3353;

    @OriginalMember(owner = "client!ig", name = "i", descriptor = "I")
    public static int field3354;

    @OriginalMember(owner = "client!ig", name = "l", descriptor = "I")
    public static int field3357;

    @OriginalMember(owner = "client!ig", name = "m", descriptor = "Lf;")
    public static class702 field3358;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V")
    public static final void method1531(int arg0) {
        for (int var1 = arg0; var1 < class240.field3541.length; var1++) {
            for (int var2 = 0; var2 < class240.field3541[var1].length; var2++) {
                class240.field3541[var1][var2] = class14.field742;
            }
        }
        field3354++;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public static final String method1532(byte arg0, int arg1) {
        if (arg0 <= 16) {
            field3355 = null;
        }
        field3357++;
        return (arg1 >> 24 & 0xFF) + "." + ((arg1 & 0xFFF808) >> 16) + "." + ((arg1 & 0xFF2E) >> 8) + "." + (arg1 & 0xFF);
    }

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "(I)V")
    public static void method1533(int arg0) {
        field3355 = null;
        field3352 = null;
        field3358 = null;
        if (arg0 != -1307617406) {
            method1531(-104);
        }
        field3356 = null;
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(ILn;)[Lcu;")
    public static final class202[] method1534(int arg0, class17 arg1) {
        field3350++;
        if (!arg1.method406(0)) {
            return new class202[0];
        }
        class456 var2 = arg1.method408(65535);
        while (var2.field6502 == 0) {
            class185.method1354(10L, 10);
        }
        if (var2.field6502 == 2) {
            return new class202[0];
        }
        int[] var3 = (int[]) var2.field6499;
        class202[] var4 = new class202[var3.length >> 2];
        if (arg0 != 1769) {
            method1533(108);
        }
        for (int var5 = 0; var5 < var4.length; var5++) {
            class202 var6 = new class202();
            var4[var5] = var6;
            var6.field3116 = var3[var5 << 2];
            var6.field3112 = var3[(var5 << 2) + 1];
            var6.field3119 = var3[(var5 << 2) + 2];
            var6.field3117 = var3[(var5 << 2) + 3];
        }
        return var4;
    }
}
