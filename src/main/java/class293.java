import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class293 {

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "Lmf;")
    public static class291 field4478 = new class291();

    @OriginalMember(owner = "client!ij", name = "g", descriptor = "Los;")
    public static class309 field4483 = new class309("flash1:", "blinken1:", "clignotant1:", "flash1:");

    @OriginalMember(owner = "client!ij", name = "i", descriptor = "[C")
    public static char[] field4485 = new char[] { ' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß' };

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field4477;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "I")
    public static int field4479;

    @OriginalMember(owner = "client!ij", name = "d", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!ij", name = "f", descriptor = "Lcq;")
    public static class329 field4482;

    @OriginalMember(owner = "client!ij", name = "h", descriptor = "Lph;")
    public static class459 field4484;

    @OriginalMember(owner = "client!ij", name = "e", descriptor = "[Lya;")
    public static class38[] field4481;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IB)Lti;", line = 8)
    public static final class307 method1907(int arg0, byte arg1) {
        field4477++;
        class307 var2 = (class307) class211.field3365.method2478(1, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class102.field1946.method2757(1, arg0, (byte) -123);
        class307 var4 = new class307();
        var4.field4656 = arg0;
        if (var3 != null) {
            var4.method1964(new class289(var3), 8);
        }
        if (arg1 >= -78) {
            field4484 = null;
        }
        var4.method1966((byte) 50);
        if (var4.field4667 == 2 && class237.field3666.method1622((long) arg0, -123) == null) {
            class237.field3666.method1618(new class100(class29.field484), (long) arg0, -1);
            class289.field4431[class29.field484++] = var4;
        }
        class211.field3365.method2472(88, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)V", line = 48)
    public static final void method1908(int arg0, boolean arg1) {
        field4479++;
        class479.field7061.method2471((byte) 98, arg0);
        if (arg1) {
            class50.field1009.method2471((byte) 98, arg0);
            class41.field575.method2471((byte) 98, arg0);
            class306.field4561.method2471((byte) 98, arg0);
            class103.field1951.method2471((byte) 98, arg0);
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(I)V", line = 67)
    public static void method1909(int arg0) {
        field4481 = null;
        field4482 = null;
        field4484 = null;
        if (arg0 != 196) {
            method1907(-24, (byte) 62);
        }
        field4478 = null;
        field4483 = null;
        field4485 = null;
    }
}
