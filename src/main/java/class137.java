import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public abstract class class137 {

    @OriginalMember(owner = "client!d", name = "f", descriptor = "I")
    public int field1562;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public int field1558;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public int field1560;

    @OriginalMember(owner = "client!d", name = "e", descriptor = "I")
    public int field1561;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field1559 = 0;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lgs;")
    public static class41 field1564 = new class41("LOCAL", 4);

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field1567 = 503;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "[Lro;")
    public static class2[] field1566 = new class2[14];

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!d", name = "g", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "I")
    public static int field1565;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static final void method766(byte arg0) {
        class594.method3329(97, false);
        field1563++;
        class689.field9727 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class196.field2362.length; var2++) {
            if (class498.field7189[var2] != -1 && class196.field2362[var2] == null) {
                class196.field2362[var2] = class299.field3914.method1719(0, class498.field7189[var2], 4);
                if (class196.field2362[var2] == null) {
                    class689.field9727++;
                    var1 = false;
                }
            }
            if (class136.field1556[var2] != -1 && class583.field8295[var2] == null) {
                class583.field8295[var2] = class299.field3914.method1709(class136.field1556[var2], 0, class233.field2974[var2], (byte) -33);
                if (class583.field8295[var2] == null) {
                    var1 = false;
                    class689.field9727++;
                }
            }
            if (class383.field5136[var2] != -1 && class309.field4014[var2] == null) {
                class309.field4014[var2] = class299.field3914.method1719(0, class383.field5136[var2], 4);
                if (class309.field4014[var2] == null) {
                    var1 = false;
                    class689.field9727++;
                }
            }
            if (class21.field185[var2] != -1 && class351.field4603[var2] == null) {
                class351.field4603[var2] = class299.field3914.method1719(0, class21.field185[var2], 4);
                if (class351.field4603[var2] == null) {
                    class689.field9727++;
                    var1 = false;
                }
            }
            if (class292.field3763 != null && client.field3410[var2] == null && class292.field3763[var2] != -1) {
                client.field3410[var2] = class299.field3914.method1709(class292.field3763[var2], 0, class233.field2974[var2], (byte) -33);
                if (client.field3410[var2] == null) {
                    class689.field9727++;
                    var1 = false;
                }
            }
        }
        if (class65.field691 == null) {
            if (class84.field893 == null || !class683.field9689.method1713(class84.field893.field9546 + "_staticelements", -1)) {
                class65.field691 = new class15(0);
            } else if (class683.field9689.method1721(class84.field893.field9546 + "_staticelements", 124)) {
                class65.field691 = class539.method3070(class108.field1253, class683.field9689, class84.field893.field9546 + "_staticelements", 7974);
            } else {
                var1 = false;
                class689.field9727++;
            }
        }
        if (!var1) {
            class421.field5603 = 1;
            return;
        }
        class149.field1702 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class196.field2362.length; var4++) {
            byte[] var19 = class583.field8295[var4];
            if (var19 != null) {
                int var20 = (class287.field3696[var4] >> 8) * 64 - class682.field9685;
                int var21 = (class287.field3696[var4] & 0xFF) * 64 - class146.field1642;
                if (class381.field4954 != 0) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class153.method835(class349.field4567, var21, class399.field5338, var19, var20, (byte) 110);
            }
            byte[] var22 = class351.field4603[var4];
            if (var22 != null) {
                int var23 = (class287.field3696[var4] >> 8) * 64 - class682.field9685;
                int var24 = (class287.field3696[var4] & 0xFF) * 64 - class146.field1642;
                if (class381.field4954 != 0) {
                    var23 = 10;
                    var24 = 10;
                }
                var3 &= class153.method835(class349.field4567, var24, class399.field5338, var22, var23, (byte) 110);
            }
        }
        if (!var3) {
            class421.field5603 = 2;
            return;
        }
        if (class421.field5603 != 0) {
            class1.method1(116, class221.field2684.method1296(class226.field2899, (byte) -122) + "<br>(100%)", true, class404.field5386);
        }
        class73.method470((byte) 84);
        class99.method612(-28086);
        boolean var5 = false;
        if (class453.field6284.method380() && class601.field8530.field2859) {
            for (int var6 = 0; var6 < class196.field2362.length; var6++) {
                if (class351.field4603[var6] != null || class309.field4014[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class601.field8530.field2853) {
            var7 = class682.field9684[class433.field5705];
        } else {
            var7 = class644.field9122[class433.field5705];
        }
        if (class453.field6284.method377()) {
            var7++;
        }
        class86.method540(9, 4, class399.field5338, class349.field4567, var7, var5, class453.field6284.method352() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class475.field6919[var8].method1580(-126);
        }
        class396.method2166((byte) -38);
        class618.method3471((byte) 64, false);
        class135.method753(-17032);
        class309.field4008 = null;
        class533.field7629 = false;
        class73.method470((byte) 84);
        System.gc();
        class594.method3329(97, true);
        class370.method2021(-114);
        class224.field2838 = class601.field8530.method1317((byte) -103, class150.field1711);
        class103.field1120 = class145.field1630 >= 96;
        class544.field7786 = class601.field8530.field2859;
        class266.field3357 = class601.field8530.method1320(124, class150.field1711);
        class229.field2917 = !class601.field8530.field2845;
        class36.field412 = class601.field8530.method1835(class150.field1711, (byte) 89) ? -1 : class676.field9588;
        class435.field5797 = class116.method705(92, class150.field1711) || class601.field8530.field2860;
        class545.field7803 = class601.field8530.field2876;
        class110.field1273 = new class420(4, class399.field5338, class349.field4567, false);
        if (class381.field4954 == 0) {
            class146.method800(108, class196.field2362, class110.field1273);
        } else {
            class533.method3034(1592347480, class110.field1273, class196.field2362);
        }
        class63.method423((byte) 98, class349.field4567 >> 4, class399.field5338 >> 4);
        class126.method726((byte) -12);
        if (var5) {
            class488.method2821(true);
            class425.field5645 = new class420(1, class399.field5338, class349.field4567, true);
            if (class381.field4954 == 0) {
                class146.method800(-114, class309.field4014, class425.field5645);
                class594.method3329(97, true);
            } else {
                class533.method3034(1592347480, class425.field5645, class309.field4014);
                class594.method3329(97, true);
            }
            class425.field5645.method2593(0, 1, class110.field1273.field6375[0]);
            class425.field5645.method2597(null, class453.field6284, 1, null);
            class488.method2821(false);
        }
        class110.field1273.method2597(var5 ? class425.field5645.field6375 : null, class453.field6284, 1, class475.field6919);
        if (class381.field4954 == 0) {
            class594.method3329(97, true);
            class156.method852(class583.field8295, -109, class110.field1273);
            if (client.field3410 != null) {
                class332.method1871(true);
            }
        } else {
            class594.method3329(97, true);
            class235.method1362(class110.field1273, class583.field8295, (byte) 0);
        }
        class99.method612(-28086);
        if (class145.field1630 < 96) {
            class595.method3333(-124);
        }
        class594.method3329(97, true);
        class110.field1273.method2594(class453.field6284, var5 ? class591.field8415[0] : null, 1, null);
        class110.field1273.method2275(class453.field6284, -4267);
        class594.method3329(97, true);
        if (var5) {
            class488.method2821(true);
            class594.method3329(97, true);
            if (class381.field4954 == 0) {
                class156.method852(class351.field4603, -118, class425.field5645);
            } else {
                class235.method1362(class425.field5645, class351.field4603, (byte) 0);
            }
            class99.method612(-28086);
            class594.method3329(97, true);
            class425.field5645.method2594(class453.field6284, null, 1, class275.field3477[0]);
            class425.field5645.method2275(class453.field6284, -4267);
            class594.method3329(97, true);
            class488.method2821(false);
        }
        class287.method1627(true);
        int var9 = class110.field1273.field5583;
        if (class353.field4625 < var9) {
            var9 = class353.field4625;
        }
        if (var9 < class353.field4625 - 1) {
            var9 = class353.field4625 - 1;
        }
        if (class601.field8530.method1835(class150.field1711, (byte) 76)) {
            class629.method3522(0);
        } else {
            class629.method3522(var9);
        }
        if (arg0 >= -30) {
            field1564 = null;
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class399.field5338; var17++) {
                for (int var18 = 0; var18 < class349.field4567; var18++) {
                    class268.method1513(var17, var10, (byte) -65, var18);
                }
            }
        }
        class325.method1846(-1);
        class73.method470((byte) 84);
        class260.method1476((byte) 114);
        class99.method612(-28086);
        class562.method3172(false);
        if (class77.field796 != null && class170.field2043 != null && class351.field4601 == 11) {
            class480.method2802(class678.field9600, 16751);
            class548.field7829++;
            class334.field4314.method2554(1057001181, 255);
        }
        if (class381.field4954 == 0) {
            int var11 = (class65.field687 - (class399.field5338 >> 4)) / 8;
            int var12 = ((class399.field5338 >> 4) + class65.field687) / 8;
            int var13 = (class311.field4022 - (class349.field4567 >> 4)) / 8;
            int var14 = ((class349.field4567 >> 4) + class311.field4022) / 8;
            for (int var15 = var11 - 1; var15 <= var12 + 1; var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var11 || var15 > var12 || var13 > var16 || var16 > var14) {
                        class299.field3914.method1720(118, "m" + var15 + "_" + var16);
                        class299.field3914.method1720(103, "l" + var15 + "_" + var16);
                    }
                }
            }
        }
        if (class351.field4601 == 4) {
            class508.method2921(3, (byte) -97);
        } else if (class351.field4601 == 8) {
            class508.method2921(7, (byte) -98);
        } else {
            class508.method2921(10, (byte) -98);
            if (class170.field2043 != null) {
                class480.method2802(class422.field5627, 16751);
            }
        }
        class113.method700(-1);
        class73.method470((byte) 84);
        class503.method2892(10497);
    }

    @OriginalMember(owner = "client!d", name = "FA", descriptor = "(Lw;IIIIZ)V")
    public abstract void method247(class269 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "BA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method249(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13);

    @OriginalMember(owner = "client!d", name = "ba", descriptor = "()V")
    public abstract void method248();

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V")
    public abstract void method244(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16);

    @OriginalMember(owner = "client!d", name = "aa", descriptor = "(Lw;IIIIZ)V")
    public abstract void method251(class269 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IZIZ)Ljava/lang/String;")
    public static final String method767(int arg0, boolean arg1, int arg2, boolean arg3) {
        field1557++;
        if (arg0 < 2 || arg0 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg0);
        } else if (arg3 && arg2 >= 0) {
            int var4 = 2;
            for (int var5 = arg2 / arg0; var5 != 0; var5 /= arg0) {
                var4++;
            }
            char[] var6 = new char[var4];
            var6[0] = '+';
            for (int var7 = var4 - 1; var7 > 0; var7--) {
                int var8 = arg2;
                arg2 /= arg0;
                int var9 = var8 - (arg0 * arg2);
                if (var9 >= 10) {
                    var6[var7] = (char) (var9 + 87);
                } else {
                    var6[var7] = (char) (var9 + 48);
                }
            }
            if (arg1) {
                method768(-8);
            }
            return new String(var6);
        } else {
            return Integer.toString(arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(III)V")
    public class137(int arg0, int arg1, int arg2) {
        this.field1562 = arg1;
        while (arg2 > 1) {
            arg2 >>= 0x1;
            this.field1560++;
        }
        this.field1558 = arg0;
        this.field1561 = 0x1 << this.field1560;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lod;[I)V")
    public abstract void method254(class463 arg0, int[] arg1);

    @OriginalMember(owner = "client!d", name = "sa", descriptor = "(II)I")
    public abstract int method242(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "EA", descriptor = "(III)V")
    public abstract void method243(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)V")
    public abstract void method252(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(IILw;)Lw;")
    public abstract class269 method240(int arg0, int arg1, class269 arg2);

    @OriginalMember(owner = "client!d", name = "JA", descriptor = "(II)I")
    public abstract int method253(int arg0, int arg1);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method246(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(I)V")
    public static void method768(int arg0) {
        field1566 = null;
        if (arg0 != 4275) {
            method766((byte) 40);
        }
        field1564 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lw;IIIIZ)Z")
    public abstract boolean method250(class269 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(III[[ZZ)V")
    public abstract void method245(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4);
}
