import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class106 extends class98 implements class697 {

    @OriginalMember(owner = "client!laa", name = "F", descriptor = "I")
    private int field1713 = -1;

    @OriginalMember(owner = "client!laa", name = "L", descriptor = "I")
    private int field1719 = -1;

    @OriginalMember(owner = "client!laa", name = "H", descriptor = "I")
    public int field1715;

    @OriginalMember(owner = "client!laa", name = "K", descriptor = "Ler;")
    private class92 field1718;

    @OriginalMember(owner = "client!laa", name = "T", descriptor = "I")
    private int field1726;

    @OriginalMember(owner = "client!laa", name = "E", descriptor = "I")
    public int field1712;

    @OriginalMember(owner = "client!laa", name = "O", descriptor = "I")
    private int field1722;

    @OriginalMember(owner = "client!laa", name = "X", descriptor = "I")
    public int field1730;

    @OriginalMember(owner = "client!laa", name = "M", descriptor = "I")
    public static int field1720 = 0;

    @OriginalMember(owner = "client!laa", name = "R", descriptor = "Lrl;")
    public static class672 field1725 = new class672(64, 8);

    @OriginalMember(owner = "client!laa", name = "U", descriptor = "I")
    public static int field1727 = 0;

    @OriginalMember(owner = "client!laa", name = "W", descriptor = "I")
    public static int field1729 = 0;

    @OriginalMember(owner = "client!laa", name = "V", descriptor = "[Lvl;")
    public static class13[] field1728 = null;

    @OriginalMember(owner = "client!laa", name = "G", descriptor = "I")
    public static int field1714;

    @OriginalMember(owner = "client!laa", name = "I", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!laa", name = "J", descriptor = "I")
    public static int field1717;

    @OriginalMember(owner = "client!laa", name = "N", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!laa", name = "P", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!laa", name = "Q", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!laa", name = "Y", descriptor = "Lsw;")
    public static class701 field1731;

    // $FF: synthetic field
    @OriginalMember(owner = "client!laa", name = "Z", descriptor = "Ljava/lang/Class;")
    public static Class field1732;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "(B)V")
    public static void method1002(byte arg0) {
        if (arg0 != 25) {
            field1728 = null;
        }
        field1725 = null;
        field1728 = null;
        field1731 = null;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIII)I")
    public static final int method1003(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg1 & 0x3;
        field1714++;
        if (arg0 != 8) {
            field1720 = 22;
        }
        if (var4 == 0) {
            return arg2;
        } else if (var4 == 1) {
            return 4095 - arg3;
        } else if (var4 == 2) {
            return 4095 - arg2;
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "(I)V")
    public final void method1004(int arg0) {
        if (this.field1722 > 0) {
            this.field1718.method829((byte) 120, this.field1722, this.field1730);
            this.field1722 = 0;
        }
        int var2 = -13 % ((arg0 + 80) / 39);
        field1721++;
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/lang/String;B)Z")
    public static final boolean method1005(String arg0, byte arg1) {
        field1717++;
        int var2 = 122 % ((arg1 - 64) / 57);
        return class388.method2521(field1732 == null ? (field1732 = method1007("wl")) : field1732, -113, arg0);
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V")
    public final void method667(int arg0) {
        field1723++;
        OpenGL.glFramebufferRenderbufferEXT(this.field1713, this.field1719, 36161, 0);
        if (arg0 != 13035) {
            field1731 = null;
        }
        this.field1719 = -1;
        this.field1713 = -1;
    }

    @OriginalMember(owner = "client!laa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1004(-39);
        field1716++;
        super.finalize();
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(III)V")
    public final void method1006(int arg0, int arg1, int arg2) {
        if (arg0 <= 68) {
            field1728 = null;
        }
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, 36161, this.field1722);
        field1724++;
        this.field1719 = arg2;
        this.field1713 = arg1;
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Ler;III)V")
    public class106(class92 arg0, int arg1, int arg2, int arg3) {
        this.field1715 = arg2;
        this.field1718 = arg0;
        this.field1726 = arg1;
        this.field1712 = arg3;
        OpenGL.glGenRenderbuffersEXT(1, class564.field8104, 0);
        this.field1722 = class564.field8104[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field1722);
        OpenGL.glRenderbufferStorageEXT(36161, this.field1726, this.field1715, this.field1712);
        this.field1730 = this.field1715 * this.field1712 * this.field1718.method886(-98, this.field1726);
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Ler;IIII)V")
    public class106(class92 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field1712 = arg3;
        this.field1715 = arg2;
        this.field1726 = arg1;
        this.field1718 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class564.field8104, 0);
        this.field1722 = class564.field8104[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field1722);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field1726, this.field1715, this.field1712);
        this.field1730 = this.field1715 * this.field1712 * this.field1718.method886(84, this.field1726);
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1007(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
