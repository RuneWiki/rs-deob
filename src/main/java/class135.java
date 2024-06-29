import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ct")
public class class135 implements class652 {

    @OriginalMember(owner = "client!ct", name = "d", descriptor = "Z")
    public static boolean field1641 = false;

    @OriginalMember(owner = "client!ct", name = "b", descriptor = "Z")
    public static boolean field1639 = false;

    @OriginalMember(owner = "client!ct", name = "c", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!ct", name = "e", descriptor = "I")
    public int field1642;

    @OriginalMember(owner = "client!ct", name = "f", descriptor = "I")
    public int field1643;

    @OriginalMember(owner = "client!ct", name = "g", descriptor = "I")
    public int field1644;

    @OriginalMember(owner = "client!ct", name = "h", descriptor = "I")
    public int field1645;

    @OriginalMember(owner = "client!ct", name = "i", descriptor = "I")
    public int field1646;

    @OriginalMember(owner = "client!ct", name = "j", descriptor = "I")
    public static int field1647;

    @OriginalMember(owner = "client!ct", name = "k", descriptor = "I")
    public int field1648;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "Z")
    public boolean field1638;

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(B)J")
    public final long method869(byte arg0) {
        field1647++;
        long[] var2 = class225.field2913;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field1646 ^ var3) & 0xFFL)];
        long var7 = var2[(int) ((var5 ^ (long) (this.field1644 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field1644) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field1648 >> 24) ^ var9) & 0xFFL)];
        if (arg0 <= 95) {
            this.field1646 = -112;
        }
        long var13 = var2[(int) ((var11 ^ (long) (this.field1648 >> 16)) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field1648 >> 8) ^ var13) & 0xFFL)];
        long var17 = var2[(int) ((var15 ^ (long) this.field1648) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field1645) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field1642 >> 24)) & 0xFFL)];
        long var23 = var2[(int) ((var21 ^ (long) (this.field1642 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) (((long) (this.field1642 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) ((var25 ^ (long) this.field1642) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field1643) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field1638 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ct", name = "a", descriptor = "(ZLsea;)Z")
    public final boolean method870(boolean arg0, class652 arg1) {
        field1640++;
        if (!(arg1 instanceof class135)) {
            return false;
        }
        class135 var3 = (class135) arg1;
        if (this.field1646 != var3.field1646) {
            return false;
        } else if (arg0) {
            return false;
        } else if (this.field1644 != var3.field1644) {
            return false;
        } else if (this.field1648 != var3.field1648) {
            return false;
        } else if (this.field1645 != var3.field1645) {
            return false;
        } else if (this.field1642 != var3.field1642) {
            return false;
        } else if (this.field1643 == var3.field1643) {
            return var3.field1638 == this.field1638;
        } else {
            return false;
        }
    }
}
