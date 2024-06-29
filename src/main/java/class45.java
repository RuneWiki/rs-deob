import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public abstract class class45 {

    @OriginalMember(owner = "client!dl", name = "d", descriptor = "Lfd;")
    public class365 field506;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "Lcr;")
    public static class403 field503 = new class403(0, 0);

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "[Lpt;")
    public static class367[] field504 = new class367[14];

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "[B")
    public static byte[] field505 = new byte[32896];

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "[I")
    public static int[] field508;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "I")
    public static int field510;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public static int field509;

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field505[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
        field508 = new int[200];
        field510 = -1;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZLya;)V", line = 6)
    public static final void method481(boolean arg0, class38 arg1) {
        field507++;
        if (!arg0) {
            field504 = null;
        }
        if (class265.field3904 != class435.field6375.field6328 && class422.field6240 != null && class339.method2059(-4, class435.field6375.field6328, arg1)) {
            class265.field3904 = class435.field6375.field6328;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(B)V", line = 31)
    public static void method482(byte arg0) {
        field503 = null;
        field505 = null;
        int var1 = 104 % ((28 - arg0) / 33);
        field504 = null;
        field508 = null;
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lfd;)V", line = 82)
    public class45(class365 arg0) {
        this.field506 = arg0;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V")
    public abstract void method286(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZ)V")
    public abstract void method281(int arg0, boolean arg1);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(I)V")
    public abstract void method287(int arg0);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)Z")
    public abstract boolean method280(boolean arg0);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ILkj;Z)V")
    public abstract void method285(int arg0, class396 arg1, boolean arg2);

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(ZB)V")
    public abstract void method279(boolean arg0, byte arg1);
}
