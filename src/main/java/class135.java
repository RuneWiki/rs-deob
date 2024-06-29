import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public abstract class class135 {

    @OriginalMember(owner = "client!fca", name = "m", descriptor = "Z")
    private boolean field1797;

    @OriginalMember(owner = "client!fca", name = "f", descriptor = "Los;")
    public class468 field1790;

    @OriginalMember(owner = "client!fca", name = "k", descriptor = "I")
    private int field1795;

    @OriginalMember(owner = "client!fca", name = "i", descriptor = "I")
    private int field1793;

    @OriginalMember(owner = "client!fca", name = "l", descriptor = "I")
    public int field1796;

    @OriginalMember(owner = "client!fca", name = "n", descriptor = "Lwca;")
    public static class311 field1798 = null;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!fca", name = "b", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!fca", name = "e", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!fca", name = "g", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!fca", name = "h", descriptor = "I")
    public static int field1792;

    @OriginalMember(owner = "client!fca", name = "j", descriptor = "Lqp;")
    public static class586 field1794;

    @OriginalMember(owner = "client!fca", name = "d", descriptor = "[Llba;")
    public static class237[] field1788;

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(IB[BIIII)Z")
    public static final boolean method833(int arg0, byte arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field1787++;
        if (arg1 > -1) {
            field1789 = -99;
        }
        int var7 = arg5 % arg6;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg6 - var7;
        }
        int var9 = -((arg0 + arg6 - 1) / arg6);
        int var10 = -((arg5 + arg6 - 1) / arg6);
        for (int var11 = var9; var11 < 0; var11++) {
            for (int var12 = var10; var12 < 0; var12++) {
                if (arg2[arg3] == 0) {
                    return true;
                }
                arg3 += arg6;
            }
            int var13 = arg3 - var8;
            if (arg2[var13 - 1] == 0) {
                return true;
            }
            arg3 = arg4 + var13;
        }
        return false;
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(B)V")
    public static void method834(byte arg0) {
        if (arg0 == -48) {
            field1794 = null;
            field1798 = null;
            field1788 = null;
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(II[B)V")
    public final void method835(int arg0, int arg1, byte[] arg2) {
        if (arg1 != 35044) {
            this.field1796 = 33;
        }
        this.method532(19);
        field1786++;
        if (this.field1793 < arg0) {
            OpenGL.glBufferDataARBub(this.field1795, arg0, arg2, 0, this.field1797 ? 35040 : 35044);
            this.field1790.field6975 += arg0 - this.field1793;
            this.field1793 = arg0;
        } else {
            OpenGL.glBufferSubDataARBub(this.field1795, 0, arg0, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!fca", name = "a", descriptor = "(ZLjt;)I")
    public static final int method836(boolean arg0, class489 arg1) {
        field1785++;
        if (class639.field9293 == arg1) {
            return 6407;
        } else if (class411.field5856 == arg1) {
            return 6408;
        } else if (class566.field8401 == arg1) {
            return 6406;
        } else if (class317.field4741 == arg1) {
            return 6409;
        } else if (class556.field8245 == arg1) {
            return 6410;
        } else if (class492.field7433 == arg1) {
            return 6145;
        } else {
            if (arg0) {
                field1788 = null;
            }
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Los;I[BIZ)V")
    public class135(class468 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field1797 = arg4;
        this.field1790 = arg0;
        this.field1795 = arg1;
        this.field1793 = arg3;
        OpenGL.glGenBuffersARB(1, class342.field5006, 0);
        this.field1796 = class342.field5006[0];
        this.method532(79);
        OpenGL.glBufferDataARBub(arg1, this.field1793, arg2, 0, this.field1797 ? 35040 : 35044);
        this.field1790.field6975 += this.field1793;
    }

    @OriginalMember(owner = "client!fca", name = "c", descriptor = "(I)V")
    public abstract void method532(int arg0);

    @OriginalMember(owner = "client!fca", name = "<init>", descriptor = "(Los;ILjaclib/memory/Buffer;IZ)V")
    public class135(class468 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field1790 = arg0;
        this.field1793 = arg3;
        this.field1795 = arg1;
        this.field1797 = arg4;
        OpenGL.glGenBuffersARB(1, class342.field5006, 0);
        this.field1796 = class342.field5006[0];
        this.method532(116);
        OpenGL.glBufferDataARBa(arg1, this.field1793, arg2.getAddress(), this.field1797 ? 35040 : 35044);
        this.field1790.field6975 += this.field1793;
    }

    @OriginalMember(owner = "client!fca", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field1792++;
        this.field1790.method2821(this.field1796, this.field1793, (byte) -54);
        super.finalize();
    }
}
