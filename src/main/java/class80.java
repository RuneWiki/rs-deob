import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class80 extends class171 {

    @OriginalMember(owner = "client!bi", name = "s", descriptor = "J")
    public static long field1276 = 0L;

    @OriginalMember(owner = "client!bi", name = "z", descriptor = "Lok;")
    public static class146 field1283 = class235.method1724(-12908, "(U0a )2 in: ");

    @OriginalMember(owner = "client!bi", name = "E", descriptor = "Lok;")
    public static class146 field1288 = class235.method1724(-12908, "Connect-B au serveur de mise -9 jour");

    @OriginalMember(owner = "client!bi", name = "w", descriptor = "[Lok;")
    public static class146[] field1280 = new class146[100];

    @OriginalMember(owner = "client!bi", name = "H", descriptor = "Lok;")
    public static class146 field1291 = class235.method1724(-12908, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!bi", name = "q", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "client!bi", name = "t", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!bi", name = "u", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!bi", name = "v", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!bi", name = "A", descriptor = "I")
    public int field1284;

    @OriginalMember(owner = "client!bi", name = "B", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!bi", name = "C", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!bi", name = "I", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!bi", name = "y", descriptor = "[I")
    public int[] field1282;

    @OriginalMember(owner = "client!bi", name = "D", descriptor = "[I")
    public int[] field1287;

    @OriginalMember(owner = "client!bi", name = "F", descriptor = "[I")
    public int[] field1289;

    @OriginalMember(owner = "client!bi", name = "r", descriptor = "[Lwi;")
    public class256[] field1275;

    @OriginalMember(owner = "client!bi", name = "G", descriptor = "[Lwi;")
    public class256[] field1290;

    @OriginalMember(owner = "client!bi", name = "x", descriptor = "[[[B")
    public byte[][][] field1281;

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(II)I", line = 11)
    public static final int method571(int arg0, int arg1) {
        field1277++;
        if (arg1 != 156) {
            return -79;
        } else if (arg0 >= 65 && arg0 <= 90 || arg0 >= 192 && arg0 <= 222 && arg0 != 215) {
            return arg0 + 32;
        } else if (arg0 == 159) {
            return 255;
        } else if (arg0 == 140) {
            return 156;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(III)I", line = 33)
    public static final int method572(int arg0, int arg1, int arg2) {
        if (arg2 != 14930) {
            return -91;
        }
        field1286++;
        int var3 = 0;
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(Z)V", line = 62)
    public static void method573(boolean arg0) {
        field1288 = null;
        field1280 = null;
        field1283 = null;
        if (!arg0) {
            field1291 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILok;)I", line = 76)
    public static final int method574(int arg0, class146 arg1) {
        field1285++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = arg0; var2 < class226.field3772; var2++) {
            if (arg1.method1106(class303.field5198[var2], arg0 + 63)) {
                return var2;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IIIII)V", line = 119)
    public static final void method575(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field1279++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = class21.method153(-118, arg1 + arg2, class151.field2564, class126.field2058);
        int var9 = -1;
        int var10 = class21.method153(-119, arg2 - arg1, class151.field2564, class126.field2058);
        if (arg4 != -1) {
            field1280 = (class146[]) null;
        }
        class40.method281(arg3, var10, class81.field1297[arg0], var8, 7);
        while (var6 > var5) {
            var9 += 2;
            var7 += var9;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                if (var12 >= class123.field2008 && class318.field5394 >= var11) {
                    int var13 = class21.method153(arg4 ^ 0x74, arg2 + var5, class151.field2564, class126.field2058);
                    int var14 = class21.method153(-121, arg2 - var5, class151.field2564, class126.field2058);
                    if (class318.field5394 >= var12) {
                        class40.method281(arg3, var14, class81.field1297[var12], var13, 7);
                    }
                    if (var11 >= class123.field2008) {
                        class40.method281(arg3, var14, class81.field1297[var11], var13, arg4 ^ 0xFFFFFFF8);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (class123.field2008 <= var16 && class318.field5394 >= var15) {
                int var17 = class21.method153(-125, arg2 + var6, class151.field2564, class126.field2058);
                int var18 = class21.method153(-127, arg2 - var6, class151.field2564, class126.field2058);
                if (var16 <= class318.field5394) {
                    class40.method281(arg3, var18, class81.field1297[var16], var17, 7);
                }
                if (class123.field2008 <= var15) {
                    class40.method281(arg3, var18, class81.field1297[var15], var17, 7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILr;I)V", line = 195)
    public static final void method576(int arg0, int arg1, class264 arg2, int arg3) {
        field1278++;
        if (class213.field3521 != null || class295.field4998 || arg2 == null || class306.method2153(arg2, arg0 - 5484) == null) {
            return;
        }
        class213.field3521 = arg2;
        class33.field636 = class306.method2153(arg2, arg0 - 5484);
        class248.field4146 = arg1;
        class22.field416 = arg0;
        class218.field3608 = arg3;
        class195.field3246 = false;
    }
}
