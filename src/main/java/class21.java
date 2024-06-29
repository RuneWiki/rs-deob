import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class21 implements class370 {

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field229 = -1;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "Ljava/lang/String;")
    public static String field231 = null;

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "I")
    public static int field232;

    @OriginalMember(owner = "client!pf", name = "g", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!pf", name = "h", descriptor = "Lpl;")
    public static class162 field234;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "Lqs;")
    public static class496 field227;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "([ILrr;IJ)Ljava/lang/String;")
    public final String method110(int[] arg0, class280 arg1, int arg2, long arg3) {
        field230++;
        if (class324.field5081 == arg1) {
            class525 var6 = class75.field1310.method1827(arg0[0], -108);
            return var6.method3110((byte) 125, (int) arg3);
        } else if (arg2 != 0) {
            return null;
        } else if (class208.field3271 == arg1 || class355.field5544 == arg1) {
            class104 var7 = class20.field218.method2221((int) arg3, -1);
            return var7.field1771;
        } else if (class106.field1826 == arg1 || class476.field7042 == arg1 || class173.field2770 == arg1) {
            return class75.field1310.method1827(arg0[0], -58).method3110((byte) 116, (int) arg3);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BI)Lsr;")
    public static final class430 method111(byte arg0, int arg1) {
        int var2 = -101 / ((arg0 - 50) / 49);
        field232++;
        class78[] var3 = class219.field3788;
        synchronized (class219.field3788) {
            class430 var4;
            if (arg1 >= class219.field3788.length || class219.field3788[arg1].method565((byte) 99)) {
                var4 = new class430();
                var4.field6447 = new class273[arg1];
                for (int var5 = 0; var5 < arg1; var5++) {
                    var4.field6447[var5] = new class273();
                }
            } else {
                var4 = (class430) class219.field3788[arg1].method575(0);
                var4.method695(17);
                int var10002 = class422.field6377[arg1]--;
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(B)V")
    public static final void method112(byte arg0) {
        if (class177.field2811 != null) {
            class177.field2811.method533(123);
        }
        if (arg0 != -12) {
            method113(15);
        }
        field233++;
        if (class429.field6435 != null) {
            class429.field6435.method533(127);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method113(int arg0) {
        field231 = null;
        field234 = null;
        field227 = null;
        if (arg0 <= 46) {
            field229 = -57;
        }
    }
}
