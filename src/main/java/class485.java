import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qm")
public class class485 {

    @OriginalMember(owner = "client!qm", name = "d", descriptor = "Lhw;")
    public class300 field6707 = null;

    @OriginalMember(owner = "client!qm", name = "e", descriptor = "Lda;")
    public class442 field6708 = null;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "Lv;")
    public static class165 field6704 = new class165();

    @OriginalMember(owner = "client!qm", name = "b", descriptor = "I")
    public static int field6705;

    @OriginalMember(owner = "client!qm", name = "c", descriptor = "I")
    public static int field6706;

    @OriginalMember(owner = "client!qm", name = "f", descriptor = "I")
    public static int field6709;

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(ZC)I", line = 3)
    public static final int method2880(boolean arg0, char arg1) {
        field6706++;
        if (arg0) {
            field6704 = null;
        }
        return arg1 >= '\u0000' && class383.field5485.length > arg1 ? class383.field5485[arg1] : -1;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(I[BZ)Ljava/lang/Object;", line = 17)
    public static final Object method2881(int arg0, byte[] arg1, boolean arg2) {
        field6705++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 > ~arg1.length && !class788.field10817) {
            try {
                class353 var3 = (class353) Class.forName("ol").getDeclaredConstructor().newInstance();
                var3.method2219(arg1, (byte) 99);
                return var3;
            } catch (Throwable var4) {
                class788.field10817 = true;
            }
        }
        return arg2 ? class153.method1002(0, arg1) : arg1;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IIILjava/lang/Class;)Laaa;", line = 49)
    public static final class253 method2882(int arg0, int arg1, int arg2, Class arg3) {
        class472 var4 = class59.field688[arg0][arg1][arg2];
        if (var4 == null) {
            return null;
        }
        for (class44 var5 = var4.field6551; var5 != null; var5 = var5.field466) {
            class253 var6 = var5.field465;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field3745 == arg1 && var6.field3758 == arg2) {
                return var6;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(IB)I", line = 73)
    public static final int method2883(int arg0, byte arg1) {
        field6709++;
        return arg1 == -101 ? (arg0 & 0x3F9A2) >> 11 : 101;
    }

    @OriginalMember(owner = "client!qm", name = "a", descriptor = "(B)V", line = 86)
    public static void method2884(byte arg0) {
        field6704 = null;
        int var1 = 94 % ((arg0 - 54) / 47);
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lda;)V", line = 108)
    public class485(class442 arg0) {
        this.field6708 = arg0;
    }

    @OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Lda;Lhw;)V", line = 115)
    public class485(class442 arg0, class300 arg1) {
        this.field6707 = arg1;
        this.field6708 = arg0;
    }
}
