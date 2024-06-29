import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class369 {

    @OriginalMember(owner = "client!e", name = "f", descriptor = "Lsl;")
    public static class318 field5484 = new class318(36, 3);

    @OriginalMember(owner = "client!e", name = "g", descriptor = "[I")
    public static int[] field5485;

    @OriginalMember(owner = "client!e", name = "h", descriptor = "Lbg;")
    public static class324 field5486;

    @OriginalMember(owner = "client!e", name = "i", descriptor = "Lpp;")
    public static class268 field5487;

    @OriginalMember(owner = "client!e", name = "k", descriptor = "I")
    public static int field5489;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!e", name = "b", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!e", name = "c", descriptor = "I")
    public static int field5481;

    @OriginalMember(owner = "client!e", name = "d", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!e", name = "e", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!e", name = "j", descriptor = "I")
    public static int field5488;

    static {
        new class331(null, "Dieses System darf nicht missbraucht werden!", null, null);
        field5485 = new int[14];
        field5486 = new class324(1, -2);
        field5487 = new class268();
        new class331("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field5489 = 1;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(IIIIIIIIII)V", line = 3)
    public static final void method2279(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        int var10 = 122 % ((10 - arg3) / 34);
        field5479++;
        if (arg7 == arg8 && arg0 == arg4 && arg6 == arg9 && arg2 == arg5) {
            class7.method49(arg0, arg8, arg1, arg2, arg6, -124);
            return;
        }
        int var11 = arg8;
        int var12 = arg0;
        int var13 = arg8 * 3;
        int var14 = arg0 * 3;
        int var15 = arg7 * 3;
        int var16 = arg4 * 3;
        int var17 = arg9 * 3;
        int var18 = arg5 * 3;
        int var19 = arg6 + var15 - var17 - arg8;
        int var20 = var16 + arg2 - arg0 - var18;
        int var21 = var13 + var17 - var15 - var15;
        int var22 = var18 + var14 - var16 - var16;
        int var23 = var15 - var13;
        int var24 = var16 - var14;
        for (int var25 = 128; var25 <= 4096; var25 += 128) {
            int var26 = var25 * var25 >> 12;
            int var27 = var25 * var26 >> 12;
            int var28 = var19 * var27;
            int var29 = var20 * var27;
            int var30 = var21 * var26;
            int var31 = var22 * var26;
            int var32 = var23 * var25;
            int var33 = var24 * var25;
            int var34 = arg8 + (var30 + var32 + var28 >> 12);
            int var35 = (var29 + var33 + var31 >> 12) + arg0;
            class7.method49(var12, var11, arg1, var35, var34, 37);
            var12 = var35;
            var11 = var34;
        }
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(I)V", line = 79)
    public static void method2280(int arg0) {
        field5484 = null;
        if (arg0 != 63) {
            method2282((byte) 77, null);
        }
        field5485 = null;
        field5487 = null;
        field5486 = null;
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(II)S", line = 92)
    public static final short method2281(int arg0, int arg1) {
        field5481++;
        int var2 = -96 % ((arg0 - 61) / 63);
        int var3 = arg1 >> 10 & 0x3F;
        int var4 = arg1 >> 3 & 0x70;
        int var5 = arg1 & 0x7F;
        int var6 = var5 <= 64 ? var4 * var5 >> 7 : (127 - var5) * var4 >> 7;
        int var7 = var5 + var6;
        int var8;
        if (var7 == 0) {
            var8 = var6 << 1;
        } else {
            var8 = (var6 << 8) / var7;
        }
        return (short) (var3 << 10 | var8 >> 4 << 7 | var7);
    }

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(BLiv;)V", line = 121)
    public static final void method2282(byte arg0, class65 arg1) {
        if (arg0 > -117) {
            field5489 = -3;
        }
        field5483++;
        byte[] var2 = new byte[24];
        if (class231.field3406 != null) {
            try {
                class231.field3406.method2342(0, 0L);
                class231.field3406.method2338(var2, 115);
                int var3;
                for (var3 = 0; var3 < 24 && var2[var3] == 0; var3++) {
                }
                if (var3 >= 24) {
                    throw new IOException();
                }
            } catch (Exception var5) {
                for (int var4 = 0; var4 < 24; var4++) {
                    var2[var4] = -1;
                }
            }
        }
        arg1.method606(0, true, var2, 24);
    }
}
