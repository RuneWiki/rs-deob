import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rda")
public class class616 extends class425 {

    @OriginalMember(owner = "client!rda", name = "o", descriptor = "I")
    public int field8947 = 0;

    @OriginalMember(owner = "client!rda", name = "s", descriptor = "I")
    public int field8951 = -1;

    @OriginalMember(owner = "client!rda", name = "j", descriptor = "I")
    public int field8942;

    @OriginalMember(owner = "client!rda", name = "k", descriptor = "I")
    public static int field8943;

    @OriginalMember(owner = "client!rda", name = "l", descriptor = "I")
    public int field8944;

    @OriginalMember(owner = "client!rda", name = "n", descriptor = "I")
    public int field8946;

    @OriginalMember(owner = "client!rda", name = "p", descriptor = "I")
    public int field8948;

    @OriginalMember(owner = "client!rda", name = "q", descriptor = "I")
    public int field8949;

    @OriginalMember(owner = "client!rda", name = "r", descriptor = "I")
    public int field8950;

    @OriginalMember(owner = "client!rda", name = "t", descriptor = "I")
    public int field8952;

    @OriginalMember(owner = "client!rda", name = "u", descriptor = "I")
    public int field8953;

    @OriginalMember(owner = "client!rda", name = "v", descriptor = "I")
    public int field8954;

    @OriginalMember(owner = "client!rda", name = "w", descriptor = "I")
    public int field8955;

    @OriginalMember(owner = "client!rda", name = "m", descriptor = "Ljs;")
    public static class304 field8945;

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(III)Z")
    public static final boolean method3533(int arg0, int arg1, int arg2) {
        field8943++;
        if (arg2 == 458752) {
            return (arg1 & 0x70000) != 0 | class478.method2905(-7484, arg1, arg0) || class637.method3635(arg0, arg1, (byte) 72);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rda", name = "a", descriptor = "(I)V")
    public static void method3534(int arg0) {
        field8945 = null;
        if (arg0 != 0) {
            method3534(-2);
        }
    }
}
