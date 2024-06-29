import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sf")
public class class144 extends class311 {

    @OriginalMember(owner = "client!sf", name = "v", descriptor = "Lka;")
    public static class408 field2105 = new class408(64);

    @OriginalMember(owner = "client!sf", name = "p", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!sf", name = "q", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!sf", name = "r", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!sf", name = "s", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!sf", name = "u", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!sf", name = "y", descriptor = "Lea;")
    public static class58 field2108;

    @OriginalMember(owner = "client!sf", name = "w", descriptor = "Lwn;")
    public class77 field2106;

    @OriginalMember(owner = "client!sf", name = "t", descriptor = "Z")
    public boolean field2103;

    @OriginalMember(owner = "client!sf", name = "x", descriptor = "[I")
    public static int[] field2107;

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ILij;)V")
    public static final void method1042(int arg0, class316 arg1) {
        class156.field2224 = arg1.method1909(-1, "p11_full");
        field2102++;
        int var2 = 5 % ((-arg0 - 60) / 59);
        class366.field5083 = arg1.method1909(-1, "p12_full");
        class394.field5476 = arg1.method1909(-1, "b12_full");
        class192.field2768 = arg1.method1909(-1, "hitmarks");
        class120.field1821 = arg1.method1909(-1, "hitbar_default");
        class119.field1815 = arg1.method1909(-1, "timerbar_default");
        class404.field5594 = arg1.method1909(-1, "headicons_pk");
        class149.field2165 = arg1.method1909(-1, "headicons_prayer");
        class118.field1800 = arg1.method1909(-1, "hint_headicons");
        class373.field5169 = arg1.method1909(-1, "hint_mapmarkers");
        class339.field4595 = arg1.method1909(-1, "mapflag");
        class98.field1342 = arg1.method1909(-1, "cross");
        class25.field323 = arg1.method1909(-1, "mapdots");
        class442.field6216 = arg1.method1909(-1, "scrollbar");
        class341.field4603 = arg1.method1909(-1, "name_icons");
        class200.field2869 = arg1.method1909(-1, "floorshadows");
        class213.field2976 = arg1.method1909(-1, "compass");
        class237.field3377 = arg1.method1909(-1, "hint_mapedge");
    }

    @OriginalMember(owner = "client!sf", name = "c", descriptor = "(I)V")
    public static void method1043(int arg0) {
        if (arg0 != 0) {
            field2107 = null;
        }
        field2107 = null;
        field2105 = null;
        field2108 = null;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(ZLjava/lang/String;IB)I")
    public static final int method1044(boolean arg0, String arg1, int arg2, byte arg3) {
        field2104++;
        if (arg2 < 2 || arg2 > 36) {
            throw new IllegalArgumentException("Invalid radix:" + arg2);
        }
        boolean var4 = false;
        int var5 = -11 % ((10 - arg3) / 63);
        boolean var6 = false;
        int var7 = 0;
        int var8 = arg1.length();
        for (int var9 = 0; var9 < var8; var9++) {
            char var10 = arg1.charAt(var9);
            if (var9 == 0) {
                if (var10 == '-') {
                    var4 = true;
                    continue;
                }
                if (var10 == '+' && arg0) {
                    continue;
                }
            }
            int var12;
            if (var10 >= '0' && var10 <= '9') {
                var12 = var10 - '0';
            } else if (var10 >= 'A' && var10 <= 'Z') {
                var12 = var10 - '7';
            } else if (var10 >= 'a' && var10 <= 'z') {
                var12 = var10 - 'W';
            } else {
                throw new NumberFormatException();
            }
            if (arg2 <= var12) {
                throw new NumberFormatException();
            }
            if (var4) {
                var12 = -var12;
            }
            int var11 = arg2 * var7 + var12;
            if (var11 / arg2 != var7) {
                throw new NumberFormatException();
            }
            var7 = var11;
            var6 = true;
        }
        if (!var6) {
            throw new NumberFormatException();
        }
        return var7;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IBI)I")
    public static final int method1045(int arg0, byte arg1, int arg2) {
        if (arg1 <= 16) {
            field2107 = null;
        }
        field2100++;
        int var3 = (arg2 & 0x7F) * arg0 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIILvg;)V")
    public static final void method1046(int arg0, int arg1, int arg2, class108 arg3) {
        if (arg0 != 32566) {
            return;
        }
        field2099++;
        if (class31.field431 != null || class317.field4324 || arg3 == null || class277.method1749(arg3, arg0 ^ 0xFFFF80C9) == null) {
            return;
        }
        class31.field431 = arg3;
        class22.field286 = class277.method1749(arg3, arg0 - 32567);
        class406.field5625 = false;
        class255.field3549 = 0;
        class182.field2560 = arg2;
        class228.field3172 = arg1;
    }

    @OriginalMember(owner = "client!sf", name = "a", descriptor = "(IIIII)V")
    public static final void method1047(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2101++;
        int var5 = 0;
        if (arg0 != 2) {
            return;
        }
        int var6 = arg4;
        int var7 = -arg4;
        int var8 = -1;
        int var9 = class294.method1789(arg1 + arg4, (byte) -5, class430.field6003, class80.field1119);
        int var10 = class294.method1789(arg1 - arg4, (byte) -5, class430.field6003, class80.field1119);
        class149.method1112(arg2, var9, 8, var10, class83.field1157[arg3]);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg3 - var6;
                int var12 = arg3 + var6;
                if (class143.field2090 <= var12 && class42.field543 >= var11) {
                    int var13 = class294.method1789(arg1 + var5, (byte) -5, class430.field6003, class80.field1119);
                    int var14 = class294.method1789(arg1 - var5, (byte) -5, class430.field6003, class80.field1119);
                    if (var12 <= class42.field543) {
                        class149.method1112(arg2, var13, 8, var14, class83.field1157[var12]);
                    }
                    if (class143.field2090 <= var11) {
                        class149.method1112(arg2, var13, 8, var14, class83.field1157[var11]);
                    }
                }
            }
            var5++;
            int var15 = arg3 - var5;
            int var16 = arg3 + var5;
            if (class143.field2090 <= var16 && var15 <= class42.field543) {
                int var17 = class294.method1789(arg1 + var6, (byte) -5, class430.field6003, class80.field1119);
                int var18 = class294.method1789(arg1 - var6, (byte) -5, class430.field6003, class80.field1119);
                if (class42.field543 >= var16) {
                    class149.method1112(arg2, var17, arg0 + 6, var18, class83.field1157[var16]);
                }
                if (class143.field2090 <= var15) {
                    class149.method1112(arg2, var17, 8, var18, class83.field1157[var15]);
                }
            }
        }
    }
}
