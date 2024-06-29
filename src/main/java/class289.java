import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class289 {

    @OriginalMember(owner = "client!pg", name = "i", descriptor = "Lgw;")
    private class690 field4137 = new class690(128);

    @OriginalMember(owner = "client!pg", name = "g", descriptor = "Luu;")
    private class237 field4135;

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "[F")
    public static float[] field4132 = new float[] { 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F };

    @OriginalMember(owner = "client!pg", name = "h", descriptor = "[I")
    public static int[] field4136 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!pg", name = "l", descriptor = "Lgp;")
    public static class553 field4140 = null;

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "I")
    public static int field4130;

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "I")
    public static int field4131;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field4133;

    @OriginalMember(owner = "client!pg", name = "f", descriptor = "I")
    public static int field4134;

    @OriginalMember(owner = "client!pg", name = "j", descriptor = "I")
    public static int field4138;

    @OriginalMember(owner = "client!pg", name = "k", descriptor = "I")
    public static int field4139;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "[Lfd;")
    public static class298[] field4129;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(I)V", line = 4)
    public static void method1906(int arg0) {
        field4140 = null;
        field4129 = null;
        if (arg0 != 155) {
            field4131 = -78;
        }
        field4132 = null;
        field4136 = null;
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(I)V", line = 17)
    public final void method1907(int arg0) {
        class690 var2 = this.field4137;
        synchronized (this.field4137) {
            if (arg0 != 1) {
                this.method1909(-120);
            }
            this.field4137.method3906(-104);
        }
        field4139++;
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(ZI)V", line = 32)
    public final void method1908(boolean arg0, int arg1) {
        field4138++;
        class690 var3 = this.field4137;
        synchronized (this.field4137) {
            this.field4137.method3896(1, arg1);
            if (!arg0) {
                this.field4137 = null;
            }
        }
    }

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "(I)V", line = 45)
    public final void method1909(int arg0) {
        field4134++;
        class690 var2 = this.field4137;
        synchronized (this.field4137) {
            this.field4137.method3902(arg0 ^ arg0);
        }
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(IIIBIIIIII)V", line = 59)
    public static final void method1910(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 > -10) {
            field4131 = -27;
        }
        if (arg4 >= class607.field8185 && arg4 <= class726.field10064 && class607.field8185 <= arg7 && arg7 <= class726.field10064 && arg5 >= class607.field8185 && class726.field10064 >= arg5 && arg9 >= class607.field8185 && arg9 <= class726.field10064 && arg6 >= class291.field4181 && class262.field3848 >= arg6 && arg0 >= class291.field4181 && arg0 <= class262.field3848 && arg1 >= class291.field4181 && arg1 <= class262.field3848 && class291.field4181 <= arg2 && arg2 <= class262.field3848) {
            class192.method1188(arg1, arg7, arg0, arg8, arg6, arg9, 112, arg5, arg4, arg2);
        } else {
            class441.method2705(arg4, arg7, arg5, arg1, arg0, 31603, arg8, arg6, arg9, arg2);
        }
        field4130++;
    }

    @OriginalMember(owner = "client!pg", name = "<init>", descriptor = "(Lgp;ILuu;)V", line = 123)
    public class289(class553 arg0, int arg1, class237 arg2) {
        this.field4135 = arg2;
        this.field4135.method1597(1, 0);
    }

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(II)Lrh;", line = 93)
    public final class634 method1911(int arg0, int arg1) {
        int var3 = 20 / ((arg1 - 47) / 48);
        field4133++;
        class690 var4 = this.field4137;
        class634 var5;
        synchronized (this.field4137) {
            var5 = (class634) this.field4137.method3898((byte) -42, (long) arg0);
        }
        if (var5 != null) {
            return var5;
        }
        class237 var6 = this.field4135;
        byte[] var7;
        synchronized (this.field4135) {
            var7 = this.field4135.method1572(1, 0, arg0);
        }
        class634 var8 = new class634();
        if (var7 != null) {
            var8.method3552(new class63(var7), -80);
        }
        class690 var9 = this.field4137;
        synchronized (this.field4137) {
            this.field4137.method3899(62, var8, (long) arg0);
            return var8;
        }
    }
}
