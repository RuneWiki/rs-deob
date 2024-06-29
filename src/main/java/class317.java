import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class317 implements class316 {

    @OriginalMember(owner = "client!un", name = "l", descriptor = "Llo;")
    public static class419 field4602 = new class419();

    @OriginalMember(owner = "client!un", name = "a", descriptor = "I")
    public static int field4591;

    @OriginalMember(owner = "client!un", name = "b", descriptor = "I")
    public int field4592;

    @OriginalMember(owner = "client!un", name = "c", descriptor = "I")
    public int field4593;

    @OriginalMember(owner = "client!un", name = "e", descriptor = "I")
    public static int field4595;

    @OriginalMember(owner = "client!un", name = "g", descriptor = "I")
    public static int field4597;

    @OriginalMember(owner = "client!un", name = "h", descriptor = "I")
    public int field4598;

    @OriginalMember(owner = "client!un", name = "i", descriptor = "I")
    public int field4599;

    @OriginalMember(owner = "client!un", name = "k", descriptor = "I")
    public int field4601;

    @OriginalMember(owner = "client!un", name = "m", descriptor = "I")
    public int field4603;

    @OriginalMember(owner = "client!un", name = "j", descriptor = "Z")
    public boolean field4600;

    @OriginalMember(owner = "client!un", name = "f", descriptor = "[I")
    public static int[] field4596;

    @OriginalMember(owner = "client!un", name = "d", descriptor = "[[[Lsk;")
    public static class168[][][] field4594;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(Lmc;B)Z", line = 8)
    public final boolean method2129(class316 arg0, byte arg1) {
        field4595++;
        if (!(arg0 instanceof class317)) {
            return false;
        }
        class317 var3 = (class317) arg0;
        if (this.field4601 != var3.field4601) {
            return false;
        } else if (this.field4593 != var3.field4593) {
            return false;
        } else if (this.field4599 != var3.field4599) {
            return false;
        } else if (this.field4592 == var3.field4592) {
            if (arg1 != -7) {
                field4594 = null;
            }
            if (this.field4598 != var3.field4598) {
                return false;
            } else if (this.field4603 == var3.field4603) {
                return this.field4600 == var3.field4600;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!un", name = "b", descriptor = "(I)V", line = 48)
    public static void method2131(int arg0) {
        field4594 = null;
        field4602 = null;
        field4596 = null;
        if (arg0 != -26251) {
            field4594 = null;
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I)J", line = 66)
    public final long method2130(int arg0) {
        field4591++;
        long[] var2 = class106.field1755;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field4601 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) ((var5 ^ (long) (this.field4593 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field4593 ^ var7) & 0xFFL)];
        long var11 = var2[(int) (((long) (this.field4599 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        if (arg0 != -19580) {
            this.field4593 = 77;
        }
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field4599 >> 16)) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field4599 >> 8)) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field4599 ^ var15) & 0xFFL)];
        long var19 = var2[(int) (((long) this.field4592 ^ var17) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) (((long) (this.field4598 >> 24) ^ var19) & 0xFFL)];
        long var23 = var21 >>> 8 ^ var2[(int) ((var21 ^ (long) (this.field4598 >> 16)) & 0xFFL)];
        long var25 = var2[(int) (((long) (this.field4598 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var25 >>> 8 ^ var2[(int) ((var25 ^ (long) this.field4598) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field4603 ^ var27) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field4600 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)I", line = 106)
    public static final int method2132(int arg0, int arg1) {
        int var2 = ((arg0 & 0xAAAAAAAB) >>> 1) + (arg0 & 0x55555555);
        field4597++;
        int var3 = (var2 & 0x33333333) + (var2 >>> 2 & 0x33333333);
        if (arg1 == 255) {
            int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
            int var5 = (var4 >>> 8) + var4;
            int var6 = (var5 >>> 16) + var5;
            return var6 & 0xFF;
        } else {
            return -126;
        }
    }
}
