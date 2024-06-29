import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class274 extends class322 {

    @OriginalMember(owner = "client!nn", name = "u", descriptor = "[I")
    private int[] field3914 = new int[this.field4713];

    @OriginalMember(owner = "client!nn", name = "y", descriptor = "Lgn;")
    public static class475 field3918 = new class475(43, 3);

    @OriginalMember(owner = "client!nn", name = "r", descriptor = "I")
    public static int field3911;

    @OriginalMember(owner = "client!nn", name = "s", descriptor = "I")
    public static int field3912;

    @OriginalMember(owner = "client!nn", name = "t", descriptor = "I")
    public static int field3913;

    @OriginalMember(owner = "client!nn", name = "v", descriptor = "I")
    private int field3915;

    @OriginalMember(owner = "client!nn", name = "w", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!nn", name = "x", descriptor = "I")
    private int field3917;

    @OriginalMember(owner = "client!nn", name = "A", descriptor = "I")
    public static int field3920;

    @OriginalMember(owner = "client!nn", name = "B", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!nn", name = "C", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!nn", name = "D", descriptor = "I")
    public static int field3923;

    // $FF: synthetic field
    @OriginalMember(owner = "client!nn", name = "E", descriptor = "Ljava/lang/Class;")
    public static Class field3924;

    @OriginalMember(owner = "client!nn", name = "z", descriptor = "[B")
    private byte[] field3919;

    // $FF: synthetic method
    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method1688(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(IIB)V", line = 3)
    public void method1340(int arg0, int arg1, byte arg2) {
        this.field3919[this.field3917++] = (byte) ((class500.method3013(255, arg2) >> 1) + 127);
        if (arg1 != 29447) {
            this.method1340(18, 29, (byte) -37);
        }
        ++field3922;
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(II)I", line = 15)
    public static final int method1680(int arg0, int arg1) {
        ++field3916;
        return arg0 != 738415111 ? -99 : arg1 >>> 7;
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(III)Z", line = 27)
    public static final boolean method1681(int arg0, int arg1, int arg2) {
        if (arg2 > -34) {
            field3918 = null;
        }
        ++field3913;
        return method1684(arg0, arg1, -122) | (458752 & arg0) != 0 || class466.method2729(arg0, arg1, (byte) -92);
    }

    @OriginalMember(owner = "client!nn", name = "<init>", descriptor = "(IIIIIF)V", line = 40)
    public class274(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field4713 > var7; ++var7) {
            this.field3914[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(Z)V", line = 59)
    public static final void method1682(boolean arg0) {
        ++field3920;
        try {
            if (!arg0) {
                Method var1 = (field3924 != null ? field3924 : (field3924 = method1688("java.lang.Runtime"))).getMethod("availableProcessors");
                if (var1 != null) {
                    try {
                        Runtime var2 = Runtime.getRuntime();
                        Integer var3 = (Integer) var1.invoke(var2, (Object[]) null);
                        class331.field4811 = var3;
                    } catch (Throwable var4) {
                    }
                }
            }
        } catch (Exception var5) {
        }
    }

    @OriginalMember(owner = "client!nn", name = "a", descriptor = "(I)V", line = 89)
    public final void method1683(int arg0) {
        this.field3915 = Math.abs(this.field3915);
        ++field3912;
        if (this.field3915 >= 4096) {
            this.field3915 = 4095;
        }
        this.method1340(this.field3917++, 29447, (byte) (this.field3915 >> 4));
        int var2 = -100 % ((arg0 - 63) / 58);
        this.field3915 = 0;
    }

    @OriginalMember(owner = "client!nn", name = "d", descriptor = "(III)Z", line = 106)
    public static final boolean method1684(int arg0, int arg1, int arg2) {
        ++field3911;
        int var3 = -41 % ((18 - arg2) / 51);
        return (52 & arg0) != 0;
    }

    @OriginalMember(owner = "client!nn", name = "e", descriptor = "(I)V", line = 122)
    public static void method1685(int arg0) {
        if (arg0 != 0) {
            field3918 = null;
        }
        field3918 = null;
    }

    @OriginalMember(owner = "client!nn", name = "b", descriptor = "(III)V", line = 134)
    public final void method1686(int arg0, int arg1, int arg2) {
        if (arg2 != -4096) {
            method1680(-42, 118);
        }
        this.field3915 += this.field3914[arg0] * arg1 >> 12;
        ++field3921;
    }

    @OriginalMember(owner = "client!nn", name = "c", descriptor = "(I)V", line = 145)
    public final void method1687(int arg0) {
        if (arg0 == 9944) {
            ++field3923;
            this.field3917 = 0;
            this.field3915 = 0;
        }
    }
}
