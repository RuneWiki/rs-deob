import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ut")
public class class105 extends class82 {

    @OriginalMember(owner = "client!ut", name = "N", descriptor = "I")
    private int field1274 = -1;

    @OriginalMember(owner = "client!ut", name = "P", descriptor = "Z")
    public static boolean field1276 = false;

    @OriginalMember(owner = "client!ut", name = "M", descriptor = "Lui;")
    public static class193 field1273 = new class193();

    @OriginalMember(owner = "client!ut", name = "L", descriptor = "I")
    public static int field1272;

    @OriginalMember(owner = "client!ut", name = "O", descriptor = "I")
    public static int field1275;

    @OriginalMember(owner = "client!ut", name = "Q", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!ut", name = "R", descriptor = "I")
    private int field1278;

    @OriginalMember(owner = "client!ut", name = "S", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!ut", name = "T", descriptor = "I")
    public static int field1280;

    @OriginalMember(owner = "client!ut", name = "U", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!ut", name = "W", descriptor = "I")
    public static int field1283;

    @OriginalMember(owner = "client!ut", name = "X", descriptor = "I")
    private int field1284;

    @OriginalMember(owner = "client!ut", name = "V", descriptor = "[I")
    private int[] field1282;

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(I)V")
    public final void method485(int arg0) {
        ++field1281;
        super.method485(-101);
        if (arg0 > -63) {
            this.method198(80, 18, (class374) null);
        }
        this.field1282 = null;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(IILos;)V")
    public final void method198(int arg0, int arg1, class374 arg2) {
        if (~arg0 == -1) {
            this.field1274 = arg2.method2136(false);
        }
        int var4 = 77 / ((-69 - arg1) / 42);
        ++field1275;
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(ICLjava/lang/String;)I")
    public static final int method618(int arg0, char arg1, String arg2) {
        ++field1283;
        if (arg0 != 19707) {
            field1273 = null;
        }
        int var3 = 0;
        int var4 = arg2.length();
        for (int var5 = 0; ~var5 > ~var4; ++var5) {
            if (arg2.charAt(var5) == arg1) {
                ++var3;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ut", name = "b", descriptor = "(II)[[I")
    public final int[][] method481(int arg0, int arg1) {
        ++field1277;
        int[][] var3 = super.field992.method3178(arg1, arg0 ^ arg0);
        if (super.field992.field7962) {
            int var4 = this.field1284 * (~class347.field4469 == ~this.field1278 ? arg1 : this.field1278 * arg1 / class347.field4469);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            if (class629.field9033 == this.field1284) {
                for (int var8 = 0; ~class629.field9033 < ~var8; ++var8) {
                    int var9 = this.field1282[var4++];
                    var7[var8] = class288.method1624(var9 << 4, 4080);
                    var6[var8] = class288.method1624(4080, var9 >> 4);
                    var5[var8] = class288.method1624(16711680, var9) >> 12;
                }
            } else {
                for (int var10 = 0; ~class629.field9033 < ~var10; ++var10) {
                    int var11 = this.field1284 * var10 / class629.field9033;
                    int var12 = this.field1282[var4 + var11];
                    var7[var10] = class288.method1624(255, var12) << 4;
                    var6[var10] = class288.method1624(65280, var12) >> 4;
                    var5[var10] = class288.method1624(var12, 16711680) >> 12;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ut", name = "h", descriptor = "(I)V")
    public static void method619(int arg0) {
        if (arg0 == -1) {
            field1273 = null;
        }
    }

    @OriginalMember(owner = "client!ut", name = "a", descriptor = "(I)I")
    public final int method480(int arg0) {
        ++field1279;
        if (arg0 != 1) {
            this.field1274 = -84;
        }
        return this.field1274;
    }

    @OriginalMember(owner = "client!ut", name = "c", descriptor = "(III)V")
    public final void method487(int arg0, int arg1, int arg2) {
        super.method487(arg0, arg1, 116);
        ++field1280;
        if (arg2 < 94) {
            this.method481(14, -79);
        }
        if (this.field1274 >= 0 && class58.field552 != null) {
            int var4 = class58.field552.method119(-122, this.field1274).field2642 ? 64 : 128;
            this.field1282 = class58.field552.method120(var4, false, 1.0F, this.field1274, var4, 93);
            this.field1284 = var4;
            this.field1278 = var4;
        }
    }

    @OriginalMember(owner = "client!ut", name = "<init>", descriptor = "()V")
    public class105() {
        super(0, false);
    }
}
