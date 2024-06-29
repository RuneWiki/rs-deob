import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class130 extends class5 {

    @OriginalMember(owner = "client!nb", name = "t", descriptor = "[I")
    public int[] field1995 = new int[] { -1 };

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "[I")
    public int[] field1998 = new int[] { 0 };

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "I")
    public static int field2001 = 0;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Ljava/lang/String;")
    public static String field2002 = "Choose Option";

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "Ljava/util/Random;")
    public static Random field1999 = new Random();

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "Lec;")
    public static class99 field2003 = new class99(64);

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "F")
    public static float field2000;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static int field1996;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field1997;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BI)V", line = 29)
    public static final void method1014(byte arg0, int arg1) {
        int var2 = 30 / ((40 - arg0) / 32);
        class204 var3 = class209.field3195;
        synchronized (class209.field3195) {
            class83.field1221 = arg1;
        }
        field1996++;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Ljd;I)V", line = 44)
    public static final void method1015(class95 arg0, int arg1) {
        if (arg1 != 0) {
            field2001 = 82;
        }
        class181.field2871 = arg0;
        field1997++;
    }

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "(I)V", line = 56)
    public static void method1016(int arg0) {
        field2002 = null;
        field1999 = null;
        int var1 = -87 / ((arg0 - 53) / 61);
        field2003 = null;
    }
}
