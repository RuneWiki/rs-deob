import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ja")
public class class18 {

    @OriginalMember(owner = "mapview!ja", name = "d", descriptor = "Lj;")
    public static class17 field274 = class30.method190(-107, "overlay2)3dat");

    @OriginalMember(owner = "mapview!ja", name = "e", descriptor = "Lj;")
    public static class17 field275 = class30.method190(-90, "sprites");

    @OriginalMember(owner = "mapview!ja", name = "g", descriptor = "Lq;")
    public static class31 field277 = null;

    @OriginalMember(owner = "mapview!ja", name = "h", descriptor = "[I")
    public static int[] field278 = new int[128];

    @OriginalMember(owner = "mapview!ja", name = "c", descriptor = "[I")
    public static int[] field273 = new int[128];

    @OriginalMember(owner = "mapview!ja", name = "j", descriptor = "Lj;")
    public static class17 field280 = class30.method190(-112, "Shield Shop");

    @OriginalMember(owner = "mapview!ja", name = "f", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "J")
    public static long field272;

    @OriginalMember(owner = "mapview!ja", name = "i", descriptor = "Lga;")
    public static class12 field279;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "[B")
    public static byte[] field271;

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(B)B", line = 23)
    public static final byte method137(byte arg0) {
        if (arg0 < 112) {
            return 93;
        } else if (field271 == null) {
            return 0;
        } else {
            return field271[class13.field234];
        }
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IIIBI)V", line = 50)
    public static final void method138(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var5 = arg1 >> 6;
        if (arg2 != -11001) {
            field278 = null;
        }
        int var6 = arg0 >> 6;
        if (class2.field84[arg4][var6][var5] == null) {
            class2.field84[arg4][var6][var5] = new byte[4096];
        }
        class2.field84[arg4][var6][var5][class32.method205(arg1, 63) + class32.method205(4032, arg0 << 6)] = arg3;
    }

    @OriginalMember(owner = "mapview!ja", name = "b", descriptor = "(B)V", line = 81)
    public static void method139(byte arg0) {
        int var1 = 115 % ((arg0 - 70) / 41);
        field275 = null;
        field273 = null;
        field278 = null;
        field274 = null;
        field271 = null;
        field279 = null;
        field280 = null;
    }

    @OriginalMember(owner = "mapview!ja", name = "a", descriptor = "(IILjava/awt/Component;B)Lca;", line = 99)
    public static final class6 method140(int arg0, int arg1, Component arg2, byte arg3) {
        try {
            if (arg3 >= -125) {
                field280 = null;
            }
            Class var4 = Class.forName("da");
            class6 var5 = (class6) var4.getDeclaredConstructor().newInstance();
            var5.method65(arg1, true, arg0, arg2);
            return var5;
        } catch (Throwable var8) {
            class30 var7 = new class30();
            var7.method65(arg1, true, arg0, arg2);
            return var7;
        }
    }
}
