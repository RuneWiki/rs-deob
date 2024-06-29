import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class75 extends class115 {

    @OriginalMember(owner = "client!d", name = "P", descriptor = "Lie;")
    public class18 field1314;

    @OriginalMember(owner = "client!d", name = "M", descriptor = "Lub;")
    public static class227 field1311 = class257.method1749("W-=hlen Sie eine Option", 17263);

    @OriginalMember(owner = "client!d", name = "G", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!d", name = "J", descriptor = "I")
    public static int field1308;

    @OriginalMember(owner = "client!d", name = "K", descriptor = "I")
    public static int field1309;

    @OriginalMember(owner = "client!d", name = "N", descriptor = "I")
    public static int field1312;

    @OriginalMember(owner = "client!d", name = "O", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!d", name = "I", descriptor = "Lwa;")
    public static class135 field1307;

    @OriginalMember(owner = "client!d", name = "Q", descriptor = "Lwa;")
    public static class135 field1315;

    @OriginalMember(owner = "client!d", name = "L", descriptor = "Lph;")
    public static class32 field1310;

    @OriginalMember(owner = "client!d", name = "H", descriptor = "[[[I")
    public static int[][][] field1306;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "(I)V")
    public static final void method439(int arg0) {
        if (class184.field3139 == 30) {
            class12.method60(25, -124);
        }
        field1305++;
        if (arg0 < 94) {
            method441(-62, -3, 25, 57);
        }
    }

    @OriginalMember(owner = "client!d", name = "c", descriptor = "(Z)V")
    public static void method440(boolean arg0) {
        field1307 = null;
        field1310 = null;
        field1311 = null;
        field1306 = null;
        field1315 = null;
        if (!arg0) {
            method442((class126) null, -95);
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIII)V")
    public static final void method441(int arg0, int arg1, int arg2, int arg3) {
        class108 var4 = class261.field4539[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class78 var5 = var4.field2037;
        if (var5 != null) {
            var5.field1363 = var5.field1363 * arg3 / 16;
            var5.field1361 = var5.field1361 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(Lib;I)V")
    public static final void method442(class126 arg0, int arg1) {
        arg0.field2253 = false;
        field1308++;
        if (arg0.field2251 != null) {
            arg0.field2251.field2686 = 0;
        }
        class126 var2 = arg0.method475();
        if (arg1 < 65) {
            method442((class126) null, 27);
        }
        while (var2 != null) {
            method442(var2, 80);
            var2 = arg0.method477();
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "([BI)V")
    public static final void method443(byte[] arg0, int arg1) {
        int var2 = 0;
        field1313++;
        int var3 = 116 % ((70 - arg1) / 34);
        while (true) {
            while (var2 < arg0.length) {
                int var4 = (arg0[var2++] & 0xFF) * 64 - class86.field1492;
                int var5 = (arg0[var2++] & 0xFF) * 64 - class257.field4499;
                if (var4 > 0 && var5 > 0 && var4 + 64 < class249.field4322 && class45.field753 > var5 + 64) {
                    int var6 = var4 >> 6;
                    int var7 = class45.field753 - var5 - 1 >> 6;
                    for (int var8 = 0; var8 < 64; var8++) {
                        for (int var9 = -64; var9 < 0; var9++) {
                            byte var10 = arg0[var2++];
                            if (var10 != 0) {
                                if (class64.field1167[var6][var7] == null) {
                                    class64.field1167[var6][var7] = new byte[4096];
                                }
                                class64.field1167[var6][var7][(-(var9 + 1) << 6) + var8] = var10;
                                byte var11 = arg0[var2++];
                                if (class25.field424[var6][var7] == null) {
                                    class25.field424[var6][var7] = new byte[4096];
                                }
                                class25.field424[var6][var7][(-(var9 + 1) << 6) + var8] = var11;
                            }
                        }
                    }
                } else {
                    for (int var12 = -4096; var12 < 0; var12++) {
                        byte var13 = arg0[var2++];
                        if (var13 != 0) {
                            var2++;
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(IIB)I")
    public static final int method444(int arg0, int arg1, byte arg2) {
        field1309++;
        if (arg2 != 22) {
            field1311 = null;
        }
        int var3 = arg0 * 57 + arg1;
        int var4 = var3 ^ var3 << 13;
        int var5 = (var4 * 15731 * var4 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return (var5 & 0x7FA857F) >> 19;
    }

    @OriginalMember(owner = "client!d", name = "<init>", descriptor = "(Lie;)V")
    public class75(class18 arg0) {
        this.field1314 = arg0;
    }
}
