import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class283 implements class80 {

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "I")
    public int field4112;

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "I")
    public static int field4113;

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "I")
    public static int field4114;

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "I")
    public static int field4115;

    @OriginalMember(owner = "client!bc", name = "e", descriptor = "I")
    public int field4116;

    @OriginalMember(owner = "client!bc", name = "g", descriptor = "I")
    public int field4118;

    @OriginalMember(owner = "client!bc", name = "h", descriptor = "I")
    public static int field4119;

    @OriginalMember(owner = "client!bc", name = "j", descriptor = "I")
    public int field4121;

    @OriginalMember(owner = "client!bc", name = "k", descriptor = "I")
    public int field4122;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "I")
    public static int field4124;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public int field4126;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field4127;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field4128;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "Lcl;")
    public static class313 field4123;

    @OriginalMember(owner = "client!bc", name = "f", descriptor = "Lcq;")
    public static class67 field4117;

    @OriginalMember(owner = "client!bc", name = "i", descriptor = "Z")
    public boolean field4120;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "[Ljava/lang/String;")
    public static String[] field4125;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILkb;)Z")
    public final boolean method575(int arg0, class80 arg1) {
        field4128++;
        if (!(arg1 instanceof class283)) {
            return false;
        }
        class283 var3 = (class283) arg1;
        if (this.field4121 != var3.field4121) {
            return false;
        } else if (this.field4116 != var3.field4116) {
            return false;
        } else if (this.field4118 == var3.field4118) {
            if (arg0 != -7088) {
                method1951((byte) -112, -87);
            }
            if (this.field4112 != var3.field4112) {
                return false;
            } else if (this.field4122 != var3.field4122) {
                return false;
            } else if (this.field4126 == var3.field4126) {
                return this.field4120 == var3.field4120;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!bc", name = "b", descriptor = "(I)V")
    public static final void method1948(int arg0) {
        field4115++;
        if (class163.field2190 == arg0) {
            return;
        }
        try {
            if ((++class275.field3989) > 2000) {
                if (class191.field2558 != null) {
                    class191.field2558.method1398((byte) 51);
                    class191.field2558 = null;
                }
                if (class47.field661 >= 1) {
                    class163.field2190 = 0;
                    class214.field2856 = -5;
                    return;
                }
                class163.field2190 = 1;
                if (class430.field6322 == class153.field2070) {
                    class153.field2070 = class162.field2171;
                } else {
                    class153.field2070 = class430.field6322;
                }
                class47.field661++;
                class275.field3989 = 0;
            }
            if (class163.field2190 == 1) {
                class384.field5557 = class76.field1085.method261(arg0 - 5159, class153.field2070, class298.field4302);
                class163.field2190 = 2;
            }
            if (class163.field2190 == 2) {
                if (class384.field5557.field6308 == 2) {
                    throw new IOException();
                }
                if (class384.field5557.field6308 != 1) {
                    return;
                }
                class191.field2558 = new class233((Socket) class384.field5557.field6309, class76.field1085);
                class384.field5557 = null;
                class191.field2558.method1401(3, 0, class185.field2507.field3029, class185.field2507.field3040);
                if (class230.field3073 != null) {
                    class230.field3073.method1203(500000);
                }
                if (class281.field4093 != null) {
                    class281.field4093.method1203(500000);
                }
                int var1 = class191.field2558.method1399(-7573);
                if (class230.field3073 != null) {
                    class230.field3073.method1203(500000);
                }
                if (class281.field4093 != null) {
                    class281.field4093.method1203(500000);
                }
                if (var1 != 21) {
                    class163.field2190 = 0;
                    class214.field2856 = var1;
                    class191.field2558.method1398((byte) 103);
                    class191.field2558 = null;
                    return;
                }
                class163.field2190 = 3;
            }
            if (class163.field2190 == 3) {
                if (class191.field2558.method1394(true) < 1) {
                    return;
                }
                class247.field3332 = new String[class191.field2558.method1399(arg0 - 7573)];
                class163.field2190 = 4;
            }
            if (class163.field2190 == 4 && class191.field2558.method1394(true) >= class247.field3332.length * 8) {
                class156.field2120.field3029 = 0;
                class191.field2558.method1397(false, 0, class156.field2120.field3040, class247.field3332.length * 8);
                for (int var2 = 0; var2 < class247.field3332.length; var2++) {
                    class247.field3332[var2] = class51.method358(class156.field2120.method1332(1466299744), (byte) 37);
                }
                class163.field2190 = 0;
                class214.field2856 = 21;
                class191.field2558.method1398((byte) -97);
                class191.field2558 = null;
            }
        } catch (IOException var3) {
            if (class191.field2558 != null) {
                class191.field2558.method1398((byte) 58);
                class191.field2558 = null;
            }
            if (class47.field661 < 1) {
                if (class430.field6322 == class153.field2070) {
                    class153.field2070 = class162.field2171;
                } else {
                    class153.field2070 = class430.field6322;
                }
                class47.field661++;
                class163.field2190 = 1;
                class275.field3989 = 0;
            } else {
                class163.field2190 = 0;
                class214.field2856 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(I)J")
    public final long method576(int arg0) {
        field4124++;
        long[] var2 = class397.field5895;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field4121) & 0xFFL)];
        long var7 = var2[(int) (((long) (this.field4116 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) (((long) this.field4116 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field4118 >> 24) ^ var9) & 0xFFL)];
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field4118 >> 16)) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field4118 >> 8)) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field4118 ^ var15) & 0xFFL)];
        long var19 = var2[(int) (((long) this.field4112 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field4122 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) (((long) (this.field4122 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field4122 >> 8) ^ var23) & 0xFFL)];
        long var27 = var2[(int) ((var25 ^ (long) this.field4122) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) ((var27 ^ (long) this.field4126) & 0xFFL)] ^ var27 >>> 8;
        long var31 = var2[(int) ((var29 ^ (long) (this.field4120 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
        if (arg0 != 12192) {
            method1950((byte) 100);
        }
        return var31;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V")
    public static void method1949(int arg0) {
        field4117 = null;
        if (arg0 < 69) {
            field4125 = null;
        }
        field4125 = null;
        field4123 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V")
    public static final void method1950(byte arg0) {
        class1.field7 = null;
        class21.field275 = null;
        class393.field5626 = null;
        class316.field4620 = null;
        class52.field702 = null;
        class304.field4459 = null;
        class93.field1341 = null;
        class195.field2608 = null;
        class139.field1915 = null;
        class323.field4743 = null;
        class294.field4209 = null;
        class403.field6002 = null;
        class62.field819 = null;
        field4117 = null;
        class422.field6227 = null;
        class430.field6330 = null;
        field4114++;
        if (arg0 == 70) {
            class270.field3931 = null;
        }
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(BI)Lor;")
    public static final class295 method1951(byte arg0, int arg1) {
        field4113++;
        if (arg0 != 54) {
            field4123 = null;
        }
        class295 var2 = (class295) class135.field1877.method2674((long) arg1, arg0 + 22246);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class1.field19.method2261(arg1, 0, 66);
        } else {
            var3 = class328.field4777.method2261(arg1 & 0x7FFF, 0, 69);
        }
        class295 var4 = new class295();
        if (var3 != null) {
            var4.method2019(new class228(var3), -26440);
        }
        if (arg1 >= 32768) {
            var4.method2015(92);
        }
        class135.field1877.method2673((long) arg1, var4, 11465);
        return var4;
    }

    @OriginalMember(owner = "client!bc", name = "d", descriptor = "(I)V")
    public static final void method1952(int arg0) {
        class87.method618();
        field4127++;
        for (int var1 = arg0; var1 < 4; var1++) {
            class365.field5294[var1].method1852(-5);
        }
        class431.method2731(-1);
        class376.method2444(18880);
        System.gc();
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IB)V")
    public static final void method1953(int arg0, byte arg1) {
        class30.method202((byte) 22);
        field4119++;
        class270.method1846(-118);
        if (arg1 != -22) {
            method1952(62);
        }
        class100.method684(true, arg0, arg1 ^ 0xFFFFFFAC);
        class343.method2240(-20667, class362.field5227, class61.field807, class291.field4169);
        class352.method2317(0, class61.field807, class362.field5227);
        class338.method2215(arg1 ^ 0x62, class270.field3931);
        class276.method1900((byte) 56);
        class145.method927(0);
        if (class70.field932 == 10) {
            class62.method428(arg1 - 8822, false);
        } else if (class70.field932 == 30) {
            class232.method1391(-26, 25);
        } else if (class70.field932 == 5) {
            class88.method619(false, class61.field807, class362.field5227);
            return;
        }
    }
}
