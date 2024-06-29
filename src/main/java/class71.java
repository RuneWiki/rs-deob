import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class71 {

    @OriginalMember(owner = "client!qs", name = "d", descriptor = "J")
    public static long field842 = 0L;

    @OriginalMember(owner = "client!qs", name = "e", descriptor = "I")
    public static int field843 = 0;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "I")
    public static int field839;

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!qs", name = "c", descriptor = "Ljh;")
    public static class603 field841;

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(I)V")
    public static final void method391(int arg0) {
        field839++;
        if (arg0 != 0) {
            field841 = null;
        }
        class259.field3385 = new class445();
    }

    @OriginalMember(owner = "client!qs", name = "a", descriptor = "(BI)Llg;")
    public static final class32 method392(byte arg0, int arg1) {
        field840++;
        class32[] var2 = class685.method3878(true);
        if (arg0 != 16) {
            method393(91);
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            if (var2[var3].field445 == arg1) {
                return var2[var3];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!qs", name = "b", descriptor = "(I)V")
    public static void method393(int arg0) {
        field841 = null;
        if (arg0 != 0) {
            field843 = 78;
        }
    }
}
