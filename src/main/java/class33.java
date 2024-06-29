import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tfa")
public class class33 implements class300 {

    @OriginalMember(owner = "client!tfa", name = "f", descriptor = "Ljava/lang/String;")
    private String field432;

    @OriginalMember(owner = "client!tfa", name = "g", descriptor = "Lfp;")
    private class323 field433;

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "Z")
    public static boolean field429 = false;

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "Z")
    public static boolean field430 = false;

    @OriginalMember(owner = "client!tfa", name = "j", descriptor = "I")
    public static int field436 = 0;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "I")
    public static int field428;

    @OriginalMember(owner = "client!tfa", name = "e", descriptor = "I")
    public static int field431;

    @OriginalMember(owner = "client!tfa", name = "h", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "Lmda;")
    public static class263 field427;

    @OriginalMember(owner = "client!tfa", name = "i", descriptor = "[I")
    public static int[] field435;

    @OriginalMember(owner = "client!tfa", name = "b", descriptor = "(I)Ldn;")
    public final class516 method149(int arg0) {
        int var2 = -51 % ((arg0 + 19) / 60);
        field434++;
        return class516.field7355;
    }

    @OriginalMember(owner = "client!tfa", name = "c", descriptor = "(I)V")
    public static final void method192(int arg0) {
        field431++;
        class470.field6672.method791(5, 587437728);
        class181.field2416.method2190((byte) -106, 5);
        class606.field8530.method2009((byte) 48, 5);
        class612.field8588.method552(5, 8);
        class231.field3110.method2796((byte) -78, 5);
        class682.field9361.method3416(5, (byte) 39);
        class343.field4785.method3522((byte) -117, 5);
        class220.field2879.method973(126, 5);
        int var1 = -112 / (arg0 / 63);
        class130.field1568.method174(5, (byte) 17);
        class472.field6696.method4043((byte) -31, 5);
        class200.field2638.method3510(5, (byte) -83);
        class569.field8079.method3093((byte) -103, 5);
        class48.field564.method1415(5, (byte) -79);
        class605.field8497.method158(5, (byte) 62);
        class70.field890.method1202(2341, 5);
        class192.field2556.method1977(5, -128);
        class6.field64.method3771(true, 5);
        class538.field7542.method202(5, 0);
        class30.field404.method3839(5, (byte) 88);
        class116.field1417.method1358(-110, 5);
        class456.method2709(true, 5);
        class90.method679(50, false);
        class20.method124(4096, 50);
        class608.method3427(5, 15700);
        class67.method554((byte) -121, 5);
        class180.field2406.method4016(5, (byte) -73);
        class272.field3890.method4016(5, (byte) -73);
        class378.field5300.method4016(5, (byte) -73);
        class723.field10076.method4016(5, (byte) -73);
        class241.field3229.method4016(5, (byte) -73);
    }

    @OriginalMember(owner = "client!tfa", name = "a", descriptor = "(I)I")
    public final int method146(int arg0) {
        field428++;
        if (this.field433.method2104(this.field432, (byte) 120)) {
            return 100;
        } else {
            if (arg0 != 6340) {
                this.field432 = null;
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!tfa", name = "<init>", descriptor = "(Lfp;Ljava/lang/String;)V")
    public class33(class323 arg0, String arg1) {
        this.field432 = arg1;
        this.field433 = arg0;
    }

    @OriginalMember(owner = "client!tfa", name = "d", descriptor = "(I)V")
    public static void method193(int arg0) {
        field435 = null;
        field427 = null;
        if (arg0 <= 26) {
            field430 = false;
        }
    }
}
