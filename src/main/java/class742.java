import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class742 {

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public int field10366 = 2048;

    @OriginalMember(owner = "client!pn", name = "g", descriptor = "I")
    public int field10371 = 0;

    @OriginalMember(owner = "client!pn", name = "e", descriptor = "I")
    public int field10369 = 2048;

    @OriginalMember(owner = "client!pn", name = "i", descriptor = "I")
    public int field10373 = 0;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "[I")
    public static int[] field10365 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field10367;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field10368;

    @OriginalMember(owner = "client!pn", name = "f", descriptor = "I")
    public static int field10370;

    @OriginalMember(owner = "client!pn", name = "h", descriptor = "I")
    public static int field10372;

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILig;)V")
    public final void method4130(int arg0, class244 arg1) {
        field10368++;
        while (true) {
            int var3 = arg1.method1423(-69);
            if (var3 == 0) {
                if (arg0 == -1) {
                    return;
                } else {
                    this.field10373 = -84;
                    return;
                }
            }
            this.method4134(1, arg1, var3);
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(CBI)I")
    public static final int method4131(char arg0, byte arg1, int arg2) {
        field10372++;
        int var3 = arg0 << 4;
        if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
            char var4 = Character.toLowerCase(arg0);
            var3 = (var4 << 4) + 1;
        }
        if (arg1 > -4) {
            method4131((char) 65459, (byte) 102, 118);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(I)V")
    public static void method4132(int arg0) {
        if (arg0 != 4) {
            field10365 = null;
        }
        field10365 = null;
    }

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "(I)V")
    public static final void method4133(int arg0) {
        field10367++;
        if (class654.field9334.field9834.method549(31) != 2) {
            return;
        }
        byte var1 = (byte) (class188.field2231 - 4 & 0xFF);
        int var2 = class188.field2231 % class489.field6976;
        if (arg0 != -1) {
            method4133(51);
        }
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var18 = 0; var18 < class153.field1677; var18++) {
                class637.field9155[var3][var2][var18] = var1;
            }
        }
        if (class122.field1278 == 3) {
            return;
        }
        for (int var4 = 0; var4 < 2; var4++) {
            class11.field91[var4] = -1000000;
            class169.field1892[var4] = 1000000;
            class368.field4706[var4] = 0;
            class200.field2371[var4] = 1000000;
            class219.field2538[var4] = 0;
        }
        int var5 = class90.field937.field4635;
        int var6 = class90.field937.field4629;
        if (class496.field7014 != 1 && class16.field147 == -1) {
            int var7 = class676.method3845(class590.field8319, class167.field1855, ~arg0, class122.field1278);
            if ((var7 - class204.field2409) < 3200 && (class100.field1043[class122.field1278][class167.field1855 >> 9][class590.field8319 >> 9] & 0x4) != 0) {
                class607.method3443(class638.field9170, 1, false, class590.field8319 >> 9, (byte) -107, class167.field1855 >> 9);
                return;
            }
            return;
        }
        if (class496.field7014 != 1) {
            var5 = class16.field147;
            var6 = class406.field5556;
        }
        if ((class100.field1043[class122.field1278][var5 >> 9][var6 >> 9] & 0x4) != 0) {
            class607.method3443(class638.field9170, 0, false, var6 >> 9, (byte) -1, var5 >> 9);
        }
        if (class27.field281 >= 2560) {
            return;
        }
        int var8 = class167.field1855 >> 9;
        int var9 = class590.field8319 >> 9;
        int var10 = var5 >> 9;
        int var11 = var6 >> 9;
        int var12;
        if (var8 >= var10) {
            var12 = var8 - var10;
        } else {
            var12 = var10 - var8;
        }
        int var13;
        if (var9 < var11) {
            var13 = var11 - var9;
        } else {
            var13 = var9 - var11;
        }
        if (var12 == 0 && var13 == 0 || var12 <= -class489.field6976 || class489.field6976 <= var12 || -class153.field1677 >= var13 || class153.field1677 <= var13) {
            class151.method936("RC: " + var8 + "," + var9 + " " + var10 + "," + var11 + " " + class464.field6624 + "," + class181.field2144, null, arg0 ^ 0xFFFFFF9E);
            return;
        }
        if (var13 >= var12) {
            int var14 = var12 * 65536 / var13;
            int var15 = 32768;
            while (var9 != var11) {
                if (var11 > var9) {
                    var9++;
                } else if (var9 > var11) {
                    var9--;
                }
                if ((class100.field1043[class122.field1278][var8][var9] & 0x4) != 0) {
                    class607.method3443(class638.field9170, 1, false, var9, (byte) -118, var8);
                    return;
                }
                var15 += var14;
                if (var15 >= 65536) {
                    var15 -= 65536;
                    if (var10 > var8) {
                        var8++;
                    } else if (var10 < var8) {
                        var8--;
                    }
                    if ((class100.field1043[class122.field1278][var8][var9] & 0x4) != 0) {
                        class607.method3443(class638.field9170, 1, false, var9, (byte) -128, var8);
                        return;
                    }
                }
            }
            return;
        }
        int var16 = var13 * 65536 / var12;
        int var17 = 32768;
        while (var8 != var10) {
            if (var8 < var10) {
                var8++;
            } else if (var10 < var8) {
                var8--;
            }
            if ((class100.field1043[class122.field1278][var8][var9] & 0x4) != 0) {
                class607.method3443(class638.field9170, 1, false, var9, (byte) -11, var8);
                return;
            }
            var17 += var16;
            if (var17 >= 65536) {
                if (var11 > var9) {
                    var9++;
                } else if (var9 > var11) {
                    var9--;
                }
                var17 -= 65536;
                if ((class100.field1043[class122.field1278][var8][var9] & 0x4) != 0) {
                    class607.method3443(class638.field9170, 1, false, var9, (byte) -106, var8);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(ILig;I)V")
    private final void method4134(int arg0, class244 arg1, int arg2) {
        field10370++;
        if (arg0 == arg2) {
            this.field10371 = arg1.method1423(-43);
        } else if (arg2 == 2) {
            this.field10369 = arg1.method1476(-74);
        } else if (arg2 == 3) {
            this.field10366 = arg1.method1476(-117);
        } else if (arg2 == 4) {
            this.field10373 = arg1.method1466((byte) 31);
            return;
        }
    }
}
