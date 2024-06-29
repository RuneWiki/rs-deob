import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class377 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "Lbd;")
    public static class44 field5419 = new class44("scroll:", "scrollen:", "déroulement:", "rolagem:");

    @OriginalMember(owner = "client!de", name = "c", descriptor = "Lbd;")
    public static class44 field5421 = new class44("Loaded title screen", "Titelbild geladen.", "Écran-titre chargé", "Tela título carregada");

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field5420;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "([BI)[B", line = 3)
    public static final byte[] method2299(byte[] arg0, int arg1) {
        field5422++;
        class519 var2 = new class519(arg0);
        int var3 = var2.method3072((byte) -125);
        if (arg1 != 1) {
            return null;
        }
        int var4 = var2.method3053(-129);
        if (var4 < 0 || !(class111.field1643 == 0 || var4 <= class111.field1643)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var5 = new byte[var4];
            var2.method3024(var4, var5, 0, (byte) -124);
            return var5;
        } else {
            int var6 = var2.method3053(-129);
            if (var6 < 0 || !(class111.field1643 == 0 || class111.field1643 >= var6)) {
                throw new RuntimeException();
            }
            byte[] var7 = new byte[var6];
            if (var3 == 1) {
                class348.method2192(var7, var6, arg0, var4, 9);
            } else {
                class421.field5975.method941(-8, var2, var7);
            }
            return var7;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 61)
    public static final void method2300(int arg0) {
        class70.field1150 = arg0;
        for (int var1 = 0; var1 < class394.field5608; var1++) {
            for (int var2 = 0; var2 < class337.field5000; var2++) {
                if (class461.field6675[arg0][var1][var2] == null) {
                    class461.field6675[arg0][var1][var2] = new class188(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(B)V", line = 84)
    public static final void method2301(byte arg0) {
        for (int var1 = 0; var1 < class215.field3238; var1++) {
            class306 var3 = class79.field1281[var1];
            if (var3.field4538 == 2) {
                if (var3.field4536 == null) {
                    var3.field4537 = Integer.MIN_VALUE;
                } else {
                    class504.field7295.method1587(var3.field4536);
                }
            }
        }
        int var2 = -34 / ((-arg0 - 24) / 52);
        field5420++;
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V", line = 118)
    public static void method2302(int arg0) {
        field5419 = null;
        field5421 = null;
        if (arg0 >= -74) {
            method2299(null, 4);
        }
    }
}
