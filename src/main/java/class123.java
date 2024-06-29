import java.util.Calendar;
import java.util.TimeZone;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class123 {

    @OriginalMember(owner = "client!lg", name = "g", descriptor = "I")
    public static int field1921 = 0;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "Ljava/lang/String;")
    public static String field1924 = "Unable to find ";

    @OriginalMember(owner = "client!lg", name = "n", descriptor = "I")
    public static int field1928 = 0;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "[I")
    public static int[] field1925 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!lg", name = "h", descriptor = "F")
    public static float field1922 = 0.0F;

    @OriginalMember(owner = "client!lg", name = "o", descriptor = "Ljava/util/Calendar;")
    public static Calendar field1929 = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

    @OriginalMember(owner = "client!lg", name = "s", descriptor = "I")
    public static int field1933 = -1;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "I")
    public int field1915;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "I")
    public int field1916;

    @OriginalMember(owner = "client!lg", name = "c", descriptor = "I")
    public int field1917;

    @OriginalMember(owner = "client!lg", name = "f", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public int field1923;

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!lg", name = "p", descriptor = "J")
    public long field1930;

    @OriginalMember(owner = "client!lg", name = "d", descriptor = "Lfe;")
    public class94 field1918;

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "Lfe;")
    public class94 field1927;

    @OriginalMember(owner = "client!lg", name = "q", descriptor = "Lfe;")
    public class94 field1931;

    @OriginalMember(owner = "client!lg", name = "e", descriptor = "[I")
    public static int[] field1919;

    @OriginalMember(owner = "client!lg", name = "r", descriptor = "[Lkd;")
    public static class272[] field1932;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Lgn;IB)Ljava/lang/String;", line = 14)
    public static final String method835(class303 arg0, int arg1, byte arg2) {
        field1926++;
        try {
            int var3 = arg0.method2003(126);
            if (var3 > arg1) {
                var3 = arg1;
            }
            if (arg2 != -53) {
                method837(24);
            }
            byte[] var4 = new byte[var3];
            arg0.field4679 += class235.field3784.method2327(var4, arg0.field4716, arg0.field4679, var3, 0, (byte) 108);
            return class100.method684(var3, 0, var4, 31122);
        } catch (Exception var7) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(I)V", line = 47)
    public static final void method836(int arg0) {
        class43.method309(arg0 - 8977, false);
        System.gc();
        if (arg0 != 0) {
            method836(5);
        }
        field1920++;
        class231.method1583(25, (byte) 126);
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)V", line = 66)
    public static void method837(int arg0) {
        field1924 = null;
        field1925 = null;
        field1919 = null;
        field1932 = null;
        field1929 = null;
        if (arg0 != -4688) {
            field1919 = (int[]) null;
        }
    }
}
