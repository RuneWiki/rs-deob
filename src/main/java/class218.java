import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class218 extends class751 {

    @OriginalMember(owner = "client!cha", name = "n", descriptor = "I")
    public int field3209 = -1;

    @OriginalMember(owner = "client!cha", name = "o", descriptor = "Lmia;")
    public static class63 field3210 = new class63(65, -1);

    @OriginalMember(owner = "client!cha", name = "v", descriptor = "[I")
    public static int[] field3217 = new int[1];

    @OriginalMember(owner = "client!cha", name = "u", descriptor = "[[B")
    public static byte[][] field3216 = new byte[250][];

    @OriginalMember(owner = "client!cha", name = "p", descriptor = "Lk;")
    public static class567 field3211 = null;

    @OriginalMember(owner = "client!cha", name = "r", descriptor = "I")
    public static int field3213 = -1;

    @OriginalMember(owner = "client!cha", name = "l", descriptor = "I")
    public static int field3207;

    @OriginalMember(owner = "client!cha", name = "q", descriptor = "I")
    public int field3212;

    @OriginalMember(owner = "client!cha", name = "t", descriptor = "I")
    public static int field3215;

    @OriginalMember(owner = "client!cha", name = "w", descriptor = "I")
    public static int field3218;

    @OriginalMember(owner = "client!cha", name = "m", descriptor = "Ljava/lang/String;")
    public String field3208;

    @OriginalMember(owner = "client!cha", name = "s", descriptor = "Ljava/lang/String;")
    public String field3214;

    @OriginalMember(owner = "client!cha", name = "c", descriptor = "(I)Lw;", line = 11)
    public final class300 method1463(int arg0) {
        ++field3218;
        if (arg0 != -1) {
            this.field3214 = null;
        }
        return class149.field2327[super.field10503];
    }

    @OriginalMember(owner = "client!cha", name = "d", descriptor = "(I)V", line = 28)
    public static void method1464(int arg0) {
        field3211 = null;
        if (arg0 == 65) {
            field3210 = null;
            field3217 = null;
            field3216 = null;
        }
    }

    @OriginalMember(owner = "client!cha", name = "a", descriptor = "(ILjava/awt/Component;)Luj;", line = 41)
    public static final class385 method1465(int arg0, Component arg1) {
        ++field3207;
        if (arg0 != -1) {
            field3210 = null;
        }
        return new class632(arg1);
    }
}
