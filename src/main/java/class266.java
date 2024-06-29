import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class266 extends class211 {

    @OriginalMember(owner = "client!eb", name = "W", descriptor = "I")
    public static int field4099 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!eb", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field4101 = null;

    @OriginalMember(owner = "client!eb", name = "eb", descriptor = "I")
    public static int field4104 = 0;

    @OriginalMember(owner = "client!eb", name = "ib", descriptor = "[Luc;")
    public static class130[] field4108 = new class130[0];

    @OriginalMember(owner = "client!eb", name = "jb", descriptor = "I")
    public static volatile int field4109 = 0;

    @OriginalMember(owner = "client!eb", name = "cb", descriptor = "Ljava/lang/String;")
    public static String field4102 = "Starting 3d Library";

    @OriginalMember(owner = "client!eb", name = "db", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!eb", name = "fb", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!eb", name = "hb", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!eb", name = "kb", descriptor = "I")
    public static int field4110;

    @OriginalMember(owner = "client!eb", name = "gb", descriptor = "Lrk;")
    public static class252 field4106;

    @OriginalMember(owner = "client!eb", name = "ab", descriptor = "Lwf;")
    public static class306 field4100;

    @OriginalMember(owner = "client!eb", name = "lb", descriptor = "Lwf;")
    public static class306 field4111;

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lwf;BLwf;)V", line = 4)
    public static final void method1761(class306 arg0, byte arg1, class306 arg2) {
        class285.field4374 = arg2;
        class82.field1227 = arg0;
        field4103++;
        if (arg1 > -68) {
            method1764((class306) null, (class306) null, (byte) -40);
        }
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IB)[[I", line = 28)
    public final int[][] method170(int arg0, byte arg1) {
        field4110++;
        if (arg1 != 68) {
            method1761((class306) null, (byte) -91, (class306) null);
        }
        int[][] var3 = this.field4200.method539(arg1 ^ 0xDC, arg0);
        if (this.field4200.field1147 && this.method1416((byte) -127)) {
            int[] var4 = var3[0];
            int[] var5 = var3[2];
            int var6 = arg0 % this.field3351 * this.field3351;
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class27.field346; var8++) {
                int var9 = this.field3350[var8 % this.field3346 + var6];
                var5[var8] = class311.method2135(var9, 255) << 4;
                var7[var8] = class311.method2135(65280, var9) >> 4;
                var4[var8] = class311.method2135(var9 >> 12, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(IILwf;I)[Lph;", line = 80)
    public static final class79[] method1762(int arg0, int arg1, class306 arg2, int arg3) {
        if (arg3 != 375096908) {
            method1764((class306) null, (class306) null, (byte) -113);
        }
        field4107++;
        return class156.method1093(true, arg0, arg1, arg2) ? class164.method1121(false) : null;
    }

    @OriginalMember(owner = "client!eb", name = "e", descriptor = "(I)V", line = 99)
    public static void method1763(int arg0) {
        field4100 = null;
        field4106 = null;
        if (arg0 != 18195) {
            method1762(88, 107, (class306) null, 73);
        }
        field4101 = null;
        field4108 = null;
        field4111 = null;
        field4102 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Lwf;Lwf;B)V", line = 117)
    public static final void method1764(class306 arg0, class306 arg1, byte arg2) {
        if (arg2 <= 99) {
            field4101 = (String) null;
        }
        class264.field4067 = arg1;
        field4105++;
        class136.field2111 = arg0;
    }
}
