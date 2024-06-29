import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class13 implements class480 {

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "Lqu;")
    public static class219 field142 = new class219(9, 0);

    @OriginalMember(owner = "client!ge", name = "k", descriptor = "Lbi;")
    public static class104 field145 = new class104(60, -2);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public int field135;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public int field136;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public int field137;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "I")
    public int field138;

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "I")
    public static int field139;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public static int field140;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "I")
    public int field143;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public static int field144;

    @OriginalMember(owner = "client!ge", name = "l", descriptor = "I")
    public int field146;

    @OriginalMember(owner = "client!ge", name = "m", descriptor = "I")
    public static int field147;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "Z")
    public boolean field141;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static void method75(int arg0) {
        field145 = null;
        if (arg0 == 255) {
            field142 = null;
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(B)J")
    public final long method76(byte arg0) {
        field139++;
        long[] var2 = class150.field2013;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field136 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        if (arg0 != -68) {
            this.method76((byte) 80);
        }
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field138 >> 8) ^ var5) & 0xFFL)];
        long var9 = var2[(int) (((long) this.field138 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field135 >> 24) ^ var9) & 0xFFL)];
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field135 >> 16)) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field135 >> 8)) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field135 ^ var15) & 0xFFL)];
        long var19 = var2[(int) ((var17 ^ (long) this.field137) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) ((var19 ^ (long) (this.field146 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) ((var21 ^ (long) (this.field146 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) (((long) (this.field146 >> 8) ^ var23) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field146) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field143 ^ var27) & 0xFFL)];
        return var2[(int) (((long) (this.field141 ? 1 : 0) ^ var29) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IIII)V")
    public static final void method77(int arg0, int arg1, int arg2, int arg3) {
        field140++;
        if (arg1 != 1827898632) {
            field145 = null;
        }
        class341 var4 = class183.field2649[arg3][arg0];
        class294.method1974(var4 == null ? class148.field1996 : var4, (byte) 101, arg2);
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(Ldd;I)Z")
    public final boolean method78(class480 arg0, int arg1) {
        field144++;
        if (!(arg0 instanceof class13)) {
            return false;
        }
        class13 var3 = (class13) arg0;
        if (this.field136 != var3.field136) {
            return false;
        } else if (this.field138 != var3.field138) {
            return false;
        } else if (this.field135 != var3.field135) {
            return false;
        } else if (this.field137 == var3.field137) {
            if (arg1 != -28282) {
                field145 = null;
            }
            if (this.field146 != var3.field146) {
                return false;
            } else if (this.field143 == var3.field143) {
                return this.field141 == var3.field141;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }
}
