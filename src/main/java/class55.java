import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class55 extends class288 {

    @OriginalMember(owner = "client!lh", name = "l", descriptor = "Ljava/lang/String;")
    public static String field640 = " has logged out.";

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "[I")
    public static int[] field650 = new int[32];

    @OriginalMember(owner = "client!lh", name = "m", descriptor = "I")
    public static int field641;

    @OriginalMember(owner = "client!lh", name = "o", descriptor = "I")
    public static int field643;

    @OriginalMember(owner = "client!lh", name = "p", descriptor = "I")
    public static int field644;

    @OriginalMember(owner = "client!lh", name = "q", descriptor = "I")
    public static int field645;

    @OriginalMember(owner = "client!lh", name = "r", descriptor = "I")
    public static int field646;

    @OriginalMember(owner = "client!lh", name = "u", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "J")
    public long field651;

    @OriginalMember(owner = "client!lh", name = "t", descriptor = "Lki;")
    public static class135 field648;

    @OriginalMember(owner = "client!lh", name = "n", descriptor = "Llh;")
    public class55 field642;

    @OriginalMember(owner = "client!lh", name = "s", descriptor = "Llh;")
    public class55 field647;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIIJ)Z")
    public static final boolean method333(int arg0, int arg1, int arg2, long arg3) {
        class133 var5 = class6.field94[arg0][arg1][arg2];
        if (var5 == null) {
            return false;
        } else if (var5.field1927 != null && var5.field1927.field1662 == arg3) {
            return true;
        } else if (var5.field1920 != null && var5.field1920.field2347 == arg3) {
            return true;
        } else if (var5.field1917 != null && var5.field1917.field575 == arg3) {
            return true;
        } else {
            for (int var6 = 0; var6 < var5.field1934; var6++) {
                if (var5.field1930[var6].field3539 == arg3) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(I)V")
    public static void method334(int arg0) {
        field650 = null;
        field640 = null;
        field648 = null;
        if (arg0 != 19850) {
            method338((byte) -103, false);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Z)V")
    public static final void method335(boolean arg0) {
        if (!arg0) {
            field640 = null;
        }
        field643++;
        class73.field875.method71(-92);
        class1.field21.method71(-107);
    }

    @OriginalMember(owner = "client!lh", name = "d", descriptor = "(I)V")
    public final void method336(int arg0) {
        field645++;
        if (this.field642 == null) {
            return;
        }
        this.field642.field647 = this.field647;
        this.field647.field642 = this.field642;
        this.field647 = null;
        this.field642 = null;
        if (arg0 != 22047) {
            method337(58, -13, true, 44, -77, -124, true);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(IIZIIIZ)V")
    public static final void method337(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, boolean arg6) {
        field641++;
        if (arg0 > arg1) {
            int var7 = (arg0 + arg1) / 2;
            int var8 = arg1;
            class176 var9 = class138.field2012[var7];
            class138.field2012[var7] = class138.field2012[arg0];
            class138.field2012[arg0] = var9;
            for (int var10 = arg1; var10 < arg0; var10++) {
                if (class14.method89(arg2, var9, arg5 ^ 0x40, class138.field2012[var10], arg6, arg4, arg3) <= 0) {
                    class176 var11 = class138.field2012[var10];
                    class138.field2012[var10] = class138.field2012[var8];
                    class138.field2012[var8++] = var11;
                }
            }
            class138.field2012[arg0] = class138.field2012[var8];
            class138.field2012[var8] = var9;
            method337(var8 - 1, arg1, arg2, arg3, arg4, 64, arg6);
            method337(arg0, var8 + 1, arg2, arg3, arg4, 64, arg6);
        }
        if (arg5 != 64) {
            field646 = -84;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BZ)V")
    public static final void method338(byte arg0, boolean arg1) {
        field644++;
        byte var2 = 4;
        byte[][] var3 = class282.field4278;
        int var4 = var3.length;
        int var5 = -127 / ((-arg0 - 35) / 62);
        for (int var6 = 0; var6 < var4; var6++) {
            int[] var12 = null;
            byte[] var13 = var3[var6];
            int var14 = class190.field2739[var6] & 0xFF;
            int var15 = class190.field2739[var6] >> 8;
            int var16 = var15 * 64 - class110.field1473;
            int var17 = var14 * 64 - class166.field2383;
            if (var13 != null) {
                class6.method32(100);
                var12 = class26.method154(var16, class110.field1473, class166.field2383, class127.field1825, var17, -105, arg1, var13);
            }
            if (!arg1 && class181.field2575 / 8 == var15 && (class88.field1196 / 8) == var14) {
                if (var12 == null) {
                    class167.field2397 = -1;
                } else {
                    class94.field1257 = var12[1];
                    class214.field2985 = var12[3];
                    class167.field2397 = var12[0];
                    class28.field333 = var12[2];
                    class261.field3795 = var12[4];
                }
            }
        }
        for (int var7 = 0; var7 < var4; var7++) {
            int var8 = (class190.field2739[var7] >> 8) * 64 - class110.field1473;
            int var9 = (class190.field2739[var7] & 0xFF) * 64 - class166.field2383;
            byte[] var10 = var3[var7];
            if (var10 == null && class88.field1196 < 800) {
                class6.method32(102);
                for (int var11 = 0; var11 < var2; var11++) {
                    class240.method1562(var9, var11, var8, 64, false, 64);
                }
            }
        }
    }
}
