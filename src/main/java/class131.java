import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iea")
public class class131 {

    @OriginalMember(owner = "client!iea", name = "d", descriptor = "Lmr;")
    private class221 field1474;

    @OriginalMember(owner = "client!iea", name = "g", descriptor = "I")
    public int field1477;

    @OriginalMember(owner = "client!iea", name = "b", descriptor = "I")
    public static int field1472 = 0;

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!iea", name = "c", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!iea", name = "e", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!iea", name = "f", descriptor = "I")
    public static int field1476;

    @OriginalMember(owner = "client!iea", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1473++;
        this.field1474.method1314(this.field1477, 3169);
        super.finalize();
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(JB)V")
    public static final void method742(long arg0, byte arg1) {
        if (class487.field7044 != null) {
            if (class538.field7572 == 1 || class538.field7572 == 5) {
                class517.method2940(-22, arg0);
            } else if (class538.field7572 == 4) {
                class414.method2330(125, arg0);
            }
        }
        field1471++;
        class645.method3613(class701.field9813, (long) class678.field9539, false);
        if (arg1 >= -117) {
            method744((byte) -10);
        }
        if (class209.field2466 != -1) {
            class307.method1768(class209.field2466, -11609);
        }
        for (int var3 = 0; var3 < class141.field1556; var3++) {
            if (class313.field3894[var3]) {
                class444.field6263[var3] = true;
            }
            class73.field768[var3] = class313.field3894[var3];
            class313.field3894[var3] = false;
        }
        class386.field5212 = class678.field9539;
        if (class209.field2466 != -1) {
            class141.field1556 = 0;
            class8.method52((byte) 99);
        }
        class701.field9813.method1050();
        class605.method3382(class701.field9813, (byte) 115);
        int var4 = class364.method2127(-21221);
        if (var4 == -1) {
            var4 = class178.field1992;
        }
        if (var4 == -1) {
            var4 = class176.field1966;
        }
        class125.method716((byte) 111, var4);
        class533.method2990(-95, class362.field4859.field5166, class362.field4859.field5179, class362.field4859.field5176, class569.field8088);
        class569.field8088 = 0;
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(Lnp;B)Lwm;")
    public static final class631 method743(class115 arg0, byte arg1) {
        field1475++;
        class176 var2 = class309.method1779(arg0, -107);
        int var3 = arg0.method643((byte) -77);
        int var4 = arg0.method643((byte) -77);
        int var5 = arg0.method643((byte) -77);
        if (arg1 < 39) {
            field1472 = -126;
        }
        int var6 = arg0.method643((byte) -77);
        int var7 = arg0.method643((byte) -77);
        int var8 = arg0.method643((byte) -77);
        return new class631(var2.field1965, var2.field1962, var2.field1967, var2.field1970, var2.field1972, var2.field1971, var2.field1973, var2.field1969, var2.field1968, var3, var4, var5, var6, var7, var8);
    }

    @OriginalMember(owner = "client!iea", name = "a", descriptor = "(B)V")
    public static final void method744(byte arg0) {
        field1476++;
        int var1 = -30 % ((arg0 - 27) / 46);
        int var2 = 0;
        if (class639.field9075 != null) {
            var2 = class639.field9075.method2639(class430.field6109, 31285);
        }
        if (var2 == 2) {
            int var5 = class338.field4245 <= 800 ? class338.field4245 : 800;
            class146.field1618 = var5;
            int var6 = class533.field7491 <= 600 ? class533.field7491 : 600;
            class5.field57 = (class338.field4245 - var5) / 2;
            class338.field4244 = var6;
            class434.field6130 = 0;
        } else if (var2 == 1) {
            int var3 = class338.field4245 > 1024 ? 1024 : class338.field4245;
            int var4 = class533.field7491 <= 768 ? class533.field7491 : 768;
            class5.field57 = (class338.field4245 - var3) / 2;
            class146.field1618 = var3;
            class434.field6130 = 0;
            class338.field4244 = var4;
        } else {
            class434.field6130 = 0;
            class5.field57 = 0;
            class146.field1618 = class338.field4245;
            class338.field4244 = class533.field7491;
        }
    }

    @OriginalMember(owner = "client!iea", name = "<init>", descriptor = "(Lmr;II)V")
    public class131(class221 arg0, int arg1, int arg2) {
        this.field1474 = arg0;
        this.field1477 = arg2;
    }
}
