import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qk")
public class class65 implements class154 {

    @OriginalMember(owner = "client!qk", name = "m", descriptor = "Lgi;")
    private class109 field944 = new class109(256);

    @OriginalMember(owner = "client!qk", name = "i", descriptor = "Lak;")
    private class172 field940;

    @OriginalMember(owner = "client!qk", name = "d", descriptor = "Lak;")
    private class172 field935;

    @OriginalMember(owner = "client!qk", name = "g", descriptor = "[Lrn;")
    private class18[] field938;

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "[I")
    public static int[] field932 = new int[14];

    @OriginalMember(owner = "client!qk", name = "f", descriptor = "I")
    public static int field937 = 0;

    @OriginalMember(owner = "client!qk", name = "n", descriptor = "[J")
    public static long[] field945 = new long[100];

    @OriginalMember(owner = "client!qk", name = "l", descriptor = "[J")
    public static long[] field943 = new long[32];

    @OriginalMember(owner = "client!qk", name = "b", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!qk", name = "c", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!qk", name = "h", descriptor = "I")
    public static int field939;

    @OriginalMember(owner = "client!qk", name = "k", descriptor = "I")
    public static int field942;

    @OriginalMember(owner = "client!qk", name = "o", descriptor = "I")
    public static int field946;

    @OriginalMember(owner = "client!qk", name = "j", descriptor = "Lak;")
    public static class172 field941;

    @OriginalMember(owner = "client!qk", name = "e", descriptor = "(ZI)Lpk;", line = 6)
    public class25 method434(boolean arg0, int arg1) {
        class8 var3 = this.field944.method755((long) arg1, arg0);
        field946++;
        if (var3 != null) {
            return (class25) var3;
        }
        byte[] var4 = this.field935.method1292(arg0, arg1);
        if (var4 == null) {
            return null;
        } else {
            class25 var5 = new class25(new class44(var4));
            this.field944.method750(var5, (long) arg1, -18339);
            return var5;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(II)Z", line = 35)
    public final boolean method435(int arg0, int arg1) {
        class25 var3 = this.method434(false, arg0);
        if (arg1 != 2048) {
            this.method437((byte) 89, 68);
        }
        field936++;
        return var3 != null && var3.method148(-116, this.field940, this);
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(B)V", line = 47)
    public static void method436(byte arg0) {
        if (arg0 != -34) {
            method436((byte) -82);
        }
        field932 = null;
        field945 = null;
        field941 = null;
        field943 = null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(BI)Lrn;", line = 64)
    public final class18 method437(byte arg0, int arg1) {
        field939++;
        return arg0 == 75 ? this.field938[arg1] : (class18) null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(I)V", line = 83)
    public static final void method438(int arg0) {
        field934++;
        int var1 = class89.field1235 * 128 + 64;
        int var2 = class196.field3198 * 128 + 64;
        int var3 = class123.method889(1, class49.field698, var1, var2) - class205.field3368;
        if (arg0 > -18) {
            return;
        }
        if (class198.field3231 >= 100) {
            class260.field4150 = class196.field3198 * 128 + 64;
            class120.field1825 = class89.field1235 * 128 + 64;
            class83.field1173 = class123.method889(1, class49.field698, class120.field1825, class260.field4150) - class205.field3368;
        } else {
            if (var3 > class83.field1173) {
                class83.field1173 += (var3 - class83.field1173) * class198.field3231 / 1000 + class200.field3257;
                if (class83.field1173 > var3) {
                    class83.field1173 = var3;
                }
            }
            if (class120.field1825 < var1) {
                class120.field1825 += class200.field3257 + ((var1 - class120.field1825) * class198.field3231 / 1000);
                if (var1 < class120.field1825) {
                    class120.field1825 = var1;
                }
            }
            if (var1 < class120.field1825) {
                class120.field1825 -= (class120.field1825 - var1) * class198.field3231 / 1000 + class200.field3257;
                if (var1 > class120.field1825) {
                    class120.field1825 = var1;
                }
            }
            if (var3 < class83.field1173) {
                class83.field1173 -= (class83.field1173 - var3) * class198.field3231 / 1000 + class200.field3257;
                if (var3 > class83.field1173) {
                    class83.field1173 = var3;
                }
            }
            if (var2 > class260.field4150) {
                class260.field4150 += (var2 - class260.field4150) * class198.field3231 / 1000 + class200.field3257;
                if (var2 < class260.field4150) {
                    class260.field4150 = var2;
                }
            }
            if (var2 < class260.field4150) {
                class260.field4150 -= (class260.field4150 - var2) * class198.field3231 / 1000 + class200.field3257;
                if (var2 > class260.field4150) {
                    class260.field4150 = var2;
                }
            }
        }
        int var4 = class167.field2763 * 128 + 64;
        int var5 = class309.field4814 * 128 + 64;
        int var6 = class123.method889(1, class49.field698, var5, var4) - class111.field1655;
        int var7 = var6 - class83.field1173;
        int var8 = var4 - class260.field4150;
        int var9 = var5 - class120.field1825;
        int var10 = (int) Math.sqrt((double) (var9 * var9 + (var8 * var8)));
        int var11 = (int) (Math.atan2((double) var7, (double) var10) * 325.949D) & 0x7FF;
        if (var11 < 128) {
            var11 = 128;
        }
        if (var11 > 383) {
            var11 = 383;
        }
        int var12 = (int) (Math.atan2((double) var9, (double) var8) * -325.949D) & 0x7FF;
        if (class74.field1036 < var11) {
            class74.field1036 += (var11 - class74.field1036) * class81.field1127 / 1000 + class150.field2326;
            if (var11 < class74.field1036) {
                class74.field1036 = var11;
            }
        }
        int var13 = var12 - class186.field3076;
        if (class74.field1036 > var11) {
            class74.field1036 -= class150.field2326 + ((class74.field1036 - var11) * class81.field1127 / 1000);
            if (var11 > class74.field1036) {
                class74.field1036 = var11;
            }
        }
        if (var13 > 1024) {
            var13 -= 2048;
        }
        if (var13 < -1024) {
            var13 += 2048;
        }
        if (var13 > 0) {
            class186.field3076 += class150.field2326 + (class81.field1127 * var13 / 1000);
            class186.field3076 &= 0x7FF;
        }
        if (var13 < 0) {
            class186.field3076 -= -var13 * class81.field1127 / 1000 + class150.field2326;
            class186.field3076 &= 0x7FF;
        }
        int var14 = var12 - class186.field3076;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 < 0 && var13 > 0 || var14 > 0 && var13 < 0) {
            class186.field3076 = var12;
        }
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(IIZIIF)[I", line = 239)
    public final int[] method439(int arg0, int arg1, boolean arg2, int arg3, int arg4, float arg5) {
        field933++;
        return arg0 == 1000 ? this.method434(false, arg4).method147(this.field938[arg4].field239, this.field940, arg1, (double) arg5, arg3, this, arg2, true) : (int[]) null;
    }

    @OriginalMember(owner = "client!qk", name = "a", descriptor = "(Z)V", line = 253)
    public static final void method440(boolean arg0) {
        field942++;
        if (class8.field124) {
            return;
        }
        if (class57.field803) {
            class330.field5090 = (float) ((int) class330.field5090 + 191 & 0xFFFFFF80);
        } else {
            class64.field931 += (24.0F - class64.field931) / 2.0F;
        }
        class33.field444 = true;
        class8.field124 = arg0;
    }

    @OriginalMember(owner = "client!qk", name = "<init>", descriptor = "(Lak;Lak;Lak;)V", line = 285)
    public class65(class172 arg0, class172 arg1, class172 arg2) {
        this.field940 = arg2;
        this.field935 = arg1;
        class44 var4 = new class44(arg0.method1287(0, 0, -1));
        int var5 = var4.method271(21081);
        this.field938 = new class18[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method286((byte) -97) == 1) {
                this.field938[var6] = new class18();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field938[var7] != null) {
                this.field938[var7].field245 = var4.method286((byte) -126) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field938[var8] != null) {
                this.field938[var8].field241 = var4.method286((byte) -69) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field938[var9] != null) {
                this.field938[var9].field253 = var4.method286((byte) -127) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field938[var10] != null) {
                this.field938[var10].field240 = var4.method286((byte) -93) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field938[var11] != null) {
                this.field938[var11].field247 = var4.method246((byte) -111);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field938[var12] != null) {
                this.field938[var12].field243 = var4.method246((byte) -112);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field938[var13] != null) {
                this.field938[var13].field251 = var4.method246((byte) -9);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field938[var14] != null) {
                this.field938[var14].field242 = var4.method246((byte) -6);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field938[var15] != null) {
                this.field938[var15].field248 = (short) var4.method271(21081);
            }
        }
        if (var4.field586 < var4.field573.length) {
            for (int var16 = 0; var16 < var5; var16++) {
                if (this.field938[var16] != null) {
                    var4.method246((byte) -75);
                }
            }
            for (int var17 = 0; var17 < var5; var17++) {
                if (this.field938[var17] != null) {
                    var4.method246((byte) -34);
                }
            }
            for (int var18 = 0; var18 < var5; var18++) {
                if (this.field938[var18] != null) {
                    var4.method286((byte) -127);
                }
            }
            for (int var19 = 0; var19 < var5; var19++) {
                if (this.field938[var19] != null) {
                    this.field938[var19].field239 = var4.method286((byte) -78) == 1;
                }
            }
            for (int var20 = 0; var20 < var5; var20++) {
                if (this.field938[var20] != null) {
                    var4.method246((byte) -41);
                }
            }
            for (int var21 = 0; var21 < var5; var21++) {
                if (this.field938[var21] != null) {
                    var4.method286((byte) -109);
                }
            }
            for (int var22 = 0; var22 < var5; var22++) {
                if (this.field938[var22] != null) {
                    var4.method286((byte) -88);
                }
            }
            for (int var23 = 0; var23 < var5; var23++) {
                if (this.field938[var23] != null) {
                    var4.method286((byte) -73);
                }
            }
        }
    }
}
