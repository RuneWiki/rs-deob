import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public class class494 {

    @OriginalMember(owner = "client!kd", name = "b", descriptor = "I")
    public static int field6889;

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "I")
    public int field6890;

    @OriginalMember(owner = "client!kd", name = "e", descriptor = "I")
    public static int field6892;

    @OriginalMember(owner = "client!kd", name = "f", descriptor = "Lso;")
    public static class256 field6893;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "Lkr;")
    public static class329 field6888;

    @OriginalMember(owner = "client!kd", name = "d", descriptor = "Ljava/lang/String;")
    public String field6891;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V")
    public static void method2773(int arg0) {
        int var1 = -90 % ((13 - arg0) / 47);
        field6888 = null;
        field6893 = null;
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IZIII)V")
    public static final void method2774(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (class428.field5845 == 0) {
            class207.method1319(64, false);
        } else {
            class514.field7145 = class428.field5845;
            class293.method1796(0, (byte) -119);
        }
        field6889++;
        class194.field2523 = arg2;
        class231.field2949 = arg3;
        class173.field2242 = arg1;
        class614.method3525(arg4);
        int var5 = -9 / ((83 - arg0) / 40);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(III)I")
    public static final int method2775(int arg0, int arg1, int arg2) {
        field6892++;
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        if (arg1 != 31745) {
            field6888 = null;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
