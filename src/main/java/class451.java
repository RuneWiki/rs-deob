import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!li")
public class class451 extends class88 implements class165 {

    @OriginalMember(owner = "client!li", name = "z", descriptor = "Ljb;")
    public static class519 field6472 = new class519(56, 3);

    @OriginalMember(owner = "client!li", name = "A", descriptor = "I")
    public static int field6473 = -1;

    @OriginalMember(owner = "client!li", name = "w", descriptor = "I")
    public static int field6469;

    @OriginalMember(owner = "client!li", name = "y", descriptor = "I")
    public static int field6471;

    @OriginalMember(owner = "client!li", name = "x", descriptor = "Lec;")
    public static class248 field6470;

    @OriginalMember(owner = "client!li", name = "a", descriptor = "(IBII)I")
    public static final int method2680(int arg0, byte arg1, int arg2, int arg3) {
        if (arg1 >= -78) {
            field6470 = null;
        }
        int var4 = arg2 & 3;
        ++field6471;
        if (var4 == 0) {
            return arg3;
        } else if (var4 == 1) {
            return 4095 - arg0;
        } else {
            return ~var4 == -3 ? 4095 - arg3 : arg0;
        }
    }

    @OriginalMember(owner = "client!li", name = "b", descriptor = "(II)V")
    public static final void method2681(int arg0, int arg1) {
        ++field6469;
        if (class422.method2542(-105, arg1)) {
            class329.method2135(-1, (byte) 41, class419.field6032[arg1]);
            if (arg0 != -8163) {
                field6472 = null;
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "<init>", descriptor = "(Lsha;IZ[[I)V")
    public class451(class757 arg0, int arg1, boolean arg2, int[][] arg3) {
        super(arg0, 34067, class109.field1521, class415.field5986, arg1 * arg1 * 6, arg2);
        super.field1258.method3882(0, this);
        if (arg2) {
            for (int var5 = 0; ~var5 > -7; ++var5) {
                this.method703(arg1, arg3[var5], (byte) -108, arg1, var5 + 34069);
            }
        } else {
            for (int var6 = 0; ~var6 > -7; ++var6) {
                OpenGL.glTexImage2Di(var6 + 34069, 0, this.method711(-114), arg1, arg1, 0, class350.method2238((byte) 79, super.field1249), super.field1258.field10336, arg3[var6], 0);
            }
        }
    }

    @OriginalMember(owner = "client!li", name = "e", descriptor = "(B)V")
    public static void method2682(byte arg0) {
        field6472 = null;
        if (arg0 > -10) {
            field6472 = null;
        }
        field6470 = null;
    }
}
