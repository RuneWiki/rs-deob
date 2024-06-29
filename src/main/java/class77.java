import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class77 implements class648 {

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "[I")
    public static int[] field1208 = new int[32];

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "[[I")
    public static int[][] field1210 = new int[128][128];

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "[I")
    public static int[] field1215 = new int[1];

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public int field1203;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public int field1205;

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "I")
    public int field1207;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public int field1212;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public int field1213;

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "I")
    public static int field1214;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "J")
    public static long field1206;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "Z")
    public boolean field1209;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(BLhg;)Z")
    public final boolean method602(byte arg0, class648 arg1) {
        field1214++;
        if (!(arg1 instanceof class77)) {
            return false;
        }
        class77 var3 = (class77) arg1;
        if (this.field1211 != var3.field1211) {
            return false;
        } else if (this.field1207 != var3.field1207) {
            return false;
        } else if (this.field1203 == var3.field1203) {
            if (arg0 <= 67) {
                field1206 = 28L;
            }
            if (this.field1212 != var3.field1212) {
                return false;
            } else if (this.field1213 != var3.field1213) {
                return false;
            } else if (this.field1205 == var3.field1205) {
                return var3.field1209 == this.field1209;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(I)J")
    public final long method603(int arg0) {
        field1204++;
        long[] var2 = class246.field3431;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field1211 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field1207 >> 8) ^ var5) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field1207) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field1203 >> 24) ^ var9) & 0xFFL)];
        long var13 = var2[(int) (((long) (this.field1203 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        if (arg0 != -10939) {
            return 98L;
        }
        long var15 = var2[(int) ((var13 ^ (long) (this.field1203 >> 8)) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) ((var15 ^ (long) this.field1203) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) ((var17 ^ (long) this.field1212) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field1213 >> 24)) & 0xFFL)];
        long var23 = var2[(int) ((var21 ^ (long) (this.field1213 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field1213 >> 8)) & 0xFFL)];
        long var27 = var2[(int) ((var25 ^ (long) this.field1213) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) ((var27 ^ (long) this.field1205) & 0xFFL)] ^ var27 >>> 8;
        return var2[(int) ((var29 ^ (long) (this.field1209 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V")
    public static void method604(byte arg0) {
        if (arg0 != 68) {
            field1208 = null;
        }
        field1208 = null;
        field1210 = null;
        field1215 = null;
    }
}
