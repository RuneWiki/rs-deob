import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class424 {

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "I")
    public static int field5716 = 0;

    @OriginalMember(owner = "client!ul", name = "c", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field5717 = new BigInteger("10001", 16);

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "I")
    public static int field5715;

    @OriginalMember(owner = "client!ul", name = "d", descriptor = "I")
    public static int field5718;

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "I")
    public static int field5719;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "I")
    public static int field5720;

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "I")
    public static int field5721;

    @OriginalMember(owner = "client!ul", name = "h", descriptor = "I")
    public static int field5722;

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(I)I")
    public static final int method2402(int arg0) {
        if (arg0 == -22556) {
            field5721++;
            return class340.field4576;
        } else {
            return -62;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IBI)I")
    public static final int method2403(int arg0, byte arg1, int arg2) {
        if (arg1 != 16) {
            field5716 = -21;
        }
        field5719++;
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lda;IIILcu;I)V")
    public static final void method2404(class470 arg0, int arg1, int arg2, int arg3, class475 arg4, int arg5) {
        field5718++;
        if (arg0 != null) {
            arg4.method2736(arg0.method647(), arg0.method627(), arg0.method660(), arg3, arg2, arg0.method636(), arg0.method613(), 102, arg5, arg0.method650(), arg0.method656());
            if (arg1 != -17171) {
                field5717 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "b", descriptor = "(I)V")
    public static void method2405(int arg0) {
        field5717 = null;
        if (arg0 != 262144) {
            field5716 = 32;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(III)Z")
    public static final boolean method2406(int arg0, int arg1, int arg2) {
        int var3 = -33 / ((-arg2 - 64) / 36);
        field5720++;
        return class411.method2337(arg1, arg0, (byte) 127) | (arg1 & 0x40000) != 0 || class472.method2727(arg0, arg1, -16489);
    }
}
