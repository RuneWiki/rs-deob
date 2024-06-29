import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class68 {

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "Lhj;")
    public static class69 field1289 = class181.method1318("blinken3:", (byte) -126);

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "I")
    public static int field1285;

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "I")
    public static int field1286;

    @OriginalMember(owner = "client!ge", name = "c", descriptor = "I")
    public static int field1287;

    @OriginalMember(owner = "client!ge", name = "f", descriptor = "I")
    public int field1290;

    @OriginalMember(owner = "client!ge", name = "h", descriptor = "I")
    public int field1292;

    @OriginalMember(owner = "client!ge", name = "j", descriptor = "I")
    public int field1294;

    @OriginalMember(owner = "client!ge", name = "i", descriptor = "J")
    public long field1293;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "Led;")
    public class177 field1288;

    @OriginalMember(owner = "client!ge", name = "g", descriptor = "[Lej;")
    public static class48[] field1291;

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(I)V")
    public static final void method433(int arg0) {
        for (int var1 = 0; var1 < class156.field2917; var1++) {
            int var2 = class102.field1908[var1];
            class38 var3 = class131.field2428[var2];
            int var4 = class199.field3595.method937(false);
            if ((var4 & 0x80) != 0) {
                int var5 = class199.field3595.method961(-268435456);
                if (var5 == 65535) {
                    var5 = -1;
                }
                int var6 = class199.field3595.method926((byte) -128);
                class161.method1208(var6, -51, var5, var3);
            }
            if ((var4 & 0x4) != 0) {
                int var7 = class199.field3595.method926((byte) -106);
                int var8 = class199.field3595.method937(false);
                var3.method1572(class180.field3272, var8, arg0 ^ 0xFFFF, var7);
            }
            if ((var4 & 0x2) != 0) {
                int var9 = class199.field3595.method937(false);
                int var10 = class199.field3595.method946(false);
                var3.method1572(class180.field3272, var10, 0, var9);
                var3.field4042 = class180.field3272 + 300;
                var3.field4032 = class199.field3595.method926((byte) -68);
            }
            if ((var4 & 0x40) != 0) {
                var3.field3989 = class199.field3595.method963(false);
                var3.field4036 = 100;
            }
            if ((var4 & 0x8) != 0) {
                var3.field3992 = class199.field3595.method962((byte) 79);
                int var11 = class199.field3595.method951(-127);
                var3.field4027 = 0;
                if (var3.field3992 == 65535) {
                    var3.field3992 = -1;
                }
                var3.field4047 = 0;
                var3.field4020 = class180.field3272 + (var11 & 0xFFFF);
                if (class180.field3272 < var3.field4020) {
                    var3.field4027 = -1;
                }
                var3.field4035 = var11 >> 16;
                if (var3.field3992 != -1 && class180.field3272 == var3.field4020) {
                    int var12 = class213.method1533(128, var3.field3992).field561;
                    if (var12 != -1) {
                        class159 var13 = class211.method1521(-95, var12);
                        if (var13 != null && var13.field2962 != null) {
                            class248.method1748(var3.field4005, var3.field3985, var13, -67, 0, false);
                        }
                    }
                }
            }
            if ((var4 & 0x1) != 0) {
                if (var3.field517.method1359(112)) {
                    class168.method1241(true, var3);
                }
                var3.field517 = class62.method386((byte) 95, class199.field3595.method930((byte) 52));
                var3.method1578(var3.field517.field3359, (byte) 73);
                var3.field4045 = var3.field517.field3361;
                var3.field3984 = var3.field517.field3398;
                var3.field4054 = var3.field517.field3374;
                var3.field4049 = var3.field517.field3383;
                var3.field3999 = var3.field517.field3401;
                var3.field3982 = var3.field517.field3353;
                var3.field4018 = var3.field517.field3408;
                var3.field4026 = var3.field517.field3350;
                if (var3.field517.method1359(47)) {
                    class232.method1653(0, var3.field3998[0], (byte) 85, var3, class52.field927, (class12) null, (class108) null, var3.field4046[0]);
                }
            }
            if ((var4 & 0x10) != 0) {
                var3.field4025 = class199.field3595.method912(-124);
                if (var3.field4025 == 65535) {
                    var3.field4025 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                var3.field4060 = class199.field3595.method961(arg0 - 268500991);
                var3.field4053 = class199.field3595.method912(-108);
            }
        }
        if (arg0 != 65535) {
            method434((byte) -85, 124);
        }
        field1285++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(BI)V")
    public static final void method434(byte arg0, int arg1) {
        if (arg0 < -15) {
            field1287++;
            class135 var2 = class8.method38((byte) 118, 1, arg1);
            var2.method1012((byte) 117);
        }
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(II)V")
    public static final void method435(int arg0, int arg1) {
        field1286++;
        class135 var2 = class8.method38((byte) 121, arg0, arg1);
        var2.method1012((byte) 108);
    }

    @OriginalMember(owner = "client!ge", name = "b", descriptor = "(I)V")
    public static void method436(int arg0) {
        field1289 = null;
        field1291 = null;
        if (arg0 != 1) {
            field1289 = null;
        }
    }
}
