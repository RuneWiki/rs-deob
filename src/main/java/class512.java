import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iba")
public class class512 {

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "Lvi;")
    private class560 field6898 = new class560(16);

    @OriginalMember(owner = "client!iba", name = "d", descriptor = "Lpq;")
    private class159 field6901;

    @OriginalMember(owner = "client!iba", name = "b", descriptor = "I")
    public static int field6899;

    @OriginalMember(owner = "client!iba", name = "c", descriptor = "I")
    public static int field6900;

    @OriginalMember(owner = "client!iba", name = "f", descriptor = "I")
    public static int field6903;

    @OriginalMember(owner = "client!iba", name = "g", descriptor = "I")
    public static int field6904;

    @OriginalMember(owner = "client!iba", name = "h", descriptor = "I")
    public static int field6905;

    @OriginalMember(owner = "client!iba", name = "i", descriptor = "I")
    public static int field6906;

    @OriginalMember(owner = "client!iba", name = "j", descriptor = "I")
    public static int field6907;

    @OriginalMember(owner = "client!iba", name = "e", descriptor = "J")
    public static long field6902;

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IB)V")
    public final void method2895(int arg0, byte arg1) {
        field6905++;
        class560 var3 = this.field6898;
        synchronized (this.field6898) {
            this.field6898.method3129(arg0, 14583);
            int var4 = -42 / ((arg1 + 14) / 52);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(BII)Z")
    public static final boolean method2896(byte arg0, int arg1, int arg2) {
        field6907++;
        if (arg0 < 109) {
            return false;
        } else {
            return (arg1 & 0x100) != 0;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(II)Led;")
    private final class412 method2897(int arg0, int arg1) {
        int var3 = 41 / ((arg1 - 3) / 62);
        field6906++;
        class560 var4 = this.field6898;
        class412 var5;
        synchronized (this.field6898) {
            var5 = (class412) this.field6898.method3134((long) arg0, -63);
        }
        if (var5 != null) {
            return var5;
        }
        class159 var6 = this.field6901;
        byte[] var7;
        synchronized (this.field6901) {
            var7 = this.field6901.method1087(29, arg0, 1);
        }
        class412 var8 = new class412();
        if (var7 != null) {
            var8.method2417(new class138(var7), -80);
        }
        class560 var9 = this.field6898;
        synchronized (this.field6898) {
            this.field6898.method3130((long) arg0, true, var8);
            return var8;
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(IIILgq;II)Leo;")
    public final class147 method2898(int arg0, int arg1, int arg2, class209 arg3, int arg4, int arg5) {
        field6900++;
        class642[] var7 = null;
        if (arg0 != -27611) {
            this.method2895(97, (byte) 112);
        }
        class412 var8 = this.method2897(arg2, arg0 + 27546);
        if (var8.field5775 != null) {
            var7 = new class642[var8.field5775.length];
            for (int var9 = 0; var9 < var7.length; var9++) {
                class603 var10 = arg3.method1308(30, var8.field5775[var9]);
                var7[var9] = new class642(var10.field8241, var10.field8231, var10.field8232, var10.field8234, var10.field8235, var10.field8227, var10.field8233, var10.field8240);
            }
        }
        return new class147(var8.field5779, var7, var8.field5774, arg4, arg1, arg5);
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(I)V")
    public final void method2899(int arg0) {
        field6899++;
        if (arg0 != 256) {
            this.method2900(false);
        }
        class560 var2 = this.field6898;
        synchronized (this.field6898) {
            this.field6898.method3144(true);
        }
    }

    @OriginalMember(owner = "client!iba", name = "a", descriptor = "(Z)V")
    public final void method2900(boolean arg0) {
        field6904++;
        class560 var2 = this.field6898;
        synchronized (this.field6898) {
            this.field6898.method3142(arg0);
        }
    }

    @OriginalMember(owner = "client!iba", name = "<init>", descriptor = "(Luea;ILpq;)V")
    public class512(class484 arg0, int arg1, class159 arg2) {
        this.field6901 = arg2;
        this.field6901.method1076(29, 0);
    }
}
