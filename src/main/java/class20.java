import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!an")
public class class20 extends class86 {

    @OriginalMember(owner = "client!an", name = "r", descriptor = "J")
    public long field282;

    @OriginalMember(owner = "client!an", name = "p", descriptor = "Lwt;")
    public static class194 field280 = new class194(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!an", name = "s", descriptor = "Liu;")
    public static class390 field283 = new class390(66, -2);

    @OriginalMember(owner = "client!an", name = "o", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!an", name = "q", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(I)V")
    public static void method145(int arg0) {
        field283 = null;
        field280 = null;
        if (arg0 != -5027) {
            method145(76);
        }
    }

    @OriginalMember(owner = "client!an", name = "a", descriptor = "(ZI)I")
    public static final int method146(boolean arg0, int arg1) {
        field279++;
        int var2 = 0;
        if (!arg0) {
            return -40;
        }
        if (arg1 < 0 || arg1 >= 65536) {
            var2 += 16;
            arg1 >>>= 0x10;
        }
        if (arg1 >= 256) {
            var2 += 8;
            arg1 >>>= 0x8;
        }
        if (arg1 >= 16) {
            arg1 >>>= 0x4;
            var2 += 4;
        }
        if (arg1 >= 4) {
            arg1 >>>= 0x2;
            var2 += 2;
        }
        if (arg1 >= 1) {
            arg1 >>>= 0x1;
            var2++;
        }
        return var2 + arg1;
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "()V")
    public class20() {
    }

    @OriginalMember(owner = "client!an", name = "d", descriptor = "(B)V")
    public static final void method147(byte arg0) {
        class444.field6479 = 0;
        class455.field6630 = 0;
        class16.field236 = 0;
        class487.field7297 = 0;
        field281++;
        if (arg0 != -53) {
            field280 = null;
        }
    }

    @OriginalMember(owner = "client!an", name = "<init>", descriptor = "(J)V")
    public class20(long arg0) {
        this.field282 = arg0;
    }
}
