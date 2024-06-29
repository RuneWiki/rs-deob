import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wk")
public class class192 extends class28 {

    @OriginalMember(owner = "client!wk", name = "x", descriptor = "I")
    public int field2501 = 0;

    @OriginalMember(owner = "client!wk", name = "A", descriptor = "I")
    public int field2504 = -1;

    @OriginalMember(owner = "client!wk", name = "m", descriptor = "I")
    public static int field2490 = -1;

    @OriginalMember(owner = "client!wk", name = "o", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2492 = new BigInteger("dd93a8b1b542ae61fca3492097c6c7ba9d3df56dc29aa0c7ca52242f0b3e18f2962825a15b4ac49eaea2a96a5edc43b6359ca9b757b7b57d72bad0c136798ff7", 16);

    @OriginalMember(owner = "client!wk", name = "j", descriptor = "I")
    public int field2487;

    @OriginalMember(owner = "client!wk", name = "k", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!wk", name = "l", descriptor = "I")
    public static int field2489;

    @OriginalMember(owner = "client!wk", name = "n", descriptor = "I")
    public static int field2491;

    @OriginalMember(owner = "client!wk", name = "p", descriptor = "I")
    public int field2493;

    @OriginalMember(owner = "client!wk", name = "q", descriptor = "I")
    public int field2494;

    @OriginalMember(owner = "client!wk", name = "r", descriptor = "I")
    public int field2495;

    @OriginalMember(owner = "client!wk", name = "s", descriptor = "I")
    public int field2496;

    @OriginalMember(owner = "client!wk", name = "t", descriptor = "I")
    public int field2497;

    @OriginalMember(owner = "client!wk", name = "u", descriptor = "I")
    public int field2498;

    @OriginalMember(owner = "client!wk", name = "v", descriptor = "I")
    public int field2499;

    @OriginalMember(owner = "client!wk", name = "w", descriptor = "I")
    public int field2500;

    @OriginalMember(owner = "client!wk", name = "y", descriptor = "I")
    public int field2502;

    @OriginalMember(owner = "client!wk", name = "z", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(ILu;)Ljava/lang/String;")
    public static final String method1229(int arg0, class69 arg1) {
        field2488++;
        if (arg0 < 34) {
            field2490 = 76;
        }
        return arg1.field907 == null || arg1.field907.length() <= 0 ? arg1.field904 : arg1.field904 + class243.field3243.method1491(class350.field5121, (byte) 125) + arg1.field907;
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(III)I")
    public static final int method1230(int arg0, int arg1, int arg2) {
        field2503++;
        int var3 = 1;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg2 * var3;
            }
            arg0 >>= 0x1;
            arg2 *= arg2;
        }
        if (arg0 == 1) {
            return arg2 * var3;
        } else {
            if (arg1 < 73) {
                field2490 = -93;
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!wk", name = "a", descriptor = "(I)V")
    public static void method1231(int arg0) {
        field2492 = null;
        if (arg0 != 0) {
            method1231(63);
        }
    }

    @OriginalMember(owner = "client!wk", name = "b", descriptor = "(I)V")
    public static final void method1232(int arg0) {
        field2491++;
        class351.method2191(-30333);
        int var1 = 109 / ((-arg0 - 25) / 33);
        class155.method1031(-124);
    }
}
