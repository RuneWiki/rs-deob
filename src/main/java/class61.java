import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ie")
public class class61 {

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "Lrd;")
    public static class114 field1293 = class84.method656("Name des Gegenstands eingeben:", (byte) 127);

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "Lmd;")
    public static class84 field1292 = new class84();

    @OriginalMember(owner = "client!ie", name = "n", descriptor = "Lrd;")
    public static class114 field1305 = class84.method656("Wen m-Ochten Sie hinzuf-Ugen?", (byte) 119);

    @OriginalMember(owner = "client!ie", name = "o", descriptor = "I")
    public static volatile int field1306 = 0;

    @OriginalMember(owner = "client!ie", name = "k", descriptor = "Z")
    public static boolean field1302 = false;

    @OriginalMember(owner = "client!ie", name = "l", descriptor = "Luc;")
    public static class131 field1303 = new class131(5000);

    @OriginalMember(owner = "client!ie", name = "c", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!ie", name = "d", descriptor = "I")
    public int field1295;

    @OriginalMember(owner = "client!ie", name = "e", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!ie", name = "f", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!ie", name = "g", descriptor = "I")
    public int field1298;

    @OriginalMember(owner = "client!ie", name = "h", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!ie", name = "i", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!ie", name = "j", descriptor = "I")
    public int field1301;

    @OriginalMember(owner = "client!ie", name = "p", descriptor = "Loa;")
    public static class93 field1307;

    @OriginalMember(owner = "client!ie", name = "m", descriptor = "[I")
    public static int[] field1304;

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(ILid;)Lrd;")
    public static final class114 method497(int arg0, class60 arg1) {
        if (arg0 != 0) {
            method500((byte) 47);
        }
        field1294++;
        return class12.method88(32767, (byte) 113, arg1);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(I)V")
    public static final void method498(int arg0) {
        field1297++;
        class116.field2715.method200(-96);
        if (arg0 != 0) {
            method497(-71, null);
        }
    }

    @OriginalMember(owner = "client!ie", name = "b", descriptor = "(I)V")
    public static void method499(int arg0) {
        field1305 = null;
        field1292 = null;
        field1293 = null;
        field1307 = null;
        field1303 = null;
        field1304 = null;
        if (arg0 != 32767) {
            method500((byte) 63);
        }
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "(B)V")
    public static final void method500(byte arg0) {
        if (arg0 != -34) {
            method498(-95);
        }
        field1299++;
        class121.field2834.method528(arg0 ^ 0x7A4);
        class79.field1792 = class134.method1103(class79.field1792);
    }

    @OriginalMember(owner = "client!ie", name = "a", descriptor = "([Lrd;BII)Lrd;")
    public static final class114 method501(class114[] arg0, byte arg1, int arg2, int arg3) {
        field1300++;
        int var4 = 0;
        int var5 = 0;
        if (arg1 >= -13) {
            field1293 = null;
        }
        while (arg2 > var5) {
            if (arg0[arg3 + var5] == null) {
                arg0[arg3 + var5] = class50.field1041;
            }
            var4 += arg0[arg3 + var5].field2660;
            var5++;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg2; var8++) {
            class114 var10 = arg0[arg3 + var8];
            class35.method251(var10.field2676, 0, var6, var7, var10.field2660);
            var7 += var10.field2660;
        }
        class114 var9 = new class114();
        var9.field2660 = var4;
        var9.field2676 = var6;
        return var9;
    }
}
