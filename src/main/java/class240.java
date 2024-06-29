import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class240 implements class19 {

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "[I")
    public static int[] field3491;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field3484;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public int field3485;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public int field3486;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "I")
    public static int field3487;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field3489;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field3490;

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "I")
    public int field3492;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public int field3493;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public int field3494;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "I")
    public int field3495;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public static int field3497;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "Z")
    public boolean field3488;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Z")
    public static boolean field3496;

    static {
        new class180("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field3491 = new int[256];
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3491[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIII)V", line = 15)
    public static final void method1555(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != 41065288) {
            field3496 = false;
        }
        class86.field1436.method1892(397825512, arg1);
        field3497++;
        class86.field1436.method1865(arg0, 0);
        class86.field1436.method1875(arg2, (byte) -91);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Lqo;I)Z", line = 31)
    public final boolean method169(class19 arg0, int arg1) {
        field3490++;
        if (!(arg0 instanceof class240)) {
            return false;
        }
        class240 var3 = (class240) arg0;
        if (this.field3486 != var3.field3486) {
            return false;
        }
        if (arg1 != -13694) {
            this.method169(null, 73);
        }
        if (this.field3485 != var3.field3485) {
            return false;
        } else if (this.field3493 != var3.field3493) {
            return false;
        } else if (this.field3494 != var3.field3494) {
            return false;
        } else if (this.field3492 != var3.field3492) {
            return false;
        } else if (this.field3495 == var3.field3495) {
            return var3.field3488 == this.field3488;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 76)
    public static void method1556(byte arg0) {
        if (arg0 > 91) {
            field3491 = null;
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(IIII)Lir;", line = 86)
    public static final class22 method1557(int arg0, int arg1, int arg2, int arg3) {
        field3484++;
        if (arg1 != -825703416) {
            return null;
        }
        class165 var4 = class36.field545[arg3][arg2][arg0];
        if (var4 == null) {
            return null;
        }
        class22 var5 = null;
        int var6 = -1;
        for (class525 var7 = var4.field2490; var7 != null; var7 = var7.field7716) {
            class370 var8 = var7.field7711;
            if (var8 instanceof class22) {
                class22 var9 = (class22) var8;
                int var10 = var9.method184(1) * 64 + 60 - 64;
                int var11 = var9.field5529 - var10 >> 7;
                int var12 = var9.field5539 - var10 >> 7;
                int var13 = var9.field5529 + var10 >> 7;
                int var14 = var9.field5539 + var10 >> 7;
                if (var11 <= arg2 && arg0 >= var12 && var13 >= arg2 && var14 >= arg0) {
                    int var15 = (var14 + 1 - arg0) * (var13 + 1 - arg2);
                    if (var15 > var6) {
                        var6 = var15;
                        var5 = var9;
                    }
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)J", line = 146)
    public final long method170(int arg0) {
        field3489++;
        long[] var2 = class81.field1339;
        long var3 = -1L;
        long var5 = var2[(int) (((long) this.field3486 ^ var3) & 0xFFL)] ^ var3 >>> 8;
        long var7 = var5 >>> 8 ^ var2[(int) (((long) (this.field3485 >> 8) ^ var5) & 0xFFL)];
        long var9 = var7 >>> 8 ^ var2[(int) (((long) this.field3485 ^ var7) & 0xFFL)];
        long var11 = var2[(int) (((long) (this.field3493 >> 24) ^ var9) & 0xFFL)] ^ var9 >>> 8;
        long var13 = var11 >>> 8 ^ var2[(int) ((var11 ^ (long) (this.field3493 >> 16)) & 0xFFL)];
        long var15 = var13 >>> 8 ^ var2[(int) (((long) (this.field3493 >> 8) ^ var13) & 0xFFL)];
        long var17 = var2[(int) (((long) this.field3493 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var17 >>> 8 ^ var2[(int) (((long) this.field3494 ^ var17) & 0xFFL)];
        long var21 = var19 >>> 8 ^ var2[(int) ((var19 ^ (long) (this.field3492 >> 24)) & 0xFFL)];
        if (arg0 < 55) {
            method1556((byte) 84);
        }
        long var23 = var21 >>> 8 ^ var2[(int) ((var21 ^ (long) (this.field3492 >> 16)) & 0xFFL)];
        long var25 = var2[(int) ((var23 ^ (long) (this.field3492 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) ((var25 ^ (long) this.field3492) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) (((long) this.field3495 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) (((long) (this.field3488 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZII)V", line = 204)
    public static final void method1558(int arg0, boolean arg1, int arg2, int arg3) {
        field3487++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class364.field5480 = arg0;
        if (arg2 >= 11) {
            class275.field3991 = arg1;
            class471.field6941 = arg3;
        }
    }
}
