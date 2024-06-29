import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class151 {

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public int field2259 = 0;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public int field2267 = 0;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "Ld;")
    private class242 field2265 = new class242(64);

    @OriginalMember(owner = "client!be", name = "m", descriptor = "Lfu;")
    private class373 field2268 = null;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "Lum;")
    private class83 field2264;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "Lum;")
    private class83 field2256;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field2260 = 0;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "[F")
    public static float[] field2263 = new float[4];

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field2258;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    public static int field2266;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "Lum;")
    public static class83 field2261;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)Lrt;")
    public final class133 method1083(int arg0, int arg1) {
        field2258++;
        class133 var3 = (class133) this.field2265.method1634((long) arg1, 64);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 >= 32768) {
            var4 = this.field2256.method731(0, arg1 & 0x7FFF, 1);
        } else {
            var4 = this.field2264.method731(0, arg1, 1);
        }
        class133 var5 = new class133();
        if (arg0 != 1) {
            field2260 = -119;
        }
        var5.field1956 = this;
        if (var4 != null) {
            var5.method972((byte) -121, new class194(var4));
        }
        if (arg1 >= 32768) {
            var5.method970(21);
        }
        this.field2265.method1623((long) arg1, 17621, var5);
        return var5;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V")
    public static void method1084(byte arg0) {
        field2261 = null;
        if (arg0 != 26) {
            method1087(-8, (byte) -1);
        }
        field2263 = null;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(I[Ljava/lang/Object;[I)V")
    public static final void method1085(int arg0, Object[] arg1, int[] arg2) {
        field2262++;
        class402.method2525(arg2, arg1, (byte) 77, arg2.length - 1, 0);
        if (arg0 != 1) {
            method1087(36, (byte) -105);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "([IJLsc;I)Ljava/lang/String;")
    public final String method1086(int[] arg0, long arg1, class270 arg2, int arg3) {
        field2266++;
        if (arg3 != 0) {
            this.field2265 = null;
        }
        if (this.field2268 != null) {
            String var6 = this.field2268.method2068(arg2, arg1, 1009, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg1);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IB)V")
    public static final void method1087(int arg0, byte arg1) {
        if (class386.field5678 == 0) {
            class192.field2954.method2388(arg0, -105);
        } else {
            class169.field2569 = arg0;
        }
        field2257++;
        int var2 = 47 / ((arg1 - 67) / 51);
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(ILum;Lum;Lfu;)V")
    public class151(int arg0, class83 arg1, class83 arg2, class373 arg3) {
        this.field2268 = arg3;
        this.field2264 = arg1;
        this.field2256 = arg2;
        if (this.field2264 != null) {
            this.field2267 = this.field2264.method748(1, 12408);
        }
        if (this.field2256 != null) {
            this.field2259 = this.field2256.method748(1, 12408);
        }
    }
}
