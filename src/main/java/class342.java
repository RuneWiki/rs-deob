import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class342 implements class428 {

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "Lhj;")
    public static class596 field4286 = new class596(33, -1);

    @OriginalMember(owner = "client!nha", name = "m", descriptor = "[I")
    public static int[] field4295 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
    public int field4285;

    @OriginalMember(owner = "client!nha", name = "f", descriptor = "I")
    public int field4288;

    @OriginalMember(owner = "client!nha", name = "g", descriptor = "I")
    public int field4289;

    @OriginalMember(owner = "client!nha", name = "h", descriptor = "I")
    public int field4290;

    @OriginalMember(owner = "client!nha", name = "j", descriptor = "I")
    public int field4292;

    @OriginalMember(owner = "client!nha", name = "k", descriptor = "I")
    public static int field4293;

    @OriginalMember(owner = "client!nha", name = "l", descriptor = "I")
    public int field4294;

    @OriginalMember(owner = "client!nha", name = "o", descriptor = "I")
    public static int field4297;

    @OriginalMember(owner = "client!nha", name = "n", descriptor = "Ljava/lang/Object;")
    public static Object field4296;

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "Z")
    public boolean field4284;

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "[Ltf;")
    public static class312[] field4287;

    @OriginalMember(owner = "client!nha", name = "i", descriptor = "[Ltf;")
    public static class312[] field4291;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ILwe;)Z", line = 4)
    public final boolean method2029(int arg0, class428 arg1) {
        field4293++;
        if (!(arg1 instanceof class342)) {
            return false;
        }
        class342 var3 = (class342) arg1;
        if (arg0 != 22536) {
            this.method2029(-58, null);
        }
        if (this.field4288 != var3.field4288) {
            return false;
        } else if (this.field4290 != var3.field4290) {
            return false;
        } else if (this.field4294 != var3.field4294) {
            return false;
        } else if (this.field4292 != var3.field4292) {
            return false;
        } else if (this.field4289 != var3.field4289) {
            return false;
        } else if (this.field4285 == var3.field4285) {
            return this.field4284 == var3.field4284;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)J", line = 51)
    public final long method2030(int arg0) {
        field4283++;
        long[] var2 = class784.field10825;
        long var3 = -1L;
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field4288 ^ var3) & 0xFFL)];
        long var7 = var2[(int) (((long) (this.field4290 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) (((long) this.field4290 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field4294 >> 24) ^ var9) & 0xFFL)];
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field4294 >> 16)) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field4294 >> 8) ^ var13) & 0xFFL)];
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field4294) & 0xFFL)];
        if (arg0 != -16497) {
            return -30L;
        }
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field4292 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field4289 >> 24)) & 0xFFL)];
        long var23 = var2[(int) ((var21 ^ (long) (this.field4289 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field4289 >> 8)) & 0xFFL)];
        long var27 = var2[(int) (((long) this.field4289 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field4285 ^ var27) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) (((long) (this.field4284 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)V", line = 82)
    public static void method2031(byte arg0) {
        field4286 = null;
        field4291 = null;
        if (arg0 >= -21) {
            method2031((byte) 110);
        }
        field4295 = null;
        field4296 = null;
        field4287 = null;
    }
}
