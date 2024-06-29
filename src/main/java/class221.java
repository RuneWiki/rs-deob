import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public abstract class class221 extends class3 {

    @OriginalMember(owner = "client!te", name = "H", descriptor = "Lok;")
    public static class41 field3526 = class137.method956("Update)2Liste geladen)3", 45);

    @OriginalMember(owner = "client!te", name = "I", descriptor = "Lok;")
    public static class41 field3527 = class137.method956("m", 45);

    @OriginalMember(owner = "client!te", name = "F", descriptor = "I")
    public static int field3524;

    @OriginalMember(owner = "client!te", name = "G", descriptor = "I")
    public static int field3525;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "(I)Z", line = 10)
    public static final boolean method1584(int arg0) {
        field3524++;
        class189 var1 = class248.field3960;
        synchronized (class248.field3960) {
            if (class308.field5188 == class285.field4623) {
                return false;
            } else {
                class18.field239 = class10.field132[class308.field5188];
                class136.field2017 = class232.field3671[class308.field5188];
                class308.field5188 = class308.field5188 + 1 & arg0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "g", descriptor = "(I)V", line = 43)
    public static void method1585(int arg0) {
        if (arg0 > -29) {
            method1586(18, -111, -66, 114);
        }
        field3527 = null;
        field3526 = null;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(IIII)I", line = 55)
    public static final int method1586(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= 52) {
            field3526 = (class41) null;
        }
        field3525++;
        int var4 = class31.field447[class19.method101(arg2, arg1)];
        if (arg0 > 0) {
            int var5 = class31.field461.method691(arg0 & 0xFFFF, (byte) 118);
            if (var5 != 0) {
                int var6;
                if (arg1 < 0) {
                    var6 = 0;
                } else if (arg1 <= 127) {
                    var6 = arg1 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) + ((var4 & 0xFF00FF) * var8 + (var6 & 0xFF00FF) * var5 & 0xFF00FF00) >> 8;
                }
            }
            int var9 = class31.field461.method695(arg0 & 0xFFFF, 255);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 >> 16 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                int var11 = ((var4 & 0xFF00) >> 8) * var9;
                int var12 = (var4 & 0xFF) * var9;
                if (var12 > 65535) {
                    var12 = 65535;
                }
                if (var11 > 65535) {
                    var11 = 65535;
                }
                var4 = (var11 & 0xFF00) + (var12 >> 8) + (var10 << 8 & 0xFF00AB);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!te", name = "c", descriptor = "(B)Ljava/lang/Object;")
    public abstract Object method710(byte arg0);

    @OriginalMember(owner = "client!te", name = "d", descriptor = "(B)Z")
    public abstract boolean method709(byte arg0);
}
