import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dc")
public class class32 {

    @OriginalMember(owner = "client!dc", name = "b", descriptor = "I")
    public int field671 = -1;

    @OriginalMember(owner = "client!dc", name = "c", descriptor = "Lsg;")
    private static class169 field672 = class165.method1060("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789(Q(R+R(T(U^(V(Z(X(Y)2_=)0[*U]*W;:(W@(S*X)1<)3>)4?*6*V ", 1536);

    @OriginalMember(owner = "client!dc", name = "j", descriptor = "I")
    public static int field679 = 0;

    @OriginalMember(owner = "client!dc", name = "g", descriptor = "I")
    public static int field676 = 127;

    @OriginalMember(owner = "client!dc", name = "h", descriptor = "Lsg;")
    public static class169 field677 = class165.method1060("und haben es deaktiviert)3 Klicken Sie auf der", 1536);

    @OriginalMember(owner = "client!dc", name = "o", descriptor = "I")
    public static int field684 = 0;

    @OriginalMember(owner = "client!dc", name = "l", descriptor = "Lsg;")
    public static class169 field681 = class165.method1060("W-=hlen Sie eine Welt", 1536);

    @OriginalMember(owner = "client!dc", name = "p", descriptor = "Lsg;")
    public static class169 field685 = field672;

    @OriginalMember(owner = "client!dc", name = "m", descriptor = "Lsg;")
    public static class169 field682 = class165.method1060("::fpsoff", 1536);

    @OriginalMember(owner = "client!dc", name = "r", descriptor = "I")
    public static int field687 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!dc", name = "q", descriptor = "[Z")
    public static boolean[] field686 = new boolean[5];

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!dc", name = "f", descriptor = "I")
    public static int field675;

    @OriginalMember(owner = "client!dc", name = "i", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!dc", name = "n", descriptor = "I")
    public static int field683;

    @OriginalMember(owner = "client!dc", name = "k", descriptor = "Lah;")
    public class9 field680;

    @OriginalMember(owner = "client!dc", name = "e", descriptor = "[I")
    public int[] field674;

    @OriginalMember(owner = "client!dc", name = "d", descriptor = "[Lsg;")
    public class169[] field673;

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(IIIILoa;III)V")
    public static final void method221(int arg0, int arg1, int arg2, int arg3, class127 arg4, int arg5, int arg6, int arg7) {
        if (arg0 >= 0 && arg0 < 104 && arg3 >= 0 && arg3 < 104) {
            class159.field3040[arg2][arg0][arg3] = 0;
            while (true) {
                int var8 = arg4.method819((byte) 22);
                if (var8 == 0) {
                    if (arg2 == 0) {
                        class139.field2588[0][arg0][arg3] = -class86.method515(arg0 + arg7 + 932731, false, arg6 + arg3 + 556238) * 8;
                    } else {
                        class139.field2588[arg2][arg0][arg3] = class139.field2588[arg2 - 1][arg0][arg3] - 240;
                    }
                    break;
                }
                if (var8 == 1) {
                    int var9 = arg4.method819((byte) 22);
                    if (var9 == 1) {
                        var9 = 0;
                    }
                    if (arg2 == 0) {
                        class139.field2588[0][arg0][arg3] = -var9 * 8;
                    } else {
                        class139.field2588[arg2][arg0][arg3] = class139.field2588[arg2 - 1][arg0][arg3] - var9 * 8;
                    }
                    break;
                }
                if (var8 <= 49) {
                    class147.field2704[arg2][arg0][arg3] = arg4.method824((byte) -85);
                    client.field587[arg2][arg0][arg3] = (byte) ((var8 - 2) / 4);
                    class116.field2149[arg2][arg0][arg3] = (byte) class150.method984(var8 + arg5 - 2, 3);
                } else if (var8 <= 81) {
                    class159.field3040[arg2][arg0][arg3] = (byte) (var8 - 49);
                } else {
                    class167.field3185[arg2][arg0][arg3] = (byte) (var8 - 81);
                }
            }
        } else {
            while (true) {
                int var10 = arg4.method819((byte) 22);
                if (var10 == 0) {
                    break;
                }
                if (var10 == 1) {
                    arg4.method819((byte) 22);
                    break;
                }
                if (var10 <= 49) {
                    arg4.method819((byte) 22);
                }
            }
        }
        if (arg1 <= 110) {
            method222(null, (byte) -66, true, null, null);
        }
        field678++;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(Lke;BZLke;Lhg;)V")
    public static final void method222(class95 arg0, byte arg1, boolean arg2, class95 arg3, class71 arg4) {
        if (arg1 >= -55) {
            return;
        }
        field683++;
        class189.field3692 = arg0;
        class51.field893 = arg3;
        class22.field460 = arg2;
        class121.field2233 = class189.field3692.method570((byte) 113, 10);
        class131.field2430 = arg4;
    }

    @OriginalMember(owner = "client!dc", name = "a", descriptor = "(I)V")
    public static void method223(int arg0) {
        field685 = null;
        field681 = null;
        field682 = null;
        field672 = null;
        field686 = null;
        if (arg0 == 932731) {
            field677 = null;
        }
    }
}
