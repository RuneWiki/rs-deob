import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class39 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "[Z")
    public static boolean[] field694 = new boolean[100];

    @OriginalMember(owner = "client!ec", name = "l", descriptor = "[Ljava/lang/String;")
    public static String[] field705 = new String[] { "en", "de", "fr", "pt" };

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field695;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field696;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field698;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public int field699;

    @OriginalMember(owner = "client!ec", name = "h", descriptor = "I")
    public int field701;

    @OriginalMember(owner = "client!ec", name = "i", descriptor = "I")
    public int field702;

    @OriginalMember(owner = "client!ec", name = "j", descriptor = "I")
    public static int field703;

    @OriginalMember(owner = "client!ec", name = "k", descriptor = "I")
    public int field704;

    @OriginalMember(owner = "client!ec", name = "m", descriptor = "I")
    public int field706;

    @OriginalMember(owner = "client!ec", name = "o", descriptor = "I")
    public static int field708;

    @OriginalMember(owner = "client!ec", name = "p", descriptor = "I")
    public int field709;

    @OriginalMember(owner = "client!ec", name = "q", descriptor = "I")
    public int field710;

    @OriginalMember(owner = "client!ec", name = "n", descriptor = "Z")
    public static boolean field707;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "[B")
    public byte[] field697;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[B")
    public byte[] field700;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 33)
    public static final void method322(byte arg0) {
        class221.field3539.method1832((byte) 21);
        if (arg0 != -127) {
            field705 = (String[]) null;
        }
        field696++;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)V", line = 44)
    public static void method323(byte arg0) {
        field694 = null;
        field705 = null;
        if (arg0 != 41) {
            method322((byte) 77);
        }
    }

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "(B)Lgk;", line = 57)
    public static final class7 method324(byte arg0) {
        int var1 = class3.field14[0] * class108.field1797[0];
        int[] var2 = new int[var1];
        field703++;
        byte[] var3 = class270.field4198[0];
        if (arg0 >= -22) {
            field705 = (String[]) null;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class251.field3871[class280.method2001(255, var3[var4])];
        }
        class7 var5 = new class7(class326.field5064, class52.field820, class246.field3811[0], class62.field962[0], class108.field1797[0], class3.field14[0], var2);
        class233.method1680((byte) -12);
        return var5;
    }
}
