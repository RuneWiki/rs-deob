import java.awt.Dimension;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class468 {

    @OriginalMember(owner = "client!kl", name = "d", descriptor = "I")
    public int field6743;

    @OriginalMember(owner = "client!kl", name = "g", descriptor = "S")
    public static short field6746 = 256;

    @OriginalMember(owner = "client!kl", name = "c", descriptor = "F")
    public static float field6742;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "I")
    public static int field6740;

    @OriginalMember(owner = "client!kl", name = "b", descriptor = "I")
    public static int field6741;

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "I")
    public static int field6745;

    @OriginalMember(owner = "client!kl", name = "e", descriptor = "Lnk;")
    public static class376 field6744;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIB)I")
    public static final int method2719(int arg0, int arg1, byte arg2) {
        field6741++;
        if (class139.field2192 == -1) {
            return 1;
        }
        if (class646.field9388 != arg0) {
            class471.method2738(127, arg0);
            if (class646.field9388 != arg0) {
                return -1;
            }
        }
        try {
            Dimension var3 = class474.field6795.getSize();
            int var4 = -36 / ((arg2 - 76) / 35);
            class247.method1570(class514.field7114.method3220(false, class538.field7500), class409.field6077, true, 15900);
            class560 var5 = class307.method1903((byte) 84, class139.field2192, 0, class193.field2784);
            long var6 = class508.method2860(false);
            class159.field2378.method657();
            class81.field1444.method884(0, field6745, 0);
            class159.field2378.method587(class81.field1444);
            class159.field2378.method519(var3.width / 2, var3.height / 2, 512, 512);
            class159.field2378.method569(1.0F);
            class159.field2378.method600(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
            class519 var8 = class159.field2378.method400(var5, 2048, 64, 64, 768);
            int var9 = 0;
            label41: for (int var10 = 0; var10 < 500; var10++) {
                class159.field2378.method121(0);
                class159.field2378.method142();
                for (int var11 = 15; var11 >= 0; var11--) {
                    for (int var12 = 0; var12 <= var11; var12++) {
                        class373.field5401.method884((int) (((float) var12 - ((float) var11 / 2.0F)) * (float) class390.field5828), 0, (var11 + 1) * class390.field5828);
                        var9++;
                        var8.method1379(class373.field5401, null, 0);
                        if (((long) arg1) <= (class508.method2860(false) - var6)) {
                            break label41;
                        }
                    }
                }
            }
            class159.field2378.method124();
            long var13 = (long) (var9 * 1000) / (class508.method2860(false) - var6);
            class159.field2378.method121(0);
            class159.field2378.method142();
            return (int) var13;
        } catch (Throwable var16) {
            var16.printStackTrace();
            return -1;
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(I)V")
    public class468(int arg0) {
        this.field6743 = arg0;
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(B)V")
    public static void method2720(byte arg0) {
        field6744 = null;
        if (arg0 != 13) {
            method2719(119, -95, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!kl", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field6740++;
        throw new IllegalStateException();
    }
}
