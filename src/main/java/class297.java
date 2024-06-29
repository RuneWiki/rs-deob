import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class297 implements class281 {

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "Z")
    public static boolean field4096 = false;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field4093;

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field4097;

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public int field4098;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field4099;

    @OriginalMember(owner = "client!eu", name = "h", descriptor = "I")
    public int field4100;

    @OriginalMember(owner = "client!eu", name = "i", descriptor = "I")
    public int field4101;

    @OriginalMember(owner = "client!eu", name = "j", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!eu", name = "k", descriptor = "I")
    public int field4103;

    @OriginalMember(owner = "client!eu", name = "m", descriptor = "I")
    public int field4105;

    @OriginalMember(owner = "client!eu", name = "l", descriptor = "Z")
    public boolean field4104;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)J")
    public final long method1751(int arg0) {
        field4093++;
        long[] var2 = class160.field2303;
        long var3 = -1L;
        if (arg0 != -24922) {
            this.method1751(8);
        }
        long var5 = var3 >>> 8 ^ var2[(int) (((long) this.field4103 ^ var3) & 0xFFL)];
        long var7 = var2[(int) (((long) (this.field4102 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var2[(int) (((long) this.field4102 ^ var7) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var2[(int) (((long) (this.field4101 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var2[(int) (((long) (this.field4101 >> 16) ^ var11) & 0xFFL)] ^ var11 >>> 8;
        long var15 = var2[(int) (((long) (this.field4101 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var15 >>> 8 ^ var2[(int) ((var15 ^ (long) this.field4101) & 0xFFL)];
        long var19 = var2[(int) ((var17 ^ (long) this.field4105) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) ((var19 ^ (long) (this.field4098 >> 24)) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var21 >>> 8 ^ var2[(int) (((long) (this.field4098 >> 16) ^ var21) & 0xFFL)];
        long var25 = var2[(int) ((var23 ^ (long) (this.field4098 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) ((var25 ^ (long) this.field4098) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var27 >>> 8 ^ var2[(int) ((var27 ^ (long) this.field4100) & 0xFFL)];
        return var29 >>> 8 ^ var2[(int) (((long) (this.field4104 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(Lig;I)Z")
    public final boolean method1752(class281 arg0, int arg1) {
        field4097++;
        if (!(arg0 instanceof class297)) {
            return false;
        }
        int var3 = 43 / ((arg1 + 74) / 42);
        class297 var4 = (class297) arg0;
        if (this.field4103 != var4.field4103) {
            return false;
        } else if (this.field4102 != var4.field4102) {
            return false;
        } else if (this.field4101 != var4.field4101) {
            return false;
        } else if (this.field4105 != var4.field4105) {
            return false;
        } else if (this.field4098 != var4.field4098) {
            return false;
        } else if (this.field4100 == var4.field4100) {
            return this.field4104 == var4.field4104;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "([II[III)V")
    public static final void method1830(int[] arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field4095++;
        if (arg4 != -2026513144) {
            field4096 = false;
        }
        if (arg3 >= arg1) {
            return;
        }
        int var5 = (arg3 + arg1) / 2;
        int var6 = arg3;
        int var7 = arg2[var5];
        arg2[var5] = arg2[arg1];
        arg2[arg1] = var7;
        int var8 = arg0[var5];
        arg0[var5] = arg0[arg1];
        arg0[arg1] = var8;
        for (int var9 = arg3; var9 < arg1; var9++) {
            if (arg2[var9] < (var9 & 0x1) + var7) {
                int var10 = arg2[var9];
                arg2[var9] = arg2[var6];
                arg2[var6] = var10;
                int var11 = arg0[var9];
                arg0[var9] = arg0[var6];
                arg0[var6++] = var11;
            }
        }
        arg2[arg1] = arg2[var6];
        arg2[var6] = var7;
        arg0[arg1] = arg0[var6];
        arg0[var6] = var8;
        method1830(arg0, var6 - 1, arg2, arg3, -2026513144);
        method1830(arg0, arg1, arg2, var6 + 1, -2026513144);
    }

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "(I)Lcd;")
    public static final class109 method1831(int arg0) {
        field4099++;
        try {
            return arg0 == 255 ? (class109) Class.forName("tn").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }
}
