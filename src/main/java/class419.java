import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class419 implements class308 {

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "Lsh;")
    public static class472 field6023 = new class472(47, 5);

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "[I")
    public static int[] field6024;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "Z")
    public static boolean field6026;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "Lct;")
    public static class285 field6025;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public int field6010;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public static int field6011;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field6012;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public static int field6013;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public int field6014;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public static int field6015;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public int field6016;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public int field6017;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public int field6018;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field6020;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "I")
    public int field6021;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public static int field6022;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "Z")
    public boolean field6019;

    static {
        new class332("Close", "Bitte schließ die momentan geöffnete Benutzeroberfläche,", "Fermez l'interface que vous avez ouverte avant d'utiliser le bouton « Signaler un abus ».", "Feche a interface aberta antes de usar o recurso \"Denunciar abuso\".");
        field6024 = new int[50];
        field6026 = false;
        field6025 = new class285(50, -1);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(BII)V", line = 4)
    public static final void method2484(byte arg0, int arg1, int arg2) {
        field6012++;
        if (class77.field1088 == class124.field1710) {
            if (class433.method2534(arg1, (byte) 29, 1, 1, arg2, 0, -2, 0, false)) {
                return;
            }
            class433.method2534(arg1, (byte) -119, 1, 1, arg2, 0, -3, 0, false);
        } else if (class433.method2534(arg1, (byte) 67, 1, 1, arg2, 0, -3, 0, false)) {
            return;
        } else {
            class433.method2534(arg1, (byte) -119, 1, 1, arg2, 0, -2, 0, false);
        }
        int var3 = -50 % ((-arg0 - 10) / 42);
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)J", line = 31)
    public final long method1913(int arg0) {
        field6013++;
        long[] var2 = class82.field1154;
        long var3 = -1L;
        long var5 = var2[(int) ((var3 ^ (long) this.field6021) & 0xFFL)] ^ var3 >>> 8;
        if (arg0 != 27314) {
            return 104L;
        }
        long var7 = var2[(int) (((long) (this.field6016 >> 8) ^ var5) & 0xFFL)] ^ var5 >>> 8;
        long var9 = var7 >>> 8 ^ var2[(int) ((var7 ^ (long) this.field6016) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var2[(int) (((long) (this.field6014 >> 24) ^ var9) & 0xFFL)];
        long var13 = var11 >>> 8 ^ var2[(int) (((long) (this.field6014 >> 16) ^ var11) & 0xFFL)];
        long var15 = var2[(int) (((long) (this.field6014 >> 8) ^ var13) & 0xFFL)] ^ var13 >>> 8;
        long var17 = var2[(int) (((long) this.field6014 ^ var15) & 0xFFL)] ^ var15 >>> 8;
        long var19 = var2[(int) ((var17 ^ (long) this.field6017) & 0xFFL)] ^ var17 >>> 8;
        long var21 = var2[(int) (((long) (this.field6018 >> 24) ^ var19) & 0xFFL)] ^ var19 >>> 8;
        long var23 = var2[(int) ((var21 ^ (long) (this.field6018 >> 16)) & 0xFFL)] ^ var21 >>> 8;
        long var25 = var2[(int) ((var23 ^ (long) (this.field6018 >> 8)) & 0xFFL)] ^ var23 >>> 8;
        long var27 = var2[(int) ((var25 ^ (long) this.field6018) & 0xFFL)] ^ var25 >>> 8;
        long var29 = var2[(int) (((long) this.field6010 ^ var27) & 0xFFL)] ^ var27 >>> 8;
        return var29 >>> 8 ^ var2[(int) (((long) (this.field6019 ? 1 : 0) ^ var29) & 0xFFL)];
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V", line = 60)
    public static void method2485(int arg0) {
        field6023 = null;
        field6024 = null;
        field6025 = null;
        if (arg0 >= -13) {
            field6025 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(B)[Lv;", line = 85)
    public static final class426[] method2486(byte arg0) {
        int var1 = -66 % ((13 - arg0) / 63);
        if (class156.field2176 == null) {
            class426[] var2 = class295.method1852(class21.field261, 1467792898);
            class426[] var3 = new class426[var2.length];
            int var4 = 0;
            label63: for (int var5 = 0; var5 < var2.length; var5++) {
                class426 var9 = var2[var5];
                if ((var9.field6089 <= 0 || var9.field6089 >= 24) && var9.field6085 >= 800 && var9.field6088 >= 600 && (class45.field646 >= 96 || class170.field2424 != 0 || var9.field6085 <= 1024 && var9.field6088 <= 768)) {
                    for (int var10 = 0; var10 < var4; var10++) {
                        class426 var11 = var3[var10];
                        if (var9.field6085 == var11.field6085 && var9.field6088 == var11.field6088) {
                            if (var11.field6089 < var9.field6089) {
                                var3[var10] = var9;
                            }
                            continue label63;
                        }
                    }
                    var3[var4] = var9;
                    var4++;
                }
            }
            class156.field2176 = new class426[var4];
            class149.method1008(var3, 0, class156.field2176, 0, var4);
            int[] var6 = new int[class156.field2176.length];
            for (int var7 = 0; var7 < class156.field2176.length; var7++) {
                class426 var8 = class156.field2176[var7];
                var6[var7] = var8.field6088 * var8.field6085;
            }
            class255.method1683(var6, (byte) 106, class156.field2176);
        }
        field6015++;
        return class156.field2176;
    }

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(B)I", line = 168)
    public static final int method2487(byte arg0) {
        field6011++;
        if (arg0 >= -35) {
            method2486((byte) 21);
        }
        if (class123.field1698 == null) {
            return class106.field1486 ? 2 : 1;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILvk;)Z", line = 184)
    public final boolean method1914(int arg0, class308 arg1) {
        field6020++;
        if (!(arg1 instanceof class419)) {
            return false;
        }
        class419 var3 = (class419) arg1;
        if (this.field6021 != var3.field6021) {
            return false;
        } else if (this.field6016 != var3.field6016) {
            return false;
        } else if (this.field6014 != var3.field6014) {
            return false;
        } else if (this.field6017 != var3.field6017) {
            return false;
        } else if (this.field6018 != var3.field6018) {
            return false;
        } else if (arg0 >= -105) {
            return true;
        } else if (this.field6010 == var3.field6010) {
            return this.field6019 == var3.field6019;
        } else {
            return false;
        }
    }
}
