import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class269 extends class200 {

    @OriginalMember(owner = "client!rb", name = "J", descriptor = "I")
    public static int field4724 = -1;

    @OriginalMember(owner = "client!rb", name = "M", descriptor = "Loa;")
    public static class99 field4726 = class221.method1463(2844, "Fermer");

    @OriginalMember(owner = "client!rb", name = "U", descriptor = "I")
    public static int field4733 = 0;

    @OriginalMember(owner = "client!rb", name = "Q", descriptor = "Loa;")
    public static class99 field4729 = class221.method1463(2844, "Memory after cleanup=");

    @OriginalMember(owner = "client!rb", name = "O", descriptor = "I")
    public static int field4727 = 1;

    @OriginalMember(owner = "client!rb", name = "W", descriptor = "[I")
    public static int[] field4735 = new int[200];

    @OriginalMember(owner = "client!rb", name = "X", descriptor = "Loa;")
    public static class99 field4736 = class221.method1463(2844, "Chargement de RuneScape en cours )2 veuillez patienter)3)3)3");

    @OriginalMember(owner = "client!rb", name = "G", descriptor = "I")
    public int field4721;

    @OriginalMember(owner = "client!rb", name = "H", descriptor = "I")
    public static int field4722;

    @OriginalMember(owner = "client!rb", name = "L", descriptor = "I")
    public int field4725;

    @OriginalMember(owner = "client!rb", name = "P", descriptor = "I")
    public int field4728;

    @OriginalMember(owner = "client!rb", name = "S", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!rb", name = "Y", descriptor = "I")
    public int field4737;

    @OriginalMember(owner = "client!rb", name = "T", descriptor = "Ltg;")
    public static class182 field4732;

    @OriginalMember(owner = "client!rb", name = "R", descriptor = "Loa;")
    public class99 field4730;

    @OriginalMember(owner = "client!rb", name = "I", descriptor = "[I")
    public int[] field4723;

    @OriginalMember(owner = "client!rb", name = "Z", descriptor = "[I")
    public int[] field4738;

    @OriginalMember(owner = "client!rb", name = "ab", descriptor = "[Lbg;")
    public class237[] field4739;

    @OriginalMember(owner = "client!rb", name = "V", descriptor = "[Loa;")
    public class99[] field4734;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "(I)V")
    public static void method1777(int arg0) {
        if (arg0 >= -21) {
            field4733 = -62;
        }
        field4726 = null;
        field4732 = null;
        field4735 = null;
        field4736 = null;
        field4729 = null;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II)I")
    public static final int method1778(int arg0, int arg1) {
        if (arg1 != -28112) {
            field4729 = null;
        }
        field4731++;
        return arg0 & 0x3FF;
    }
}
