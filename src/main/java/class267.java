import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ha")
public class class267 {

    @OriginalMember(owner = "client!ha", name = "c", descriptor = "Z")
    public static boolean field4789 = false;

    @OriginalMember(owner = "client!ha", name = "d", descriptor = "Llc;")
    public static class143 field4790 = class66.method374("Sprites charg-Bs", -1);

    @OriginalMember(owner = "client!ha", name = "h", descriptor = "Llc;")
    public static class143 field4794 = class66.method374("Monde de jeu cr-B-B", -1);

    @OriginalMember(owner = "client!ha", name = "g", descriptor = "I")
    public static int field4793 = 0;

    @OriginalMember(owner = "client!ha", name = "j", descriptor = "[I")
    public static int[] field4796 = new int[5];

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "I")
    public static int field4787;

    @OriginalMember(owner = "client!ha", name = "b", descriptor = "I")
    public static int field4788;

    @OriginalMember(owner = "client!ha", name = "e", descriptor = "I")
    public static int field4791;

    @OriginalMember(owner = "client!ha", name = "f", descriptor = "I")
    public static int field4792;

    @OriginalMember(owner = "client!ha", name = "i", descriptor = "I")
    public static int field4795;

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(ZIILi;)V")
    public static final void method1774(boolean arg0, int arg1, int arg2, class187 arg3) {
        field4788++;
        if (!arg0) {
            field4794 = null;
        }
        if (arg3.field4131 == arg2 && arg2 != -1) {
            class104 var4 = class164.method1081(arg2, -21331);
            int var5 = var4.field1842;
            if (var5 == 1) {
                arg3.field4166 = 0;
                arg3.field4156 = arg1;
                arg3.field4109 = 0;
                arg3.field4153 = 0;
                class274.method1805(var4, arg3.field4153, arg3.field4108, arg3.field4178, false, (byte) -66);
            }
            if (var5 == 2) {
                arg3.field4109 = 0;
            }
        } else if (arg2 == -1 || arg3.field4131 == -1 || class164.method1081(arg2, -21331).field1845 >= class164.method1081(arg3.field4131, -21331).field1845) {
            arg3.field4156 = arg1;
            arg3.field4138 = arg3.field4145;
            arg3.field4153 = 0;
            arg3.field4109 = 0;
            arg3.field4166 = 0;
            arg3.field4131 = arg2;
            if (arg3.field4131 == -1) {
                return;
            }
            class274.method1805(class164.method1081(arg3.field4131, -21331), arg3.field4153, arg3.field4108, arg3.field4178, false, (byte) -66);
        }
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(I)V")
    public static void method1775(int arg0) {
        field4796 = null;
        if (arg0 != -14421) {
            method1774(false, 124, -11, (class187) null);
        }
        field4790 = null;
        field4794 = null;
    }

    @OriginalMember(owner = "client!ha", name = "a", descriptor = "(B)V")
    public static final void method1776(byte arg0) {
        field4795++;
        if (arg0 <= 69) {
            method1775(-21);
        }
        class287.field5030.method824(-123);
        class4.field61.method824(-122);
    }
}
