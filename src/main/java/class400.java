import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class400 extends class594 {

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    private int field5492;

    @OriginalMember(owner = "client!oj", name = "s", descriptor = "I")
    private int field5494;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    private int field5483;

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "Lpj;")
    private class156 field5487;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    private int field5490;

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "I")
    private int field5493;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "I")
    private int field5491;

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Lwv;")
    public static class37 field5488 = new class37(10, 4);

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "I")
    public static int field5486;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "Lks;")
    private class461 field5485;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(BLjava/lang/String;)V")
    public static final void method2462(byte arg0, String arg1) {
        field5484++;
        if (arg1.equals("")) {
            return;
        }
        class754.field10412++;
        class312 var2 = class353.method2245(class87.field971, class21.field354, (byte) 108);
        var2.field4445.method2952(arg0 + 61, class348.method2204((byte) -83, arg1));
        if (arg0 != -61) {
            method2463((byte) -35);
        }
        var2.field4445.method2953(arg1, arg0 - 28075);
        class208.method1440(var2, 75);
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(B)V")
    public static void method2463(byte arg0) {
        int var1 = -56 % ((-arg0 - 12) / 58);
        field5488 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(III)I")
    public static final int method2464(int arg0, int arg1, int arg2) {
        field5489++;
        if (class445.field6071 == -1) {
            return 1;
        }
        if (arg0 != class21.field353.field10098.method1588(-110)) {
            class549.method3279(true, (byte) -40, class620.field8674.method3580(class140.field2081, 12), arg0);
            if (arg0 != class21.field353.field10098.method1588(arg1 - 14290)) {
                return -1;
            }
        }
        try {
            Dimension var3 = class629.field8819.getSize();
            class66.method569(-102, class449.field6148, true, class37.field491, class620.field8674.method3580(class140.field2081, arg1 - 14158), class368.field5111);
            class100 var4 = class488.method2912(class286.field4217, (byte) -126, class445.field6071, 0);
            if (arg1 != 14170) {
                method2463((byte) -53);
            }
            long var5 = class459.method2731(arg1 - 14062);
            class37.field491.method511();
            class494.field7044.method1869(0, class556.field7931, 0);
            class37.field491.method550(class494.field7044);
            class37.field491.method503(var3.width / 2, var3.height / 2, 512, 512);
            class37.field491.method515(1.0F);
            class37.field491.method469(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class496 var7 = class37.field491.method480(var4, 2048, 64, 64, 768);
            int var8 = 0;
            label45: for (int var9 = 0; var9 < 500; var9++) {
                class37.field491.method509(0);
                class37.field491.method518();
                for (int var10 = 15; var10 >= 0; var10--) {
                    for (int var11 = 0; var11 <= var10; var11++) {
                        class500.field7104.method1869((int) (((float) var11 - ((float) var10 / 2.0F)) * (float) class109.field1611), 0, (var10 + 1) * class109.field1611);
                        var7.method88(class500.field7104, null, 0);
                        var8++;
                        if ((long) arg2 <= class459.method2731(arg1 - 14070) - var5) {
                            break label45;
                        }
                    }
                }
            }
            class37.field491.method546();
            long var12 = (long) (var8 * 1000) / (class459.method2731(123) - var5);
            class37.field491.method509(0);
            class37.field491.method518();
            return (int) var12;
        } catch (Throwable var15) {
            var15.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!oj", name = "b", descriptor = "(I)Lks;")
    public final class461 method2465(int arg0) {
        field5486++;
        if (arg0 != -1) {
            method2462((byte) 108, null);
        }
        if (this.field5485 == null) {
            class111.field1706[2] = this.field5490;
            class111.field1706[4] = this.field5493;
            class160 var2 = this.field5487.field774;
            class111.field1706[1] = this.field5491;
            class111.field1706[0] = this.field5494;
            class111.field1706[5] = this.field5483;
            class111.field1706[3] = this.field5492;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method1212(107, class111.field1706[var5])) {
                    return null;
                }
                class467 var7 = var2.method1208((byte) 47, class111.field1706[var5]);
                int var8 = var7.field6574 ? 64 : 128;
                if (var7.field6565 > 0) {
                    var3 = true;
                }
                if (var8 > var4) {
                    var4 = var8;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class28.field406[var6] = var2.method1211((byte) 22, var4, var4, false, class111.field1706[var6], 1.0F);
            }
            this.field5485 = this.field5487.method1134(var3, var4, -2, class28.field406);
        }
        return this.field5485;
    }

    @OriginalMember(owner = "client!oj", name = "<init>", descriptor = "(Lpj;IIIIII)V")
    public class400(class156 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field5492 = arg4;
        this.field5494 = arg1;
        this.field5483 = arg6;
        this.field5487 = arg0;
        this.field5490 = arg3;
        this.field5493 = arg5;
        this.field5491 = arg2;
    }
}
