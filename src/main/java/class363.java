import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lb")
public class class363 {

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "I")
    public int field5449 = 0;

    @OriginalMember(owner = "client!lb", name = "b", descriptor = "I")
    public int field5450 = 0;

    @OriginalMember(owner = "client!lb", name = "h", descriptor = "Ldc;")
    private class5 field5456 = new class5(64);

    @OriginalMember(owner = "client!lb", name = "j", descriptor = "Lim;")
    private class385 field5458 = null;

    @OriginalMember(owner = "client!lb", name = "f", descriptor = "Lhe;")
    private class239 field5454;

    @OriginalMember(owner = "client!lb", name = "d", descriptor = "Lhe;")
    private class239 field5452;

    @OriginalMember(owner = "client!lb", name = "e", descriptor = "Lgn;")
    public static class475 field5453 = new class475(22, 2);

    @OriginalMember(owner = "client!lb", name = "n", descriptor = "I")
    public static int field5462 = 0;

    @OriginalMember(owner = "client!lb", name = "o", descriptor = "[I")
    public static int[] field5463 = new int[2048];

    @OriginalMember(owner = "client!lb", name = "c", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!lb", name = "g", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!lb", name = "i", descriptor = "I")
    public static int field5457;

    @OriginalMember(owner = "client!lb", name = "k", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!lb", name = "m", descriptor = "I")
    public static int field5461;

    @OriginalMember(owner = "client!lb", name = "l", descriptor = "[[[Lhg;")
    public static class468[][][] field5460;

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(II)Lon;")
    public final class211 method2212(int arg0, int arg1) {
        field5455++;
        class211 var3 = (class211) this.field5456.method40(0, (long) arg0);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg0 >= 32768) {
            var4 = this.field5454.method1470(4, arg0 & 0x7FFF, 1);
        } else {
            var4 = this.field5452.method1470(arg1 ^ 0xE4D92E78, arg0, 1);
        }
        class211 var5 = new class211();
        var5.field2999 = this;
        if (arg1 != -455528836) {
            return null;
        }
        if (var4 != null) {
            var5.method1310(new class156(var4), 18);
        }
        if (arg0 >= 32768) {
            var5.method1305(-15492);
        }
        this.field5456.method36(arg1 + 455507876, var5, (long) arg0);
        return var5;
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIILpp;)Lvg;")
    public static final class37 method2213(int arg0, int arg1, int arg2, class256 arg3) {
        field5461++;
        if (arg0 != 926723216) {
            method2215(118, 96, -109, -20, null);
        }
        int var4 = arg3.field3675 | arg2 << 8;
        class37 var5 = (class37) class280.field3989.method2322(false, (long) var4 << 16);
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = class336.field4868.method1465(0, class336.field4868.method1463(true, var4));
        if (var6 == null) {
            int var8 = arg3.field3675 | arg1 + 65536 << 8;
            class37 var9 = (class37) class280.field3989.method2322(false, (long) var8 << 16);
            if (var9 != null) {
                return var9;
            }
            byte[] var10 = class336.field4868.method1465(0, class336.field4868.method1463(true, var8));
            if (var10 == null) {
                int var12 = arg3.field3675 | 0xFFFF00;
                class37 var13 = (class37) class280.field3989.method2322(false, (long) var12 << 16);
                if (var13 != null) {
                    return var13;
                }
                byte[] var14 = class336.field4868.method1465(0, class336.field4868.method1463(true, var12));
                if (var14 == null) {
                    return null;
                } else if (var14.length <= 1) {
                    return null;
                } else {
                    class37 var15 = class327.method1963(0, var14);
                    var15.field572 = arg3;
                    class280.field3989.method2320(var15, (long) var12 << 16, 2592);
                    return var15;
                }
            } else if (var10.length <= 1) {
                return null;
            } else {
                class37 var11 = class327.method1963(arg0 ^ 0x373CAC90, var10);
                var11.field572 = arg3;
                class280.field3989.method2320(var11, (long) var8 << 16, 2592);
                return var11;
            }
        } else if (var6.length <= 1) {
            return null;
        } else {
            class37 var7 = class327.method1963(arg0 - 926723216, var6);
            var7.field572 = arg3;
            class280.field3989.method2320(var7, (long) var4 << 16, 2592);
            return var7;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(Z)V")
    public static void method2214(boolean arg0) {
        field5463 = null;
        field5460 = null;
        field5453 = null;
        if (!arg0) {
            method2214(false);
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "(IIIILvh;)V")
    public static final void method2215(int arg0, int arg1, int arg2, int arg3, class231 arg4) {
        field5451++;
        long var5 = (long) (arg1 | arg3 << 14 | arg0 << 28);
        class414 var7 = (class414) class473.field6838.method2310((byte) -91, var5);
        if (var7 == null) {
            class414 var8 = new class414();
            class473.field6838.method2317(-1, var5, var8);
            var8.field6139.method2086((byte) -120, arg4);
            return;
        }
        class361 var9 = class405.field5947.method1162(arg4.field3226, 0);
        int var10 = var9.field5352;
        if (var9.field5401 == 1) {
            var10 = (arg4.field3228 + 1) * var10;
        }
        for (class231 var11 = (class231) var7.field6139.method2096(-21400); var11 != null; var11 = (class231) var7.field6139.method2084((byte) 19)) {
            class361 var12 = class405.field5947.method1162(var11.field3226, 0);
            int var13 = var12.field5352;
            if (var12.field5401 == 1) {
                var13 = (var11.field3228 + 1) * var13;
            }
            if (var13 < var10) {
                class52.method385(0, arg4, var11);
                return;
            }
        }
        var7.field6139.method2086((byte) -120, arg4);
        if (arg2 < 100) {
            field5463 = null;
        }
    }

    @OriginalMember(owner = "client!lb", name = "a", descriptor = "([IIJLak;)Ljava/lang/String;")
    public final String method2216(int[] arg0, int arg1, long arg2, class222 arg3) {
        field5459++;
        if (arg1 != 0) {
            return null;
        }
        if (this.field5458 != null) {
            String var6 = this.field5458.method2319(-15965, arg2, arg3, arg0);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!lb", name = "<init>", descriptor = "(ILhe;Lhe;Lim;)V")
    public class363(int arg0, class239 arg1, class239 arg2, class385 arg3) {
        this.field5458 = arg3;
        this.field5454 = arg2;
        this.field5452 = arg1;
        if (this.field5452 != null) {
            this.field5449 = this.field5452.method1473(4309, 1);
        }
        if (this.field5454 != null) {
            this.field5450 = this.field5454.method1473(4309, 1);
        }
    }
}
