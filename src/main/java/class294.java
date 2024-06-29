import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class294 {

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public int field4155;

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Lne;")
    public static class294 field4156 = new class294(1);

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Lne;")
    public static class294 field4158 = new class294(2);

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Lne;")
    public static class294 field4159 = new class294(4);

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "Lne;")
    public static class294 field4160 = new class294(1);

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "Lne;")
    public static class294 field4161 = new class294(2);

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "Lne;")
    public static class294 field4162 = new class294(4);

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lne;")
    public static class294 field4163 = new class294(2);

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "Lne;")
    public static class294 field4164 = new class294(4);

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field4165 = -1;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field4153;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "I")
    public static int field4154;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "I")
    public static int field4157;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(III)V")
    public static final void method1810(int arg0, int arg1, int arg2) {
        field4154++;
        if (arg0 >= -39) {
            method1812((byte) -72, -70, -48);
        }
        if (class269.method1639(arg2, 0)) {
            class438.method2493(arg1, class601.field7977[arg2], false);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(B)V")
    public static void method1811(byte arg0) {
        field4162 = null;
        if (arg0 < 9) {
            field4156 = null;
        }
        field4161 = null;
        field4164 = null;
        field4158 = null;
        field4160 = null;
        field4159 = null;
        field4156 = null;
        field4163 = null;
    }

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "(I)V")
    private class294(int arg0) {
        this.field4155 = arg0;
    }

    @OriginalMember(owner = "client!ne", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4153++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BII)Z")
    public static final boolean method1812(byte arg0, int arg1, int arg2) {
        if (arg0 > -38) {
            return false;
        } else {
            field4157++;
            return (arg2 & 0x8000) != 0;
        }
    }
}
