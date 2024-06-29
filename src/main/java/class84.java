import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class84 {

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "Lok;")
    private static class146 field1329 = class235.method1724(-12908, "Loading world list data");

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "[I")
    public static int[] field1330 = new int[50];

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field1331 = 0;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "Lok;")
    private static class146 field1333 = class235.method1724(-12908, "Loading sprites )2 ");

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "Lok;")
    public static class146 field1340 = field1333;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "Lok;")
    private static class146 field1342 = class235.method1724(-12908, "Connected to update server");

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "Lok;")
    public static class146 field1341 = class235.method1724(-12908, ")2");

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "Lok;")
    public static class146 field1343 = field1329;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "Lok;")
    public static class146 field1338 = field1342;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "Loh;")
    public static class15 field1335;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Loh;")
    public static class15 field1336;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "[I")
    public static int[] field1339;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZI)Lam;", line = 12)
    public static final class248 method589(boolean arg0, int arg1) {
        field1337++;
        class248 var2 = (class248) class311.field5304.method799((byte) 52, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class301.field5123.method92(class116.method782((byte) 67, arg1), 0, class73.method542(arg1, -120));
        class248 var4 = new class248();
        var4.field4141 = arg1;
        if (arg0) {
            method591(-109, 83, 47, 29);
        }
        if (var3 != null) {
            var4.method1819(!arg0, new class47(var3));
        }
        var4.method1815(1);
        if (var4.field4145 != -1) {
            var4.method1805(method589(arg0, var4.field4168), 4, method589(false, var4.field4145));
        }
        if (var4.field4115 != -1) {
            var4.method1804((byte) 95, method589(arg0, var4.field4115), method589(arg0, var4.field4162));
        }
        if (!class101.field1626 && var4.field4151) {
            var4.field4133 = false;
            var4.field4127 = 0;
            var4.field4124 = class31.field585;
            var4.field4149 = class216.field3563;
            var4.field4099 = class15.field314;
        }
        class311.field5304.method797(var4, 0, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)V", line = 55)
    public static void method590(int arg0) {
        field1330 = null;
        field1329 = null;
        field1338 = null;
        field1339 = null;
        field1333 = null;
        field1340 = null;
        field1342 = null;
        if (arg0 == 0) {
            field1341 = null;
            field1343 = null;
            field1335 = null;
            field1336 = null;
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)V", line = 92)
    public static final void method591(int arg0, int arg1, int arg2, int arg3) {
        field1332++;
        if (class100.field1621 == arg3 || arg2 == 0 || class89.field1428 >= 50 || arg0 == -1) {
            return;
        }
        class322.field5503[class89.field1428] = arg0;
        class174.field2918[class89.field1428] = arg2;
        field1330[class89.field1428] = arg1;
        class250.field4187[class89.field1428] = null;
        class40.field699[class89.field1428] = 0;
        class89.field1428++;
    }
}
