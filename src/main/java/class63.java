import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jf")
public class class63 {

    @OriginalMember(owner = "client!jf", name = "d", descriptor = "Lpj;")
    public static class237 field1258 = class33.method353("sch-Utteln:", 97);

    @OriginalMember(owner = "client!jf", name = "f", descriptor = "Lpj;")
    public static class237 field1260 = class33.method353("gr-Un:", 64);

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "I")
    public static int field1255 = 0;

    @OriginalMember(owner = "client!jf", name = "i", descriptor = "[I")
    public static int[] field1263 = new int[32];

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "Z")
    public static boolean field1256 = true;

    @OriginalMember(owner = "client!jf", name = "e", descriptor = "I")
    public static int field1259 = 0;

    @OriginalMember(owner = "client!jf", name = "k", descriptor = "Lpj;")
    private static class237 field1265;

    @OriginalMember(owner = "client!jf", name = "l", descriptor = "Lpj;")
    public static class237 field1266;

    @OriginalMember(owner = "client!jf", name = "c", descriptor = "I")
    public static int field1257;

    @OriginalMember(owner = "client!jf", name = "g", descriptor = "I")
    public static int field1261;

    @OriginalMember(owner = "client!jf", name = "h", descriptor = "I")
    public static int field1262;

    @OriginalMember(owner = "client!jf", name = "j", descriptor = "I")
    public static int field1264;

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(B)V")
    public static final void method527(byte arg0) {
        field1262++;
        if (arg0 == 126) {
            class34.field735.method934((byte) 62);
            class232.field4023.method934((byte) 62);
            class127.field2215.method934((byte) 62);
        }
    }

    @OriginalMember(owner = "client!jf", name = "a", descriptor = "(I)V")
    public static void method528(int arg0) {
        field1258 = null;
        field1266 = null;
        if (arg0 != 104) {
            field1256 = false;
        }
        field1265 = null;
        field1260 = null;
        field1263 = null;
    }

    @OriginalMember(owner = "client!jf", name = "b", descriptor = "(I)V")
    public static final void method529(int arg0) {
        if (arg0 >= -45) {
            return;
        }
        field1257++;
        int var1 = class167.field2949.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class167.field2949[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class126.field2199; var4++) {
                    if (class7.field95[var4] == class224.field3855[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                int var5 = 0;
                if (var3 == -1) {
                    class7.field95[class126.field2199] = class224.field3855[var2];
                    var3 = class126.field2199++;
                }
                class32 var6 = new class32(class167.field2949[var2]);
                while (class167.field2949[var2].length > var6.field647 && var5 < 511) {
                    int var7 = var3 | var5++ << 6;
                    int var8 = var6.method339(-16777216);
                    int var9 = var8 >> 14;
                    int var10 = (var8 & 0x1FE2) >> 7;
                    int var11 = var8 & 0x3F;
                    int var12 = (class224.field3855[var2] & 0xFF) * 64 + var11 - class27.field494;
                    int var13 = (class224.field3855[var2] >> 8) * 64 + var10 - class235.field4087;
                    class231 var14 = class271.method1805(var6.method339(-16777216), 93);
                    if (class232.field4022[var7] == null && (var14.field3999 & 0x1) > 0 && class214.field3647 == var9 && var13 >= 0 && var13 + var14.field3989 < 104 && var12 >= 0 && var14.field3989 + var12 < 104) {
                        class232.field4022[var7] = new class210();
                        class210 var15 = class232.field4022[var7];
                        class263.field4498[class89.field1636++] = var7;
                        var15.field3692 = class241.field4246;
                        var15.field3586 = var14;
                        var15.method1447(var15.field3586.field3989, (byte) 84);
                        var15.field3726 = var15.field3586.field4009;
                        var15.field3678 = var15.field3586.field3994;
                        var15.field3711 = var15.field3586.field3972;
                        var15.field3712 = var15.field3586.field3997;
                        var15.field3687 = var15.field3586.field3965;
                        var15.field3723 = var15.field3586.field4003;
                        var15.field3679 = var15.field3586.field3973;
                        var15.field3677 = var15.field3586.field3995;
                        if (var15.field3677 == 0) {
                            var15.field3697 = 0;
                        }
                        var15.method1444(var15.method1441((byte) 66), (byte) 33, true, var12, var13);
                    }
                }
            }
        }
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field1263[var1] = var0 - 1;
            var0 += var0;
        }
        field1265 = class33.method353("Unable to find ", 127);
        field1266 = field1265;
    }
}
