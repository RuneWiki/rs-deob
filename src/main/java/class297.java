import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mq")
public class class297 {

    @OriginalMember(owner = "client!mq", name = "b", descriptor = "[I")
    public static int[] field4156 = new int[2500];

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "I")
    public static int field4155;

    @OriginalMember(owner = "client!mq", name = "d", descriptor = "Lsg;")
    public static class226 field4158;

    @OriginalMember(owner = "client!mq", name = "c", descriptor = "Lnq;")
    public static class268 field4157;

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(BI)Lbo;")
    public static final class435 method1938(byte arg0, int arg1) {
        if (arg0 < 49) {
            method1938((byte) -79, -19);
        }
        field4155++;
        if (arg1 == 0) {
            if ((double) class354.field4834 == 3.0D) {
                return class108.field1557;
            }
            if ((double) class354.field4834 == 4.0D) {
                return class352.field4822;
            }
            if ((double) class354.field4834 == 6.0D) {
                return class218.field3020;
            }
            if ((double) class354.field4834 >= 8.0D) {
                return class348.field4791;
            }
        } else if (arg1 == 1) {
            if ((double) class354.field4834 == 3.0D) {
                return class218.field3020;
            }
            if ((double) class354.field4834 == 4.0D) {
                return class348.field4791;
            }
            if ((double) class354.field4834 == 6.0D) {
                return class56.field769;
            }
            if ((double) class354.field4834 >= 8.0D) {
                return class334.field4602;
            }
        } else if (arg1 == 2) {
            if ((double) class354.field4834 == 3.0D) {
                return class56.field769;
            }
            if ((double) class354.field4834 == 4.0D) {
                return class334.field4602;
            }
            if ((double) class354.field4834 == 6.0D) {
                return class415.field5896;
            }
            if ((double) class354.field4834 >= 8.0D) {
                return class349.field4799;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!mq", name = "a", descriptor = "(B)V")
    public static void method1939(byte arg0) {
        field4158 = null;
        field4156 = null;
        if (arg0 == -65) {
            field4157 = null;
        }
    }

    static {
        new class442("Thank-you, your abuse report has been received.", "Vielen Dank, deine Meldung ist bei uns eingegangen.", "Merci, nous avons bien reçu votre rapport d'abus.", "Obrigado. Sua denúncia de abuso foi recebida.");
    }
}
