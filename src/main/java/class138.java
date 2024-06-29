import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class138 {

    @OriginalMember(owner = "client!an", name = "b", descriptor = "[C")
    public static char[] field1957 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!an", name = "g", descriptor = "J")
    public static long field1962 = 0L;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "I")
    public int field1956;

    @OriginalMember(owner = "client!an", name = "c", descriptor = "I")
    public int field1958;

    @OriginalMember(owner = "client!an", name = "d", descriptor = "I")
    public static int field1959;

    @OriginalMember(owner = "client!an", name = "e", descriptor = "I")
    public int field1960;

    @OriginalMember(owner = "client!an", name = "f", descriptor = "I")
    public int field1961;

    @OriginalMember(owner = "client!an", name = "h", descriptor = "I")
    public int field1963;

    @OriginalMember(owner = "client!an", name = "i", descriptor = "I")
    public int field1964;

    @OriginalMember(owner = "client!an", name = "j", descriptor = "I")
    public int field1965;

    @OriginalMember(owner = "client!an", name = "k", descriptor = "I")
    public int field1966;

    @OriginalMember(owner = "client!an", name = "l", descriptor = "I")
    public int field1967;

    @OriginalMember(owner = "client!an", name = "m", descriptor = "I")
    public int field1968;

    @OriginalMember(owner = "client!an", name = "n", descriptor = "I")
    public int field1969;

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    public int field1972;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(Ljava/io/File;Z)[B", line = 6)
    public static final byte[] method911(File arg0, boolean arg1) {
        if (arg1) {
            return null;
        } else {
            field1970++;
            return class699.method3956(arg0, (byte) -128, (int) arg0.length());
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ILan;)Z", line = 23)
    public final boolean method912(int arg0, class138 arg1) {
        field1971++;
        if (arg0 != 234) {
            this.field1964 = 100;
        }
        return this.field1965 == arg1.field1965 && this.field1972 == arg1.field1972 && this.field1964 == arg1.field1964;
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V", line = 51)
    public static void method913(int arg0) {
        field1957 = null;
        if (arg0 <= 102) {
            field1957 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(B)Z", line = 62)
    public static final boolean method914(byte arg0) {
        field1959++;
        boolean var1 = true;
        if (class419.field5907 == null) {
            if (class671.field9318.method1578(class55.field784, (byte) -81)) {
                class419.field5907 = class52.method382(class671.field9318, class55.field784);
            } else {
                var1 = false;
            }
        }
        if (arg0 != 77) {
            field1957 = null;
        }
        if (class304.field4296 == null) {
            if (class671.field9318.method1578(class544.field7543, (byte) -81)) {
                class304.field4296 = class52.method382(class671.field9318, class544.field7543);
            } else {
                var1 = false;
            }
        }
        if (class320.field4453 == null) {
            if (class671.field9318.method1578(class49.field733, (byte) -81)) {
                class320.field4453 = class52.method382(class671.field9318, class49.field733);
            } else {
                var1 = false;
            }
        }
        if (class693.field9628 == null) {
            if (class307.field4312.method1578(class500.field6979, (byte) -81)) {
                class693.field9628 = class363.method2306(class500.field6979, class307.field4312, (byte) 118);
            } else {
                var1 = false;
            }
        }
        if (class413.field5860 == null) {
            if (class671.field9318.method1578(class500.field6979, (byte) -81)) {
                class413.field5860 = class52.method384(class671.field9318, class500.field6979);
            } else {
                var1 = false;
            }
        }
        return var1;
    }
}
