import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class76 extends class23 {

    @OriginalMember(owner = "client!bb", name = "I", descriptor = "I")
    private int field1405 = 4096;

    @OriginalMember(owner = "client!bb", name = "P", descriptor = "Z")
    private boolean field1411 = true;

    @OriginalMember(owner = "client!bb", name = "N", descriptor = "I")
    public static int field1409 = 7759444;

    @OriginalMember(owner = "client!bb", name = "Q", descriptor = "I")
    public static int field1412 = -1;

    @OriginalMember(owner = "client!bb", name = "L", descriptor = "Llc;")
    private static class143 field1408 = class66.method374("Connecting to update server", -1);

    @OriginalMember(owner = "client!bb", name = "W", descriptor = "Llc;")
    public static class143 field1418 = field1408;

    @OriginalMember(owner = "client!bb", name = "K", descriptor = "B")
    public static byte field1407;

    @OriginalMember(owner = "client!bb", name = "O", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!bb", name = "R", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!bb", name = "S", descriptor = "I")
    public static int field1414;

    @OriginalMember(owner = "client!bb", name = "T", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!bb", name = "U", descriptor = "I")
    public static int field1416;

    @OriginalMember(owner = "client!bb", name = "V", descriptor = "I")
    public static int field1417;

    @OriginalMember(owner = "client!bb", name = "Y", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!bb", name = "X", descriptor = "[Lvh;")
    public static class43[] field1419;

    @OriginalMember(owner = "client!bb", name = "J", descriptor = "[[[B")
    public static byte[][][] field1406;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "(I)V")
    public static void method435(int arg0) {
        if (arg0 >= 92) {
            field1419 = null;
            field1406 = null;
            field1418 = null;
            field1408 = null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILlc;)I")
    public static final int method436(int arg0, class143 arg1) {
        if (arg0 < 37) {
            field1412 = -40;
        }
        ++field1410;
        return arg1.method913((byte) 45) - -1;
    }

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "(II)V")
    public static final void method437(int arg0, int arg1) {
        class147.field2651 = -1;
        class227.field4096 = -1;
        class41.field691 = arg1;
        class141.method849((byte) -32);
        if (arg0 != -13314) {
            field1412 = 89;
        }
        ++field1417;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (arg1 != 0) {
            if (~arg1 == -2) {
                this.field1411 = ~arg0.method1265(123) == -2;
            }
        } else {
            this.field1405 = arg0.method1275(128);
        }
        if (!arg2) {
            this.method131(70, 73);
        }
        ++field1414;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z[[I)V")
    public static final void method438(boolean arg0, int[][] arg1) {
        ++field1416;
        if (!arg0) {
            method436(67, (class143) null);
        }
        class15.field268 = arg1;
    }

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "(II)I")
    public static final int method439(int arg0, int arg1) {
        if (arg1 <= 22) {
            method436(-96, (class143) null);
        }
        ++field1415;
        return 127 & arg0;
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(II)[[I")
    public final int[][] method131(int arg0, int arg1) {
        ++field1413;
        if (arg1 != 1) {
            return null;
        } else {
            int[][] var3 = super.field366.method209(0, arg0);
            if (super.field366.field508) {
                int[] var4 = this.method155(arg0 + -1 & class79.field1426, (byte) 120, 0);
                int[] var5 = this.method155(arg0, (byte) 89, 0);
                int[] var6 = this.method155(arg0 + 1 & class79.field1426, (byte) 119, 0);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                for (int var10 = 0; var10 < class72.field1359; ++var10) {
                    int var11 = (var6[var10] + -var4[var10]) * this.field1405;
                    int var12 = (var5[var10 + 1 & class172.field3077] + -var5[class172.field3077 & var10 + -1]) * this.field1405;
                    int var13 = var12 >> 12;
                    int var14 = var11 >> 12;
                    int var15 = var14 * var14 >> 12;
                    int var16 = var13 * var13 >> 12;
                    int var17 = (int) (Math.sqrt((double) ((float) (var16 + 4096 - -var15) / 4096.0F)) * 4096.0D);
                    int var18;
                    int var19;
                    int var20;
                    if (var17 != 0) {
                        var18 = var11 / var17;
                        var19 = var12 / var17;
                        var20 = 16777216 / var17;
                    } else {
                        var18 = 0;
                        var19 = 0;
                        var20 = 0;
                    }
                    if (this.field1411) {
                        var19 = (var19 >> 1) + 2048;
                        var20 = (var20 >> 1) + 2048;
                        var18 = (var18 >> 1) + 2048;
                    }
                    var7[var10] = var19;
                    var8[var10] = var18;
                    var9[var10] = var20;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "()V")
    public class76() {
        super(1, false);
    }
}
