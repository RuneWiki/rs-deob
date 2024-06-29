import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class181 extends class332 {

    @OriginalMember(owner = "client!vk", name = "o", descriptor = "Ljava/lang/String;")
    public String field2621;

    @OriginalMember(owner = "client!vk", name = "j", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!vk", name = "k", descriptor = "I")
    public static int field2617;

    @OriginalMember(owner = "client!vk", name = "l", descriptor = "I")
    public static int field2618;

    @OriginalMember(owner = "client!vk", name = "m", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!vk", name = "n", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!vk", name = "q", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!vk", name = "p", descriptor = "[[[B")
    public static byte[][][] field2622;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)V", line = 7)
    public static final void method1250(byte arg0) {
        for (int var1 = 0; var1 < class21.field278; var1++) {
            int var2 = class129.field1772[var1];
            class109 var3 = class328.field5009[var2];
            int var4 = class307.field4742.method661(-1);
            if ((var4 & 0x1) != 0) {
                var4 += class307.field4742.method661(-1) << 8;
            }
            class40.method234(var3, (byte) 10, var2, var4);
        }
        if (arg0 <= -106) {
            field2623++;
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(I)V", line = 37)
    public static final void method1251(int arg0) {
        class170.field2428++;
        field2619++;
        class140.field1954.method573(arg0 ^ 0xFFFFC346, 190);
        class140.field1954.method662(true, class196.field2815);
        if (arg0 != -15566) {
            method1250((byte) -12);
        }
    }

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "(I)V", line = 51)
    public static void method1252(int arg0) {
        int var1 = 29 % ((arg0 + 39) / 58);
        field2622 = (byte[][][]) null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(III)V", line = 60)
    public static final void method1253(int arg0, int arg1, int arg2) {
        field2616++;
        class96 var3 = class141.method935(arg1, arg0, arg0 ^ 0x32);
        var3.method581((byte) -123);
        var3.field1243 = arg2;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V", line = 77)
    public class181() {
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 81)
    public class181(String arg0, int arg1) {
        this.field2621 = arg0;
    }
}
