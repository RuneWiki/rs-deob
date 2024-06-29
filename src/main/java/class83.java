import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class83 {

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "Z")
    public static boolean field1363 = false;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1361 = new String[100];

    @OriginalMember(owner = "client!fg", name = "h", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public int field1359;

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "I")
    public int field1360;

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public int field1362;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "I")
    public int field1365;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V")
    public static void method654(byte arg0) {
        field1361 = null;
        if (arg0 != 45) {
            field1361 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IZIIIIII)V")
    public static final void method655(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1364++;
        int var8 = arg5 - 334;
        if (var8 < 0) {
            var8 = 0;
        } else if (var8 > 100) {
            var8 = 100;
        }
        if (!arg1) {
            field1366 = 78;
        }
        int var9 = (class365.field5488 - class222.field3215) * var8 / 100 + class222.field3215;
        int var10 = arg7 * var9 >> 8;
        int var11 = 16384 - arg3 & 0x3FFF;
        int var12 = 16384 - arg2 & 0x3FFF;
        int var13 = 0;
        int var14 = 0;
        int var15 = var10;
        if (var11 != 0) {
            var14 = class324.field4966[var11] * -var10 >> 15;
            var15 = class324.field4974[var11] * var10 >> 15;
        }
        if (var12 != 0) {
            var13 = class324.field4966[var12] * var15 >> 15;
            var15 = class324.field4974[var12] * var15 >> 15;
        }
        class320.field4578 = arg2;
        class310.field4446 = arg3;
        class291.field4175 = arg4 - var15;
        class103.field1642 = 0;
        class430.field6262 = arg0 - var13;
        class207.field2983 = arg6 - var14;
    }

    static {
        new class180("Use", "Benutzen", "Utiliser", "Usar");
        field1366 = 104;
    }
}
