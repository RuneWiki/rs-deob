import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ln")
public class class94 implements class110 {

    @OriginalMember(owner = "client!ln", name = "h", descriptor = "Lsq;")
    public static class442 field1654 = new class442();

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "I")
    public int field1647;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "client!ln", name = "c", descriptor = "I")
    public static int field1649;

    @OriginalMember(owner = "client!ln", name = "d", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!ln", name = "e", descriptor = "I")
    public int field1651;

    @OriginalMember(owner = "client!ln", name = "f", descriptor = "I")
    public static int field1652;

    @OriginalMember(owner = "client!ln", name = "g", descriptor = "I")
    public int field1653;

    @OriginalMember(owner = "client!ln", name = "j", descriptor = "I")
    public int field1656;

    @OriginalMember(owner = "client!ln", name = "k", descriptor = "I")
    public int field1657;

    @OriginalMember(owner = "client!ln", name = "l", descriptor = "I")
    public static int field1658;

    @OriginalMember(owner = "client!ln", name = "i", descriptor = "Z")
    public boolean field1655;

    @OriginalMember(owner = "client!ln", name = "b", descriptor = "(I)V", line = 7)
    public static final void method824(int arg0) {
        if (class109.field1823 != arg0) {
            class577.method3297(-1, -1, false, class109.field1823, false);
            class109.field1823 = -1;
        }
        field1650++;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(I)J", line = 24)
    public final long method825(int arg0) {
        field1649++;
        if (arg0 != 6584) {
            this.field1657 = 75;
        }
        long[] var2 = class442.field6466;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field1648 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) ((var5 ^ (long) (this.field1657 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field1657) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) ((var9 ^ (long) (this.field1656 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) ((var11 ^ (long) (this.field1656 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field1656 >> 8) ^ var13) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field1656 ^ var15) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field1647) & 0xFFL)];
        long var21 = var2[(int) (((long) (this.field1653 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) ((var21 ^ (long) (this.field1653 >> 16)) & 0xFFL)];
        long var25 = var2[(int) ((var23 ^ (long) (this.field1653 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field1653 ^ var25) & 0xFFL)];
        long var29 = var2[(int) ((var27 ^ (long) this.field1651) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) (((long) (this.field1655 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "([FIIIIIFFIII)V", line = 55)
    public static final void method826(float[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float arg6, float arg7, int arg8, int arg9, int arg10) {
        int var11 = arg8 - arg9;
        int var12 = arg2 - arg3;
        field1658++;
        int var13 = arg1 - arg10;
        float var14 = arg0[2] * (float) var12 + arg0[1] * (float) var11 + arg0[0] * (float) var13;
        float var15 = arg0[5] * (float) var12 + arg0[4] * (float) var11 + arg0[3] * (float) var13;
        float var16 = arg0[8] * (float) var12 + arg0[7] * (float) var11 + arg0[6] * (float) var13;
        float var17 = (float) Math.atan2((double) var14, (double) var16) / 6.2831855F + 0.5F;
        if (arg6 != 1.0F) {
            var17 = arg6 * var17;
        }
        if (arg4 != 1092) {
            field1654 = null;
        }
        float var18 = var15 + arg7 + 0.5F;
        if (arg5 == 1) {
            float var20 = var17;
            var17 = -var18;
            var18 = var20;
        } else if (arg5 == 2) {
            var17 = -var17;
            var18 = -var18;
        } else if (arg5 == 3) {
            float var19 = var17;
            var17 = var18;
            var18 = -var19;
        }
        class642.field9337 = var17;
        class443.field6472 = var18;
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(Lvp;Z)Z", line = 110)
    public final boolean method827(class110 arg0, boolean arg1) {
        field1652++;
        if (!arg1) {
            this.method827(null, false);
        }
        if (!(arg0 instanceof class94)) {
            return false;
        }
        class94 var3 = (class94) arg0;
        if (this.field1648 != var3.field1648) {
            return false;
        } else if (this.field1657 != var3.field1657) {
            return false;
        } else if (this.field1656 != var3.field1656) {
            return false;
        } else if (this.field1647 != var3.field1647) {
            return false;
        } else if (this.field1653 != var3.field1653) {
            return false;
        } else if (this.field1651 == var3.field1651) {
            return var3.field1655 == this.field1655;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ln", name = "a", descriptor = "(B)V", line = 155)
    public static void method828(byte arg0) {
        field1654 = null;
        if (arg0 >= -35) {
            method826(null, -112, -77, -45, -116, -38, 0.23261602F, -0.57728773F, 111, -85, 36);
        }
    }
}
