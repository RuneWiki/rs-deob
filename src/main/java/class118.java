import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fc")
public class class118 {

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "I")
    public static int field2194 = 0;

    @OriginalMember(owner = "client!fc", name = "c", descriptor = "Loh;")
    public static class263 field2196 = class253.method1681(-119, "m-Ochte mit Ihnen handeln)3");

    @OriginalMember(owner = "client!fc", name = "d", descriptor = "[I")
    public static int[] field2197 = new int[256];

    @OriginalMember(owner = "client!fc", name = "b", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!fc", name = "f", descriptor = "I")
    public static int field2199;

    @OriginalMember(owner = "client!fc", name = "g", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!fc", name = "h", descriptor = "I")
    public static int field2201;

    @OriginalMember(owner = "client!fc", name = "e", descriptor = "Lue;")
    public static class86 field2198;

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "([BIII)Z")
    public static final boolean method766(byte[] arg0, int arg1, int arg2, int arg3) {
        field2195++;
        boolean var4 = true;
        class194 var5 = new class194(arg0);
        if (arg3 != 256) {
            field2201 = 15;
        }
        int var6 = -1;
        label60: while (true) {
            int var7 = var5.method1303(-68);
            if (var7 == 0) {
                return var4;
            }
            var6 += var7;
            int var8 = 0;
            boolean var9 = false;
            while (true) {
                while (!var9) {
                    int var11 = var5.method1311(arg3 ^ 0x15F);
                    if (var11 == 0) {
                        continue label60;
                    }
                    var8 += var11 - 1;
                    int var12 = var8 >> 6 & 0x3F;
                    int var13 = var5.method1301(-8317) >> 2;
                    int var14 = var8 & 0x3F;
                    int var15 = arg1 + var12;
                    int var16 = arg2 + var14;
                    if (var15 > 0 && var16 > 0 && var15 < 103 && var16 < 103) {
                        class12 var17 = class117.method763(var6, (byte) 1);
                        if (var13 != 22 || class146.field2670 || var17.field299 != 0 || var17.field331 == 1 || var17.field300) {
                            if (!var17.method100(20)) {
                                class122.field2270++;
                                var4 = false;
                            }
                            var9 = true;
                        }
                    }
                }
                int var10 = var5.method1311(-127);
                if (var10 == 0) {
                    break;
                }
                var5.method1301(-8317);
            }
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(ZI)Loh;")
    public static final class263 method767(boolean arg0, int arg1) {
        field2200++;
        if (arg1 < 999999999) {
            return class136.method891(-122, arg1);
        } else {
            if (!arg0) {
                field2198 = null;
            }
            return class158.field2873;
        }
    }

    @OriginalMember(owner = "client!fc", name = "a", descriptor = "(B)V")
    public static void method768(byte arg0) {
        if (arg0 == -75) {
            field2196 = null;
            field2198 = null;
            field2197 = null;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field2197[var0] = var1;
        }
    }
}
