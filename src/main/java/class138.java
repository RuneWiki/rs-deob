import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class138 {

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "Llb;")
    public static class121 field2319 = new class121(8);

    @OriginalMember(owner = "client!qj", name = "g", descriptor = "Ljg;")
    public static class158 field2324 = null;

    @OriginalMember(owner = "client!qj", name = "i", descriptor = "Ldf;")
    public static class51 field2326 = class46.method233("<col=ff7000>", 100);

    @OriginalMember(owner = "client!qj", name = "f", descriptor = "Ldf;")
    public static class51 field2323 = class46.method233("loc", 100);

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!qj", name = "c", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!qj", name = "h", descriptor = "I")
    public static int field2325;

    @OriginalMember(owner = "client!qj", name = "e", descriptor = "[Ljg;")
    public static class158[] field2322;

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "([BI)V")
    public static final void method1004(byte[] arg0, int arg1) {
        field2321++;
        class121 var2 = new class121(arg0);
        var2.field2026 = arg0.length - 2;
        class190.field3183 = var2.method876(false);
        class106.field1751 = new int[class190.field3183];
        class125.field2123 = new int[class190.field3183];
        class96.field1591 = new int[class190.field3183];
        class67.field1100 = new byte[class190.field3183][];
        class221.field3837 = new int[class190.field3183];
        class231.field4032 = new byte[class190.field3183][];
        class10.field107 = new boolean[class190.field3183];
        var2.field2026 = arg0.length - class190.field3183 * 8 - 7;
        class13.field194 = var2.method876(false);
        class122.field2078 = var2.method876(false);
        int var3 = (var2.method897(109) & 0xFF) + 1;
        for (int var4 = 0; var4 < class190.field3183; var4++) {
            class96.field1591[var4] = var2.method876(false);
        }
        for (int var5 = 0; var5 < class190.field3183; var5++) {
            class125.field2123[var5] = var2.method876(false);
        }
        for (int var6 = 0; var6 < class190.field3183; var6++) {
            class221.field3837[var6] = var2.method876(false);
        }
        for (int var7 = 0; var7 < class190.field3183; var7++) {
            class106.field1751[var7] = var2.method876(false);
        }
        var2.field2026 = arg0.length - ((var3 - 1) * 3 + class190.field3183 * 8) - 7;
        class139.field2327 = new int[var3];
        for (int var8 = 1; var8 < var3; var8++) {
            class139.field2327[var8] = var2.method891((byte) -126);
            if (class139.field2327[var8] == 0) {
                class139.field2327[var8] = 1;
            }
        }
        var2.field2026 = arg1;
        for (int var9 = 0; var9 < class190.field3183; var9++) {
            int var10 = class106.field1751[var9];
            int var11 = class221.field3837[var9];
            int var12 = var10 * var11;
            byte[] var13 = new byte[var12];
            class67.field1100[var9] = var13;
            boolean var14 = false;
            byte[] var15 = new byte[var12];
            class231.field4032[var9] = var15;
            int var16 = var2.method897(125);
            if ((var16 & 0x1) == 0) {
                for (int var17 = 0; var17 < var12; var17++) {
                    var13[var17] = var2.method912((byte) -90);
                }
                if ((var16 & 0x2) != 0) {
                    for (int var18 = 0; var18 < var12; var18++) {
                        byte var19 = var15[var18] = var2.method912((byte) -90);
                        var14 |= var19 != -1;
                    }
                }
            } else {
                int var20 = 0;
                label97: while (true) {
                    if (var11 <= var20) {
                        if ((var16 & 0x2) == 0) {
                            break;
                        }
                        int var21 = 0;
                        while (true) {
                            if (var21 >= var11) {
                                break label97;
                            }
                            for (int var22 = 0; var22 < var10; var22++) {
                                byte var23 = var15[var11 * var22 + var21] = var2.method912((byte) -90);
                                var14 |= var23 != -1;
                            }
                            var21++;
                        }
                    }
                    for (int var24 = 0; var24 < var10; var24++) {
                        var13[var11 * var24 + var20] = var2.method912((byte) -90);
                    }
                    var20++;
                }
            }
            class10.field107[var9] = var14;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(I)Z")
    public static final boolean method1005(int arg0) {
        if (arg0 != 0) {
            field2323 = null;
        }
        field2325++;
        try {
            return class219.method1510(-98);
        } catch (IOException var4) {
            class246.method1675(-1);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class35.field516 + "," + class44.field705 + "," + class189.field3163 + " - " + class70.field1128 + "," + (class44.field706.field4343[0] + class11.field160) + "," + (class44.field706.field4336[0] + class241.field4179) + " - ";
            for (int var3 = 0; var3 < class70.field1128 && var3 < 50; var3++) {
                var2 = var2 + class97.field1622.field2014[var3] + ",";
            }
            class89.method674(var5, var2, 95);
            class42.method216(104);
            return true;
        }
    }

    @OriginalMember(owner = "client!qj", name = "b", descriptor = "(I)V")
    public static void method1006(int arg0) {
        field2323 = null;
        field2324 = null;
        field2326 = null;
        if (arg0 != 25795) {
            field2322 = null;
        }
        field2319 = null;
        field2322 = null;
    }
}
