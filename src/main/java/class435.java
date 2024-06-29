import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tv")
public class class435 {

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field6257 = new CRC32();

    @OriginalMember(owner = "client!tv", name = "h", descriptor = "I")
    public static int field6260 = 0;

    @OriginalMember(owner = "client!tv", name = "l", descriptor = "I")
    public static int field6264 = 0;

    @OriginalMember(owner = "client!tv", name = "o", descriptor = "I")
    public static int field6267 = 0;

    @OriginalMember(owner = "client!tv", name = "j", descriptor = "Ljava/lang/String;")
    public static String field6262 = null;

    @OriginalMember(owner = "client!tv", name = "p", descriptor = "I")
    public static int field6268 = 0;

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "I")
    public static int field6253;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "I")
    public static int field6254;

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "I")
    public static int field6255;

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "I")
    public static int field6256;

    @OriginalMember(owner = "client!tv", name = "i", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!tv", name = "n", descriptor = "I")
    public static int field6266;

    @OriginalMember(owner = "client!tv", name = "m", descriptor = "J")
    public long field6265;

    @OriginalMember(owner = "client!tv", name = "f", descriptor = "Ltv;")
    public class435 field6258;

    @OriginalMember(owner = "client!tv", name = "g", descriptor = "Ltv;")
    public class435 field6259;

    @OriginalMember(owner = "client!tv", name = "k", descriptor = "Ljava/lang/Object;")
    public static Object field6263;

    @OriginalMember(owner = "client!tv", name = "b", descriptor = "(B)V", line = 4)
    public final void method2549(byte arg0) {
        int var2 = 110 / ((arg0 + 6) / 32);
        field6256++;
        if (this.field6258 != null) {
            this.field6258.field6259 = this.field6259;
            this.field6259.field6258 = this.field6258;
            this.field6258 = null;
            this.field6259 = null;
        }
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(IB)Z", line = 22)
    public static final boolean method2550(int arg0, byte arg1) {
        field6253++;
        if (arg1 != -50) {
            method2551(11, null, 5);
        }
        return arg0 == 1 || arg0 == 3 || arg0 == 5;
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILek;I)Ljava/lang/String;", line = 33)
    public static final String method2551(int arg0, class465 arg1, int arg2) {
        field6266++;
        try {
            int var3 = arg1.method2720(-127);
            if (arg2 < var3) {
                var3 = arg2;
            }
            byte[] var4 = new byte[var3];
            arg1.field6710 += class427.field6096.method3061(arg1.field6710, var4, var3, arg1.field6719, -1, 0);
            return class353.method2137(var4, 0, var3, arg0);
        } catch (Exception var6) {
            return "Cabbage";
        }
    }

    @OriginalMember(owner = "client!tv", name = "c", descriptor = "(B)[Luea;", line = 60)
    public static final class256[] method2552(byte arg0) {
        field6254++;
        if (arg0 != -101) {
            method2550(-7, (byte) 13);
        }
        return new class256[] { class205.field3174, class263.field3783, class275.field3914, class443.field6422, class434.field6248, class451.field6498 };
    }

    @OriginalMember(owner = "client!tv", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", line = 75)
    public static final String method2553(int arg0, String arg1, String arg2, String arg3) {
        if (arg0 != 0) {
            field6263 = null;
        }
        field6255++;
        for (int var4 = arg1.indexOf(arg3); var4 != -1; var4 = arg1.indexOf(arg3, arg2.length() + var4)) {
            arg1 = arg1.substring(0, var4) + arg2 + arg1.substring(var4 + arg3.length());
        }
        return arg1;
    }

    @OriginalMember(owner = "client!tv", name = "d", descriptor = "(B)V", line = 98)
    public static void method2554(byte arg0) {
        field6262 = null;
        field6263 = null;
        if (arg0 < 42) {
            method2550(8, (byte) 76);
        }
        field6257 = null;
    }

    @OriginalMember(owner = "client!tv", name = "e", descriptor = "(I)Z", line = 115)
    public final boolean method2555(int arg0) {
        if (arg0 != 19742) {
            method2551(113, null, 11);
        }
        field6261++;
        return this.field6258 != null;
    }
}
