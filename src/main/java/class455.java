import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class455 extends class35 implements class295 {

    @OriginalMember(owner = "client!fm", name = "w", descriptor = "[[Z")
    public static boolean[][] field6627 = new boolean[][] { new boolean[13], { false, false, true, true, true, true, true, false, false, false, false, false, true }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { false, true, true, true, true, true, false, false, false, false, false, false, true }, { false, true, true, true, true, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, false, true, true, true, true, true, true, false, false, true, true, false }, { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true } };

    @OriginalMember(owner = "client!fm", name = "x", descriptor = "[I")
    public static int[] field6628 = null;

    @OriginalMember(owner = "client!fm", name = "y", descriptor = "I")
    public static int field6629;

    @OriginalMember(owner = "client!fm", name = "z", descriptor = "I")
    public static int field6630;

    @OriginalMember(owner = "client!fm", name = "B", descriptor = "I")
    public static int field6631;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(BLei;)V")
    public static final void method2790(byte arg0, class180 arg1) {
        ++field6629;
        boolean var2 = false;
        arg1.method1507(1);
        class180 var3 = (class180) class26.field263.method3772(true);
        if (arg0 == 5) {
            while (var3 != null) {
                if (class37.method211(var3.method1393((byte) 120), -62, arg1.method1393((byte) 69))) {
                    class272.method1788(var3, false, arg1);
                    var2 = true;
                    break;
                }
                var3 = (class180) class26.field263.method3780(23774);
            }
            if (!var2) {
                class26.field263.method3779(-14068, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(B)V")
    public static void method2791(byte arg0) {
        field6628 = null;
        if (arg0 <= 116) {
            field6627 = null;
        }
        field6627 = null;
    }

    @OriginalMember(owner = "client!fm", name = "<init>", descriptor = "(Lom;IZ[[I)V")
    public class455(class642 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class238.field3830, class121.field1859, arg1 * arg1 * 6, arg2);
        super.field326.method215(8, this);
        if (arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                this.method199(85, arg3[var5], arg1, arg1, 34069 - -var5);
            }
        } else {
            for (int var6 = 0; var6 < 6; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method203(119), arg1, arg1, 0, class329.method2125(super.field321, 6046), super.field326.field9175, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(ILofa;B)V")
    public static final void method2792(int arg0, class301 arg1, byte arg2) {
        if (class452.field6575 != null) {
            try {
                class452.field6575.method3545(0L, (byte) 70);
                class452.field6575.method3544(24, 3589, arg0, arg1.field4543);
            } catch (Exception var3) {
            }
        }
        if (arg2 != 63) {
            method2790((byte) -44, (class180) null);
        }
        ++field6631;
    }

    @OriginalMember(owner = "client!fm", name = "b", descriptor = "(II)Z")
    public static final boolean method2793(int arg0, int arg1) {
        ++field6630;
        if (arg0 != 0) {
            method2791((byte) 84);
        }
        return arg1 == 46 || ~arg1 == -11 || arg1 == 1001 || arg1 == 8 || ~arg1 == -4;
    }
}
