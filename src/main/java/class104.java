import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class104 extends class366 {

    @OriginalMember(owner = "client!e", name = "n", descriptor = "I")
    private int field1259;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    private int field1263;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    private int field1261;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    private int field1256;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "[I")
    public static int[] field1255 = new int[] { 1, -1, -1, 1 };

    @OriginalMember(owner = "client!e", name = "o", descriptor = "I")
    public static int field1260 = -1;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "I")
    public static int field1253;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field1254;

    @OriginalMember(owner = "client!e", name = "l", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "Ljava/lang/String;")
    public static String field1258;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZII)V")
    public final void method374(boolean arg0, int arg1, int arg2) {
        ++field1262;
        int var4 = this.field1256 * arg2 >> 12;
        int var5 = this.field1261 * arg2 >> 12;
        int var6 = this.field1263 * arg1 >> 12;
        int var7 = this.field1259 * arg1 >> 12;
        if (arg0) {
            method500(5);
        }
        class176.method866(var4, var5, var6, (byte) 70, var7, super.field5241);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method499(String arg0, byte arg1) {
        class231.method1278(0, "", -26526, 0, "", arg0);
        if (arg1 == -10) {
            ++field1253;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BII)V")
    public final void method375(byte arg0, int arg1, int arg2) {
        ++field1257;
        if (arg0 < 44) {
            this.field1261 = 4;
        }
    }

    @OriginalMember(owner = "client!e", name = "c", descriptor = "(I)V")
    public static void method500(int arg0) {
        field1255 = null;
        field1258 = null;
        if (arg0 != 1324744908) {
            field1258 = null;
        }
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(IIIIII)V")
    public class104(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1259 = arg3;
        this.field1263 = arg1;
        this.field1261 = arg2;
        this.field1256 = arg0;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIZ)V")
    public final void method370(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            ++field1254;
        }
    }
}
