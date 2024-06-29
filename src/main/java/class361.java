import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class361 extends class656 {

    @OriginalMember(owner = "client!bga", name = "k", descriptor = "S")
    public short field5089;

    @OriginalMember(owner = "client!bga", name = "l", descriptor = "I")
    public static int field5090;

    @OriginalMember(owner = "client!bga", name = "m", descriptor = "I")
    public static int field5091;

    @OriginalMember(owner = "client!bga", name = "i", descriptor = "Lwu;")
    public static class376 field5087;

    @OriginalMember(owner = "client!bga", name = "j", descriptor = "Lpm;")
    public static class585 field5088;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)V", line = 3)
    public static void method2149(int arg0) {
        field5088 = null;
        field5087 = null;
        if (arg0 != 1011) {
            method2151(48, 12);
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(II)I", line = 15)
    public static final int method2150(int arg0, int arg1) {
        return class649.field8625 == null ? 0 : class649.field8625[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(II)Z", line = 20)
    public static final boolean method2151(int arg0, int arg1) {
        field5090++;
        if (arg1 != 50) {
            field5091 = -92;
        }
        if (arg0 == 19 || arg0 == 15 || arg0 == 57 || arg0 == 50 || arg0 == 12) {
            return true;
        } else {
            return arg0 == 44 || arg0 == 1011;
        }
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "()V", line = 39)
    public class361() {
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(S)V", line = 41)
    public class361(short arg0) {
        this.field5089 = arg0;
    }
}
