import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class369 {

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Z")
    public static boolean field5332 = false;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    private int field5327;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public int field5328;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public int field5329;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "I")
    public static int field5333;

    @OriginalMember(owner = "client!fe", name = "h", descriptor = "I")
    public static int field5334;

    @OriginalMember(owner = "client!fe", name = "i", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!fe", name = "j", descriptor = "Ltk;")
    public class210 field5336;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(Lrp;Z)V")
    public final void method2269(class276 arg0, boolean arg1) {
        while (true) {
            int var3 = arg0.method1701(-23121);
            if (var3 == 0) {
                if (arg1) {
                    this.field5336 = null;
                }
                field5333++;
                return;
            }
            this.method2273(var3, arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(B)V")
    public static final void method2270(byte arg0) {
        field5335++;
        if (class490.field6909 != null) {
            return;
        }
        class490.field6909 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 > -36) {
            method2272(55);
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 512; var4++) {
            float var5 = ((float) (var4 >> 3) / 64.0F + 0.0078125F) * 360.0F;
            float var6 = (float) (var4 & 0x7) / 8.0F + 0.0625F;
            for (int var7 = 0; var7 < 128; var7++) {
                float var8 = (float) var7 / 128.0F;
                float var9 = 0.0F;
                float var10 = 0.0F;
                float var11 = 0.0F;
                float var12 = var5 / 60.0F;
                int var13 = (int) var12;
                int var14 = var13 % 6;
                float var15 = var12 - (float) var13;
                float var16 = (1.0F - var6) * var8;
                float var17 = (1.0F - var6 * var15) * var8;
                float var18 = (1.0F - (1.0F - var15) * var6) * var8;
                if (var14 == 0) {
                    var10 = var18;
                    var9 = var8;
                    var11 = var16;
                } else if (var14 == 1) {
                    var10 = var8;
                    var9 = var17;
                    var11 = var16;
                } else if (var14 == 2) {
                    var11 = var18;
                    var9 = var16;
                    var10 = var8;
                } else if (var14 == 3) {
                    var10 = var17;
                    var11 = var8;
                    var9 = var16;
                } else if (var14 == 4) {
                    var9 = var18;
                    var11 = var8;
                    var10 = var16;
                } else if (var14 == 5) {
                    var10 = var16;
                    var11 = var17;
                    var9 = var8;
                }
                float var19 = (float) Math.pow((double) var9, var1);
                float var20 = (float) Math.pow((double) var10, var1);
                float var21 = (float) Math.pow((double) var11, var1);
                int var22 = (int) (var19 * 256.0F);
                int var23 = (int) (var20 * 256.0F);
                int var24 = (int) (var21 * 256.0F);
                int var25 = (var22 << 16) + (var23 << 8) + var24 - 16777216;
                class490.field6909[var3++] = var25;
            }
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)Lju;")
    public final synchronized class72 method2271(int arg0) {
        if (arg0 > -95) {
            this.field5329 = -46;
        }
        field5330++;
        class72 var2 = (class72) this.field5336.field3194.method1479(0, (long) this.field5327);
        if (var2 != null) {
            return var2;
        }
        class72 var3 = class72.method423(this.field5336.field3185, this.field5327, 0);
        if (var3 != null) {
            this.field5336.field3194.method1473(var3, (long) this.field5327, 114);
        }
        return var3;
    }

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "(I)[Lfa;")
    public static final class142[] method2272(int arg0) {
        field5334++;
        if (arg0 != -15130) {
            field5332 = false;
        }
        return new class142[] { class93.field1186, class93.field1187, class93.field1188, class93.field1189, class93.field1190, class93.field1191, class93.field1192, class93.field1193, class93.field1194, class93.field1195 };
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILrp;Z)V")
    private final void method2273(int arg0, class276 arg1, boolean arg2) {
        if (arg2) {
            method2270((byte) 47);
        }
        if (arg0 == 1) {
            this.field5327 = arg1.method1729(65280);
        } else if (arg0 == 2) {
            this.field5328 = arg1.method1701(-23121);
            this.field5329 = arg1.method1701(-23121);
        }
        field5331++;
    }
}
