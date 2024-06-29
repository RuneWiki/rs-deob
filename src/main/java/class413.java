import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class413 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "[I")
    public static int[] field6078 = new int[4];

    @OriginalMember(owner = "client!uh", name = "j", descriptor = "I")
    public static int field6087 = 0;

    @OriginalMember(owner = "client!uh", name = "k", descriptor = "F")
    public static float field6088;

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field6079;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "I")
    public int field6080;

    @OriginalMember(owner = "client!uh", name = "f", descriptor = "I")
    public int field6083;

    @OriginalMember(owner = "client!uh", name = "g", descriptor = "I")
    public int field6084;

    @OriginalMember(owner = "client!uh", name = "h", descriptor = "I")
    public int field6085;

    @OriginalMember(owner = "client!uh", name = "i", descriptor = "I")
    public int field6086;

    @OriginalMember(owner = "client!uh", name = "l", descriptor = "I")
    public int field6089;

    @OriginalMember(owner = "client!uh", name = "m", descriptor = "I")
    public int field6090;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "[B")
    public byte[] field6081;

    @OriginalMember(owner = "client!uh", name = "e", descriptor = "[B")
    public byte[] field6082;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V", line = 4)
    public static void method2541(int arg0) {
        field6078 = null;
        if (arg0 != 0) {
            method2542(-47);
        }
    }

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "(I)Z", line = 18)
    public static final boolean method2542(int arg0) {
        field6079++;
        try {
            class398 var1 = new class398();
            byte[] var2 = var1.method2463(-61, class659.field9386);
            if (arg0 == 4) {
                class577.method3339(var2, (byte) -48);
                return true;
            } else {
                return false;
            }
        } catch (Exception var3) {
            return false;
        }
    }
}
