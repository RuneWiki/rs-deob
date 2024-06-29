import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qia")
public class class21 {

    @OriginalMember(owner = "client!qia", name = "c", descriptor = "Lqia;")
    public static class21 field377 = new class21();

    @OriginalMember(owner = "client!qia", name = "d", descriptor = "Lqia;")
    public static class21 field378 = new class21();

    @OriginalMember(owner = "client!qia", name = "e", descriptor = "Lqia;")
    public static class21 field379 = new class21();

    @OriginalMember(owner = "client!qia", name = "f", descriptor = "Lqia;")
    public static class21 field380 = new class21();

    @OriginalMember(owner = "client!qia", name = "h", descriptor = "Lhg;")
    public static class693 field382 = new class693(52, 4);

    @OriginalMember(owner = "client!qia", name = "i", descriptor = "Lbp;")
    public static class389 field383 = new class389();

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "I")
    public static int field375;

    @OriginalMember(owner = "client!qia", name = "b", descriptor = "I")
    public static int field376;

    @OriginalMember(owner = "client!qia", name = "j", descriptor = "I")
    public static int field384;

    @OriginalMember(owner = "client!qia", name = "k", descriptor = "I")
    public static int field385;

    @OriginalMember(owner = "client!qia", name = "g", descriptor = "Loba;")
    public static class264 field381;

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(I)V")
    public static void method134(int arg0) {
        field380 = null;
        if (arg0 != 0) {
            method136((byte) 31, null);
        }
        field381 = null;
        field378 = null;
        field379 = null;
        field382 = null;
        field377 = null;
        field383 = null;
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(Lua;)V")
    public static final void method135(class667 arg0) {
        if (class178.field2498 >= 65535) {
            return;
        }
        class123 var1 = arg0.field9381;
        class58.field808[class178.field2498] = arg0;
        class592.field8277[class178.field2498] = false;
        class178.field2498++;
        int var2 = arg0.field9375;
        if (arg0.field9361) {
            var2 = 0;
        }
        int var3 = arg0.field9375;
        if (arg0.field9372) {
            var3 = class29.field515 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method938(0) + class139.field1991 - var1.method935(0) >> class480.field6531;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method938(0) + var1.method935(0) - class139.field1991 >> class480.field6531;
            if (var7 >= class463.field6223) {
                var7 = class463.field6223 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field9376[var5++];
                int var10 = (var1.method932(-16562) + class139.field1991 - var1.method935(0) >> class480.field6531) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class289.field3784) {
                    var11 = class289.field3784 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class454.field6070[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class454.field6070[var4][var12][var8] = var13 | (long) class178.field2498;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class454.field6070[var4][var12][var8] = var13 | (long) class178.field2498 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class454.field6070[var4][var12][var8] = var13 | (long) class178.field2498 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class454.field6070[var4][var12][var8] = var13 | (long) class178.field2498 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qia", name = "a", descriptor = "(BLvl;)V")
    public static final void method136(byte arg0, class13 arg1) {
        int var2 = -48 / ((arg0 - 36) / 38);
        if ((arg1 instanceof class733)) {
            class733 var4 = (class733) arg1;
            if (var4.field10192 != null) {
                class747.method4159(37, class380.field4847.field5796 != var4.field5796, var4);
            }
        } else if (arg1 instanceof class724) {
            class724 var3 = (class724) arg1;
            class582.method3313(class380.field4847.field5796 != var3.field5796, var3, -85);
        }
        field375++;
    }

    @OriginalMember(owner = "client!qia", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field376++;
        throw new IllegalStateException();
    }
}
