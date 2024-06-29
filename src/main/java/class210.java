import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class210 extends class109 {

    @OriginalMember(owner = "client!we", name = "r", descriptor = "[I")
    public int[] field4156 = new int[] { -1 };

    @OriginalMember(owner = "client!we", name = "q", descriptor = "[I")
    public int[] field4155 = new int[1];

    @OriginalMember(owner = "client!we", name = "o", descriptor = "Ldd;")
    public static class35 field4153 = class180.method1196((byte) -5, ")1p");

    @OriginalMember(owner = "client!we", name = "n", descriptor = "Ljava/util/Calendar;")
    public static Calendar field4152 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!we", name = "t", descriptor = "[I")
    public static int[] field4158 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!we", name = "w", descriptor = "I")
    public static int field4161 = 0;

    @OriginalMember(owner = "client!we", name = "s", descriptor = "Ldd;")
    public static class35 field4157 = class180.method1196((byte) 127, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!we", name = "u", descriptor = "Ldd;")
    public static class35 field4159 = class180.method1196((byte) -22, "Schrifts-=tze geladen)3");

    @OriginalMember(owner = "client!we", name = "x", descriptor = "I")
    public static int field4162 = -1;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!we", name = "y", descriptor = "I")
    public static int field4163;

    @OriginalMember(owner = "client!we", name = "v", descriptor = "Lgh;")
    public static class68 field4160;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "(I)V")
    public static final void method1379(int arg0) {
        field4154++;
        if (arg0 != -25217) {
            method1381(38);
        }
        if (class111.field2443 != null) {
            class61 var1 = class111.field2443;
            synchronized (class111.field2443) {
                class111.field2443 = null;
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(III)V")
    public static final void method1380(int arg0, int arg1, int arg2) {
        class54 var3 = class191.field3853[arg0][arg1][arg2];
        if (var3 != null) {
            var3.field1230 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)V")
    public static void method1381(int arg0) {
        field4153 = null;
        field4160 = null;
        field4158 = null;
        field4152 = null;
        field4159 = null;
        if (arg0 == 14118) {
            field4157 = null;
        }
    }
}
