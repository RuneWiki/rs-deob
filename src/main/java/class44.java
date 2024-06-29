import java.io.UnsupportedEncodingException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class44 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Ljd;")
    public static class92 field986 = class202.method1325((byte) 90, "Art");

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[I")
    public static int[] field983 = new int[2000];

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "[J")
    public static long[] field990 = new long[500];

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public static int field988 = 0;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Ljd;")
    public static class92 field987 = class202.method1325((byte) 90, "::fpson");

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field984;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field985;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "I")
    public static int field989;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field992;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "Lnh;")
    public static class133 field991;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(BSIJLjd;ILjd;)V")
    public static final void method275(byte arg0, short arg1, int arg2, long arg3, class92 arg4, int arg5, class92 arg6) {
        field992++;
        if (class72.field1524) {
            return;
        }
        if (arg0 != -110) {
            method276(-97, null);
        }
        if (class3.field182 >= 500) {
            return;
        }
        class92.field1815[class3.field182] = arg6;
        class189.field3604[class3.field182] = arg4;
        class13.field383[class3.field182] = arg1;
        field990[class3.field182] = arg3;
        class186.field3520[class3.field182] = arg2;
        class137.field2741[class3.field182] = arg5;
        class3.field182++;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(ILjava/lang/String;)Ljd;")
    public static final class92 method276(int arg0, String arg1) {
        field985++;
        byte[] var2;
        try {
            var2 = arg1.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException var5) {
            var2 = arg1.getBytes();
        }
        class92 var3 = new class92();
        var3.field1838 = arg0;
        var3.field1856 = var2;
        for (int var4 = 0; var4 < var2.length; var4++) {
            if (var2[var4] != 0) {
                var2[var3.field1838++] = var2[var4];
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)V")
    public static void method277(int arg0) {
        field990 = null;
        field991 = null;
        if (arg0 != 16711680) {
            method276(22, null);
        }
        field983 = null;
        field986 = null;
        field987 = null;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIIII)V")
    public static final void method278(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field989++;
        if (class73.field1540 == 1) {
            class155.field3092[class205.field3946 / 100].method1097(class185.field3505 - 8, class159.field3164 + -8);
        }
        if (class73.field1540 == 2) {
            class155.field3092[class205.field3946 / 100 + 4].method1097(class185.field3505 - 8, class159.field3164 + -8);
        }
        class21.method130(3491);
        if (class30.field650) {
            int var5 = arg1 + 20;
            int var6 = arg3 + 512 - 5;
            class176.field3387.method995(class77.method529(-3, new class92[] { class143.field2852, class142.method938(class200.field3888, false) }), var6, var5, 16776960, -1);
            int var10 = var5 + 15;
            Runtime var7 = Runtime.getRuntime();
            int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
            int var9 = 16776960;
            if (var8 > 32768 && class115.field2339) {
                var9 = 16711680;
            }
            if (var8 > 65536 && !class115.field2339) {
                var9 = 16711680;
            }
            class176.field3387.method995(class77.method529(-3, new class92[] { class49.field1062, class142.method938(var8, false), class190.field3645 }), var6, var10, var9, -1);
            var5 = var10 + 15;
        }
        if (arg4 >= -36) {
            field990 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljd;I)Z")
    public static final boolean method279(class92 arg0, int arg1) {
        field984++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class64.field1302; var2++) {
            if (arg0.method646(118, class174.field3366[var2])) {
                return true;
            }
        }
        return false;
    }
}
