import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class513 extends class30 {

    @OriginalMember(owner = "client!lq", name = "z", descriptor = "Lje;")
    public static class367 field7036 = new class367();

    @OriginalMember(owner = "client!lq", name = "E", descriptor = "I")
    public static int field7039 = 0;

    @OriginalMember(owner = "client!lq", name = "B", descriptor = "I")
    public static int field7037;

    @OriginalMember(owner = "client!lq", name = "D", descriptor = "I")
    public static int field7038;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "(I)V", line = 3)
    public static void method2939(int arg0) {
        int var1 = 31 / ((arg0 + 41) / 52);
        field7036 = null;
    }

    @OriginalMember(owner = "client!lq", name = "<init>", descriptor = "()V", line = 17)
    public class513() {
        super(0, true);
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)[I", line = 28)
    public final int[] method48(int arg0, int arg1) {
        field7037++;
        if (arg0 != 1) {
            field7036 = null;
        }
        return class48.field568;
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(Lr;I)V", line = 42)
    public static final void method2940(class166 arg0, int arg1) {
        field7038++;
        class646 var2 = (class646) class589.field8271.method3898((byte) -34);
        if (arg1 != 0) {
            return;
        }
        while (var2 != null) {
            if (var2.field8931) {
                var2.method3611(arg0);
            }
            var2 = (class646) class589.field8271.method3902(true);
        }
    }
}
