import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public abstract class class175 {

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "Lhi;")
    public static class82 field3034 = class95.method664((byte) -86, ":allyreq:");

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "Lhi;")
    public static class82 field3036 = class95.method664((byte) -82, "welle:");

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "Lhn;")
    public static class317 field3038 = new class317(4);

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field3039;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public static int field3040;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "[I")
    public static int[] field3035;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 4)
    public static void method1252(int arg0) {
        field3036 = null;
        if (arg0 <= 66) {
            field3038 = (class317) null;
        }
        field3035 = null;
        field3038 = null;
        field3034 = null;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "()Z", line = 34)
    public boolean method234() {
        field3039++;
        return false;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lrm;IIIZ)V", line = 46)
    public void method192(class175 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field3040++;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III)Lrm;", line = 68)
    public class175 method223(int arg0, int arg1, int arg2) {
        field3037++;
        return this;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "()I")
    public abstract int method238();

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIIIIIIJILab;)V")
    public abstract void method209(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class295 arg10);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIII)V")
    public abstract void method301(int arg0, int arg1, int arg2, int arg3, int arg4);
}
