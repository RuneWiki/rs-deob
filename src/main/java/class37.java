import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class37 {

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public int field827 = -1;

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Lpj;")
    public static class237 field829 = class33.method353("Angreifen", 75);

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "S")
    public static short field828 = 1;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Lpj;")
    private static class237 field834 = class33.method353("Use", 97);

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "Lpj;")
    public static class237 field830 = class33.method353("Lade Konfiguration )2 ", 71);

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "Lpj;")
    public static class237 field831 = field834;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "[I")
    public static int[] field837 = new int[2];

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field835 = 0;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field832;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field833;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field836;

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "I")
    public static int field838;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "I")
    public static int field840;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "Lji;")
    public class41 field841;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "[I")
    public int[] field842;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "[Lpj;")
    public class237[] field839;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method377(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field840++;
        if (arg8 != 0) {
            return;
        }
        if (arg2 == arg4 && arg0 == arg9 && arg1 == arg3 && arg6 == arg7) {
            class28.method246((byte) 103, arg7, arg9, arg5, arg4, arg3);
            return;
        }
        int var10 = arg4;
        int var11 = arg9 * 3;
        int var12 = arg2 * 3;
        int var13 = arg4 * 3;
        int var14 = arg0 * 3;
        int var15 = arg1 * 3;
        int var16 = arg9;
        int var17 = arg6 * 3;
        int var18 = var12 + arg3 - arg4 - var15;
        int var19 = var15 + var13 - var12 - var12;
        int var20 = arg7 - (var17 - var14) - arg9;
        int var21 = var11 + var17 - var14 - var14;
        int var22 = var14 - var11;
        int var23 = var12 - var13;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var19 * var25;
            int var28 = var20 * var26;
            int var29 = var21 * var25;
            int var30 = var18 * var26;
            int var31 = var23 * var24;
            int var32 = (var27 + var30 + var31 >> 12) + arg4;
            int var33 = var22 * var24;
            int var34 = (var29 + var33 + var28 >> 12) + arg9;
            class28.method246((byte) 10, var34, var16, arg5, var10, var32);
            var10 = var32;
            var16 = var34;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I")
    public static final int method378(int arg0) {
        if (arg0 != -21416) {
            method378(-58);
        }
        field836++;
        return class146.field2609;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)I")
    public static final int method379(int arg0, int arg1) {
        int var2 = (arg1 >>> 1 & 0x55555555) + (arg1 & 0x55555555);
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCC) >>> 2);
        field838++;
        int var4 = var3 + (var3 >>> 4) & 0xF0F0F0F;
        if (arg0 != 15228) {
            field834 = null;
        }
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V")
    public static void method380(byte arg0) {
        field831 = null;
        field834 = null;
        field829 = null;
        field830 = null;
        int var1 = -67 % ((45 - arg0) / 56);
        field837 = null;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)I")
    public static final int method381(int arg0) {
        if (arg0 != 0) {
            field828 = 105;
        }
        field833++;
        return 0;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(JI)V")
    public static final void method382(long arg0, int arg1) {
        field832++;
        if (arg0 == 0L) {
            return;
        }
        class87.field1597++;
        class223.field3830.method368(118, 13);
        class223.field3830.method292(110, arg0);
        if (arg1 != 14942) {
            field830 = null;
        }
    }
}
