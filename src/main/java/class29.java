import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class29 implements class457 {

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "F")
    public static float field282;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public int field283;

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "I")
    public int field286;

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
    public int field287;

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!qaa", name = "h", descriptor = "I")
    public int field289;

    @OriginalMember(owner = "client!qaa", name = "i", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!qaa", name = "j", descriptor = "I")
    public int field291;

    @OriginalMember(owner = "client!qaa", name = "k", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "Z")
    public boolean field285;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "[I")
    public static int[] field284;

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "(B)V")
    public static void method166(byte arg0) {
        if (arg0 != 111) {
            field282 = -0.12575528F;
        }
        field284 = null;
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(Lst;I)Z")
    public final boolean method167(class457 arg0, int arg1) {
        field288++;
        if (!(arg0 instanceof class29)) {
            return false;
        }
        class29 var3 = (class29) arg0;
        if (this.field291 != var3.field291) {
            return false;
        } else if (this.field287 != var3.field287) {
            return false;
        } else if (this.field283 != var3.field283) {
            return false;
        } else if (this.field290 != var3.field290) {
            return false;
        } else if (this.field289 == var3.field289) {
            if (arg1 != 52) {
                this.field285 = false;
            }
            if (this.field286 == var3.field286) {
                return this.field285 == var3.field285;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(B)J")
    public final long method168(byte arg0) {
        field292++;
        long[] var2 = class377.field5509;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field291) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) (((long) (this.field287 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field287) & 0xFFL)];
        long var11 = var2[(int) (((long) (this.field283 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field283 >> 16)) & 0xFFL)];
        long var15 = var2[(int) (((long) (this.field283 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field283) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field290 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field289 >> 24)) & 0xFFL)];
        long var23 = var2[(int) (((long) (this.field289 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) (((long) (this.field289 >> 8) ^ var23) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) (((long) this.field289 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) (((long) this.field286 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        if (arg0 <= 72) {
            this.field289 = -89;
        }
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field285 ? 1 : 0)) & 0xFFL)];
    }
}
