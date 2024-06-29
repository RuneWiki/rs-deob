import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class139 extends class13 {

    @OriginalMember(owner = "client!u", name = "M", descriptor = "I")
    public int field3209 = 0;

    @OriginalMember(owner = "client!u", name = "H", descriptor = "Lge;")
    public static class47 field3204 = new class47(5000);

    @OriginalMember(owner = "client!u", name = "P", descriptor = "I")
    public static int field3212 = 0;

    @OriginalMember(owner = "client!u", name = "O", descriptor = "I")
    public static volatile int field3211 = 0;

    @OriginalMember(owner = "client!u", name = "R", descriptor = "Lec;")
    public static class32 field3214 = class73.method594("<col=ffffff>", true);

    @OriginalMember(owner = "client!u", name = "I", descriptor = "I")
    public static int field3205;

    @OriginalMember(owner = "client!u", name = "J", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!u", name = "K", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!u", name = "L", descriptor = "I")
    public static int field3208;

    @OriginalMember(owner = "client!u", name = "N", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!u", name = "Q", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljd;I)V")
    public final void method1045(class66 arg0, int arg1) {
        int var3 = -107 / ((-arg1 - 61) / 34);
        field3207++;
        while (true) {
            int var4 = arg0.method533(255);
            if (var4 == 0) {
                return;
            }
            this.method1049(arg0, 0, var4);
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lea;BLea;)V")
    public static final void method1046(class30 arg0, byte arg1, class30 arg2) {
        field3210++;
        class13.field226 = arg2;
        class15.field307 = arg0;
        if (arg1 != 5) {
            field3214 = null;
        }
        class91.field2083 = class13.field226.method200((byte) 53, 3);
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Lea;I)V")
    public static final void method1047(class30 arg0, int arg1) {
        field3208++;
        class44.field1032 = arg0;
        class61.field1362 = class44.field1032.method200((byte) 53, arg1);
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(Z)V")
    public static void method1048(boolean arg0) {
        field3214 = null;
        field3204 = null;
        if (arg0) {
            field3214 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(Ljd;II)V")
    private final void method1049(class66 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            field3205++;
            if (arg2 == 2) {
                this.field3209 = arg0.method532(0);
            }
        }
    }
}
