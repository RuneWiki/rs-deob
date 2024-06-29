import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class756 {

    @OriginalMember(owner = "client!wia", name = "i", descriptor = "I")
    public int field10560 = -1;

    @OriginalMember(owner = "client!wia", name = "c", descriptor = "I")
    public int field10554 = -1;

    @OriginalMember(owner = "client!wia", name = "e", descriptor = "Z")
    public static boolean field10556 = false;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "I")
    public static int field10552;

    @OriginalMember(owner = "client!wia", name = "b", descriptor = "I")
    public static int field10553;

    @OriginalMember(owner = "client!wia", name = "d", descriptor = "I")
    public static int field10555;

    @OriginalMember(owner = "client!wia", name = "f", descriptor = "I")
    public static int field10557;

    @OriginalMember(owner = "client!wia", name = "h", descriptor = "I")
    public static int field10559;

    @OriginalMember(owner = "client!wia", name = "j", descriptor = "I")
    public static int field10561;

    @OriginalMember(owner = "client!wia", name = "g", descriptor = "[I")
    public int[] field10558;

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(B)Lwm;", line = 6)
    public static final class564 method4218(byte arg0) {
        field10561++;
        if (arg0 == -103) {
            return class644.field8869 == 0 ? new class564() : class530.field7315[--class644.field8869];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 31)
    public static final int method4219(String arg0, int arg1) {
        field10553++;
        if (arg0 == null) {
            return -1;
        } else if (arg1 >= -41) {
            return 97;
        } else {
            for (int var2 = 0; var2 < class443.field6289; var2++) {
                if (arg0.equalsIgnoreCase(class648.field8912[var2])) {
                    return var2;
                }
            }
            return -1;
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(Lcea;B)V", line = 56)
    public final void method4220(class215 arg0, byte arg1) {
        field10555++;
        while (true) {
            int var3 = arg0.method1535(255);
            if (var3 == 0) {
                int var4 = -63 / ((72 - arg1) / 37);
                return;
            }
            this.method4221(0, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILcea;I)V", line = 76)
    private final void method4221(int arg0, class215 arg1, int arg2) {
        if (arg2 == 1) {
            this.field10554 = arg1.method1478(842397944);
        } else if (arg2 == 2) {
            this.field10558 = new int[arg1.method1535(255)];
            for (int var4 = 0; var4 < this.field10558.length; var4++) {
                this.field10558[var4] = arg1.method1478(842397944);
            }
        } else if (arg2 == 3) {
            this.field10560 = arg1.method1535(255);
        }
        if (arg0 != 0) {
            field10556 = true;
        }
        field10559++;
    }

    @OriginalMember(owner = "client!wia", name = "a", descriptor = "(ILin;II)Lbh;", line = 112)
    public static final class37 method4222(int arg0, class91 arg1, int arg2, int arg3) {
        if (arg3 != -1) {
            field10556 = true;
        }
        field10552++;
        byte[] var4 = arg1.method863(-1860, arg2, arg0);
        return var4 == null ? null : new class37(var4);
    }
}
