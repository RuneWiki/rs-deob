import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class212 {

    @OriginalMember(owner = "client!on", name = "p", descriptor = "I")
    public static int field3302 = 50;

    @OriginalMember(owner = "client!on", name = "m", descriptor = "[I")
    public static int[] field3299 = new int[field3302];

    @OriginalMember(owner = "client!on", name = "d", descriptor = "[I")
    public static int[] field3290 = new int[field3302];

    @OriginalMember(owner = "client!on", name = "n", descriptor = "[I")
    public static int[] field3300 = new int[field3302];

    @OriginalMember(owner = "client!on", name = "i", descriptor = "[I")
    public static int[] field3295 = new int[field3302];

    @OriginalMember(owner = "client!on", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3296 = new String[field3302];

    @OriginalMember(owner = "client!on", name = "l", descriptor = "[I")
    public static int[] field3298 = new int[field3302];

    @OriginalMember(owner = "client!on", name = "o", descriptor = "[I")
    public static int[] field3301 = new int[field3302];

    @OriginalMember(owner = "client!on", name = "b", descriptor = "I")
    public static int field3288;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field3292;

    @OriginalMember(owner = "client!on", name = "g", descriptor = "I")
    public static int field3293;

    @OriginalMember(owner = "client!on", name = "h", descriptor = "I")
    public static int field3294;

    @OriginalMember(owner = "client!on", name = "k", descriptor = "I")
    public int field3297;

    @OriginalMember(owner = "client!on", name = "q", descriptor = "I")
    private int field3303;

    @OriginalMember(owner = "client!on", name = "e", descriptor = "Llf;")
    public static class151 field3291;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field3287;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)I", line = 3)
    public final int method1302(int arg0) {
        if (arg0 != 16383) {
            method1305(true, null);
        }
        field3294++;
        return this.field3297 & 0x3FFF;
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V", line = 15)
    public static void method1303(int arg0) {
        field3299 = null;
        field3290 = null;
        field3298 = null;
        if (arg0 != -20878) {
            return;
        }
        field3300 = null;
        field3296 = null;
        field3287 = null;
        field3295 = null;
        field3301 = null;
        field3291 = null;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(BIII)Z", line = 41)
    public final boolean method1304(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 6) {
            field3287 = null;
        }
        field3292++;
        int var5 = this.field3303;
        if (this.field3297 == arg1 && this.field3303 == 0) {
            return false;
        }
        boolean var8;
        if (this.field3303 == 0) {
            if (arg1 > this.field3297 && arg1 <= (this.field3297 + arg2) || this.field3297 > arg1 && this.field3297 - arg2 <= arg1) {
                this.field3297 = arg1;
                return false;
            }
            var8 = true;
        } else if (this.field3303 > 0 && this.field3297 < arg1) {
            int var6 = this.field3303 * this.field3303 / (arg2 * 2);
            int var7 = this.field3297 + var6;
            if (arg1 > var7 && var7 >= this.field3297) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else if (this.field3303 < 0 && arg1 < this.field3297) {
            int var9 = this.field3303 * this.field3303 / (arg2 * 2);
            int var10 = this.field3297 - var9;
            if (var10 > arg1 && var10 <= this.field3297) {
                var8 = true;
            } else {
                var8 = false;
            }
        } else {
            var8 = false;
        }
        if (var8) {
            if (arg1 > this.field3297) {
                this.field3303 += arg2;
                if (arg3 != 0 && arg3 < this.field3303) {
                    this.field3303 = arg3;
                }
            } else {
                this.field3303 -= arg2;
                if (arg3 != 0 && this.field3303 < (-arg3)) {
                    this.field3303 = -arg3;
                }
            }
            if (this.field3303 != var5) {
                int var11 = this.field3303 * this.field3303 / (arg2 * 2);
                if (this.field3297 >= arg1) {
                    if (arg1 < this.field3297 && arg1 > (this.field3297 - var11)) {
                        this.field3303 = var5;
                    }
                } else if (arg1 < this.field3297 + var11) {
                    this.field3303 = var5;
                }
            }
        } else if (this.field3303 > 0) {
            this.field3303 -= arg2;
            if (this.field3303 < 0) {
                this.field3303 = 0;
            }
        } else {
            this.field3303 += arg2;
            if (this.field3303 > 0) {
                this.field3303 = 0;
            }
        }
        this.field3297 += this.field3303 + var5 >> 1;
        return var8;
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(ZLjava/lang/String;)J", line = 180)
    public static final long method1305(boolean arg0, String arg1) {
        field3289++;
        long var2 = 0L;
        if (arg0) {
            field3299 = null;
        }
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            var2 *= 37L;
            char var6 = arg1.charAt(var5);
            if (var6 >= 'A' && var6 <= 'Z') {
                var2 += (var6 - 64);
            } else if (var6 >= 'a' && var6 <= 'z') {
                var2 += (var6 + 1 - 97);
            } else if (var6 >= '0' && var6 <= '9') {
                var2 += (var6 + 27 - 48);
            }
            if (var2 >= 177917621779460413L) {
                break;
            }
        }
        while ((var2 % 37L) == 0L && var2 != 0L) {
            var2 /= 37L;
        }
        return var2;
    }

    @OriginalMember(owner = "client!on", name = "c", descriptor = "(I)V", line = 228)
    public final void method1306(int arg0) {
        field3293++;
        this.field3297 &= 0x3FFF;
        int var2 = 61 % ((arg0 + 1) / 43);
    }

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(IZ)V", line = 238)
    public final void method1307(int arg0, boolean arg1) {
        field3288++;
        if (arg1) {
            this.method1302(119);
        }
        this.field3297 = arg0;
        this.field3303 = 0;
    }
}
