import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class317 {

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "Z")
    public static boolean field4370 = true;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "Lvt;")
    public static class344 field4369 = new class344("green:", "grün:", "vert:", "verde:");

    @OriginalMember(owner = "client!paa", name = "g", descriptor = "Lbn;")
    public static class371 field4375 = new class371(1, 2, 2, 0);

    @OriginalMember(owner = "client!paa", name = "h", descriptor = "I")
    public static int field4376 = 4;

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!paa", name = "d", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!paa", name = "e", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!paa", name = "f", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!paa", name = "i", descriptor = "[I")
    public static int[] field4377;

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)V")
    public static void method1977(int arg0) {
        field4375 = null;
        field4369 = null;
        field4377 = null;
        if (arg0 != -5101) {
            field4370 = true;
        }
    }

    @OriginalMember(owner = "client!paa", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4372++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)V")
    public static final void method1978(int arg0) {
        if (class301.field3918.method963()) {
            class301.field3918.method986(class141.field1806);
            class241.method1502(true);
            class301.field3918.method918(class141.field1806);
            class301.field3918.method201(class141.field1806);
        } else {
            class293.method1796(class428.field5845, (byte) -105);
        }
        field4373++;
        if (arg0 < 86) {
            method1979((byte) -96);
        }
        class145.method794((byte) 121);
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(II)V")
    public class317(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)V")
    public static final void method1979(byte arg0) {
        class179.field2313 = null;
        class308.field3942 = -1;
        if (arg0 < 118) {
            method1978(-108);
        }
        field4371++;
    }
}
