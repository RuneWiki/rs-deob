import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qq")
public class class335 extends InputStream {

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "[I")
    public static int[] field5058 = new int[3];

    @OriginalMember(owner = "client!qq", name = "e", descriptor = "Lha;")
    public static class43 field5062 = new class43(5000);

    @OriginalMember(owner = "client!qq", name = "h", descriptor = "I")
    public static int field5065 = 1403;

    @OriginalMember(owner = "client!qq", name = "b", descriptor = "I")
    public static int field5059;

    @OriginalMember(owner = "client!qq", name = "c", descriptor = "I")
    public static int field5060;

    @OriginalMember(owner = "client!qq", name = "d", descriptor = "I")
    public static int field5061;

    @OriginalMember(owner = "client!qq", name = "f", descriptor = "I")
    public static int field5063;

    @OriginalMember(owner = "client!qq", name = "g", descriptor = "I")
    public static int field5064;

    @OriginalMember(owner = "client!qq", name = "i", descriptor = "I")
    public static int field5066;

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(II)V")
    public static final void method2107(int arg0, int arg1) {
        field5060++;
        if (arg1 != -19653) {
            method2107(-110, 110);
        }
        class18 var2 = class140.method1047(8, arg0, false);
        var2.method123(arg1 ^ 0xFFFFE2CC);
    }

    @OriginalMember(owner = "client!qq", name = "read", descriptor = "()I")
    public final int read() {
        field5061++;
        class50.method470(30000L, -5);
        return -1;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(BI)Lje;")
    public static final class278 method2108(byte arg0, int arg1) {
        field5059++;
        if (arg0 > -63) {
            return null;
        }
        class278[] var2 = class86.method796(1939);
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field4193 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(III)Lne;")
    public static final class210 method2109(int arg0, int arg1, int arg2) {
        class234 var3 = class518.field7511[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3602;
    }

    @OriginalMember(owner = "client!qq", name = "a", descriptor = "(I)V")
    public static void method2110(int arg0) {
        field5058 = null;
        field5062 = null;
        if (arg0 != 9463) {
            field5065 = -45;
        }
    }
}
