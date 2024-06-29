import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gs")
public class class34 implements class90 {

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "I")
    public int field475;

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "I")
    public int field476;

    @OriginalMember(owner = "client!gs", name = "c", descriptor = "I")
    public int field477;

    @OriginalMember(owner = "client!gs", name = "d", descriptor = "I")
    public static int field478;

    @OriginalMember(owner = "client!gs", name = "e", descriptor = "I")
    public static int field479;

    @OriginalMember(owner = "client!gs", name = "g", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client!gs", name = "h", descriptor = "I")
    public static int field482;

    @OriginalMember(owner = "client!gs", name = "i", descriptor = "I")
    public int field483;

    @OriginalMember(owner = "client!gs", name = "j", descriptor = "I")
    public static int field484;

    @OriginalMember(owner = "client!gs", name = "k", descriptor = "I")
    public static int field485;

    @OriginalMember(owner = "client!gs", name = "l", descriptor = "I")
    public int field486;

    @OriginalMember(owner = "client!gs", name = "n", descriptor = "Lss;")
    public static class295 field488;

    @OriginalMember(owner = "client!gs", name = "m", descriptor = "Loa;")
    public static class490 field487;

    @OriginalMember(owner = "client!gs", name = "f", descriptor = "Z")
    public boolean field480;

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(B)J", line = 12)
    public final long method217(byte arg0) {
        field478++;
        long[] var2 = class444.field6450;
        if (arg0 != 112) {
            field485 = 49;
        }
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field476 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) ((var5 ^ (long) (this.field483 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field483 ^ var7) & 0xFFL)];
        long var11 = var2[(int) ((var9 ^ (long) (this.field475 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field475 >> 16)) & 0xFFL)];
        long var15 = var2[(int) (((long) (this.field475 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field475 ^ var15) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field477) & 0xFFL)];
        long var21 = var2[(int) ((var19 ^ (long) (this.field486 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) ((var21 ^ (long) (this.field486 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) ((var23 ^ (long) (this.field486 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field486 ^ var25) & 0xFFL)];
        long var29 = var2[(int) (((long) this.field481 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) (((long) (this.field480 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!gs", name = "b", descriptor = "(B)V", line = 44)
    public static void method218(byte arg0) {
        field488 = null;
        if (arg0 > -117) {
            method218((byte) -69);
        }
        field487 = null;
    }

    @OriginalMember(owner = "client!gs", name = "a", descriptor = "(Lcg;B)Z", line = 62)
    public final boolean method219(class90 arg0, byte arg1) {
        field479++;
        if (!(arg0 instanceof class34)) {
            return false;
        }
        class34 var3 = (class34) arg0;
        if (this.field476 != var3.field476) {
            return false;
        } else if (this.field483 != var3.field483) {
            return false;
        } else if (this.field475 != var3.field475) {
            return false;
        } else if (this.field477 != var3.field477) {
            return false;
        } else if (this.field486 != var3.field486) {
            return false;
        } else if (this.field481 == var3.field481) {
            if (arg1 != 121) {
                this.field477 = 125;
            }
            return this.field480 == var3.field480;
        } else {
            return false;
        }
    }
}
