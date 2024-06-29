import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class46 {

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field556 = "Use";

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field553;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field558;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field560;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field561;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field563;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Ljj;")
    public static class134 field554;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "Ljj;")
    public static class134 field555;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Ljj;")
    public static class134 field557;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "Lvg;")
    public static class237 field562;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "[[[I")
    public static int[][][] field559;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)Lt;")
    public static final class228 method355(boolean arg0) {
        field561++;
        try {
            if (!arg0) {
                field556 = null;
            }
            return (class228) Class.forName("pa").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            return new class211();
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;BC)[Ljava/lang/String;")
    public static final String[] method356(String arg0, byte arg1, char arg2) {
        field558++;
        int var3 = class242.method1594(119, arg0, arg2);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        if (arg1 > -38) {
            field562 = null;
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var3; var7++) {
            int var8;
            for (var8 = var6; arg0.charAt(var8) != arg2; var8++) {
            }
            var4[var5++] = arg0.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg0.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
    public static final void method357(int arg0, int arg1, int arg2, int arg3) {
        field560++;
        class283 var4 = method360(9, -127, arg3);
        var4.method1893(arg0 ^ arg0);
        var4.field4528 = arg2;
        var4.field4527 = arg1;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static void method358(byte arg0) {
        field555 = null;
        field559 = null;
        field557 = null;
        field562 = null;
        if (arg0 > -127) {
            field557 = null;
        }
        field554 = null;
        field556 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(CZ)Z")
    public static final boolean method359(char arg0, boolean arg1) {
        field563++;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg0 >= ' ' && arg0 <= 'ÿ') {
            return true;
        } else if (arg0 == '€' || arg0 == 'Œ' || arg0 == '—' || arg0 == 'œ' || arg0 == 'Ÿ') {
            return true;
        } else {
            if (!arg1) {
                field554 = null;
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)Lak;")
    public static final class283 method360(int arg0, int arg1, int arg2) {
        field553++;
        class283 var3 = (class283) class215.field3461.method457((long) arg2 | (long) arg0 << 32, (byte) -115);
        if (var3 == null) {
            var3 = new class283(arg0, arg2);
            class215.field3461.method466(var3.field962, var3, (byte) 93);
        }
        if (arg1 > -65) {
            field555 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ILhi;)V")
    public static final void method361(int arg0, class264 arg1) {
        field564++;
        while (true) {
            while (arg1.field4198.length > arg1.field4195) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1779(-84) == 1) {
                    var2 = true;
                    var3 = arg1.method1779(-52);
                    var4 = arg1.method1779(-65);
                }
                int var5 = arg1.method1779(-54);
                int var6 = arg1.method1779(-114);
                int var7 = var5 * 64 - class129.field2149;
                int var8 = class73.field1002 + class225.field3569 - (var6 * 64) - 1;
                if (var7 >= 0 && var8 - 63 >= 0 && (var7 + 63) < class183.field2927 && class225.field3569 > var8) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var3 * 8 <= var11 && var3 * 8 + 8 > var11 && var4 * 8 <= var12 && var12 < var4 * 8 + 8) {
                                byte var13 = arg1.method1767(arg0 ^ 0x7752DEA6);
                                if (var13 != 0) {
                                    if (class25.field308[var9][var10] == null) {
                                        class25.field308[var9][var10] = new byte[4096];
                                    }
                                    class25.field308[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg1.method1767(16711680);
                                    if (class189.field3022[var9][var10] == null) {
                                        class189.field3022[var9][var10] = new byte[4096];
                                    }
                                    class189.field3022[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg1.method1767(16711680);
                        if (var16 != 0) {
                            arg1.field4195++;
                        }
                    }
                }
            }
            if (arg0 != 2007883430) {
                field562 = null;
                return;
            }
            return;
        }
    }
}
