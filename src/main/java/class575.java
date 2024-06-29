import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class575 implements class64 {

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Ljava/lang/String;")
    private String field8349;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field8350 = 0;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "I")
    public static int field8355 = 765;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field8345;

    @OriginalMember(owner = "client!a", name = "c", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "I")
    public static int field8351;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "I")
    public static int field8352;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field8354;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field8356;

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Lfa;")
    public static class214 field8348;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Z")
    private boolean field8346;

    @OriginalMember(owner = "client!a", name = "i", descriptor = "[I")
    public static int[] field8353;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(BILjava/lang/Object;I)[B")
    public static final byte[] method3299(byte arg0, int arg1, Object arg2, int arg3) {
        field8356++;
        if (arg2 == null) {
            return null;
        } else if (arg2 instanceof byte[]) {
            byte[] var4 = (byte[]) arg2;
            return class676.method3803(false, var4, arg1, arg3);
        } else if (arg2 instanceof class560) {
            class560 var5 = (class560) arg2;
            return var5.method1460(arg1, (byte) 65, arg3);
        } else {
            if (arg0 >= -67) {
                field8355 = 35;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIBI)Z")
    public static final boolean method3300(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field8347++;
        if ((class517.field7301[0][arg4][arg2] & 0x2) != 0) {
            return true;
        } else if (arg3 != -16) {
            return true;
        } else if ((class517.field7301[arg1][arg4][arg2] & 0x10) == 0) {
            return class421.method2557(arg4, -1, arg2, arg1) == arg0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)I")
    public final int method376(int arg0) {
        field8352++;
        if (arg0 != 11878) {
            field8353 = null;
        }
        int var2 = class592.method3377(this.field8349, -2);
        if (var2 >= 0 && var2 <= 100) {
            return var2;
        } else {
            this.field8346 = true;
            return 100;
        }
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class575(String arg0) {
        this.field8349 = arg0;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(B)Lwa;")
    public final class569 method378(byte arg0) {
        field8345++;
        if (arg0 != 112) {
            this.method376(41);
        }
        return class569.field8291;
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(B)Z")
    public final boolean method3301(byte arg0) {
        if (arg0 > -83) {
            return true;
        } else {
            field8351++;
            return this.field8346;
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static void method3302(int arg0) {
        field8353 = null;
        field8348 = null;
        if (arg0 != -1) {
            method3299((byte) 35, 88, null, -121);
        }
    }
}
