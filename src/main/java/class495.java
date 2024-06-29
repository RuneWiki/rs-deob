import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class495 {

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "Lod;")
    private class349 field7321;

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public int field7318;

    @OriginalMember(owner = "client!dd", name = "k", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field7322;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field7317;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "I")
    public static int field7319;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field7320;

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field7323;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "I")
    public static int field7324;

    @OriginalMember(owner = "client!dd", name = "j", descriptor = "I")
    public static int field7326;

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "Lic;")
    public static class491 field7325;

    @OriginalMember(owner = "client!dd", name = "l", descriptor = "[Lf;")
    public static class529[] field7328;

    static {
        new class475("Unable to send message - system busy.", "Deine Nachricht konnte nicht verschickt werden, das System ist derzeit ausgelastet.", "Impossible d'envoyer un message - système occupé.", "Não foi possível enviar a mensagem. O sistema está ocupado.");
        field7327 = 0;
        field7322 = new CRC32();
    }

    @OriginalMember(owner = "client!dd", name = "finalize", descriptor = "()V", line = 4)
    protected final void finalize() throws Throwable {
        field7320++;
        this.field7321.method2138(this.field7318, 67);
        super.finalize();
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(B)V", line = 16)
    public static void method2969(byte arg0) {
        int var1 = -8 % ((arg0 + 19) / 46);
        field7325 = null;
        field7328 = null;
        field7322 = null;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)Lua;", line = 30)
    public static final class470 method2970(int arg0) {
        field7324++;
        try {
            return new class127();
        } catch (Throwable var2) {
            try {
                return (class470) Class.forName("tg").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                if (arg0 != 8) {
                    method2972(68, false);
                }
                return new class188();
            }
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IIIII)Z", line = 53)
    public static final boolean method2971(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field7323++;
        if ((class183.field2684[0][arg4][arg0] & 0x2) != 0) {
            return true;
        } else if ((class183.field2684[arg3][arg4][arg0] & 0x10) == 0) {
            if (arg1 != 1) {
                field7317 = -64;
            }
            return arg2 == class471.method2820(true, arg0, arg3, arg4);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IZ)I", line = 74)
    public static final int method2972(int arg0, boolean arg1) {
        field7319++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg1) {
            return 40;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)V", line = 129)
    public static final void method2973(int arg0, int arg1) {
        field7326++;
        class338 var2 = class230.method1580(8, -1332166328, arg1);
        var2.method2052(100);
        int var3 = 46 / ((arg0 - 27) / 56);
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "(Lod;II)V", line = 142)
    public class495(class349 arg0, int arg1, int arg2) {
        this.field7321 = arg0;
        this.field7318 = arg2;
    }
}
