import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class169 {

    @OriginalMember(owner = "client!vda", name = "d", descriptor = "Llt;")
    public static class633 field2609 = new class633("RC", 1);

    @OriginalMember(owner = "client!vda", name = "g", descriptor = "Ljw;")
    public static class520 field2612 = new class520(8);

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!vda", name = "e", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!vda", name = "f", descriptor = "Lbi;")
    public static class449 field2611;

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I[B)Lwm;", line = 7)
    public static final class529 method1151(int arg0, byte[] arg1) {
        field2608++;
        class529 var2 = new class529();
        class335 var3 = new class335(arg1);
        var3.field4619 = var3.field4600.length - 2;
        int var4 = var3.method2001((byte) -83);
        int var5 = var3.field4600.length - var4 - 14;
        var3.field4619 = var5;
        int var6 = var3.method2045(-98);
        if (arg0 != -40) {
            field2609 = null;
        }
        var2.field7045 = var3.method2001((byte) -83);
        var2.field7052 = var3.method2001((byte) -83);
        var2.field7059 = var3.method2001((byte) -83);
        var2.field7044 = var3.method2001((byte) -83);
        int var7 = var3.method2034(255);
        if (var7 > 0) {
            var2.field7060 = new class520[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                int var9 = var3.method2001((byte) -83);
                class520 var10 = new class520(class587.method3231(true, var9));
                var2.field7060[var8] = var10;
                while (var9-- > 0) {
                    int var11 = var3.method2045(-98);
                    int var12 = var3.method2045(arg0 ^ 0x46);
                    var10.method2911((long) var11, new class704(var12), (byte) -28);
                }
            }
        }
        var3.field4619 = 0;
        var2.field7047 = var3.method2006(-123);
        var2.field7050 = new int[var6];
        var2.field7046 = new int[var6];
        var2.field7051 = new String[var6];
        int var13 = 0;
        while (var3.field4619 < var5) {
            int var14 = var3.method2001((byte) -83);
            if (var14 == 3) {
                var2.field7051[var13] = var3.method2029((byte) -63).intern();
            } else if (var14 >= 100 || var14 == 21 || var14 == 38 || var14 == 39) {
                var2.field7050[var13] = var3.method2034(class217.method1381(arg0, -217));
            } else {
                var2.field7050[var13] = var3.method2045(-98);
            }
            var2.field7046[var13++] = var14;
        }
        return var2;
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(I)Z", line = 88)
    public static final boolean method1152(int arg0) {
        field2607++;
        try {
            class132 var1 = new class132();
            if (arg0 == 0) {
                byte[] var2 = var1.method992(true, class476.field6351);
                class154.method1081(2, var2);
                return true;
            } else {
                return true;
            }
        } catch (Exception var3) {
            return false;
        }
    }

    @OriginalMember(owner = "client!vda", name = "a", descriptor = "(BZ)V", line = 112)
    public static final void method1153(byte arg0, boolean arg1) {
        class360.field4868 = 0;
        field2610++;
        class136.field2217 = 0;
        class205.method1335(98);
        class145.method1051(arg1, (byte) 127);
        class158.method1101(-1);
        boolean var2 = false;
        for (int var3 = 0; var3 < class136.field2217; var3++) {
            int var5 = class190.field2800[var3];
            class280 var6 = (class280) class616.field8143.method2918((long) var5, (byte) -128);
            class287 var7 = var6.field3983;
            if (class388.field5142 && class379.method2221(var5, (byte) 118)) {
                class619.method3386(69);
            }
            if (class642.field8626 != var7.field5595) {
                if (var7.field4052.method2400(65535)) {
                    class625.method3421(var7, -126);
                }
                var7.method1777((byte) -57, null);
                var6.method2797(-118);
                var2 = true;
            }
        }
        if (var2) {
            class176.field2705 = class616.field8143.method2920(false);
            class616.field8143.method2913(class51.field718, 0);
        }
        if (class269.field3754 != class439.field6039.field4619) {
            throw new RuntimeException("gnp1 pos:" + class439.field6039.field4619 + " psize:" + class269.field3754);
        }
        int var4 = 0;
        if (arg0 != 101) {
            field2611 = null;
        }
        while (var4 < class92.field1396) {
            if (class616.field8143.method2918((long) class415.field5681[var4], (byte) -128) == null) {
                throw new RuntimeException("gnp2 pos:" + var4 + " size:" + class92.field1396);
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!vda", name = "b", descriptor = "(I)V", line = 184)
    public static final void method1154(int arg0) {
        if (arg0 <= 89) {
            field2611 = null;
        }
        field2606++;
        if (class583.field7739 < 0) {
            return;
        }
        long var1 = class681.method3802(-23600);
        class583.field7739 = (int) ((long) class583.field7739 - (var1 - class210.field2997));
        if (class583.field7739 > 0) {
            int var3 = (class583.field7739 << 8) / class300.field4196;
            int var4 = 255 - var3;
            float var5 = (float) var3 / 255.0F;
            class58.field825 = ((class90.field1375 & 0xFF00) * var3 + (class642.field8623.field2617 & 0xFF00) * var4 & 0xFF0000) + ((class90.field1375 & 0xFF00FF) * var3 + (class642.field8623.field2617 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8;
            float var6 = 1.0F - var5;
            class417.field5708 = class194.field2840 * var3 + class642.field8623.field2616 * var4 >> 8;
            class38.field575 = (class642.field8623.field2632 - class415.field5679) * var6 + class415.field5679;
            class526.field7010 = (class642.field8623.field2628 - class2.field21) * var6 + class2.field21;
            class247.field3444 = (class642.field8623.field2620 - class235.field3315) * var6 + class235.field3315;
            class30.field484 = (class642.field8623.field2613 - class456.field6196) * var6 + class456.field6196;
            class680.field9591 = (class642.field8623.field2614 - class651.field8815) * var6 + class651.field8815;
            class127.field2137 = ((class681.field9601 & 0xFF00FF) * var3 + (class642.field8623.field2630 & 0xFF00FF) * var4 & 0xFF00FF00) + ((class681.field9601 & 0xFF00) * var3 + (class642.field8623.field2630 & 0xFF00) * var4 & 0xFF0000) >>> 8;
            class296.field4182 = (class642.field8623.field2629 - class319.field4370) * var6 + class319.field4370;
            if (class191.field2813 != class642.field8623.field2625) {
                class456.field6197 = class251.field3460.method49(class191.field2813, class642.field8623.field2625, var6, class456.field6197);
            }
        } else {
            class247.field3444 = class642.field8623.field2620;
            class417.field5708 = class642.field8623.field2616;
            class680.field9591 = class642.field8623.field2614;
            class38.field575 = class642.field8623.field2632;
            class58.field825 = class642.field8623.field2617;
            class526.field7010 = class642.field8623.field2628;
            class583.field7739 = -1;
            class456.field6197 = class642.field8623.field2625;
            class127.field2137 = class642.field8623.field2630;
            class296.field4182 = class642.field8623.field2629;
            class30.field484 = class642.field8623.field2613;
        }
        class210.field2997 = var1;
    }

    @OriginalMember(owner = "client!vda", name = "c", descriptor = "(I)V", line = 241)
    public static void method1155(int arg0) {
        field2612 = null;
        field2611 = null;
        if (arg0 > 49) {
            field2609 = null;
        }
    }
}
