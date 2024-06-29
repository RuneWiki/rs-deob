import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class95 {

    @OriginalMember(owner = "client!as", name = "f", descriptor = "Lku;")
    private class232 field1224 = new class232(64);

    @OriginalMember(owner = "client!as", name = "h", descriptor = "Lb;")
    private class201 field1226;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "I")
    public int field1223;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "Lea;")
    public static class353 field1225 = new class353("runescape", 0);

    @OriginalMember(owner = "client!as", name = "i", descriptor = "I")
    public static int field1227 = 0;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "F")
    public static float field1222;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field1219;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "I")
    public static int field1220;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "I")
    public static int field1221;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "[I")
    public static int[] field1228;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILdt;)V")
    public static final void method539(int arg0, class145 arg1) {
        if (arg0 != 16383) {
            field1227 = 54;
        }
        field1221++;
        if (class157.field2344 != arg1.field2062) {
            return;
        }
        if (class492.field6935.field6277 == null) {
            arg1.field1959 = 0;
            arg1.field2013 = 0;
            return;
        }
        arg1.field2053 = 150;
        arg1.field1994 = (int) (Math.sin((double) class353.field5090 / 40.0D) * 256.0D) & 0x7FF;
        arg1.field1959 = class295.field4273;
        arg1.field2061 = 5;
        arg1.field2013 = class284.method1788(class492.field6935.field6277, 2591);
        arg1.field1990 = 0;
        arg1.field2052 = class492.field6935.field2110;
        arg1.field1967 = class492.field6935.field2105;
        arg1.field2011 = class492.field6935.field2082;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(BI)Ltn;")
    public final class53 method540(byte arg0, int arg1) {
        int var3 = -93 / ((-arg0 - 12) / 60);
        field1220++;
        class232 var4 = this.field1224;
        class53 var5;
        synchronized (this.field1224) {
            var5 = (class53) this.field1224.method1479(0, (long) arg1);
        }
        if (var5 != null) {
            return var5;
        }
        byte[] var6 = this.field1226.method1257(arg1, 19, 24558);
        class53 var7 = new class53();
        if (var6 != null) {
            var7.method338(new class276(var6), 16384);
        }
        class232 var8 = this.field1224;
        synchronized (this.field1224) {
            this.field1224.method1473(var7, (long) arg1, -53);
            return var7;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Lnp;I)V")
    public static final void method541(class313 arg0, int arg1) {
        if (arg1 != 29831) {
            field1227 = -24;
        }
        arg0.method617(0, 0, class144.field1900, 350);
        field1219++;
        arg0.method650(0, 0, class144.field1900, 350, class248.field3673 << 24 | 0x332277, 1);
        for (int var2 = 0; var2 < 100; var2++) {
            int var13 = field1228[var2] >> 4;
            int var14 = class184.field2715[var2] >> 4;
            int var15 = (class53.field727[((var13 & 0x40) + var14) * 64 & 0x3FFF] >> 10) + var13;
            arg0.method650(var15, var14, 2, 2, class23.field309[var2] << 24 | 0xFFFFFF, 1);
        }
        int var3 = 350 / class485.field6829;
        if (class377.field5435 > 0) {
            int var4 = 346 - (class485.field6829 + 4);
            int var5 = var3 * var4 / (class377.field5435 + var3 - 1);
            int var6 = 4;
            if (class377.field5435 > 1) {
                var6 += (class377.field5435 - class411.field5764 - 1) * (var4 - var5) / (class377.field5435 - 1);
            }
            arg0.method650(class144.field1900 - 16, var6, 12, var5, class248.field3673 << 24 | 0x332277, 2);
            for (int var7 = class411.field5764; class411.field5764 + var3 > var7 && class377.field5435 > var7; var7++) {
                String[] var8 = class193.method1192('\b', arg1 ^ 0x7487, class118.field1487[var7]);
                int var9 = (class144.field1900 - 8 - 16) / var8.length;
                for (int var10 = 0; var10 < var8.length; var10++) {
                    int var11 = var9 * var10 + 8;
                    arg0.method617(var11, 0, var9 + var11 - 8, 350);
                    class92.field1166.method1590(var8[var10], -1, -16777216, var11, (byte) -23, 350 - class252.field3717.field1793 - class451.field6237 - ((-class411.field5764 + var7) * class485.field6829) - 2);
                }
            }
        }
        arg0.method617(0, 0, class144.field1900, 350);
        arg0.method1931(-1, class144.field1900, 350 - class451.field6237, 0, 119);
        class491.field6928.method1590("--> " + class224.field3399, -1, -16777216, 10, (byte) -21, 349 - class37.field488.field1793);
        int var12 = -1;
        if ((class353.field5090 % 30) > 15) {
            var12 = 16777215;
        }
        arg0.method1934(1, 12, 350 - (class37.field488.field1793 + 11), class37.field488.method860(-46, "--> " + class224.field3399.substring(0, class136.field1806)) + 10, var12);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V")
    public static void method542(int arg0) {
        if (arg0 == 15907) {
            field1225 = null;
            field1228 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "<init>", descriptor = "(Lea;ILb;)V")
    public class95(class353 arg0, int arg1, class201 arg2) {
        this.field1226 = arg2;
        this.field1223 = this.field1226.method1235(0, 19);
    }
}
