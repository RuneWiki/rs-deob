import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class279 implements Runnable {

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "Z")
    public boolean field4190 = true;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "Ljava/lang/Object;")
    public Object field4188 = new Object();

    @OriginalMember(owner = "client!vj", name = "l", descriptor = "[I")
    public int[] field4196 = new int[500];

    @OriginalMember(owner = "client!vj", name = "k", descriptor = "[I")
    public int[] field4195 = new int[500];

    @OriginalMember(owner = "client!vj", name = "m", descriptor = "I")
    public int field4197 = 0;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "Z")
    public static boolean field4192 = true;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!vj", name = "j", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Lkm;")
    public static class133 field4189;

    @OriginalMember(owner = "client!vj", name = "run", descriptor = "()V", line = 8)
    public final void run() {
        while (this.field4190) {
            Object var1 = this.field4188;
            synchronized (this.field4188) {
                if (this.field4197 < 500) {
                    this.field4195[this.field4197] = class206.field2962;
                    this.field4196[this.field4197] = class282.field4220;
                    this.field4197++;
                }
            }
            class186.method1304(10, 50L);
        }
        field4186++;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(B)Z", line = 30)
    public static final boolean method1931(byte arg0) {
        field4185++;
        if (class333.field5034) {
            try {
                class325.method2277(-21230, class165.field2258.field1157, "showVideoAd");
                return true;
            } catch (Throwable var2) {
            }
        }
        return arg0 <= 100;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 52)
    public static void method1932(int arg0) {
        field4189 = null;
        if (arg0 != 0) {
            method1935((class133) null, 115);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(BIIIIILbo;)V", line = 64)
    public static final void method1933(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class256 arg6) {
        if (arg0 < -32) {
            field4194++;
            class232.method1604(arg2, arg5, arg3, arg6.field3679, arg6.field3745, arg1, (byte) -118, arg4);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(IIIII)V", line = 78)
    public static final void method1934(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4191++;
        for (int var5 = 0; var5 < class231.field3266; var5++) {
            if ((class333.field5009[var5] + class66.field868[var5]) > arg3 && class333.field5009[var5] < arg3 + arg4 && arg0 < (class262.field3852[var5] + class234.field3318[var5]) && (arg0 + arg2) > class262.field3852[var5]) {
                class304.field4571[var5] = true;
            }
        }
        if (arg1 > -31) {
            method1933((byte) -41, -31, -84, -59, 79, -18, (class256) null);
        }
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Lkm;I)V", line = 104)
    public static final void method1935(class133 arg0, int arg1) {
        field4193++;
        class97.field1311 = arg0;
        int var2 = 95 / ((arg1 - 35) / 39);
    }
}
