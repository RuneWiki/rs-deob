import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class165 {

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "[I")
    public static int[] field2089 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "Lim;")
    public static class353 field2093 = new class353(26, 5);

    @OriginalMember(owner = "client!dq", name = "h", descriptor = "Lvt;")
    public static class344 field2094 = new class344("Cancel", "Abbrechen", "Annuler", "Cancelar");

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!dq", name = "b", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!dq", name = "d", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!dq", name = "e", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!dq", name = "f", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(I)V")
    public static void method893(int arg0) {
        field2093 = null;
        field2094 = null;
        if (arg0 != 0) {
            field2089 = null;
        }
        field2089 = null;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IBI)V")
    public static final void method894(int arg0, byte arg1, int arg2) {
        field2088++;
        int var3 = class627.field9137.method856(0, class245.field3102.method2157(class245.field3103, 4074));
        for (class245 var4 = (class245) class57.field760.method3188((byte) -100); var4 != null; var4 = (class245) class57.field760.method3182((byte) -19)) {
            int var8 = class117.method644(var4, (byte) 111);
            if (var8 > var3) {
                var3 = var8;
            }
        }
        var3 += 8;
        int var5 = class50.field673 * 16 + 21;
        int var6 = arg2 - (var3 / 2);
        if (class502.field6955 < (var6 + var3)) {
            var6 = class502.field6955 - var3;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var7 = arg0;
        if (class604.field8711 < var5 + arg0) {
            var7 = class604.field8711 - var5;
        }
        class431.field5868 = var6;
        if (arg1 != -119) {
            field2089 = null;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        class641.field9318 = var3;
        class81.field1095 = class50.field673 * 16 + (class641.field9319 ? 26 : 22);
        class423.field5739 = var7;
        class264.field3373 = true;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)V")
    public static final void method895(int arg0, int arg1) {
        if (arg0 != -18150) {
            method893(43);
        }
        field2090++;
        class632 var2 = class641.method3699(arg0 ^ 0x4693, 10, arg1);
        var2.method3655(0);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IZI)Z")
    public static final boolean method896(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            method896(68, false, -93);
        }
        field2087++;
        return class202.method1294(-29, arg2, arg0) | (arg2 & 0x70000) != 0 || class313.method1969(arg0, (byte) 110, arg2);
    }
}
