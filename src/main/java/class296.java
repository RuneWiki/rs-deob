import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class296 extends class450 {

    @OriginalMember(owner = "client!tha", name = "f", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!tha", name = "g", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!tha", name = "h", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!tha", name = "i", descriptor = "I")
    public static int field4228;

    @OriginalMember(owner = "client!tha", name = "j", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!tha", name = "k", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!tha", name = "l", descriptor = "I")
    public static int field4231;

    @OriginalMember(owner = "client!tha", name = "m", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!tha", name = "n", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(Lup;)V", line = 5)
    public class296(class278 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V", line = 10)
    public final void method73(byte arg0) {
        if (arg0 != 98) {
            this.method75(-114, 111);
        }
        ++field4231;
        if (super.field6171.method1672(0)) {
            super.field6170 = 0;
        }
        if (super.field6170 != 1 && ~super.field6170 != -1) {
            super.field6170 = this.method68(false);
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(BLee;)Lrw;", line = 27)
    public static final class760 method1829(byte arg0, class677 arg1) {
        ++field4228;
        if (arg0 != 53) {
            field4227 = 94;
        }
        int var2 = arg1.method3807(-1);
        class311 var3 = class439.method2534(-1)[arg1.method3821((byte) 79)];
        class512 var4 = class12.method106(arg0 ^ -12918)[arg1.method3821((byte) -116)];
        int var5 = arg1.method3771((byte) -10);
        int var6 = arg1.method3771((byte) -10);
        return new class760(var2, var3, var4, var5, var6);
    }

    @OriginalMember(owner = "client!tha", name = "<init>", descriptor = "(ILup;)V", line = 48)
    public class296(int arg0, class278 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(Z)I", line = 53)
    public final int method68(boolean arg0) {
        ++field4229;
        if (arg0) {
            this.method68(true);
        }
        return 1;
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)Z", line = 64)
    public final boolean method1830(int arg0) {
        if (arg0 != 260) {
            return false;
        } else {
            ++field4226;
            return !super.field6171.method1672(0);
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(ZI)V", line = 80)
    public final void method67(boolean arg0, int arg1) {
        if (!arg0) {
            field4227 = -103;
        }
        super.field6170 = arg1;
        ++field4233;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(BLvfa;)V", line = 94)
    public static final void method1831(byte arg0, class672 arg1) {
        if (arg0 == -24) {
            ++field4232;
            if (arg1.field9239 == 5 && arg1.field9318 != -1) {
                class387.method2297((byte) -117, arg1, class341.field4807);
            }
        }
    }

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(Z)I", line = 109)
    public final int method1832(boolean arg0) {
        ++field4230;
        return !arg0 ? -71 : super.field6170;
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(II)I", line = 121)
    public final int method75(int arg0, int arg1) {
        ++field4225;
        return super.field6171.method1672(arg0) ? 3 : 1;
    }
}
