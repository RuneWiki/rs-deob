import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class35 {

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "I")
    public int field749 = 0;

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "I")
    public int field759 = 0;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "Lvc;")
    public static class137 field752 = class45.method325("Wen m-Ochten Sie von der Liste entfernen?", -46);

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Lvc;")
    public static class137 field743 = class45.method325(" )2> @whi@", -46);

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lvc;")
    public static class137 field744 = class45.method325("Benutzername: ", -46);

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "Lvc;")
    public static class137 field758 = class45.method325("Keine Antwort vom Anmelde)2Server)3", -46);

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "Lvc;")
    private static class137 field753 = class45.method325("Sorry invited players only)3", -46);

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field746 = 0;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Lvc;")
    public static class137 field748 = field753;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "Lvc;")
    private static class137 field740 = class45.method325("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", -46);

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Lvc;")
    public static class137 field747 = field740;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public int field739;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public int field745;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field751;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public int field755;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "I")
    public int field757;

    @OriginalMember(owner = "client!ef", name = "v", descriptor = "I")
    public int field760;

    @OriginalMember(owner = "client!ef", name = "w", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Lpe;")
    public class103 field750;

    @OriginalMember(owner = "client!ef", name = "x", descriptor = "Lpe;")
    public class103 field762;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Lnb;")
    public static class88 field742;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z)V")
    public static void method251(boolean arg0) {
        field743 = null;
        field742 = null;
        field758 = null;
        if (arg0) {
            method251(false);
        }
        field752 = null;
        field753 = null;
        field744 = null;
        field740 = null;
        field747 = null;
        field748 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static final void method252(int arg0) {
        class68.field1416 = arg0;
        class56.field1193 = 0;
        class103.method753((byte) 14);
        field741++;
        class36.method257(-107);
        class77.method574(5997);
        class58.method401(false);
        for (int var1 = 0; var1 < class56.field1193; var1++) {
            int var3 = class33.field709[var1];
            if (class112.field2667 != class102.field2358[var3].field1667) {
                class102.field2358[var3] = null;
            }
        }
        if (class68.field1399 != class103.field2391.field2583) {
            throw new RuntimeException("gpp1 pos:" + class103.field2391.field2583 + " psize:" + class68.field1399);
        }
        for (int var2 = 0; var2 < class44.field973; var2++) {
            if (class102.field2358[class139.field3237[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class44.field973);
            }
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(III)I")
    public static final int method253(int arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            return -106;
        }
        class82 var3 = (class82) class84.field1899.method867((long) arg0, false);
        field761++;
        if (var3 == null) {
            return 0;
        } else if (arg2 >= 0 && arg2 < var3.field1847.length) {
            return var3.field1847[arg2];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Z[B)[B")
    public static final byte[] method254(boolean arg0, byte[] arg1) {
        field754++;
        int var2 = arg1.length;
        if (arg0) {
            field740 = null;
        }
        byte[] var3 = new byte[var2];
        class130.method962(arg1, 0, var3, 0, var2);
        return var3;
    }
}
