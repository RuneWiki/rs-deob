import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class407 {

    @OriginalMember(owner = "client!of", name = "j", descriptor = "[I")
    private int[] field5449 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!of", name = "n", descriptor = "Z")
    public static boolean field5453 = true;

    @OriginalMember(owner = "client!of", name = "h", descriptor = "Lhb;")
    public static class250 field5447 = new class250(32, -1);

    @OriginalMember(owner = "client!of", name = "p", descriptor = "I")
    public static int field5455 = 0;

    @OriginalMember(owner = "client!of", name = "r", descriptor = "Loi;")
    public static class169 field5457 = new class169("Allocating memory", "Speicher wird zugewiesen.", "Mémoire en cours d'attribution", "Alocando memória");

    @OriginalMember(owner = "client!of", name = "s", descriptor = "Ljd;")
    public static class408 field5458 = new class408(6, 0, 4, 2);

    @OriginalMember(owner = "client!of", name = "a", descriptor = "I")
    public static int field5440;

    @OriginalMember(owner = "client!of", name = "b", descriptor = "I")
    public static int field5441;

    @OriginalMember(owner = "client!of", name = "c", descriptor = "I")
    public static int field5442;

    @OriginalMember(owner = "client!of", name = "f", descriptor = "I")
    public static int field5445;

    @OriginalMember(owner = "client!of", name = "i", descriptor = "I")
    public static int field5448;

    @OriginalMember(owner = "client!of", name = "l", descriptor = "I")
    public static int field5451;

    @OriginalMember(owner = "client!of", name = "q", descriptor = "I")
    public static int field5456;

    @OriginalMember(owner = "client!of", name = "t", descriptor = "I")
    public static int field5459;

    @OriginalMember(owner = "client!of", name = "m", descriptor = "Lii;")
    public class389 field5452;

    @OriginalMember(owner = "client!of", name = "k", descriptor = "[I")
    private int[] field5450;

    @OriginalMember(owner = "client!of", name = "d", descriptor = "[S")
    private short[] field5443;

    @OriginalMember(owner = "client!of", name = "e", descriptor = "[S")
    private short[] field5444;

    @OriginalMember(owner = "client!of", name = "g", descriptor = "[S")
    private short[] field5446;

    @OriginalMember(owner = "client!of", name = "o", descriptor = "[S")
    private short[] field5454;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Luu;", line = 10)
    public final class420 method2412(int arg0) {
        field5441++;
        int var2 = 50 % ((arg0 - 42) / 50);
        class420[] var3 = new class420[5];
        int var4 = 0;
        class201 var5 = this.field5452.field5114;
        synchronized (this.field5452.field5114) {
            int var6 = 0;
            while (true) {
                if (var6 >= 5) {
                    break;
                }
                if (this.field5449[var6] != -1) {
                    var3[var4++] = class370.method2154(10481, this.field5449[var6], 0, this.field5452.field5114);
                }
                var6++;
            }
        }
        for (int var7 = 0; var7 < 5; var7++) {
            if (var3[var7] != null && var3[var7].field5593 < 13) {
                var3[var7].method2466(0, (byte) 99);
            }
        }
        class420 var8 = new class420(var3, var4);
        if (this.field5443 != null) {
            for (int var9 = 0; var9 < this.field5443.length; var9++) {
                var8.method2468(8, this.field5443[var9], this.field5446[var9]);
            }
        }
        if (this.field5454 != null) {
            for (int var10 = 0; var10 < this.field5454.length; var10++) {
                var8.method2467(false, this.field5444[var10], this.field5454[var10]);
            }
        }
        return var8;
    }

    @OriginalMember(owner = "client!of", name = "b", descriptor = "(I)Z", line = 77)
    public final boolean method2413(int arg0) {
        field5440++;
        if (this.field5450 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 > -42) {
            method2418(null, true, null, null);
        }
        class201 var3 = this.field5452.field5114;
        synchronized (this.field5452.field5114) {
            for (int var4 = 0; var4 < this.field5450.length; var4++) {
                if (!this.field5452.field5114.method1317(0, this.field5450[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(B)Luu;", line = 116)
    public final class420 method2414(byte arg0) {
        field5451++;
        if (this.field5450 == null) {
            return null;
        }
        class420[] var2 = new class420[this.field5450.length];
        class201 var3 = this.field5452.field5114;
        synchronized (this.field5452.field5114) {
            int var4 = 0;
            while (true) {
                if (this.field5450.length <= var4) {
                    if (arg0 != -1) {
                        method2418(null, true, null, null);
                    }
                    break;
                }
                var2[var4] = class370.method2154(class10.method73(arg0, -10482), this.field5450[var4], 0, this.field5452.field5114);
                var4++;
            }
        }
        for (int var5 = 0; var5 < this.field5450.length; var5++) {
            if (var2[var5].field5593 < 13) {
                var2[var5].method2466(0, (byte) 74);
            }
        }
        class420 var6;
        if (var2.length == 1) {
            var6 = var2[0];
        } else {
            var6 = new class420(var2, var2.length);
        }
        if (var6 == null) {
            return null;
        }
        if (this.field5443 != null) {
            for (int var7 = 0; var7 < this.field5443.length; var7++) {
                var6.method2468(arg0 + 9, this.field5443[var7], this.field5446[var7]);
            }
        }
        if (this.field5454 != null) {
            for (int var8 = 0; var8 < this.field5454.length; var8++) {
                var6.method2467(false, this.field5444[var8], this.field5454[var8]);
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lbt;B)V", line = 194)
    public final void method2415(class88 arg0, byte arg1) {
        field5448++;
        int var3 = -122 / ((arg1 + 59) / 35);
        while (true) {
            int var4 = arg0.method617(2);
            if (var4 == 0) {
                return;
            }
            this.method2417(arg0, -96, var4);
        }
    }

    @OriginalMember(owner = "client!of", name = "c", descriptor = "(I)Z", line = 220)
    public final boolean method2416(int arg0) {
        field5456++;
        boolean var2 = true;
        class201 var3 = this.field5452.field5114;
        synchronized (this.field5452.field5114) {
            for (int var4 = arg0; var4 < 5; var4++) {
                if (this.field5449[var4] != -1 && !this.field5452.field5114.method1317(0, this.field5449[var4], 0)) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lbt;II)V", line = 246)
    private final void method2417(class88 arg0, int arg1, int arg2) {
        if (arg1 > -85) {
            field5455 = -93;
        }
        field5445++;
        if (arg2 == 1) {
            arg0.method617(2);
        } else if (arg2 == 2) {
            int var4 = arg0.method617(2);
            this.field5450 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5450[var5] = arg0.method568((byte) 110);
            }
        } else if (arg2 != 3) {
            if (arg2 == 40) {
                int var6 = arg0.method617(2);
                this.field5446 = new short[var6];
                this.field5443 = new short[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field5443[var7] = (short) arg0.method568((byte) 110);
                    this.field5446[var7] = (short) arg0.method568((byte) 110);
                }
            } else if (arg2 == 41) {
                int var8 = arg0.method617(2);
                this.field5444 = new short[var8];
                this.field5454 = new short[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field5454[var9] = (short) arg0.method568((byte) 110);
                    this.field5444[var9] = (short) arg0.method568((byte) 110);
                }
            } else if (arg2 >= 60 && arg2 < 70) {
                this.field5449[arg2 - 60] = arg0.method568((byte) 110);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Ltn;ZLqa;Lcc;)V", line = 327)
    public static final void method2418(class429 arg0, boolean arg1, class129 arg2, class343 arg3) {
        field5442++;
        class404 var4 = arg0.method2546(arg2, (byte) 92);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method375();
        if (var4.method378() > var5) {
            var5 = var4.method378();
        }
        byte var6 = 10;
        int var7 = arg3.field4364;
        int var8 = arg3.field4369;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg0.field5916 != null) {
            var9 = class113.field1553.method1710((byte) -41, null, null, arg0.field5916, class431.field5942);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class431.field5942[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class163.field2108.method2694(var13);
                if (var10 < var14) {
                    var10 = var14;
                }
            }
            var11 = class163.field2108.method2700() * var9 + (class163.field2108.method2698() / 2);
        }
        int var15 = arg3.field4364 + (var5 / 2);
        if (var7 < (class230.field2973 + var5)) {
            var7 = class230.field2973;
            var15 = var5 / 2 + var10 / 2 + class230.field2973 + var6 + 5;
        } else if ((class230.field2964 - var5) < var7) {
            var7 = class230.field2964 - var5;
            var15 = class230.field2964 - var5 / 2 - var6 - (var10 / 2) - 5;
        }
        int var16 = arg3.field4369;
        if ((class230.field2981 + var5) > var8) {
            var16 = class230.field2981 + (var5 / 2) + var6;
            var8 = class230.field2981;
        } else if (class230.field2977 - var5 < var8) {
            var16 = class230.field2977 - var5 / 2 - var6 - var11;
            var8 = class230.field2977 - var5;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg3.field4364), (double) (var8 - arg3.field4369)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method2403((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        if (!arg1) {
            method2418(null, true, null, null);
        }
        int var20 = -2;
        int var21 = -2;
        if (arg0.field5916 != null) {
            var18 = var15 - (var10 / 2 + 5);
            var19 = var16;
            var21 = var16 + var9 * class163.field2108.method2700() + 3;
            var20 = var18 - (-var10 - 10);
            if (arg0.field5887 != 0) {
                arg2.method866(var21 - var16, -5152, var18, var20 - var18, var16, arg0.field5887);
            }
            if (arg0.field5920 != 0) {
                arg2.method902(arg0.field5920, var16, var21 - var16, -var18 + var20, var18, 73);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class431.field5942[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class163.field2108.method2695(arg2, var23, var15, var16, arg0.field5894, true);
                var16 += class163.field2108.method2700();
            }
        }
        if (arg0.field5875 == -1 && arg0.field5916 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class36 var25 = new class36(arg3);
        var25.field557 = var7 - var24;
        var25.field551 = var8 - var24;
        var25.field559 = var8 + var24;
        var25.field564 = var18;
        var25.field565 = var21;
        var25.field550 = var7 + var24;
        var25.field560 = var19;
        var25.field563 = var20;
        class176.field2250.method42(var25, 0);
    }

    @OriginalMember(owner = "client!of", name = "d", descriptor = "(I)V", line = 476)
    public static void method2419(int arg0) {
        field5447 = null;
        field5457 = null;
        if (arg0 != 6) {
            field5457 = null;
        }
        field5458 = null;
    }
}
