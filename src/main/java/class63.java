import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class63 {

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    public static int field744 = 0;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field737;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field743;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "Lwj;")
    public static class130 field738;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "Lbc;")
    public static class282 field740;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "Lbc;")
    public static class282 field745;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V")
    public static void method384(int arg0) {
        field740 = null;
        field745 = null;
        field738 = null;
        if (arg0 != 21203) {
            method384(122);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(Z)V")
    public static final void method385(boolean arg0) {
        field742++;
        class178.field2531.method71(-86);
        if (arg0) {
            method385(false);
        }
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(I)V")
    public static final void method386(int arg0) {
        field743++;
        int var1 = 0;
        int var2 = 36 % ((-arg0 - 55) / 62);
        while (class272.field3986 > var1) {
            int var3 = class286.field4423[var1];
            class240 var4 = class253.field3656[var3];
            int var5 = class163.field2332.method1407(108);
            if ((var5 & 0x40) != 0) {
                var5 += class163.field2332.method1407(107) << 8;
            }
            class261.method1668(var3, (byte) 120, var4, var5);
            var1++;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V")
    public static final void method387(byte arg0) {
        for (int var1 = 0; var1 < class294.field4642; var1++) {
            int var2 = class14.field176[var1];
            class54 var3 = class20.field244[var2];
            if (var3 != null) {
                class2.method13(false, var3.field636.field3858, var3);
            }
        }
        field741++;
        if (arg0 <= 21) {
            method385(false);
        }
    }
}
