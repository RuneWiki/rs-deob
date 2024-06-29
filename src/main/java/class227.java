import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class227 {

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "[I")
    public static int[] field3202 = new int[256];

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "Lsl;")
    public static class456 field3204;

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "I")
    public static int field3206;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field3207;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "Ldp;")
    public static class347 field3205;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "I")
    public static int field3201;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field3208;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3202[var0] = var1;
        }
        field3204 = new class456("", 14);
        field3206 = 765;
        field3207 = new String[200];
        field3205 = new class347("Choose Option", "Wähl eine Option", "Choisir une option", "Selecionar opção");
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZZI)V", line = 6)
    public static final void method1418(boolean arg0, boolean arg1, int arg2) {
        field3201++;
        class411 var3 = class171.method1179(arg1, arg0, arg2);
        if (var3 != null) {
            var3.method876((byte) -96);
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 66)
    public static void method1419(int arg0) {
        field3205 = null;
        field3202 = null;
        if (arg0 == 14) {
            field3207 = null;
            field3204 = null;
        }
    }
}
