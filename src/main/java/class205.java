import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class205 {

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "La;")
    public static class1 field3941 = null;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "I")
    public static int field3946 = 0;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Ljd;")
    public static class92 field3947 = class202.method1325((byte) 90, "Fehler beim Laden Ihres Spielcharakters)3");

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Ljd;")
    public static class92 field3942 = class202.method1325((byte) 90, "RuneScape wird geladen )2 bitte warten)3)3)3");

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field3953 = 0;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Ljd;")
    public static class92 field3950 = class202.method1325((byte) 90, "b12_full");

    @OriginalMember(owner = "client!vh", name = "s", descriptor = "I")
    public static int field3957 = 0;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field3939;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "I")
    public int field3943;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public int field3944;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public int field3948;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "I")
    public int field3951;

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "I")
    public int field3954;

    @OriginalMember(owner = "client!vh", name = "q", descriptor = "I")
    public int field3955;

    @OriginalMember(owner = "client!vh", name = "r", descriptor = "I")
    public int field3956;

    @OriginalMember(owner = "client!vh", name = "t", descriptor = "I")
    public int field3958;

    @OriginalMember(owner = "client!vh", name = "u", descriptor = "I")
    public static int field3959;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "Lnh;")
    public static class133 field3952;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(JZ)V")
    public static final void method1336(long arg0, boolean arg1) {
        field3945++;
        if (arg0 == 0L) {
            return;
        }
        if (class64.field1302 >= 100) {
            class117.method788(class3.field189, -19001, 0, class31.field713);
            return;
        }
        class92 var3 = class129.method855(arg1, arg0).method617(1);
        for (int var4 = 0; var4 < class64.field1302; var4++) {
            if (class144.field2880[var4] == arg0) {
                class117.method788(class3.field189, -19001, 0, class77.method529(-3, new class92[] { var3, class30.field660 }));
                return;
            }
        }
        for (int var5 = 0; var5 < class166.field3273; var5++) {
            if (class93.field1878[var5] == arg0) {
                class117.method788(class3.field189, -19001, 0, class77.method529(-3, new class92[] { class135.field2704, var3, class153.field3034 }));
                return;
            }
        }
        if (var3.method631(5003, class15.field423.field1805)) {
            class117.method788(class3.field189, -19001, 0, class60.field1249);
            return;
        }
        class40.field896++;
        class144.field2880[class64.field1302] = arg0;
        class174.field3366[class64.field1302++] = class129.method855(arg1, arg0);
        class136.field2732 = class186.field3516;
        class99.field2000.method405(129, 7);
        class99.field2000.method459(arg1, arg0);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([Ljd;Z[S)V")
    public static final void method1337(class92[] arg0, boolean arg1, short[] arg2) {
        class121.method815(arg2, arg0, 0, arg0.length - 1, -1);
        field3940++;
        if (!arg1) {
            method1336(44L, true);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
    public static void method1338(boolean arg0) {
        if (!arg0) {
            field3941 = null;
        }
        field3947 = null;
        field3950 = null;
        field3942 = null;
        field3941 = null;
        field3952 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([BLla;II)V")
    public static final void method1339(byte[] arg0, class108 arg1, int arg2, int arg3) {
        class150 var4 = new class150();
        var4.field2970 = arg3;
        var4.field2974 = arg0;
        field3949++;
        var4.field2975 = arg1;
        var4.field4079 = arg2;
        class18 var5 = class189.field3595;
        synchronized (class189.field3595) {
            class189.field3595.method101(var4, (byte) 127);
        }
        class138.method918(false);
    }
}
