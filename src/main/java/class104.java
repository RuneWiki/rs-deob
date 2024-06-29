import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class104 {

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1844 = 1;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "Lcv;")
    public class529 field1845;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "[S")
    public static short[] field1843;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method963(int arg0) {
        field1843 = null;
        if (arg0 != 16711680) {
            method964(70, 46, 76);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(III)I")
    public static final int method964(int arg0, int arg1, int arg2) {
        if (arg2 != 14076) {
            method963(-127);
        }
        field1842++;
        int var3 = arg1 >>> 24;
        int var4 = ((arg1 & 0xFF00FF) * var3 & 0xFF00FF00 | (arg1 & 0xFF00) * var3 & 0xFF0000) >>> 8;
        int var5 = 255 - var3;
        return (((arg0 & 0xFF00) * var5 & 0xFF0000 | (arg0 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Lgfa;)V")
    public static final void method965(class697 arg0) {
        if (arg0 == null) {
            return;
        }
        for (int var1 = 0; var1 < 2; var1++) {
            int var10002;
            for (int var2 = 0; var2 < class338.field5048[var1]; var2++) {
                if (class148.field2552[var1][var2] == arg0) {
                    class692.method3875(class148.field2552[var1], var2 + 1, class148.field2552[var1], var2, class338.field5048[var1] - var2 - 1);
                    var10002 = class338.field5048[var1]--;
                    return;
                }
            }
            for (int var3 = 0; var3 < class43.field1090[var1]; var3++) {
                if (class368.field5462[var1][var3] == arg0) {
                    class692.method3875(class368.field5462[var1], var3 + 1, class368.field5462[var1], var3, class43.field1090[var1] - var3 - 1);
                    var10002 = class43.field1090[var1]--;
                    return;
                }
            }
            for (int var4 = 0; var4 < class575.field8353[var1]; var4++) {
                if (class7.field513[var1][var4] == arg0) {
                    class692.method3875(class7.field513[var1], var4 + 1, class7.field513[var1], var4, class575.field8353[var1] - var4 - 1);
                    var10002 = class575.field8353[var1]--;
                    return;
                }
            }
        }
    }
}
