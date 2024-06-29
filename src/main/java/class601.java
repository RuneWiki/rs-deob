import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public class class601 {

    @OriginalMember(owner = "client!bha", name = "r", descriptor = "Ljda;")
    private class239 field8180 = new class239(64);

    @OriginalMember(owner = "client!bha", name = "s", descriptor = "Ljda;")
    public class239 field8181 = new class239(50);

    @OriginalMember(owner = "client!bha", name = "v", descriptor = "Ljda;")
    public class239 field8184 = new class239(5);

    @OriginalMember(owner = "client!bha", name = "f", descriptor = "Lgia;")
    public class285 field8168;

    @OriginalMember(owner = "client!bha", name = "n", descriptor = "Z")
    public boolean field8176;

    @OriginalMember(owner = "client!bha", name = "o", descriptor = "Laj;")
    private class333 field8177;

    @OriginalMember(owner = "client!bha", name = "j", descriptor = "Laj;")
    public class333 field8172;

    @OriginalMember(owner = "client!bha", name = "l", descriptor = "[I")
    public static int[] field8174 = new int[14];

    @OriginalMember(owner = "client!bha", name = "m", descriptor = "[S")
    private static short[] field8175 = new short[] { -10304, 9104, 25485, 4620, 4540 };

    @OriginalMember(owner = "client!bha", name = "e", descriptor = "[S")
    private static short[] field8167 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!bha", name = "p", descriptor = "[S")
    private static short[] field8178 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!bha", name = "k", descriptor = "[[S")
    public static short[][] field8173 = new short[][] { field8167, field8175, field8178 };

    @OriginalMember(owner = "client!bha", name = "t", descriptor = "I")
    public static int field8182 = 0;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "I")
    public static int field8163;

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "I")
    public static int field8164;

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "I")
    public static int field8165;

    @OriginalMember(owner = "client!bha", name = "d", descriptor = "I")
    public static int field8166;

    @OriginalMember(owner = "client!bha", name = "g", descriptor = "I")
    public static int field8169;

    @OriginalMember(owner = "client!bha", name = "h", descriptor = "I")
    public static int field8170;

    @OriginalMember(owner = "client!bha", name = "i", descriptor = "I")
    public static int field8171;

    @OriginalMember(owner = "client!bha", name = "q", descriptor = "I")
    public static int field8179;

    @OriginalMember(owner = "client!bha", name = "u", descriptor = "I")
    public static int field8183;

    @OriginalMember(owner = "client!bha", name = "w", descriptor = "I")
    public int field8185;

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(BI)Lrea;")
    public final class220 method3338(byte arg0, int arg1) {
        field8183++;
        class239 var3 = this.field8180;
        class220 var4;
        synchronized (this.field8180) {
            var4 = (class220) this.field8180.method1541(-10, (long) arg1);
        }
        if (var4 != null) {
            return var4;
        }
        class333 var5 = this.field8177;
        byte[] var6;
        synchronized (this.field8177) {
            var6 = this.field8177.method2095(class653.method3641(arg1, 110), class254.method1692(arg1, -1196763737), 1);
        }
        int var7 = 6 / ((arg0 - 40) / 52);
        class220 var8 = new class220();
        var8.field2990 = this;
        var8.field2996 = arg1;
        if (var6 != null) {
            var8.method1454(19918, new class376(var6));
        }
        var8.method1450((byte) -123);
        class239 var9 = this.field8180;
        synchronized (this.field8180) {
            this.field8180.method1544(true, var8, (long) arg1);
            return var8;
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(II)V")
    public final void method3339(int arg0, int arg1) {
        field8163++;
        this.field8185 = arg0;
        class239 var3 = this.field8181;
        synchronized (this.field8181) {
            this.field8181.method1555((byte) -3);
        }
        if (arg1 != 100) {
            field8178 = null;
        }
        class239 var4 = this.field8184;
        synchronized (this.field8184) {
            this.field8184.method1555((byte) -3);
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(B)V")
    public final void method3340(byte arg0) {
        class239 var2 = this.field8181;
        synchronized (this.field8181) {
            if (arg0 > -11) {
                this.field8180 = null;
            }
            this.field8181.method1555((byte) -3);
        }
        field8165++;
        class239 var3 = this.field8184;
        synchronized (this.field8184) {
            this.field8184.method1555((byte) -3);
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(I)V")
    public static final void method3341(int arg0) {
        class763.method4242(class437.field6161, true);
        field8164++;
        class440.field6189++;
        if (class277.field4113 && class662.field9134) {
            int var1 = 0;
            int var2 = 0;
            if (class130.field1934) {
                var1 = class550.method3117(99);
                var2 = class621.method3410(-2);
            }
            int var3 = class304.field4371.method778(0) + var1;
            int var4 = class304.field4371.method777((byte) -116) + var2;
            int var5 = var3 - class94.field1338;
            int var6 = var4 - class662.field9145;
            if (var5 < class473.field6523) {
                var5 = class473.field6523;
            }
            if (arg0 > -124) {
                field8174 = null;
            }
            if (var6 < class691.field9689) {
                var6 = class691.field9689;
            }
            if (class437.field6161.field9282 + var5 > class473.field6523 + class613.field8311.field9282) {
                var5 = class473.field6523 + class613.field8311.field9282 - class437.field6161.field9282;
            }
            if (class691.field9689 + class613.field8311.field9297 < class437.field6161.field9297 + var6) {
                var6 = class691.field9689 + class613.field8311.field9297 - class437.field6161.field9297;
            }
            int var7 = class613.field8311.field9374 + var5 - class473.field6523;
            int var8 = class613.field8311.field9247 + var6 - class691.field9689;
            if (class304.field4371.method3557((byte) -42)) {
                if (class437.field6161.field9386 < class440.field6189) {
                    int var9 = var5 - class184.field2473;
                    int var10 = var6 - class651.field9036;
                    if (class437.field6161.field9319 < var9 || var9 < -class437.field6161.field9319 || class437.field6161.field9319 < var10 || var10 < (-class437.field6161.field9319)) {
                        class376.field5470 = true;
                    }
                }
                if (class437.field6161.field9293 != null && class376.field5470) {
                    class12 var11 = new class12();
                    var11.field181 = var8;
                    var11.field178 = var7;
                    var11.field186 = class437.field6161.field9293;
                    var11.field190 = class437.field6161;
                    class173.method1235(var11);
                    return;
                }
            } else {
                if (class376.field5470) {
                    class701.method3909(0);
                    if (class437.field6161.field9248 != null) {
                        class12 var12 = new class12();
                        var12.field190 = class437.field6161;
                        var12.field189 = class729.field10122;
                        var12.field178 = var7;
                        var12.field181 = var8;
                        var12.field186 = class437.field6161.field9248;
                        class173.method1235(var12);
                    }
                    if (class729.field10122 != null && client.method2021(class437.field6161) != null) {
                        class189.method1309(class437.field6161, (byte) 105, class729.field10122);
                    }
                } else if ((class752.field10419 == 1 || class201.method1366(-124)) && class746.field10297 > 2) {
                    class193.method1329(class662.field9145 + class651.field9036, class94.field1338 + class184.field2473, -123);
                } else if (class633.method3546(true)) {
                    class193.method1329(class662.field9145 + class651.field9036, class94.field1338 + class184.field2473, 106);
                }
                class437.field6161 = null;
            }
        } else if (class440.field6189 > 1) {
            class437.field6161 = null;
        }
    }

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(B)V")
    public final void method3342(byte arg0) {
        field8179++;
        class239 var2 = this.field8180;
        synchronized (this.field8180) {
            this.field8180.method1552(arg0);
            if (arg0 != -128) {
                method3341(-78);
            }
        }
        class239 var3 = this.field8181;
        synchronized (this.field8181) {
            this.field8181.method1552(-121);
        }
        class239 var4 = this.field8184;
        synchronized (this.field8184) {
            this.field8184.method1552(-123);
        }
    }

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(II)V")
    public final void method3343(int arg0, int arg1) {
        class239 var3 = this.field8180;
        synchronized (this.field8180) {
            this.field8180.method1546(arg1, (byte) -8);
            int var4 = 50 % ((72 - arg0) / 51);
        }
        field8170++;
        class239 var5 = this.field8181;
        synchronized (this.field8181) {
            this.field8181.method1546(arg1, (byte) -8);
        }
        class239 var6 = this.field8184;
        synchronized (this.field8184) {
            this.field8184.method1546(arg1, (byte) -8);
        }
    }

    @OriginalMember(owner = "client!bha", name = "b", descriptor = "(I)V")
    public static void method3344(int arg0) {
        field8175 = null;
        field8178 = null;
        field8174 = null;
        field8173 = null;
        field8167 = null;
        if (arg0 != -1) {
            method3341(73);
        }
    }

    @OriginalMember(owner = "client!bha", name = "c", descriptor = "(I)V")
    public final void method3345(int arg0) {
        field8171++;
        class239 var2 = this.field8180;
        synchronized (this.field8180) {
            this.field8180.method1555((byte) -3);
        }
        int var3 = 37 / ((arg0 - 64) / 61);
        class239 var4 = this.field8181;
        synchronized (this.field8181) {
            this.field8181.method1555((byte) -3);
        }
        class239 var5 = this.field8184;
        synchronized (this.field8184) {
            this.field8184.method1555((byte) -3);
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(BZ)V")
    public final void method3346(byte arg0, boolean arg1) {
        int var3 = 121 / ((-arg0 - 11) / 63);
        field8169++;
        if (arg1 != this.field8176) {
            this.field8176 = arg1;
            this.method3345(-47);
        }
    }

    @OriginalMember(owner = "client!bha", name = "a", descriptor = "(Z)I")
    public static final int method3347(boolean arg0) {
        field8166++;
        class65 var1 = class379.field5542;
        boolean var2 = false;
        if (class712.field9959.field1270.method4293(88) != 0) {
            Canvas var3 = new Canvas();
            var3.setSize(100, 100);
            var2 = true;
            var1 = class11.method89(0, null, null, (byte) -83, 0, var3);
        }
        long var4 = class302.method1910(0);
        for (int var6 = 0; var6 < 10000; var6++) {
            var1.method537(5, 10, 100, 75, 50, 100, 15, 90, 100, -65536, -65536, -65536, 1);
        }
        if (!arg0) {
            method3341(31);
        }
        int var7 = (int) (class302.method1910(0) - var4);
        var1.method462(57, 100, 0, 100, 0, -16777216);
        if (var2) {
            var1.method470((byte) 120);
        }
        return var7;
    }

    @OriginalMember(owner = "client!bha", name = "<init>", descriptor = "(Lgia;IZLaj;Laj;)V")
    public class601(class285 arg0, int arg1, boolean arg2, class333 arg3, class333 arg4) {
        this.field8168 = arg0;
        this.field8176 = arg2;
        this.field8177 = arg3;
        this.field8172 = arg4;
        if (this.field8177 != null) {
            int var6 = this.field8177.method2094((byte) -115) - 1;
            this.field8177.method2090(var6, false);
        }
    }
}
