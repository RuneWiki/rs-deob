import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class198 extends class21 {

    @OriginalMember(owner = "client!sh", name = "B", descriptor = "[S")
    public static short[] field3503 = new short[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!sh", name = "I", descriptor = "Ldj;")
    private static class44 field3510 = class89.method650(255, "No reply from loginserver)3");

    @OriginalMember(owner = "client!sh", name = "G", descriptor = "Ldj;")
    public static class44 field3508 = field3510;

    @OriginalMember(owner = "client!sh", name = "D", descriptor = "Lfj;")
    public static class66 field3505 = new class66(8);

    @OriginalMember(owner = "client!sh", name = "J", descriptor = "I")
    public static int field3511 = 0;

    @OriginalMember(owner = "client!sh", name = "A", descriptor = "I")
    public static int field3502;

    @OriginalMember(owner = "client!sh", name = "C", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!sh", name = "H", descriptor = "I")
    public static int field3509;

    @OriginalMember(owner = "client!sh", name = "F", descriptor = "Lod;")
    public static class155 field3507;

    @OriginalMember(owner = "client!sh", name = "E", descriptor = "Lve;")
    public static class225 field3506;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(I)V")
    public static void method1283(int arg0) {
        field3508 = null;
        field3505 = null;
        field3507 = null;
        field3506 = null;
        field3510 = null;
        if (arg0 == 24635) {
            field3503 = null;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(Z)Z")
    public static final boolean method1284(boolean arg0) {
        field3504++;
        try {
            return arg0 ? class74.method579(1) : true;
        } catch (IOException var4) {
            class169.method1079(-14186);
            return true;
        } catch (Exception var5) {
            String var2 = "T2 - " + class42.field779 + "," + class8.field157 + "," + class202.field3622 + " - " + class88.field1680 + "," + (class96.field1774.field2240[0] + class222.field4020) + "," + (class96.field1774.field2235[0] + class143.field2550) + " - ";
            for (int var3 = 0; var3 < class88.field1680 && var3 < 50; var3++) {
                var2 = var2 + class218.field3957.field1219[var3] + ",";
            }
            class173.method1099(99, var2, var5);
            class37.method256((byte) 65);
            return true;
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(I)I")
    public static final int method1285(int arg0) {
        if (arg0 > -20) {
            field3506 = null;
        }
        field3509++;
        int var1 = 3;
        if (class199.field3527 < 310) {
            int var2 = class96.field1774.field2260 >> 7;
            int var3 = class102.field1858 >> 7;
            int var4 = class168.field2878 >> 7;
            if ((class47.field875[class194.field3403][var4][var3] & 0x4) != 0) {
                var1 = class194.field3403;
            }
            int var5 = class96.field1774.field2195 >> 7;
            int var6;
            if (var3 >= var5) {
                var6 = var3 - var5;
            } else {
                var6 = var5 - var3;
            }
            int var7;
            if (var2 > var4) {
                var7 = var2 - var4;
            } else {
                var7 = var4 - var2;
            }
            if (var7 > var6) {
                int var8 = 32768;
                int var9 = var6 * 65536 / var7;
                while (var2 != var4) {
                    if (var4 < var2) {
                        var4++;
                    } else if (var2 < var4) {
                        var4--;
                    }
                    if ((class47.field875[class194.field3403][var4][var3] & 0x4) != 0) {
                        var1 = class194.field3403;
                    }
                    var8 += var9;
                    if (var8 >= 65536) {
                        var8 -= 65536;
                        if (var3 < var5) {
                            var3++;
                        } else if (var5 < var3) {
                            var3--;
                        }
                        if ((class47.field875[class194.field3403][var4][var3] & 0x4) != 0) {
                            var1 = class194.field3403;
                        }
                    }
                }
            } else {
                int var10 = 32768;
                int var11 = var7 * 65536 / var6;
                while (var3 != var5) {
                    var10 += var11;
                    if (var5 > var3) {
                        var3++;
                    } else if (var3 > var5) {
                        var3--;
                    }
                    if ((class47.field875[class194.field3403][var4][var3] & 0x4) != 0) {
                        var1 = class194.field3403;
                    }
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var2 > var4) {
                            var4++;
                        } else if (var4 > var2) {
                            var4--;
                        }
                        if ((class47.field875[class194.field3403][var4][var3] & 0x4) != 0) {
                            var1 = class194.field3403;
                        }
                    }
                }
            }
        }
        if ((class47.field875[class194.field3403][class96.field1774.field2260 >> 7][class96.field1774.field2195 >> 7] & 0x4) != 0) {
            var1 = class194.field3403;
        }
        return var1;
    }
}
