import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public abstract class class17 extends class137 {

    @OriginalMember(owner = "client!rh", name = "K", descriptor = "Z")
    public volatile boolean field205 = true;

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "Lpj;")
    public static class104 field206 = new class104();

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "[I")
    public static int[] field207 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "Ljava/lang/String;")
    public static String field209 = " is already on your friend list.";

    @OriginalMember(owner = "client!rh", name = "H", descriptor = "I")
    public static int field202;

    @OriginalMember(owner = "client!rh", name = "J", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!rh", name = "G", descriptor = "Z")
    public boolean field201;

    @OriginalMember(owner = "client!rh", name = "I", descriptor = "Z")
    public boolean field203;

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "[Lad;")
    public static class5[] field208;

    @OriginalMember(owner = "client!rh", name = "i", descriptor = "(I)V")
    public static void method86(int arg0) {
        if (arg0 == 15013) {
            field209 = null;
            field206 = null;
            field208 = null;
            field207 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "j", descriptor = "(I)[B")
    public abstract byte[] method66(int arg0);

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(B)I")
    public abstract int method68(byte arg0);

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)Lag;")
    public static final class211 method87(int arg0, int arg1) {
        if (arg1 != -20055) {
            return null;
        }
        field202++;
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class34.field519[var2] == null || class34.field519[var2][var3] == null) {
            boolean var4 = class67.method473(var2, (byte) 109);
            if (!var4) {
                return null;
            }
        }
        return class34.field519[var2][var3];
    }
}
