import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class709 extends class173 implements class457 {

    @OriginalMember(owner = "client!ru", name = "v", descriptor = "I")
    private int field9369 = -1;

    @OriginalMember(owner = "client!ru", name = "z", descriptor = "I")
    private int field9373 = -1;

    @OriginalMember(owner = "client!ru", name = "A", descriptor = "I")
    public int field9374;

    @OriginalMember(owner = "client!ru", name = "B", descriptor = "Lck;")
    private class733 field9375;

    @OriginalMember(owner = "client!ru", name = "u", descriptor = "I")
    public int field9368;

    @OriginalMember(owner = "client!ru", name = "D", descriptor = "I")
    private int field9377;

    @OriginalMember(owner = "client!ru", name = "x", descriptor = "I")
    private int field9371;

    @OriginalMember(owner = "client!ru", name = "C", descriptor = "I")
    private int field9376;

    @OriginalMember(owner = "client!ru", name = "r", descriptor = "I")
    public static int field9365;

    @OriginalMember(owner = "client!ru", name = "s", descriptor = "I")
    public static int field9366;

    @OriginalMember(owner = "client!ru", name = "t", descriptor = "I")
    public static int field9367;

    @OriginalMember(owner = "client!ru", name = "w", descriptor = "I")
    public static int field9370;

    @OriginalMember(owner = "client!ru", name = "y", descriptor = "I")
    public static int field9372;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "(B)V")
    public final void method3829(byte arg0) {
        if (arg0 >= -115) {
            this.method760((byte) -21);
        }
        if (this.field9371 > 0) {
            this.field9375.method3928(this.field9376, this.field9371, 2);
            this.field9371 = 0;
        }
        field9366++;
    }

    @OriginalMember(owner = "client!ru", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method3829((byte) -126);
        field9365++;
        super.finalize();
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(ZII)V")
    public final void method3830(boolean arg0, int arg1, int arg2) {
        field9372++;
        OpenGL.glFramebufferRenderbufferEXT(arg1, arg2, 36161, this.field9371);
        this.field9369 = arg2;
        if (!arg0) {
            this.method3830(true, 54, 49);
        }
        this.field9373 = arg1;
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)I")
    public static final int method3831(int arg0) {
        if (arg0 >= -78) {
            return 24;
        }
        field9367++;
        boolean var1 = false;
        boolean var2 = false;
        boolean var3 = false;
        if (class740.field10014.field10571 && !class740.field10014.field10581) {
            var1 = true;
            if (class231.field3108.field4432 < 512 && class231.field3108.field4432 != 0) {
                var1 = false;
            }
            if (class775.field10561.startsWith("win")) {
                var3 = true;
                var2 = true;
            } else {
                var2 = true;
            }
        }
        if (class386.field4932) {
            var2 = false;
        }
        if (class101.field1346) {
            var1 = false;
        }
        if (class746.field10195) {
            var3 = false;
        }
        if (!var1 && !var2 && !var3) {
            return class734.method3996(-92);
        }
        int var4 = -1;
        int var5 = -1;
        if (var1) {
            try {
                var4 = class490.method2737(1000, 2, -119);
            } catch (Exception var15) {
            }
        }
        int var6 = -1;
        if (var3) {
            try {
                var6 = class490.method2737(1000, 3, -43);
                if (class485.field6252.field6949.method2402(false) == 3) {
                    class291 var7 = class576.field7320.method927();
                    long var8 = var7.field3706 & 0xFFFFFFFFFFFFL;
                    int var10 = var7.field3712;
                    if (var10 == 4318) {
                        var2 &= var8 >= 64425238954L;
                    } else if (var10 == 4098) {
                        var2 &= var8 >= 60129613779L;
                    }
                }
            } catch (Exception var14) {
            }
        }
        if (var2) {
            try {
                var5 = class490.method2737(1000, 1, -109);
            } catch (Exception var13) {
            }
        }
        if (var4 == -1 && var5 == -1 && var6 == -1) {
            return class734.method3996(-113);
        }
        int var11 = (int) ((float) var6 * 1.1F);
        int var12 = (int) ((float) var5 * 1.1F);
        if (var4 > var11 && var12 < var4) {
            return class303.method1797(var4, true);
        } else if (var12 >= var11) {
            return class111.method647(117, var12, 1);
        } else {
            return class111.method647(124, var11, 3);
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(B)V")
    public final void method760(byte arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field9373, this.field9369, 36161, 0);
        field9370++;
        int var2 = 11 / ((65 - arg0) / 52);
        this.field9369 = -1;
        this.field9373 = -1;
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lck;III)V")
    public class709(class733 arg0, int arg1, int arg2, int arg3) {
        this.field9374 = arg2;
        this.field9375 = arg0;
        this.field9368 = arg3;
        this.field9377 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class155.field1980, 0);
        this.field9371 = class155.field1980[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field9371);
        OpenGL.glRenderbufferStorageEXT(36161, this.field9377, this.field9374, this.field9368);
        this.field9376 = this.field9374 * this.field9368 * this.field9375.method3946(this.field9377, (byte) -50);
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lck;IIII)V")
    public class709(class733 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field9368 = arg3;
        this.field9375 = arg0;
        this.field9374 = arg2;
        this.field9377 = arg1;
        OpenGL.glGenRenderbuffersEXT(1, class155.field1980, 0);
        this.field9371 = class155.field1980[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field9371);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field9377, this.field9374, this.field9368);
        this.field9376 = this.field9374 * this.field9368 * this.field9375.method3946(this.field9377, (byte) -50);
    }
}
