import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class320 {

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public int field4186 = 1;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "Lvj;")
    public static class304 field4188 = new class304("Loaded interfaces", "Benutzeroberfläche geladen.", "Interfaces chargées", "Interfaces carregadas");

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public static int field4191 = 0;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "Lld;")
    public static class114 field4189 = new class114();

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "Lff;")
    public static class9 field4192 = new class9(90, 8);

    @OriginalMember(owner = "client!vq", name = "j", descriptor = "[I")
    public static int[] field4193 = new int[1];

    @OriginalMember(owner = "client!vq", name = "k", descriptor = "I")
    public static int field4194 = 0;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "C")
    public char field4184;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lmd;II)V")
    private final void method1842(class379 arg0, int arg1, int arg2) {
        if (arg2 == 1) {
            this.field4184 = class237.method1471(5728, arg0.method2194(arg1 ^ 0xFFFF83ED));
        } else if (arg2 == 2) {
            this.field4186 = 0;
        }
        if (arg1 != 31762) {
            field4194 = 29;
        }
        field4185++;
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(I)V")
    public static void method1843(int arg0) {
        field4188 = null;
        if (arg0 != -8988) {
            method1843(45);
        }
        field4192 = null;
        field4193 = null;
        field4189 = null;
    }

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "(I)V")
    public static final void method1844(int arg0) {
        class381.field5205 = null;
        field4190++;
        if (arg0 > 25) {
            class289.field3785 = false;
            class260.method1570(119);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lmd;B)V")
    public final void method1845(class379 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method2238(255);
            if (var3 == 0) {
                if (arg1 != -120) {
                    return;
                }
                field4187++;
                return;
            }
            this.method1842(arg0, 31762, var3);
        }
    }
}
