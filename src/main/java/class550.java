import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class550 extends class324 {

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "J")
    public long field7848;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field7846 = -1;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "[I")
    public static int[] field7847 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "[I")
    public static int[] field7845 = new int[2];

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "[Lmu;")
    public static class253[] field7851 = new class253[32];

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field7844;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field7849;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    public static int field7850;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIILtr;)V", line = 4)
    public static final void method3191(int arg0, int arg1, int arg2, int arg3, class247 arg4) {
        class99 var5 = class290.method1876(arg0, arg1, arg2);
        if (var5 == null) {
            return;
        }
        int var6 = 0;
        arg4.field3511 = (arg1 << class465.field6917) + class170.field2095;
        arg4.field3499 = arg3;
        arg4.field3506 = (arg2 << class465.field6917) + class170.field2095;
        for (class104 var7 = var5.field1167; var7 != null; var7 = var7.field1251) {
            if (var7.field1253.field1774) {
                int var8 = var7.field1253.method413((byte) 58);
                if (var8 != -32768 && var8 < var6) {
                    var6 = var8;
                }
            }
        }
        if (var6 < 0) {
            arg4.field3499 += var6;
            arg4.field3505 = true;
        } else if (var5.field1174 != null) {
            arg4.field3499 -= var5.field1174.field1366;
        }
        var5.field1177 = arg4;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V", line = 45)
    public static void method3192(byte arg0) {
        if (arg0 == -86) {
            field7845 = null;
            field7851 = null;
            field7847 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(JJ)J", line = 65)
    public static long method3193(long arg0, long arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "()V", line = 76)
    public class550() {
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(J)V", line = 79)
    public class550(long arg0) {
        this.field7848 = arg0;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIIII)V", line = 97)
    public static final void method3194(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = -19 / ((63 - arg6) / 60);
        field7849++;
        if (arg3 >= class113.field1385 && arg4 <= class4.field43 && arg0 >= class418.field6298 && class461.field6877 >= arg2) {
            if (arg1 == 1) {
                class247.method1638(arg4, (byte) 101, arg5, arg2, arg3, arg0);
            } else {
                class348.method2220(-111, arg2, arg4, arg5, arg1, arg0, arg3);
            }
        } else if (arg1 == 1) {
            class563.method3256(arg2, -97, arg0, arg4, arg3, arg5);
        } else {
            class460.method2833(arg0, arg2, 0, arg5, arg4, arg3, arg1);
        }
    }
}
