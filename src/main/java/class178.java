import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public class class178 {

    @OriginalMember(owner = "client!sq", name = "f", descriptor = "I")
    public int field2091;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "I")
    public int field2096;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "I")
    public int field2093;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public int field2097;

    @OriginalMember(owner = "client!sq", name = "d", descriptor = "[Ljava/lang/String;")
    public static String[] field2089 = new String[100];

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "Luh;")
    public static class166 field2092 = new class166();

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "[I")
    public static int[] field2094 = new int[8];

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!sq", name = "c", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!sq", name = "e", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!sq", name = "toString", descriptor = "()Ljava/lang/String;", line = 4)
    public final String toString() {
        field2087++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(I)I", line = 12)
    public static final int method1096(int arg0) {
        field2086++;
        if (arg0 != -2) {
            method1099((byte) 64);
        }
        return class518.field7364;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Z)I", line = 27)
    public static final int method1097(boolean arg0) {
        field2095++;
        if (arg0) {
            return -84;
        } else if (class3.field27 == 1) {
            return class233.field2723;
        } else {
            return class415.field5687;
        }
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(Z)V", line = 49)
    public static final void method1098(boolean arg0) throws class266 {
        if (class3.field27 == 1) {
            class574.field8144.method429(class261.field3241, class305.field3808);
        } else {
            class574.field8144.method429(0, 0);
        }
        if (!arg0) {
            field2088++;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(B)V", line = 74)
    public static void method1099(byte arg0) {
        field2092 = null;
        field2089 = null;
        field2094 = null;
        if (arg0 != 55) {
            field2089 = null;
        }
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(IIII)V", line = 85)
    public class178(int arg0, int arg1, int arg2, int arg3) {
        this.field2091 = arg3;
        this.field2096 = arg1;
        this.field2093 = arg0;
        this.field2097 = arg2;
    }
}
