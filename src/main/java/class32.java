import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class32 {

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "Lv;")
    public static class122 field770 = class55.method425(-72, "backbase1");

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "[I")
    public static int[] field783 = new int[] { 1, 0, -1, 0 };

    @OriginalMember(owner = "client!fa", name = "h", descriptor = "Lv;")
    public static class122 field777 = class55.method425(-61, "Wen m\u001c1chten Sie hinzuf\u001c1gen?");

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field784 = 0;

    @OriginalMember(owner = "client!fa", name = "f", descriptor = "Lv;")
    private static class122 field775 = class55.method425(-54, "Add friend");

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "Lv;")
    public static class122 field785 = class55.method425(-118, "Die Verbindung konnte");

    @OriginalMember(owner = "client!fa", name = "j", descriptor = "Lv;")
    public static class122 field779 = field775;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "Lv;")
    public static class122 field786 = class55.method425(-77, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Lv;")
    public static class122 field789 = class55.method425(-114, "Fertigkeit)2");

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Lv;")
    public static class122 field794 = class55.method425(-52, "Diese Welt ist voll)3");

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "Lv;")
    public static class122 field787 = class55.method425(-109, "nicht hergestellt werden)3");

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "I")
    public int field772;

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!fa", name = "e", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!fa", name = "g", descriptor = "I")
    public int field776;

    @OriginalMember(owner = "client!fa", name = "i", descriptor = "I")
    public static int field778;

    @OriginalMember(owner = "client!fa", name = "k", descriptor = "I")
    public int field780;

    @OriginalMember(owner = "client!fa", name = "l", descriptor = "I")
    public static int field781;

    @OriginalMember(owner = "client!fa", name = "m", descriptor = "I")
    public int field782;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field790;

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "I")
    public int field793;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "Lrc;")
    public static class105 field791;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "Lk;")
    public class60 field788;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "Ljava/awt/Image;")
    public static Image field792;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(I)V", line = 4)
    public static void method288(int arg0) {
        field786 = null;
        field775 = null;
        field779 = null;
        field787 = null;
        field792 = null;
        field770 = null;
        if (arg0 != 0) {
            method288(113);
        }
        field777 = null;
        field789 = null;
        field783 = null;
        field791 = null;
        field794 = null;
        field785 = null;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(II)V", line = 30)
    public static final void method289(int arg0, int arg1) {
        field781++;
        if (!class45.method377((byte) 32, arg0)) {
            return;
        }
        class36[] var2 = class76.field2039[arg0];
        for (int var3 = arg1; var3 < var2.length; var3++) {
            class36 var4 = var2[var3];
            if (var4 != null) {
                var4.field876 = 0;
                var4.field958 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(II)I", line = 60)
    public static int method290(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(B)V", line = 105)
    public static final void method291(byte arg0) {
        class118.field2848 = new class34();
        field771++;
        if (arg0 != 42) {
            method288(-3);
        }
    }
}
