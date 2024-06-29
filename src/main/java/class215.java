import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fq")
public class class215 {

    @OriginalMember(owner = "client!fq", name = "h", descriptor = "Llf;")
    public static class251 field2537 = new class251(8, 1);

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!fq", name = "b", descriptor = "I")
    public static int field2531;

    @OriginalMember(owner = "client!fq", name = "c", descriptor = "I")
    public static int field2532;

    @OriginalMember(owner = "client!fq", name = "e", descriptor = "I")
    public static int field2534;

    @OriginalMember(owner = "client!fq", name = "f", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!fq", name = "g", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field2536;

    @OriginalMember(owner = "client!fq", name = "i", descriptor = "[I")
    public static int[] field2538;

    @OriginalMember(owner = "client!fq", name = "d", descriptor = "[Ltf;")
    public static class312[] field2533;

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Lkq;I)Ljava/lang/String;")
    public static final String method1343(class620 arg0, int arg1) {
        if (arg1 != 0) {
            method1345(null, -61, null, null, null, (byte) -49, null, -53, -3);
        }
        field2532++;
        if (client.method1882(arg0).method2321(-114) == 0) {
            return null;
        } else if (arg0.field8462 == null || arg0.field8462.trim().length() == 0) {
            return class687.field9373 ? "Hidden-use" : null;
        } else {
            return arg0.field8462;
        }
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(I)V")
    public static void method1344(int arg0) {
        field2538 = null;
        field2533 = null;
        field2536 = null;
        if (arg0 != -1) {
            method1345(null, -104, null, null, null, (byte) 101, null, -92, 36);
        }
        field2537 = null;
    }

    @OriginalMember(owner = "client!fq", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;BLjava/lang/String;II)V")
    public static final void method1345(String arg0, int arg1, String arg2, String arg3, String arg4, byte arg5, String arg6, int arg7, int arg8) {
        field2530++;
        class239 var9 = class704.field9914[99];
        int var10 = 99;
        if (arg5 < 109) {
            field2538 = null;
        }
        while (var10 > 0) {
            class704.field9914[var10] = class704.field9914[var10 - 1];
            var10--;
        }
        if (var9 == null) {
            var9 = new class239(arg1, arg8, arg0, arg2, arg4, arg3, arg7, arg6);
        } else {
            var9.method1448(arg7, arg2, arg3, arg6, arg1, arg0, arg4, (byte) -57, arg8);
        }
        class704.field9914[0] = var9;
        class697.field9491 = class87.field1156;
        class89.field1190++;
    }
}
