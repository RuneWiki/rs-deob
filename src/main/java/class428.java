import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class428 extends class456 {

    @OriginalMember(owner = "client!pl", name = "H", descriptor = "Lo;")
    public static class332 field6105 = new class332("Members object", "Gegenstand für Mitglieder", "Objet d'abonnés", "Objeto para membros");

    @OriginalMember(owner = "client!pl", name = "M", descriptor = "I")
    public static int field6110 = 0;

    @OriginalMember(owner = "client!pl", name = "K", descriptor = "Lat;")
    public static class412 field6108 = new class412();

    @OriginalMember(owner = "client!pl", name = "N", descriptor = "Ltb;")
    public static class304 field6111 = new class304(64);

    @OriginalMember(owner = "client!pl", name = "I", descriptor = "I")
    public static int field6106;

    @OriginalMember(owner = "client!pl", name = "J", descriptor = "I")
    public static int field6107;

    @OriginalMember(owner = "client!pl", name = "L", descriptor = "I")
    public static int field6109;

    @OriginalMember(owner = "client!pl", name = "O", descriptor = "I")
    public static int field6112;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Ltq;ILan;)I")
    public static final int method2516(class63 arg0, int arg1, class172 arg2) {
        ++field6106;
        int var3 = -20 / ((arg1 - 35) / 63);
        if (~arg2.field2448 == 0) {
            if (arg2.field2440 != -1) {
                class85 var4 = arg0.field871.method1331(9386, arg0.method556() ? arg2.field2440 : arg2.field2439);
                if (!var4.field1198) {
                    return var4.field1213;
                }
            }
            return arg2.field2454;
        } else {
            return arg2.field2448;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)[I")
    public final int[] method33(int arg0, int arg1) {
        ++field6107;
        int[] var3 = super.field6466.method2533(true, arg1);
        if (arg0 != -1) {
            method2518(-94, (class178) null);
        }
        if (super.field6466.field6153) {
            class149.method1010(var3, 0, class156.field2169, class14.field206[arg1]);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(B)V")
    public static void method2517(byte arg0) {
        field6111 = null;
        int var1 = -45 / ((arg0 - -11) / 40);
        field6105 = null;
        field6108 = null;
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILje;)Lje;")
    public static final class178 method2518(int arg0, class178 arg1) {
        if (arg0 != 14293) {
            field6112 = 57;
        }
        ++field6109;
        class178 var2 = client.method2772(arg1);
        if (var2 == null) {
            var2 = arg1.field2513;
        }
        return var2;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V")
    public class428() {
        super(0, true);
    }
}
