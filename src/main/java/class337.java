import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public abstract class class337 implements class220 {

    @OriginalMember(owner = "client!jo", name = "g", descriptor = "Z")
    private boolean field4686 = false;

    @OriginalMember(owner = "client!jo", name = "q", descriptor = "Lkfa;")
    public class382 field4696;

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "I")
    public int field4684;

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "Z")
    private boolean field4683;

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "I")
    private int field4688;

    @OriginalMember(owner = "client!jo", name = "f", descriptor = "I")
    public int field4685;

    @OriginalMember(owner = "client!jo", name = "h", descriptor = "I")
    public int field4687;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "Lvh;")
    public static class125 field4680 = new class125(64, 15);

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "I")
    public static int field4681;

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "I")
    public static int field4682;

    @OriginalMember(owner = "client!jo", name = "j", descriptor = "I")
    public static int field4689;

    @OriginalMember(owner = "client!jo", name = "k", descriptor = "I")
    public static int field4690;

    @OriginalMember(owner = "client!jo", name = "l", descriptor = "I")
    public static int field4691;

    @OriginalMember(owner = "client!jo", name = "m", descriptor = "I")
    public static int field4692;

    @OriginalMember(owner = "client!jo", name = "n", descriptor = "I")
    public static int field4693;

    @OriginalMember(owner = "client!jo", name = "o", descriptor = "I")
    public static int field4694;

    @OriginalMember(owner = "client!jo", name = "p", descriptor = "I")
    public static int field4695;

    @OriginalMember(owner = "client!jo", name = "s", descriptor = "I")
    public static int field4698;

    @OriginalMember(owner = "client!jo", name = "t", descriptor = "I")
    public static int field4699;

    @OriginalMember(owner = "client!jo", name = "r", descriptor = "Lvo;")
    public static class345 field4697;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(IZ)V")
    public final void method2001(int arg0, boolean arg1) {
        if (arg1 != this.field4686) {
            this.field4686 = arg1;
            this.method2005((byte) 35);
        }
        field4698++;
        if (arg0 != 540800) {
            this.field4683 = true;
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(III)Z")
    public static final boolean method2002(int arg0, int arg1, int arg2) {
        field4691++;
        if (arg0 >= -57) {
            method2002(-76, 42, 119);
        }
        return (arg1 & 0x84080) != 0;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(II)V")
    private final void method2003(int arg0, int arg1) {
        if (arg1 != 4) {
            this.method2009(-98);
        }
        this.field4696.field5477 -= arg0;
        field4681++;
        this.field4696.field5477 += this.method2004(true);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(Z)I")
    private final int method2004(boolean arg0) {
        field4699++;
        int var2 = this.field4696.method2323((byte) -87, this.field4685) * this.field4688;
        if (!arg0) {
            this.method2007(74);
        }
        return this.field4683 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(B)V")
    private final void method2005(byte arg0) {
        field4689++;
        this.field4696.method2295((byte) 59, this);
        if (this.field4686) {
            OpenGL.glTexParameteri(this.field4684, 10241, this.field4683 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field4684, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field4684, 10241, this.field4683 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field4684, 10240, 9728);
        }
        if (arg0 != 35) {
            this.field4687 = -25;
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(II)V")
    public static final void method2006(int arg0, int arg1) {
        field4692++;
        if (arg0 != -21241) {
            method2002(14, -79, 108);
        }
        if (class534.field7850 == null || arg1 > class534.field7850.length) {
            class534.field7850 = new int[arg1];
        }
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(I)I")
    public final int method2007(int arg0) {
        if (arg0 != -1) {
            this.field4688 = -108;
        }
        field4682++;
        return this.field4687;
    }

    @OriginalMember(owner = "client!jo", name = "c", descriptor = "(I)V")
    public final void method2008(int arg0) {
        if (this.field4687 > 0) {
            this.field4696.method2306(this.method2004(true), arg0 + 7657, this.field4687);
            this.field4687 = 0;
        }
        if (arg0 != -7656) {
            this.field4684 = 53;
        }
        field4695++;
    }

    @OriginalMember(owner = "client!jo", name = "d", descriptor = "(I)Z")
    public final boolean method2009(int arg0) {
        if (arg0 != 9729) {
            this.method2003(-107, 65);
        }
        field4693++;
        if (!this.field4696.field5571) {
            return false;
        }
        int var2 = this.method2004(true);
        this.field4696.method2295((byte) 122, this);
        OpenGL.glGenerateMipmapEXT(this.field4684);
        this.field4683 = true;
        this.method2005((byte) 35);
        this.method2003(var2, 4);
        return true;
    }

    @OriginalMember(owner = "client!jo", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field4690++;
        this.method2008(-7656);
        super.finalize();
    }

    @OriginalMember(owner = "client!jo", name = "e", descriptor = "(I)V")
    public static void method2010(int arg0) {
        field4680 = null;
        if (arg0 != 9984) {
            field4680 = null;
        }
        field4697 = null;
    }

    @OriginalMember(owner = "client!jo", name = "b", descriptor = "(IZ)V")
    public final void method2011(int arg0, boolean arg1) {
        if (arg1 != this.field4683) {
            int var3 = this.method2004(true);
            this.field4683 = true;
            this.method2005((byte) 35);
            this.method2003(var3, 4);
        }
        field4694++;
        if (arg0 != 17868) {
            this.method2008(107);
        }
    }

    @OriginalMember(owner = "client!jo", name = "<init>", descriptor = "(Lkfa;IIIZ)V")
    public class337(class382 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field4696 = arg0;
        this.field4684 = arg1;
        this.field4683 = arg4;
        this.field4688 = arg3;
        this.field4685 = arg2;
        OpenGL.glGenTextures(1, class277.field3925, 0);
        this.field4687 = class277.field3925[0];
        this.method2003(0, 4);
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(I)V")
    public abstract void method1475(int arg0);
}
