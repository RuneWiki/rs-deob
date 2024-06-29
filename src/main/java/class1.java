import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "d", descriptor = "I")
    public static int field4 = -1;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "Lle;")
    public static class71 field1 = new class71(500);

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Lrc;")
    public static class105 field7 = class43.method374("Verbindung abgebrochen)3", 0);

    @OriginalMember(owner = "client!a", name = "j", descriptor = "Lrc;")
    public static class105 field10 = class43.method374("blinken2:", 0);

    @OriginalMember(owner = "client!a", name = "f", descriptor = "Lrc;")
    public static class105 field6 = class43.method374("Untersuchen", 0);

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field9 = 0;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Lrc;")
    public static class105 field8 = class43.method374("Lade Eingabe)2Steuerungsprogramm)3)3)3", 0);

    @OriginalMember(owner = "client!a", name = "l", descriptor = "Lrc;")
    public static class105 field12 = class43.method374("", 0);

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Lrc;")
    public static class105 field11 = class43.method374(")2", 0);

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "I")
    public static int field2;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field3;

    @OriginalMember(owner = "client!a", name = "e", descriptor = "I")
    public static int field5;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)V", line = 9)
    public static void method1(byte arg0) {
        if (arg0 < 86) {
            field8 = null;
        }
        field1 = null;
        field12 = null;
        field11 = null;
        field10 = null;
        field8 = null;
        field6 = null;
        field7 = null;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lte;I)[I", line = 25)
    public static final int[] method2(class119 arg0, int arg1) {
        int var2;
        if (arg0.field2867 >= 0) {
            var2 = arg0.field2867 >> 16;
        } else {
            var2 = arg0.field2797 >> 16;
        }
        field5++;
        if (!class29.method273(var2, 69)) {
            return null;
        }
        int var3 = 120 / ((-arg1 - 15) / 47);
        int var4 = arg0.field2810;
        int var5 = arg0.field2862;
        class119 var8;
        for (int var6 = arg0.field2797; var6 != -1; var6 = var8.field2797) {
            var8 = class14.field282[var2][var6 & 0xFFFF];
            var5 += var8.field2862;
            if (!arg0.field2825) {
                var5 -= var8.field2838;
            }
            var4 += var8.field2810;
            if (!arg0.field2825) {
                var4 -= var8.field2794;
            }
        }
        return new int[] { var4, var5 };
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)J", line = 102)
    public static final synchronized long method3(boolean arg0) {
        field2++;
        long var1 = System.currentTimeMillis();
        if (class6.field75 > var1) {
            class102.field2323 += class6.field75 - var1;
        }
        if (arg0) {
            method3(false);
        }
        class6.field75 = var1;
        return class102.field2323 + var1;
    }
}
