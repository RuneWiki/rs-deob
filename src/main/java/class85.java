import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class85 extends class195 {

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "I")
    private int field1280 = 3216;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    private int field1281 = 3216;

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "[I")
    private int[] field1282 = new int[3];

    @OriginalMember(owner = "client!nk", name = "hb", descriptor = "I")
    private int field1288 = 4096;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "I")
    public static int field1283 = 0;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "I")
    public static int field1284;

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!nk", name = "gb", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "Lva;")
    public static class36 field1285;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "[[[I")
    public static int[][][] field1275;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(B)V", line = 18)
    private final void method570(byte arg0) {
        field1277++;
        double var2 = Math.cos((double) ((float) this.field1281 / 4096.0F));
        this.field1282[0] = (int) (var2 * 4096.0D * Math.sin((double) ((float) this.field1280 / 4096.0F)));
        this.field1282[1] = (int) (var2 * Math.cos((double) ((float) this.field1280 / 4096.0F)) * 4096.0D);
        this.field1282[2] = (int) (Math.sin((double) ((float) this.field1281 / 4096.0F)) * 4096.0D);
        int var4 = this.field1282[1] * this.field1282[1] >> 12;
        int var5 = this.field1282[0] * this.field1282[0] >> 12;
        if (arg0 > -17) {
            this.method11(14, false);
        }
        int var6 = this.field1282[2] * this.field1282[2] >> 12;
        int var7 = (int) (Math.sqrt((double) (var5 + var6 + var4 >> 12)) * 4096.0D);
        if (var7 != 0) {
            this.field1282[0] = (this.field1282[0] << 12) / var7;
            this.field1282[1] = (this.field1282[1] << 12) / var7;
            this.field1282[2] = (this.field1282[2] << 12) / var7;
        }
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(I)V", line = 49)
    public final void method14(int arg0) {
        this.method570((byte) -82);
        if (arg0 != 2048879374) {
            field1286 = -117;
        }
        field1284++;
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V", line = 193)
    public class85() {
        super(1, true);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IZ)[I", line = 69)
    public final int[] method11(int arg0, boolean arg1) {
        int[] var3 = this.field3106.method924(100, arg0);
        field1278++;
        if (arg1) {
            this.method11(115, false);
        }
        if (this.field3106.field2260) {
            int var4 = class88.field1353 * this.field1288 >> 12;
            int[] var5 = this.method1253(0, 81, arg0 - 1 & class59.field945);
            int[] var6 = this.method1253(0, 125, arg0);
            int[] var7 = this.method1253(0, 123, arg0 + 1 & class59.field945);
            for (int var8 = 0; var8 < class157.field2504; var8++) {
                int var9 = (var7[var8] - var5[var8]) * var4 >> 12;
                int var10 = (var6[var8 - 1 & class254.field4088] - var6[class254.field4088 & var8 + 1]) * var4 >> 12;
                int var11 = var10 >> 4;
                if (var11 < 0) {
                    var11 = -var11;
                }
                if (var11 > 255) {
                    var11 = 255;
                }
                int var12 = var9 >> 4;
                if (var12 < 0) {
                    var12 = -var12;
                }
                if (var12 > 255) {
                    var12 = 255;
                }
                int var13 = class1.field5[((var12 + 1) * var12 >> 1) + var11] & 0xFF;
                int var14 = var9 * var13 >> 8;
                int var15 = this.field1282[1] * var14 >> 12;
                int var16 = var13 * 4096 >> 8;
                int var17 = var10 * var13 >> 8;
                int var18 = this.field1282[2] * var16 >> 12;
                int var19 = this.field1282[0] * var17 >> 12;
                var3[var8] = var15 + var18 + var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "(B)V", line = 141)
    public static final void method571(byte arg0) {
        field1279++;
        int var1 = 90 % ((arg0 - 16) / 60);
        boolean var2 = false;
        while (!var2) {
            var2 = true;
            for (int var3 = 0; var3 < (class272.field4474 - 1); var3++) {
                if (class88.field1355[var3] < 1000 && class88.field1355[var3 + 1] > 1000) {
                    var2 = false;
                    class119 var4 = class212.field3398[var3];
                    class212.field3398[var3] = class212.field3398[var3 + 1];
                    class212.field3398[var3 + 1] = var4;
                    class119 var5 = class155.field2471[var3];
                    class155.field2471[var3] = class155.field2471[var3 + 1];
                    class155.field2471[var3 + 1] = var5;
                    int var6 = class158.field2513[var3];
                    class158.field2513[var3] = class158.field2513[var3 + 1];
                    class158.field2513[var3 + 1] = var6;
                    int var7 = class31.field446[var3];
                    class31.field446[var3] = class31.field446[var3 + 1];
                    class31.field446[var3 + 1] = var7;
                    short var8 = class88.field1355[var3];
                    class88.field1355[var3] = class88.field1355[var3 + 1];
                    class88.field1355[var3 + 1] = var8;
                    long var9 = class3.field99[var3];
                    class3.field99[var3] = class3.field99[var3 + 1];
                    class3.field99[var3 + 1] = var9;
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "(B)V", line = 210)
    public static void method572(byte arg0) {
        field1285 = null;
        if (arg0 < 47) {
            field1276 = -11;
        }
        field1275 = (int[][][]) null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(Lfj;II)V", line = 224)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg1 >= -117) {
            return;
        }
        if (arg2 == 0) {
            this.field1288 = arg0.method63((byte) 1);
        } else if (arg2 == 1) {
            this.field1280 = arg0.method63((byte) 1);
        } else if (arg2 == 2) {
            this.field1281 = arg0.method63((byte) 1);
        }
        field1287++;
    }
}
