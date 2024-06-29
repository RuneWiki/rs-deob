import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class58 extends class5 {

    @OriginalMember(owner = "client!wg", name = "J", descriptor = "I")
    private int field815 = 0;

    @OriginalMember(owner = "client!wg", name = "N", descriptor = "I")
    private int field819 = 0;

    @OriginalMember(owner = "client!wg", name = "M", descriptor = "I")
    private int field818 = 20;

    @OriginalMember(owner = "client!wg", name = "P", descriptor = "I")
    private int field821 = 1365;

    @OriginalMember(owner = "client!wg", name = "L", descriptor = "Lwp;")
    public static class453 field817 = new class453(61, -2);

    @OriginalMember(owner = "client!wg", name = "H", descriptor = "I")
    public static int field813;

    @OriginalMember(owner = "client!wg", name = "I", descriptor = "I")
    public static int field814;

    @OriginalMember(owner = "client!wg", name = "O", descriptor = "I")
    public static int field820;

    @OriginalMember(owner = "client!wg", name = "Q", descriptor = "I")
    public static int field822;

    @OriginalMember(owner = "client!wg", name = "K", descriptor = "J")
    public static long field816;

    @OriginalMember(owner = "client!wg", name = "<init>", descriptor = "()V")
    public class58() {
        super(0, true);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIZ)Z")
    public static final boolean method365(int arg0, int arg1, boolean arg2) {
        ++field813;
        if (arg2) {
            field817 = null;
        }
        return (arg1 & 33) != 0;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BLkp;II)V")
    public static final void method366(byte arg0, class507 arg1, int arg2, int arg3) {
        class454.field5822 = arg2;
        ++field814;
        class575.field8021 = arg3;
        class214.field2655 = arg1;
        if (arg0 <= 50) {
            method366((byte) 9, (class507) null, -63, -54);
        }
    }

    @OriginalMember(owner = "client!wg", name = "i", descriptor = "(I)V")
    public static void method367(int arg0) {
        int var1 = -94 % ((-62 - arg0) / 34);
        field817 = null;
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(ILes;I)V")
    public final void method47(int arg0, class630 arg1, int arg2) {
        ++field820;
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 == 3) {
                        this.field815 = arg1.method3470(13111);
                    }
                } else {
                    this.field819 = arg1.method3470(13111);
                }
            } else {
                this.field818 = arg1.method3470(13111);
            }
        } else {
            this.field821 = arg1.method3470(13111);
        }
        if (arg0 != 1) {
            method367(-105);
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        ++field822;
        int var3 = -89 % ((arg0 - 81) / 36);
        int[] var4 = super.field126.method3280(arg1, true);
        if (super.field126.field8392) {
            for (int var5 = 0; var5 < class657.field9287; ++var5) {
                int var6 = (class269.field3405[var5] << 12) / this.field821 + this.field819;
                int var7 = (class272.field3439[arg1] << 12) / this.field821 + this.field815;
                int var8 = var6;
                int var9 = var7;
                int var10 = var6;
                int var11 = var7;
                int var12 = var6 * var6 >> 12;
                int var13 = var7 * var7 >> 12;
                int var14;
                for (var14 = 0; var12 - -var13 < 16384 && ~this.field818 < ~var14; ++var14) {
                    var11 = (var10 * var11 >> 12) * 2 + var9;
                    var10 = -var13 + var8 + var12;
                    var13 = var11 * var11 >> 12;
                    var12 = var10 * var10 >> 12;
                }
                var4[var5] = this.field818 + -1 > var14 ? (var14 << 12) / this.field818 : 0;
            }
        }
        return var4;
    }
}
