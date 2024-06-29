import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class296 extends class443 {

    @OriginalMember(owner = "client!dq", name = "v", descriptor = "Lti;")
    public class1 field4460;

    @OriginalMember(owner = "client!dq", name = "z", descriptor = "Lu;")
    public class4 field4464;

    @OriginalMember(owner = "client!dq", name = "u", descriptor = "I")
    public static int field4459 = 0;

    @OriginalMember(owner = "client!dq", name = "E", descriptor = "[S")
    public static short[] field4469 = new short[] { 12, 49, 35, 24, 16, 36, 58, 43 };

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "[J")
    public static long[] field4466 = new long[32];

    @OriginalMember(owner = "client!dq", name = "H", descriptor = "Ljava/lang/String;")
    public static String field4472 = "Loaded world list data";

    @OriginalMember(owner = "client!dq", name = "I", descriptor = "[I")
    public static int[] field4473 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!dq", name = "w", descriptor = "I")
    public int field4461;

    @OriginalMember(owner = "client!dq", name = "x", descriptor = "I")
    public int field4462;

    @OriginalMember(owner = "client!dq", name = "y", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
    public int field4465;

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
    public static int field4467;

    @OriginalMember(owner = "client!dq", name = "D", descriptor = "I")
    public int field4468;

    @OriginalMember(owner = "client!dq", name = "F", descriptor = "I")
    public int field4470;

    @OriginalMember(owner = "client!dq", name = "G", descriptor = "I")
    public static int field4471;

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "I")
    public static int field4474;

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "I")
    public static int field4475;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(Lsj;I)Ljava/lang/String;", line = 7)
    public static final String method2006(class248 arg0, int arg1) {
        field4463++;
        int var2 = -23 % ((arg1 + 24) / 37);
        if (client.method402(arg0).method1469(-2703) == 0) {
            return null;
        } else if (arg0.field3502 == null || arg0.field3502.trim().length() == 0) {
            return class126.field1649 ? "Hidden-use" : null;
        } else {
            return arg0.field3502;
        }
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(I)V", line = 31)
    public final void method2007(int arg0) {
        field4474++;
        this.field4461 = this.field4460.field5;
        this.field4470 = this.field4460.field9;
        this.field4465 = this.field4460.field14;
        if (this.field4460.field4 != null) {
            this.field4460.field4.method278(this.field4464.field61, this.field4464.field59, this.field4464.field55, class116.field1504);
        }
        this.field4462 = class116.field1504[arg0];
        this.field4468 = class116.field1504[2];
    }

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "(B)V", line = 67)
    public static void method2008(byte arg0) {
        field4469 = null;
        if (arg0 >= 56) {
            field4466 = null;
            field4472 = null;
            field4473 = null;
        }
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "(Lti;Lnd;)V", line = 80)
    public class296(class1 arg0, class411 arg1) {
        this.field4460 = arg0;
        this.field4464 = class373.method2450(-45, arg0.field7);
        this.method2007(0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BZ)V", line = 102)
    public static final void method2009(byte arg0, boolean arg1) {
        field4467++;
        if (arg1) {
            if (class233.field3246 != -1) {
                class188.method1251(class233.field3246, 0);
            }
            for (class28 var2 = (class28) class242.field3402.method2812(15710); var2 != null; var2 = (class28) class242.field3402.method2819((byte) 105)) {
                if (!var2.method2633(true)) {
                    var2 = (class28) class242.field3402.method2812(15710);
                    if (var2 == null) {
                        break;
                    }
                }
                class93.method751(var2, true, (byte) -84, false);
            }
            class233.field3246 = -1;
            class242.field3402 = new class453(8);
            class85.method693(0);
            class233.field3246 = class47.field714;
            class453.method2813((byte) -108, false);
            class274.method1812(-1695);
            class293.method1988(class233.field3246);
        }
        class415.method2617(1010);
        class295.field4448 = -1;
        class191.method1272((byte) 59, class38.field571);
        class383.field5609 = new class317();
        class383.field5609.field2190[0] = 52;
        class383.field5609.field5930 = 6656;
        if (arg0 != -14) {
            field4459 = 17;
        }
        class383.field5609.field5921 = 6656;
        class383.field5609.field2189[0] = 52;
        class279.field4099 = 0;
        class326.field4829 = 0;
        if (class212.field2884 == 2) {
            class326.field4829 = class450.field6458 << 7;
            class279.field4099 = class440.field6377 << 7;
        } else {
            class342.method2270((byte) -46);
        }
        class104.method795(false);
        if (class326.field4829 == 0 || class279.field4099 == 0) {
            class63.method558(10, true);
        } else {
            class216.method1423(-89);
            class63.method558(28, true);
        }
    }
}
