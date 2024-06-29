import jaclib.memory.Buffer;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public abstract class class482 {

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    private int field6488;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "Z")
    private boolean field6481;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    private int field6490;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "Lpea;")
    public class641 field6487;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public int field6483;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    public static int field6489 = 0;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "[S")
    public static short[] field6485 = new short[256];

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public static int field6480;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field6482;

    @OriginalMember(owner = "client!am", name = "e", descriptor = "I")
    public static int field6484;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "Lpq;")
    public static class159 field6486;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Z)V")
    public abstract void method2685(boolean arg0);

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IZ[B)V")
    public final void method2686(int arg0, boolean arg1, byte[] arg2) {
        this.method2685(!arg1);
        if (!arg1) {
            return;
        }
        field6480++;
        if (arg0 <= this.field6490) {
            OpenGL.glBufferSubDataARBub(this.field6488, 0, arg0, arg2, 0);
        } else {
            OpenGL.glBufferDataARBub(this.field6488, arg0, arg2, 0, this.field6481 ? 35040 : 35044);
            this.field6487.field8954 += arg0 - this.field6490;
            this.field6490 = arg0;
        }
    }

    @OriginalMember(owner = "client!am", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field6487.method3543(this.field6490, false, this.field6483);
        field6484++;
        super.finalize();
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIIIIIIIBIIIII)V")
    public static final void method2687(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8, int arg9, int arg10, int arg11, int arg12, int arg13) {
        if (arg8 >= -105) {
            return;
        }
        field6482++;
        if (class397.field5666 == null) {
            return;
        }
        class39 var14 = null;
        if (arg11 >= 0) {
            int var15 = arg11 - 1;
            class637 var16 = (class637) class77.field955.method2506(96, (long) var15);
            if (var16 != null) {
                var14 = var16.field8702;
            }
        } else {
            int var17 = -arg11 - 1;
            if (class224.field2907 == var17) {
                var14 = class596.field8164;
            } else {
                var14 = class292.field3912[var17];
            }
        }
        if (var14 == null) {
            return;
        }
        class252 var18 = class578.field7980.method1746(arg1, (byte) 97);
        int var19;
        int var20;
        if (arg12 == 1 || arg12 == 3) {
            var20 = var18.field3450;
            var19 = var18.field3431;
        } else {
            var19 = var18.field3450;
            var20 = var18.field3431;
        }
        int var21 = (var19 >> 1) + arg3;
        int var22 = arg3 + (var19 + 1 >> 1);
        int var23 = arg13 + (var20 >> 1);
        int var24 = (var20 + 1 >> 1) + arg13;
        class176 var25 = class397.field5666[arg4];
        int var26 = var25.method150(var21, var23) + var25.method150(var22, var23) + var25.method150(var21, var24) + var25.method150(var22, var24) >> 2;
        class571 var27 = new class571();
        var27.field7914 = arg3;
        var27.field7899 = var14.field3925;
        var27.field7897 = arg1;
        var27.field7909 = arg13;
        if (arg2 > arg5) {
            int var28 = arg2;
            arg2 = arg5;
            arg5 = var28;
        }
        var27.field7907 = class430.field5984 + arg0;
        var27.field7905 = class430.field5984 + arg7;
        var27.field7913 = arg12;
        var27.field7901 = arg9;
        var27.field7912 = arg3 + arg5;
        if (arg10 < arg6) {
            int var29 = arg6;
            arg6 = arg10;
            arg10 = var29;
        }
        var27.field7906 = arg2 + arg3;
        var27.field7898 = arg10 + arg13;
        var27.field7902 = (var27.field7914 << 9) + (var19 << 8);
        var27.field7903 = var26;
        var27.field7910 = arg6 + arg13;
        var27.field7904 = (var27.field7909 << 9) + (var20 << 8);
        class168.field2092.method378(var27, 31316);
        var14.field525 = var27;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(I)V")
    public static void method2688(int arg0) {
        field6485 = null;
        if (arg0 == -1573699607) {
            field6486 = null;
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lpea;I[BIZ)V")
    public class482(class641 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field6488 = arg1;
        this.field6481 = arg4;
        this.field6490 = arg3;
        this.field6487 = arg0;
        OpenGL.glGenBuffersARB(1, class162.field2059, 0);
        this.field6483 = class162.field2059[0];
        this.method2685(false);
        OpenGL.glBufferDataARBub(arg1, this.field6490, arg2, 0, this.field6481 ? 35040 : 35044);
        this.field6487.field8954 += this.field6490;
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "(Lpea;ILjaclib/memory/Buffer;IZ)V")
    public class482(class641 arg0, int arg1, Buffer arg2, int arg3, boolean arg4) {
        this.field6490 = arg3;
        this.field6481 = arg4;
        this.field6488 = arg1;
        this.field6487 = arg0;
        OpenGL.glGenBuffersARB(1, class162.field2059, 0);
        this.field6483 = class162.field2059[0];
        this.method2685(false);
        OpenGL.glBufferDataARBa(arg1, this.field6490, arg2.getAddress(), this.field6481 ? 35040 : 35044);
        this.field6487.field8954 += this.field6490;
    }
}
