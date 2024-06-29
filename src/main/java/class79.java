import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class79 extends class95 {

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "Lsf;")
    public static class108 field1199 = class140.method973(255, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "Lsf;")
    public static class108 field1197 = class140.method973(255, "(U0a )2 via: ");

    @OriginalMember(owner = "client!ph", name = "N", descriptor = "I")
    public static int field1202 = 100;

    @OriginalMember(owner = "client!ph", name = "X", descriptor = "Lsf;")
    public static class108 field1212 = class140.method973(255, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ph", name = "O", descriptor = "Lsf;")
    public static class108 field1203 = class140.method973(255, "W-=hlen Sie eine Option");

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "I")
    public int field1196;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!ph", name = "M", descriptor = "I")
    public static int field1201;

    @OriginalMember(owner = "client!ph", name = "P", descriptor = "I")
    public int field1204;

    @OriginalMember(owner = "client!ph", name = "Q", descriptor = "I")
    public static int field1205;

    @OriginalMember(owner = "client!ph", name = "R", descriptor = "I")
    public int field1206;

    @OriginalMember(owner = "client!ph", name = "V", descriptor = "I")
    public static int field1210;

    @OriginalMember(owner = "client!ph", name = "W", descriptor = "I")
    public int field1211;

    @OriginalMember(owner = "client!ph", name = "Y", descriptor = "Lsf;")
    public class108 field1213;

    @OriginalMember(owner = "client!ph", name = "S", descriptor = "[I")
    public int[] field1207;

    @OriginalMember(owner = "client!ph", name = "T", descriptor = "[I")
    public int[] field1208;

    @OriginalMember(owner = "client!ph", name = "L", descriptor = "[Lsf;")
    public class108[] field1200;

    @OriginalMember(owner = "client!ph", name = "U", descriptor = "[Lof;")
    public class242[] field1209;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "(B)V", line = 7)
    public static void method515(byte arg0) {
        field1199 = null;
        field1197 = null;
        field1203 = null;
        field1212 = null;
        int var1 = -30 % ((68 - arg0) / 37);
    }

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "(I)V", line = 21)
    public static final void method516(int arg0) {
        field1201++;
        int var1 = class294.method2096(-87);
        if (arg0 == var1) {
            class327.field5582 = (byte[][][]) null;
            class116.method828(true, 0);
        } else if (var1 == 1) {
            class289.method2063((byte) -126, (byte) 0);
            class116.method828(true, 512);
            class182.method1318((byte) -41);
        } else {
            class289.method2063((byte) -126, (byte) (class278.field4886 - 4 & 0xFF));
            class116.method828(true, 2);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[B)[B", line = 56)
    public static final byte[] method517(int arg0, byte[] arg1) {
        field1205++;
        class249 var2 = new class249(arg1);
        int var3 = var2.method1731(true);
        if (arg0 != 13456) {
            method517(-92, (byte[]) null);
        }
        int var4 = var2.method1738(arg0 ^ 0x974FBC20);
        if (var4 < 0 || class7.field87 != 0 && class7.field87 < var4) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method1711(0, var5, var4, 50);
            return var5;
        } else {
            int var6 = var2.method1738(-1756395344);
            if (var6 < 0 || !(class7.field87 == 0 || var6 <= class7.field87)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class71.method473(var7, var6, arg1, var4, 9);
            } else {
                class5.field63.method1840(var2, 116, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ZI)Lsf;", line = 107)
    public static final class108 method518(boolean arg0, int arg1) {
        if (arg0) {
            method517(-90, (byte[]) null);
        }
        field1210++;
        return class99.method689(10, -108, arg1, false);
    }
}
