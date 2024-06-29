import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class84 extends class195 {

    @OriginalMember(owner = "client!jg", name = "bb", descriptor = "I")
    private int field1271 = 4096;

    @OriginalMember(owner = "client!jg", name = "db", descriptor = "Z")
    private boolean field1273 = true;

    @OriginalMember(owner = "client!jg", name = "W", descriptor = "Lck;")
    public static class119 field1266 = class298.method1987((byte) 23, "Konfig geladen)3");

    @OriginalMember(owner = "client!jg", name = "U", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!jg", name = "Y", descriptor = "I")
    public static int field1268;

    @OriginalMember(owner = "client!jg", name = "Z", descriptor = "I")
    public static int field1269;

    @OriginalMember(owner = "client!jg", name = "cb", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!jg", name = "eb", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!jg", name = "V", descriptor = "J")
    public static long field1265;

    @OriginalMember(owner = "client!jg", name = "ab", descriptor = "Lob;")
    public static class294 field1270;

    @OriginalMember(owner = "client!jg", name = "X", descriptor = "Z")
    public static boolean field1267;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lfj;II)V", line = 5)
    public final void method13(class3 arg0, int arg1, int arg2) {
        field1264++;
        if (arg1 >= -117) {
            method569(62, 31);
        }
        if (arg2 == 0) {
            this.field1271 = arg0.method63((byte) 1);
        } else if (arg2 == 1) {
            this.field1273 = arg0.method64((byte) -81) == 1;
        }
    }

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "(I)V", line = 45)
    public static void method567(int arg0) {
        if (arg0 != 0) {
            method569(75, -38);
        }
        field1270 = null;
        field1266 = null;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(ILba;)I", line = 56)
    public static final int method568(int arg0, class292 arg1) {
        if (arg0 < 79) {
            return -68;
        }
        field1269++;
        int var2 = arg1.field4860;
        if (arg1.field4976 == arg1.field4948) {
            var2 = arg1.field4865;
        } else if (arg1.field4958 == arg1.field4948) {
            var2 = arg1.field4851;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jg", name = "<init>", descriptor = "()V", line = 77)
    public class84() {
        super(1, false);
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(BI)[[I", line = 86)
    public final int[][] method9(byte arg0, int arg1) {
        field1268++;
        if (arg0 != 3) {
            this.field1273 = true;
        }
        int[][] var3 = this.field3126.method603(arg1, arg0 - 126);
        if (this.field3126.field1372) {
            int[] var4 = this.method1253(0, 69, class59.field945 & arg1 - 1);
            int[] var5 = this.method1253(0, 75, arg1);
            int[] var6 = this.method1253(0, 74, class59.field945 & arg1 + 1);
            int[] var7 = var3[0];
            int[] var8 = var3[2];
            int[] var9 = var3[1];
            for (int var10 = 0; var10 < class157.field2504; var10++) {
                int var11 = (var6[var10] - var4[var10]) * this.field1271;
                int var12 = (var5[class254.field4088 & var10 + 1] - var5[var10 - 1 & class254.field4088]) * this.field1271;
                int var13 = var11 >> 12;
                int var14 = var12 >> 12;
                int var15 = var14 * var14 >> 12;
                int var16 = var13 * var13 >> 12;
                int var17 = (int) (Math.sqrt((double) ((float) (var15 + var16 + 4096) / 4096.0F)) * 4096.0D);
                int var18;
                int var19;
                int var20;
                if (var17 == 0) {
                    var20 = 0;
                    var18 = 0;
                    var19 = 0;
                } else {
                    var18 = var12 / var17;
                    var19 = 16777216 / var17;
                    var20 = var11 / var17;
                }
                if (this.field1273) {
                    var20 = (var20 >> 1) + 2048;
                    var18 = (var18 >> 1) + 2048;
                    var19 = (var19 >> 1) + 2048;
                }
                var7[var10] = var18;
                var9[var10] = var20;
                var8[var10] = var19;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)V", line = 193)
    public static final void method569(int arg0, int arg1) {
        if (arg1 < 85) {
            field1270 = (class294) null;
        }
        class103.field1559.method491(125, arg0);
        field1272++;
    }
}
