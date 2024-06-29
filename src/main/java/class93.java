import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public abstract class class93 {

    @OriginalMember(owner = "client!ch", name = "e", descriptor = "Ljava/lang/String;")
    public static String field1253 = "Loaded interfaces";

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "I")
    public static int field1249 = -1;

    @OriginalMember(owner = "client!ch", name = "d", descriptor = "I")
    public static int field1252;

    @OriginalMember(owner = "client!ch", name = "c", descriptor = "Lbc;")
    public static class282 field1251;

    @OriginalMember(owner = "client!ch", name = "b", descriptor = "[I")
    public static int[] field1250;

    @OriginalMember(owner = "client!ch", name = "f", descriptor = "[[[B")
    public static byte[][][] field1254;

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(Loi;I)Loi;")
    public abstract class96 method563(class96 arg0, int arg1);

    @OriginalMember(owner = "client!ch", name = "a", descriptor = "(I)V")
    public static void method564(int arg0) {
        field1254 = null;
        field1250 = null;
        field1251 = null;
        if (arg0 <= 8) {
            method564(116);
        }
        field1253 = null;
    }
}
