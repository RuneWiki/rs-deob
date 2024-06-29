import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kq")
public class class102 extends class72 {

    @OriginalMember(owner = "client!kq", name = "J", descriptor = "Z")
    public static boolean field1742 = false;

    @OriginalMember(owner = "client!kq", name = "I", descriptor = "I")
    public static int field1741 = 0;

    @OriginalMember(owner = "client!kq", name = "H", descriptor = "Ljava/lang/String;")
    public static String field1740 = null;

    @OriginalMember(owner = "client!kq", name = "M", descriptor = "I")
    public static int field1745 = 0;

    @OriginalMember(owner = "client!kq", name = "F", descriptor = "I")
    public static int field1738;

    @OriginalMember(owner = "client!kq", name = "G", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!kq", name = "L", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!kq", name = "K", descriptor = "[B")
    private byte[] field1743;

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(II)I", line = 3)
    public static final int method861(int arg0, int arg1) {
        if (arg0 > -69) {
            return 22;
        } else {
            field1738++;
            return arg1 & 0xFF;
        }
    }

    @OriginalMember(owner = "client!kq", name = "<init>", descriptor = "()V", line = 19)
    public class102() {
        super(8, 5, 8, 8, 2, 0.1F, 0.55F, 3.0F);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IBI)V", line = 23)
    public final void method702(int arg0, byte arg1, int arg2) {
        field1739++;
        int var4 = arg2 * 2;
        int var5 = arg1 & 0xFF;
        int var10001 = var4;
        int var6 = var4 + 1;
        this.field1743[var10001] = (byte) (var5 * 3 >> 5);
        this.field1743[var6] = (byte) (var5 * 3 >> 5);
        if (arg0 != 16567) {
            field1741 = 55;
        }
    }

    @OriginalMember(owner = "client!kq", name = "d", descriptor = "(I)V", line = 40)
    public static void method862(int arg0) {
        field1740 = null;
        int var1 = -114 % ((arg0 - 15) / 59);
    }

    @OriginalMember(owner = "client!kq", name = "a", descriptor = "(IIBI)[B", line = 50)
    public final byte[] method863(int arg0, int arg1, byte arg2, int arg3) {
        this.field1743 = new byte[arg0 * arg3 * arg1 * 2];
        field1744++;
        if (arg2 == 112) {
            this.method1864(arg0, (byte) 15, arg3, arg1);
            return this.field1743;
        } else {
            return null;
        }
    }
}
