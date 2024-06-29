import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class92 extends class667 {

    @OriginalMember(owner = "client!dba", name = "D", descriptor = "[I")
    public static int[] field1616 = new int[1000];

    @OriginalMember(owner = "client!dba", name = "B", descriptor = "I")
    public static int field1614;

    @OriginalMember(owner = "client!dba", name = "C", descriptor = "I")
    public static int field1615;

    @OriginalMember(owner = "client!dba", name = "E", descriptor = "I")
    public static int field1617;

    @OriginalMember(owner = "client!dba", name = "F", descriptor = "I")
    public static int field1618;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(ZII)I")
    private final int method847(boolean arg0, int arg1, int arg2) {
        ++field1618;
        if (arg0) {
            method848(-97, 104, -123, 43, 31, -85, -2, -77, 50);
        }
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        return -(((var5 * 15731 * var5 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method848(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        ++field1614;
        if (arg0 <= 15) {
            method848(-17, 57, 25, -120, 37, 40, -18, 46, 65);
        }
        class633.field9066[class93.field1622++] = new class433(arg1, arg8, arg4, arg7, arg7, arg4, arg3, arg5, arg5, arg3, arg6, arg6, arg2, arg2);
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(BI)[I")
    public final int[] method117(byte arg0, int arg1) {
        ++field1617;
        if (arg0 > -87) {
            return null;
        } else {
            int[] var3 = super.field9355.method1744(arg1, -2);
            if (super.field9355.field3728) {
                int var4 = class385.field5384[arg1];
                for (int var5 = 0; var5 < class77.field1455; ++var5) {
                    var3[var5] = this.method847(false, var4, class20.field261[var5]) % 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "(I)V")
    public static void method849(int arg0) {
        field1616 = null;
        if (arg0 != 15731) {
            field1615 = -13;
        }
    }

    @OriginalMember(owner = "client!dba", name = "<init>", descriptor = "()V")
    public class92() {
        super(0, true);
    }
}
