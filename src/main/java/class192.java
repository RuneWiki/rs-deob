import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class192 implements class711 {

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "Lin;")
    private class91 field2853;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "Ljava/lang/String;")
    private String field2846;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "J")
    public static long field2851 = 20000000L;

    @OriginalMember(owner = "client!kk", name = "e", descriptor = "I")
    public static int field2844 = 0;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "[F")
    public static float[] field2840 = new float[16];

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "[I")
    public static int[] field2848 = new int[] { 104, 120, 136, 168 };

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "Lmu;")
    public static class303 field2847 = new class303(76, 6);

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!kk", name = "d", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field2845;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "I")
    public static int field2852;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field2854;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "Lsb;")
    public static class293 field2850;

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)V")
    public static void method1375(byte arg0) {
        field2840 = null;
        field2848 = null;
        if (arg0 != -128) {
            method1378(113, -98);
        }
        field2847 = null;
        field2850 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(II)Lqj;")
    public static final class510 method1376(int arg0, int arg1) {
        field2845++;
        class510 var2 = (class510) class111.field1919.method992((long) arg1, -104);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class524.field7264.method863(-1860, 0, arg1);
        if (arg0 != 104) {
            method1375((byte) 98);
        }
        class510 var4 = new class510();
        if (var3 != null) {
            var4.method2988(arg1, new class215(var3), (byte) 64);
        }
        class111.field1919.method991(var4, (long) arg1, (byte) -114);
        return var4;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(I)I")
    public final int method1377(int arg0) {
        int var2 = -62 / ((arg0 + 43) / 62);
        field2842++;
        return this.field2853.method869((byte) -74, this.field2846) ? 100 : 0;
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(II)V")
    public static final void method1378(int arg0, int arg1) {
        field2843++;
        class594 var2 = class692.method3869(arg1, (byte) 105, arg0);
        var2.method3383(arg0 ^ 0xFFFFC14F);
    }

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)Lkea;")
    public final class239 method1379(int arg0) {
        field2849++;
        if (arg0 != -15004) {
            field2840 = null;
        }
        return class239.field3490;
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lin;Ljava/lang/String;)V")
    public class192(class91 arg0, String arg1) {
        this.field2853 = arg0;
        this.field2846 = arg1;
    }
}
