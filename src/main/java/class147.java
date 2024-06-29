import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class147 extends class477 {

    @OriginalMember(owner = "client!ec", name = "I", descriptor = "Ljava/lang/Object;")
    private Object field1628;

    @OriginalMember(owner = "client!ec", name = "D", descriptor = "[I")
    public static int[] field1623 = new int[8];

    @OriginalMember(owner = "client!ec", name = "F", descriptor = "I")
    public static int field1625 = 0;

    @OriginalMember(owner = "client!ec", name = "G", descriptor = "Lcq;")
    public static class110 field1626 = new class110(30, 9);

    @OriginalMember(owner = "client!ec", name = "J", descriptor = "I")
    public static int field1629 = 0;

    @OriginalMember(owner = "client!ec", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1630 = null;

    @OriginalMember(owner = "client!ec", name = "B", descriptor = "I")
    public static int field1621;

    @OriginalMember(owner = "client!ec", name = "C", descriptor = "I")
    public static int field1622;

    @OriginalMember(owner = "client!ec", name = "E", descriptor = "I")
    public static int field1624;

    @OriginalMember(owner = "client!ec", name = "H", descriptor = "I")
    public static int field1627;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IIB)I")
    public static final int method806(int arg0, int arg1, byte arg2) {
        if (arg2 != 79) {
            method809(null, null, (byte) -33);
        }
        field1621++;
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Ljava/lang/Object;")
    public final Object method807(int arg0) {
        field1622++;
        if (arg0 != 44) {
            field1625 = -61;
        }
        return this.field1628;
    }

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "(I)Z")
    public final boolean method808(int arg0) {
        if (arg0 != 20712) {
            method810((byte) 25);
        }
        field1627++;
        return false;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(Ljava/io/File;Ljava/lang/String;B)V")
    public static final void method809(File arg0, String arg1, byte arg2) {
        class673.field9364.put(arg1, arg0);
        if (arg2 != 47) {
            field1623 = null;
        }
        field1624++;
    }

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "(B)V")
    public static void method810(byte arg0) {
        if (arg0 != 52) {
            method810((byte) 110);
        }
        field1626 = null;
        field1623 = null;
        field1630 = null;
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(Lso;Ljava/lang/Object;I)V")
    public class147(class276 arg0, Object arg1, int arg2) {
        super(arg0, arg2);
        this.field1628 = arg1;
    }
}
