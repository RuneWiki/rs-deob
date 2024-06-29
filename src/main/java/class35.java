import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class35 {

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "Lkr;")
    public static class602 field452 = new class602(28, 4);

    @OriginalMember(owner = "client!oc", name = "f", descriptor = "F")
    public static float field453;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "I")
    public static int field448;

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "I")
    public static int field449;

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "I")
    public static int field450;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "I")
    public static int field451;

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "I")
    public static int field455;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "[B")
    public static byte[] field454;

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B)V")
    public static final void method187(byte arg0) {
        class34.field446.method3906(-119);
        int var1 = -76 % ((3 - arg0) / 39);
        field449++;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(BII)I")
    public static final int method188(byte arg0, int arg1, int arg2) {
        field450++;
        double var3 = Math.log((double) arg2) / Math.log(2.0D);
        int var5 = 111 % ((-arg0 - 78) / 38);
        double var6 = Math.log((double) arg1) / Math.log(2.0D);
        double var8 = Math.random() * (var3 - var6) + var6;
        return (int) (Math.pow(2.0D, var8) + 0.5D);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZII)Z")
    public static final boolean method189(boolean arg0, int arg1, int arg2) {
        field451++;
        if (!arg0) {
            method190((byte) 110);
        }
        return (arg2 & 0x34) != 0;
    }

    @OriginalMember(owner = "client!oc", name = "b", descriptor = "(B)V")
    public static void method190(byte arg0) {
        field454 = null;
        if (arg0 <= 15) {
            field453 = 1.3742744F;
        }
        field452 = null;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(I)I")
    public static final int method191(int arg0) {
        field455++;
        if (class166.field2306 == 0) {
            class211.field2760.method1256(true, new class227("jaclib"));
            if (class211.field2760.method1257(32).method1338((byte) -111) != 100) {
                return 1;
            }
            if (!((class227) class211.field2760.method1257(32)).method1341(100)) {
                class516.field7210.method2185(32471);
            }
            class166.field2306 = 1;
        }
        if (class166.field2306 == 1) {
            class459.field6374 = class211.method1254(16);
            class211.field2755.method1256(true, new class501(class436.field6092));
            class211.field2762.method1256(true, new class227("jaggl"));
            class211.field2763.method1256(true, new class227("jagdx"));
            class211.field2764.method1256(true, new class227("jagmisc"));
            class211.field2765.method1256(true, new class227("sw3d"));
            class211.field2766.method1256(true, new class227("hw3d"));
            class211.field2767.method1256(true, new class227("jagtheora"));
            class211.field2768.method1256(true, new class501(class137.field1945));
            class211.field2769.method1256(true, new class501(class357.field5130));
            class211.field2770.method1256(true, new class501(class27.field350));
            class211.field2771.method1256(true, new class501(class244.field3628));
            class211.field2772.method1256(true, new class501(class171.field2377));
            class211.field2773.method1256(true, new class501(class41.field502));
            class211.field2774.method1256(true, new class501(class589.field8029));
            class211.field2775.method1256(true, new class501(class604.field8153));
            class211.field2776.method1256(true, new class501(class259.field3748));
            class211.field2777.method1256(true, new class501(class380.field5457));
            class211.field2778.method1256(true, new class501(class715.field9979));
            class211.field2779.method1256(true, new class501(class329.field4661));
            class211.field2780.method1256(true, new class501(class652.field8737));
            class211.field2781.method1256(true, new class501(class23.field277));
            class211.field2782.method1256(true, new class439(class463.field6440, "huffman"));
            class211.field2783.method1256(true, new class501(class432.field6032));
            class211.field2784.method1256(true, new class501(class587.field7997));
            class211.field2785.method1256(true, new class501(class307.field4312));
            class211.field2786.method1256(true, new class736(class701.field9774, "details"));
            for (int var1 = 0; var1 < class459.field6374.length; var1++) {
                if (class459.field6374[var1].method1257(32) == null) {
                    throw new RuntimeException();
                }
            }
            int var2 = 0;
            class211[] var3 = class459.field6374;
            for (int var4 = 0; var4 < var3.length; var4++) {
                class211 var5 = var3[var4];
                int var6 = var5.method1258(-2);
                int var7 = var5.method1257(32).method1338((byte) -113);
                var2 += var6 * var7 / 100;
            }
            class166.field2306 = 2;
            class524.field7283 = var2;
        }
        if (class459.field6374 == null) {
            return 100;
        }
        int var8 = 0;
        int var9 = 0;
        if (arg0 <= 55) {
            method191(31);
        }
        boolean var10 = true;
        class211[] var11 = class459.field6374;
        for (int var12 = 0; var12 < var11.length; var12++) {
            class211 var16 = var11[var12];
            int var17 = var16.method1258(-2);
            int var18 = var16.method1257(32).method1338((byte) -109);
            var8 += var17;
            if (var18 < 100) {
                var10 = false;
            }
            var9 += var17 * var18 / 100;
        }
        if (var10) {
            if (!((class227) class211.field2764.method1257(32)).method1341(100)) {
                class516.field7210.method2191(-1);
            }
            if (!((class227) class211.field2767.method1257(32)).method1341(100)) {
                class602.field8149 = class516.field7210.method2187((byte) -83);
            }
            class459.field6374 = null;
        }
        int var13 = var8 - class524.field7283;
        int var14 = var9 - class524.field7283;
        int var15 = var13 <= 0 ? 100 : var14 * 100 / var13;
        if (!var10 && var15 > 99) {
            var15 = 99;
        }
        return var15;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(III)Z")
    public static final boolean method192(int arg0, int arg1, int arg2) {
        field448++;
        return arg0 == -101 ? class425.method2645(arg1, (byte) -33, arg2) & class456.method2786((byte) -114, arg2, arg1) : true;
    }
}
