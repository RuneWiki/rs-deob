import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class472 extends class466 {

    @OriginalMember(owner = "client!nl", name = "E", descriptor = "I")
    private int field6624 = 0;

    @OriginalMember(owner = "client!nl", name = "L", descriptor = "I")
    private int field6631 = 0;

    @OriginalMember(owner = "client!nl", name = "J", descriptor = "I")
    private int field6629 = 1;

    @OriginalMember(owner = "client!nl", name = "K", descriptor = "[I")
    public static int[] field6630 = new int[5];

    @OriginalMember(owner = "client!nl", name = "N", descriptor = "Ldm;")
    public static class46 field6633 = new class46();

    @OriginalMember(owner = "client!nl", name = "P", descriptor = "Lnba;")
    public static class248 field6635 = null;

    @OriginalMember(owner = "client!nl", name = "Q", descriptor = "I")
    public static int field6636 = -1;

    @OriginalMember(owner = "client!nl", name = "I", descriptor = "F")
    public static float field6628;

    @OriginalMember(owner = "client!nl", name = "F", descriptor = "I")
    public static int field6625;

    @OriginalMember(owner = "client!nl", name = "H", descriptor = "I")
    public static int field6627;

    @OriginalMember(owner = "client!nl", name = "M", descriptor = "I")
    public static int field6632;

    @OriginalMember(owner = "client!nl", name = "O", descriptor = "I")
    public static int field6634;

    @OriginalMember(owner = "client!nl", name = "G", descriptor = "Z")
    public static boolean field6626;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "(I)V")
    public static void method2744(int arg0) {
        field6635 = null;
        field6633 = null;
        if (arg0 == 2048) {
            field6630 = null;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(II)[I")
    public final int[] method2(int arg0, int arg1) {
        ++field6632;
        int[] var3 = super.field6557.method565(arg0, -24728);
        if (arg1 != 0) {
            this.method7(-34);
        }
        if (super.field6557.field1163) {
            int var4 = class63.field1085[arg0];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; ~class312.field4207 < ~var6; ++var6) {
                int var7 = class431.field6129[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field6624 != -1) {
                    int var9 = var5 * var5 + var8 * var8 >> 12;
                    int var10 = (int) (4096.0D * Math.sqrt((double) ((float) var9 / 4096.0F)));
                    var11 = (int) ((double) (this.field6629 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field6629;
                }
                int var12 = var11 - (var11 & -4096);
                if (~this.field6631 == -1) {
                    var12 = class566.field7828[(4080 & var12) >> 4] - -4096 >> 1;
                } else if (this.field6631 == 2) {
                    var12 -= 2048;
                    if (~var12 > -1) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "(I)V")
    public final void method7(int arg0) {
        ++field6634;
        if (arg0 == -806066388) {
            class225.method1442(256);
        }
    }

    @OriginalMember(owner = "client!nl", name = "<init>", descriptor = "()V")
    public class472() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(IZ)I")
    public static final int method2745(int arg0, boolean arg1) {
        ++field6627;
        if (!arg1) {
            field6628 = 1.492644F;
        }
        return 255 & arg0;
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(Ldaa;II)V")
    public final void method6(class11 arg0, int arg1, int arg2) {
        ++field6625;
        if (arg1 != -5062) {
            this.method6((class11) null, 3, 102);
        }
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field6629 = arg0.method110((byte) 91);
                }
            } else {
                this.field6631 = arg0.method110((byte) 69);
            }
        } else {
            this.field6624 = arg0.method110((byte) 77);
        }
    }
}
