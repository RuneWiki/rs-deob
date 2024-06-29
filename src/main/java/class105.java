import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public abstract class class105 {

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public int field1856;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public int field1851;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "J")
    public static volatile long field1853 = 0L;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field1847;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public static int field1855;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "Lcc;")
    public static class202 field1846;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lfa;")
    public static class239 field1854;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "[I")
    public static int[] field1845;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(IBI)V")
    public abstract void method497(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(III)V")
    public abstract void method499(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(III)V")
    public abstract void method501(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method783(String arg0, byte arg1) {
        System.out.println("Bad " + arg0 + ", Usage: worldid, <live/rc/wip>, <english/german>, <game0/game1>");
        field1849++;
        System.exit(1);
        if (arg1 != -105) {
            method788((byte) 42);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)Lra;")
    public static final class223 method784(int arg0, int arg1) {
        field1855++;
        if (arg1 != -1) {
            method786(true);
        }
        class223 var2 = (class223) class59.field1208.method940((long) arg0, arg1 ^ 0xFFFFFFA3);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class39.field908.method1645(true, class185.method1263(arg0, -101), class35.method371(-105, arg0));
        class223 var4 = new class223();
        if (var3 != null) {
            var4.method1484(0, new class32(var3));
        }
        class59.field1208.method937(-126, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static final void method785(int arg0) {
        field1850++;
        class128.method911(class45.field972, -17149);
        class111.field1951++;
        if (class181.field3170 && class124.field2177) {
            int var1 = class28.field515;
            int var2 = var1 - class158.field2854;
            int var3 = class174.field3059;
            if (arg0 != 20618) {
                method787(false, -120);
            }
            if (var2 < class76.field1444) {
                var2 = class76.field1444;
            }
            if ((class76.field1444 + class185.field3237.field2575) < (var2 + class45.field972.field2575)) {
                var2 = class76.field1444 + class185.field3237.field2575 - class45.field972.field2575;
            }
            int var4 = var3 - class262.field4485;
            int var5 = var2 + class185.field3237.field2555 - class76.field1444;
            int var6 = var2 - class124.field2187;
            if (var4 < class239.field4211) {
                var4 = class239.field4211;
            }
            if (class45.field972.field2490 + var4 > class239.field4211 - -class185.field3237.field2490) {
                var4 = class239.field4211 + class185.field3237.field2490 - class45.field972.field2490;
            }
            int var7 = var4 + class185.field3237.field2413 - class239.field4211;
            int var8 = class45.field972.field2528;
            int var9 = var4 - class121.field2144;
            if (class111.field1951 > class45.field972.field2430 && (var6 > var8 || var6 < -var8 || var9 > var8 || (-var8) > var9)) {
                class102.field1806 = true;
            }
            if (class45.field972.field2418 != null && class102.field1806) {
                class117 var10 = new class117();
                var10.field2055 = var7;
                var10.field2056 = var5;
                var10.field2046 = class45.field972;
                var10.field2053 = class45.field972.field2418;
                class229.method1519(-116, var10);
            }
            if (class170.field2986 == 0) {
                if (class102.field1806) {
                    if (class45.field972.field2562 != null) {
                        class117 var11 = new class117();
                        var11.field2046 = class45.field972;
                        var11.field2056 = var5;
                        var11.field2053 = class45.field972.field2562;
                        var11.field2048 = class104.field1830;
                        var11.field2055 = var7;
                        class229.method1519(-95, var11);
                    }
                    if (class104.field1830 != null && client.method1045(class45.field972) != null) {
                        class36.field812++;
                        class223.field3830.method368(arg0 ^ 0xFFFFAF1C, 151);
                        class223.field3830.method344(class45.field972.field2433, -904679672);
                        class223.field3830.method348(class104.field1830.field2433, arg0 ^ 0x508E);
                        class223.field3830.method329(class45.field972.field2530, (byte) 97);
                        class223.field3830.method290((byte) -20, class104.field1830.field2530);
                    }
                } else if ((class7.field93 == 1 || class77.method593(class271.field4664 - 1, (byte) -15)) && class271.field4664 > 2) {
                    class158.method1119((byte) 91);
                } else if (class271.field4664 > 0) {
                    class235.method1568(-119);
                }
                class45.field972 = null;
            }
        } else if (class111.field1951 > 1) {
            class45.field972 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    public static final void method786(boolean arg0) {
        class23.field414.method942(0);
        class111.field1950.method942(0);
        if (arg0) {
            field1846 = null;
        }
        field1847++;
        class114.field2007.method942(0);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(ZI)V")
    public static final void method787(boolean arg0, int arg1) {
        field1848++;
        class270 var2 = class202.method1368(-15, 1, arg1);
        if (!arg0) {
            field1845 = null;
        }
        var2.method1795(-2113);
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(B)V")
    public static void method788(byte arg0) {
        if (arg0 >= -76) {
            method785(89);
        }
        field1845 = null;
        field1854 = null;
        field1846 = null;
    }

    @OriginalMember(owner = "client!tf", name = "<init>", descriptor = "(III)V")
    public class105(int arg0, int arg1, int arg2) {
        this.field1856 = arg2;
        this.field1852 = arg0;
        this.field1851 = arg1;
    }
}
