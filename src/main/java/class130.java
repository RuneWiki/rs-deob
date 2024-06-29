import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class130 extends InputStream {

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "Lvh;")
    public static class328 field1782 = new class328(8);

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "[Lrq;")
    public static class319[] field1786 = new class319[100];

    @OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
    public static int field1787 = -1;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "I")
    public static int field1781;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field1783;

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)V", line = 10)
    public static void method906(int arg0) {
        field1782 = null;
        field1786 = null;
        if (arg0 != -1) {
            field1785 = -110;
        }
    }

    @OriginalMember(owner = "client!qm", name = "read", descriptor = "()I", line = 21)
    public final int read() {
        class419.method2390(30, 30000L);
        field1783++;
        return -1;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IZIIZ)I", line = 43)
    public static final int method907(int arg0, boolean arg1, int arg2, int arg3, boolean arg4) {
        field1784++;
        class421 var5 = class172.method1175(true, arg1, arg3);
        if (var5 == null) {
            return 0;
        }
        int var6 = arg2;
        for (int var7 = 0; var7 < var5.field5945.length; var7++) {
            if (var5.field5945[var7] >= 0 && var5.field5945[var7] < class648.field9184.field7533) {
                class257 var8 = class648.field9184.method3064(var5.field5945[var7], arg2 ^ 0xFFFFFFF8);
                int var9 = var8.method1580(false, arg0, class324.field4784.method2171((byte) -80, arg0).field5300);
                if (arg4) {
                    var6 += var5.field5946[var7] * var9;
                } else {
                    var6 += var9;
                }
            }
        }
        return var6;
    }
}
