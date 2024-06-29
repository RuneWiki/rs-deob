import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class370 implements class416 {

    @OriginalMember(owner = "client!tp", name = "j", descriptor = "[I")
    public static int[] field5660 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!tp", name = "l", descriptor = "Lwt;")
    public static class202 field5662 = new class202("", 15);

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public int field5651;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public int field5653;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public int field5654;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "I")
    public int field5656;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "I")
    public int field5657;

    @OriginalMember(owner = "client!tp", name = "i", descriptor = "I")
    public static int field5659;

    @OriginalMember(owner = "client!tp", name = "k", descriptor = "I")
    public int field5661;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "Z")
    public boolean field5658;

    static {
        new class475(" was kicked from the channel.", " wurde aus dem Chatraum rausgeworfen.", " a été expulsé du canal.", " foi expulso do canal.");
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(B)V", line = 7)
    public static void method2285(byte arg0) {
        if (arg0 <= 111) {
            method2285((byte) -46);
        }
        field5662 = null;
        field5660 = null;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)J", line = 20)
    public final long method2286(boolean arg0) {
        field5655++;
        long[] var2 = class279.field4025;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) ((var3 ^ (long) this.field5651) & 0xFFL)];
        long var7 = var2[(int) (((long) (this.field5661 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        if (arg0) {
            this.field5653 = -19;
        }
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field5661) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field5656 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) (((long) (this.field5656 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field5656 >> 8)) & 0xFFL)];
        long var17 = var2[(int) (((long) this.field5656 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field5654) & 0xFFL)];
        long var21 = var2[(int) ((var19 ^ (long) (this.field5657 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) ((var21 ^ (long) (this.field5657 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field5657 >> 8)) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field5657) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field5653) & 0xFFL)];
        return var2[(int) ((var29 ^ (long) (this.field5658 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Lvs;I)Z", line = 51)
    public final boolean method2287(class416 arg0, int arg1) {
        field5652++;
        if (!(arg0 instanceof class370)) {
            return false;
        }
        class370 var3 = (class370) arg0;
        if (this.field5651 != var3.field5651) {
            return false;
        }
        if (arg1 != 19162) {
            this.field5653 = -47;
        }
        if (this.field5661 != var3.field5661) {
            return false;
        } else if (this.field5656 != var3.field5656) {
            return false;
        } else if (this.field5654 != var3.field5654) {
            return false;
        } else if (this.field5657 != var3.field5657) {
            return false;
        } else if (this.field5653 == var3.field5653) {
            return this.field5658 == var3.field5658;
        } else {
            return false;
        }
    }
}
