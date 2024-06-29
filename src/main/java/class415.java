import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rca")
public class class415 extends class356 {

    @OriginalMember(owner = "client!rca", name = "B", descriptor = "[B")
    public byte[] field5510;

    @OriginalMember(owner = "client!rca", name = "v", descriptor = "Z")
    public static boolean field5504 = false;

    @OriginalMember(owner = "client!rca", name = "u", descriptor = "I")
    public static int field5503 = 0;

    @OriginalMember(owner = "client!rca", name = "y", descriptor = "Lqo;")
    public static class21 field5507 = new class21();

    @OriginalMember(owner = "client!rca", name = "w", descriptor = "I")
    public static int field5505;

    @OriginalMember(owner = "client!rca", name = "x", descriptor = "I")
    public static int field5506;

    @OriginalMember(owner = "client!rca", name = "z", descriptor = "I")
    public static int field5508;

    @OriginalMember(owner = "client!rca", name = "C", descriptor = "I")
    public static int field5511;

    @OriginalMember(owner = "client!rca", name = "A", descriptor = "Lit;")
    public static class589 field5509;

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(I)[I", line = 8)
    public static final int[] method2242(int arg0) {
        field5505++;
        if (arg0 != 12397) {
            field5507 = null;
        }
        return new int[] { class93.field1050, class525.field7511, class453.field6280 };
    }

    @OriginalMember(owner = "client!rca", name = "c", descriptor = "(I)V", line = 22)
    public static void method2243(int arg0) {
        if (arg0 != 0) {
            field5509 = null;
        }
        field5507 = null;
        field5509 = null;
    }

    @OriginalMember(owner = "client!rca", name = "<init>", descriptor = "([B)V", line = 39)
    public class415(byte[] arg0) {
        this.field5510 = arg0;
    }

    @OriginalMember(owner = "client!rca", name = "a", descriptor = "(ILjo;II)Led;", line = 47)
    public static final class645 method2244(int arg0, class303 arg1, int arg2, int arg3) {
        if (arg0 == 2048) {
            field5511++;
            byte[] var4 = arg1.method1719(arg3, arg2, arg0 ^ 0x804);
            return var4 == null ? null : new class645(var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!rca", name = "b", descriptor = "(III)Z", line = 68)
    public static final boolean method2245(int arg0, int arg1, int arg2) {
        field5506++;
        if (arg0 > -112) {
            method2244(87, null, 54, 114);
        }
        return (arg1 & 0x800) != 0;
    }
}
