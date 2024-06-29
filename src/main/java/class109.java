import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eb")
public class class109 extends class287 {

    @OriginalMember(owner = "client!eb", name = "x", descriptor = "I")
    public int field1851;

    @OriginalMember(owner = "client!eb", name = "B", descriptor = "I")
    public int field1855;

    @OriginalMember(owner = "client!eb", name = "y", descriptor = "I")
    public int field1852;

    @OriginalMember(owner = "client!eb", name = "E", descriptor = "I")
    public int field1858;

    @OriginalMember(owner = "client!eb", name = "t", descriptor = "Lmh;")
    public static class128 field1847 = class22.method156(125, "Mem:");

    @OriginalMember(owner = "client!eb", name = "r", descriptor = "Lmh;")
    public static class128 field1845 = class22.method156(126, "Bitte warten Sie)3)3)3");

    @OriginalMember(owner = "client!eb", name = "v", descriptor = "Lvf;")
    public static class296 field1849 = new class296();

    @OriginalMember(owner = "client!eb", name = "A", descriptor = "[S")
    public static short[] field1854 = new short[256];

    @OriginalMember(owner = "client!eb", name = "C", descriptor = "I")
    public static int field1856 = 0;

    @OriginalMember(owner = "client!eb", name = "s", descriptor = "I")
    public static int field1846;

    @OriginalMember(owner = "client!eb", name = "u", descriptor = "I")
    public static int field1848;

    @OriginalMember(owner = "client!eb", name = "w", descriptor = "I")
    public static int field1850;

    @OriginalMember(owner = "client!eb", name = "D", descriptor = "Ldj;")
    public static class314 field1857;

    @OriginalMember(owner = "client!eb", name = "z", descriptor = "[I")
    public static int[] field1853;

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(I)V", line = 6)
    public static void method664(int arg0) {
        if (arg0 != 64) {
            method667((class314) null, -73, -113, 15);
        }
        field1845 = null;
        field1849 = null;
        field1854 = null;
        field1853 = null;
        field1857 = null;
        field1847 = null;
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(III)Z", line = 36)
    public final boolean method665(int arg0, int arg1, int arg2) {
        if (arg0 != 64) {
            method664(-16);
        }
        field1850++;
        return this.field1858 <= arg1 && this.field1855 >= arg1 && this.field1852 <= arg2 && arg2 <= this.field1851;
    }

    @OriginalMember(owner = "client!eb", name = "b", descriptor = "(B)V", line = 73)
    public static final void method666(byte arg0) {
        field1848++;
        int var1 = class34.field733.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class34.field733[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class31.field697; var4++) {
                    if (class268.field4662[var4] == class226.field3949[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class268.field4662[class31.field697] = class226.field3949[var2];
                    var3 = class31.field697++;
                }
                class194 var5 = new class194(class34.field733[var2]);
                int var6 = 0;
                while (class34.field733[var2].length > var5.field3380 && var6 < 511) {
                    int var7 = var5.method1308(-126);
                    int var8 = var6++ << 6 | var3;
                    int var9 = var7 >> 14;
                    int var10 = (var7 & 0x1F91) >> 7;
                    int var11 = var7 & 0x3F;
                    int var12 = (class226.field3949[var2] >> 8) * 64 + var10 - class221.field3889;
                    int var13 = (class226.field3949[var2] & 0xFF) * 64 + var11 - class4.field72;
                    class208 var14 = class203.method1411(false, var5.method1308(-113));
                    if (class201.field3560[var8] == null && (var14.field3678 & 0x1) > 0 && class281.field4855 == var9 && var12 >= 0 && var14.field3706 + var12 < 104 && var13 >= 0 && var14.field3706 + var13 < 104) {
                        class201.field3560[var8] = new class115();
                        class115 var15 = class201.field3560[var8];
                        class39.field839[class37.field749++] = var8;
                        var15.field477 = class293.field5011;
                        var15.field1934 = var14;
                        var15.method126(-115, var15.field1934.field3706);
                        var15.field482 = var15.field1934.field3639;
                        var15.field446 = var15.field1934.field3651;
                        if (var15.field446 == 0) {
                            var15.field460 = 0;
                        }
                        var15.field439 = var15.field1934.field3697;
                        var15.field443 = var15.field1934.field3680;
                        var15.field425 = var15.field1934.field3700;
                        var15.field455 = var15.field1934.field3647;
                        var15.field467 = var15.field1934.field3674;
                        var15.field481 = var15.field1934.field3705;
                        var15.method127(var15.method118(-1), 0, var13, true, var12);
                    }
                }
            }
        }
        int var16 = 23 % ((-arg0 - 12) / 55);
    }

    @OriginalMember(owner = "client!eb", name = "a", descriptor = "(Ldj;III)[Lvd;", line = 168)
    public static final class127[] method667(class314 arg0, int arg1, int arg2, int arg3) {
        if (arg1 < 38) {
            field1845 = (class128) null;
        }
        field1846++;
        return class118.method708(-2, arg2, arg0, arg3) ? class306.method2092(4) : null;
    }

    @OriginalMember(owner = "client!eb", name = "<init>", descriptor = "(IIII)V", line = 191)
    public class109(int arg0, int arg1, int arg2, int arg3) {
        this.field1851 = arg3;
        this.field1855 = arg2;
        this.field1852 = arg1;
        this.field1858 = arg0;
    }
}
