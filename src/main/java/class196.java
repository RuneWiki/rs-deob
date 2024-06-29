import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vn")
public class class196 extends class257 {

    @OriginalMember(owner = "client!vn", name = "G", descriptor = "Loe;")
    public static class127 field3092 = new class127(31, 8);

    @OriginalMember(owner = "client!vn", name = "M", descriptor = "Lbg;")
    public static class310 field3097 = new class310(61, 2);

    @OriginalMember(owner = "client!vn", name = "N", descriptor = "Lsk;")
    public static class423 field3098 = new class423("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!vn", name = "D", descriptor = "I")
    public static int field3089;

    @OriginalMember(owner = "client!vn", name = "E", descriptor = "I")
    public static int field3090;

    @OriginalMember(owner = "client!vn", name = "I", descriptor = "I")
    public int field3094;

    @OriginalMember(owner = "client!vn", name = "K", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!vn", name = "L", descriptor = "I")
    public static int field3096;

    @OriginalMember(owner = "client!vn", name = "F", descriptor = "Lap;")
    public class319 field3091;

    @OriginalMember(owner = "client!vn", name = "H", descriptor = "[B")
    public byte[] field3093;

    @OriginalMember(owner = "client!vn", name = "b", descriptor = "(Z)V")
    public static void method1220(boolean arg0) {
        field3097 = null;
        if (arg0) {
            field3092 = null;
        }
        field3092 = null;
        field3098 = null;
    }

    @OriginalMember(owner = "client!vn", name = "a", descriptor = "(II)Lvh;")
    public static final class232 method1221(int arg0, int arg1) {
        ++field3090;
        class232[] var2 = class413.method2434(arg0 ^ -7510);
        for (int var3 = 0; ~var2.length < ~var3; ++var3) {
            class232 var4 = var2[var3];
            if (var4.field3517 == arg1) {
                return var4;
            }
        }
        return arg0 != 2 ? null : null;
    }

    @OriginalMember(owner = "client!vn", name = "g", descriptor = "(I)[B")
    public final byte[] method1005(int arg0) {
        ++field3089;
        if (arg0 <= 76) {
            return null;
        } else if (super.field3923) {
            throw new RuntimeException();
        } else {
            return this.field3093;
        }
    }

    @OriginalMember(owner = "client!vn", name = "h", descriptor = "(I)I")
    public final int method1009(int arg0) {
        if (arg0 >= -21) {
            field3092 = null;
        }
        ++field3095;
        return super.field3923 ? 0 : 100;
    }
}
