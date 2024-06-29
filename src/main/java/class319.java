import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qea")
public class class319 implements class209 {

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "I")
    public int field4392;

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "I")
    public int field4393;

    @OriginalMember(owner = "client!qea", name = "c", descriptor = "I")
    public static int field4394;

    @OriginalMember(owner = "client!qea", name = "d", descriptor = "I")
    public int field4395;

    @OriginalMember(owner = "client!qea", name = "e", descriptor = "I")
    public static int field4396;

    @OriginalMember(owner = "client!qea", name = "f", descriptor = "I")
    public int field4397;

    @OriginalMember(owner = "client!qea", name = "g", descriptor = "I")
    public int field4398;

    @OriginalMember(owner = "client!qea", name = "h", descriptor = "I")
    public int field4399;

    @OriginalMember(owner = "client!qea", name = "i", descriptor = "I")
    public static int field4400;

    @OriginalMember(owner = "client!qea", name = "k", descriptor = "Lvo;")
    public static class345 field4402;

    @OriginalMember(owner = "client!qea", name = "l", descriptor = "Lpa;")
    public static class587 field4403;

    @OriginalMember(owner = "client!qea", name = "j", descriptor = "Z")
    public boolean field4401;

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(BLer;)Z")
    public final boolean method1443(byte arg0, class209 arg1) {
        field4400++;
        if (!(arg1 instanceof class319)) {
            return false;
        }
        class319 var3 = (class319) arg1;
        if (this.field4398 != var3.field4398) {
            return false;
        } else if (this.field4399 != var3.field4399) {
            return false;
        } else if (this.field4393 != var3.field4393) {
            return false;
        } else if (this.field4397 != var3.field4397) {
            return false;
        } else if (this.field4395 != var3.field4395) {
            return false;
        } else if (this.field4392 != var3.field4392) {
            return false;
        } else if (arg0 == 37) {
            return this.field4401 == var3.field4401;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(ZLjava/lang/String;I)V")
    public static final void method1913(boolean arg0, String arg1, int arg2) {
        field4394++;
        class586.method3383(-1, -1, (byte) 30, arg0, arg1);
        if (arg2 != 13238) {
            field4402 = null;
        }
    }

    @OriginalMember(owner = "client!qea", name = "a", descriptor = "(I)J")
    public final long method1442(int arg0) {
        field4396++;
        long[] var2 = class507.field7528;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field4398 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field4399 >> 8) ^ var5) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field4399 ^ var7) & 0xFFL)];
        long var11 = var2[(int) ((var9 ^ (long) (this.field4393 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) (((long) (this.field4393 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field4393 >> 8) ^ var13) & 0xFFL)];
        if (arg0 != -32331) {
            this.field4401 = false;
        }
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field4393) & 0xFFL)];
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field4397 ^ var17) & 0xFFL)];
        long var21 = var2[(int) (((long) (this.field4395 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) ((var21 ^ (long) (this.field4395 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field4395 >> 8)) & 0xFFL)];
        long var27 = var2[(int) (((long) this.field4395 ^ var25) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) ((var27 ^ (long) this.field4392) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) ((var29 ^ (long) (this.field4401 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!qea", name = "b", descriptor = "(I)V")
    public static void method1914(int arg0) {
        if (arg0 != 255) {
            field4402 = null;
        }
        field4403 = null;
        field4402 = null;
    }
}
