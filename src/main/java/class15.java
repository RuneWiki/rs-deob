import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class15 {

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    private int field260 = 0;

    @OriginalMember(owner = "client!nf", name = "r", descriptor = "I")
    private int field275 = -1;

    @OriginalMember(owner = "client!nf", name = "l", descriptor = "Llh;")
    private class58 field269 = new class58();

    @OriginalMember(owner = "client!nf", name = "w", descriptor = "Z")
    public boolean field280 = false;

    @OriginalMember(owner = "client!nf", name = "q", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client!nf", name = "t", descriptor = "[Lve;")
    private class109[] field277;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "I")
    private int field262;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "[[[I")
    private int[][][] field263;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "Ljava/lang/String;")
    public static String field261 = "purple:";

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "I")
    public static int field259 = 0;

    @OriginalMember(owner = "client!nf", name = "p", descriptor = "I")
    public static int field273 = 0;

    @OriginalMember(owner = "client!nf", name = "i", descriptor = "I")
    public static int field266 = 0;

    @OriginalMember(owner = "client!nf", name = "s", descriptor = "[I")
    public static int[] field276 = new int[8];

    @OriginalMember(owner = "client!nf", name = "v", descriptor = "[I")
    public static int[] field279 = new int[14];

    @OriginalMember(owner = "client!nf", name = "h", descriptor = "I")
    public static int field265 = 0;

    @OriginalMember(owner = "client!nf", name = "y", descriptor = "[Ljava/lang/String;")
    public static String[] field282 = new String[1000];

    @OriginalMember(owner = "client!nf", name = "j", descriptor = "Llm;")
    public static class150 field267 = new class150(64);

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!nf", name = "k", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!nf", name = "n", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!nf", name = "o", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!nf", name = "u", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!nf", name = "x", descriptor = "I")
    public static int field281;

    @OriginalMember(owner = "client!nf", name = "z", descriptor = "Lnh;")
    public static class305 field283;

    @OriginalMember(owner = "client!nf", name = "m", descriptor = "[I")
    public static int[] field270;

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IB)[[I")
    public final int[][] method104(int arg0, byte arg1) {
        field271++;
        if (arg1 < 98) {
            field267 = null;
        }
        if (this.field274 == this.field262) {
            this.field280 = this.field277[arg0] == null;
            this.field277[arg0] = class124.field1746;
            return this.field263[arg0];
        } else if (this.field262 == 1) {
            this.field280 = this.field275 != arg0;
            this.field275 = arg0;
            return this.field263[0];
        } else {
            class109 var3 = this.field277[arg0];
            if (var3 == null) {
                this.field280 = true;
                if (this.field262 <= this.field260) {
                    class109 var4 = (class109) this.field269.method363(128);
                    var3 = new class109(arg0, var4.field1558);
                    this.field277[var4.field1556] = null;
                    var4.method962(128);
                } else {
                    var3 = new class109(arg0, this.field260);
                    this.field260++;
                }
                this.field277[arg0] = var3;
            } else {
                this.field280 = false;
            }
            this.field269.method368((byte) -101, var3);
            return this.field263[var3.field1558];
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(ILnh;)V")
    public static final void method105(int arg0, class305 arg1) {
        class6.field63 = arg1;
        if (arg0 != 3) {
            field265 = 56;
        }
        field281++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(I)V")
    public final void method106(int arg0) {
        for (int var2 = 0; var2 < this.field262; var2++) {
            this.field263[var2][0] = null;
            this.field263[var2][1] = null;
            this.field263[var2][2] = null;
            this.field263[var2] = null;
        }
        if (arg0 != 29667) {
            this.method106(-108);
        }
        this.field263 = null;
        this.field277 = null;
        this.field269.method365((byte) 67);
        this.field269 = null;
        field278++;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(Lnh;BLnh;Lnh;)V")
    public static final void method107(class305 arg0, byte arg1, class305 arg2, class305 arg3) {
        class76.field1067 = arg2;
        class250.field3904 = arg3;
        class164.field2330 = arg0;
        if (arg1 > -70) {
            method110((byte) -117);
        }
        field268++;
    }

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "(I)[[[I")
    public final int[][][] method108(int arg0) {
        field272++;
        if (this.field274 != this.field262) {
            throw new RuntimeException("Can only retrieve a full image cache");
        }
        for (int var2 = 0; var2 < this.field262; var2++) {
            this.field277[var2] = class124.field1746;
        }
        if (arg0 != 3560) {
            this.field277 = null;
        }
        return this.field263;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)V")
    public static void method109(int arg0) {
        field282 = null;
        field283 = null;
        field270 = null;
        if (arg0 >= -84) {
            method110((byte) 22);
        }
        field276 = null;
        field267 = null;
        field279 = null;
        field261 = null;
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static final void method110(byte arg0) {
        class53.method336((byte) 76);
        class42.method282((byte) 121);
        class80.method512(true);
        class186.method1179(4);
        field258++;
        class233.method1534(5414);
        class129.method827((byte) 103);
        class12.method75(0);
        class248.method1622(true);
        class157.method973(4);
        class36.method251(-617890907);
        class205.method1283(-109);
        class163.method1038((byte) -71);
        class281.method1826(-1);
        class20.method138(true);
        class211.method1311(-25976);
        class34.method235(2);
        class19.method128(0);
        class18.method127((byte) 45);
        class211.method1309((byte) -120);
        if (class292.field4657 != 0) {
            for (int var1 = 0; var1 < class161.field2254.length; var1++) {
                class161.field2254[var1] = null;
            }
            class138.field1890 = 0;
        }
        class111.method708((byte) 91);
        class190.method1197(127);
        class27.method177(30068);
        class192.method1221(-128);
        class295.field4708.method944(-74);
        ((class88) class118.field1696).method569(113);
        class182.field2763.method1485(true);
        class142.field1962.method2064(0);
        class186.field2822.method2064(0);
        class177.field2499.method2064(0);
        class68.field958.method2064(0);
        class307.field4932.method2064(0);
        class240.field3737.method2064(0);
        class29.field449.method2064(0);
        class311.field5009.method2064(0);
        class160.field2238.method2064(0);
        class242.field3807.method2064(0);
        if (arg0 > -74) {
            field261 = null;
        }
        class241.field3783.method2064(0);
        class82.field1126.method944(102);
        class83.field1154.method944(127);
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(III)V")
    public class15(int arg0, int arg1, int arg2) {
        this.field274 = arg1;
        this.field277 = new class109[this.field274];
        this.field262 = arg0;
        this.field263 = new int[this.field262][3][arg2];
    }
}
