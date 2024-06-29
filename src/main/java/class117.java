import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cg")
public class class117 {

    @OriginalMember(owner = "client!cg", name = "j", descriptor = "I")
    private int field1928 = 0;

    @OriginalMember(owner = "client!cg", name = "n", descriptor = "I")
    private int field1932 = -1;

    @OriginalMember(owner = "client!cg", name = "m", descriptor = "Ldm;")
    private class46 field1931 = new class46();

    @OriginalMember(owner = "client!cg", name = "p", descriptor = "Z")
    public boolean field1934 = false;

    @OriginalMember(owner = "client!cg", name = "d", descriptor = "I")
    private int field1922;

    @OriginalMember(owner = "client!cg", name = "i", descriptor = "I")
    private int field1927;

    @OriginalMember(owner = "client!cg", name = "e", descriptor = "[Ljk;")
    private class543[] field1923;

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "[[[I")
    private int[][][] field1920;

    @OriginalMember(owner = "client!cg", name = "c", descriptor = "Lej;")
    public static class104 field1921 = new class104("Stellar Dawn is loading - please wait...", "Mechscape wird geladen - bitte warten...", "Chargement de Mechscape en cours - veuillez patienter...", "Mechscape carregando. Aguarde...");

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!cg", name = "f", descriptor = "I")
    public static int field1924;

    @OriginalMember(owner = "client!cg", name = "g", descriptor = "I")
    public static int field1925;

    @OriginalMember(owner = "client!cg", name = "h", descriptor = "I")
    public static int field1926;

    @OriginalMember(owner = "client!cg", name = "k", descriptor = "I")
    public static int field1929;

    @OriginalMember(owner = "client!cg", name = "l", descriptor = "I")
    public static int field1930;

    @OriginalMember(owner = "client!cg", name = "o", descriptor = "I")
    public static int field1933;

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(B)V")
    public static void method823(byte arg0) {
        if (arg0 != -54) {
            method827(false, null);
        }
        field1921 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(Ljava/lang/String;BI)V")
    public static final void method824(String arg0, byte arg1, int arg2) {
        field1926++;
        if (arg1 != 75) {
            method825(-60);
        }
        int var3 = class559.field7738;
        int[] var4 = class358.field4825;
        boolean var5 = false;
        for (int var6 = 0; var6 < var3; var6++) {
            class188 var7 = class349.field4696[var4[var6]];
            if (var7 != null && class645.field9372 != var7 && var7.field2630 != null && var7.field2630.equalsIgnoreCase(arg0)) {
                var5 = true;
                if (arg2 == 1) {
                    class351.method2108(class131.field2102, arg1 ^ 0xFFFFD6BA);
                    class586.field8373++;
                    class479.field6754.method124(0, 108);
                    class479.field6754.method84(var4[var6], (byte) -120);
                } else if (arg2 == 4) {
                    class351.method2108(class586.field8385, arg1 - 10586);
                    class587.field8410++;
                    class479.field6754.method91((byte) 88, var4[var6]);
                    class479.field6754.method108((byte) -128, 0);
                } else if (arg2 == 5) {
                    class305.field4157++;
                    class351.method2108(class453.field6406, arg1 ^ 0xFFFFD6BA);
                    class479.field6754.method76(var4[var6], (byte) 92);
                    class479.field6754.method108((byte) -128, 0);
                } else if (arg2 == 6) {
                    class351.method2108(class533.field7457, -10511);
                    class600.field8649++;
                    class479.field6754.method91((byte) 88, var4[var6]);
                    class479.field6754.method61((byte) 21, 0);
                } else if (arg2 == 7) {
                    class299.field4081++;
                    class351.method2108(class515.field7245, arg1 ^ 0xFFFFD6BA);
                    class479.field6754.method76(var4[var6], (byte) 95);
                    class479.field6754.method72(-1875, 0);
                }
                break;
            }
        }
        if (!var5) {
            class176.method1116(class425.field6045.method739(class173.field2491, 119) + arg0, true);
        }
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(I)V")
    public static final void method825(int arg0) {
        field1925++;
        if (arg0 != 27503) {
            field1930 = 126;
        }
        class314 var1 = class483.method2819(15, 0, arg0 - 6200);
        var1.method1962((byte) 0);
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(I)V")
    public final void method826(int arg0) {
        for (int var2 = 0; var2 < this.field1927; var2++) {
            this.field1920[var2][0] = null;
            this.field1920[var2][1] = null;
            this.field1920[var2][2] = null;
            this.field1920[var2] = null;
        }
        if (arg0 != 2) {
            this.method829((byte) -118);
        }
        field1924++;
        this.field1920 = null;
        this.field1923 = null;
        this.field1931.method465(true);
        this.field1931 = null;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(ZLmc;)V")
    public static final void method827(boolean arg0, class114 arg1) {
        if (arg1.field1880 == 5 && arg1.field1787 != -1) {
            class170.method1086(0, class69.field1165, arg1);
        }
        if (arg0) {
            method825(-106);
        }
        field1933++;
    }

    @OriginalMember(owner = "client!cg", name = "a", descriptor = "(BI)[[I")
    public final int[][] method828(byte arg0, int arg1) {
        int var3 = -71 % ((85 - arg0) / 41);
        field1919++;
        if (this.field1927 == this.field1922) {
            this.field1934 = this.field1923[arg1] == null;
            this.field1923[arg1] = class79.field1291;
            return this.field1920[arg1];
        } else if (this.field1927 == 1) {
            this.field1934 = this.field1932 != arg1;
            this.field1932 = arg1;
            return this.field1920[0];
        } else {
            class543 var4 = this.field1923[arg1];
            if (var4 == null) {
                this.field1934 = true;
                if (this.field1928 < this.field1927) {
                    var4 = new class543(arg1, this.field1928);
                    this.field1928++;
                } else {
                    class543 var5 = (class543) this.field1931.method467(3344);
                    var4 = new class543(arg1, var5.field7552);
                    this.field1923[var5.field7551] = null;
                    var5.method1117(0);
                }
                this.field1923[arg1] = var4;
            } else {
                this.field1934 = false;
            }
            this.field1931.method462((byte) 111, var4);
            return this.field1920[var4.field7552];
        }
    }

    @OriginalMember(owner = "client!cg", name = "b", descriptor = "(B)[[[I")
    public final int[][][] method829(byte arg0) {
        field1929++;
        if (this.field1927 != this.field1922) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        int var2 = 0;
        int var3 = -104 % ((arg0 + 30) / 37);
        while (var2 < this.field1927) {
            this.field1923[var2] = class79.field1291;
            var2++;
        }
        return this.field1920;
    }

    @OriginalMember(owner = "client!cg", name = "<init>", descriptor = "(III)V")
    public class117(int arg0, int arg1, int arg2) {
        this.field1922 = arg1;
        this.field1927 = arg0;
        this.field1923 = new class543[this.field1922];
        this.field1920 = new int[this.field1927][3][arg2];
    }
}
