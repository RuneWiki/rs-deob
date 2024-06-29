import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class301 extends class376 implements class249 {

    @OriginalMember(owner = "client!io", name = "I", descriptor = "I")
    private int field4315 = -1;

    @OriginalMember(owner = "client!io", name = "M", descriptor = "I")
    private int field4319 = -1;

    @OriginalMember(owner = "client!io", name = "H", descriptor = "I")
    private int field4314;

    @OriginalMember(owner = "client!io", name = "F", descriptor = "I")
    public int field4312;

    @OriginalMember(owner = "client!io", name = "E", descriptor = "I")
    public int field4311;

    @OriginalMember(owner = "client!io", name = "D", descriptor = "Lfd;")
    private class365 field4310;

    @OriginalMember(owner = "client!io", name = "y", descriptor = "I")
    private int field4306;

    @OriginalMember(owner = "client!io", name = "z", descriptor = "I")
    private int field4307;

    @OriginalMember(owner = "client!io", name = "B", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!io", name = "C", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!io", name = "G", descriptor = "I")
    public static int field4313;

    @OriginalMember(owner = "client!io", name = "J", descriptor = "I")
    public static int field4316;

    @OriginalMember(owner = "client!io", name = "K", descriptor = "I")
    public static int field4317;

    @OriginalMember(owner = "client!io", name = "L", descriptor = "I")
    public static int field4318;

    @OriginalMember(owner = "client!io", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field4318++;
        this.method1892(-25097);
        super.finalize();
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ZII)V")
    public final void method1890(boolean arg0, int arg1, int arg2) {
        OpenGL.glFramebufferRenderbufferEXT(arg2, arg1, 36161, this.field4306);
        field4308++;
        this.field4315 = arg2;
        this.field4319 = arg1;
        if (!arg0) {
            this.method1892(112);
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V")
    public final void method1628(int arg0) {
        OpenGL.glFramebufferRenderbufferEXT(this.field4315, this.field4319, 36161, 0);
        if (arg0 < 121) {
            this.field4312 = 104;
        }
        field4316++;
        this.field4319 = -1;
        this.field4315 = -1;
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)Z")
    public static final boolean method1891(int arg0, int arg1, int arg2) {
        field4317++;
        if (!class500.field7415) {
            return false;
        }
        int var3 = arg0 >> 16;
        int var4 = arg0 & 0xFFFF;
        if (class123.field1803[var3] == null || class123.field1803[var3][var4] == null) {
            return false;
        }
        class188 var5 = class123.field1803[var3][var4];
        if (arg2 == -1 && var5.field2727 == 0) {
            for (class97 var6 = (class97) class498.field7394.method1018(115); var6 != null; var6 = (class97) class498.field7394.method1022((byte) -112)) {
                if (var6.field1307 == 47 || var6.field1307 == 1002 || var6.field1307 == 9 || var6.field1307 == 48 || var6.field1307 == 60) {
                    for (class188 var7 = class371.method2286(0, var6.field1305); var7 != null; var7 = class232.method1555(var7, (byte) 83)) {
                        if (var5.field2678 == var7.field2678) {
                            return true;
                        }
                    }
                }
            }
        } else {
            for (class97 var8 = (class97) class498.field7394.method1018(102); var8 != null; var8 = (class97) class498.field7394.method1022((byte) -112)) {
                if (var8.field1302 == arg2 && var5.field2678 == var8.field1305 && (var8.field1307 == 47 || var8.field1307 == 1002 || var8.field1307 == 9 || var8.field1307 == 48 || var8.field1307 == 60)) {
                    return true;
                }
            }
        }
        if (arg1 >= -51) {
            method1891(-94, -88, -22);
        }
        return false;
    }

    @OriginalMember(owner = "client!io", name = "d", descriptor = "(I)V")
    public final void method1892(int arg0) {
        if (arg0 != -25097) {
            return;
        }
        field4309++;
        if (this.field4306 > 0) {
            this.field4310.method2193(-89, this.field4307, this.field4306);
            this.field4306 = 0;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIILrd;)V")
    public static final void method1893(int arg0, int arg1, int arg2, int arg3, class222 arg4) {
        if (arg2 != 36161) {
            return;
        }
        field4313++;
        for (class307 var5 = (class307) class134.field1942.method1018(73); var5 != null; var5 = (class307) class134.field1942.method1022((byte) -112)) {
            if (var5.field4360 == arg3 && arg1 << 7 == var5.field4353 && (arg0 << 7) == var5.field4350 && var5.field4345.field3217 == arg4.field3217) {
                if (var5.field4367 != null) {
                    class273.field4030.method1242(var5.field4367);
                    var5.field4367 = null;
                }
                if (var5.field4348 != null) {
                    class273.field4030.method1242(var5.field4348);
                    var5.field4348 = null;
                }
                var5.method1525((byte) -121);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lfd;III)V")
    public class301(class365 arg0, int arg1, int arg2, int arg3) {
        this.field4314 = arg1;
        this.field4312 = arg2;
        this.field4311 = arg3;
        this.field4310 = arg0;
        OpenGL.glGenRenderbuffersEXT(1, class384.field5643, 0);
        this.field4306 = class384.field5643[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4306);
        OpenGL.glRenderbufferStorageEXT(36161, this.field4314, this.field4312, this.field4311);
        this.field4307 = this.field4311 * this.field4312 * this.field4310.method2203(this.field4314, 2);
    }

    @OriginalMember(owner = "client!io", name = "<init>", descriptor = "(Lfd;IIII)V")
    public class301(class365 arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field4314 = arg1;
        this.field4310 = arg0;
        this.field4311 = arg3;
        this.field4312 = arg2;
        OpenGL.glGenRenderbuffersEXT(1, class384.field5643, 0);
        this.field4306 = class384.field5643[0];
        OpenGL.glBindRenderbufferEXT(36161, this.field4306);
        OpenGL.glRenderbufferStorageMultisampleEXT(36161, arg4, this.field4314, this.field4312, this.field4311);
        this.field4307 = this.field4312 * this.field4311 * this.field4310.method2203(this.field4314, 2);
    }
}
