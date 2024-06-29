import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class22 implements class688 {

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lcga;")
    public static class141 field208 = new class141();

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Lufa;")
    public static class740 field209 = new class740(12, 3);

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "F")
    public static float field210;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public int field199;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public static int field200;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public int field202;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public int field203;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field204;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public int field205;

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public int field206;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public int field207;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "Z")
    public boolean field201;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V")
    public static void method99(byte arg0) {
        field209 = null;
        int var1 = 13 % ((arg0 + 52) / 45);
        field208 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(Lut;I)Z")
    public final boolean method100(class688 arg0, int arg1) {
        field204++;
        if (!(arg0 instanceof class22)) {
            return false;
        }
        if (arg1 != -3775) {
            this.field203 = 83;
        }
        class22 var3 = (class22) arg0;
        if (this.field205 != var3.field205) {
            return false;
        } else if (this.field206 != var3.field206) {
            return false;
        } else if (this.field202 != var3.field202) {
            return false;
        } else if (this.field199 != var3.field199) {
            return false;
        } else if (this.field207 != var3.field207) {
            return false;
        } else if (this.field203 == var3.field203) {
            return var3.field201 == this.field201;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)J")
    public final long method101(byte arg0) {
        if (arg0 != -103) {
            this.method100(null, -94);
        }
        field200++;
        long[] var2 = class434.field6216;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field205 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) ((var5 ^ (long) (this.field206 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field206 ^ var7) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) ((var9 ^ (long) (this.field202 >> 24)) & 0xFFL)];
        long var13 = var2[(int) (((long) (this.field202 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) ((var13 ^ (long) (this.field202 >> 8)) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) (((long) this.field202 ^ var15) & 0xFFL)];
        long var19 = var2[(int) ((var17 ^ (long) this.field199) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field207 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field207 >> 16) ^ var21) & 0xFFL)];
        long var25 = var2[(int) ((var23 ^ (long) (this.field207 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) (((long) this.field207 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field203) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) (((long) (this.field201 ? 1 : 0) ^ var29) & 0xFFL)];
    }
}
