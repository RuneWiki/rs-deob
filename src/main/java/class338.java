import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class338 {

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "Ljava/lang/String;")
    public static String field5231 = "Prepared sound engine";

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field5230 = 0;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "[I")
    public static int[] field5228 = new int[] { 19, 55, 38, 155, 255, 110, 137, 205, 76 };

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "I")
    public static int field5235 = 0;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "I")
    public static int field5225;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "I")
    public static int field5226;

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field5227;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field5229;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field5232;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field5233;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field5236;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "[[[B")
    public static byte[][][] field5234;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(I)V", line = 5)
    public static void method2337(int arg0) {
        field5231 = null;
        field5234 = (byte[][][]) null;
        field5228 = null;
        if (arg0 != 16004) {
            field5234 = (byte[][][]) ((byte[][][]) null);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;B)Ljava/lang/String;", line = 23)
    public static final String method2338(String arg0, String arg1, String arg2, byte arg3) {
        if (arg3 != -22) {
            method2340(72, true, -28, (byte) 41, -121, (class172) null, 119);
        }
        field5232++;
        for (int var4 = arg0.indexOf(arg1); var4 != -1; var4 = arg0.indexOf(arg1, arg2.length() + var4)) {
            arg0 = arg0.substring(0, var4) + arg2 + arg0.substring(var4 + arg1.length());
        }
        return arg0;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(I)V", line = 47)
    public static final void method2339(int arg0) {
        if (class309.field4866 < 128.0F) {
            class309.field4866 = 128.0F;
        }
        if (class309.field4866 > 383.0F) {
            class309.field4866 = 383.0F;
        }
        if (arg0 <= 42) {
            field5228 = (int[]) null;
        }
        int var1 = class330.field5100 >> 7;
        while (class123.field1922 >= 2048.0F) {
            class123.field1922 -= 2048.0F;
        }
        int var2 = class332.field5139 >> 7;
        while (class123.field1922 < 0.0F) {
            class123.field1922 += 2048.0F;
        }
        field5229++;
        int var3 = class39.method286(class77.field1154, (byte) 82, class330.field5100, class332.field5139);
        int var4 = 0;
        if (var1 > 3 && var2 > 3 && var1 < 100 && var2 < 100) {
            for (int var5 = var1 - 4; var5 <= (var1 + 4); var5++) {
                for (int var6 = var2 - 4; var6 <= (var2 + 4); var6++) {
                    int var7 = class77.field1154;
                    if (var7 < 3 && (class305.field4784[1][var5][var6] & 0x2) == 2) {
                        var7++;
                    }
                    int var8 = (class265.field4096[var7][var5][var6] & 0xFF) * 8 - (client.field2034[var7][var5][var6] - var3);
                    if (var8 > var4) {
                        var4 = var8;
                    }
                }
            }
        }
        int var9 = var4 * 192;
        if (var9 > 98048) {
            var9 = 98048;
        }
        if (var9 < 32768) {
            var9 = 32768;
        }
        if (var9 > class43.field613) {
            class43.field613 += (var9 - class43.field613) / 24;
        } else if (var9 < class43.field613) {
            class43.field613 += (var9 - class43.field613) / 80;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IZIBILpk;I)Lng;", line = 169)
    public static final class245 method2340(int arg0, boolean arg1, int arg2, byte arg3, int arg4, class172 arg5, int arg6) {
        field5226++;
        if (arg3 != 19) {
            method2342(20, 3);
        }
        int var8 = (arg0 << 19) + (arg4 << 17) + arg6 + (arg1 ? 65536 : 0);
        long var9 = (long) arg2 * 3147483667L + ((long) var8 * 3849834839L);
        class245 var11 = (class245) class109.field1685.method1294(var9, 120);
        if (var11 != null) {
            return var11;
        }
        class12.field122 = false;
        class245 var12 = class315.method2152(arg1, arg0, false, 2, arg6, arg2, false, arg5, arg4);
        if (var12 != null && !class12.field122) {
            class109.field1685.method1292(var9, arg3 + 39, var12);
        }
        return var12;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(III)J", line = 210)
    public static final long method2341(int arg0, int arg1, int arg2) {
        class174 var3 = class90.field1375[arg0][arg1][arg2];
        return var3 == null || var3.field2667 == null ? 0L : var3.field2667.field289;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)I", line = 218)
    public static final int method2342(int arg0, int arg1) {
        field5236++;
        if (arg0 != 80) {
            method2340(-40, false, 92, (byte) 4, -35, (class172) null, 119);
        }
        return arg1 >>> 7;
    }
}
