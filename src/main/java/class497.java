import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ev")
public class class497 implements class477 {

    @OriginalMember(owner = "client!ev", name = "e", descriptor = "I")
    public static int field7326 = 0;

    @OriginalMember(owner = "client!ev", name = "l", descriptor = "I")
    public static int field7333 = -1;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "I")
    public int field7322;

    @OriginalMember(owner = "client!ev", name = "b", descriptor = "I")
    public int field7323;

    @OriginalMember(owner = "client!ev", name = "d", descriptor = "I")
    public int field7325;

    @OriginalMember(owner = "client!ev", name = "f", descriptor = "I")
    public static int field7327;

    @OriginalMember(owner = "client!ev", name = "g", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!ev", name = "h", descriptor = "I")
    public int field7329;

    @OriginalMember(owner = "client!ev", name = "i", descriptor = "I")
    public int field7330;

    @OriginalMember(owner = "client!ev", name = "j", descriptor = "I")
    public int field7331;

    @OriginalMember(owner = "client!ev", name = "k", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!ev", name = "c", descriptor = "Z")
    public boolean field7324;

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(B)J")
    public final long method2841(byte arg0) {
        if (arg0 > -21) {
            this.method2841((byte) 57);
        }
        field7332++;
        long[] var2 = class291.field4254;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field7323) & 0xFFL)];
        long var7 = var5 >>> 8 ^ var2[(int) ((var5 ^ (long) (this.field7331 >> 8)) & 0xFFL)];
        long var9 = var2[(int) ((var7 ^ (long) this.field7331) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) (((long) (this.field7322 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) (((long) (this.field7322 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field7322 >> 8)) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field7322) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field7329 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field7325 >> 24)) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field7325 >> 16) ^ var21) & 0xFFL)];
        long var25 = var2[(int) (((long) (this.field7325 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field7325 ^ var25) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field7330 ^ var27) & 0xFFL)];
        return var2[(int) ((var29 ^ (long) (this.field7324 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!ev", name = "a", descriptor = "(Lsv;I)Z")
    public final boolean method2842(class477 arg0, int arg1) {
        field7327++;
        if (arg1 != 19524) {
            this.field7330 = -122;
        }
        if (!(arg0 instanceof class497)) {
            return false;
        }
        class497 var3 = (class497) arg0;
        if (this.field7323 != var3.field7323) {
            return false;
        } else if (this.field7331 != var3.field7331) {
            return false;
        } else if (this.field7322 != var3.field7322) {
            return false;
        } else if (this.field7329 != var3.field7329) {
            return false;
        } else if (this.field7325 != var3.field7325) {
            return false;
        } else if (this.field7330 == var3.field7330) {
            return this.field7324 == var3.field7324;
        } else {
            return false;
        }
    }
}
