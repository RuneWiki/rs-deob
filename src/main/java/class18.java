import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!saa")
public class class18 extends class493 implements class660 {

    @OriginalMember(owner = "client!saa", name = "C", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!saa", name = "D", descriptor = "I")
    public static int field277;

    @OriginalMember(owner = "client!saa", name = "E", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!saa", name = "F", descriptor = "I")
    public static int field279;

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(I)V")
    public static final void method117(int arg0) {
        class606.method3317(arg0 + -1);
        if (arg0 != 0) {
            method119(102, 125);
        }
        ++field276;
        class671.method3767((byte) 76);
    }

    @OriginalMember(owner = "client!saa", name = "a", descriptor = "(IIII)I")
    public static final int method118(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 3;
        ++field277;
        if (~var4 == -1) {
            return arg3;
        } else if (~var4 == -2) {
            return arg0;
        } else {
            int var5 = 52 / ((arg2 - 9) / 56);
            return ~var4 == -3 ? 7 - arg3 : 7 - arg0;
        }
    }

    @OriginalMember(owner = "client!saa", name = "<init>", descriptor = "(Llm;IZ[[I)V")
    public class18(class337 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class590.field8288, class117.field1509, arg1 * 6 * arg1, arg2);
        super.field6502.method2596(this, 0);
        if (arg2) {
            for (int var5 = 0; var5 < 6; ++var5) {
                this.method2652(arg1, (byte) -124, var5 + 34069, arg3[var5], arg1);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method2658(26701), arg1, arg1, 0, class488.method2639(6407, super.field6513), super.field6502.field4373, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!saa", name = "b", descriptor = "(II)Ltda;")
    public static final class16 method119(int arg0, int arg1) {
        ++field278;
        if (arg0 != 34067) {
            return null;
        } else {
            class16[] var2 = class204.method1231(false);
            for (int var3 = 0; var2.length > var3; ++var3) {
                class16 var4 = var2[var3];
                if (var4.field262 == arg1) {
                    return var4;
                }
            }
            return null;
        }
    }
}
