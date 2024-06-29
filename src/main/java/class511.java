import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!si")
public class class511 extends class84 {

    @OriginalMember(owner = "client!si", name = "I", descriptor = "Ljava/lang/String;")
    public static String field7325 = "";

    @OriginalMember(owner = "client!si", name = "F", descriptor = "I")
    public static int field7322;

    @OriginalMember(owner = "client!si", name = "H", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!si", name = "J", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!si", name = "K", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!si", name = "G", descriptor = "[B")
    private byte[] field7323;

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IBB)V")
    public final void method77(int arg0, byte arg1, byte arg2) {
        field7324++;
        byte var4 = (byte) (((arg2 & 0xFF) >> 1) + 127);
        int var5 = arg0 * 2;
        if (arg1 != -114) {
            this.method2928(-83, 31, -106, -44);
        }
        this.field7323[var5++] = var4;
        this.field7323[var5] = var4;
    }

    @OriginalMember(owner = "client!si", name = "f", descriptor = "(I)V")
    public static void method2927(int arg0) {
        field7325 = null;
        if (arg0 != 5) {
            method2929(58, 72);
        }
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(IIII)[B")
    public final byte[] method2928(int arg0, int arg1, int arg2, int arg3) {
        this.field7323 = new byte[arg2 * arg3 * arg0 * 2];
        field7327++;
        this.method2940((byte) 28, arg3, arg0, arg2);
        if (arg1 != 0) {
            method2929(75, 7);
        }
        return this.field7323;
    }

    @OriginalMember(owner = "client!si", name = "a", descriptor = "(II)V")
    public static final void method2929(int arg0, int arg1) {
        field7322++;
        if (class315.method1784(arg0, arg1 + 4014)) {
            if (arg1 != 255) {
                method2929(32, 25);
            }
            class407.method2212(127, class271.field3434[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!si", name = "b", descriptor = "(IIII)I")
    public static final int method2930(int arg0, int arg1, int arg2, int arg3) {
        field7326++;
        int var4 = arg0 & 0x3;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return arg1;
        } else {
            if (arg2 != -31746) {
                field7325 = null;
            }
            return var4 == 2 ? 7 - arg3 : -arg1 + 7;
        }
    }

    @OriginalMember(owner = "client!si", name = "<init>", descriptor = "()V")
    public class511() {
        super(12, 5, 16, 2, 2, 0.45F);
    }
}
