import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class335 extends class364 implements class106 {

    @OriginalMember(owner = "client!um", name = "C", descriptor = "Lnt;")
    public class134 field4867;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "Z")
    private boolean field4875;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "[I")
    public static int[] field4868 = new int[4096];

    @OriginalMember(owner = "client!um", name = "L", descriptor = "[Ljava/awt/Color;")
    public static Color[] field4876;

    @OriginalMember(owner = "client!um", name = "M", descriptor = "Z")
    public static boolean field4877;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "I")
    public static int field4860;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field4861;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field4862;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "I")
    public static int field4863;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "I")
    public static int field4864;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    public static int field4865;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    public static int field4866;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    public static int field4869;

    @OriginalMember(owner = "client!um", name = "F", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!um", name = "G", descriptor = "I")
    public static int field4871;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    public static int field4872;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public static int field4873;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public static int field4874;

    @OriginalMember(owner = "client!um", name = "i", descriptor = "(I)V")
    public static final void method2116(int arg0) {
        class359.field5161 = -1;
        ++field4861;
        if (arg0 != -27436) {
            method2116(73);
        }
        class118.field1493 = -1;
        class54.field729 = 0;
    }

    @OriginalMember(owner = "client!um", name = "c", descriptor = "(I)I")
    public final int method104(int arg0) {
        ++field4869;
        if (arg0 != 31249) {
            this.method120(-66, (class313) null);
        }
        return this.field4867.field1755;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(I)V")
    public final void method111(int arg0) {
        if (arg0 >= 56) {
            ++field4864;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ILnp;)V")
    public final void method109(int arg0, class313 arg1) {
        if (arg0 > -126) {
            field4868 = null;
        }
        this.field4867.method847((byte) -33, arg1);
        ++field4873;
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(ILnp;)Lql;")
    public final class477 method120(int arg0, class313 arg1) {
        if (arg0 != 0) {
            return null;
        } else {
            ++field4870;
            class491 var3 = this.field4867.method848(super.field5244, false, arg1, arg0 + 10, true, super.field5243, 1024);
            if (var3 == null) {
                return null;
            } else {
                class282 var4 = arg1.method601();
                var4.method1019(super.field5244 + super.field5240, super.field5237, super.field5243 + super.field5235);
                class477 var5 = null;
                if (this.field4875) {
                    var5 = class96.method543(1, (byte) 71);
                }
                if (this.field4867.field1774 == null) {
                    var3.method1323(var4, var5 != null ? var5.field6696[0] : null, 0);
                } else {
                    class207 var6 = this.field4867.field1774.method552();
                    arg1.method646(var3, var6, var4, var5 != null ? var5.field6696[0] : null, 0);
                }
                this.field4867.method845(true, super.field5244 >> 7, super.field5243 >> 7, arg1, super.field5244 >> 7, -125, var3, super.field5243 >> 7);
                return var5;
            }
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(I)I")
    public final int method106(int arg0) {
        ++field4871;
        return arg0 != 12181 ? -104 : this.field4867.field1770;
    }

    @OriginalMember(owner = "client!um", name = "j", descriptor = "(I)V")
    public static void method2117(int arg0) {
        field4868 = null;
        if (arg0 == 20768) {
            field4876 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)I")
    public final int method119(byte arg0) {
        if (arg0 < 13) {
            this.field4875 = false;
        }
        ++field4863;
        return this.field4867.field1763;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lnp;BI)Lf;")
    public final class491 method115(class313 arg0, byte arg1, int arg2) {
        if (arg1 <= 70) {
            return null;
        } else {
            ++field4860;
            return this.field4867.method848(0, false, arg0, 10, false, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!um", name = "h", descriptor = "(I)I")
    public final int method105(int arg0) {
        if (arg0 > -86) {
            method2117(-4);
        }
        ++field4865;
        return this.field4867.method850((byte) 103);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IIILnp;)Z")
    public final boolean method113(int arg0, int arg1, int arg2, class313 arg3) {
        ++field4866;
        if (arg1 <= 16) {
            this.method116((byte) -15);
        }
        class491 var5 = this.field4867.method848(super.field5244, false, arg3, 10, false, super.field5243, 65536);
        if (var5 == null) {
            return false;
        } else {
            class282 var6 = arg3.method601();
            var6.method1019(super.field5244 + super.field5240, super.field5237, super.field5243 + super.field5235);
            return var5.method1339(arg0, arg2, var6, false);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lnp;B)V")
    public final void method103(class313 arg0, byte arg1) {
        ++field4872;
        class491 var3 = this.field4867.method848(super.field5244, false, arg0, 10, true, super.field5243, 131072);
        if (arg1 >= -95) {
            field4877 = true;
        }
        if (var3 != null) {
            this.field4867.method845(false, super.field5244 >> 7, super.field5243 >> 7, arg0, super.field5244 >> 7, -125, var3, super.field5243 >> 7);
        }
    }

    @OriginalMember(owner = "client!um", name = "b", descriptor = "(B)Z")
    public final boolean method116(byte arg0) {
        if (arg0 >= -40) {
            return true;
        } else {
            ++field4874;
            return this.field4867.method843((byte) 76);
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Lnp;I)V")
    public final void method114(class313 arg0, int arg1) {
        if (arg1 != -26920) {
            method2116(-113);
        }
        this.field4867.method846(arg0, -123);
        ++field4862;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(Lnp;Ldq;IIIIIZIIIIII)V")
    public class335(class313 arg0, class453 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        super(arg4, arg5, arg6, arg8, arg9, arg10, class150.method945((byte) -37, arg12, arg11));
        this.field4867 = new class134(arg0, arg1, arg11, arg12, arg2, arg3, arg4, arg6, arg7, arg13);
        this.field4875 = ~arg1.field6366 != -1 && !arg7;
    }

    static {
        new class326("To talk, start each line of chat with the / symbol.", "Leite eine Zeile mit / ein, um hier zu chatten.", "Pour parler, insérez le symbole / au début de chaque ligne.", "Para falar, comece cada linha de conversa com o símbolo /.");
        field4876 = new Color[] { new Color(9179409), new Color(16777215) };
        field4877 = false;
    }
}
