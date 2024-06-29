import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public abstract class class440 {

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "Z")
    private boolean field6405;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "I")
    private int field6408;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "Lrs;")
    public class166 field6403;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "I")
    private int field6410;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public int field6412;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "Lle;")
    public static class736 field6409 = class677.method3770(121);

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "I")
    public static int field6414 = -1;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "Ltm;")
    public static class334 field6413 = new class334(37, 6);

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "Z")
    public static boolean field6415 = false;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "[I")
    public static int[] field6416 = null;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field6406;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "I")
    public static int field6407;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field6411;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!pt", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field6403.method1291(this.field6412, 0, this.field6410);
        field6407++;
        super.finalize();
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILjava/lang/String;IZ)I", line = 13)
    public static final int method2705(int arg0, String arg1, int arg2, boolean arg3) {
        field6406++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        boolean var5 = false;
        int var6 = 0;
        int var7 = 44 / ((-arg0 - 15) / 38);
        int var8 = arg1.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg1.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg3) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg2 <= var12) {
                throw new NumberFormatException();
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg2 * var6 + var12;
            if (var11 / arg2 != var6) {
                throw new NumberFormatException();
            }
            var6 = var11;
            var5 = true;
        }
        if (!var5) {
            throw new NumberFormatException();
        }
        return var6;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(Z)V", line = 88)
    public static void method2706(boolean arg0) {
        field6416 = null;
        field6409 = null;
        field6413 = null;
        if (!arg0) {
            method2707(-90);
        }
    }

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "(I)V", line = 106)
    public static final void method2707(int arg0) {
        field6411++;
        if (class18.field189) {
            return;
        }
        class18.field189 = true;
        class285.field4394 += (-class285.field4394 - 24.0F) / 2.0F;
        class218.field3575 = true;
        if (arg0 >= -21) {
            method2705(-26, null, 18, false);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "([BII)V", line = 126)
    public final void method2708(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            method2706(false);
        }
        this.method847((byte) 117);
        field6404++;
        if (arg1 > this.field6410) {
            OpenGL.glBufferDataARBub(this.field6408, arg1, arg0, 0, this.field6405 ? 35040 : 35044);
            this.field6403.field2774 += arg1 - this.field6410;
            this.field6410 = arg1;
        } else {
            OpenGL.glBufferSubDataARBub(this.field6408, 0, arg1, arg0, 0);
        }
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lrs;I[BIZ)V", line = 156)
    public class440(class166 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field6405 = arg4;
        this.field6408 = arg1;
        this.field6403 = arg0;
        this.field6410 = arg3;
        OpenGL.glGenBuffersARB(1, class656.field9345, 0);
        this.field6412 = class656.field9345[0];
        this.method847((byte) 127);
        OpenGL.glBufferDataARBub(arg1, this.field6410, arg2, 0, this.field6405 ? 35040 : 35044);
        this.field6403.field2774 += this.field6410;
    }

    @OriginalMember(owner = "client!pt", name = "<init>", descriptor = "(Lrs;ILjaclib/memory/Buffer;IZ)V", line = 177)
    public class440(class166 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field6405 = arg4;
        this.field6408 = arg1;
        this.field6410 = arg3;
        this.field6403 = arg0;
        OpenGL.glGenBuffersARB(1, class656.field9345, 0);
        this.field6412 = class656.field9345[0];
        this.method847((byte) 125);
        OpenGL.glBufferDataARBa(arg1, this.field6410, arg2.getAddress(), this.field6405 ? 35040 : 35044);
        this.field6403.field2774 += this.field6410;
    }

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "(B)V")
    public abstract void method847(byte arg0);
}
