import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public abstract class class83 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public int field1044;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "client!di", name = "e", descriptor = "I")
    public int field1048;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "Z")
    public static volatile boolean field1046 = false;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field1047 = 0;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Lkg;")
    public static class179 field1050 = new class179(7, 6);

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1045;

    @OriginalMember(owner = "client!di", name = "f", descriptor = "I")
    public static int field1049;

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Ljava/lang/String;")
    public static String field1051;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(I)V", line = 4)
    public static void method674(int arg0) {
        field1050 = null;
        if (arg0 == 31016) {
            field1051 = null;
        }
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(Lqc;II)V", line = 17)
    public static final void method675(class524 arg0, int arg1, int arg2) {
        if (class382.field5037) {
            class382.field5037 = false;
            arg1 = 0;
        }
        if (arg2 != -14459) {
            field1047 = 114;
        }
        field1045++;
        if (class1.field10 != null && class1.field10.method3125(-7348, arg0)) {
            return;
        }
        class1.field10 = arg0;
        class183.field2399 = class504.method3034((byte) -119);
        class269.field3401 = arg1;
        class321.field4077 = arg1;
        if (class321.field4077 != 0) {
            class219.field2795 = class75.field972;
            class342.field4322 = class108.field1358;
            class175.field2276 = class379.field4988;
            class53.field708 = class299.field3853;
            class394.field5287 = class513.field7437;
            class213.field2743 = class510.field7367;
            class141.field1831 = class274.field3443;
            class280.field3559 = class414.field5898;
            class180.field2385 = class378.field4975;
            class534.field7856 = class450.field6492;
            return;
        }
        class244.method1485(16711680);
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "([BIIIIBI)Z", line = 68)
    public static final boolean method677(byte[] arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        field1049++;
        if (arg5 <= 7) {
            return true;
        }
        int var7 = arg2 % arg3;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg3 - var7;
        }
        int var9 = -((arg3 + arg6 - 1) / arg3);
        int var10 = -((arg2 + arg3 - 1) / arg3);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg0[arg1] == 0) {
                    return true;
                }
                arg1 += arg3;
            }
            int var13 = arg1 - var8;
            if (arg0[var13 - 1] == 0) {
                return true;
            }
            arg1 = arg4 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!di", name = "<init>", descriptor = "(III)V", line = 119)
    public class83(int arg0, int arg1, int arg2) {
        this.field1044 = arg1;
        this.field1052 = arg2;
        this.field1048 = arg0;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(III)V")
    public abstract void method676(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!di", name = "b", descriptor = "(III)V")
    public abstract void method678(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(IZI)V")
    public abstract void method679(int arg0, boolean arg1, int arg2);
}
