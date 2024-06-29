import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class278 {

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field4540 = 0;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "J")
    public static long field4542 = 0L;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public int field4532;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public int field4534;

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "I")
    public int field4535;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "I")
    public static int field4536;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public int field4537;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field4541;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public int field4543;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public int field4544;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "Lgi;")
    public static class164 field4533;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V")
    public static final void method1893(byte arg0) {
        field4538++;
        class170.field2791.method1876((byte) 119);
        class202.field3279.method1876((byte) 114);
        class72.field1156.method1876(arg0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V")
    public static final void method1894(int arg0) {
        for (int var1 = -1; var1 < class134.field2172; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class111.field1708[var1];
            }
            class12 var3 = class28.field494[var2];
            if (var3 != null) {
                class23.method188(var3, var3.method101(false), 24866);
            }
        }
        if (arg0 == -28929) {
            field4541++;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIBII)V")
    public static final void method1895(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4539++;
        class148.field2371 = arg1;
        class34.field561 = arg3;
        if (arg2 != -53) {
            field4533 = null;
        }
        class52.field766 = arg0;
        class191.field3112 = arg4;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIZII)V")
    public static final void method1896(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (arg2) {
            method1893((byte) 5);
        }
        int var5 = 0;
        int var6 = arg4;
        field4536++;
        int var7 = class268.method1789(class148.field2371, -71, arg3 + arg4, class34.field561);
        int var8 = class268.method1789(class148.field2371, 11, arg3 - arg4, class34.field561);
        int var9 = -1;
        int var10 = -arg4;
        class309.method2096(arg0, var7, (byte) -117, class232.field3629[arg1], var8);
        while (var5 < var6) {
            var9 += 2;
            var10 += var9;
            if (var10 > 0) {
                var6--;
                var10 -= var6 << 1;
                int var11 = arg1 - var6;
                int var12 = arg1 + var6;
                if (class52.field766 <= var12 && var11 <= class191.field3112) {
                    int var13 = class268.method1789(class148.field2371, 125, arg3 + var5, class34.field561);
                    int var14 = class268.method1789(class148.field2371, 68, arg3 - var5, class34.field561);
                    if (var12 <= class191.field3112) {
                        class309.method2096(arg0, var13, (byte) -117, class232.field3629[var12], var14);
                    }
                    if (var11 >= class52.field766) {
                        class309.method2096(arg0, var13, (byte) -117, class232.field3629[var11], var14);
                    }
                }
            }
            var5++;
            int var15 = arg1 - var5;
            int var16 = arg1 + var5;
            if (class52.field766 <= var16 && class191.field3112 >= var15) {
                int var17 = class268.method1789(class148.field2371, -115, arg3 + var6, class34.field561);
                int var18 = class268.method1789(class148.field2371, 14, arg3 - var6, class34.field561);
                if (class191.field3112 >= var16) {
                    class309.method2096(arg0, var17, (byte) -117, class232.field3629[var16], var18);
                }
                if (class52.field766 <= var15) {
                    class309.method2096(arg0, var17, (byte) -117, class232.field3629[var15], var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V")
    public static void method1897(byte arg0) {
        field4533 = null;
        if (arg0 != 32) {
            field4533 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(III)V")
    public static final void method1898(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class284.field4608; var3++) {
            for (int var4 = 0; var4 < class95.field1504; var4++) {
                for (int var5 = 0; var5 < class200.field3208; var5++) {
                    class116 var6 = class307.field4991[var3][var4][var5];
                    if (var6 != null) {
                        class138 var7 = var6.field1775;
                        if (var7 != null && var7.field2226.method254()) {
                            class275.method1877(var7.field2226, var3, var4, var5, 1, 1);
                            if (var7.field2227 != null && var7.field2227.method254()) {
                                class275.method1877(var7.field2227, var3, var4, var5, 1, 1);
                                var7.field2226.method255(var7.field2227, 0, 0, 0, false);
                                var7.field2227 = var7.field2227.method251(arg0, arg1, arg2);
                            }
                            var7.field2226 = var7.field2226.method251(arg0, arg1, arg2);
                        }
                        for (int var8 = 0; var8 < var6.field1787; var8++) {
                            class90 var10 = var6.field1782[var8];
                            if (var10 != null && var10.field1416.method254()) {
                                class275.method1877(var10.field1416, var3, var4, var5, var10.field1420 + 1 - var10.field1405, var10.field1399 - var10.field1407 + 1);
                                var10.field1416 = var10.field1416.method251(arg0, arg1, arg2);
                            }
                        }
                        class122 var9 = var6.field1765;
                        if (var9 != null && var9.field1930.method254()) {
                            class192.method1344(var9.field1930, var3, var4, var5);
                            var9.field1930 = var9.field1930.method251(arg0, arg1, arg2);
                        }
                    }
                }
            }
        }
    }
}
