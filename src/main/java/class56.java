import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!i")
public class class56 {

    @OriginalMember(owner = "client!i", name = "a", descriptor = "Lod;")
    public static class101 field1256 = class46.method335(-76, "Geben Sie Ihren Benutzernamen");

    @OriginalMember(owner = "client!i", name = "h", descriptor = "[I")
    public static int[] field1263 = new int[5];

    @OriginalMember(owner = "client!i", name = "b", descriptor = "I")
    public static int field1257 = -1;

    @OriginalMember(owner = "client!i", name = "i", descriptor = "Lod;")
    public static class101 field1264 = class46.method335(-125, "::fpsoff");

    @OriginalMember(owner = "client!i", name = "d", descriptor = "I")
    public static int field1259 = 0;

    @OriginalMember(owner = "client!i", name = "f", descriptor = "Lcb;")
    public static class17 field1261 = new class17(64);

    @OriginalMember(owner = "client!i", name = "j", descriptor = "Lod;")
    public static class101 field1265 = class46.method335(-79, "Fehler bei der Verbindung zum Server)3");

    @OriginalMember(owner = "client!i", name = "k", descriptor = "Lod;")
    public static class101 field1266 = class46.method335(66, "Freie Welt");

    @OriginalMember(owner = "client!i", name = "l", descriptor = "Lod;")
    public static class101 field1267 = class46.method335(97, " <col=ffff00>");

    @OriginalMember(owner = "client!i", name = "n", descriptor = "Lod;")
    public static class101 field1269 = class46.method335(-87, "mn");

    @OriginalMember(owner = "client!i", name = "c", descriptor = "I")
    public static int field1258;

    @OriginalMember(owner = "client!i", name = "e", descriptor = "I")
    public static int field1260;

    @OriginalMember(owner = "client!i", name = "g", descriptor = "[I")
    public static int[] field1262;

    @OriginalMember(owner = "client!i", name = "m", descriptor = "[I")
    public static int[] field1268;

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(B)V")
    public static final void method397(byte arg0) {
        for (int var1 = 0; var1 < class143.field3290; var1++) {
            int var10002 = class148.field3375[var1]--;
            if (class148.field3375[var1] >= -10) {
                class14 var3 = class44.field1043[var1];
                if (var3 == null) {
                    var3 = class14.method99(class141.field3258, class120.field2648[var1], 0);
                    if (var3 == null) {
                        continue;
                    }
                    class148.field3375[var1] += var3.method97();
                    class44.field1043[var1] = var3;
                }
                if (class148.field3375[var1] < 0) {
                    int var4;
                    if (class84.field1840[var1] == 0) {
                        var4 = class52.field1197;
                    } else {
                        int var5 = (class84.field1840[var1] & 0xFF) * 128;
                        int var6 = class84.field1840[var1] >> 16 & 0xFF;
                        int var7 = var6 * 128 + 64 - class82.field1778.field1341;
                        if (var7 < 0) {
                            var7 = -var7;
                        }
                        int var8 = class84.field1840[var1] >> 8 & 0xFF;
                        int var9 = var8 * 128 + 64 - class82.field1778.field1298;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        int var10 = var9 + var7 - 128;
                        if (var5 < var10) {
                            class148.field3375[var1] = -100;
                            continue;
                        }
                        if (var10 < 0) {
                            var10 = 0;
                        }
                        var4 = (var5 - var10) * class145.field3332 / var5;
                    }
                    if (var4 > 0) {
                        class123 var11 = var3.method100().method939(class44.field1049);
                        class68 var12 = class68.method493(var11, 100, var4);
                        var12.method455(class13.field284[var1] - 1);
                        class133.field3039.method504(var12);
                    }
                    class148.field3375[var1] = -100;
                }
            } else {
                class143.field3290--;
                for (int var2 = var1; var2 < class143.field3290; var2++) {
                    class120.field2648[var2] = class120.field2648[var2 + 1];
                    class44.field1043[var2] = class44.field1043[var2 + 1];
                    class13.field284[var2] = class13.field284[var2 + 1];
                    class148.field3375[var2] = class148.field3375[var2 + 1];
                    class84.field1840[var2] = class84.field1840[var2 + 1];
                }
                var1--;
            }
        }
        if (class155.field3569 && !class43.method320(117)) {
            if (class80.field1693 != 0 && class26.field680 != -1) {
                class7.method33(class26.field680, 0, (byte) -112, false, class12.field245, class80.field1693);
            }
            class155.field3569 = false;
        }
        field1258++;
        if (arg0 >= -34) {
            field1260 = 10;
        }
    }

    @OriginalMember(owner = "client!i", name = "a", descriptor = "(I)V")
    public static void method398(int arg0) {
        field1261 = null;
        field1268 = null;
        field1264 = null;
        field1256 = null;
        field1265 = null;
        field1269 = null;
        if (arg0 != 30374) {
            method397((byte) -54);
        }
        field1267 = null;
        field1266 = null;
        field1262 = null;
        field1263 = null;
    }
}
