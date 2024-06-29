import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class123 extends class151 {

    @OriginalMember(owner = "client!ld", name = "r", descriptor = "Lmb;")
    private static class132 field2301 = class166.method1092("button near the top of that page)3", 116);

    @OriginalMember(owner = "client!ld", name = "t", descriptor = "Lmb;")
    public static class132 field2303 = class166.method1092("Bitte entfernen Sie ", 115);

    @OriginalMember(owner = "client!ld", name = "q", descriptor = "Lmb;")
    public static class132 field2300 = field2301;

    @OriginalMember(owner = "client!ld", name = "D", descriptor = "Lmb;")
    public static class132 field2312 = class166.method1092("<col=ffffff>", 122);

    @OriginalMember(owner = "client!ld", name = "E", descriptor = "I")
    public static int field2313 = 1;

    @OriginalMember(owner = "client!ld", name = "F", descriptor = "I")
    public static int field2314 = 0;

    @OriginalMember(owner = "client!ld", name = "s", descriptor = "I")
    public int field2302;

    @OriginalMember(owner = "client!ld", name = "u", descriptor = "I")
    public int field2304;

    @OriginalMember(owner = "client!ld", name = "v", descriptor = "I")
    public int field2305;

    @OriginalMember(owner = "client!ld", name = "x", descriptor = "I")
    public int field2307;

    @OriginalMember(owner = "client!ld", name = "y", descriptor = "I")
    public int field2308;

    @OriginalMember(owner = "client!ld", name = "z", descriptor = "I")
    public static int field2309;

    @OriginalMember(owner = "client!ld", name = "C", descriptor = "Lmb;")
    public class132 field2311;

    @OriginalMember(owner = "client!ld", name = "o", descriptor = "Lii;")
    public class96 field2298;

    @OriginalMember(owner = "client!ld", name = "p", descriptor = "Lii;")
    public class96 field2299;

    @OriginalMember(owner = "client!ld", name = "w", descriptor = "Z")
    public boolean field2306;

    @OriginalMember(owner = "client!ld", name = "A", descriptor = "[Ljava/lang/Object;")
    public Object[] field2310;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIIIILmf;IZJ)Z")
    public static final boolean method814(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class136 arg8, int arg9, boolean arg10, long arg11) {
        for (int var13 = arg1; var13 < arg1 + arg3; var13++) {
            for (int var20 = arg2; var20 < arg2 + arg4; var20++) {
                if (var13 < 0 || var20 < 0 || var13 >= class225.field4079 || var20 >= class14.field193) {
                    return false;
                }
                class169 var21 = class101.field1900[arg0][var13][var20];
                if (var21 != null && var21.field3096 >= 5) {
                    return false;
                }
            }
        }
        class78 var14 = new class78();
        var14.field1355 = arg11;
        var14.field1361 = arg0;
        var14.field1338 = arg5;
        var14.field1350 = arg6;
        var14.field1352 = arg7;
        var14.field1363 = arg8;
        var14.field1341 = arg9;
        var14.field1353 = arg1;
        var14.field1362 = arg2;
        var14.field1358 = arg1 + arg3 - 1;
        var14.field1360 = arg2 + arg4 - 1;
        for (int var15 = arg1; var15 < arg1 + arg3; var15++) {
            for (int var16 = arg2; var16 < arg2 + arg4; var16++) {
                int var17 = 0;
                if (var15 > arg1) {
                    var17++;
                }
                if (var15 < arg1 + arg3 - 1) {
                    var17 += 4;
                }
                if (var16 > arg2) {
                    var17 += 8;
                }
                if (var16 < arg2 + arg4 - 1) {
                    var17 += 2;
                }
                for (int var18 = arg0; var18 >= 0; var18--) {
                    if (class101.field1900[var18][var15][var16] == null) {
                        class101.field1900[var18][var15][var16] = new class169(var18, var15, var16);
                    }
                }
                class169 var19 = class101.field1900[arg0][var15][var16];
                var19.field3103[var19.field3096] = var14;
                var19.field3092[var19.field3096] = var17;
                var19.field3110 |= var17;
                var19.field3096++;
            }
        }
        if (arg10) {
            class216.field3944[class148.field2724++] = var14;
        }
        return true;
    }

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "(B)V")
    public static void method815(byte arg0) {
        field2312 = null;
        field2300 = null;
        field2303 = null;
        if (arg0 != -55) {
            field2301 = null;
        }
        field2301 = null;
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(I[B)V")
    public static final void method816(int arg0, byte[] arg1) {
        int var2 = 0;
        while (true) {
            while (arg1.length > var2) {
                int var3 = (arg1[var2++] & 0xFF) * 64 - class28.field451;
                int var4 = (arg1[var2++] & 0xFF) * 64 - class141.field2632;
                if (var3 > 0 && var4 > 0 && var3 + 64 < class192.field3586 && class113.field2188 > var4 + 64) {
                    int var5 = var3 >> 6;
                    int var6 = class113.field2188 - var4 - 1 >> 6;
                    for (int var7 = 0; var7 < 64; var7++) {
                        for (int var8 = -64; var8 < 0; var8++) {
                            byte var9 = arg1[var2++];
                            if (var9 != 0) {
                                if (client.field543[var5][var6] == null) {
                                    client.field543[var5][var6] = new byte[4096];
                                }
                                client.field543[var5][var6][(-(var8 + 1) << 6) + var7] = var9;
                                byte var10 = arg1[var2++];
                                if (class47.field816[var5][var6] == null) {
                                    class47.field816[var5][var6] = new byte[4096];
                                }
                                class47.field816[var5][var6][(-(var8 + 1) << 6) + var7] = var10;
                            }
                        }
                    }
                } else {
                    for (int var11 = -4096; var11 < 0; var11++) {
                        byte var12 = arg1[var2++];
                        if (var12 != 0) {
                            var2++;
                        }
                    }
                }
            }
            if (arg0 != 4421) {
                return;
            }
            field2309++;
            return;
        }
    }
}
