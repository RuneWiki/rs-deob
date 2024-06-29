import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class113 {

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "I")
    public static int field2036 = 3353893;

    @OriginalMember(owner = "client!kg", name = "e", descriptor = "Z")
    public static boolean field2040 = true;

    @OriginalMember(owner = "client!kg", name = "c", descriptor = "I")
    public static int field2038 = -1;

    @OriginalMember(owner = "client!kg", name = "b", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!kg", name = "d", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!kg", name = "f", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 26)
    public static final void method776(Component arg0, int arg1) {
        if (arg1 == 0) {
            arg0.removeKeyListener(class67.field1046);
            arg0.removeFocusListener(class67.field1046);
            field2039++;
            class67.field1044 = -1;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(BI)Z", line = 46)
    public static final boolean method777(byte arg0, int arg1) {
        field2041++;
        if (class69.field1086[arg1]) {
            return true;
        } else if (class93.field1695.method1591(arg1, 0)) {
            int var2 = class93.field1695.method1568(1673, arg1);
            if (var2 == 0) {
                class69.field1086[arg1] = true;
                return true;
            }
            if (class277.field4660[arg1] == null) {
                class277.field4660[arg1] = new class75[var2];
            }
            int var3 = 107 / ((25 - arg0) / 45);
            for (int var4 = 0; var4 < var2; var4++) {
                if (class277.field4660[arg1][var4] == null) {
                    byte[] var5 = class93.field1695.method1577(arg1, var4, -29569);
                    if (var5 != null) {
                        class277.field4660[arg1][var4] = new class75();
                        class277.field4660[arg1][var4].field1172 = (arg1 << 16) + var4;
                        if (var5[0] == -1) {
                            class277.field4660[arg1][var4].method475(-65536, new class153(var5));
                        } else {
                            class277.field4660[arg1][var4].method480(92, new class153(var5));
                        }
                    }
                }
            }
            class69.field1086[arg1] = true;
            return true;
        } else {
            return false;
        }
    }
}
