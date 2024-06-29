import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class426 extends class225 {

    @OriginalMember(owner = "client!rk", name = "I", descriptor = "I")
    public int field6289 = 0;

    @OriginalMember(owner = "client!rk", name = "y", descriptor = "Z")
    public static volatile boolean field6280 = true;

    @OriginalMember(owner = "client!rk", name = "z", descriptor = "[I")
    public static int[] field6281 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!rk", name = "B", descriptor = "Ljava/lang/String;")
    public static String field6283 = "shake:";

    @OriginalMember(owner = "client!rk", name = "E", descriptor = "[S")
    public static short[] field6286 = new short[256];

    @OriginalMember(owner = "client!rk", name = "w", descriptor = "I")
    public static int field6278;

    @OriginalMember(owner = "client!rk", name = "x", descriptor = "I")
    public static int field6279;

    @OriginalMember(owner = "client!rk", name = "A", descriptor = "I")
    public static int field6282;

    @OriginalMember(owner = "client!rk", name = "C", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!rk", name = "F", descriptor = "I")
    public static int field6287;

    @OriginalMember(owner = "client!rk", name = "H", descriptor = "I")
    public static int field6288;

    @OriginalMember(owner = "client!rk", name = "J", descriptor = "I")
    public static int field6290;

    @OriginalMember(owner = "client!rk", name = "D", descriptor = "Llm;")
    public static class347 field6285;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZLnj;)V")
    public final void method2704(boolean arg0, class228 arg1) {
        field6290++;
        while (true) {
            int var3 = arg1.method1348(-98);
            if (var3 == 0) {
                if (arg0) {
                    return;
                } else {
                    method2710(false, 44, 87);
                    return;
                }
            }
            this.method2707(var3, arg1, (byte) 84);
        }
    }

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "(I)V")
    public static final void method2705(int arg0) {
        for (int var1 = -1; var1 < class65.field861; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class229.field3071[var1];
            }
            class25 var3 = class206.field2777[var2];
            if (var3 != null) {
                class157.method973(var3.method168(-110), var3, 55);
            }
        }
        if (arg0 >= -53) {
            field6281 = null;
        }
        field6282++;
    }

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "(BI)Lpr;")
    public static final class300 method2706(byte arg0, int arg1) {
        field6288++;
        class189 var2 = class52.field713;
        class300 var3;
        synchronized (class52.field713) {
            var3 = (class300) class52.field713.method1137((long) arg1, 2108653711);
        }
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class312.field4573.method2261(class212.method1261(arg1, (byte) 35), class250.method1515((byte) 117, arg1), 104);
        class300 var5 = new class300();
        var5.field4387 = arg1;
        if (arg0 != 11) {
            field6281 = null;
        }
        if (var4 != null) {
            var5.method2051(new class228(var4), (byte) -98);
        }
        class189 var6 = class52.field713;
        synchronized (class52.field713) {
            class52.field713.method1144((long) arg1, var5, -3480);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ILnj;B)V")
    private final void method2707(int arg0, class228 arg1, byte arg2) {
        if (arg0 == 2) {
            this.field6289 = arg1.method1343(255);
        }
        int var4 = -21 % ((arg2 - 3) / 46);
        field6278++;
    }

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "(I)V")
    public static final void method2708(int arg0) {
        if (arg0 <= 88) {
            method2705(-67);
        }
        field6287++;
        if (class83.field1200) {
            return;
        }
        if (class184.field2496) {
            class396.field5847 = (float) ((int) class396.field5847 - 65 & 0xFFFFFF80);
        } else {
            class178.field2361 += (-24.0F - class178.field2361) / 2.0F;
        }
        class172.field2303 = true;
        class83.field1200 = true;
    }

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "(I)V")
    public static void method2709(int arg0) {
        if (arg0 < -120) {
            field6285 = null;
            field6286 = null;
            field6283 = null;
            field6281 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(ZII)V")
    public static final void method2710(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field6281 = null;
        }
        field6284++;
        class263 var3 = class47.method337(12, 0, arg2);
        var3.method1807((byte) -121);
        var3.field3813 = arg1;
    }
}
