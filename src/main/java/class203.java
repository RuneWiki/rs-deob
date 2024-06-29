import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ve")
public class class203 extends class107 {

    @OriginalMember(owner = "client!ve", name = "I", descriptor = "I")
    private int field3286 = 0;

    @OriginalMember(owner = "client!ve", name = "H", descriptor = "I")
    private int field3285 = 1;

    @OriginalMember(owner = "client!ve", name = "L", descriptor = "I")
    private int field3289 = 0;

    @OriginalMember(owner = "client!ve", name = "J", descriptor = "I")
    public static int field3287 = 0;

    @OriginalMember(owner = "client!ve", name = "K", descriptor = "Z")
    public static boolean field3288 = false;

    @OriginalMember(owner = "client!ve", name = "E", descriptor = "Lnb;")
    public static class223 field3282 = new class223();

    @OriginalMember(owner = "client!ve", name = "P", descriptor = "Z")
    public static boolean field3293 = false;

    @OriginalMember(owner = "client!ve", name = "D", descriptor = "I")
    public static int field3281;

    @OriginalMember(owner = "client!ve", name = "G", descriptor = "I")
    public static int field3284;

    @OriginalMember(owner = "client!ve", name = "N", descriptor = "I")
    public static int field3291;

    @OriginalMember(owner = "client!ve", name = "F", descriptor = "Lgi;")
    public static class164 field3283;

    @OriginalMember(owner = "client!ve", name = "M", descriptor = "Lgi;")
    public static class164 field3290;

    @OriginalMember(owner = "client!ve", name = "O", descriptor = "Lgi;")
    public static class164 field3292;

    @OriginalMember(owner = "client!ve", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        int var3 = 37 % ((arg0 - -34) / 49);
        int[] var4 = super.field1661.method894(127, arg1);
        if (super.field1661.field2115) {
            int var5 = class259.field4254[arg1];
            int var6 = var5 + -2048 >> 1;
            for (int var7 = 0; ~class24.field443 < ~var7; ++var7) {
                int var8 = class221.field3486[var7];
                int var9 = var8 - 2048 >> 1;
                int var12;
                if (~this.field3289 != -1) {
                    int var10 = var6 * var6 + var9 * var9 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var12 = (int) ((double) (this.field3285 * var11) * 3.141592653589793D);
                } else {
                    var12 = (-var5 + var8) * this.field3285;
                }
                int var13 = var12 - (-4096 & var12);
                if (this.field3286 == 0) {
                    var13 = class76.field1233[255 & var13 >> 4] - -4096 >> 1;
                } else if (~this.field3286 == -3) {
                    var13 -= 2048;
                    if (~var13 > -1) {
                        var13 = -var13;
                    }
                    var13 = 2048 - var13 << 1;
                }
                var4[var7] = var13;
            }
        }
        ++field3291;
        return var4;
    }

    @OriginalMember(owner = "client!ve", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field3284;
        if (arg2 != 28) {
            field3290 = null;
        }
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 == -4) {
                    this.field3285 = arg1.method1849(255);
                }
            } else {
                this.field3286 = arg1.method1849(255);
            }
        } else {
            this.field3289 = arg1.method1849(arg2 ^ 227);
        }
    }

    @OriginalMember(owner = "client!ve", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        if (arg0 != 35) {
            field3288 = true;
        }
        class28.method220((byte) 29);
        ++field3281;
    }

    @OriginalMember(owner = "client!ve", name = "<init>", descriptor = "()V")
    public class203() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ve", name = "e", descriptor = "(I)V")
    public static void method1417(int arg0) {
        field3282 = null;
        field3290 = null;
        field3283 = null;
        if (arg0 == -1581401940) {
            field3292 = null;
        }
    }
}
