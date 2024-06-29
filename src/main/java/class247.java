import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public abstract class class247 extends class130 {

    @OriginalMember(owner = "client!ik", name = "z", descriptor = "Z")
    public static boolean field4299 = false;

    @OriginalMember(owner = "client!ik", name = "F", descriptor = "Lcd;")
    public static class64 field4305 = class44.method335((byte) 71, "3D)2Softwarebibliothek gestartet)3");

    @OriginalMember(owner = "client!ik", name = "E", descriptor = "I")
    public static volatile int field4304 = -1;

    @OriginalMember(owner = "client!ik", name = "x", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!ik", name = "y", descriptor = "I")
    public static int field4298;

    @OriginalMember(owner = "client!ik", name = "A", descriptor = "I")
    public static int field4300;

    @OriginalMember(owner = "client!ik", name = "B", descriptor = "I")
    public static int field4301;

    @OriginalMember(owner = "client!ik", name = "C", descriptor = "I")
    public static int field4302;

    @OriginalMember(owner = "client!ik", name = "D", descriptor = "I")
    public static int field4303;

    @OriginalMember(owner = "client!ik", name = "w", descriptor = "Ljava/lang/String;")
    public static String field4296;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(Z)V", line = 9)
    public static void method1785(boolean arg0) {
        if (!arg0) {
            field4296 = null;
            field4305 = null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V", line = 31)
    public static final void method1786(int arg0) {
        field4300++;
        for (int var1 = arg0; var1 < class228.field3878; var1++) {
            int var2 = class89.field1616[var1];
            class232 var3 = class2.field12[var2];
            int var4 = class108.field1991.method152((byte) -88);
            if ((var4 & 0x40) != 0) {
                var3.field1912 = class108.field1991.method120(2);
                if (var3.field1912 == 65535) {
                    var3.field1912 = -1;
                }
            }
            if ((var4 & 0x1) != 0) {
                int var5 = class108.field1991.method110(arg0 + 12749);
                int var6 = class108.field1991.method133(-128);
                var3.method764(class29.field482, var5, var6, -103);
            }
            if ((var4 & 0x20) != 0) {
                var3.field1853 = class108.field1991.method118(arg0 ^ 0x3D);
                var3.field1867 = class108.field1991.method108((byte) -85);
            }
            if ((var4 & 0x4) != 0) {
                var3.field1875 = class108.field1991.method104((byte) -55);
                var3.field1878 = 100;
            }
            if ((var4 & 0x10) != 0) {
                int var7 = class108.field1991.method133(-128);
                int var8 = class108.field1991.method152((byte) -82);
                var3.method764(class29.field482, var7, var8, -85);
                var3.field1915 = class29.field482 + 300;
                var3.field1881 = class108.field1991.method133(-128);
            }
            if ((var4 & 0x8) != 0) {
                var3.field1903 = class108.field1991.method120(2);
                int var9 = class108.field1991.method105((byte) 41);
                var3.field1866 = var9 >> 16;
                var3.field1916 = 0;
                var3.field1872 = 0;
                var3.field1851 = (var9 & 0xFFFF) + class29.field482;
                if (var3.field1903 == 65535) {
                    var3.field1903 = -1;
                }
                if (class29.field482 < var3.field1851) {
                    var3.field1916 = -1;
                }
                if (var3.field1903 != -1 && class29.field482 == var3.field1851) {
                    int var10 = class275.method1908(var3.field1903, 16).field1647;
                    if (var10 != -1) {
                        class199 var11 = class281.method1944(var10, 0);
                        if (var11 != null && var11.field3393 != null) {
                            class10.method89(var3.field1865, var3.field1859, 0, var11, true, false);
                        }
                    }
                }
            }
            if ((var4 & 0x80) != 0) {
                if (var3.field3911.method62(8968)) {
                    class220.method1566(var3, false);
                }
                var3.field3911 = class9.method79((byte) 94, class108.field1991.method118(17));
                var3.method760(var3.field3911.field141, 0);
                var3.field1873 = var3.field3911.field167;
                var3.field1895 = var3.field3911.field113;
                var3.field1887 = var3.field3911.field162;
                var3.field1861 = var3.field3911.field111;
                var3.field1886 = var3.field3911.field158;
                var3.field1856 = var3.field3911.field124;
                var3.field1901 = var3.field3911.field132;
                var3.field1854 = var3.field3911.field112;
                if (var3.field3911.method62(arg0 + 8968)) {
                    class296.method2065(var3.field1876[0], var3.field1898[0], -119, class20.field364, var3, 0, (class290) null, (class41) null);
                }
            }
            if ((var4 & 0x2) != 0) {
                int var12 = class108.field1991.method108((byte) -106);
                if (var12 == 65535) {
                    var12 = -1;
                }
                int var13 = class108.field1991.method110(12749);
                class76.method603(var13, var3, (byte) -128, var12);
            }
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(ILbh;)V", line = 176)
    public static final void method1787(int arg0, class261 arg1) {
        field4301++;
        class3.field26 = arg1;
        if (arg0 >= -54) {
            method1787(-84, (class261) null);
        }
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)V", line = 189)
    public static final void method1788(int arg0) {
        class240.field4097++;
        if (arg0 != 100) {
            field4296 = (String) null;
        }
        field4303++;
        class17.field353.method1214(-33, 8);
        class17.field353.method161((byte) -97, 0L);
    }

    @OriginalMember(owner = "client!ik", name = "e", descriptor = "(I)Z")
    public abstract boolean method72(int arg0);

    @OriginalMember(owner = "client!ik", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method71(boolean arg0);
}
