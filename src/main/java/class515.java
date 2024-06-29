import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class515 {

    @OriginalMember(owner = "client!td", name = "a", descriptor = "I")
    public static int field7461 = 1;

    @OriginalMember(owner = "client!td", name = "f", descriptor = "Z")
    public static boolean field7466 = false;

    @OriginalMember(owner = "client!td", name = "h", descriptor = "Lwk;")
    public static class430 field7468 = new class430(0, 3);

    @OriginalMember(owner = "client!td", name = "b", descriptor = "I")
    public int field7462;

    @OriginalMember(owner = "client!td", name = "c", descriptor = "I")
    public static int field7463;

    @OriginalMember(owner = "client!td", name = "d", descriptor = "I")
    public int field7464;

    @OriginalMember(owner = "client!td", name = "e", descriptor = "I")
    public int field7465;

    @OriginalMember(owner = "client!td", name = "g", descriptor = "I")
    public int field7467;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(III)Z")
    public static final boolean method3082(int arg0, int arg1, int arg2) {
        field7463++;
        if (!class569.method3304(arg1, -1, arg0)) {
            return false;
        } else if (arg2 < 63) {
            return false;
        } else if (class237.method1630((byte) -117, arg1, arg0) | (arg0 & 0x9000) != 0 | class721.method3976(arg0, (byte) 52, arg1)) {
            return true;
        } else {
            return (class315.method2073(arg0, arg1, (byte) -68) | (arg0 & 0x2000) != 0 | class424.method2648(-18044, arg1, arg0)) & (arg1 & 0x37) == 0;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static void method3083(int arg0) {
        if (arg0 >= -111) {
            field7461 = -83;
        }
        field7468 = null;
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Lov;Z[[[BIB)Z")
    public static final boolean method3084(class668 arg0, boolean arg1, byte[][][] arg2, int arg3, byte arg4) {
        if (!class656.field9336) {
            return false;
        }
        int var5 = arg0.field9477 >> class662.field9425;
        int var6 = var5;
        int var7 = arg0.field9475 >> class662.field9425;
        int var8 = var7;
        if (arg0 instanceof class559) {
            var6 = ((class559) arg0).field7931;
            var8 = ((class559) arg0).field7934;
            var5 = ((class559) arg0).field7927;
            var7 = ((class559) arg0).field7930;
        }
        for (int var9 = var5; var9 <= var6; var9++) {
            for (int var10 = var7; var10 <= var8; var10++) {
                if (arg0.field9469 < class386.field5782 && var9 >= class51.field822 && var9 < class611.field8618 && var10 >= class398.field5922 && var10 < class387.field5808) {
                    if ((arg2 == null || arg0.field9470 < arg3 || arg2[arg0.field9470][var9][var10] != arg4) && arg0.method1468((byte) -86) && !arg0.method1467(-66, class478.field6933)) {
                        return false;
                    }
                    if (!arg1 && var9 >= class336.field4923 - 16 && var9 <= class336.field4923 + 16 && var10 >= class63.field996 - 16 && var10 <= class63.field996 + 16) {
                        if (class238.field3835) {
                            class222.field3605[class654.field9286++].method1687(arg0, 9329);
                            class654.field9286 %= class286.field4406;
                        } else {
                            arg0.method97(class478.field6933, -1);
                        }
                    }
                }
            }
        }
        return true;
    }
}
