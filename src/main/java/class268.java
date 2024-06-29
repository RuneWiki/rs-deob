import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class268 {

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
    public int field3382 = 0;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public int field3386 = 0;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "Lpca;")
    private class653 field3389 = new class653(64);

    @OriginalMember(owner = "client!nba", name = "l", descriptor = "Loo;")
    private class570 field3391 = null;

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "Ljo;")
    private class303 field3381;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "Ljo;")
    private class303 field3385;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "I")
    public static int field3380 = 0;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "I")
    public static int field3387;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "I")
    public static int field3388;

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "I")
    public static int field3390;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIBI)V", line = 8)
    public static final void method1513(int arg0, int arg1, byte arg2, int arg3) {
        field3383++;
        int var4 = arg0 + class682.field9685;
        int var5 = class146.field1642 + arg3;
        if (class97.field1074 == null || arg0 < 0 || arg3 < 0 || class399.field5338 <= arg0 || class349.field4567 <= arg3) {
            return;
        }
        long var6 = (long) (var4 | var5 << 14 | arg1 << 28);
        class43 var8 = (class43) class152.field1725.method3234((byte) -32, var6);
        if (var8 == null) {
            class499.method2873(arg1, arg0, arg3);
            return;
        }
        if (arg2 != -65) {
            field3390 = -120;
        }
        class232 var9 = (class232) var8.field451.method3174((byte) 49);
        if (var9 == null) {
            class499.method2873(arg1, arg0, arg3);
            return;
        }
        class489 var10 = (class489) class499.method2873(arg1, arg0, arg3);
        if (var10 == null) {
            var10 = new class489();
        } else {
            var10.field7096 = var10.field7092 = -1;
        }
        var10.field7090 = var9.field2951;
        var10.field7088 = var9.field2958;
        label51: while (true) {
            class232 var11 = (class232) var8.field451.method3168(false);
            if (var11 == null) {
                break;
            }
            if (var10.field7088 != var11.field2958) {
                var10.field7096 = var11.field2958;
                var10.field7093 = var11.field2951;
                while (true) {
                    class232 var12 = (class232) var8.field451.method3168(false);
                    if (var12 == null) {
                        break label51;
                    }
                    if (var10.field7088 != var12.field2958 && var10.field7096 != var12.field2958) {
                        var10.field7099 = var12.field2951;
                        var10.field7092 = var12.field2958;
                    }
                }
            }
        }
        int var13 = class363.method1995(arg1, (arg3 << 9) + 256, -1327568407, (arg0 << 9) + 256);
        class471.method2674(arg1, arg0, arg3, var13, var10);
    }

    @OriginalMember(owner = "client!nba", name = "<init>", descriptor = "(ILjo;Ljo;Loo;)V", line = 198)
    public class268(int arg0, class303 arg1, class303 arg2, class570 arg3) {
        this.field3391 = arg3;
        this.field3381 = arg2;
        this.field3385 = arg1;
        if (this.field3385 != null) {
            this.field3386 = this.field3385.method1727(-77, 1);
        }
        if (this.field3381 != null) {
            this.field3382 = this.field3381.method1727(-77, 1);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B[ILfv;J)Ljava/lang/String;", line = 100)
    public final String method1514(byte arg0, int[] arg1, class108 arg2, long arg3) {
        field3384++;
        if (arg0 > -63) {
            return null;
        }
        if (this.field3391 != null) {
            String var6 = this.field3391.method2991(arg3, (byte) -124, arg2, arg1);
            if (var6 != null) {
                return var6;
            }
        }
        return Long.toString(arg3);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(II)Llc;", line = 130)
    public static final class590 method1515(int arg0, int arg1) {
        field3388++;
        class590[] var2 = class645.method3620((byte) -121);
        if (arg1 < 102) {
            field3380 = -59;
        }
        for (int var3 = 0; var3 < var2.length; var3++) {
            class590 var4 = var2[var3];
            if (var4.field8391 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(II)Lbaa;", line = 157)
    public final class477 method1516(int arg0, int arg1) {
        field3387++;
        class477 var3 = (class477) this.field3389.method3690((byte) 119, (long) arg1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4;
        if (arg1 < 32768) {
            var4 = this.field3385.method1719(arg1, 1, 4);
        } else {
            var4 = this.field3381.method1719(arg1 & 0x7FFF, 1, 4);
        }
        class477 var5 = new class477();
        var5.field6949 = this;
        if (var4 != null) {
            var5.method2788(-1, new class452(var4));
        }
        if (arg1 >= 32768) {
            var5.method2781((byte) 125);
        }
        if (arg0 != 0) {
            this.field3385 = null;
        }
        this.field3389.method3683(var5, (byte) 108, (long) arg1);
        return var5;
    }
}
