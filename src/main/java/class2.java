import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ro")
public class class2 extends class542 {

    @OriginalMember(owner = "client!ro", name = "q", descriptor = "[Lsj;")
    public class459[] field21;

    @OriginalMember(owner = "client!ro", name = "o", descriptor = "F")
    public static float field19 = 1024.0F;

    @OriginalMember(owner = "client!ro", name = "i", descriptor = "I")
    public static int field13 = 1;

    @OriginalMember(owner = "client!ro", name = "n", descriptor = "Z")
    public static boolean field18 = false;

    @OriginalMember(owner = "client!ro", name = "l", descriptor = "Z")
    public static boolean field16 = false;

    @OriginalMember(owner = "client!ro", name = "m", descriptor = "[[B")
    public static byte[][] field17 = new byte[250][];

    @OriginalMember(owner = "client!ro", name = "p", descriptor = "I")
    public static int field20 = 0;

    @OriginalMember(owner = "client!ro", name = "j", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "client!ro", name = "k", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!ro", name = "r", descriptor = "I")
    public static int field22;

    @OriginalMember(owner = "client!ro", name = "s", descriptor = "[I")
    public static int[] field23;

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(I)V")
    public static final void method7(int arg0) {
        if (arg0 >= -111) {
            field18 = true;
        }
        field22++;
        for (class639 var1 = (class639) class633.field8740.method2765(-12261); var1 != null; var1 = (class639) class633.field8740.method2759(-15361)) {
            if (var1.field8778 == -1) {
                var1.field8786 = 0;
                if (var1.field8774 >= 0 && var1.field8773 >= 0 && class336.field4683 > var1.field8774 && var1.field8773 < class700.field9768) {
                    class30.method173(var1, true);
                }
            } else {
                var1.method1185(-92);
            }
        }
    }

    @OriginalMember(owner = "client!ro", name = "a", descriptor = "(III)Z")
    public static final boolean method8(int arg0, int arg1, int arg2) {
        if (arg2 != -31423) {
            field15 = -47;
        }
        field14++;
        return class53.method327(arg1, arg0, 1485) & (class37.method211((byte) 33, arg0, arg1) | (arg1 & 0x2000) != 0 | class465.method2776(arg1, (byte) -94, arg0));
    }

    @OriginalMember(owner = "client!ro", name = "b", descriptor = "(I)V")
    public static void method9(int arg0) {
        if (arg0 == -12529) {
            field23 = null;
            field17 = null;
        }
    }

    @OriginalMember(owner = "client!ro", name = "<init>", descriptor = "([Lsj;)V")
    public class2(class459[] arg0) {
        this.field21 = arg0;
    }
}
