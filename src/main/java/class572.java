import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class572 {

    @OriginalMember(owner = "client!el", name = "t", descriptor = "I")
    public int field8085;

    @OriginalMember(owner = "client!el", name = "j", descriptor = "[B")
    private byte[] field8075;

    @OriginalMember(owner = "client!el", name = "h", descriptor = "I")
    public static int field8073 = -1;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "Ljava/lang/String;")
    public static String field8070 = null;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field8069;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "I")
    public static int field8071;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public int field8072;

    @OriginalMember(owner = "client!el", name = "o", descriptor = "I")
    public int field8080;

    @OriginalMember(owner = "client!el", name = "r", descriptor = "I")
    public int field8083;

    @OriginalMember(owner = "client!el", name = "i", descriptor = "Lft;")
    public class4 field8074;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "[I")
    public int[] field8067;

    @OriginalMember(owner = "client!el", name = "c", descriptor = "[I")
    public int[] field8068;

    @OriginalMember(owner = "client!el", name = "l", descriptor = "[I")
    public int[] field8077;

    @OriginalMember(owner = "client!el", name = "m", descriptor = "[I")
    public int[] field8078;

    @OriginalMember(owner = "client!el", name = "n", descriptor = "[I")
    public int[] field8079;

    @OriginalMember(owner = "client!el", name = "q", descriptor = "[I")
    public int[] field8082;

    @OriginalMember(owner = "client!el", name = "p", descriptor = "[Lft;")
    public class4[] field8081;

    @OriginalMember(owner = "client!el", name = "k", descriptor = "[[B")
    public byte[][] field8076;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "[[I")
    public int[][] field8066;

    @OriginalMember(owner = "client!el", name = "s", descriptor = "[[I")
    public int[][] field8084;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B[B)V")
    private final void method3364(byte arg0, byte[] arg1) {
        field8069++;
        class494 var3 = new class494(class179.method1289((byte) -57, arg1));
        int var4 = -115 / (arg0 / 45);
        int var5 = var3.method2964((byte) 116);
        if (var5 < 5 || var5 > 6) {
            throw new RuntimeException();
        }
        if (var5 < 6) {
            this.field8080 = 0;
        } else {
            this.field8080 = var3.method2976(-126);
        }
        int var6 = var3.method2964((byte) 70);
        boolean var7 = (var6 & 0x1) != 0;
        boolean var8 = (var6 & 0x2) != 0;
        this.field8083 = var3.method2998(true);
        int var9 = 0;
        int var10 = -1;
        this.field8077 = new int[this.field8083];
        for (int var11 = 0; var11 < this.field8083; var11++) {
            this.field8077[var11] = var9 += var3.method2998(true);
            if (var10 < this.field8077[var11]) {
                var10 = this.field8077[var11];
            }
        }
        this.field8072 = var10 + 1;
        this.field8068 = new int[this.field8072];
        this.field8067 = new int[this.field8072];
        this.field8078 = new int[this.field8072];
        this.field8084 = new int[this.field8072][];
        if (var8) {
            this.field8076 = new byte[this.field8072][];
        }
        this.field8079 = new int[this.field8072];
        if (var7) {
            this.field8082 = new int[this.field8072];
            for (int var12 = 0; var12 < this.field8072; var12++) {
                this.field8082[var12] = -1;
            }
            for (int var13 = 0; var13 < this.field8083; var13++) {
                this.field8082[this.field8077[var13]] = var3.method2976(-127);
            }
            this.field8074 = new class4(this.field8082);
        }
        for (int var14 = 0; var14 < this.field8083; var14++) {
            this.field8078[this.field8077[var14]] = var3.method2976(-125);
        }
        if (var8) {
            for (int var15 = 0; var15 < this.field8083; var15++) {
                byte[] var16 = new byte[64];
                var3.method2958(true, var16, 0, 64);
                this.field8076[this.field8077[var15]] = var16;
            }
        }
        for (int var17 = 0; var17 < this.field8083; var17++) {
            this.field8079[this.field8077[var17]] = var3.method2976(-124);
        }
        for (int var18 = 0; var18 < this.field8083; var18++) {
            this.field8068[this.field8077[var18]] = var3.method2998(true);
        }
        for (int var19 = 0; var19 < this.field8083; var19++) {
            int var26 = this.field8077[var19];
            int var27 = 0;
            int var28 = this.field8068[var26];
            int var29 = -1;
            this.field8084[var26] = new int[var28];
            for (int var30 = 0; var30 < var28; var30++) {
                int var31 = this.field8084[var26][var30] = var27 += var3.method2998(true);
                if (var31 > var29) {
                    var29 = var31;
                }
            }
            this.field8067[var26] = var29 + 1;
            if (var29 + 1 == var28) {
                this.field8084[var26] = null;
            }
        }
        if (!var7) {
            return;
        }
        this.field8081 = new class4[var10 + 1];
        this.field8066 = new int[var10 + 1][];
        for (int var20 = 0; var20 < this.field8083; var20++) {
            int var21 = this.field8077[var20];
            int var22 = this.field8068[var21];
            this.field8066[var21] = new int[this.field8067[var21]];
            for (int var23 = 0; var23 < this.field8067[var21]; var23++) {
                this.field8066[var21][var23] = -1;
            }
            for (int var24 = 0; var24 < var22; var24++) {
                int var25;
                if (this.field8084[var21] == null) {
                    var25 = var24;
                } else {
                    var25 = this.field8084[var21][var24];
                }
                this.field8066[var21][var25] = var3.method2976(-124);
            }
            this.field8081[var21] = new class4(this.field8066[var21]);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(I)V")
    public static void method3365(int arg0) {
        field8070 = null;
        if (arg0 >= -5) {
            method3366(null, -15);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method3366(String arg0, int arg1) {
        field8071++;
        if (arg0 == null) {
            return;
        }
        if (!(class22.field365 < 200 || class678.field9432) || class22.field365 >= 200) {
            class227.method1550((byte) -67, 4, class620.field8672.method3580(class140.field2081, 12));
            return;
        }
        String var2 = class663.method3782((byte) 104, arg0);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class22.field365; var3++) {
            String var8 = class663.method3782((byte) 101, class440.field5967[var3]);
            if (var8 != null && var8.equals(var2)) {
                class227.method1550((byte) -67, 4, arg0 + class620.field8699.method3580(class140.field2081, 12));
                return;
            }
            if (class36.field484[var3] != null) {
                String var9 = class663.method3782((byte) 82, class36.field484[var3]);
                if (var9 != null && var9.equals(var2)) {
                    class227.method1550((byte) -67, 4, arg0 + class620.field8699.method3580(class140.field2081, 12));
                    return;
                }
            }
        }
        int var4 = 0;
        if (arg1 <= 29) {
            method3365(25);
        }
        while (class47.field600 > var4) {
            String var6 = class663.method3782((byte) 94, class646.field9032[var4]);
            if (var6 != null && var6.equals(var2)) {
                class227.method1550((byte) -67, 4, class620.field8704.method3580(class140.field2081, 12) + arg0 + class620.field8705.method3580(class140.field2081, 12));
                return;
            }
            if (class758.field10440[var4] != null) {
                String var7 = class663.method3782((byte) 78, class758.field10440[var4]);
                if (var7 != null && var7.equals(var2)) {
                    class227.method1550((byte) -67, 4, class620.field8704.method3580(class140.field2081, 12) + arg0 + class620.field8705.method3580(class140.field2081, 12));
                    return;
                }
            }
            var4++;
        }
        if (class663.method3782((byte) 69, class210.field3250.field9768).equals(var2)) {
            class227.method1550((byte) -67, 4, class620.field8702.method3580(class140.field2081, 12));
            return;
        }
        class713.field9885++;
        class312 var5 = class353.method2245(class87.field971, class521.field7350, (byte) 61);
        var5.field4445.method2952(0, class348.method2204((byte) -82, arg0));
        var5.field4445.method2953(arg0, -28136);
        class208.method1440(var5, 31);
    }

    @OriginalMember(owner = "client!el", name = "<init>", descriptor = "([BI[B)V")
    public class572(byte[] arg0, int arg1, byte[] arg2) {
        this.field8085 = class167.method1243(arg0, 0, arg0.length);
        if (this.field8085 != arg1) {
            throw new RuntimeException();
        }
        if (arg2 != null) {
            if (arg2.length != 64) {
                throw new RuntimeException();
            }
            this.field8075 = class413.method2507(102, 0, arg0, arg0.length);
            for (int var4 = 0; var4 < 64; var4++) {
                if (this.field8075[var4] != arg2[var4]) {
                    throw new RuntimeException();
                }
            }
        }
        this.method3364((byte) 60, arg0);
    }
}
