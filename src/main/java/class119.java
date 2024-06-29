import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class119 {

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field1857 = 0;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field1861 = 0;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "[I")
    public static int[] field1864 = new int[1];

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public static int field1858;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public static int field1859;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "Ldk;")
    public static class421 field1862;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "[[Lmk;")
    public static class382[][] field1860;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)V")
    public static final void method874(int arg0) {
        class422.field6142 = 0;
        field1863++;
        int var1 = (class81.field1158.field6284 >> 7) + class110.field1775;
        int var2 = (class81.field1158.field6287 >> 7) + class399.field5727;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class422.field6142 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class422.field6142 = 1;
        }
        if (arg0 <= 120) {
            field1864 = null;
        }
        if (class422.field6142 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class422.field6142 = 0;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V")
    public static void method875(int arg0) {
        int var1 = 91 % ((38 - arg0) / 32);
        field1860 = null;
        field1864 = null;
        field1862 = null;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lat;B)V")
    public static final void method876(class444 arg0, byte arg1) {
        int var2 = -108 / ((67 - arg1) / 57);
        field1858++;
        if (!class375.field5390) {
            return;
        }
        class49.field700++;
        if (arg0.field6512 != null) {
            class444 var3 = class222.method1381(class478.field6914, class478.field6916, -100);
            if (var3 != null) {
                class414 var4 = new class414();
                var4.field5899 = var3;
                var4.field5900 = arg0.field6512;
                var4.field5896 = arg0;
                class47.method313(var4);
            }
        }
        class274.method1602(14, class183.field2729);
        class17.field275.method1858(arg0.field6469, (byte) -69);
        class17.field275.method1857(561746448, arg0.field6481);
        class17.field275.method1831(55750472, class168.field2567);
        class17.field275.method1831(55750472, class478.field6916);
        class17.field275.method1857(561746448, arg0.field6510);
        class17.field275.method1873(class478.field6914, 32767);
    }
}
