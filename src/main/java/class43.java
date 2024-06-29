import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class43 extends class73 {

    @OriginalMember(owner = "client!vb", name = "x", descriptor = "[S")
    public static short[] field660 = new short[] { 23, 49, 19, 21, 13, 29, 34, 16 };

    @OriginalMember(owner = "client!vb", name = "F", descriptor = "Lli;")
    public static class185 field667 = class245.method1649(",Mcran)2titre ouvert", 123);

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "Lli;")
    public static class185 field672 = class245.method1649("Lade Texturen )2 ", -66);

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "I")
    public static int field681 = 128;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public int field650;

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field651;

    @OriginalMember(owner = "client!vb", name = "p", descriptor = "I")
    public int field652;

    @OriginalMember(owner = "client!vb", name = "r", descriptor = "I")
    public static int field654;

    @OriginalMember(owner = "client!vb", name = "t", descriptor = "I")
    public static int field656;

    @OriginalMember(owner = "client!vb", name = "u", descriptor = "I")
    public int field657;

    @OriginalMember(owner = "client!vb", name = "v", descriptor = "I")
    public int field658;

    @OriginalMember(owner = "client!vb", name = "w", descriptor = "I")
    public int field659;

    @OriginalMember(owner = "client!vb", name = "y", descriptor = "I")
    public int field661;

    @OriginalMember(owner = "client!vb", name = "z", descriptor = "I")
    public static int field662;

    @OriginalMember(owner = "client!vb", name = "B", descriptor = "I")
    public int field664;

    @OriginalMember(owner = "client!vb", name = "C", descriptor = "I")
    public int field665;

    @OriginalMember(owner = "client!vb", name = "D", descriptor = "I")
    public int field666;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    public int field668;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public int field669;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
    public int field671;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    public int field673;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    public int field675;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    public int field677;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static int field678;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
    public int field679;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
    public int field680;

    @OriginalMember(owner = "client!vb", name = "A", descriptor = "Lel;")
    public class100 field663;

    @OriginalMember(owner = "client!vb", name = "q", descriptor = "Lig;")
    public class150 field653;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "Lhj;")
    public class25 field674;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "Lsa;")
    public class91 field676;

    @OriginalMember(owner = "client!vb", name = "s", descriptor = "[S")
    public static short[] field655;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(I)V")
    public static void method262(int arg0) {
        field667 = null;
        if (arg0 != 50) {
            method264(30, true, 33, 80, 56, true, false);
        }
        field655 = null;
        field660 = null;
        field672 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)I")
    public static final int method263(byte arg0) {
        field662++;
        if ((double) class169.field3129 == 3.0D) {
            return 37;
        } else if ((double) class169.field3129 == 4.0D) {
            return 50;
        } else if ((double) class169.field3129 == 6.0D) {
            return 75;
        } else {
            if (arg0 <= 104) {
                field681 = 18;
            }
            return (double) class169.field3129 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZIIIZZ)V")
    public static final void method264(int arg0, boolean arg1, int arg2, int arg3, int arg4, boolean arg5, boolean arg6) {
        if (arg0 > arg2) {
            int var7 = (arg0 + arg2) / 2;
            int var8 = arg2;
            class199 var9 = class121.field2210[var7];
            class121.field2210[var7] = class121.field2210[arg0];
            class121.field2210[arg0] = var9;
            for (int var10 = arg2; var10 < arg0; var10++) {
                if (class72.method471(arg4, arg6, class121.field2210[var10], arg5, 6255, var9, arg3) <= 0) {
                    class199 var11 = class121.field2210[var10];
                    class121.field2210[var10] = class121.field2210[var8];
                    class121.field2210[var8++] = var11;
                }
            }
            class121.field2210[arg0] = class121.field2210[var8];
            class121.field2210[var8] = var9;
            method264(var8 - 1, true, arg2, arg3, arg4, arg5, arg6);
            method264(arg0, true, var8 + 1, arg3, arg4, arg5, arg6);
        }
        if (arg1) {
            field670++;
        }
    }

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "(Z)V")
    public final void method265(boolean arg0) {
        this.field676 = null;
        if (arg0) {
            this.field661 = -102;
        }
        field656++;
        this.field674 = null;
        this.field653 = null;
        this.field663 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method266(Component arg0, boolean arg1) {
        field654++;
        arg0.removeKeyListener(class241.field4308);
        if (arg1) {
            field667 = null;
        }
        arg0.removeFocusListener(class241.field4308);
        class221.field4022 = -1;
    }
}
