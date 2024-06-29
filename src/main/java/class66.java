import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bn")
public class class66 {

    @OriginalMember(owner = "client!bn", name = "b", descriptor = "I")
    public static int field1123 = 0;

    @OriginalMember(owner = "client!bn", name = "e", descriptor = "Ljf;")
    public static class229 field1126 = class212.method1457((byte) 102, "Lade Titelbild )2 ");

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "I")
    public static int field1122 = 0;

    @OriginalMember(owner = "client!bn", name = "g", descriptor = "[Ljf;")
    public static class229[] field1128 = new class229[1000];

    @OriginalMember(owner = "client!bn", name = "h", descriptor = "Z")
    public static boolean field1129 = false;

    @OriginalMember(owner = "client!bn", name = "d", descriptor = "I")
    public static int field1125;

    @OriginalMember(owner = "client!bn", name = "f", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "client!bn", name = "i", descriptor = "I")
    public static int field1130;

    @OriginalMember(owner = "client!bn", name = "c", descriptor = "Lpm;")
    public static class103 field1124;

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Lkh;B)V", line = 9)
    public static final void method489(class14 arg0, byte arg1) {
        field1127++;
        if (arg1 >= -79) {
            field1123 = 58;
        }
        while (true) {
            while (arg0.field174.length > arg0.field195) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg0.method93(false) == 1) {
                    var3 = arg0.method93(false);
                    var4 = arg0.method93(false);
                    var2 = true;
                }
                int var5 = arg0.method93(false);
                int var6 = arg0.method93(false);
                int var7 = class254.field4432 + class127.field2269 - (var6 * 64) - 1;
                int var8 = var5 * 64 - class290.field4953;
                if (var8 >= 0 && (var7 - 63) >= 0 && class113.field2037 > var8 + 63 && class254.field4432 > var7) {
                    int var9 = var8 >> 6;
                    int var10 = var7 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && var11 < var3 * 8 + 8 && var12 >= var4 * 8 && var12 < var4 * 8 + 8) {
                                byte var13 = arg0.method98(true);
                                if (var13 != 0) {
                                    if (class144.field2517[var9][var10] == null) {
                                        class144.field2517[var9][var10] = new byte[4096];
                                    }
                                    class144.field2517[var9][var10][(63 - var12 << 6) + var11] = var13;
                                    byte var14 = arg0.method98(true);
                                    if (class82.field1515[var9][var10] == null) {
                                        class82.field1515[var9][var10] = new byte[4096];
                                    }
                                    class82.field1515[var9][var10][(63 - var12 << 6) + var11] = var14;
                                }
                            }
                        }
                    }
                } else {
                    for (int var15 = 0; var15 < (var2 ? 64 : 4096); var15++) {
                        byte var16 = arg0.method98(true);
                        if (var16 != 0) {
                            arg0.field195++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(ZB)V", line = 109)
    public static final void method490(boolean arg0, byte arg1) {
        if (arg1 != -11) {
            method491(true);
        }
        field1125++;
        byte[][] var2;
        byte var3;
        if (class108.field1900 && arg0) {
            var2 = class328.field5535;
            var3 = 1;
        } else {
            var2 = class117.field2089;
            var3 = 4;
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class18.method179((byte) 101);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class257.field4478[var4][var5][var6];
                    boolean var8 = false;
                    if (var7 != -1) {
                        int var9 = var7 >> 24 & 0x3;
                        if (!arg0 || var9 == 0) {
                            int var10 = var7 >> 1 & 0x3;
                            int var11 = var7 >> 3 & 0x7FF;
                            int var12 = (var7 & 0xFFFD49) >> 14;
                            int var13 = (var12 / 8 << 8) + var11 / 8;
                            for (int var14 = 0; var14 < class29.field511.length; var14++) {
                                if (class29.field511[var14] == var13 && var2[var14] != null) {
                                    var8 = true;
                                    class41.method355(arg0, var6 * 8, var9, var4, class80.field1460, (var12 & 0x7) * 8, var10, var2[var14], (byte) 32, (var11 & 0x7) * 8, var5 * 8);
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class39.method340(8, var6 * 8, 8, var4, var5 * 8, -121);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(Z)V", line = 205)
    public static void method491(boolean arg0) {
        field1128 = null;
        if (arg0) {
            method491(true);
        }
        field1124 = null;
        field1126 = null;
    }

    @OriginalMember(owner = "client!bn", name = "a", descriptor = "(II)Lti;", line = 231)
    public static final class224 method492(int arg0, int arg1) {
        field1130++;
        class224 var2 = (class224) class150.field2590.method229((long) arg1, -14);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class83.field1599.method1275(class146.method1011(32767, arg1), class45.method397(arg1, 2000), -5211);
        class224 var4 = new class224();
        var4.field3819 = arg1;
        if (arg0 != 8) {
            field1129 = true;
        }
        if (var3 != null) {
            var4.method1544(126, new class14(var3));
        }
        class150.field2590.method227(-25077, var4, (long) arg1);
        return var4;
    }
}
