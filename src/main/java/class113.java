import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class class113 {

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Loh;")
    public static class258 field1949 = class153.method1046("", 103);

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field1954 = 0;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1946 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "[I")
    public static int[] field1959 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "[S")
    public static short[] field1956 = new short[] { -10304, 9104, -1, -1, -1 };

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "Lvj;")
    public static class96 field1957 = new class96(64);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public int field1944;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field1947;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public int field1948;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public int field1950;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public int field1952;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public int field1953;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public int field1955;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "[I")
    public static int[] field1958;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 27)
    public static void method818(int arg0) {
        field1949 = null;
        field1946 = null;
        field1956 = null;
        field1958 = null;
        field1959 = null;
        field1957 = null;
        if (arg0 != -2777) {
            field1958 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IJ)V", line = 44)
    public static final void method819(int arg0, long arg1) {
        field1945++;
        if (arg1 == 0L) {
            return;
        }
        if (!(class312.field5292 < 100 || class231.field4006) || class312.field5292 >= 200) {
            class140.method965(false, 0, class232.field4019, class235.field4104);
            return;
        }
        class258 var3 = class162.method1085(-65, arg1).method1786((byte) 107);
        for (int var4 = 0; var4 < class312.field5292; var4++) {
            if (class99.field1766[var4] == arg1) {
                class140.method965(false, 0, class100.method755(-6, new class258[] { var3, class96.field1683 }), class235.field4104);
                return;
            }
        }
        for (int var5 = 0; var5 < class138.field2355; var5++) {
            if (class209.field3607[var5] == arg1) {
                class140.method965(false, 0, class100.method755(arg0 + 22238, new class258[] { class58.field920, var3, class51.field820 }), class235.field4104);
                return;
            }
        }
        if (var3.method1821(arg0 + 22243, class152.field2606.field4007)) {
            class140.method965(false, 0, class64.field1125, class235.field4104);
            return;
        }
        class306.field5198[class312.field5292] = var3;
        class99.field1766[class312.field5292] = arg1;
        class197.field3449++;
        class291.field5009[class312.field5292] = 0;
        class20.field241[class312.field5292] = class235.field4104;
        if (arg0 != -22244) {
            return;
        }
        class105.field1888[class312.field5292] = 0;
        class98.field1754[class312.field5292] = false;
        class312.field5292++;
        class69.field1188 = class182.field3259;
        class159.field2710.method885(237, -127);
        class159.field2710.method1603(arg1, arg0 ^ 0x624F407C);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(II)V")
    public abstract void method378(int arg0, int arg1);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)V")
    public abstract void method382(int arg0, int arg1, int arg2);
}
