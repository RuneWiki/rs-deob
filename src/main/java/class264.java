import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class264 {

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lno;")
    public static class652 field4004 = new class652();

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field4013 = 0;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Ldg;")
    public static class376 field4012 = new class376(43, -1);

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "F")
    public static float field4007;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field4008;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field4009;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Lpu;")
    public static class522 field4005;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "Ljava/lang/String;")
    public static String field4011;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)I")
    public static final int method1736(int arg0) {
        field4009++;
        if ((double) class25.field341 == 3.0D) {
            return 37;
        } else if ((double) class25.field341 == 4.0D) {
            return 50;
        } else {
            if (arg0 != -31485) {
                method1736(-90);
            }
            if ((double) class25.field341 == 6.0D) {
                return 75;
            } else if ((double) class25.field341 == 8.0D) {
                return 100;
            } else {
                return 200;
            }
        }
    }

    @OriginalMember(owner = "client!tf", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4006++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(II)V")
    public class264(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    public static void method1737(boolean arg0) {
        if (!arg0) {
            field4012 = null;
            field4004 = null;
            field4011 = null;
            field4005 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IIZII)V")
    public static final void method1738(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4003++;
        if (!arg2 && class312.field4619 == arg1 && class360.field5169 == arg3 && class97.field1532 == class58.field1112 || class287.field4270.method2747(arg0 - 451, class328.field4859)) {
            return;
        }
        class312.field4619 = arg1;
        class97.field1532 = class58.field1112;
        class360.field5169 = arg3;
        if (class287.field4270.method2747(102, class328.field4859)) {
            class97.field1532 = 0;
        }
        class112.method868(arg4, (byte) 43);
        class140.method1015(class563.field7931, true, class244.field3796, class282.field4228, (byte) 68, class274.field4128.method1804(arg0 + 6663, class512.field7203));
        int var5 = class109.field1672;
        int var6 = class203.field2874;
        class109.field1672 = (class312.field4619 - (class199.field2812 >> 4)) * 8;
        class203.field2874 = (class360.field5169 - (class232.field3611 >> 4)) * 8;
        class574.field8082 = class25.method301(class312.field4619 * 8, class360.field5169 * 8);
        if (arg0 != 512) {
            method1737(false);
        }
        class409.field5972 = null;
        int var7 = class109.field1672 - var5;
        int var8 = class203.field2874 - var6;
        if (arg4 == 11) {
            for (int var17 = 0; var17 < class428.field6288; var17++) {
                class16 var30 = class261.field3968[var17];
                if (var30 != null) {
                    class577 var31 = var30.field174;
                    for (int var32 = 0; var32 < 10; var32++) {
                        var31.field6271[var32] -= var7;
                        var31.field6262[var32] -= var8;
                    }
                    var31.field3024 -= var7 * 512;
                    var31.field3029 -= var8 * 512;
                }
            }
        } else {
            boolean var9 = false;
            class217.field3042 = 0;
            int var10 = (class199.field2812 - 1) * 512;
            int var11 = (class232.field3611 - 1) * 512;
            for (int var12 = 0; var12 < class428.field6288; var12++) {
                class16 var13 = class261.field3968[var12];
                if (var13 != null) {
                    class577 var14 = var13.field174;
                    var14.field3024 -= var7 * 512;
                    var14.field3029 -= var8 * 512;
                    if (var14.field3024 >= 0 && var10 >= var14.field3024 && var14.field3029 >= 0 && var11 >= var14.field3029) {
                        boolean var15 = true;
                        for (int var16 = 0; var16 < 10; var16++) {
                            var14.field6271[var16] -= var7;
                            var14.field6262[var16] -= var8;
                            if (var14.field6271[var16] < 0 || var14.field6271[var16] >= class199.field2812 || var14.field6262[var16] < 0 || var14.field6262[var16] >= class232.field3611) {
                                var15 = false;
                            }
                        }
                        if (var15) {
                            class85.field1396[class217.field3042++] = var14.field6216;
                        } else {
                            var14.method3275(null, (byte) -94);
                            var9 = true;
                            var13.method3678(-1);
                        }
                    } else {
                        var14.method3275(null, (byte) 109);
                        var13.method3678(-1);
                        var9 = true;
                    }
                }
            }
            if (var9) {
                class428.field6288 = class189.field2723.method1404((byte) 98);
                class189.field2723.method1410(class261.field3968, (byte) 46);
            }
        }
        for (int var18 = 0; var18 < 2048; var18++) {
            class491 var28 = class141.field2087[var18];
            if (var28 != null) {
                for (int var29 = 0; var29 < 10; var29++) {
                    var28.field6271[var29] -= var7;
                    var28.field6262[var29] -= var8;
                }
                var28.field3029 -= var8 * 512;
                var28.field3024 -= var7 * 512;
            }
        }
        class390[] var19 = class601.field8496;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class390 var27 = var19[var20];
            if (var27 != null) {
                var27.field5791 -= var7 * 512;
                var27.field5785 -= var8 * 512;
            }
        }
        for (class697 var21 = (class697) class302.field4494.method472((byte) -24); var21 != null; var21 = (class697) class302.field4494.method482(-6)) {
            var21.field9874 -= var8;
            var21.field9870 -= var7;
            if (class48.field817 != 4 && (var21.field9870 < 0 || var21.field9874 < 0 || var21.field9870 >= class199.field2812 || class232.field3611 <= var21.field9874)) {
                var21.method3678(-1);
            }
        }
        if (class48.field817 != 4) {
            for (class44 var22 = (class44) class22.field296.method1407(-108); var22 != null; var22 = (class44) class22.field296.method1413(true)) {
                int var23 = (int) (var22.field9386 & 0x3FFFL);
                int var24 = var23 - class109.field1672;
                int var25 = (int) (var22.field9386 >> 14 & 0x3FFFL);
                int var26 = var25 - class203.field2874;
                if (var24 < 0 || var26 < 0 || var24 >= class199.field2812 || class232.field3611 <= var26) {
                    var22.method3678(arg0 ^ 0xFFFFFDFF);
                }
            }
        }
        if (class535.field7508 != 0) {
            class535.field7508 -= var7;
            class674.field9547 -= var8;
        }
        class618.method3438(arg0 ^ 0xFFFF8FF3);
        if (arg4 != 11) {
            class413.field6011 -= var8 * 512;
            class131.field1928 -= var7 * 512;
            class467.field6718 -= var7;
            class318.field4691 -= var8;
            class174.field2481 -= var8;
            class503.field7116 -= var7;
            if (Math.abs(var7) > class199.field2812 || Math.abs(var8) > class232.field3611) {
                class646.method3587((byte) -118);
            }
        } else if (class43.field700 == 4) {
            class72.field1267 -= var7 * 512;
            class124.field1866 -= var8 * 512;
            class564.field7963 -= var8 * 512;
            class391.field5796 -= var7 * 512;
        } else {
            class666.field9399 = -1;
            class563.field7927 = -1;
            class43.field700 = 1;
        }
        class603.method3402((byte) 120);
        class575.method3262(arg0 - 513);
        class436.field6378.method475(6);
        class311.field4614.method475(6);
        class208.field2926.method2409(101);
        class263.method1734(arg0 - 537);
    }
}
