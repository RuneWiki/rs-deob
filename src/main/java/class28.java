import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class28 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "I")
    public static int field492 = 0;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Ldj;")
    public static class44 field494 = class89.method650(255, "Neuer Benutzer");

    @OriginalMember(owner = "client!ce", name = "j", descriptor = "Ldj;")
    public static class44 field501 = class89.method650(255, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field499 = 2;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field495;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "I")
    public static int field497;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field498;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "I")
    public static int field500;

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "Lai;")
    public static class10 field493;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "[Lwa;")
    public static class231[] field496;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V")
    public static void method198(byte arg0) {
        int var1 = 65 / ((35 - arg0) / 42);
        field496 = null;
        field494 = null;
        field493 = null;
        field501 = null;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IZ)V")
    public static final void method199(int arg0, boolean arg1) {
        field498++;
        if (!class122.method835(arg0, 31)) {
            return;
        }
        class223[] var2 = class4.field52[arg0];
        for (int var3 = 0; var3 < var2.length; var3++) {
            class223 var4 = var2[var3];
            if (var4 != null) {
                var4.field4096 = 0;
                var4.field4044 = 0;
            }
        }
        if (arg1) {
            method198((byte) 10);
        }
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(IIIZILde;)V")
    public static final void method200(int arg0, int arg1, int arg2, boolean arg3, int arg4, class39 arg5) {
        class29 var6 = new class29();
        var6.field520 = arg5.field736 * 128;
        var6.field515 = arg5.field703;
        var6.field503 = arg5.field700;
        var6.field509 = arg0;
        var6.field506 = arg5.field697;
        if (!arg3) {
            return;
        }
        int var7 = arg5.field698;
        field497++;
        var6.field504 = arg4 * 128;
        var6.field518 = arg1 * 128;
        var6.field513 = arg5.field699;
        int var8 = arg5.field725;
        if (arg2 == 1 || arg2 == 3) {
            var8 = arg5.field698;
            var7 = arg5.field725;
        }
        var6.field516 = (arg1 + var7) * 128;
        var6.field522 = (arg4 + var8) * 128;
        if (arg5.field737 != null) {
            var6.field508 = arg5;
            var6.method206(0);
        }
        class78.field1503.method1185(var6, (byte) -110);
        if (var6.field506 != null) {
            var6.field505 = (int) ((double) (var6.field503 - var6.field515) * Math.random()) + var6.field515;
        }
    }
}
