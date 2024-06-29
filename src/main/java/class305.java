import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gga")
public class class305 implements class454 {

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "Ljava/lang/String;")
    private String field4558;

    @OriginalMember(owner = "client!gga", name = "c", descriptor = "Lcb;")
    private class544 field4559;

    @OriginalMember(owner = "client!gga", name = "g", descriptor = "Lrh;")
    public static class275 field4563 = new class275(2, 4, 4, 0);

    @OriginalMember(owner = "client!gga", name = "j", descriptor = "I")
    public static int field4566 = 0;

    @OriginalMember(owner = "client!gga", name = "m", descriptor = "Z")
    public static boolean field4569 = false;

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "I")
    public static int field4557;

    @OriginalMember(owner = "client!gga", name = "d", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!gga", name = "e", descriptor = "I")
    public static int field4561;

    @OriginalMember(owner = "client!gga", name = "f", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!gga", name = "h", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!gga", name = "i", descriptor = "I")
    public static int field4565;

    @OriginalMember(owner = "client!gga", name = "l", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!gga", name = "k", descriptor = "Ldu;")
    public static class373 field4567;

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(I)Lbja;")
    public final class34 method1557(int arg0) {
        field4561++;
        if (arg0 != -29120) {
            field4567 = null;
        }
        return class34.field448;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(B)V")
    public static final void method2008(byte arg0) {
        class655.method3755((byte) 68);
        field4562++;
        class654.field9233 = null;
        class127.field1655 = null;
        class225.field3231 = null;
        if (arg0 > -6) {
            field4569 = true;
        }
        class786.field10810 = 0;
        class638.field8975 = 0;
        class440.field6294 = 0;
        class26.field371.field1521 = 0;
        class746.field10375 = null;
        class426.method2540(-122);
        class118.method825((byte) 103);
        for (int var1 = 0; var1 < 2048; var1++) {
            class581.field8250[var1] = null;
        }
        class251.field3549 = null;
        for (int var2 = 0; var2 < class662.field9292; var2++) {
            class645 var4 = class642.field9044[var2].field262;
            if (var4 != null) {
                var4.field6343 = -1;
            }
        }
        class711.method4023(-29049);
        class180.field2732 = -1;
        class406.field5746 = -1;
        class763.field10510 = 1;
        class374.method2323(10, (byte) -124);
        for (int var3 = 0; var3 < 100; var3++) {
            class397.field5653[var3] = true;
        }
        class135.method956(-52);
        class212.field3072 = null;
        class668.field9399 = 0L;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(IB)I")
    public static final int method2009(int arg0, byte arg1) {
        field4564++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            var2 += 16;
            arg0 >>>= 0x10;
        }
        if (arg1 != 63) {
            method2008((byte) -85);
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg0 >= 16) {
            var2 += 4;
            arg0 >>>= 0x4;
        }
        if (arg0 >= 4) {
            arg0 >>>= 0x2;
            var2 += 2;
        }
        if (arg0 >= 1) {
            var2++;
            arg0 >>>= 0x1;
        }
        return var2 + arg0;
    }

    @OriginalMember(owner = "client!gga", name = "<init>", descriptor = "(Lcb;Ljava/lang/String;)V")
    public class305(class544 arg0, String arg1) {
        this.field4558 = arg1;
        this.field4559 = arg0;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(I)I")
    public final int method1558(int arg0) {
        int var2 = -75 / ((arg0 - 44) / 57);
        field4568++;
        return this.field4559.method3130(this.field4558, false) ? 100 : 0;
    }

    @OriginalMember(owner = "client!gga", name = "a", descriptor = "(Ljava/lang/String;BZ)V")
    public static final void method2010(String arg0, byte arg1, boolean arg2) {
        field4557++;
        String var3 = arg0.toLowerCase();
        short[] var4 = new short[16];
        int var5 = 0;
        int var6 = arg2 ? 32768 : 0;
        int var7 = var6 + (arg2 ? class544.field7646.field3393 : class544.field7646.field3391);
        for (int var8 = var6; var8 < var7; var8++) {
            class693 var11 = class544.field7646.method1614(var8, (byte) 72);
            if (var11.field9804 && var11.method3903(false).toLowerCase().indexOf(var3) != -1) {
                if (var5 >= 50) {
                    class327.field4891 = null;
                    class92.field1200 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var12 = new short[var4.length * 2];
                    for (int var13 = 0; var13 < var5; var13++) {
                        var12[var13] = var4[var13];
                    }
                    var4 = var12;
                }
                var4[var5++] = (short) var8;
            }
        }
        class327.field4891 = var4;
        class493.field7009 = 0;
        class92.field1200 = var5;
        String[] var9 = new String[class92.field1200];
        for (int var10 = 0; var10 < class92.field1200; var10++) {
            var9[var10] = class544.field7646.method1614(var4[var10], (byte) 72).method3903(false);
        }
        class736.method4124(var9, class327.field4891, 0);
        if (arg1 != -24) {
            field4565 = -74;
        }
    }

    @OriginalMember(owner = "client!gga", name = "b", descriptor = "(B)V")
    public static void method2011(byte arg0) {
        field4567 = null;
        field4563 = null;
        if (arg0 != -87) {
            method2011((byte) 33);
        }
    }
}
