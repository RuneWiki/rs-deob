import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hh")
public abstract class class125 extends class243 {

    @OriginalMember(owner = "client!hh", name = "i", descriptor = "Z")
    public boolean field2171 = false;

    @OriginalMember(owner = "client!hh", name = "m", descriptor = "Z")
    public boolean field2175 = false;

    @OriginalMember(owner = "client!hh", name = "k", descriptor = "S")
    public short field2173;

    @OriginalMember(owner = "client!hh", name = "r", descriptor = "I")
    public int field2180;

    @OriginalMember(owner = "client!hh", name = "h", descriptor = "I")
    public int field2170;

    @OriginalMember(owner = "client!hh", name = "j", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!hh", name = "l", descriptor = "Z")
    public static boolean field2174 = false;

    @OriginalMember(owner = "client!hh", name = "g", descriptor = "I")
    public static int field2169;

    @OriginalMember(owner = "client!hh", name = "n", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!hh", name = "o", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!hh", name = "p", descriptor = "I")
    public static int field2178;

    @OriginalMember(owner = "client!hh", name = "q", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(II)I", line = 4)
    public static final int method981(int arg0, int arg1) {
        field2179++;
        double var2 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var4 = (double) ((arg1 & 0xFF98) >> 8) / 256.0D;
        double var6 = (double) (arg1 & 0xFF) / 256.0D;
        double var8 = var2;
        if (var2 > var4) {
            var8 = var4;
        }
        if (var6 < var8) {
            var8 = var6;
        }
        double var10 = var2;
        if (var4 > var2) {
            var10 = var4;
        }
        if (var10 < var6) {
            var10 = var6;
        }
        double var12 = 0.0D;
        double var14 = 0.0D;
        double var16 = (var8 + var10) / 2.0D;
        if (var8 != var10) {
            if (var16 < 0.5D) {
                var14 = (var10 - var8) / (var8 + var10);
            }
            if (var16 >= 0.5D) {
                var14 = (var10 - var8) / (2.0D - var10 - var8);
            }
            if (var2 == var10) {
                var12 = (var4 - var6) / (var10 - var8);
            } else if (var4 == var10) {
                var12 = (var6 - var2) / (var10 - var8) + 2.0D;
            } else if (var6 == var10) {
                var12 = (var2 - var4) / (var10 - var8) + 4.0D;
            }
        }
        double var18 = var12 / 6.0D;
        if (arg0 != -218) {
            field2176 = -20;
        }
        int var20 = (int) (var18 * 256.0D);
        int var21 = (int) (var14 * 256.0D);
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = (int) (var16 * 256.0D);
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        if (var22 > 243) {
            var21 >>= 0x4;
        } else if (var22 > 217) {
            var21 >>= 0x3;
        } else if (var22 > 192) {
            var21 >>= 0x2;
        } else if (var22 > 179) {
            var21 >>= 0x1;
        }
        return ((var20 >> 2 & 0x3F) << 10) + (var21 >> 5 << 7) + (var22 >> 1);
    }

    @OriginalMember(owner = "client!hh", name = "<init>", descriptor = "(IIIIZZ)V", line = 227)
    public class125(int arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5) {
        this.field2173 = (short) arg3;
        this.field2180 = arg1;
        this.field2170 = arg2;
        this.field2175 = arg4;
        this.field2172 = arg0;
        this.field2171 = arg5;
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(IIII)V", line = 114)
    public static final void method982(int arg0, int arg1, int arg2, int arg3) {
        class465 var4 = class66.field977[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class192 var5 = var4.field6904;
        class192 var6 = var4.field6908;
        if (var5 != null) {
            var5.field2983 = var5.field2983 * arg3 / (0x10 << class276.field4534 - 7);
            var5.field2984 = var5.field2984 * arg3 / (0x10 << class276.field4534 - 7);
        }
        if (var6 != null) {
            var6.field2983 = var6.field2983 * arg3 / (0x10 << class276.field4534 - 7);
            var6.field2984 = var6.field2984 * arg3 / (0x10 << class276.field4534 - 7);
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(ZLec;)Ljava/lang/String;", line = 136)
    public static final String method983(boolean arg0, class68 arg1) {
        field2178++;
        if (client.method475(arg1).method1988(-20539) == 0) {
            return null;
        } else if (!arg0) {
            return null;
        } else if (arg1.field1139 == null || arg1.field1139.trim().length() == 0) {
            return class494.field7214 ? "Hidden-use" : null;
        } else {
            return arg1.field1139;
        }
    }

    @OriginalMember(owner = "client!hh", name = "a", descriptor = "(CB)Z", line = 159)
    public static final boolean method984(char arg0, byte arg1) {
        field2177++;
        if (Character.isISOControl(arg0)) {
            return false;
        } else if (class88.method623(arg0, 90)) {
            return true;
        } else {
            char[] var2 = class215.field3749;
            int var3 = 0;
            if (arg1 > -104) {
                field2176 = 17;
            }
            while (var3 < var2.length) {
                char var7 = var2[var3];
                if (arg0 == var7) {
                    return true;
                }
                var3++;
            }
            char[] var4 = class108.field1936;
            for (int var5 = 0; var5 < var4.length; var5++) {
                char var6 = var4[var5];
                if (arg0 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!hh", name = "e", descriptor = "(I)V", line = 205)
    public static final void method985(int arg0) {
        field2169++;
        if (arg0 == 255) {
            class231 var1 = class302.field4836;
            synchronized (class302.field4836) {
                class302.field4836.method1604(4);
            }
        }
    }
}
