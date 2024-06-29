import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class167 {

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2769 = "Loading world list data";

    @OriginalMember(owner = "client!df", name = "a", descriptor = "I")
    public static int field2763;

    @OriginalMember(owner = "client!df", name = "b", descriptor = "I")
    public int field2764;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "I")
    public int field2765;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2766;

    @OriginalMember(owner = "client!df", name = "e", descriptor = "I")
    public int field2767;

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field2768;

    @OriginalMember(owner = "client!df", name = "h", descriptor = "I")
    public static int field2770;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "I")
    public int field2771;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 12)
    public static void method1221(byte arg0) {
        field2769 = null;
        if (arg0 != -40) {
            method1222(113);
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(I)V", line = 23)
    public static final void method1222(int arg0) {
        int var1 = 97 % ((-arg0 - 32) / 62);
        if (class147.field2287 != -1) {
            class76.method519(class147.field2287, -23141);
        }
        for (int var2 = 0; var2 < class20.field291; var2++) {
            if (class174.field2884[var2]) {
                class127.field1991[var2] = true;
            }
            class45.field638[var2] = class174.field2884[var2];
            class174.field2884[var2] = false;
        }
        if (class232.field3690) {
            class185.field3067 = true;
        }
        class111.field1653 = -1;
        class211.field3461 = null;
        class331.field5161 = -1;
        field2768++;
        class42.field539 = class240.field3818;
        if (class147.field2287 != -1) {
            class20.field291 = 0;
            class200.method1466(true);
        }
        if (class232.field3690) {
            class75.method508();
        } else {
            class59.method391();
        }
        class36.field477 = 0;
    }

    @OriginalMember(owner = "client!df", name = "b", descriptor = "(B)V", line = 71)
    public static final void method1223(byte arg0) {
        if (class191.field3129 != null && class191.field3129.field4255 + 64 - class191.field3129.method1881(-20395) * 64 >> 7 == class256.field4110 && (class191.field3129.field4264 + 64 - class191.field3129.method1881(-20395) * 64 >> 7) == class98.field1408) {
            class256.field4110 = 0;
        }
        field2766++;
        for (int var1 = 0; var1 < 104; var1++) {
            for (int var2 = 0; var2 < 104; var2++) {
                class277.field4466[var1][var2] = 0;
            }
        }
        for (int var3 = 0; var3 < class275.field4435; var3++) {
            class334 var4 = class74.field1049[class160.field2656[var3]];
            if (var4 != null) {
                var4.field4259 = false;
            }
        }
        int var5 = 0;
        if (arg0 <= 25) {
            return;
        }
        while (class233.field3736 > var5) {
            class234 var6 = class99.field1445[class142.field2225[var5]];
            if (var6 != null) {
                var6.field4259 = false;
            }
            var5++;
        }
    }
}
