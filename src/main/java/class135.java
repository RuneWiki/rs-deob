import java.util.Date;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sk")
public class class135 {

    @OriginalMember(owner = "client!sk", name = "l", descriptor = "I")
    private int field1871 = -1;

    @OriginalMember(owner = "client!sk", name = "h", descriptor = "I")
    private int field1867 = 0;

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "Lan;")
    private class337 field1861 = new class337();

    @OriginalMember(owner = "client!sk", name = "s", descriptor = "Z")
    public boolean field1878 = false;

    @OriginalMember(owner = "client!sk", name = "j", descriptor = "I")
    private int field1869;

    @OriginalMember(owner = "client!sk", name = "i", descriptor = "[[I")
    private int[][] field1868;

    @OriginalMember(owner = "client!sk", name = "o", descriptor = "I")
    private int field1874;

    @OriginalMember(owner = "client!sk", name = "n", descriptor = "[Lbk;")
    private class69[] field1873;

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "[I")
    public static int[] field1862 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0, 2, 0, 0, 1, 0 };

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "I")
    public static int field1860;

    @OriginalMember(owner = "client!sk", name = "d", descriptor = "I")
    public static int field1863;

    @OriginalMember(owner = "client!sk", name = "e", descriptor = "I")
    public static int field1864;

    @OriginalMember(owner = "client!sk", name = "f", descriptor = "I")
    public static int field1865;

    @OriginalMember(owner = "client!sk", name = "g", descriptor = "I")
    public static int field1866;

    @OriginalMember(owner = "client!sk", name = "k", descriptor = "I")
    public static int field1870;

    @OriginalMember(owner = "client!sk", name = "p", descriptor = "I")
    public static int field1875;

    @OriginalMember(owner = "client!sk", name = "q", descriptor = "I")
    public static int field1876;

    @OriginalMember(owner = "client!sk", name = "r", descriptor = "I")
    public static int field1877;

    @OriginalMember(owner = "client!sk", name = "m", descriptor = "Loh;")
    public static class18 field1872;

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(Z)[[I", line = 5)
    public final int[][] method894(boolean arg0) {
        field1870++;
        if (this.field1874 != this.field1869) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field1869; var2++) {
            this.field1873[var2] = class331.field5057;
        }
        return arg0 ? (int[][]) ((int[][]) null) : this.field1868;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZJ)Ljava/lang/String;", line = 28)
    public static final String method895(boolean arg0, long arg1) {
        class316.field4865.setTime(new Date(arg1));
        if (!arg0) {
            method898(126);
        }
        field1865++;
        int var3 = class316.field4865.get(7);
        int var4 = class316.field4865.get(5);
        int var5 = class316.field4865.get(2);
        int var6 = class316.field4865.get(1);
        int var7 = class316.field4865.get(11);
        int var8 = class316.field4865.get(12);
        int var9 = class316.field4865.get(13);
        return class305.field4726[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + class79.field1002[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IIZLlc;)[Laf;", line = 54)
    public static final class189[] method896(int arg0, int arg1, boolean arg2, class175 arg3) {
        if (arg2) {
            method897((byte) -90, 47);
        }
        field1864++;
        return class304.method2132((byte) -106, arg0, arg1, arg3) ? class285.method2035(-1) : null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(BI)Lnn;", line = 75)
    public static final class44 method897(byte arg0, int arg1) {
        field1866++;
        class44 var2 = (class44) class80.field1029.method1562(0, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class271.field4266.method1199(28815, arg1, 1);
        } else {
            var3 = class292.field4583.method1199(arg0 ^ 0x70C0, arg1 & 0x7FFF, 1);
        }
        if (arg0 != 79) {
            field1862 = (int[]) null;
        }
        class44 var4 = new class44();
        if (var3 != null) {
            var4.method255(0, new class107(var3));
        }
        if (arg1 >= 32768) {
            var4.method259((byte) -125);
        }
        class80.field1029.method1565((long) arg1, var4, (byte) 116);
        return var4;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(I)V", line = 108)
    public static final void method898(int arg0) {
        int var1 = class221.field3123;
        field1877++;
        int var2 = class205.field2871;
        int var3 = class325.field4984;
        int var4 = class172.field2480 - 3;
        byte var5 = 20;
        if (class142.field1987 == null || class137.field1919 == null) {
            if (class164.field2271.method1194(class7.field109, (byte) 126) && class164.field2271.method1194(class3.field59, (byte) 126)) {
                class142.field1987 = class36.method217(class7.field109, (byte) -97, class164.field2271, 0);
                class137.field1919 = class36.method217(class3.field59, (byte) 57, class164.field2271, 0);
                if (class250.field3787) {
                    if (class142.field1987 instanceof class317) {
                        class142.field1987 = new class199((class189) class142.field1987);
                    } else {
                        class142.field1987 = new class202((class189) class142.field1987);
                    }
                    if (class137.field1919 instanceof class317) {
                        class137.field1919 = new class199((class189) class137.field1919);
                    } else {
                        class137.field1919 = new class202((class189) class137.field1919);
                    }
                }
            } else if (class250.field3787) {
                class306.method2140(var1, var3, var2, var5, class322.field4952, 256 - class304.field4721);
            } else {
                class144.method966(var1, var3, var2, var5, class322.field4952, 256 - class304.field4721);
            }
        }
        if (class142.field1987 != null && class137.field1919 != null) {
            int var6 = (var2 - (class137.field1919.field1136 * 2)) / class142.field1987.field1136;
            for (int var7 = 0; var7 < var6; var7++) {
                class142.field1987.method531(var1 + (class142.field1987.field1136 * var7) + class137.field1919.field1136, var3);
            }
            class137.field1919.method531(var1, var3);
            class137.field1919.method540(var1 + var2 - class137.field1919.field1136, var3);
        }
        class88.field1097.method58(class164.field2262, var1 + 3, var3 + 14, class223.field3148, -1);
        if (class250.field3787) {
            class306.method2140(var1, var3 + var5, var2, var4 - var5, class322.field4952, 256 - class304.field4721);
        } else {
            class144.method966(var1, var3 + var5, var2, var4 - var5, class322.field4952, 256 - class304.field4721);
        }
        int var8 = class161.field2216;
        int var9 = class211.field2987;
        for (int var10 = 0; var10 < class310.field4794; var10++) {
            int var11 = var3 + ((class310.field4794 - var10 + -1) * 15) - (-var5 - 13);
            if (var1 < var9 && (var1 + var2) > var9 && var8 > (var11 - 13) && (var11 + 3) > var8) {
                if (class250.field3787) {
                    class306.method2140(var1, var11 - 12, var2, 15, class176.field2561, 256 - class60.field745);
                } else {
                    class144.method966(var1, var11 - 12, var2, 15, class176.field2561, 256 - class60.field745);
                }
            }
        }
        if ((class320.field4921 == null || class167.field2326 == null || class296.field4615 == null) && class164.field2271.method1194(class262.field3957, (byte) 126) && class164.field2271.method1194(class67.field865, (byte) 126) && class164.field2271.method1194(class3.field44, (byte) 126)) {
            class320.field4921 = class36.method217(class262.field3957, (byte) 111, class164.field2271, 0);
            class167.field2326 = class36.method217(class67.field865, (byte) 73, class164.field2271, 0);
            class296.field4615 = class36.method217(class3.field44, (byte) -109, class164.field2271, 0);
            if (class250.field3787) {
                if (class320.field4921 instanceof class317) {
                    class320.field4921 = new class199((class189) class320.field4921);
                } else {
                    class320.field4921 = new class202((class189) class320.field4921);
                }
                if ((class167.field2326 instanceof class317)) {
                    class167.field2326 = new class199((class189) class167.field2326);
                } else {
                    class167.field2326 = new class202((class189) class167.field2326);
                }
                if ((class296.field4615 instanceof class317)) {
                    class296.field4615 = new class199((class189) class296.field4615);
                } else {
                    class296.field4615 = new class202((class189) class296.field4615);
                }
            }
        }
        if (arg0 != 256) {
            field1872 = (class18) null;
        }
        if (class320.field4921 != null && class167.field2326 != null && class296.field4615 != null) {
            int var12 = (var2 - (class296.field4615.field1136 * 2)) / class320.field4921.field1136;
            for (int var13 = 0; var13 < var12; var13++) {
                class320.field4921.method531(class320.field4921.field1136 * var13 + (var1 + class296.field4615.field1136), var3 + var4 - class320.field4921.field1144);
            }
            int var14 = (var4 - class296.field4615.field1144 - var5) / class167.field2326.field1144;
            for (int var15 = 0; var15 < var14; var15++) {
                class167.field2326.method531(var1, class167.field2326.field1144 * var15 + var3 + var5);
                class167.field2326.method540(var1 + var2 - class167.field2326.field1136, class167.field2326.field1144 * var15 + var5 + var3);
            }
            class296.field4615.method531(var1, var3 + var4 - class296.field4615.field1144);
            class296.field4615.method540(var1 + var2 - class296.field4615.field1136, -class296.field4615.field1144 + var3 - -var4);
        }
        for (int var16 = 0; var16 < class310.field4794; var16++) {
            int var17 = var3 + (class310.field4794 - var16 - 1) * 15 + var5 + 13;
            int var18 = class223.field3148;
            if (var1 < var9 && (var1 + var2) > var9 && var17 - 13 < var8 && var8 < (var17 + 3)) {
                var18 = class14.field197;
            }
            class88.field1097.method58(class106.method615(var16, true), var1 + 3, var17, var18, 0);
        }
        class227.method1561(class205.field2871, class221.field3123, class172.field2480, class325.field4984, -92);
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(B)V", line = 292)
    public static void method899(byte arg0) {
        field1872 = null;
        field1862 = null;
        if (arg0 != -33) {
            field1862 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(ZI)V", line = 304)
    public static final void method900(boolean arg0, int arg1) {
        class283.field4448 = new int[104];
        if (arg1 > -22) {
            method900(true, -124);
        }
        class113.field1610 = new int[104];
        class311.field4822 = 99;
        field1876++;
        class73.field930 = new int[5];
        class59.field711 = new int[104];
        class149.field2075 = new int[104];
        class138.field1934 = new int[104];
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class21.field270 = new byte[var2][104][104];
        class85.field1082 = new byte[var2][104][104];
        class67.field884 = new byte[var2][104][104];
        class292.field4586 = new byte[var2][105][105];
        class239.field3573 = new byte[var2][104][104];
        class21.field268 = new int[var2][105][105];
    }

    @OriginalMember(owner = "client!sk", name = "b", descriptor = "(B)V", line = 335)
    public final void method901(byte arg0) {
        field1875++;
        if (arg0 != -24) {
            method896(-59, 12, false, (class175) null);
        }
        for (int var2 = 0; var2 < this.field1869; var2++) {
            this.field1868[var2] = null;
        }
        this.field1868 = (int[][]) null;
        this.field1873 = null;
        this.field1861.method2333(3393);
        this.field1861 = null;
    }

    @OriginalMember(owner = "client!sk", name = "a", descriptor = "(IZ)[I", line = 358)
    public final int[] method902(int arg0, boolean arg1) {
        field1860++;
        if (!arg1) {
            field1872 = (class18) null;
        }
        if (this.field1874 == this.field1869) {
            this.field1878 = this.field1873[arg0] == null;
            this.field1873[arg0] = class331.field5057;
            return this.field1868[arg0];
        } else if (this.field1869 == 1) {
            this.field1878 = this.field1871 != arg0;
            this.field1871 = arg0;
            return this.field1868[0];
        } else {
            class69 var3 = this.field1873[arg0];
            if (var3 == null) {
                this.field1878 = true;
                if (this.field1867 < this.field1869) {
                    var3 = new class69(arg0, this.field1867);
                    this.field1867++;
                } else {
                    class69 var4 = (class69) this.field1861.method2328(0);
                    var3 = new class69(arg0, var4.field904);
                    this.field1873[var4.field902] = null;
                    var4.method2285(true);
                }
                this.field1873[arg0] = var3;
            } else {
                this.field1878 = false;
            }
            this.field1861.method2330(var3, (byte) 63);
            return this.field1868[var3.field904];
        }
    }

    @OriginalMember(owner = "client!sk", name = "<init>", descriptor = "(III)V", line = 465)
    public class135(int arg0, int arg1, int arg2) {
        this.field1869 = arg0;
        this.field1868 = new int[this.field1869][arg2];
        this.field1874 = arg1;
        this.field1873 = new class69[this.field1874];
    }

    @OriginalMember(owner = "client!sk", name = "c", descriptor = "(B)V", line = 431)
    public static final void method903(byte arg0) {
        for (int var1 = 0; var1 < 5; var1++) {
            class74.field958[var1] = false;
        }
        if (arg0 <= 116) {
            field1862 = (int[]) null;
        }
        class96.field1245 = -1;
        class118.field1671 = 1;
        class149.field2066 = 0;
        class113.field1607 = -1;
        field1863++;
        class68.field897 = 0;
    }
}
