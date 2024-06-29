import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class70 {

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "Lpia;")
    public static class94 field737 = new class94(45, -1);

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "I")
    public static int field734;

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field735;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public static int field736;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field738;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field739;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "Lgh;")
    public static class546 field742;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field740;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)[I", line = 3)
    public static final int[] method514(int arg0) {
        if (arg0 == 49152) {
            field738++;
            return new int[] { class613.field8770, class630.field9062, class152.field1671 };
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B[BLig;)V", line = 19)
    public final void method515(byte arg0, byte[] arg1, class244 arg2) {
        field734++;
        if (arg0 != 51) {
            return;
        }
        if (arg2.field2912[arg2.field2903] != 31 || arg2.field2912[arg2.field2903 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field740 == null) {
            this.field740 = new Inflater(true);
        }
        try {
            this.field740.setInput(arg2.field2912, arg2.field2903 + 10, -arg2.field2903 + -10 + -8 + arg2.field2912.length);
            this.field740.inflate(arg1);
        } catch (Exception var4) {
            this.field740.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field740.reset();
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(III)I", line = 48)
    public static final int method516(int arg0, int arg1, int arg2) {
        field735++;
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (arg0 != -1614) {
            field742 = null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "()V", line = 68)
    public class70() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "(I)V", line = 75)
    public static final void method517(int arg0) {
        if (arg0 != 28384) {
            method518((byte) -68);
        }
        for (int var1 = 0; var1 < class702.field9897; var1++) {
            int var2 = class128.field1347[var1];
            class197 var3 = ((class151) class253.field3052.method1754(false, (long) var2)).field1661;
            int var4 = class248.field3008.method1423(arg0 - 28446);
            if ((var4 & 0x20) != 0) {
                var4 += class248.field3008.method1423(-113) << 8;
            }
            if ((var4 & 0x800) != 0) {
                int var5 = class248.field3008.method1439((byte) -75);
                int var6 = class248.field3008.method1454((byte) 126);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var7 = class248.field3008.method1423(-76);
                int var8 = var7 & 0x7;
                int var9 = var7 >> 3 & 0xF;
                if (var9 == 15) {
                    var9 = -1;
                }
                var3.method2997(var8, true, (byte) -22, var5, var9, var6);
            }
            if ((var4 & 0x8) != 0) {
                int var10 = class248.field3008.method1443(-1);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = class248.field3008.method1438(118);
                int var12 = class248.field3008.method1423(-81);
                int var13 = var12 & 0x7;
                int var14 = var12 >> 3 & 0xF;
                if (var14 == 15) {
                    var14 = -1;
                }
                var3.method2997(var13, false, (byte) -22, var10, var14, var11);
            }
            if ((var4 & 0x1) != 0) {
                var3.field7148 = class248.field3008.method1443(arg0 - 28385);
                if (var3.field7148 == 65535) {
                    var3.field7148 = -1;
                }
            }
            if ((var4 & 0x2) != 0) {
                if (var3.field2293.method1947(127)) {
                    class153.method938(8, var3);
                }
                var3.method1176(29, class451.field6506.method136(245, class248.field3008.method1476(-75)));
                var3.method2996(var3.field2293.field4227, -126);
                var3.field7135 = var3.field2293.field4201 << 3;
                if (var3.field2293.method1947(127)) {
                    class416.method2543(var3, var3.field7193[0], 0, null, var3.field4628, null, (byte) -102, var3.field7187[0]);
                }
            }
            if ((var4 & 0x200) != 0) {
                int var15 = class248.field3008.method1426((byte) 39);
                int[] var16 = new int[var15];
                int[] var17 = new int[var15];
                int[] var18 = new int[var15];
                for (int var19 = 0; var19 < var15; var19++) {
                    int var20 = class248.field3008.method1474((byte) 43);
                    if (var20 == 65535) {
                        var20 = -1;
                    }
                    var16[var19] = var20;
                    var17[var19] = class248.field3008.method1425((byte) 18);
                    var18[var19] = class248.field3008.method1476(85);
                }
                class458.method2803(var3, var16, arg0 ^ 0x10F8, var18, var17);
            }
            if ((var4 & 0x400) != 0) {
                var3.field7172 = class248.field3008.method1448((byte) -88);
                var3.field7176 = class248.field3008.method1448((byte) -115);
                var3.field7096 = class248.field3008.method1472(99);
                var3.field7073 = class248.field3008.method1472(arg0 ^ 0x6E9A);
                var3.field7141 = class248.field3008.method1474((byte) -11) + class392.field5398;
                var3.field7167 = class248.field3008.method1476(45) + class392.field5398;
                var3.field7119 = class248.field3008.method1426((byte) 39);
                var3.field7172 += var3.field7187[0];
                var3.field7096 += var3.field7187[0];
                var3.field7073 += var3.field7193[0];
                var3.field7176 += var3.field7193[0];
                var3.field7188 = 0;
                var3.field7184 = 1;
            }
            if ((var4 & 0x4) != 0) {
                int[] var21 = new int[4];
                for (int var22 = 0; var22 < 4; var22++) {
                    var21[var22] = class248.field3008.method1476(-105);
                    if (var21[var22] == 65535) {
                        var21[var22] = -1;
                    }
                }
                int var23 = class248.field3008.method1450(arg0 ^ 0xFFFF9161);
                class90.method616(0, var21, var3, var23);
            }
            if ((var4 & 0x10) != 0) {
                int var24 = class248.field3008.method1463(3010);
                int var25 = class248.field3008.method1423(-71);
                var3.method2991(class392.field5398, var24, var25, -11752);
                var3.field7180 = class392.field5398 + 300;
                var3.field7078 = class248.field3008.method1423(-48);
            }
            if ((var4 & 0x100) != 0) {
                var3.field7137 = class248.field3008.method1419((byte) 30);
                var3.field7090 = class248.field3008.method1472(102);
                var3.field7099 = class248.field3008.method1448((byte) -86);
                var3.field7169 = (byte) class248.field3008.method1423(-93);
                var3.field7124 = class392.field5398 + class248.field3008.method1443(-1);
                var3.field7088 = class392.field5398 + class248.field3008.method1476(-92);
            }
            if ((var4 & 0x4000) != 0) {
                int var26 = class248.field3008.method1474((byte) -92);
                var3.field7174 = class248.field3008.method1425((byte) 18);
                var3.field7128 = class248.field3008.method1450(-128);
                var3.field7113 = var26 & 0x7FFF;
                var3.field7114 = (var26 & 0x8000) != 0;
                var3.field7171 = class392.field5398 + var3.field7113 + var3.field7174;
            }
            if ((var4 & 0x1000) != 0) {
                int var27 = class248.field3008.method1463(3010);
                int var28 = class248.field3008.method1450(arg0 - 28503);
                var3.method2991(class392.field5398, var27, var28, -11752);
            }
            if ((var4 & 0x40) != 0) {
                var3.field7125 = class248.field3008.method1468(-1468860088);
                var3.field7079 = 100;
            }
            if ((var4 & 0x80) != 0) {
                var3.field2299 = class248.field3008.method1439((byte) -63);
                var3.field2297 = class248.field3008.method1443(-1);
            }
            if ((var4 & 0x2000) != 0) {
                int var29 = class248.field3008.method1423(-12);
                int[] var30 = new int[var29];
                int[] var31 = new int[var29];
                for (int var32 = 0; var32 < var29; var32++) {
                    int var33 = class248.field3008.method1439((byte) -72);
                    if ((var33 & 0xC000) == 49152) {
                        int var34 = class248.field3008.method1439((byte) -101);
                        var30[var32] = class695.method3919(var34, var33 << 16);
                    } else {
                        var30[var32] = var33;
                    }
                    var31[var32] = class248.field3008.method1443(-1);
                }
                var3.method3002(0, var31, var30);
            }
        }
        field739++;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(B)V", line = 335)
    public static void method518(byte arg0) {
        field737 = null;
        if (arg0 < 56) {
            method516(-42, -19, -105);
        }
        field742 = null;
    }

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "(I)V", line = 346)
    public static final void method519(int arg0) {
        field741++;
        class220.method1285((byte) -39);
        class691.field9738 = null;
        class741.field10364 = 0;
        class89.field931 = null;
        class668.field9500 = null;
        class122.field1276 = 0;
        class537.field7759 = 0;
        class248.field3008.field2903 = 0;
        class97.field1022 = null;
        class311.method1849((byte) 7);
        class106.method738(-94);
        for (int var1 = 0; var1 < 2048; var1++) {
            class75.field792[var1] = null;
        }
        class90.field937 = null;
        for (int var2 = 0; var2 < class529.field7533; var2++) {
            class197 var4 = class452.field6509[var2].field1661;
            if (var4 != null) {
                var4.field7148 = -1;
            }
        }
        class745.method4143(124);
        if (arg0 <= 74) {
            return;
        }
        class406.field5556 = -1;
        class16.field147 = -1;
        class496.field7014 = 1;
        class313.method1860(true, 10);
        for (int var3 = 0; var3 < 100; var3++) {
            class272.field3360[var3] = true;
        }
        class227.method1309(75);
        class230.field2690 = null;
        class99.field1036 = 0L;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z[B)[B", line = 408)
    public final byte[] method520(boolean arg0, byte[] arg1) {
        field736++;
        class244 var3 = new class244(arg1);
        var3.field2903 = arg1.length - 4;
        int var4 = var3.method1424(16212);
        if (arg0) {
            this.field740 = null;
        }
        var3.field2903 = 0;
        byte[] var5 = new byte[var4];
        this.method515((byte) 51, var5, var3);
        return var5;
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "(III)V", line = 429)
    private class70(int arg0, int arg1, int arg2) {
    }
}
