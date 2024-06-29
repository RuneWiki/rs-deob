import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class291 extends class427 {

    @OriginalMember(owner = "client!mb", name = "z", descriptor = "I")
    private int field4593;

    @OriginalMember(owner = "client!mb", name = "x", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!mb", name = "y", descriptor = "I")
    public static int field4592;

    @OriginalMember(owner = "client!mb", name = "A", descriptor = "I")
    public static int field4594;

    @OriginalMember(owner = "client!mb", name = "C", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!mb", name = "D", descriptor = "I")
    public static int field4596;

    @OriginalMember(owner = "client!mb", name = "E", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(Z)I")
    public static final int method1958(boolean arg0) {
        if (!arg0) {
            field4595 = 71;
        }
        ++field4592;
        if (class477.field7309 == null) {
            if (!class409.field6204 && ~class501.field7514 < -1) {
                if (class298.field4686 && class36.field376.method927(81, -1234) && ~class501.field7514 < -3) {
                    return ((class140) class392.field5958.field4939.field7776.field7776).field1896;
                }
                return ((class140) class392.field5958.field4939.field7776).field1896;
            }
            int var1 = class472.field7240.method2038(-49);
            int var2 = class472.field7240.method2043((byte) -68);
            int var3 = class296.field4670;
            int var4 = class521.field7715;
            int var5 = class201.field3054;
            if (~var1 < ~var3 && var3 + var5 > var1) {
                int var6 = -1;
                for (int var7 = 0; ~var7 > ~class501.field7514; ++var7) {
                    if (class377.field5794) {
                        int var11 = var4 + 33 - -((class501.field7514 - 1 - var7) * 16);
                        if (var11 + -13 < var2 && ~var2 >= ~(var11 + 3)) {
                            var6 = var7;
                        }
                    } else {
                        int var12 = var4 - -((-var7 + -1 + class501.field7514) * 16) + 31;
                        if (~(var12 + -13) > ~var2 && ~(var12 + 3) <= ~var2) {
                            var6 = var7;
                        }
                    }
                }
                if (~var6 != 0) {
                    int var8 = 0;
                    class450 var9 = new class450(class392.field5958);
                    for (class140 var10 = (class140) var9.method2835(-1); var10 != null; var10 = (class140) var9.method2836((byte) -6)) {
                        if (var8++ == var6) {
                            return var10.field1896;
                        }
                    }
                }
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)V")
    public final void method82(int arg0) {
        if (arg0 >= 16) {
            ++field4596;
        }
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(IZ)V")
    public final void method1959(int arg0, boolean arg1) {
        if (arg0 != 0) {
            this.field4593 = 32;
        }
        ++field4597;
        super.field6451.method1540(115, this);
        OpenGL.glTexParameteri(super.field6455, 10242, arg1 ? 10497 : 33071);
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(III)Z")
    public static final boolean method1960(int arg0, int arg1, int arg2) {
        if (arg2 != 81) {
            method1960(110, -18, 125);
        }
        ++field4594;
        return (arg0 & 2048) != 0 | class434.method2728(arg0, arg1, 71) || class449.method2830(-1, arg1, arg0);
    }

    @OriginalMember(owner = "client!mb", name = "<init>", descriptor = "(Lna;II[BI)V")
    public class291(class211 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field4593 = arg2;
        super.field6451.method1540(125, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field6455, 0, super.field6449, this.field4593, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method2703(0, true);
    }

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "(I)V")
    public static final void method1961(int arg0) {
        if (arg0 == -13) {
            for (int var1 = 0; ~var1 > ~class486.field7371; ++var1) {
                class17 var2 = class357.field5540[var1];
                if (~var2.field184 == -3) {
                    if (var2.field171 != null) {
                        class411.field6231.method482(var2.field171);
                    } else {
                        var2.field179 = Integer.MIN_VALUE;
                    }
                }
            }
            ++field4591;
        }
    }

    static {
        new class213("Invalid teleport!", "Unzulässiger Teleport!", "Téléportation non valide !", "Teleporte inválido!");
        new class213("Use", "Benutzen", "Utiliser", "Usar");
    }
}
