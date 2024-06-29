import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class268 {

    @OriginalMember(owner = "client!pp", name = "c", descriptor = "Lbg;")
    public static class324 field3950 = new class324(70, 4);

    @OriginalMember(owner = "client!pp", name = "f", descriptor = "Lsl;")
    public static class318 field3953 = new class318(44, -1);

    @OriginalMember(owner = "client!pp", name = "b", descriptor = "I")
    public static int field3949;

    @OriginalMember(owner = "client!pp", name = "d", descriptor = "I")
    public static int field3951;

    @OriginalMember(owner = "client!pp", name = "e", descriptor = "I")
    public static int field3952;

    @OriginalMember(owner = "client!pp", name = "g", descriptor = "I")
    public static int field3954;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field3948;

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(ZBIIZ)V")
    public static final void method1722(boolean arg0, byte arg1, int arg2, int arg3, boolean arg4) {
        field3951++;
        if (!arg4 && class60.field695 == arg3 && class251.field3702 == arg2 && class525.field7714 == class51.field575 || class478.field7044.method2072(class65.field802, 111)) {
            return;
        }
        class60.field695 = arg3;
        class251.field3702 = arg2;
        class51.field575 = class525.field7714;
        if (class478.field7044.method2072(class65.field802, 123)) {
            class51.field575 = 0;
        }
        if (arg0) {
            class432.method2619((byte) 37, 28);
        } else {
            class432.method2619((byte) -120, 25);
        }
        class195.method1364(true, class179.field2529.method2031(true, class377.field5585), class396.field5802, 13);
        int var5 = class340.field4713;
        class340.field4713 = (class60.field695 - (class397.field5828 >> 4)) * 8;
        int var6 = class476.field7013;
        class476.field7013 = (class251.field3702 - (class457.field6713 >> 4)) * 8;
        class82.field1113 = class399.method2441(class60.field695 * 8, class251.field3702 * 8);
        class125.field1822 = null;
        int var7 = class340.field4713 - var5;
        int var8 = class476.field7013 - var6;
        if (arg0) {
            class232.field3410 = 0;
            int var9 = (class397.field5828 - 1) * 128;
            int var10 = class457.field6713 * 128 - 128;
            for (int var11 = 0; var11 < 32768; var11++) {
                class461 var12 = class250.field3690[var11];
                if (var12 != null) {
                    var12.field6334 -= var8 * 128;
                    var12.field6335 -= var7 * 128;
                    if (var12.field6335 >= 0 && var9 >= var12.field6335 && var12.field6334 >= 0 && var10 >= var12.field6334) {
                        boolean var13 = true;
                        for (int var14 = 0; var14 < 10; var14++) {
                            var12.field1777[var14] -= var7;
                            var12.field1778[var14] -= var8;
                            if (var12.field1777[var14] < 0 || class397.field5828 <= var12.field1777[var14] || var12.field1778[var14] < 0 || class457.field6713 <= var12.field1778[var14]) {
                                var13 = false;
                            }
                        }
                        if (var13) {
                            class173.field2454[class232.field3410++] = var11;
                        } else {
                            class250.field3690[var11].method2771((byte) -124, null);
                            class250.field3690[var11] = null;
                        }
                    } else {
                        class250.field3690[var11].method2771((byte) -124, null);
                        class250.field3690[var11] = null;
                    }
                }
            }
        } else {
            for (int var15 = 0; var15 < 32768; var15++) {
                class461 var23 = class250.field3690[var15];
                if (var23 != null) {
                    for (int var24 = 0; var24 < 10; var24++) {
                        var23.field1777[var24] -= var7;
                        var23.field1778[var24] -= var8;
                    }
                    var23.field6334 -= var8 * 128;
                    var23.field6335 -= var7 * 128;
                }
            }
        }
        for (int var16 = 0; var16 < 2048; var16++) {
            class364 var21 = class384.field5647[var16];
            if (var21 != null) {
                for (int var22 = 0; var22 < 10; var22++) {
                    var21.field1777[var22] -= var7;
                    var21.field1778[var22] -= var8;
                }
                var21.field6334 -= var8 * 128;
                var21.field6335 -= var7 * 128;
            }
        }
        class452[] var17 = class133.field1922;
        for (int var18 = 0; var18 < var17.length; var18++) {
            class452 var20 = var17[var18];
            if (var20 != null) {
                var20.field6655 -= var8 * 128;
                var20.field6653 -= var7 * 128;
            }
        }
        class166.method1174(27106, var7, var8);
        for (class199 var19 = (class199) class212.field3057.method1018(93); var19 != null; var19 = (class199) class212.field3057.method1022((byte) -112)) {
            var19.field2898 -= var8;
            var19.field2901 -= var7;
            if (class507.field7494 != 3 && (var19.field2901 < 0 || var19.field2898 < 0 || var19.field2901 >= class397.field5828 || var19.field2898 >= class457.field6713)) {
                var19.method1525((byte) -56);
            }
        }
        if (class74.field1012 != 0) {
            class74.field1012 -= var7;
            class98.field1317 -= var8;
        }
        class138.method1042(true);
        if (arg0) {
            class76.field1039 -= var8;
            class161.field2268 -= var7 * 128;
            class462.field6791 -= var7;
            class346.field4805 -= var8;
            class486.field7138 -= var8 * 128;
            class85.field1158 -= var7;
            if (Math.abs(var7) > class397.field5828 || Math.abs(var8) > class457.field6713) {
                class284.method1815((byte) -36);
            }
        } else if (class462.field6802 == 4) {
            class49.field537 -= var8 * 128;
            class204.field2966 -= var7 * 128;
            class203.field2949 -= var8 * 128;
            class231.field3380 -= var7 * 128;
        } else {
            class462.field6802 = 1;
        }
        class170.method1200(-128);
        class489.method2941(-100);
        class125.field1824.method1016(-103);
        class372.field5532.method1016(-87);
        class24.field272.method2953(arg1 ^ 0xB);
        if (arg1 == 104) {
            class261.method1674(arg1 ^ 0x60);
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(Z)V")
    public static void method1723(boolean arg0) {
        if (!arg0) {
            field3953 = null;
            field3950 = null;
        }
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(BI)V")
    public static final void method1724(byte arg0, int arg1) {
        if (arg0 > -77) {
            return;
        }
        if (arg1 == 37) {
            class399.field5905 = 3.0F;
        } else if (arg1 == 50) {
            class399.field5905 = 4.0F;
        } else if (arg1 == 75) {
            class399.field5905 = 6.0F;
        } else if (arg1 == 100) {
            class399.field5905 = 8.0F;
        } else if (arg1 == 200) {
            class399.field5905 = 16.0F;
        }
        class45.field510 = -1;
        field3949++;
        class45.field510 = -1;
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B)V")
    public static final void method1725(byte arg0) {
        field3952++;
        if (arg0 >= -126) {
            field3950 = null;
        }
        if (class411.field6112) {
            return;
        }
        class411.field6112 = true;
        class531.field7820 = true;
        if (class478.field7044.field3352) {
            class328.field4588 = ((int) class328.field4588 - 65 & 0xFFFFFF80);
        } else {
            class434.field6365 += (-24.0F - class434.field6365) / 2.0F;
        }
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "(III)V")
    private class268(int arg0, int arg1, int arg2) {
    }

    @OriginalMember(owner = "client!pp", name = "<init>", descriptor = "()V")
    public class268() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!pp", name = "a", descriptor = "(B[BLiv;)V")
    public final void method1726(byte arg0, byte[] arg1, class65 arg2) {
        field3954++;
        if (arg0 != -33) {
            field3950 = null;
        }
        if (arg2.field783[arg2.field827] != 31 || arg2.field783[arg2.field827 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field3948 == null) {
            this.field3948 = new Inflater(true);
        }
        try {
            this.field3948.setInput(arg2.field783, arg2.field827 + 10, arg2.field783.length + -8 + -arg2.field827 + -10);
            this.field3948.inflate(arg1);
        } catch (Exception var4) {
            this.field3948.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field3948.reset();
    }
}
