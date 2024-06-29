import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class533 extends class245 implements class273 {

    @OriginalMember(owner = "client!mm", name = "D", descriptor = "I")
    public static int field7472;

    @OriginalMember(owner = "client!mm", name = "E", descriptor = "I")
    public static int field7473;

    @OriginalMember(owner = "client!mm", name = "F", descriptor = "Lir;")
    public static class184 field7474;

    @OriginalMember(owner = "client!mm", name = "C", descriptor = "Lvj;")
    public static class26 field7471;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Z)V")
    public static void method3180(boolean arg0) {
        field7471 = null;
        if (!arg0) {
            field7474 = null;
        }
        field7474 = null;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IIII)Z")
    public static final boolean method3181(int arg0, int arg1, int arg2, int arg3) {
        class101.field1451.method861(arg2, arg0, arg1, class712.field10058);
        ++field7472;
        int var4 = class712.field10058[2];
        if (~var4 > -51) {
            return false;
        } else {
            class712.field10058[1] = class323.field4158 - -(class712.field10058[1] * class624.field8905 / var4);
            class712.field10058[arg3] = class712.field10058[0] * class748.field10408 / var4 + class732.field10235;
            class712.field10058[2] = var4;
            return true;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Lha;B)V")
    public static final void method3182(class545 arg0, byte arg1) {
        class714.field10131 = new class599[class586.field8431.length];
        ++field7473;
        for (int var2 = 0; var2 < class586.field8431.length; ++var2) {
            int var3 = class586.field8431[var2];
            class742 var4 = class216.method1415(class673.field9469, (byte) 77, var3);
            class400 var5 = arg0.method2085(var4, class320.method1869(class565.field8032, var3), true);
            class714.field10131[var2] = new class599(var5, var4);
        }
        if (arg1 != 99) {
            field7471 = null;
        }
    }

    @OriginalMember(owner = "client!mm", name = "<init>", descriptor = "(Lsb;IZ[[I)V")
    public class533(class93 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class4.field10, class720.field10164, arg1 * 6 * arg1, arg2);
        super.field3397.method2933((byte) 100, this);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method1557(arg1, arg1, arg3[var5], var5 + 34069, 65280);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method1554(-118), arg1, arg1, 0, class185.method1243(35, super.field3410), super.field3397.field1362, arg3[var6], 0);
            }
        }
    }
}
