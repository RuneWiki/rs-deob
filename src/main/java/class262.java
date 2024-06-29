import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class262 {

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "Lop;")
    public static class364 field3864 = new class364();

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "J")
    public static long field3867 = 0L;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "B")
    public byte field3866;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public int field3863;

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "Ljava/lang/String;")
    public String field3862;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "Ljava/lang/String;")
    public String field3865;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "Ljava/lang/String;")
    public String field3868;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "Ljava/lang/String;")
    public String field3871;

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lct;I)I")
    public static final int method1789(class104 arg0, int arg1) {
        field3872++;
        int var2 = arg1;
        if (arg0.method708(class264.field3914, (byte) -119)) {
            var2 = arg1 + 1;
        }
        if (arg0.method708(class164.field2174, (byte) -89)) {
            var2++;
        }
        if (arg0.method708(class356.field5178, (byte) -113)) {
            var2++;
        }
        if (arg0.method708(class447.field6544, (byte) -119)) {
            var2++;
        }
        if (arg0.method708(class206.field2883, (byte) -122)) {
            var2++;
        }
        if (arg0.method708(class358.field5187, (byte) -109)) {
            var2++;
        }
        if (arg0.method708(class153.field2062, (byte) -111)) {
            var2++;
        }
        if (arg0.method708(class125.field1667, (byte) -128)) {
            var2++;
        }
        if (arg0.method708(class223.field3341, (byte) -89)) {
            var2++;
        }
        if (arg0.method708(class332.field4918, (byte) -122)) {
            var2++;
        }
        if (arg0.method708(class239.field3560, (byte) -102)) {
            var2++;
        }
        if (arg0.method708(class465.field6853, (byte) -92)) {
            var2++;
        }
        if (arg0.method708(class106.field1424, (byte) -117)) {
            var2++;
        }
        if (arg0.method708(class305.field4506, (byte) -93)) {
            var2++;
        }
        if (arg0.method708(class376.field5496, (byte) -106)) {
            var2++;
        }
        if (arg0.method708(class132.field1798, (byte) -99)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lgt;BLjava/awt/Frame;)V")
    public static final void method1790(class341 arg0, byte arg1, Frame arg2) {
        while (true) {
            class350 var3 = arg0.method2208((byte) 83, arg2);
            while (var3.field5134 == 0) {
                class418.method2587(false, 10L);
            }
            if (var3.field5134 == 1) {
                int var4 = 119 % ((54 - arg1) / 61);
                field3870++;
                arg2.setVisible(false);
                arg2.dispose();
                return;
            }
            class418.method2587(false, 100L);
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lfp;B)V")
    public static final void method1791(class9 arg0, byte arg1) {
        arg0.method77(0, 0, class214.field3016, 350);
        field3869++;
        arg0.method164(0, 0, class214.field3016, 350, class217.field3091 << 24 | 0x332277, 1);
        for (int var2 = 0; var2 < 100; var2++) {
            int var14 = class296.field4313[var2];
            int var15 = class184.field2580[var2];
            arg0.method164(var14, var15, 2, 2, class271.field4016[var2] << 24 | 0xFFFFFF, 1);
        }
        int var3 = 77 % ((35 - arg1) / 53);
        int var4 = 350 / class86.field1066;
        if (class120.field1608 > 0) {
            int var5 = 346 - class86.field1066 - 4;
            int var6 = var4 * var5 / (class120.field1608 + var4 - 1);
            int var7 = 4;
            if (class120.field1608 > 1) {
                var7 += (class120.field1608 - class13.field222 - 1) * (var5 - var6) / (class120.field1608 - 1);
            }
            arg0.method164(class214.field3016 - 16, var7, 12, var6, class217.field3091 << 24 | 0x332277, 2);
            for (int var8 = class13.field222; var8 < (class13.field222 + var4) && class120.field1608 > var8; var8++) {
                String[] var9 = class278.method1886('\b', -19369, class206.field2886[var8]);
                int var10 = (class214.field3016 - 24) / var9.length;
                for (int var11 = 0; var11 < var9.length; var11++) {
                    int var12 = (var10 * var11) + 8;
                    arg0.method77(var12, 0, var10 + var12 - 8, 350);
                    class13.field215.method565(-16777216, 9865, 350 - class378.field5537 - ((-class13.field222 + var8) * class86.field1066) - class328.field4885.field5268 - 2, var9[var11], -1, var12);
                }
            }
        }
        arg0.method77(0, 0, class214.field3016, 350);
        arg0.method126(0, -1, class214.field3016, 2702, 350 - class378.field5537);
        class111.field1540.method565(-16777216, 9865, 350 - class233.field3502.field5268 - 1, "--> " + class451.field6664, -1, 10);
        int var13 = -1;
        if (class388.field5665 % 30 > 15) {
            var13 = 16777215;
        }
        arg0.method155(class233.field3502.method2333(-30, "--> " + class451.field6664.substring(0, class432.field6300)) + 10, 12, var13, 1, 350 - class233.field3502.field5268 - 11);
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V")
    public static void method1792(byte arg0) {
        int var1 = 109 / ((74 - arg0) / 35);
        field3864 = null;
    }
}
