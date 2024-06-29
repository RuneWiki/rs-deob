import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public abstract class class44 {

    @OriginalMember(owner = "client!e", name = "b", descriptor = "Lvd;")
    public static class222 field916 = class212.method1357("sl_flags", 10731);

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lvd;")
    public static class222 field920 = class212.method1357(": ", 10731);

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Z")
    public static boolean field922 = true;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "Lwc;")
    public static class231 field915 = new class231();

    @OriginalMember(owner = "client!e", name = "l", descriptor = "Lvd;")
    public static class222 field926 = class212.method1357("Anmelde)2Limit -Uberschritten)3", 10731);

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field925 = 0;

    @OriginalMember(owner = "client!e", name = "n", descriptor = "Z")
    public static boolean field928 = false;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field917;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field918;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field919;

    @OriginalMember(owner = "client!e", name = "g", descriptor = "I")
    public static int field921;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "I")
    public static int field923;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field924;

    @OriginalMember(owner = "client!e", name = "m", descriptor = "[Lbg;")
    public static class19[] field927;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "()I")
    public abstract int method87();

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(III)Le;")
    public class44 method329(int arg0, int arg1, int arg2) {
        field924++;
        return this;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIII)I")
    public static final int method330(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 > 243) {
            arg1 >>= 0x4;
        } else if (arg2 > 217) {
            arg1 >>= 0x3;
        } else if (arg2 > 192) {
            arg1 >>= 0x2;
        } else if (arg2 > 179) {
            arg1 >>= 0x1;
        }
        field923++;
        return arg3 > -22 ? -84 : (arg0 >> 2 << 10) + (arg1 >> 5 << 7) + (arg2 >> 1);
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "()Z")
    public boolean method331() {
        field917++;
        return false;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIJ)V")
    public abstract void method89(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8);

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method332(byte arg0) {
        field915 = null;
        field926 = null;
        if (arg0 < 98) {
            method330(97, 123, -36, 63);
        }
        field920 = null;
        field916 = null;
        field927 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(Le;IIIZ)V")
    public void method333(class44 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field919++;
    }
}
