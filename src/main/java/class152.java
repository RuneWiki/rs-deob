import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class152 {

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
    public int field2186 = 0;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "Z")
    private boolean field2190 = false;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
    public int field2189 = 0;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    public int field2185;

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "I")
    public int field2187;

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
    public int field2191;

    @OriginalMember(owner = "client!cfa", name = "h", descriptor = "I")
    public int field2192;

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "I")
    public static int field2193;

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
    public int field2194;

    @OriginalMember(owner = "client!cfa", name = "k", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!cfa", name = "l", descriptor = "I")
    public static int field2196;

    @OriginalMember(owner = "client!cfa", name = "m", descriptor = "I")
    public int field2197;

    @OriginalMember(owner = "client!cfa", name = "n", descriptor = "I")
    public static int field2198;

    @OriginalMember(owner = "client!cfa", name = "o", descriptor = "I")
    public int field2199;

    @OriginalMember(owner = "client!cfa", name = "p", descriptor = "I")
    public int field2200;

    @OriginalMember(owner = "client!cfa", name = "r", descriptor = "I")
    public int field2202;

    @OriginalMember(owner = "client!cfa", name = "s", descriptor = "I")
    private int field2203;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "J")
    public long field2188;

    @OriginalMember(owner = "client!cfa", name = "q", descriptor = "Ljba;")
    public static class363 field2201;

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(IC)Z", line = 6)
    public static final boolean method1068(int arg0, char arg1) {
        field2196++;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class386.method2306(47, arg1)) {
            return true;
        } else {
            char[] var2 = class66.field1223;
            for (int var3 = 0; var3 < var2.length; var3++) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            char[] var4 = class484.field6878;
            int var5 = 0;
            if (arg0 != -22763) {
                return true;
            }
            while (var4.length > var5) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
                var5++;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V", line = 60)
    public static void method1069(int arg0) {
        field2201 = null;
        if (arg0 != -1) {
            method1068(123, '&');
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V", line = 78)
    public final void method1070(boolean arg0) {
        field2193++;
        this.field2199 = class189.field2721[this.field2203 << 3];
        long var2 = (long) this.field2194;
        long var4 = (long) this.field2200;
        long var6 = (long) this.field2197;
        if (arg0) {
            this.field2185 = 12;
        }
        this.field2187 = (int) Math.sqrt((double) (var4 * var4 + var2 * var2 + var6 * var6));
        if (this.field2191 == 0) {
            this.field2191 = 1;
        }
        if (this.field2202 == 0) {
            this.field2188 = 2147483647L;
        } else if (this.field2202 == 1) {
            this.field2188 = (this.field2187 * 8 / this.field2191);
            this.field2188 *= this.field2188;
        } else if (this.field2202 == 2) {
            this.field2188 = (this.field2187 * 8 / this.field2191);
        }
        if (this.field2190) {
            this.field2187 *= -1;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lmo;I)V", line = 126)
    public final void method1071(class695 arg0, int arg1) {
        if (arg1 != -22661) {
            this.field2190 = false;
        }
        while (true) {
            int var3 = arg0.method3826(false);
            if (var3 == 0) {
                field2198++;
                return;
            }
            this.method1072(arg0, (byte) 11, var3);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Lmo;BI)V", line = 146)
    private final void method1072(class695 arg0, byte arg1, int arg2) {
        if (arg1 != 11) {
            this.field2200 = -63;
        }
        if (arg2 == 1) {
            this.field2203 = arg0.method3847((byte) 118);
        } else if (arg2 == 2) {
            arg0.method3826(false);
        } else if (arg2 == 3) {
            this.field2194 = arg0.method3880(arg1 - 3);
            this.field2200 = arg0.method3880(8);
            this.field2197 = arg0.method3880(8);
        } else if (arg2 == 4) {
            this.field2202 = arg0.method3826(false);
            this.field2191 = arg0.method3880(8);
        } else if (arg2 == 6) {
            this.field2185 = arg0.method3826(false);
        } else if (arg2 == 8) {
            this.field2186 = 1;
        } else if (arg2 == 9) {
            this.field2189 = 1;
        } else if (arg2 == 10) {
            this.field2190 = true;
        }
        field2195++;
    }
}
