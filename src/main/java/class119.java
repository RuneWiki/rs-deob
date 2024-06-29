import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rn")
public class class119 implements class164 {

    @OriginalMember(owner = "client!rn", name = "f", descriptor = "Lmi;")
    private class227 field1761 = new class227(256);

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "Lnm;")
    private class221 field1758;

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "Lnm;")
    private class221 field1759;

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "[Lwf;")
    private class59[] field1756;

    @OriginalMember(owner = "client!rn", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field1765 = new String[100];

    @OriginalMember(owner = "client!rn", name = "n", descriptor = "Lhm;")
    public static class95 field1769 = null;

    @OriginalMember(owner = "client!rn", name = "e", descriptor = "I")
    public static int field1760 = 0;

    @OriginalMember(owner = "client!rn", name = "k", descriptor = "Ljava/lang/String;")
    public static String field1766 = "Loading world list data";

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!rn", name = "g", descriptor = "I")
    public static int field1762;

    @OriginalMember(owner = "client!rn", name = "h", descriptor = "I")
    public static int field1763;

    @OriginalMember(owner = "client!rn", name = "i", descriptor = "I")
    public static int field1764;

    @OriginalMember(owner = "client!rn", name = "l", descriptor = "I")
    public static int field1767;

    @OriginalMember(owner = "client!rn", name = "m", descriptor = "I")
    public static int field1768;

    @OriginalMember(owner = "client!rn", name = "o", descriptor = "I")
    public static int field1770;

    @OriginalMember(owner = "client!rn", name = "c", descriptor = "(IB)Lkg;", line = 6)
    public class121 method397(int arg0, byte arg1) {
        field1768++;
        class308 var3 = this.field1761.method1539(-75, (long) arg0);
        if (var3 != null) {
            return (class121) var3;
        }
        byte[] var4 = this.field1758.method1513(arg0, true);
        if (arg1 != -18) {
            this.method769((byte) 28, -33);
        }
        if (var4 == null) {
            return null;
        } else {
            class121 var5 = new class121(new class313(var4));
            this.field1761.method1538(-89, (long) arg0, var5);
            return var5;
        }
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(IIII)V", line = 31)
    public static final void method768(int arg0, int arg1, int arg2, int arg3) {
        int var4 = class315.field5201 * arg3 >> 8;
        if (var4 != 0 && arg1 != -1) {
            class50.method373(false, 0, false, class132.field2031, var4, arg1);
            class310.field5053 = true;
        }
        field1757++;
        int var5 = 29 / ((arg0 + 47) / 62);
    }

    @OriginalMember(owner = "client!rn", name = "b", descriptor = "(BI)Z", line = 51)
    public final boolean method769(byte arg0, int arg1) {
        if (arg0 != 72) {
            method768(-121, -47, -23, -53);
        }
        class121 var3 = this.method397(arg1, (byte) -18);
        field1762++;
        return var3 != null && var3.method788(0, this.field1759, this);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ZIIIIF)[I", line = 63)
    public final int[] method770(boolean arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        if (arg3 > -106) {
            return (int[]) null;
        } else {
            field1770++;
            return this.method397(arg2, (byte) -18).method792(arg0, arg4, (double) arg5, this, this.field1759, 0, this.field1756[arg2].field896, arg1);
        }
    }

    @OriginalMember(owner = "client!rn", name = "d", descriptor = "(IB)V", line = 74)
    public static final void method771(int arg0, byte arg1) {
        class125.field1873 = arg0;
        class179.field2785 = -1;
        field1764++;
        class179.field2785 = -1;
        if (arg1 != 4) {
            field1760 = -86;
        }
        class300.method2110(true);
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(Z)V", line = 97)
    public static void method772(boolean arg0) {
        if (arg0) {
            field1766 = (String) null;
        }
        field1769 = null;
        field1766 = null;
        field1765 = null;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(ILjava/lang/String;)Z", line = 114)
    public static final boolean method773(int arg0, String arg1) {
        field1763++;
        if (arg1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class265.field4361; var2++) {
            if (arg1.equalsIgnoreCase(class166.field2624[var2])) {
                return true;
            }
        }
        if (arg0 != 1) {
            method768(-27, 75, 77, -57);
        }
        return false;
    }

    @OriginalMember(owner = "client!rn", name = "a", descriptor = "(BI)Lwf;", line = 140)
    public final class59 method774(byte arg0, int arg1) {
        field1767++;
        if (arg0 != -16) {
            field1769 = (class95) null;
        }
        return this.field1756[arg1];
    }

    @OriginalMember(owner = "client!rn", name = "<init>", descriptor = "(Lnm;Lnm;Lnm;)V", line = 154)
    public class119(class221 arg0, class221 arg1, class221 arg2) {
        this.field1758 = arg1;
        this.field1759 = arg2;
        class313 var4 = new class313(arg0.method1504(0, true, 0));
        int var5 = var4.method2250(-1613178296);
        this.field1756 = new class59[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2224(-120) == 1) {
                this.field1756[var6] = new class59();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field1756[var7] != null) {
                this.field1756[var7].field899 = var4.method2224(-121) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field1756[var8] != null) {
                this.field1756[var8].field889 = var4.method2224(-121) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field1756[var9] != null) {
                this.field1756[var9].field901 = var4.method2224(-121) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field1756[var10] != null) {
                this.field1756[var10].field891 = var4.method2224(-123) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field1756[var11] != null) {
                this.field1756[var11].field888 = var4.method2200(-95);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field1756[var12] != null) {
                this.field1756[var12].field887 = var4.method2200(-103);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field1756[var13] != null) {
                this.field1756[var13].field895 = var4.method2200(45);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field1756[var14] != null) {
                this.field1756[var14].field890 = var4.method2200(-103);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field1756[var15] != null) {
                this.field1756[var15].field892 = (short) var4.method2250(-1613178296);
            }
        }
        if (var4.field5124.length > var4.field5137) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field1756[var16] != null) {
                    var4.method2200(126);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field1756[var17] != null) {
                    var4.method2200(-119);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field1756[var18] != null) {
                    var4.method2224(-121);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field1756[var19] != null) {
                    this.field1756[var19].field896 = var4.method2224(-125) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field1756[var20] != null) {
                    var4.method2200(-119);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field1756[var21] != null) {
                    var4.method2224(-122);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field1756[var22] != null) {
                    var4.method2224(-123);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field1756[var23] != null) {
                    var4.method2224(-128);
                }
            }
        }
    }
}
