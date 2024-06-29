import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qv")
public class class380 implements class249 {

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field5229 = new String[100];

    @OriginalMember(owner = "client!qv", name = "m", descriptor = "[[B")
    public static byte[][] field5241;

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "I")
    public int field5230;

    @OriginalMember(owner = "client!qv", name = "d", descriptor = "I")
    public int field5232;

    @OriginalMember(owner = "client!qv", name = "e", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!qv", name = "f", descriptor = "I")
    public int field5234;

    @OriginalMember(owner = "client!qv", name = "g", descriptor = "I")
    public static int field5235;

    @OriginalMember(owner = "client!qv", name = "h", descriptor = "I")
    public int field5236;

    @OriginalMember(owner = "client!qv", name = "i", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!qv", name = "j", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!qv", name = "k", descriptor = "I")
    public int field5239;

    @OriginalMember(owner = "client!qv", name = "l", descriptor = "I")
    public int field5240;

    @OriginalMember(owner = "client!qv", name = "c", descriptor = "Z")
    public boolean field5231;

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(ILgw;)Lig;")
    public static final class204 method2268(int arg0, class148 arg1) {
        int var2 = 41 / ((arg0 + 27) / 38);
        field5235++;
        return new class204(arg1.method1047(0), arg1.method1047(0), arg1.method1047(0), arg1.method1047(0), arg1.method1028((byte) 123), arg1.method1028((byte) 123), arg1.method1032((byte) -33));
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Z)J")
    public final long method1581(boolean arg0) {
        field5233++;
        long[] var2 = class599.field8835;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field5234) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var2[(int) ((var5 ^ (long) (this.field5236 >> 8)) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) ((var7 ^ (long) this.field5236) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) ((var9 ^ (long) (this.field5240 >> 24)) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) (((long) (this.field5240 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) (((long) (this.field5240 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) (((long) this.field5240 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) ((var17 ^ (long) this.field5239) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field5230 >> 24)) & 0xFFL)];
        long var23 = var2[(int) (((long) (this.field5230 >> 16) ^ var21) & 0xFFL)] ^ var21 >>> 8;
        if (arg0) {
            this.method1582(null, 62);
        }
        long var25 = var23 >>> 8 ^ var2[(int) ((var23 ^ (long) (this.field5230 >> 8)) & 0xFFL)];
        long var27 = var25 >>> 8 ^ var2[(int) (((long) this.field5230 ^ var25) & 0xFFL)];
        long var29 = var27 >>> 8 ^ var2[(int) (((long) this.field5232 ^ var27) & 0xFFL)];
        return var2[(int) ((var29 ^ (long) (this.field5231 ? 1 : 0)) & 0xFFL)] ^ var29 >>> 8;
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(Lnba;I)Z")
    public final boolean method1582(class249 arg0, int arg1) {
        field5238++;
        if (!(arg0 instanceof class380)) {
            return false;
        }
        class380 var3 = (class380) arg0;
        if (this.field5234 != var3.field5234) {
            return false;
        } else if (this.field5236 == var3.field5236) {
            if (arg1 != -16648) {
                method2270(-21);
            }
            if (this.field5240 != var3.field5240) {
                return false;
            } else if (this.field5239 != var3.field5239) {
                return false;
            } else if (this.field5230 != var3.field5230) {
                return false;
            } else if (this.field5232 == var3.field5232) {
                return var3.field5231 == this.field5231;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!qv", name = "a", descriptor = "(I)V")
    public static final void method2269(int arg0) {
        if (arg0 != 21815) {
            method2268(120, null);
        }
        field5237++;
        if (class48.field568 != null && class321.field4429 != null) {
            return;
        }
        class48.field568 = new int[256];
        class321.field4429 = new int[256];
        for (int var1 = 0; var1 < 256; var1++) {
            double var2 = (double) var1 / 255.0D * 6.283185307179586D;
            class48.field568[var1] = (int) (Math.sin(var2) * 4096.0D);
            class321.field4429[var1] = (int) (Math.cos(var2) * 4096.0D);
        }
    }

    @OriginalMember(owner = "client!qv", name = "b", descriptor = "(I)V")
    public static void method2270(int arg0) {
        field5229 = null;
        field5241 = null;
        if (arg0 < 66) {
            field5241 = null;
        }
    }

    static {
        new class572(" days.", " Tage.", " jours.", " dias.");
        field5241 = new byte[250][];
    }
}
