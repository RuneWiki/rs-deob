import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class251 {

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "[I")
    public static int[] field3829 = new int[2];

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!ma", name = "b", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!ma", name = "e", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "Lci;")
    public static class173 field3828;

    @OriginalMember(owner = "client!ma", name = "f", descriptor = "Ljava/awt/Font;")
    public static Font field3831;

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(I)V")
    public static void method1655(int arg0) {
        field3829 = null;
        if (arg0 != -32146) {
            method1655(-106);
        }
        field3831 = null;
        field3828 = null;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(Ljava/lang/String;I)I")
    public static final int method1656(String arg0, int arg1) {
        field3826++;
        if (class168.field2440 == null || arg0.length() == 0) {
            return -1;
        }
        if (arg1 > -107) {
            method1658(false, (class233) null);
        }
        for (int var2 = 0; var2 < class168.field2440.field1204; var2++) {
            if (class102.method685(false, class158.method1060("<br>", class168.field2440.field1203[var2], " ", 64), arg0)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "([BI)[B")
    public static final byte[] method1657(byte[] arg0, int arg1) {
        int var2 = arg0.length;
        field3827++;
        byte[] var3 = new byte[var2];
        if (arg1 <= 48) {
            method1655(12);
        }
        class164.method1098(arg0, 0, var3, 0, var2);
        return var3;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(ZLve;)V")
    public static final void method1658(boolean arg0, class233 arg1) {
        class152.field2205 = arg1;
        if (!arg0) {
            method1655(-118);
        }
        field3830++;
    }
}
