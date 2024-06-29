import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class21 {

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "[I")
    public int[] field273 = new int[3];

    @OriginalMember(owner = "client!mp", name = "j", descriptor = "[Lva;")
    public class55[] field281 = new class55[100];

    @OriginalMember(owner = "client!mp", name = "f", descriptor = "[Lic;")
    public class227[] field277 = new class227[8];

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "[I")
    public int[] field272 = new int[100];

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "I")
    public static int field274 = -1;

    @OriginalMember(owner = "client!mp", name = "l", descriptor = "[S")
    public static short[] field283 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!mp", name = "g", descriptor = "I")
    public static int field278;

    @OriginalMember(owner = "client!mp", name = "h", descriptor = "I")
    public int field279;

    @OriginalMember(owner = "client!mp", name = "k", descriptor = "I")
    public static int field282;

    @OriginalMember(owner = "client!mp", name = "m", descriptor = "I")
    public static int field284;

    @OriginalMember(owner = "client!mp", name = "i", descriptor = "Llm;")
    public static class347 field280;

    @OriginalMember(owner = "client!mp", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field276;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "[Lcq;")
    public static class67[] field275;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V", line = 6)
    public static void method144(int arg0) {
        field283 = null;
        field280 = null;
        if (arg0 == 18269) {
            field275 = null;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(ZII)I", line = 21)
    public static final int method145(boolean arg0, int arg1, int arg2) {
        field284++;
        if (arg2 == -2) {
            return 12345678;
        } else if (arg2 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg2 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            if (arg0) {
                field282 = -96;
            }
            return (arg2 & 0xFF80) + var3;
        }
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lva;Z)Z", line = 69)
    public static final boolean method146(class55 arg0, boolean arg1) {
        boolean var2 = class191.field2557 == class12.field205;
        int var3 = 0;
        arg0.method373((byte) -108);
        if (arg0.field743 < 0 || arg0.field726 < 0 || arg0.field742 >= class104.field1436 || arg0.field737 >= class214.field2858) {
            return false;
        }
        for (int var4 = arg0.field743; var4 <= arg0.field742; var4++) {
            for (int var7 = arg0.field726; var7 <= arg0.field737; var7++) {
                int var8 = 0;
                if (var4 > arg0.field743) {
                    var8++;
                }
                if (var4 < arg0.field742) {
                    var8 += 4;
                }
                if (var7 > arg0.field726) {
                    var8 += 8;
                }
                if (var7 < arg0.field737) {
                    var8 += 2;
                }
                class365.method2386(arg0.field727, var4, var7);
                class254 var9 = class213.field2852[arg0.field727][var4][var7];
                class328 var10 = class242.method1453(arg0, var8, -115);
                class328 var11 = var9.field3515;
                if (var11 == null) {
                    var9.field3515 = var10;
                } else {
                    while (var11.field4783 != null) {
                        var11 = var11.field4783;
                    }
                    var11.field4783 = var10;
                }
                var9.field3528 = (byte) (var9.field3528 | var8);
                if (var2 && class282.field4111[var4][var7] != 0) {
                    var3 = class282.field4111[var4][var7];
                }
            }
        }
        if (var2 && var3 != 0) {
            for (int var5 = arg0.field743; var5 <= arg0.field742; var5++) {
                for (int var6 = arg0.field726; var6 <= arg0.field737; var6++) {
                    if (class282.field4111[var5][var6] == 0) {
                        class282.field4111[var5][var6] = var3;
                    }
                }
            }
        }
        if (arg1) {
            class163.field2183[class397.field5914++] = arg0;
        }
        return true;
    }
}
