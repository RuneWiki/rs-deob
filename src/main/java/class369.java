import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tu")
public class class369 {

    @OriginalMember(owner = "client!tu", name = "h", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "Lhj;")
    public static class596 field4586 = new class596(78, 0);

    @OriginalMember(owner = "client!tu", name = "g", descriptor = "F")
    public static float field4592;

    @OriginalMember(owner = "client!tu", name = "b", descriptor = "I")
    public static int field4587;

    @OriginalMember(owner = "client!tu", name = "c", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!tu", name = "d", descriptor = "I")
    public static int field4589;

    @OriginalMember(owner = "client!tu", name = "e", descriptor = "I")
    public static int field4590;

    @OriginalMember(owner = "client!tu", name = "f", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(I)V")
    public static final void method2152(int arg0) {
        field4589++;
        if (class393.field5086) {
            return;
        }
        class687.field9377 += (-class687.field9377 - 24.0F) / 2.0F;
        if (arg0 != 8) {
            method2153(56, -17);
        }
        class393.field5086 = true;
        class197.field2345 = true;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(II)I")
    public static final int method2153(int arg0, int arg1) {
        field4588++;
        int var2 = arg1 & 0x3F;
        int var3 = arg1 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return arg0 >= -36 ? -75 : 0;
    }

    @OriginalMember(owner = "client!tu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4591++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tu", name = "<init>", descriptor = "(I)V")
    public class369(int arg0) {
        this.field4593 = arg0;
    }

    @OriginalMember(owner = "client!tu", name = "a", descriptor = "(Z)V")
    public static void method2154(boolean arg0) {
        if (!arg0) {
            field4586 = null;
        }
    }
}
