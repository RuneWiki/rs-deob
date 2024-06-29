import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ak")
public class class159 {

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "Z")
    public static boolean field2544 = true;

    @OriginalMember(owner = "client!ak", name = "j", descriptor = "Lha;")
    public static class29 field2552 = new class29(5000);

    @OriginalMember(owner = "client!ak", name = "k", descriptor = "[B")
    public static byte[] field2553 = new byte[32896];

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!ak", name = "e", descriptor = "I")
    public static int field2547;

    @OriginalMember(owner = "client!ak", name = "f", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!ak", name = "g", descriptor = "J")
    public long field2549;

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "Lak;")
    public class159 field2545;

    @OriginalMember(owner = "client!ak", name = "i", descriptor = "Lak;")
    public class159 field2551;

    @OriginalMember(owner = "client!ak", name = "d", descriptor = "[I")
    public static int[] field2546;

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(Lnm;Lnm;ZB)V", line = 8)
    public static final void method1127(class221 arg0, class221 arg1, boolean arg2, byte arg3) {
        if (arg3 > -52) {
            method1128(-64, -78, -37);
        }
        field2543++;
        class299.field4933 = arg0;
        class297.field4930 = arg2;
        class334.field5417 = arg1;
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 256; var1++) {
            for (int var2 = 0; var2 <= var1; var2++) {
                field2553[var0++] = (byte) ((int) (255.0D / Math.sqrt((double) ((float) (var1 * var1 + var2 * var2 + 65535) / 65535.0F))));
            }
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(III)Lel;", line = 27)
    public static final class258 method1128(int arg0, int arg1, int arg2) {
        class50 var3 = class264.field4230[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field735; var4++) {
            class258 var5 = var3.field752[var4];
            if ((var5.field4076 >> 29 & 0x3L) == 2L && var5.field4082 == arg1 && var5.field4081 == arg2) {
                class140.method991(var5);
                return var5;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(ZI)V", line = 55)
    public static final void method1129(boolean arg0, int arg1) {
        field2550++;
        byte var2;
        byte[][] var3;
        if (class245.field3886 && arg0) {
            var2 = 1;
            var3 = class315.field5197;
        } else {
            var2 = 4;
            var3 = class241.field3778;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class190.method1316(-123);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class276.field4549[var4][var5][var6];
                    if (var7 != -1) {
                        int var8 = (var7 & 0x374078E) >> 24;
                        if (!arg0 || var8 == 0) {
                            int var9 = var7 >> 3 & 0x7FF;
                            int var10 = (var7 & 0xFFFE74) >> 14;
                            int var11 = (var10 / 8 << 8) + var9 / 8;
                            int var12 = (var7 & 0x6) >> 1;
                            for (int var13 = 0; var13 < class150.field2404.length; var13++) {
                                if (class150.field2404[var13] == var11 && var3[var13] != null) {
                                    class313.method2211(var12, var3[var13], var4, arg0, (var9 & 0x7) * 8, var8, class124.field1860, (var10 & 0x7) * 8, var6 * 8, 7, var5 * 8);
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 14808) {
            method1127((class221) null, (class221) null, false, (byte) -14);
        }
    }

    @OriginalMember(owner = "client!ak", name = "a", descriptor = "(I)V", line = 138)
    public static void method1130(int arg0) {
        field2553 = null;
        field2552 = null;
        if (arg0 != 27567) {
            field2546 = (int[]) null;
        }
        field2546 = null;
    }

    @OriginalMember(owner = "client!ak", name = "b", descriptor = "(I)V", line = 153)
    public final void method1131(int arg0) {
        field2548++;
        if (this.field2545 == null) {
            return;
        }
        this.field2545.field2551 = this.field2551;
        this.field2551.field2545 = this.field2545;
        this.field2551 = null;
        if (arg0 == 8) {
            this.field2545 = null;
        }
    }

    @OriginalMember(owner = "client!ak", name = "c", descriptor = "(I)Z", line = 171)
    public final boolean method1132(int arg0) {
        field2547++;
        if (arg0 >= -89) {
            method1130(82);
        }
        return this.field2545 != null;
    }
}
