import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class729 {

    @OriginalMember(owner = "client!bo", name = "c", descriptor = "J")
    public static long field10189 = -1L;

    @OriginalMember(owner = "client!bo", name = "e", descriptor = "[C")
    public static char[] field10191 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "I")
    public static int field10188;

    @OriginalMember(owner = "client!bo", name = "d", descriptor = "I")
    public static int field10190;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "Lbc;")
    public static class365 field10187;

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(I)V", line = 6)
    public static void method4094(int arg0) {
        field10191 = null;
        if (arg0 < 97) {
            field10191 = null;
        }
        field10187 = null;
    }

    @OriginalMember(owner = "client!bo", name = "a", descriptor = "(II)Lgg;", line = 17)
    public static final class172 method4095(int arg0, int arg1) {
        field10190++;
        int var2 = -90 % ((42 - arg0) / 43);
        class172[] var3 = class741.method4138(-1);
        for (int var4 = 0; var4 < var3.length; var4++) {
            class172 var5 = var3[var4];
            if (var5.field2344 == arg1) {
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!bo", name = "b", descriptor = "(I)V", line = 59)
    public static final void method4096(int arg0) {
        field10188++;
        class455.method2707((byte) -108);
        int var1 = class557.field7812.field6556.method2647(false);
        if (var1 == 2) {
            class54.method336(class446.field6323, 100, 100, class172.field2348, class268.field3831, -1);
        } else if (var1 == 3) {
            class171.method1104(class268.field3831, class106.field1276, class446.field6323, -107, class280.field3990, 2, 2, class172.field2348);
        }
        if (class557.field7812.field6556.method2649((byte) 100)) {
            class272.method1772(-128, class366.field5196);
        }
        if (class268.field3831 != null) {
            class147.method1018(97);
        }
        class180.field2409 = arg0 != ~class557.field7812.field6556.method2647(false);
        class589.field8295 = class557.field7812.field6556.method2649((byte) 125);
    }
}
