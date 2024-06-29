import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class182 {

    @OriginalMember(owner = "client!je", name = "c", descriptor = "Lha;")
    private class30 field3287 = null;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "Lha;")
    private class30 field3288 = null;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "I")
    private int field3296 = 65000;

    @OriginalMember(owner = "client!je", name = "h", descriptor = "I")
    private int field3292;

    @OriginalMember(owner = "client!je", name = "g", descriptor = "[I")
    public static int[] field3291 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!je", name = "i", descriptor = "Lcc;")
    private static class209 field3293 = class95.method669(115, "shake:");

    @OriginalMember(owner = "client!je", name = "m", descriptor = "Lcc;")
    public static class209 field3297 = class95.method669(121, "Vous ne pouvez pas ajouter votre nom -9 votre liste d(Wamis)3");

    @OriginalMember(owner = "client!je", name = "n", descriptor = "Lcc;")
    public static class209 field3298 = class95.method669(117, "Annuler");

    @OriginalMember(owner = "client!je", name = "o", descriptor = "Lcc;")
    public static class209 field3299 = class95.method669(93, "headicons_prayer");

    @OriginalMember(owner = "client!je", name = "q", descriptor = "[I")
    public static int[] field3301 = new int[2000];

    @OriginalMember(owner = "client!je", name = "j", descriptor = "Lcc;")
    public static class209 field3294 = field3293;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "Lcc;")
    public static class209 field3303 = field3293;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "[I")
    public static int[] field3302 = new int[] { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 73, 74, 76, 78, 83, 84, 85, 86, 91, 92, 93, 94, 95, 97, 103, 104, 105, 106, 107, 108, 113, 114, 115, 116, 118, 119, 120, 121, 122, 123, 124, 125, 133, 134, 136, 138, 143, 144, 145, 146, 151, 152, 153, 154, 155, 157, 163, 164, 165, 166, 168, 169, 174, 175, 176, 177, 180, 181, 182, 183, 184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194, 195, 196, 197, 97, 199, 200, 201, 202, 203, 204, 205, 206, 207, 208, 209, 210, 211, 212, 213, 157, 215, 216, 117, 218, 219, 220, 221, 222, 223, 224, 225, 226, 227, 228, 229, 230, 231, 232, 233, 234, 235, 236, 237, 238, 239, 240, 241, 242, 243, 244, 245, 246, 247, 248, 249, 66, 66, 66, 66, 66, 66, 65, 75, 79, 79, 79, 79, 87, 87, 87, 87, 77, 96, 98, 98, 98, 98, 98, 250, 251, 109, 109, 109, 109, 117, 252, 167, 126, 126, 126, 126, 126, 126, 125, 135, 139, 139, 139, 139, 147, 147, 147, 147, 137, 156, 158, 158, 158, 158, 158, 253, 254, 170, 170, 170, 170, 178, 255, 178 };

    @OriginalMember(owner = "client!je", name = "a", descriptor = "I")
    public static int field3285;

    @OriginalMember(owner = "client!je", name = "b", descriptor = "I")
    public static int field3286;

    @OriginalMember(owner = "client!je", name = "f", descriptor = "I")
    public static int field3290;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "I")
    public static int field3295;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    public static int field3300;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!je", name = "e", descriptor = "[I")
    public static int[] field3289;

    @OriginalMember(owner = "client!je", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3295++;
        return "Cache:" + this.field3292;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III[B)Z")
    public final boolean method1243(int arg0, int arg1, int arg2, byte[] arg3) {
        field3305++;
        class30 var5 = this.field3288;
        synchronized (this.field3288) {
            if (arg1 < 0 || this.field3296 < arg1) {
                throw new IllegalArgumentException();
            }
            boolean var6 = this.method1245(arg0, arg1, true, (byte) -47, arg3);
            if (arg2 != 139) {
                field3289 = null;
            }
            if (!var6) {
                var6 = this.method1245(arg0, arg1, false, (byte) -105, arg3);
            }
            return var6;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lji;I)V")
    public static final void method1244(class42 arg0, int arg1) {
        if (arg1 != 9542) {
            return;
        }
        class42 var2 = class118.method838(false, arg0);
        field3306++;
        int var3;
        int var4;
        if (var2 == null) {
            var3 = class25.field442;
            var4 = class50.field981;
        } else {
            var4 = var2.field758;
            var3 = var2.field789;
        }
        class192.method1320(false, arg0, var3, -94, var4);
        class40.method301(var4, var3, (byte) -5, arg0);
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZB[B)Z")
    private final boolean method1245(int arg0, int arg1, boolean arg2, byte arg3, byte[] arg4) {
        field3286++;
        class30 var6 = this.field3288;
        synchronized (this.field3288) {
            try {
                int var7;
                if (arg2) {
                    if ((long) (arg0 * 6 + 6) > this.field3287.method244(7433)) {
                        return false;
                    }
                    this.field3287.method243(true, (long) (arg0 * 6));
                    this.field3287.method249(0, 6, class202.field3635, 0);
                    var7 = (class202.field3635[5] & 0xFF) + ((class202.field3635[3] & 0xFF) << 16) + ((class202.field3635[4] & 0xFF) << 8);
                    if (var7 <= 0 || (this.field3288.method244(7433) / 520L) < ((long) var7)) {
                        return false;
                    }
                } else {
                    var7 = (int) ((this.field3288.method244(7433) + 519L) / 520L);
                    if (var7 == 0) {
                        var7 = 1;
                    }
                }
                class202.field3635[2] = (byte) arg1;
                class202.field3635[5] = (byte) var7;
                class202.field3635[0] = (byte) (arg1 >> 16);
                if (arg3 >= -45) {
                    field3299 = null;
                }
                class202.field3635[1] = (byte) (arg1 >> 8);
                class202.field3635[3] = (byte) (var7 >> 16);
                int var10 = 0;
                int var11 = 0;
                class202.field3635[4] = (byte) (var7 >> 8);
                this.field3287.method243(true, (long) (arg0 * 6));
                this.field3287.method245(0, -10181, class202.field3635, 6);
                while (var10 < arg1) {
                    int var12 = 0;
                    if (arg2) {
                        label108: {
                            this.field3288.method243(true, (long) (var7 * 520));
                            try {
                                this.field3288.method249(0, 8, class202.field3635, 0);
                            } catch (EOFException var33) {
                                return true;
                            }
                            var12 = (class202.field3635[6] & 0xFF) + ((class202.field3635[4] & 0xFF) << 16) + (class202.field3635[5] & 0xFF << 8);
                            int var13 = ((class202.field3635[0] & 0xFF) << 8) + (class202.field3635[1] & 0xFF);
                            int var14 = (class202.field3635[2] & 0xFF << 8) + (class202.field3635[3] & 0xFF);
                            int var15 = class202.field3635[7] & 0xFF;
                            if (arg0 == var13 && var11 == var14 && this.field3292 == var15) {
                                if (var12 >= 0 && ((long) var12) <= (this.field3288.method244(7433) / 520L)) {
                                    break label108;
                                }
                                return false;
                            }
                            return false;
                        }
                    }
                    if (var12 == 0) {
                        arg2 = false;
                        var12 = (int) ((this.field3288.method244(7433) + 519L) / 520L);
                        if (var12 == 0) {
                            var12++;
                        }
                        if (var7 == var12) {
                            var12++;
                        }
                    }
                    class202.field3635[7] = (byte) this.field3292;
                    class202.field3635[1] = (byte) arg0;
                    class202.field3635[3] = (byte) var11;
                    class202.field3635[0] = (byte) (arg0 >> 8);
                    class202.field3635[2] = (byte) (var11 >> 8);
                    var11++;
                    int var18 = arg1 - var10;
                    if ((arg1 - var10) <= 512) {
                        var12 = 0;
                    }
                    class202.field3635[5] = (byte) (var12 >> 8);
                    class202.field3635[6] = (byte) var12;
                    class202.field3635[4] = (byte) (var12 >> 16);
                    this.field3288.method243(true, (long) (var7 * 520));
                    if (var18 > 512) {
                        var18 = 512;
                    }
                    this.field3288.method245(0, -10181, class202.field3635, 8);
                    this.field3288.method245(var10, -10181, arg4, var18);
                    var10 += var18;
                    var7 = var12;
                }
                return true;
            } catch (IOException var34) {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(I)V")
    public static final void method1246(int arg0) {
        field3300++;
        int[] var1 = new int[class199.field3560];
        if (arg0 < 110) {
            return;
        }
        int var2 = 0;
        for (int var3 = 0; var3 < class199.field3560; var3++) {
            class82 var5 = class249.method1728(var3, true);
            if (var5.field1636 >= 0 || var5.field1608 >= 0) {
                var1[var2++] = var3;
            }
        }
        class223.field4075 = new int[var2];
        for (int var4 = 0; var4 < var2; var4++) {
            class223.field4075[var4] = var1[var4];
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)[B")
    public final byte[] method1247(int arg0, int arg1) {
        field3290++;
        class30 var3 = this.field3288;
        synchronized (this.field3288) {
            try {
                if (this.field3287.method244(7433) < ((long) (arg1 * 6 + 6))) {
                    return null;
                }
                this.field3287.method243(true, (long) (arg1 * 6));
                this.field3287.method249(0, 6, class202.field3635, 0);
                int var5 = (class202.field3635[0] & 0xFF << 16) + (class202.field3635[1] & 0xFF << 8) + (class202.field3635[2] & 0xFF);
                int var6 = ((class202.field3635[3] & 0xFF) << 16) + (class202.field3635[4] & 0xFF << 8) + (class202.field3635[5] & 0xFF);
                if (arg0 != 44) {
                    this.method1243(-95, 13, -105, (byte[]) null);
                }
                if (var5 < 0 || var5 > this.field3296) {
                    return null;
                } else if (var6 > 0 && (this.field3288.method244(7433) / 520L) >= ((long) var6)) {
                    int var9 = 0;
                    byte[] var10 = new byte[var5];
                    int var11 = 0;
                    while (var5 > var9) {
                        if (var6 == 0) {
                            return null;
                        }
                        this.field3288.method243(true, (long) (var6 * 520));
                        int var13 = var5 - var9;
                        if (var13 > 512) {
                            var13 = 512;
                        }
                        this.field3288.method249(arg0 ^ 0x2C, var13 + 8, class202.field3635, 0);
                        int var14 = (class202.field3635[0] & 0xFF << 8) + (class202.field3635[1] & 0xFF);
                        int var15 = (class202.field3635[2] & 0xFF << 8) + (class202.field3635[3] & 0xFF);
                        int var16 = (class202.field3635[6] & 0xFF) + ((class202.field3635[5] & 0xFF) << 8) + ((class202.field3635[4] & 0xFF) << 16);
                        int var17 = class202.field3635[7] & 0xFF;
                        if (arg1 == var14 && var11 == var15 && this.field3292 == var17) {
                            if (var16 >= 0 && (long) var16 <= this.field3288.method244(7433) / 520L) {
                                var6 = var16;
                                for (int var20 = 0; var20 < var13; var20++) {
                                    var10[var9++] = class202.field3635[var20 + 8];
                                }
                                var11++;
                                continue;
                            }
                            return null;
                        }
                        return null;
                    }
                    return var10;
                } else {
                    return null;
                }
            } catch (IOException var39) {
                return null;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(B)V")
    public static void method1248(byte arg0) {
        if (arg0 > -86) {
            method1246(-28);
        }
        field3291 = null;
        field3301 = null;
        field3294 = null;
        field3297 = null;
        field3302 = null;
        field3293 = null;
        field3298 = null;
        field3289 = null;
        field3303 = null;
        field3299 = null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(ILha;Lha;I)V")
    public class182(int arg0, class30 arg1, class30 arg2, int arg3) {
        this.field3287 = arg2;
        this.field3292 = arg0;
        this.field3296 = arg3;
        this.field3288 = arg1;
    }
}
