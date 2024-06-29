import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class84 extends class747 {

    @OriginalMember(owner = "client!ji", name = "J", descriptor = "I")
    private int field1193 = 1;

    @OriginalMember(owner = "client!ji", name = "F", descriptor = "I")
    private int field1189 = 0;

    @OriginalMember(owner = "client!ji", name = "H", descriptor = "I")
    private int field1191 = 0;

    @OriginalMember(owner = "client!ji", name = "E", descriptor = "I")
    public static int field1188 = 0;

    @OriginalMember(owner = "client!ji", name = "G", descriptor = "I")
    public static int field1190 = 0;

    @OriginalMember(owner = "client!ji", name = "L", descriptor = "I")
    public static int field1195 = 503;

    @OriginalMember(owner = "client!ji", name = "K", descriptor = "Lgw;")
    public static class690 field1194 = new class690(4);

    @OriginalMember(owner = "client!ji", name = "N", descriptor = "[I")
    public static int[] field1197 = new int[3];

    @OriginalMember(owner = "client!ji", name = "P", descriptor = "Lmaa;")
    public static class508 field1198 = new class508(6, 16);

    @OriginalMember(owner = "client!ji", name = "T", descriptor = "[I")
    public static int[] field1202 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!ji", name = "S", descriptor = "Lkr;")
    public static class602 field1201 = new class602(33, 2);

    @OriginalMember(owner = "client!ji", name = "I", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!ji", name = "M", descriptor = "I")
    public static int field1196;

    @OriginalMember(owner = "client!ji", name = "Q", descriptor = "I")
    public static int field1199;

    @OriginalMember(owner = "client!ji", name = "R", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "(I)V", line = 3)
    public final void method184(int arg0) {
        ++field1196;
        class654.method3655(101);
        if (arg0 != -2) {
            method595(122);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ldc;II)V", line = 15)
    public final void method183(class63 arg0, int arg1, int arg2) {
        ++field1192;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 == -4) {
                    this.field1193 = arg0.method505((byte) -119);
                }
            } else {
                this.field1189 = arg0.method505((byte) -119);
            }
        } else {
            this.field1191 = arg0.method505((byte) -119);
        }
        if (arg1 != 11608) {
            this.method182(-123, 94);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(II)[I", line = 61)
    public final int[] method182(int arg0, int arg1) {
        ++field1200;
        int[] var3 = super.field10279.method3479(true, arg0);
        if (arg1 > -89) {
            this.method182(-98, -123);
        }
        if (super.field10279.field8263) {
            int var4 = class515.field7103[arg0];
            int var5 = var4 + -2048 >> 1;
            for (int var6 = 0; ~class73.field1095 < ~var6; ++var6) {
                int var7 = class639.field8571[var6];
                int var8 = var7 + -2048 >> 1;
                int var11;
                if (~this.field1191 != -1) {
                    int var9 = var8 * var8 - -(var5 * var5) >> 12;
                    int var10 = (int) (Math.sqrt((double) ((float) var9 / 4096.0F)) * 4096.0D);
                    var11 = (int) ((double) (this.field1193 * var10) * 3.141592653589793D);
                } else {
                    var11 = (-var4 + var7) * this.field1193;
                }
                int var12 = var11 - (var11 & -4096);
                if (this.field1189 == 0) {
                    var12 = class472.field6541[var12 >> 4 & 255] + 4096 >> 1;
                } else if (this.field1189 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = -var12 + 2048 << 1;
                }
                var3[var6] = var12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ji", name = "<init>", descriptor = "()V", line = 134)
    public class84() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "(I)V", line = 139)
    public static void method595(int arg0) {
        field1197 = null;
        if (arg0 == 2012) {
            field1202 = null;
            field1198 = null;
            field1194 = null;
            field1201 = null;
        }
    }
}
