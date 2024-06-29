import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class188 extends class254 {

    @OriginalMember(owner = "client!ma", name = "H", descriptor = "[B")
    public byte[] field3459;

    @OriginalMember(owner = "client!ma", name = "z", descriptor = "Z")
    public static boolean field3453 = false;

    @OriginalMember(owner = "client!ma", name = "B", descriptor = "Lcf;")
    public static class93 field3454 = class147.method1066("m", -48);

    @OriginalMember(owner = "client!ma", name = "C", descriptor = "I")
    public static int field3455 = 0;

    @OriginalMember(owner = "client!ma", name = "J", descriptor = "Lcf;")
    public static class93 field3461 = class147.method1066("<col=00ffff>", -48);

    @OriginalMember(owner = "client!ma", name = "K", descriptor = "Lcf;")
    public static class93 field3462 = class147.method1066("d-Broulement:", -48);

    @OriginalMember(owner = "client!ma", name = "E", descriptor = "I")
    public static int field3456;

    @OriginalMember(owner = "client!ma", name = "F", descriptor = "I")
    public static int field3457;

    @OriginalMember(owner = "client!ma", name = "G", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!ma", name = "I", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(II)Lac;")
    public static final class135 method1359(int arg0, int arg1) {
        field3456++;
        class135 var2 = (class135) class77.field1443.method302((long) arg0, 0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class126.field2233.method1271(class168.method1212(arg0, (byte) 106), -2154, class82.method573((byte) 87, arg0));
        class135 var4 = new class135();
        var4.field2365 = arg0;
        if (var3 != null) {
            var4.method985(128, new class280(var3));
        }
        class77.field1443.method297((long) arg0, var4, 10414);
        if (arg1 > -39) {
            field3461 = null;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIII)V")
    public static final void method1360(int arg0, int arg1, int arg2, int arg3) {
        class41 var4 = class232.field4138[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class24 var5 = var4.field641;
        if (var5 != null) {
            var5.field302 = var5.field302 * arg3 / 16;
            var5.field297 = var5.field297 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!ma", name = "c", descriptor = "(I)Ldh;")
    public static final class120 method1361(int arg0) {
        field3457++;
        int var1 = class42.field663[0] * class246.field4435[0];
        int[] var2 = new int[var1];
        byte[] var3 = class255.field4614[0];
        for (int var4 = 0; var4 < var1; var4++) {
            var2[var4] = class248.field4475[class58.method333(var3[var4], 255)];
        }
        class158 var5 = new class158(class153.field2693, class226.field4044, class169.field2974[0], class67.field1230[0], class246.field4435[0], class42.field663[0], var2);
        int var6 = 78 % ((70 - arg0) / 49);
        class50.method276((byte) 120);
        return var5;
    }

    @OriginalMember(owner = "client!ma", name = "d", descriptor = "(B)V")
    public static void method1362(byte arg0) {
        field3454 = null;
        field3461 = null;
        int var1 = 76 / ((28 - arg0) / 43);
        field3462 = null;
    }

    @OriginalMember(owner = "client!ma", name = "<init>", descriptor = "([B)V")
    public class188(byte[] arg0) {
        this.field3459 = arg0;
    }

    @OriginalMember(owner = "client!ma", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1363(int arg0, int arg1, byte arg2) {
        field3460++;
        int var3 = -6 % ((arg2 + 55) / 43);
        if (arg0 == 11) {
            arg0 = 10;
        }
        if (arg0 >= 5 && arg0 <= 8) {
            arg0 = 4;
        }
        class240 var4 = class34.method197(-114, arg1);
        return var4.method1627(-17311, arg0);
    }
}
