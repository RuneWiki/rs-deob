import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public abstract class class106 extends class77 {

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "I")
    public static int field1842 = 0;

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "Ldc;")
    private static class37 field1847 = class185.method1233((byte) 86, "Connection timed out)3");

    @OriginalMember(owner = "client!ji", name = "V", descriptor = "Ldc;")
    public static class37 field1850 = class185.method1233((byte) 86, "::qa_op_test");

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "Ldc;")
    public static class37 field1840 = field1847;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "Ldc;")
    public static class37 field1839 = class185.method1233((byte) 86, ")1p");

    @OriginalMember(owner = "client!ji", name = "X", descriptor = "Ldc;")
    public static class37 field1852 = class185.method1233((byte) 86, ")2");

    @OriginalMember(owner = "client!ji", name = "D", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public int field1833;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    public int field1834;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public int field1837;

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    public static int field1838;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public int field1841;

    @OriginalMember(owner = "client!ji", name = "O", descriptor = "I")
    public int field1843;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!ji", name = "U", descriptor = "I")
    public int field1849;

    @OriginalMember(owner = "client!ji", name = "W", descriptor = "I")
    public static int field1851;

    @OriginalMember(owner = "client!ji", name = "Y", descriptor = "I")
    public static int field1853;

    @OriginalMember(owner = "client!ji", name = "Z", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "Lqh;")
    public static class182 field1844;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "[[[B")
    public static byte[][][] field1836;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "[[[I")
    public static int[][][] field1845;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lwa;ILdc;Ldc;)Lqh;")
    public static final class182 method685(class238 arg0, int arg1, class37 arg2, class37 arg3) {
        field1838++;
        if (arg1 < 49) {
            field1836 = null;
        }
        int var4 = arg0.method1543(79, arg3);
        int var5 = arg0.method1546(arg2, -124, var4);
        return class209.method1389(arg0, false, var4, var5);
    }

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "(I)V")
    public static final void method686(int arg0) {
        if (!class118.field2114) {
            class171.field3281[0] = 1006;
            class231.field4234[0] = class161.field3046;
            class220.field4088[0] = class243.field4462;
            class97.field1701 = 1;
        }
        if (class149.field2828 != -1) {
            class209.method1392(class149.field2828, false);
        }
        if (arg0 != 25602) {
            return;
        }
        for (int var1 = 0; var1 < class157.field2981; var1++) {
            if (class211.field3948[var1]) {
                class85.field1505[var1] = true;
            }
            class159.field3013[var1] = class211.field3948[var1];
            class211.field3948[var1] = false;
        }
        class218.field4061 = -1;
        field1848++;
        class150.field2832 = -1;
        class80.field1410 = class203.field3758;
        class217.field4054 = null;
        if (class149.field2828 != -1) {
            class157.field2981 = 0;
            class222.method1463(0, 0, class103.field1770, -1, (byte) 21, 0, class115.field2063, class149.field2828, 0);
        }
        class48.method398();
        class82.method560(false);
        if (class118.field2114) {
            class221.method1455(-19);
        } else if (class218.field4061 != -1) {
            class158.method1068(class150.field2832, (byte) -64, class218.field4061);
        }
        if (class122.field2175 == 3) {
            for (int var2 = 0; var2 < class157.field2981; var2++) {
                if (class159.field3013[var2]) {
                    class48.method410(class61.field1121[var2], class64.field1167[var2], class58.field1089[var2], class120.field2139[var2], 16711935, 128);
                } else if (class85.field1505[var2]) {
                    class48.method410(class61.field1121[var2], class64.field1167[var2], class58.field1089[var2], class120.field2139[var2], 16711680, 128);
                }
            }
        }
        class81.method551((byte) -106, class201.field3749, class238.field4382.field3505, class238.field4382.field3490, class125.field2246);
        class201.field3749 = 0;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)V")
    public abstract void method687(int arg0, int arg1);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIII)V")
    public abstract void method688(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(III)V")
    public abstract void method689(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIIII)V")
    public final void method690(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1854++;
        if (arg4 > -93) {
            field1836 = null;
        }
        int var6 = this.field1843 << 3;
        int var7 = (arg2 << 4) + (var6 & 0xF);
        int var8 = this.field1849 << 3;
        int var9 = (arg1 << 4) + (var8 & 0xF);
        this.method694(var6, var8, var7, var9, arg3, arg0);
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIII)V")
    public abstract void method691(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(IIII)V")
    public abstract void method692(int arg0, int arg1, int arg2, int arg3);

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "(I)V")
    public static final void method693(int arg0) {
        class19.field309 = 0;
        field1853++;
        class75.field1336 = 0;
        class79.method542(-3);
        class200.method1319((byte) -11);
        class104.method676(0);
        class144.method999(118);
        for (int var1 = arg0; var1 < class75.field1336; var1++) {
            int var3 = class119.field2131[var1];
            if (class203.field3758 != class8.field107[var3].field3529) {
                class8.field107[var3] = null;
            }
        }
        if (class8.field100 != class12.field167.field526) {
            throw new RuntimeException("gpp1 pos:" + class12.field167.field526 + " psize:" + class8.field100);
        }
        for (int var2 = 0; var2 < class76.field1342; var2++) {
            if (class8.field107[class9.field122[var2]] == null) {
                throw new RuntimeException("gpp2 pos:" + var2 + " size:" + class76.field1342);
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V")
    public abstract void method694(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5);

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "(I)V")
    public static void method695(int arg0) {
        field1847 = null;
        field1844 = null;
        field1845 = null;
        field1836 = null;
        field1840 = null;
        if (arg0 != 3) {
            method685(null, -75, null, null);
        }
        field1850 = null;
        field1839 = null;
        field1852 = null;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(BI)V")
    public static final void method696(byte arg0, int arg1) {
        field1851++;
        if (arg1 == -1 || !class119.field2133[arg1]) {
            return;
        }
        class225.field4163.method1545(1, arg1);
        if (class177.field3344[arg1] == null) {
            return;
        }
        boolean var2 = true;
        if (arg0 != 9) {
            return;
        }
        for (int var3 = 0; var3 < class177.field3344[arg1].length; var3++) {
            if (class177.field3344[arg1][var3] != null) {
                if (class177.field3344[arg1][var3].field2513 == 2) {
                    var2 = false;
                } else {
                    class177.field3344[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class177.field3344[arg1] = null;
        }
        class119.field2133[arg1] = false;
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(ZLdc;B)V")
    public static final void method697(boolean arg0, class37 arg1, byte arg2) {
        class37 var3 = arg1.method315(48);
        short[] var4 = new short[16];
        field1846++;
        int var5 = 0;
        for (int var6 = 0; var6 < class69.field1256; var6++) {
            class125 var9 = class223.method1471(-85, var6);
            if ((!arg0 || var9.field2230) && var9.field2285 == -1 && var9.field2245 == -1 && var9.field2286 == 0 && var9.field2232.method315(48).method336(92, var3) != -1) {
                if (var5 >= 250) {
                    class18.field268 = null;
                    class2.field13 = -1;
                    return;
                }
                if (var4.length <= var5) {
                    short[] var10 = new short[var4.length * 2];
                    for (int var11 = 0; var11 < var5; var11++) {
                        var10[var11] = var4[var11];
                    }
                    var4 = var10;
                }
                var4[var5++] = (short) var6;
            }
        }
        class147.field2804 = 0;
        class2.field13 = var5;
        class37[] var7 = new class37[class2.field13];
        class18.field268 = var4;
        for (int var8 = 0; var8 < class2.field13; var8++) {
            var7[var8] = class223.method1471(121, var4[var8]).field2232;
        }
        if (arg2 <= 108) {
            method686(-115);
        }
        class91.method599(class18.field268, (byte) -9, var7);
    }

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(II)V")
    public abstract void method698(int arg0, int arg1);
}
