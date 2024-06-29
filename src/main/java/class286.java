import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class286 extends class271 {

    @OriginalMember(owner = "client!e", name = "s", descriptor = "I")
    private int field4288;

    @OriginalMember(owner = "client!e", name = "u", descriptor = "I")
    public static int field4290 = 100;

    @OriginalMember(owner = "client!e", name = "v", descriptor = "I")
    public static int field4291 = 0;

    @OriginalMember(owner = "client!e", name = "r", descriptor = "I")
    public static int field4287;

    @OriginalMember(owner = "client!e", name = "t", descriptor = "I")
    public static int field4289;

    @OriginalMember(owner = "client!e", name = "w", descriptor = "I")
    public static int field4292;

    @OriginalMember(owner = "client!e", name = "x", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!e", name = "z", descriptor = "I")
    public static int field4295;

    @OriginalMember(owner = "client!e", name = "y", descriptor = "Ltv;")
    public static class294 field4294;

    @OriginalMember(owner = "client!e", name = "A", descriptor = "[Ll;")
    public static class127[] field4296;

    static {
        new class347("You have left the channel.", "Du hast den Chatraum verlassen.", "Vous avez quitté le canal.", "Você saiu do canal.");
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "(Lvd;II[BI)V", line = 7)
    public class286(class258 arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        super(arg0, 3552, arg1, arg2, false);
        this.field4288 = arg2;
        super.field4047.method1546(-2, this);
        OpenGL.glPixelStorei(3317, 1);
        OpenGL.glTexImage1Dub(super.field4033, 0, super.field4044, this.field4288, 0, arg4, 5121, arg3, 0);
        OpenGL.glPixelStorei(3317, 4);
        this.method1693(true, (byte) -96);
    }

    @OriginalMember(owner = "client!e", name = "f", descriptor = "(I)V", line = 22)
    public static void method1771(int arg0) {
        if (arg0 > -61) {
            method1774((byte[]) null, 1);
        }
        field4296 = null;
        field4294 = null;
    }

    @OriginalMember(owner = "client!e", name = "g", descriptor = "(I)V", line = 33)
    public static final void method1772(int arg0) {
        class521[] var1 = class181.field2674;
        synchronized (class181.field2674) {
            if (arg0 != 100) {
                return;
            }
            int var2 = 0;
            while (true) {
                if (~class181.field2674.length >= ~var2) {
                    break;
                }
                class181.field2674[var2] = new class521();
                class514.field7519[var2] = 0;
                ++var2;
            }
        }
        ++field4289;
    }

    @OriginalMember(owner = "client!e", name = "b", descriptor = "(II)I", line = 58)
    public static int method1773(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 66)
    public final void method737(int arg0) {
        ++field4292;
        if (arg0 != 6407) {
            method1772(53);
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "([BI)[B", line = 77)
    public static final byte[] method1774(byte[] arg0, int arg1) {
        if (arg1 != -8090) {
            return null;
        } else {
            ++field4295;
            if (arg0 == null) {
                return null;
            } else {
                byte[] var2 = new byte[arg0.length];
                class442.method2590(arg0, 0, var2, 0, arg0.length);
                return var2;
            }
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(ZI)V", line = 103)
    public final void method1775(boolean arg0, int arg1) {
        ++field4287;
        super.field4047.method1546(-2, this);
        if (arg1 > 5) {
            OpenGL.glTexParameteri(super.field4033, 10242, arg0 ? 10497 : 33071);
        }
    }
}
