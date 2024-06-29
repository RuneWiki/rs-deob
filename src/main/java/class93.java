import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class93 {

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lwm;")
    private class399 field1836 = new class399(64);

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Lwm;")
    public class399 field1846 = new class399(50);

    @OriginalMember(owner = "client!cg", name = "t", descriptor = "Lwm;")
    public class399 field1853 = new class399(5);

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "Lkp;")
    public class341 field1835;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "Lph;")
    private class459 field1840;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "Lph;")
    public class459 field1834;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "Z")
    public boolean field1841;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "Ls;")
    public static class186 field1847 = new class186(68, 1);

    @OriginalMember(owner = "client!cg", name = "q", descriptor = "[I")
    public static int[] field1850 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!cg", name = "s", descriptor = "[I")
    public static int[] field1852 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    public static int field1837;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field1839;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    public static int field1842;

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    public static int field1843;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field1844;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field1845;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "I")
    public static int field1849;

    @OriginalMember(owner = "client!cg", name = "u", descriptor = "I")
    public int field1854;

    @OriginalMember(owner = "client!cg", name = "r", descriptor = "Ljava/lang/Object;")
    public static Object field1851;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ILph;)V", line = 3)
    public static final void method840(int arg0, class459 arg1) {
        class335.field5064 = arg1.method2735("p11_full", 115);
        field1848++;
        class387.field5664 = arg1.method2735("p12_full", arg0 ^ 0x26);
        class395.field6021 = arg1.method2735("b12_full", -37);
        class524.field7621 = arg1.method2735("hitmarks", 114);
        class338.field5086 = arg1.method2735("hitbar_default", 107);
        class510.field7438 = arg1.method2735("timerbar_default", 106);
        class34.field523 = arg1.method2735("headicons_pk", -75);
        class13.field246 = arg1.method2735("headicons_prayer", arg0 ^ 0x3C);
        class199.field3245 = arg1.method2735("hint_headicons", 118);
        class100.field1929 = arg1.method2735("hint_mapmarkers", -33);
        class284.field4281 = arg1.method2735("mapflag", -45);
        class20.field316 = arg1.method2735("cross", -75);
        class185.field2974 = arg1.method2735("mapdots", -5);
        if (arg0 != 64) {
            return;
        }
        class336.field5071 = arg1.method2735("scrollbar", arg0 + 38);
        class271.field4114 = arg1.method2735("name_icons", -11);
        class469.field6951 = arg1.method2735("floorshadows", -11);
        class222.field3471 = arg1.method2735("compass", 96);
        class503.field7359 = arg1.method2735("otherlevel", -11);
        class398.field6041 = arg1.method2735("hint_mapedge", 122);
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(II)V", line = 32)
    public final void method841(int arg0, int arg1) {
        field1843++;
        class399 var3 = this.field1836;
        synchronized (this.field1836) {
            this.field1836.method2471((byte) 98, arg1);
        }
        class399 var4 = this.field1846;
        synchronized (this.field1846) {
            if (arg0 != 774) {
                return;
            }
            this.field1846.method2471((byte) 98, arg1);
        }
        class399 var5 = this.field1853;
        synchronized (this.field1853) {
            this.field1853.method2471((byte) 98, arg1);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZZ)V", line = 54)
    public final void method842(boolean arg0, boolean arg1) {
        field1842++;
        if (this.field1841 != arg1 && !arg0) {
            this.field1841 = arg1;
            this.method843(arg0);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Z)V", line = 73)
    public final void method843(boolean arg0) {
        field1837++;
        class399 var2 = this.field1836;
        synchronized (this.field1836) {
            this.field1836.method2475((byte) 67);
        }
        class399 var3 = this.field1846;
        synchronized (this.field1846) {
            this.field1846.method2475((byte) 67);
        }
        if (arg0) {
            field1850 = null;
        }
        class399 var4 = this.field1853;
        synchronized (this.field1853) {
            this.field1853.method2475((byte) 67);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V", line = 96)
    public final void method844(int arg0) {
        class399 var2 = this.field1836;
        synchronized (this.field1836) {
            this.field1836.method2477(-99);
        }
        field1844++;
        class399 var3 = this.field1846;
        synchronized (this.field1846) {
            this.field1846.method2477(-101);
        }
        if (arg0 >= -4) {
            field1847 = null;
        }
        class399 var4 = this.field1853;
        synchronized (this.field1853) {
            this.field1853.method2477(-122);
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V", line = 115)
    public static void method845(int arg0) {
        int var1 = -38 % ((arg0 - 60) / 52);
        field1851 = null;
        field1847 = null;
        field1852 = null;
        field1850 = null;
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(Z)Z", line = 128)
    public static final boolean method846(boolean arg0) {
        field1838++;
        if (arg0) {
            return class332.field5041 > 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(II)Lsh;", line = 140)
    public final class51 method847(int arg0, int arg1) {
        field1839++;
        class399 var3 = this.field1836;
        class51 var4;
        synchronized (this.field1836) {
            var4 = (class51) this.field1836.method2478(arg1 ^ 0x1, (long) arg0);
        }
        if (var4 != null) {
            return var4;
        }
        class459 var5 = this.field1840;
        byte[] var6;
        synchronized (this.field1840) {
            var6 = this.field1840.method2757(class69.method601(-27128, arg0), class441.method2628(63, arg0), (byte) -120);
        }
        class51 var7 = new class51();
        var7.field1071 = arg0;
        var7.field1057 = this;
        if (var6 != null) {
            var7.method474(arg1 ^ 0x8000, new class289(var6));
        }
        var7.method476((byte) -106);
        if (arg1 != 0) {
            this.field1835 = null;
        }
        class399 var8 = this.field1836;
        synchronized (this.field1836) {
            this.field1836.method2472(arg1 ^ 0xFFFFFFA2, var7, (long) arg0);
            return var7;
        }
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(Lkp;IZLph;Lph;)V", line = 234)
    public class93(class341 arg0, int arg1, boolean arg2, class459 arg3, class459 arg4) {
        this.field1835 = arg0;
        this.field1840 = arg3;
        this.field1834 = arg4;
        this.field1841 = arg2;
        if (this.field1840 != null) {
            int var6 = this.field1840.method2759(16460) - 1;
            this.field1840.method2763(var6, -3);
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(II)V", line = 178)
    public final void method848(int arg0, int arg1) {
        this.field1854 = arg1;
        field1849++;
        class399 var3 = this.field1846;
        synchronized (this.field1846) {
            this.field1846.method2475((byte) 67);
        }
        class399 var4 = this.field1853;
        synchronized (this.field1853) {
            this.field1853.method2475((byte) 67);
            if (arg0 >= -113) {
                this.method844(-53);
            }
        }
    }

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "(I)V", line = 199)
    public final void method849(int arg0) {
        if (arg0 >= -95) {
            field1850 = null;
        }
        class399 var2 = this.field1846;
        synchronized (this.field1846) {
            this.field1846.method2475((byte) 67);
        }
        field1845++;
        class399 var3 = this.field1853;
        synchronized (this.field1853) {
            this.field1853.method2475((byte) 67);
        }
    }
}
