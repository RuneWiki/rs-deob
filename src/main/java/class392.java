import jaggl.OpenGL;
import jaggl.memory.NativeBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fi")
public abstract class class392 {

    @OriginalMember(owner = "client!fi", name = "l", descriptor = "I")
    private int field5668;

    @OriginalMember(owner = "client!fi", name = "h", descriptor = "I")
    private int field5664;

    @OriginalMember(owner = "client!fi", name = "j", descriptor = "Z")
    private boolean field5666;

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "Lur;")
    public class377 field5657;

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "I")
    public int field5659;

    @OriginalMember(owner = "client!fi", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5663 = "";

    @OriginalMember(owner = "client!fi", name = "d", descriptor = "I")
    public static int field5660 = 0;

    @OriginalMember(owner = "client!fi", name = "m", descriptor = "Z")
    public static boolean field5669 = false;

    @OriginalMember(owner = "client!fi", name = "k", descriptor = "[I")
    public static int[] field5667 = new int[8];

    @OriginalMember(owner = "client!fi", name = "p", descriptor = "[S")
    public static short[] field5672;

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "I")
    public static int field5658;

    @OriginalMember(owner = "client!fi", name = "e", descriptor = "I")
    public static int field5661;

    @OriginalMember(owner = "client!fi", name = "f", descriptor = "I")
    public static int field5662;

    @OriginalMember(owner = "client!fi", name = "i", descriptor = "I")
    public static int field5665;

    @OriginalMember(owner = "client!fi", name = "n", descriptor = "I")
    public static int field5670;

    @OriginalMember(owner = "client!fi", name = "o", descriptor = "I")
    public static int field5671;

    @OriginalMember(owner = "client!fi", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field5657.method2278(this.field5659, (byte) 90, this.field5668);
        field5670++;
        super.finalize();
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(ZBZ)V")
    public static final void method2366(boolean arg0, byte arg1, boolean arg2) {
        field5662++;
        if (arg0) {
            class260.field3487--;
            if (class260.field3487 == 0) {
                class445.field6483 = null;
            }
        }
        if (arg2) {
            class445.field6482--;
            if (class445.field6482 == 0) {
                class413.field5903 = null;
            }
        }
        if (arg1 > -76) {
            method2370(null, -16, null, 127, 1);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(II[B)V")
    public final void method2367(int arg0, int arg1, byte[] arg2) {
        field5658++;
        this.method1907(-122);
        if (arg0 > -95) {
            return;
        }
        if (this.field5668 < arg1) {
            OpenGL.glBufferDataARBub(this.field5664, arg1, arg2, 0, this.field5666 ? 35040 : 35044);
            this.field5657.field5326 += arg1 - this.field5668;
            this.field5668 = arg1;
        } else {
            OpenGL.glBufferSubDataARB(this.field5664, 0, arg1, arg2, 0);
        }
    }

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5671++;
        if (class307.field4111 <= arg3 && arg7 <= class91.field1086 && arg6 >= class169.field2184 && arg2 <= class386.field5620) {
            class242.method1510(arg5, arg7, arg6, arg4, (byte) -109, arg0, arg2, arg3);
        } else {
            class122.method728(arg2, arg7, arg3, arg4, arg5, arg6, 8, arg0);
        }
        if (arg1 != 24323) {
            method2369(true);
        }
    }

    @OriginalMember(owner = "client!fi", name = "b", descriptor = "(Z)V")
    public static void method2369(boolean arg0) {
        field5663 = null;
        field5672 = null;
        field5667 = null;
        if (arg0) {
            field5663 = null;
        }
    }

    @OriginalMember(owner = "client!fi", name = "c", descriptor = "(I)V")
    public abstract void method1907(int arg0);

    @OriginalMember(owner = "client!fi", name = "a", descriptor = "([Ljava/lang/Object;I[JII)V")
    public static final void method2370(Object[] arg0, int arg1, long[] arg2, int arg3, int arg4) {
        if (arg3 < arg1) {
            int var5 = (arg1 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg2[var5];
            arg2[var5] = arg2[arg1];
            arg2[arg1] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg1];
            arg0[arg1] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg1; var11++) {
                if (arg2[var11] < (long) (var11 & var10) + var7) {
                    long var12 = arg2[var11];
                    arg2[var11] = arg2[var6];
                    arg2[var6] = var12;
                    Object var14 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6++] = var14;
                }
            }
            arg2[arg1] = arg2[var6];
            arg2[var6] = var7;
            arg0[arg1] = arg0[var6];
            arg0[var6] = var9;
            method2370(arg0, var6 - 1, arg2, arg3, -1);
            method2370(arg0, arg1, arg2, var6 + 1, -1);
        }
        if (arg4 == -1) {
            field5661++;
        }
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lur;I[BIZ)V")
    public class392(class377 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        this.field5668 = arg3;
        this.field5664 = arg1;
        this.field5666 = arg4;
        this.field5657 = arg0;
        OpenGL.glGenBuffersARB(1, class223.field3008, 0);
        this.field5659 = class223.field3008[0];
        this.method1907(-73);
        OpenGL.glBufferDataARBub(arg1, this.field5668, arg2, 0, this.field5666 ? 35040 : 35044);
        this.field5657.field5326 += this.field5668;
    }

    @OriginalMember(owner = "client!fi", name = "<init>", descriptor = "(Lur;ILjaggl/memory/NativeBuffer;IZ)V")
    public class392(class377 arg0, int arg1, NativeBuffer arg2, int arg3, boolean arg4) {
        this.field5657 = arg0;
        this.field5668 = arg3;
        this.field5666 = arg4;
        this.field5664 = arg1;
        OpenGL.glGenBuffersARB(1, class223.field3008, 0);
        this.field5659 = class223.field3008[0];
        this.method1907(6);
        OpenGL.glBufferDataARBa(arg1, this.field5668, arg2.method2728(), this.field5666 ? 35040 : 35044);
        this.field5657.field5326 += this.field5668;
    }

    static {
        new class242("", 76);
        field5672 = new short[256];
    }
}
