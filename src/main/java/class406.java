import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class406 implements class50 {

    @OriginalMember(owner = "client!ap", name = "j", descriptor = "Lvc;")
    public static class264 field5773 = new class264();

    @OriginalMember(owner = "client!ap", name = "l", descriptor = "I")
    public static int field5775 = 0;

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "I")
    public int field5766;

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "I")
    public int field5767;

    @OriginalMember(owner = "client!ap", name = "e", descriptor = "I")
    public int field5768;

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "I")
    public static int field5769;

    @OriginalMember(owner = "client!ap", name = "g", descriptor = "I")
    public int field5770;

    @OriginalMember(owner = "client!ap", name = "h", descriptor = "I")
    public int field5771;

    @OriginalMember(owner = "client!ap", name = "i", descriptor = "I")
    public int field5772;

    @OriginalMember(owner = "client!ap", name = "k", descriptor = "Lan;")
    public static class21 field5774;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "Z")
    public boolean field5765;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(I)V")
    public static void method2417(int arg0) {
        field5774 = null;
        if (arg0 != 255) {
            field5773 = null;
        }
        field5773 = null;
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(I)J")
    public final long method481(int arg0) {
        field5769++;
        long[] var2 = class439.field6245;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field5767 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field5768 >> 8) ^ var5) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field5768 ^ var7) & 0xFFL)];
        long var11 = var2[(int) (((long) (this.field5770 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        if (arg0 != 4095) {
            return -85L;
        }
        long var13 = var2[(int) (((long) (this.field5770 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field5770 >> 8) ^ var13) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field5770 ^ var15) & 0xFFL)];
        long var19 = var2[(int) ((var17 ^ (long) this.field5772) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field5771 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) (((long) (this.field5771 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) (((long) (this.field5771 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field5771 ^ var25) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field5766 ^ var27) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) (((long) (this.field5765 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(BLfw;)Z")
    public final boolean method482(byte arg0, class50 arg1) {
        field5764++;
        if (!(arg1 instanceof class406)) {
            return false;
        }
        class406 var3 = (class406) arg1;
        if (this.field5767 != var3.field5767) {
            return false;
        } else if (this.field5768 != var3.field5768) {
            return false;
        } else if (this.field5770 != var3.field5770) {
            return false;
        } else if (this.field5772 != var3.field5772) {
            return false;
        } else if (this.field5771 != var3.field5771) {
            return false;
        } else if (this.field5766 == var3.field5766) {
            if (arg0 != -34) {
                method2417(100);
            }
            return this.field5765 == var3.field5765;
        } else {
            return false;
        }
    }
}
